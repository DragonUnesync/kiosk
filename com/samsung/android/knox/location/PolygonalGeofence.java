package com.samsung.android.knox.location;

import android.app.enterprise.geofencing.LatLongPoint;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PolygonalGeofence extends Geofence implements Serializable, Parcelable {
    private static final long serialVersionUID = 1;
    public double graceDistance;
    public List<LatLongPoint> points;

    public PolygonalGeofence(List<LatLongPoint> list, double d8) {
        this.type = 2;
        this.points = list;
        this.graceDistance = d8;
    }

    public static PolygonalGeofence convertToNew(android.app.enterprise.geofencing.PolygonalGeofence polygonalGeofence) {
        ArrayList arrayList = null;
        if (polygonalGeofence == null) {
            return null;
        }
        if (polygonalGeofence.points != null) {
            arrayList = new ArrayList();
            for (LatLongPoint convertToNew : polygonalGeofence.points) {
                arrayList.add(LatLongPoint.convertToNew(convertToNew));
            }
        }
        PolygonalGeofence polygonalGeofence2 = new PolygonalGeofence(arrayList, polygonalGeofence.graceDistance);
        polygonalGeofence2.id = polygonalGeofence.id;
        polygonalGeofence2.type = polygonalGeofence.type;
        return polygonalGeofence2;
    }

    public static android.app.enterprise.geofencing.PolygonalGeofence convertToOld(PolygonalGeofence polygonalGeofence) {
        ArrayList arrayList = null;
        if (polygonalGeofence == null) {
            return null;
        }
        if (polygonalGeofence.points != null) {
            arrayList = new ArrayList();
            for (LatLongPoint convertToOld : polygonalGeofence.points) {
                arrayList.add(LatLongPoint.convertToOld(convertToOld));
            }
        }
        android.app.enterprise.geofencing.PolygonalGeofence polygonalGeofence2 = new android.app.enterprise.geofencing.PolygonalGeofence(arrayList, polygonalGeofence.graceDistance);
        polygonalGeofence2.id = polygonalGeofence.id;
        polygonalGeofence2.type = polygonalGeofence.type;
        return polygonalGeofence2;
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
        this.graceDistance = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.points.size());
        for (int i8 = 0; i8 < this.points.size(); i8++) {
            this.points.get(i8).writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.graceDistance);
    }

    public PolygonalGeofence(Parcel parcel) {
        this.points = new ArrayList();
        readFromParcel(parcel);
    }
}
