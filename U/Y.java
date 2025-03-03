package u;

import B.C0003d;
import D.M;
import D.N;
import D.s0;
import D2.G;
import D2.k;
import F.e;
import F.h;
import F.i;
import G.d;
import G.g;
import K.b;
import a0.j;
import a0.m;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.C1160q;
import n2.a;
import w.v;
import y.C1609a;

public final class Y extends U {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15568a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final C1455O f15569b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f15570c;

    /* renamed from: d  reason: collision with root package name */
    public final i f15571d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public C1448H f15572f;

    /* renamed from: g  reason: collision with root package name */
    public C1160q f15573g;

    /* renamed from: h  reason: collision with root package name */
    public m f15574h;
    public j i;

    /* renamed from: j  reason: collision with root package name */
    public d f15575j;

    /* renamed from: k  reason: collision with root package name */
    public List f15576k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15577l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15578m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15579n;

    /* renamed from: o  reason: collision with root package name */
    public final e f15580o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f15581p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f15582q;

    /* renamed from: r  reason: collision with root package name */
    public G.m f15583r;

    /* renamed from: s  reason: collision with root package name */
    public final k f15584s;

    /* renamed from: t  reason: collision with root package name */
    public final C1609a f15585t;

    /* renamed from: u  reason: collision with root package name */
    public final G f15586u;

    /* renamed from: v  reason: collision with root package name */
    public final b f15587v;

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f15588w;

