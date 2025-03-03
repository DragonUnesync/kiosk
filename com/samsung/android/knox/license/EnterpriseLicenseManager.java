package com.samsung.android.knox.license;

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;

public class EnterpriseLicenseManager {
    public static final String ACTION_LICENSE_STATUS = "com.samsung.android.knox.intent.action.LICENSE_STATUS";
    public static final String EXTRA_LICENSE_ATTESTATION_STATUS = "com.samsung.android.knox.intent.extra.LICENSE_ATTESTATION_STATUS";
    public static final String EXTRA_LICENSE_ERROR_CODE = "com.samsung.android.knox.intent.extra.LICENSE_ERROR_CODE";
    public static final String EXTRA_LICENSE_PERM_GROUP = "com.samsung.android.knox.intent.extra.LICENSE_PERM_GROUP";
    public static final String EXTRA_LICENSE_RESULT_TYPE = "com.samsung.android.knox.intent.extra.LICENSE_RESULT_TYPE";
    public static final String EXTRA_LICENSE_STATUS = "com.samsung.android.knox.intent.extra.LICENSE_STATUS";
    private static final String TAG = "EnterpriseLicenseManager-SupportLib";
    private static EnterpriseLicenseManager mELM;
    private static android.app.enterprise.license.EnterpriseLicenseManager mEnterpriseLicenseManager;

    private EnterpriseLicenseManager(android.app.enterprise.license.EnterpriseLicenseManager enterpriseLicenseManager) {
        mEnterpriseLicenseManager = enterpriseLicenseManager;
    }

    public static EnterpriseLicenseManager getInstance(Context context) {
        EnterpriseLicenseManager enterpriseLicenseManager;
        android.app.enterprise.license.EnterpriseLicenseManager instance;
        if (context == null) {
            return null;
        }
        EnterpriseLicenseManager enterpriseLicenseManager2 = mELM;
        if (enterpriseLicenseManager2 != null) {
            return enterpriseLicenseManager2;
        }
        try {
            synchronized (EnterpriseLicenseManager.class) {
                enterpriseLicenseManager = mELM;
                if (enterpriseLicenseManager == null && (instance = android.app.enterprise.license.EnterpriseLicenseManager.getInstance(context)) != null) {
                    enterpriseLicenseManager = new EnterpriseLicenseManager(instance);
                    mELM = enterpriseLicenseManager;
                }
            }
            return enterpriseLicenseManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void activateLicense(String str) {
        mEnterpriseLicenseManager.activateLicense(str);
    }

    public JSONArray getApiCallDataByAdmin(String str) {
        return mEnterpriseLicenseManager.getApiCallDataByAdmin(str);
    }

    public void activateLicense(String str, String str2) {
        mEnterpriseLicenseManager.activateLicense(str, str2);
    }
}
