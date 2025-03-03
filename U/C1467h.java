package u;

import A.a;
import A.e;
import A.f;
import A.h;
import B.Q;
import B.j0;
import D.C0;
import D.C0036c;
import D.C0041e0;
import D.C0045g0;
import D.C0053k0;
import D.C0064s;
import D.C0068w;
import D.H0;
import D.I;
import D.J;
import D.J0;
import D.K;
import D.L0;
import D.N;
import D.s0;
import D.x0;
import D.y0;
import D2.G;
import F.i;
import U.c;
import U.d;
import Y0.b;
import a0.j;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import androidx.lifecycle.z;
import de.ozerov.fully.C0663a0;
import g7.l;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k2.C1160q;
import t.C1412a;
import v.k;
import y.C1609a;
import y.C1610b;

/* renamed from: u.h  reason: case insensitive filesystem */
public final class C1467h implements C0068w {

    /* renamed from: U  reason: collision with root package name */
    public final C1465f f15625U;

    /* renamed from: V  reason: collision with root package name */
    public final i f15626V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f15627W = new Object();

    /* renamed from: X  reason: collision with root package name */
    public final k f15628X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1475p f15629Y;

    /* renamed from: Z  reason: collision with root package name */
    public final y0 f15630Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C1452L f15631a0;

    /* renamed from: b0  reason: collision with root package name */
    public final d f15632b0;

    /* renamed from: c0  reason: collision with root package name */
    public final a0 f15633c0;

    /* renamed from: d0  reason: collision with root package name */
    public final G f15634d0;

    /* renamed from: e0  reason: collision with root package name */
    public final e0 f15635e0;

    /* renamed from: f0  reason: collision with root package name */
    public final e f15636f0;

    /* renamed from: g0  reason: collision with root package name */
    public final q4.k f15637g0;

    /* renamed from: h0  reason: collision with root package name */
    public final C1160q f15638h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f15639i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile boolean f15640j0;

    /* renamed from: k0  reason: collision with root package name */
    public volatile int f15641k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1609a f15642l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1610b f15643m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AtomicLong f15644n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f15645o0;
    public long p0;

    /* renamed from: q0  reason: collision with root package name */
    public final c f15646q0;

