package M0;

import A1.a;
import F.h;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new a(29);

    /* renamed from: U  reason: collision with root package name */
    public final G[] f2837U;

    /* renamed from: V  reason: collision with root package name */
    public final long f2838V;

    public H(G... gArr) {
        this(-9223372036854775807L, gArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h5 = (H) obj;
        if (!Arrays.equals(this.f2837U, h5.f2837U) || this.f2838V != h5.f2838V) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return h.q(this.f2838V) + (Arrays.hashCode(this.f2837U) * 31);
    }

    public final H k(G... gArr) {
        if (gArr.length == 0) {
            return this;
        }
        int i = z.f3748a;
        G[] gArr2 = this.f2837U;
        Object[] copyOf = Arrays.copyOf(gArr2, gArr2.length + gArr.length);
        System.arraycopy(gArr, 0, copyOf, gArr2.length, gArr.length);
        return new H(this.f2838V, (G[]) copyOf);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f2837U));
        long j7 = this.f2838V;
        if (j7 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j7;
        }
        sb.append(str);
        return sb.toString();
    }

    public final H v(H h5) {
        if (h5 == null) {
            return this;
        }
        return k(h5.f2837U);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        G[] gArr = this.f2837U;
        parcel.writeInt(gArr.length);
        for (G writeParcelable : gArr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f2838V);
    }

    public H(long j7, G... gArr) {
        this.f2838V = j7;
        this.f2837U = gArr;
    }

    public H(List list) {
        this((G[]) list.toArray(new G[0]));
    }

    public H(Parcel parcel) {
        this.f2837U = new G[parcel.readInt()];
        int i = 0;
        while (true) {
            G[] gArr = this.f2837U;
            if (i < gArr.length) {
                gArr[i] = (G) parcel.readParcelable(G.class.getClassLoader());
                i++;
            } else {
                this.f2838V = parcel.readLong();
                return;
            }
        }
    }
}
