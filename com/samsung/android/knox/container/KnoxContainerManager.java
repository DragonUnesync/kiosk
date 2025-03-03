package com.samsung.android.knox.container;

import android.app.enterprise.BasePasswordPolicy;
import android.app.enterprise.MiscPolicy;
import android.app.enterprise.SecurityPolicy;
import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.accounts.DeviceAccountPolicy;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.EmailPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.browser.BrowserPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.devicesecurity.PasswordPolicy;
import com.samsung.android.knox.dlp.DLPManagerPolicy;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import com.samsung.android.knox.keystore.ClientCertificateManager;
import com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.location.LocationPolicy;
import com.samsung.android.knox.lockscreen.BootBanner;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.billing.EnterpriseBillingPolicy;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.wifi.WifiPolicy;
import com.samsung.android.knox.restriction.AdvancedRestrictionPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import com.sec.enterprise.knox.container.ContainerConfigurationPolicy;
import com.sec.enterprise.knox.container.RCPPolicy;
import java.util.List;

public class KnoxContainerManager {
    public static final String ACTION_CONTAINER_ADMIN_LOCK = "com.samsung.android.knox.intent.action.CONTAINER_ADMIN_LOCK";
    public static final String ACTION_CONTAINER_CREATION_STATUS = "com.samsung.android.knox.intent.action.CONTAINER_CREATION_STATUS";
    public static final String ACTION_CONTAINER_REMOVED = "com.samsung.android.knox.intent.action.CONTAINER_REMOVED";
    public static final String ACTION_CONTAINER_STATE_CHANGED = "com.samsung.android.knox.intent.action.CONTAINER_STATE_CHANGED";
    public static final String CONTAINER_CREATION_REQUEST_ID = "requestId";
    public static final String CONTAINER_CREATION_STATUS_CODE = "code";
    public static final String CONTAINER_ID = "containerid";
    public static final String CONTAINER_NEW_STATE = "container_new_state";
    public static final String CONTAINER_OLD_STATE = "container_old_state";
    public static final int ERROR_INTERNAL_ERROR = -1014;
    public static final String INTENT_BUNDLE = "intent";
    private static final String TAG = "KnoxContainerManager-SupportLib";
    private volatile AdvancedRestrictionPolicy mAdvancedRestrictionPolicy;
    private volatile ApplicationPolicy mApplicationPolicy;
    private volatile AuditLog mAuditLogPolicy;
    private volatile BasePasswordPolicy mBasePasswordPolicy;
    private volatile BootBanner mBootBanner;
    private volatile BrowserPolicy mBrowserPolicy;
    private volatile CertificatePolicy mCertificatePolicy;
    private volatile CertificateProvisioning mCertificateProvisioning;
    private volatile ClientCertificateManager mClientCertificateManager;
    private volatile ContainerConfigurationPolicy mContainerConfigurationPolicy;
    private Context mContext;
    private volatile DLPManagerPolicy mDLPManagerPolicy;
    private volatile DateTimePolicy mDateTimePolicy;
    private volatile DeviceAccountPolicy mDeviceAccountPolicy;
    private volatile ExchangeAccountPolicy mEasAccountPolicy;
    private volatile EmailAccountPolicy mEmailAccountPolicy;
    private volatile EmailPolicy mEmailPolicy;
    private volatile EnterpriseBillingPolicy mEnterpriseBillingPolicy;
    private volatile EnterpriseCertEnrollPolicy mEnterpriseCertEnrollPolicy;
    private volatile Firewall mFirewall;
    private volatile Geofencing mGeofencing;
    private volatile KioskMode mKioskMode;
    private com.sec.enterprise.knox.container.KnoxContainerManager mKnoxContainerManager;
    private volatile LDAPAccountPolicy mLDAPAccountPolicy;
    private volatile LocationPolicy mLocationPolicy;
    private volatile PasswordPolicy mPasswordPolicy;
    private volatile RCPPolicy mRCPPolicy = null;
    private volatile RestrictionPolicy mRestrictionPolicy;
    private volatile WifiPolicy mWifiPolicy;

