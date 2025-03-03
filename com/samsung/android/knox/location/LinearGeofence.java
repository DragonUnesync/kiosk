package com.samsung.android.knox.location;

import android.app.enterprise.geofencing.LatLongPoint;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LinearGeofence extends Geofence implements Serializable, Parcelable {
    private static final long serialVersionUID = 1;
    public List<LatLongPoint> optimizedPoints;
    public List<LatLongPoint> points;
    public double width;

    public LinearGeofence(List<LatLongPoint> list, double d8) {
        this.type = 3;
        this.points = list;
        this.width = d8;
    }

    public static LinearGeofence convertToNew(android.app.enterprise.geofencing.LinearGeofence linearGeofence) {
        ArrayList arrayList;
        if (linearGeofence.points != null) {
            arrayList = new ArrayList();
            for (LatLongPoint convertToNew : linearGeofence.points) {
                arrayList.add(LatLongPoint.convertToNew(convertToNew));
            }
        } else {
            arrayList = null;
        }
        LinearGeofence linearGeofence2 = new LinearGeofence(arrayList, linearGeofence.width);
        linearGeofence2.id = linearGeofence.id;
        linearGeofence2.type = linearGeofence.type;
        return linearGeofence2;
    }

    public static android.app.enterprise.geofencing.LinearGeofence convertToOld(LinearGeofence linearGeofence) {
        ArrayList arrayList = null;
        if (linearGeofence == null) {
            return null;
        }
        if (linearGeofence.points != null) {
            arrayList = new ArrayList();
            for (LatLongPoint convertToOld : linearGeofence.points) {
                arrayList.add(LatLongPoint.convertToOld(convertToOld));
            }
        }
        android.app.enterprise.geofencing.LinearGeofence linearGeofence2 = new android.app.enterprise.geofencing.LinearGeofence(arrayList, linearGeofence.width);
        linearGeofence2.id = linearGeofence.id;
        linearGeofence2.type = linearGeofence.type;
        return linearGeofence2;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            LatLongPoint createFromParcel = LatLongPoint.CREATOR.createFromParcel(parcel);
            if (createFromParcel != null) {
                this.points.add(createFromParcel);
                i++;
            } else {
                throw new ParcelFormatException("Parcel format exception");
            }
        }
        this.width = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.points.size());
        for (int i8 = 0; i8 < this.points.size(); i8++) {
            this.points.get(i8).writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.width);
    }

    public LinearGeofence(Parcel parcel) {
        this.points = new ArrayList();
        readFromParcel(parcel);
    }
}
