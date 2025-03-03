package com.samsung.android.knox.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.ControlInfo;
import java.util.ArrayList;
import java.util.List;

public class BluetoothControlInfo extends ControlInfo {
    public static final Parcelable.Creator<BluetoothControlInfo> CREATOR = new Parcelable.Creator<BluetoothControlInfo>() {
        public BluetoothControlInfo createFromParcel(Parcel parcel) {
            return new BluetoothControlInfo(parcel);
        }

        public BluetoothControlInfo[] newArray(int i) {
            return new BluetoothControlInfo[i];
        }
    };

    public static BluetoothControlInfo convertToNew(android.app.enterprise.BluetoothControlInfo bluetoothControlInfo) {
        if (bluetoothControlInfo == null) {
            return null;
        }
        BluetoothControlInfo bluetoothControlInfo2 = new BluetoothControlInfo();
        bluetoothControlInfo2.adminPackageName = bluetoothControlInfo.adminPackageName;
        bluetoothControlInfo2.entries = new ArrayList(bluetoothControlInfo.entries);
        return bluetoothControlInfo2;
    }

    public static List<BluetoothControlInfo> convertToNewList(List<android.app.enterprise.BluetoothControlInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.BluetoothControlInfo convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public BluetoothControlInfo() {
    }

    private BluetoothControlInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
