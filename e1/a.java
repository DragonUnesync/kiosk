package E1;

import F.h;
import M0.E;
import M0.G;
import M0.r;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements G {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(16);

    /* renamed from: U  reason: collision with root package name */
    public final long f1316U;

    /* renamed from: V  reason: collision with root package name */
    public final long f1317V;

    /* renamed from: W  reason: collision with root package name */
    public final long f1318W;

    /* renamed from: X  reason: collision with root package name */
    public final long f1319X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f1320Y;

    public a(long j7, long j8, long j9, long j10, long j11) {
        this.f1316U = j7;
        this.f1317V = j8;
        this.f1318W = j9;
        this.f1319X = j10;
        this.f1320Y = j11;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1316U == aVar.f1316U && this.f1317V == aVar.f1317V && this.f1318W == aVar.f1318W && this.f1319X == aVar.f1319X && this.f1320Y == aVar.f1320Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int q7 = h.q(this.f1317V);
        int q8 = h.q(this.f1318W);
        int q9 = h.q(this.f1319X);
        return h.q(this.f1320Y) + ((q9 + ((q8 + ((q7 + ((h.q(this.f1316U) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f1316U + ", photoSize=" + this.f1317V + ", photoPresentationTimestampUs=" + this.f1318W + ", videoStartPosition=" + this.f1319X + ", videoSize=" + this.f1320Y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1316U);
        parcel.writeLong(this.f1317V);
        parcel.writeLong(this.f1318W);
        parcel.writeLong(this.f1319X);
        parcel.writeLong(this.f1320Y);
    }

    public a(Parcel parcel) {
        this.f1316U = parcel.readLong();
        this.f1317V = parcel.readLong();
        this.f1318W = parcel.readLong();
        this.f1319X = parcel.readLong();
        this.f1320Y = parcel.readLong();
    }
}
