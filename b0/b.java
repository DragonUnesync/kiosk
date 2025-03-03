package B0;

import A3.e;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new e(1);

    /* renamed from: V  reason: collision with root package name */
    public static final a f366V = new b();

    /* renamed from: U  reason: collision with root package name */
    public final Parcelable f367U;

    public b() {
        this.f367U = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f367U, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f367U = parcelable == f366V ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f367U = readParcelable == null ? f366V : readParcelable;
    }
}
