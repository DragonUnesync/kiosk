package org.altbeacon.bluetooth;

import android.annotation.TargetApi;

public class Pdu {
    public static final byte GATT_SERVICE_FULL_UUID_128_BIT_PDU_TYPE = 7;
    public static final byte GATT_SERVICE_UUID_128_BIT_PDU_TYPE = 33;
    public static final byte GATT_SERVICE_UUID_PDU_TYPE = 22;
    public static final byte MANUFACTURER_DATA_PDU_TYPE = -1;
    private static final String TAG = "Pdu";
    private byte[] mBytes;
    private int mDeclaredLength;
    private int mEndIndex;
    private int mStartIndex;
    private byte mType;

    @TargetApi(9)
    public static Pdu parse(byte[] bArr, int i) {
        byte b8;
        if (bArr.length - i >= 2 && (b8 = bArr[i]) > 0) {
            byte b9 = bArr[i + 1];
            int i8 = i + 2;
            if (i8 < bArr.length) {
                Pdu pdu = new Pdu();
                int i9 = i + b8;
                pdu.mEndIndex = i9;
                if (i9 >= bArr.length) {
                    pdu.mEndIndex = bArr.length - 1;
                }
                pdu.mType = b9;
                pdu.mDeclaredLength = b8;
                pdu.mStartIndex = i8;
                pdu.mBytes = bArr;
                return pdu;
            }
        }
        return null;
    }

    public int getActualLength() {
        return (this.mEndIndex - this.mStartIndex) + 1;
    }

    public int getDeclaredLength() {
        return this.mDeclaredLength;
    }

    public int getEndIndex() {
        return this.mEndIndex;
    }

    public int getStartIndex() {
        return this.mStartIndex;
    }

    public byte getType() {
        return this.mType;
    }
}
