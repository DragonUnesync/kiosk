package com.samsung.android.knox.container;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;

public class AuthenticationConfig implements Parcelable {
    public static final Parcelable.Creator<AuthenticationConfig> CREATOR = new Parcelable.Creator<AuthenticationConfig>() {
        public AuthenticationConfig createFromParcel(Parcel parcel) {
            return new AuthenticationConfig(parcel);
        }

        public AuthenticationConfig[] newArray(int i) {
            return new AuthenticationConfig[i];
        }
    };
    private Bundle authenticatorConfig;
    private String authenticatorPkgName;
    private String authenticatorPkgSignature;
    private boolean enforceEnterpriseIdentityLock;
    private boolean enforceRemoteAuthAlways;
    private boolean hideEnterpriseIdentityLock;

    public AuthenticationConfig(boolean z, boolean z6, boolean z8, String str, String str2, Bundle bundle) {
        this.hideEnterpriseIdentityLock = z8;
        this.enforceEnterpriseIdentityLock = z6;
        this.enforceRemoteAuthAlways = z;
        this.authenticatorPkgName = str;
        this.authenticatorPkgSignature = str2;
        this.authenticatorConfig = bundle;
    }

    public static AuthenticationConfig convertToNew(com.sec.enterprise.identity.AuthenticationConfig authenticationConfig) {
        if (authenticationConfig == null) {
            return null;
        }
        AuthenticationConfig authenticationConfig2 = new AuthenticationConfig();
        authenticationConfig2.setAuthenticatorConfig(authenticationConfig.getAuthenticatorConfig());
        authenticationConfig2.setAuthenticatorPkgName(authenticationConfig.getAuthenticatorPkgName());
        authenticationConfig2.setAuthenticatorPkgSignature(authenticationConfig.getAuthenticatorPkgSignature());
        authenticationConfig2.setEnforceRemoteAuthAlways(authenticationConfig.getEnforceRemoteAuthAlways());
        authenticationConfig2.setHideEnterpriseIdentityLock(authenticationConfig.getHideEnterpriseIdentityLock());
        authenticationConfig2.setForceEnterpriseIdentityLock(authenticationConfig.getEnforceEnterpriseIdentityLock());
        return authenticationConfig2;
    }

    public static com.sec.enterprise.identity.AuthenticationConfig convertToOld(AuthenticationConfig authenticationConfig) {
        if (authenticationConfig == null) {
            return null;
        }
        try {
            com.sec.enterprise.identity.AuthenticationConfig authenticationConfig2 = new com.sec.enterprise.identity.AuthenticationConfig();
            authenticationConfig2.setAuthenticatorConfig(authenticationConfig.getAuthenticatorConfig());
            authenticationConfig2.setAuthenticatorPkgName(authenticationConfig.getAuthenticatorPkgName());
            authenticationConfig2.setAuthenticatorPkgSignature(authenticationConfig.getAuthenticatorPkgSignature());
            authenticationConfig2.setEnforceRemoteAuthAlways(authenticationConfig.getEnforceRemoteAuthAlways());
            authenticationConfig2.setHideEnterpriseIdentityLock(authenticationConfig.getHideEnterpriseIdentityLock());
            authenticationConfig2.setForceEnterpriseIdentityLock(authenticationConfig.getEnforceEnterpriseIdentityLock());
            return authenticationConfig2;
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(AuthenticationConfig.class, 15));
        }
    }

    public static boolean isDefaultObject(AuthenticationConfig authenticationConfig) {
        if (authenticationConfig != null && authenticationConfig.authenticatorConfig == null && authenticationConfig.authenticatorPkgName == null && authenticationConfig.authenticatorPkgSignature == null && !authenticationConfig.enforceEnterpriseIdentityLock && !authenticationConfig.enforceRemoteAuthAlways && !authenticationConfig.hideEnterpriseIdentityLock) {
            return true;
        }
        return false;
    }

    private void readFromParcel(Parcel parcel) {
        try {
            boolean[] zArr = new boolean[3];
            parcel.readBooleanArray(zArr);
            this.enforceRemoteAuthAlways = zArr[0];
            this.enforceEnterpriseIdentityLock = zArr[1];
            this.hideEnterpriseIdentityLock = zArr[2];
            this.authenticatorPkgName = parcel.readString();
            this.authenticatorPkgSignature = parcel.readString();
            this.authenticatorConfig = parcel.readBundle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int describeContents() {
        return 0;
    }

    public Bundle getAuthenticatorConfig() {
        return this.authenticatorConfig;
    }

    public String getAuthenticatorPkgName() {
        return this.authenticatorPkgName;
    }

    public String getAuthenticatorPkgSignature() {
        return this.authenticatorPkgSignature;
    }

    public boolean getEnforceEnterpriseIdentityLock() {
        return this.enforceEnterpriseIdentityLock;
    }

    public boolean getEnforceRemoteAuthAlways() {
        return this.enforceRemoteAuthAlways;
    }

    public boolean getHideEnterpriseIdentityLock() {
        return this.hideEnterpriseIdentityLock;
    }

    public void setAuthenticatorConfig(Bundle bundle) {
        this.authenticatorConfig = bundle;
    }

    public void setAuthenticatorPkgName(String str) {
        this.authenticatorPkgName = str;
    }

    public void setAuthenticatorPkgSignature(String str) {
        this.authenticatorPkgSignature = str;
    }

    public void setEnforceRemoteAuthAlways(boolean z) {
        this.enforceRemoteAuthAlways = z;
    }

    public void setForceEnterpriseIdentityLock(boolean z) {
        this.enforceEnterpriseIdentityLock = z;
    }

    public void setHideEnterpriseIdentityLock(boolean z) {
        this.hideEnterpriseIdentityLock = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeBooleanArray(new boolean[]{this.enforceRemoteAuthAlways, this.enforceEnterpriseIdentityLock, this.hideEnterpriseIdentityLock});
            parcel.writeString(this.authenticatorPkgName);
            parcel.writeString(this.authenticatorPkgSignature);
            parcel.writeBundle(this.authenticatorConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AuthenticationConfig() {
        this.hideEnterpriseIdentityLock = false;
        this.enforceEnterpriseIdentityLock = false;
        this.enforceRemoteAuthAlways = false;
    }

    public AuthenticationConfig(Parcel parcel) {
        readFromParcel(parcel);
    }
}