    /* JADX WARNING: type inference failed for: r4v3, types: [D2.k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, K.b] */
    public Y(s0 s0Var, s0 s0Var2, C1455O o2, i iVar, e eVar, Handler handler) {
        boolean z = false;
        this.f15577l = false;
        this.f15578m = false;
        this.f15579n = false;
        this.f15569b = o2;
        this.f15570c = handler;
        this.f15571d = iVar;
        this.e = eVar;
        this.f15581p = new Object();
        this.f15588w = new AtomicBoolean(false);
        ? obj = new Object();
        obj.f1095a = s0Var2.h(TextureViewIsClosedQuirk.class);
        obj.f1096b = s0Var.h(PreviewOrientationIncorrectQuirk.class);
        obj.f1097c = s0Var.h(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f15584s = obj;
        this.f15586u = new G((s0Var.h(CaptureSessionStuckQuirk.class) || s0Var.h(IncorrectCaptureStateQuirk.class)) ? true : z);
        this.f15585t = new C1609a(s0Var2, 3);
        ? obj2 = new Object();
        obj2.f2535a = s0Var2.h(Preview3AThreadCrashQuirk.class);
        this.f15587v = obj2;
        this.f15580o = eVar;
    }

    public final void a(Y y8) {
        Objects.requireNonNull(this.f15572f);
        this.f15572f.a(y8);
    }

    public final void b(Y y8) {
        Objects.requireNonNull(this.f15572f);
        this.f15572f.b(y8);
    }

    public final void c(Y y8) {
        synchronized (this.f15581p) {
            this.f15584s.c(this.f15582q);
        }
        l("onClosed()");
        o(y8);
    }

    public final void d(Y y8) {
        Y y9;
        Objects.requireNonNull(this.f15572f);
        q();
        this.f15586u.l();
        C1455O o2 = this.f15569b;
        Iterator it = o2.i().iterator();
        while (it.hasNext() && (y9 = (Y) it.next()) != this) {
            y9.q();
            y9.f15586u.l();
        }
        synchronized (o2.f15530b) {
            ((LinkedHashSet) o2.e).remove(this);
        }
        this.f15572f.d(y8);
    }

    public final void e(Y y8) {
        Y y9;
        Y y10;
        Y y11;
        l("Session onConfigured()");
        C1609a aVar = this.f15585t;
        ArrayList g8 = this.f15569b.g();
        ArrayList f8 = this.f15569b.f();
        if (((CaptureSessionOnClosedNotCalledQuirk) aVar.f16325a) != null) {
            LinkedHashSet<Y> linkedHashSet = new LinkedHashSet<>();
            Iterator it = g8.iterator();
            while (it.hasNext() && (y11 = (Y) it.next()) != y8) {
                linkedHashSet.add(y11);
            }
            for (Y y12 : linkedHashSet) {
                y12.getClass();
                y12.d(y12);
            }
        }
        Objects.requireNonNull(this.f15572f);
        C1455O o2 = this.f15569b;
        synchronized (o2.f15530b) {
            ((LinkedHashSet) o2.f15531c).add(this);
            ((LinkedHashSet) o2.e).remove(this);
        }
        Iterator it2 = o2.i().iterator();
        while (it2.hasNext() && (y10 = (Y) it2.next()) != this) {
            y10.q();
            y10.f15586u.l();
        }
        this.f15572f.e(y8);
        if (((CaptureSessionOnClosedNotCalledQuirk) aVar.f16325a) != null) {
            LinkedHashSet<Y> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it3 = f8.iterator();
            while (it3.hasNext() && (y9 = (Y) it3.next()) != y8) {
                linkedHashSet2.add(y9);
            }
            for (Y y13 : linkedHashSet2) {
                y13.getClass();
                y13.c(y13);
            }
        }
    }

    public final void f(Y y8) {
        Objects.requireNonNull(this.f15572f);
        this.f15572f.f(y8);
    }

    public final void g(Y y8) {
        m mVar;
        synchronized (this.f15568a) {
            try {
                if (!this.f15579n) {
                    this.f15579n = true;
                    a.l(this.f15574h, "Need to call openCaptureSession before using this API.");
                    mVar = this.f15574h;
                } else {
                    mVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (mVar != null) {
            mVar.f7017V.d(new V(this, y8, 1), D7.b.l());
        }
    }

    public final void h(Y y8, Surface surface) {
        Objects.requireNonNull(this.f15572f);
        this.f15572f.h(y8, surface);
    }

    public final int i(ArrayList arrayList, C1465f fVar) {
        CameraCaptureSession.CaptureCallback e8 = this.f15586u.e(fVar);
        a.l(this.f15573g, "Need to call openCaptureSession before using this API.");
        return ((v.i) this.f15573g.f13026V).a(arrayList, this.f15571d, e8);
    }

    public final void j() {
        if (!this.f15588w.compareAndSet(false, true)) {
            l("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f15587v.f2535a) {
            try {
                l("Call abortCaptures() before closing session.");
                a.l(this.f15573g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((v.i) this.f15573g.f13026V).f15852V).abortCaptures();
            } catch (Exception e8) {
                l("Exception when calling abortCaptures()" + e8);
            }
        }
        l("Session call close()");
        this.f15586u.g().d(new W(this, 1), this.f15571d);
    }

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f15573g == null) {
            this.f15573g = new C1160q(cameraCaptureSession, this.f15570c);
        }
    }

    public final void l(String str) {
        h.j("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final void m(List list) {
        synchronized (this.f15568a) {
            q();
            if (!list.isEmpty()) {
                int i8 = 0;
                do {
                    try {
                        ((N) list.get(i8)).d();
                        i8++;
                    } catch (M e8) {
                        for (int i9 = i8 - 1; i9 >= 0; i9--) {
                            ((N) list.get(i9)).b();
                        }
                        throw e8;
                    }
                } while (i8 < list.size());
            }
            this.f15576k = list;
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.f15568a) {
            if (this.f15574h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void o(Y y8) {
        m mVar;
        synchronized (this.f15568a) {
            try {
                if (!this.f15577l) {
                    this.f15577l = true;
                    a.l(this.f15574h, "Need to call openCaptureSession before using this API.");
                    mVar = this.f15574h;
                } else {
                    mVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        q();
        this.f15586u.l();
        if (mVar != null) {
            mVar.f7017V.d(new V(this, y8, 0), D7.b.l());
        }
    }

    public final L3.b p(CameraDevice cameraDevice, v vVar, List list) {
        L3.b d8;
        synchronized (this.f15581p) {
            try {
                ArrayList f8 = this.f15569b.f();
                ArrayList arrayList = new ArrayList();
                Iterator it = f8.iterator();
                while (it.hasNext()) {
                    Y y8 = (Y) it.next();
                    arrayList.add(com.bumptech.glide.d.i(new g(y8.f15586u.g(), y8.f15580o, 1500)));
                }
                G.m mVar = new G.m(new ArrayList(arrayList), false, D7.b.l());
                this.f15583r = mVar;
                d a8 = d.a(mVar);
                X x8 = new X(this, cameraDevice, vVar, list);
                i iVar = this.f15571d;
                a8.getClass();
                d8 = G.i.d(G.i.f(a8, x8, iVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return d8;
    }

    public final void q() {
        synchronized (this.f15568a) {
            try {
                List<N> list = this.f15576k;
                if (list != null) {
                    for (N b8 : list) {
                        b8.b();
                    }
                    this.f15576k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int r(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback e8 = this.f15586u.e(captureCallback);
        a.l(this.f15573g, "Need to call openCaptureSession before using this API.");
        return ((v.i) this.f15573g.f13026V).i(captureRequest, this.f15571d, e8);
    }

    public final L3.b s(ArrayList arrayList) {
        L3.b t8;
        synchronized (this.f15581p) {
            this.f15582q = arrayList;
            t8 = t(arrayList);
        }
        return t8;
    }

    public final L3.b t(ArrayList arrayList) {
        synchronized (this.f15568a) {
            try {
                if (this.f15578m) {
                    G.k kVar = new G.k(1, new CancellationException("Opener is disabled"));
                    return kVar;
                }
                d a8 = d.a(C0003d.M(arrayList, this.f15571d, this.e));
                A.g gVar = new A.g(this, 18, arrayList);
                i iVar = this.f15571d;
                a8.getClass();
                G.b f8 = G.i.f(a8, gVar, iVar);
                this.f15575j = f8;
                L3.b d8 = G.i.d(f8);
                return d8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u() {
        boolean v4;
        synchronized (this.f15581p) {
            try {
                if (n()) {
                    this.f15584s.c(this.f15582q);
                } else {
                    G.m mVar = this.f15583r;
                    if (mVar != null) {
                        mVar.cancel(true);
                    }
                }
                v4 = v();
            } catch (Throwable th) {
                throw th;
            }
        }
        return v4;
    }

    public final boolean v() {
        boolean z;
        d dVar = null;
        try {
            synchronized (this.f15568a) {
                if (!this.f15578m) {
                    d dVar2 = this.f15575j;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    this.f15578m = true;
                }
                z = !n();
            }
            if (dVar != null) {
                dVar.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.cancel(true);
            }
            throw th;
        }
    }

    public final void w() {
        a.l(this.f15573g, "Need to call openCaptureSession before using this API.");
        ((CameraCaptureSession) ((v.i) this.f15573g.f13026V).f15852V).stopRepeating();
    }

    public final C1160q x() {
        this.f15573g.getClass();
        return this.f15573g;
    }
}
