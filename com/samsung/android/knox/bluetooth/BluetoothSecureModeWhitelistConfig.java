package com.samsung.android.knox.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class BluetoothSecureModeWhitelistConfig implements Parcelable {
    public static final Parcelable.Creator<BluetoothSecureModeWhitelistConfig> CREATOR = new Parcelable.Creator<BluetoothSecureModeWhitelistConfig>() {
        public BluetoothSecureModeWhitelistConfig createFromParcel(Parcel parcel) {
            return new BluetoothSecureModeWhitelistConfig(parcel);
        }

        public BluetoothSecureModeWhitelistConfig[] newArray(int i) {
            return new BluetoothSecureModeWhitelistConfig[i];
        }
    };
    public int cod;
    public String name;
    public String[] uuids;

    public static BluetoothSecureModeWhitelistConfig convertToNew(android.app.enterprise.BluetoothSecureModeWhitelistConfig bluetoothSecureModeWhitelistConfig) {
        if (bluetoothSecureModeWhitelistConfig == null) {
            return null;
        }
        return new BluetoothSecureModeWhitelistConfig(bluetoothSecureModeWhitelistConfig.name, bluetoothSecureModeWhitelistConfig.cod, bluetoothSecureModeWhitelistConfig.uuids);
    }

    public static List<BluetoothSecureModeWhitelistConfig> convertToNewList(List<android.app.enterprise.BluetoothSecureModeWhitelistConfig> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.BluetoothSecureModeWhitelistConfig convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static android.app.enterprise.BluetoothSecureModeWhitelistConfig convertToOld(BluetoothSecureModeWhitelistConfig bluetoothSecureModeWhitelistConfig) {
        if (bluetoothSecureModeWhitelistConfig == null) {
            return null;
        }
        return new android.app.enterprise.BluetoothSecureModeWhitelistConfig(bluetoothSecureModeWhitelistConfig.name, bluetoothSecureModeWhitelistConfig.cod, bluetoothSecureModeWhitelistConfig.uuids);
    }

    public static List<android.app.enterprise.BluetoothSecureModeWhitelistConfig> convertToOldList(List<BluetoothSecureModeWhitelistConfig> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothSecureModeWhitelistConfig convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        if (parcel != null) {
            this.name = parcel.readString();
            this.cod = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                String[] strArr = new String[readInt];
                this.uuids = strArr;
                parcel.readStringArray(strArr);
                return;
            }
            this.uuids = null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.name);
            parcel.writeInt(this.cod);
            String[] strArr = this.uuids;
            if (strArr == null || strArr.length <= 0) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.uuids);
        }
    }

    public BluetoothSecureModeWhitelistConfig() {
    }

    public BluetoothSecureModeWhitelistConfig(String str, int i, String[] strArr) {
        this.name = str;
        this.cod = i;
        this.uuids = strArr;
    }

    private BluetoothSecureModeWhitelistConfig(Parcel parcel) {
        readFromParcel(parcel);
    }
}
