package D1;

import M0.E;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(5);

    /* renamed from: V  reason: collision with root package name */
    public final String f981V;

    /* renamed from: W  reason: collision with root package name */
    public final String f982W;

    /* renamed from: X  reason: collision with root package name */
    public final int f983X;

    /* renamed from: Y  reason: collision with root package name */
    public final byte[] f984Y;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f981V = str;
        this.f982W = str2;
        this.f983X = i;
        this.f984Y = bArr;
    }

    public final void e(E e) {
        e.a(this.f983X, this.f984Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f983X == aVar.f983X) {
            int i = z.f3748a;
            if (!Objects.equals(this.f981V, aVar.f981V) || !Objects.equals(this.f982W, aVar.f982W) || !Arrays.equals(this.f984Y, aVar.f984Y)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = (527 + this.f983X) * 31;
        int i9 = 0;
        String str = this.f981V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = (i8 + i) * 31;
        String str2 = this.f982W;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return Arrays.hashCode(this.f984Y) + ((i10 + i9) * 31);
    }

    public final String toString() {
        return this.f1009U + ": mimeType=" + this.f981V + ", description=" + this.f982W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f981V);
        parcel.writeString(this.f982W);
        parcel.writeInt(this.f983X);
        parcel.writeByteArray(this.f984Y);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f981V = readString;
        this.f982W = parcel.readString();
        this.f983X = parcel.readInt();
        this.f984Y = parcel.createByteArray();
    }
}
