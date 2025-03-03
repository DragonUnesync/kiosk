package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomManager;
import com.samsung.android.knox.SupportLibUtils;
import java.util.List;

public class ProKioskManager {
    private static KnoxCustomManager mKnoxCustomManager;
    private static android.app.enterprise.knoxcustom.ProKioskManager mProKioskManager;

    public ProKioskManager(android.app.enterprise.knoxcustom.ProKioskManager proKioskManager) {
        mProKioskManager = proKioskManager;
    }

    public String getExitUI(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getExitUI(i);
        }
        return mKnoxCustomManager.getSealedExitUI(i);
    }

    public boolean getHardKeyIntentState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getHardKeyIntentState();
        }
        try {
            return mKnoxCustomManager.getSealedHardKeyIntentState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getHardKeyIntentState", (Class<?>[]) null, 15));
        }
    }

    public int getHideNotificationMessages() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getHideNotificationMessages();
        }
        try {
            return mKnoxCustomManager.getSealedHideNotificationMessages();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getHideNotificationMessages", (Class<?>[]) null, 14));
        }
    }

    public String getHomeActivity() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getHomeActivity();
        }
        return mKnoxCustomManager.getSealedHomeActivity();
    }

    public boolean getInputMethodRestrictionState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getInputMethodRestrictionState();
        }
        return mKnoxCustomManager.getSealedInputMethodRestrictionState();
    }

    public int getMultiWindowFixedState(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getMultiWindowFixedState(i);
        }
        return mKnoxCustomManager.getSealedMultiWindowFixedState(i);
    }

    public List<PowerItem> getPowerDialogCustomItems() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return PowerItem.convertToNewList(proKioskManager.getPowerDialogCustomItems());
        }
        try {
            return PowerItem.convertToNewList(mKnoxCustomManager.getSealedPowerDialogCustomItems());
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getPowerDialogCustomItems", (Class<?>[]) null, 14));
        }
    }

    public boolean getPowerDialogCustomItemsState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getPowerDialogCustomItemsState();
        }
        try {
            return mKnoxCustomManager.getSealedPowerDialogCustomItemsState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getPowerDialogCustomItemsState", (Class<?>[]) null, 14));
        }
    }

    public int getPowerDialogItems() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getPowerDialogItems();
        }
        try {
            return mKnoxCustomManager.getSealedPowerDialogItems();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getPowerDialogItems", (Class<?>[]) null, 14));
        }
    }

    public int getPowerDialogOptionMode() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getPowerDialogOptionMode();
        }
        return mKnoxCustomManager.getSealedPowerDialogOptionMode();
    }

    public boolean getProKioskState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getProKioskState();
        }
        return mKnoxCustomManager.getSealedState();
    }

    public String getProKioskString(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getProKioskString(i);
        }
        return mKnoxCustomManager.getSealedModeString(i);
    }

    public int getSettingsEnabledItems() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getSettingsEnabledItems();
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getSettingsEnabledItems", (Class<?>[]) null, 17));
    }

    public boolean getStatusBarClockState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getStatusBarClockState();
        }
        return mKnoxCustomManager.getSealedStatusBarClockState();
    }

    public boolean getStatusBarIconsState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getStatusBarIconsState();
        }
        return mKnoxCustomManager.getSealedStatusBarIconsState();
    }

    public int getStatusBarMode() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getStatusBarMode();
        }
        return mKnoxCustomManager.getSealedStatusBarMode();
    }

    public boolean getUsbMassStorageState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getUsbMassStorageState();
        }
        return mKnoxCustomManager.getSealedUsbMassStorageState();
    }

    public String getUsbNetAddress(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getUsbNetAddress(i);
        }
        return mKnoxCustomManager.getSealedUsbNetAddress(i);
    }

    public boolean getUsbNetState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getUsbNetState();
        }
        return mKnoxCustomManager.getSealedUsbNetState();
    }

    public boolean getVolumeKeyAppState() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getVolumeKeyAppState();
        }
        try {
            return mKnoxCustomManager.getSealedVolumeKeyAppState();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getVolumeKeyAppState", (Class<?>[]) null, 15));
        }
    }

    public List<String> getVolumeKeyAppsList() {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.getVolumeKeyAppsList();
        }
        try {
            return mKnoxCustomManager.getSealedVolumeKeyAppsList();
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "getVolumeKeyAppsList", (Class<?>[]) null, 15));
        }
    }

    public int setExitUI(String str, String str2) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setExitUI(str, str2);
        }
        return mKnoxCustomManager.setSealedExitUI(str, str2);
    }

    public int setHardKeyIntentState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setHardKeyIntentState(z);
        }
        try {
            return mKnoxCustomManager.setSealedHardKeyIntentState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setHardKeyIntentState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setHideNotificationMessages(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setHideNotificationMessages(i);
        }
        try {
            return mKnoxCustomManager.setSealedHideNotificationMessages(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setHideNotificationMessages", new Class[]{Integer.TYPE}, 14));
        }
    }

    public int setHomeActivity(String str) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setHomeActivity(str);
        }
        return mKnoxCustomManager.setSealedHomeActivity(str);
    }

    public int setInputMethodRestrictionState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setInputMethodRestrictionState(z);
        }
        return mKnoxCustomManager.setSealedInputMethodRestrictionState(z);
    }

    public int setMultiWindowFixedState(int i, int i8) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setMultiWindowFixedState(i, i8);
        }
        return mKnoxCustomManager.setSealedMultiWindowFixedState(i, i8);
    }

    public int setPassCode(String str, String str2) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setPassCode(str, str2);
        }
        return mKnoxCustomManager.setSealedPassCode(str, str2);
    }

    public int setPowerDialogCustomItems(List<PowerItem> list) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setPowerDialogCustomItems(PowerItem.convertToOldList(list));
        }
        try {
            return mKnoxCustomManager.setSealedPowerDialogCustomItems(PowerItem.convertToOldList(list));
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setPowerDialogCustomItems", new Class[]{List.class}, 14));
        }
    }

    public int setPowerDialogCustomItemsState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setPowerDialogCustomItemsState(z);
        }
        try {
            return mKnoxCustomManager.setSealedPowerDialogCustomItemsState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setPowerDialogCustomItemsState", new Class[]{Boolean.TYPE}, 14));
        }
    }

    public int setPowerDialogItems(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setPowerDialogItems(i);
        }
        try {
            return mKnoxCustomManager.setSealedPowerDialogItems(i);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setPowerDialogItems", new Class[]{Integer.TYPE}, 14));
        }
    }

    public int setPowerDialogOptionMode(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setPowerDialogOptionMode(i);
        }
        return mKnoxCustomManager.setSealedPowerDialogOptionMode(i);
    }

    public int setProKioskState(boolean z, String str) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setProKioskState(z, str);
        }
        return mKnoxCustomManager.setSealedState(z, str);
    }

    public int setProKioskString(int i, String str) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setProKioskString(i, str);
        }
        return mKnoxCustomManager.setSealedModeString(i, str);
    }

    public int setSettingsEnabledItems(boolean z, int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setSettingsEnabledItems(z, i);
        }
        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setSettingsEnabledItems", new Class[]{Boolean.TYPE, Integer.TYPE}, 17));
    }

    public int setStatusBarClockState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setStatusBarClockState(z);
        }
        return mKnoxCustomManager.setSealedStatusBarClockState(z);
    }

    public int setStatusBarIconsState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setStatusBarIconsState(z);
        }
        return mKnoxCustomManager.setSealedStatusBarIconsState(z);
    }

    public int setStatusBarMode(int i) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setStatusBarMode(i);
        }
        return mKnoxCustomManager.setSealedStatusBarMode(i);
    }

    public int setUsbMassStorageState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setUsbMassStorageState(z);
        }
        return mKnoxCustomManager.setSealedUsbMassStorageState(z);
    }

    public int setUsbNetAddresses(String str, String str2) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setUsbNetAddresses(str, str2);
        }
        return mKnoxCustomManager.setSealedUsbNetAddresses(str, str2);
    }

    public int setUsbNetState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setUsbNetState(z);
        }
        return mKnoxCustomManager.setSealedUsbNetState(z);
    }

    public int setVolumeKeyAppState(boolean z) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setVolumeKeyAppState(z);
        }
        try {
            return mKnoxCustomManager.setSealedVolumeKeyAppState(z);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setVolumeKeyAppState", new Class[]{Boolean.TYPE}, 15));
        }
    }

    public int setVolumeKeyAppsList(List<String> list) {
        android.app.enterprise.knoxcustom.ProKioskManager proKioskManager = mProKioskManager;
        if (proKioskManager != null) {
            return proKioskManager.setVolumeKeyAppsList(list);
        }
        try {
            return mKnoxCustomManager.setSealedVolumeKeyAppsList(list);
        } catch (NoSuchMethodError unused) {
            throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(ProKioskManager.class, "setVolumeKeyAppsList", new Class[]{List.class}, 15));
        }
    }

    public ProKioskManager(KnoxCustomManager knoxCustomManager) {
        mKnoxCustomManager = knoxCustomManager;
    }
}
