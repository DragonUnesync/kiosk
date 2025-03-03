package h1;

import K.b;
import M0.C0129q;
import M0.H;
import M0.I;
import M0.J;
import M0.Y;
import M0.r;
import P0.l;
import R0.h;
import T0.e0;
import Y0.e;
import a1.C0412c;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l1.k;
import l1.m;
import l1.n;
import l1.p;
import m1.C1206a;
import p1.G;
import p1.o;
import p1.q;
import p1.s;
import p1.y;
import p1.z;

public final class Q implements C1059z, q, k, n, W {

    /* renamed from: J0  reason: collision with root package name */
    public static final Map f12335J0;

    /* renamed from: K0  reason: collision with root package name */
    public static final r f12336K0;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f12337A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f12338B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f12339C0;

    /* renamed from: D0  reason: collision with root package name */
    public long f12340D0;

    /* renamed from: E0  reason: collision with root package name */
    public long f12341E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f12342F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f12343G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f12344H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f12345I0;

    /* renamed from: U  reason: collision with root package name */
    public final Uri f12346U;

    /* renamed from: V  reason: collision with root package name */
    public final h f12347V;

    /* renamed from: W  reason: collision with root package name */
    public final Y0.h f12348W;

    /* renamed from: X  reason: collision with root package name */
    public final C1048n f12349X;

    /* renamed from: Y  reason: collision with root package name */
    public final e f12350Y;

    /* renamed from: Z  reason: collision with root package name */
    public final e f12351Z;

    /* renamed from: a0  reason: collision with root package name */
    public final T f12352a0;

    /* renamed from: b0  reason: collision with root package name */
    public final l1.e f12353b0;

    /* renamed from: c0  reason: collision with root package name */
    public final long f12354c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f12355d0;

    /* renamed from: e0  reason: collision with root package name */
    public final long f12356e0;

    /* renamed from: f0  reason: collision with root package name */
    public final p f12357f0;

    /* renamed from: g0  reason: collision with root package name */
    public final d4.k f12358g0;

    /* renamed from: h0  reason: collision with root package name */
    public final b f12359h0;

    /* renamed from: i0  reason: collision with root package name */
    public final L f12360i0;

    /* renamed from: j0  reason: collision with root package name */
    public final L f12361j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Handler f12362k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1058y f12363l0;

    /* renamed from: m0  reason: collision with root package name */
    public C1.b f12364m0;

    /* renamed from: n0  reason: collision with root package name */
    public X[] f12365n0;

    /* renamed from: o0  reason: collision with root package name */
    public P[] f12366o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12367q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f12368r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f12369s0;

    /* renamed from: t0  reason: collision with root package name */
    public B3.q f12370t0;

