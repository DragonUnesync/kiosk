package com.samsung.android.knox.application;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class NetworkStats implements Parcelable {
    public static final Parcelable.Creator<NetworkStats> CREATOR = new Parcelable.Creator<NetworkStats>() {
        public NetworkStats createFromParcel(Parcel parcel) {
            return new NetworkStats(parcel);
        }

        public NetworkStats[] newArray(int i) {
            return new NetworkStats[i];
        }
    };
    public long mobileRxBytes = 0;
    public long mobileTxBytes = 0;
    public int uid = 0;
    public long wifiRxBytes = 0;
    public long wifiTxBytes = 0;

    public NetworkStats() {
    }

    public static NetworkStats convertToNew(android.app.enterprise.NetworkStats networkStats) {
        if (networkStats == null) {
            return null;
        }
        NetworkStats networkStats2 = new NetworkStats();
        networkStats2.uid = networkStats.uid;
        networkStats2.wifiRxBytes = networkStats.wifiRxBytes;
        networkStats2.wifiTxBytes = networkStats.wifiTxBytes;
        networkStats2.mobileRxBytes = networkStats.mobileRxBytes;
        networkStats2.mobileTxBytes = networkStats.mobileTxBytes;
        return networkStats2;
    }

    public static List<NetworkStats> convertToNewList(List<android.app.enterprise.NetworkStats> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.NetworkStats convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.uid = parcel.readInt();
        this.wifiRxBytes = parcel.readLong();
        this.wifiTxBytes = parcel.readLong();
        this.mobileRxBytes = parcel.readLong();
        this.mobileTxBytes = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.uid);
        parcel.writeLong(this.wifiRxBytes);
        parcel.writeLong(this.wifiTxBytes);
        parcel.writeLong(this.mobileRxBytes);
        parcel.writeLong(this.mobileTxBytes);
    }

    public NetworkStats(Parcel parcel) {
        readFromParcel(parcel);
    }
}
