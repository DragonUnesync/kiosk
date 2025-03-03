package com.samsung.android.knox.accounts;

import android.os.Parcel;
import android.os.Parcelable;

public class EmailAccount implements Parcelable {
    public static final Parcelable.Creator<EmailAccount> CREATOR = new Parcelable.Creator<EmailAccount>() {
        public EmailAccount createFromParcel(Parcel parcel) {
            return new EmailAccount(parcel);
        }

        public EmailAccount[] newArray(int i) {
            return new EmailAccount[i];
        }
    };
    public String emailAddress;
    public String incomingProtocol;
    public boolean incomingServerAcceptAllCertificates;
    public String incomingServerAddress;
    public String incomingServerLogin;
    public String incomingServerPassword;
    public int incomingServerPort;
    public boolean incomingServerUseSSL;
    public boolean incomingServerUseTLS;
    public boolean isNotify;
    public String outgoingProtocol;
    public boolean outgoingServerAcceptAllCertificates;
    public String outgoingServerAddress;
    public String outgoingServerLogin;
    public String outgoingServerPassword;
    public int outgoingServerPort;
    public boolean outgoingServerUseSSL;
    public boolean outgoingServerUseTLS;
    public String signature;

    public EmailAccount() {
    }

    public static android.app.enterprise.EmailAccount convertToOld(EmailAccount emailAccount) {
        if (emailAccount == null) {
            return null;
        }
        android.app.enterprise.EmailAccount emailAccount2 = new android.app.enterprise.EmailAccount();
        emailAccount2.mEmailAddress = emailAccount.emailAddress;
        emailAccount2.mInComingProtocol = emailAccount.incomingProtocol;
        emailAccount2.mInComingServerAddress = emailAccount.incomingServerAddress;
        emailAccount2.mInComingServerLogin = emailAccount.incomingServerLogin;
        emailAccount2.mInComingServerPassword = emailAccount.incomingServerPassword;
        emailAccount2.mInComingServerAcceptAllCertificates = emailAccount.incomingServerAcceptAllCertificates;
        emailAccount2.mInComingServerPort = emailAccount.incomingServerPort;
        emailAccount2.mInComingServerUseSSL = emailAccount.incomingServerUseSSL;
        emailAccount2.mInComingServerUseTLS = emailAccount.incomingServerUseTLS;
        emailAccount2.mOutGoingProtocol = emailAccount.outgoingProtocol;
        emailAccount2.mOutGoingServerAcceptAllCertificates = emailAccount.outgoingServerAcceptAllCertificates;
        emailAccount2.mOutGoingServerAddress = emailAccount.outgoingServerAddress;
        emailAccount2.mOutGoingServerLogin = emailAccount.outgoingServerLogin;
        emailAccount2.mOutGoingServerPassword = emailAccount.outgoingServerPassword;
        emailAccount2.mOutGoingServerPort = emailAccount.outgoingServerPort;
        emailAccount2.mOutGoingServerUseSSL = emailAccount.outgoingServerUseSSL;
        emailAccount2.mOutGoingServerUseTLS = emailAccount.outgoingServerUseTLS;
        emailAccount2.mIsNotify = emailAccount.isNotify;
        emailAccount2.mSignature = emailAccount.signature;
        return emailAccount2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.emailAddress = parcel.readString();
        this.incomingProtocol = parcel.readString();
        this.incomingServerAddress = parcel.readString();
        this.incomingServerLogin = parcel.readString();
        this.incomingServerPassword = parcel.readString();
        this.outgoingProtocol = parcel.readString();
        this.outgoingServerAddress = parcel.readString();
        this.outgoingServerLogin = parcel.readString();
        this.outgoingServerPassword = parcel.readString();
        this.signature = parcel.readString();
        this.incomingServerPort = parcel.readInt();
        this.outgoingServerPort = parcel.readInt();
        boolean z12 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.outgoingServerUseSSL = z;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.outgoingServerUseTLS = z6;
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.outgoingServerAcceptAllCertificates = z8;
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.incomingServerUseSSL = z9;
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.incomingServerUseTLS = z10;
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.incomingServerAcceptAllCertificates = z11;
        if (parcel.readInt() != 0) {
            z12 = true;
        }
        this.isNotify = z12;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.emailAddress);
        parcel.writeString(this.incomingProtocol);
        parcel.writeString(this.incomingServerAddress);
        parcel.writeString(this.incomingServerLogin);
        parcel.writeString(this.incomingServerPassword);
        parcel.writeString(this.outgoingProtocol);
        parcel.writeString(this.outgoingServerAddress);
        parcel.writeString(this.outgoingServerLogin);
        parcel.writeString(this.outgoingServerPassword);
        parcel.writeString(this.signature);
        parcel.writeInt(this.incomingServerPort);
        parcel.writeInt(this.outgoingServerPort);
        parcel.writeInt(this.outgoingServerUseSSL ? 1 : 0);
        parcel.writeInt(this.outgoingServerUseTLS ? 1 : 0);
        parcel.writeInt(this.outgoingServerAcceptAllCertificates ? 1 : 0);
        parcel.writeInt(this.incomingServerUseSSL ? 1 : 0);
        parcel.writeInt(this.incomingServerUseTLS ? 1 : 0);
        parcel.writeInt(this.incomingServerAcceptAllCertificates ? 1 : 0);
        parcel.writeInt(this.isNotify ? 1 : 0);
    }

    public EmailAccount(Parcel parcel) {
        readFromParcel(parcel);
    }

    public EmailAccount(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i8, String str8, String str9) {
        this.emailAddress = str;
        this.incomingProtocol = str2;
        this.incomingServerAddress = str3;
        this.incomingServerLogin = str4;
        this.incomingServerPassword = str5;
        this.outgoingProtocol = str6;
        this.outgoingServerAddress = str7;
        this.outgoingServerLogin = str8;
        this.outgoingServerPassword = str9;
        this.signature = "Send from SamsungMobile";
        this.incomingServerPort = i;
        this.outgoingServerPort = i8;
        this.outgoingServerUseSSL = true;
        this.outgoingServerUseTLS = false;
        this.outgoingServerAcceptAllCertificates = false;
        this.incomingServerUseSSL = true;
        this.incomingServerUseTLS = false;
        this.incomingServerAcceptAllCertificates = false;
        this.isNotify = true;
    }
}
