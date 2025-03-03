package F1;

import P0.z;
import Q0.g;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(20);

    /* renamed from: U  reason: collision with root package name */
    public final long f1476U;

    /* renamed from: V  reason: collision with root package name */
    public final long f1477V;

    /* renamed from: W  reason: collision with root package name */
    public final byte[] f1478W;

    public a(long j7, byte[] bArr, long j8) {
        this.f1476U = j8;
        this.f1477V = j7;
        this.f1478W = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f1476U);
        sb.append(", identifier= ");
        return g.o(sb, this.f1477V, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1476U);
        parcel.writeLong(this.f1477V);
        parcel.writeByteArray(this.f1478W);
    }

    public a(Parcel parcel) {
        this.f1476U = parcel.readLong();
        this.f1477V = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = z.f3748a;
        this.f1478W = createByteArray;
    }
}
