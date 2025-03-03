package T0;

import B.B;
import B.C0002c;
import M0.C;
import M0.C0136y;
import M0.J;
import M0.L;
import M0.U;
import M0.V;
import M0.W;
import M0.X;
import N.e;
import P0.l;
import P0.q;
import P0.v;
import P0.z;
import Q3.f;
import R0.i;
import U0.j;
import Y0.c;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.sdp.SdpErrno;
import h1.C1031B;
import h1.C1036b;
import h1.C1058y;
import h1.C1059z;
import h1.Y;
import h1.a0;
import h1.b0;
import j$.util.Objects;
import j1.C1119d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.p;
import k1.r;
import k1.t;
import k1.u;
import l1.d;
import l1.h;

public final class F implements Handler.Callback, C1058y, Y {

    /* renamed from: Q0  reason: collision with root package name */
    public static final long f4621Q0 = z.c0(10000);

    /* renamed from: A0  reason: collision with root package name */
    public long f4622A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f4623B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f4624C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f4625D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f4626E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f4627F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f4628G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f4629H0;

    /* renamed from: I0  reason: collision with root package name */
    public E f4630I0;

    /* renamed from: J0  reason: collision with root package name */
    public long f4631J0;

    /* renamed from: K0  reason: collision with root package name */
    public long f4632K0;

    /* renamed from: L0  reason: collision with root package name */
    public int f4633L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f4634M0;

    /* renamed from: N0  reason: collision with root package name */
    public C0220l f4635N0;

    /* renamed from: O0  reason: collision with root package name */
    public long f4636O0;

    /* renamed from: P0  reason: collision with root package name */
    public C0222n f4637P0;

    /* renamed from: U  reason: collision with root package name */
    public final C0213e[] f4638U;

    /* renamed from: V  reason: collision with root package name */
    public final Set f4639V;

    /* renamed from: W  reason: collision with root package name */
    public final C0213e[] f4640W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean[] f4641X;

    /* renamed from: Y  reason: collision with root package name */
    public final t f4642Y;

    /* renamed from: Z  reason: collision with root package name */
    public final u f4643Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0218j f4644a0;

    /* renamed from: b0  reason: collision with root package name */
    public final d f4645b0;

    /* renamed from: c0  reason: collision with root package name */
    public final v f4646c0;

    /* renamed from: d0  reason: collision with root package name */
    public final q f4647d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Looper f4648e0;

    /* renamed from: f0  reason: collision with root package name */
    public final W f4649f0;

    /* renamed from: g0  reason: collision with root package name */
    public final V f4650g0;

    /* renamed from: h0  reason: collision with root package name */
    public final long f4651h0;

    /* renamed from: i0  reason: collision with root package name */
    public final f f4652i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f4653j0;

    /* renamed from: k0  reason: collision with root package name */
    public final P0.t f4654k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C0226s f4655l0;

    /* renamed from: m0  reason: collision with root package name */
    public final M f4656m0;

    /* renamed from: n0  reason: collision with root package name */
    public final W f4657n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C0216h f4658o0;
    public final long p0;

    /* renamed from: q0  reason: collision with root package name */
    public final j f4659q0;

    /* renamed from: r0  reason: collision with root package name */
    public final U0.d f4660r0;

    /* renamed from: s0  reason: collision with root package name */
    public final v f4661s0;

    /* renamed from: t0  reason: collision with root package name */
    public e0 f4662t0;

    /* renamed from: u0  reason: collision with root package name */
    public X f4663u0;

    /* renamed from: v0  reason: collision with root package name */
    public C f4664v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f4665w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f4666x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f4667y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f4668z0;

    public F(C0213e[] eVarArr, t tVar, u uVar, C0218j jVar, d dVar, int i, boolean z, U0.d dVar2, e0 e0Var, C0216h hVar, long j7, Looper looper, P0.t tVar2, C0226s sVar, j jVar2, C0222n nVar) {
        C0213e[] eVarArr2 = eVarArr;
        t tVar3 = tVar;
        C0218j jVar3 = jVar;
        d dVar3 = dVar;
        U0.d dVar4 = dVar2;
        P0.t tVar4 = tVar2;
        j jVar4 = jVar2;
        C0222n nVar2 = nVar;
        this.f4655l0 = sVar;
        this.f4638U = eVarArr2;
        this.f4642Y = tVar3;
        this.f4643Z = uVar;
        this.f4644a0 = jVar3;
        this.f4645b0 = dVar3;
        this.f4624C0 = i;
        this.f4625D0 = z;
        this.f4662t0 = e0Var;
        this.f4658o0 = hVar;
        this.p0 = j7;
        this.f4654k0 = tVar4;
        this.f4659q0 = jVar4;
        this.f4637P0 = nVar2;
        this.f4660r0 = dVar4;
        this.f4636O0 = -9223372036854775807L;
        this.f4622A0 = -9223372036854775807L;
        this.f4651h0 = jVar3.f4860g;
        U u3 = X.f2884a;
        X i8 = X.i(uVar);
        this.f4663u0 = i8;
        this.f4664v0 = new C(i8);
        this.f4640W = new C0213e[eVarArr2.length];
        this.f4641X = new boolean[eVarArr2.length];
        p pVar = (p) tVar3;
        pVar.getClass();
        for (int i9 = 0; i9 < eVarArr2.length; i9++) {
            C0213e eVar = eVarArr2[i9];
            eVar.f4802Y = i9;
            eVar.f4803Z = jVar4;
            eVar.f4804a0 = tVar4;
            this.f4640W[i9] = eVar;
            C0213e eVar2 = this.f4640W[i9];
            synchronized (eVar2.f4798U) {
                eVar2.f4814k0 = pVar;
            }
        }
        this.f4652i0 = new f(this, tVar4);
        this.f4653j0 = new ArrayList();
        this.f4639V = Collections.newSetFromMap(new IdentityHashMap());
        this.f4649f0 = new W();
        this.f4650g0 = new V();
        tVar3.f13007a = this;
        tVar3.f13008b = dVar3;
        this.f4634M0 = true;
        v a8 = tVar4.a(looper, (Handler.Callback) null);
        this.f4661s0 = a8;
        this.f4656m0 = new M(dVar4, a8, new B(21, this), nVar2);
        this.f4657n0 = new W(this, dVar4, a8, jVar4);
        q qVar = new q(4, (byte) 0);
        this.f4647d0 = qVar;
        Looper n4 = qVar.n();
        this.f4648e0 = n4;
        this.f4646c0 = tVar4.a(n4, this);
    }

