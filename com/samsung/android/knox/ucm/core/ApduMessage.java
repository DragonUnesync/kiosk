package com.samsung.android.knox.ucm.core;

import android.os.Parcel;
import android.os.Parcelable;

public class ApduMessage implements Parcelable {
    public static final Parcelable.Creator<ApduMessage> CREATOR = new Parcelable.Creator<ApduMessage>() {
        public ApduMessage createFromParcel(Parcel parcel) {
            return new ApduMessage(parcel);
        }

        public ApduMessage[] newArray(int i) {
            return new ApduMessage[i];
        }
    };
    public int errorCode;
    public byte[] message;
    public int messageType;
    public int status;

    public static ApduMessage convertToNew(com.sec.enterprise.knox.ucm.core.ApduMessage apduMessage) {
        if (apduMessage == null) {
            return null;
        }
        return new ApduMessage(apduMessage.status, apduMessage.errorCode, apduMessage.messageType, apduMessage.message);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [byte[], java.io.Serializable] */
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(Integer.valueOf(this.status));
        parcel.writeSerializable(Integer.valueOf(this.errorCode));
        parcel.writeSerializable(Integer.valueOf(this.messageType));
        parcel.writeSerializable(this.message);
    }

    public ApduMessage(int i, int i8, int i9, byte[] bArr) {
        this.status = i;
        this.errorCode = i8;
        this.messageType = i9;
        this.message = bArr;
    }

    private ApduMessage(Parcel parcel) {
        this.status = 1;
        this.errorCode = -1;
        this.messageType = 0;
        this.message = null;
        this.status = ((Integer) parcel.readSerializable()).intValue();
        this.errorCode = ((Integer) parcel.readSerializable()).intValue();
        this.messageType = ((Integer) parcel.readSerializable()).intValue();
        this.message = (byte[]) parcel.readSerializable();
    }
}
