package com.samsung.android.knox.kiosk;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class KioskSetting implements Parcelable {
    public static final Parcelable.Creator<KioskSetting> CREATOR = new Parcelable.Creator<KioskSetting>() {
        public KioskSetting createFromParcel(Parcel parcel) {
            return new KioskSetting(parcel);
        }

        public KioskSetting[] newArray(int i) {
            return new KioskSetting[i];
        }
    };
    public boolean airCommand;
    public boolean airView;
    public int blockedEdgeFunctions;
    public boolean clearAllNotifications;
    public List<Integer> hardwareKey;
    public boolean homeKey;
    public boolean multiWindow;
    public boolean navigationBar;
    public boolean settingsChanges;
    public boolean smartClip;
    public boolean statusBar;
    public boolean statusBarExpansion;
    public boolean systemBar;
    public boolean taskManager;
    public boolean wipeRecentTasks;

    public KioskSetting() {
    }

    public static android.app.enterprise.kioskmode.KioskSetting convertToOld(KioskSetting kioskSetting) {
        Class<KioskSetting> cls = KioskSetting.class;
        if (kioskSetting == null) {
            return null;
        }
        android.app.enterprise.kioskmode.KioskSetting kioskSetting2 = new android.app.enterprise.kioskmode.KioskSetting();
        kioskSetting2.ClearAllNotifications = kioskSetting.clearAllNotifications;
        kioskSetting2.HardwareKey = kioskSetting.hardwareKey;
        kioskSetting2.HomeKey = kioskSetting.homeKey;
        kioskSetting2.MultiWindow = kioskSetting.multiWindow;
        kioskSetting2.NavigationBar = kioskSetting.navigationBar;
        kioskSetting2.SettingsChanges = kioskSetting.settingsChanges;
        kioskSetting2.StatusBar = kioskSetting.statusBar;
        kioskSetting2.StatusBarExpansion = kioskSetting.statusBarExpansion;
        kioskSetting2.SystemBar = kioskSetting.systemBar;
        kioskSetting2.TaskManager = kioskSetting.taskManager;
        kioskSetting2.WipeRecentTasks = kioskSetting.wipeRecentTasks;
        try {
            kioskSetting2.AirCommand = kioskSetting.airCommand;
        } catch (NoSuchFieldError unused) {
            if (kioskSetting.airCommand) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "AirCommand", 13));
            }
        }
        try {
            kioskSetting2.AirView = kioskSetting.airView;
        } catch (NoSuchFieldError unused2) {
            if (kioskSetting.airView) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "AirView", 13));
            }
        }
        try {
            kioskSetting2.BlockedEdgeFunctions = kioskSetting.blockedEdgeFunctions;
        } catch (NoSuchFieldError unused3) {
            if (kioskSetting.blockedEdgeFunctions != 0) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "BlockedEdgeFunctions", 17));
            }
        }
        try {
            kioskSetting2.SmartClip = kioskSetting.smartClip;
        } catch (NoSuchFieldError unused4) {
            if (kioskSetting.smartClip) {
                throw new NoSuchFieldError(SupportLibUtils.buildFieldErrorMsg(cls, "SmartClip", 13));
            }
        }
        return kioskSetting2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.settingsChanges = z;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.statusBarExpansion = z6;
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.homeKey = z8;
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.airCommand = z9;
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.airView = z10;
        if (parcel.readInt() != 0) {
            int[] createIntArray = parcel.createIntArray();
            this.hardwareKey = new ArrayList();
            for (int num : createIntArray) {
                this.hardwareKey.add(new Integer(num));
            }
        }
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.multiWindow = z11;
        if (parcel.readInt() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.smartClip = z12;
        if (parcel.readInt() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.taskManager = z13;
        if (parcel.readInt() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.clearAllNotifications = z14;
        if (parcel.readInt() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.navigationBar = z15;
        if (parcel.readInt() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.statusBar = z16;
        if (parcel.readInt() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.systemBar = z17;
        if (parcel.readInt() != 0) {
            z18 = true;
        }
        this.wipeRecentTasks = z18;
        this.blockedEdgeFunctions = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.settingsChanges ? 1 : 0);
        parcel.writeInt(this.statusBarExpansion ? 1 : 0);
        parcel.writeInt(this.homeKey ? 1 : 0);
        parcel.writeInt(this.airCommand ? 1 : 0);
        parcel.writeInt(this.airView ? 1 : 0);
        if (this.hardwareKey != null) {
            parcel.writeInt(1);
            int[] iArr = new int[this.hardwareKey.size()];
            for (int i8 = 0; i8 != this.hardwareKey.size(); i8++) {
                iArr[i8] = this.hardwareKey.get(i8).intValue();
            }
            parcel.writeIntArray(iArr);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.multiWindow ? 1 : 0);
        parcel.writeInt(this.smartClip ? 1 : 0);
        parcel.writeInt(this.taskManager ? 1 : 0);
        parcel.writeInt(this.clearAllNotifications ? 1 : 0);
        parcel.writeInt(this.navigationBar ? 1 : 0);
        parcel.writeInt(this.statusBar ? 1 : 0);
        parcel.writeInt(this.systemBar ? 1 : 0);
        parcel.writeInt(this.wipeRecentTasks ? 1 : 0);
        parcel.writeInt(this.blockedEdgeFunctions);
    }

    public KioskSetting(Parcel parcel) {
        readFromParcel(parcel);
    }
}
