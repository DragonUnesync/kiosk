package com.samsung.android.knox.container;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.samsung.android.knox.SupportLibUtils;

public class LightweightConfigurationType extends KnoxConfigurationType {
    public static final Parcelable.Creator<LightweightConfigurationType> CREATOR = new Parcelable.Creator<LightweightConfigurationType>() {
        public LightweightConfigurationType createFromParcel(Parcel parcel) {
            return new LightweightConfigurationType(parcel);
        }

        public LightweightConfigurationType[] newArray(int i) {
            Log.d(LightweightConfigurationType.TAG, "LightweightConfigurationType[] array to be created");
            return new LightweightConfigurationType[i];
        }
    };
    private static final String TAG = "LightweightConfigurationType";
    private String mFolderDisabledChangeLayout = null;
    private String mFolderHeaderIcon = null;
    private String mFolderHeaderTitle = null;

    private LightweightConfigurationType() {
    }

    public static LightweightConfigurationType convertToNew(com.sec.enterprise.knox.container.LightweightConfigurationType lightweightConfigurationType) {
        if (lightweightConfigurationType == null) {
            return null;
        }
        LightweightConfigurationType lightweightConfigurationType2 = new LightweightConfigurationType();
        KnoxConfigurationType.convertToNew(lightweightConfigurationType2, lightweightConfigurationType);
        lightweightConfigurationType2.setFolderHeaderTitle(lightweightConfigurationType.getFolderHeaderTitle());
        return lightweightConfigurationType2;
    }

    public static com.sec.enterprise.knox.container.LightweightConfigurationType convertToOld(LightweightConfigurationType lightweightConfigurationType) {
        if (lightweightConfigurationType == null) {
            return null;
        }
        try {
            com.sec.enterprise.knox.container.LightweightConfigurationType lightweightConfigurationType2 = new com.sec.enterprise.knox.container.LightweightConfigurationType();
            KnoxConfigurationType.convertToOld(lightweightConfigurationType, lightweightConfigurationType2);
            lightweightConfigurationType2.setFolderHeaderTitle(lightweightConfigurationType.getFolderHeaderTitle());
            return lightweightConfigurationType2;
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(LightweightConfigurationType.class, 12));
        }
    }

    private void setFolderDisabledChangeLayout(String str) {
        this.mFolderDisabledChangeLayout = str;
    }

    private void setFolderHeaderIcon(String str) {
        this.mFolderHeaderIcon = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getFolderHeaderTitle() {
        return this.mFolderHeaderTitle;
    }

    public void setFolderHeaderTitle(String str) {
        this.mFolderHeaderTitle = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        String str = this.mFolderHeaderIcon;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("");
        }
        String str2 = this.mFolderHeaderTitle;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("");
        }
        String str3 = this.mFolderDisabledChangeLayout;
        if (str3 != null) {
            parcel.writeString(str3);
        } else {
            parcel.writeString("");
        }
    }

    public LightweightConfigurationType clone(String str) {
        if (str == null || str.isEmpty()) {
            Log.d(TAG, "clone(): name is either null or empty, hence returning null");
            return null;
        }
        LightweightConfigurationType lightweightConfigurationType = new LightweightConfigurationType();
        cloneConfiguration(lightweightConfigurationType, str);
        lightweightConfigurationType.setFolderHeaderIcon(this.mFolderHeaderIcon);
        lightweightConfigurationType.setFolderHeaderTitle(this.mFolderHeaderTitle);
        lightweightConfigurationType.setFolderDisabledChangeLayout(this.mFolderDisabledChangeLayout);
        return lightweightConfigurationType;
    }

    public LightweightConfigurationType(Parcel parcel) {
        super(parcel);
        String str = null;
        String readString = parcel.readString();
        this.mFolderHeaderIcon = (readString == null || readString.isEmpty()) ? null : readString;
        String readString2 = parcel.readString();
        this.mFolderHeaderTitle = (readString2 == null || readString2.isEmpty()) ? null : readString2;
        String readString3 = parcel.readString();
        if (readString3 != null && !readString3.isEmpty()) {
            str = readString3;
        }
        this.mFolderDisabledChangeLayout = str;
    }
}
