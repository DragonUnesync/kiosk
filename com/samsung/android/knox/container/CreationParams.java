package com.samsung.android.knox.container;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;

public class CreationParams implements Parcelable {
    public static final Parcelable.Creator<CreationParams> CREATOR = new Parcelable.Creator<CreationParams>() {
        public CreationParams createFromParcel(Parcel parcel) {
            return new CreationParams(parcel);
        }

        public CreationParams[] newArray(int i) {
            return new CreationParams[i];
        }
    };
    private String mAdminPkgName = null;
    private String mConfigName = null;
    private String mPwdResetToken = null;

    public CreationParams() {
    }

    public static com.sec.enterprise.knox.container.CreationParams convertToOld(CreationParams creationParams) {
        if (creationParams == null) {
            return null;
        }
        try {
            com.sec.enterprise.knox.container.CreationParams creationParams2 = new com.sec.enterprise.knox.container.CreationParams();
            creationParams2.setAdminPackageName(creationParams.getAdminPackageName());
            creationParams2.setConfigurationName(creationParams.getConfigurationName());
            creationParams2.setPasswordResetToken(creationParams.getPasswordResetToken());
            return creationParams2;
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(CreationParams.class, 13));
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getAdminPackageName() {
        return this.mAdminPkgName;
    }

    public String getConfigurationName() {
        return this.mConfigName;
    }

    public String getPasswordResetToken() {
        return this.mPwdResetToken;
    }

    public void setAdminPackageName(String str) {
        this.mAdminPkgName = str;
    }

    public void setConfigurationName(String str) {
        this.mConfigName = str;
    }

    public void setPasswordResetToken(String str) {
        this.mPwdResetToken = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = this.mConfigName;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("");
        }
        String str2 = this.mAdminPkgName;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("");
        }
        String str3 = this.mPwdResetToken;
        if (str3 != null) {
            parcel.writeString(str3);
        } else {
            parcel.writeString("");
        }
    }

    public CreationParams(Parcel parcel) {
        String readString = parcel.readString();
        this.mConfigName = readString;
        if (readString != null && readString.isEmpty()) {
            this.mConfigName = null;
        }
        String readString2 = parcel.readString();
        this.mAdminPkgName = readString2;
        if (readString2 != null && readString2.isEmpty()) {
            this.mAdminPkgName = null;
        }
        String readString3 = parcel.readString();
        this.mPwdResetToken = readString3;
        if (readString3 != null && readString3.isEmpty()) {
            this.mPwdResetToken = null;
        }
    }
}
