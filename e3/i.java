package e3;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new S(27);

    /* renamed from: U  reason: collision with root package name */
    public int f11253U;

    /* renamed from: V  reason: collision with root package name */
    public int f11254V;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SavedState{mAnchorPosition=" + this.f11253U + ", mAnchorOffset=" + this.f11254V + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11253U);
        parcel.writeInt(this.f11254V);
    }
}
