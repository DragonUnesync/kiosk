package M0;

import A1.a;
import N.e;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: M0.m  reason: case insensitive filesystem */
public final class C0125m implements Parcelable {
    public static final Parcelable.Creator<C0125m> CREATOR = new a(28);

    /* renamed from: U  reason: collision with root package name */
    public int f2968U;

    /* renamed from: V  reason: collision with root package name */
    public final UUID f2969V;

    /* renamed from: W  reason: collision with root package name */
    public final String f2970W;

    /* renamed from: X  reason: collision with root package name */
    public final String f2971X;

    /* renamed from: Y  reason: collision with root package name */
    public final byte[] f2972Y;

    public C0125m(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2969V = uuid;
        this.f2970W = str;
        str2.getClass();
        this.f2971X = I.o(str2);
        this.f2972Y = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0125m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0125m mVar = (C0125m) obj;
        String str = mVar.f2970W;
        int i = z.f3748a;
        if (!Objects.equals(this.f2970W, str) || !Objects.equals(this.f2971X, mVar.f2971X) || !Objects.equals(this.f2969V, mVar.f2969V) || !Arrays.equals(this.f2972Y, mVar.f2972Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.f2968U == 0) {
            int hashCode = this.f2969V.hashCode() * 31;
            String str = this.f2970W;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            this.f2968U = Arrays.hashCode(this.f2972Y) + e.u((hashCode + i) * 31, 31, this.f2971X);
        }
        return this.f2968U;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f2969V;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2970W);
        parcel.writeString(this.f2971X);
        parcel.writeByteArray(this.f2972Y);
    }

    public C0125m(Parcel parcel) {
        this.f2969V = new UUID(parcel.readLong(), parcel.readLong());
        this.f2970W = parcel.readString();
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f2971X = readString;
        this.f2972Y = parcel.createByteArray();
    }
}
