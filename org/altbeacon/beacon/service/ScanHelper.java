package org.altbeacon.beacon.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.service.scanner.CycledLeScanCallback;
import org.altbeacon.beacon.service.scanner.CycledLeScanner;
import org.altbeacon.beacon.service.scanner.DistinctPacketDetector;
import org.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback;
import org.altbeacon.beacon.service.scanner.ScanFilterUtils;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import org.altbeacon.bluetooth.BluetoothCrashResolver;

class ScanHelper {
    /* access modifiers changed from: private */
    public static final String TAG = "ScanHelper";
    private BeaconManager mBeaconManager;
    /* access modifiers changed from: private */
    public Set<BeaconParser> mBeaconParsers = new HashSet();
    /* access modifiers changed from: private */
    public Context mContext;
    private final CycledLeScanCallback mCycledLeScanCallback = new CycledLeScanCallback() {
        @SuppressLint({"WrongThread"})
        public void onCycleEnd() {
            if (BeaconManager.getBeaconSimulator() != null) {
                LogManager.d(ScanHelper.TAG, "Beacon simulator enabled", new Object[0]);
                if (BeaconManager.getBeaconSimulator().getBeacons() != null) {
                    ApplicationInfo applicationInfo = ScanHelper.this.mContext.getApplicationInfo();
                    int i = applicationInfo.flags & 2;
                    applicationInfo.flags = i;
                    if (i != 0) {
                        String h5 = ScanHelper.TAG;
                        LogManager.d(h5, "Beacon simulator returns " + BeaconManager.getBeaconSimulator().getBeacons().size() + " beacons.", new Object[0]);
                        for (Beacon f8 : BeaconManager.getBeaconSimulator().getBeacons()) {
                            ScanHelper.this.processBeaconFromScan(f8);
                        }
                    } else {
                        LogManager.w(ScanHelper.TAG, "Beacon simulations provided, but ignored because we are not running in debug mode.  Please remove beacon simulations for production.", new Object[0]);
                    }
                } else {
                    LogManager.w(ScanHelper.TAG, "getBeacons is returning null. No simulated beacons to report.", new Object[0]);
                }
            } else if (LogManager.isVerboseLoggingEnabled()) {
                LogManager.d(ScanHelper.TAG, "Beacon simulator not enabled", new Object[0]);
            }
            ScanHelper.this.mDistinctPacketDetector.clearDetections();
            ScanHelper.this.mMonitoringStatus.updateNewlyOutside();
            ScanHelper.this.processRangeData();
        }

        @TargetApi(11)
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j7) {
            ScanHelper.this.processScanResult(bluetoothDevice, i, bArr, j7);
        }
    };
    /* access modifiers changed from: private */
    public CycledLeScanner mCycledScanner;
    /* access modifiers changed from: private */
    public DistinctPacketDetector mDistinctPacketDetector = new DistinctPacketDetector();
    private ExecutorService mExecutor;
    private ExtraDataBeaconTracker mExtraDataBeaconTracker = new ExtraDataBeaconTracker();
    /* access modifiers changed from: private */
    public MonitoringStatus mMonitoringStatus;
    private final Map<Region, RangeState> mRangedRegionState = new HashMap();
    private List<Beacon> mSimulatedScanData = null;

    public class ScanData {
        BluetoothDevice device;
        final int rssi;
        byte[] scanRecord;
        long timestampMs;

        public ScanData(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j7) {
            this.device = bluetoothDevice;
            this.rssi = i;
            this.scanRecord = bArr;
            this.timestampMs = j7;
        }
    }

    public class ScanProcessorRunnable implements Runnable {
        DetectionTracker detectionTracker = DetectionTracker.getInstance();
        NonBeaconLeScanCallback nonBeaconLeScanCallback;
        ScanData scanData;

        public ScanProcessorRunnable(NonBeaconLeScanCallback nonBeaconLeScanCallback2, ScanData scanData2) {
            this.nonBeaconLeScanCallback = nonBeaconLeScanCallback2;
            this.scanData = scanData2;
        }

        public void run() {
            if (LogManager.isVerboseLoggingEnabled()) {
                LogManager.d(ScanHelper.TAG, "Processing packet", new Object[0]);
            }
            if (ScanHelper.this.mBeaconParsers.size() > 0) {
                String h5 = ScanHelper.TAG;
                LogManager.d(h5, "Decoding beacon. First parser layout: " + ((BeaconParser) ScanHelper.this.mBeaconParsers.iterator().next()).getLayout(), new Object[0]);
            } else {
                LogManager.w(ScanHelper.TAG, "API No beacon parsers registered when decoding beacon", new Object[0]);
            }
            Beacon beacon = null;
            for (BeaconParser fromScanData : ScanHelper.this.mBeaconParsers) {
                ScanData scanData2 = this.scanData;
                beacon = fromScanData.fromScanData(scanData2.scanRecord, scanData2.rssi, scanData2.device, scanData2.timestampMs);
                if (beacon != null) {
                    break;
                }
            }
            if (beacon != null) {
                if (LogManager.isVerboseLoggingEnabled()) {
                    String h8 = ScanHelper.TAG;
                    LogManager.d(h8, "Beacon packet detected for: " + beacon + " with rssi " + beacon.getRssi(), new Object[0]);
                }
                this.detectionTracker.recordDetection();
                if (ScanHelper.this.mCycledScanner != null && !ScanHelper.this.mCycledScanner.getDistinctPacketsDetectedPerScan() && !ScanHelper.this.mDistinctPacketDetector.isPacketDistinct(this.scanData.device.getAddress(), this.scanData.scanRecord)) {
                    LogManager.i(ScanHelper.TAG, "Non-distinct packets detected in a single scan.  Restarting scans unecessary.", new Object[0]);
                    ScanHelper.this.mCycledScanner.setDistinctPacketsDetectedPerScan(true);
                }
                ScanHelper.this.processBeaconFromScan(beacon);
                return;
            }
            NonBeaconLeScanCallback nonBeaconLeScanCallback2 = this.nonBeaconLeScanCallback;
            if (nonBeaconLeScanCallback2 != null) {
                ScanData scanData3 = this.scanData;
                nonBeaconLeScanCallback2.onNonBeaconLeScan(scanData3.device, scanData3.rssi, scanData3.scanRecord);
            }
        }
    }

    public ScanHelper(Context context) {
        LogManager.d(TAG, "new ScanHelper", new Object[0]);
        this.mContext = context;
        this.mBeaconManager = BeaconManager.getInstanceForApplication(context);
    }

    private ExecutorService getExecutor() {
        ExecutorService executorService = this.mExecutor;
        if (executorService != null && executorService.isShutdown()) {
            LogManager.w(TAG, "ThreadPoolExecutor unexpectedly shut down", new Object[0]);
        }
        if (this.mExecutor == null) {
            LogManager.d(TAG, "ThreadPoolExecutor created", new Object[0]);
            this.mExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        }
        return this.mExecutor;
    }

    private List<Region> matchingRegions(Beacon beacon, Collection<Region> collection) {
        ArrayList arrayList = new ArrayList();
        for (Region next : collection) {
            if (next != null) {
                if (next.matchesBeacon(beacon)) {
                    arrayList.add(next);
                } else {
                    LogManager.d(TAG, "This region (%s) does not match beacon: %s", next, beacon);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void processBeaconFromScan(Beacon beacon) {
        if (Stats.getInstance().isEnabled()) {
            Stats.getInstance().log(beacon);
        }
        if (LogManager.isVerboseLoggingEnabled()) {
            LogManager.d(TAG, "beacon detected : %s", beacon.toString());
        }
        Beacon track = this.mExtraDataBeaconTracker.track(beacon);
        if (track != null) {
            this.mMonitoringStatus.updateNewlyInsideInRegionsContaining(track);
            LogManager.d(TAG, "looking for ranging region matches for this beacon", new Object[0]);
            synchronized (this.mRangedRegionState) {
                try {
                    for (Region next : matchingRegions(track, this.mRangedRegionState.keySet())) {
                        LogManager.d(TAG, "matches ranging region: %s", next);
                        RangeState rangeState = this.mRangedRegionState.get(next);
                        if (rangeState != null) {
                            rangeState.addBeacon(track);
                        }
                    }
                } finally {
                }
            }
        } else if (LogManager.isVerboseLoggingEnabled()) {
            LogManager.d(TAG, "not processing detections for GATT extra data beacon", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public void processRangeData() {
        synchronized (this.mRangedRegionState) {
            try {
                for (Region next : this.mRangedRegionState.keySet()) {
                    RangeState rangeState = this.mRangedRegionState.get(next);
                    LogManager.d(TAG, "Calling ranging callback", new Object[0]);
                    rangeState.getCallback().call(this.mContext, "rangingData", new RangingData(rangeState.finalizeBeacons(), next).toBundle());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean anyBeaconsDetectedThisCycle() {
        synchronized (this.mRangedRegionState) {
            try {
                for (RangeState count : this.mRangedRegionState.values()) {
                    if (count.count() > 0) {
                        return true;
                    }
                }
                return this.mMonitoringStatus.insideAnyRegion();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void createCycledLeScanner(boolean z, BluetoothCrashResolver bluetoothCrashResolver) {
        this.mCycledScanner = CycledLeScanner.createScanner(this.mContext, BeaconManager.DEFAULT_FOREGROUND_SCAN_PERIOD, 0, z, this.mCycledLeScanCallback, bluetoothCrashResolver);
    }

    public void finalize() {
        super.finalize();
        terminateThreads();
    }

    public CycledLeScanCallback getCycledLeScanCallback() {
        return this.mCycledLeScanCallback;
    }

    public CycledLeScanner getCycledScanner() {
        return this.mCycledScanner;
    }

    public MonitoringStatus getMonitoringStatus() {
        return this.mMonitoringStatus;
    }

    public Map<Region, RangeState> getRangedRegionState() {
        return this.mRangedRegionState;
    }

    @SuppressLint({"WrongConstant"})
    public PendingIntent getScanCallbackIntent() {
        Intent intent = new Intent(this.mContext, StartupBroadcastReceiver.class);
        intent.putExtra("o-scan", true);
        return PendingIntent.getBroadcast(this.mContext, 0, intent, 167772160);
    }

    @TargetApi(11)
    public void processScanResult(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j7) {
        try {
            getExecutor().execute(new ScanProcessorRunnable(this.mBeaconManager.getNonBeaconLeScanCallback(), new ScanData(bluetoothDevice, i, bArr, j7)));
        } catch (RejectedExecutionException unused) {
            LogManager.w(TAG, "Ignoring scan result because we cannot keep up.", new Object[0]);
        } catch (OutOfMemoryError unused2) {
            LogManager.w(TAG, "Ignoring scan result because we cannot start a thread to keep up.", new Object[0]);
        }
    }

    public void reloadParsers() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.mBeaconManager.getBeaconParsers());
        boolean z = true;
        for (BeaconParser next : this.mBeaconManager.getBeaconParsers()) {
            if (next.getExtraDataParsers().size() > 0) {
                hashSet.addAll(next.getExtraDataParsers());
                z = false;
            }
        }
        this.mBeaconParsers = hashSet;
        this.mExtraDataBeaconTracker = new ExtraDataBeaconTracker(z);
    }

    public void setBeaconParsers(Set<BeaconParser> set) {
        String str = TAG;
        Log.d(str, "BeaconParsers set to  count: " + set.size());
        if (set.size() > 0) {
            Log.d(str, "First parser layout: " + set.iterator().next().getLayout());
        }
        this.mBeaconParsers = set;
    }

    public void setExtraDataBeaconTracker(ExtraDataBeaconTracker extraDataBeaconTracker) {
        this.mExtraDataBeaconTracker = extraDataBeaconTracker;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.mMonitoringStatus = monitoringStatus;
    }

    public void setRangedRegionState(Map<Region, RangeState> map) {
        LogManager.d(TAG, "rangeRegionState updated with %d regions", Integer.valueOf(map.size()));
        synchronized (this.mRangedRegionState) {
            this.mRangedRegionState.clear();
            this.mRangedRegionState.putAll(map);
        }
    }

    public void setSimulatedScanData(List<Beacon> list) {
        this.mSimulatedScanData = list;
    }

    public void startAndroidOBackgroundScan(Set<BeaconParser> set) {
        startAndroidOBackgroundScan(set, (List<Region>) null);
    }

    public void stopAndroidOBackgroundScan() {
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.mContext.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                LogManager.w(TAG, "Failed to construct a BluetoothAdapter", new Object[0]);
            } else if (adapter.isEnabled() || Build.VERSION.SDK_INT >= 28) {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(getScanCallbackIntent());
                }
            } else {
                LogManager.w(TAG, "BluetoothAdapter is not enabled", new Object[0]);
            }
        } catch (SecurityException unused) {
            LogManager.e(TAG, "SecurityException stopping Android O background scanner", new Object[0]);
        } catch (NullPointerException e) {
            LogManager.e(TAG, "NullPointerException stopping Android O background scanner", e);
        } catch (RuntimeException e8) {
            LogManager.e(TAG, "Unexpected runtime exception stopping Android O background scanner", e8);
        }
    }

    public void terminateThreads() {
        ExecutorService executorService = this.mExecutor;
        if (executorService != null) {
            executorService.shutdown();
            try {
                if (!this.mExecutor.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                    LogManager.e(TAG, "Can't stop beacon parsing thread.", new Object[0]);
                }
            } catch (InterruptedException unused) {
                LogManager.e(TAG, "Interrupted waiting to stop beacon parsing thread.", new Object[0]);
            }
            this.mExecutor = null;
        }
    }

    public void startAndroidOBackgroundScan(Set<BeaconParser> set, List<Region> list) {
        ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
        List<ScanFilter> createScanFiltersForBeaconParsers = new ScanFilterUtils().createScanFiltersForBeaconParsers(new ArrayList(set), list);
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.mContext.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter == null) {
                LogManager.w(TAG, "Failed to construct a BluetoothAdapter", new Object[0]);
            } else if (adapter.isEnabled() || Build.VERSION.SDK_INT >= 28) {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    int b8 = bluetoothLeScanner.startScan(createScanFiltersForBeaconParsers, build, getScanCallbackIntent());
                    if (b8 != 0) {
                        String str = TAG;
                        LogManager.e(str, "Failed to start background scan on Android O.  Code: " + b8, new Object[0]);
                        return;
                    }
                    LogManager.d(TAG, "Started passive beacon scan", new Object[0]);
                    return;
                }
                LogManager.e(TAG, "Failed to start background scan on Android O: scanner is null", new Object[0]);
            } else {
                LogManager.w(TAG, "Failed to start background scan on Android O: BluetoothAdapter is not enabled", new Object[0]);
            }
        } catch (SecurityException unused) {
            LogManager.e(TAG, "SecurityException making Android O background scanner", new Object[0]);
        } catch (NullPointerException e) {
            LogManager.e(TAG, "NullPointerException starting Android O background scanner", e);
        } catch (RuntimeException e8) {
            LogManager.e(TAG, "Unexpected runtime exception starting Android O background scanner", e8);
        }
    }
}
