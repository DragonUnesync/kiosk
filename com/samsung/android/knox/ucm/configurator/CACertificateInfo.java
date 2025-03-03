package com.samsung.android.knox.ucm.configurator;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class CACertificateInfo implements Parcelable {
    public static final Parcelable.Creator<CACertificateInfo> CREATOR = new Parcelable.Creator<CACertificateInfo>() {
        public CACertificateInfo createFromParcel(Parcel parcel) {
            return new CACertificateInfo(parcel);
        }

        public CACertificateInfo[] newArray(int i) {
            return new CACertificateInfo[i];
        }
    };
    public Bundle bundle;
    private int certLength;
    public byte[] certificate;

    public static CACertificateInfo convertToNew(com.sec.enterprise.knox.ucm.configurator.CACertificateInfo cACertificateInfo) {
        CACertificateInfo cACertificateInfo2 = new CACertificateInfo();
        cACertificateInfo2.bundle = cACertificateInfo.bundle;
        cACertificateInfo2.certificate = cACertificateInfo.certificate;
        return cACertificateInfo2;
    }

    private void readFromParcel(Parcel parcel) {
        this.bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        int readInt = parcel.readInt();
        this.certLength = readInt;
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.certificate = bArr;
            parcel.readByteArray(bArr);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeParcelable(this.bundle, i);
            parcel.writeInt(this.certLength);
            if (this.certLength != 0) {
                parcel.writeByteArray(this.certificate);
            }
        }
    }

    private CACertificateInfo() {
    }

    private CACertificateInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
