package Q0;

import F.h;
import M0.E;
import M0.G;
import M0.S;
import M0.r;
import android.os.Parcel;
import android.os.Parcelable;

public final class f implements G {
    public static final Parcelable.Creator<f> CREATOR = new S(3);

    /* renamed from: U  reason: collision with root package name */
    public final long f4021U;

    /* renamed from: V  reason: collision with root package name */
    public final long f4022V;

    /* renamed from: W  reason: collision with root package name */
    public final long f4023W;

    public f(long j7, long j8, long j9) {
        this.f4021U = j7;
        this.f4022V = j8;
        this.f4023W = j9;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4021U == fVar.f4021U && this.f4022V == fVar.f4022V && this.f4023W == fVar.f4023W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int q7 = h.q(this.f4022V);
        return h.q(this.f4023W) + ((q7 + ((h.q(this.f4021U) + 527) * 31)) * 31);
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f4021U + ", modification time=" + this.f4022V + ", timescale=" + this.f4023W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4021U);
        parcel.writeLong(this.f4022V);
        parcel.writeLong(this.f4023W);
    }

    public f(Parcel parcel) {
        this.f4021U = parcel.readLong();
        this.f4022V = parcel.readLong();
        this.f4023W = parcel.readLong();
    }
}
