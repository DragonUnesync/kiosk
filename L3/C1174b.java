package l3;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l3.b  reason: case insensitive filesystem */
public final class C1174b extends b {
    public static final Parcelable.Creator<C1174b> CREATOR = new e(6);

    /* renamed from: W  reason: collision with root package name */
    public boolean f13169W;

    public C1174b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1174b.class.getClassLoader();
        }
        this.f13169W = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f13169W ? 1 : 0);
    }
}
