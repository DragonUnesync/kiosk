package M0;

import P0.z;

/* renamed from: M0.y  reason: case insensitive filesystem */
public final class C0136y {

    /* renamed from: a  reason: collision with root package name */
    public final long f3056a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3057b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3058c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3059d;
    public final float e;

    static {
        new C0135x().a();
        z.J(0);
        z.J(1);
        z.J(2);
        z.J(3);
        z.J(4);
    }

    public C0136y(C0135x xVar) {
        long j7 = xVar.f3052a;
        long j8 = xVar.f3053b;
        long j9 = xVar.f3054c;
        float f8 = xVar.f3055d;
        float f9 = xVar.e;
        this.f3056a = j7;
        this.f3057b = j8;
        this.f3058c = j9;
        this.f3059d = f8;
        this.e = f9;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, M0.x] */
    public final C0135x a() {
        ? obj = new Object();
        obj.f3052a = this.f3056a;
        obj.f3053b = this.f3057b;
        obj.f3054c = this.f3058c;
        obj.f3055d = this.f3059d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0136y)) {
            return false;
        }
        C0136y yVar = (C0136y) obj;
        if (this.f3056a == yVar.f3056a && this.f3057b == yVar.f3057b && this.f3058c == yVar.f3058c && this.f3059d == yVar.f3059d && this.e == yVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j7 = this.f3056a;
        long j8 = this.f3057b;
        long j9 = this.f3058c;
        int i8 = ((((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        int i9 = 0;
        float f8 = this.f3059d;
        if (f8 != 0.0f) {
            i = Float.floatToIntBits(f8);
        } else {
            i = 0;
        }
        int i10 = (i8 + i) * 31;
        float f9 = this.e;
        if (f9 != 0.0f) {
            i9 = Float.floatToIntBits(f9);
        }
        return i10 + i9;
    }
}