    /* renamed from: u0  reason: collision with root package name */
    public z f12371u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f12372v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f12373w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f12374x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f12375y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f12376z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f12335J0 = DesugarCollections.unmodifiableMap(hashMap);
        C0129q qVar = new C0129q();
        qVar.f2989a = "icy";
        qVar.f2999m = I.o("application/x-icy");
        f12336K0 = new r(qVar);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, K.b] */
    public Q(Uri uri, h hVar, d4.k kVar, Y0.h hVar2, e eVar, C1048n nVar, e eVar2, T t8, l1.e eVar3, int i, boolean z, long j7, C1206a aVar) {
        p pVar;
        this.f12346U = uri;
        this.f12347V = hVar;
        this.f12348W = hVar2;
        this.f12351Z = eVar;
        this.f12349X = nVar;
        this.f12350Y = eVar2;
        this.f12352a0 = t8;
        this.f12353b0 = eVar3;
        this.f12354c0 = (long) i;
        this.f12355d0 = z;
        if (aVar != null) {
            pVar = new p(aVar);
        } else {
            pVar = new p("ProgressiveMediaPeriod");
        }
        this.f12357f0 = pVar;
        this.f12358g0 = kVar;
        this.f12356e0 = j7;
        this.f12359h0 = new Object();
        this.f12360i0 = new L(this, 1);
        this.f12361j0 = new L(this, 2);
        this.f12362k0 = P0.z.m((Handler.Callback) null);
        this.f12366o0 = new P[0];
        this.f12365n0 = new X[0];
        this.f12341E0 = -9223372036854775807L;
        this.f12374x0 = 1;
    }

    public final void A(m mVar, long j7, long j8, boolean z) {
        N n4 = (N) mVar;
        Uri uri = n4.f12319W.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f12349X.getClass();
        this.f12350Y.c(tVar, 1, -1, (r) null, 0, (Object) null, n4.f12326d0, this.f12372v0);
        if (!z) {
            for (X D8 : this.f12365n0) {
                D8.D(false);
            }
            if (this.f12338B0 > 0) {
                C1058y yVar = this.f12363l0;
                yVar.getClass();
                yVar.f0(this);
            }
        }
    }

    public final void B(int i) {
        a();
        boolean[] zArr = (boolean[]) this.f12370t0.f450V;
        if (this.f12342F0 && zArr[i] && !this.f12365n0[i].w(false)) {
            this.f12341E0 = 0;
            this.f12342F0 = false;
            this.f12376z0 = true;
            this.f12340D0 = 0;
            this.f12343G0 = 0;
            for (X D8 : this.f12365n0) {
                D8.D(false);
            }
            C1058y yVar = this.f12363l0;
            yVar.getClass();
            yVar.f0(this);
        }
    }

    public final G C(P p3) {
        int length = this.f12365n0.length;
        for (int i = 0; i < length; i++) {
            if (p3.equals(this.f12366o0[i])) {
                return this.f12365n0[i];
            }
        }
        if (this.p0) {
            l.B("ProgressiveMediaPeriod", "Extractor added new track (id=" + p3.f12333a + ") after finishing tracks.");
            return new p1.n();
        }
        e eVar = this.f12351Z;
        Y0.h hVar = this.f12348W;
        hVar.getClass();
        X x8 = new X(this.f12353b0, hVar, eVar);
        x8.f12411f = this;
        int i8 = length + 1;
        P[] pArr = (P[]) Arrays.copyOf(this.f12366o0, i8);
        pArr[length] = p3;
        int i9 = P0.z.f3748a;
        this.f12366o0 = pArr;
        X[] xArr = (X[]) Arrays.copyOf(this.f12365n0, i8);
        xArr[length] = x8;
        this.f12365n0 = xArr;
        return x8;
    }

    public final void D(z zVar) {
        z zVar2;
        boolean z;
        if (this.f12364m0 == null) {
            zVar2 = zVar;
        } else {
            zVar2 = new s(-9223372036854775807L);
        }
        this.f12371u0 = zVar2;
        this.f12372v0 = zVar.k();
        int i = 1;
        if (this.f12339C0 || zVar.k() != -9223372036854775807L) {
            z = false;
        } else {
            z = true;
        }
        this.f12373w0 = z;
        if (z) {
            i = 7;
        }
        this.f12374x0 = i;
        if (this.f12367q0) {
            this.f12352a0.u(this.f12372v0, zVar.g(), this.f12373w0);
            return;
        }
        y();
    }

    public final void E() {
        N n4 = new N(this, this.f12346U, this.f12347V, this.f12358g0, this, this.f12359h0);
        if (this.f12367q0) {
            l.j(x());
            long j7 = this.f12372v0;
            if (j7 == -9223372036854775807L || this.f12341E0 <= j7) {
                z zVar = this.f12371u0;
                zVar.getClass();
                long j8 = zVar.i(this.f12341E0).f14450a.f14320b;
                long j9 = this.f12341E0;
                n4.f12323a0.f3050a = j8;
                n4.f12326d0 = j9;
                n4.f12325c0 = true;
                n4.f12329g0 = false;
                for (X x8 : this.f12365n0) {
                    x8.f12424t = this.f12341E0;
                }
                this.f12341E0 = -9223372036854775807L;
            } else {
                this.f12344H0 = true;
                this.f12341E0 = -9223372036854775807L;
                return;
            }
        }
        this.f12343G0 = v();
        this.f12350Y.g(new C1053t(n4.f12317U, n4.f12327e0, this.f12357f0.f(n4, this, this.f12349X.r(this.f12374x0))), 1, -1, (r) null, 0, (Object) null, n4.f12326d0, this.f12372v0);
    }

    public final boolean F() {
        if (this.f12376z0 || x()) {
            return true;
        }
        return false;
    }

    public final void a() {
        l.j(this.f12367q0);
        this.f12370t0.getClass();
        this.f12371u0.getClass();
    }

    public final boolean b() {
        boolean z;
        if (this.f12357f0.d()) {
            b bVar = this.f12359h0;
            synchronized (bVar) {
                z = bVar.f2535a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        for (X C8 : this.f12365n0) {
            C8.C();
        }
        d4.k kVar = this.f12358g0;
        o oVar = (o) kVar.f9767W;
        if (oVar != null) {
            oVar.release();
            kVar.f9767W = null;
        }
        kVar.f9768X = null;
    }

    public final long d(k1.r[] rVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j7) {
        boolean z;
        k1.r rVar;
        boolean z6;
        boolean z8;
        a();
        B3.q qVar = this.f12370t0;
        f0 f0Var = (f0) qVar.f449U;
        boolean[] zArr3 = (boolean[]) qVar.f451W;
        int i = this.f12338B0;
        int i8 = 0;
        for (int i9 = 0; i9 < rVarArr.length; i9++) {
            O o2 = yArr[i9];
            if (o2 != null && (rVarArr[i9] == null || !zArr[i9])) {
                int i10 = o2.f12331U;
                l.j(zArr3[i10]);
                this.f12338B0--;
                zArr3[i10] = false;
                yArr[i9] = null;
            }
        }
        if (!this.f12375y0 ? j7 == 0 || this.f12369s0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            if (yArr[i11] == null && (rVar = rVarArr[i11]) != null) {
                if (rVar.length() == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l.j(z6);
                if (rVar.g(0) == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                l.j(z8);
                int b8 = f0Var.b(rVar.l());
                l.j(!zArr3[b8]);
                this.f12338B0++;
                zArr3[b8] = true;
                this.f12337A0 = rVar.m().f3042t | this.f12337A0;
                yArr[i11] = new O(this, b8);
                zArr2[i11] = true;
                if (!z) {
                    X x8 = this.f12365n0[b8];
                    if (x8.r() == 0 || x8.G(j7, true)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (this.f12338B0 == 0) {
            this.f12342F0 = false;
            this.f12376z0 = false;
            this.f12337A0 = false;
            p pVar = this.f12357f0;
            if (pVar.d()) {
                X[] xArr = this.f12365n0;
                int length = xArr.length;
                while (i8 < length) {
                    xArr[i8].j();
                    i8++;
                }
                pVar.b();
            } else {
                this.f12344H0 = false;
                for (X D8 : this.f12365n0) {
                    D8.D(false);
                }
            }
        } else if (z) {
            j7 = s(j7);
            while (i8 < yArr.length) {
                if (yArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.f12375y0 = true;
        return j7;
    }

    public final long e() {
        return n();
    }

    public final long f() {
        if (this.f12337A0) {
            this.f12337A0 = false;
            return this.f12340D0;
        } else if (!this.f12376z0) {
            return -9223372036854775807L;
        } else {
            if (!this.f12344H0 && v() <= this.f12343G0) {
                return -9223372036854775807L;
            }
            this.f12376z0 = false;
            return this.f12340D0;
        }
    }

    public final void g() {
        this.p0 = true;
        this.f12362k0.post(this.f12360i0);
    }

    public final boolean h(T0.I i) {
        if (this.f12344H0) {
            return false;
        }
        p pVar = this.f12357f0;
        if (pVar.c() || this.f12342F0) {
            return false;
        }
        if (this.f12367q0 && this.f12338B0 == 0) {
            return false;
        }
        boolean e = this.f12359h0.e();
        if (pVar.d()) {
            return e;
        }
        E();
        return true;
    }

    public final void i(C1058y yVar, long j7) {
        this.f12363l0 = yVar;
        this.f12359h0.e();
        E();
    }

    public final f0 j() {
        a();
        return (f0) this.f12370t0.f449U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final W1.e k(l1.m r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r12 = r22
            r1 = 0
            r2 = 1
            r3 = r17
            h1.N r3 = (h1.N) r3
            R0.z r4 = r3.f12319W
            h1.t r5 = new h1.t
            android.net.Uri r4 = r4.f4324W
            r6 = r20
            r5.<init>(r6)
            int r4 = P0.z.f3748a
            h1.n r4 = r0.f12349X
            r4.getClass()
            boolean r4 = r12 instanceof M0.J
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x0055
            boolean r4 = r12 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x0055
            boolean r4 = r12 instanceof R0.s
            if (r4 != 0) goto L_0x0055
            boolean r4 = r12 instanceof l1.o
            if (r4 != 0) goto L_0x0055
            int r4 = R0.i.f4264V
            r4 = r12
        L_0x0034:
            if (r4 == 0) goto L_0x0049
            boolean r8 = r4 instanceof R0.i
            if (r8 == 0) goto L_0x0044
            r8 = r4
            R0.i r8 = (R0.i) r8
            int r8 = r8.f4265U
            r9 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r9) goto L_0x0044
            goto L_0x0055
        L_0x0044:
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0034
        L_0x0049:
            int r4 = r23 + -1
            int r4 = r4 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r8)
            long r8 = (long) r4
            goto L_0x0056
        L_0x0055:
            r8 = r6
        L_0x0056:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x005e
            W1.e r1 = l1.p.f13149Z
        L_0x005c:
            r14 = r1
            goto L_0x00b4
        L_0x005e:
            int r4 = r16.v()
            int r10 = r0.f12343G0
            if (r4 <= r10) goto L_0x0068
            r10 = 1
            goto L_0x0069
        L_0x0068:
            r10 = 0
        L_0x0069:
            boolean r11 = r0.f12339C0
            if (r11 != 0) goto L_0x00ab
            p1.z r11 = r0.f12371u0
            if (r11 == 0) goto L_0x007a
            long r13 = r11.k()
            int r11 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x007a
            goto L_0x00ab
        L_0x007a:
            boolean r4 = r0.f12367q0
            if (r4 == 0) goto L_0x0089
            boolean r4 = r16.F()
            if (r4 != 0) goto L_0x0089
            r0.f12342F0 = r2
            W1.e r1 = l1.p.f13148Y
            goto L_0x005c
        L_0x0089:
            boolean r4 = r0.f12367q0
            r0.f12376z0 = r4
            r6 = 0
            r0.f12340D0 = r6
            r0.f12343G0 = r1
            h1.X[] r4 = r0.f12365n0
            int r11 = r4.length
            r13 = 0
        L_0x0097:
            if (r13 >= r11) goto L_0x00a0
            r14 = r4[r13]
            r14.D(r1)
            int r13 = r13 + r2
            goto L_0x0097
        L_0x00a0:
            M0.u r4 = r3.f12323a0
            r4.f3050a = r6
            r3.f12326d0 = r6
            r3.f12325c0 = r2
            r3.f12329g0 = r1
            goto L_0x00ad
        L_0x00ab:
            r0.f12343G0 = r4
        L_0x00ad:
            W1.e r4 = new W1.e
            r4.<init>(r8, r10, r1)
            r1 = r4
            goto L_0x005c
        L_0x00b4:
            boolean r1 = r14.a()
            r13 = r1 ^ 1
            long r8 = r3.f12326d0
            long r10 = r0.f12372v0
            Y0.e r1 = r0.f12350Y
            r4 = -1
            r6 = 0
            r3 = 1
            r7 = 0
            r15 = 0
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r15
            r12 = r22
            r1.e(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.Q.k(l1.m, long, long, java.io.IOException, int):W1.e");
    }

    public final void l(z zVar) {
        this.f12362k0.post(new C0412c((Object) this, 10, (Object) zVar));
    }

    public final long m(long j7, e0 e0Var) {
        a();
        if (!this.f12371u0.g()) {
            return 0;
        }
        y i = this.f12371u0.i(j7);
        return e0Var.a(j7, i.f14450a.f14319a, i.f14451b.f14319a);
    }

    public final long n() {
        long j7;
        boolean z;
        a();
        if (this.f12344H0 || this.f12338B0 == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f12341E0;
        }
        if (this.f12368r0) {
            int length = this.f12365n0.length;
            j7 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                B3.q qVar = this.f12370t0;
                if (((boolean[]) qVar.f450V)[i] && ((boolean[]) qVar.f451W)[i]) {
                    X x8 = this.f12365n0[i];
                    synchronized (x8) {
                        z = x8.f12427w;
                    }
                    if (!z) {
                        j7 = Math.min(j7, this.f12365n0[i].o());
                    }
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = w(false);
        }
        if (j7 == Long.MIN_VALUE) {
            return this.f12340D0;
        }
        return j7;
    }

    public final void o() {
        this.f12362k0.post(this.f12360i0);
    }

    public final void p(m mVar, long j7, long j8) {
        z zVar;
        long j9;
        N n4 = (N) mVar;
        if (this.f12372v0 == -9223372036854775807L && (zVar = this.f12371u0) != null) {
            boolean g8 = zVar.g();
            long w2 = w(true);
            if (w2 == Long.MIN_VALUE) {
                j9 = 0;
            } else {
                j9 = w2 + 10000;
            }
            this.f12372v0 = j9;
            this.f12352a0.u(j9, g8, this.f12373w0);
        }
        Uri uri = n4.f12319W.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f12349X.getClass();
        this.f12350Y.d(tVar, 1, -1, (r) null, 0, (Object) null, n4.f12326d0, this.f12372v0);
        this.f12344H0 = true;
        C1058y yVar = this.f12363l0;
        yVar.getClass();
        yVar.f0(this);
    }

    public final G q(int i, int i8) {
        return C(new P(i, false));
    }

    public final void r() {
        try {
            int r8 = this.f12349X.r(this.f12374x0);
            p pVar = this.f12357f0;
            IOException iOException = pVar.f13152W;
            if (iOException == null) {
                l1.l lVar = pVar.f13151V;
                if (lVar != null) {
                    if (r8 == Integer.MIN_VALUE) {
                        r8 = lVar.f13137U;
                    }
                    IOException iOException2 = lVar.f13141Y;
                    if (iOException2 != null) {
                        if (lVar.f13142Z > r8) {
                            throw iOException2;
                        }
                    }
                }
                if (this.f12344H0 && !this.f12367q0) {
                    throw J.a((RuntimeException) null, "Loading finished before preparation is complete.");
                }
                return;
            }
            throw iOException;
        } catch (IOException e) {
            if (this.f12355d0) {
                l.p("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e);
                this.p0 = true;
                D(new s(-9223372036854775807L));
            } else {
                throw e;
            }
        }
    }

    public final long s(long j7) {
        boolean z;
        boolean z6;
        a();
        boolean[] zArr = (boolean[]) this.f12370t0.f450V;
        if (!this.f12371u0.g()) {
            j7 = 0;
        }
        this.f12376z0 = false;
        boolean z8 = true;
        if (this.f12340D0 == j7) {
            z = true;
        } else {
            z = false;
        }
        this.f12340D0 = j7;
        if (x()) {
            this.f12341E0 = j7;
            return j7;
        }
        int i = this.f12374x0;
        p pVar = this.f12357f0;
        if (i != 7 && (this.f12344H0 || pVar.d())) {
            int length = this.f12365n0.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                X x8 = this.f12365n0[i8];
                if (x8.r() != 0 || !z) {
                    if (this.f12369s0) {
                        z6 = x8.F(x8.f12421q);
                    } else {
                        z6 = x8.G(j7, false);
                    }
                    if (!z6 && (zArr[i8] || !this.f12368r0)) {
                        z8 = false;
                    }
                }
                i8++;
            }
            z8 = false;
            if (z8) {
                return j7;
            }
        }
        this.f12342F0 = false;
        this.f12341E0 = j7;
        this.f12344H0 = false;
        this.f12337A0 = false;
        if (pVar.d()) {
            for (X j8 : this.f12365n0) {
                j8.j();
            }
            pVar.b();
        } else {
            pVar.f13152W = null;
            for (X D8 : this.f12365n0) {
                D8.D(false);
            }
        }
        return j7;
    }

    public final void t(long j7) {
        if (!this.f12369s0) {
            a();
            if (!x()) {
                boolean[] zArr = (boolean[]) this.f12370t0.f451W;
                int length = this.f12365n0.length;
                for (int i = 0; i < length; i++) {
                    this.f12365n0[i].i(j7, zArr[i]);
                }
            }
        }
    }

    public final void u(long j7) {
    }

    public final int v() {
        int i = 0;
        for (X x8 : this.f12365n0) {
            i += x8.f12421q + x8.f12420p;
        }
        return i;
    }

    public final long w(boolean z) {
        long j7 = Long.MIN_VALUE;
        for (int i = 0; i < this.f12365n0.length; i++) {
            if (!z) {
                B3.q qVar = this.f12370t0;
                qVar.getClass();
                if (!((boolean[]) qVar.f451W)[i]) {
                }
            }
            j7 = Math.max(j7, this.f12365n0[i].o());
        }
        return j7;
    }

    public final boolean x() {
        if (this.f12341E0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, B3.q] */
    public final void y() {
        long j7;
        boolean z;
        boolean z6;
        int i;
        H h5;
        if (!this.f12345I0 && !this.f12367q0 && this.p0 && this.f12371u0 != null) {
            X[] xArr = this.f12365n0;
            int length = xArr.length;
            int i8 = 0;
            while (i8 < length) {
                if (xArr[i8].u() != null) {
                    i8++;
                } else {
                    return;
                }
            }
            b bVar = this.f12359h0;
            synchronized (bVar) {
                bVar.f2535a = false;
            }
            int length2 = this.f12365n0.length;
            Y[] yArr = new Y[length2];
            boolean[] zArr = new boolean[length2];
            int i9 = 0;
            while (true) {
                j7 = this.f12356e0;
                if (i9 >= length2) {
                    break;
                }
                r u3 = this.f12365n0[i9].u();
                u3.getClass();
                String str = u3.f3036n;
                boolean k8 = I.k(str);
                if (k8 || I.n(str)) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i9] = z;
                this.f12368r0 = z | this.f12368r0;
                boolean l8 = I.l(str);
                if (j7 == -9223372036854775807L || length2 != 1 || !l8) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                this.f12369s0 = z6;
                C1.b bVar2 = this.f12364m0;
                if (bVar2 != null) {
                    if (k8 || this.f12366o0[i9].f12334b) {
                        H h8 = u3.f3034l;
                        if (h8 == null) {
                            h5 = new H(bVar2);
                        } else {
                            h5 = h8.k(bVar2);
                        }
                        C0129q a8 = u3.a();
                        a8.f2997k = h5;
                        u3 = new r(a8);
                    }
                    if (k8 && u3.f3031h == -1 && u3.i == -1 && (i = bVar2.f533U) != -1) {
                        C0129q a9 = u3.a();
                        a9.f2995h = i;
                        u3 = new r(a9);
                    }
                }
                int k9 = this.f12348W.k(u3);
                C0129q a10 = u3.a();
                a10.f2988K = k9;
                r rVar = new r(a10);
                yArr[i9] = new Y(Integer.toString(i9), rVar);
                this.f12337A0 = rVar.f3042t | this.f12337A0;
                i9++;
            }
            f0 f0Var = new f0(yArr);
            ? obj = new Object();
            obj.f449U = f0Var;
            obj.f450V = zArr;
            int i10 = f0Var.f12469a;
            obj.f451W = new boolean[i10];
            obj.f452X = new boolean[i10];
            this.f12370t0 = obj;
            if (this.f12369s0 && this.f12372v0 == -9223372036854775807L) {
                this.f12372v0 = j7;
                this.f12371u0 = new M(this, this.f12371u0);
            }
            this.f12352a0.u(this.f12372v0, this.f12371u0.g(), this.f12373w0);
            this.f12367q0 = true;
            C1058y yVar = this.f12363l0;
            yVar.getClass();
            yVar.o(this);
        }
    }

    public final void z(int i) {
        a();
        B3.q qVar = this.f12370t0;
        boolean[] zArr = (boolean[]) qVar.f452X;
        if (!zArr[i]) {
            r rVar = ((f0) qVar.f449U).a(i).f2888d[0];
            this.f12350Y.b(I.i(rVar.f3036n), rVar, 0, (Object) null, this.f12340D0);
            zArr[i] = true;
        }
    }
}
