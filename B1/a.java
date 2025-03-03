package B1;

import M0.E;
import M0.G;
import M0.I;
import N.e;
import P0.r;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class a implements G {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(1);

    /* renamed from: U  reason: collision with root package name */
    public final int f368U;

    /* renamed from: V  reason: collision with root package name */
    public final String f369V;

    /* renamed from: W  reason: collision with root package name */
    public final String f370W;

    /* renamed from: X  reason: collision with root package name */
    public final int f371X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f372Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f373Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f374a0;

    /* renamed from: b0  reason: collision with root package name */
    public final byte[] f375b0;

    public a(int i, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f368U = i;
        this.f369V = str;
        this.f370W = str2;
        this.f371X = i8;
        this.f372Y = i9;
        this.f373Z = i10;
        this.f374a0 = i11;
        this.f375b0 = bArr;
    }

    public static a k(r rVar) {
        int i = rVar.i();
        String o2 = I.o(rVar.t(rVar.i(), StandardCharsets.US_ASCII));
        String t8 = rVar.t(rVar.i(), StandardCharsets.UTF_8);
        int i8 = rVar.i();
        int i9 = rVar.i();
        int i10 = rVar.i();
        int i11 = rVar.i();
        int i12 = rVar.i();
        byte[] bArr = new byte[i12];
        rVar.g(bArr, 0, i12);
        return new a(i, o2, t8, i8, i9, i10, i11, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(E e) {
        e.a(this.f368U, this.f375b0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f368U == aVar.f368U && this.f369V.equals(aVar.f369V) && this.f370W.equals(aVar.f370W) && this.f371X == aVar.f371X && this.f372Y == aVar.f372Y && this.f373Z == aVar.f373Z && this.f374a0 == aVar.f374a0 && Arrays.equals(this.f375b0, aVar.f375b0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f375b0) + ((((((((e.u(e.u((527 + this.f368U) * 31, 31, this.f369V), 31, this.f370W) + this.f371X) * 31) + this.f372Y) * 31) + this.f373Z) * 31) + this.f374a0) * 31);
    }

    public final /* synthetic */ M0.r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f369V + ", description=" + this.f370W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f368U);
        parcel.writeString(this.f369V);
        parcel.writeString(this.f370W);
        parcel.writeInt(this.f371X);
        parcel.writeInt(this.f372Y);
        parcel.writeInt(this.f373Z);
        parcel.writeInt(this.f374a0);
        parcel.writeByteArray(this.f375b0);
    }

    public a(Parcel parcel) {
        this.f368U = parcel.readInt();
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f369V = readString;
        this.f370W = parcel.readString();
        this.f371X = parcel.readInt();
        this.f372Y = parcel.readInt();
        this.f373Z = parcel.readInt();
        this.f374a0 = parcel.readInt();
        this.f375b0 = parcel.createByteArray();
    }
}
