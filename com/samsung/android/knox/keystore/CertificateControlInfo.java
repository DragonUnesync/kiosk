package com.samsung.android.knox.keystore;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class CertificateControlInfo implements Parcelable {
    public static final Parcelable.Creator<CertificateControlInfo> CREATOR = new Parcelable.Creator<CertificateControlInfo>() {
        public CertificateControlInfo createFromParcel(Parcel parcel) {
            return new CertificateControlInfo(parcel);
        }

        public CertificateControlInfo[] newArray(int i) {
            return new CertificateControlInfo[i];
        }
    };
    public String adminPackageName;
    public List<X509Certificate> entries;

    public static CertificateControlInfo convertToNew(com.sec.enterprise.knox.certificate.CertificateControlInfo certificateControlInfo) {
        if (certificateControlInfo == null) {
            return null;
        }
        CertificateControlInfo certificateControlInfo2 = new CertificateControlInfo();
        certificateControlInfo2.entries = certificateControlInfo.entries;
        certificateControlInfo2.adminPackageName = certificateControlInfo.adminPackageName;
        return certificateControlInfo2;
    }

    public static List<CertificateControlInfo> convertToNewList(List<com.sec.enterprise.knox.certificate.CertificateControlInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sec.enterprise.knox.certificate.CertificateControlInfo convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.adminPackageName = parcel.readString();
        int readInt = parcel.readInt();
        this.entries = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            this.entries.add((X509Certificate) parcel.readSerializable());
        }
    }

    public String toString() {
        return "adminPackageName: " + this.adminPackageName + " ,entries: " + this.entries;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.adminPackageName);
        List<X509Certificate> list = this.entries;
        if (list != null) {
            int size = list.size();
            parcel.writeInt(size);
            for (int i8 = 0; i8 < size; i8++) {
                parcel.writeSerializable(this.entries.get(i8));
            }
            return;
        }
        parcel.writeInt(0);
    }

    public CertificateControlInfo() {
        this.adminPackageName = null;
        this.entries = null;
    }

    private CertificateControlInfo(Parcel parcel) {
        this.adminPackageName = null;
        this.entries = null;
        readFromParcel(parcel);
    }
}
