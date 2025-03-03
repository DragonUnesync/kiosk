package h1;

import D.A;
import D2.o;
import H3.P;
import J1.b;
import M0.C0122j;
import M0.C0126n;
import M0.C0129q;
import M0.I;
import M0.r;
import P0.l;
import P0.z;
import S0.f;
import U0.c;
import Y0.e;
import Y0.h;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import l1.C1171a;
import p1.E;
import p1.F;
import p1.G;

public class X implements G {

    /* renamed from: A  reason: collision with root package name */
    public r f12400A;

    /* renamed from: B  reason: collision with root package name */
    public r f12401B;

    /* renamed from: C  reason: collision with root package name */
    public long f12402C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f12403D = true;

    /* renamed from: E  reason: collision with root package name */
    public boolean f12404E;

    /* renamed from: F  reason: collision with root package name */
    public long f12405F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f12406G;

    /* renamed from: a  reason: collision with root package name */
    public final U f12407a;

    /* renamed from: b  reason: collision with root package name */
    public final A f12408b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final o f12409c = new o(new c(26));

    /* renamed from: d  reason: collision with root package name */
    public final h f12410d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public W f12411f;

    /* renamed from: g  reason: collision with root package name */
    public r f12412g;

    /* renamed from: h  reason: collision with root package name */
    public P f12413h;
    public int i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public long[] f12414j = new long[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f12415k = new long[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f12416l = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f12417m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    public long[] f12418n = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    public F[] f12419o = new F[1000];

    /* renamed from: p  reason: collision with root package name */
    public int f12420p;

    /* renamed from: q  reason: collision with root package name */
    public int f12421q;

    /* renamed from: r  reason: collision with root package name */
    public int f12422r;

    /* renamed from: s  reason: collision with root package name */
    public int f12423s;

    /* renamed from: t  reason: collision with root package name */
    public long f12424t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public long f12425u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f12426v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12427w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12428x = true;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12429y = true;
    public boolean z;

    /* JADX WARNING: type inference failed for: r1v1, types: [D.A, java.lang.Object] */
    public X(l1.e eVar, h hVar, e eVar2) {
        this.f12410d = hVar;
        this.e = eVar2;
        this.f12407a = new U(eVar);
    }

    public final synchronized long A() {
        long j7;
        try {
            int s8 = s(this.f12423s);
            if (v()) {
                j7 = this.f12414j[s8];
            } else {
                j7 = this.f12402C;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return j7;
    }

    public final int B(R2.c cVar, f fVar, int i8, boolean z6) {
        boolean z8;
        int i9;
        boolean z9 = false;
        if ((i8 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        A a8 = this.f12408b;
        synchronized (this) {
            try {
                fVar.f4387Z = false;
                i9 = -3;
                if (!v()) {
                    if (!z6) {
                        if (!this.f12427w) {
                            r rVar = this.f12401B;
                            if (rVar != null) {
                                if (!z8) {
                                    if (rVar != this.f12412g) {
                                    }
                                }
                                z(rVar, cVar);
                            }
                        }
                    }
                    fVar.f4018V = 4;
                    fVar.f4388a0 = Long.MIN_VALUE;
                    i9 = -4;
                } else {
                    r rVar2 = ((V) this.f12409c.g(r())).f12398a;
                    if (!z8) {
                        if (rVar2 == this.f12412g) {
                            int s8 = s(this.f12423s);
                            if (!x(s8)) {
                                fVar.f4387Z = true;
                            } else {
                                fVar.f4018V = this.f12417m[s8];
                                if (this.f12423s == this.f12420p - 1 && (z6 || this.f12427w)) {
                                    fVar.a(536870912);
                                }
                                fVar.f4388a0 = this.f12418n[s8];
                                a8.f738a = this.f12416l[s8];
                                a8.f739b = this.f12415k[s8];
                                a8.f740c = this.f12419o[s8];
                                i9 = -4;
                            }
                        }
                    }
                    z(rVar2, cVar);
                }
                i9 = -5;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i9 == -4 && !fVar.d(4)) {
            if ((i8 & 1) != 0) {
                z9 = true;
            }
            if ((i8 & 4) == 0) {
                if (z9) {
                    U u3 = this.f12407a;
                    U.f(u3.e, fVar, this.f12408b, u3.f12394c);
                } else {
                    U u8 = this.f12407a;
                    u8.e = U.f(u8.e, fVar, this.f12408b, u8.f12394c);
                }
            }
            if (!z9) {
                this.f12423s++;
            }
        }
        return i9;
    }

    public final void C() {
        D(true);
        P p3 = this.f12413h;
        if (p3 != null) {
            p3.D0(this.e);
            this.f12413h = null;
            this.f12412g = null;
        }
    }

    public final void D(boolean z6) {
        boolean z8;
        o oVar;
        SparseArray sparseArray;
        U u3 = this.f12407a;
        u3.a(u3.f12395d);
        b bVar = u3.f12395d;
        int i8 = 0;
        if (((C1171a) bVar.f2349W) == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        l.j(z8);
        bVar.f2347U = 0;
        bVar.f2348V = (long) u3.f12393b;
        b bVar2 = u3.f12395d;
        u3.e = bVar2;
        u3.f12396f = bVar2;
        u3.f12397g = 0;
        u3.f12392a.b();
        this.f12420p = 0;
        this.f12421q = 0;
        this.f12422r = 0;
        this.f12423s = 0;
        this.f12428x = true;
        this.f12424t = Long.MIN_VALUE;
        this.f12425u = Long.MIN_VALUE;
        this.f12426v = Long.MIN_VALUE;
        this.f12427w = false;
        while (true) {
            oVar = this.f12409c;
            sparseArray = (SparseArray) oVar.f1138W;
            if (i8 >= sparseArray.size()) {
                break;
            }
            ((c) oVar.f1139X).accept(sparseArray.valueAt(i8));
            i8++;
        }
        oVar.f1137V = -1;
        sparseArray.clear();
        if (z6) {
            this.f12400A = null;
            this.f12401B = null;
            this.f12429y = true;
            this.f12403D = true;
        }
    }

    public final synchronized void E() {
        this.f12423s = 0;
        U u3 = this.f12407a;
        u3.e = u3.f12395d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean F(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.E()     // Catch:{ all -> 0x0018 }
            int r0 = r3.f12421q     // Catch:{ all -> 0x0018 }
            if (r4 < r0) goto L_0x001a
            int r1 = r3.f12420p     // Catch:{ all -> 0x0018 }
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            r1 = -9223372036854775808
            r3.f12424t = r1     // Catch:{ all -> 0x0018 }
            int r4 = r4 - r0
            r3.f12423s = r4     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.F(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean G(long r10, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.E()     // Catch:{ all -> 0x0048 }
            int r0 = r9.f12423s     // Catch:{ all -> 0x0048 }
            int r4 = r9.s(r0)     // Catch:{ all -> 0x0048 }
            boolean r0 = r9.v()     // Catch:{ all -> 0x0048 }
            r7 = 0
            if (r0 == 0) goto L_0x0065
            long[] r0 = r9.f12418n     // Catch:{ all -> 0x0048 }
            r1 = r0[r4]     // Catch:{ all -> 0x0048 }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            long r0 = r9.f12426v     // Catch:{ all -> 0x0048 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0022
            if (r12 != 0) goto L_0x0022
            goto L_0x0065
        L_0x0022:
            boolean r0 = r9.f12403D     // Catch:{ all -> 0x0048 }
            r8 = -1
            if (r0 == 0) goto L_0x004a
            int r0 = r9.f12420p     // Catch:{ all -> 0x0048 }
            int r1 = r9.f12423s     // Catch:{ all -> 0x0048 }
            int r0 = r0 - r1
            r1 = 0
        L_0x002d:
            if (r1 >= r0) goto L_0x0042
            long[] r2 = r9.f12418n     // Catch:{ all -> 0x0048 }
            r5 = r2[r4]     // Catch:{ all -> 0x0048 }
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0038
            goto L_0x0057
        L_0x0038:
            int r4 = r4 + 1
            int r2 = r9.i     // Catch:{ all -> 0x0048 }
            if (r4 != r2) goto L_0x003f
            r4 = 0
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0042:
            if (r12 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = -1
        L_0x0046:
            r1 = r0
            goto L_0x0057
        L_0x0048:
            r10 = move-exception
            goto L_0x0067
        L_0x004a:
            int r12 = r9.f12420p     // Catch:{ all -> 0x0048 }
            int r0 = r9.f12423s     // Catch:{ all -> 0x0048 }
            int r5 = r12 - r0
            r6 = 1
            r1 = r9
            r2 = r10
            int r1 = r1.m(r2, r4, r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x0057:
            if (r1 != r8) goto L_0x005b
            monitor-exit(r9)
            return r7
        L_0x005b:
            r9.f12424t = r10     // Catch:{ all -> 0x0048 }
            int r10 = r9.f12423s     // Catch:{ all -> 0x0048 }
            int r10 = r10 + r1
            r9.f12423s = r10     // Catch:{ all -> 0x0048 }
            monitor-exit(r9)
            r10 = 1
            return r10
        L_0x0065:
            monitor-exit(r9)
            return r7
        L_0x0067:
            monitor-exit(r9)     // Catch:{ all -> 0x0048 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.G(long, boolean):boolean");
    }

    public final synchronized void H(int i8) {
        boolean z6;
        if (i8 >= 0) {
            try {
                if (this.f12423s + i8 <= this.f12420p) {
                    z6 = true;
                    l.d(z6);
                    this.f12423s += i8;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        z6 = false;
        l.d(z6);
        this.f12423s += i8;
    }

    public final /* synthetic */ void a(int i8, P0.r rVar) {
        E.c(this, rVar, i8);
    }

    public final int b(C0122j jVar, int i8, boolean z6) {
        return d(jVar, i8, z6);
    }

    public final void c(r rVar) {
        boolean z6;
        r n4 = n(rVar);
        boolean z8 = false;
        this.z = false;
        this.f12400A = rVar;
        synchronized (this) {
            try {
                this.f12429y = false;
                r rVar2 = this.f12401B;
                int i8 = z.f3748a;
                if (!Objects.equals(n4, rVar2)) {
                    if (((SparseArray) this.f12409c.f1138W).size() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        SparseArray sparseArray = (SparseArray) this.f12409c.f1138W;
                        if (((V) sparseArray.valueAt(sparseArray.size() - 1)).f12398a.equals(n4)) {
                            SparseArray sparseArray2 = (SparseArray) this.f12409c.f1138W;
                            this.f12401B = ((V) sparseArray2.valueAt(sparseArray2.size() - 1)).f12398a;
                            boolean z9 = this.f12403D;
                            r rVar3 = this.f12401B;
                            this.f12403D = z9 & I.a(rVar3.f3036n, rVar3.f3033k);
                            this.f12404E = false;
                            z8 = true;
                        }
                    }
                    this.f12401B = n4;
                    boolean z92 = this.f12403D;
                    r rVar32 = this.f12401B;
                    this.f12403D = z92 & I.a(rVar32.f3036n, rVar32.f3033k);
                    this.f12404E = false;
                    z8 = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        W w2 = this.f12411f;
        if (w2 != null && z8) {
            w2.o();
        }
    }

    public final int d(C0122j jVar, int i8, boolean z6) {
        U u3 = this.f12407a;
        int c8 = u3.c(i8);
        b bVar = u3.f12396f;
        C1171a aVar = (C1171a) bVar.f2349W;
        int x8 = jVar.x(aVar.f13095a, ((int) (u3.f12397g - bVar.f2347U)) + aVar.f13096b, c8);
        if (x8 != -1) {
            long j7 = u3.f12397g + ((long) x8);
            u3.f12397g = j7;
            b bVar2 = u3.f12396f;
            if (j7 != bVar2.f2348V) {
                return x8;
            }
            u3.f12396f = (b) bVar2.f2350X;
            return x8;
        } else if (z6) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(long r13, int r15, int r16, int r17, p1.F r18) {
        /*
            r12 = this;
            r9 = r12
            boolean r0 = r9.z
            if (r0 == 0) goto L_0x000d
            M0.r r0 = r9.f12400A
            P0.l.k(r0)
            r12.c(r0)
        L_0x000d:
            r0 = r15 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            boolean r4 = r9.f12428x
            if (r4 == 0) goto L_0x001f
            if (r3 != 0) goto L_0x001d
            return
        L_0x001d:
            r9.f12428x = r2
        L_0x001f:
            long r4 = r9.f12405F
            long r4 = r4 + r13
            boolean r6 = r9.f12403D
            if (r6 == 0) goto L_0x004d
            long r6 = r9.f12424t
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x002d
            return
        L_0x002d:
            if (r0 != 0) goto L_0x004d
            boolean r0 = r9.f12404E
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "SampleQueue"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r6.<init>(r7)
            M0.r r7 = r9.f12401B
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            P0.l.B(r0, r6)
            r9.f12404E = r1
        L_0x004a:
            r0 = r15 | 1
            goto L_0x004e
        L_0x004d:
            r0 = r15
        L_0x004e:
            boolean r6 = r9.f12406G
            if (r6 == 0) goto L_0x009f
            if (r3 == 0) goto L_0x009e
            monitor-enter(r12)
            int r3 = r9.f12420p     // Catch:{ all -> 0x0063 }
            if (r3 != 0) goto L_0x0065
            long r6 = r9.f12425u     // Catch:{ all -> 0x0063 }
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            monitor-exit(r12)
            goto L_0x0096
        L_0x0063:
            r0 = move-exception
            goto L_0x009c
        L_0x0065:
            long r6 = r12.p()     // Catch:{ all -> 0x0063 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0070
            monitor-exit(r12)
            r1 = 0
            goto L_0x0096
        L_0x0070:
            int r3 = r9.f12420p     // Catch:{ all -> 0x0063 }
            int r6 = r3 + -1
            int r6 = r12.s(r6)     // Catch:{ all -> 0x0063 }
        L_0x0078:
            int r7 = r9.f12423s     // Catch:{ all -> 0x0063 }
            if (r3 <= r7) goto L_0x008f
            long[] r7 = r9.f12418n     // Catch:{ all -> 0x0063 }
            r10 = r7[r6]     // Catch:{ all -> 0x0063 }
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x008f
            int r3 = r3 + -1
            int r6 = r6 + -1
            r7 = -1
            if (r6 != r7) goto L_0x0078
            int r6 = r9.i     // Catch:{ all -> 0x0063 }
            int r6 = r6 - r1
            goto L_0x0078
        L_0x008f:
            int r6 = r9.f12421q     // Catch:{ all -> 0x0063 }
            int r6 = r6 + r3
            r12.k(r6)     // Catch:{ all -> 0x0063 }
            monitor-exit(r12)
        L_0x0096:
            if (r1 != 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            r9.f12406G = r2
            goto L_0x009f
        L_0x009c:
            monitor-exit(r12)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x009e:
            return
        L_0x009f:
            h1.U r1 = r9.f12407a
            long r1 = r1.f12397g
            r7 = r16
            long r10 = (long) r7
            long r1 = r1 - r10
            r3 = r17
            long r10 = (long) r3
            long r10 = r1 - r10
            r1 = r12
            r2 = r4
            r4 = r0
            r5 = r10
            r7 = r16
            r8 = r18
            r1.g(r2, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.e(long, int, int, int, p1.F):void");
    }

    public final void f(P0.r rVar, int i8, int i9) {
        while (true) {
            U u3 = this.f12407a;
            if (i8 > 0) {
                int c8 = u3.c(i8);
                b bVar = u3.f12396f;
                C1171a aVar = (C1171a) bVar.f2349W;
                rVar.g(aVar.f13095a, ((int) (u3.f12397g - bVar.f2347U)) + aVar.f13096b, c8);
                i8 -= c8;
                long j7 = u3.f12397g + ((long) c8);
                u3.f12397g = j7;
                b bVar2 = u3.f12396f;
                if (j7 == bVar2.f2348V) {
                    u3.f12396f = (b) bVar2.f2350X;
                }
            } else {
                u3.getClass();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        if (((h1.V) r9.valueAt(r9.size() - 1)).f12398a.equals(r8.f12401B) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g(long r9, int r11, long r12, int r14, p1.F r15) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f12420p     // Catch:{ all -> 0x0021 }
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0024
            int r0 = r0 - r2
            int r0 = r8.s(r0)     // Catch:{ all -> 0x0021 }
            long[] r3 = r8.f12415k     // Catch:{ all -> 0x0021 }
            r4 = r3[r0]     // Catch:{ all -> 0x0021 }
            int[] r3 = r8.f12416l     // Catch:{ all -> 0x0021 }
            r0 = r3[r0]     // Catch:{ all -> 0x0021 }
            long r6 = (long) r0     // Catch:{ all -> 0x0021 }
            long r4 = r4 + r6
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            P0.l.d(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0024
        L_0x0021:
            r9 = move-exception
            goto L_0x0157
        L_0x0024:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r8.f12427w = r0     // Catch:{ all -> 0x0021 }
            long r3 = r8.f12426v     // Catch:{ all -> 0x0021 }
            long r3 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0021 }
            r8.f12426v = r3     // Catch:{ all -> 0x0021 }
            int r0 = r8.f12420p     // Catch:{ all -> 0x0021 }
            int r0 = r8.s(r0)     // Catch:{ all -> 0x0021 }
            long[] r3 = r8.f12418n     // Catch:{ all -> 0x0021 }
            r3[r0] = r9     // Catch:{ all -> 0x0021 }
            long[] r9 = r8.f12415k     // Catch:{ all -> 0x0021 }
            r9[r0] = r12     // Catch:{ all -> 0x0021 }
            int[] r9 = r8.f12416l     // Catch:{ all -> 0x0021 }
            r9[r0] = r14     // Catch:{ all -> 0x0021 }
            int[] r9 = r8.f12417m     // Catch:{ all -> 0x0021 }
            r9[r0] = r11     // Catch:{ all -> 0x0021 }
            p1.F[] r9 = r8.f12419o     // Catch:{ all -> 0x0021 }
            r9[r0] = r15     // Catch:{ all -> 0x0021 }
            long[] r9 = r8.f12414j     // Catch:{ all -> 0x0021 }
            long r10 = r8.f12402C     // Catch:{ all -> 0x0021 }
            r9[r0] = r10     // Catch:{ all -> 0x0021 }
            D2.o r9 = r8.f12409c     // Catch:{ all -> 0x0021 }
            java.lang.Object r9 = r9.f1138W     // Catch:{ all -> 0x0021 }
            android.util.SparseArray r9 = (android.util.SparseArray) r9     // Catch:{ all -> 0x0021 }
            int r9 = r9.size()     // Catch:{ all -> 0x0021 }
            if (r9 != 0) goto L_0x0064
            r9 = 1
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            if (r9 != 0) goto L_0x0082
            D2.o r9 = r8.f12409c     // Catch:{ all -> 0x0021 }
            java.lang.Object r9 = r9.f1138W     // Catch:{ all -> 0x0021 }
            android.util.SparseArray r9 = (android.util.SparseArray) r9     // Catch:{ all -> 0x0021 }
            int r10 = r9.size()     // Catch:{ all -> 0x0021 }
            int r10 = r10 - r2
            java.lang.Object r9 = r9.valueAt(r10)     // Catch:{ all -> 0x0021 }
            h1.V r9 = (h1.V) r9     // Catch:{ all -> 0x0021 }
            M0.r r9 = r9.f12398a     // Catch:{ all -> 0x0021 }
            M0.r r10 = r8.f12401B     // Catch:{ all -> 0x0021 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0021 }
            if (r9 != 0) goto L_0x00e3
        L_0x0082:
            M0.r r9 = r8.f12401B     // Catch:{ all -> 0x0021 }
            r9.getClass()     // Catch:{ all -> 0x0021 }
            Y0.h r10 = r8.f12410d     // Catch:{ all -> 0x0021 }
            if (r10 == 0) goto L_0x0092
            Y0.e r11 = r8.e     // Catch:{ all -> 0x0021 }
            Y0.g r10 = r10.m(r11, r9)     // Catch:{ all -> 0x0021 }
            goto L_0x0094
        L_0x0092:
            Y0.g r10 = Y0.g.f6318a     // Catch:{ all -> 0x0021 }
        L_0x0094:
            D2.o r11 = r8.f12409c     // Catch:{ all -> 0x0021 }
            int r12 = r8.f12421q     // Catch:{ all -> 0x0021 }
            int r13 = r8.f12420p     // Catch:{ all -> 0x0021 }
            int r12 = r12 + r13
            h1.V r13 = new h1.V     // Catch:{ all -> 0x0021 }
            r13.<init>(r9, r10)     // Catch:{ all -> 0x0021 }
            int r9 = r11.f1137V     // Catch:{ all -> 0x0021 }
            java.lang.Object r10 = r11.f1138W     // Catch:{ all -> 0x0021 }
            android.util.SparseArray r10 = (android.util.SparseArray) r10     // Catch:{ all -> 0x0021 }
            r14 = -1
            if (r9 != r14) goto L_0x00b7
            int r9 = r10.size()     // Catch:{ all -> 0x0021 }
            if (r9 != 0) goto L_0x00b1
            r9 = 1
            goto L_0x00b2
        L_0x00b1:
            r9 = 0
        L_0x00b2:
            P0.l.j(r9)     // Catch:{ all -> 0x0021 }
            r11.f1137V = r1     // Catch:{ all -> 0x0021 }
        L_0x00b7:
            int r9 = r10.size()     // Catch:{ all -> 0x0021 }
            if (r9 <= 0) goto L_0x00e0
            int r9 = r10.size()     // Catch:{ all -> 0x0021 }
            int r9 = r9 - r2
            int r9 = r10.keyAt(r9)     // Catch:{ all -> 0x0021 }
            if (r12 < r9) goto L_0x00ca
            r14 = 1
            goto L_0x00cb
        L_0x00ca:
            r14 = 0
        L_0x00cb:
            P0.l.d(r14)     // Catch:{ all -> 0x0021 }
            if (r9 != r12) goto L_0x00e0
            int r9 = r10.size()     // Catch:{ all -> 0x0021 }
            int r9 = r9 - r2
            java.lang.Object r9 = r10.valueAt(r9)     // Catch:{ all -> 0x0021 }
            java.lang.Object r11 = r11.f1139X     // Catch:{ all -> 0x0021 }
            U0.c r11 = (U0.c) r11     // Catch:{ all -> 0x0021 }
            r11.accept(r9)     // Catch:{ all -> 0x0021 }
        L_0x00e0:
            r10.append(r12, r13)     // Catch:{ all -> 0x0021 }
        L_0x00e3:
            int r9 = r8.f12420p     // Catch:{ all -> 0x0021 }
            int r9 = r9 + r2
            r8.f12420p = r9     // Catch:{ all -> 0x0021 }
            int r10 = r8.i     // Catch:{ all -> 0x0021 }
            if (r9 != r10) goto L_0x0155
            int r9 = r10 + 1000
            long[] r11 = new long[r9]     // Catch:{ all -> 0x0021 }
            long[] r12 = new long[r9]     // Catch:{ all -> 0x0021 }
            long[] r13 = new long[r9]     // Catch:{ all -> 0x0021 }
            int[] r14 = new int[r9]     // Catch:{ all -> 0x0021 }
            int[] r15 = new int[r9]     // Catch:{ all -> 0x0021 }
            p1.F[] r0 = new p1.F[r9]     // Catch:{ all -> 0x0021 }
            int r2 = r8.f12422r     // Catch:{ all -> 0x0021 }
            int r10 = r10 - r2
            long[] r3 = r8.f12415k     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r2, r12, r1, r10)     // Catch:{ all -> 0x0021 }
            long[] r2 = r8.f12418n     // Catch:{ all -> 0x0021 }
            int r3 = r8.f12422r     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r2, r3, r13, r1, r10)     // Catch:{ all -> 0x0021 }
            int[] r2 = r8.f12417m     // Catch:{ all -> 0x0021 }
            int r3 = r8.f12422r     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r2, r3, r14, r1, r10)     // Catch:{ all -> 0x0021 }
            int[] r2 = r8.f12416l     // Catch:{ all -> 0x0021 }
            int r3 = r8.f12422r     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r2, r3, r15, r1, r10)     // Catch:{ all -> 0x0021 }
            p1.F[] r2 = r8.f12419o     // Catch:{ all -> 0x0021 }
            int r3 = r8.f12422r     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r2, r3, r0, r1, r10)     // Catch:{ all -> 0x0021 }
            long[] r2 = r8.f12414j     // Catch:{ all -> 0x0021 }
            int r3 = r8.f12422r     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r2, r3, r11, r1, r10)     // Catch:{ all -> 0x0021 }
            int r2 = r8.f12422r     // Catch:{ all -> 0x0021 }
            long[] r3 = r8.f12415k     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r1, r12, r10, r2)     // Catch:{ all -> 0x0021 }
            long[] r3 = r8.f12418n     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r1, r13, r10, r2)     // Catch:{ all -> 0x0021 }
            int[] r3 = r8.f12417m     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r1, r14, r10, r2)     // Catch:{ all -> 0x0021 }
            int[] r3 = r8.f12416l     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r1, r15, r10, r2)     // Catch:{ all -> 0x0021 }
            p1.F[] r3 = r8.f12419o     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r1, r0, r10, r2)     // Catch:{ all -> 0x0021 }
            long[] r3 = r8.f12414j     // Catch:{ all -> 0x0021 }
            java.lang.System.arraycopy(r3, r1, r11, r10, r2)     // Catch:{ all -> 0x0021 }
            r8.f12415k = r12     // Catch:{ all -> 0x0021 }
            r8.f12418n = r13     // Catch:{ all -> 0x0021 }
            r8.f12417m = r14     // Catch:{ all -> 0x0021 }
            r8.f12416l = r15     // Catch:{ all -> 0x0021 }
            r8.f12419o = r0     // Catch:{ all -> 0x0021 }
            r8.f12414j = r11     // Catch:{ all -> 0x0021 }
            r8.f12422r = r1     // Catch:{ all -> 0x0021 }
            r8.i = r9     // Catch:{ all -> 0x0021 }
        L_0x0155:
            monitor-exit(r8)
            return
        L_0x0157:
            monitor-exit(r8)     // Catch:{ all -> 0x0021 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.g(long, int, long, int, p1.F):void");
    }

    public final long h(int i8) {
        this.f12425u = Math.max(this.f12425u, q(i8));
        this.f12420p -= i8;
        int i9 = this.f12421q + i8;
        this.f12421q = i9;
        int i10 = this.f12422r + i8;
        this.f12422r = i10;
        int i11 = this.i;
        if (i10 >= i11) {
            this.f12422r = i10 - i11;
        }
        int i12 = this.f12423s - i8;
        this.f12423s = i12;
        int i13 = 0;
        if (i12 < 0) {
            this.f12423s = 0;
        }
        while (true) {
            o oVar = this.f12409c;
            SparseArray sparseArray = (SparseArray) oVar.f1138W;
            if (i13 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i13 + 1;
            if (i9 < sparseArray.keyAt(i14)) {
                break;
            }
            ((c) oVar.f1139X).accept(sparseArray.valueAt(i13));
            sparseArray.removeAt(i13);
            int i15 = oVar.f1137V;
            if (i15 > 0) {
                oVar.f1137V = i15 - 1;
            }
            i13 = i14;
        }
        if (this.f12420p != 0) {
            return this.f12415k[this.f12422r];
        }
        int i16 = this.f12422r;
        if (i16 == 0) {
            i16 = this.i;
        }
        int i17 = i16 - 1;
        return this.f12415k[i17] + ((long) this.f12416l[i17]);
    }

    public final void i(long j7, boolean z6) {
        long j8;
        int i8;
        U u3 = this.f12407a;
        synchronized (this) {
            try {
                int i9 = this.f12420p;
                j8 = -1;
                if (i9 != 0) {
                    long[] jArr = this.f12418n;
                    int i10 = this.f12422r;
                    if (j7 >= jArr[i10]) {
                        if (z6 && (i8 = this.f12423s) != i9) {
                            i9 = i8 + 1;
                        }
                        int m8 = m(j7, i10, i9, false);
                        if (m8 != -1) {
                            j8 = h(m8);
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        u3.b(j8);
    }

    public final void j() {
        long j7;
        U u3 = this.f12407a;
        synchronized (this) {
            int i8 = this.f12420p;
            if (i8 == 0) {
                j7 = -1;
            } else {
                j7 = h(i8);
            }
        }
        u3.b(j7);
    }

    public final long k(int i8) {
        boolean z6;
        int i9;
        int i10 = this.f12421q;
        int i11 = this.f12420p;
        int i12 = (i10 + i11) - i8;
        boolean z8 = false;
        if (i12 < 0 || i12 > i11 - this.f12423s) {
            z6 = false;
        } else {
            z6 = true;
        }
        l.d(z6);
        int i13 = this.f12420p - i12;
        this.f12420p = i13;
        this.f12426v = Math.max(this.f12425u, q(i13));
        if (i12 == 0 && this.f12427w) {
            z8 = true;
        }
        this.f12427w = z8;
        o oVar = this.f12409c;
        SparseArray sparseArray = (SparseArray) oVar.f1138W;
        int size = sparseArray.size() - 1;
        while (size >= 0 && i8 < sparseArray.keyAt(size)) {
            ((c) oVar.f1139X).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
            size--;
        }
        if (sparseArray.size() > 0) {
            i9 = Math.min(oVar.f1137V, sparseArray.size() - 1);
        } else {
            i9 = -1;
        }
        oVar.f1137V = i9;
        int i14 = this.f12420p;
        if (i14 == 0) {
            return 0;
        }
        int s8 = s(i14 - 1);
        return this.f12415k[s8] + ((long) this.f12416l[s8]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: J1.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r9) {
        /*
            r8 = this;
            long r0 = r8.k(r9)
            h1.U r9 = r8.f12407a
            long r2 = r9.f12397g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            P0.l.d(r2)
            r9.f12397g = r0
            r2 = 0
            int r4 = r9.f12393b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0058
            J1.b r2 = r9.f12395d
            long r5 = r2.f2347U
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            goto L_0x0058
        L_0x0025:
            long r0 = r9.f12397g
            long r5 = r2.f2348V
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0033
            java.lang.Object r0 = r2.f2350X
            r2 = r0
            J1.b r2 = (J1.b) r2
            goto L_0x0025
        L_0x0033:
            java.lang.Object r0 = r2.f2350X
            J1.b r0 = (J1.b) r0
            r0.getClass()
            r9.a(r0)
            J1.b r1 = new J1.b
            long r5 = r2.f2348V
            r1.<init>(r4, r5)
            r2.f2350X = r1
            long r3 = r9.f12397g
            long r5 = r2.f2348V
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x004f
            r2 = r1
        L_0x004f:
            r9.f12396f = r2
            J1.b r2 = r9.e
            if (r2 != r0) goto L_0x006a
            r9.e = r1
            goto L_0x006a
        L_0x0058:
            J1.b r0 = r9.f12395d
            r9.a(r0)
            J1.b r0 = new J1.b
            long r1 = r9.f12397g
            r0.<init>(r4, r1)
            r9.f12395d = r0
            r9.e = r0
            r9.f12396f = r0
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.l(int):void");
    }

    public final int m(long j7, int i8, int i9, boolean z6) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = (this.f12418n[i8] > j7 ? 1 : (this.f12418n[i8] == j7 ? 0 : -1));
            if (i12 > 0) {
                break;
            }
            if (!z6 || (this.f12417m[i8] & 1) != 0) {
                i10 = i11;
                if (i12 == 0) {
                    break;
                }
            }
            i8++;
            if (i8 == this.i) {
                i8 = 0;
            }
        }
        return i10;
    }

    public r n(r rVar) {
        if (this.f12405F == 0 || rVar.f3041s == Long.MAX_VALUE) {
            return rVar;
        }
        C0129q a8 = rVar.a();
        a8.f3004r = rVar.f3041s + this.f12405F;
        return new r(a8);
    }

    public final synchronized long o() {
        return this.f12426v;
    }

    public final synchronized long p() {
        return Math.max(this.f12425u, q(this.f12423s));
    }

    public final long q(int i8) {
        long j7 = Long.MIN_VALUE;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int s8 = s(i8 - 1);
        for (int i9 = 0; i9 < i8; i9++) {
            j7 = Math.max(j7, this.f12418n[s8]);
            if ((this.f12417m[s8] & 1) != 0) {
                break;
            }
            s8--;
            if (s8 == -1) {
                s8 = this.i - 1;
            }
        }
        return j7;
    }

    public final int r() {
        return this.f12421q + this.f12423s;
    }

    public final int s(int i8) {
        int i9 = this.f12422r + i8;
        int i10 = this.i;
        if (i9 < i10) {
            return i9;
        }
        return i9 - i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int t(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f12423s     // Catch:{ all -> 0x0026 }
            int r4 = r8.s(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.v()     // Catch:{ all -> 0x0026 }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.f12418n     // Catch:{ all -> 0x0026 }
            r1 = r0[r4]     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            long r0 = r8.f12426v     // Catch:{ all -> 0x0026 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            int r9 = r8.f12420p     // Catch:{ all -> 0x0026 }
            int r10 = r8.f12423s     // Catch:{ all -> 0x0026 }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            r9 = move-exception
            goto L_0x003e
        L_0x0028:
            int r11 = r8.f12420p     // Catch:{ all -> 0x0026 }
            int r0 = r8.f12423s     // Catch:{ all -> 0x0026 }
            int r5 = r11 - r0
            r6 = 1
            r1 = r8
            r2 = r9
            int r9 = r1.m(r2, r4, r5, r6)     // Catch:{ all -> 0x0026 }
            r10 = -1
            if (r9 != r10) goto L_0x003a
            monitor-exit(r8)
            return r7
        L_0x003a:
            monitor-exit(r8)
            return r9
        L_0x003c:
            monitor-exit(r8)
            return r7
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0026 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.t(long, boolean):int");
    }

    public final synchronized r u() {
        r rVar;
        if (this.f12429y) {
            rVar = null;
        } else {
            rVar = this.f12401B;
        }
        return rVar;
    }

    public final boolean v() {
        if (this.f12423s != this.f12420p) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean w(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.v()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.f12427w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            M0.r r3 = r2.f12401B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            M0.r r0 = r2.f12412g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0017:
            r3 = move-exception
            goto L_0x003c
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            D2.o r3 = r2.f12409c     // Catch:{ all -> 0x0017 }
            int r0 = r2.r()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.g(r0)     // Catch:{ all -> 0x0017 }
            h1.V r3 = (h1.V) r3     // Catch:{ all -> 0x0017 }
            M0.r r3 = r3.f12398a     // Catch:{ all -> 0x0017 }
            M0.r r0 = r2.f12412g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.f12423s     // Catch:{ all -> 0x0017 }
            int r3 = r2.s(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.x(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.X.w(boolean):boolean");
    }

    public final boolean x(int i8) {
        P p3 = this.f12413h;
        if (p3 == null || p3.A0() == 4) {
            return true;
        }
        if ((this.f12417m[i8] & O7.b.MAX_POW2) == 0) {
            this.f12413h.getClass();
        }
        return false;
    }

    public final void y() {
        P p3 = this.f12413h;
        if (p3 != null && p3.A0() == 1) {
            Y0.c y02 = this.f12413h.y0();
            y02.getClass();
            throw y02;
        }
    }

    public final void z(r rVar, R2.c cVar) {
        boolean z6;
        C0126n nVar;
        r rVar2;
        r rVar3 = this.f12412g;
        if (rVar3 == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (rVar3 == null) {
            nVar = null;
        } else {
            nVar = rVar3.f3040r;
        }
        this.f12412g = rVar;
        C0126n nVar2 = rVar.f3040r;
        h hVar = this.f12410d;
        if (hVar != null) {
            int k8 = hVar.k(rVar);
            C0129q a8 = rVar.a();
            a8.f2988K = k8;
            rVar2 = new r(a8);
        } else {
            rVar2 = rVar;
        }
        cVar.f4337W = rVar2;
        cVar.f4336V = this.f12413h;
        if (hVar != null) {
            if (z6 || !Objects.equals(nVar, nVar2)) {
                P p3 = this.f12413h;
                e eVar = this.e;
                P b8 = hVar.b(eVar, rVar);
                this.f12413h = b8;
                cVar.f4336V = b8;
                if (p3 != null) {
                    p3.D0(eVar);
                }
            }
        }
    }
}
