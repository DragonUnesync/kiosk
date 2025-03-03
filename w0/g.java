package W0;

import B2.c;
import B3.q;
import D2.o;
import M0.C;
import M0.C0136y;
import M0.C0137z;
import M0.D;
import P0.l;
import P0.z;
import R0.A;
import U0.j;
import X0.a;
import Y0.e;
import Y0.h;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import h1.C1031B;
import h1.C1035a;
import h1.C1048n;
import h1.C1053t;
import h1.C1059z;
import i1.C1094g;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import k2.C1160q;
import l1.n;
import l1.p;
import l1.r;
import l1.s;
import m1.C1207b;

public final class g extends C1035a {

    /* renamed from: A  reason: collision with root package name */
    public p f6048A;

    /* renamed from: B  reason: collision with root package name */
    public A f6049B;

    /* renamed from: C  reason: collision with root package name */
    public c f6050C;

    /* renamed from: D  reason: collision with root package name */
    public Handler f6051D;

    /* renamed from: E  reason: collision with root package name */
    public C0136y f6052E;

    /* renamed from: F  reason: collision with root package name */
    public Uri f6053F;

    /* renamed from: G  reason: collision with root package name */
    public final Uri f6054G;

    /* renamed from: H  reason: collision with root package name */
    public X0.c f6055H = null;

    /* renamed from: I  reason: collision with root package name */
    public boolean f6056I;

    /* renamed from: J  reason: collision with root package name */
    public long f6057J;

    /* renamed from: K  reason: collision with root package name */
    public long f6058K;

    /* renamed from: L  reason: collision with root package name */
    public long f6059L;

    /* renamed from: M  reason: collision with root package name */
    public int f6060M;

    /* renamed from: N  reason: collision with root package name */
    public long f6061N;

    /* renamed from: O  reason: collision with root package name */
    public int f6062O;

    /* renamed from: P  reason: collision with root package name */
    public C f6063P;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6064h;
    public final R0.g i;

    /* renamed from: j  reason: collision with root package name */
    public final o f6065j;

    /* renamed from: k  reason: collision with root package name */
    public final C1048n f6066k;

    /* renamed from: l  reason: collision with root package name */
    public final h f6067l;

    /* renamed from: m  reason: collision with root package name */
    public final C1048n f6068m;

    /* renamed from: n  reason: collision with root package name */
    public final q f6069n;

    /* renamed from: o  reason: collision with root package name */
    public final long f6070o;

    /* renamed from: p  reason: collision with root package name */
    public final long f6071p;

    /* renamed from: q  reason: collision with root package name */
    public final e f6072q;

    /* renamed from: r  reason: collision with root package name */
    public final r f6073r;

    /* renamed from: s  reason: collision with root package name */
    public final d f6074s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f6075t;

    /* renamed from: u  reason: collision with root package name */
    public final SparseArray f6076u;

    /* renamed from: v  reason: collision with root package name */
    public final c f6077v;

    /* renamed from: w  reason: collision with root package name */
    public final c f6078w;

    /* renamed from: x  reason: collision with root package name */
    public final d f6079x;

    /* renamed from: y  reason: collision with root package name */
    public final l1.q f6080y;
    public R0.h z;

    static {
        D.a("media3.exoplayer.dash");
    }

    public g(C c8, R0.g gVar, r rVar, o oVar, C1048n nVar, h hVar, C1048n nVar2, long j7, long j8) {
        this.f6063P = c8;
        this.f6052E = c8.f2787c;
        C0137z zVar = c8.f2786b;
        zVar.getClass();
        Uri uri = zVar.f3060a;
        this.f6053F = uri;
        this.f6054G = uri;
        this.i = gVar;
        this.f6073r = rVar;
        this.f6065j = oVar;
        this.f6067l = hVar;
        this.f6068m = nVar2;
        this.f6070o = j7;
        this.f6071p = j8;
        this.f6066k = nVar;
        this.f6069n = new q(7);
        this.f6064h = false;
        this.f6072q = a((C1031B) null);
        this.f6075t = new Object();
        this.f6076u = new SparseArray();
        this.f6079x = new d(this, 1);
        this.f6061N = -9223372036854775807L;
        this.f6059L = -9223372036854775807L;
        this.f6074s = new d(this, 2);
        this.f6080y = new d(this, 3);
        this.f6077v = new c(this, 0);
        this.f6078w = new c(this, 1);
    }

