package com.samsung.android.knox.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;

public class ExchangeAccount implements Parcelable {
    public static final Parcelable.Creator<ExchangeAccount> CREATOR = new Parcelable.Creator<ExchangeAccount>() {
        public ExchangeAccount createFromParcel(Parcel parcel) {
            return new ExchangeAccount(parcel);
        }

        public ExchangeAccount[] newArray(int i) {
            return new ExchangeAccount[i];
        }
    };
    public static final int SET_SMIME_CERTIFICATE_ALL = 1;
    public static final int SET_SMIME_CERTIFICATE_BY_ECRYPTION = 2;
    public static final int SET_SMIME_CERTIFICATE_BY_ENCRYPTION = 2;
    public static final int SET_SMIME_CERTIFICATE_BY_SIGNING = 3;
    public boolean acceptAllCertificates;
    public String certificateAlias;
    public byte[] certificateData;
    public String certificatePassword;
    public String certificateStorageName;
    public String displayName;
    public String easDomain;
    public String easUser;
    public String emailAddress;
    public boolean emailNotificationVibrateAlways;
    public boolean emailNotificationVibrateWhenSilent;
    public boolean isDefault;
    public boolean isNotify;
    public int offPeak;
    public int peakDays;
    public int peakEndTime;
    public int peakStartTime;
    public int periodCalendar;
    public String protocolVersion;
    public int retrivalSize;
    public int roamingSchedule;
    public String senderName;
    public String serverAddress;
    public String serverPassword;
    public String serverPathPrefix;
    public String signature;
    public int smimeCertificareMode;
    public int smimeCertificateMode;
    public String smimeCertificatePassword;
    public String smimeCertificatePath;
    public int syncCalendar;
    public int syncContacts;
    public int syncInterval;
    public int syncLookback;
    public boolean useSSL;
    public boolean useTLS;

    public ExchangeAccount() {
    }

