package u;

import A.f;
import A1.d;
import B.C0005f;
import B.C0011l;
import B.C0022x;
import B.f0;
import B.p0;
import B.v0;
import D.B0;
import D.C0;
import D.C0032a;
import D.C0036c;
import D.C0037c0;
import D.C0048i;
import D.C0049i0;
import D.C0050j;
import D.C0051j0;
import D.C0053k0;
import D.C0054l;
import D.C0065t;
import D.C0067v;
import D.C0068w;
import D.C0069x;
import D.C0070y;
import D.C0071z;
import D.D;
import D.E;
import D.I;
import D.J0;
import D.L0;
import D.N;
import D.N0;
import D.s0;
import F.e;
import F.h;
import F.i;
import K1.k;
import L3.b;
import N.g;
import a0.m;
import a1.C0412c;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.lifecycle.z;
import com.bumptech.glide.c;
import de.ozerov.fully.K2;
import de.ozerov.fully.M2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k2.C1160q;
import n2.a;
import v.C1502a;
import v.r;
import x.C1594a;
import y.C1613e;

/* renamed from: u.t  reason: case insensitive filesystem */
public final class C1479t implements C0071z {

    /* renamed from: A0  reason: collision with root package name */
    public final K2 f15684A0;

    /* renamed from: B0  reason: collision with root package name */
    public volatile int f15685B0 = 3;

    /* renamed from: U  reason: collision with root package name */
    public final d f15686U;

    /* renamed from: V  reason: collision with root package name */
    public final r f15687V;

    /* renamed from: W  reason: collision with root package name */
    public final i f15688W;

    /* renamed from: X  reason: collision with root package name */
    public final e f15689X;

    /* renamed from: Y  reason: collision with root package name */
    public final d f15690Y;

    /* renamed from: Z  reason: collision with root package name */
    public final K2 f15691Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C1467h f15692a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C1478s f15693b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C1481v f15694c0;

    /* renamed from: d0  reason: collision with root package name */
    public CameraDevice f15695d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f15696e0;

    /* renamed from: f0  reason: collision with root package name */
    public C1449I f15697f0;

    /* renamed from: g0  reason: collision with root package name */
    public final LinkedHashMap f15698g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f15699h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1474o f15700i0;

    /* renamed from: j0  reason: collision with root package name */
    public final k f15701j0;

    /* renamed from: k0  reason: collision with root package name */
    public final E f15702k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f15703l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f15704m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f15705n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f15706o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public C1455O f15707q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C1455O f15708r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C1455O f15709s0;

    /* renamed from: t0  reason: collision with root package name */
    public final HashSet f15710t0;

    /* renamed from: u0  reason: collision with root package name */
    public f f15711u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Object f15712v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f15713w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C1450J f15714x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C1160q f15715y0;

    /* renamed from: z0  reason: collision with root package name */
    public final C1459T f15716z0;

