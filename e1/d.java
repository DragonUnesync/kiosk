package E1;

import A1.a;
import M0.E;
import M0.G;
import M0.r;
import android.os.Parcel;
import android.os.Parcelable;

public final class d implements G {
    public static final Parcelable.Creator<d> CREATOR = new a(19);

    /* renamed from: U  reason: collision with root package name */
    public final float f1325U;

    /* renamed from: V  reason: collision with root package name */
    public final int f1326V;

    public d(int i, float f8) {
        this.f1325U = f8;
        this.f1326V = i;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1325U == dVar.f1325U && this.f1326V == dVar.f1326V) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f1325U).hashCode() + 527) * 31) + this.f1326V;
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f1325U + ", svcTemporalLayerCount=" + this.f1326V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f1325U);
        parcel.writeInt(this.f1326V);
    }

    public d(Parcel parcel) {
        this.f1325U = parcel.readFloat();
        this.f1326V = parcel.readInt();
    }
}
