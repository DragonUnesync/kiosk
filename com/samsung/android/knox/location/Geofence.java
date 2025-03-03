package com.samsung.android.knox.location;

import android.app.enterprise.geofencing.CircularGeofence;
import android.app.enterprise.geofencing.LinearGeofence;
import android.app.enterprise.geofencing.PolygonalGeofence;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Geofence implements Parcelable {
    public static final Parcelable.Creator<Geofence> CREATOR = new Parcelable.Creator<Geofence>() {
        public Geofence[] newArray(int i) {
            return null;
        }

        public Geofence createFromParcel(Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int readInt = parcel.readInt();
            parcel.setDataPosition(dataPosition);
            return GeofenceFactory.createGeofence(readInt, parcel);
        }
    };
    public int id;
    public int type;

    public static List<Geofence> convertToNewList(List<android.app.enterprise.geofencing.Geofence> list) {
        Object obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.geofencing.Geofence> it = list.iterator();
        while (it.hasNext()) {
            CircularGeofence circularGeofence = (android.app.enterprise.geofencing.Geofence) it.next();
            if (circularGeofence.type == 1) {
                obj = CircularGeofence.convertToNew(circularGeofence);
            } else if (circularGeofence.type == 2) {
                obj = PolygonalGeofence.convertToNew((PolygonalGeofence) circularGeofence);
            } else if (circularGeofence.type == 3) {
                obj = LinearGeofence.convertToNew((LinearGeofence) circularGeofence);
            } else {
                obj = null;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.type = parcel.readInt();
        this.id = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.id);
    }
}
