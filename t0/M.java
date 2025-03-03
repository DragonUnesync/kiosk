package T0;

import B.B;
import H3.L;
import H3.O;
import M0.C0115c;
import M0.V;
import M0.W;
import M0.X;
import P0.l;
import P0.v;
import U0.d;
import android.util.Pair;
import h1.C1031B;
import java.util.ArrayList;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final V f4699a = new V();

    /* renamed from: b  reason: collision with root package name */
    public final W f4700b = new W();

    /* renamed from: c  reason: collision with root package name */
    public final d f4701c;

    /* renamed from: d  reason: collision with root package name */
    public final v f4702d;
    public final B e;

    /* renamed from: f  reason: collision with root package name */
    public long f4703f;

    /* renamed from: g  reason: collision with root package name */
    public int f4704g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4705h;
    public K i;

    /* renamed from: j  reason: collision with root package name */
    public K f4706j;

    /* renamed from: k  reason: collision with root package name */
    public K f4707k;

    /* renamed from: l  reason: collision with root package name */
    public K f4708l;

    /* renamed from: m  reason: collision with root package name */
    public int f4709m;

    /* renamed from: n  reason: collision with root package name */
    public Object f4710n;

    /* renamed from: o  reason: collision with root package name */
    public long f4711o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f4712p = new ArrayList();

    public M(d dVar, v vVar, B b8, C0222n nVar) {
        this.f4701c = dVar;
        this.f4702d = vVar;
        this.e = b8;
    }

    public static C1031B m(X x8, Object obj, long j7, long j8, W w2, V v4) {
        X x9 = x8;
        Object obj2 = obj;
        long j9 = j7;
        V v8 = v4;
        x8.g(obj, v8);
        x8.n(v8.f2864c, w2);
        x8.b(obj);
        int i8 = v8.f2867g.f2916a;
        if (i8 != 0) {
            if (i8 == 1) {
                v8.f(0);
            }
            v8.f2867g.getClass();
            v8.g(0);
        }
        x8.g(obj, v8);
        int c8 = v8.c(j7);
        if (c8 == -1) {
            long j10 = j8;
            return new C1031B(obj, j8, v8.b(j7));
        }
        long j11 = j8;
        return new C1031B(obj, c8, v8.e(c8), j8, -1);
    }

    public final K a() {
        K k8 = this.i;
        if (k8 == null) {
            return null;
        }
        if (k8 == this.f4706j) {
            this.f4706j = k8.f4688m;
        }
        k8.i();
        int i8 = this.f4709m - 1;
        this.f4709m = i8;
        if (i8 == 0) {
            this.f4707k = null;
            K k9 = this.i;
            this.f4710n = k9.f4679b;
            this.f4711o = k9.f4683g.f4692a.f12280d;
        }
        this.i = this.i.f4688m;
        k();
        return this.i;
    }

    public final void b() {
        if (this.f4709m != 0) {
            K k8 = this.i;
            l.k(k8);
            this.f4710n = k8.f4679b;
            this.f4711o = k8.f4683g.f4692a.f12280d;
            while (k8 != null) {
                k8.i();
                k8 = k8.f4688m;
            }
            this.i = null;
            this.f4707k = null;
            this.f4706j = null;
            this.f4709m = 0;
            k();
        }
    }

    public final L c(X x8, K k8, long j7) {
        L f8;
        long j8;
        X x9 = x8;
        K k9 = k8;
        L l8 = k9.f4683g;
        long j9 = (k9.f4691p + l8.e) - j7;
        if (l8.f4697g) {
            L l9 = k9.f4683g;
            C1031B b8 = l9.f4692a;
            int d8 = x8.d(x9.b(b8.f12277a), this.f4699a, this.f4700b, this.f4704g, this.f4705h);
            if (d8 != -1) {
                V v4 = this.f4699a;
                int i8 = x9.f(d8, v4, true).f2864c;
                Object obj = v4.f2863b;
                obj.getClass();
                long j10 = b8.f12280d;
                V v8 = v4;
                long j11 = 0;
                if (x9.m(i8, this.f4700b, 0).f2881n == d8) {
                    Pair j12 = x8.j(this.f4700b, this.f4699a, i8, -9223372036854775807L, Math.max(0, j9));
                    if (j12 != null) {
                        obj = j12.first;
                        long longValue = ((Long) j12.second).longValue();
                        K k10 = k9.f4688m;
                        if (k10 == null || !k10.f4679b.equals(obj)) {
                            j10 = o(obj);
                            if (j10 == -1) {
                                j10 = this.f4703f;
                                this.f4703f = 1 + j10;
                            }
                        } else {
                            j10 = k10.f4683g.f4692a.f12280d;
                        }
                        j8 = longValue;
                        j11 = -9223372036854775807L;
                    }
                } else {
                    j8 = 0;
                }
                C1031B m8 = m(x8, obj, j8, j10, this.f4700b, this.f4699a);
                if (!(j11 == -9223372036854775807L || l9.f4694c == -9223372036854775807L)) {
                    V v9 = v8;
                    int i9 = x9.g(b8.f12277a, v9).f2867g.f2916a;
                    v9.f2867g.getClass();
                    if (i9 > 0) {
                        v9.g(0);
                    }
                }
                return d(x8, m8, j11, j8);
            }
            return null;
        }
        C1031B b9 = l8.f4692a;
        Object obj2 = b9.f12277a;
        V v10 = this.f4699a;
        x9.g(obj2, v10);
        boolean b10 = b9.b();
        Object obj3 = b9.f12277a;
        if (b10) {
            C0115c cVar = v10.f2867g;
            int i10 = b9.f12278b;
            int i11 = cVar.a(i10).f2893a;
            if (i11 != -1) {
                int a8 = v10.f2867g.a(i10).a(b9.f12279c);
                if (a8 < i11) {
                    f8 = e(x8, b9.f12277a, i10, a8, l8.f4694c, b9.f12280d);
                } else {
                    long j13 = l8.f4694c;
                    if (j13 == -9223372036854775807L) {
                        Pair j14 = x8.j(this.f4700b, v10, v10.f2864c, -9223372036854775807L, Math.max(0, j9));
                        if (j14 != null) {
                            j13 = ((Long) j14.second).longValue();
                        }
                    }
                    x9.g(obj3, v10);
                    int i12 = b9.f12278b;
                    v10.d(i12);
                    v10.f2867g.a(i12).getClass();
                    f8 = f(x8, b9.f12277a, Math.max(0, j13), l8.f4694c, b9.f12280d);
                }
            }
            return null;
        }
        int i13 = b9.e;
        if (i13 != -1) {
            v10.f(i13);
        }
        int e8 = v10.e(i13);
        v10.g(i13);
        if (e8 != v10.f2867g.a(i13).f2893a) {
            f8 = e(x8, b9.f12277a, b9.e, e8, l8.e, b9.f12280d);
        } else {
            x9.g(obj3, v10);
            v10.d(i13);
            v10.f2867g.a(i13).getClass();
            f8 = f(x8, b9.f12277a, 0, l8.e, b9.f12280d);
        }
        return f8;
    }

    public final L d(X x8, C1031B b8, long j7, long j8) {
        C1031B b9 = b8;
        X x9 = x8;
        x8.g(b9.f12277a, this.f4699a);
        if (b8.b()) {
            return e(x8, b9.f12277a, b9.f12278b, b9.f12279c, j7, b9.f12280d);
        }
        return f(x8, b9.f12277a, j8, j7, b9.f12280d);
    }

    public final L e(X x8, Object obj, int i8, int i9, long j7, long j8) {
        int i10 = i8;
        int i11 = i9;
        C1031B b8 = new C1031B(obj, i8, i9, j8, -1);
        V v4 = this.f4699a;
        long a8 = x8.g(obj, v4).a(i10, i11);
        if (i11 == v4.e(i10)) {
            v4.f2867g.getClass();
        }
        v4.g(i10);
        long j9 = 0;
        if (a8 != -9223372036854775807L && 0 >= a8) {
            j9 = Math.max(0, a8 - 1);
        }
        return new L(b8, j9, j7, -9223372036854775807L, a8, false, false, false, false);
    }

    public final L f(X x8, Object obj, long j7, long j8, long j9) {
        long j10;
        long j11;
        long j12;
        X x9 = x8;
        Object obj2 = obj;
        long j13 = j7;
        V v4 = this.f4699a;
        x9.g(obj2, v4);
        int b8 = v4.b(j13);
        if (b8 != -1) {
            v4.f(b8);
        }
        boolean z = false;
        if (b8 != -1) {
            v4.g(b8);
        } else if (v4.f2867g.f2916a > 0) {
            v4.g(0);
        }
        C1031B b9 = new C1031B(obj2, j9, b8);
        if (!b9.b() && b8 == -1) {
            z = true;
        }
        boolean i8 = i(x9, b9);
        boolean h5 = h(x9, b9, z);
        if (b8 != -1) {
            v4.g(b8);
        }
        if (b8 != -1) {
            v4.d(b8);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
            j11 = v4.f2865d;
        } else {
            j11 = j10;
        }
        if (j11 == -9223372036854775807L || j13 < j11) {
            j12 = j13;
        } else {
            j12 = Math.max(0, j11 - ((long) 1));
        }
        return new L(b9, j12, j8, j10, j11, false, z, i8, h5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T0.L g(M0.X r20, T0.L r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            h1.B r3 = r2.f4692a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.e
            if (r4 != 0) goto L_0x0016
            if (r6 != r5) goto L_0x0016
            r4 = 1
            r12 = 1
            goto L_0x0018
        L_0x0016:
            r4 = 0
            r12 = 0
        L_0x0018:
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r4 = r3.f12277a
            M0.V r7 = r0.f4699a
            r1.g(r4, r7)
            boolean r1 = r3.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x003b
            if (r6 != r5) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            r7.d(r6)
            r10 = 0
            goto L_0x003c
        L_0x003b:
            r10 = r8
        L_0x003c:
            boolean r1 = r3.b()
            int r4 = r3.f12278b
            if (r1 == 0) goto L_0x004c
            int r1 = r3.f12279c
            long r8 = r7.a(r4, r1)
        L_0x004a:
            r15 = r8
            goto L_0x005c
        L_0x004c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0059
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r15 = r10
            goto L_0x005c
        L_0x0059:
            long r8 = r7.f2865d
            goto L_0x004a
        L_0x005c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0066
            r7.g(r4)
            goto L_0x006b
        L_0x0066:
            if (r6 == r5) goto L_0x006b
            r7.g(r6)
        L_0x006b:
            T0.L r17 = new T0.L
            long r4 = r2.f4693b
            long r6 = r2.f4694c
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.M.g(M0.X, T0.L):T0.L");
    }

    public final boolean h(X x8, C1031B b8, boolean z) {
        int b9 = x8.b(b8.f12277a);
        if (x8.m(x8.f(b9, this.f4699a, false).f2864c, this.f4700b, 0).i) {
            return false;
        }
        if (x8.d(b9, this.f4699a, this.f4700b, this.f4704g, this.f4705h) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final boolean i(X x8, C1031B b8) {
        boolean z;
        if (b8.b() || b8.e != -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        Object obj = b8.f12277a;
        int i8 = x8.g(obj, this.f4699a).f2864c;
        if (x8.m(i8, this.f4700b, 0).f2882o == x8.b(obj)) {
            return true;
        }
        return false;
    }

    public final void j() {
        K k8 = this.f4708l;
        if (k8 == null || k8.h()) {
            this.f4708l = null;
            for (int i8 = 0; i8 < this.f4712p.size(); i8++) {
                K k9 = (K) this.f4712p.get(i8);
                if (!k9.h()) {
                    this.f4708l = k9;
                    return;
                }
            }
        }
    }

    public final void k() {
        C1031B b8;
        L j7 = O.j();
        for (K k8 = this.i; k8 != null; k8 = k8.f4688m) {
            j7.a(k8.f4683g.f4692a);
        }
        K k9 = this.f4706j;
        if (k9 == null) {
            b8 = null;
        } else {
            b8 = k9.f4683g.f4692a;
        }
        this.f4702d.c(new A4.d(this, j7, b8, 6));
    }

    public final boolean l(K k8) {
        l.k(k8);
        boolean z = false;
        if (k8.equals(this.f4707k)) {
            return false;
        }
        this.f4707k = k8;
        while (true) {
            k8 = k8.f4688m;
            if (k8 == null) {
                break;
            }
            if (k8 == this.f4706j) {
                this.f4706j = this.i;
                z = true;
            }
            k8.i();
            this.f4709m--;
        }
        K k9 = this.f4707k;
        k9.getClass();
        if (k9.f4688m != null) {
            k9.b();
            k9.f4688m = null;
            k9.c();
        }
        k();
        return z;
    }

    public final C1031B n(X x8, Object obj, long j7) {
        long o2;
        int b8;
        X x9 = x8;
        Object obj2 = obj;
        V v4 = this.f4699a;
        int i8 = x9.g(obj2, v4).f2864c;
        Object obj3 = this.f4710n;
        if (obj3 == null || (b8 = x9.b(obj3)) == -1 || x9.f(b8, v4, false).f2864c != i8) {
            K k8 = this.i;
            while (true) {
                if (k8 == null) {
                    K k9 = this.i;
                    while (true) {
                        if (k9 != null) {
                            int b9 = x9.b(k9.f4679b);
                            if (b9 != -1 && x9.f(b9, v4, false).f2864c == i8) {
                                o2 = k9.f4683g.f4692a.f12280d;
                                break;
                            }
                            k9 = k9.f4688m;
                        } else {
                            o2 = o(obj2);
                            if (o2 == -1) {
                                o2 = this.f4703f;
                                this.f4703f = 1 + o2;
                                if (this.i == null) {
                                    this.f4710n = obj2;
                                    this.f4711o = o2;
                                }
                            }
                        }
                    }
                } else if (k8.f4679b.equals(obj2)) {
                    o2 = k8.f4683g.f4692a.f12280d;
                    break;
                } else {
                    k8 = k8.f4688m;
                }
            }
        } else {
            o2 = this.f4711o;
        }
        long j8 = o2;
        x9.g(obj2, v4);
        int i9 = v4.f2864c;
        W w2 = this.f4700b;
        x9.n(i9, w2);
        boolean z = false;
        for (int b10 = x8.b(obj); b10 >= w2.f2881n; b10--) {
            boolean z6 = true;
            x9.f(b10, v4, true);
            if (v4.f2867g.f2916a <= 0) {
                z6 = false;
            }
            z |= z6;
            if (v4.c(v4.f2865d) != -1) {
                obj2 = v4.f2863b;
                obj2.getClass();
            }
            if (z && (!z6 || v4.f2865d != 0)) {
                break;
            }
        }
        return m(x8, obj2, j7, j8, this.f4700b, this.f4699a);
    }

    public final long o(Object obj) {
        for (int i8 = 0; i8 < this.f4712p.size(); i8++) {
            K k8 = (K) this.f4712p.get(i8);
            if (k8.f4679b.equals(obj)) {
                return k8.f4683g.f4692a.f12280d;
            }
        }
        return -1;
    }

    public final boolean p(X x8) {
        K k8;
        K k9 = this.i;
        if (k9 == null) {
            return true;
        }
        int b8 = x8.b(k9.f4679b);
        while (true) {
            X x9 = x8;
            b8 = x9.d(b8, this.f4699a, this.f4700b, this.f4704g, this.f4705h);
            while (true) {
                k9.getClass();
                k8 = k9.f4688m;
                if (k8 != null && !k9.f4683g.f4697g) {
                    k9 = k8;
                }
            }
            if (b8 == -1 || k8 == null || x8.b(k8.f4679b) != b8) {
                boolean l8 = l(k9);
                k9.f4683g = g(x8, k9.f4683g);
            } else {
                k9 = k8;
            }
        }
        boolean l82 = l(k9);
        k9.f4683g = g(x8, k9.f4683g);
        return !l82;
    }

    public final boolean q(X x8, long j7, long j8) {
        L l8;
        long j9;
        boolean z;
        X x9 = x8;
        K k8 = null;
        for (K k9 = this.i; k9 != null; k9 = k9.f4688m) {
            L l9 = k9.f4683g;
            if (k8 == null) {
                l8 = g(x9, l9);
                long j10 = j7;
            } else {
                L c8 = c(x9, k8, j7);
                if (c8 == null) {
                    return !l(k8);
                }
                if (l9.f4693b != c8.f4693b || !l9.f4692a.equals(c8.f4692a)) {
                    return !l(k8);
                }
                l8 = c8;
            }
            k9.f4683g = l8.a(l9.f4694c);
            long j11 = l9.e;
            if (j11 != -9223372036854775807L) {
                long j12 = l8.e;
                if (j11 != j12) {
                    k9.k();
                    if (j12 == -9223372036854775807L) {
                        j9 = Long.MAX_VALUE;
                    } else {
                        j9 = k9.f4691p + j12;
                    }
                    if (k9 != this.f4706j || k9.f4683g.f4696f || (j8 != Long.MIN_VALUE && j8 < j9)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (l(k9) || z) {
                        return false;
                    }
                    return true;
                }
            }
            k8 = k9;
        }
        return true;
    }
}
