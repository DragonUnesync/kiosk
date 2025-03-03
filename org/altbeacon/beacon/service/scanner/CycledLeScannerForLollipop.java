package org.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.service.DetectionTracker;
import org.altbeacon.bluetooth.BluetoothCrashResolver;
import org.altbeacon.bluetooth.BluetoothMedic;
import u.C1477r;

@TargetApi(21)
public class CycledLeScannerForLollipop extends CycledLeScanner {
    private static final long BACKGROUND_L_SCAN_DETECTION_PERIOD_MILLIS = 10000;
    private static final String TAG = "CycledLeScannerForLollipop";
    private ScanCallback leScanCallback;
    private long mBackgroundLScanFirstDetectionTime = 0;
    /* access modifiers changed from: private */
    public long mBackgroundLScanStartTime = 0;
    private final BeaconManager mBeaconManager = BeaconManager.getInstanceForApplication(this.mContext);
    /* access modifiers changed from: private */
    public boolean mMainScanCycleActive = false;
    private final PowerManager mPowerManager;
    private BluetoothLeScanner mScanner;
    /* access modifiers changed from: private */
    public boolean mScanningStarted = false;
    private BroadcastReceiver mScreenOffReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (!CycledLeScannerForLollipop.this.mMainScanCycleActive) {
                LogManager.d(CycledLeScannerForLollipop.TAG, "Screen has gone off while outside the main scan cycle.  We will do nothing.", new Object[0]);
                return;
            }
            LogManager.d(CycledLeScannerForLollipop.TAG, "Screen has gone off while using a wildcard scan filter.  Restarting scanner with non-empty filters.", new Object[0]);
            CycledLeScannerForLollipop.this.stopScan();
            CycledLeScannerForLollipop.this.startScan();
        }
    };

    public CycledLeScannerForLollipop(Context context, long j7, long j8, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        super(context, j7, j8, z, cycledLeScanCallback, bluetoothCrashResolver);
        this.mPowerManager = (PowerManager) context.getSystemService("power");
    }

    private ScanCallback getNewLeScanCallback() {
        if (this.leScanCallback == null) {
            this.leScanCallback = new ScanCallback() {
                public void onBatchScanResults(List<ScanResult> list) {
                    LogManager.d(CycledLeScannerForLollipop.TAG, "got batch records", new Object[0]);
                    for (ScanResult next : list) {
                        CycledLeScannerForLollipop.this.mCycledLeScanCallback.onLeScan(next.getDevice(), next.getRssi(), next.getScanRecord().getBytes(), (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (next.getTimestampNanos() / 1000000));
                    }
                    if (CycledLeScannerForLollipop.this.mBackgroundLScanStartTime > 0) {
                        LogManager.d(CycledLeScannerForLollipop.TAG, "got a filtered batch scan result in the background.", new Object[0]);
                    }
                }

                public void onScanFailed(int i) {
                    BluetoothMedic.getInstance().processMedicAction("onScanFailed", i);
                    if (i == 1) {
                        LogManager.e(CycledLeScannerForLollipop.TAG, "Scan failed: a BLE scan with the same settings is already started by the app", new Object[0]);
                    } else if (i == 2) {
                        LogManager.e(CycledLeScannerForLollipop.TAG, "Scan failed: app cannot be registered", new Object[0]);
                    } else if (i == 3) {
                        LogManager.e(CycledLeScannerForLollipop.TAG, "Scan failed: internal error", new Object[0]);
                    } else if (i != 4) {
                        LogManager.e(CycledLeScannerForLollipop.TAG, C1477r.c(i, "Scan failed with unknown error (errorCode=", ")"), new Object[0]);
                    } else {
                        LogManager.e(CycledLeScannerForLollipop.TAG, "Scan failed: power optimized scan feature is not supported", new Object[0]);
                    }
                }

                public void onScanResult(int i, ScanResult scanResult) {
                    if (LogManager.isVerboseLoggingEnabled()) {
                        LogManager.d(CycledLeScannerForLollipop.TAG, "got record", new Object[0]);
                        List<ParcelUuid> serviceUuids = scanResult.getScanRecord().getServiceUuids();
                        if (serviceUuids != null) {
                            for (ParcelUuid parcelUuid : serviceUuids) {
                                LogManager.d(CycledLeScannerForLollipop.TAG, "with service uuid: " + parcelUuid, new Object[0]);
                            }
                        }
                    }
                    CycledLeScannerForLollipop.this.mCycledLeScanCallback.onLeScan(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.getTimestampNanos() / 1000000));
                    if (CycledLeScannerForLollipop.this.mBackgroundLScanStartTime > 0) {
                        LogManager.d(CycledLeScannerForLollipop.TAG, "got a filtered scan result in the background.", new Object[0]);
                    }
                }
            };
        }
        return this.leScanCallback;
    }

    private BluetoothLeScanner getScanner() {
        try {
            if (this.mScanner == null) {
                LogManager.d(TAG, "Making new Android L scanner", new Object[0]);
                if (getBluetoothAdapter() != null) {
                    this.mScanner = getBluetoothAdapter().getBluetoothLeScanner();
                }
                if (this.mScanner == null) {
                    LogManager.w(TAG, "Failed to make new Android L scanner", new Object[0]);
                }
            }
        } catch (SecurityException e) {
            LogManager.w(TAG, "SecurityException making new Android L scanner", e);
        }
        return this.mScanner;
    }

    private boolean isBluetoothOn() {
        try {
            BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
            if (bluetoothAdapter == null) {
                LogManager.w(TAG, "Cannot get bluetooth adapter", new Object[0]);
                return false;
            } else if (bluetoothAdapter.getState() == 12) {
                return true;
            } else {
                return false;
            }
        } catch (SecurityException e) {
            LogManager.w(TAG, "SecurityException checking if bluetooth is on", e);
        }
    }

    private void postStartLeScan(List<ScanFilter> list, ScanSettings scanSettings) {
        final BluetoothLeScanner scanner = getScanner();
        if (scanner != null) {
            final ScanCallback newLeScanCallback = getNewLeScanCallback();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            final List<ScanFilter> list2 = list;
            final ScanSettings scanSettings2 = scanSettings;
            this.mScanHandler.post(new Runnable() {
                public void run() {
                    try {
                        if (CycledLeScannerForLollipop.this.mScanningStarted) {
                            LogManager.d(CycledLeScannerForLollipop.TAG, "Scanning already started stopping to avoid start failure.", new Object[0]);
                            scanner.stopScan(newLeScanCallback);
                            CycledLeScannerForLollipop.this.mScanningStarted = false;
                        }
                        scanner.startScan(list2, scanSettings2, newLeScanCallback);
                        CycledLeScannerForLollipop.this.mScanningStarted = true;
                    } catch (IllegalStateException unused) {
                        LogManager.w(CycledLeScannerForLollipop.TAG, "Cannot start scan. Bluetooth may be turned off.", new Object[0]);
                    } catch (NullPointerException e) {
                        LogManager.e(e, CycledLeScannerForLollipop.TAG, "Cannot start scan. Unexpected NPE.", new Object[0]);
                    } catch (SecurityException e8) {
                        LogManager.e(CycledLeScannerForLollipop.TAG, "Cannot start scan.  Security Exception: " + e8.getMessage(), e8);
                    }
                }
            });
        }
    }

    private void postStopLeScan() {
        if (isBluetoothOn() || Build.VERSION.SDK_INT >= 28) {
            final BluetoothLeScanner scanner = getScanner();
            if (scanner != null) {
                final ScanCallback newLeScanCallback = getNewLeScanCallback();
                this.mScanHandler.removeCallbacksAndMessages((Object) null);
                this.mScanHandler.post(new Runnable() {
                    public void run() {
                        try {
                            LogManager.d(CycledLeScannerForLollipop.TAG, "Stopping LE scan on scan handler", new Object[0]);
                            CycledLeScannerForLollipop.this.mScanningStarted = false;
                            scanner.stopScan(newLeScanCallback);
                        } catch (IllegalStateException unused) {
                            LogManager.w(CycledLeScannerForLollipop.TAG, "Cannot stop scan. Bluetooth may be turned off.", new Object[0]);
                        } catch (NullPointerException e) {
                            LogManager.e(e, CycledLeScannerForLollipop.TAG, "Cannot stop scan. Unexpected NPE.", new Object[0]);
                        } catch (SecurityException e8) {
                            LogManager.e(CycledLeScannerForLollipop.TAG, "Cannot stop scan.  Security Exception", e8);
                        }
                    }
                });
                return;
            }
            return;
        }
        this.mScanningStarted = false;
        LogManager.d(TAG, "Not stopping scan because bluetooth is off", new Object[0]);
    }

    public boolean deferScanIfNeeded() {
        boolean z;
        long elapsedRealtime = this.mNextScanCycleStartTime - SystemClock.elapsedRealtime();
        if (elapsedRealtime > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z6 = this.mMainScanCycleActive;
        this.mMainScanCycleActive = !z;
        if (z) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - DetectionTracker.getInstance().getLastDetectionTime();
            if (z6) {
                if (elapsedRealtime2 > 10000) {
                    this.mBackgroundLScanStartTime = SystemClock.elapsedRealtime();
                    this.mBackgroundLScanFirstDetectionTime = 0;
                    LogManager.d(TAG, "This is Android L. Preparing to do a filtered scan for the background.", new Object[0]);
                    if (this.mBetweenScanPeriod > 6000) {
                        startScan();
                    } else {
                        LogManager.d(TAG, "Suppressing scan between cycles because the between scan cycle is too short.", new Object[0]);
                    }
                } else {
                    LogManager.d(TAG, "This is Android L, but we last saw a beacon only %s ago, so we will not keep scanning in background.", Long.valueOf(elapsedRealtime2));
                }
            }
            if (this.mBackgroundLScanStartTime > 0 && DetectionTracker.getInstance().getLastDetectionTime() > this.mBackgroundLScanStartTime) {
                if (this.mBackgroundLScanFirstDetectionTime == 0) {
                    this.mBackgroundLScanFirstDetectionTime = DetectionTracker.getInstance().getLastDetectionTime();
                }
                if (SystemClock.elapsedRealtime() - this.mBackgroundLScanFirstDetectionTime >= 10000) {
                    LogManager.d(TAG, "We've been detecting for a bit.  Stopping Android L background scanning", new Object[0]);
                    stopScan();
                    this.mBackgroundLScanStartTime = 0;
                } else {
                    LogManager.d(TAG, "Delivering Android L background scanning results", new Object[0]);
                    this.mCycledLeScanCallback.onCycleEnd();
                }
            }
            LogManager.d(TAG, "Waiting to start full Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
            if (z6 && this.mBackgroundFlag) {
                setWakeUpAlarm();
            }
            Handler handler = this.mHandler;
            AnonymousClass1 r42 = new Runnable() {
                public void run() {
                    CycledLeScannerForLollipop.this.scanLeDevice(Boolean.TRUE);
                }
            };
            if (elapsedRealtime > 1000) {
                elapsedRealtime = 1000;
            }
            handler.postDelayed(r42, elapsedRealtime);
        } else if (this.mBackgroundLScanStartTime > 0) {
            stopScan();
            this.mBackgroundLScanStartTime = 0;
        }
        return z;
    }

    public void finishScan() {
        LogManager.d(TAG, "Stopping scan", new Object[0]);
        stopScan();
        this.mScanningPaused = true;
    }

    public void startScan() {
        List<ScanFilter> list;
        ScanSettings scanSettings;
        if (isBluetoothOn() || Build.VERSION.SDK_INT >= 28) {
            List<ScanFilter> arrayList = new ArrayList<>();
            if (!this.mMainScanCycleActive) {
                LogManager.d(TAG, "starting filtered scan in SCAN_MODE_LOW_POWER", new Object[0]);
                scanSettings = new ScanSettings.Builder().setScanMode(0).build();
                list = new ScanFilterUtils().createScanFiltersForBeaconParsers(this.mBeaconManager.getBeaconParsers());
            } else {
                LogManager.d(TAG, "starting a scan in SCAN_MODE_LOW_LATENCY", new Object[0]);
                ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
                int i = Build.VERSION.SDK_INT;
                if (i >= 27) {
                    String str = Build.MANUFACTURER;
                    if ((str.equalsIgnoreCase("samsung") || i >= 34) && !this.mPowerManager.isInteractive()) {
                        LogManager.d(TAG, "Using a non-empty scan filter since this is 14.0 or Samsung 8.1+", new Object[0]);
                        arrayList = new ScanFilterUtils().createScanFiltersForBeaconParsers(this.mBeaconManager.getBeaconParsers());
                    } else {
                        if (str.equalsIgnoreCase("samsung")) {
                            LogManager.d(TAG, "Using a wildcard scan filter because the screen is on.  We will switch to a non-empty filter if the screen goes off", new Object[0]);
                            this.mContext.getApplicationContext().registerReceiver(this.mScreenOffReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"));
                            LogManager.d(TAG, "registering ScreenOffReceiver " + this.mScreenOffReceiver, new Object[0]);
                        }
                        arrayList = new ScanFilterUtils().createWildcardScanFilters();
                    }
                } else {
                    LogManager.d(TAG, "Using no scan filter since this is pre-8.1", new Object[0]);
                }
                list = arrayList;
                scanSettings = build;
            }
            if (scanSettings != null) {
                postStartLeScan(list, scanSettings);
                return;
            }
            return;
        }
        LogManager.d(TAG, "Not starting scan because bluetooth is off", new Object[0]);
    }

    public void stop() {
        super.stop();
        LogManager.d(TAG, "unregistering ScreenOffReceiver as we stop the cycled scanner", new Object[0]);
        try {
            this.mContext.getApplicationContext().unregisterReceiver(this.mScreenOffReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    public void stopScan() {
        postStopLeScan();
    }
}
