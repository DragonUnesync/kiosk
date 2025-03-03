package F1;

import A1.a;
import P0.r;
import Q0.g;
import android.os.Parcel;
import android.os.Parcelable;

public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new a(24);

    /* renamed from: U  reason: collision with root package name */
    public final long f1510U;

    /* renamed from: V  reason: collision with root package name */
    public final long f1511V;

    public j(long j7, long j8) {
        this.f1510U = j7;
        this.f1511V = j8;
    }

    public static long k(long j7, r rVar) {
        long v4 = (long) rVar.v();
        if ((128 & v4) != 0) {
            return 8589934591L & ((((v4 & 1) << 32) | rVar.x()) + j7);
        }
        return -9223372036854775807L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f1510U);
        sb.append(", playbackPositionUs= ");
        return g.o(sb, this.f1511V, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1510U);
        parcel.writeLong(this.f1511V);
    }
}
