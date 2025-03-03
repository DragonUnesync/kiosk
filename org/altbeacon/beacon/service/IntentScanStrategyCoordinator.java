package org.altbeacon.beacon.service;

import P6.e;
import P6.f;
import a1.C0412c;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator;
import org.altbeacon.beacon.logging.LogManager;

public final class IntentScanStrategyCoordinator {
    public static final Companion Companion = new Companion((e) null);
    /* access modifiers changed from: private */
    public static final String TAG = "IntentScanCoord";
    private final Context context;
    private boolean disableOnFailure;
    private final ExecutorService executor = Executors.newFixedThreadPool(1);
    private boolean initialized;
    private long lastCycleEnd;
    private int lastStrategyFailureDetectionCount;
    private boolean longScanForcingEnabled;
    /* access modifiers changed from: private */
    public ScanHelper scanHelper;
    private ScanState scanState;
    private boolean started;
    private int strategyFailureDetectionCount;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String getTAG() {
            return IntentScanStrategyCoordinator.TAG;
        }

        private Companion() {
        }
    }

    public IntentScanStrategyCoordinator(Context context2) {
        f.e(context2, "context");
        this.context = context2;
    }

    private final String getManifestMetadataValue(String str) {
        try {
            ServiceInfo serviceInfo = this.context.getPackageManager().getServiceInfo(new ComponentName(this.context, BeaconService.class), 128);
            f.d(serviceInfo, "context.getPackageManage…T_META_DATA\n            )");
            Bundle bundle = serviceInfo.metaData;
            if (bundle != null) {
                return String.valueOf(bundle.get(str));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|12|13|(2:40|15)(2:16|(3:18|(1:41)(4:20|(1:22)|23|42)|38)(3:39|24|25))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063 A[Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0056 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void runBackupScan$lambda$0(android.content.Context r11, org.altbeacon.beacon.service.IntentScanStrategyCoordinator r12) {
        /*
            r0 = 1
            java.lang.String r1 = "$context"
            P6.f.e(r11, r1)
            java.lang.String r1 = "this$0"
            P6.f.e(r12, r1)
            java.lang.String r1 = TAG
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "Starting backup scan"
            org.altbeacon.beacon.logging.LogManager.i(r1, r4, r3)
            java.lang.String r3 = "bluetooth"
            java.lang.Object r3 = r11.getSystemService(r3)
            java.lang.String r4 = "null cannot be cast to non-null type android.bluetooth.BluetoothManager"
            P6.f.c(r3, r4)
            android.bluetooth.BluetoothManager r3 = (android.bluetooth.BluetoothManager) r3
            android.bluetooth.BluetoothAdapter r3 = r3.getAdapter()
            long r4 = java.lang.System.currentTimeMillis()
            if (r3 == 0) goto L_0x00a8
            android.bluetooth.le.BluetoothLeScanner r3 = r3.getBluetoothLeScanner()
            if (r3 == 0) goto L_0x00a1
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator$runBackupScan$1$callback$1 r1 = new org.altbeacon.beacon.service.IntentScanStrategyCoordinator$runBackupScan$1$callback$1
            r1.<init>(r12, r3)
            r3.startScan(r1)     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
        L_0x003a:
            java.lang.String r6 = TAG     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            java.lang.String r7 = "Waiting for beacon detection..."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            org.altbeacon.beacon.logging.LogManager.d(r6, r7, r8)     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004b
        L_0x0049:
            r1 = move-exception
            goto L_0x008b
        L_0x004b:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            long r6 = r6 - r4
            r8 = 30000(0x7530, double:1.4822E-319)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0063
            java.lang.String r4 = TAG     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            java.lang.String r5 = "Timeout running backup scan to look for beacons"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            org.altbeacon.beacon.logging.LogManager.d(r4, r5, r6)     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            r3.stopScan(r1)     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            goto L_0x00a8
        L_0x0063:
            org.altbeacon.beacon.service.ScanHelper r6 = r12.scanHelper     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            if (r6 == 0) goto L_0x0084
            boolean r6 = r6.anyBeaconsDetectedThisCycle()     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            if (r6 == 0) goto L_0x003a
            int r6 = r12.strategyFailureDetectionCount     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            int r7 = r12.lastStrategyFailureDetectionCount     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            if (r6 != r7) goto L_0x007c
            java.lang.String r6 = TAG     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            java.lang.String r7 = "We have detected a beacon with the backup scan without a filter.  We never detected one with the intent scan with a filter.  This technique will not work."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            org.altbeacon.beacon.logging.LogManager.e(r6, r7, r8)     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
        L_0x007c:
            int r6 = r12.strategyFailureDetectionCount     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            r12.lastStrategyFailureDetectionCount = r6     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            int r6 = r6 + r0
            r12.strategyFailureDetectionCount = r6     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            goto L_0x003a
        L_0x0084:
            java.lang.String r1 = "scanHelper"
            P6.f.i(r1)     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
            r1 = 0
            throw r1     // Catch:{ IllegalStateException -> 0x0097, NullPointerException -> 0x0049 }
        L_0x008b:
            java.lang.String r3 = TAG
            java.lang.String r4 = "NullPointerException. Cannot run backup scan"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            org.altbeacon.beacon.logging.LogManager.e(r3, r4, r0)
            goto L_0x00a8
        L_0x0097:
            java.lang.String r0 = TAG
            java.lang.String r1 = "Bluetooth is off.  Cannot run backup scan"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r0, r1, r3)
            goto L_0x00a8
        L_0x00a1:
            java.lang.String r0 = "Cannot get scanner"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r1, r0, r3)
        L_0x00a8:
            java.lang.String r0 = TAG
            java.lang.String r1 = "backup scan complete"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r0, r1, r2)
            boolean r0 = r12.disableOnFailure
            if (r0 == 0) goto L_0x00c0
            int r0 = r12.strategyFailureDetectionCount
            if (r0 <= 0) goto L_0x00c0
            org.altbeacon.beacon.BeaconManager r11 = org.altbeacon.beacon.BeaconManager.getInstanceForApplication(r11)
            r11.handleStategyFailover()
        L_0x00c0:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r11 < r0) goto L_0x00ce
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12.processScanResults(r11)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.IntentScanStrategyCoordinator.runBackupScan$lambda$0(android.content.Context, org.altbeacon.beacon.service.IntentScanStrategyCoordinator):void");
    }

    public final void applySettings() {
        ScanState scanState2 = this.scanState;
        if (scanState2 != null) {
            scanState2.applyChanges(BeaconManager.getInstanceForApplication(this.context));
            reinitialize();
            if (Build.VERSION.SDK_INT >= 26) {
                restartBackgroundScan();
                return;
            }
            return;
        }
        f.i("scanState");
        throw null;
    }

    public final void ensureInitialized() {
        if (!this.initialized) {
            this.initialized = true;
            this.scanHelper = new ScanHelper(this.context);
            if (Beacon.getDistanceCalculator() == null) {
                Beacon.setDistanceCalculator(new ModelSpecificDistanceCalculator(this.context, BeaconManager.getDistanceModelUpdateUrl()));
            }
            reinitialize();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean getDisableOnFailure() {
        return this.disableOnFailure;
    }

    public final ExecutorService getExecutor() {
        return this.executor;
    }

    public final int getLastStrategyFailureDetectionCount() {
        return this.lastStrategyFailureDetectionCount;
    }

    public final int getStrategyFailureDetectionCount() {
        return this.strategyFailureDetectionCount;
    }

    public final void performPeriodicProcessing(Context context2) {
        f.e(context2, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            processScanResults(new ArrayList());
            runBackupScan(context2);
        }
    }

    public final void processScanResults(ArrayList<ScanResult> arrayList) {
        f.e(arrayList, "scanResults");
        ensureInitialized();
        Iterator<ScanResult> it = arrayList.iterator();
        while (true) {
            byte[] bArr = null;
            if (it.hasNext()) {
                ScanResult next = it.next();
                if (next != null) {
                    ScanHelper scanHelper2 = this.scanHelper;
                    if (scanHelper2 != null) {
                        BluetoothDevice device = next.getDevice();
                        int rssi = next.getRssi();
                        ScanRecord scanRecord = next.getScanRecord();
                        if (scanRecord != null) {
                            bArr = scanRecord.getBytes();
                        }
                        scanHelper2.processScanResult(device, rssi, bArr, next.getTimestampNanos() / ((long) 1000));
                    } else {
                        f.i("scanHelper");
                        throw null;
                    }
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(this.context);
                f.d(instanceForApplication, "getInstanceForApplication(context)");
                long foregroundScanPeriod = instanceForApplication.getForegroundScanPeriod();
                if (instanceForApplication.getBackgroundMode()) {
                    foregroundScanPeriod = instanceForApplication.getBackgroundScanPeriod();
                }
                if (currentTimeMillis - this.lastCycleEnd > foregroundScanPeriod) {
                    LogManager.d(TAG, "End of scan cycle", new Object[0]);
                    this.lastCycleEnd = currentTimeMillis;
                    ScanHelper scanHelper3 = this.scanHelper;
                    if (scanHelper3 != null) {
                        scanHelper3.getCycledLeScanCallback().onCycleEnd();
                        return;
                    } else {
                        f.i("scanHelper");
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void reinitialize() {
        if (!this.initialized) {
            ensureInitialized();
            return;
        }
        ScanState restore = ScanState.restore(this.context);
        if (restore == null) {
            restore = new ScanState(this.context);
        }
        this.scanState = restore;
        restore.setLastScanStartTimeMillis(System.currentTimeMillis());
        ScanHelper scanHelper2 = this.scanHelper;
        if (scanHelper2 != null) {
            ScanState scanState2 = this.scanState;
            if (scanState2 != null) {
                scanHelper2.setMonitoringStatus(scanState2.getMonitoringStatus());
                ScanHelper scanHelper3 = this.scanHelper;
                if (scanHelper3 != null) {
                    ScanState scanState3 = this.scanState;
                    if (scanState3 != null) {
                        scanHelper3.setRangedRegionState(scanState3.getRangedRegionState());
                        ScanHelper scanHelper4 = this.scanHelper;
                        if (scanHelper4 != null) {
                            ScanState scanState4 = this.scanState;
                            if (scanState4 != null) {
                                scanHelper4.setBeaconParsers(scanState4.getBeaconParsers());
                                ScanHelper scanHelper5 = this.scanHelper;
                                if (scanHelper5 != null) {
                                    ScanState scanState5 = this.scanState;
                                    if (scanState5 != null) {
                                        scanHelper5.setExtraDataBeaconTracker(scanState5.getExtraBeaconDataTracker());
                                    } else {
                                        f.i("scanState");
                                        throw null;
                                    }
                                } else {
                                    f.i("scanHelper");
                                    throw null;
                                }
                            } else {
                                f.i("scanState");
                                throw null;
                            }
                        } else {
                            f.i("scanHelper");
                            throw null;
                        }
                    } else {
                        f.i("scanState");
                        throw null;
                    }
                } else {
                    f.i("scanHelper");
                    throw null;
                }
            } else {
                f.i("scanState");
                throw null;
            }
        } else {
            f.i("scanHelper");
            throw null;
        }
    }

    public final void restartBackgroundScan() {
        ensureInitialized();
        LogManager.d(TAG, "restarting background scan", new Object[0]);
        ScanHelper scanHelper2 = this.scanHelper;
        if (scanHelper2 != null) {
            scanHelper2.stopAndroidOBackgroundScan();
            ScanHelper scanHelper3 = this.scanHelper;
            if (scanHelper3 != null) {
                ScanState scanState2 = this.scanState;
                if (scanState2 != null) {
                    scanHelper3.startAndroidOBackgroundScan(scanState2.getBeaconParsers());
                } else {
                    f.i("scanState");
                    throw null;
                }
            } else {
                f.i("scanHelper");
                throw null;
            }
        } else {
            f.i("scanHelper");
            throw null;
        }
    }

    public final void runBackupScan(Context context2) {
        f.e(context2, "context");
        if (!this.started) {
            LogManager.i(TAG, "Not doing backup scan because we are not started", new Object[0]);
            return;
        }
        ScanHelper scanHelper2 = this.scanHelper;
        if (scanHelper2 == null) {
            f.i("scanHelper");
            throw null;
        } else if (scanHelper2.anyBeaconsDetectedThisCycle()) {
            LogManager.d(TAG, "We have detected beacons with the intent scan.  No need to do a backup scan.", new Object[0]);
            this.strategyFailureDetectionCount = 0;
            this.lastStrategyFailureDetectionCount = 0;
        } else {
            LogManager.i(TAG, "Starting backup scan on background thread", new Object[0]);
            this.executor.execute(new C0412c((Object) context2, 15, (Object) this));
        }
    }

    public final void setDisableOnFailure(boolean z) {
        this.disableOnFailure = z;
    }

    public final void setLastStrategyFailureDetectionCount(int i) {
        this.lastStrategyFailureDetectionCount = i;
    }

    public final void setStrategyFailureDetectionCount(int i) {
        this.strategyFailureDetectionCount = i;
    }

    public final void start() {
        this.started = true;
        ensureInitialized();
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(this.context);
        f.d(instanceForApplication, "getInstanceForApplication(context)");
        ScanHelper scanHelper2 = this.scanHelper;
        if (scanHelper2 != null) {
            scanHelper2.setExtraDataBeaconTracker(new ExtraDataBeaconTracker());
            instanceForApplication.setScannerInSameProcess(true);
            String manifestMetadataValue = getManifestMetadataValue("longScanForcingEnabled");
            if (manifestMetadataValue != null && manifestMetadataValue.equals("true")) {
                LogManager.i(BeaconService.TAG, "longScanForcingEnabled to keep scans going on Android N for > 30 minutes", new Object[0]);
                this.longScanForcingEnabled = true;
            }
            ScanHelper scanHelper3 = this.scanHelper;
            if (scanHelper3 != null) {
                scanHelper3.reloadParsers();
                LogManager.d(TAG, "starting background scan", new Object[0]);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (Region next : instanceForApplication.getRangedRegions()) {
                    if (next.getIdentifiers().size() == 0) {
                        hashSet2.add(next);
                    } else {
                        hashSet.add(next);
                    }
                }
                for (Region next2 : instanceForApplication.getMonitoredRegions()) {
                    if (next2.getIdentifiers().size() == 0) {
                        hashSet2.add(next2);
                    } else {
                        hashSet.add(next2);
                    }
                }
                if (hashSet2.size() > 0) {
                    if (hashSet.size() > 0) {
                        LogManager.w(TAG, "Wildcard regions are being used for beacon ranging or monitoring.  The wildcard regions are ignored with intent scan strategy active.", new Object[0]);
                    } else {
                        hashSet = hashSet2;
                    }
                }
                ScanHelper scanHelper4 = this.scanHelper;
                if (scanHelper4 != null) {
                    ScanState scanState2 = this.scanState;
                    if (scanState2 != null) {
                        scanHelper4.startAndroidOBackgroundScan(scanState2.getBeaconParsers(), new ArrayList(hashSet));
                        this.lastCycleEnd = System.currentTimeMillis();
                        ScanJobScheduler.getInstance().scheduleForIntentScanStrategy(this.context);
                        return;
                    }
                    f.i("scanState");
                    throw null;
                }
                f.i("scanHelper");
                throw null;
            }
            f.i("scanHelper");
            throw null;
        }
        f.i("scanHelper");
        throw null;
    }

    public final void stop() {
        ensureInitialized();
        LogManager.d(TAG, "stopping background scan", new Object[0]);
        ScanHelper scanHelper2 = this.scanHelper;
        if (scanHelper2 != null) {
            scanHelper2.stopAndroidOBackgroundScan();
            ScanJobScheduler.getInstance().cancelSchedule(this.context);
            this.started = false;
            return;
        }
        f.i("scanHelper");
        throw null;
    }
}
