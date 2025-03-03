package com.samsung.android.knox.keystore;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class PermissionApplicationPrivateKey implements Parcelable {
    public static final Parcelable.Creator<PermissionApplicationPrivateKey> CREATOR = new Parcelable.Creator<PermissionApplicationPrivateKey>() {
        public PermissionApplicationPrivateKey createFromParcel(Parcel parcel) {
            return new PermissionApplicationPrivateKey(parcel);
        }

        public PermissionApplicationPrivateKey[] newArray(int i) {
            return new PermissionApplicationPrivateKey[i];
        }
    };
    private String mAdminPkgName;
    private String mAlias;
    private String mHost;
    private String mPackageName;
    private int mPort;
    private String mStorageName;

    private static PermissionApplicationPrivateKey convertToNew(com.sec.enterprise.knox.certificate.PermissionApplicationPrivateKey permissionApplicationPrivateKey) {
        PermissionApplicationPrivateKey permissionApplicationPrivateKey2;
        if (permissionApplicationPrivateKey == null) {
            return null;
        }
        try {
            permissionApplicationPrivateKey2 = new PermissionApplicationPrivateKey(permissionApplicationPrivateKey.getPackageName(), permissionApplicationPrivateKey.getHost(), permissionApplicationPrivateKey.getPort(), permissionApplicationPrivateKey.getAlias(), permissionApplicationPrivateKey.getStorageName());
        } catch (NoSuchMethodError unused) {
            permissionApplicationPrivateKey2 = new PermissionApplicationPrivateKey(permissionApplicationPrivateKey.getPackageName(), permissionApplicationPrivateKey.getHost(), permissionApplicationPrivateKey.getPort(), permissionApplicationPrivateKey.getAlias());
        }
        permissionApplicationPrivateKey2.setAdminPkgName(permissionApplicationPrivateKey.getAdminPkgName());
        return permissionApplicationPrivateKey2;
    }

    public static List<PermissionApplicationPrivateKey> convertToNewList(List<com.sec.enterprise.knox.certificate.PermissionApplicationPrivateKey> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.sec.enterprise.knox.certificate.PermissionApplicationPrivateKey convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static com.sec.enterprise.knox.certificate.PermissionApplicationPrivateKey convertToOld(PermissionApplicationPrivateKey permissionApplicationPrivateKey) {
        if (permissionApplicationPrivateKey == null) {
            return null;
        }
        try {
            return new com.sec.enterprise.knox.certificate.PermissionApplicationPrivateKey(permissionApplicationPrivateKey.getPackageName(), permissionApplicationPrivateKey.getHost(), permissionApplicationPrivateKey.getPort(), permissionApplicationPrivateKey.getAlias(), permissionApplicationPrivateKey.getStorageName());
        } catch (NoSuchMethodError unused) {
            if (permissionApplicationPrivateKey.getStorageName() == null) {
                return new com.sec.enterprise.knox.certificate.PermissionApplicationPrivateKey(permissionApplicationPrivateKey.getPackageName(), permissionApplicationPrivateKey.getHost(), permissionApplicationPrivateKey.getPort(), permissionApplicationPrivateKey.getAlias());
            }
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(PermissionApplicationPrivateKey.class, "PermissionApplicationPrivateKey", new Class[]{cls, cls, Integer.TYPE, cls, cls}, 19));
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getAdminPkgName() {
        return this.mAdminPkgName;
    }

    public String getAlias() {
        return this.mAlias;
    }

    public String getHost() {
        return this.mHost;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public int getPort() {
        return this.mPort;
    }

    public String getStorageName() {
        return this.mStorageName;
    }

    public void readFromParcel(Parcel parcel) {
        this.mAdminPkgName = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mHost = parcel.readString();
        this.mPort = parcel.readInt();
        this.mAlias = parcel.readString();
        this.mStorageName = parcel.readString();
    }

    public void setAdminPkgName(String str) {
        this.mAdminPkgName = str;
    }

    public String toString() {
        return "PermissionApplicationPrivateKey\nmAdminPackageName: " + this.mAdminPkgName + "\nmPackageName: " + this.mPackageName + "\nmHost: " + this.mHost + "\nmPort: " + this.mPort + "\nmAlias: " + this.mAlias + "\nmStorageName: " + this.mStorageName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAdminPkgName);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mHost);
        parcel.writeInt(this.mPort);
        parcel.writeString(this.mAlias);
        parcel.writeString(this.mStorageName);
    }

    public PermissionApplicationPrivateKey(String str, String str2, int i, String str3) {
        this(str, str2, i, str3, (String) null);
    }

    public PermissionApplicationPrivateKey(String str, String str2, int i, String str3, String str4) {
        this.mAdminPkgName = null;
        this.mPackageName = str;
        this.mHost = str2;
        this.mPort = i;
        this.mAlias = str3;
        this.mStorageName = str4;
    }

    private PermissionApplicationPrivateKey(Parcel parcel) {
        this.mAdminPkgName = null;
        this.mPackageName = null;
        this.mHost = null;
        this.mPort = -1;
        this.mAlias = null;
        this.mStorageName = null;
        readFromParcel(parcel);
    }
}
