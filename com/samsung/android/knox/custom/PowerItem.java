package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomPowerItem;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.container.KnoxContainerManager;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PowerItem implements Parcelable {
    public static final Parcelable.Creator<PowerItem> CREATOR = new Parcelable.Creator<PowerItem>() {
        public PowerItem createFromParcel(Parcel parcel) {
            return new PowerItem(parcel);
        }

        public PowerItem[] newArray(int i) {
            return new PowerItem[i];
        }
    };
    private BitmapDrawable mIcon;
    private int mId;
    private Intent mIntent;
    private int mIntentAction;
    private String mText;

    public static PowerItem convertToNew(KnoxCustomPowerItem knoxCustomPowerItem) {
        if (knoxCustomPowerItem == null) {
            return null;
        }
        return new PowerItem(knoxCustomPowerItem.getId(), knoxCustomPowerItem.getIcon(), knoxCustomPowerItem.getIntent(), knoxCustomPowerItem.getIntentAction(), knoxCustomPowerItem.getText());
    }

    public static List<PowerItem> convertToNewList(List<KnoxCustomPowerItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (KnoxCustomPowerItem convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static KnoxCustomPowerItem convertToOld(PowerItem powerItem) {
        if (powerItem == null) {
            return null;
        }
        try {
            return new KnoxCustomPowerItem(powerItem.getId(), powerItem.getIcon(), powerItem.getIntent(), powerItem.getIntentAction(), powerItem.getText());
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(PowerItem.class, 14));
        }
    }

    public static List<KnoxCustomPowerItem> convertToOldList(List<PowerItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (PowerItem convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public BitmapDrawable getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public int getIntentAction() {
        return this.mIntentAction;
    }

    public String getText() {
        return this.mText;
    }

    public String toString() {
        return "descr:" + describeContents() + " id:" + this.mId + " icon:" + this.mIcon.hashCode() + " intent:" + this.mIntent.toString() + " intentAction:" + this.mIntentAction + " text:" + this.mText;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KnoxContainerManager.INTENT_BUNDLE, this.mIntent);
        parcel.writeBundle(bundle);
        parcel.writeInt(this.mIntentAction);
        parcel.writeInt(this.mId);
        parcel.writeString(this.mText);
        Bitmap bitmap = this.mIcon.getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public PowerItem(int i, BitmapDrawable bitmapDrawable, Intent intent, int i8, String str) {
        this.mId = i;
        this.mIcon = bitmapDrawable;
        this.mIntent = intent;
        this.mIntentAction = i8;
        this.mText = str;
    }

    private PowerItem(Parcel parcel) {
        this.mIntent = (Intent) parcel.readBundle().getParcelable(KnoxContainerManager.INTENT_BUNDLE);
        this.mIntentAction = parcel.readInt();
        this.mId = parcel.readInt();
        this.mText = parcel.readString();
        int readInt = parcel.readInt();
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        this.mIcon = new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, readInt));
    }
}
