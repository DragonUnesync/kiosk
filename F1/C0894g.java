package f1;

import P0.z;
import java.util.Locale;
import n2.a;

/* renamed from: f1.g  reason: case insensitive filesystem */
public final class C0894g {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f11538g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11539a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f11540b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11541c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11542d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f11543f;

    public C0894g(C0893f fVar) {
        this.f11539a = fVar.f11533a;
        this.f11540b = fVar.f11534b;
        this.f11541c = fVar.f11535c;
        this.f11542d = fVar.f11536d;
        this.e = fVar.e;
        this.f11543f = fVar.f11537f;
    }

    public static int a(int i) {
        return a.O0(i + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0894g.class != obj.getClass()) {
            return false;
        }
        C0894g gVar = (C0894g) obj;
        if (this.f11540b == gVar.f11540b && this.f11541c == gVar.f11541c && this.f11539a == gVar.f11539a && this.f11542d == gVar.f11542d && this.e == gVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f11542d;
        return ((((((((527 + this.f11540b) * 31) + this.f11541c) * 31) + (this.f11539a ? 1 : 0)) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f11540b), Integer.valueOf(this.f11541c), Long.valueOf(this.f11542d), Integer.valueOf(this.e), Boolean.valueOf(this.f11539a)};
        int i = z.f3748a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
