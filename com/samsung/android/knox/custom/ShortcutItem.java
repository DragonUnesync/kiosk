package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomShortcutItem;
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

public class ShortcutItem implements Parcelable {
    public static final Parcelable.Creator<ShortcutItem> CREATOR = new Parcelable.Creator<ShortcutItem>() {
        public ShortcutItem createFromParcel(Parcel parcel) {
            return new ShortcutItem(parcel);
        }

        public ShortcutItem[] newArray(int i) {
            return new ShortcutItem[i];
        }
    };
    private int mCellX;
    private int mCellY;
    private int mColour;
    private int mFolderPosition;
    private BitmapDrawable mIcon;
    private Intent mIntent;
    private int mMoreItems;
    private String mName;
    private String mParent;
    private int mShortcutType;

    public static KnoxCustomShortcutItem convertToOld(ShortcutItem shortcutItem) {
        if (shortcutItem == null) {
            return null;
        }
        try {
            return new KnoxCustomShortcutItem(shortcutItem.getShortcutType(), shortcutItem.getName(), shortcutItem.getIntent(), shortcutItem.getParent(), shortcutItem.getFolderPosition(), shortcutItem.getCellX(), shortcutItem.getCellY(), shortcutItem.getColour(), shortcutItem.getIcon(), shortcutItem.getMoreItems());
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(ShortcutItem.class, 20));
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getCellX() {
        return this.mCellX;
    }

    public int getCellY() {
        return this.mCellY;
    }

    public int getColour() {
        return this.mColour;
    }

    public int getFolderPosition() {
        return this.mFolderPosition;
    }

    public BitmapDrawable getIcon() {
        return this.mIcon;
    }

    public byte[] getIconArray() {
        BitmapDrawable bitmapDrawable = this.mIcon;
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
        }
        return null;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public int getMoreItems() {
        return this.mMoreItems;
    }

    public String getName() {
        return this.mName;
    }

    public String getParent() {
        return this.mParent;
    }

    public int getShortcutType() {
        return this.mShortcutType;
    }

    public String toString() {
        return "descr:" + describeContents() + " shortcutType:" + this.mShortcutType + " name:" + this.mName + " parent:" + this.mParent + " intent:" + this.mIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KnoxContainerManager.INTENT_BUNDLE, this.mIntent);
        parcel.writeBundle(bundle);
        parcel.writeInt(this.mShortcutType);
        parcel.writeString(this.mName);
        parcel.writeString(this.mParent);
        parcel.writeInt(this.mFolderPosition);
        parcel.writeInt(this.mCellX);
        parcel.writeInt(this.mCellY);
        parcel.writeInt(this.mColour);
        parcel.writeInt(this.mMoreItems);
        byte[] iconArray = getIconArray();
        if (iconArray != null) {
            parcel.writeInt(iconArray.length);
            parcel.writeByteArray(iconArray);
            return;
        }
        parcel.writeInt(0);
    }

    public ShortcutItem(int i, String str, Intent intent, String str2, int i8, int i9, int i10, int i11, BitmapDrawable bitmapDrawable, int i12) {
        this.mShortcutType = i;
        this.mName = str;
        this.mIntent = intent;
        this.mParent = str2;
        this.mFolderPosition = i8;
        this.mCellX = i9;
        this.mCellY = i10;
        this.mColour = i11;
        this.mIcon = bitmapDrawable;
        this.mMoreItems = i12;
    }

    public ShortcutItem(int i, String str, Intent intent, String str2, int i8, int i9, int i10) {
        this.mFolderPosition = 0;
        this.mColour = 0;
        this.mIcon = null;
        this.mShortcutType = i;
        this.mName = str;
        this.mIntent = intent;
        this.mParent = str2;
        this.mCellX = i8;
        this.mCellY = i9;
        this.mMoreItems = i10;
    }

    public ShortcutItem(int i, String str, Intent intent, String str2, int i8, int i9) {
        this.mCellX = 0;
        this.mCellY = 0;
        this.mColour = 0;
        this.mIcon = null;
        this.mShortcutType = i;
        this.mName = str;
        this.mIntent = intent;
        this.mParent = str2;
        this.mFolderPosition = i8;
        this.mMoreItems = i9;
    }

    public ShortcutItem(int i, String str, Intent intent, String str2, int i8, int i9, BitmapDrawable bitmapDrawable, int i10) {
        this.mFolderPosition = 0;
        this.mColour = 0;
        this.mShortcutType = i;
        this.mName = str;
        this.mIntent = intent;
        this.mParent = str2;
        this.mCellX = i8;
        this.mCellY = i9;
        this.mIcon = bitmapDrawable;
        this.mMoreItems = i10;
    }

    public ShortcutItem(int i, String str, Intent intent, String str2, int i8, BitmapDrawable bitmapDrawable, int i9) {
        this.mCellX = 0;
        this.mCellY = 0;
        this.mColour = 0;
        this.mShortcutType = i;
        this.mName = str;
        this.mIntent = intent;
        this.mParent = str2;
        this.mFolderPosition = i8;
        this.mIcon = bitmapDrawable;
        this.mMoreItems = i9;
    }

    public ShortcutItem(int i, String str, String str2, int i8, int i9, int i10, int i11) {
        this.mFolderPosition = 0;
        this.mIcon = null;
        this.mShortcutType = i;
        this.mName = str;
        this.mParent = str2;
        this.mCellX = i8;
        this.mCellY = i9;
        this.mColour = i10;
        this.mMoreItems = i11;
    }

    private ShortcutItem(Parcel parcel) {
        this.mShortcutType = 1;
        this.mFolderPosition = 0;
        this.mCellX = 0;
        this.mCellY = 0;
        this.mColour = 0;
        this.mIcon = null;
        this.mMoreItems = 1;
        this.mIntent = (Intent) parcel.readBundle().getParcelable(KnoxContainerManager.INTENT_BUNDLE);
        this.mShortcutType = parcel.readInt();
        this.mName = parcel.readString();
        this.mParent = parcel.readString();
        this.mFolderPosition = parcel.readInt();
        this.mCellX = parcel.readInt();
        this.mCellY = parcel.readInt();
        this.mColour = parcel.readInt();
        this.mMoreItems = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            this.mIcon = new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, readInt));
        }
    }
}
