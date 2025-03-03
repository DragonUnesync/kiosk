package com.samsung.android.knox.accounts;

import com.samsung.android.knox.SupportLibUtils;

public class ExchangeAccountPolicy {
    public static final String ACTION_CBA_INSTALL_STATUS = "com.samsung.android.knox.intent.action.CBA_INSTALL_STATUS";
    public static final String ACTION_ENFORCE_SMIME_ALIAS_RESULT = "com.samsung.android.knox.intent.action.ENFORCE_SMIME_ALIAS_RESULT";
    public static final String ACTION_EXCHANGE_ACCOUNT_ADD_RESULT = "com.samsung.android.knox.intent.action.EXCHANGE_ACCOUNT_ADD_RESULT";
    public static final String ACTION_EXCHANGE_ACCOUNT_DELETE_RESULT = "com.samsung.android.knox.intent.action.EXCHANGE_ACCOUNT_DELETE_RESULT";
    public static final String EXTRA_ACCOUNT_ID = "com.samsung.android.knox.intent.extra.ACCOUNT_ID";
    public static final String EXTRA_EMAIL_ADDRESS = "com.samsung.android.knox.intent.extra.EMAIL_ADDRESS";
    public static final String EXTRA_ENFORCE_SMIME_ALIAS_TYPE = "com.samsung.android.knox.intent.extra.ENFORCE_SMIME_ALIAS_TYPE";
    public static final String EXTRA_RESULT = "com.samsung.android.knox.intent.extra.RESULT";
    public static final String EXTRA_SERVER_ADDRESS = "com.samsung.android.knox.intent.extra.SERVER_ADDRESS";
    public static final String EXTRA_SMIME_RESULT = "com.samsung.android.knox.intent.extra.SMIME_RESULT";
    public static final String EXTRA_STATUS = "com.samsung.android.knox.intent.extra.STATUS";
    private android.app.enterprise.ExchangeAccountPolicy mExchangeAccountPolicy;

    public ExchangeAccountPolicy(android.app.enterprise.ExchangeAccountPolicy exchangeAccountPolicy) {
        this.mExchangeAccountPolicy = exchangeAccountPolicy;
    }

    public long addNewAccount(ExchangeAccount exchangeAccount) {
        try {
            return this.mExchangeAccountPolicy.addNewAccount(ExchangeAccount.convertToOld(exchangeAccount));
        } catch (NoSuchFieldError e) {
            throw new NoSuchFieldError(e.getMessage());
        }
    }

    public boolean allowInComingAttachments(boolean z, long j7) {
        return this.mExchangeAccountPolicy.allowInComingAttachments(z, j7);
    }

    public boolean deleteAccount(long j7) {
        return this.mExchangeAccountPolicy.deleteAccount(j7);
    }

    public Account getAccountDetails(long j7) {
        return Account.convertToNew(this.mExchangeAccountPolicy.getAccountDetails(j7));
    }

    public long getAccountId(String str, String str2, String str3) {
        return this.mExchangeAccountPolicy.getAccountId(str, str2, str3);
    }

    public Account[] getAllEASAccounts() {
        return Account.convertToNewArray(this.mExchangeAccountPolicy.getAllEASAccounts());
    }

    public String getDeviceId() {
        return this.mExchangeAccountPolicy.getDeviceId();
    }

    public int getIncomingAttachmentsSize(long j7) {
        return this.mExchangeAccountPolicy.getIncomingAttachmentsSize(j7);
    }

    public int getMaxCalendarAgeFilter(long j7) {
        return this.mExchangeAccountPolicy.getMaxCalendarAgeFilter(j7);
    }

    public int getMaxEmailAgeFilter(long j7) {
        return this.mExchangeAccountPolicy.getMaxEmailAgeFilter(j7);
    }

    public int getMaxEmailBodyTruncationSize(long j7) {
        return this.mExchangeAccountPolicy.getMaxEmailBodyTruncationSize(j7);
    }

    public int getMaxEmailHTMLBodyTruncationSize(long j7) {
        return this.mExchangeAccountPolicy.getMaxEmailHTMLBodyTruncationSize(j7);
    }

    public boolean getRequireEncryptedSMIMEMessages(long j7) {
        return this.mExchangeAccountPolicy.getRequireEncryptedSMIMEMessages(j7);
    }

    public boolean getRequireSignedSMIMEMessages(long j7) {
        return this.mExchangeAccountPolicy.getRequireSignedSMIMEMessages(j7);
    }