    /* JADX WARNING: type inference failed for: r12v2, types: [u.O, java.lang.Object] */
    public C1479t(Context context, r rVar, String str, C1481v vVar, k kVar, E e, Executor executor, Handler handler, C1450J j7, long j8) {
        r rVar2 = rVar;
        String str2 = str;
        C1481v vVar2 = vVar;
        E e8 = e;
        d dVar = new d(6);
        this.f15690Y = dVar;
        this.f15696e0 = 0;
        new AtomicInteger(0);
        this.f15698g0 = new LinkedHashMap();
        this.f15699h0 = 0;
        this.f15705n0 = false;
        this.f15706o0 = false;
        this.p0 = true;
        this.f15710t0 = new HashSet();
        this.f15711u0 = C0067v.f954a;
        this.f15712v0 = new Object();
        this.f15713w0 = false;
        this.f15684A0 = new K2(this);
        this.f15687V = rVar2;
        this.f15701j0 = kVar;
        this.f15702k0 = e8;
        e eVar = new e(handler);
        this.f15689X = eVar;
        i iVar = new i(executor);
        this.f15688W = iVar;
        C1478s sVar = r1;
        C1478s sVar2 = new C1478s(this, iVar, eVar, j8);
        this.f15693b0 = sVar;
        this.f15686U = new d(str2);
        ((z) dVar.f35V).k(new C0037c0(C0070y.f967X));
        K2 k22 = new K2(e8);
        this.f15691Z = k22;
        ? obj = new Object();
        obj.f15530b = new Object();
        obj.f15531c = new LinkedHashSet();
        obj.f15532d = new LinkedHashSet();
        obj.e = new LinkedHashSet();
        obj.f15533f = new C1444D((C1455O) obj);
        obj.f15529a = iVar;
        this.f15708r0 = obj;
        this.f15714x0 = j7;
        try {
            v.k b8 = rVar.b(str);
            i iVar2 = iVar;
            i iVar3 = iVar;
            C1467h hVar = r1;
            C1467h hVar2 = new C1467h(b8, eVar, iVar2, new C1475p(this), vVar2.f15726h);
            this.f15692a0 = hVar;
            this.f15694c0 = vVar2;
            vVar2.a(hVar);
            vVar2.f15724f.l((z) k22.f10051W);
            this.f15715y0 = C1160q.G(b8);
            this.f15697f0 = A();
            i iVar4 = iVar3;
            this.f15709s0 = new C1455O(iVar4, eVar, handler, obj, vVar2.f15726h, C1594a.f16229a);
            this.f15703l0 = vVar2.f15726h.h(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f15704m0 = vVar2.f15726h.h(LegacyCameraSurfaceCleanupQuirk.class);
            C1474o oVar = new C1474o(this, str2);
            this.f15700i0 = oVar;
            C1475p pVar = new C1475p(this);
            synchronized (e8.f759b) {
                a.m("Camera is already registered: " + this, !e8.e.containsKey(this));
                e8.e.put(this, new D(iVar4, pVar, oVar));
            }
            rVar2.f15868a.g(iVar4, oVar);
            this.f15716z0 = new C1459T(context, str2, rVar2, new q4.k(23));
        } catch (C1502a e9) {
            throw new Exception(e9);
        }
    }

    public static String w(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i == 4) {
            return "ERROR_CAMERA_DEVICE";
        }
        if (i != 5) {
            return "UNKNOWN ERROR";
        }
        return "ERROR_CAMERA_SERVICE";
    }

