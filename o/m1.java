package o;

import A3.e;
import B0.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class m1 extends b {
    public static final Parcelable.Creator<m1> CREATOR = new e(8);

    /* renamed from: W  reason: collision with root package name */
    public int f14012W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f14013X;

    public m1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        this.f14012W = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14013X = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14012W);
        parcel.writeInt(this.f14013X ? 1 : 0);
    }
}