    public static boolean t(X0.h hVar) {
        int i8 = 0;
        while (true) {
            List list = hVar.f6245c;
            if (i8 >= list.size()) {
                return false;
            }
            int i9 = ((a) list.get(i8)).f6206b;
            if (i9 == 1 || i9 == 2) {
                return true;
            }
            i8++;
        }
        return true;
    }

    public final C1059z b(C1031B b8, l1.e eVar, long j7) {
        C1031B b9 = b8;
        int intValue = ((Integer) b9.f12277a).intValue() - this.f6062O;
        e a8 = a(b8);
        e eVar2 = new e(this.f12433d.f6317c, 0, b9);
        int i8 = this.f6062O + intValue;
        X0.c cVar = this.f6055H;
        A a9 = this.f6049B;
        long j8 = this.f6059L;
        j jVar = this.f12435g;
        l.k(jVar);
        C1048n nVar = this.f6066k;
        d dVar = this.f6079x;
        long j9 = j8;
        b bVar = new b(i8, cVar, this.f6069n, intValue, this.f6065j, a9, this.f6067l, eVar2, this.f6068m, a8, j9, this.f6080y, eVar, nVar, dVar, jVar);
        this.f6076u.put(i8, bVar);
        return bVar;
    }

    public final synchronized C h() {
        return this.f6063P;
    }

    public final void j() {
        this.f6080y.a();
    }

    public final void l(A a8) {
        this.f6049B = a8;
        Looper myLooper = Looper.myLooper();
        j jVar = this.f12435g;
        l.k(jVar);
        h hVar = this.f6067l;
        hVar.c(myLooper, jVar);
        hVar.i();
        if (this.f6064h) {
            x(false);
            return;
        }
        this.z = this.i.g();
        this.f6048A = new p("DashMediaSource");
        this.f6051D = z.m((Handler.Callback) null);
        y();
    }

    public final void n(C1059z zVar) {
        b bVar = (b) zVar;
        o oVar = bVar.f6023g0;
        oVar.f6121c0 = true;
        oVar.f6116X.removeCallbacksAndMessages((Object) null);
        for (C1094g B8 : bVar.f6028l0) {
            B8.B(bVar);
        }
        bVar.f6027k0 = null;
        this.f6076u.remove(bVar.f6011U);
    }

