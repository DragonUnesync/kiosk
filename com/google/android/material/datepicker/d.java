package com.google.android.material.datepicker;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new S(22);

    /* renamed from: U  reason: collision with root package name */
    public final long f9277U;

    public d(long j7) {
        this.f9277U = j7;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f9277U == ((d) obj).f9277U) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9277U)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9277U);
    }
}
