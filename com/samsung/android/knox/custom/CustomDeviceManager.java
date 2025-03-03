package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomManager;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;

public class CustomDeviceManager {
    static final int ON = 1;
    static final int SHORTCUT_APP_TYPE = 1;
    private static final String TAG = "CustomDeviceManager-SupportLib";
    static final int USE_DEFAULT = 0;
    private static android.app.enterprise.knoxcustom.CustomDeviceManager mCustomDeviceManager;
    private static CustomDeviceManager mInstance;
    private static ProKioskManager mInstanceProKioskManager;
    private static SettingsManager mInstanceSettingsManager;
    private static SystemManager mInstanceSystemManager;
    private static KnoxCustomManager mKnoxCustomManager;

    private CustomDeviceManager(android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager) {
        mCustomDeviceManager = customDeviceManager;
    }

    public static CustomDeviceManager getInstance() {
        try {
            if (mInstance == null) {
                if (EnterpriseDeviceManager.getAPILevel() >= 17) {
                    android.app.enterprise.knoxcustom.CustomDeviceManager instance = android.app.enterprise.knoxcustom.CustomDeviceManager.getInstance();
                    if (instance != null) {
                        mInstance = new CustomDeviceManager(instance);
                    }
                } else {
                    KnoxCustomManager instance2 = KnoxCustomManager.getInstance();
                    if (instance2 != null) {
                        mInstance = new CustomDeviceManager(instance2);
                    }
                }
            }
            return mInstance;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public boolean checkEnterprisePermission(String str) {
        android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
        if (customDeviceManager != null) {
            return customDeviceManager.checkEnterprisePermission(str);
        }
        return mKnoxCustomManager.checkEnterprisePermission(str);
    }

    public ProKioskManager getProKioskManager() {
        if (mInstanceProKioskManager == null) {
            android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
            if (customDeviceManager != null) {
                mInstanceProKioskManager = new ProKioskManager(customDeviceManager.getProKioskManager());
            } else {
                mInstanceProKioskManager = new ProKioskManager(mKnoxCustomManager);
            }
        }
        return mInstanceProKioskManager;
    }

    public String getSerialNumber() {
        android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
        if (customDeviceManager != null) {
            return customDeviceManager.getSerialNumber();
        }
        return mKnoxCustomManager.getSerialNumber();
    }

    public SettingsManager getSettingsManager() {
        if (mInstanceSettingsManager == null) {
            android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
            if (customDeviceManager != null) {
                mInstanceSettingsManager = new SettingsManager(customDeviceManager.getSettingsManager());
            } else {
                mInstanceSettingsManager = new SettingsManager(mKnoxCustomManager);
            }
        }
        return mInstanceSettingsManager;
    }

    public SystemManager getSystemManager() {
        if (mInstanceSystemManager == null) {
            android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
            if (customDeviceManager != null) {
                mInstanceSystemManager = new SystemManager(customDeviceManager.getSystemManager());
            } else {
                mInstanceSystemManager = new SystemManager(mKnoxCustomManager);
            }
        }
        return mInstanceSystemManager;
    }

    private CustomDeviceManager(KnoxCustomManager knoxCustomManager) {
        mKnoxCustomManager = knoxCustomManager;
    }
}
