package com.samsung.android.knox.net.billing;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseApn implements Parcelable {
    public static Parcelable.Creator<EnterpriseApn> CREATOR = new Parcelable.Creator<EnterpriseApn>() {
        public EnterpriseApn createFromParcel(Parcel parcel) {
            return new EnterpriseApn(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public EnterpriseApn[] newArray(int i) {
            return new EnterpriseApn[i];
        }
    };
    public final String apn;
    public final String mcc;
    public final String mnc;

    public EnterpriseApn(String str, String str2, String str3) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.apn = str;
        this.mcc = str2;
        this.mnc = str3;
    }

    public static EnterpriseApn convertToNew(com.sec.enterprise.knox.billing.EnterpriseApn enterpriseApn) {
        if (enterpriseApn != null) {
            return new EnterpriseApn(enterpriseApn.apn, enterpriseApn.mcc, enterpriseApn.mnc);
        }
        return null;
    }

    public static List<EnterpriseApn> convertToNewList(List<com.sec.enterprise.knox.billing.EnterpriseApn> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.sec.enterprise.knox.billing.EnterpriseApn convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static com.sec.enterprise.knox.billing.EnterpriseApn convertToOld(EnterpriseApn enterpriseApn) {
        if (enterpriseApn == null) {
            return null;
        }
        try {
            return new com.sec.enterprise.knox.billing.EnterpriseApn(enterpriseApn.apn, enterpriseApn.mcc, enterpriseApn.mnc);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(EnterpriseApn.class, 13));
        }
    }

    public static List<com.sec.enterprise.knox.billing.EnterpriseApn> convertToOldList(List<EnterpriseApn> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (EnterpriseApn convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            return ((EnterpriseApn) obj).toString().equalsIgnoreCase(toString());
        }
        return false;
    }

    public int hashCode() {
        String str = this.apn;
        if (str == null || this.mcc == null || this.mnc == null) {
            return 0;
        }
        int i = 0;
        for (char c8 : str.toCharArray()) {
            i += c8;
        }
        for (char c9 : this.mcc.toCharArray()) {
            i += c9;
        }
        for (char c10 : this.mnc.toCharArray()) {
            i += c10;
        }
        return i;
    }

    public String toString() {
        return this.apn + ":" + this.mcc + ":" + this.mnc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.apn);
        parcel.writeString(this.mcc);
        parcel.writeString(this.mnc);
    }
}
