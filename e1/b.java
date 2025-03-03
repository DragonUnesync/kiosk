package E1;

import A1.a;
import P0.l;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(18);

    /* renamed from: U  reason: collision with root package name */
    public final long f1321U;

    /* renamed from: V  reason: collision with root package name */
    public final long f1322V;

    /* renamed from: W  reason: collision with root package name */
    public final int f1323W;

    public b(int i, long j7, long j8) {
        boolean z;
        if (j7 < j8) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f1321U = j7;
        this.f1322V = j8;
        this.f1323W = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1321U == bVar.f1321U && this.f1322V == bVar.f1322V && this.f1323W == bVar.f1323W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1321U), Long.valueOf(this.f1322V), Integer.valueOf(this.f1323W)});
    }

    public final String toString() {
        int i = z.f3748a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f1321U + ", endTimeMs=" + this.f1322V + ", speedDivisor=" + this.f1323W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1321U);
        parcel.writeLong(this.f1322V);
        parcel.writeInt(this.f1323W);
    }
}
