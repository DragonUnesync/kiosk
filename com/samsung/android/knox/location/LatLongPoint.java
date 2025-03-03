package com.samsung.android.knox.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class LatLongPoint implements Serializable, Parcelable {
    public static final Parcelable.Creator<LatLongPoint> CREATOR = new Parcelable.Creator<LatLongPoint>() {
        public LatLongPoint createFromParcel(Parcel parcel) {
            return new LatLongPoint(parcel);
        }

        public LatLongPoint[] newArray(int i) {
            return new LatLongPoint[i];
        }
    };
    private static final long serialVersionUID = 1;
    public double latitude;
    public double longitude;

    public static LatLongPoint convertToNew(android.app.enterprise.geofencing.LatLongPoint latLongPoint) {
        if (latLongPoint == null) {
            return null;
        }
        return new LatLongPoint(latLongPoint.latitude, latLongPoint.longitude);
    }

    public static android.app.enterprise.geofencing.LatLongPoint convertToOld(LatLongPoint latLongPoint) {
        if (latLongPoint == null) {
            return null;
        }
        return new android.app.enterprise.geofencing.LatLongPoint(latLongPoint.latitude, latLongPoint.longitude);
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }

    public LatLongPoint(double d8, double d9) {
        this.latitude = d8;
        this.longitude = d9;
    }

    private LatLongPoint(Parcel parcel) {
        readFromParcel(parcel);
    }
}
