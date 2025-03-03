package B;

import A.g;
import D.C0036c;
import D.C0053k0;
import D.J;
import D.K;
import D.p0;
import H.l;
import N.e;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;
import s.C1400a;
import s.b;
import s.c;

/* renamed from: B.w  reason: case insensitive filesystem */
public final class C0021w implements l {

    /* renamed from: V  reason: collision with root package name */
    public static final C0036c f348V = new C0036c("camerax.core.appConfig.cameraFactoryProvider", C1400a.class, (CaptureRequest.Key) null);

    /* renamed from: W  reason: collision with root package name */
    public static final C0036c f349W = new C0036c("camerax.core.appConfig.deviceSurfaceManagerProvider", b.class, (CaptureRequest.Key) null);

    /* renamed from: X  reason: collision with root package name */
    public static final C0036c f350X = new C0036c("camerax.core.appConfig.useCaseConfigFactoryProvider", c.class, (CaptureRequest.Key) null);

    /* renamed from: Y  reason: collision with root package name */
    public static final C0036c f351Y = new C0036c("camerax.core.appConfig.cameraExecutor", Executor.class, (CaptureRequest.Key) null);

    /* renamed from: Z  reason: collision with root package name */
    public static final C0036c f352Z = new C0036c("camerax.core.appConfig.schedulerHandler", Handler.class, (CaptureRequest.Key) null);

    /* renamed from: a0  reason: collision with root package name */
    public static final C0036c f353a0 = new C0036c("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, (CaptureRequest.Key) null);

    /* renamed from: b0  reason: collision with root package name */
    public static final C0036c f354b0 = new C0036c("camerax.core.appConfig.availableCamerasLimiter", C0017s.class, (CaptureRequest.Key) null);

    /* renamed from: c0  reason: collision with root package name */
    public static final C0036c f355c0 = new C0036c("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, (CaptureRequest.Key) null);

    /* renamed from: d0  reason: collision with root package name */
    public static final C0036c f356d0 = new C0036c("camerax.core.appConfig.cameraProviderInitRetryPolicy", i0.class, (CaptureRequest.Key) null);

    /* renamed from: e0  reason: collision with root package name */
    public static final C0036c f357e0 = new C0036c("camerax.core.appConfig.quirksSettings", p0.class, (CaptureRequest.Key) null);

    /* renamed from: U  reason: collision with root package name */
    public final C0053k0 f358U;

    public C0021w(C0053k0 k0Var) {
        this.f358U = k0Var;
    }

    public final /* synthetic */ Set J() {
        return e.n(this);
    }

    public final /* synthetic */ void Q(g gVar) {
        e.b(this, gVar);
    }

    public final /* synthetic */ Object Y(C0036c cVar, J j7) {
        return e.r(this, cVar, j7);
    }

    public final C0017s a() {
        Object obj;
        try {
            obj = this.f358U.b0(f354b0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C0017s) obj;
    }

    public final C1400a b() {
        Object obj;
        try {
            obj = this.f358U.b0(f348V);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C1400a) obj;
    }

    public final /* synthetic */ Object b0(C0036c cVar) {
        return e.p(this, cVar);
    }

    public final long c() {
        C0036c cVar = f355c0;
        long j7 = -1L;
        C0053k0 k0Var = this.f358U;
        k0Var.getClass();
        try {
            j7 = k0Var.b0(cVar);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) j7).longValue();
    }

    public final b d() {
        Object obj;
        try {
            obj = this.f358U.b0(f349W);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (b) obj;
    }

    public final /* synthetic */ String d0(String str) {
        throw null;
    }

    public final c e() {
        Object obj;
        try {
            obj = this.f358U.b0(f350X);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (c) obj;
    }

    public final /* synthetic */ Set g(C0036c cVar) {
        return e.g(this, cVar);
    }

    public final /* synthetic */ J m(C0036c cVar) {
        return e.e(this, cVar);
    }

    public final /* synthetic */ Object o0(C0036c cVar, Object obj) {
        return e.q(this, cVar, obj);
    }

    public final /* synthetic */ String p() {
        throw null;
    }

    public final /* synthetic */ boolean q0(C0036c cVar) {
        return e.a(this, cVar);
    }

    public final K x() {
        return this.f358U;
    }
}
