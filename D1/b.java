package D1;

import A1.a;
import N.e;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a(6);

    /* renamed from: V  reason: collision with root package name */
    public final byte[] f985V;

    public b(String str, byte[] bArr) {
        super(str);
        this.f985V = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f1009U.equals(bVar.f1009U) || !Arrays.equals(this.f985V, bVar.f985V)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f985V) + e.u(527, 31, this.f1009U);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1009U);
        parcel.writeByteArray(this.f985V);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = P0.z.f3748a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f985V = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.b.<init>(android.os.Parcel):void");
    }
}
