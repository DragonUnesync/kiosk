package M0;

import N.e;
import P0.z;
import j$.util.Objects;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public Object f2862a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2863b;

    /* renamed from: c  reason: collision with root package name */
    public int f2864c;

    /* renamed from: d  reason: collision with root package name */
    public long f2865d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2866f;

    /* renamed from: g  reason: collision with root package name */
    public C0115c f2867g = C0115c.f2914c;

    static {
        e.D(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i8) {
        C0114b a8 = this.f2867g.a(i);
        if (a8.f2893a != -1) {
            return a8.f2897f[i8];
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r3 = r0.a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r8) {
        /*
            r7 = this;
            M0.c r0 = r7.f2867g
            long r1 = r7.f2865d
            r0.getClass()
            r3 = -9223372036854775808
            r5 = -1
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x004a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x001c
            goto L_0x004a
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r0.f2916a
            if (r1 >= r2) goto L_0x0047
            M0.b r3 = r0.a(r1)
            r3.getClass()
            M0.b r3 = r0.a(r1)
            r3.getClass()
            r3 = 0
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0044
            M0.b r3 = r0.a(r1)
            int r4 = r3.f2893a
            if (r4 == r5) goto L_0x0047
            int r3 = r3.a(r5)
            if (r3 >= r4) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0047:
            if (r1 >= r2) goto L_0x004a
            r5 = r1
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.V.b(long):int");
    }

    public final int c(long j7) {
        C0115c cVar = this.f2867g;
        int i = cVar.f2916a - 1;
        cVar.b(i);
        while (i >= 0 && j7 != Long.MIN_VALUE) {
            cVar.a(i).getClass();
            if (j7 >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C0114b a8 = cVar.a(i);
            int i8 = a8.f2893a;
            if (i8 == -1) {
                return i;
            }
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = a8.e[i9];
                if (i10 == 0 || i10 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final long d(int i) {
        this.f2867g.a(i).getClass();
        return 0;
    }

    public final int e(int i) {
        return this.f2867g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (V.class.equals(obj.getClass())) {
                V v4 = (V) obj;
                Object obj2 = this.f2862a;
                Object obj3 = v4.f2862a;
                int i = z.f3748a;
                if (Objects.equals(obj2, obj3) && Objects.equals(this.f2863b, v4.f2863b) && this.f2864c == v4.f2864c && this.f2865d == v4.f2865d && this.e == v4.e && this.f2866f == v4.f2866f && Objects.equals(this.f2867g, v4.f2867g)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f(int i) {
        C0115c cVar = this.f2867g;
        if (i != cVar.f2916a - 1) {
            return false;
        }
        cVar.b(i);
        return false;
    }

    public final boolean g(int i) {
        this.f2867g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j7, long j8, C0115c cVar, boolean z) {
        this.f2862a = obj;
        this.f2863b = obj2;
        this.f2864c = i;
        this.f2865d = j7;
        this.e = j8;
        this.f2867g = cVar;
        this.f2866f = z;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f2862a;
        int i8 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i9 = (217 + i) * 31;
        Object obj2 = this.f2863b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        long j7 = this.f2865d;
        long j8 = this.e;
        return this.f2867g.hashCode() + ((((((((((i9 + i8) * 31) + this.f2864c) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f2866f ? 1 : 0)) * 31);
    }
}
