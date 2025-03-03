package org.altbeacon.beacon.service;

import N.e;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BuildConfig;
import org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.utils.ProcessUtils;
import org.altbeacon.bluetooth.BluetoothCrashResolver;

@TargetApi(21)
public class ScanJob extends JobService {
    /* access modifiers changed from: private */
    public static final String TAG = "ScanJob";
    private static int sOverrideImmediateScanJobId = -1;
    private static int sOverridePeriodicScanJobId = -1;
    /* access modifiers changed from: private */
    public boolean mInitialized = false;
    /* access modifiers changed from: private */
    public ScanHelper mScanHelper;
    /* access modifiers changed from: private */
    public ScanState mScanState = null;
    /* access modifiers changed from: private */
    public boolean mStopCalled = false;
    /* access modifiers changed from: private */
    public Handler mStopHandler = new Handler();

    public static int getImmediateScanJobId(Context context) {
        if (sOverrideImmediateScanJobId < 0) {
            return getJobIdFromManifest(context, "immediateScanJobId");
        }
        String str = TAG;
        LogManager.i(str, "Using ImmediateScanJobId from static override: " + sOverrideImmediateScanJobId, new Object[0]);
        return sOverrideImmediateScanJobId;
    }

    private static int getJobIdFromManifest(Context context, String str) {
        ServiceInfo serviceInfo;
        Bundle bundle;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, ScanJob.class), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        if (serviceInfo == null || (bundle = serviceInfo.metaData) == null || bundle.get(str) == null) {
            throw new RuntimeException(e.y("Cannot get job id from manifest.  Make sure that the ", str, " is configured in the manifest for the ScanJob."));
        }
        int i = serviceInfo.metaData.getInt(str);
        String str2 = TAG;
        LogManager.i(str2, "Using " + str + " from manifest: " + i, new Object[0]);
        return i;
    }

    public static int getPeriodicScanJobId(Context context) {
        if (sOverrideImmediateScanJobId < 0) {
            return getJobIdFromManifest(context, "periodicScanJobId");
        }
        String str = TAG;
        LogManager.i(str, "Using PeriodicScanJobId from static override: " + sOverridePeriodicScanJobId, new Object[0]);
        return sOverridePeriodicScanJobId;
    }

    /* access modifiers changed from: private */
    public boolean initialzeScanHelper() {
        ScanState restore = ScanState.restore(this);
        this.mScanState = restore;
        if (restore == null) {
            return false;
        }
        ScanHelper scanHelper = new ScanHelper(this);
        this.mScanState.setLastScanStartTimeMillis(System.currentTimeMillis());
        scanHelper.setMonitoringStatus(this.mScanState.getMonitoringStatus());
        scanHelper.setRangedRegionState(this.mScanState.getRangedRegionState());
        scanHelper.setBeaconParsers(this.mScanState.getBeaconParsers());
        scanHelper.setExtraDataBeaconTracker(this.mScanState.getExtraBeaconDataTracker());
        if (scanHelper.getCycledScanner() == null) {
            try {
                scanHelper.createCycledLeScanner(this.mScanState.getBackgroundMode().booleanValue(), (BluetoothCrashResolver) null);
            } catch (OutOfMemoryError unused) {
                LogManager.w(TAG, "Failed to create CycledLeScanner thread.", new Object[0]);
                return false;
            }
        }
        this.mScanHelper = scanHelper;
        return true;
    }

    /* access modifiers changed from: private */
    public boolean restartScanning() {
        ScanHelper scanHelper;
        Long l8;
        Long l9;
        if (this.mScanState == null || (scanHelper = this.mScanHelper) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            scanHelper.stopAndroidOBackgroundScan();
        }
        if (this.mScanState.getBackgroundMode().booleanValue()) {
            l8 = this.mScanState.getBackgroundScanPeriod();
        } else {
            l8 = this.mScanState.getForegroundScanPeriod();
        }
        long longValue = l8.longValue();
        if (this.mScanState.getBackgroundMode().booleanValue()) {
            l9 = this.mScanState.getBackgroundBetweenScanPeriod();
        } else {
            l9 = this.mScanState.getForegroundBetweenScanPeriod();
        }
        long longValue2 = l9.longValue();
        if (this.mScanHelper.getCycledScanner() != null) {
            this.mScanHelper.getCycledScanner().setScanPeriods(longValue, longValue2, this.mScanState.getBackgroundMode().booleanValue());
        }
        this.mInitialized = true;
        if (longValue <= 0) {
            LogManager.w(TAG, "Starting scan with scan period of zero.  Exiting ScanJob.", new Object[0]);
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().stop();
            }
            return false;
        } else if (this.mScanHelper.getRangedRegionState().size() > 0 || this.mScanHelper.getMonitoringStatus().regions().size() > 0) {
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().start();
            }
            return true;
        } else {
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().stop();
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void scheduleNextScan() {
        ScanState scanState = this.mScanState;
        if (scanState == null) {
            return;
        }
        if (!scanState.getBackgroundMode().booleanValue()) {
            LogManager.d(TAG, "In foreground mode, schedule next scan", new Object[0]);
            ScanJobScheduler.getInstance().forceScheduleNextScan(this);
            return;
        }
        startPassiveScanIfNeeded();
    }

    public static void setOverrideImmediateScanJobId(int i) {
        sOverrideImmediateScanJobId = i;
    }

    public static void setOverridePeriodicScanJobId(int i) {
        sOverridePeriodicScanJobId = i;
    }

    private void startPassiveScanIfNeeded() {
        if (this.mScanState != null) {
            String str = TAG;
            LogManager.d(str, "Checking to see if we need to start a passive scan", new Object[0]);
            if (this.mScanState.getMonitoringStatus().insideAnyRegion()) {
                LogManager.i(str, "We are inside a beacon region.  We will not scan between cycles.", new Object[0]);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ScanHelper scanHelper = this.mScanHelper;
                if (scanHelper != null) {
                    scanHelper.startAndroidOBackgroundScan(this.mScanState.getBeaconParsers());
                }
            } else {
                LogManager.d(str, "This is not Android O.  No scanning between cycles when using ScanJob", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean startScanning() {
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(getApplicationContext());
        instanceForApplication.setScannerInSameProcess(true);
        if (instanceForApplication.isMainProcess()) {
            LogManager.i(TAG, "scanJob version %s is starting up on the main process", BuildConfig.VERSION_NAME);
        } else {
            String str = TAG;
            LogManager.i(str, "beaconScanJob library version %s is starting up on a separate process", BuildConfig.VERSION_NAME);
            ProcessUtils processUtils = new ProcessUtils(this);
            LogManager.i(str, "beaconScanJob PID is " + processUtils.getPid() + " with process name " + processUtils.getProcessName(), new Object[0]);
        }
        if (Beacon.getDistanceCalculator() == null) {
            Beacon.setDistanceCalculator(new ModelSpecificDistanceCalculator(this, BeaconManager.getDistanceModelUpdateUrl()));
        }
        return restartScanning();
    }

    /* access modifiers changed from: private */
    public void stopScanning() {
        this.mInitialized = false;
        ScanHelper scanHelper = this.mScanHelper;
        if (scanHelper != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                scanHelper.stopAndroidOBackgroundScan();
            }
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().stop();
                this.mScanHelper.getCycledScanner().destroy();
            }
        }
        LogManager.d(TAG, "Scanning stopped", new Object[0]);
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        String str = TAG;
        LogManager.i(str, "ScanJob Lifecycle START: " + this, new Object[0]);
        this.mStopCalled = false;
        new Thread(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x0206, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r13 = this;
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    org.altbeacon.beacon.BeaconManager r0 = org.altbeacon.beacon.BeaconManager.getInstanceForApplication(r0)
                    org.altbeacon.beacon.service.IntentScanStrategyCoordinator r0 = r0.getIntentScanStrategyCoordinator()
                    r1 = 0
                    if (r0 == 0) goto L_0x0054
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                    monitor-enter(r2)
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x002c }
                    boolean r3 = r3.mStopCalled     // Catch:{ all -> 0x002c }
                    if (r3 == 0) goto L_0x002e
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x002c }
                    java.lang.String r3 = "Quitting scan job before we even start.  Somebody told us to stop."
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x002c }
                    org.altbeacon.beacon.logging.LogManager.d(r0, r3, r4)     // Catch:{ all -> 0x002c }
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x002c }
                    android.app.job.JobParameters r3 = r5     // Catch:{ all -> 0x002c }
                    r0.jobFinished(r3, r1)     // Catch:{ all -> 0x002c }
                    monitor-exit(r2)     // Catch:{ all -> 0x002c }
                    return
                L_0x002c:
                    r0 = move-exception
                    goto L_0x0052
                L_0x002e:
                    java.lang.String r3 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x002c }
                    java.lang.String r4 = "Scan job calling IntentScanStrategyCoordinator"
                    java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x002c }
                    org.altbeacon.beacon.logging.LogManager.d(r3, r4, r5)     // Catch:{ all -> 0x002c }
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x002c }
                    r0.performPeriodicProcessing(r3)     // Catch:{ all -> 0x002c }
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x002c }
                    java.lang.String r3 = "Scan job finished.  Calling jobFinished"
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x002c }
                    org.altbeacon.beacon.logging.LogManager.d(r0, r3, r4)     // Catch:{ all -> 0x002c }
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x002c }
                    android.app.job.JobParameters r3 = r5     // Catch:{ all -> 0x002c }
                    r0.jobFinished(r3, r1)     // Catch:{ all -> 0x002c }
                    monitor-exit(r2)     // Catch:{ all -> 0x002c }
                    return
                L_0x0052:
                    monitor-exit(r2)     // Catch:{ all -> 0x002c }
                    throw r0
                L_0x0054:
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    boolean r0 = r0.initialzeScanHelper()
                    if (r0 != 0) goto L_0x006e
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.String r2 = "Cannot allocate a scanner to look for beacons.  System resources are low."
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    org.altbeacon.beacon.logging.LogManager.e(r0, r2, r3)
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    android.app.job.JobParameters r2 = r5
                    r0.jobFinished(r2, r1)
                L_0x006e:
                    org.altbeacon.beacon.service.ScanJobScheduler r0 = org.altbeacon.beacon.service.ScanJobScheduler.getInstance()
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                    android.content.Context r2 = r2.getApplicationContext()
                    r0.ensureNotificationProcessorSetup(r2)
                    android.app.job.JobParameters r0 = r5
                    int r0 = r0.getJobId()
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                    int r2 = org.altbeacon.beacon.service.ScanJob.getImmediateScanJobId(r2)
                    if (r0 != r2) goto L_0x00a3
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "Running immediate scan job: instance is "
                    r2.<init>(r3)
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    org.altbeacon.beacon.logging.LogManager.i(r0, r2, r3)
                    goto L_0x00bc
                L_0x00a3:
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "Running periodic scan job: instance is "
                    r2.<init>(r3)
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    org.altbeacon.beacon.logging.LogManager.i(r0, r2, r3)
                L_0x00bc:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    org.altbeacon.beacon.service.ScanJobScheduler r2 = org.altbeacon.beacon.service.ScanJobScheduler.getInstance()
                    java.util.List r2 = r2.dumpBackgroundScanResultQueue()
                    r0.<init>(r2)
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.String r3 = "Processing %d queued scan results"
                    int r4 = r0.size()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r5 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    r5[r1] = r4
                    org.altbeacon.beacon.logging.LogManager.d(r2, r3, r5)
                    java.util.Iterator r0 = r0.iterator()
                L_0x00e3:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x0125
                    java.lang.Object r2 = r0.next()
                    android.bluetooth.le.ScanResult r2 = (android.bluetooth.le.ScanResult) r2
                    android.bluetooth.le.ScanRecord r3 = r2.getScanRecord()
                    if (r3 == 0) goto L_0x00e3
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this
                    org.altbeacon.beacon.service.ScanHelper r4 = r4.mScanHelper
                    if (r4 == 0) goto L_0x00e3
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this
                    org.altbeacon.beacon.service.ScanHelper r5 = r4.mScanHelper
                    android.bluetooth.BluetoothDevice r6 = r2.getDevice()
                    int r7 = r2.getRssi()
                    byte[] r8 = r3.getBytes()
                    long r3 = java.lang.System.currentTimeMillis()
                    long r9 = android.os.SystemClock.elapsedRealtime()
                    long r3 = r3 - r9
                    long r9 = r2.getTimestampNanos()
                    r11 = 1000000(0xf4240, double:4.940656E-318)
                    long r9 = r9 / r11
                    long r9 = r9 + r3
                    r5.processScanResult(r6, r7, r8, r9)
                    goto L_0x00e3
                L_0x0125:
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.String r2 = "Done processing queued scan results"
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    org.altbeacon.beacon.logging.LogManager.d(r0, r2, r3)
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    monitor-enter(r0)
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    boolean r2 = r2.mStopCalled     // Catch:{ all -> 0x014f }
                    if (r2 == 0) goto L_0x0152
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x014f }
                    java.lang.String r3 = "Quitting scan job before we even start.  Somebody told us to stop."
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.logging.LogManager.d(r2, r3, r4)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    android.app.job.JobParameters r3 = r5     // Catch:{ all -> 0x014f }
                    r2.jobFinished(r3, r1)     // Catch:{ all -> 0x014f }
                    monitor-exit(r0)     // Catch:{ all -> 0x014f }
                    return
                L_0x014f:
                    r1 = move-exception
                    goto L_0x0207
                L_0x0152:
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    boolean r2 = r2.mInitialized     // Catch:{ all -> 0x014f }
                    if (r2 == 0) goto L_0x016c
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x014f }
                    java.lang.String r3 = "Scanning already started.  Resetting for current parameters"
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.logging.LogManager.d(r2, r3, r4)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    boolean r2 = r2.restartScanning()     // Catch:{ all -> 0x014f }
                    goto L_0x0172
                L_0x016c:
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    boolean r2 = r2.startScanning()     // Catch:{ all -> 0x014f }
                L_0x0172:
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    android.os.Handler r3 = r3.mStopHandler     // Catch:{ all -> 0x014f }
                    r4 = 0
                    r3.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x014f }
                    if (r2 == 0) goto L_0x01c9
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanState r2 = r2.mScanState     // Catch:{ all -> 0x014f }
                    if (r2 == 0) goto L_0x0205
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x014f }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
                    r3.<init>()     // Catch:{ all -> 0x014f }
                    java.lang.String r4 = "Scan job running for "
                    r3.append(r4)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanState r4 = r4.mScanState     // Catch:{ all -> 0x014f }
                    int r4 = r4.getScanJobRuntimeMillis()     // Catch:{ all -> 0x014f }
                    r3.append(r4)     // Catch:{ all -> 0x014f }
                    java.lang.String r4 = " millis"
                    r3.append(r4)     // Catch:{ all -> 0x014f }
                    java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x014f }
                    java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.logging.LogManager.i(r2, r3, r1)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r1 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    android.os.Handler r1 = r1.mStopHandler     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob$1$1 r2 = new org.altbeacon.beacon.service.ScanJob$1$1     // Catch:{ all -> 0x014f }
                    r2.<init>()     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanState r3 = r3.mScanState     // Catch:{ all -> 0x014f }
                    int r3 = r3.getScanJobRuntimeMillis()     // Catch:{ all -> 0x014f }
                    long r3 = (long) r3     // Catch:{ all -> 0x014f }
                    r1.postDelayed(r2, r3)     // Catch:{ all -> 0x014f }
                    goto L_0x0205
                L_0x01c9:
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x014f }
                    java.lang.String r3 = "Scanning not started so Scan job is complete."
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.logging.LogManager.i(r2, r3, r4)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    r2.stopScanning()     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanState r2 = r2.mScanState     // Catch:{ all -> 0x014f }
                    r2.save()     // Catch:{ all -> 0x014f }
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x014f }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
                    r3.<init>()     // Catch:{ all -> 0x014f }
                    java.lang.String r4 = "ScanJob Lifecycle STOP (start fail): "
                    r3.append(r4)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    r3.append(r4)     // Catch:{ all -> 0x014f }
                    java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x014f }
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.logging.LogManager.d(r2, r3, r4)     // Catch:{ all -> 0x014f }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x014f }
                    android.app.job.JobParameters r3 = r5     // Catch:{ all -> 0x014f }
                    r2.jobFinished(r3, r1)     // Catch:{ all -> 0x014f }
                L_0x0205:
                    monitor-exit(r0)     // Catch:{ all -> 0x014f }
                    return
                L_0x0207:
                    monitor-exit(r0)     // Catch:{ all -> 0x014f }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanJob.AnonymousClass1.run():void");
            }
        }).start();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStopJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ScanJob Lifecycle STOP: "
            java.lang.String r1 = "onStopJob called for immediate scan "
            java.lang.String r2 = "onStopJob called for periodic scan "
            java.lang.String r3 = TAG
            java.lang.String r4 = "onStopJob called"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            org.altbeacon.beacon.logging.LogManager.d(r3, r4, r6)
            monitor-enter(r7)
            r4 = 1
            r7.mStopCalled = r4     // Catch:{ all -> 0x0030 }
            int r8 = r8.getJobId()     // Catch:{ all -> 0x0030 }
            int r4 = getPeriodicScanJobId(r7)     // Catch:{ all -> 0x0030 }
            if (r8 != r4) goto L_0x0032
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r8.<init>(r2)     // Catch:{ all -> 0x0030 }
            r8.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0030 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.logging.LogManager.i(r3, r8, r1)     // Catch:{ all -> 0x0030 }
            goto L_0x0043
        L_0x0030:
            r8 = move-exception
            goto L_0x007c
        L_0x0032:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r8.<init>(r1)     // Catch:{ all -> 0x0030 }
            r8.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0030 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.logging.LogManager.i(r3, r8, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r8.<init>(r0)     // Catch:{ all -> 0x0030 }
            r8.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.logging.LogManager.i(r3, r8, r0)     // Catch:{ all -> 0x0030 }
            android.os.Handler r8 = r7.mStopHandler     // Catch:{ all -> 0x0030 }
            r0 = 0
            r8.removeCallbacksAndMessages(r0)     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.BeaconManager r8 = org.altbeacon.beacon.BeaconManager.getInstanceForApplication(r7)     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator r8 = r8.getIntentScanStrategyCoordinator()     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x006d
            java.lang.String r8 = "ScanJob completed for intent scan strategy."
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.logging.LogManager.d(r3, r8, r0)     // Catch:{ all -> 0x0030 }
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            return r5
        L_0x006d:
            r7.stopScanning()     // Catch:{ all -> 0x0030 }
            r7.startPassiveScanIfNeeded()     // Catch:{ all -> 0x0030 }
            org.altbeacon.beacon.service.ScanHelper r8 = r7.mScanHelper     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x007a
            r8.terminateThreads()     // Catch:{ all -> 0x0030 }
        L_0x007a:
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            return r5
        L_0x007c:
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanJob.onStopJob(android.app.job.JobParameters):boolean");
    }
}