    public KnoxContainerManager(Context context, com.sec.enterprise.knox.container.KnoxContainerManager knoxContainerManager) {
        this.mContext = context;
        this.mKnoxContainerManager = knoxContainerManager;
    }

    public static boolean addConfigurationType(Context context, KnoxConfigurationType knoxConfigurationType) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.addConfigurationType(context, KnoxConfigurationType.convertToOld(knoxConfigurationType));
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return false;
        }
    }

    public static int createContainer(String str, String str2) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.createContainer(str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return ERROR_INTERNAL_ERROR;
        }
    }

    public static void doSelfUninstall() {
        try {
            com.sec.enterprise.knox.container.KnoxContainerManager.doSelfUninstall();
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public static KnoxConfigurationType getConfigurationType(int i) {
        try {
            return KnoxConfigurationType.convertToNew(com.sec.enterprise.knox.container.KnoxContainerManager.getConfigurationType(i));
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static KnoxConfigurationType getConfigurationTypeByName(String str) {
        try {
            return KnoxConfigurationType.convertToNew(com.sec.enterprise.knox.container.KnoxContainerManager.getConfigurationTypeByName(str));
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static List<KnoxConfigurationType> getConfigurationTypes() {
        try {
            return KnoxConfigurationType.convertToNewList(com.sec.enterprise.knox.container.KnoxContainerManager.getConfigurationTypes());
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static List<Integer> getContainers() {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.getContainers();
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static boolean removeConfigurationType(String str) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.removeConfigurationType(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "removeConfigurationType", new Class[]{String.class}, 13));
        } catch (NoClassDefFoundError unused2) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return false;
        }
    }

    public static int removeContainer(int i) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.removeContainer(i);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return ERROR_INTERNAL_ERROR;
        }
    }

    public AdvancedRestrictionPolicy getAdvancedRestrictionPolicy() {
        com.sec.enterprise.knox.AdvancedRestrictionPolicy advancedRestrictionPolicy;
        AdvancedRestrictionPolicy advancedRestrictionPolicy2 = this.mAdvancedRestrictionPolicy;
        if (advancedRestrictionPolicy2 == null) {
            synchronized (this) {
                try {
                    advancedRestrictionPolicy2 = this.mAdvancedRestrictionPolicy;
                    if (advancedRestrictionPolicy2 == null && (advancedRestrictionPolicy = this.mKnoxContainerManager.getAdvancedRestrictionPolicy()) != null) {
                        advancedRestrictionPolicy2 = new AdvancedRestrictionPolicy(advancedRestrictionPolicy);
                        this.mAdvancedRestrictionPolicy = advancedRestrictionPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return advancedRestrictionPolicy2;
    }

    public ApplicationPolicy getApplicationPolicy() {
        ApplicationPolicy applicationPolicy = this.mApplicationPolicy;
        if (applicationPolicy == null) {
            synchronized (this) {
                try {
                    applicationPolicy = this.mApplicationPolicy;
                    if (applicationPolicy == null) {
                        android.app.enterprise.ApplicationPolicy applicationPolicy2 = this.mKnoxContainerManager.getApplicationPolicy();
                        com.sec.enterprise.knox.AdvancedRestrictionPolicy advancedRestrictionPolicy = this.mKnoxContainerManager.getAdvancedRestrictionPolicy();
                        if (!(applicationPolicy2 == null || advancedRestrictionPolicy == null)) {
                            applicationPolicy = new ApplicationPolicy(applicationPolicy2, advancedRestrictionPolicy);
                            this.mApplicationPolicy = applicationPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return applicationPolicy;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getAuditLogPolicy", (java.lang.Class<?>[]) null, 19));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.log.AuditLog getAuditLogPolicy() {
        /*
            r5 = this;
            com.samsung.android.knox.log.AuditLog r0 = r5.mAuditLogPolicy
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.log.AuditLog r0 = r5.mAuditLogPolicy     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r0 = r5.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.knox.auditlog.AuditLog r0 = r0.getAuditLogPolicy()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r0 == 0) goto L_0x002c
            com.samsung.android.knox.log.AuditLog r1 = new com.samsung.android.knox.log.AuditLog     // Catch:{ NoSuchMethodError -> 0x001b }
            r1.<init>(r0)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mAuditLogPolicy = r1     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r1 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r2 = "getAuditLogPolicy"
            r3 = 0
            r4 = 19
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            com.samsung.android.knox.log.AuditLog r0 = r5.mAuditLogPolicy
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getAuditLogPolicy():com.samsung.android.knox.log.AuditLog");
    }

    public BasePasswordPolicy getBasePasswordPolicy() {
        BasePasswordPolicy basePasswordPolicy;
        BasePasswordPolicy basePasswordPolicy2 = this.mBasePasswordPolicy;
        if (basePasswordPolicy2 == null) {
            synchronized (this) {
                try {
                    basePasswordPolicy2 = this.mBasePasswordPolicy;
                    if (basePasswordPolicy2 == null && (basePasswordPolicy = this.mKnoxContainerManager.getBasePasswordPolicy()) != null) {
                        basePasswordPolicy2 = new BasePasswordPolicy(basePasswordPolicy);
                        this.mBasePasswordPolicy = basePasswordPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return basePasswordPolicy2;
    }

    public BootBanner getBootBanner() {
        SecurityPolicy securityPolicy;
        BootBanner bootBanner = this.mBootBanner;
        if (bootBanner == null) {
            synchronized (this) {
                try {
                    bootBanner = this.mBootBanner;
                    if (bootBanner == null && (securityPolicy = this.mKnoxContainerManager.getSecurityPolicy()) != null) {
                        bootBanner = new BootBanner(securityPolicy);
                        this.mBootBanner = bootBanner;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bootBanner;
    }

    public BrowserPolicy getBrowserPolicy() {
        BrowserPolicy browserPolicy = this.mBrowserPolicy;
        if (browserPolicy == null) {
            synchronized (this) {
                try {
                    browserPolicy = this.mBrowserPolicy;
                    if (browserPolicy == null) {
                        android.app.enterprise.BrowserPolicy browserPolicy2 = this.mKnoxContainerManager.getBrowserPolicy();
                        MiscPolicy miscPolicy = this.mKnoxContainerManager.getMiscPolicy();
                        if (!(browserPolicy2 == null || miscPolicy == null)) {
                            browserPolicy = new BrowserPolicy(browserPolicy2, miscPolicy);
                            this.mBrowserPolicy = browserPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return browserPolicy;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getCertificatePolicy", (java.lang.Class<?>[]) null, 12));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.keystore.CertificatePolicy getCertificatePolicy() {
        /*
            r5 = this;
            com.samsung.android.knox.keystore.CertificatePolicy r0 = r5.mCertificatePolicy
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.keystore.CertificatePolicy r0 = r5.mCertificatePolicy     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r5.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.knox.certificate.CertificatePolicy r1 = r1.getCertificatePolicy()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.keystore.CertificatePolicy r0 = new com.samsung.android.knox.keystore.CertificatePolicy     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r1)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mCertificatePolicy = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r1 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r2 = "getCertificatePolicy"
            r3 = 0
            r4 = 12
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getCertificatePolicy():com.samsung.android.knox.keystore.CertificatePolicy");
    }

    public CertificateProvisioning getCertificateProvisioning() {
        SecurityPolicy securityPolicy;
        CertificateProvisioning certificateProvisioning = this.mCertificateProvisioning;
        if (certificateProvisioning == null) {
            synchronized (this) {
                try {
                    certificateProvisioning = this.mCertificateProvisioning;
                    if (certificateProvisioning == null && (securityPolicy = this.mKnoxContainerManager.getSecurityPolicy()) != null) {
                        certificateProvisioning = new CertificateProvisioning(securityPolicy);
                        this.mCertificateProvisioning = certificateProvisioning;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return certificateProvisioning;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getClientCertificateManagerPolicy", (java.lang.Class<?>[]) null, 12));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.keystore.ClientCertificateManager getClientCertificateManagerPolicy() {
        /*
            r5 = this;
            com.samsung.android.knox.keystore.ClientCertificateManager r0 = r5.mClientCertificateManager
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.keystore.ClientCertificateManager r0 = r5.mClientCertificateManager     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r5.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.knox.ccm.ClientCertificateManager r1 = r1.getClientCertificateManagerPolicy()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.keystore.ClientCertificateManager r0 = new com.samsung.android.knox.keystore.ClientCertificateManager     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r1)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mClientCertificateManager = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r1 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r2 = "getClientCertificateManagerPolicy"
            r3 = 0
            r4 = 12
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getClientCertificateManagerPolicy():com.samsung.android.knox.keystore.ClientCertificateManager");
    }

    public ContainerConfigurationPolicy getContainerConfigurationPolicy() {
        ContainerConfigurationPolicy containerConfigurationPolicy;
        ContainerConfigurationPolicy containerConfigurationPolicy2 = this.mContainerConfigurationPolicy;
        if (containerConfigurationPolicy2 == null) {
            synchronized (this) {
                try {
                    containerConfigurationPolicy2 = this.mContainerConfigurationPolicy;
                    if (containerConfigurationPolicy2 == null && (containerConfigurationPolicy = this.mKnoxContainerManager.getContainerConfigurationPolicy()) != null) {
                        containerConfigurationPolicy2 = new ContainerConfigurationPolicy(containerConfigurationPolicy);
                        this.mContainerConfigurationPolicy = containerConfigurationPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return containerConfigurationPolicy2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getDLPManagerPolicy", (java.lang.Class<?>[]) null, 19));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.dlp.DLPManagerPolicy getDLPManagerPolicy() {
        /*
            r5 = this;
            com.samsung.android.knox.dlp.DLPManagerPolicy r0 = r5.mDLPManagerPolicy
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.dlp.DLPManagerPolicy r0 = r5.mDLPManagerPolicy     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r5.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.knox.dlp.DLPManagerPolicy r1 = r1.getDLPManagerPolicy()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.dlp.DLPManagerPolicy r0 = new com.samsung.android.knox.dlp.DLPManagerPolicy     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r1)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mDLPManagerPolicy = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r1 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r2 = "getDLPManagerPolicy"
            r3 = 0
            r4 = 19
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getDLPManagerPolicy():com.samsung.android.knox.dlp.DLPManagerPolicy");
    }

    public DateTimePolicy getDateTimePolicy() {
        android.app.enterprise.DateTimePolicy dateTimePolicy;
        DateTimePolicy dateTimePolicy2 = this.mDateTimePolicy;
        if (dateTimePolicy2 == null) {
            synchronized (this) {
                try {
                    dateTimePolicy2 = this.mDateTimePolicy;
                    if (dateTimePolicy2 == null && (dateTimePolicy = this.mKnoxContainerManager.getDateTimePolicy()) != null) {
                        dateTimePolicy2 = new DateTimePolicy(this.mContext, dateTimePolicy);
                        this.mDateTimePolicy = dateTimePolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dateTimePolicy2;
    }

    public DeviceAccountPolicy getDeviceAccountPolicy() {
        DeviceAccountPolicy deviceAccountPolicy = this.mDeviceAccountPolicy;
        if (deviceAccountPolicy == null) {
            synchronized (this) {
                try {
                    deviceAccountPolicy = this.mDeviceAccountPolicy;
                    if (deviceAccountPolicy == null) {
                        android.app.enterprise.DeviceAccountPolicy deviceAccountPolicy2 = this.mKnoxContainerManager.getDeviceAccountPolicy();
                        SecurityPolicy securityPolicy = this.mKnoxContainerManager.getSecurityPolicy();
                        if (!(deviceAccountPolicy2 == null || securityPolicy == null)) {
                            deviceAccountPolicy = new DeviceAccountPolicy(deviceAccountPolicy2, securityPolicy);
                            this.mDeviceAccountPolicy = deviceAccountPolicy;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return deviceAccountPolicy;
    }

    public EmailAccountPolicy getEmailAccountPolicy() {
        android.app.enterprise.EmailAccountPolicy emailAccountPolicy;
        EmailAccountPolicy emailAccountPolicy2 = this.mEmailAccountPolicy;
        if (emailAccountPolicy2 == null) {
            synchronized (this) {
                try {
                    emailAccountPolicy2 = this.mEmailAccountPolicy;
                    if (emailAccountPolicy2 == null && (emailAccountPolicy = this.mKnoxContainerManager.getEmailAccountPolicy()) != null) {
                        emailAccountPolicy2 = new EmailAccountPolicy(emailAccountPolicy);
                        this.mEmailAccountPolicy = emailAccountPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emailAccountPolicy2;
    }

    public EmailPolicy getEmailPolicy() {
        android.app.enterprise.EmailPolicy emailPolicy;
        EmailPolicy emailPolicy2 = this.mEmailPolicy;
        if (emailPolicy2 == null) {
            synchronized (this) {
                try {
                    emailPolicy2 = this.mEmailPolicy;
                    if (emailPolicy2 == null && (emailPolicy = this.mKnoxContainerManager.getEmailPolicy()) != null) {
                        emailPolicy2 = new EmailPolicy(emailPolicy);
                        this.mEmailPolicy = emailPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emailPolicy2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getEnterpriseBillingPolicy", (java.lang.Class<?>[]) null, 13));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.net.billing.EnterpriseBillingPolicy getEnterpriseBillingPolicy() {
        /*
            r5 = this;
            com.samsung.android.knox.net.billing.EnterpriseBillingPolicy r0 = r5.mEnterpriseBillingPolicy
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.net.billing.EnterpriseBillingPolicy r0 = r5.mEnterpriseBillingPolicy     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r5.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.knox.billing.EnterpriseBillingPolicy r1 = r1.getEnterpriseBillingPolicy()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.net.billing.EnterpriseBillingPolicy r0 = new com.samsung.android.knox.net.billing.EnterpriseBillingPolicy     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r1)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mEnterpriseBillingPolicy = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r1 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r2 = "getEnterpriseBillingPolicy"
            r3 = 0
            r4 = 13
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getEnterpriseBillingPolicy():com.samsung.android.knox.net.billing.EnterpriseBillingPolicy");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getEnterpriseCertEnrollPolicy", (java.lang.Class<?>[]) null, 12));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy getEnterpriseCertEnrollPolicy(java.lang.String r5) {
        /*
            r4 = this;
            com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy r0 = r4.mEnterpriseCertEnrollPolicy
            if (r0 != 0) goto L_0x0030
            monitor-enter(r4)
            com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy r0 = r4.mEnterpriseCertEnrollPolicy     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r4.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            com.sec.enterprise.knox.certenroll.EnterpriseCertEnrollPolicy r5 = r1.getEnterpriseCertEnrollPolicy(r5)     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r5 == 0) goto L_0x002c
            com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy r0 = new com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r5)     // Catch:{ NoSuchMethodError -> 0x001b }
            r4.mEnterpriseCertEnrollPolicy = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r5 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r5 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r0 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r1 = "getEnterpriseCertEnrollPolicy"
            r2 = 0
            r3 = 12
            java.lang.String r0 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r0, r1, r2, r3)     // Catch:{ all -> 0x0019 }
            r5.<init>(r0)     // Catch:{ all -> 0x0019 }
            throw r5     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r4)     // Catch:{ all -> 0x0019 }
            throw r5
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getEnterpriseCertEnrollPolicy(java.lang.String):com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy");
    }

    public ExchangeAccountPolicy getExchangeAccountPolicy() {
        android.app.enterprise.ExchangeAccountPolicy exchangeAccountPolicy;
        ExchangeAccountPolicy exchangeAccountPolicy2 = this.mEasAccountPolicy;
        if (exchangeAccountPolicy2 == null) {
            synchronized (this) {
                try {
                    exchangeAccountPolicy2 = this.mEasAccountPolicy;
                    if (exchangeAccountPolicy2 == null && (exchangeAccountPolicy = this.mKnoxContainerManager.getExchangeAccountPolicy()) != null) {
                        exchangeAccountPolicy2 = new ExchangeAccountPolicy(exchangeAccountPolicy);
                        this.mEasAccountPolicy = exchangeAccountPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return exchangeAccountPolicy2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|14|16|17|(1:19)|20|21|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.net.firewall.Firewall getFirewall() {
        /*
            r3 = this;
            com.samsung.android.knox.net.firewall.Firewall r0 = r3.mFirewall
            if (r0 != 0) goto L_0x0030
            monitor-enter(r3)
            com.samsung.android.knox.net.firewall.Firewall r0 = r3.mFirewall     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r3.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001d }
            com.sec.enterprise.firewall.Firewall r1 = r1.getFirewall()     // Catch:{ NoSuchMethodError -> 0x001d }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.net.firewall.Firewall r2 = new com.samsung.android.knox.net.firewall.Firewall     // Catch:{ NoSuchMethodError -> 0x001d }
            r2.<init>((com.sec.enterprise.firewall.Firewall) r1)     // Catch:{ NoSuchMethodError -> 0x001d }
            r3.mFirewall = r2     // Catch:{ NoSuchMethodError -> 0x001c }
            r0 = r2
            goto L_0x002c
        L_0x001a:
            r0 = move-exception
            goto L_0x002e
        L_0x001c:
            r0 = r2
        L_0x001d:
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r3.mKnoxContainerManager     // Catch:{ all -> 0x001a }
            android.app.enterprise.FirewallPolicy r1 = r1.getFirewallPolicy()     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.net.firewall.Firewall r0 = new com.samsung.android.knox.net.firewall.Firewall     // Catch:{ all -> 0x001a }
            r0.<init>((android.app.enterprise.FirewallPolicy) r1)     // Catch:{ all -> 0x001a }
            r3.mFirewall = r0     // Catch:{ all -> 0x001a }
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getFirewall():com.samsung.android.knox.net.firewall.Firewall");
    }

    public Geofencing getGeofencing() {
        android.app.enterprise.geofencing.Geofencing geofencing;
        Geofencing geofencing2 = this.mGeofencing;
        if (geofencing2 == null) {
            synchronized (this) {
                try {
                    geofencing2 = this.mGeofencing;
                    if (geofencing2 == null && (geofencing = this.mKnoxContainerManager.getGeofencing()) != null) {
                        geofencing2 = new Geofencing(geofencing);
                        this.mGeofencing = geofencing2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return geofencing2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.container.KnoxContainerManager.class, "getKioskMode", (java.lang.Class<?>[]) null, 12));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.samsung.android.knox.kiosk.KioskMode getKioskMode() {
        /*
            r5 = this;
            com.samsung.android.knox.kiosk.KioskMode r0 = r5.mKioskMode
            if (r0 != 0) goto L_0x0030
            monitor-enter(r5)
            com.samsung.android.knox.kiosk.KioskMode r0 = r5.mKioskMode     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002c
            com.sec.enterprise.knox.container.KnoxContainerManager r1 = r5.mKnoxContainerManager     // Catch:{ NoSuchMethodError -> 0x001b }
            android.app.enterprise.kioskmode.KioskMode r1 = r1.getKioskMode()     // Catch:{ NoSuchMethodError -> 0x001b }
            if (r1 == 0) goto L_0x002c
            com.samsung.android.knox.kiosk.KioskMode r0 = new com.samsung.android.knox.kiosk.KioskMode     // Catch:{ NoSuchMethodError -> 0x001b }
            r0.<init>(r1)     // Catch:{ NoSuchMethodError -> 0x001b }
            r5.mKioskMode = r0     // Catch:{ NoSuchMethodError -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r0 = move-exception
            goto L_0x002e
        L_0x001b:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError     // Catch:{ all -> 0x0019 }
            java.lang.Class<com.samsung.android.knox.container.KnoxContainerManager> r1 = com.samsung.android.knox.container.KnoxContainerManager.class
            java.lang.String r2 = "getKioskMode"
            r3 = 0
            r4 = 12
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(r1, r2, r3, r4)     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            goto L_0x0030
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.container.KnoxContainerManager.getKioskMode():com.samsung.android.knox.kiosk.KioskMode");
    }

    public LDAPAccountPolicy getLDAPAccountPolicy() {
        android.app.enterprise.LDAPAccountPolicy lDAPAccountPolicy;
        LDAPAccountPolicy lDAPAccountPolicy2 = this.mLDAPAccountPolicy;
        if (lDAPAccountPolicy2 == null) {
            synchronized (this) {
                try {
                    lDAPAccountPolicy2 = this.mLDAPAccountPolicy;
                    if (lDAPAccountPolicy2 == null && (lDAPAccountPolicy = this.mKnoxContainerManager.getLDAPAccountPolicy()) != null) {
                        lDAPAccountPolicy2 = new LDAPAccountPolicy(lDAPAccountPolicy);
                        this.mLDAPAccountPolicy = lDAPAccountPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lDAPAccountPolicy2;
    }

    public LocationPolicy getLocationPolicy() {
        android.app.enterprise.LocationPolicy locationPolicy;
        LocationPolicy locationPolicy2 = this.mLocationPolicy;
        if (locationPolicy2 == null) {
            synchronized (this) {
                try {
                    locationPolicy2 = this.mLocationPolicy;
                    if (locationPolicy2 == null && (locationPolicy = this.mKnoxContainerManager.getLocationPolicy()) != null) {
                        locationPolicy2 = new LocationPolicy(locationPolicy);
                        this.mLocationPolicy = locationPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return locationPolicy2;
    }

    public PasswordPolicy getPasswordPolicy() {
        android.app.enterprise.PasswordPolicy passwordPolicy;
        PasswordPolicy passwordPolicy2 = this.mPasswordPolicy;
        if (passwordPolicy2 == null) {
            synchronized (this) {
                try {
                    passwordPolicy2 = this.mPasswordPolicy;
                    if (passwordPolicy2 == null && (passwordPolicy = this.mKnoxContainerManager.getPasswordPolicy()) != null) {
                        passwordPolicy2 = new PasswordPolicy(passwordPolicy);
                        this.mPasswordPolicy = passwordPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return passwordPolicy2;
    }

    public RCPPolicy getRCPPolicy() {
        RCPPolicy rCPPolicy;
        RCPPolicy rCPPolicy2 = this.mRCPPolicy;
        if (rCPPolicy2 == null) {
            synchronized (this) {
                try {
                    rCPPolicy2 = this.mRCPPolicy;
                    if (rCPPolicy2 == null && (rCPPolicy = this.mKnoxContainerManager.getRCPPolicy()) != null) {
                        rCPPolicy2 = new RCPPolicy(rCPPolicy);
                        this.mRCPPolicy = rCPPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return rCPPolicy2;
    }

    public RestrictionPolicy getRestrictionPolicy() {
        android.app.enterprise.RestrictionPolicy restrictionPolicy;
        RestrictionPolicy restrictionPolicy2 = this.mRestrictionPolicy;
        if (restrictionPolicy2 == null) {
            synchronized (this) {
                try {
                    restrictionPolicy2 = this.mRestrictionPolicy;
                    if (restrictionPolicy2 == null && (restrictionPolicy = this.mKnoxContainerManager.getRestrictionPolicy()) != null) {
                        restrictionPolicy2 = new RestrictionPolicy(restrictionPolicy);
                        this.mRestrictionPolicy = restrictionPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return restrictionPolicy2;
    }

    public int getStatus() {
        return this.mKnoxContainerManager.getStatus();
    }

    public WifiPolicy getWifiPolicy() {
        android.app.enterprise.WifiPolicy wifiPolicy;
        WifiPolicy wifiPolicy2 = this.mWifiPolicy;
        if (wifiPolicy2 == null) {
            synchronized (this) {
                try {
                    wifiPolicy2 = this.mWifiPolicy;
                    if (wifiPolicy2 == null && (wifiPolicy = this.mKnoxContainerManager.getWifiPolicy()) != null) {
                        wifiPolicy2 = new WifiPolicy(wifiPolicy);
                        this.mWifiPolicy = wifiPolicy2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wifiPolicy2;
    }

    public boolean lock() {
        return this.mKnoxContainerManager.lock();
    }

    public boolean unlock() {
        return this.mKnoxContainerManager.unlock();
    }

    public static int createContainer(CreationParams creationParams) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.createContainer(CreationParams.convertToOld(creationParams));
        } catch (NoClassDefFoundError e) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                return ERROR_INTERNAL_ERROR;
            }
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static int createContainer(String str) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.createContainer(str);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return ERROR_INTERNAL_ERROR;
        }
    }
}
