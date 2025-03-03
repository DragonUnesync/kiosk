package com.samsung.android.knox.ucm.core;

import android.os.Bundle;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.ucm.configurator.UniversalCredentialManager;
import java.security.Provider;

public class UniversalCredentialUtil {
    public static final String AGENT_IS_GENERATE_PASSWORD_AVAILABLE = "isGeneratePasswordAvailable";
    public static final String AGENT_IS_PUK_SUPPORTED = "isPUKSupported";
    private static final String TAG = "UniversalCredentialUtil-SupportLib";
    private final com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil mUniversalCredentialUtil;

    private UniversalCredentialUtil(com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil universalCredentialUtil) {
        this.mUniversalCredentialUtil = universalCredentialUtil;
    }

    public static UniversalCredentialUtil getInstance() {
        try {
            com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil instance = com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getInstance();
            if (instance == null) {
                return null;
            }
            return new UniversalCredentialUtil(instance);
        } catch (NoClassDefFoundError unused) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                return null;
            }
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
        }
    }

    public static String getKeychainUri(String str, String str2) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getKeychainUri(str, str2);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
        }
    }

    public static String getRawAlias(String str) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getRawAlias(str);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
        }
    }

    public static String getSource(String str) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getSource(str);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
        }
    }

    public static boolean isValidUri(String str) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.isValidUri(str);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
        }
    }

    private void verifyBundle(Bundle bundle) {
        if (bundle != null && EnterpriseDeviceManager.getAPILevel() > -1 && EnterpriseDeviceManager.getAPILevel() < 20) {
            Class<UniversalCredentialManager> cls = UniversalCredentialManager.class;
            if (bundle.get(AGENT_IS_GENERATE_PASSWORD_AVAILABLE) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, AGENT_IS_GENERATE_PASSWORD_AVAILABLE, 20));
            } else if (bundle.get(AGENT_IS_PUK_SUPPORTED) != null) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, AGENT_IS_PUK_SUPPORTED, 20));
            }
        }
    }

    public Bundle APDUCommand(String str, byte[] bArr, Bundle bundle) {
        try {
            verifyBundle(bundle);
            return this.mUniversalCredentialUtil.APDUCommand(str, bArr, bundle);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "APDUCommand", new Class[]{String.class, byte[].class, Bundle.class}, 19));
        } catch (NoSuchFieldError e) {
            throw new NoSuchFieldError(e.getMessage());
        }
    }

    public Bundle changePin(String str, String str2, String str3) {
        try {
            return this.mUniversalCredentialUtil.changePin(str, str2, str3);
        } catch (NoSuchMethodError unused) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "changePin", new Class[]{cls, cls, cls}, 19));
        }
    }

    public Bundle getInfo(String str) {
        try {
            return this.mUniversalCredentialUtil.getInfo(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "getInfo", new Class[]{String.class}, 19));
        }
    }

    public Provider[] getProviders() {
        try {
            return this.mUniversalCredentialUtil.getProviders();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "getProviders", (Class<?>[]) null, 19));
        }
    }

    public static String getKeychainUri(String str, String str2, int i) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getKeychainUri(str, str2, i);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
        }
    }
}
