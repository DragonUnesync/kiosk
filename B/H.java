package B;

import C7.d;
import D.C0041e0;
import D.C0048i;
import D.C0053k0;
import D.C0069x;
import D.K;
import D.K0;
import D.L0;
import D.O0;
import D.T;
import D.y0;
import D.z0;
import D7.b;
import H.m;
import N.e;
import N5.l;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import t.C1412a;

public final class H extends v0 {

    /* renamed from: u  reason: collision with root package name */
    public static final F f147u = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final K f148o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f149p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public l f150q;

    /* renamed from: r  reason: collision with root package name */
    public y0 f151r;

    /* renamed from: s  reason: collision with root package name */
    public p0 f152s;

    /* renamed from: t  reason: collision with root package name */
    public z0 f153t;

    public H(T t8) {
        super(t8);
        if (((Integer) ((C0053k0) ((T) this.f340f).x()).o0(T.f847V, 0)).intValue() == 1) {
            this.f148o = new K();
        } else {
            this.f148o = new O((Executor) e.q(t8, m.f1804G, b.y()));
        }
        this.f148o.f171X = D();
        K k8 = this.f148o;
        T t9 = (T) this.f340f;
        Boolean bool = Boolean.FALSE;
        t9.getClass();
        k8.f172Y = ((Boolean) e.q(t9, T.f852a0, bool)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        if (r10.equals((java.lang.Boolean) N.e.q(r11, D.T.f851Z, (java.lang.Object) null)) != false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D.y0 C(D.T r14, D.C0048i r15) {
        /*
            r13 = this;
            g7.l.a()
            android.util.Size r0 = r15.f904a
            F.f r1 = D7.b.y()
            r14.getClass()
            D.c r2 = H.m.f1804G
            java.lang.Object r1 = N.e.q(r14, r2, r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r1.getClass()
            D.L0 r2 = r13.f340f
            D.T r2 = (D.T) r2
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            D.K r2 = r2.x()
            D.k0 r2 = (D.C0053k0) r2
            D.c r5 = D.T.f847V
            java.lang.Object r2 = r2.o0(r5, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            if (r2 != r4) goto L_0x0054
            D.L0 r2 = r13.f340f
            D.T r2 = (D.T) r2
            r2.getClass()
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            D.c r6 = D.T.f848W
            D.K r2 = r2.x()
            D.k0 r2 = (D.C0053k0) r2
            java.lang.Object r2 = r2.o0(r6, r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0055
        L_0x0054:
            r2 = 4
        L_0x0055:
            D.K r5 = r14.x()
            D.k0 r5 = (D.C0053k0) r5
            D.c r6 = D.T.f849X
            r7 = 0
            java.lang.Object r5 = r5.o0(r6, r7)
            if (r5 != 0) goto L_0x01a7
            B.j0 r5 = new B.j0
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            D.L0 r9 = r13.f340f
            int r9 = r9.A()
            com.bumptech.glide.manager.q r2 = E.e.i(r6, r8, r9, r2)
            r5.<init>((D.Z) r2)
            D.z r2 = r13.b()
            if (r2 == 0) goto L_0x00a6
            D.z r2 = r13.b()
            D.L0 r6 = r13.f340f
            D.T r6 = (D.T) r6
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r6.getClass()
            D.c r9 = D.T.f852a0
            java.lang.Object r6 = N.e.q(r6, r9, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a6
            int r2 = r13.g(r2, r3)
            int r2 = r2 % 180
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 == 0) goto L_0x00ae
            int r6 = r0.getHeight()
            goto L_0x00b2
        L_0x00ae:
            int r6 = r0.getWidth()
        L_0x00b2:
            if (r2 == 0) goto L_0x00b9
            int r2 = r0.getWidth()
            goto L_0x00bd
        L_0x00b9:
            int r2 = r0.getHeight()
        L_0x00bd:
            int r8 = r13.D()
            r9 = 2
            r10 = 35
            if (r8 != r9) goto L_0x00c8
            r8 = 1
            goto L_0x00ca
        L_0x00c8:
            r8 = 35
        L_0x00ca:
            D.L0 r11 = r13.f340f
            int r11 = r11.A()
            if (r11 != r10) goto L_0x00da
            int r11 = r13.D()
            if (r11 != r9) goto L_0x00da
            r9 = 1
            goto L_0x00db
        L_0x00da:
            r9 = 0
        L_0x00db:
            D.L0 r11 = r13.f340f
            int r11 = r11.A()
            if (r11 != r10) goto L_0x010b
            D.z r10 = r13.b()
            if (r10 == 0) goto L_0x00f3
            D.z r10 = r13.b()
            int r10 = r13.g(r10, r3)
            if (r10 != 0) goto L_0x010c
        L_0x00f3:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            D.L0 r11 = r13.f340f
            D.T r11 = (D.T) r11
            r11.getClass()
            D.c r12 = D.T.f851Z
            java.lang.Object r11 = N.e.q(r11, r12, r7)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r4 = 0
        L_0x010c:
            if (r9 != 0) goto L_0x0110
            if (r4 == 0) goto L_0x011d
        L_0x0110:
            B.j0 r7 = new B.j0
            int r4 = r5.D()
            com.bumptech.glide.manager.q r2 = E.e.i(r6, r2, r8, r4)
            r7.<init>((D.Z) r2)
        L_0x011d:
            if (r7 == 0) goto L_0x012b
            B.K r2 = r13.f148o
            java.lang.Object r4 = r2.f185l0
            monitor-enter(r4)
            r2.f175b0 = r7     // Catch:{ all -> 0x0128 }
            monitor-exit(r4)     // Catch:{ all -> 0x0128 }
            goto L_0x012b
        L_0x0128:
            r14 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0128 }
            throw r14
        L_0x012b:
            D.z r2 = r13.b()
            if (r2 == 0) goto L_0x0139
            B.K r4 = r13.f148o
            int r2 = r13.g(r2, r3)
            r4.f169V = r2
        L_0x0139:
            B.K r2 = r13.f148o
            r5.E(r2, r1)
            android.util.Size r1 = r15.f904a
            D.y0 r14 = D.y0.d(r14, r1)
            t.a r1 = r15.f907d
            if (r1 == 0) goto L_0x014d
            B.j0 r2 = r14.f959b
            r2.e(r1)
        L_0x014d:
            B.p0 r1 = r13.f152s
            if (r1 == 0) goto L_0x0154
            r1.a()
        L_0x0154:
            B.p0 r1 = new B.p0
            android.view.Surface r2 = r5.j()
            D.L0 r3 = r13.f340f
            int r3 = r3.A()
            r1.<init>(r2, r0, r3)
            r13.f152s = r1
            a0.m r0 = r1.e
            L3.b r0 = G.i.d(r0)
            B.c r1 = new B.c
            r2 = 1
            r1.<init>((java.lang.Object) r5, (int) r2, (java.lang.Object) r7)
            F.e r2 = D7.b.H()
            r0.d(r1, r2)
            android.util.Range r0 = r15.f906c
            B.j0 r1 = r14.f959b
            r1.getClass()
            D.c r2 = D.I.f787j
            java.lang.Object r1 = r1.f267X
            D.e0 r1 = (D.C0041e0) r1
            r1.e(r2, r0)
            B.p0 r0 = r13.f152s
            B.x r15 = r15.f905b
            r1 = -1
            r14.b(r0, r15, r1)
            D.z0 r15 = r13.f153t
            if (r15 == 0) goto L_0x0197
            r15.b()
        L_0x0197:
            D.z0 r15 = new D.z0
            B.C r0 = new B.C
            r1 = 0
            r0.<init>(r1, r13)
            r15.<init>(r0)
            r13.f153t = r15
            r14.f962f = r15
            return r14
        L_0x01a7:
            java.lang.ClassCastException r14 = new java.lang.ClassCastException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: B.H.C(D.T, D.i):D.y0");
    }

    public final int D() {
        T t8 = (T) this.f340f;
        t8.getClass();
        return ((Integer) e.q(t8, T.f850Y, 1)).intValue();
    }

    public final L0 e(boolean z, O0 o02) {
        f147u.getClass();
        T t8 = F.f146a;
        t8.getClass();
        K a8 = o02.a(e.c(t8), 1);
        if (z) {
            a8 = e.I(a8, t8);
        }
        if (a8 == null) {
            return null;
        }
        return new T(C0053k0.a(((E) j(a8)).f145b));
    }

    public final K0 j(K k8) {
        return new E(C0041e0.c(k8), 0);
    }

    public final void p() {
        this.f148o.f186m0 = true;
    }

    public final L0 r(C0069x xVar, K0 k02) {
        T t8 = (T) this.f340f;
        t8.getClass();
        Boolean bool = (Boolean) e.q(t8, T.f851Z, (Object) null);
        boolean h5 = xVar.k().h(OnePixelShiftQuirk.class);
        K k8 = this.f148o;
        if (bool != null) {
            h5 = bool.booleanValue();
        }
        k8.f173Z = h5;
        synchronized (this.f149p) {
        }
        return k02.b();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    public final C0048i u(C1412a aVar) {
        this.f151r.a(aVar);
        Object[] objArr = {this.f151r.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(DesugarCollections.unmodifiableList(arrayList));
        d a8 = this.f341g.a();
        a8.f735Y = aVar;
        return a8.d();
    }

    public final C0048i v(C0048i iVar, C0048i iVar2) {
        d();
        y0 C8 = C((T) this.f340f, iVar);
        this.f151r = C8;
        Object[] objArr = {C8.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(DesugarCollections.unmodifiableList(arrayList));
        return iVar;
    }

    public final void w() {
        g7.l.a();
        z0 z0Var = this.f153t;
        if (z0Var != null) {
            z0Var.b();
            this.f153t = null;
        }
        p0 p0Var = this.f152s;
        if (p0Var != null) {
            p0Var.a();
            this.f152s = null;
        }
        K k8 = this.f148o;
        k8.f186m0 = false;
        k8.c();
    }

    public final void x(Matrix matrix) {
        super.x(matrix);
        K k8 = this.f148o;
        synchronized (k8.f185l0) {
            k8.f179f0 = matrix;
            k8.f180g0 = new Matrix(k8.f179f0);
        }
    }

    public final void z(Rect rect) {
        this.i = rect;
        K k8 = this.f148o;
        synchronized (k8.f185l0) {
            k8.f177d0 = rect;
            k8.f178e0 = new Rect(k8.f177d0);
        }
    }
}
