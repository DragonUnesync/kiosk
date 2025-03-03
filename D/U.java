package D;

import A.g;
import B.C0022x;
import B.Q;
import B.X;
import H.h;
import N.e;
import P.b;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import u.C1485z;

public final class U implements L0, X, h {

    /* renamed from: V  reason: collision with root package name */
    public static final C0036c f854V;

    /* renamed from: W  reason: collision with root package name */
    public static final C0036c f855W;

    /* renamed from: X  reason: collision with root package name */
    public static final C0036c f856X;

    /* renamed from: Y  reason: collision with root package name */
    public static final C0036c f857Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C0036c f858Z = new C0036c("camerax.core.imageCapture.imageReaderProxyProvider", X.class, (CaptureRequest.Key) null);

    /* renamed from: a0  reason: collision with root package name */
    public static final C0036c f859a0 = new C0036c("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, (CaptureRequest.Key) null);

    /* renamed from: b0  reason: collision with root package name */
    public static final C0036c f860b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final C0036c f861c0 = new C0036c("camerax.core.imageCapture.screenFlash", Q.class, (CaptureRequest.Key) null);

    /* renamed from: d0  reason: collision with root package name */
    public static final C0036c f862d0 = new C0036c("camerax.core.useCase.isPostviewEnabled", Boolean.class, (CaptureRequest.Key) null);

    /* renamed from: U  reason: collision with root package name */
    public final C0053k0 f863U;

    static {
        Class cls = Integer.TYPE;
        f854V = new C0036c("camerax.core.imageCapture.captureMode", cls, (CaptureRequest.Key) null);
        f855W = new C0036c("camerax.core.imageCapture.flashMode", cls, (CaptureRequest.Key) null);
        Class<Integer> cls2 = Integer.class;
        f856X = new C0036c("camerax.core.imageCapture.bufferFormat", cls2, (CaptureRequest.Key) null);
        f857Y = new C0036c("camerax.core.imageCapture.outputFormat", cls2, (CaptureRequest.Key) null);
        f860b0 = new C0036c("camerax.core.imageCapture.flashType", cls, (CaptureRequest.Key) null);
    }

    public U(C0053k0 k0Var) {
        this.f863U = k0Var;
    }

    public final int A() {
        return ((Integer) e.p(this, V.f864g)).intValue();
    }

    public final /* synthetic */ int B() {
        return e.f(this);
    }

    public final /* synthetic */ int G() {
        return W.c(this);
    }

    public final /* synthetic */ Set J() {
        return e.n(this);
    }

    public final C0 M() {
        return (C0) b0(L0.f810s);
    }

    public final /* synthetic */ int N() {
        return e.h(this);
    }

    public final C1485z P() {
        return (C1485z) o0(L0.f812u, (Object) null);
    }

    public final /* synthetic */ void Q(g gVar) {
        e.b(this, gVar);
    }

    public final /* synthetic */ boolean R() {
        return e.l(this);
    }

    public final /* synthetic */ ArrayList S() {
        return W.b(this);
    }

    public final b T() {
        int i = W.f866a;
        return (b) o0(X.f874q, (Object) null);
    }

    public final /* synthetic */ Object Y(C0036c cVar, J j7) {
        return e.r(this, cVar, j7);
    }

    public final C0 a0() {
        return (C0) o0(L0.f810s, (Object) null);
    }

    public final /* synthetic */ Object b0(C0036c cVar) {
        return e.p(this, cVar);
    }

    public final Size c0() {
        int i = W.f866a;
        return (Size) o0(X.f872o, (Object) null);
    }

    public final /* synthetic */ String d0(String str) {
        return e.j(this, str);
    }

    public final /* synthetic */ boolean e0() {
        return e.m(this);
    }

    public final /* synthetic */ Set g(C0036c cVar) {
        return e.g(this, cVar);
    }

    public final Size g0() {
        int i = W.f866a;
        return (Size) o0(X.f871n, (Object) null);
    }

    public final /* synthetic */ int h0(int i) {
        return W.d(this, i);
    }

    public final Size i() {
        int i = W.f866a;
        return (Size) o0(X.f870m, (Object) null);
    }

    public final /* synthetic */ N0 k() {
        return e.c(this);
    }

    public final /* synthetic */ int l() {
        return e.k(this);
    }

    public final /* synthetic */ J m(C0036c cVar) {
        return e.e(this, cVar);
    }

    public final /* synthetic */ C0022x n() {
        return e.d(this);
    }

    public final /* synthetic */ Object o0(C0036c cVar, Object obj) {
        return e.q(this, cVar, obj);
    }

    public final /* synthetic */ String p() {
        return e.i(this);
    }

    public final /* synthetic */ int p0() {
        return W.a(this);
    }

    public final /* synthetic */ boolean q0(C0036c cVar) {
        return e.a(this, cVar);
    }

    public final boolean r() {
        int i = W.f866a;
        return q0(X.i);
    }

    public final List u() {
        int i = W.f866a;
        return (List) o0(X.f873p, (Object) null);
    }

    public final int v() {
        int i = W.f866a;
        return ((Integer) b0(X.i)).intValue();
    }

    public final b w() {
        int i = W.f866a;
        return (b) b0(X.f874q);
    }

    public final K x() {
        return this.f863U;
    }

    public final Range y() {
        return (Range) o0(L0.f815x, (Object) null);
    }
}
