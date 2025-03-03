package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomStatusbarIconItem;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;

public class StatusbarIconItem implements Parcelable {
    public static final Parcelable.Creator<StatusbarIconItem> CREATOR = new Parcelable.Creator<StatusbarIconItem>() {
        public StatusbarIconItem createFromParcel(Parcel parcel) {
            return new StatusbarIconItem(parcel);
        }

        public StatusbarIconItem[] newArray(int i) {
            return new StatusbarIconItem[i];
        }
    };
    private AttributeColour[] mAttributeColour;
    private int mIcon;

    public static StatusbarIconItem convertToNew(KnoxCustomStatusbarIconItem knoxCustomStatusbarIconItem) {
        if (knoxCustomStatusbarIconItem == null) {
            return null;
        }
        StatusbarIconItem statusbarIconItem = new StatusbarIconItem(knoxCustomStatusbarIconItem.getIcon(), (AttributeColour[]) null);
        if (knoxCustomStatusbarIconItem.getAttributeColourArray() != null) {
            AttributeColour[] attributeColourArr = new AttributeColour[knoxCustomStatusbarIconItem.getAttributeColourArray().length];
            for (int i = 0; i < knoxCustomStatusbarIconItem.getAttributeColourArray().length; i++) {
                if (knoxCustomStatusbarIconItem.getAttributeColour(i) != null) {
                    attributeColourArr[i] = new AttributeColour(knoxCustomStatusbarIconItem.getAttributeColour(i).getAttribute(), knoxCustomStatusbarIconItem.getAttributeColour(i).getColour());
                } else {
                    attributeColourArr[i] = null;
                }
            }
            statusbarIconItem.setAttributeColourArray(attributeColourArr);
        }
        return statusbarIconItem;
    }

    public static KnoxCustomStatusbarIconItem convertToOld(StatusbarIconItem statusbarIconItem) {
        KnoxCustomStatusbarIconItem.AttributeColour[] attributeColourArr = null;
        if (statusbarIconItem == null) {
            return null;
        }
        try {
            KnoxCustomStatusbarIconItem knoxCustomStatusbarIconItem = new KnoxCustomStatusbarIconItem(statusbarIconItem.getIcon(), (KnoxCustomStatusbarIconItem.AttributeColour[]) null);
            if (statusbarIconItem.getAttributeColourArray() != null) {
                KnoxCustomStatusbarIconItem.AttributeColour[] attributeColourArr2 = new KnoxCustomStatusbarIconItem.AttributeColour[statusbarIconItem.getAttributeColourArray().length];
                for (int i = 0; i < statusbarIconItem.getAttributeColourArray().length; i++) {
                    if (statusbarIconItem.getAttributeColour(i) != null) {
                        attributeColourArr2[i] = new KnoxCustomStatusbarIconItem.AttributeColour(knoxCustomStatusbarIconItem, statusbarIconItem.getAttributeColour(i).getAttribute(), statusbarIconItem.getAttributeColour(i).getColour());
                    } else {
                        attributeColourArr2[i] = null;
                    }
                }
                attributeColourArr = attributeColourArr2;
            }
            return new KnoxCustomStatusbarIconItem(statusbarIconItem.getIcon(), attributeColourArr);
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(StatusbarIconItem.class, 15));
        }
    }

    private void setAttributeColourArray(AttributeColour[] attributeColourArr) {
        this.mAttributeColour = attributeColourArr;
    }

    public int describeContents() {
        return 0;
    }

    public AttributeColour getAttributeColour(int i) {
        AttributeColour[] attributeColourArr = this.mAttributeColour;
        if (attributeColourArr == null || attributeColourArr.length <= i) {
            return null;
        }
        return attributeColourArr[i];
    }

    public AttributeColour[] getAttributeColourArray() {
        return this.mAttributeColour;
    }

    public int getIcon() {
        return this.mIcon;
    }

    public void setAttributeColour(int i, int i8, int i9) {
        AttributeColour[] attributeColourArr = this.mAttributeColour;
        if (attributeColourArr != null && attributeColourArr.length > i) {
            attributeColourArr[i] = new AttributeColour(i8, i9);
        }
    }

    public String toString() {
        return "descr:" + describeContents() + " icon:" + this.mIcon + " attributeColour:" + this.mAttributeColour;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i8;
        parcel.writeInt(this.mIcon);
        AttributeColour[] attributeColourArr = this.mAttributeColour;
        if (attributeColourArr != null) {
            i8 = attributeColourArr.length;
        } else {
            i8 = 0;
        }
        parcel.writeInt(i8);
        if (i8 > 0) {
            for (AttributeColour attributeColour : this.mAttributeColour) {
                parcel.writeInt(attributeColour.getAttribute());
                parcel.writeInt(attributeColour.getColour());
            }
        }
    }

    public StatusbarIconItem(int i, AttributeColour[] attributeColourArr) {
        this.mIcon = i;
        this.mAttributeColour = attributeColourArr;
    }

    public class AttributeColour {
        private int mAttribute;
        private int mColour;

        public AttributeColour() {
            this.mAttribute = 0;
            this.mColour = 0;
        }

        public int getAttribute() {
            return this.mAttribute;
        }

        public int getColour() {
            return this.mColour;
        }

        public void setAttributeColour(int i, int i8) {
            this.mAttribute = i;
            this.mColour = i8;
        }

        public AttributeColour(int i, int i8) {
            this.mAttribute = i;
            this.mColour = i8;
        }
    }

    private StatusbarIconItem(Parcel parcel) {
        this.mIcon = parcel.readInt();
        int readInt = parcel.readInt();
        this.mAttributeColour = null;
        if (readInt > 0) {
            this.mAttributeColour = new AttributeColour[readInt];
            for (int i = 0; i < readInt; i++) {
                this.mAttributeColour[i] = new AttributeColour(parcel.readInt(), parcel.readInt());
            }
        }
    }
}