    public static Pair J(X x8, E e, boolean z, int i, boolean z6, W w2, V v4) {
        X x9;
        int K4;
        X x10 = x8;
        E e8 = e;
        V v8 = v4;
        X x11 = e8.f4618a;
        if (x8.p()) {
            return null;
        }
        if (x11.p()) {
            x9 = x10;
        } else {
            x9 = x11;
        }
        try {
            Pair i8 = x9.i(w2, v4, e8.f4619b, e8.f4620c);
            if (x8.equals(x9)) {
                return i8;
            }
            if (x8.b(i8.first) == -1) {
                W w4 = w2;
                if (z && (K4 = K(w2, v4, i, z6, i8.first, x9, x8)) != -1) {
                    return x8.i(w2, v4, K4, -9223372036854775807L);
                }
                return null;
            } else if (!x9.g(i8.first, v8).f2866f || x9.m(v8.f2864c, w2, 0).f2881n != x9.b(i8.first)) {
                return i8;
            } else {
                return x8.i(w2, v4, x8.g(i8.first, v8).f2864c, e8.f4620c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static int K(W w2, V v4, int i, boolean z, Object obj, X x8, X x9) {
        W w4 = w2;
        V v8 = v4;
        Object obj2 = obj;
        X x10 = x8;
        X x11 = x9;
        Object obj3 = x10.m(x10.g(obj2, v8).f2864c, w2, 0).f2870a;
        for (int i8 = 0; i8 < x9.o(); i8++) {
            if (x11.m(i8, w2, 0).f2870a.equals(obj3)) {
                return i8;
            }
        }
        int b8 = x10.b(obj2);
        int h5 = x8.h();
        int i9 = b8;
        int i10 = -1;
        for (int i11 = 0; i11 < h5 && i10 == -1; i11++) {
            i9 = x8.d(i9, v4, w2, i, z);
            if (i9 == -1) {
                break;
            }
            i10 = x11.b(x10.l(i9));
        }
        if (i10 == -1) {
            return -1;
        }
        return x11.f(i10, v8, false).f2864c;
    }

    public static void R(C0213e eVar, long j7) {
        eVar.f4811h0 = true;
        if (eVar instanceof C1119d) {
            C1119d dVar = (C1119d) eVar;
            l.j(dVar.f4811h0);
            dVar.f12848D0 = j7;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [h1.a0, h1.z, java.lang.Object] */
    public static boolean p(K k8) {
        long j7;
        if (k8 == null) {
            return false;
        }
        try {
            ? r12 = k8.f4678a;
            if (!k8.e) {
                r12.r();
            } else {
                for (Y y8 : k8.f4680c) {
                    if (y8 != null) {
                        y8.a();
                    }
                }
            }
            if (!k8.e) {
                j7 = 0;
            } else {
                j7 = r12.e();
            }
            if (j7 != Long.MIN_VALUE) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean q(C0213e eVar) {
        if (eVar.f4805b0 != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f4665w0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0029
            android.os.Looper r0 = r3.f4648e0     // Catch:{ all -> 0x0027 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0029
        L_0x0012:
            P0.v r0 = r3.f4646c0     // Catch:{ all -> 0x0027 }
            r1 = 7
            r0.e(r1)     // Catch:{ all -> 0x0027 }
            T0.z r0 = new T0.z     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0027 }
            long r1 = r3.p0     // Catch:{ all -> 0x0027 }
            r3.o0(r0, r1)     // Catch:{ all -> 0x0027 }
            boolean r0 = r3.f4665w0     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)
            return r0
        L_0x0027:
            r0 = move-exception
            goto L_0x002c
        L_0x0029:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.F.A():boolean");
    }

    public final void B() {
        try {
            F(true, false, true, false);
            C();
            C0218j jVar = this.f4644a0;
            if (jVar.f4861h.remove(this.f4659q0) != null) {
                jVar.d();
            }
            if (jVar.f4861h.isEmpty()) {
                jVar.i = -1;
            }
            b0(1);
            this.f4647d0.p();
            synchronized (this) {
                this.f4665w0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f4647d0.p();
            synchronized (this) {
                this.f4665w0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void C() {
        boolean z;
        for (int i = 0; i < this.f4638U.length; i++) {
            C0213e eVar = this.f4640W[i];
            synchronized (eVar.f4798U) {
                eVar.f4814k0 = null;
            }
            C0213e eVar2 = this.f4638U[i];
            if (eVar2.f4805b0 == 0) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            eVar2.p();
        }
    }

    public final void D(int i, int i8, b0 b0Var) {
        boolean z = true;
        this.f4664v0.f(1);
        W w2 = this.f4657n0;
        w2.getClass();
        if (i < 0 || i > i8 || i8 > ((ArrayList) w2.f4740c).size()) {
            z = false;
        }
        l.d(z);
        w2.f4746k = b0Var;
        w2.i(i, i8);
        k(w2.c(), false);
    }

    public final void E() {
        u uVar;
        boolean z;
        float f8 = this.f4652i0.c().f2846a;
        M m8 = this.f4656m0;
        K k8 = m8.i;
        K k9 = m8.f4706j;
        u uVar2 = null;
        K k10 = k8;
        boolean z6 = true;
        while (k10 != null && k10.e) {
            X x8 = this.f4663u0;
            u j7 = k10.j(f8, x8.f4749a, x8.f4758l);
            if (k10 == this.f4656m0.i) {
                uVar = j7;
            } else {
                uVar = uVar2;
            }
            u uVar3 = k10.f4690o;
            if (uVar3 != null) {
                int length = uVar3.f13011c.length;
                r[] rVarArr = j7.f13011c;
                if (length == rVarArr.length) {
                    int i = 0;
                    while (i < rVarArr.length) {
                        if (j7.a(uVar3, i)) {
                            i++;
                        }
                    }
                    if (k10 == k9) {
                        z6 = false;
                    }
                    k10 = k10.f4688m;
                    uVar2 = uVar;
                }
            }
            if (z6) {
                M m9 = this.f4656m0;
                K k11 = m9.i;
                boolean l8 = m9.l(k11);
                boolean[] zArr = new boolean[this.f4638U.length];
                uVar.getClass();
                long a8 = k11.a(uVar, this.f4663u0.f4765s, l8, zArr);
                X x9 = this.f4663u0;
                if (x9.e == 4 || a8 == x9.f4765s) {
                    z = false;
                } else {
                    z = true;
                }
                X x10 = this.f4663u0;
                K k12 = k11;
                boolean[] zArr2 = zArr;
                this.f4663u0 = n(x10.f4750b, a8, x10.f4751c, x10.f4752d, z, 5);
                if (z) {
                    H(a8);
                }
                boolean[] zArr3 = new boolean[this.f4638U.length];
                int i8 = 0;
                while (true) {
                    C0213e[] eVarArr = this.f4638U;
                    if (i8 >= eVarArr.length) {
                        break;
                    }
                    C0213e eVar = eVarArr[i8];
                    boolean q7 = q(eVar);
                    zArr3[i8] = q7;
                    Y y8 = k12.f4680c[i8];
                    if (q7) {
                        if (y8 != eVar.f4806c0) {
                            b(i8);
                        } else if (zArr2[i8]) {
                            long j8 = this.f4631J0;
                            eVar.f4811h0 = false;
                            eVar.f4809f0 = j8;
                            eVar.f4810g0 = j8;
                            eVar.o(j8, false);
                            i8++;
                        }
                    }
                    i8++;
                }
                d(zArr3, this.f4631J0);
            } else {
                this.f4656m0.l(k10);
                if (k10.e) {
                    k10.a(j7, Math.max(k10.f4683g.f4693b, this.f4631J0 - k10.f4691p), false, new boolean[k10.f4685j.length]);
                }
            }
            j(true);
            if (this.f4663u0.e != 4) {
                s();
                l0();
                this.f4646c0.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            P0.v r0 = r1.f4646c0
            r2 = 2
            r0.d(r2)
            r2 = 0
            r1.f4635N0 = r2
            r3 = 0
            r4 = 1
            r1.n0(r3, r4)
            Q3.f r0 = r1.f4652i0
            r0.f4113V = r3
            java.lang.Object r0 = r0.f4114W
            T0.f0 r0 = (T0.f0) r0
            boolean r5 = r0.f4829V
            if (r5 == 0) goto L_0x0025
            long r5 = r0.e()
            r0.b(r5)
            r0.f4829V = r3
        L_0x0025:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f4631J0 = r5
            r5 = 0
        L_0x002d:
            T0.e[] r6 = r1.f4638U
            int r0 = r6.length
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r5 >= r0) goto L_0x0042
            r1.b(r5)     // Catch:{ l -> 0x003a, RuntimeException -> 0x0038 }
            goto L_0x0040
        L_0x0038:
            r0 = move-exception
            goto L_0x003b
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            java.lang.String r6 = "Disable failed."
            P0.l.p(r7, r6, r0)
        L_0x0040:
            int r5 = r5 + r4
            goto L_0x002d
        L_0x0042:
            if (r34 == 0) goto L_0x005f
            int r5 = r6.length
            r8 = 0
        L_0x0046:
            if (r8 >= r5) goto L_0x005f
            r0 = r6[r8]
            java.util.Set r9 = r1.f4639V
            boolean r9 = r9.remove(r0)
            if (r9 == 0) goto L_0x005d
            r0.x()     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Reset failed."
            P0.l.p(r7, r0, r9)
        L_0x005d:
            int r8 = r8 + r4
            goto L_0x0046
        L_0x005f:
            r1.f4629H0 = r3
            T0.X r0 = r1.f4663u0
            h1.B r5 = r0.f4750b
            long r6 = r0.f4765s
            T0.X r0 = r1.f4663u0
            h1.B r0 = r0.f4750b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x008f
            T0.X r0 = r1.f4663u0
            M0.V r8 = r1.f4650g0
            h1.B r9 = r0.f4750b
            M0.X r0 = r0.f4749a
            boolean r10 = r0.p()
            if (r10 != 0) goto L_0x008f
            java.lang.Object r9 = r9.f12277a
            M0.V r0 = r0.g(r9, r8)
            boolean r0 = r0.f2866f
            if (r0 == 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            T0.X r0 = r1.f4663u0
            long r8 = r0.f4765s
            goto L_0x0093
        L_0x008f:
            T0.X r0 = r1.f4663u0
            long r8 = r0.f4751c
        L_0x0093:
            if (r35 == 0) goto L_0x00bf
            r1.f4630I0 = r2
            T0.X r0 = r1.f4663u0
            M0.X r0 = r0.f4749a
            android.util.Pair r0 = r1.f(r0)
            java.lang.Object r5 = r0.first
            h1.B r5 = (h1.C1031B) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            T0.X r0 = r1.f4663u0
            h1.B r0 = r0.f4750b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00bf
            r28 = r6
            r9 = r8
            r0 = 1
            goto L_0x00c3
        L_0x00bf:
            r28 = r6
            r9 = r8
            r0 = 0
        L_0x00c3:
            T0.M r6 = r1.f4656m0
            r6.b()
            r1.f4623B0 = r3
            T0.X r6 = r1.f4663u0
            M0.X r6 = r6.f4749a
            if (r36 == 0) goto L_0x0124
            boolean r7 = r6 instanceof T0.c0
            if (r7 == 0) goto L_0x0124
            T0.c0 r6 = (T0.c0) r6
            T0.W r7 = r1.f4657n0
            java.lang.Object r7 = r7.f4746k
            h1.b0 r7 = (h1.b0) r7
            M0.X[] r8 = r6.f4789h
            int r11 = r8.length
            M0.X[] r11 = new M0.X[r11]
            r12 = 0
        L_0x00e2:
            int r13 = r8.length
            if (r12 >= r13) goto L_0x00f0
            T0.b0 r13 = new T0.b0
            r14 = r8[r12]
            r13.<init>(r14)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x00e2
        L_0x00f0:
            T0.c0 r8 = new T0.c0
            java.lang.Object[] r6 = r6.i
            r8.<init>(r11, r6, r7)
            int r6 = r5.f12278b
            r7 = -1
            if (r6 == r7) goto L_0x0121
            java.lang.Object r6 = r5.f12277a
            M0.V r7 = r1.f4650g0
            r8.g(r6, r7)
            M0.V r6 = r1.f4650g0
            int r6 = r6.f2864c
            M0.W r7 = r1.f4649f0
            r11 = 0
            r8.m(r6, r7, r11)
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x0121
            h1.B r6 = new h1.B
            java.lang.Object r7 = r5.f12277a
            long r11 = r5.f12280d
            r6.<init>(r7, r11)
            r19 = r6
        L_0x011f:
            r7 = r8
            goto L_0x0127
        L_0x0121:
            r19 = r5
            goto L_0x011f
        L_0x0124:
            r19 = r5
            r7 = r6
        L_0x0127:
            T0.X r5 = new T0.X
            T0.X r6 = r1.f4663u0
            int r13 = r6.e
            if (r37 == 0) goto L_0x0131
            r14 = r2
            goto L_0x0134
        L_0x0131:
            T0.l r8 = r6.f4753f
            r14 = r8
        L_0x0134:
            if (r0 == 0) goto L_0x013b
            h1.f0 r8 = h1.f0.f12468d
        L_0x0138:
            r16 = r8
            goto L_0x013e
        L_0x013b:
            h1.f0 r8 = r6.f4755h
            goto L_0x0138
        L_0x013e:
            if (r0 == 0) goto L_0x0145
            k1.u r8 = r1.f4643Z
        L_0x0142:
            r17 = r8
            goto L_0x0148
        L_0x0145:
            k1.u r8 = r6.i
            goto L_0x0142
        L_0x0148:
            if (r0 == 0) goto L_0x0151
            H3.M r0 = H3.O.f2026V
            H3.i0 r0 = H3.i0.f2073Y
        L_0x014e:
            r18 = r0
            goto L_0x0154
        L_0x0151:
            java.util.List r0 = r6.f4756j
            goto L_0x014e
        L_0x0154:
            boolean r0 = r6.f4758l
            r20 = r0
            int r0 = r6.f4759m
            r21 = r0
            int r0 = r6.f4760n
            r22 = r0
            M0.L r0 = r6.f4761o
            r23 = r0
            r15 = 0
            r26 = 0
            r30 = 0
            r32 = 0
            r6 = r5
            r8 = r19
            r11 = r28
            r24 = r28
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r1.f4663u0 = r5
            if (r36 == 0) goto L_0x01ea
            T0.M r0 = r1.f4656m0
            java.util.ArrayList r5 = r0.f4712p
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01a5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
        L_0x0189:
            java.util.ArrayList r7 = r0.f4712p
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x019e
            java.util.ArrayList r7 = r0.f4712p
            java.lang.Object r7 = r7.get(r6)
            T0.K r7 = (T0.K) r7
            r7.i()
            int r6 = r6 + r4
            goto L_0x0189
        L_0x019e:
            r0.f4712p = r5
            r0.f4708l = r2
            r0.j()
        L_0x01a5:
            T0.W r2 = r1.f4657n0
            java.lang.Object r0 = r2.f4742f
            r4 = r0
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Collection r0 = r4.values()
            java.util.Iterator r5 = r0.iterator()
        L_0x01b4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r5.next()
            r6 = r0
            T0.U r6 = (T0.U) r6
            h1.a r0 = r6.f4731a     // Catch:{ RuntimeException -> 0x01c9 }
            T0.O r7 = r6.f4732b     // Catch:{ RuntimeException -> 0x01c9 }
            r0.o(r7)     // Catch:{ RuntimeException -> 0x01c9 }
            goto L_0x01d1
        L_0x01c9:
            r0 = move-exception
            java.lang.String r7 = "MediaSourceList"
            java.lang.String r8 = "Failed to release child source."
            P0.l.p(r7, r8, r0)
        L_0x01d1:
            h1.a r0 = r6.f4731a
            T0.T r7 = r6.f4733c
            r0.r(r7)
            h1.a r0 = r6.f4731a
            r0.q(r7)
            goto L_0x01b4
        L_0x01de:
            r4.clear()
            java.lang.Object r0 = r2.f4744h
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r2.f4738a = r3
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.F.F(boolean, boolean, boolean, boolean):void");
    }

    public final void G() {
        boolean z;
        K k8 = this.f4656m0.i;
        if (k8 == null || !k8.f4683g.f4698h || !this.f4666x0) {
            z = false;
        } else {
            z = true;
        }
        this.f4667y0 = z;
    }

    public final void H(long j7) {
        long j8;
        M m8 = this.f4656m0;
        K k8 = m8.i;
        if (k8 == null) {
            j8 = 1000000000000L;
        } else {
            j8 = k8.f4691p;
        }
        long j9 = j7 + j8;
        this.f4631J0 = j9;
        ((f0) this.f4652i0.f4114W).b(j9);
        for (C0213e eVar : this.f4638U) {
            if (q(eVar)) {
                long j10 = this.f4631J0;
                eVar.f4811h0 = false;
                eVar.f4809f0 = j10;
                eVar.f4810g0 = j10;
                eVar.o(j10, false);
            }
        }
        for (K k9 = m8.i; k9 != null; k9 = k9.f4688m) {
            for (r rVar : k9.f4690o.f13011c) {
                if (rVar != null) {
                    rVar.s();
                }
            }
        }
    }

    public final void I(X x8, X x9) {
        if (!x8.p() || !x9.p()) {
            ArrayList arrayList = this.f4653j0;
            int size = arrayList.size() - 1;
            if (size < 0) {
                Collections.sort(arrayList);
            } else {
                e.G(arrayList.get(size));
                throw null;
            }
        }
    }

    public final void L(long j7) {
        long j8;
        if (this.f4663u0.e != 3 || c0()) {
            j8 = f4621Q0;
        } else {
            j8 = 1000;
        }
        this.f4646c0.f3741a.sendEmptyMessageAtTime(2, j7 + j8);
    }

    public final void M(boolean z) {
        C1031B b8 = this.f4656m0.i.f4683g.f4692a;
        long O8 = O(b8, this.f4663u0.f4765s, true, false);
        if (O8 != this.f4663u0.f4765s) {
            X x8 = this.f4663u0;
            this.f4663u0 = n(b8, O8, x8.f4751c, x8.f4752d, z, 5);
        }
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [h1.z, java.lang.Object] */
    public final void N(E e) {
        long j7;
        long j8;
        boolean z;
        C1031B b8;
        long j9;
        long j10;
        long j11;
        boolean z6;
        boolean z8;
        long j12;
        X x8;
        int i;
        long j13;
        boolean z9;
        E e8 = e;
        boolean z10 = true;
        this.f4664v0.f(1);
        Pair J8 = J(this.f4663u0.f4749a, e, true, this.f4624C0, this.f4625D0, this.f4649f0, this.f4650g0);
        if (J8 == null) {
            Pair f8 = f(this.f4663u0.f4749a);
            b8 = (C1031B) f8.first;
            long longValue = ((Long) f8.second).longValue();
            z = !this.f4663u0.f4749a.p();
            j7 = longValue;
            j8 = -9223372036854775807L;
        } else {
            Object obj = J8.first;
            long longValue2 = ((Long) J8.second).longValue();
            if (e8.f4620c == -9223372036854775807L) {
                j13 = -9223372036854775807L;
            } else {
                j13 = longValue2;
            }
            C1031B n4 = this.f4656m0.n(this.f4663u0.f4749a, obj, longValue2);
            if (n4.b()) {
                this.f4663u0.f4749a.g(n4.f12277a, this.f4650g0);
                if (this.f4650g0.e(n4.f12278b) == n4.f12279c) {
                    this.f4650g0.f2867g.getClass();
                }
                j7 = 0;
                j8 = j13;
                z = true;
            } else {
                if (e8.f4620c == -9223372036854775807L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j7 = longValue2;
                j8 = j13;
                z = z9;
            }
            b8 = n4;
        }
        try {
            if (this.f4663u0.f4749a.p()) {
                this.f4630I0 = e8;
            } else if (J8 == null) {
                if (this.f4663u0.e != 1) {
                    b0(4);
                }
                F(false, true, false, true);
            } else {
                if (b8.equals(this.f4663u0.f4750b)) {
                    K k8 = this.f4656m0.i;
                    if (k8 == null || !k8.e || j7 == 0) {
                        j12 = j7;
                    } else {
                        j12 = k8.f4678a.m(j7, this.f4662t0);
                    }
                    if (z.c0(j12) == z.c0(this.f4663u0.f4765s) && ((i = x8.e) == 2 || i == 3)) {
                        long j14 = (x8 = this.f4663u0).f4765s;
                        this.f4663u0 = n(b8, j14, j8, j14, z, 2);
                        return;
                    }
                    j11 = j12;
                } else {
                    j11 = j7;
                }
                if (this.f4663u0.e == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                M m8 = this.f4656m0;
                if (m8.i != m8.f4706j) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                long O8 = O(b8, j11, z8, z6);
                if (j7 == O8) {
                    z10 = false;
                }
                z |= z10;
                try {
                    X x9 = this.f4663u0;
                    X x10 = x9.f4749a;
                    m0(x10, b8, x10, x9.f4750b, j8, true);
                    j10 = O8;
                    this.f4663u0 = n(b8, j10, j8, j10, z, 2);
                } catch (Throwable th) {
                    th = th;
                    j9 = O8;
                    this.f4663u0 = n(b8, j9, j8, j9, z, 2);
                    throw th;
                }
            }
            j10 = j7;
            this.f4663u0 = n(b8, j10, j8, j10, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j9 = j7;
            this.f4663u0 = n(b8, j9, j8, j9, z, 2);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [h1.z, java.lang.Object] */
    public final long O(C1031B b8, long j7, boolean z, boolean z6) {
        C0213e[] eVarArr;
        h0();
        n0(false, true);
        if (z6 || this.f4663u0.e == 3) {
            b0(2);
        }
        M m8 = this.f4656m0;
        K k8 = m8.i;
        K k9 = k8;
        while (k9 != null && !b8.equals(k9.f4683g.f4692a)) {
            k9 = k9.f4688m;
        }
        if (z || k8 != k9 || (k9 != null && k9.f4691p + j7 < 0)) {
            int i = 0;
            while (true) {
                eVarArr = this.f4638U;
                if (i >= eVarArr.length) {
                    break;
                }
                b(i);
                i++;
            }
            if (k9 != null) {
                while (m8.i != k9) {
                    m8.a();
                }
                m8.l(k9);
                k9.f4691p = 1000000000000L;
                d(new boolean[eVarArr.length], m8.f4706j.e());
            }
        }
        if (k9 != null) {
            m8.l(k9);
            if (!k9.e) {
                k9.f4683g = k9.f4683g.b(j7);
            } else if (k9.f4682f) {
                ? r9 = k9.f4678a;
                j7 = r9.s(j7);
                r9.t(j7 - this.f4651h0);
            }
            H(j7);
            s();
        } else {
            m8.b();
            H(j7);
        }
        j(false);
        this.f4646c0.e(2);
        return j7;
    }

    /* JADX INFO: finally extract failed */
    public final void P(a0 a0Var) {
        Looper looper = a0Var.f4774f;
        Looper looper2 = this.f4648e0;
        v vVar = this.f4646c0;
        if (looper == looper2) {
            synchronized (a0Var) {
            }
            try {
                a0Var.f4770a.b(a0Var.f4773d, a0Var.e);
                a0Var.b(true);
                int i = this.f4663u0.e;
                if (i == 3 || i == 2) {
                    vVar.e(2);
                }
            } catch (Throwable th) {
                a0Var.b(true);
                throw th;
            }
        } else {
            vVar.a(15, a0Var).b();
        }
    }

    public final void Q(a0 a0Var) {
        Looper looper = a0Var.f4774f;
        if (!looper.getThread().isAlive()) {
            l.B("TAG", "Trying to send message on a dead thread.");
            a0Var.b(false);
            return;
        }
        this.f4654k0.a(looper, (Handler.Callback) null).c(new C0002c((Object) this, 22, (Object) a0Var));
    }

    public final void S(AtomicBoolean atomicBoolean, boolean z) {
        if (this.f4626E0 != z) {
            this.f4626E0 = z;
            if (!z) {
                for (C0213e eVar : this.f4638U) {
                    if (!q(eVar) && this.f4639V.remove(eVar)) {
                        eVar.x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void T(B b8) {
        this.f4664v0.f(1);
        int i = b8.f4606c;
        ArrayList arrayList = b8.f4604a;
        b0 b0Var = b8.f4605b;
        if (i != -1) {
            this.f4630I0 = new E(new c0(arrayList, b0Var), b8.f4606c, b8.f4607d);
        }
        W w2 = this.f4657n0;
        ArrayList arrayList2 = (ArrayList) w2.f4740c;
        w2.i(0, arrayList2.size());
        k(w2.a(arrayList2.size(), arrayList, b0Var), false);
    }

    public final void U(boolean z) {
        this.f4666x0 = z;
        G();
        if (this.f4667y0) {
            M m8 = this.f4656m0;
            if (m8.f4706j != m8.i) {
                M(true);
                j(false);
            }
        }
    }

    public final void V(int i, int i8, boolean z, boolean z6) {
        this.f4664v0.f(z6 ? 1 : 0);
        this.f4663u0 = this.f4663u0.d(i8, i, z);
        n0(false, false);
        for (K k8 = this.f4656m0.i; k8 != null; k8 = k8.f4688m) {
            for (r rVar : k8.f4690o.f13011c) {
                if (rVar != null) {
                    rVar.c(z);
                }
            }
        }
        if (!c0()) {
            h0();
            l0();
            return;
        }
        int i9 = this.f4663u0.e;
        v vVar = this.f4646c0;
        if (i9 == 3) {
            f fVar = this.f4652i0;
            fVar.f4113V = true;
            ((f0) fVar.f4114W).f();
            e0();
            vVar.e(2);
        } else if (i9 == 2) {
            vVar.e(2);
        }
    }

    public final void W(L l8) {
        this.f4646c0.d(16);
        f fVar = this.f4652i0;
        fVar.d(l8);
        L c8 = fVar.c();
        m(c8, c8.f2846a, true, true);
    }

    public final void X(C0222n nVar) {
        this.f4637P0 = nVar;
        X x8 = this.f4663u0.f4749a;
        M m8 = this.f4656m0;
        m8.getClass();
        nVar.getClass();
        if (!m8.f4712p.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m8.f4712p.size(); i++) {
                ((K) m8.f4712p.get(i)).i();
            }
            m8.f4712p = arrayList;
            m8.f4708l = null;
            m8.j();
        }
    }

    public final void Y(int i) {
        this.f4624C0 = i;
        X x8 = this.f4663u0.f4749a;
        M m8 = this.f4656m0;
        m8.f4704g = i;
        if (!m8.p(x8)) {
            M(true);
        }
        j(false);
    }

    public final void Z(boolean z) {
        this.f4625D0 = z;
        X x8 = this.f4663u0.f4749a;
        M m8 = this.f4656m0;
        m8.f4705h = z;
        if (!m8.p(x8)) {
            M(true);
        }
        j(false);
    }

    public final void a(B b8, int i) {
        this.f4664v0.f(1);
        W w2 = this.f4657n0;
        if (i == -1) {
            i = ((ArrayList) w2.f4740c).size();
        }
        k(w2.a(i, b8.f4604a, b8.f4605b), false);
    }

    public final void a0(b0 b0Var) {
        this.f4664v0.f(1);
        W w2 = this.f4657n0;
        int size = ((ArrayList) w2.f4740c).size();
        if (b0Var.f12437b.length != size) {
            b0Var = new b0(new Random(b0Var.f12436a.nextLong())).a(size);
        }
        w2.f4746k = b0Var;
        k(w2.c(), false);
    }

    public final void b(int i) {
        boolean z;
        boolean z6;
        C0213e eVar = this.f4638U[i];
        if (q(eVar)) {
            w(i, false);
            f fVar = this.f4652i0;
            if (eVar == ((C0213e) fVar.f4116Y)) {
                fVar.f4117Z = null;
                fVar.f4116Y = null;
                fVar.f4112U = true;
            }
            int i8 = eVar.f4805b0;
            if (i8 == 2) {
                if (i8 == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l.j(z6);
                eVar.f4805b0 = 1;
                eVar.s();
            }
            if (eVar.f4805b0 == 1) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            eVar.f4800W.I();
            eVar.f4805b0 = 0;
            eVar.f4806c0 = null;
            eVar.f4807d0 = null;
            eVar.f4811h0 = false;
            eVar.m();
            this.f4629H0--;
        }
    }

    public final void b0(int i) {
        X x8 = this.f4663u0;
        if (x8.e != i) {
            if (i != 2) {
                this.f4636O0 = -9223372036854775807L;
            }
            this.f4663u0 = x8.g(i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v54, types: [h1.z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v32, types: [h1.z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v70, types: [h1.z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v73, types: [h1.z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v83, types: [h1.a0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x05d9, code lost:
        if (r2 >= r15.b()) goto L_0x0546;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x037e A[EDGE_INSN: B:471:0x037e->B:196:0x037e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0431 A[EDGE_INSN: B:487:0x0431->B:234:0x0431 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r61 = this;
            r11 = r61
            P0.t r0 = r11.f4654k0
            r0.getClass()
            long r12 = android.os.SystemClock.uptimeMillis()
            P0.v r0 = r11.f4646c0
            r14 = 2
            r0.d(r14)
            T0.X r0 = r11.f4663u0
            M0.X r0 = r0.f4749a
            boolean r0 = r0.p()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0028
            T0.W r0 = r11.f4657n0
            boolean r0 = r0.f4738a
            if (r0 != 0) goto L_0x002c
        L_0x0028:
            r2 = 3
            r14 = 0
            goto L_0x043e
        L_0x002c:
            T0.M r0 = r11.f4656m0
            long r1 = r11.f4631J0
            T0.K r0 = r0.f4707k
            if (r0 == 0) goto L_0x004a
            T0.K r3 = r0.f4688m
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            P0.l.j(r3)
            boolean r3 = r0.e
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r0.f4678a
            long r4 = r0.f4691p
            long r1 = r1 - r4
            r3.u(r1)
        L_0x004a:
            T0.M r0 = r11.f4656m0
            T0.K r1 = r0.f4707k
            if (r1 == 0) goto L_0x0070
            T0.L r2 = r1.f4683g
            boolean r2 = r2.i
            if (r2 != 0) goto L_0x006d
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x006d
            T0.K r1 = r0.f4707k
            T0.L r1 = r1.f4683g
            long r1 = r1.e
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x006d
            int r0 = r0.f4709m
            r1 = 100
            if (r0 >= r1) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            r0 = 0
            goto L_0x0177
        L_0x0070:
            T0.M r0 = r11.f4656m0
            long r1 = r11.f4631J0
            T0.X r3 = r11.f4663u0
            T0.K r4 = r0.f4707k
            if (r4 != 0) goto L_0x0091
            M0.X r1 = r3.f4749a
            h1.B r2 = r3.f4750b
            long r4 = r3.f4751c
            long r7 = r3.f4765s
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r4
            r21 = r7
            T0.L r0 = r16.d(r17, r18, r19, r21)
            goto L_0x0097
        L_0x0091:
            M0.X r3 = r3.f4749a
            T0.L r0 = r0.c(r3, r4, r1)
        L_0x0097:
            if (r0 == 0) goto L_0x006d
            T0.M r1 = r11.f4656m0
            T0.K r2 = r1.f4707k
            if (r2 != 0) goto L_0x00a5
            r2 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            goto L_0x00b0
        L_0x00a5:
            long r3 = r2.f4691p
            T0.L r2 = r2.f4683g
            long r7 = r2.e
            long r3 = r3 + r7
            long r7 = r0.f4693b
            long r3 = r3 - r7
            r2 = r3
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            java.util.ArrayList r5 = r1.f4712p
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x00f2
            java.util.ArrayList r5 = r1.f4712p
            java.lang.Object r5 = r5.get(r4)
            T0.K r5 = (T0.K) r5
            T0.L r5 = r5.f4683g
            long r7 = r5.e
            int r16 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x00cf
            long r9 = r0.e
            int r18 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r18 != 0) goto L_0x00ea
        L_0x00cf:
            long r7 = r5.f4693b
            long r9 = r0.f4693b
            int r18 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r18 != 0) goto L_0x00ea
            h1.B r5 = r5.f4692a
            h1.B r7 = r0.f4692a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00ea
            java.util.ArrayList r5 = r1.f4712p
            java.lang.Object r4 = r5.remove(r4)
            T0.K r4 = (T0.K) r4
            goto L_0x00f3
        L_0x00ea:
            int r4 = r4 + 1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b1
        L_0x00f2:
            r4 = r15
        L_0x00f3:
            if (r4 != 0) goto L_0x0123
            B.B r4 = r1.e
            T0.K r5 = new T0.K
            java.lang.Object r4 = r4.f141V
            T0.F r4 = (T0.F) r4
            T0.j r7 = r4.f4644a0
            l1.e r7 = r7.f4855a
            T0.n r8 = r4.f4637P0
            r8.getClass()
            T0.W r8 = r4.f4657n0
            k1.u r9 = r4.f4643Z
            T0.e[] r10 = r4.f4640W
            k1.t r4 = r4.f4642Y
            r25 = r5
            r26 = r10
            r27 = r2
            r29 = r4
            r30 = r7
            r31 = r8
            r32 = r0
            r33 = r9
            r25.<init>(r26, r27, r29, r30, r31, r32, r33)
            r4 = r5
            goto L_0x0127
        L_0x0123:
            r4.f4683g = r0
            r4.f4691p = r2
        L_0x0127:
            T0.K r2 = r1.f4707k
            if (r2 == 0) goto L_0x0139
            T0.K r3 = r2.f4688m
            if (r4 != r3) goto L_0x0130
            goto L_0x013d
        L_0x0130:
            r2.b()
            r2.f4688m = r4
            r2.c()
            goto L_0x013d
        L_0x0139:
            r1.i = r4
            r1.f4706j = r4
        L_0x013d:
            r1.f4710n = r15
            r1.f4707k = r4
            int r2 = r1.f4709m
            int r2 = r2 + r6
            r1.f4709m = r2
            r1.k()
            boolean r1 = r4.f4681d
            if (r1 != 0) goto L_0x0157
            long r1 = r0.f4693b
            r4.f4681d = r6
            java.lang.Object r3 = r4.f4678a
            r3.i(r11, r1)
            goto L_0x0168
        L_0x0157:
            boolean r1 = r4.e
            if (r1 == 0) goto L_0x0168
            P0.v r1 = r11.f4646c0
            java.lang.Object r2 = r4.f4678a
            r3 = 8
            P0.u r1 = r1.a(r3, r2)
            r1.b()
        L_0x0168:
            T0.M r1 = r11.f4656m0
            T0.K r1 = r1.i
            if (r1 != r4) goto L_0x0173
            long r0 = r0.f4693b
            r11.H(r0)
        L_0x0173:
            r0 = 0
            r11.j(r0)
        L_0x0177:
            boolean r1 = r11.f4623B0
            if (r1 == 0) goto L_0x0189
            T0.M r1 = r11.f4656m0
            T0.K r1 = r1.f4707k
            boolean r1 = p(r1)
            r11.f4623B0 = r1
            r61.i0()
            goto L_0x018c
        L_0x0189:
            r61.s()
        L_0x018c:
            T0.M r9 = r11.f4656m0
            T0.K r1 = r9.f4706j
            if (r1 != 0) goto L_0x019a
        L_0x0192:
            r14 = 0
        L_0x0193:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02ee
        L_0x019a:
            T0.K r2 = r1.f4688m
            T0.e[] r10 = r11.f4638U
            if (r2 == 0) goto L_0x01a4
            boolean r2 = r11.f4667y0
            if (r2 == 0) goto L_0x01a7
        L_0x01a4:
            r14 = 0
            goto L_0x02a9
        L_0x01a7:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01ac
            goto L_0x0192
        L_0x01ac:
            r2 = 0
        L_0x01ad:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x01e3
            r3 = r10[r2]
            h1.Y[] r4 = r1.f4680c
            r4 = r4[r2]
            h1.Y r5 = r3.f4806c0
            if (r5 != r4) goto L_0x0192
            if (r4 == 0) goto L_0x01e0
            boolean r4 = r3.j()
            if (r4 != 0) goto L_0x01e0
            T0.K r4 = r1.f4688m
            T0.L r5 = r1.f4683g
            boolean r5 = r5.f4696f
            if (r5 == 0) goto L_0x0192
            boolean r5 = r4.e
            if (r5 == 0) goto L_0x0192
            boolean r5 = r3 instanceof j1.C1119d
            if (r5 != 0) goto L_0x01e0
            boolean r5 = r3 instanceof d1.C0631b
            if (r5 != 0) goto L_0x01e0
            long r7 = r3.f4810g0
            long r3 = r4.e()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0192
        L_0x01e0:
            int r2 = r2 + 1
            goto L_0x01ad
        L_0x01e3:
            T0.K r2 = r1.f4688m
            boolean r3 = r2.e
            if (r3 != 0) goto L_0x01f4
            long r3 = r11.f4631J0
            long r7 = r2.e()
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01f4
            goto L_0x0192
        L_0x01f4:
            k1.u r8 = r1.f4690o
            T0.K r2 = r9.f4706j
            P0.l.k(r2)
            T0.K r2 = r2.f4688m
            r9.f4706j = r2
            r9.k()
            T0.K r7 = r9.f4706j
            P0.l.k(r7)
            k1.u r5 = r7.f4690o
            T0.X r2 = r11.f4663u0
            M0.X r4 = r2.f4749a
            T0.L r2 = r7.f4683g
            h1.B r3 = r2.f4692a
            T0.L r1 = r1.f4683g
            h1.B r2 = r1.f4692a
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r20 = 0
            r1 = r61
            r21 = r2
            r2 = r4
            r0 = r5
            r5 = r21
            r15 = r7
            r6 = r18
            r34 = r8
            r14 = 0
            r8 = r20
            r1.m0(r2, r3, r4, r5, r6, r8)
            boolean r1 = r15.e
            if (r1 == 0) goto L_0x0267
            java.lang.Object r1 = r15.f4678a
            long r1 = r1.f()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0267
            long r0 = r15.e()
            int r2 = r10.length
            r8 = 0
        L_0x0248:
            if (r8 >= r2) goto L_0x0256
            r3 = r10[r8]
            h1.Y r4 = r3.f4806c0
            if (r4 == 0) goto L_0x0253
            R(r3, r0)
        L_0x0253:
            int r8 = r8 + 1
            goto L_0x0248
        L_0x0256:
            boolean r0 = r15.g()
            if (r0 != 0) goto L_0x0193
            r9.l(r15)
            r11.j(r14)
            r61.s()
            goto L_0x0193
        L_0x0267:
            r8 = 0
        L_0x0268:
            int r1 = r10.length
            if (r8 >= r1) goto L_0x0193
            r1 = r34
            boolean r2 = r1.b(r8)
            boolean r3 = r0.b(r8)
            if (r2 == 0) goto L_0x02a4
            r2 = r10[r8]
            boolean r2 = r2.f4811h0
            if (r2 != 0) goto L_0x02a4
            T0.e[] r2 = r11.f4640W
            r2 = r2[r8]
            int r2 = r2.f4799V
            r4 = -2
            if (r2 != r4) goto L_0x0288
            r2 = 1
            goto L_0x0289
        L_0x0288:
            r2 = 0
        L_0x0289:
            T0.d0[] r4 = r1.f13010b
            r4 = r4[r8]
            T0.d0[] r5 = r0.f13010b
            r5 = r5[r8]
            if (r3 == 0) goto L_0x029b
            boolean r3 = r5.equals(r4)
            if (r3 == 0) goto L_0x029b
            if (r2 == 0) goto L_0x02a4
        L_0x029b:
            r2 = r10[r8]
            long r3 = r15.e()
            R(r2, r3)
        L_0x02a4:
            int r8 = r8 + 1
            r34 = r1
            goto L_0x0268
        L_0x02a9:
            T0.L r0 = r1.f4683g
            boolean r0 = r0.i
            if (r0 != 0) goto L_0x02b3
            boolean r0 = r11.f4667y0
            if (r0 == 0) goto L_0x0193
        L_0x02b3:
            r8 = 0
        L_0x02b4:
            int r0 = r10.length
            if (r8 >= r0) goto L_0x0193
            r0 = r10[r8]
            h1.Y[] r2 = r1.f4680c
            r2 = r2[r8]
            if (r2 == 0) goto L_0x02e6
            h1.Y r3 = r0.f4806c0
            if (r3 != r2) goto L_0x02e6
            boolean r2 = r0.j()
            if (r2 == 0) goto L_0x02e6
            T0.L r2 = r1.f4683g
            long r2 = r2.e
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x02e1
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x02e1
            long r4 = r1.f4691p
            long r3 = r4 + r2
            goto L_0x02e2
        L_0x02e1:
            r3 = r15
        L_0x02e2:
            R(r0, r3)
            goto L_0x02eb
        L_0x02e6:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02eb:
            int r8 = r8 + 1
            goto L_0x02b4
        L_0x02ee:
            T0.M r0 = r11.f4656m0
            T0.K r1 = r0.f4706j
            if (r1 == 0) goto L_0x038e
            T0.K r0 = r0.i
            if (r0 == r1) goto L_0x038e
            boolean r0 = r1.f4684h
            if (r0 == 0) goto L_0x02fe
            goto L_0x038e
        L_0x02fe:
            k1.u r0 = r1.f4690o
            r2 = 0
            r8 = 0
        L_0x0302:
            T0.e[] r3 = r11.f4638U
            int r4 = r3.length
            if (r8 >= r4) goto L_0x037e
            r3 = r3[r8]
            boolean r4 = q(r3)
            if (r4 != 0) goto L_0x0311
            goto L_0x037b
        L_0x0311:
            h1.Y r4 = r3.f4806c0
            h1.Y[] r5 = r1.f4680c
            r6 = r5[r8]
            if (r4 == r6) goto L_0x031b
            r4 = 1
            goto L_0x031c
        L_0x031b:
            r4 = 0
        L_0x031c:
            boolean r6 = r0.b(r8)
            if (r6 == 0) goto L_0x0325
            if (r4 != 0) goto L_0x0325
            goto L_0x037b
        L_0x0325:
            boolean r4 = r3.f4811h0
            if (r4 != 0) goto L_0x0370
            k1.r[] r4 = r0.f13011c
            r4 = r4[r8]
            if (r4 == 0) goto L_0x0334
            int r6 = r4.length()
            goto L_0x0335
        L_0x0334:
            r6 = 0
        L_0x0335:
            M0.r[] r7 = new M0.r[r6]
            r9 = 0
        L_0x0338:
            if (r9 >= r6) goto L_0x0343
            M0.r r10 = r4.e(r9)
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x0338
        L_0x0343:
            r25 = r5[r8]
            long r26 = r1.e()
            long r4 = r1.f4691p
            T0.L r6 = r1.f4683g
            h1.B r6 = r6.f4692a
            r23 = r3
            r24 = r7
            r28 = r4
            r30 = r6
            r23.w(r24, r25, r26, r28, r30)
            boolean r3 = r11.f4628G0
            if (r3 == 0) goto L_0x037b
            if (r3 != 0) goto L_0x0361
            goto L_0x037b
        L_0x0361:
            r11.f4628G0 = r14
            T0.X r3 = r11.f4663u0
            boolean r3 = r3.f4762p
            if (r3 == 0) goto L_0x037b
            P0.v r3 = r11.f4646c0
            r4 = 2
            r3.e(r4)
            goto L_0x037b
        L_0x0370:
            boolean r3 = r3.k()
            if (r3 == 0) goto L_0x037a
            r11.b(r8)
            goto L_0x037b
        L_0x037a:
            r2 = 1
        L_0x037b:
            int r8 = r8 + 1
            goto L_0x0302
        L_0x037e:
            if (r2 != 0) goto L_0x038e
            int r0 = r3.length
            boolean[] r0 = new boolean[r0]
            T0.M r1 = r11.f4656m0
            T0.K r1 = r1.f4706j
            long r1 = r1.e()
            r11.d(r0, r1)
        L_0x038e:
            r8 = 0
        L_0x038f:
            boolean r0 = r61.c0()
            if (r0 != 0) goto L_0x0398
        L_0x0395:
            r2 = 3
            goto L_0x0439
        L_0x0398:
            boolean r0 = r11.f4667y0
            if (r0 == 0) goto L_0x039d
            goto L_0x0395
        L_0x039d:
            T0.M r0 = r11.f4656m0
            T0.K r1 = r0.i
            if (r1 != 0) goto L_0x03a4
            goto L_0x0395
        L_0x03a4:
            T0.K r1 = r1.f4688m
            if (r1 == 0) goto L_0x0395
            long r2 = r11.f4631J0
            long r4 = r1.e()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0395
            boolean r1 = r1.f4684h
            if (r1 == 0) goto L_0x0395
            if (r8 == 0) goto L_0x03bb
            r61.u()
        L_0x03bb:
            T0.K r1 = r0.a()
            r1.getClass()
            T0.X r2 = r11.f4663u0
            h1.B r2 = r2.f4750b
            java.lang.Object r2 = r2.f12277a
            T0.L r3 = r1.f4683g
            h1.B r3 = r3.f4692a
            java.lang.Object r3 = r3.f12277a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03ed
            T0.X r2 = r11.f4663u0
            h1.B r2 = r2.f4750b
            int r3 = r2.f12278b
            r4 = -1
            if (r3 != r4) goto L_0x03ed
            T0.L r3 = r1.f4683g
            h1.B r3 = r3.f4692a
            int r5 = r3.f12278b
            if (r5 != r4) goto L_0x03ed
            int r2 = r2.e
            int r3 = r3.e
            if (r2 == r3) goto L_0x03ed
            r8 = 1
            goto L_0x03ee
        L_0x03ed:
            r8 = 0
        L_0x03ee:
            T0.L r1 = r1.f4683g
            h1.B r2 = r1.f4692a
            long r9 = r1.f4693b
            long r5 = r1.f4694c
            r1 = 1
            r17 = r8 ^ 1
            r19 = 0
            r1 = r61
            r3 = r9
            r7 = r9
            r9 = r17
            r10 = r19
            T0.X r1 = r1.n(r2, r3, r5, r7, r9, r10)
            r11.f4663u0 = r1
            r61.G()
            r61.l0()
            T0.X r1 = r11.f4663u0
            int r1 = r1.e
            r2 = 3
            if (r1 != r2) goto L_0x0419
            r61.e0()
        L_0x0419:
            T0.K r0 = r0.i
            k1.u r0 = r0.f4690o
            r8 = 0
        L_0x041e:
            T0.e[] r1 = r11.f4638U
            int r3 = r1.length
            if (r8 >= r3) goto L_0x0431
            boolean r3 = r0.b(r8)
            if (r3 == 0) goto L_0x042e
            r1 = r1[r8]
            r1.g()
        L_0x042e:
            int r8 = r8 + 1
            goto L_0x041e
        L_0x0431:
            r8 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x038f
        L_0x0439:
            T0.n r0 = r11.f4637P0
            r0.getClass()
        L_0x043e:
            T0.X r0 = r11.f4663u0
            int r0 = r0.e
            r1 = 1
            if (r0 == r1) goto L_0x077b
            r1 = 4
            if (r0 != r1) goto L_0x044a
            goto L_0x077b
        L_0x044a:
            T0.M r0 = r11.f4656m0
            T0.K r0 = r0.i
            if (r0 != 0) goto L_0x0454
            r11.L(r12)
            return
        L_0x0454:
            java.lang.String r3 = "doSomeWork"
            android.os.Trace.beginSection(r3)
            r61.l0()
            boolean r3 = r0.e
            if (r3 == 0) goto L_0x04e0
            P0.t r3 = r11.f4654k0
            r3.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = P0.z.O(r3)
            r11.f4632K0 = r3
            java.lang.Object r3 = r0.f4678a
            T0.X r4 = r11.f4663u0
            long r4 = r4.f4765s
            long r6 = r11.f4651h0
            long r4 = r4 - r6
            r3.t(r4)
            r3 = 1
            r6 = 1
            r8 = 0
        L_0x047e:
            T0.e[] r4 = r11.f4638U
            int r5 = r4.length
            if (r8 >= r5) goto L_0x04e7
            r4 = r4[r8]
            boolean r5 = q(r4)
            if (r5 != 0) goto L_0x048f
            r11.w(r8, r14)
            goto L_0x04db
        L_0x048f:
            long r9 = r11.f4631J0
            long r1 = r11.f4632K0
            r4.v(r9, r1)
            if (r6 == 0) goto L_0x04a0
            boolean r1 = r4.k()
            if (r1 == 0) goto L_0x04a0
            r1 = 1
            goto L_0x04a1
        L_0x04a0:
            r1 = 0
        L_0x04a1:
            h1.Y[] r2 = r0.f4680c
            r2 = r2[r8]
            h1.Y r6 = r4.f4806c0
            if (r2 == r6) goto L_0x04ab
            r2 = 1
            goto L_0x04ac
        L_0x04ab:
            r2 = 0
        L_0x04ac:
            if (r2 != 0) goto L_0x04b6
            boolean r6 = r4.j()
            if (r6 == 0) goto L_0x04b6
            r6 = 1
            goto L_0x04b7
        L_0x04b6:
            r6 = 0
        L_0x04b7:
            if (r2 != 0) goto L_0x04ca
            if (r6 != 0) goto L_0x04ca
            boolean r2 = r4.l()
            if (r2 != 0) goto L_0x04ca
            boolean r2 = r4.k()
            if (r2 == 0) goto L_0x04c8
            goto L_0x04ca
        L_0x04c8:
            r2 = 0
            goto L_0x04cb
        L_0x04ca:
            r2 = 1
        L_0x04cb:
            r11.w(r8, r2)
            if (r3 == 0) goto L_0x04d4
            if (r2 == 0) goto L_0x04d4
            r3 = 1
            goto L_0x04d5
        L_0x04d4:
            r3 = 0
        L_0x04d5:
            if (r2 != 0) goto L_0x04da
            r11.v(r8)
        L_0x04da:
            r6 = r1
        L_0x04db:
            int r8 = r8 + 1
            r1 = 4
            r2 = 3
            goto L_0x047e
        L_0x04e0:
            java.lang.Object r1 = r0.f4678a
            r1.r()
            r3 = 1
            r6 = 1
        L_0x04e7:
            T0.L r1 = r0.f4683g
            long r1 = r1.e
            if (r6 == 0) goto L_0x0504
            boolean r4 = r0.e
            if (r4 == 0) goto L_0x0504
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0502
            T0.X r4 = r11.f4663u0
            long r8 = r4.f4765s
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0509
        L_0x0502:
            r8 = 1
            goto L_0x050a
        L_0x0504:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0509:
            r8 = 0
        L_0x050a:
            if (r8 == 0) goto L_0x051a
            boolean r1 = r11.f4667y0
            if (r1 == 0) goto L_0x051a
            r11.f4667y0 = r14
            T0.X r1 = r11.f4663u0
            int r1 = r1.f4760n
            r2 = 5
            r11.V(r1, r2, r14, r14)
        L_0x051a:
            if (r8 == 0) goto L_0x052c
            T0.L r1 = r0.f4683g
            boolean r1 = r1.i
            if (r1 == 0) goto L_0x052c
            r1 = 4
            r11.b0(r1)
            r61.h0()
        L_0x0529:
            r2 = 1
            goto L_0x0665
        L_0x052c:
            T0.X r1 = r11.f4663u0
            int r2 = r1.e
            r4 = 2
            if (r2 != r4) goto L_0x0602
            int r2 = r11.f4629H0
            if (r2 != 0) goto L_0x053d
            boolean r8 = r61.r()
            goto L_0x05e0
        L_0x053d:
            if (r3 != 0) goto L_0x0542
        L_0x053f:
            r8 = 0
            goto L_0x05e0
        L_0x0542:
            boolean r2 = r1.f4754g
            if (r2 != 0) goto L_0x0549
        L_0x0546:
            r8 = 1
            goto L_0x05e0
        L_0x0549:
            T0.M r2 = r11.f4656m0
            T0.K r4 = r2.i
            M0.X r1 = r1.f4749a
            T0.L r4 = r4.f4683g
            h1.B r4 = r4.f4692a
            boolean r1 = r11.d0(r1, r4)
            if (r1 == 0) goto L_0x055e
            T0.h r1 = r11.f4658o0
            long r9 = r1.f4847h
            goto L_0x055f
        L_0x055e:
            r9 = r6
        L_0x055f:
            T0.K r1 = r2.f4707k
            boolean r2 = r1.g()
            if (r2 == 0) goto L_0x056f
            T0.L r2 = r1.f4683g
            boolean r2 = r2.i
            if (r2 == 0) goto L_0x056f
            r8 = 1
            goto L_0x0570
        L_0x056f:
            r8 = 0
        L_0x0570:
            T0.L r2 = r1.f4683g
            h1.B r2 = r2.f4692a
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0580
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0580
            r2 = 1
            goto L_0x0581
        L_0x0580:
            r2 = 0
        L_0x0581:
            if (r8 != 0) goto L_0x0546
            if (r2 == 0) goto L_0x0586
            goto L_0x0546
        L_0x0586:
            long r1 = r1.d()
            long r1 = r11.g(r1)
            T0.X r4 = r11.f4663u0
            M0.X r4 = r4.f4749a
            Q3.f r4 = r11.f4652i0
            M0.L r4 = r4.c()
            float r4 = r4.f2846a
            T0.X r8 = r11.f4663u0
            boolean r8 = r8.f4758l
            boolean r8 = r11.f4668z0
            T0.j r15 = r11.f4644a0
            r15.getClass()
            long r1 = P0.z.B(r1, r4)
            if (r8 == 0) goto L_0x05b3
            long r5 = r15.e
        L_0x05ad:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x05b6
        L_0x05b3:
            long r5 = r15.f4858d
            goto L_0x05ad
        L_0x05b6:
            int r16 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r16 == 0) goto L_0x05c1
            r7 = 2
            long r9 = r9 / r7
            long r5 = java.lang.Math.min(r9, r5)
        L_0x05c1:
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0546
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0546
            l1.e r1 = r15.f4855a
            monitor-enter(r1)
            int r2 = r1.f13107d     // Catch:{ all -> 0x05dd }
            int r5 = r1.f13105b     // Catch:{ all -> 0x05dd }
            int r2 = r2 * r5
            monitor-exit(r1)
            int r1 = r15.b()
            if (r2 < r1) goto L_0x053f
            goto L_0x0546
        L_0x05dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05dd }
            throw r0
        L_0x05e0:
            if (r8 == 0) goto L_0x0602
            r1 = 3
            r11.b0(r1)
            r1 = 0
            r11.f4635N0 = r1
            boolean r1 = r61.c0()
            if (r1 == 0) goto L_0x0529
            r11.n0(r14, r14)
            Q3.f r1 = r11.f4652i0
            r2 = 1
            r1.f4113V = r2
            java.lang.Object r1 = r1.f4114W
            T0.f0 r1 = (T0.f0) r1
            r1.f()
            r61.e0()
            goto L_0x0665
        L_0x0602:
            r2 = 1
            T0.X r1 = r11.f4663u0
            int r1 = r1.e
            r5 = 3
            if (r1 != r5) goto L_0x0665
            int r1 = r11.f4629H0
            if (r1 != 0) goto L_0x0615
            boolean r1 = r61.r()
            if (r1 == 0) goto L_0x0617
            goto L_0x0665
        L_0x0615:
            if (r3 != 0) goto L_0x0665
        L_0x0617:
            boolean r1 = r61.c0()
            r11.n0(r1, r14)
            r1 = 2
            r11.b0(r1)
            boolean r1 = r11.f4668z0
            if (r1 == 0) goto L_0x0662
            T0.M r1 = r11.f4656m0
            T0.K r1 = r1.i
        L_0x062a:
            if (r1 == 0) goto L_0x0641
            k1.u r3 = r1.f4690o
            k1.r[] r3 = r3.f13011c
            int r5 = r3.length
            r8 = 0
        L_0x0632:
            if (r8 >= r5) goto L_0x063e
            r6 = r3[r8]
            if (r6 == 0) goto L_0x063b
            r6.t()
        L_0x063b:
            int r8 = r8 + 1
            goto L_0x0632
        L_0x063e:
            T0.K r1 = r1.f4688m
            goto L_0x062a
        L_0x0641:
            T0.h r1 = r11.f4658o0
            long r5 = r1.f4847h
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x064f
            goto L_0x0662
        L_0x064f:
            long r9 = r1.f4842b
            long r5 = r5 + r9
            r1.f4847h = r5
            long r9 = r1.f4846g
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0660
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0660
            r1.f4847h = r9
        L_0x0660:
            r1.f4850l = r7
        L_0x0662:
            r61.h0()
        L_0x0665:
            T0.X r1 = r11.f4663u0
            int r1 = r1.e
            r3 = 2
            if (r1 != r3) goto L_0x06a7
            r8 = 0
        L_0x066d:
            T0.e[] r1 = r11.f4638U
            int r3 = r1.length
            if (r8 >= r3) goto L_0x068c
            r1 = r1[r8]
            boolean r1 = q(r1)
            if (r1 == 0) goto L_0x0689
            T0.e[] r1 = r11.f4638U
            r1 = r1[r8]
            h1.Y r1 = r1.f4806c0
            h1.Y[] r3 = r0.f4680c
            r3 = r3[r8]
            if (r1 != r3) goto L_0x0689
            r11.v(r8)
        L_0x0689:
            int r8 = r8 + 1
            goto L_0x066d
        L_0x068c:
            T0.X r0 = r11.f4663u0
            boolean r1 = r0.f4754g
            if (r1 != 0) goto L_0x06a7
            long r0 = r0.f4764r
            r5 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x06a7
            T0.M r0 = r11.f4656m0
            T0.K r0 = r0.f4707k
            boolean r0 = p(r0)
            if (r0 == 0) goto L_0x06a7
            r8 = 1
            goto L_0x06a8
        L_0x06a7:
            r8 = 0
        L_0x06a8:
            if (r8 != 0) goto L_0x06b2
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.f4636O0 = r0
            goto L_0x06db
        L_0x06b2:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r11.f4636O0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x06c9
            P0.t r0 = r11.f4654k0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r11.f4636O0 = r0
            goto L_0x06db
        L_0x06c9:
            P0.t r0 = r11.f4654k0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r11.f4636O0
            long r0 = r0 - r5
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0773
        L_0x06db:
            boolean r0 = r61.c0()
            if (r0 == 0) goto L_0x06ea
            T0.X r0 = r11.f4663u0
            int r0 = r0.e
            r1 = 3
            if (r0 != r1) goto L_0x06ea
            r8 = 1
            goto L_0x06eb
        L_0x06ea:
            r8 = 0
        L_0x06eb:
            boolean r0 = r11.f4628G0
            if (r0 == 0) goto L_0x06f6
            boolean r0 = r11.f4627F0
            if (r0 == 0) goto L_0x06f6
            if (r8 == 0) goto L_0x06f6
            goto L_0x06f7
        L_0x06f6:
            r2 = 0
        L_0x06f7:
            T0.X r0 = r11.f4663u0
            boolean r1 = r0.f4762p
            if (r1 == r2) goto L_0x0754
            T0.X r1 = new T0.X
            r34 = r1
            M0.X r3 = r0.f4749a
            r35 = r3
            h1.B r3 = r0.f4750b
            r36 = r3
            long r5 = r0.f4751c
            r37 = r5
            long r5 = r0.f4752d
            r39 = r5
            int r3 = r0.e
            r41 = r3
            T0.l r3 = r0.f4753f
            r42 = r3
            boolean r3 = r0.f4754g
            r43 = r3
            h1.f0 r3 = r0.f4755h
            r44 = r3
            k1.u r3 = r0.i
            r45 = r3
            java.util.List r3 = r0.f4756j
            r46 = r3
            h1.B r3 = r0.f4757k
            r47 = r3
            boolean r3 = r0.f4758l
            r48 = r3
            int r3 = r0.f4759m
            r49 = r3
            int r3 = r0.f4760n
            r50 = r3
            M0.L r3 = r0.f4761o
            r51 = r3
            long r5 = r0.f4763q
            r52 = r5
            long r5 = r0.f4764r
            r54 = r5
            long r5 = r0.f4765s
            r56 = r5
            long r5 = r0.f4766t
            r58 = r5
            r60 = r2
            r34.<init>(r35, r36, r37, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r58, r60)
            r11.f4663u0 = r1
        L_0x0754:
            r11.f4627F0 = r14
            if (r2 != 0) goto L_0x076f
            T0.X r0 = r11.f4663u0
            int r0 = r0.e
            r1 = 4
            if (r0 != r1) goto L_0x0760
            goto L_0x076f
        L_0x0760:
            if (r8 != 0) goto L_0x076c
            r1 = 2
            if (r0 == r1) goto L_0x076c
            r1 = 3
            if (r0 != r1) goto L_0x076f
            int r0 = r11.f4629H0
            if (r0 == 0) goto L_0x076f
        L_0x076c:
            r11.L(r12)
        L_0x076f:
            android.os.Trace.endSection()
            return
        L_0x0773:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x077b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.F.c():void");
    }

    public final boolean c0() {
        X x8 = this.f4663u0;
        if (!x8.f4758l || x8.f4760n != 0) {
            return false;
        }
        return true;
    }

    public final void d(boolean[] zArr, long j7) {
        C0213e[] eVarArr;
        Set set;
        int i;
        K k8;
        u uVar;
        M m8;
        Set set2;
        boolean z;
        int i8;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        J j8;
        long j9 = j7;
        M m9 = this.f4656m0;
        K k9 = m9.f4706j;
        u uVar2 = k9.f4690o;
        int i9 = 0;
        while (true) {
            eVarArr = this.f4638U;
            int length = eVarArr.length;
            set = this.f4639V;
            if (i9 >= length) {
                break;
            }
            if (!uVar2.b(i9) && set.remove(eVarArr[i9])) {
                eVarArr[i9].x();
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < eVarArr.length) {
            if (uVar2.b(i10)) {
                boolean z11 = zArr[i10];
                C0213e eVar = eVarArr[i10];
                if (!q(eVar)) {
                    K k10 = m9.f4706j;
                    if (k10 == m9.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    u uVar3 = k10.f4690o;
                    d0 d0Var = uVar3.f13010b[i10];
                    r rVar = uVar3.f13011c[i10];
                    if (rVar != null) {
                        m8 = m9;
                        i8 = rVar.length();
                    } else {
                        m8 = m9;
                        i8 = 0;
                    }
                    M0.r[] rVarArr = new M0.r[i8];
                    uVar = uVar2;
                    for (int i11 = 0; i11 < i8; i11++) {
                        rVarArr[i11] = rVar.e(i11);
                    }
                    if (!c0() || this.f4663u0.e != 3) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z11 || !z6) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    this.f4629H0++;
                    set.add(eVar);
                    Y y8 = k10.f4680c[i10];
                    k8 = k9;
                    boolean z12 = z6;
                    long j10 = k10.f4691p;
                    L l8 = k10.f4683g;
                    if (eVar.f4805b0 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    l.j(z9);
                    eVar.f4801X = d0Var;
                    eVar.f4805b0 = 1;
                    eVar.n(z8, z);
                    M0.r[] rVarArr2 = rVarArr;
                    C0213e eVar2 = eVar;
                    boolean z13 = z;
                    i = i10;
                    long j11 = j10;
                    set2 = set;
                    eVar.w(rVarArr2, y8, j7, j11, l8.f4692a);
                    eVar2.f4811h0 = false;
                    eVar2.f4809f0 = j9;
                    eVar2.f4810g0 = j9;
                    eVar2.o(j9, z8);
                    eVar2.b(11, new A(this));
                    f fVar = this.f4652i0;
                    fVar.getClass();
                    J h5 = eVar2.h();
                    if (!(h5 == null || h5 == (j8 = (J) fVar.f4117Z))) {
                        if (j8 == null) {
                            fVar.f4117Z = h5;
                            fVar.f4116Y = eVar2;
                            ((V0.B) h5).d(((f0) fVar.f4114W).f4832Y);
                        } else {
                            throw new C0220l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z12 && z13) {
                        if (eVar2.f4805b0 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l.j(z10);
                        eVar2.f4805b0 = 2;
                        eVar2.r();
                    }
                    i10 = i + 1;
                    set = set2;
                    m9 = m8;
                    uVar2 = uVar;
                    k9 = k8;
                }
            }
            i = i10;
            m8 = m9;
            k8 = k9;
            uVar = uVar2;
            set2 = set;
            i10 = i + 1;
            set = set2;
            m9 = m8;
            uVar2 = uVar;
            k9 = k8;
        }
        k9.f4684h = true;
    }

    public final boolean d0(X x8, C1031B b8) {
        if (b8.b() || x8.p()) {
            return false;
        }
        int i = x8.g(b8.f12277a, this.f4650g0).f2864c;
        W w2 = this.f4649f0;
        x8.n(i, w2);
        if (!w2.a() || !w2.i || w2.f2874f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final long e(X x8, Object obj, long j7) {
        V v4 = this.f4650g0;
        int i = x8.g(obj, v4).f2864c;
        W w2 = this.f4649f0;
        x8.n(i, w2);
        if (w2.f2874f == -9223372036854775807L || !w2.a() || !w2.i) {
            return -9223372036854775807L;
        }
        return z.O(z.y(w2.f2875g) - w2.f2874f) - (j7 + v4.e);
    }

    public final void e0() {
        K k8 = this.f4656m0.i;
        if (k8 != null) {
            u uVar = k8.f4690o;
            int i = 0;
            while (true) {
                C0213e[] eVarArr = this.f4638U;
                if (i < eVarArr.length) {
                    if (uVar.b(i)) {
                        C0213e eVar = eVarArr[i];
                        int i8 = eVar.f4805b0;
                        boolean z = true;
                        if (i8 == 1) {
                            if (i8 != 1) {
                                z = false;
                            }
                            l.j(z);
                            eVar.f4805b0 = 2;
                            eVar.r();
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final Pair f(X x8) {
        long j7 = 0;
        if (x8.p()) {
            return Pair.create(X.f4748u, 0L);
        }
        X x9 = x8;
        Pair i = x9.i(this.f4649f0, this.f4650g0, x8.a(this.f4625D0), -9223372036854775807L);
        C1031B n4 = this.f4656m0.n(x8, i.first, 0);
        long longValue = ((Long) i.second).longValue();
        if (n4.b()) {
            Object obj = n4.f12277a;
            V v4 = this.f4650g0;
            x8.g(obj, v4);
            if (n4.f12279c == v4.e(n4.f12278b)) {
                v4.f2867g.getClass();
            }
        } else {
            j7 = longValue;
        }
        return Pair.create(n4, Long.valueOf(j7));
    }

    public final void f0(a0 a0Var) {
        this.f4646c0.a(9, (C1059z) a0Var).b();
    }

    public final long g(long j7) {
        K k8 = this.f4656m0.f4707k;
        if (k8 == null) {
            return 0;
        }
        return Math.max(0, j7 - (this.f4631J0 - k8.f4691p));
    }

    public final void g0(boolean z, boolean z6) {
        boolean z8;
        if (z || !this.f4626E0) {
            z8 = true;
        } else {
            z8 = false;
        }
        F(z8, false, true, false);
        this.f4664v0.f(z6 ? 1 : 0);
        C0218j jVar = this.f4644a0;
        if (jVar.f4861h.remove(this.f4659q0) != null) {
            jVar.d();
        }
        b0(1);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [h1.a0, java.lang.Object] */
    public final void h(C1059z zVar) {
        boolean z;
        M m8 = this.f4656m0;
        K k8 = m8.f4707k;
        if (k8 == null || k8.f4678a != zVar) {
            K k9 = m8.f4708l;
            if (k9 != null && k9.f4678a == zVar) {
                t();
                return;
            }
            return;
        }
        long j7 = this.f4631J0;
        if (k8 != null) {
            if (k8.f4688m == null) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            if (k8.e) {
                k8.f4678a.u(j7 - k8.f4691p);
            }
        }
        s();
    }

    public final void h0() {
        int i;
        boolean z;
        f fVar = this.f4652i0;
        fVar.f4113V = false;
        f0 f0Var = (f0) fVar.f4114W;
        if (f0Var.f4829V) {
            f0Var.b(f0Var.e());
            f0Var.f4829V = false;
        }
        for (C0213e eVar : this.f4638U) {
            if (q(eVar) && (i = eVar.f4805b0) == 2) {
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                l.j(z);
                eVar.f4805b0 = 1;
                eVar.s();
            }
        }
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        M m8;
        K k8;
        int i;
        K k9;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        Message message2 = message;
        int i8 = 1000;
        try {
            switch (message2.what) {
                case 1:
                    if (message2.arg1 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int i9 = message2.arg2;
                    V(i9 >> 4, i9 & 15, z6, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    N((E) message2.obj);
                    break;
                case 4:
                    W((L) message2.obj);
                    break;
                case 5:
                    this.f4662t0 = (e0) message2.obj;
                    break;
                case 6:
                    g0(false, true);
                    break;
                case 7:
                    B();
                    return true;
                case 8:
                    l((C1059z) message2.obj);
                    break;
                case 9:
                    h((C1059z) message2.obj);
                    break;
                case 10:
                    E();
                    break;
                case 11:
                    Y(message2.arg1);
                    break;
                case 12:
                    if (message2.arg1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Z(z8);
                    break;
                case 13:
                    if (message2.arg1 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    S((AtomicBoolean) message2.obj, z9);
                    break;
                case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                    a0 a0Var = (a0) message2.obj;
                    a0Var.getClass();
                    P(a0Var);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                    Q((a0) message2.obj);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                    L l8 = (L) message2.obj;
                    m(l8, l8.f2846a, true, false);
                    break;
                case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                    T((B) message2.obj);
                    break;
                case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                    a((B) message2.obj, message2.arg1);
                    break;
                case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                    e.G(message2.obj);
                    y();
                    throw null;
                case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                    D(message2.arg1, message2.arg2, (b0) message2.obj);
                    break;
                case 21:
                    a0((b0) message2.obj);
                    break;
                case 22:
                    x();
                    break;
                case 23:
                    if (message2.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    U(z10);
                    break;
                case 25:
                    E();
                    M(true);
                    break;
                case 26:
                    E();
                    M(true);
                    break;
                case 27:
                    k0(message2.arg1, message2.arg2, (List) message2.obj);
                    break;
                case 28:
                    X((C0222n) message2.obj);
                    break;
                case 29:
                    z();
                    break;
                default:
                    return false;
            }
        } catch (C0220l e) {
            C0220l lVar = e;
            int i10 = lVar.f4864W;
            M m9 = this.f4656m0;
            if (i10 != 1 || (k9 = m9.f4706j) == null) {
                m8 = m9;
            } else {
                L l9 = k9.f4683g;
                String message3 = lVar.getMessage();
                Throwable cause = lVar.getCause();
                long j7 = lVar.f2844V;
                boolean z11 = lVar.f4870c0;
                int i11 = lVar.f2843U;
                m8 = m9;
                int i12 = i11;
                lVar = new C0220l(message3, cause, i12, lVar.f4864W, lVar.f4865X, lVar.f4866Y, lVar.f4867Z, lVar.f4868a0, l9.f4692a, j7, z11);
            }
            if (!lVar.f4870c0 || !(this.f4635N0 == null || (i = lVar.f2843U) == 5004 || i == 5003)) {
                C0220l lVar2 = this.f4635N0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(lVar);
                    lVar = this.f4635N0;
                }
                C0220l lVar3 = lVar;
                l.p("ExoPlayerImplInternal", "Playback error", lVar3);
                if (lVar3.f4864W == 1) {
                    M m10 = m8;
                    if (m10.i != m10.f4706j) {
                        while (true) {
                            k8 = m10.i;
                            if (k8 == m10.f4706j) {
                                break;
                            }
                            m10.a();
                        }
                        k8.getClass();
                        u();
                        L l10 = k8.f4683g;
                        C1031B b8 = l10.f4692a;
                        long j8 = l10.f4693b;
                        this.f4663u0 = n(b8, j8, l10.f4694c, j8, true, 0);
                    }
                }
                z = true;
                g0(true, false);
                this.f4663u0 = this.f4663u0.e(lVar3);
            } else {
                l.C("ExoPlayerImplInternal", "Recoverable renderer error", lVar);
                C0220l lVar4 = this.f4635N0;
                if (lVar4 != null) {
                    lVar4.addSuppressed(lVar);
                    lVar = this.f4635N0;
                } else {
                    this.f4635N0 = lVar;
                }
                v vVar = this.f4646c0;
                P0.u a8 = vVar.a(25, lVar);
                vVar.getClass();
                Message message4 = a8.f3739a;
                message4.getClass();
                vVar.f3741a.sendMessageAtFrontOfQueue(message4);
                a8.a();
            }
        } catch (c e8) {
            c cVar = e8;
            i(cVar.f6313U, cVar);
        } catch (J e9) {
            J j9 = e9;
            boolean z12 = j9.f2841U;
            int i13 = j9.f2842V;
            if (i13 == 1) {
                if (z12) {
                    i8 = 3001;
                } else {
                    i8 = 3003;
                }
            } else if (i13 == 4) {
                if (z12) {
                    i8 = 3002;
                } else {
                    i8 = 3004;
                }
            }
            i(i8, j9);
        } catch (i e10) {
            i iVar = e10;
            i(iVar.f4265U, iVar);
        } catch (C1036b e11) {
            i(1002, e11);
        } catch (IOException e12) {
            i(2000, e12);
        } catch (RuntimeException e13) {
            RuntimeException runtimeException = e13;
            if ((runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) {
                i8 = 1004;
            }
            C0220l lVar5 = new C0220l(2, runtimeException, i8);
            l.p("ExoPlayerImplInternal", "Playback error", lVar5);
            g0(true, false);
            this.f4663u0 = this.f4663u0.e(lVar5);
        }
        z = true;
        u();
        return z;
    }

    public final void i(int i, IOException iOException) {
        C0220l lVar = new C0220l(0, iOException, i);
        K k8 = this.f4656m0.i;
        if (k8 != null) {
            L l8 = k8.f4683g;
            String message = lVar.getMessage();
            Throwable cause = lVar.getCause();
            long j7 = lVar.f2844V;
            boolean z = lVar.f4870c0;
            lVar = new C0220l(message, cause, lVar.f2843U, lVar.f4864W, lVar.f4865X, lVar.f4866Y, lVar.f4867Z, lVar.f4868a0, l8.f4692a, j7, z);
        }
        l.p("ExoPlayerImplInternal", "Playback error", lVar);
        g0(false, false);
        this.f4663u0 = this.f4663u0.e(lVar);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [h1.a0, java.lang.Object] */
    public final void i0() {
        boolean z;
        K k8 = this.f4656m0.f4707k;
        if (this.f4623B0 || (k8 != null && k8.f4678a.b())) {
            z = true;
        } else {
            z = false;
        }
        X x8 = this.f4663u0;
        if (z != x8.f4754g) {
            X x9 = r2;
            X x10 = new X(x8.f4749a, x8.f4750b, x8.f4751c, x8.f4752d, x8.e, x8.f4753f, z, x8.f4755h, x8.i, x8.f4756j, x8.f4757k, x8.f4758l, x8.f4759m, x8.f4760n, x8.f4761o, x8.f4763q, x8.f4764r, x8.f4765s, x8.f4766t, x8.f4762p);
            this.f4663u0 = x9;
        }
    }

    public final void j(boolean z) {
        C1031B b8;
        long j7;
        K k8 = this.f4656m0.f4707k;
        if (k8 == null) {
            b8 = this.f4663u0.f4750b;
        } else {
            b8 = k8.f4683g.f4692a;
        }
        boolean equals = this.f4663u0.f4757k.equals(b8);
        if (!equals) {
            this.f4663u0 = this.f4663u0.b(b8);
        }
        X x8 = this.f4663u0;
        if (k8 == null) {
            j7 = x8.f4765s;
        } else {
            j7 = k8.d();
        }
        x8.f4763q = j7;
        X x9 = this.f4663u0;
        x9.f4764r = g(x9.f4763q);
        if ((!equals || z) && k8 != null && k8.e) {
            j0(k8.f4690o);
        }
    }

    public final void j0(u uVar) {
        K k8 = this.f4656m0.f4707k;
        k8.getClass();
        g(k8.d());
        if (d0(this.f4663u0.f4749a, k8.f4683g.f4692a)) {
            long j7 = this.f4658o0.f4847h;
        }
        X x8 = this.f4663u0.f4749a;
        float f8 = this.f4652i0.c().f2846a;
        boolean z = this.f4663u0.f4758l;
        r[] rVarArr = uVar.f13011c;
        C0218j jVar = this.f4644a0;
        C0217i iVar = (C0217i) jVar.f4861h.get(this.f4659q0);
        iVar.getClass();
        int i = jVar.f4859f;
        if (i == -1) {
            int length = rVarArr.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = 13107200;
                if (i8 < length) {
                    r rVar = rVarArr[i8];
                    if (rVar != null) {
                        switch (rVar.l().f2887c) {
                            case SdpErrno.ERROR_INVALID_RESET_TOKEN /*-2*/:
                                i10 = 0;
                                break;
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i10 = 144310272;
                                break;
                            case 2:
                                i10 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i10 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i9 += i10;
                    }
                    i8++;
                } else {
                    i = Math.max(13107200, i9);
                }
            }
        }
        iVar.f4854b = i;
        jVar.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: M0.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: T0.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: T0.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: T0.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: T0.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: M0.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v22, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r25v25 */
    /* JADX WARNING: type inference failed for: r25v30 */
    /* JADX WARNING: type inference failed for: r25v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02f0 A[Catch:{ all -> 0x02f3, all -> 0x02ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x040a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0456  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(M0.X r38, boolean r39) {
        /*
            r37 = this;
            r11 = r37
            r12 = r38
            T0.X r0 = r11.f4663u0
            T0.E r8 = r11.f4630I0
            T0.M r10 = r11.f4656m0
            int r4 = r11.f4624C0
            boolean r13 = r11.f4625D0
            M0.W r14 = r11.f4649f0
            M0.V r15 = r11.f4650g0
            boolean r1 = r38.p()
            r6 = 0
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            T0.D r0 = new T0.D
            h1.B r19 = T0.X.f4748u
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r24 = r6
            r8 = -1
            r11 = 4
        L_0x003a:
            r7 = r0
            goto L_0x021c
        L_0x003d:
            h1.B r1 = r0.f4750b
            java.lang.Object r9 = r1.f12277a
            M0.X r2 = r0.f4749a
            boolean r20 = r2.p()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.f12277a
            M0.V r2 = r2.g(r3, r15)
            boolean r2 = r2.f2866f
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = 1
        L_0x0059:
            h1.B r2 = r0.f4750b
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x0069
            if (r21 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            long r2 = r0.f4765s
        L_0x0066:
            r22 = r2
            goto L_0x006c
        L_0x0069:
            long r2 = r0.f4751c
            goto L_0x0066
        L_0x006c:
            if (r8 == 0) goto L_0x00c0
            r3 = 1
            r2 = r1
            r1 = r38
            r27 = r2
            r11 = 4
            r2 = r8
            r5 = r13
            r6 = r14
            r7 = r15
            android.util.Pair r1 = J(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r13)
            r3 = r1
            r1 = r22
            r4 = 1
            r5 = 0
            r6 = 0
            goto L_0x00b2
        L_0x008a:
            long r2 = r8.f4620c
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x009c
            java.lang.Object r1 = r1.first
            M0.V r1 = r12.g(r1, r15)
            int r3 = r1.f2864c
            r1 = r22
            r5 = 0
            goto L_0x00a8
        L_0x009c:
            java.lang.Object r9 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = -1
            r5 = 1
        L_0x00a8:
            int r4 = r0.e
            if (r4 != r11) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            r6 = r5
            r5 = r4
            r4 = 0
        L_0x00b2:
            r35 = r4
            r34 = r5
            r36 = r6
            r7 = r27
            r8 = -1
            r24 = 0
            r4 = r3
            goto L_0x016f
        L_0x00c0:
            r27 = r1
            r11 = 4
            M0.X r1 = r0.f4749a
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r13)
            r4 = r1
            r1 = r22
            r7 = r27
            r8 = -1
        L_0x00d5:
            r24 = 0
        L_0x00d7:
            r34 = 0
            r35 = 0
        L_0x00db:
            r36 = 0
            goto L_0x016f
        L_0x00df:
            int r1 = r12.b(r9)
            r8 = -1
            if (r1 != r8) goto L_0x0108
            M0.X r6 = r0.f4749a
            r1 = r14
            r2 = r15
            r3 = r4
            r4 = r13
            r5 = r9
            r7 = r38
            int r1 = K(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r8) goto L_0x00fb
            int r1 = r12.a(r13)
            r5 = 1
            goto L_0x00fc
        L_0x00fb:
            r5 = 0
        L_0x00fc:
            r4 = r1
            r35 = r5
            r1 = r22
            r7 = r27
            r24 = 0
            r34 = 0
            goto L_0x00db
        L_0x0108:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0118
            M0.V r1 = r12.g(r9, r15)
            int r1 = r1.f2864c
            r4 = r1
            r1 = r22
            r7 = r27
            goto L_0x00d5
        L_0x0118:
            if (r21 == 0) goto L_0x0166
            M0.X r1 = r0.f4749a
            r7 = r27
            java.lang.Object r2 = r7.f12277a
            r1.g(r2, r15)
            M0.X r1 = r0.f4749a
            int r2 = r15.f2864c
            r5 = 0
            M0.W r1 = r1.m(r2, r14, r5)
            int r1 = r1.f2881n
            M0.X r2 = r0.f4749a
            java.lang.Object r3 = r7.f12277a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x015a
            long r1 = r15.e
            long r19 = r22 + r1
            M0.V r1 = r12.g(r9, r15)
            int r4 = r1.f2864c
            r1 = r38
            r2 = r14
            r3 = r15
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.i(r2, r3, r4, r5)
            java.lang.Object r9 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x015e
        L_0x015a:
            r24 = r5
            r1 = r22
        L_0x015e:
            r4 = -1
            r34 = 0
            r35 = 0
            r36 = 1
            goto L_0x016f
        L_0x0166:
            r7 = r27
            r24 = 0
            r1 = r22
            r4 = -1
            goto L_0x00d7
        L_0x016f:
            if (r4 == r8) goto L_0x018b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r38
            r2 = r14
            r3 = r15
            android.util.Pair r1 = r1.i(r2, r3, r4, r5)
            java.lang.Object r9 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r32 = r16
            goto L_0x018d
        L_0x018b:
            r32 = r1
        L_0x018d:
            h1.B r3 = r10.n(r12, r9, r1)
            int r4 = r3.e
            if (r4 == r8) goto L_0x019e
            int r5 = r7.e
            if (r5 == r8) goto L_0x019c
            if (r4 < r5) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r5 = 0
            goto L_0x019f
        L_0x019e:
            r5 = 1
        L_0x019f:
            java.lang.Object r4 = r7.f12277a
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x01b7
            boolean r4 = r7.b()
            if (r4 != 0) goto L_0x01b7
            boolean r4 = r3.b()
            if (r4 != 0) goto L_0x01b7
            if (r5 == 0) goto L_0x01b7
            r5 = 1
            goto L_0x01b8
        L_0x01b7:
            r5 = 0
        L_0x01b8:
            M0.V r4 = r12.g(r9, r15)
            if (r21 != 0) goto L_0x01e3
            int r6 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r6 != 0) goto L_0x01e3
            java.lang.Object r6 = r7.f12277a
            java.lang.Object r9 = r3.f12277a
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x01cd
            goto L_0x01e3
        L_0x01cd:
            boolean r6 = r7.b()
            if (r6 == 0) goto L_0x01d8
            int r6 = r7.f12278b
            r4.g(r6)
        L_0x01d8:
            boolean r6 = r3.b()
            if (r6 == 0) goto L_0x01e3
            int r6 = r3.f12278b
            r4.g(r6)
        L_0x01e3:
            if (r5 != 0) goto L_0x01e6
            goto L_0x01e7
        L_0x01e6:
            r3 = r7
        L_0x01e7:
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x020f
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x01f8
            long r6 = r0.f4765s
            r30 = r6
            goto L_0x0211
        L_0x01f8:
            java.lang.Object r0 = r3.f12277a
            r12.g(r0, r15)
            int r0 = r3.f12279c
            int r1 = r3.f12278b
            int r1 = r15.e(r1)
            if (r0 != r1) goto L_0x020c
            M0.c r0 = r15.f2867g
            r0.getClass()
        L_0x020c:
            r30 = r24
            goto L_0x0211
        L_0x020f:
            r30 = r1
        L_0x0211:
            T0.D r0 = new T0.D
            r28 = r0
            r29 = r3
            r28.<init>(r29, r30, r32, r34, r35, r36)
            goto L_0x003a
        L_0x021c:
            h1.B r9 = r7.f4613a
            long r13 = r7.f4615c
            boolean r6 = r7.f4616d
            long r3 = r7.f4614b
            r10 = 4
            r11 = r37
            T0.X r0 = r11.f4663u0
            h1.B r0 = r0.f4750b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x023c
            T0.X r0 = r11.f4663u0
            long r0 = r0.f4765s
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            r15 = 0
            goto L_0x023d
        L_0x023c:
            r15 = 1
        L_0x023d:
            r19 = 3
            boolean r0 = r7.e     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0269
            T0.X r0 = r11.f4663u0     // Catch:{ all -> 0x0266 }
            int r0 = r0.e     // Catch:{ all -> 0x0266 }
            r1 = 1
            if (r0 == r1) goto L_0x024d
            r11.b0(r10)     // Catch:{ all -> 0x024f }
        L_0x024d:
            r8 = 0
            goto L_0x025b
        L_0x024f:
            r0 = move-exception
            r23 = r3
            r10 = r9
            r25 = r13
            r8 = 0
        L_0x0256:
            r9 = -1
            r13 = 2
            r14 = 0
            goto L_0x03da
        L_0x025b:
            r11.F(r8, r8, r8, r1)     // Catch:{ all -> 0x025f }
            goto L_0x026a
        L_0x025f:
            r0 = move-exception
        L_0x0260:
            r23 = r3
            r10 = r9
            r25 = r13
            goto L_0x0256
        L_0x0266:
            r0 = move-exception
            r8 = 0
            goto L_0x0260
        L_0x0269:
            r8 = 0
        L_0x026a:
            T0.e[] r0 = r11.f4638U     // Catch:{ all -> 0x025f }
            int r1 = r0.length     // Catch:{ all -> 0x025f }
            r2 = 0
        L_0x026e:
            if (r2 >= r1) goto L_0x0282
            r5 = r0[r2]     // Catch:{ all -> 0x025f }
            M0.X r10 = r5.f4813j0     // Catch:{ all -> 0x025f }
            int r23 = P0.z.f3748a     // Catch:{ all -> 0x025f }
            boolean r10 = j$.util.Objects.equals(r10, r12)     // Catch:{ all -> 0x025f }
            if (r10 != 0) goto L_0x027e
            r5.f4813j0 = r12     // Catch:{ all -> 0x025f }
        L_0x027e:
            r5 = 1
            int r2 = r2 + r5
            r10 = 4
            goto L_0x026e
        L_0x0282:
            if (r15 != 0) goto L_0x030e
            T0.M r1 = r11.f4656m0     // Catch:{ all -> 0x0305 }
            long r5 = r11.f4631J0     // Catch:{ all -> 0x0305 }
            T0.K r0 = r1.f4706j     // Catch:{ all -> 0x02fe }
            if (r0 != 0) goto L_0x0295
            r10 = r9
            r8 = r24
        L_0x028f:
            r23 = r3
        L_0x0291:
            r25 = r13
        L_0x0293:
            r13 = 1
            goto L_0x02da
        L_0x0295:
            r10 = r9
            long r8 = r0.f4691p     // Catch:{ all -> 0x02fa }
            boolean r2 = r0.e     // Catch:{ all -> 0x02fa }
            if (r2 != 0) goto L_0x029d
            goto L_0x028f
        L_0x029d:
            r23 = r3
            r2 = 0
        L_0x02a0:
            T0.e[] r3 = r11.f4638U     // Catch:{ all -> 0x02f6 }
            int r4 = r3.length     // Catch:{ all -> 0x02f6 }
            if (r2 >= r4) goto L_0x0291
            r4 = r3[r2]     // Catch:{ all -> 0x02d4 }
            boolean r4 = q(r4)     // Catch:{ all -> 0x02d4 }
            if (r4 == 0) goto L_0x02cd
            r3 = r3[r2]     // Catch:{ all -> 0x02d4 }
            h1.Y r4 = r3.f4806c0     // Catch:{ all -> 0x02d4 }
            r25 = r13
            h1.Y[] r13 = r0.f4680c     // Catch:{ all -> 0x02cb }
            r13 = r13[r2]     // Catch:{ all -> 0x02cb }
            if (r4 == r13) goto L_0x02ba
            goto L_0x02c9
        L_0x02ba:
            long r3 = r3.f4810g0     // Catch:{ all -> 0x02cb }
            r13 = -9223372036854775808
            int r27 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r27 != 0) goto L_0x02c4
            r8 = r13
            goto L_0x0293
        L_0x02c4:
            long r3 = java.lang.Math.max(r3, r8)     // Catch:{ all -> 0x02cb }
            r8 = r3
        L_0x02c9:
            r13 = 1
            goto L_0x02d0
        L_0x02cb:
            r0 = move-exception
            goto L_0x02d7
        L_0x02cd:
            r25 = r13
            goto L_0x02c9
        L_0x02d0:
            int r2 = r2 + r13
            r13 = r25
            goto L_0x02a0
        L_0x02d4:
            r0 = move-exception
            r25 = r13
        L_0x02d7:
            r13 = 1
        L_0x02d8:
            r8 = 0
            goto L_0x030b
        L_0x02da:
            r14 = 0
            r2 = r38
            r3 = r5
            r13 = 2
            r5 = r8
            boolean r0 = r1.q(r2, r3, r5)     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x02f0
            r8 = 0
            r11.M(r8)     // Catch:{ all -> 0x02ec }
            goto L_0x0351
        L_0x02ec:
            r0 = move-exception
        L_0x02ed:
            r9 = -1
            goto L_0x03da
        L_0x02f0:
            r8 = 0
            goto L_0x0351
        L_0x02f3:
            r0 = move-exception
            r8 = 0
            goto L_0x02ed
        L_0x02f6:
            r0 = move-exception
        L_0x02f7:
            r25 = r13
            goto L_0x02d8
        L_0x02fa:
            r0 = move-exception
            r23 = r3
            goto L_0x02f7
        L_0x02fe:
            r0 = move-exception
            r23 = r3
            r10 = r9
            r25 = r13
            goto L_0x030b
        L_0x0305:
            r0 = move-exception
            r23 = r3
            r10 = r9
            r25 = r13
        L_0x030b:
            r13 = 2
            r14 = 0
            goto L_0x02ed
        L_0x030e:
            r23 = r3
            r10 = r9
            r25 = r13
            r13 = 2
            r14 = 0
            boolean r0 = r38.p()     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0351
            T0.M r0 = r11.f4656m0     // Catch:{ all -> 0x02ec }
            T0.K r0 = r0.i     // Catch:{ all -> 0x02ec }
        L_0x031f:
            if (r0 == 0) goto L_0x033b
            T0.L r1 = r0.f4683g     // Catch:{ all -> 0x02ec }
            h1.B r1 = r1.f4692a     // Catch:{ all -> 0x02ec }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x02ec }
            if (r1 == 0) goto L_0x0338
            T0.M r1 = r11.f4656m0     // Catch:{ all -> 0x02ec }
            T0.L r2 = r0.f4683g     // Catch:{ all -> 0x02ec }
            T0.L r1 = r1.g(r12, r2)     // Catch:{ all -> 0x02ec }
            r0.f4683g = r1     // Catch:{ all -> 0x02ec }
            r0.k()     // Catch:{ all -> 0x02ec }
        L_0x0338:
            T0.K r0 = r0.f4688m     // Catch:{ all -> 0x02ec }
            goto L_0x031f
        L_0x033b:
            T0.M r0 = r11.f4656m0     // Catch:{ all -> 0x02ec }
            T0.K r1 = r0.i     // Catch:{ all -> 0x02ec }
            T0.K r0 = r0.f4706j     // Catch:{ all -> 0x02ec }
            if (r1 == r0) goto L_0x0345
            r5 = 1
            goto L_0x0346
        L_0x0345:
            r5 = 0
        L_0x0346:
            r1 = r37
            r2 = r10
            r3 = r23
            long r0 = r1.O(r2, r3, r5, r6)     // Catch:{ all -> 0x02ec }
            r23 = r0
        L_0x0351:
            T0.X r0 = r11.f4663u0
            M0.X r4 = r0.f4749a
            h1.B r5 = r0.f4750b
            boolean r0 = r7.f4617f
            if (r0 == 0) goto L_0x035e
            r6 = r23
            goto L_0x0360
        L_0x035e:
            r6 = r16
        L_0x0360:
            r0 = 0
            r1 = r37
            r2 = r38
            r3 = r10
            r9 = -1
            r8 = r0
            r1.m0(r2, r3, r4, r5, r6, r8)
            if (r15 != 0) goto L_0x0378
            T0.X r0 = r11.f4663u0
            long r0 = r0.f4751c
            int r2 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0376
            goto L_0x0378
        L_0x0376:
            r15 = 0
            goto L_0x03b7
        L_0x0378:
            T0.X r0 = r11.f4663u0
            h1.B r1 = r0.f4750b
            java.lang.Object r1 = r1.f12277a
            M0.X r0 = r0.f4749a
            if (r15 == 0) goto L_0x0397
            if (r39 == 0) goto L_0x0397
            boolean r2 = r0.p()
            if (r2 != 0) goto L_0x0397
            M0.V r2 = r11.f4650g0
            M0.V r0 = r0.g(r1, r2)
            boolean r0 = r0.f2866f
            if (r0 != 0) goto L_0x0397
            r18 = 1
            goto L_0x0399
        L_0x0397:
            r18 = 0
        L_0x0399:
            T0.X r0 = r11.f4663u0
            long r7 = r0.f4752d
            int r0 = r12.b(r1)
            if (r0 != r9) goto L_0x03a5
            r19 = 4
        L_0x03a5:
            r1 = r37
            r2 = r10
            r3 = r23
            r5 = r25
            r15 = 0
            r9 = r18
            r10 = r19
            T0.X r0 = r1.n(r2, r3, r5, r7, r9, r10)
            r11.f4663u0 = r0
        L_0x03b7:
            r37.G()
            T0.X r0 = r11.f4663u0
            M0.X r0 = r0.f4749a
            r11.I(r12, r0)
            T0.X r0 = r11.f4663u0
            T0.X r0 = r0.h(r12)
            r11.f4663u0 = r0
            boolean r0 = r38.p()
            if (r0 != 0) goto L_0x03d1
            r11.f4630I0 = r14
        L_0x03d1:
            r11.j(r15)
            P0.v r0 = r11.f4646c0
            r0.e(r13)
            return
        L_0x03da:
            T0.X r1 = r11.f4663u0
            M0.X r4 = r1.f4749a
            h1.B r5 = r1.f4750b
            boolean r1 = r7.f4617f
            if (r1 == 0) goto L_0x03e7
            r6 = r23
            goto L_0x03e9
        L_0x03e7:
            r6 = r16
        L_0x03e9:
            r16 = 0
            r1 = r37
            r2 = r38
            r3 = r10
            r13 = 0
            r8 = r16
            r1.m0(r2, r3, r4, r5, r6, r8)
            if (r15 != 0) goto L_0x0400
            T0.X r1 = r11.f4663u0
            long r1 = r1.f4751c
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x043e
        L_0x0400:
            T0.X r1 = r11.f4663u0
            h1.B r2 = r1.f4750b
            java.lang.Object r2 = r2.f12277a
            M0.X r1 = r1.f4749a
            if (r15 == 0) goto L_0x041f
            if (r39 == 0) goto L_0x041f
            boolean r3 = r1.p()
            if (r3 != 0) goto L_0x041f
            M0.V r3 = r11.f4650g0
            M0.V r1 = r1.g(r2, r3)
            boolean r1 = r1.f2866f
            if (r1 != 0) goto L_0x041f
            r18 = 1
            goto L_0x0421
        L_0x041f:
            r18 = 0
        L_0x0421:
            T0.X r1 = r11.f4663u0
            long r7 = r1.f4752d
            int r1 = r12.b(r2)
            if (r1 != r9) goto L_0x042d
            r19 = 4
        L_0x042d:
            r1 = r37
            r2 = r10
            r3 = r23
            r5 = r25
            r9 = r18
            r10 = r19
            T0.X r1 = r1.n(r2, r3, r5, r7, r9, r10)
            r11.f4663u0 = r1
        L_0x043e:
            r37.G()
            T0.X r1 = r11.f4663u0
            M0.X r1 = r1.f4749a
            r11.I(r12, r1)
            T0.X r1 = r11.f4663u0
            T0.X r1 = r1.h(r12)
            r11.f4663u0 = r1
            boolean r1 = r38.p()
            if (r1 != 0) goto L_0x0458
            r11.f4630I0 = r14
        L_0x0458:
            r11.j(r13)
            P0.v r1 = r11.f4646c0
            r2 = 2
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.F.k(M0.X, boolean):void");
    }

    public final void k0(int i, int i8, List list) {
        boolean z;
        boolean z6 = true;
        this.f4664v0.f(1);
        W w2 = this.f4657n0;
        w2.getClass();
        ArrayList arrayList = (ArrayList) w2.f4740c;
        if (i < 0 || i > i8 || i8 > arrayList.size()) {
            z = false;
        } else {
            z = true;
        }
        l.d(z);
        if (list.size() != i8 - i) {
            z6 = false;
        }
        l.d(z6);
        for (int i9 = i; i9 < i8; i9++) {
            ((V) arrayList.get(i9)).f4734a.s((C) list.get(i9 - i));
        }
        k(w2.c(), false);
    }

    public final void l(C1059z zVar) {
        boolean z;
        K k8;
        M m8 = this.f4656m0;
        K k9 = m8.f4707k;
        int i = 0;
        if (k9 == null || k9.f4678a != zVar) {
            z = false;
        } else {
            z = true;
        }
        f fVar = this.f4652i0;
        if (z) {
            k9.getClass();
            if (!k9.e) {
                float f8 = fVar.c().f2846a;
                X x8 = this.f4663u0;
                k9.f(f8, x8.f4749a, x8.f4758l);
            }
            j0(k9.f4690o);
            if (k9 == m8.i) {
                H(k9.f4683g.f4693b);
                d(new boolean[this.f4638U.length], m8.f4706j.e());
                X x9 = this.f4663u0;
                C1031B b8 = x9.f4750b;
                L l8 = k9.f4683g;
                long j7 = x9.f4751c;
                long j8 = l8.f4693b;
                this.f4663u0 = n(b8, j8, j7, j8, false, 5);
            }
            s();
            return;
        }
        while (true) {
            if (i >= m8.f4712p.size()) {
                k8 = null;
                break;
            }
            k8 = (K) m8.f4712p.get(i);
            if (k8.f4678a == zVar) {
                break;
            }
            i++;
        }
        if (k8 != null) {
            l.j(!k8.e);
            float f9 = fVar.c().f2846a;
            X x10 = this.f4663u0;
            k8.f(f9, x10.f4749a, x10.f4758l);
            K k10 = m8.f4708l;
            if (k10 != null && k10.f4678a == zVar) {
                t();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v39, types: [h1.z, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l0() {
        /*
            r24 = this;
            r10 = r24
            r11 = 3
            r12 = 2
            r13 = 0
            r14 = 1
            T0.M r0 = r10.f4656m0
            T0.K r0 = r0.i
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            boolean r1 = r0.e
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.f4678a
            long r1 = r1.f()
            r6 = r1
            goto L_0x001f
        L_0x001e:
            r6 = r15
        L_0x001f:
            r9 = 16
            int r1 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x005d
            boolean r1 = r0.g()
            if (r1 != 0) goto L_0x0036
            T0.M r1 = r10.f4656m0
            r1.l(r0)
            r10.j(r13)
            r24.s()
        L_0x0036:
            r10.H(r6)
            T0.X r0 = r10.f4663u0
            long r0 = r0.f4765s
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0059
            T0.X r0 = r10.f4663u0
            h1.B r1 = r0.f4750b
            long r4 = r0.f4751c
            r8 = 1
            r17 = 5
            r0 = r24
            r2 = r6
            r15 = 16
            r9 = r17
            T0.X r0 = r0.n(r1, r2, r4, r6, r8, r9)
            r10.f4663u0 = r0
            goto L_0x0185
        L_0x0059:
            r15 = 16
            goto L_0x0185
        L_0x005d:
            r15 = 16
            Q3.f r1 = r10.f4652i0
            T0.M r2 = r10.f4656m0
            T0.K r2 = r2.f4706j
            if (r0 == r2) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            java.lang.Object r3 = r1.f4116Y
            T0.e r3 = (T0.C0213e) r3
            java.lang.Object r4 = r1.f4114W
            T0.f0 r4 = (T0.f0) r4
            if (r3 == 0) goto L_0x00e9
            boolean r3 = r3.k()
            if (r3 != 0) goto L_0x00e9
            if (r2 == 0) goto L_0x0084
            java.lang.Object r3 = r1.f4116Y
            T0.e r3 = (T0.C0213e) r3
            int r3 = r3.f4805b0
            if (r3 != r12) goto L_0x00e9
        L_0x0084:
            java.lang.Object r3 = r1.f4116Y
            T0.e r3 = (T0.C0213e) r3
            boolean r3 = r3.l()
            if (r3 != 0) goto L_0x009b
            if (r2 != 0) goto L_0x00e9
            java.lang.Object r2 = r1.f4116Y
            T0.e r2 = (T0.C0213e) r2
            boolean r2 = r2.j()
            if (r2 == 0) goto L_0x009b
            goto L_0x00e9
        L_0x009b:
            java.lang.Object r2 = r1.f4117Z
            T0.J r2 = (T0.J) r2
            r2.getClass()
            long r5 = r2.e()
            boolean r3 = r1.f4112U
            if (r3 == 0) goto L_0x00c9
            long r7 = r4.e()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x00c0
            boolean r2 = r4.f4829V
            if (r2 == 0) goto L_0x00f2
            long r2 = r4.e()
            r4.b(r2)
            r4.f4829V = r13
            goto L_0x00f2
        L_0x00c0:
            r1.f4112U = r13
            boolean r3 = r1.f4113V
            if (r3 == 0) goto L_0x00c9
            r4.f()
        L_0x00c9:
            r4.b(r5)
            M0.L r2 = r2.c()
            M0.L r3 = r4.f4832Y
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00f2
            r4.d(r2)
            java.lang.Object r3 = r1.f4115X
            T0.F r3 = (T0.F) r3
            P0.v r3 = r3.f4646c0
            P0.u r2 = r3.a(r15, r2)
            r2.b()
            goto L_0x00f2
        L_0x00e9:
            r1.f4112U = r14
            boolean r2 = r1.f4113V
            if (r2 == 0) goto L_0x00f2
            r4.f()
        L_0x00f2:
            long r1 = r1.e()
            r10.f4631J0 = r1
            long r3 = r0.f4691p
            long r6 = r1 - r3
            T0.X r0 = r10.f4663u0
            long r0 = r0.f4765s
            java.util.ArrayList r0 = r10.f4653j0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x015c
            T0.X r0 = r10.f4663u0
            h1.B r0 = r0.f4750b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0113
            goto L_0x015c
        L_0x0113:
            boolean r0 = r10.f4634M0
            if (r0 == 0) goto L_0x0119
            r10.f4634M0 = r13
        L_0x0119:
            T0.X r0 = r10.f4663u0
            M0.X r1 = r0.f4749a
            h1.B r0 = r0.f4750b
            java.lang.Object r0 = r0.f12277a
            r1.b(r0)
            int r0 = r10.f4633L0
            java.util.ArrayList r1 = r10.f4653j0
            int r1 = r1.size()
            int r0 = java.lang.Math.min(r0, r1)
            if (r0 <= 0) goto L_0x0143
            java.util.ArrayList r1 = r10.f4653j0
            int r2 = r0 + -1
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L_0x013d
            goto L_0x0143
        L_0x013d:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x0143:
            java.util.ArrayList r1 = r10.f4653j0
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x015a
            java.util.ArrayList r1 = r10.f4653j0
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x015a:
            r10.f4633L0 = r0
        L_0x015c:
            Q3.f r0 = r10.f4652i0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x017b
            T0.C r0 = r10.f4664v0
            boolean r0 = r0.f4611d
            r8 = r0 ^ 1
            T0.X r0 = r10.f4663u0
            h1.B r1 = r0.f4750b
            long r4 = r0.f4751c
            r9 = 6
            r0 = r24
            r2 = r6
            T0.X r0 = r0.n(r1, r2, r4, r6, r8, r9)
            r10.f4663u0 = r0
            goto L_0x0185
        L_0x017b:
            T0.X r0 = r10.f4663u0
            r0.f4765s = r6
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f4766t = r1
        L_0x0185:
            T0.M r0 = r10.f4656m0
            T0.K r0 = r0.f4707k
            T0.X r1 = r10.f4663u0
            long r2 = r0.d()
            r1.f4763q = r2
            T0.X r0 = r10.f4663u0
            long r1 = r0.f4763q
            long r1 = r10.g(r1)
            r0.f4764r = r1
            T0.X r0 = r10.f4663u0
            boolean r1 = r0.f4758l
            if (r1 == 0) goto L_0x02f3
            int r1 = r0.e
            if (r1 != r11) goto L_0x02f3
            M0.X r1 = r0.f4749a
            h1.B r0 = r0.f4750b
            boolean r0 = r10.d0(r1, r0)
            if (r0 == 0) goto L_0x02f3
            T0.X r0 = r10.f4663u0
            M0.L r1 = r0.f4761o
            float r1 = r1.f2846a
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x02f3
            T0.h r1 = r10.f4658o0
            M0.X r3 = r0.f4749a
            h1.B r4 = r0.f4750b
            java.lang.Object r4 = r4.f12277a
            long r5 = r0.f4765s
            long r3 = r10.e(r3, r4, r5)
            T0.X r0 = r10.f4663u0
            long r5 = r0.f4764r
            long r7 = r1.f4843c
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x01db
        L_0x01d8:
            r0 = r10
            goto L_0x02bf
        L_0x01db:
            long r5 = r3 - r5
            long r7 = r1.f4851m
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x01ea
            r1.f4851m = r5
            r5 = 0
            r1.f4852n = r5
            goto L_0x020f
        L_0x01ea:
            float r0 = (float) r7
            r7 = 1065336439(0x3f7fbe77, float:0.999)
            float r0 = r0 * r7
            float r8 = (float) r5
            r9 = 981668352(0x3a831200, float:9.999871E-4)
            float r8 = r8 * r9
            float r8 = r8 + r0
            long r14 = (long) r8
            long r14 = java.lang.Math.max(r5, r14)
            r1.f4851m = r14
            long r5 = r5 - r14
            long r5 = java.lang.Math.abs(r5)
            long r14 = r1.f4852n
            float r8 = (float) r14
            float r7 = r7 * r8
            float r5 = (float) r5
            float r9 = r9 * r5
            float r9 = r9 + r7
            long r5 = (long) r9
            r1.f4852n = r5
        L_0x020f:
            long r5 = r1.f4850l
            r7 = 1000(0x3e8, double:4.94E-321)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x022a
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r14 = r1.f4850l
            long r5 = r5 - r14
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x022a
            float r2 = r1.f4849k
            goto L_0x01d8
        L_0x022a:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r1.f4850l = r5
            long r5 = r1.f4851m
            r14 = 3
            long r12 = r1.f4852n
            long r12 = r12 * r14
            long r22 = r12 + r5
            long r5 = r1.f4847h
            r12 = 869711765(0x33d6bf95, float:1.0E-7)
            int r13 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r13 <= 0) goto L_0x0276
            long r5 = P0.z.O(r7)
            float r7 = r1.f4849k
            float r7 = r7 - r2
            float r5 = (float) r5
            float r7 = r7 * r5
            long r6 = (long) r7
            float r8 = r1.i
            float r8 = r8 - r2
            float r8 = r8 * r5
            long r13 = (long) r8
            long r6 = r6 + r13
            long r13 = r1.e
            long r9 = r1.f4847h
            long r9 = r9 - r6
            long[] r6 = new long[r11]
            r5 = 0
            r6[r5] = r22
            r0 = 1
            r6[r0] = r13
            r7 = 2
            r6[r7] = r9
            r7 = r6[r5]
            r5 = 1
        L_0x0268:
            if (r5 >= r11) goto L_0x0273
            r13 = r6[r5]
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0271
            r7 = r13
        L_0x0271:
            int r5 = r5 + r0
            goto L_0x0268
        L_0x0273:
            r1.f4847h = r7
            goto L_0x029d
        L_0x0276:
            float r0 = r1.f4849k
            float r0 = r0 - r2
            r5 = 0
            float r0 = java.lang.Math.max(r5, r0)
            float r0 = r0 / r12
            long r5 = (long) r0
            long r18 = r3 - r5
            long r5 = r1.f4847h
            r20 = r5
            long r5 = P0.z.j(r18, r20, r22)
            r1.f4847h = r5
            long r7 = r1.f4846g
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x029d
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x029d
            r1.f4847h = r7
        L_0x029d:
            long r5 = r1.f4847h
            long r3 = r3 - r5
            long r5 = java.lang.Math.abs(r3)
            long r7 = r1.f4841a
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ad
            r1.f4849k = r2
            goto L_0x02bb
        L_0x02ad:
            float r0 = (float) r3
            float r12 = r12 * r0
            float r12 = r12 + r2
            float r0 = r1.f4848j
            float r2 = r1.i
            float r0 = P0.z.h(r12, r0, r2)
            r1.f4849k = r0
        L_0x02bb:
            float r2 = r1.f4849k
            r0 = r24
        L_0x02bf:
            Q3.f r1 = r0.f4652i0
            M0.L r1 = r1.c()
            float r1 = r1.f2846a
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02f4
            T0.X r1 = r0.f4663u0
            M0.L r1 = r1.f4761o
            M0.L r3 = new M0.L
            float r1 = r1.f2847b
            r3.<init>(r2, r1)
            P0.v r1 = r0.f4646c0
            r2 = 16
            r1.d(r2)
            Q3.f r1 = r0.f4652i0
            r1.d(r3)
            T0.X r1 = r0.f4663u0
            M0.L r1 = r1.f4761o
            Q3.f r2 = r0.f4652i0
            M0.L r2 = r2.c()
            float r2 = r2.f2846a
            r3 = 0
            r0.m(r1, r2, r3, r3)
            goto L_0x02f4
        L_0x02f3:
            r0 = r10
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.F.l0():void");
    }

    public final void m(L l8, float f8, boolean z, boolean z6) {
        int i;
        if (z) {
            if (z6) {
                this.f4664v0.f(1);
            }
            this.f4663u0 = this.f4663u0.f(l8);
        }
        float f9 = l8.f2846a;
        K k8 = this.f4656m0.i;
        while (true) {
            i = 0;
            if (k8 == null) {
                break;
            }
            r[] rVarArr = k8.f4690o.f13011c;
            int length = rVarArr.length;
            while (i < length) {
                r rVar = rVarArr[i];
                if (rVar != null) {
                    rVar.q(f9);
                }
                i++;
            }
            k8 = k8.f4688m;
        }
        C0213e[] eVarArr = this.f4638U;
        int length2 = eVarArr.length;
        while (i < length2) {
            C0213e eVar = eVarArr[i];
            if (eVar != null) {
                eVar.y(f8, l8.f2846a);
            }
            i++;
        }
    }

    public final void m0(X x8, C1031B b8, X x9, C1031B b9, long j7, boolean z) {
        Object obj;
        L l8;
        if (!d0(x8, b8)) {
            if (b8.b()) {
                l8 = L.f2845d;
            } else {
                l8 = this.f4663u0.f4761o;
            }
            f fVar = this.f4652i0;
            if (!fVar.c().equals(l8)) {
                this.f4646c0.d(16);
                fVar.d(l8);
                m(this.f4663u0.f4761o, l8.f2846a, false, false);
                return;
            }
            return;
        }
        Object obj2 = b8.f12277a;
        V v4 = this.f4650g0;
        int i = x8.g(obj2, v4).f2864c;
        W w2 = this.f4649f0;
        x8.n(i, w2);
        C0136y yVar = w2.f2877j;
        C0216h hVar = this.f4658o0;
        hVar.getClass();
        hVar.f4843c = z.O(yVar.f3056a);
        hVar.f4845f = z.O(yVar.f3057b);
        hVar.f4846g = z.O(yVar.f3058c);
        float f8 = yVar.f3059d;
        if (f8 == -3.4028235E38f) {
            f8 = 0.97f;
        }
        hVar.f4848j = f8;
        float f9 = yVar.e;
        if (f9 == -3.4028235E38f) {
            f9 = 1.03f;
        }
        hVar.i = f9;
        if (f8 == 1.0f && f9 == 1.0f) {
            hVar.f4843c = -9223372036854775807L;
        }
        hVar.a();
        if (j7 != -9223372036854775807L) {
            hVar.f4844d = e(x8, obj2, j7);
            hVar.a();
            return;
        }
        Object obj3 = w2.f2870a;
        if (!x9.p()) {
            obj = x9.m(x9.g(b9.f12277a, v4).f2864c, w2, 0).f2870a;
        } else {
            obj = null;
        }
        if (!Objects.equals(obj, obj3) || z) {
            hVar.f4844d = -9223372036854775807L;
            hVar.a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: H3.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: H3.i0} */
    /* JADX WARNING: type inference failed for: r11v5, types: [H3.I, H3.L] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T0.X n(h1.C1031B r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r5 = r20
            r1 = r25
            boolean r3 = r0.f4634M0
            r4 = 0
            if (r3 != 0) goto L_0x0022
            T0.X r3 = r0.f4663u0
            long r8 = r3.f4765s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            T0.X r3 = r0.f4663u0
            h1.B r3 = r3.f4750b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = 0
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.f4634M0 = r3
            r16.G()
            T0.X r3 = r0.f4663u0
            h1.f0 r8 = r3.f4755h
            k1.u r9 = r3.i
            java.util.List r10 = r3.f4756j
            T0.W r11 = r0.f4657n0
            boolean r11 = r11.f4738a
            if (r11 == 0) goto L_0x00dc
            T0.M r3 = r0.f4656m0
            T0.K r3 = r3.i
            if (r3 != 0) goto L_0x003f
            h1.f0 r8 = h1.f0.f12468d
            goto L_0x0041
        L_0x003f:
            h1.f0 r8 = r3.f4689n
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            k1.u r9 = r0.f4643Z
            goto L_0x0048
        L_0x0046:
            k1.u r9 = r3.f4690o
        L_0x0048:
            k1.r[] r10 = r9.f13011c
            H3.L r11 = new H3.L
            r12 = 4
            r11.<init>(r12)
            int r12 = r10.length
            r13 = 0
            r14 = 0
        L_0x0053:
            if (r13 >= r12) goto L_0x0075
            r15 = r10[r13]
            if (r15 == 0) goto L_0x0072
            M0.r r15 = r15.e(r4)
            M0.H r15 = r15.f3034l
            if (r15 != 0) goto L_0x006c
            M0.H r15 = new M0.H
            M0.G[] r7 = new M0.G[r4]
            r15.<init>((M0.G[]) r7)
            r11.a(r15)
            goto L_0x0072
        L_0x006c:
            r11.a(r15)
            r7 = 1
            r14 = 1
            goto L_0x0073
        L_0x0072:
            r7 = 1
        L_0x0073:
            int r13 = r13 + r7
            goto L_0x0053
        L_0x0075:
            if (r14 == 0) goto L_0x007c
            H3.i0 r7 = r11.g()
            goto L_0x0080
        L_0x007c:
            H3.M r7 = H3.O.f2026V
            H3.i0 r7 = H3.i0.f2073Y
        L_0x0080:
            if (r3 == 0) goto L_0x0090
            T0.L r10 = r3.f4683g
            long r11 = r10.f4694c
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 == 0) goto L_0x0090
            T0.L r10 = r10.a(r5)
            r3.f4683g = r10
        L_0x0090:
            T0.M r3 = r0.f4656m0
            T0.K r3 = r3.i
            if (r3 == 0) goto L_0x00d8
            k1.u r3 = r3.f4690o
            r10 = 0
            r11 = 0
        L_0x009a:
            T0.e[] r12 = r0.f4638U
            int r13 = r12.length
            if (r11 >= r13) goto L_0x00bb
            boolean r13 = r3.b(r11)
            if (r13 == 0) goto L_0x00b8
            r12 = r12[r11]
            int r12 = r12.f4799V
            r13 = 1
            if (r12 == r13) goto L_0x00ae
            r3 = 0
            goto L_0x00bc
        L_0x00ae:
            T0.d0[] r12 = r3.f13010b
            r12 = r12[r11]
            int r12 = r12.f4796a
            if (r12 == 0) goto L_0x00b9
            r10 = 1
            goto L_0x00b9
        L_0x00b8:
            r13 = 1
        L_0x00b9:
            int r11 = r11 + r13
            goto L_0x009a
        L_0x00bb:
            r3 = 1
        L_0x00bc:
            if (r10 == 0) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            r3 = 1
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            boolean r10 = r0.f4628G0
            if (r3 != r10) goto L_0x00c8
            goto L_0x00d8
        L_0x00c8:
            r0.f4628G0 = r3
            if (r3 != 0) goto L_0x00d8
            T0.X r3 = r0.f4663u0
            boolean r3 = r3.f4762p
            if (r3 == 0) goto L_0x00d8
            P0.v r3 = r0.f4646c0
            r10 = 2
            r3.e(r10)
        L_0x00d8:
            r13 = r7
            r11 = r8
            r12 = r9
            goto L_0x00f1
        L_0x00dc:
            h1.B r3 = r3.f4750b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00ee
            h1.f0 r3 = h1.f0.f12468d
            k1.u r7 = r0.f4643Z
            H3.i0 r8 = H3.i0.f2073Y
            r11 = r3
            r12 = r7
            r13 = r8
            goto L_0x00f1
        L_0x00ee:
            r11 = r8
            r12 = r9
            r13 = r10
        L_0x00f1:
            if (r24 == 0) goto L_0x010c
            T0.C r3 = r0.f4664v0
            boolean r7 = r3.f4611d
            if (r7 == 0) goto L_0x0105
            int r7 = r3.e
            r8 = 5
            if (r7 == r8) goto L_0x0105
            if (r1 != r8) goto L_0x0101
            r4 = 1
        L_0x0101:
            P0.l.d(r4)
            goto L_0x010c
        L_0x0105:
            r4 = 1
            r3.f4610c = r4
            r3.f4611d = r4
            r3.e = r1
        L_0x010c:
            T0.X r1 = r0.f4663u0
            long r3 = r1.f4763q
            long r9 = r0.g(r3)
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            T0.X r1 = r1.c(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.F.n(h1.B, long, long, long, boolean, int):T0.X");
    }

    public final void n0(boolean z, boolean z6) {
        long j7;
        this.f4668z0 = z;
        if (!z || z6) {
            j7 = -9223372036854775807L;
        } else {
            this.f4654k0.getClass();
            j7 = SystemClock.elapsedRealtime();
        }
        this.f4622A0 = j7;
    }

    public final void o(C1059z zVar) {
        this.f4646c0.a(8, zVar).b();
    }

    public final synchronized void o0(C0233z zVar, long j7) {
        this.f4654k0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        boolean z = false;
        while (!((Boolean) zVar.get()).booleanValue() && j7 > 0) {
            try {
                this.f4654k0.getClass();
                wait(j7);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.f4654k0.getClass();
            j7 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean r() {
        K k8 = this.f4656m0.i;
        long j7 = k8.f4683g.e;
        if (!k8.e || (j7 != -9223372036854775807L && this.f4663u0.f4765s >= j7 && c0())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [h1.a0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v5, types: [h1.z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v7, types: [h1.a0, java.lang.Object] */
    public final void s() {
        boolean z;
        boolean z6;
        boolean z8;
        long j7;
        long j8;
        boolean z9 = false;
        if (!p(this.f4656m0.f4707k)) {
            z = false;
        } else {
            K k8 = this.f4656m0.f4707k;
            if (!k8.e) {
                j7 = 0;
            } else {
                j7 = k8.f4678a.e();
            }
            long g8 = g(j7);
            K k9 = this.f4656m0.i;
            if (d0(this.f4663u0.f4749a, k8.f4683g.f4692a)) {
                j8 = this.f4658o0.f4847h;
            } else {
                j8 = -9223372036854775807L;
            }
            j jVar = this.f4659q0;
            X x8 = this.f4663u0.f4749a;
            float f8 = this.f4652i0.c().f2846a;
            boolean z10 = this.f4663u0.f4758l;
            G g9 = new G(jVar, g8, f8, this.f4668z0, j8);
            z = this.f4644a0.c(g9);
            K k10 = this.f4656m0.i;
            if (!z && k10.e && g8 < 500000 && this.f4651h0 > 0) {
                k10.f4678a.t(this.f4663u0.f4765s);
                z = this.f4644a0.c(g9);
            }
        }
        this.f4623B0 = z;
        if (z) {
            K k11 = this.f4656m0.f4707k;
            k11.getClass();
            H h5 = new H();
            h5.f4672a = this.f4631J0 - k11.f4691p;
            float f9 = this.f4652i0.c().f2846a;
            if (f9 > 0.0f || f9 == -3.4028235E38f) {
                z6 = true;
            } else {
                z6 = false;
            }
            l.d(z6);
            h5.f4673b = f9;
            long j9 = this.f4622A0;
            if (j9 >= 0 || j9 == -9223372036854775807L) {
                z8 = true;
            } else {
                z8 = false;
            }
            l.d(z8);
            h5.f4674c = j9;
            I i = new I(h5);
            if (k11.f4688m == null) {
                z9 = true;
            }
            l.j(z9);
            k11.f4678a.h(i);
        }
        i0();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [h1.a0, h1.z, java.lang.Object] */
    public final void t() {
        boolean z;
        boolean z6;
        M m8 = this.f4656m0;
        m8.j();
        K k8 = m8.f4708l;
        if (k8 == null) {
            return;
        }
        if (!k8.f4681d || k8.e) {
            ? r12 = k8.f4678a;
            if (!r12.b()) {
                X x8 = this.f4663u0.f4749a;
                if (k8.e) {
                    r12.n();
                }
                for (C0217i iVar : this.f4644a0.f4861h.values()) {
                    if (iVar.f4853a) {
                        return;
                    }
                }
                boolean z8 = true;
                if (!k8.f4681d) {
                    L l8 = k8.f4683g;
                    k8.f4681d = true;
                    r12.i(this, l8.f4693b);
                    return;
                }
                H h5 = new H();
                h5.f4672a = this.f4631J0 - k8.f4691p;
                float f8 = this.f4652i0.c().f2846a;
                if (f8 > 0.0f || f8 == -3.4028235E38f) {
                    z = true;
                } else {
                    z = false;
                }
                l.d(z);
                h5.f4673b = f8;
                long j7 = this.f4622A0;
                if (j7 >= 0 || j7 == -9223372036854775807L) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l.d(z6);
                h5.f4674c = j7;
                I i = new I(h5);
                if (k8.f4688m != null) {
                    z8 = false;
                }
                l.j(z8);
                r12.h(i);
            }
        }
    }

    public final void u() {
        boolean z;
        C c8 = this.f4664v0;
        X x8 = this.f4663u0;
        boolean z6 = c8.f4610c;
        if (((X) c8.f4612f) != x8) {
            z = true;
        } else {
            z = false;
        }
        boolean z8 = z6 | z;
        c8.f4610c = z8;
        c8.f4612f = x8;
        if (z8) {
            C0232y yVar = this.f4655l0.f4899U;
            yVar.f4948d0.c(new C0002c((Object) yVar, 21, (Object) c8));
            this.f4664v0 = new C(this.f4663u0);
        }
    }

    public final void v(int i) {
        C0213e eVar = this.f4638U[i];
        try {
            Y y8 = eVar.f4806c0;
            y8.getClass();
            y8.a();
        } catch (IOException | RuntimeException e) {
            int i8 = eVar.f4799V;
            if (i8 == 3 || i8 == 5) {
                u uVar = this.f4656m0.i.f4690o;
                l.p("ExoPlayerImplInternal", "Disabling track due to error: " + M0.r.d(uVar.f13011c[i].m()), e);
                u uVar2 = new u((d0[]) uVar.f13010b.clone(), (r[]) uVar.f13011c.clone(), uVar.f13012d, uVar.e);
                uVar2.f13010b[i] = null;
                uVar2.f13011c[i] = null;
                b(i);
                K k8 = this.f4656m0.i;
                k8.a(uVar2, this.f4663u0.f4765s, false, new boolean[k8.f4685j.length]);
                return;
            }
            throw e;
        }
    }

    public final void w(int i, boolean z) {
        boolean[] zArr = this.f4641X;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f4661s0.c(new A3.c(this, i, z));
        }
    }

    public final void x() {
        k(this.f4657n0.c(), true);
    }

    public final void y() {
        this.f4664v0.f(1);
        throw null;
    }

    public final void z() {
        boolean z;
        int i;
        this.f4664v0.f(1);
        int i8 = 0;
        F(false, false, false, true);
        C0218j jVar = this.f4644a0;
        jVar.getClass();
        long id = Thread.currentThread().getId();
        long j7 = jVar.i;
        if (j7 == -1 || j7 == id) {
            z = true;
        } else {
            z = false;
        }
        l.i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z);
        jVar.i = id;
        HashMap hashMap = jVar.f4861h;
        j jVar2 = this.f4659q0;
        if (!hashMap.containsKey(jVar2)) {
            hashMap.put(jVar2, new Object());
        }
        C0217i iVar = (C0217i) hashMap.get(jVar2);
        iVar.getClass();
        int i9 = jVar.f4859f;
        if (i9 == -1) {
            i9 = 13107200;
        }
        iVar.f4854b = i9;
        iVar.f4853a = false;
        if (this.f4663u0.f4749a.p()) {
            i = 4;
        } else {
            i = 2;
        }
        b0(i);
        h hVar = (h) this.f4645b0;
        hVar.getClass();
        W w2 = this.f4657n0;
        l.j(!w2.f4738a);
        w2.f4747l = hVar;
        while (true) {
            ArrayList arrayList = (ArrayList) w2.f4740c;
            if (i8 < arrayList.size()) {
                V v4 = (V) arrayList.get(i8);
                w2.g(v4);
                ((HashSet) w2.f4744h).add(v4);
                i8++;
            } else {
                w2.f4738a = true;
                this.f4646c0.e(2);
                return;
            }
        }
    }
}
