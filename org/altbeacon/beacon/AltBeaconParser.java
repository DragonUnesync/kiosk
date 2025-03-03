package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;

public class AltBeaconParser extends BeaconParser {
    public static final String TAG = "AltBeaconParser";

    public AltBeaconParser() {
        this.mHardwareAssistManufacturers = new int[]{280};
        setBeaconLayout(BeaconParser.ALTBEACON_LAYOUT);
        this.mIdentifier = "altbeacon";
    }

    @Deprecated
    public Beacon fromScanData(byte[] bArr, int i, BluetoothDevice bluetoothDevice) {
        return fromScanData(bArr, i, bluetoothDevice, System.currentTimeMillis(), new AltBeacon());
    }

    public Beacon fromScanData(byte[] bArr, int i, BluetoothDevice bluetoothDevice, long j7) {
        return fromScanData(bArr, i, bluetoothDevice, j7, new AltBeacon());
    }
}
