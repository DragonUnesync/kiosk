package com.samsung.android.knox.deviceinfo;

import android.os.Parcel;
import android.os.Parcelable;

public class SimInfo implements Parcelable {
    public static final Parcelable.Creator<SimInfo> CREATOR = new Parcelable.Creator<SimInfo>() {
        public SimInfo createFromParcel(Parcel parcel) {
            return new SimInfo(parcel);
        }

        public SimInfo[] newArray(int i) {
            return new SimInfo[i];
        }
    };
    public String countryIso;
    public String operator;
    public String operatorName;
    public String phoneNumber;
    public String serialNumber;

    public SimInfo() {
    }

    public static SimInfo convertToNew(android.app.enterprise.SimInfo simInfo) {
        if (simInfo == null) {
            return null;
        }
        SimInfo simInfo2 = new SimInfo();
        simInfo2.countryIso = simInfo.countryIso;
        simInfo2.operator = simInfo.operator;
        simInfo2.operatorName = simInfo.operatorName;
        simInfo2.phoneNumber = simInfo.phoneNumber;
        simInfo2.serialNumber = simInfo.serialNumber;
        return simInfo2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.serialNumber = parcel.readString();
        this.phoneNumber = parcel.readString();
        this.operator = parcel.readString();
        this.operatorName = parcel.readString();
        this.countryIso = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serialNumber);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.operator);
        parcel.writeString(this.operatorName);
        parcel.writeString(this.countryIso);
    }

    public SimInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
