package org.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.bluetooth.BluetoothCrashResolver;

@TargetApi(18)
public class CycledLeScannerForJellyBeanMr2 extends CycledLeScanner {
    private static final String TAG = "CycledLeScannerForJellyBeanMr2";
    private BluetoothAdapter.LeScanCallback leScanCallback;

    public CycledLeScannerForJellyBeanMr2(Context context, long j7, long j8, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        super(context, j7, j8, z, cycledLeScanCallback, bluetoothCrashResolver);
    }

    /* access modifiers changed from: private */
    public BluetoothAdapter.LeScanCallback getLeScanCallback() {
        if (this.leScanCallback == null) {
            this.leScanCallback = new BluetoothAdapter.LeScanCallback() {
                public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                    LogManager.d(CycledLeScannerForJellyBeanMr2.TAG, "got record", new Object[0]);
                    CycledLeScannerForJellyBeanMr2.this.mCycledLeScanCallback.onLeScan(bluetoothDevice, i, bArr, System.currentTimeMillis());
                    CycledLeScannerForJellyBeanMr2 cycledLeScannerForJellyBeanMr2 = CycledLeScannerForJellyBeanMr2.this;
                    BluetoothCrashResolver bluetoothCrashResolver = cycledLeScannerForJellyBeanMr2.mBluetoothCrashResolver;
                    if (bluetoothCrashResolver != null) {
                        bluetoothCrashResolver.notifyScannedDevice(bluetoothDevice, cycledLeScannerForJellyBeanMr2.getLeScanCallback());
                    }
                }
            };
        }
        return this.leScanCallback;
    }

    private void postStartLeScan() {
        final BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            final BluetoothAdapter.LeScanCallback leScanCallback2 = getLeScanCallback();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            this.mScanHandler.post(new Runnable() {
                public void run() {
                    try {
                        bluetoothAdapter.startLeScan(leScanCallback2);
                    } catch (Exception e) {
                        LogManager.e(e, CycledLeScannerForJellyBeanMr2.TAG, "Internal Android exception in startLeScan()", new Object[0]);
                    }
                }
            });
        }
    }

    private void postStopLeScan() {
        final BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            final BluetoothAdapter.LeScanCallback leScanCallback2 = getLeScanCallback();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            this.mScanHandler.post(new Runnable() {
                public void run() {
                    try {
                        bluetoothAdapter.stopLeScan(leScanCallback2);
                    } catch (Exception e) {
                        LogManager.e(e, CycledLeScannerForJellyBeanMr2.TAG, "Internal Android exception in stopLeScan()", new Object[0]);
                    }
                }
            });
        }
    }

    public boolean deferScanIfNeeded() {
        long elapsedRealtime = this.mNextScanCycleStartTime - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            return false;
        }
        LogManager.d(TAG, "Waiting to start next Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.mBackgroundFlag) {
            setWakeUpAlarm();
        }
        Handler handler = this.mHandler;
        AnonymousClass1 r42 = new Runnable() {
            public void run() {
                CycledLeScannerForJellyBeanMr2.this.scanLeDevice(Boolean.TRUE);
            }
        };
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(r42, elapsedRealtime);
        return true;
    }

    public void finishScan() {
        postStopLeScan();
        this.mScanningPaused = true;
    }

    public void startScan() {
        postStartLeScan();
    }

    public void stopScan() {
        postStopLeScan();
    }
}
