package u1;

import B1.a;
import B7.g;
import D1.h;
import H3.M;
import H3.O;
import H3.i0;
import M0.C0132u;
import M0.H;
import M0.J;
import N1.f;
import P0.r;
import V1.y;
import androidx.camera.lifecycle.c;
import de.ozerov.fully.K2;
import java.util.Arrays;
import java.util.List;
import p1.C1332b;
import p1.F;
import p1.G;
import p1.l;
import p1.o;
import p1.p;
import p1.q;
import p1.s;
import p1.t;
import p1.z;

/* renamed from: u1.a  reason: case insensitive filesystem */
public final class C1489a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f15734a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final r f15735b = new r(0, new byte[32768]);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15736c = false;

    /* renamed from: d  reason: collision with root package name */
    public final C0132u f15737d = new Object();
    public q e;

    /* renamed from: f  reason: collision with root package name */
    public G f15738f;

    /* renamed from: g  reason: collision with root package name */
    public int f15739g = 0;

    /* renamed from: h  reason: collision with root package name */
    public H f15740h;
    public t i;

    /* renamed from: j  reason: collision with root package name */
    public int f15741j;

    /* renamed from: k  reason: collision with root package name */
    public int f15742k;

    /* renamed from: l  reason: collision with root package name */
    public y f15743l;

    /* renamed from: m  reason: collision with root package name */
    public int f15744m;

    /* renamed from: n  reason: collision with root package name */
    public long f15745n;

    public final void a(long j7, long j8) {
        long j9 = 0;
        if (j7 == 0) {
            this.f15739g = 0;
        } else {
            y yVar = this.f15743l;
            if (yVar != null) {
                yVar.d(j8);
            }
        }
        if (j8 != 0) {
            j9 = -1;
        }
        this.f15745n = j9;
        this.f15744m = 0;
        this.f15735b.E(0);
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        g gVar;
        t tVar;
        z zVar;
        long j7;
        long j8;
        long j9;
        boolean z;
        long j10;
        boolean z6;
        boolean z8;
        boolean z9 = true;
        int i8 = this.f15739g;
        H h5 = null;
        if (i8 != 0) {
            byte[] bArr = this.f15734a;
            if (i8 != 1) {
                int i9 = 3;
                if (i8 != 2) {
                    int i10 = 7;
                    if (i8 != 3) {
                        long j11 = 0;
                        if (i8 == 4) {
                            ((l) pVar).f14410Z = 0;
                            r rVar = new r(2);
                            l lVar = (l) pVar;
                            lVar.r(rVar.f3732a, 0, 2, false);
                            int B8 = rVar.B();
                            if ((B8 >> 2) == 16382) {
                                lVar.f14410Z = 0;
                                this.f15742k = B8;
                                q qVar = this.e;
                                int i11 = P0.z.f3748a;
                                long j12 = lVar.f14408X;
                                this.i.getClass();
                                t tVar2 = this.i;
                                if (tVar2.f14431k != null) {
                                    zVar = new s(tVar2, j12, 0);
                                } else {
                                    long j13 = lVar.f14407W;
                                    if (j13 == -1 || tVar2.f14430j <= 0) {
                                        zVar = new s(tVar2.b());
                                    } else {
                                        int i12 = this.f15742k;
                                        c cVar = new c(20, tVar2);
                                        D2.o oVar = new D2.o(tVar2, i12);
                                        long b8 = tVar2.b();
                                        int i13 = tVar2.f14425c;
                                        int i14 = tVar2.f14426d;
                                        if (i14 > 0) {
                                            j8 = j13;
                                            j7 = ((((long) i14) + ((long) i13)) / 2) + 1;
                                        } else {
                                            j8 = j13;
                                            int i15 = tVar2.f14424b;
                                            int i16 = tVar2.f14423a;
                                            if (i16 != i15 || i16 <= 0) {
                                                j9 = 4096;
                                            } else {
                                                j9 = (long) i16;
                                            }
                                            j7 = (((j9 * ((long) tVar2.f14428g)) * ((long) tVar2.f14429h)) / 8) + 64;
                                        }
                                        y yVar = new y(cVar, oVar, b8, tVar2.f14430j, j12, j8, j7, Math.max(6, i13));
                                        this.f15743l = yVar;
                                        zVar = yVar.f5960a;
                                    }
                                }
                                qVar.l(zVar);
                                this.f15739g = 5;
                                return 0;
                            }
                            lVar.f14410Z = 0;
                            throw J.a((RuntimeException) null, "First frame does not start with sync code.");
                        } else if (i8 == 5) {
                            this.f15738f.getClass();
                            this.i.getClass();
                            y yVar2 = this.f15743l;
                            if (yVar2 != null && yVar2.f5962c != null) {
                                return yVar2.b((l) pVar, uVar);
                            }
                            if (this.f15745n == -1) {
                                t tVar3 = this.i;
                                ((l) pVar).f14410Z = 0;
                                l lVar2 = (l) pVar;
                                lVar2.b(1, false);
                                byte[] bArr2 = new byte[1];
                                lVar2.r(bArr2, 0, 1, false);
                                if ((bArr2[0] & 1) == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                lVar2.b(2, false);
                                if (!z8) {
                                    i10 = 6;
                                }
                                r rVar2 = new r(i10);
                                byte[] bArr3 = rVar2.f3732a;
                                int i17 = 0;
                                while (i17 < i10) {
                                    int g8 = lVar2.g(bArr3, i17, i10 - i17);
                                    if (g8 == -1) {
                                        break;
                                    }
                                    i17 += g8;
                                }
                                rVar2.G(i17);
                                lVar2.f14410Z = 0;
                                try {
                                    long C8 = rVar2.C();
                                    if (!z8) {
                                        C8 *= (long) tVar3.f14424b;
                                    }
                                    j11 = C8;
                                } catch (NumberFormatException unused) {
                                    z9 = false;
                                }
                                if (z9) {
                                    this.f15745n = j11;
                                    return 0;
                                }
                                throw J.a((RuntimeException) null, (String) null);
                            }
                            r rVar3 = this.f15735b;
                            int i18 = rVar3.f3734c;
                            if (i18 < 32768) {
                                int x8 = ((l) pVar).x(rVar3.f3732a, i18, 32768 - i18);
                                if (x8 == -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    rVar3.G(i18 + x8);
                                } else if (rVar3.a() == 0) {
                                    t tVar4 = this.i;
                                    int i19 = P0.z.f3748a;
                                    this.f15738f.e((this.f15745n * 1000000) / ((long) tVar4.e), 1, this.f15744m, 0, (F) null);
                                    return -1;
                                }
                            } else {
                                z = false;
                            }
                            int i20 = rVar3.f3733b;
                            int i21 = this.f15744m;
                            int i22 = this.f15741j;
                            if (i21 < i22) {
                                rVar3.I(Math.min(i22 - i21, rVar3.a()));
                            }
                            this.i.getClass();
                            int i23 = rVar3.f3733b;
                            while (true) {
                                int i24 = rVar3.f3734c - 16;
                                C0132u uVar2 = this.f15737d;
                                if (i23 <= i24) {
                                    rVar3.H(i23);
                                    if (C1332b.c(rVar3, this.i, this.f15742k, uVar2)) {
                                        rVar3.H(i23);
                                        j10 = uVar2.f3050a;
                                        break;
                                    }
                                    i23++;
                                } else {
                                    if (z) {
                                        while (true) {
                                            int i25 = rVar3.f3734c;
                                            if (i23 > i25 - this.f15741j) {
                                                rVar3.H(i25);
                                                break;
                                            }
                                            rVar3.H(i23);
                                            try {
                                                z6 = C1332b.c(rVar3, this.i, this.f15742k, uVar2);
                                            } catch (IndexOutOfBoundsException unused2) {
                                                z6 = false;
                                            }
                                            if (rVar3.f3733b > rVar3.f3734c) {
                                                z6 = false;
                                            }
                                            if (z6) {
                                                rVar3.H(i23);
                                                j10 = uVar2.f3050a;
                                                break;
                                            }
                                            i23++;
                                        }
                                    } else {
                                        rVar3.H(i23);
                                    }
                                    j10 = -1;
                                }
                            }
                            int i26 = rVar3.f3733b - i20;
                            rVar3.H(i20);
                            this.f15738f.a(i26, rVar3);
                            int i27 = i26 + this.f15744m;
                            this.f15744m = i27;
                            if (j10 != -1) {
                                t tVar5 = this.i;
                                int i28 = P0.z.f3748a;
                                this.f15738f.e((this.f15745n * 1000000) / ((long) tVar5.e), 1, i27, 0, (F) null);
                                this.f15744m = 0;
                                this.f15745n = j10;
                            }
                            if (rVar3.a() >= 16) {
                                return 0;
                            }
                            int a8 = rVar3.a();
                            byte[] bArr4 = rVar3.f3732a;
                            System.arraycopy(bArr4, rVar3.f3733b, bArr4, 0, a8);
                            rVar3.H(0);
                            rVar3.G(a8);
                            return 0;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        t tVar6 = this.i;
                        boolean z10 = false;
                        while (!z10) {
                            ((l) pVar).f14410Z = 0;
                            byte[] bArr5 = new byte[4];
                            f fVar = new f(4, bArr5);
                            l lVar3 = (l) pVar;
                            lVar3.r(bArr5, 0, 4, false);
                            boolean h8 = fVar.h();
                            int i29 = fVar.i(i10);
                            int i30 = fVar.i(24) + 4;
                            if (i29 == 0) {
                                byte[] bArr6 = new byte[38];
                                lVar3.c(bArr6, 0, 38, false);
                                tVar6 = new t(4, bArr6);
                            } else if (tVar6 != null) {
                                if (i29 == i9) {
                                    r rVar4 = new r(i30);
                                    lVar3.c(rVar4.f3732a, 0, i30, false);
                                    K2 v4 = C1332b.v(rVar4);
                                    tVar = new t(tVar6.f14423a, tVar6.f14424b, tVar6.f14425c, tVar6.f14426d, tVar6.e, tVar6.f14428g, tVar6.f14429h, tVar6.f14430j, v4, tVar6.f14432l);
                                } else {
                                    H h9 = tVar6.f14432l;
                                    if (i29 == 4) {
                                        r rVar5 = new r(i30);
                                        lVar3.c(rVar5.f3732a, 0, i30, false);
                                        rVar5.I(4);
                                        H t8 = C1332b.t(Arrays.asList((String[]) C1332b.w(rVar5, false, false).f13026V));
                                        if (h9 != null) {
                                            t8 = h9.v(t8);
                                        }
                                        H h10 = t8;
                                        tVar = new t(tVar6.f14423a, tVar6.f14424b, tVar6.f14425c, tVar6.f14426d, tVar6.e, tVar6.f14428g, tVar6.f14429h, tVar6.f14430j, tVar6.f14431k, h10);
                                    } else if (i29 == 6) {
                                        r rVar6 = new r(i30);
                                        lVar3.c(rVar6.f3732a, 0, i30, false);
                                        rVar6.I(4);
                                        H h11 = new H((List) O.r(a.k(rVar6)));
                                        if (h9 != null) {
                                            h11 = h9.v(h11);
                                        }
                                        H h12 = h11;
                                        tVar = new t(tVar6.f14423a, tVar6.f14424b, tVar6.f14425c, tVar6.f14426d, tVar6.e, tVar6.f14428g, tVar6.f14429h, tVar6.f14430j, tVar6.f14431k, h12);
                                    } else {
                                        lVar3.m(i30);
                                    }
                                }
                                tVar6 = tVar;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            int i31 = P0.z.f3748a;
                            this.i = tVar6;
                            z10 = h8;
                            i9 = 3;
                            i10 = 7;
                        }
                        this.i.getClass();
                        this.f15741j = Math.max(this.i.f14425c, 6);
                        G g9 = this.f15738f;
                        int i32 = P0.z.f3748a;
                        g9.c(this.i.c(bArr, this.f15740h));
                        this.f15739g = 4;
                        return 0;
                    }
                } else {
                    r rVar7 = new r(4);
                    ((l) pVar).c(rVar7.f3732a, 0, 4, false);
                    if (rVar7.x() == 1716281667) {
                        this.f15739g = 3;
                        return 0;
                    }
                    throw J.a((RuntimeException) null, "Failed to read FLAC stream marker.");
                }
            } else {
                ((l) pVar).r(bArr, 0, bArr.length, false);
                ((l) pVar).f14410Z = 0;
                this.f15739g = 2;
                return 0;
            }
        } else {
            ((l) pVar).f14410Z = 0;
            l lVar4 = (l) pVar;
            long s8 = lVar4.s();
            if (!this.f15736c) {
                gVar = null;
            } else {
                gVar = h.f1007b;
            }
            H b9 = new U1.a(1).b(lVar4, gVar);
            if (!(b9 == null || b9.f2837U.length == 0)) {
                h5 = b9;
            }
            lVar4.m((int) (lVar4.s() - s8));
            this.f15740h = h5;
            this.f15739g = 1;
            return 0;
        }
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        l lVar = (l) pVar;
        H b8 = new U1.a(1).b(lVar, h.f1007b);
        if (b8 != null) {
            int length = b8.f2837U.length;
        }
        r rVar = new r(4);
        lVar.r(rVar.f3732a, 0, 4, false);
        if (rVar.x() == 1716281667) {
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        this.e = qVar;
        this.f15738f = qVar.q(0, 1);
        qVar.g();
    }

    public final void release() {
    }
}
