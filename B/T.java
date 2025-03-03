package B;

import B3.q;
import C.f;
import C7.d;
import D.C0036c;
import D.C0039d0;
import D.C0041e0;
import D.C0048i;
import D.C0053k0;
import D.C0069x;
import D.C0071z;
import D.K;
import D.K0;
import D.L0;
import D.O0;
import D.U;
import D.V;
import D.X;
import D.y0;
import D.z0;
import F.h;
import H.i;
import N.e;
import android.util.Log;
import android.util.Pair;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import g7.l;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n2.a;
import t.C1412a;

public final class T extends v0 {

    /* renamed from: x  reason: collision with root package name */
    public static final P f195x = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final int f196o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicReference f197p = new AtomicReference((Object) null);

    /* renamed from: q  reason: collision with root package name */
    public final int f198q = -1;

    /* renamed from: r  reason: collision with root package name */
    public final i f199r;

    /* renamed from: s  reason: collision with root package name */
    public y0 f200s;

    /* renamed from: t  reason: collision with root package name */
    public q f201t;

    /* renamed from: u  reason: collision with root package name */
    public f f202u;

    /* renamed from: v  reason: collision with root package name */
    public z0 f203v;

    /* renamed from: w  reason: collision with root package name */
    public final Z f204w = new Object();

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, B.Z] */
    public T(U u3) {
        super(u3);
        U u8 = (U) this.f340f;
        C0036c cVar = U.f854V;
        u8.getClass();
        if (((C0053k0) u8.x()).q0(cVar)) {
            this.f196o = ((Integer) e.p(u8, cVar)).intValue();
        } else {
            this.f196o = 1;
        }
        ((Integer) ((C0053k0) u8.x()).o0(U.f860b0, 0)).getClass();
        this.f199r = new i((Q) ((C0053k0) u8.x()).o0(U.f861c0, (Object) null));
    }

    public static boolean F(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void C(boolean z) {
        f fVar;
        Log.d("ImageCapture", "clearPipeline");
        l.a();
        z0 z0Var = this.f203v;
        if (z0Var != null) {
            z0Var.b();
            this.f203v = null;
        }
        q qVar = this.f201t;
        if (qVar != null) {
            qVar.r();
            this.f201t = null;
        }
        if (!z && (fVar = this.f202u) != null) {
            fVar.b();
            this.f202u = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: A.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: B.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: A.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: A.f} */
    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, B3.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D.y0 D(java.lang.String r19, D.U r20, D.C0048i r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r3 = 4
            r4 = 0
            r6 = 0
            r7 = 1
            g7.l.a()
            java.lang.String r8 = "ImageCapture"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "createPipeline(cameraId: "
            r9.<init>(r10)
            r10 = r19
            r9.append(r10)
            java.lang.String r10 = ", streamSpec: "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = ")"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r8, r9)
            android.util.Size r8 = r2.f904a
            D.z r9 = r18.b()
            j$.util.Objects.requireNonNull(r9)
            boolean r9 = r9.j()
            r14 = r9 ^ 1
            B3.q r10 = r1.f201t
            if (r10 == 0) goto L_0x004a
            n2.a.m(r4, r14)
            B3.q r10 = r1.f201t
            r10.r()
        L_0x004a:
            D.L0 r10 = r1.f340f
            D.c r11 = D.U.f862d0
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Object r10 = r10.o0(r11, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0069
            D.z r10 = r18.b()
            D.t r10 = r10.n()
            A.f r10 = (A.f) r10
            r10.V()
        L_0x0069:
            B3.q r15 = new B3.q
            r15.<init>()
            g7.l.a()
            r15.f449U = r0
            D.c r10 = D.L0.f813v
            java.lang.Object r10 = r0.o0(r10, r4)
            u.y r10 = (u.C1484y) r10
            if (r10 == 0) goto L_0x029a
            B.j0 r11 = new B.j0
            r11.<init>()
            r10.a(r0, r11)
            r11.f()
            A1.d r13 = new A1.d
            r13.<init>((int) r3, (boolean) r6)
            r15.f450V = r13
            com.bumptech.glide.manager.q r12 = new com.bumptech.glide.manager.q
            F.g r10 = D7.b.z()
            D.c r11 = H.h.f1790D
            D.K r16 = r20.x()
            r6 = r16
            D.k0 r6 = (D.C0053k0) r6
            java.lang.Object r6 = r6.o0(r11, r10)
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            j$.util.Objects.requireNonNull(r6)
            r12.<init>((java.util.concurrent.Executor) r6)
            r15.f451W = r12
            int r6 = r20.A()
            D.c r10 = D.U.f856X
            D.K r11 = r20.x()
            D.k0 r11 = (D.C0053k0) r11
            java.lang.Object r10 = r11.o0(r10, r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x00c8
            int r10 = r10.intValue()
            r16 = r10
            goto L_0x00e7
        L_0x00c8:
            D.c r10 = D.V.f864g
            D.K r11 = r20.x()
            D.k0 r11 = (D.C0053k0) r11
            java.lang.Object r10 = r11.o0(r10, r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x00e3
            int r10 = r10.intValue()
            r11 = 4101(0x1005, float:5.747E-42)
            if (r10 != r11) goto L_0x00e3
            r16 = 4101(0x1005, float:5.747E-42)
            goto L_0x00e7
        L_0x00e3:
            r10 = 256(0x100, float:3.59E-43)
            r16 = 256(0x100, float:3.59E-43)
        L_0x00e7:
            D.c r10 = D.U.f858Z
            D.K r0 = r20.x()
            D.k0 r0 = (D.C0053k0) r0
            java.lang.Object r0 = r0.o0(r10, r4)
            if (r0 != 0) goto L_0x0294
            C.a r0 = new C.a
            M.d r4 = new M.d
            r4.<init>()
            M.d r11 = new M.d
            r11.<init>()
            r10 = r0
            r19 = r11
            r11 = r8
            r17 = r12
            r12 = r6
            r5 = r13
            r13 = r16
            r3 = r15
            r15 = r4
            r16 = r19
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.f452X = r0
            java.lang.Object r10 = r5.f36W
            C.a r10 = (C.a) r10
            if (r10 != 0) goto L_0x0122
            java.lang.Object r10 = r5.f35V
            B.j0 r10 = (B.j0) r10
            if (r10 != 0) goto L_0x0122
            r10 = 1
            goto L_0x0123
        L_0x0122:
            r10 = 0
        L_0x0123:
            java.lang.String r11 = "CaptureNode does not support recreation yet."
            n2.a.m(r11, r10)
            r5.f36W = r0
            B.a0 r10 = new B.a0
            r10.<init>(r7, r5)
            if (r9 == 0) goto L_0x0185
            B.b0 r9 = new B.b0
            int r11 = r8.getWidth()
            int r12 = r8.getHeight()
            r13 = 4
            r9.<init>(r11, r12, r6, r13)
            B.a0 r11 = r9.f217V
            r12 = 2
            D.l[] r13 = new D.C0054l[r12]
            r12 = 0
            r13[r12] = r10
            r13[r7] = r11
            java.util.List r10 = java.util.Arrays.asList(r13)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0154
            goto L_0x017e
        L_0x0154:
            int r11 = r10.size()
            if (r11 != r7) goto L_0x0161
            java.lang.Object r10 = r10.get(r12)
            D.l r10 = (D.C0054l) r10
            goto L_0x017e
        L_0x0161:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x016a:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x017e
            java.lang.Object r12 = r10.next()
            D.l r12 = (D.C0054l) r12
            boolean r13 = r12 instanceof D.C0058n
            if (r13 != 0) goto L_0x016a
            r11.add(r12)
            goto L_0x016a
        L_0x017e:
            C.c r10 = new C.c
            r11 = 0
            r10.<init>(r5, r11)
            goto L_0x019d
        L_0x0185:
            A.f r9 = new A.f
            int r10 = r8.getWidth()
            int r11 = r8.getHeight()
            r12 = 4
            com.bumptech.glide.manager.q r10 = E.e.i(r10, r11, r6, r12)
            r11 = 7
            r9.<init>((int) r11, (java.lang.Object) r10)
            C.c r10 = new C.c
            r10.<init>(r5, r7)
        L_0x019d:
            android.view.Surface r11 = r9.j()
            j$.util.Objects.requireNonNull(r11)
            B.p0 r12 = r0.f475a
            if (r12 != 0) goto L_0x01aa
            r12 = 1
            goto L_0x01ab
        L_0x01aa:
            r12 = 0
        L_0x01ab:
            java.lang.String r13 = "The surface is already set."
            n2.a.m(r13, r12)
            B.p0 r12 = new B.p0
            r12.<init>(r11, r8, r6)
            r0.f475a = r12
            B.j0 r0 = new B.j0
            r0.<init>((D.Z) r9)
            r5.f35V = r0
            B.B r0 = new B.B
            r6 = 2
            r0.<init>(r6, r5)
            F.e r6 = D7.b.H()
            r9.E(r0, r6)
            r4.f2731b = r10
            C.d r0 = new C.d
            r4 = 0
            r0.<init>(r4, r5)
            r5 = r19
            r5.f2731b = r0
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            r5 = r17
            java.lang.Object r5 = r5.f9082X
            D.s0 r5 = (D.s0) r5
            D.o0 r0 = r5.j(r0)
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r0
            r1.f201t = r3
            C.f r0 = r1.f202u
            if (r0 != 0) goto L_0x01f4
            C.f r0 = new C.f
            B.Z r3 = r1.f204w
            r0.<init>(r3)
            r1.f202u = r0
        L_0x01f4:
            C.f r0 = r1.f202u
            B3.q r3 = r1.f201t
            r0.getClass()
            g7.l.a()
            r0.f488V = r3
            r3.getClass()
            g7.l.a()
            java.lang.Object r3 = r3.f450V
            A1.d r3 = (A1.d) r3
            r3.getClass()
            g7.l.a()
            java.lang.Object r5 = r3.f35V
            B.j0 r5 = (B.j0) r5
            if (r5 == 0) goto L_0x0218
            r6 = 1
            goto L_0x0219
        L_0x0218:
            r6 = 0
        L_0x0219:
            java.lang.String r4 = "The ImageReader is not initialized."
            n2.a.m(r4, r6)
            java.lang.Object r3 = r3.f35V
            B.j0 r3 = (B.j0) r3
            java.lang.Object r4 = r3.f266W
            monitor-enter(r4)
            r3.f269Z = r0     // Catch:{ all -> 0x0291 }
            monitor-exit(r4)     // Catch:{ all -> 0x0291 }
            B3.q r0 = r1.f201t
            android.util.Size r3 = r2.f904a
            java.lang.Object r4 = r0.f449U
            D.U r4 = (D.U) r4
            D.y0 r3 = D.y0.d(r4, r3)
            java.lang.Object r0 = r0.f452X
            C.a r0 = (C.a) r0
            B.p0 r4 = r0.f475a
            j$.util.Objects.requireNonNull(r4)
            B.x r5 = B.C0022x.f360d
            C7.d r4 = D.C0044g.a(r4)
            r4.f736Z = r5
            D.g r4 = r4.b()
            java.util.LinkedHashSet r5 = r3.f958a
            r5.add(r4)
            B.p0 r0 = r0.f476b
            if (r0 == 0) goto L_0x025c
            C7.d r0 = D.C0044g.a(r0)
            D.g r0 = r0.b()
            r3.f964h = r0
        L_0x025c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L_0x0272
            int r0 = r1.f196o
            r4 = 2
            if (r0 != r4) goto L_0x0272
            boolean r0 = r2.e
            if (r0 != 0) goto L_0x0272
            D.w r0 = r18.c()
            r0.a(r3)
        L_0x0272:
            t.a r0 = r2.f907d
            if (r0 == 0) goto L_0x027b
            B.j0 r2 = r3.f959b
            r2.e(r0)
        L_0x027b:
            D.z0 r0 = r1.f203v
            if (r0 == 0) goto L_0x0282
            r0.b()
        L_0x0282:
            D.z0 r0 = new D.z0
            B.C r2 = new B.C
            r2.<init>(r7, r1)
            r0.<init>(r2)
            r1.f203v = r0
            r3.f962f = r0
            return r3
        L_0x0291:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0291 }
            throw r0
        L_0x0294:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x029a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Implementation is missing option unpacker for "
            r3.<init>(r4)
            java.lang.String r4 = r20.toString()
            java.lang.String r0 = N.e.j(r0, r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B.T.D(java.lang.String, D.U, D.i):D.y0");
    }

    public final int E() {
        int i;
        synchronized (this.f197p) {
            i = this.f198q;
            if (i == -1) {
                U u3 = (U) this.f340f;
                u3.getClass();
                i = ((Integer) e.q(u3, U.f855W, 2)).intValue();
            }
        }
        return i;
    }

    public final L0 e(boolean z, O0 o02) {
        f195x.getClass();
        U u3 = P.f194a;
        u3.getClass();
        K a8 = o02.a(e.c(u3), this.f196o);
        if (z) {
            a8 = e.I(a8, u3);
        }
        if (a8 == null) {
            return null;
        }
        return new U(C0053k0.a(((E) j(a8)).f145b));
    }

    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final K0 j(K k8) {
        return new E(C0041e0.c(k8), 1);
    }

    public final void p() {
        int i;
        a.l(b(), "Attached camera cannot be null");
        if (E() == 3) {
            C0071z b8 = b();
            if (b8 != null) {
                i = b8.a().d();
            } else {
                i = -1;
            }
            if (i != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final void q() {
        h.j("ImageCapture", "onCameraControlReady");
        synchronized (this.f197p) {
            try {
                if (this.f197p.get() == null) {
                    c().V(E());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        c().K(this.f199r);
    }

    public final L0 r(C0069x xVar, K0 k02) {
        Object obj;
        Object obj2;
        Object obj3;
        if (xVar.k().h(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            C0039d0 a8 = k02.a();
            C0036c cVar = U.f859a0;
            Object obj4 = Boolean.TRUE;
            C0053k0 k0Var = (C0053k0) a8;
            k0Var.getClass();
            try {
                obj4 = k0Var.b0(cVar);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(obj4)) {
                h.I("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                String G8 = h.G("ImageCapture");
                if (h.u(4, G8)) {
                    Log.i(G8, "Requesting software JPEG due to device quirk.");
                }
                ((C0041e0) k02.a()).e(U.f859a0, Boolean.TRUE);
            }
        }
        C0039d0 a9 = k02.a();
        Boolean bool2 = Boolean.TRUE;
        C0036c cVar2 = U.f859a0;
        Object obj5 = Boolean.FALSE;
        C0053k0 k0Var2 = (C0053k0) a9;
        k0Var2.getClass();
        try {
            obj5 = k0Var2.b0(cVar2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z = false;
        if (equals) {
            if (b() != null) {
                ((A.f) b().n()).V();
            }
            try {
                obj3 = k0Var2.b0(U.f856X);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                h.I("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                h.I("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((C0041e0) a9).e(U.f859a0, Boolean.FALSE);
            }
        }
        C0039d0 a10 = k02.a();
        C0036c cVar3 = U.f856X;
        C0053k0 k0Var3 = (C0053k0) a10;
        k0Var3.getClass();
        try {
            obj = k0Var3.b0(cVar3);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int i = 35;
        if (num2 != null) {
            if (b() != null) {
                ((A.f) b().n()).V();
            }
            C0039d0 a11 = k02.a();
            C0036c cVar4 = V.f864g;
            if (!z) {
                i = num2.intValue();
            }
            ((C0041e0) a11).e(cVar4, Integer.valueOf(i));
        } else {
            C0039d0 a12 = k02.a();
            C0036c cVar5 = U.f857Y;
            C0053k0 k0Var4 = (C0053k0) a12;
            k0Var4.getClass();
            try {
                obj2 = k0Var4.b0(cVar5);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((C0041e0) k02.a()).e(V.f864g, 4101);
                ((C0041e0) k02.a()).e(V.f865h, C0022x.f359c);
            } else if (z) {
                ((C0041e0) k02.a()).e(V.f864g, 35);
            } else {
                C0039d0 a13 = k02.a();
                C0036c cVar6 = X.f873p;
                C0053k0 k0Var5 = (C0053k0) a13;
                k0Var5.getClass();
                try {
                    obj6 = k0Var5.b0(cVar6);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((C0041e0) k02.a()).e(V.f864g, 256);
                } else if (F(256, list)) {
                    ((C0041e0) k02.a()).e(V.f864g, 256);
                } else if (F(35, list)) {
                    ((C0041e0) k02.a()).e(V.f864g, 35);
                }
            }
        }
        return k02.b();
    }

    public final void t() {
        i iVar = this.f199r;
        iVar.b();
        iVar.a();
        f fVar = this.f202u;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    public final C0048i u(C1412a aVar) {
        this.f200s.a(aVar);
        Object[] objArr = {this.f200s.c()};
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
        y0 D8 = D(d(), (U) this.f340f, iVar);
        this.f200s = D8;
        Object[] objArr = {D8.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(DesugarCollections.unmodifiableList(arrayList));
        m();
        return iVar;
    }

    public final void w() {
        i iVar = this.f199r;
        iVar.b();
        iVar.a();
        f fVar = this.f202u;
        if (fVar != null) {
            fVar.b();
        }
        C(false);
        c().K((Q) null);
    }
}