    public String getSMIMECertificateAlias(long j7, int i) {
        try {
            return this.mExchangeAccountPolicy.getSMIMECertificateAlias(j7, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ExchangeAccountPolicy.class, "getSMIMECertificateAlias", new Class[]{Long.TYPE, Integer.TYPE}, 15));
        }
    }

    public boolean isIncomingAttachmentsAllowed(long j7) {
        return this.mExchangeAccountPolicy.isIncomingAttachmentsAllowed(j7);
    }

    public void removePendingAccount(String str, String str2, String str3, String str4) {
        this.mExchangeAccountPolicy.removePendingAccount(str, str2, str3, str4);
    }

    public void sendAccountsChangedBroadcast() {
        this.mExchangeAccountPolicy.sendAccountsChangedBroadcast();
    }

    public boolean setAcceptAllCertificates(boolean z, long j7) {
        return this.mExchangeAccountPolicy.setAcceptAllCertificates(z, j7);
    }

    public long setAccountBaseParameters(String str, String str2, String str3, String str4, long j7) {
        return this.mExchangeAccountPolicy.setAccountBaseParameters(str, str2, str3, str4, j7);
    }

    public boolean setAccountName(String str, long j7) {
        return this.mExchangeAccountPolicy.setAccountName(str, j7);
    }

    public boolean setAlwaysVibrateOnEmailNotification(boolean z, long j7) {
        return this.mExchangeAccountPolicy.setAlwaysVibrateOnEmailNotification(z, j7);
    }

    public boolean setAsDefaultAccount(long j7) {
        return this.mExchangeAccountPolicy.setAsDefaultAccount(j7);
    }

    public void setClientAuthCert(byte[] bArr, String str, long j7) {
        this.mExchangeAccountPolicy.setClientAuthCert(bArr, str, j7);
    }

    public boolean setDataSyncs(boolean z, boolean z6, boolean z8, boolean z9, long j7) {
        return this.mExchangeAccountPolicy.setDataSyncs(z, z6, z8, z9, j7);
    }

    public boolean setForceSMIMECertificateAlias(long j7, String str, int i) {
        try {
            return this.mExchangeAccountPolicy.setForceSMIMECertificateAlias(j7, str, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ExchangeAccountPolicy.class, "setForceSMIMECertificateAlias", new Class[]{Long.TYPE, String.class, Integer.TYPE}, 15));
        }
    }

    public boolean setIncomingAttachmentsSize(int i, long j7) {
        return this.mExchangeAccountPolicy.setIncomingAttachmentsSize(i, j7);
    }

    public boolean setMaxCalendarAgeFilter(int i, long j7) {
        return this.mExchangeAccountPolicy.setMaxCalendarAgeFilter(i, j7);
    }

    public boolean setMaxEmailAgeFilter(int i, long j7) {
        return this.mExchangeAccountPolicy.setMaxEmailAgeFilter(i, j7);
    }

    public boolean setMaxEmailBodyTruncationSize(int i, long j7) {
        return this.mExchangeAccountPolicy.setMaxEmailBodyTruncationSize(i, j7);
    }

    public boolean setMaxEmailHTMLBodyTruncationSize(int i, long j7) {
        return this.mExchangeAccountPolicy.setMaxEmailHTMLBodyTruncationSize(i, j7);
    }

    public boolean setPassword(String str, long j7) {
        return this.mExchangeAccountPolicy.setPassword(str, j7);
    }

    public boolean setPastDaysToSync(int i, long j7) {
        return this.mExchangeAccountPolicy.setPastDaysToSync(i, j7);
    }

    public boolean setRequireEncryptedSMIMEMessages(long j7, boolean z) {
        return this.mExchangeAccountPolicy.setRequireEncryptedSMIMEMessages(j7, z);
    }

    public boolean setRequireSignedSMIMEMessages(long j7, boolean z) {
        return this.mExchangeAccountPolicy.setRequireSignedSMIMEMessages(j7, z);
    }

    public boolean setSSL(boolean z, long j7) {
        return this.mExchangeAccountPolicy.setSSL(z, j7);
    }

    public boolean setSignature(String str, long j7) {
        return this.mExchangeAccountPolicy.setSignature(str, j7);
    }

    public boolean setSyncPeakTimings(int i, int i8, int i9, long j7) {
        return this.mExchangeAccountPolicy.setSyncPeakTimings(i, i8, i9, j7);
    }

    public boolean setSyncSchedules(int i, int i8, int i9, long j7) {
        return this.mExchangeAccountPolicy.setSyncSchedules(i, i8, i9, j7);
    }

    public boolean setForceSMIMECertificateAlias(long j7, String str, String str2, int i) {
        try {
            return this.mExchangeAccountPolicy.setForceSMIMECertificateAlias(j7, str, str2, i);
        } catch (NoSuchMethodError unused) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ExchangeAccountPolicy.class, "setForceSMIMECertificateAlias", new Class[]{Long.TYPE, cls, cls, Integer.TYPE}, 19));
        }
    }
}
