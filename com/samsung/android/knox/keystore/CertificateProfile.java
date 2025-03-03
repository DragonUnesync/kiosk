package com.samsung.android.knox.keystore;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class CertificateProfile implements Parcelable {
    public static final Parcelable.Creator<CertificateProfile> CREATOR = new Parcelable.Creator<CertificateProfile>() {
        public CertificateProfile createFromParcel(Parcel parcel) {
            return new CertificateProfile(parcel);
        }

        public CertificateProfile[] newArray(int i) {
            return new CertificateProfile[i];
        }
    };
    public String alias;
    public boolean allowAllPackages;
    public boolean allowWiFi;
    public boolean isCSRResponse;
    public List<String> packageList;

    public static CertificateProfile convertToNew(com.sec.enterprise.knox.ccm.CertificateProfile certificateProfile) {
        if (certificateProfile == null) {
            return null;
        }
        CertificateProfile certificateProfile2 = new CertificateProfile();
        certificateProfile2.isCSRResponse = certificateProfile.isCSRResponse;
        certificateProfile2.alias = certificateProfile.alias;
        certificateProfile2.packageList = certificateProfile.packageList;
        certificateProfile2.allowWiFi = certificateProfile.allowWiFi;
        certificateProfile2.allowAllPackages = certificateProfile.allowAllPackages;
        return certificateProfile2;
    }

    public static com.sec.enterprise.knox.ccm.CertificateProfile convertToOld(CertificateProfile certificateProfile) {
        if (certificateProfile == null) {
            return null;
        }
        try {
            com.sec.enterprise.knox.ccm.CertificateProfile certificateProfile2 = new com.sec.enterprise.knox.ccm.CertificateProfile();
            certificateProfile2.isCSRResponse = certificateProfile.isCSRResponse;
            certificateProfile2.alias = certificateProfile.alias;
            certificateProfile2.packageList = certificateProfile.packageList;
            certificateProfile2.allowWiFi = certificateProfile.allowWiFi;
            certificateProfile2.allowAllPackages = certificateProfile.allowAllPackages;
            return certificateProfile2;
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(CertificateProfile.class, 12));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isCSRResponse ? 1 : 0);
        parcel.writeString(this.alias);
        parcel.writeStringList(this.packageList);
        parcel.writeInt(this.allowWiFi ? 1 : 0);
        parcel.writeInt(this.allowAllPackages ? 1 : 0);
    }

    public CertificateProfile() {
        this.isCSRResponse = false;
        this.alias = null;
        this.packageList = new ArrayList();
        this.allowWiFi = false;
        this.allowAllPackages = false;
    }

    private CertificateProfile(Parcel parcel) {
        boolean z = false;
        this.isCSRResponse = false;
        this.alias = null;
        this.packageList = new ArrayList();
        this.allowWiFi = false;
        this.allowAllPackages = false;
        this.isCSRResponse = parcel.readInt() != 0;
        this.alias = parcel.readString();
        parcel.readStringList(this.packageList);
        this.allowWiFi = parcel.readInt() != 0;
        this.allowAllPackages = parcel.readInt() != 0 ? true : z;
    }
}
