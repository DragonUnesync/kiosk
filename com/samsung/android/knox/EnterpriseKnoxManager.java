package com.samsung.android.knox;

import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.keystore.ClientCertificateManager;
import com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy;
import com.samsung.android.knox.keystore.TimaKeystore;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.billing.EnterpriseBillingPolicy;
import com.samsung.android.knox.net.vpn.GenericVpnPolicy;
import com.samsung.android.knox.restriction.AdvancedRestrictionPolicy;

public class EnterpriseKnoxManager {
    private static final String TAG = "EnterpriseKnoxManager-SupportLib";
    private static Context mContext;
    private static com.sec.enterprise.knox.EnterpriseKnoxManager mEkm;
    private static EnterpriseKnoxManager mInstance;
    private volatile AdvancedRestrictionPolicy mAdvancedRestrictionPolicy;
    private volatile AuditLog mAuditLogPolicy;
    private volatile CertificatePolicy mCertificatePolicy;
    private volatile ClientCertificateManager mClientCertificateManagerPolicy;
    private volatile EnterpriseBillingPolicy mEnterpriseBillingPolicy;
    private volatile TimaKeystore mTimaKeystorePolicy;

    private EnterpriseKnoxManager(com.sec.enterprise.knox.EnterpriseKnoxManager enterpriseKnoxManager) {
        mEkm = enterpriseKnoxManager;
    }

    public static EnterpriseKnoxManager getInstance(Context context) {
        EnterpriseKnoxManager enterpriseKnoxManager;
        com.sec.enterprise.knox.EnterpriseKnoxManager instance;
        if (context == null) {
            return null;
        }
        EnterpriseKnoxManager enterpriseKnoxManager2 = mInstance;
        if (enterpriseKnoxManager2 != null) {
            return enterpriseKnoxManager2;
        }
        try {
            synchronized (EnterpriseKnoxManager.class) {
                enterpriseKnoxManager = mInstance;
                if (enterpriseKnoxManager == null && (instance = com.sec.enterprise.knox.EnterpriseKnoxManager.getInstance()) != null) {
                    enterpriseKnoxManager = new EnterpriseKnoxManager(instance);
                    mInstance = enterpriseKnoxManager;
                    mContext = context;
                }
            }
            return enterpriseKnoxManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public AdvancedRestrictionPolicy getAdvancedRestrictionPolicy() {
        com.sec.enterprise.knox.AdvancedRestrictionPolicy advancedRestrictionPolicy;
        AdvancedRestrictionPolicy advancedRestrictionPolicy2 = this.mAdvancedRestrictionPolicy;
        if (advancedRestrictionPolicy2 == null) {
            synchronized (this) {
                try {
                    advancedRestrictionPolicy2 = this.mAdvancedRestrictionPolicy;
                    if (advancedRestrictionPolicy2 == null && (advancedRestrictionPolicy = mEkm.getAdvancedRestrictionPolicy(mContext)) != null) {
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

    public AuditLog getAuditLogPolicy() {
        com.sec.enterprise.knox.auditlog.AuditLog instance;
        AuditLog auditLog = this.mAuditLogPolicy;
        if (auditLog == null) {
            synchronized (this) {
                try {
                    auditLog = this.mAuditLogPolicy;
                    if (auditLog == null && (instance = com.sec.enterprise.knox.auditlog.AuditLog.getInstance(mContext)) != null) {
                        auditLog = new AuditLog(instance);
                        this.mAuditLogPolicy = auditLog;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return auditLog;
    }

    public CertificatePolicy getCertificatePolicy() {
        com.sec.enterprise.knox.certificate.CertificatePolicy instance;
        CertificatePolicy certificatePolicy = this.mCertificatePolicy;
        if (certificatePolicy == null) {
            synchronized (this) {
                try {
                    certificatePolicy = this.mCertificatePolicy;
                    if (certificatePolicy == null && (instance = com.sec.enterprise.knox.certificate.CertificatePolicy.getInstance(mContext)) != null) {
                        certificatePolicy = new CertificatePolicy(instance);
                        this.mCertificatePolicy = certificatePolicy;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return certificatePolicy;
    }

    public ClientCertificateManager getClientCertificateManagerPolicy() {
        com.sec.enterprise.knox.ccm.ClientCertificateManager clientCertificateManagerPolicy;
        ClientCertificateManager clientCertificateManager = this.mClientCertificateManagerPolicy;
        if (clientCertificateManager == null) {
            synchronized (this) {
                try {
                    clientCertificateManager = this.mClientCertificateManagerPolicy;
                    if (clientCertificateManager == null && (clientCertificateManagerPolicy = mEkm.getClientCertificateManagerPolicy(mContext)) != null) {
                        clientCertificateManager = new ClientCertificateManager(clientCertificateManagerPolicy);
                        this.mClientCertificateManagerPolicy = clientCertificateManager;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return clientCertificateManager;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.NoSuchMethodError(com.samsung.android.knox.SupportLibUtils.buildMethodErrorMsg(com.samsung.android.knox.EnterpriseKnoxManager.class, "getEnterpriseBillingPolicy", (java.lang.Class<?>[]) null, 13));
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
            com.sec.enterprise.knox.EnterpriseKnoxManager r1 = mEkm     // Catch:{ NoSuchMethodError -> 0x001b }
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
            java.lang.Class<com.samsung.android.knox.EnterpriseKnoxManager> r1 = com.samsung.android.knox.EnterpriseKnoxManager.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.EnterpriseKnoxManager.getEnterpriseBillingPolicy():com.samsung.android.knox.net.billing.EnterpriseBillingPolicy");
    }

    public EnterpriseCertEnrollPolicy getEnterpriseCertEnrollPolicy(String str) {
        com.sec.enterprise.knox.certenroll.EnterpriseCertEnrollPolicy enterpriseCertEnrollPolicy = mEkm.getEnterpriseCertEnrollPolicy(mContext, str);
        if (enterpriseCertEnrollPolicy != null) {
            return new EnterpriseCertEnrollPolicy(enterpriseCertEnrollPolicy);
        }
        return null;
    }

    public GenericVpnPolicy getGenericVpnPolicy(String str, int i) {
        com.sec.enterprise.knox.GenericVpnPolicy genericVpnPolicy = mEkm.getGenericVpnPolicy(str, i);
        if (genericVpnPolicy != null) {
            return new GenericVpnPolicy(genericVpnPolicy);
        }
        return null;
    }

    public synchronized KnoxContainerManager getKnoxContainerManager(int i) {
        KnoxContainerManager knoxContainerManager;
        com.sec.enterprise.knox.container.KnoxContainerManager knoxContainerManager2 = mEkm.getKnoxContainerManager(mContext, i);
        if (knoxContainerManager2 != null) {
            knoxContainerManager = new KnoxContainerManager(mContext, knoxContainerManager2);
        } else {
            knoxContainerManager = null;
        }
        return knoxContainerManager;
    }

    public TimaKeystore getTimaKeystorePolicy() {
        com.sec.enterprise.knox.keystore.TimaKeystore timaKeystorePolicy;
        TimaKeystore timaKeystore = this.mTimaKeystorePolicy;
        if (timaKeystore == null) {
            synchronized (this) {
                try {
                    timaKeystore = this.mTimaKeystorePolicy;
                    if (timaKeystore == null && (timaKeystorePolicy = mEkm.getTimaKeystorePolicy(mContext)) != null) {
                        timaKeystore = new TimaKeystore(timaKeystorePolicy);
                        this.mTimaKeystorePolicy = timaKeystore;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return timaKeystore;
    }
}
