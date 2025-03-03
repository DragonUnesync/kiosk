package com.samsung.android.knox.accounts;

import android.os.Parcel;
import android.os.Parcelable;

public class HostAuth implements Parcelable {
    public static final String ACCOUNT_KEY = "accountKey";
    public static final String ADDRESS = "address";
    public static final Parcelable.Creator<HostAuth> CREATOR = new Parcelable.Creator<HostAuth>() {
        public HostAuth createFromParcel(Parcel parcel) {
            return new HostAuth(parcel);
        }

        public HostAuth[] newArray(int i) {
            return new HostAuth[i];
        }
    };
    public static final String DOMAIN = "domain";
    public static final String FLAGS = "flags";
    public static final int FLAGS_ACCEPT_ALL_CERT = 8;
    public static final int FLAGS_USE_SSL = 1;
    public static final int FLAGS_USE_TLS = 2;
    public static final String ID = "_id";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";
    public static final String PORT = "port";
    public static final String PROTOCOL = "protocol";
    public boolean acceptAllCertificates;
    public long accountKey;
    public String address;
    public String domain;
    public int flags;
    public int id;
    public String login;
    public String password;
    public int port;
    public String protocol;
    public boolean useSSL;
    public boolean useTLS;

    public static HostAuth convertToNew(android.app.enterprise.HostAuth hostAuth) {
        if (hostAuth == null) {
            return null;
        }
        HostAuth hostAuth2 = new HostAuth();
        hostAuth2.id = hostAuth.mId;
        hostAuth2.protocol = hostAuth.mProtocol;
        hostAuth2.address = hostAuth.mAddress;
        hostAuth2.port = hostAuth.mPort;
        hostAuth2.useSSL = hostAuth.mUseSSL;
        hostAuth2.useTLS = hostAuth.mUseTLS;
        hostAuth2.acceptAllCertificates = hostAuth.mAcceptAllCertificates;
        hostAuth2.login = hostAuth.mLogin;
        hostAuth2.password = hostAuth.mPassword;
        hostAuth2.domain = hostAuth.mDomain;
        return hostAuth2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z6;
        this.id = parcel.readInt();
        this.protocol = parcel.readString();
        this.address = parcel.readString();
        this.port = parcel.readInt();
        this.flags = parcel.readInt();
        boolean z8 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useSSL = z;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.useTLS = z6;
        if (parcel.readInt() != 0) {
            z8 = true;
        }
        this.acceptAllCertificates = z8;
        this.login = parcel.readString();
        this.password = parcel.readString();
        this.domain = parcel.readString();
        this.accountKey = parcel.readLong();
    }

    public String toString() {
        return "_id=" + this.id + " protocol=" + this.protocol + " address=" + this.address + " port=" + this.port + " usessl = " + this.useSSL + " usetls = " + this.useTLS + " acceptallcertificate = " + this.acceptAllCertificates + " login=" + this.login + " password= **** domain=" + this.domain + " accountKey=" + this.accountKey;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.protocol);
        parcel.writeString(this.address);
        parcel.writeInt(this.port);
        parcel.writeInt(this.flags);
        parcel.writeInt(this.useSSL ? 1 : 0);
        parcel.writeInt(this.useTLS ? 1 : 0);
        parcel.writeInt(this.acceptAllCertificates ? 1 : 0);
        parcel.writeString(this.login);
        parcel.writeString(this.password);
        parcel.writeString(this.domain);
        parcel.writeLong(this.accountKey);
    }

    public HostAuth() {
        this.useSSL = false;
        this.useTLS = false;
        this.acceptAllCertificates = false;
    }

    private HostAuth(Parcel parcel) {
        this.useSSL = false;
        this.useTLS = false;
        this.acceptAllCertificates = false;
        readFromParcel(parcel);
    }
}
