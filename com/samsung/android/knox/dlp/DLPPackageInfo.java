package com.samsung.android.knox.dlp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class DLPPackageInfo implements Parcelable {
    public static final Parcelable.Creator<DLPPackageInfo> CREATOR = new Parcelable.Creator<DLPPackageInfo>() {
        public DLPPackageInfo createFromParcel(Parcel parcel) {
            return new DLPPackageInfo(parcel);
        }

        public DLPPackageInfo[] newArray(int i) {
            return new DLPPackageInfo[i];
        }
    };
    public AppIdentity appIdentity;
    public Bundle extras;

    public static DLPPackageInfo convertToNew(com.sec.enterprise.knox.dlp.DLPPackageInfo dLPPackageInfo) {
        if (dLPPackageInfo == null) {
            return null;
        }
        return new DLPPackageInfo(AppIdentity.convertToNew(dLPPackageInfo.appIdentity), dLPPackageInfo.extras);
    }

    public static List<DLPPackageInfo> convertToNewList(List<com.sec.enterprise.knox.dlp.DLPPackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.sec.enterprise.knox.dlp.DLPPackageInfo convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static com.sec.enterprise.knox.dlp.DLPPackageInfo convertToOld(DLPPackageInfo dLPPackageInfo) {
        if (dLPPackageInfo == null) {
            return null;
        }
        try {
            try {
                return new com.sec.enterprise.knox.dlp.DLPPackageInfo(AppIdentity.convertToOld(dLPPackageInfo.appIdentity), dLPPackageInfo.extras);
            } catch (NoClassDefFoundError unused) {
                throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(DLPPackageInfo.class, 19));
            }
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static List<com.sec.enterprise.knox.dlp.DLPPackageInfo> convertToOldList(List<DLPPackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (DLPPackageInfo convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    private void readFromParcel(Parcel parcel) {
        this.appIdentity = (AppIdentity) parcel.readParcelable(AppIdentity.class.getClassLoader());
        this.extras = parcel.readBundle();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.appIdentity, i);
        parcel.writeBundle(this.extras);
    }

    public DLPPackageInfo() {
    }

    public DLPPackageInfo(AppIdentity appIdentity2, Bundle bundle) {
        this.appIdentity = appIdentity2;
        this.extras = bundle;
    }

    private DLPPackageInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
