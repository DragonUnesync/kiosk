package com.samsung.android.knox.net;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import com.sec.enterprise.network.AuthConfig;
import java.util.ArrayList;
import java.util.List;

public class ProxyProperties implements Parcelable {
    public static final Parcelable.Creator<ProxyProperties> CREATOR = new Parcelable.Creator<ProxyProperties>() {
        public ProxyProperties createFromParcel(Parcel parcel) {
            return new ProxyProperties(parcel);
        }

        public ProxyProperties[] newArray(int i) {
            return new ProxyProperties[i];
        }
    };
    private List<AuthConfig> mAuthConfigList;
    private List<String> mExclusionList;
    private String mHostname;
    private String mPacFileUrl;
    private int mPortNumber;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.samsung.android.knox.net.ProxyProperties convertToNew(android.app.enterprise.devicesettings.ProxyProperties r2) {
        /*
            if (r2 != 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x0004:
            com.samsung.android.knox.net.ProxyProperties r0 = new com.samsung.android.knox.net.ProxyProperties
            r0.<init>()
            java.lang.String r1 = r2.getHostname()
            r0.setHostname(r1)
            int r1 = r2.getPortNumber()
            r0.setPortNumber(r1)
            java.util.List r1 = r2.getExclusionList()
            r0.setExclusionList(r1)
            java.lang.String r1 = r2.getPacFileUrl()     // Catch:{ NoSuchMethodError -> 0x0025 }
            r0.setPacFileUrl(r1)     // Catch:{ NoSuchMethodError -> 0x0025 }
        L_0x0025:
            java.util.List r2 = r2.getAuthConfigList()     // Catch:{ NoSuchMethodError -> 0x0030 }
            java.util.List r2 = com.samsung.android.knox.net.AuthConfig.convertToNewList(r2)     // Catch:{ NoSuchMethodError -> 0x0030 }
            r0.setAuthConfigList(r2)     // Catch:{ NoSuchMethodError -> 0x0030 }
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.ProxyProperties.convertToNew(android.app.enterprise.devicesettings.ProxyProperties):com.samsung.android.knox.net.ProxyProperties");
    }

    public static android.app.enterprise.devicesettings.ProxyProperties convertToOld(ProxyProperties proxyProperties) {
        Class<ProxyProperties> cls = ProxyProperties.class;
        if (proxyProperties == null) {
            return null;
        }
        try {
            android.app.enterprise.devicesettings.ProxyProperties proxyProperties2 = new android.app.enterprise.devicesettings.ProxyProperties();
            proxyProperties2.setHostname(proxyProperties.getHostname());
            proxyProperties2.setPortNumber(proxyProperties.getPortNumber());
            proxyProperties2.setExclusionList(proxyProperties.getExclusionList());
            try {
                proxyProperties2.setPacFileUrl(proxyProperties.getPacFileUrl());
            } catch (NoSuchMethodError unused) {
                if (proxyProperties.getPacFileUrl() != null) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setPacFileUrl", new Class[]{String.class}, 20));
                }
            }
            List<AuthConfig> convertToOldList = AuthConfig.convertToOldList(proxyProperties.getAuthConfigList());
            try {
                proxyProperties2.setAuthConfigList(convertToOldList);
            } catch (NoSuchMethodError unused2) {
                if (convertToOldList == null || !convertToOldList.isEmpty()) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setAuthConfigList", new Class[]{List.class}, 20));
                }
            }
            return proxyProperties2;
        } catch (NoClassDefFoundError unused3) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(cls, 17));
        }
    }

    public int describeContents() {
        return 0;
    }

    public List<AuthConfig> getAuthConfigList() {
        return this.mAuthConfigList;
    }

    public List<String> getExclusionList() {
        return this.mExclusionList;
    }

    public String getHostname() {
        return this.mHostname;
    }

    public String getPacFileUrl() {
        return this.mPacFileUrl;
    }

    public int getPortNumber() {
        return this.mPortNumber;
    }

    public boolean isAuthenticationConfigured() {
        List<AuthConfig> list = this.mAuthConfigList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid() {
        /*
            r3 = this;
            java.lang.String r0 = r3.mPacFileUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = r3.mHostname
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r0 != 0) goto L_0x0012
            if (r1 != 0) goto L_0x0012
            return r2
        L_0x0012:
            boolean r0 = r3.isAuthenticationConfigured()
            if (r0 == 0) goto L_0x0033
            java.util.List<com.samsung.android.knox.net.AuthConfig> r0 = r3.mAuthConfigList
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            com.samsung.android.knox.net.AuthConfig r1 = (com.samsung.android.knox.net.AuthConfig) r1
            if (r1 == 0) goto L_0x0032
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x001e
        L_0x0032:
            return r2
        L_0x0033:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.net.ProxyProperties.isValid():boolean");
    }

    public void readFromParcel(Parcel parcel) {
        this.mHostname = parcel.readString();
        this.mPortNumber = parcel.readInt();
        parcel.readStringList(this.mExclusionList);
        this.mPacFileUrl = parcel.readString();
        parcel.readList(this.mAuthConfigList, AuthConfig.class.getClassLoader());
    }

    public void setAuthConfigList(List<AuthConfig> list) {
        this.mAuthConfigList = list;
    }

    public void setExclusionList(List<String> list) {
        this.mExclusionList = list;
    }

    public void setHostname(String str) {
        this.mHostname = str;
    }

    public void setPacFileUrl(String str) {
        this.mPacFileUrl = str;
    }

    public void setPortNumber(int i) {
        this.mPortNumber = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mHostname);
        parcel.writeInt(this.mPortNumber);
        parcel.writeStringList(this.mExclusionList);
        parcel.writeString(this.mPacFileUrl);
        parcel.writeList(this.mAuthConfigList);
    }

    public ProxyProperties() {
        this.mPortNumber = -1;
        this.mExclusionList = new ArrayList();
        this.mAuthConfigList = new ArrayList();
    }

    private ProxyProperties(Parcel parcel) {
        this.mPortNumber = -1;
        this.mExclusionList = new ArrayList();
        this.mAuthConfigList = new ArrayList();
        readFromParcel(parcel);
    }
}