    /* JADX WARNING: type inference failed for: r0v1, types: [D.x0, D.y0] */
    /* JADX WARNING: type inference failed for: r10v5, types: [D2.G, java.lang.Object] */
    public C1467h(k kVar, F.e eVar, i iVar, C1475p pVar, s0 s0Var) {
        ? x0Var = new x0();
        this.f15630Z = x0Var;
        this.f15639i0 = 0;
        this.f15640j0 = false;
        this.f15641k0 = 2;
        this.f15644n0 = new AtomicLong(0);
        this.f15645o0 = 1;
        this.p0 = 0;
        c cVar = new c();
        cVar.f5254b = new HashSet();
        cVar.f5255c = new ArrayMap();
        this.f15646q0 = cVar;
        this.f15628X = kVar;
        this.f15629Y = pVar;
        this.f15626V = iVar;
        this.f15638h0 = new C1160q(iVar);
        C1465f fVar = new C1465f(iVar);
        this.f15625U = fVar;
        x0Var.f959b.f264U = this.f15645o0;
        x0Var.f959b.d(new C1446F(fVar));
        x0Var.f959b.d(cVar);
        ? obj = new Object();
        obj.f1051U = false;
        obj.f1052V = new b(2);
        this.f15634d0 = obj;
        this.f15631a0 = new C1452L(this, iVar);
        this.f15632b0 = new d(this, kVar, iVar);
        this.f15633c0 = new a0(this, kVar, iVar);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f15635e0 = new g0(kVar);
        } else {
            this.f15635e0 = new q4.k(26);
        }
        this.f15642l0 = new C1609a(s0Var, 0);
        this.f15643m0 = new C1610b(s0Var, 0);
        this.f15636f0 = new e(this, iVar);
        this.f15637g0 = new q4.k(this, kVar, s0Var, iVar, eVar);
    }

    public static int e(k kVar, int i) {
        int[] iArr = (int[]) kVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (g(iArr, i)) {
            return i;
        }
        if (g(iArr, 1)) {
            return 1;
        }
        return 0;
    }

    public static boolean g(int[] iArr, int i) {
        for (int i8 : iArr) {
            if (i == i8) {
                return true;
            }
        }
        return false;
    }

    public final void D() {
        e eVar = this.f15636f0;
        synchronized (eVar.e) {
            eVar.f14f = new h(4);
        }
        G.i.d(com.bumptech.glide.d.i(new a(eVar, 1))).d(new C0663a0(5), D7.b.l());
    }

    public final void K(Q q7) {
    }

    public final Rect O() {
        Rect rect = (Rect) this.f15628X.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    public final void V(int i) {
        int i8;
        boolean z;
        synchronized (this.f15627W) {
            i8 = this.f15639i0;
        }
        if (i8 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            F.h.I("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f15641k0 = i;
        F.h.j("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f15641k0);
        e0 e0Var = this.f15635e0;
        boolean z6 = true;
        if (!(this.f15641k0 == 1 || this.f15641k0 == 0)) {
            z6 = false;
        }
        e0Var.b(z6);
        G.i.d(com.bumptech.glide.d.i(new androidx.camera.lifecycle.c(17, this)));
    }

    public final void a(y0 y0Var) {
        this.f15635e0.a(y0Var);
    }

    public final void b(C1466g gVar) {
        ((HashSet) this.f15625U.f15614b).add(gVar);
    }

    public final void c() {
        synchronized (this.f15627W) {
            try {
                int i = this.f15639i0;
                if (i != 0) {
                    this.f15639i0 = i - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final D.C0 d() {
        /*
            r10 = this;
            D.y0 r0 = r10.f15630Z
            int r1 = r10.f15645o0
            B.j0 r2 = r0.f959b
            r2.f264U = r1
            A.h r1 = new A.h
            r2 = 4
            r1.<init>((int) r2)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.g(r2, r4)
            u.L r2 = r10.f15631a0
            r2.getClass()
            int r4 = r2.f15523c
            r5 = 3
            if (r4 == r5) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 3
        L_0x0025:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            u.h r7 = r2.f15521a
            v.k r7 = r7.f15628X
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r7 = r7.a(r8)
            int[] r7 = (int[]) r7
            r8 = 0
            if (r7 != 0) goto L_0x0038
        L_0x0036:
            r4 = 0
            goto L_0x004e
        L_0x0038:
            boolean r9 = g(r7, r4)
            if (r9 == 0) goto L_0x003f
            goto L_0x004e
        L_0x003f:
            r4 = 4
            boolean r9 = g(r7, r4)
            if (r9 == 0) goto L_0x0047
            goto L_0x004e
        L_0x0047:
            r4 = 1
            boolean r7 = g(r7, r4)
            if (r7 == 0) goto L_0x0036
        L_0x004e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.g(r6, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f15524d
            int r6 = r4.length
            if (r6 == 0) goto L_0x005f
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r1.g(r6, r4)
        L_0x005f:
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.e
            int r6 = r4.length
            if (r6 == 0) goto L_0x0069
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.g(r6, r4)
        L_0x0069:
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.f15525f
            int r4 = r2.length
            if (r4 == 0) goto L_0x0073
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r1.g(r4, r2)
        L_0x0073:
            y.a r2 = r10.f15642l0
            java.lang.Object r2 = r2.f16325a
            android.util.Range r2 = (android.util.Range) r2
            if (r2 == 0) goto L_0x0080
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.g(r4, r2)
        L_0x0080:
            U.d r2 = r10.f15632b0
            java.lang.Object r2 = r2.f5260Y
            u.c0 r2 = (u.c0) r2
            r2.m(r1)
            u.L r2 = r10.f15631a0
            boolean r2 = r2.f15526g
            if (r2 == 0) goto L_0x0091
            r2 = 5
            goto L_0x0092
        L_0x0091:
            r2 = 1
        L_0x0092:
            boolean r4 = r10.f15640j0
            r6 = 2
            if (r4 == 0) goto L_0x00a1
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1.g(r4, r5)
            goto L_0x00a9
        L_0x00a1:
            int r4 = r10.f15641k0
            if (r4 == 0) goto L_0x00ad
            if (r4 == r3) goto L_0x00b9
            if (r4 == r6) goto L_0x00ab
        L_0x00a9:
            r5 = r2
            goto L_0x00b9
        L_0x00ab:
            r5 = 1
            goto L_0x00b9
        L_0x00ad:
            y.b r2 = r10.f15643m0
            boolean r4 = r2.f16326a
            if (r4 != 0) goto L_0x00ab
            boolean r2 = r2.f16327b
            if (r2 == 0) goto L_0x00b8
            goto L_0x00ab
        L_0x00b8:
            r5 = 2
        L_0x00b9:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            v.k r4 = r10.f15628X
            int r4 = e(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.g(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            v.k r4 = r10.f15628X
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.a(r5)
            int[] r4 = (int[]) r4
            r5 = 0
            if (r4 != 0) goto L_0x00d9
        L_0x00d7:
            r3 = 0
            goto L_0x00e6
        L_0x00d9:
            boolean r6 = g(r4, r3)
            if (r6 == 0) goto L_0x00e0
            goto L_0x00e6
        L_0x00e0:
            boolean r4 = g(r4, r3)
            if (r4 == 0) goto L_0x00d7
        L_0x00e6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.g(r2, r3)
            D2.G r2 = r10.f15634d0
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            java.lang.Object r2 = r2.f1052V
            Y0.b r2 = (Y0.b) r2
            java.lang.Object r2 = r2.f6312a
            monitor-enter(r2)
            monitor-exit(r2)     // Catch:{ all -> 0x013b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.g(r3, r2)
            A.e r2 = r10.f15636f0
            r2.a(r1)
            t.a r2 = new t.a
            D.e0 r1 = r1.f22b
            D.k0 r1 = D.C0053k0.a(r1)
            r3 = 1
            r2.<init>((int) r3, (java.lang.Object) r1)
            B.j0 r0 = r0.f959b
            r0.getClass()
            D.e0 r1 = D.C0041e0.c(r2)
            r0.f267X = r1
            D.y0 r0 = r10.f15630Z
            long r1 = r10.p0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            B.j0 r0 = r0.f959b
            java.lang.Object r0 = r0.f269Z
            D.g0 r0 = (D.C0045g0) r0
            android.util.ArrayMap r0 = r0.f785a
            java.lang.String r2 = "CameraControlSessionUpdateId"
            r0.put(r2, r1)
            D.y0 r0 = r10.f15630Z
            D.C0 r0 = r0.c()
            return r0
        L_0x013b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1467h.d():D.C0");
    }

    public final K f() {
        f fVar;
        e eVar = this.f15636f0;
        synchronized (eVar.e) {
            h hVar = (h) eVar.f14f;
            hVar.getClass();
            fVar = new f(1, (Object) C0053k0.a(hVar.f22b));
        }
        return fVar;
    }

    public final void h(boolean z) {
        H.b bVar;
        F.h.j("Camera2CameraControlImp", "setActive: isActive = " + z);
        C1452L l8 = this.f15631a0;
        if (z != l8.f15522b) {
            l8.f15522b = z;
            if (!l8.f15522b) {
                C1467h hVar = l8.f15521a;
                ((HashSet) hVar.f15625U.f15614b).remove((Object) null);
                ((HashSet) hVar.f15625U.f15614b).remove((Object) null);
                if (l8.f15524d.length > 0 && l8.f15522b) {
                    j0 j0Var = new j0();
                    j0Var.f265V = true;
                    j0Var.f264U = l8.f15523c;
                    C0041e0 b8 = C0041e0.b();
                    b8.e(C1412a.i0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    j0Var.e(new f(1, (Object) C0053k0.a(b8)));
                    l8.f15521a.i(Collections.singletonList(j0Var.f()));
                }
                MeteringRectangle[] meteringRectangleArr = C1452L.f15520h;
                l8.f15524d = meteringRectangleArr;
                l8.e = meteringRectangleArr;
                l8.f15525f = meteringRectangleArr;
                hVar.k();
            }
        }
        d dVar = this.f15632b0;
        if (dVar.f5256U != z) {
            dVar.f5256U = z;
            if (!z) {
                synchronized (((d0) dVar.f5259X)) {
                    ((d0) dVar.f5259X).e();
                    d0 d0Var = (d0) dVar.f5259X;
                    bVar = new H.b(d0Var.d(), d0Var.b(), d0Var.c(), d0Var.a());
                }
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                z zVar = (z) dVar.f5258W;
                if (myLooper == mainLooper) {
                    zVar.j(bVar);
                } else {
                    zVar.k(bVar);
                }
                ((c0) dVar.f5260Y).C();
                ((C1467h) dVar.f5257V).k();
            }
        }
        a0 a0Var = this.f15633c0;
        if (a0Var.f15592c != z) {
            a0Var.f15592c = z;
            if (!z) {
                if (a0Var.e) {
                    a0Var.e = false;
                    C1467h hVar2 = a0Var.f15590a;
                    hVar2.f15640j0 = false;
                    j0 j0Var2 = new j0();
                    j0Var2.f264U = hVar2.f15645o0;
                    j0Var2.f265V = true;
                    C0041e0 b9 = C0041e0.b();
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                    b9.e(C1412a.i0(key), Integer.valueOf(e(hVar2.f15628X, 1)));
                    b9.e(C1412a.i0(CaptureRequest.FLASH_MODE), 0);
                    j0Var2.e(new f(1, (Object) C0053k0.a(b9)));
                    hVar2.i(Collections.singletonList(j0Var2.f()));
                    hVar2.k();
                    z zVar2 = a0Var.f15591b;
                    if (l.h()) {
                        zVar2.j(0);
                    } else {
                        zVar2.k(0);
                    }
                }
                j jVar = a0Var.f15593d;
                if (jVar != null) {
                    jVar.b(new Exception("Camera is not active."));
                    a0Var.f15593d = null;
                }
            }
        }
        this.f15634d0.k(z);
        e eVar = this.f15636f0;
        eVar.getClass();
        ((i) eVar.f13d).execute(new A.b(eVar, z, 0));
        if (!z) {
            ((AtomicInteger) this.f15638h0.f13026V).set(0);
            F.h.j("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
        }
    }

    public final void i(List list) {
        C0064s sVar;
        int b8;
        int a8;
        C0064s sVar2;
        C1475p pVar = this.f15629Y;
        pVar.getClass();
        list.getClass();
        C1479t tVar = pVar.f15675a;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I i = (I) it.next();
            HashSet hashSet = new HashSet();
            C0041e0.b();
            ArrayList arrayList2 = new ArrayList();
            C0045g0.a();
            hashSet.addAll(i.f788a);
            C0041e0 c8 = C0041e0.c(i.f789b);
            arrayList2.addAll(i.f791d);
            ArrayMap arrayMap = new ArrayMap();
            H0 h02 = i.f792f;
            for (String str : h02.f785a.keySet()) {
                arrayMap.put(str, h02.f785a.get(str));
            }
            H0 h03 = new H0(arrayMap);
            if (i.f790c != 5 || (sVar2 = i.f793g) == null) {
                sVar = null;
            } else {
                sVar = sVar2;
            }
            if (DesugarCollections.unmodifiableList(i.f788a).isEmpty() && i.e) {
                if (!hashSet.isEmpty()) {
                    F.h.I("Camera2CameraImpl", "The capture config builder already has surface inside.");
                } else {
                    A1.d dVar = tVar.f15686U;
                    dVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) dVar.f36W).entrySet()) {
                        J0 j02 = (J0) entry.getValue();
                        if (j02.f804f && j02.e) {
                            arrayList3.add(((J0) entry.getValue()).f800a);
                        }
                    }
                    for (C0 c02 : DesugarCollections.unmodifiableCollection(arrayList3)) {
                        I i8 = c02.f752g;
                        List<N> unmodifiableList = DesugarCollections.unmodifiableList(i8.f788a);
                        if (!unmodifiableList.isEmpty()) {
                            if (!(i8.a() == 0 || (a8 = i8.a()) == 0)) {
                                c8.e(L0.f808B, Integer.valueOf(a8));
                            }
                            if (!(i8.b() == 0 || (b8 = i8.b()) == 0)) {
                                c8.e(L0.f809C, Integer.valueOf(b8));
                            }
                            for (N add : unmodifiableList) {
                                hashSet.add(add);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        F.h.I("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C0053k0 a9 = C0053k0.a(c8);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            H0 h04 = H0.f784b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = h03.f785a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new I(arrayList4, a9, i.f790c, arrayList5, i.e, new H0(arrayMap2), sVar));
        }
        tVar.u("Issue capture request", (Throwable) null);
        tVar.f15697f0.i(arrayList);
    }

    public final void j(K k8) {
        e eVar = this.f15636f0;
        f c8 = h.e(k8).c();
        synchronized (eVar.e) {
            h hVar = (h) eVar.f14f;
            hVar.getClass();
            J j7 = J.f798W;
            for (C0036c cVar : c8.J()) {
                hVar.f22b.d(cVar, j7, c8.b0(cVar));
            }
        }
        G.i.d(com.bumptech.glide.d.i(new a(eVar, 0))).d(new C0663a0(5), D7.b.l());
    }

    public final long k() {
        this.p0 = this.f15644n0.getAndIncrement();
        this.f15629Y.f15675a.L();
        return this.p0;
    }
}
