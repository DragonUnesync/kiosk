package N5;

import B.B;
import B.C0017s;
import B.E;
import B.H;
import B.e0;
import B.f0;
import B.v0;
import D.C0053k0;
import D.C0059n0;
import D.T;
import D.W;
import D.X;
import G.b;
import P.a;
import P.c;
import Q0.g;
import U.h;
import U.i;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.FaceDetector;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.d;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.A;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.t;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import d4.k;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.motiondetector.MotionDetectorServiceX;
import j0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q.C1349b;

public final class p {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ int f3429K = 0;

    /* renamed from: A  reason: collision with root package name */
    public H f3430A;

    /* renamed from: B  reason: collision with root package name */
    public final o f3431B;

    /* renamed from: C  reason: collision with root package name */
    public LifecycleCamera f3432C;

    /* renamed from: D  reason: collision with root package name */
    public Bitmap f3433D;

    /* renamed from: E  reason: collision with root package name */
    public int f3434E;

    /* renamed from: F  reason: collision with root package name */
    public volatile int f3435F = -1;

    /* renamed from: G  reason: collision with root package name */
    public final c f3436G = new c();

    /* renamed from: H  reason: collision with root package name */
    public final f f3437H = new f(1, this);

    /* renamed from: I  reason: collision with root package name */
    public long f3438I = 0;

    /* renamed from: J  reason: collision with root package name */
    public Handler f3439J = null;

    /* renamed from: a  reason: collision with root package name */
    public final Service f3440a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3441b;

    /* renamed from: c  reason: collision with root package name */
    public int f3442c;

    /* renamed from: d  reason: collision with root package name */
    public int f3443d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3444f;

    /* renamed from: g  reason: collision with root package name */
    public int f3445g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3446h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3447j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3448k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3449l;

    /* renamed from: m  reason: collision with root package name */
    public String f3450m;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicBoolean f3451n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    public final AtomicInteger f3452o = new AtomicInteger(0);

    /* renamed from: p  reason: collision with root package name */
    public volatile long f3453p = 0;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f3454q = 0;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f3455r = 0;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f3456s = 0;

    /* renamed from: t  reason: collision with root package name */
    public b f3457t;

    /* renamed from: u  reason: collision with root package name */
    public d f3458u;

    /* renamed from: v  reason: collision with root package name */
    public final b f3459v;

    /* renamed from: w  reason: collision with root package name */
    public final f0 f3460w;

    /* renamed from: x  reason: collision with root package name */
    public final C0767r3 f3461x;

    /* renamed from: y  reason: collision with root package name */
    public final PreviewView f3462y;
    public final TextView z;

    /* JADX WARNING: type inference failed for: r2v11, types: [B.v0, B.f0] */
    public p(MotionDetectorServiceX motionDetectorServiceX) {
        this.f3440a = motionDetectorServiceX;
        this.f3441b = new k((Context) motionDetectorServiceX, 1);
        this.f3459v = new b();
        View inflate = ((LayoutInflater) motionDetectorServiceX.getSystemService("layout_inflater")).inflate(2131558438, (ViewGroup) null);
        PreviewView previewView = (PreviewView) inflate.findViewById(2131361924);
        this.f3462y = previewView;
        previewView.setImplementationMode(h.COMPATIBLE);
        previewView.setScaleType(i.FIT_END);
        E e8 = new E(2);
        P.b bVar = new P.b(a.f3681a, (c) null, new l(this));
        e8.f145b.e(X.f874q, bVar);
        C0059n0 n0Var = new C0059n0(C0053k0.a(e8.f145b));
        W.e(n0Var);
        ? v0Var = new v0(n0Var);
        v0Var.f240p = f0.f238w;
        this.f3460w = v0Var;
        this.z = (TextView) inflate.findViewById(2131362081);
        C0767r3 r3Var = new C0767r3(motionDetectorServiceX);
        this.f3461x = r3Var;
        r3Var.h(inflate);
        r3Var.f10920j = 8388693;
        r3Var.f10916d = true;
        r3Var.e = true;
        r3Var.f10921k = true;
        r3Var.f10918g = -2;
        r3Var.f10919h = -2;
        r3Var.f10926p = "cameraPreview";
        this.f3431B = new o(this, motionDetectorServiceX);
    }

    public static ArrayList c(Bitmap bitmap, int i8) {
        Bitmap bitmap2;
        System.currentTimeMillis();
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.RGB_565;
        if (config != config2) {
            Bitmap copy = bitmap.copy(config2, false);
            if (copy == null) {
                Log.w("p", "Failed to convert camera capture to RGB_565 for face detection");
                return new ArrayList();
            }
            bitmap2 = n2.a.Y(copy, i8);
        } else {
            bitmap2 = n2.a.Y(bitmap, i8);
        }
        FaceDetector.Face[] faceArr = new FaceDetector.Face[3];
        int findFaces = new FaceDetector(bitmap2.getWidth(), bitmap2.getHeight(), 3).findFaces(bitmap2, faceArr);
        bitmap2.recycle();
        System.currentTimeMillis();
        return new ArrayList(Arrays.asList(faceArr).subList(0, findFaces));
    }

