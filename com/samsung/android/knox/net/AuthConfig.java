package com.samsung.android.knox.net;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class AuthConfig implements Parcelable {
    public static String ANY_HOST = "*";
    public static int ANY_PORT = -1;
    public static final Parcelable.Creator<AuthConfig> CREATOR = new Parcelable.Creator<AuthConfig>() {
        public AuthConfig createFromParcel(Parcel parcel) {
            return new AuthConfig(parcel);
        }

        public AuthConfig[] newArray(int i) {
            return new AuthConfig[i];
        }
    };
    private String mHost;
    private String mPassword;
    private int mPort;
    private String mUsername;

    public static AuthConfig convertToNew(com.sec.enterprise.network.AuthConfig authConfig) {
        if (authConfig != null) {
            return new AuthConfig(authConfig.getHost(), authConfig.getPort(), authConfig.getUsername(), authConfig.getPassword());
        }
        return null;
    }

    public static List<AuthConfig> convertToNewList(List<com.sec.enterprise.network.AuthConfig> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.sec.enterprise.network.AuthConfig convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static com.sec.enterprise.network.AuthConfig convertToOld(AuthConfig authConfig) {
        if (authConfig == null) {
            return null;
        }
        try {
            return new com.sec.enterprise.network.AuthConfig(authConfig.getHost(), authConfig.getPort(), authConfig.getUsername(), authConfig.getPassword());
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(AuthConfig.class, 20));
        }
    }

    public static List<com.sec.enterprise.network.AuthConfig> convertToOldList(List<AuthConfig> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (AuthConfig convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthConfig authConfig = (AuthConfig) obj;
        String str = this.mHost;
        if (str == null) {
            if (authConfig.mHost != null) {
                return false;
            }
        } else if (!str.equals(authConfig.mHost)) {
            return false;
        }
        String str2 = this.mPassword;
        if (str2 == null) {
            if (authConfig.mPassword != null) {
                return false;
            }
        } else if (!str2.equals(authConfig.mPassword)) {
            return false;
        }
        if (this.mPort != authConfig.mPort) {
            return false;
        }
        String str3 = this.mUsername;
        if (str3 == null) {
            if (authConfig.mUsername != null) {
                return false;
            }
        } else if (!str3.equals(authConfig.mUsername)) {
            return false;
        }
        return true;
    }

    public String getHost() {
        return this.mHost;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public int getPort() {
        return this.mPort;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public int hashCode() {
        int i;
        int i8;
        String str = this.mHost;
        int i9 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i10 = (i + 31) * 31;
        String str2 = this.mPassword;
        if (str2 == null) {
            i8 = 0;
        } else {
            i8 = str2.hashCode();
        }
        int i11 = (((i10 + i8) * 31) + this.mPort) * 31;
        String str3 = this.mUsername;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.mHost) || TextUtils.isEmpty(this.mUsername) || TextUtils.isEmpty(this.mPassword)) {
            return false;
        }
        if ((!ANY_HOST.equals(this.mHost) || ANY_PORT == this.mPort) && (ANY_HOST.equals(this.mHost) || ANY_PORT != this.mPort)) {
            return true;
        }
        return false;
    }

    public void readFromParcel(Parcel parcel) {
        this.mUsername = parcel.readString();
        this.mPassword = parcel.readString();
        this.mHost = parcel.readString();
        this.mPort = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUsername);
        parcel.writeString(this.mPassword);
        parcel.writeString(this.mHost);
        parcel.writeInt(this.mPort);
    }

    public AuthConfig(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Username and password cannot be null");
        }
        this.mUsername = str;
        this.mPassword = str2;
        this.mHost = ANY_HOST;
        this.mPort = ANY_PORT;
    }

    public AuthConfig(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Host, username and password cannot be null");
        }
        this.mUsername = str2;
        this.mPassword = str3;
        this.mHost = str;
        this.mPort = i;
    }

    private AuthConfig(Parcel parcel) {
        readFromParcel(parcel);
    }
}
