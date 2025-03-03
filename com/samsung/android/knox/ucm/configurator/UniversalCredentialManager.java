package com.samsung.android.knox.ucm.configurator;

import android.os.Bundle;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import java.util.List;

public class UniversalCredentialManager {
    private static final String BUNDLE_CA_CERT_TYPE = "cert_type";
    private static final String BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST = "add_pin_cache_exemptlist";
    private static final String BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET = "enforce_lock_type_direct_set";
    private static final String BUNDLE_EXTRA_ODE_CA_CERT = "ode_ca_cert";
    private static final String BUNDLE_EXTRA_PIN_CACHE = "pin_cache";
    private static final String BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES = "timeout";
    private static final String BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST = "remove_pin_cache_exemptlist";
    private static final String BUNDLE_EXTRA_USER_ID = "userId";
    private static final String TAG = "UniversalCredentialManager-SupportLib";
    private com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager mCredentialManager;

    private UniversalCredentialManager(com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager universalCredentialManager) {
        this.mCredentialManager = universalCredentialManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel() <= -1) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        android.util.Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        throw new java.lang.NoClassDefFoundError(com.samsung.android.knox.SupportLibUtils.buildClassErrorMsg(com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.class, 19));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.samsung.android.knox.ucm.configurator.UniversalCredentialManager getUCMManager(android.content.Context r3) {
        /*
            java.lang.Class<com.samsung.android.knox.ucm.configurator.UniversalCredentialManager> r0 = com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.class
            monitor-enter(r0)
            com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager r3 = com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager.getUCMManager(r3)     // Catch:{ NoClassDefFoundError -> 0x0012 }
            if (r3 == 0) goto L_0x0020
            com.samsung.android.knox.ucm.configurator.UniversalCredentialManager r1 = new com.samsung.android.knox.ucm.configurator.UniversalCredentialManager     // Catch:{ NoClassDefFoundError -> 0x0012 }
            r1.<init>(r3)     // Catch:{ NoClassDefFoundError -> 0x0012 }
            monitor-exit(r0)
            return r1
        L_0x0010:
            r3 = move-exception
            goto L_0x0031
        L_0x0012:
            int r3 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()     // Catch:{ all -> 0x0010 }
            r1 = -1
            if (r3 > r1) goto L_0x0023
            java.lang.String r3 = "UniversalCredentialManager-SupportLib"
            java.lang.String r1 = "Calling method from a non-Knox device, exiting gracefully.."
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x0010 }
        L_0x0020:
            monitor-exit(r0)
            r3 = 0
            return r3
        L_0x0023:
            java.lang.NoClassDefFoundError r3 = new java.lang.NoClassDefFoundError     // Catch:{ all -> 0x0010 }
            java.lang.Class<com.samsung.android.knox.ucm.configurator.UniversalCredentialManager> r1 = com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.class
            r2 = 19
            java.lang.String r1 = com.samsung.android.knox.SupportLibUtils.buildClassErrorMsg(r1, r2)     // Catch:{ all -> 0x0010 }
            r3.<init>(r1)     // Catch:{ all -> 0x0010 }
            throw r3     // Catch:{ all -> 0x0010 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.getUCMManager(android.content.Context):com.samsung.android.knox.ucm.configurator.UniversalCredentialManager");
    }

    private void validateBundle(Bundle bundle) {
        if (bundle != null && EnterpriseDeviceManager.getAPILevel() > -1 && EnterpriseDeviceManager.getAPILevel() < 20) {
            Class<UniversalCredentialManager> cls = UniversalCredentialManager.class;
            if (bundle.get(BUNDLE_CA_CERT_TYPE) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_CA_CERT_TYPE, 20));
            } else if (bundle.get(BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST, 20));
            } else if (bundle.get(BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET, 20));
            } else if (bundle.get(BUNDLE_EXTRA_ODE_CA_CERT) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_ODE_CA_CERT, 20));
            } else if (bundle.get(BUNDLE_EXTRA_PIN_CACHE) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_PIN_CACHE, 20));
            } else if (bundle.get(BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES, 20));
            } else if (bundle.get(BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST, 20));
            } else if (bundle.get(BUNDLE_EXTRA_USER_ID) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, BUNDLE_EXTRA_USER_ID, 20));
            }
        }
    }

    public int addPackagesToExemptList(CredentialStorage credentialStorage, int i, List<AppIdentity> list) {
        try {
            return this.mCredentialManager.addPackagesToExemptList(CredentialStorage.convertToOld(credentialStorage), i, AppIdentity.convertToOldList(list));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int addPackagesToWhiteList(CredentialStorage credentialStorage, List<AppIdentity> list, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.addPackagesToWhiteList(CredentialStorage.convertToOld(credentialStorage), AppIdentity.convertToOldList(list), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int clearWhiteList(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.clearWhiteList(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int configureCredentialStorageForODESettings(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.configureCredentialStorageForODESettings(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int configureCredentialStoragePlugin(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.configureCredentialStoragePlugin(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int deleteCACertificate(String str) {
        try {
            return this.mCredentialManager.deleteCACertificate(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "deleteCACertificate", new Class[]{String.class}, 20));
        }
    }

    public int deleteCertificate(CredentialStorage credentialStorage, String str) {
        try {
            return this.mCredentialManager.deleteCertificate(CredentialStorage.convertToOld(credentialStorage), str);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int enforceCredentialStorageAsLockType(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.enforceCredentialStorageAsLockType(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "enforceCredentialStorageAsLockType", new Class[]{CredentialStorage.class}, 20));
        }
    }

    public String[] getAliases(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getAliases(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int getAuthType(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getAuthType(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public CredentialStorage[] getAvailableCredentialStorages() {
        try {
            return CredentialStorage.convertToNewArray(this.mCredentialManager.getAvailableCredentialStorages());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getAvailableCredentialStorages", (Class<?>[]) null, 19));
        }
    }

    public CACertificateInfo getCACertificate(String str) {
        try {
            return CACertificateInfo.convertToNew(this.mCredentialManager.getCACertificate(str));
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCACertificate", new Class[]{String.class}, 20));
        }
    }

    public String[] getCACertificateAliases(Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.getCACertificateAliases(bundle);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCACertificateAliases", new Class[]{Bundle.class}, 20));
        } catch (NoSuchFieldError e) {
            throw new NoSuchFieldError(e.getMessage());
        }
    }

    public Bundle getCredentialStoragePluginConfiguration(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getCredentialStoragePluginConfiguration(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public Bundle getCredentialStorageProperty(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.getCredentialStorageProperty(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCredentialStorageProperty", new Class[]{CredentialStorage.class, Bundle.class}, 20));
        }
    }

    public CredentialStorage[] getCredentialStorages(String str) {
        try {
            return CredentialStorage.convertToNewArray(this.mCredentialManager.getCredentialStorages(str));
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCredentialStorages", new Class[]{String.class}, 19));
        }
    }

    public CredentialStorage getEnforcedCredentialStorageForLockType() {
        try {
            return CredentialStorage.convertToNew(this.mCredentialManager.getEnforcedCredentialStorageForLockType());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getEnforcedCredentialStorageForLockType", (Class<?>[]) null, 20));
        }
    }

    public Bundle getODESettingsConfiguration() {
        try {
            return this.mCredentialManager.getODESettingsConfiguration();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getODESettingsConfiguration", (Class<?>[]) null, 20));
        }
    }

    public List<AppIdentity> getPackagesFromExemptList(CredentialStorage credentialStorage, int i) {
        try {
            return AppIdentity.convertoToNewList(this.mCredentialManager.getPackagesFromExemptList(CredentialStorage.convertToOld(credentialStorage), i));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public List<AppIdentity> getPackagesFromWhiteList(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            return AppIdentity.convertoToNewList(this.mCredentialManager.getPackagesFromWhiteList(CredentialStorage.convertToOld(credentialStorage), bundle));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public String[] getSupportedAlgorithms(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getSupportedAlgorithms(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int installCACertificate(byte[] bArr, String str, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.installCACertificate(bArr, str, bundle);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "installCACertificate", new Class[]{byte[].class, String.class, Bundle.class}, 20));
        } catch (NoSuchFieldError e) {
            throw new NoSuchFieldError(e.getMessage());
        }
    }

    public int installCertificate(CredentialStorage credentialStorage, byte[] bArr, String str, String str2, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.installCertificate(CredentialStorage.convertToOld(credentialStorage), bArr, str, str2, bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public boolean isCredentialStorageManaged(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.isCredentialStorageManaged(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int manageCredentialStorage(CredentialStorage credentialStorage, boolean z) {
        try {
            return this.mCredentialManager.manageCredentialStorage(CredentialStorage.convertToOld(credentialStorage), z);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int removePackagesFromExemptList(CredentialStorage credentialStorage, int i, List<AppIdentity> list) {
        try {
            return this.mCredentialManager.removePackagesFromExemptList(CredentialStorage.convertToOld(credentialStorage), i, AppIdentity.convertToOldList(list));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int removePackagesFromWhiteList(CredentialStorage credentialStorage, List<AppIdentity> list, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.removePackagesFromWhiteList(CredentialStorage.convertToOld(credentialStorage), AppIdentity.convertToOldList(list), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public int setAuthType(CredentialStorage credentialStorage, int i) {
        try {
            return this.mCredentialManager.setAuthType(CredentialStorage.convertToOld(credentialStorage), i);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        }
    }

    public Bundle setCredentialStorageProperty(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.setCredentialStorageProperty(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "setCredentialStorageProperty", new Class[]{CredentialStorage.class, Bundle.class}, 20));
        }
    }

    public int enforceCredentialStorageAsLockType(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            if (EnterpriseDeviceManager.getAPILevel() != 20) {
                if (bundle != null) {
                    return this.mCredentialManager.enforceCredentialStorageAsLockType(CredentialStorage.convertToOld(credentialStorage), bundle);
                }
            }
            return this.mCredentialManager.enforceCredentialStorageAsLockType(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        } catch (NoSuchFieldError e8) {
            throw new NoSuchFieldError(e8.getMessage());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "enforceCredentialStorageAsLockType", new Class[]{CredentialStorage.class, Bundle.class}, 20));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel() <= -1) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        android.util.Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        throw new java.lang.NoClassDefFoundError(com.samsung.android.knox.SupportLibUtils.buildClassErrorMsg(com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.class, 19));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.samsung.android.knox.ucm.configurator.UniversalCredentialManager getUCMManager(android.content.Context r2, int r3) {
        /*
            java.lang.Class<com.samsung.android.knox.ucm.configurator.UniversalCredentialManager> r0 = com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.class
            monitor-enter(r0)
            com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager r2 = com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager.getUCMManager(r2, r3)     // Catch:{ NoClassDefFoundError -> 0x0012 }
            if (r2 == 0) goto L_0x0020
            com.samsung.android.knox.ucm.configurator.UniversalCredentialManager r3 = new com.samsung.android.knox.ucm.configurator.UniversalCredentialManager     // Catch:{ NoClassDefFoundError -> 0x0012 }
            r3.<init>(r2)     // Catch:{ NoClassDefFoundError -> 0x0012 }
            monitor-exit(r0)
            return r3
        L_0x0010:
            r2 = move-exception
            goto L_0x0031
        L_0x0012:
            int r2 = com.samsung.android.knox.EnterpriseDeviceManager.getAPILevel()     // Catch:{ all -> 0x0010 }
            r3 = -1
            if (r2 > r3) goto L_0x0023
            java.lang.String r2 = "UniversalCredentialManager-SupportLib"
            java.lang.String r3 = "Calling method from a non-Knox device, exiting gracefully.."
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0010 }
        L_0x0020:
            monitor-exit(r0)
            r2 = 0
            return r2
        L_0x0023:
            java.lang.NoClassDefFoundError r2 = new java.lang.NoClassDefFoundError     // Catch:{ all -> 0x0010 }
            java.lang.Class<com.samsung.android.knox.ucm.configurator.UniversalCredentialManager> r3 = com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.class
            r1 = 19
            java.lang.String r3 = com.samsung.android.knox.SupportLibUtils.buildClassErrorMsg(r3, r1)     // Catch:{ all -> 0x0010 }
            r2.<init>(r3)     // Catch:{ all -> 0x0010 }
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.ucm.configurator.UniversalCredentialManager.getUCMManager(android.content.Context, int):com.samsung.android.knox.ucm.configurator.UniversalCredentialManager");
    }
}
