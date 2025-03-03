package t3;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t3.a  reason: case insensitive filesystem */
public final class C1427a extends b {
    public static final Parcelable.Creator<C1427a> CREATOR = new e(9);

    /* renamed from: W  reason: collision with root package name */
    public boolean f15380W;

    public C1427a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15380W = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f15380W ? 1 : 0);
    }
}
