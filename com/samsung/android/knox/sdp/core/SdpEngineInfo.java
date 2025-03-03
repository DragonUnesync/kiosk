package com.samsung.android.knox.sdp.core;

import android.os.Parcel;
import android.os.Parcelable;

public class SdpEngineInfo implements Parcelable {
    public static final Parcelable.Creator<SdpEngineInfo> CREATOR = new Parcelable.Creator<SdpEngineInfo>() {
        public SdpEngineInfo createFromParcel(Parcel parcel) {
            return new SdpEngineInfo(parcel);
        }

        public SdpEngineInfo[] newArray(int i) {
            return new SdpEngineInfo[i];
        }
    };
    private String mAlias;
    private int mFlags;
    private int mId;
    private int mState;
    private int mType;
    private int mUserId;

    public static SdpEngineInfo convertToNew(com.sec.enterprise.knox.sdp.engine.SdpEngineInfo sdpEngineInfo) {
        if (sdpEngineInfo == null) {
            return null;
        }
        SdpEngineInfo sdpEngineInfo2 = new SdpEngineInfo();
        sdpEngineInfo2.setFlag(sdpEngineInfo.getFlag());
        sdpEngineInfo2.setState(sdpEngineInfo.getState());
        sdpEngineInfo2.mAlias = sdpEngineInfo.getAlias();
        sdpEngineInfo2.mId = sdpEngineInfo.getId();
        sdpEngineInfo2.mUserId = sdpEngineInfo.getUserId();
        if (sdpEngineInfo.isAndroidDefaultEngine()) {
            sdpEngineInfo2.mType = 1;
        } else if (sdpEngineInfo.isCustomEngine()) {
            sdpEngineInfo2.mType = 2;
        } else {
            sdpEngineInfo2.mType = -1;
        }
        return sdpEngineInfo2;
    }

    private void setFlag(int i) {
        this.mFlags = i;
    }

    private void setState(int i) {
        this.mState = i;
    }

    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.mAlias;
    }

    public int getFlag() {
        return this.mFlags;
    }

    public int getId() {
        return this.mId;
    }

    public int getState() {
        return this.mState;
    }

    public int getUserId() {
        return this.mUserId;
    }

    public boolean isAndroidDefaultEngine() {
        if (this.mType == 1) {
            return true;
        }
        return false;
    }

    public boolean isCustomEngine() {
        if (this.mType == 2) {
            return true;
        }
        return false;
    }

    public boolean isMdfpp() {
        if (!isMinor()) {
            return true;
        }
        return false;
    }

    public boolean isMinor() {
        if ((this.mFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAlias);
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mUserId);
        parcel.writeInt(this.mState);
        parcel.writeInt(this.mFlags);
        parcel.writeInt(this.mType);
    }

    public SdpEngineInfo() {
        this.mAlias = null;
        this.mId = -1;
        this.mUserId = -1;
        this.mState = -1;
        this.mFlags = -1;
        this.mType = -1;
    }

    private SdpEngineInfo(Parcel parcel) {
        this.mAlias = parcel.readString();
        this.mId = parcel.readInt();
        this.mUserId = parcel.readInt();
        this.mState = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mType = parcel.readInt();
    }
}