    public final void a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new n(this));
        C0017s sVar = new C0017s(linkedHashSet);
        E e8 = new E(0);
        P.b bVar = new P.b(a.f3681a, (c) null, new l(this));
        e8.f145b.e(X.f874q, bVar);
        e8.f145b.e(T.f847V, 0);
        T t8 = new T(C0053k0.a(e8.f145b));
        W.e(t8);
        H h5 = new H(t8);
        this.f3430A = h5;
        Executor d8 = f.d(this.f3440a);
        l lVar = new l(this);
        synchronized (h5.f149p) {
            try {
                h5.f148o.i(d8, new B(0, lVar));
                if (h5.f150q == null) {
                    h5.m();
                }
                h5.f150q = lVar;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f3431B.enable();
        this.f3458u.f();
        try {
            LifecycleCamera c8 = this.f3458u.c(this.f3459v, sVar, this.f3430A, this.f3460w);
            this.f3432C = c8;
            x b8 = c8.f7658W.f1786j0.f846a.b();
            b bVar2 = this.f3459v;
            b8.getClass();
            x.a("removeObservers");
            Iterator it = b8.f8169b.iterator();
            while (true) {
                C1349b bVar3 = (C1349b) it;
                if (bVar3.hasNext()) {
                    Map.Entry entry = (Map.Entry) bVar3.next();
                    if (((w) entry.getValue()).d(bVar2)) {
                        b8.i((A) entry.getKey());
                    }
                } else {
                    this.f3432C.f7658W.f1786j0.f846a.b().e(this.f3459v, new m(0, this));
                    b bVar4 = this.f3459v;
                    C0486m mVar = C0486m.f8148X;
                    t tVar = bVar4.f3367U;
                    tVar.c("markState");
                    tVar.c("setCurrentState");
                    tVar.e(mVar);
                    return;
                }
            }
        } catch (Exception e9) {
            g.x(e9, new StringBuilder("Camera failed to start due to "), "p");
            n2.a.b1(this.f3440a, "Failed to start the camera. Stopping...");
            f();
        }
    }

    public final void b(String str) {
        if (this.f3454q == 0 || System.currentTimeMillis() >= this.f3454q + 1000) {
            this.f3454q = System.currentTimeMillis();
            try {
                Intent intent = new Intent();
                intent.setAction("com.fullykiosk.singleapp.action.motion_detected");
                intent.putExtra("type", str);
                L0.c.a(this.f3440a).c(intent);
            } catch (Exception unused) {
                Log.e("p", "Failed broadcasting motion intent");
            }
        }
    }

    public final synchronized void d() {
        this.f3461x.e();
    }

    public final void e() {
        int i8;
        int i9;
        String str;
        this.f3442c = this.f3441b.v1();
        int u12 = this.f3441b.u1();
        this.f3443d = u12;
        if (u12 == 0) {
            this.f3443d = 1;
        }
        if (((Z1.c) this.f3441b.f9767W).n("screenOffInDarkness", false)) {
            i8 = this.f3441b.x();
        } else {
            i8 = 0;
        }
        this.e = i8;
        this.i = ((Z1.c) this.f3441b.f9767W).n("ignoreMotionWhenMoving", false);
        this.f3447j = ((Z1.c) this.f3441b.f9767W).n("ignoreMotionWhenScreensaverOnOff", false);
        this.f3448k = ((Z1.c) this.f3441b.f9767W).n("detectFaces", false);
        this.f3446h = this.f3441b.Y1().booleanValue();
        this.f3449l = ((Z1.c) this.f3441b.f9767W).n("detectMotionOnlyWithFaces", false);
        k kVar = this.f3441b;
        kVar.getClass();
        try {
            i9 = Integer.parseInt(((Z1.c) kVar.f9767W).r("detectFacesInterval", "500"));
        } catch (Exception unused) {
            i9 = 500;
        }
        this.f3444f = i9;
        this.f3445g = this.f3441b.z();
        this.f3452o.set(0);
        if (!this.f3448k) {
            this.f3435F = -1;
            this.z.post(new A3.c(0, 1, (Object) this));
        }
        if (this.f3446h && !this.f3461x.f10924n) {
            synchronized (this) {
                this.f3461x.j();
            }
            this.f3460w.E(this.f3462y.getSurfaceProvider());
        }
        if (!this.f3446h && this.f3461x.f10924n) {
            this.f3460w.E((e0) null);
            d();
        }
        if (!(this.f3432C == null || (str = this.f3450m) == null || str.equals(this.f3441b.q1()))) {
            a();
        }
        this.f3450m = this.f3441b.q1();
    }

    public final void f() {
        L0.c.a(this.f3440a).d(this.f3437H);
        this.f3431B.disable();
        d dVar = this.f3458u;
        if (dVar != null) {
            dVar.f();
        }
        C0486m mVar = C0486m.f8145U;
        t tVar = this.f3459v.f3367U;
        tVar.c("markState");
        tVar.c("setCurrentState");
        tVar.e(mVar);
        this.f3432C = null;
        this.f3461x.b();
    }
}
