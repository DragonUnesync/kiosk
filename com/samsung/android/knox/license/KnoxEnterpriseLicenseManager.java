package com.samsung.android.knox.license;

import android.content.Context;
import android.util.Log;

public class KnoxEnterpriseLicenseManager {
    public static final String ACTION_LICENSE_STATUS = "com.samsung.android.knox.intent.action.KNOX_LICENSE_STATUS";
    public static final String EXTRA_LICENSE_ACTIVATION_INITIATOR = "com.samsung.android.knox.intent.extra.KNOX_LICENSE_ACTIVATION_INITIATOR";
    public static final String EXTRA_LICENSE_ERROR_CODE = "com.samsung.android.knox.intent.extra.KNOX_LICENSE_ERROR_CODE";
    public static final String EXTRA_LICENSE_RESULT_TYPE = "com.samsung.android.knox.intent.extra.KNOX_LICENSE_RESULT_TYPE";
    public static final String EXTRA_LICENSE_STATUS = "com.samsung.android.knox.intent.extra.KNOX_LICENSE_STATUS";
    private static final String TAG = "KnoxEnterpriseLicenseManager-SupportLib";
    private static KnoxEnterpriseLicenseManager mKLM;
    private static com.sec.enterprise.knox.license.KnoxEnterpriseLicenseManager mKnoxEnterpriseLicenseManager;

    private KnoxEnterpriseLicenseManager(com.sec.enterprise.knox.license.KnoxEnterpriseLicenseManager knoxEnterpriseLicenseManager) {
        mKnoxEnterpriseLicenseManager = knoxEnterpriseLicenseManager;
    }

    public static KnoxEnterpriseLicenseManager getInstance(Context context) {
        KnoxEnterpriseLicenseManager knoxEnterpriseLicenseManager;
        com.sec.enterprise.knox.license.KnoxEnterpriseLicenseManager instance;
        if (context == null) {
            return null;
        }
        KnoxEnterpriseLicenseManager knoxEnterpriseLicenseManager2 = mKLM;
        if (knoxEnterpriseLicenseManager2 != null) {
            return knoxEnterpriseLicenseManager2;
        }
        try {
            synchronized (KnoxEnterpriseLicenseManager.class) {
                knoxEnterpriseLicenseManager = mKLM;
                if (knoxEnterpriseLicenseManager == null && (instance = com.sec.enterprise.knox.license.KnoxEnterpriseLicenseManager.getInstance(context)) != null) {
                    knoxEnterpriseLicenseManager = new KnoxEnterpriseLicenseManager(instance);
                    mKLM = knoxEnterpriseLicenseManager;
                }
            }
            return knoxEnterpriseLicenseManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void activateLicense(String str) {
        mKnoxEnterpriseLicenseManager.activateLicense(str);
    }

    public void deActivateLicense(String str) {
        mKnoxEnterpriseLicenseManager.deActivateLicense(str);
    }

    public void activateLicense(String str, String str2) {
        mKnoxEnterpriseLicenseManager.activateLicense(str, str2);
    }

    public void deActivateLicense(String str, String str2) {
        mKnoxEnterpriseLicenseManager.deActivateLicense(str, str2);
    }
}
