package org.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.Date;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import org.altbeacon.bluetooth.BluetoothCrashResolver;

@TargetApi(18)
public abstract class CycledLeScanner {
    public static final long ANDROID_N_MAX_SCAN_DURATION_MILLIS = 1800000;
    private static final long ANDROID_N_MIN_SCAN_CYCLE_MILLIS = 6000;
    private static final String TAG = "CycledLeScanner";
    protected boolean mBackgroundFlag = false;
    protected long mBetweenScanPeriod;
    private BluetoothAdapter mBluetoothAdapter;
    protected final BluetoothCrashResolver mBluetoothCrashResolver;
    private BroadcastReceiver mCancelAlarmOnUserSwitchBroadcastReceiver = null;
    protected final Context mContext;
    private long mCurrentScanStartTime = 0;
    protected final CycledLeScanCallback mCycledLeScanCallback;
    private volatile boolean mDistinctPacketsDetectedPerScan = false;
    protected final Handler mHandler = new Handler(Looper.getMainLooper());
    private long mLastScanCycleEndTime = 0;
    private long mLastScanCycleStartTime = 0;
    private boolean mLongScanForcingEnabled = false;
    protected long mNextScanCycleStartTime = 0;
    protected boolean mRestartNeeded = false;
    private long mScanCycleStopTime = 0;
    private boolean mScanCyclerStarted = false;
    protected final Handler mScanHandler;
    private long mScanPeriod;
    /* access modifiers changed from: private */
    public final HandlerThread mScanThread;
    private boolean mScanning;
    private boolean mScanningEnabled = false;
    private boolean mScanningLeftOn = false;
    protected boolean mScanningPaused;
    private PendingIntent mWakeUpOperation = null;

    public CycledLeScanner(Context context, long j7, long j8, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        this.mScanPeriod = j7;
        this.mBetweenScanPeriod = j8;
        this.mContext = context;
        this.mCycledLeScanCallback = cycledLeScanCallback;
        this.mBluetoothCrashResolver = bluetoothCrashResolver;
        this.mBackgroundFlag = z;
        HandlerThread handlerThread = new HandlerThread("CycledLeScannerThread");
        this.mScanThread = handlerThread;
        handlerThread.start();
        this.mScanHandler = new Handler(handlerThread.getLooper());
    }

