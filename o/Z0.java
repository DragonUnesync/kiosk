package o;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class Z0 extends b {
    public static final Parcelable.Creator<Z0> CREATOR = new e(7);

    /* renamed from: W  reason: collision with root package name */
    public boolean f13908W;

    public Z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13908W = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13908W + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f13908W));
    }
}
