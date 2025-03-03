package T0;

import P0.l;
import P0.z;
import h1.C1031B;
import j$.util.Objects;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final C1031B f4692a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4693b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4694c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4695d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4696f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4697g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4698h;
    public final boolean i;

    public L(C1031B b8, long j7, long j8, long j9, long j10, boolean z, boolean z6, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12 = z;
        boolean z13 = z6;
        boolean z14 = z8;
        boolean z15 = z9;
        boolean z16 = true;
        if (!z15 || z13) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.d(z10);
        if (!z14 || z13) {
            z11 = true;
        } else {
            z11 = false;
        }
        l.d(z11);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        l.d(z16);
        this.f4692a = b8;
        this.f4693b = j7;
        this.f4694c = j8;
        this.f4695d = j9;
        this.e = j10;
        this.f4696f = z12;
        this.f4697g = z13;
        this.f4698h = z14;
        this.i = z15;
    }

    public final L a(long j7) {
        if (j7 == this.f4694c) {
            return this;
        }
        return new L(this.f4692a, this.f4693b, j7, this.f4695d, this.e, this.f4696f, this.f4697g, this.f4698h, this.i);
    }

    public final L b(long j7) {
        if (j7 == this.f4693b) {
            return this;
        }
        return new L(this.f4692a, j7, this.f4694c, this.f4695d, this.e, this.f4696f, this.f4697g, this.f4698h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l8 = (L) obj;
        if (this.f4693b == l8.f4693b && this.f4694c == l8.f4694c && this.f4695d == l8.f4695d && this.e == l8.e && this.f4696f == l8.f4696f && this.f4697g == l8.f4697g && this.f4698h == l8.f4698h && this.i == l8.i) {
            int i8 = z.f3748a;
            if (Objects.equals(this.f4692a, l8.f4692a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f4692a.hashCode() + 527) * 31) + ((int) this.f4693b)) * 31) + ((int) this.f4694c)) * 31) + ((int) this.f4695d)) * 31) + ((int) this.e)) * 31) + (this.f4696f ? 1 : 0)) * 31) + (this.f4697g ? 1 : 0)) * 31) + (this.f4698h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
