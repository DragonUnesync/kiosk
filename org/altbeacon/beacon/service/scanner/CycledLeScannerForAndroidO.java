package org.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.content.Context;
import org.altbeacon.bluetooth.BluetoothCrashResolver;

@TargetApi(26)
class CycledLeScannerForAndroidO extends CycledLeScannerForLollipop {
    private static final String TAG = "CycledLeScannerForAndroidO";

    public CycledLeScannerForAndroidO(Context context, long j7, long j8, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        super(context, j7, j8, z, cycledLeScanCallback, bluetoothCrashResolver);
    }
}
