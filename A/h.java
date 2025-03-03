package A;

import B.C0020v;
import B.C0023y;
import D.C0036c;
import D.C0039d0;
import D.C0041e0;
import D.C0053k0;
import D.J;
import D.K;
import D.K0;
import D.L0;
import D.N0;
import H.l;
import H3.P;
import Q.d;
import Q.e;
import android.hardware.camera2.CaptureRequest;
import java.util.UUID;
import t.C1412a;

public final class h implements C0023y, K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21a;

    /* renamed from: b  reason: collision with root package name */
    public final C0041e0 f22b;

    public h(C0041e0 e0Var) {
        Object obj;
        this.f21a = 2;
        this.f22b = e0Var;
        Object obj2 = null;
        try {
            obj = e0Var.b0(l.f1803F);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        Class<d> cls2 = d.class;
        if (cls == null || cls.equals(cls2)) {
            this.f22b.e(L0.f807A, N0.f834Y);
            C0036c cVar = l.f1803F;
            C0041e0 e0Var2 = this.f22b;
            e0Var2.e(cVar, cls2);
            try {
                obj2 = e0Var2.b0(l.f1802E);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                e0Var2.e(l.f1802E, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    public static h e(K k8) {
        h hVar = new h(0);
        k8.Q(new g(hVar, 0, k8));
        return hVar;
    }

    public C0039d0 a() {
        switch (this.f21a) {
            case 0:
                throw null;
            case 2:
                return this.f22b;
            default:
                throw null;
        }
    }

    public L0 b() {
        return new e(C0053k0.a(this.f22b));
    }

    public f c() {
        return new f(1, (Object) C0053k0.a(this.f22b));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, H3.P] */
    public P d() {
        C0053k0 a8 = C0053k0.a(this.f22b);
        ? obj = new Object();
        obj.f2027U = a8;
        return obj;
    }

    public void f(CaptureRequest.Key key, Object obj) {
        this.f22b.e(new C0036c("camera2.captureRequest.option." + key.getName(), Object.class, key), obj);
    }

    public void g(CaptureRequest.Key key, Object obj) {
        J j7 = J.f797V;
        this.f22b.d(C1412a.i0(key), j7, obj);
    }

    public h(int i) {
        Object obj;
        this.f21a = i;
        switch (i) {
            case 1:
                C0041e0 b8 = C0041e0.b();
                this.f22b = b8;
                Object obj2 = null;
                try {
                    obj = b8.b0(l.f1803F);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<C0020v> cls2 = C0020v.class;
                if (cls == null || cls.equals(cls2)) {
                    C0036c cVar = l.f1803F;
                    C0041e0 e0Var = this.f22b;
                    e0Var.e(cVar, cls2);
                    try {
                        obj2 = e0Var.b0(l.f1802E);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj2 == null) {
                        e0Var.e(l.f1802E, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            case 3:
                this.f22b = C0041e0.b();
                return;
            case 4:
                this.f22b = C0041e0.b();
                return;
            default:
                this.f22b = C0041e0.b();
                return;
        }
    }
}
