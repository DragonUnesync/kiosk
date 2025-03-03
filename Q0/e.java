package Q0;

import M0.E;
import M0.G;
import M0.S;
import M0.r;
import P0.l;
import android.os.Parcel;
import android.os.Parcelable;

public final class e implements G {
    public static final Parcelable.Creator<e> CREATOR = new S(2);

    /* renamed from: U  reason: collision with root package name */
    public final float f4019U;

    /* renamed from: V  reason: collision with root package name */
    public final float f4020V;

    public e(float f8, float f9) {
        l.c("Invalid latitude or longitude", f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f);
        this.f4019U = f8;
        this.f4020V = f9;
    }

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ void e(E e) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4019U == eVar.f4019U && this.f4020V == eVar.f4020V) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f4020V).hashCode() + ((Float.valueOf(this.f4019U).hashCode() + 527) * 31);
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "xyz: latitude=" + this.f4019U + ", longitude=" + this.f4020V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f4019U);
        parcel.writeFloat(this.f4020V);
    }

    public e(Parcel parcel) {
        this.f4019U = parcel.readFloat();
        this.f4020V = parcel.readFloat();
    }
}
