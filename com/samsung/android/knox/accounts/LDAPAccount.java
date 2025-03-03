package com.samsung.android.knox.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class LDAPAccount implements Parcelable {
    public static final Parcelable.Creator<LDAPAccount> CREATOR = new Parcelable.Creator<LDAPAccount>() {
        public LDAPAccount createFromParcel(Parcel parcel) {
            return new LDAPAccount(parcel);
        }

        public LDAPAccount[] newArray(int i) {
            return new LDAPAccount[i];
        }
    };
    public String baseDN;
    public String host;
    public long id;
    public boolean isAnonymous;
    public boolean isSSL;
    public String password;
    public int port;
    public int trustAll;
    public String userName;

    public static LDAPAccount convertToNew(android.app.enterprise.LDAPAccount lDAPAccount) {
        if (lDAPAccount == null) {
            return null;
        }
        LDAPAccount lDAPAccount2 = new LDAPAccount();
        lDAPAccount2.id = lDAPAccount.id;
        lDAPAccount2.userName = lDAPAccount.userName;
        lDAPAccount2.password = lDAPAccount.password;
        lDAPAccount2.port = lDAPAccount.port;
        lDAPAccount2.host = lDAPAccount.host;
        lDAPAccount2.isSSL = lDAPAccount.isSSL;
        lDAPAccount2.isAnonymous = lDAPAccount.isAnonymous;
        lDAPAccount2.baseDN = lDAPAccount.baseDN;
        return lDAPAccount2;
    }

    public static List<LDAPAccount> convertToNewList(List<android.app.enterprise.LDAPAccount> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.LDAPAccount convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static android.app.enterprise.LDAPAccount convertToOld(LDAPAccount lDAPAccount) {
        if (lDAPAccount == null) {
            return null;
        }
        android.app.enterprise.LDAPAccount lDAPAccount2 = new android.app.enterprise.LDAPAccount();
        lDAPAccount2.id = lDAPAccount.id;
        lDAPAccount2.userName = lDAPAccount.userName;
        lDAPAccount2.password = lDAPAccount.password;
        lDAPAccount2.port = lDAPAccount.port;
        lDAPAccount2.host = lDAPAccount.host;
        lDAPAccount2.isSSL = lDAPAccount.isSSL;
        lDAPAccount2.isAnonymous = lDAPAccount.isAnonymous;
        lDAPAccount2.baseDN = lDAPAccount.baseDN;
        return lDAPAccount2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        this.id = parcel.readLong();
        this.userName = parcel.readString();
        this.password = parcel.readString();
        this.port = parcel.readInt();
        this.host = parcel.readString();
        boolean z6 = false;
        if (parcel.readInt() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSSL = z;
        if (parcel.readInt() == 0) {
            z6 = true;
        }
        this.isAnonymous = z6;
        this.baseDN = parcel.readString();
        this.trustAll = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.userName);
        parcel.writeString(this.password);
        parcel.writeInt(this.port);
        parcel.writeString(this.host);
        parcel.writeInt(this.isSSL ^ true ? 1 : 0);
        parcel.writeInt(this.isAnonymous ^ true ? 1 : 0);
        parcel.writeString(this.baseDN);
        parcel.writeInt(this.trustAll);
    }

    private LDAPAccount(Parcel parcel) {
        readFromParcel(parcel);
    }

    public LDAPAccount() {
    }
}
