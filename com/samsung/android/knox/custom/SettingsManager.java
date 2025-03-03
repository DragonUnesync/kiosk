package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomManager;
import android.hardware.usb.UsbDevice;
import com.samsung.android.knox.SupportLibUtils;

public class SettingsManager {
    private static KnoxCustomManager mKnoxCustomManager;
    private static android.app.enterprise.knoxcustom.SettingsManager mSettingsManager;

    public SettingsManager(android.app.enterprise.knoxcustom.SettingsManager settingsManager) {
        mSettingsManager = settingsManager;
    }

    public boolean getAirGestureOptionState(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getAirGestureOptionState(i);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getAirGestureOptionState", new Class[]{Integer.TYPE}, 17));
    }

    public boolean getBackupRestoreState(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getBackupRestoreState(i);
        }
        try {
            return mKnoxCustomManager.getBackupRestoreState(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getBackupRestoreState", new Class[]{Integer.TYPE}, 14));
        }
    }

    public int getBluetoothVisibilityTimeout() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getBluetoothVisibilityTimeout();
        }
        try {
            return mKnoxCustomManager.getBluetoothVisibilityTimeout();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getBluetoothVisibilityTimeout", (Class<?>[]) null, 14));
        }
    }

    public boolean getChargingLEDState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getChargingLEDState();
        }
        try {
            return mKnoxCustomManager.getChargingLEDState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getChargingLEDState", (Class<?>[]) null, 15));
        }
    }

    public int getEthernetConfigurationType() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getEthernetConfigurationType();
        }
        try {
            return mKnoxCustomManager.getEthernetConfigurationType();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getEthernetConfigurationType", (Class<?>[]) null, 15));
        }
    }

    public boolean getEthernetState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getEthernetState();
        }
        try {
            return mKnoxCustomManager.getEthernetState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getEthernetState", (Class<?>[]) null, 15));
        }
    }

    public boolean getLTESettingState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getLTESettingState();
        }
        try {
            return mKnoxCustomManager.getLTESettingState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getLTESettingState", (Class<?>[]) null, 15));
        }
    }

    public boolean getMotionControlState(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getMotionControlState(i);
        }
        try {
            return mKnoxCustomManager.getMotionControlState(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getMotionControlState", new Class[]{Integer.TYPE}, 14));
        }
    }

    public boolean getPackageVerifierState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getPackageVerifierState();
        }
        try {
            return mKnoxCustomManager.getPackageVerifierState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getPackageVerifierState", (Class<?>[]) null, 14));
        }
    }

    public int getPowerSavingMode() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getPowerSavingMode();
        }
        try {
            return mKnoxCustomManager.getPowerSavingMode();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getPowerSavingMode", (Class<?>[]) null, 15));
        }
    }

    public boolean getScreenWakeupOnPowerState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getScreenWakeupOnPowerState();
        }
        try {
            return mKnoxCustomManager.getScreenWakeupOnPowerState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getScreenWakeupOnPowerState", (Class<?>[]) null, 15));
        }
    }

    public int getSettingsHiddenState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getSettingsHiddenState();
        }
        try {
            return mKnoxCustomManager.getSettingsHiddenState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getSettingsHiddenState", (Class<?>[]) null, 14));
        }
    }

    public boolean getWifiConnectionMonitorState() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getWifiConnectionMonitorState();
        }
        try {
            return mKnoxCustomManager.getWifiConnectionMonitorState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getWifiConnectionMonitorState", (Class<?>[]) null, 14));
        }
    }

    public int getWifiFrequencyBand() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.getWifiFrequencyBand();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "getWifiFrequencyBand", (Class<?>[]) null, 17));
    }

    public int setAdbState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setAdbState(z);
        }
        return mKnoxCustomManager.setAdbState(z);
    }

    public int setAirGestureOptionState(int i, boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setAirGestureOptionState(i, z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setAirGestureOptionState", new Class[]{Integer.TYPE, Boolean.TYPE}, 17));
    }

    public int setBackupRestoreState(int i, boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setBackupRestoreState(i, z);
        }
        try {
            return mKnoxCustomManager.setBackupRestoreState(i, z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setBackupRestoreState", new Class[]{Integer.TYPE, Boolean.TYPE}, 14));
        }
    }

    public int setBluetoothState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setBluetoothState(z);
        }
        return mKnoxCustomManager.setBluetoothState(z);
    }

    public int setBluetoothVisibilityTimeout(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setBluetoothVisibilityTimeout(i);
        }
        try {
            return mKnoxCustomManager.setBluetoothVisibilityTimeout(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setBluetoothVisibilityTimeout", new Class[]{Integer.TYPE}, 14));
        }
    }

    public int setChargingLEDState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setChargingLEDState(z);
        }
        try {
            return mKnoxCustomManager.setChargingLEDState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setChargingLEDState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setDeveloperOptionsHidden() {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setDeveloperOptionsHidden();
        }
        try {
            return mKnoxCustomManager.setDeveloperOptionsHidden();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setDeveloperOptionsHidden", (Class<?>[]) null, 14));
        }
    }

    public int setEthernetConfiguration(int i, String str, String str2, String str3, String str4) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setEthernetConfiguration(i, str, str2, str3, str4);
        }
        try {
            return mKnoxCustomManager.setEthernetConfiguration(i, str, str2, str3, str4);
        } catch (NoSuchMethodError unused) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setEthernetConfiguration", new Class[]{Integer.TYPE, cls, cls, cls, cls}, 15));
        }
    }

    public int setEthernetState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setEthernetState(z);
        }
        try {
            return mKnoxCustomManager.setEthernetState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setEthernetState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setFlightModeState(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        Class<SettingsManager> cls = SettingsManager.class;
        if (settingsManager != null) {
            try {
                return settingsManager.setFlightModeState(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setFlightModeState", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setFlightModeState", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int setGpsState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setGpsState(z);
        }
        return mKnoxCustomManager.setGpsState(z);
    }

    public int setInputMethod(String str, boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setInputMethod(str, z);
        }
        return mKnoxCustomManager.setInputMethod(str, z);
    }

    public int setLTESettingState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setLTESettingState(z);
        }
        try {
            return mKnoxCustomManager.setLTESettingState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setLTESettingState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setMobileDataRoamingState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setMobileDataRoamingState(z);
        }
        try {
            return mKnoxCustomManager.setMobileDataRoamingState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setMobileDataRoamingState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setMobileDataState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setMobileDataState(z);
        }
        return mKnoxCustomManager.setMobileDataState(z);
    }

    public int setMotionControlState(int i, boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setMotionControlState(i, z);
        }
        try {
            return mKnoxCustomManager.setMotionControlState(i, z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setMotionControlState", new Class[]{Integer.TYPE, Boolean.TYPE}, 14));
        }
    }

    public int setPackageVerifierState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setPackageVerifierState(z);
        }
        try {
            return mKnoxCustomManager.setPackageVerifierState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setPackageVerifierState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setPowerSavingMode(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setPowerSavingMode(i);
        }
        try {
            return mKnoxCustomManager.setPowerSavingMode(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setPowerSavingMode", new Class[]{Integer.TYPE}, 15));
        }
    }

    public int setScreenWakeupOnPowerState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setScreenWakeupOnPowerState(z);
        }
        try {
            return mKnoxCustomManager.setScreenWakeupOnPowerState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setScreenWakeupOnPowerState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setSettingsHiddenState(boolean z, int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setSettingsHiddenState(z, i);
        }
        try {
            return mKnoxCustomManager.setSettingsHiddenState(z, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setSettingsHiddenState", new Class[]{Boolean.TYPE, Integer.TYPE}, 14));
        }
    }

    public int setStayAwakeState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setStayAwakeState(z);
        }
        try {
            return mKnoxCustomManager.setStayAwakeState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setStayAwakeState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setSystemLocale(String str, String str2) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setSystemLocale(str, str2);
        }
        return mKnoxCustomManager.setSystemLocale(str, str2);
    }

    public int setUnknownSourcesState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setUnknownSourcesState(z);
        }
        return mKnoxCustomManager.setUnknownSourcesState(z);
    }

    public int setUsbDeviceDefaultPackage(UsbDevice usbDevice, String str, int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setUsbDeviceDefaultPackage(usbDevice, str, i);
        }
        return mKnoxCustomManager.setUsbDeviceDefaultPackage(usbDevice, str, i);
    }

    public int setWifiConnectionMonitorState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setWifiConnectionMonitorState(z);
        }
        try {
            return mKnoxCustomManager.setWifiConnectionMonitorState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setWifiConnectionMonitorState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setWifiFrequencyBand(int i) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setWifiFrequencyBand(i);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setWifiFrequencyBand", new Class[]{Integer.TYPE}, 17));
    }

    public int setWifiNetworkNotificationState(boolean z) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setWifiNetworkNotificationState(z);
        }
        try {
            return mKnoxCustomManager.setWifiNetworkNotificationState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setWifiNetworkNotificationState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setWifiState(boolean z, String str, String str2) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setWifiState(z, str, str2);
        }
        return mKnoxCustomManager.setWifiState(z, str, str2);
    }

    public SettingsManager(KnoxCustomManager knoxCustomManager) {
        mKnoxCustomManager = knoxCustomManager;
    }

    public int setWifiState(boolean z, String str, String str2, String str3) {
        android.app.enterprise.knoxcustom.SettingsManager settingsManager = mSettingsManager;
        if (settingsManager != null) {
            return settingsManager.setWifiState(z, str, str2, str3);
        }
        try {
            return mKnoxCustomManager.setWifiState(z, str, str2, str3);
        } catch (NoSuchMethodError unused) {
            Class<String> cls = String.class;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SettingsManager.class, "setWifiState", new Class[]{Boolean.TYPE, cls, cls, cls}, 15));
        }
    }
}