    public static android.app.enterprise.ExchangeAccount convertToOld(ExchangeAccount exchangeAccount) {
        Class<ExchangeAccount> cls = ExchangeAccount.class;
        if (exchangeAccount == null) {
            return null;
        }
        android.app.enterprise.ExchangeAccount exchangeAccount2 = new android.app.enterprise.ExchangeAccount(exchangeAccount.emailAddress, exchangeAccount.easUser, exchangeAccount.easDomain, exchangeAccount.serverAddress, exchangeAccount.serverPassword);
        exchangeAccount2.mAcceptAllCertificates = exchangeAccount.acceptAllCertificates;
        exchangeAccount2.mCertificate_data = exchangeAccount.certificateData;
        exchangeAccount2.mCertificate_password = exchangeAccount.certificatePassword;
        exchangeAccount2.mDisplayName = exchangeAccount.displayName;
        exchangeAccount2.mEmailNotificationVibrateAlways = exchangeAccount.emailNotificationVibrateAlways;
        exchangeAccount2.mEmailNotificationVibrateWhenSilent = exchangeAccount.emailNotificationVibrateWhenSilent;
        exchangeAccount2.mIsDefault = exchangeAccount.isDefault;
        exchangeAccount2.mIsNotify = exchangeAccount.isNotify;
        exchangeAccount2.mOffPeak = exchangeAccount.offPeak;
        exchangeAccount2.mPeakDays = exchangeAccount.peakDays;
        exchangeAccount2.mPeakEndtime = exchangeAccount.peakEndTime;
        exchangeAccount2.mPeakStarttime = exchangeAccount.peakStartTime;
        exchangeAccount2.mPeriodCalendar = exchangeAccount.periodCalendar;
        exchangeAccount2.mProtocolVersion = exchangeAccount.protocolVersion;
        exchangeAccount2.mRetrivalSize = exchangeAccount.retrivalSize;
        exchangeAccount2.mRoamingSchedule = exchangeAccount.roamingSchedule;
        exchangeAccount2.mSenderName = exchangeAccount.senderName;
        exchangeAccount2.mServerPathPrefix = exchangeAccount.serverPathPrefix;
        exchangeAccount2.mSignature = exchangeAccount.signature;
        exchangeAccount2.mSMIMECertificareMode = exchangeAccount.smimeCertificareMode;
        exchangeAccount2.mSMIMECertificatePassWord = exchangeAccount.smimeCertificatePassword;
        exchangeAccount2.mSMIMECertificatePath = exchangeAccount.smimeCertificatePath;
        exchangeAccount2.mSyncCalendar = exchangeAccount.syncCalendar;
        exchangeAccount2.mSyncContacts = exchangeAccount.syncContacts;
        exchangeAccount2.mSyncInterval = exchangeAccount.syncInterval;
        exchangeAccount2.mSyncLookback = exchangeAccount.syncLookback;
        exchangeAccount2.mUseSSL = exchangeAccount.useSSL;
        exchangeAccount2.mUseTLS = exchangeAccount.useTLS;
        try {
            exchangeAccount2.mCertificate_alias = exchangeAccount.certificateAlias;
        } catch (NoSuchFieldError unused) {
            if (exchangeAccount.certificateAlias != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "certificateAlias", 20));
            }
        }
        try {
            exchangeAccount2.mCertificate_storagename = exchangeAccount.certificateStorageName;
        } catch (NoSuchFieldError unused2) {
            if (exchangeAccount.certificateStorageName != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "certificateStorageName", 20));
            }
        }
        try {
            exchangeAccount2.mSMIMECertificateMode = exchangeAccount.smimeCertificateMode;
        } catch (NoSuchFieldError unused3) {
            if (exchangeAccount.smimeCertificateMode != 0) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "smimeCertificateMode", 20));
            }
        }
        return exchangeAccount2;
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
        this.displayName = parcel.readString();
        this.emailAddress = parcel.readString();
        this.easUser = parcel.readString();
        this.easDomain = parcel.readString();
        this.senderName = parcel.readString();
        this.protocolVersion = parcel.readString();
        this.signature = parcel.readString();
        this.serverAddress = parcel.readString();
        this.serverPassword = parcel.readString();
        this.serverPathPrefix = parcel.readString();
        this.certificatePassword = parcel.readString();
        this.certificateData = parcel.createByteArray();
        this.certificateAlias = parcel.readString();
        this.certificateStorageName = parcel.readString();
        this.syncLookback = parcel.readInt();
        this.syncInterval = parcel.readInt();
        this.peakStartTime = parcel.readInt();
        this.peakEndTime = parcel.readInt();
        this.peakDays = parcel.readInt();
        this.offPeak = parcel.readInt();
        this.roamingSchedule = parcel.readInt();
        this.retrivalSize = parcel.readInt();
        this.periodCalendar = parcel.readInt();
        this.syncContacts = parcel.readInt();
        this.syncCalendar = parcel.readInt();
        boolean z12 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.emailNotificationVibrateAlways = z;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.emailNotificationVibrateWhenSilent = z6;
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.useSSL = z8;
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.useTLS = z9;
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.acceptAllCertificates = z10;
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isDefault = z11;
        if (parcel.readInt() != 0) {
            z12 = true;
        }
        this.isNotify = z12;
        this.smimeCertificareMode = parcel.readInt();
        this.smimeCertificateMode = parcel.readInt();
        this.smimeCertificatePath = parcel.readString();
        this.smimeCertificatePassword = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.displayName);
        parcel.writeString(this.emailAddress);
        parcel.writeString(this.easUser);
        parcel.writeString(this.easDomain);
        parcel.writeString(this.senderName);
        parcel.writeString(this.protocolVersion);
        parcel.writeString(this.signature);
        parcel.writeString(this.serverAddress);
        parcel.writeString(this.serverPassword);
        parcel.writeString(this.serverPathPrefix);
        parcel.writeString(this.certificatePassword);
        parcel.writeByteArray(this.certificateData);
        parcel.writeString(this.certificateAlias);
        parcel.writeString(this.certificateStorageName);
        parcel.writeInt(this.syncLookback);
        parcel.writeInt(this.syncInterval);
        parcel.writeInt(this.peakStartTime);
        parcel.writeInt(this.peakEndTime);
        parcel.writeInt(this.peakDays);
        parcel.writeInt(this.offPeak);
        parcel.writeInt(this.roamingSchedule);
        parcel.writeInt(this.retrivalSize);
        parcel.writeInt(this.periodCalendar);
        parcel.writeInt(this.syncContacts);
        parcel.writeInt(this.syncCalendar);
        parcel.writeInt(this.emailNotificationVibrateAlways ? 1 : 0);
        parcel.writeInt(this.emailNotificationVibrateWhenSilent ? 1 : 0);
        parcel.writeInt(this.useSSL ? 1 : 0);
        parcel.writeInt(this.useTLS ? 1 : 0);
        parcel.writeInt(this.acceptAllCertificates ? 1 : 0);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeInt(this.isNotify ? 1 : 0);
        parcel.writeInt(this.smimeCertificareMode);
        parcel.writeInt(this.smimeCertificateMode);
        parcel.writeString(this.smimeCertificatePath);
        parcel.writeString(this.smimeCertificatePassword);
    }

    public ExchangeAccount(Parcel parcel) {
        readFromParcel(parcel);
    }

    public ExchangeAccount(String str, String str2, String str3, String str4, String str5) {
        this.displayName = null;
        this.emailAddress = str;
        this.easUser = str2;
        this.easDomain = str3;
        this.senderName = null;
        this.protocolVersion = "2.5";
        this.signature = null;
        this.serverAddress = str4;
        this.serverPassword = str5;
        this.serverPathPrefix = null;
        this.certificatePassword = null;
        this.certificateData = null;
        this.certificateAlias = null;
        this.certificateStorageName = null;
        this.syncLookback = 1;
        this.syncInterval = -1;
        this.peakStartTime = 480;
        this.peakEndTime = 1020;
        this.peakDays = 62;
        this.offPeak = -2;
        this.roamingSchedule = 0;
        this.retrivalSize = 3;
        this.periodCalendar = 4;
        this.syncContacts = 1;
        this.syncCalendar = 1;
        this.emailNotificationVibrateAlways = false;
        this.emailNotificationVibrateWhenSilent = false;
        this.useSSL = true;
        this.useTLS = false;
        this.acceptAllCertificates = true;
        this.isDefault = false;
        this.isNotify = true;
        this.smimeCertificatePath = null;
        this.smimeCertificatePassword = null;
        this.smimeCertificareMode = 1;
    }
}
