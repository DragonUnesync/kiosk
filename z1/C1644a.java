package z1;

import M0.E;
import M0.G;
import M0.r;
import N.e;
import android.os.Parcel;
import android.os.Parcelable;
import o.M;

/* renamed from: z1.a  reason: case insensitive filesystem */
public final class C1644a implements G {
    public static final Parcelable.Creator<C1644a> CREATOR = new M(2);

    /* renamed from: U  reason: collision with root package name */
    public final int f16420U;

    /* renamed from: V  reason: collision with root package name */
    public final String f16421V;

    public C1644a(int i, String str) {
        this.f16420U = i;
        this.f16421V = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ void e(E e) {
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f16420U);
        sb.append(",url=");
        return e.A(sb, this.f16421V, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16421V);
        parcel.writeInt(this.f16420U);
    }
}
