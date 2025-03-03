package androidx.fragment.app;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;

public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new S(14);

    /* renamed from: U  reason: collision with root package name */
    public String f7851U;

    /* renamed from: V  reason: collision with root package name */
    public int f7852V;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7851U);
        parcel.writeInt(this.f7852V);
    }
}