    public static String x(C1455O o2) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        o2.getClass();
        sb.append(o2.hashCode());
        return sb.toString();
    }

    public static String y(v0 v0Var) {
        return v0Var.f() + v0Var.hashCode();
    }

    public final C1449I A() {
        C1449I i;
        synchronized (this.f15712v0) {
            i = new C1449I(this.f15715y0, this.f15694c0.f15726h);
        }
        return i;
    }

    public final void B(boolean z) {
        if (!z) {
            this.f15693b0.e.f5607b = -1;
        }
        this.f15693b0.a();
        this.f15684A0.o();
        u("Opening camera.", (Throwable) null);
        F(8);
        try {
            r rVar = this.f15687V;
            rVar.f15868a.f(this.f15694c0.f15720a, this.f15688W, t());
        } catch (C1502a e) {
            u("Unable to open camera due to " + e.getMessage(), (Throwable) null);
            if (e.f15830U != 10001) {
                K2 k22 = this.f15684A0;
                if (((C1479t) k22.f10051W).f15685B0 != 8) {
                    ((C1479t) k22.f10051W).u("Don't need the onError timeout handler.", (Throwable) null);
                    return;
                }
                ((C1479t) k22.f10051W).u("Camera waiting for onError.", (Throwable) null);
                k22.o();
                k22.f10050V = new d4.k(k22);
                return;
            }
            G(3, new C0005f(e, 7), true);
        } catch (SecurityException e8) {
            u("Unable to open camera due to " + e8.getMessage(), (Throwable) null);
            F(7);
            this.f15693b0.b();
        }
    }

    public final void C() {
        boolean z;
        if (this.f15685B0 == 9) {
            z = true;
        } else {
            z = false;
        }
        a.m((String) null, z);
        B0 u3 = this.f15686U.u();
        if (!u3.f743k || !u3.f742j) {
            u("Unable to create capture session due to conflicting configurations", (Throwable) null);
        } else if (!this.f15702k0.e(this.f15695d0.getId(), this.f15701j0.f(this.f15695d0.getId()))) {
            u("Unable to create capture session in camera operating mode = " + this.f15701j0.f2580U, (Throwable) null);
        } else {
            HashMap hashMap = new HashMap();
            Collection<C0> v4 = this.f15686U.v();
            Collection w2 = this.f15686U.w();
            C0036c cVar = C1457Q.f15534a;
            ArrayList arrayList = new ArrayList(w2);
            Iterator it = v4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0 c02 = (C0) it.next();
                C0053k0 k0Var = c02.f752g.f789b;
                C0036c cVar2 = C1457Q.f15534a;
                if (k0Var.f920U.containsKey(cVar2) && c02.b().size() != 1) {
                    h.l("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", new Object[]{Integer.valueOf(c02.b().size())}));
                    break;
                } else if (c02.f752g.f789b.f920U.containsKey(cVar2)) {
                    int i = 0;
                    for (C0 c03 : v4) {
                        if (((L0) arrayList.get(i)).k() == N0.f835Z) {
                            a.m("MeteringRepeating should contain a surface", !c03.b().isEmpty());
                            hashMap.put((N) c03.b().get(0), 1L);
                        } else if (c03.f752g.f789b.f920U.containsKey(cVar2) && !c03.b().isEmpty()) {
                            hashMap.put((N) c03.b().get(0), (Long) c03.f752g.f789b.b0(cVar2));
                        }
                        i++;
                    }
                }
            }
            C1449I i8 = this.f15697f0;
            synchronized (i8.f15498a) {
                i8.f15507l = hashMap;
            }
            C1449I i9 = this.f15697f0;
            C0 b8 = u3.b();
            CameraDevice cameraDevice = this.f15695d0;
            cameraDevice.getClass();
            C1455O o2 = this.f15709s0;
            C1455O o8 = (C1455O) o2.f15532d;
            i iVar = (i) o2.f15529a;
            b k8 = i9.k(b8, cameraDevice, new Y((s0) o2.e, (s0) o2.f15533f, o8, iVar, (e) o2.f15530b, (Handler) o2.f15531c));
            C1473n nVar = new C1473n(this, i9, 1);
            k8.d(new G.h(k8, 0, nVar), this.f15688W);
        }
    }

    public final void D() {
        if (this.f15707q0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.f15707q0.getClass();
            sb.append(this.f15707q0.hashCode());
            String sb2 = sb.toString();
            d dVar = this.f15686U;
            LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.f36W;
            if (linkedHashMap.containsKey(sb2)) {
                J0 j02 = (J0) linkedHashMap.get(sb2);
                j02.e = false;
                if (!j02.f804f) {
                    linkedHashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.f15707q0.getClass();
            sb3.append(this.f15707q0.hashCode());
            String sb4 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.f36W;
            if (linkedHashMap2.containsKey(sb4)) {
                J0 j03 = (J0) linkedHashMap2.get(sb4);
                j03.f804f = false;
                if (!j03.e) {
                    linkedHashMap2.remove(sb4);
                }
            }
            C1455O o2 = this.f15707q0;
            o2.getClass();
            h.j("MeteringRepeating", "MeteringRepeating clear!");
            p0 p0Var = (p0) o2.f15529a;
            if (p0Var != null) {
                p0Var.a();
            }
            o2.f15529a = null;
            this.f15707q0 = null;
        }
    }

    public final void E() {
        boolean z;
        C0 c02;
        if (this.f15697f0 != null) {
            z = true;
        } else {
            z = false;
        }
        a.m((String) null, z);
        u("Resetting Capture Session", (Throwable) null);
        C1449I i = this.f15697f0;
        synchronized (i.f15498a) {
            c02 = i.f15502f;
        }
        List d8 = i.d();
        C1449I A8 = A();
        this.f15697f0 = A8;
        A8.m(c02);
        this.f15697f0.i(d8);
        if (C1477r.h(this.f15685B0) != 8) {
            u("Skipping Capture Session state check due to current camera state: " + C1477r.i(this.f15685B0) + " and previous session status: " + i.g(), (Throwable) null);
        } else if (this.f15703l0 && i.g()) {
            u("Close camera before creating new session", (Throwable) null);
            F(6);
        }
        if (this.f15704m0 && i.g()) {
            u("ConfigAndClose is required when close the camera.", (Throwable) null);
            this.f15705n0 = true;
        }
        i.a();
        b l8 = i.l();
        u("Releasing session in state ".concat(C1477r.g(this.f15685B0)), (Throwable) null);
        this.f15698g0.put(i, l8);
        C1473n nVar = new C1473n(this, i, 0);
        l8.d(new G.h(l8, 0, nVar), D7.b.l());
    }

    public final void F(int i) {
        G(i, (C0005f) null, true);
    }

    public final void G(int i, C0005f fVar, boolean z) {
        C0070y yVar;
        C0070y yVar2;
        D d8;
        String f8;
        int i8;
        HashMap hashMap = null;
        u("Transitioning camera internal state: " + C1477r.i(this.f15685B0) + " --> " + C1477r.i(i), (Throwable) null);
        boolean z6 = false;
        if (h.t()) {
            h.B(C1477r.h(i), "CX:C2State[" + this + "]");
            if (fVar != null) {
                this.f15699h0++;
            }
            if (this.f15699h0 > 0) {
                String str = "CX:C2StateErrorCode[" + this + "]";
                if (fVar != null) {
                    i8 = fVar.f235a;
                } else {
                    i8 = 0;
                }
                h.B(i8, str);
            }
        }
        this.f15685B0 = i;
        switch (C1477r.h(i)) {
            case 0:
                yVar = C0070y.f965V;
                break;
            case 1:
                yVar = C0070y.f966W;
                break;
            case 2:
                yVar = C0070y.f967X;
                break;
            case 3:
                yVar = C0070y.f968Y;
                break;
            case 4:
            case 5:
                yVar = C0070y.f969Z;
                break;
            case 6:
            case 7:
                yVar = C0070y.f970a0;
                break;
            case 8:
                yVar = C0070y.f971b0;
                break;
            case 9:
                yVar = C0070y.f972c0;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(C1477r.i(i)));
        }
        E e = this.f15702k0;
        synchronized (e.f759b) {
            try {
                int i9 = e.f762f;
                if (yVar == C0070y.f965V) {
                    D d9 = (D) e.e.remove(this);
                    if (d9 != null) {
                        e.b();
                        yVar2 = d9.f754a;
                    } else {
                        yVar2 = null;
                    }
                } else {
                    D d10 = (D) e.e.get(this);
                    a.l(d10, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    C0070y yVar3 = d10.f754a;
                    d10.f754a = yVar;
                    C0070y yVar4 = C0070y.f970a0;
                    if (yVar == yVar4) {
                        if (yVar.f974U || yVar3 == yVar4) {
                            z6 = true;
                        }
                        a.m("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z6);
                    }
                    if (yVar3 != yVar) {
                        E.c(this, yVar);
                        e.b();
                    }
                    yVar2 = yVar3;
                }
                if (yVar2 != yVar) {
                    if (e.f761d.f2580U == 2 && yVar == C0070y.f972c0 && (f8 = e.f761d.f(l().e())) != null) {
                        d8 = e.a(f8);
                    } else {
                        d8 = null;
                    }
                    if (i9 < 1 && e.f762f > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : e.e.entrySet()) {
                            if (((D) entry.getValue()).f754a == C0070y.f968Y) {
                                hashMap.put((C0011l) entry.getKey(), (D) entry.getValue());
                            }
                        }
                    } else if (yVar == C0070y.f968Y && e.f762f > 0) {
                        hashMap = new HashMap();
                        hashMap.put(this, (D) e.e.get(this));
                    }
                    if (hashMap != null && !z) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                        for (D d11 : hashMap.values()) {
                            d11.getClass();
                            try {
                                d11.f755b.execute(new A.d(9, d11.f757d));
                            } catch (RejectedExecutionException e8) {
                                h.m("CameraStateRegistry", "Unable to notify camera to open.", e8);
                            }
                        }
                    }
                    if (d8 != null) {
                        try {
                            d8.f755b.execute(new A.d(10, d8.f756c));
                        } catch (RejectedExecutionException e9) {
                            h.m("CameraStateRegistry", "Unable to notify camera to configure.", e9);
                        }
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        ((z) this.f15690Y.f35V).k(new C0037c0(yVar));
        this.f15691Z.X(yVar, fVar);
    }

    public final ArrayList H(ArrayList arrayList) {
        C0 c02;
        Size size;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            boolean z = this.p0;
            String y8 = y(v0Var);
            Class<?> cls = v0Var.getClass();
            if (z) {
                c02 = v0Var.f346m;
            } else {
                c02 = v0Var.f347n;
            }
            C0 c03 = c02;
            L0 l02 = v0Var.f340f;
            C0048i iVar = v0Var.f341g;
            if (iVar != null) {
                size = iVar.f904a;
            } else {
                size = null;
            }
            if (v0Var.b() == null) {
                arrayList2 = null;
            } else {
                arrayList2 = Q.d.G(v0Var);
            }
            arrayList3.add(new C1461b(y8, cls, c03, l02, size, iVar, arrayList2));
        }
        return arrayList3;
    }

    public final void I(ArrayList arrayList) {
        boolean z;
        Size size;
        boolean isEmpty = this.f15686U.v().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C1461b bVar = (C1461b) it.next();
            if (!this.f15686U.F(bVar.f15594a)) {
                d dVar = this.f15686U;
                String str = bVar.f15594a;
                C0 c02 = bVar.f15596c;
                L0 l02 = bVar.f15597d;
                C0048i iVar = bVar.f15598f;
                ArrayList arrayList3 = bVar.f15599g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.f36W;
                J0 j02 = (J0) linkedHashMap.get(str);
                if (j02 == null) {
                    j02 = new J0(c02, l02, iVar, arrayList3);
                    linkedHashMap.put(str, j02);
                }
                j02.e = true;
                dVar.L(str, c02, l02, iVar, arrayList3);
                arrayList2.add(bVar.f15594a);
                if (bVar.f15595b == f0.class && (size = bVar.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            u("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", (Throwable) null);
            if (isEmpty) {
                this.f15692a0.h(true);
                C1467h hVar = this.f15692a0;
                synchronized (hVar.f15627W) {
                    hVar.f15639i0++;
                }
            }
            q();
            M();
            L();
            E();
            if (this.f15685B0 == 9) {
                C();
            } else {
                int h5 = C1477r.h(this.f15685B0);
                if (h5 == 2 || h5 == 3) {
                    J(false);
                } else if (h5 != 4) {
                    u("open() ignored due to being in state: ".concat(C1477r.i(this.f15685B0)), (Throwable) null);
                } else {
                    F(7);
                    if (!this.f15698g0.isEmpty() && !this.f15706o0 && this.f15696e0 == 0) {
                        if (this.f15695d0 == null) {
                            z = false;
                        }
                        a.m("Camera Device should be open if session close is not complete", z);
                        F(9);
                        C();
                    }
                }
            }
            if (rational != null) {
                this.f15692a0.f15631a0.getClass();
            }
        }
    }

    public final void J(boolean z) {
        u("Attempting to force open the camera.", (Throwable) null);
        if (!this.f15702k0.d(this)) {
            u("No cameras available. Waiting for available camera before opening camera.", (Throwable) null);
            F(4);
            return;
        }
        B(z);
    }

    public final void K(boolean z) {
        u("Attempting to open the camera.", (Throwable) null);
        if (!this.f15700i0.f15673b || !this.f15702k0.d(this)) {
            u("No cameras available. Waiting for available camera before opening camera.", (Throwable) null);
            F(4);
            return;
        }
        B(z);
    }

    public final void L() {
        boolean z;
        d dVar = this.f15686U;
        dVar.getClass();
        B0 b02 = new B0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) dVar.f36W).entrySet()) {
            J0 j02 = (J0) entry.getValue();
            if (j02.f804f && j02.e) {
                b02.a(j02.f800a);
                arrayList.add((String) entry.getKey());
            }
        }
        h.j("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) dVar.f35V));
        if (!b02.f743k || !b02.f742j) {
            z = false;
        } else {
            z = true;
        }
        C1467h hVar = this.f15692a0;
        if (z) {
            int i = b02.b().f752g.f790c;
            hVar.f15645o0 = i;
            hVar.f15631a0.f15523c = i;
            hVar.f15637g0.getClass();
            b02.a(hVar.d());
            this.f15697f0.m(b02.b());
            return;
        }
        hVar.f15645o0 = 1;
        hVar.f15631a0.f15523c = 1;
        hVar.f15637g0.getClass();
        this.f15697f0.m(hVar.d());
    }

    public final void M() {
        boolean z = false;
        for (L0 e02 : this.f15686U.w()) {
            z |= e02.e0();
        }
        this.f15692a0.f15635e0.c(z);
    }

    public final C0069x a() {
        return l();
    }

    public final C0049i0 b() {
        return this.f15690Y;
    }

    public final void c(v0 v0Var) {
        C0 c02;
        ArrayList G8;
        v0Var.getClass();
        String y8 = y(v0Var);
        if (this.p0) {
            c02 = v0Var.f346m;
        } else {
            c02 = v0Var.f347n;
        }
        C0 c03 = c02;
        L0 l02 = v0Var.f340f;
        C0048i iVar = v0Var.f341g;
        if (v0Var.b() == null) {
            G8 = null;
        } else {
            G8 = Q.d.G(v0Var);
        }
        this.f15688W.execute(new C1471l(this, y8, c03, l02, iVar, G8, 1));
    }

    public final void d(boolean z) {
        this.f15688W.execute(new A.b(this, z, 6));
    }

    public final void e(v0 v0Var) {
        v0Var.getClass();
        this.f15688W.execute(new C0412c((Object) this, 22, (Object) y(v0Var)));
    }

    public final boolean f() {
        if (((C1481v) a()).d() == 0) {
            return true;
        }
        return false;
    }

    public final void g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(H(arrayList2));
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                v0 v0Var = (v0) it.next();
                String y8 = y(v0Var);
                HashSet hashSet = this.f15710t0;
                if (hashSet.contains(y8)) {
                    v0Var.t();
                    hashSet.remove(y8);
                }
            }
            this.f15688W.execute(new C1470k(this, arrayList3, 0));
        }
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            C1467h hVar = this.f15692a0;
            synchronized (hVar.f15627W) {
                hVar.f15639i0++;
            }
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                v0 v0Var = (v0) it.next();
                String y8 = y(v0Var);
                HashSet hashSet = this.f15710t0;
                if (!hashSet.contains(y8)) {
                    hashSet.add(y8);
                    v0Var.s();
                    v0Var.q();
                }
            }
            try {
                this.f15688W.execute(new C1470k(this, new ArrayList(H(arrayList2)), 1));
            } catch (RejectedExecutionException e) {
                u("Unable to attach use cases.", e);
                hVar.c();
            }
        }
    }

    public final void i(v0 v0Var) {
        C0 c02;
        ArrayList G8;
        String y8 = y(v0Var);
        if (this.p0) {
            c02 = v0Var.f346m;
        } else {
            c02 = v0Var.f347n;
        }
        C0 c03 = c02;
        L0 l02 = v0Var.f340f;
        C0048i iVar = v0Var.f341g;
        if (v0Var.b() == null) {
            G8 = null;
        } else {
            G8 = Q.d.G(v0Var);
        }
        this.f15688W.execute(new C1471l(this, y8, c03, l02, iVar, G8, 0));
    }

    public final /* synthetic */ boolean j() {
        return true;
    }

    public final void k(boolean z) {
        this.p0 = z;
    }

    public final C0069x l() {
        return this.f15694c0;
    }

    public final C0068w m() {
        return this.f15692a0;
    }

    public final C0065t n() {
        return this.f15711u0;
    }

    public final void o(f fVar) {
        if (fVar == null) {
            fVar = C0067v.f954a;
        }
        fVar.V();
        this.f15711u0 = fVar;
        synchronized (this.f15712v0) {
        }
    }

    public final void p(v0 v0Var) {
        C0 c02;
        ArrayList G8;
        v0Var.getClass();
        if (this.p0) {
            c02 = v0Var.f346m;
        } else {
            c02 = v0Var.f347n;
        }
        C0 c03 = c02;
        L0 l02 = v0Var.f340f;
        C0048i iVar = v0Var.f341g;
        if (v0Var.b() == null) {
            G8 = null;
        } else {
            G8 = Q.d.G(v0Var);
        }
        this.f15688W.execute(new g(this, y(v0Var), c03, l02, iVar, G8, 1));
    }

    /* JADX WARNING: type inference failed for: r1v25, types: [u.O, java.lang.Object] */
    public final void q() {
        Size size;
        d dVar = this.f15686U;
        C0 b8 = dVar.u().b();
        I i = b8.f752g;
        int size2 = DesugarCollections.unmodifiableList(i.f788a).size();
        int size3 = b8.b().size();
        if (b8.b().isEmpty()) {
            return;
        }
        if (DesugarCollections.unmodifiableList(i.f788a).isEmpty()) {
            if (this.f15707q0 == null) {
                v.k kVar = this.f15694c0.f15721b;
                C1469j jVar = new C1469j(this, 2);
                C1450J j7 = this.f15714x0;
                ? obj = new Object();
                C1613e eVar = new C1613e();
                Size size4 = null;
                obj.f15533f = null;
                obj.f15531c = new C1454N();
                obj.e = jVar;
                Size[] B12 = kVar.b().B1(34);
                if (B12 == null) {
                    h.l("MeteringRepeating", "Can not get output size list.");
                    size = new Size(0, 0);
                } else {
                    if (eVar.f16332a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                        ArrayList arrayList = new ArrayList();
                        for (Size size5 : B12) {
                            if (C1613e.f16331c.compare(size5, C1613e.f16330b) >= 0) {
                                arrayList.add(size5);
                            }
                        }
                        B12 = (Size[]) arrayList.toArray(new Size[0]);
                    }
                    List asList = Arrays.asList(B12);
                    Collections.sort(asList, new C0051j0(27));
                    Size e = j7.e();
                    long min = Math.min(((long) e.getWidth()) * ((long) e.getHeight()), 307200);
                    int length = B12.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        Size size6 = B12[i8];
                        Size size7 = size4;
                        Size size8 = size6;
                        int i9 = ((((long) size6.getWidth()) * ((long) size6.getHeight())) > min ? 1 : ((((long) size6.getWidth()) * ((long) size6.getHeight())) == min ? 0 : -1));
                        if (i9 == 0) {
                            size = size8;
                            break;
                        } else if (i9 <= 0) {
                            i8++;
                            size4 = size8;
                        } else if (size7 != null) {
                            size = size7;
                        }
                    }
                    size = (Size) asList.get(0);
                }
                obj.f15532d = size;
                h.j("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
                obj.f15530b = obj.d();
                this.f15707q0 = obj;
            }
            if (z()) {
                C1455O o2 = this.f15707q0;
                if (o2 != null) {
                    String x8 = x(o2);
                    C1455O o8 = this.f15707q0;
                    C0 c02 = (C0) o8.f15530b;
                    N0 n02 = N0.f835Z;
                    List singletonList = Collections.singletonList(n02);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.f36W;
                    J0 j02 = (J0) linkedHashMap.get(x8);
                    C1454N n4 = (C1454N) o8.f15531c;
                    if (j02 == null) {
                        j02 = new J0(c02, n4, (C0048i) null, singletonList);
                        linkedHashMap.put(x8, j02);
                    }
                    j02.e = true;
                    dVar.L(x8, c02, n4, (C0048i) null, singletonList);
                    C1455O o9 = this.f15707q0;
                    C0 c03 = (C0) o9.f15530b;
                    List singletonList2 = Collections.singletonList(n02);
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.f36W;
                    J0 j03 = (J0) linkedHashMap2.get(x8);
                    if (j03 == null) {
                        j03 = new J0(c03, (C1454N) o9.f15531c, (C0048i) null, singletonList2);
                        linkedHashMap2.put(x8, j03);
                    }
                    j03.f804f = true;
                    return;
                }
                return;
            }
            h.l("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
        } else if (size3 == 1 && size2 == 1) {
            D();
        } else if (size2 >= 2) {
            D();
        } else if (this.f15707q0 == null || z()) {
            h.j("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size3 + ", CaptureConfig Surfaces: " + size2);
        } else {
            D();
        }
    }

    public final void r() {
        boolean z;
        ArrayList<I> arrayList;
        int i;
        if (this.f15685B0 == 5 || this.f15685B0 == 2 || (this.f15685B0 == 7 && this.f15696e0 != 0)) {
            z = true;
        } else {
            z = false;
        }
        a.m("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + C1477r.i(this.f15685B0) + " (error: " + w(this.f15696e0) + ")", z);
        E();
        C1449I i8 = this.f15697f0;
        synchronized (i8.f15498a) {
            try {
                if (!i8.f15499b.isEmpty()) {
                    arrayList = new ArrayList<>(i8.f15499b);
                    i8.f15499b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (arrayList != null) {
            for (I i9 : arrayList) {
                for (C0054l lVar : i9.f791d) {
                    Object obj = i9.f792f.f785a.get("CAPTURE_CONFIG_ID_KEY");
                    if (obj == null) {
                        i = -1;
                    } else {
                        i = ((Integer) obj).intValue();
                    }
                    lVar.a(i);
                }
            }
        }
    }

    public final void s() {
        boolean z;
        if (this.f15685B0 == 2 || this.f15685B0 == 5) {
            z = true;
        } else {
            z = false;
        }
        a.m((String) null, z);
        a.m((String) null, this.f15698g0.isEmpty());
        if (!this.f15705n0) {
            v();
        } else if (this.f15706o0) {
            u("Ignored since configAndClose is processing", (Throwable) null);
        } else if (!this.f15700i0.f15673b) {
            this.f15705n0 = false;
            v();
            u("Ignore configAndClose and finish the close flow directly since camera is unavailable.", (Throwable) null);
        } else {
            u("Open camera to configAndClose", (Throwable) null);
            m i = com.bumptech.glide.d.i(new C1469j(this, 1));
            this.f15706o0 = true;
            i.f7017V.d(new M2(13, (Object) this), this.f15688W);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.f15686U.u().b().f749c);
        arrayList.add((C1444D) this.f15708r0.f15533f);
        arrayList.add(this.f15693b0);
        return c.g(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f15694c0.f15720a});
    }

    public final void u(String str, Throwable th) {
        String str2 = "{" + toString() + "} " + str;
        String G8 = h.G("Camera2CameraImpl");
        if (h.u(3, G8)) {
            Log.d(G8, str2, th);
        }
    }

    public final void v() {
        boolean z;
        if (this.f15685B0 == 2 || this.f15685B0 == 5) {
            z = true;
        } else {
            z = false;
        }
        a.m((String) null, z);
        a.m((String) null, this.f15698g0.isEmpty());
        this.f15695d0 = null;
        if (this.f15685B0 == 5) {
            F(3);
            return;
        }
        r rVar = this.f15687V;
        rVar.f15868a.k(this.f15700i0);
        F(1);
    }

    public final boolean z() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f15712v0) {
            try {
                if (this.f15701j0.f2580U == 2) {
                    i = 1;
                } else {
                    i = 0;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        d dVar = this.f15686U;
        dVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) dVar.f36W).entrySet()) {
            if (((J0) entry.getValue()).e) {
                arrayList2.add((J0) entry.getValue());
            }
        }
        for (J0 j02 : DesugarCollections.unmodifiableCollection(arrayList2)) {
            List list = j02.f803d;
            if (list == null || list.get(0) != N0.f835Z) {
                if (j02.f802c == null || j02.f803d == null) {
                    h.I("Camera2CameraImpl", "Invalid stream spec or capture types in " + j02);
                    return false;
                }
                C0 c02 = j02.f800a;
                L0 l02 = j02.f801b;
                for (N n4 : c02.b()) {
                    C1459T t8 = this.f15716z0;
                    int A8 = l02.A();
                    C0050j b8 = C0050j.b(i, A8, n4.f828h, t8.i(A8));
                    int A9 = l02.A();
                    Size size = n4.f828h;
                    C0048i iVar = j02.f802c;
                    C0022x xVar = iVar.f905b;
                    List list2 = j02.f803d;
                    C0032a aVar = r13;
                    C0032a aVar2 = new C0032a(b8, A9, size, xVar, list2, iVar.f907d, l02.y());
                    arrayList.add(aVar);
                }
            }
        }
        this.f15707q0.getClass();
        HashMap hashMap = new HashMap();
        C1455O o2 = this.f15707q0;
        hashMap.put((C1454N) o2.f15531c, Collections.singletonList((Size) o2.f15532d));
        try {
            this.f15716z0.g(i, arrayList, hashMap, false, false);
            u("Surface combination with metering repeating supported!", (Throwable) null);
            return true;
        } catch (IllegalArgumentException e) {
            u("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }
}
