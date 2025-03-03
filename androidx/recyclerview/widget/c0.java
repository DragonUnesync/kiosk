package androidx.recyclerview.widget;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class c0 extends b {
    public static final Parcelable.Creator<c0> CREATOR = new e(3);

    /* renamed from: W  reason: collision with root package name */
    public Parcelable f8376W;

    public c0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8376W = parcel.readParcelable(classLoader == null ? Q.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8376W, 0);
    }
}
