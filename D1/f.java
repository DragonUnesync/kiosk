package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a(10);

    /* renamed from: V  reason: collision with root package name */
    public final String f1000V;

    /* renamed from: W  reason: collision with root package name */
    public final String f1001W;

    /* renamed from: X  reason: collision with root package name */
    public final String f1002X;

    /* renamed from: Y  reason: collision with root package name */
    public final byte[] f1003Y;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f1000V = str;
        this.f1001W = str2;
        this.f1002X = str3;
        this.f1003Y = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f1000V, fVar.f1000V) || !Objects.equals(this.f1001W, fVar.f1001W) || !Objects.equals(this.f1002X, fVar.f1002X) || !Arrays.equals(this.f1003Y, fVar.f1003Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8;
        int i9 = 0;
        String str = this.f1000V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = (527 + i) * 31;
        String str2 = this.f1001W;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f1002X;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return Arrays.hashCode(this.f1003Y) + ((i11 + i9) * 31);
    }

    public final String toString() {
        return this.f1009U + ": mimeType=" + this.f1000V + ", filename=" + this.f1001W + ", description=" + this.f1002X;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1000V);
        parcel.writeString(this.f1001W);
        parcel.writeString(this.f1002X);
        parcel.writeByteArray(this.f1003Y);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f1000V = readString;
        this.f1001W = parcel.readString();
        this.f1002X = parcel.readString();
        this.f1003Y = parcel.createByteArray();
    }
}
