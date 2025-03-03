package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.altbeacon.beacon.Beacon;

public class AltBeacon extends Beacon {
    public static final Parcelable.Creator<AltBeacon> CREATOR = new Parcelable.Creator<AltBeacon>() {
        public AltBeacon createFromParcel(Parcel parcel) {
            return new AltBeacon(parcel);
        }

        public AltBeacon[] newArray(int i) {
            return new AltBeacon[i];
        }
    };
    private static final String TAG = "AltBeacon";

    public static class Builder extends Beacon.Builder {
        public Beacon build() {
            return new AltBeacon(super.build());
        }

        public Builder setMfgReserved(int i) {
            if (this.mBeacon.mDataFields.size() != 0) {
                this.mBeacon.mDataFields = new ArrayList();
            }
            this.mBeacon.mDataFields.add(Long.valueOf((long) i));
            return this;
        }
    }

    public AltBeacon(Beacon beacon) {
        super(beacon);
    }

    public int describeContents() {
        return 0;
    }

    public int getMfgReserved() {
        return this.mDataFields.get(0).intValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public AltBeacon() {
    }

    public AltBeacon(Parcel parcel) {
        super(parcel);
    }
}
