package com.samsung.android.knox.net.firewall;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class DomainFilterReport implements Parcelable {
    public static final Parcelable.Creator<DomainFilterReport> CREATOR = new Parcelable.Creator<DomainFilterReport>() {
        public DomainFilterReport createFromParcel(Parcel parcel) {
            return new DomainFilterReport(parcel);
        }

        public DomainFilterReport[] newArray(int i) {
            return new DomainFilterReport[i];
        }
    };
    private String mDomainUrl;
    private String mPackageName;
    private long mTimeStamp;

    private static DomainFilterReport convertToNew(com.sec.enterprise.firewall.DomainFilterReport domainFilterReport) {
        if (domainFilterReport == null) {
            return null;
        }
        return new DomainFilterReport(domainFilterReport.getPackageName(), domainFilterReport.getTimeStamp(), domainFilterReport.getDomainUrl());
    }

    public static List<DomainFilterReport> convertToNewList(List<com.sec.enterprise.firewall.DomainFilterReport> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sec.enterprise.firewall.DomainFilterReport convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public String getDomainUrl() {
        return this.mDomainUrl;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPackageName);
        parcel.writeLong(this.mTimeStamp);
        parcel.writeString(this.mDomainUrl);
    }

    public DomainFilterReport(String str, long j7, String str2) {
        this.mPackageName = str;
        this.mTimeStamp = j7;
        this.mDomainUrl = str2;
    }

    private DomainFilterReport() {
    }

    private DomainFilterReport(Parcel parcel) {
        this();
        this.mPackageName = parcel.readString();
        this.mTimeStamp = parcel.readLong();
        this.mDomainUrl = parcel.readString();
    }
}
