package D1;

import A1.a;
import N.e;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a(15);

    /* renamed from: V  reason: collision with root package name */
    public final String f1023V;

    /* renamed from: W  reason: collision with root package name */
    public final String f1024W;

    public o(String str, String str2, String str3) {
        super(str);
        this.f1023V = str2;
        this.f1024W = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f1009U.equals(oVar.f1009U)) {
            int i = z.f3748a;
            if (!Objects.equals(this.f1023V, oVar.f1023V) || !Objects.equals(this.f1024W, oVar.f1024W)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int u3 = e.u(527, 31, this.f1009U);
        int i8 = 0;
        String str = this.f1023V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = (u3 + i) * 31;
        String str2 = this.f1024W;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        return this.f1009U + ": url=" + this.f1024W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1009U);
        parcel.writeString(this.f1023V);
        parcel.writeString(this.f1024W);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = P0.z.f3748a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f1023V = r0
            java.lang.String r3 = r3.readString()
            r2.f1024W = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.o.<init>(android.os.Parcel):void");
    }
}