    public final void p() {
        this.f6056I = false;
        this.z = null;
        p pVar = this.f6048A;
        if (pVar != null) {
            pVar.e((n) null);
            this.f6048A = null;
        }
        this.f6057J = 0;
        this.f6058K = 0;
        this.f6053F = this.f6054G;
        this.f6050C = null;
        Handler handler = this.f6051D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f6051D = null;
        }
        this.f6059L = -9223372036854775807L;
        this.f6060M = 0;
        this.f6061N = -9223372036854775807L;
        this.f6076u.clear();
        q qVar = this.f6069n;
        ((HashMap) qVar.f449U).clear();
        ((HashMap) qVar.f450V).clear();
        ((HashMap) qVar.f451W).clear();
        this.f6067l.release();
    }

    public final synchronized void s(C c8) {
        this.f6063P = c8;
    }

    public final void u() {
        boolean z6;
        p pVar = this.f6048A;
        d dVar = new d(this, 0);
        synchronized (C1207b.f13344b) {
            z6 = C1207b.f13345c;
        }
        if (z6) {
            dVar.b();
            return;
        }
        if (pVar == null) {
            pVar = new p("SntpClient");
        }
        pVar.f(new C1048n(7), new C1160q(5, (Object) dVar), 1);
    }

    public final void v(s sVar, long j7, long j8) {
        s sVar2 = sVar;
        long j9 = sVar2.f13153U;
        Uri uri = sVar2.f13156X.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f6068m.getClass();
        this.f6072q.c(tVar, sVar2.f13155W, -1, (M0.r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void w(IOException iOException) {
        l.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f6059L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        x(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ef, code lost:
        if (r10 != -9223372036854775807L) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035d, code lost:
        if (r1.f3052a == -9223372036854775807L) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c3, code lost:
        r2 = r40;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x01c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(boolean r41) {
        /*
            r40 = this;
            r1 = r40
            r2 = 0
            r3 = 0
        L_0x0004:
            android.util.SparseArray r0 = r1.f6076u
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x00e5
            int r4 = r0.keyAt(r3)
            int r6 = r1.f6062O
            if (r4 < r6) goto L_0x00e0
            java.lang.Object r0 = r0.valueAt(r3)
            r6 = r0
            W0.b r6 = (W0.b) r6
            X0.c r7 = r1.f6055H
            int r0 = r1.f6062O
            int r4 = r4 - r0
            r6.f6031o0 = r7
            r6.p0 = r4
            W0.o r0 = r6.f6023g0
            r0.f6120b0 = r2
            r0.f6118Z = r7
            java.util.TreeMap r8 = r0.f6117Y
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0034:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0056
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            X0.c r11 = r0.f6118Z
            long r11 = r11.f6220h
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0034
            r8.remove()
            goto L_0x0034
        L_0x0056:
            i1.g[] r8 = r6.f6028l0
            if (r8 == 0) goto L_0x0097
            int r9 = r8.length
            r10 = 0
        L_0x005c:
            if (r10 >= r9) goto L_0x0092
            r0 = r8[r10]
            W0.k r11 = r0.f12677Y
            W0.i[] r0 = r11.i
            r11.f6095k = r7     // Catch:{ b -> 0x008b }
            r11.f6096l = r4     // Catch:{ b -> 0x008b }
            long r12 = r7.d(r4)     // Catch:{ b -> 0x008b }
            java.util.ArrayList r14 = r11.a()     // Catch:{ b -> 0x008b }
            r15 = 0
        L_0x0071:
            int r2 = r0.length     // Catch:{ b -> 0x008b }
            if (r15 >= r2) goto L_0x008e
            k1.r r2 = r11.f6094j     // Catch:{ b -> 0x008b }
            int r2 = r2.g(r15)     // Catch:{ b -> 0x008b }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ b -> 0x008b }
            X0.m r2 = (X0.m) r2     // Catch:{ b -> 0x008b }
            r5 = r0[r15]     // Catch:{ b -> 0x008b }
            W0.i r2 = r5.a(r12, r2)     // Catch:{ b -> 0x008b }
            r0[r15] = r2     // Catch:{ b -> 0x008b }
            int r15 = r15 + 1
            goto L_0x0071
        L_0x008b:
            r0 = move-exception
            r11.f6097m = r0
        L_0x008e:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x005c
        L_0x0092:
            h1.y r0 = r6.f6027k0
            r0.f0(r6)
        L_0x0097:
            X0.h r0 = r7.b(r4)
            java.util.List r0 = r0.f6246d
            r6.f6032q0 = r0
            W0.l[] r0 = r6.f6029m0
            int r2 = r0.length
            r5 = 0
        L_0x00a3:
            if (r5 >= r2) goto L_0x00e0
            r8 = r0[r5]
            java.util.List r9 = r6.f6032q0
            java.util.Iterator r9 = r9.iterator()
        L_0x00ad:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00dd
            java.lang.Object r10 = r9.next()
            X0.g r10 = (X0.g) r10
            java.lang.String r11 = r10.a()
            X0.g r12 = r8.f6103Y
            java.lang.String r12 = r12.a()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ad
            java.util.List r9 = r7.f6224m
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
            boolean r11 = r7.f6217d
            if (r11 == 0) goto L_0x00d9
            if (r4 != r9) goto L_0x00d9
            r9 = 1
            goto L_0x00da
        L_0x00d9:
            r9 = 0
        L_0x00da:
            r8.b(r10, r9)
        L_0x00dd:
            int r5 = r5 + 1
            goto L_0x00a3
        L_0x00e0:
            int r3 = r3 + 1
            r2 = 0
            goto L_0x0004
        L_0x00e5:
            X0.c r0 = r1.f6055H
            r2 = 0
            X0.h r0 = r0.b(r2)
            X0.c r2 = r1.f6055H
            java.util.List r2 = r2.f6224m
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            X0.c r3 = r1.f6055H
            X0.h r3 = r3.b(r2)
            X0.c r4 = r1.f6055H
            long r4 = r4.d(r2)
            long r6 = r1.f6059L
            long r6 = P0.z.y(r6)
            long r6 = P0.z.O(r6)
            X0.c r2 = r1.f6055H
            r8 = 0
            long r9 = r2.d(r8)
            long r11 = r0.f6244b
            long r11 = P0.z.O(r11)
            boolean r2 = t(r0)
            r13 = r11
            r8 = 0
        L_0x011f:
            java.util.List r15 = r0.f6245c
            r17 = r0
            int r0 = r15.size()
            r18 = r2
            if (r8 >= r0) goto L_0x0178
            java.lang.Object r0 = r15.get(r8)
            X0.a r0 = (X0.a) r0
            java.util.List r15 = r0.f6207c
            int r0 = r0.f6206b
            r1 = 1
            if (r0 == r1) goto L_0x013d
            r1 = 2
            if (r0 == r1) goto L_0x013d
            r0 = 1
            goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            if (r18 == 0) goto L_0x0142
            if (r0 != 0) goto L_0x016f
        L_0x0142:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0149
            goto L_0x016f
        L_0x0149:
            r1 = 0
            java.lang.Object r0 = r15.get(r1)
            X0.m r0 = (X0.m) r0
            W0.h r0 = r0.c()
            if (r0 != 0) goto L_0x0157
            goto L_0x0179
        L_0x0157:
            long r1 = r0.j0(r9, r6)
            r20 = 0
            int r15 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r15 != 0) goto L_0x0162
            goto L_0x0179
        L_0x0162:
            long r1 = r0.t(r9, r6)
            long r0 = r0.b(r1)
            long r0 = r0 + r11
            long r13 = java.lang.Math.max(r13, r0)
        L_0x016f:
            int r8 = r8 + 1
            r1 = r40
            r0 = r17
            r2 = r18
            goto L_0x011f
        L_0x0178:
            r11 = r13
        L_0x0179:
            long r0 = r3.f6244b
            long r0 = P0.z.O(r0)
            boolean r2 = t(r3)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
        L_0x0189:
            java.util.List r13 = r3.f6245c
            int r14 = r13.size()
            if (r10 >= r14) goto L_0x01fa
            java.lang.Object r14 = r13.get(r10)
            X0.a r14 = (X0.a) r14
            java.util.List r15 = r14.f6207c
            int r14 = r14.f6206b
            r18 = r3
            r3 = 1
            if (r14 == r3) goto L_0x01a5
            r3 = 2
            if (r14 == r3) goto L_0x01a6
            r14 = 1
            goto L_0x01a7
        L_0x01a5:
            r3 = 2
        L_0x01a6:
            r14 = 0
        L_0x01a7:
            if (r2 == 0) goto L_0x01ab
            if (r14 != 0) goto L_0x01b1
        L_0x01ab:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x01b5
        L_0x01b1:
            r24 = r0
            r0 = r4
            goto L_0x01f2
        L_0x01b5:
            r14 = 0
            java.lang.Object r15 = r15.get(r14)
            X0.m r15 = (X0.m) r15
            W0.h r14 = r15.c()
            if (r14 != 0) goto L_0x01c6
            long r0 = r0 + r4
        L_0x01c3:
            r2 = r40
            goto L_0x01fd
        L_0x01c6:
            long r22 = r14.j0(r4, r6)
            r19 = 0
            int r15 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x01d1
            goto L_0x01c3
        L_0x01d1:
            long r24 = r14.t(r4, r6)
            long r24 = r24 + r22
            r22 = 1
            r26 = r4
            long r3 = r24 - r22
            long r22 = r14.b(r3)
            long r22 = r22 + r0
            r24 = r0
            r0 = r26
            long r3 = r14.h(r3, r0)
            long r3 = r3 + r22
            long r3 = java.lang.Math.min(r8, r3)
            r8 = r3
        L_0x01f2:
            int r10 = r10 + 1
            r4 = r0
            r3 = r18
            r0 = r24
            goto L_0x0189
        L_0x01fa:
            r2 = r40
            r0 = r8
        L_0x01fd:
            X0.c r3 = r2.f6055H
            boolean r3 = r3.f6217d
            if (r3 == 0) goto L_0x022b
            r3 = 0
        L_0x0204:
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x0229
            java.lang.Object r4 = r13.get(r3)
            X0.a r4 = (X0.a) r4
            java.util.List r4 = r4.f6207c
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            X0.m r4 = (X0.m) r4
            W0.h r4 = r4.c()
            if (r4 == 0) goto L_0x022b
            boolean r4 = r4.L()
            if (r4 == 0) goto L_0x0226
            goto L_0x022b
        L_0x0226:
            int r3 = r3 + 1
            goto L_0x0204
        L_0x0229:
            r3 = 1
            goto L_0x022c
        L_0x022b:
            r3 = 0
        L_0x022c:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0245
            X0.c r8 = r2.f6055H
            long r8 = r8.f6218f
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0245
            long r8 = P0.z.O(r8)
            long r8 = r0 - r8
            long r11 = java.lang.Math.max(r11, r8)
        L_0x0245:
            long r32 = r0 - r11
            X0.c r0 = r2.f6055H
            boolean r1 = r0.f6217d
            if (r1 == 0) goto L_0x03a3
            long r0 = r0.f6214a
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0255
            r0 = 1
            goto L_0x0256
        L_0x0255:
            r0 = 0
        L_0x0256:
            P0.l.j(r0)
            X0.c r0 = r2.f6055H
            long r0 = r0.f6214a
            long r0 = P0.z.O(r0)
            long r6 = r6 - r0
            long r6 = r6 - r11
            M0.C r0 = r40.h()
            M0.y r0 = r0.f2787c
            long r8 = P0.z.c0(r6)
            long r13 = r0.f3058c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0278
            long r13 = java.lang.Math.min(r8, r13)
            goto L_0x028a
        L_0x0278:
            X0.c r1 = r2.f6055H
            M0.x r1 = r1.f6221j
            if (r1 == 0) goto L_0x0289
            long r13 = r1.f3054c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0289
            long r13 = java.lang.Math.min(r8, r13)
            goto L_0x028a
        L_0x0289:
            r13 = r8
        L_0x028a:
            long r18 = r6 - r32
            long r18 = P0.z.c0(r18)
            r20 = 0
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x029c
            int r1 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x029c
            r18 = 0
        L_0x029c:
            X0.c r1 = r2.f6055H
            r28 = r11
            long r10 = r1.f6216c
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02af
            long r10 = r18 + r10
            long r10 = java.lang.Math.min(r10, r8)
            r24 = r10
            goto L_0x02b1
        L_0x02af:
            r24 = r18
        L_0x02b1:
            long r10 = r0.f3057b
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02c2
            r22 = r10
            r26 = r8
            long r24 = P0.z.j(r22, r24, r26)
        L_0x02bf:
            r8 = r24
            goto L_0x02d7
        L_0x02c2:
            X0.c r1 = r2.f6055H
            M0.x r1 = r1.f6221j
            if (r1 == 0) goto L_0x02bf
            long r10 = r1.f3053b
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02bf
            r22 = r10
            r26 = r8
            long r24 = P0.z.j(r22, r24, r26)
            goto L_0x02bf
        L_0x02d7:
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x02dc
            r13 = r8
        L_0x02dc:
            M0.y r1 = r2.f6052E
            long r10 = r1.f3056a
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02e5
            goto L_0x02fb
        L_0x02e5:
            X0.c r1 = r2.f6055H
            M0.x r10 = r1.f6221j
            if (r10 == 0) goto L_0x02f2
            long r10 = r10.f3052a
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x02f2
            goto L_0x02fb
        L_0x02f2:
            long r10 = r1.f6219g
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02f9
            goto L_0x02fb
        L_0x02f9:
            long r10 = r2.f6070o
        L_0x02fb:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0300
            r10 = r8
        L_0x0300:
            long r4 = r2.f6071p
            r22 = 2
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x031c
            long r10 = r32 / r22
            long r10 = java.lang.Math.min(r4, r10)
            long r10 = r6 - r10
            long r34 = P0.z.c0(r10)
            r36 = r8
            r38 = r13
            long r10 = P0.z.j(r34, r36, r38)
        L_0x031c:
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r12 = r0.f3059d
            int r15 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r15 == 0) goto L_0x0326
            goto L_0x0332
        L_0x0326:
            X0.c r12 = r2.f6055H
            M0.x r12 = r12.f6221j
            if (r12 == 0) goto L_0x032f
            float r12 = r12.f3055d
            goto L_0x0332
        L_0x032f:
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0332:
            float r0 = r0.e
            int r15 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r15 == 0) goto L_0x0339
            goto L_0x0345
        L_0x0339:
            X0.c r0 = r2.f6055H
            M0.x r0 = r0.f6221j
            if (r0 == 0) goto L_0x0342
            float r0 = r0.e
            goto L_0x0345
        L_0x0342:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0345:
            int r15 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x0364
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0364
            X0.c r1 = r2.f6055H
            M0.x r1 = r1.f6221j
            if (r1 == 0) goto L_0x035f
            r15 = r0
            long r0 = r1.f3052a
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r24 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r24 != 0) goto L_0x0365
        L_0x035f:
            r12 = 1065353216(0x3f800000, float:1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0366
        L_0x0364:
            r15 = r0
        L_0x0365:
            r0 = r15
        L_0x0366:
            M0.x r1 = new M0.x
            r1.<init>()
            r1.f3052a = r10
            r1.f3053b = r8
            r1.f3054c = r13
            r1.f3055d = r12
            r1.e = r0
            M0.y r0 = new M0.y
            r0.<init>(r1)
            r2.f6052E = r0
            X0.c r0 = r2.f6055H
            long r0 = r0.f6214a
            long r8 = P0.z.c0(r28)
            long r8 = r8 + r0
            M0.y r0 = r2.f6052E
            long r0 = r0.f3056a
            long r0 = P0.z.O(r0)
            long r0 = r6 - r0
            long r6 = r32 / r22
            long r4 = java.lang.Math.min(r4, r6)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x03a0
            r34 = r4
        L_0x039b:
            r25 = r8
            r0 = r17
            goto L_0x03ae
        L_0x03a0:
            r34 = r0
            goto L_0x039b
        L_0x03a3:
            r28 = r11
            r0 = r17
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = 0
        L_0x03ae:
            long r0 = r0.f6244b
            long r0 = P0.z.O(r0)
            long r30 = r28 - r0
            W0.e r0 = new W0.e
            X0.c r1 = r2.f6055H
            long r4 = r1.f6214a
            long r6 = r2.f6059L
            int r8 = r2.f6062O
            M0.C r37 = r40.h()
            X0.c r9 = r2.f6055H
            boolean r9 = r9.f6217d
            if (r9 == 0) goto L_0x03cf
            M0.y r9 = r2.f6052E
        L_0x03cc:
            r38 = r9
            goto L_0x03d1
        L_0x03cf:
            r9 = 0
            goto L_0x03cc
        L_0x03d1:
            r22 = r0
            r23 = r4
            r27 = r6
            r29 = r8
            r36 = r1
            r22.<init>(r23, r25, r27, r29, r30, r32, r34, r36, r37, r38)
            r2.m(r0)
            boolean r0 = r2.f6064h
            if (r0 != 0) goto L_0x04ad
            android.os.Handler r0 = r2.f6051D
            W0.c r1 = r2.f6078w
            r0.removeCallbacks(r1)
            r4 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x0477
            android.os.Handler r0 = r2.f6051D
            X0.c r3 = r2.f6055H
            long r6 = r2.f6059L
            long r6 = P0.z.y(r6)
            java.util.List r8 = r3.f6224m
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
            X0.h r9 = r3.b(r8)
            long r10 = r9.f6244b
            long r10 = P0.z.O(r10)
            long r12 = r3.d(r8)
            long r6 = P0.z.O(r6)
            long r14 = r3.f6214a
            long r14 = P0.z.O(r14)
            long r16 = P0.z.O(r4)
            r4 = r16
            r3 = 0
        L_0x0421:
            java.util.List r8 = r9.f6245c
            r22 = r9
            int r9 = r8.size()
            if (r3 >= r9) goto L_0x046c
            java.lang.Object r8 = r8.get(r3)
            X0.a r8 = (X0.a) r8
            java.util.List r8 = r8.f6207c
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x043b
            r9 = 0
            goto L_0x0467
        L_0x043b:
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            X0.m r8 = (X0.m) r8
            W0.h r8 = r8.c()
            if (r8 == 0) goto L_0x0467
            long r23 = r14 + r10
            long r25 = r8.E(r12, r6)
            long r25 = r25 + r23
            long r25 = r25 - r6
            r23 = 100000(0x186a0, double:4.94066E-319)
            long r27 = r4 - r23
            int r8 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r8 < 0) goto L_0x0465
            int r8 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0467
            long r23 = r4 + r23
            int r8 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r8 >= 0) goto L_0x0467
        L_0x0465:
            r4 = r25
        L_0x0467:
            int r3 = r3 + 1
            r9 = r22
            goto L_0x0421
        L_0x046c:
            r6 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            long r3 = B.C0003d.o(r4, r6, r3)
            r0.postDelayed(r1, r3)
        L_0x0477:
            boolean r0 = r2.f6056I
            if (r0 == 0) goto L_0x047f
            r40.y()
            goto L_0x04ad
        L_0x047f:
            if (r41 == 0) goto L_0x04ad
            X0.c r0 = r2.f6055H
            boolean r1 = r0.f6217d
            if (r1 == 0) goto L_0x04ad
            long r0 = r0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x04ad
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x049a
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x049a:
            long r5 = r2.f6057J
            long r5 = r5 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            long r0 = java.lang.Math.max(r3, r5)
            android.os.Handler r3 = r2.f6051D
            W0.c r4 = r2.f6077v
            r3.postDelayed(r4, r0)
        L_0x04ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.g.x(boolean):void");
    }

    public final void y() {
        Uri uri;
        this.f6051D.removeCallbacks(this.f6077v);
        if (!this.f6048A.c()) {
            if (this.f6048A.d()) {
                this.f6056I = true;
                return;
            }
            synchronized (this.f6075t) {
                uri = this.f6053F;
            }
            this.f6056I = false;
            s sVar = new s(this.z, uri, 4, this.f6073r);
            d dVar = this.f6074s;
            this.f6068m.getClass();
            this.f6072q.g(new C1053t(sVar.f13153U, sVar.f13154V, this.f6048A.f(sVar, dVar, 3)), sVar.f13155W, -1, (M0.r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
