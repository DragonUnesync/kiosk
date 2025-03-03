package com.samsung.android.knox.application;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;
import java.util.List;

public class UsbDeviceConfig implements Parcelable {
    public static final Parcelable.Creator<UsbDeviceConfig> CREATOR = new Parcelable.Creator<UsbDeviceConfig>() {
        public UsbDeviceConfig createFromParcel(Parcel parcel) {
            return new UsbDeviceConfig(parcel);
        }

        public UsbDeviceConfig[] newArray(int i) {
            return new UsbDeviceConfig[i];
        }
    };
    public int productId;
    public int vendorId;

    public static UsbDeviceConfig convertToNew(android.app.enterprise.UsbDeviceConfig usbDeviceConfig) {
        if (usbDeviceConfig == null) {
            return null;
        }
        UsbDeviceConfig usbDeviceConfig2 = new UsbDeviceConfig();
        usbDeviceConfig2.productId = usbDeviceConfig.productId;
        usbDeviceConfig2.vendorId = usbDeviceConfig.vendorId;
        return usbDeviceConfig2;
    }

    public static List<UsbDeviceConfig> convertToNewList(List<android.app.enterprise.UsbDeviceConfig> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.app.enterprise.UsbDeviceConfig convertToNew : list) {
            arrayList.add(convertToNew(convertToNew));
        }
        return arrayList;
    }

    public static android.app.enterprise.UsbDeviceConfig convertToOld(UsbDeviceConfig usbDeviceConfig) {
        if (usbDeviceConfig == null) {
            return null;
        }
        try {
            android.app.enterprise.UsbDeviceConfig usbDeviceConfig2 = new android.app.enterprise.UsbDeviceConfig();
            usbDeviceConfig2.vendorId = usbDeviceConfig.vendorId;
            usbDeviceConfig2.productId = usbDeviceConfig.productId;
            return usbDeviceConfig2;
        } catch (NoClassDefFoundError unused) {
            throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UsbDeviceConfig.class, 12));
        }
    }

    public static List<android.app.enterprise.UsbDeviceConfig> convertToOldList(List<UsbDeviceConfig> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UsbDeviceConfig convertToOld : list) {
            arrayList.add(convertToOld(convertToOld));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
        r4 = (com.samsung.android.knox.application.UsbDeviceConfig) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof com.samsung.android.knox.application.UsbDeviceConfig
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            com.samsung.android.knox.application.UsbDeviceConfig r4 = (com.samsung.android.knox.application.UsbDeviceConfig) r4
            int r1 = r4.vendorId
            if (r1 <= 0) goto L_0x001e
            int r4 = r4.productId
            if (r4 > 0) goto L_0x0014
            goto L_0x001e
        L_0x0014:
            int r2 = r3.vendorId
            if (r2 != r1) goto L_0x001e
            int r1 = r3.productId
            if (r1 != r4) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.knox.application.UsbDeviceConfig.equals(java.lang.Object):boolean");
    }

    public void readFromParcel(Parcel parcel) {
        this.vendorId = parcel.readInt();
        this.productId = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.vendorId);
        parcel.writeInt(this.productId);
    }

    public UsbDeviceConfig() {
    }

    public UsbDeviceConfig(int i, int i8) {
        this.vendorId = i;
        this.productId = i8;
    }

    private UsbDeviceConfig(Parcel parcel) {
        readFromParcel(parcel);
    }
}