    private boolean checkLocationPermission() {
        if ((Build.VERSION.SDK_INT < 31 || !checkPermission("android.permission.BLUETOOTH_SCAN")) && !checkPermission("android.permission.ACCESS_COARSE_LOCATION") && !checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    private boolean checkPermission(String str) {
        if (this.mContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static CycledLeScanner createScanner(Context context, long j7, long j8, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        boolean z6 = true;
        boolean z8 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            LogManager.i(TAG, "Using Android O scanner", new Object[0]);
        } else if (BeaconManager.isAndroidLScanningDisabled()) {
            LogManager.i(TAG, "This is Android 5.0, but L scanning is disabled. We are using old scanning APIs", new Object[0]);
            z6 = false;
        } else {
            LogManager.i(TAG, "This is Android 5.0.  We are using new scanning APIs", new Object[0]);
            z6 = false;
            z8 = true;
        }
        if (z6) {
            return new CycledLeScannerForAndroidO(context, j7, j8, z, cycledLeScanCallback, bluetoothCrashResolver);
        }
        if (z8) {
            return new CycledLeScannerForLollipop(context, j7, j8, z, cycledLeScanCallback, bluetoothCrashResolver);
        }
        return new CycledLeScannerForJellyBeanMr2(context, j7, j8, z, cycledLeScanCallback, bluetoothCrashResolver);
    }

    private void finishScanCycle() {
        LogManager.d(TAG, "Done with scan cycle", new Object[0]);
        try {
            this.mCycledLeScanCallback.onCycleEnd();
            if (this.mScanning) {
                if (getBluetoothAdapter() != null) {
                    if (!getBluetoothAdapter().isEnabled()) {
                        if (Build.VERSION.SDK_INT < 28) {
                            LogManager.d(TAG, "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                            this.mRestartNeeded = true;
                        }
                    }
                    if (this.mDistinctPacketsDetectedPerScan && this.mBetweenScanPeriod == 0) {
                        if (!mustStopScanToPreventAndroidNScanTimeout()) {
                            LogManager.d(TAG, "Not stopping scanning.  Device capable of multiple indistinct detections per scan.", new Object[0]);
                            this.mScanningLeftOn = true;
                            this.mLastScanCycleEndTime = SystemClock.elapsedRealtime();
                        }
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (Build.VERSION.SDK_INT < 24 || this.mBetweenScanPeriod + this.mScanPeriod >= ANDROID_N_MIN_SCAN_CYCLE_MILLIS || elapsedRealtime - this.mLastScanCycleStartTime >= ANDROID_N_MIN_SCAN_CYCLE_MILLIS) {
                        try {
                            LogManager.d(TAG, "stopping bluetooth le scan", new Object[0]);
                            finishScan();
                            this.mScanningLeftOn = false;
                        } catch (Exception e) {
                            LogManager.w(e, TAG, "Internal Android exception scanning for beacons", new Object[0]);
                        }
                        this.mLastScanCycleEndTime = SystemClock.elapsedRealtime();
                    } else {
                        LogManager.d(TAG, "Not stopping scan because this is Android N and we keep scanning for a minimum of 6 seconds at a time. We will stop in " + (ANDROID_N_MIN_SCAN_CYCLE_MILLIS - (elapsedRealtime - this.mLastScanCycleStartTime)) + " millisconds.", new Object[0]);
                        this.mScanningLeftOn = true;
                        this.mLastScanCycleEndTime = SystemClock.elapsedRealtime();
                    }
                }
                this.mNextScanCycleStartTime = getNextScanStartTime();
                if (this.mScanningEnabled) {
                    scanLeDevice(Boolean.TRUE);
                }
            }
            if (!this.mScanningEnabled) {
                LogManager.d(TAG, "Scanning disabled. ", new Object[0]);
                this.mScanCyclerStarted = false;
                cancelWakeUpAlarm();
            }
        } catch (SecurityException unused) {
            LogManager.w(TAG, "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    private long getNextScanStartTime() {
        long j7 = this.mBetweenScanPeriod;
        if (j7 == 0) {
            return SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = j7 - (SystemClock.elapsedRealtime() % (this.mScanPeriod + j7));
        LogManager.d(TAG, "Normalizing between scan period from %s to %s", Long.valueOf(this.mBetweenScanPeriod), Long.valueOf(elapsedRealtime));
        return SystemClock.elapsedRealtime() + elapsedRealtime;
    }

    private boolean mustStopScanToPreventAndroidNScanTimeout() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.mBetweenScanPeriod + this.mScanPeriod;
        if (Build.VERSION.SDK_INT >= 24) {
            long j7 = this.mCurrentScanStartTime;
            if (j7 > 0 && elapsedRealtime - j7 > ANDROID_N_MAX_SCAN_DURATION_MILLIS) {
                LogManager.d(TAG, "The next scan cycle would go over the Android N max duration.", new Object[0]);
                if (this.mLongScanForcingEnabled) {
                    LogManager.d(TAG, "Stopping scan to prevent Android N scan timeout.", new Object[0]);
                    return true;
                }
                LogManager.w(TAG, "Allowing a long running scan to be stopped by the OS.  To prevent this, set longScanForcingEnabled in the AndroidBeaconLibrary.", new Object[0]);
            }
        }
        return false;
    }

    public void cancelAlarmOnUserSwitch() {
        if (this.mCancelAlarmOnUserSwitchBroadcastReceiver == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_BACKGROUND");
            intentFilter.addAction("android.intent.action.USER_FOREGROUND");
            AnonymousClass3 r12 = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    LogManager.w(CycledLeScanner.TAG, "User switch detected.  Cancelling alarm to prevent potential crash.", new Object[0]);
                    CycledLeScanner.this.cancelWakeUpAlarm();
                }
            };
            this.mCancelAlarmOnUserSwitchBroadcastReceiver = r12;
            this.mContext.registerReceiver(r12, intentFilter);
        }
    }

    public void cancelWakeUpAlarm() {
        LogManager.d(TAG, "cancel wakeup alarm: %s", this.mWakeUpOperation);
        ((AlarmManager) this.mContext.getSystemService("alarm")).set(2, Long.MAX_VALUE, getWakeUpOperation());
        LogManager.d(TAG, "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(Long.MAX_VALUE - SystemClock.elapsedRealtime()), getWakeUpOperation());
    }

    public void cleanupCancelAlarmOnUserSwitch() {
        BroadcastReceiver broadcastReceiver = this.mCancelAlarmOnUserSwitchBroadcastReceiver;
        if (broadcastReceiver != null) {
            try {
                this.mContext.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.mCancelAlarmOnUserSwitchBroadcastReceiver = null;
        }
    }

    public abstract boolean deferScanIfNeeded();

    public void destroy() {
        LogManager.d(TAG, "Destroying", new Object[0]);
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mScanHandler.post(new Runnable() {
            public void run() {
                LogManager.d(CycledLeScanner.TAG, "Quitting scan thread", new Object[0]);
                CycledLeScanner.this.mScanThread.quit();
            }
        });
        cleanupCancelAlarmOnUserSwitch();
    }

    public abstract void finishScan();

    public BluetoothAdapter getBluetoothAdapter() {
        try {
            if (this.mBluetoothAdapter == null) {
                BluetoothAdapter adapter = ((BluetoothManager) this.mContext.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                this.mBluetoothAdapter = adapter;
                if (adapter == null) {
                    LogManager.w(TAG, "Failed to construct a BluetoothAdapter", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            LogManager.e(TAG, "Cannot consruct bluetooth adapter.  Security Exception", new Object[0]);
        }
        return this.mBluetoothAdapter;
    }

    public boolean getDistinctPacketsDetectedPerScan() {
        return this.mDistinctPacketsDetectedPerScan;
    }

    public PendingIntent getWakeUpOperation() {
        if (this.mWakeUpOperation == null) {
            Intent intent = new Intent(this.mContext, StartupBroadcastReceiver.class);
            intent.putExtra("wakeup", true);
            this.mWakeUpOperation = PendingIntent.getBroadcast(this.mContext, 0, intent, 201326592);
        }
        return this.mWakeUpOperation;
    }

    public void scanLeDevice(Boolean bool) {
        try {
            this.mScanCyclerStarted = true;
            if (getBluetoothAdapter() == null) {
                LogManager.e(TAG, "No Bluetooth adapter.  beaconService cannot scan.", new Object[0]);
            }
            if (!this.mScanningEnabled || !bool.booleanValue()) {
                LogManager.d(TAG, "disabling scan", new Object[0]);
                this.mScanning = false;
                this.mScanCyclerStarted = false;
                stopScan();
                this.mCurrentScanStartTime = 0;
                this.mLastScanCycleEndTime = SystemClock.elapsedRealtime();
                this.mHandler.removeCallbacksAndMessages((Object) null);
                finishScanCycle();
            } else if (!deferScanIfNeeded()) {
                LogManager.d(TAG, "starting a new scan cycle", new Object[0]);
                if (this.mScanning && !this.mScanningPaused) {
                    if (!this.mRestartNeeded) {
                        LogManager.d(TAG, "We are already scanning and have been for " + (SystemClock.elapsedRealtime() - this.mCurrentScanStartTime) + " millis", new Object[0]);
                        this.mScanCycleStopTime = SystemClock.elapsedRealtime() + this.mScanPeriod;
                        scheduleScanCycleStop();
                        LogManager.d(TAG, "Scan started", new Object[0]);
                    }
                }
                this.mScanning = true;
                this.mScanningPaused = false;
                try {
                    if (getBluetoothAdapter() != null) {
                        if (!getBluetoothAdapter().isEnabled()) {
                            if (Build.VERSION.SDK_INT < 28) {
                                LogManager.d(TAG, "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                            }
                        }
                        BluetoothCrashResolver bluetoothCrashResolver = this.mBluetoothCrashResolver;
                        if (bluetoothCrashResolver != null && bluetoothCrashResolver.isRecoveryInProgress()) {
                            LogManager.w(TAG, "Skipping scan because crash recovery is in progress.", new Object[0]);
                        } else if (this.mScanningEnabled) {
                            if (this.mRestartNeeded) {
                                this.mRestartNeeded = false;
                                LogManager.d(TAG, "restarting a bluetooth le scan", new Object[0]);
                            } else {
                                LogManager.d(TAG, "starting a new bluetooth le scan", new Object[0]);
                            }
                            try {
                                if (Build.VERSION.SDK_INT >= 23) {
                                    if (checkLocationPermission()) {
                                    }
                                }
                                this.mCurrentScanStartTime = SystemClock.elapsedRealtime();
                                startScan();
                            } catch (Exception e) {
                                LogManager.e(e, TAG, "Internal Android exception scanning for beacons", new Object[0]);
                            }
                        } else {
                            LogManager.d(TAG, "Scanning unnecessary - no monitoring or ranging active.", new Object[0]);
                        }
                        this.mLastScanCycleStartTime = SystemClock.elapsedRealtime();
                    }
                } catch (Exception e8) {
                    LogManager.e(e8, TAG, "Exception starting Bluetooth scan.  Perhaps Bluetooth is disabled or unavailable?", new Object[0]);
                }
                this.mScanCycleStopTime = SystemClock.elapsedRealtime() + this.mScanPeriod;
                scheduleScanCycleStop();
                LogManager.d(TAG, "Scan started", new Object[0]);
            }
        } catch (SecurityException unused) {
            LogManager.w(TAG, "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    public void scheduleScanCycleStop() {
        long elapsedRealtime = this.mScanCycleStopTime - SystemClock.elapsedRealtime();
        if (!this.mScanningEnabled || elapsedRealtime <= 0) {
            finishScanCycle();
            return;
        }
        LogManager.d(TAG, "Waiting to stop scan cycle for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.mBackgroundFlag) {
            setWakeUpAlarm();
        }
        Handler handler = this.mHandler;
        AnonymousClass2 r32 = new Runnable() {
            public void run() {
                CycledLeScanner.this.scheduleScanCycleStop();
            }
        };
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(r32, elapsedRealtime);
    }

    public void setDistinctPacketsDetectedPerScan(boolean z) {
        this.mDistinctPacketsDetectedPerScan = z;
    }

    public void setLongScanForcingEnabled(boolean z) {
        this.mLongScanForcingEnabled = z;
    }

    public void setScanPeriods(long j7, long j8, boolean z) {
        LogManager.d(TAG, "Set scan periods called with %s, %s Background mode must have changed.", Long.valueOf(j7), Long.valueOf(j8));
        if (this.mBackgroundFlag != z) {
            this.mRestartNeeded = true;
        }
        this.mBackgroundFlag = z;
        this.mScanPeriod = j7;
        this.mBetweenScanPeriod = j8;
        if (z) {
            LogManager.d(TAG, "We are in the background.  Setting wakeup alarm", new Object[0]);
            setWakeUpAlarm();
        } else {
            LogManager.d(TAG, "We are not in the background.  Cancelling wakeup alarm", new Object[0]);
            cancelWakeUpAlarm();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = this.mNextScanCycleStartTime;
        if (j9 > elapsedRealtime) {
            long j10 = this.mLastScanCycleEndTime + j8;
            if (j10 < j9) {
                this.mNextScanCycleStartTime = j10;
                LogManager.i(TAG, "Adjusted nextScanStartTime to be %s", new Date(System.currentTimeMillis() + (this.mNextScanCycleStartTime - SystemClock.elapsedRealtime())));
            }
        }
        long j11 = this.mScanCycleStopTime;
        if (j11 > elapsedRealtime) {
            long j12 = this.mLastScanCycleStartTime + j7;
            if (j12 < j11) {
                this.mScanCycleStopTime = j12;
                LogManager.i(TAG, "Adjusted scanStopTime to be %s", Long.valueOf(j12));
            }
        }
    }

    public void setWakeUpAlarm() {
        long j7 = this.mBetweenScanPeriod;
        if (BeaconManager.DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD >= j7) {
            j7 = 300000;
        }
        long j8 = this.mScanPeriod;
        if (j7 < j8) {
            j7 = j8;
        }
        ((AlarmManager) this.mContext.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + j7, getWakeUpOperation());
        LogManager.d(TAG, "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(j7), getWakeUpOperation());
        cancelAlarmOnUserSwitch();
    }

    public void start() {
        LogManager.d(TAG, "start called", new Object[0]);
        this.mScanningEnabled = true;
        if (!this.mScanCyclerStarted) {
            scanLeDevice(Boolean.TRUE);
        } else {
            LogManager.d(TAG, "scanning already started", new Object[0]);
        }
    }

    public abstract void startScan();

    public void stop() {
        LogManager.d(TAG, "stop called", new Object[0]);
        this.mScanningEnabled = false;
        if (this.mScanCyclerStarted) {
            scanLeDevice(Boolean.FALSE);
            if (this.mScanningLeftOn) {
                LogManager.d(TAG, "Stopping scanning previously left on.", new Object[0]);
                this.mScanningLeftOn = false;
                try {
                    LogManager.d(TAG, "stopping bluetooth le scan", new Object[0]);
                    finishScan();
                } catch (Exception e) {
                    LogManager.w(e, TAG, "Internal Android exception scanning for beacons", new Object[0]);
                }
            }
        } else {
            LogManager.d(TAG, "scanning already stopped", new Object[0]);
        }
    }

    public abstract void stopScan();
}
