package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomManager;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import com.samsung.android.knox.SupportLibUtils;
import java.util.List;

public class SystemManager {
    public static final String ACTION_NO_USER_ACTIVITY = "com.samsung.android.knox.intent.action.NO_USER_ACTIVITY";
    public static final String ACTION_NO_USER_ACTIVITY_OLD = "com.sec.action.NO_USER_ACTIVITY";
    public static final String ACTION_USER_ACTIVITY = "com.samsung.android.knox.intent.action.USER_ACTIVITY";
    public static final String ACTION_USER_ACTIVITY_OLD = "com.sec.action.USER_ACTIVITY";
    private static KnoxCustomManager mKnoxCustomManager;
    private static android.app.enterprise.knoxcustom.SystemManager mSystemManager;

    public SystemManager(android.app.enterprise.knoxcustom.SystemManager systemManager) {
        mSystemManager = systemManager;
    }

    public int addAutoCallNumber(String str, int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.addAutoCallNumber(str, i, i8);
            } catch (NoSuchMethodError unused) {
                Class cls3 = Integer.TYPE;
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "addAutoCallNumber", new Class[]{cls, cls3, cls3}, 20));
            }
        } else {
            Class cls4 = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "addAutoCallNumber", new Class[]{cls, cls4, cls4}, 20));
        }
    }

    public int addPackageToPowerSaveWhitelist(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.addPackageToPowerSaveWhitelist(str);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "addPackageToPowerSaveWhitelist", new Class[]{cls}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "addPackageToPowerSaveWhitelist", new Class[]{cls}, 20));
        }
    }

    public int addPackagesToUltraPowerSaving(List<String> list) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.addPackagesToUltraPowerSaving(list);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "addPackagesToUltraPowerSaving", new Class[]{List.class}, 17));
    }

    public int addShortcutToHomeScreen(ShortcutItem shortcutItem) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            try {
                return systemManager.addShortcutToHomeScreen(ShortcutItem.convertToOld(shortcutItem));
            } catch (NoClassDefFoundError e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } else {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(ShortcutItem.class, 20));
        }
    }

    public int addWidgetToHomeScreen(WidgetItem widgetItem) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            try {
                return systemManager.addWidgetToHomeScreen(WidgetItem.convertToOld(widgetItem));
            } catch (NoClassDefFoundError e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } else {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(WidgetItem.class, 20));
        }
    }

    public int clearAnimation(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.clearAnimation(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "clearAnimation", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "clearAnimation", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int copyAdbLog(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.copyAdbLog(i);
        }
        try {
            return mKnoxCustomManager.copyAdbLog(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "copyAdbLog", new Class[]{Integer.TYPE}, 15));
        }
    }

    public int dialEmergencyNumber(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.dialEmergencyNumber(str);
        }
        try {
            return mKnoxCustomManager.dialEmergencyNumber(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "dialEmergencyNumber", new Class[]{String.class}, 14));
        }
    }

    public int getAccessibilitySettingsItems() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getAccessibilitySettingsItems();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getAccessibilitySettingsItems", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getAccessibilitySettingsItems", (Class<?>[]) null, 19));
        }
    }

    public List<String> getAppBlockDownloadNamespaces() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getAppBlockDownloadNamespaces();
        }
        try {
            return mKnoxCustomManager.getAppBlockDownloadNamespaces();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getAppBlockDownloadNamespaces", (Class<?>[]) null, 15));
        }
    }

    public boolean getAppBlockDownloadState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getAppBlockDownloadState();
        }
        try {
            return mKnoxCustomManager.getAppBlockDownloadState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getAppBlockDownloadState", (Class<?>[]) null, 15));
        }
    }

    public int getAutoCallNumberAnswerMode(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getAutoCallNumberAnswerMode(str);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getAutoCallNumberAnswerMode", new Class[]{cls}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getAutoCallNumberAnswerMode", new Class[]{cls}, 20));
        }
    }

    public int getAutoCallNumberDelay(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getAutoCallNumberDelay(str);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getAutoCallNumberDelay", new Class[]{cls}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "getAutoCallNumberDelay", new Class[]{cls}, 20));
        }
    }

    public List<String> getAutoCallNumberList() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getAutoCallNumberList();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getAutoCallNumberList", (Class<?>[]) null, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getAutoCallNumberList", (Class<?>[]) null, 20));
        }
    }

    public int getAutoCallPickupState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getAutoCallPickupState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getAutoCallPickupState", (Class<?>[]) null, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getAutoCallPickupState", (Class<?>[]) null, 20));
        }
    }

    public boolean getAutoRotationState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getAutoRotationState();
        }
        return mKnoxCustomManager.getAutoRotationState();
    }

    public StatusbarIconItem getBatteryLevelColourItem() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return StatusbarIconItem.convertToNew(systemManager.getBatteryLevelColourItem());
        }
        try {
            return StatusbarIconItem.convertToNew(mKnoxCustomManager.getBatteryLevelColourItem());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getBatteryLevelColourItem", (Class<?>[]) null, 15));
        }
    }

    public int getCallScreenDisabledItems() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getCallScreenDisabledItems();
        }
        try {
            return mKnoxCustomManager.getCallScreenDisabledItems();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getCallScreenDisabledItems", (Class<?>[]) null, 15));
        }
    }

    public boolean getChargerConnectionSoundEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getChargerConnectionSoundEnabledState();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getChargerConnectionSoundEnabledState", (Class<?>[]) null, 17));
    }

    public boolean getCheckCoverPopupState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getCheckCoverPopupState();
        }
        try {
            return mKnoxCustomManager.getCheckCoverPopupState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getCheckCoverPopupState", (Class<?>[]) null, 14));
        }
    }

    public String getCustomOperatorName() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getCustomOperatorName();
        }
        try {
            return mKnoxCustomManager.getCustomOperatorName();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getCustomOperatorName", (Class<?>[]) null, 15));
        }
    }

    public boolean getDeviceSpeakerEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getDeviceSpeakerEnabledState();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getDeviceSpeakerEnabledState", (Class<?>[]) null, 17));
    }

    public boolean getDisplayMirroringState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getDisplayMirroringState();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getDisplayMirroringState", (Class<?>[]) null, 17));
    }

    public boolean getExtendedCallInfoState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getExtendedCallInfoState();
        }
        try {
            return mKnoxCustomManager.getExtendedCallInfoState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getExtendedCallInfoState", (Class<?>[]) null, 14));
        }
    }

    public int getForceAutoStartUpState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getForceAutoStartUpState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getForceAutoStartUpState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getForceAutoStartUpState", (Class<?>[]) null, 19));
        }
    }

    public boolean getGearNotificationState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getGearNotificationState();
        }
        try {
            return mKnoxCustomManager.getGearNotificationState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getGearNotificationState", (Class<?>[]) null, 15));
        }
    }

    public boolean getInfraredState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getInfraredState();
        }
        try {
            return mKnoxCustomManager.getInfraredState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getInfraredState", (Class<?>[]) null, 15));
        }
    }

    public int getKeyboardMode() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getKeyboardMode();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getKeyboardMode", (Class<?>[]) null, 17));
    }

    public boolean getLcdBacklightState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getLcdBacklightState();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getLcdBacklightState", (Class<?>[]) null, 17));
    }

    public int getLockScreenHiddenItems() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getLockScreenHiddenItems();
        }
        try {
            return mKnoxCustomManager.getLockScreenHiddenItems();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getLockScreenHiddenItems", (Class<?>[]) null, 15));
        }
    }

    public int getLockScreenOverrideMode() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getLockScreenOverrideMode();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getLockScreenOverrideMode", (Class<?>[]) null, 17));
    }

    public String getLockScreenShortcut(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getLockScreenShortcut(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getLockScreenShortcut", new Class[]{Integer.TYPE}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getLockScreenShortcut", new Class[]{Integer.TYPE}, 20));
        }
    }

    public String getMacAddress() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getMacAddress();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getMacAddress", (Class<?>[]) null, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getMacAddress", (Class<?>[]) null, 20));
        }
    }

    public int getMobileNetworkType() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getMobileNetworkType();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getMobileNetworkType", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getMobileNetworkType", (Class<?>[]) null, 19));
        }
    }

    public String getParentScreen(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getParentScreen(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getParentScreen", new Class[]{Integer.TYPE}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getParentScreen", new Class[]{Integer.TYPE}, 20));
        }
    }

    public List<PowerItem> getPowerDialogCustomItems() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return PowerItem.convertToNewList(systemManager.getPowerDialogCustomItems());
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getPowerDialogCustomItems", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getPowerDialogCustomItems", (Class<?>[]) null, 19));
        }
    }

    public boolean getPowerDialogCustomItemsState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getPowerDialogCustomItemsState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getPowerDialogCustomItemsState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getPowerDialogCustomItemsState", (Class<?>[]) null, 19));
        }
    }

    public boolean getPowerMenuLockedState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getPowerMenuLockedState();
        }
        try {
            return mKnoxCustomManager.getPowerMenuLockedState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getPowerMenuLockedState", (Class<?>[]) null, 15));
        }
    }

    public int getQuickPanelButtons() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getQuickPanelButtons();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getQuickPanelButtons", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getQuickPanelButtons", (Class<?>[]) null, 19));
        }
    }

    public int getQuickPanelEditMode() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getQuickPanelEditMode();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getQuickPanelEditMode", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getQuickPanelEditMode", (Class<?>[]) null, 19));
        }
    }

    public List<Integer> getQuickPanelItems() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getQuickPanelItems();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getQuickPanelItems", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getQuickPanelItems", (Class<?>[]) null, 19));
        }
    }

    public String getRecentLongPressActivity() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getRecentLongPressActivity();
        }
        try {
            return mKnoxCustomManager.getRecentLongPressActivity();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getRecentLongPressActivity", (Class<?>[]) null, 15));
        }
    }

    public int getRecentLongPressMode() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getRecentLongPressMode();
        }
        try {
            return mKnoxCustomManager.getRecentLongPressMode();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getRecentLongPressMode", (Class<?>[]) null, 15));
        }
    }

    public boolean getScreenOffOnHomeLongPressState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getScreenOffOnHomeLongPressState();
        }
        try {
            return mKnoxCustomManager.getScreenOffOnHomeLongPressState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getScreenOffOnHomeLongPressState", (Class<?>[]) null, 15));
        }
    }

    public boolean getScreenOffOnStatusBarDoubleTapState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getScreenOffOnStatusBarDoubleTapState();
        }
        try {
            return mKnoxCustomManager.getScreenOffOnStatusBarDoubleTapState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getScreenOffOnStatusBarDoubleTapState", (Class<?>[]) null, 15));
        }
    }

    public int getScreenTimeout() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getScreenTimeout();
        }
        return mKnoxCustomManager.getScreenTimeout();
    }

    public int getSensorDisabled() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getSensorDisabled();
        }
        try {
            return mKnoxCustomManager.getSensorDisabled();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getSensorDisabled", (Class<?>[]) null, 15));
        }
    }

    public boolean getStatusBarClockState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getStatusBarClockState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarClockState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarClockState", (Class<?>[]) null, 19));
        }
    }

    public boolean getStatusBarIconsState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getStatusBarIconsState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarIconsState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarIconsState", (Class<?>[]) null, 19));
        }
    }

    public int getStatusBarMode() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getStatusBarMode();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarMode", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarMode", (Class<?>[]) null, 19));
        }
    }

    public boolean getStatusBarNotificationsState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getStatusBarNotificationsState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarNotificationsState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getStatusBarNotificationsState", (Class<?>[]) null, 19));
        }
    }

    public String getStatusBarText() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getStatusBarText();
        }
        try {
            return mKnoxCustomManager.getStatusBarText();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getStatusBarText", (Class<?>[]) null, 15));
        }
    }

    public int getStatusBarTextScrollWidth() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getStatusBarTextScrollWidth();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getStatusBarTextScrollWidth", (Class<?>[]) null, 17));
    }

    public int getStatusBarTextSize() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getStatusBarTextSize();
        }
        try {
            return mKnoxCustomManager.getStatusBarTextSize();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getStatusBarTextSize", (Class<?>[]) null, 15));
        }
    }

    public int getStatusBarTextStyle() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getStatusBarTextStyle();
        }
        try {
            return mKnoxCustomManager.getStatusBarTextStyle();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getStatusBarTextStyle", (Class<?>[]) null, 15));
        }
    }

    public int getSystemSoundsEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getSystemSoundsEnabledState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getSystemSoundsEnabledState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getSystemSoundsEnabledState", (Class<?>[]) null, 19));
        }
    }

    public boolean getToastEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getToastEnabledState();
        }
        try {
            return mKnoxCustomManager.getToastEnabledState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getToastEnabledState", (Class<?>[]) null, 15));
        }
    }

    public int getToastGravity() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getToastGravity();
        }
        try {
            return mKnoxCustomManager.getToastGravity();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getToastGravity", (Class<?>[]) null, 15));
        }
    }

    public boolean getToastGravityEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getToastGravityEnabledState();
        }
        try {
            return mKnoxCustomManager.getToastGravityEnabledState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getToastGravityEnabledState", (Class<?>[]) null, 15));
        }
    }

    public int getToastGravityXOffset() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getToastGravityXOffset();
        }
        try {
            return mKnoxCustomManager.getToastGravityXOffset();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getToastGravityXOffset", (Class<?>[]) null, 15));
        }
    }

    public int getToastGravityYOffset() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getToastGravityYOffset();
        }
        try {
            return mKnoxCustomManager.getToastGravityYOffset();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getToastGravityYOffset", (Class<?>[]) null, 15));
        }
    }

    public boolean getToastShowPackageNameState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getToastShowPackageNameState();
        }
        try {
            return mKnoxCustomManager.getToastShowPackageNameState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getToastShowPackageNameState", (Class<?>[]) null, 15));
        }
    }

    public boolean getTorchOnVolumeButtonsState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getTorchOnVolumeButtonsState();
        }
        try {
            return mKnoxCustomManager.getTorchOnVolumeButtonsState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getTorchOnVolumeButtonsState", (Class<?>[]) null, 15));
        }
    }

    public List<String> getUltraPowerSavingPackages() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getUltraPowerSavingPackages();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getUltraPowerSavingPackages", (Class<?>[]) null, 17));
    }

    public boolean getUnlockSimOnBootState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getUnlockSimOnBootState();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getUnlockSimOnBootState", (Class<?>[]) null, 17));
    }

    public int getUsbConnectionType() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getUsbConnectionType();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getUsbConnectionType", (Class<?>[]) null, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getUsbConnectionType", (Class<?>[]) null, 20));
        }
    }

    public boolean getUsbMassStorageState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getUsbMassStorageState();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getUsbMassStorageState", (Class<?>[]) null, 17));
    }

    public String getUsbNetAddress(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getUsbNetAddress(i);
        }
        return mKnoxCustomManager.getSealedUsbNetAddress(i);
    }

    public boolean getUsbNetState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getUsbNetState();
        }
        return mKnoxCustomManager.getSealedUsbNetState();
    }

    public int getUserInactivityTimeout() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getUserInactivityTimeout();
        }
        return mKnoxCustomManager.getUserInactivityTimeout();
    }

    public int getVibrationIntensity(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getVibrationIntensity(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getVibrationIntensity", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getVibrationIntensity", new Class[]{Integer.TYPE}, 19));
        }
    }

    public boolean getVolumeButtonRotationState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getVolumeButtonRotationState();
        }
        try {
            return mKnoxCustomManager.getVolumeButtonRotationState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getVolumeButtonRotationState", (Class<?>[]) null, 15));
        }
    }

    public int getVolumeControlStream() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getVolumeControlStream();
        }
        try {
            return mKnoxCustomManager.getVolumeControlStream();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getVolumeControlStream", (Class<?>[]) null, 15));
        }
    }

    public boolean getVolumePanelEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getVolumePanelEnabledState();
        }
        try {
            return mKnoxCustomManager.getVolumePanelEnabledState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getVolumePanelEnabledState", (Class<?>[]) null, 15));
        }
    }

    public int getWifiAutoSwitchDelay() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getWifiAutoSwitchDelay();
        }
        try {
            return mKnoxCustomManager.getWifiAutoSwitchDelay();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getWifiAutoSwitchDelay", (Class<?>[]) null, 15));
        }
    }

    public boolean getWifiAutoSwitchState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getWifiAutoSwitchState();
        }
        try {
            return mKnoxCustomManager.getWifiAutoSwitchState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getWifiAutoSwitchState", (Class<?>[]) null, 15));
        }
    }

    public int getWifiAutoSwitchThreshold() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getWifiAutoSwitchThreshold();
        }
        try {
            return mKnoxCustomManager.getWifiAutoSwitchThreshold();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getWifiAutoSwitchThreshold", (Class<?>[]) null, 15));
        }
    }

    public boolean getWifiConnectedMessageState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.getWifiConnectedMessageState();
        }
        try {
            return mKnoxCustomManager.getWifiConnectedMessageState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "getWifiConnectedMessageState", (Class<?>[]) null, 15));
        }
    }

    public int getWifiHotspotEnabledState() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.getWifiHotspotEnabledState();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getWifiHotspotEnabledState", (Class<?>[]) null, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "getWifiHotspotEnabledState", (Class<?>[]) null, 19));
        }
    }

    public int powerOff() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.powerOff();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "powerOff", (Class<?>[]) null, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "powerOff", (Class<?>[]) null, 20));
        }
    }

    public int removeAutoCallNumber(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.removeAutoCallNumber(str);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removeAutoCallNumber", new Class[]{cls}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removeAutoCallNumber", new Class[]{cls}, 20));
        }
    }

    public int removeKnoxCustomShortcutsFromHomeScreen() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.removeKnoxCustomShortcutsFromHomeScreen();
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "removeKnoxCustomShortcutsFromHomeScreen", (Class<?>[]) null, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "removeKnoxCustomShortcutsFromHomeScreen", (Class<?>[]) null, 20));
        }
    }

    public int removeLockScreen() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.removeLockScreen();
        }
        return mKnoxCustomManager.removeLockScreen();
    }

    public int removePackageFromPowerSaveWhitelist(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.removePackageFromPowerSaveWhitelist(str);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removePackageFromPowerSaveWhitelist", new Class[]{cls}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removePackageFromPowerSaveWhitelist", new Class[]{cls}, 20));
        }
    }

    public int removePackagesFromUltraPowerSaving(List<String> list) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.removePackagesFromUltraPowerSaving(list);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "removePackagesFromUltraPowerSaving", new Class[]{List.class}, 17));
    }

    public int removeShortcutFromHomeScreen(int i, String str, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.removeShortcutFromHomeScreen(i, str, i8);
            } catch (NoSuchMethodError unused) {
                Class cls3 = Integer.TYPE;
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removeShortcutFromHomeScreen", new Class[]{cls3, cls, cls3}, 20));
            }
        } else {
            Class cls4 = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removeShortcutFromHomeScreen", new Class[]{cls4, cls, cls4}, 20));
        }
    }

    public int removeWidgetFromHomeScreen(Intent intent, int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<Intent> cls = Intent.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.removeWidgetFromHomeScreen(intent, i, i8);
            } catch (NoSuchMethodError unused) {
                Class cls3 = Integer.TYPE;
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removeWidgetFromHomeScreen", new Class[]{cls, cls3, cls3}, 20));
            }
        } else {
            Class cls4 = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "removeWidgetFromHomeScreen", new Class[]{cls, cls4, cls4}, 20));
        }
    }

    public int sendDtmfTone(char c8, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.sendDtmfTone(c8, i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "sendDtmfTone", new Class[]{Character.TYPE, Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "sendDtmfTone", new Class[]{Character.TYPE, Integer.TYPE}, 19));
        }
    }

    public int setAccessibilitySettingsItems(int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setAccessibilitySettingsItems(i, i8);
            } catch (NoSuchMethodError unused) {
                Class cls2 = Integer.TYPE;
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setAccessibilitySettingsItems", new Class[]{cls2, cls2}, 19));
            }
        } else {
            Class cls3 = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setAccessibilitySettingsItems", new Class[]{cls3, cls3}, 19));
        }
    }

    public int setAppBlockDownloadNamespaces(List<String> list) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setAppBlockDownloadNamespaces(list);
        }
        try {
            return mKnoxCustomManager.setAppBlockDownloadNamespaces(list);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setAppBlockDownloadNamespaces", new Class[]{List.class}, 15));
        }
    }

    public int setAppBlockDownloadState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setAppBlockDownloadState(z);
        }
        try {
            return mKnoxCustomManager.setAppBlockDownloadState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setAppBlockDownloadState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setAudioVolume(int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setAudioVolume(i, i8);
        }
        return mKnoxCustomManager.setAudioVolume(i, i8);
    }

    public int setAutoCallPickupState(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setAutoCallPickupState(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setAutoCallPickupState", new Class[]{Integer.TYPE}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setAutoCallPickupState", new Class[]{Integer.TYPE}, 20));
        }
    }

    public int setAutoRotationState(boolean z, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setAutoRotationState(z, i);
        }
        return mKnoxCustomManager.setAutoRotationState(z, i);
    }

    public int setBatteryLevelColourItem(StatusbarIconItem statusbarIconItem) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setBatteryLevelColourItem(StatusbarIconItem.convertToOld(statusbarIconItem));
        }
        try {
            return mKnoxCustomManager.setBatteryLevelColourItem(StatusbarIconItem.convertToOld(statusbarIconItem));
        } catch (NoClassDefFoundError e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public int setBootingAnimation(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if (systemManager != null) {
            try {
                return systemManager.setBootingAnimation(parcelFileDescriptor, parcelFileDescriptor2, parcelFileDescriptor3, i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setBootingAnimation", new Class[]{cls2, cls2, cls2, Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setBootingAnimation", new Class[]{cls2, cls2, cls2, Integer.TYPE}, 19));
        }
    }

    public int setBrowserHomepage(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setBrowserHomepage(str);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setBrowserHomepage", new Class[]{String.class}, 17));
    }

    public int setCallScreenDisabledItems(boolean z, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setCallScreenDisabledItems(z, i);
        }
        try {
            return mKnoxCustomManager.setCallScreenDisabledItems(z, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setCallScreenDisabledItems", new Class[]{Boolean.TYPE, Integer.TYPE}, 15));
        }
    }

    public int setChargerConnectionSoundEnabledState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setChargerConnectionSoundEnabledState(z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setChargerConnectionSoundEnabledState", new Class[]{Boolean.TYPE}, 17));
    }

    public int setCheckCoverPopupState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setCheckCoverPopupState(z);
        }
        try {
            return mKnoxCustomManager.setCheckCoverPopupState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setCheckCoverPopupState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setCustomOperatorName(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setCustomOperatorName(str);
        }
        try {
            return mKnoxCustomManager.setCustomOperatorName(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setCustomOperatorName", new Class[]{String.class}, 15));
        }
    }

    public int setDeviceSpeakerEnabledState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setDeviceSpeakerEnabledState(z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setDeviceSpeakerEnabledState", new Class[]{Boolean.TYPE}, 17));
    }

    public int setDisplayMirroringState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setDisplayMirroringState(z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setDisplayMirroringState", new Class[]{Boolean.TYPE}, 17));
    }

    public int setExtendedCallInfoState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setExtendedCallInfoState(z);
        }
        try {
            return mKnoxCustomManager.setExtendedCallInfoState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setExtendedCallInfoState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setForceAutoStartUpState(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setForceAutoStartUpState(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setForceAutoStartUpState", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setForceAutoStartUpState", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int setGearNotificationState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setGearNotificationState(z);
        }
        try {
            return mKnoxCustomManager.setGearNotificationState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setGearNotificationState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setInfraredState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setInfraredState(z);
        }
        try {
            return mKnoxCustomManager.setInfraredState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setInfraredState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setKeyboardMode(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setKeyboardMode(i);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setKeyboardMode", new Class[]{Integer.TYPE}, 17));
    }

    public int setLcdBacklightState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setLcdBacklightState(z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setLcdBacklightState", new Class[]{Boolean.TYPE}, 17));
    }

    public int setLockScreenHiddenItems(boolean z, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setLockScreenHiddenItems(z, i);
        }
        try {
            return mKnoxCustomManager.setLockScreenHiddenItems(z, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setLockScreenHiddenItems", new Class[]{Boolean.TYPE, Integer.TYPE}, 15));
        }
    }

    public int setLockScreenOverrideMode(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setLockScreenOverrideMode(i);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setLockScreenOverrideMode", new Class[]{Integer.TYPE}, 17));
    }

    public int setLockScreenShortcut(int i, String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<String> cls = String.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setLockScreenShortcut(i, str);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setLockScreenShortcut", new Class[]{Integer.TYPE, cls}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setLockScreenShortcut", new Class[]{Integer.TYPE, cls}, 20));
        }
    }

    public int setLockscreenWallpaper(String str, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setLockscreenWallpaper(str, i);
        }
        try {
            return mKnoxCustomManager.setLockscreenWallpaper(str, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setLockscreenWallpaper", new Class[]{String.class, Integer.TYPE}, 15));
        }
    }

    public int setMobileNetworkType(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setMobileNetworkType(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setMobileNetworkType", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setMobileNetworkType", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int setMultiWindowState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setMultiWindowState(z);
        }
        return mKnoxCustomManager.setMultiWindowState(z);
    }

    public int setPowerDialogCustomItems(List<PowerItem> list) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<List> cls = List.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setPowerDialogCustomItems(PowerItem.convertToOldList(list));
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setPowerDialogCustomItems", new Class[]{cls}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setPowerDialogCustomItems", new Class[]{cls}, 19));
        }
    }

    public int setPowerDialogCustomItemsState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setPowerDialogCustomItemsState(z);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setPowerDialogCustomItemsState", new Class[]{Boolean.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setPowerDialogCustomItemsState", new Class[]{Boolean.TYPE}, 19));
        }
    }

    public int setPowerMenuLockedState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setPowerMenuLockedState(z);
        }
        try {
            return mKnoxCustomManager.setPowerMenuLockedState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setPowerMenuLockedState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setQuickPanelButtons(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setQuickPanelButtons(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setQuickPanelButtons", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setQuickPanelButtons", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int setQuickPanelEditMode(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setQuickPanelEditMode(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setQuickPanelEditMode", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setQuickPanelEditMode", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int setQuickPanelItems(List<Integer> list) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<List> cls = List.class;
        Class<SystemManager> cls2 = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setQuickPanelItems(list);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setQuickPanelItems", new Class[]{cls}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls2, "setQuickPanelItems", new Class[]{cls}, 19));
        }
    }

    public int setRecentLongPressActivity(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setRecentLongPressActivity(str);
        }
        try {
            return mKnoxCustomManager.setRecentLongPressActivity(str);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setRecentLongPressActivity", new Class[]{String.class}, 15));
        }
    }

    public int setRecentLongPressMode(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setRecentLongPressMode(i);
        }
        try {
            return mKnoxCustomManager.setRecentLongPressMode(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setRecentLongPressMode", new Class[]{Integer.TYPE}, 15));
        }
    }

    public int setScreenOffOnHomeLongPressState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setScreenOffOnHomeLongPressState(z);
        }
        try {
            return mKnoxCustomManager.setScreenOffOnHomeLongPressState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setScreenOffOnHomeLongPressState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setScreenOffOnStatusBarDoubleTapState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setScreenOffOnStatusBarDoubleTapState(z);
        }
        try {
            return mKnoxCustomManager.setScreenOffOnStatusBarDoubleTapState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setScreenOffOnStatusBarDoubleTapState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setScreenTimeout(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setScreenTimeout(i);
        }
        return mKnoxCustomManager.setScreenTimeout(i);
    }

    public int setSensorDisabled(boolean z, int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setSensorDisabled(z, i);
        }
        try {
            return mKnoxCustomManager.setSensorDisabled(z, i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setSensorDisabled", new Class[]{Boolean.TYPE, Integer.TYPE}, 15));
        }
    }

    public int setShuttingDownAnimation(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if (systemManager != null) {
            try {
                return systemManager.setShuttingDownAnimation(parcelFileDescriptor, parcelFileDescriptor2);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setShuttingDownAnimation", new Class[]{cls2, cls2}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setShuttingDownAnimation", new Class[]{cls2, cls2}, 19));
        }
    }

    public int setStatusBarClockState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setStatusBarClockState(z);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarClockState", new Class[]{Boolean.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarClockState", new Class[]{Boolean.TYPE}, 19));
        }
    }

    public int setStatusBarIconsState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setStatusBarIconsState(z);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarIconsState", new Class[]{Boolean.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarIconsState", new Class[]{Boolean.TYPE}, 19));
        }
    }

    public int setStatusBarMode(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setStatusBarMode(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarMode", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarMode", new Class[]{Integer.TYPE}, 19));
        }
    }

    public int setStatusBarNotificationsState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setStatusBarNotificationsState(z);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarNotificationsState", new Class[]{Boolean.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setStatusBarNotificationsState", new Class[]{Boolean.TYPE}, 19));
        }
    }

    public int setStatusBarText(String str, int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setStatusBarText(str, i, i8);
        }
        try {
            return mKnoxCustomManager.setStatusBarText(str, i, i8);
        } catch (NoSuchMethodError unused) {
            Class cls = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setStatusBarText", new Class[]{String.class, cls, cls}, 15));
        }
    }

    public int setStatusBarTextScrollWidth(String str, int i, int i8, int i9) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setStatusBarTextScrollWidth(str, i, i8, i9);
        }
        Class cls = Integer.TYPE;
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setStatusBarTextScrollWidth", new Class[]{String.class, cls, cls, cls}, 17));
    }

    public int setSystemRingtone(int i, String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setSystemRingtone(i, str);
        }
        return mKnoxCustomManager.setSystemRingtone(i, str);
    }

    public int setSystemSoundsEnabledState(int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setSystemSoundsEnabledState(i, i8);
            } catch (NoSuchMethodError unused) {
                Class cls2 = Integer.TYPE;
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setSystemSoundsEnabledState", new Class[]{cls2, cls2}, 19));
            }
        } else {
            Class cls3 = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setSystemSoundsEnabledState", new Class[]{cls3, cls3}, 19));
        }
    }

    public int setSystemSoundsSilent() {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setSystemSoundsSilent();
        }
        try {
            return mKnoxCustomManager.setSystemSoundsSilent();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setSystemSoundsSilent", (Class<?>[]) null, 14));
        }
    }

    public int setToastEnabledState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setToastEnabledState(z);
        }
        try {
            return mKnoxCustomManager.setToastEnabledState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setToastEnabledState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setToastGravity(int i, int i8, int i9) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setToastGravity(i, i8, i9);
        }
        try {
            return mKnoxCustomManager.setToastGravity(i, i8, i9);
        } catch (NoSuchMethodError unused) {
            Class cls = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setToastGravity", new Class[]{cls, cls, cls}, 15));
        }
    }

    public int setToastGravityEnabledState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setToastGravityEnabledState(z);
        }
        try {
            return mKnoxCustomManager.setToastGravityEnabledState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setToastGravityEnabledState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setToastShowPackageNameState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setToastShowPackageNameState(z);
        }
        try {
            return mKnoxCustomManager.setToastShowPackageNameState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setToastShowPackageNameState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setTorchOnVolumeButtonsState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setTorchOnVolumeButtonsState(z);
        }
        try {
            return mKnoxCustomManager.setTorchOnVolumeButtonsState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setTorchOnVolumeButtonsState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setUnlockSimOnBootState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setUnlockSimOnBootState(z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setUnlockSimOnBootState", new Class[]{Boolean.TYPE}, 17));
    }

    public int setUnlockSimPin(String str) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setUnlockSimPin(str);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setUnlockSimPin", new Class[]{String.class}, 17));
    }

    public int setUsbConnectionType(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setUsbConnectionType(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setUsbConnectionType", new Class[]{Integer.TYPE}, 20));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setUsbConnectionType", new Class[]{Integer.TYPE}, 20));
        }
    }

    public int setUsbMassStorageState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setUsbMassStorageState(z);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setUsbMassStorageState", new Class[]{Boolean.TYPE}, 17));
    }

    public int setUsbNetAddresses(String str, String str2) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setUsbNetAddresses(str, str2);
        }
        return mKnoxCustomManager.setSealedUsbNetAddresses(str, str2);
    }

    public int setUsbNetState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setUsbNetState(z);
        }
        return mKnoxCustomManager.setSealedUsbNetState(z);
    }

    public int setUserInactivityTimeout(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setUserInactivityTimeout(i);
        }
        return mKnoxCustomManager.setUserInactivityTimeout(i);
    }

    public int setVibrationIntensity(int i, int i8) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setVibrationIntensity(i, i8);
            } catch (NoSuchMethodError unused) {
                Class cls2 = Integer.TYPE;
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setVibrationIntensity", new Class[]{cls2, cls2}, 19));
            }
        } else {
            Class cls3 = Integer.TYPE;
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setVibrationIntensity", new Class[]{cls3, cls3}, 19));
        }
    }

    public int setVolumeButtonRotationState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setVolumeButtonRotationState(z);
        }
        try {
            return mKnoxCustomManager.setVolumeButtonRotationState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setVolumeButtonRotationState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setVolumeControlStream(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setVolumeControlStream(i);
        }
        try {
            return mKnoxCustomManager.setVolumeControlStream(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setVolumeControlStream", new Class[]{Integer.TYPE}, 15));
        }
    }

    public int setVolumePanelEnabledState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setVolumePanelEnabledState(z);
        }
        try {
            return mKnoxCustomManager.setVolumePanelEnabledState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setVolumePanelEnabledState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setWifiAutoSwitchDelay(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setWifiAutoSwitchDelay(i);
        }
        try {
            return mKnoxCustomManager.setWifiAutoSwitchDelay(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setWifiAutoSwitchDelay", new Class[]{Integer.TYPE}, 15));
        }
    }

    public int setWifiAutoSwitchState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setWifiAutoSwitchState(z);
        }
        try {
            return mKnoxCustomManager.setWifiAutoSwitchState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setWifiAutoSwitchState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setWifiAutoSwitchThreshold(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setWifiAutoSwitchThreshold(i);
        }
        try {
            return mKnoxCustomManager.setWifiAutoSwitchThreshold(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setWifiAutoSwitchThreshold", new Class[]{Integer.TYPE}, 15));
        }
    }

    public int setWifiConnectedMessageState(boolean z) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        if (systemManager != null) {
            return systemManager.setWifiConnectedMessageState(z);
        }
        try {
            return mKnoxCustomManager.setWifiConnectedMessageState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(SystemManager.class, "setWifiConnectedMessageState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setWifiHotspotEnabledState(int i) {
        android.app.enterprise.knoxcustom.SystemManager systemManager = mSystemManager;
        Class<SystemManager> cls = SystemManager.class;
        if (systemManager != null) {
            try {
                return systemManager.setWifiHotspotEnabledState(i);
            } catch (NoSuchMethodError unused) {
                throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setWifiHotspotEnabledState", new Class[]{Integer.TYPE}, 19));
            }
        } else {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(cls, "setWifiHotspotEnabledState", new Class[]{Integer.TYPE}, 19));
        }
    }

    public SystemManager(KnoxCustomManager knoxCustomManager) {
        mKnoxCustomManager = knoxCustomManager;
    }
}
