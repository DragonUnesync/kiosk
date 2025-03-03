package com.samsung.android.knox.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothSecureModeConfig implements Parcelable {
    public static final Parcelable.Creator<BluetoothSecureModeConfig> CREATOR = new Parcelable.Creator<BluetoothSecureModeConfig>() {
        public BluetoothSecureModeConfig createFromParcel(Parcel parcel) {
            return new BluetoothSecureModeConfig(parcel);
        }

        public BluetoothSecureModeConfig[] newArray(int i) {
            return new BluetoothSecureModeConfig[i];
        }
    };
    public boolean a2dpEnable;
    public boolean ftpEnable;
    public boolean gattEnable;
    public boolean hdpEnable;
    public boolean hfpEnable;
    public boolean hidEnable;
    public boolean mapEnable;
    public boolean oppEnable;
    public boolean pairingMode;
    public boolean panEnable;
    public boolean pbapEnable;
    public boolean sapEnable;
    public boolean scanMode;
    public boolean whitelistEnable;

    public static BluetoothSecureModeConfig convertToNew(android.app.enterprise.BluetoothSecureModeConfig bluetoothSecureModeConfig) {
        if (bluetoothSecureModeConfig == null) {
            return null;
        }
        BluetoothSecureModeConfig bluetoothSecureModeConfig2 = new BluetoothSecureModeConfig();
        bluetoothSecureModeConfig2.a2dpEnable = bluetoothSecureModeConfig.a2dpEnable;
        bluetoothSecureModeConfig2.ftpEnable = bluetoothSecureModeConfig.ftpEnable;
        bluetoothSecureModeConfig2.gattEnable = bluetoothSecureModeConfig.gattEnable;
        bluetoothSecureModeConfig2.hdpEnable = bluetoothSecureModeConfig.hdpEnable;
        bluetoothSecureModeConfig2.hfpEnable = bluetoothSecureModeConfig.hfpEnable;
        bluetoothSecureModeConfig2.hidEnable = bluetoothSecureModeConfig.hidEnable;
        bluetoothSecureModeConfig2.mapEnable = bluetoothSecureModeConfig.mapEnable;
        bluetoothSecureModeConfig2.oppEnable = bluetoothSecureModeConfig.oppEnable;
        bluetoothSecureModeConfig2.pairingMode = bluetoothSecureModeConfig.pairingMode;
        bluetoothSecureModeConfig2.panEnable = bluetoothSecureModeConfig.panEnable;
        bluetoothSecureModeConfig2.pbapEnable = bluetoothSecureModeConfig.pbapEnable;
        bluetoothSecureModeConfig2.sapEnable = bluetoothSecureModeConfig.sapEnable;
        bluetoothSecureModeConfig2.scanMode = bluetoothSecureModeConfig.scanMode;
        bluetoothSecureModeConfig2.whitelistEnable = bluetoothSecureModeConfig.whitelistEnable;
        return bluetoothSecureModeConfig2;
    }

    public static android.app.enterprise.BluetoothSecureModeConfig convertToOld(BluetoothSecureModeConfig bluetoothSecureModeConfig) {
        if (bluetoothSecureModeConfig == null) {
            return null;
        }
        android.app.enterprise.BluetoothSecureModeConfig bluetoothSecureModeConfig2 = new android.app.enterprise.BluetoothSecureModeConfig();
        bluetoothSecureModeConfig2.a2dpEnable = bluetoothSecureModeConfig.a2dpEnable;
        bluetoothSecureModeConfig2.ftpEnable = bluetoothSecureModeConfig.ftpEnable;
        bluetoothSecureModeConfig2.gattEnable = bluetoothSecureModeConfig.gattEnable;
        bluetoothSecureModeConfig2.hdpEnable = bluetoothSecureModeConfig.hdpEnable;
        bluetoothSecureModeConfig2.hfpEnable = bluetoothSecureModeConfig.hfpEnable;
        bluetoothSecureModeConfig2.hidEnable = bluetoothSecureModeConfig.hidEnable;
        bluetoothSecureModeConfig2.mapEnable = bluetoothSecureModeConfig.mapEnable;
        bluetoothSecureModeConfig2.oppEnable = bluetoothSecureModeConfig.oppEnable;
        bluetoothSecureModeConfig2.pairingMode = bluetoothSecureModeConfig.pairingMode;
        bluetoothSecureModeConfig2.panEnable = bluetoothSecureModeConfig.panEnable;
        bluetoothSecureModeConfig2.pbapEnable = bluetoothSecureModeConfig.pbapEnable;
        bluetoothSecureModeConfig2.sapEnable = bluetoothSecureModeConfig.sapEnable;
        bluetoothSecureModeConfig2.scanMode = bluetoothSecureModeConfig.scanMode;
        bluetoothSecureModeConfig2.whitelistEnable = bluetoothSecureModeConfig.whitelistEnable;
        return bluetoothSecureModeConfig2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        if (parcel != null) {
            boolean z18 = true;
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            this.scanMode = z;
            if (parcel.readInt() == 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.pairingMode = z6;
            if (parcel.readInt() == 0) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.hfpEnable = z8;
            if (parcel.readInt() == 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            this.a2dpEnable = z9;
            if (parcel.readInt() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.hidEnable = z10;
            if (parcel.readInt() == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.hdpEnable = z11;
            if (parcel.readInt() == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.panEnable = z12;
            if (parcel.readInt() == 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.oppEnable = z13;
            if (parcel.readInt() == 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            this.pbapEnable = z14;
            if (parcel.readInt() == 0) {
                z15 = false;
            } else {
                z15 = true;
            }
            this.mapEnable = z15;
            if (parcel.readInt() == 0) {
                z16 = false;
            } else {
                z16 = true;
            }
            this.ftpEnable = z16;
            if (parcel.readInt() == 0) {
                z17 = false;
            } else {
                z17 = true;
            }
            this.sapEnable = z17;
            if (parcel.readInt() == 0) {
                z18 = false;
            }
            this.whitelistEnable = z18;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.scanMode ? 1 : 0);
            parcel.writeInt(this.pairingMode ? 1 : 0);
            parcel.writeInt(this.hfpEnable ? 1 : 0);
            parcel.writeInt(this.a2dpEnable ? 1 : 0);
            parcel.writeInt(this.hidEnable ? 1 : 0);
            parcel.writeInt(this.hdpEnable ? 1 : 0);
            parcel.writeInt(this.panEnable ? 1 : 0);
            parcel.writeInt(this.oppEnable ? 1 : 0);
            parcel.writeInt(this.pbapEnable ? 1 : 0);
            parcel.writeInt(this.mapEnable ? 1 : 0);
            parcel.writeInt(this.ftpEnable ? 1 : 0);
            parcel.writeInt(this.sapEnable ? 1 : 0);
            parcel.writeInt(this.whitelistEnable ? 1 : 0);
        }
    }

    private BluetoothSecureModeConfig(Parcel parcel) {
        readFromParcel(parcel);
    }

    public BluetoothSecureModeConfig() {
    }
}
