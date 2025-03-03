package A1;

import M0.C0129q;
import M0.E;
import M0.G;
import M0.I;
import M0.r;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class b implements G {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* renamed from: a0  reason: collision with root package name */
    public static final r f25a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final r f26b0;

    /* renamed from: U  reason: collision with root package name */
    public final String f27U;

    /* renamed from: V  reason: collision with root package name */
    public final String f28V;

    /* renamed from: W  reason: collision with root package name */
    public final long f29W;

    /* renamed from: X  reason: collision with root package name */
    public final long f30X;

    /* renamed from: Y  reason: collision with root package name */
    public final byte[] f31Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f32Z;

    static {
        C0129q qVar = new C0129q();
        qVar.f2999m = I.o("application/id3");
        f25a0 = new r(qVar);
        C0129q qVar2 = new C0129q();
        qVar2.f2999m = I.o("application/x-scte35");
        f26b0 = new r(qVar2);
    }

    public b(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f27U = str;
        this.f28V = str2;
        this.f29W = j7;
        this.f30X = j8;
        this.f31Y = bArr;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29W == bVar.f29W && this.f30X == bVar.f30X) {
            int i = z.f3748a;
            if (!Objects.equals(this.f27U, bVar.f27U) || !Objects.equals(this.f28V, bVar.f28V) || !Arrays.equals(this.f31Y, bVar.f31Y)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f32Z == 0) {
            int i8 = 0;
            String str = this.f27U;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i9 = (527 + i) * 31;
            String str2 = this.f28V;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            long j7 = this.f29W;
            long j8 = this.f30X;
            this.f32Z = Arrays.hashCode(this.f31Y) + ((((((i9 + i8) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31);
        }
        return this.f32Z;
    }

    public final r i() {
        String str = this.f27U;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c8 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c8 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c8 = 2;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return f26b0;
            case 1:
            case 2:
                return f25a0;
            default:
                return null;
        }
    }

    public final byte[] s() {
        if (i() != null) {
            return this.f31Y;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f27U + ", id=" + this.f30X + ", durationMs=" + this.f29W + ", value=" + this.f28V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27U);
        parcel.writeString(this.f28V);
        parcel.writeLong(this.f29W);
        parcel.writeLong(this.f30X);
        parcel.writeByteArray(this.f31Y);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f27U = readString;
        this.f28V = parcel.readString();
        this.f29W = parcel.readLong();
        this.f30X = parcel.readLong();
        this.f31Y = parcel.createByteArray();
    }
}
