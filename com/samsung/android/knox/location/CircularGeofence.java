package com.samsung.android.knox.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class CircularGeofence extends Geofence implements Parcelable, Serializable {
    private static final long serialVersionUID = 1;
    public LatLongPoint center;
    public double radius;

    public CircularGeofence(LatLongPoint latLongPoint, double d8) {
        this.type = 1;
        this.center = latLongPoint;
        this.radius = d8;
    }

    public static CircularGeofence convertToNew(android.app.enterprise.geofencing.CircularGeofence circularGeofence) {
        LatLongPoint latLongPoint = null;
        if (circularGeofence == null) {
            return null;
        }
        if (circularGeofence.center != null) {
            latLongPoint = LatLongPoint.convertToNew(circularGeofence.center);
        }
        CircularGeofence circularGeofence2 = new CircularGeofence(latLongPoint, circularGeofence.radius);
        circularGeofence2.id = circularGeofence.id;
        circularGeofence2.type = circularGeofence.type;
        return circularGeofence2;
    }

    public static android.app.enterprise.geofencing.CircularGeofence convertToOld(CircularGeofence circularGeofence) {
        if (circularGeofence == null) {
            return null;
        }
        android.app.enterprise.geofencing.CircularGeofence circularGeofence2 = new android.app.enterprise.geofencing.CircularGeofence(LatLongPoint.convertToOld(circularGeofence.center), circularGeofence.radius);
        circularGeofence2.id = circularGeofence.id;
        circularGeofence2.type = circularGeofence.type;
        return circularGeofence2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.center = LatLongPoint.CREATOR.createFromParcel(parcel);
        this.radius = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.center.writeToParcel(parcel, i);
        parcel.writeDouble(this.radius);
    }

    public CircularGeofence(Parcel parcel) {
        readFromParcel(parcel);
    }
}
