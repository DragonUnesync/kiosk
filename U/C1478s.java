package u;

import B.C0005f;
import D.E;
import F.e;
import F.h;
import F.i;
import P5.M;
import V0.v;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import de.ozerov.fully.K2;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n2.a;

/* renamed from: u.s  reason: case insensitive filesystem */
public final class C1478s extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final i f15679a;

    /* renamed from: b  reason: collision with root package name */
    public final e f15680b;

    /* renamed from: c  reason: collision with root package name */
    public M f15681c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f15682d;
    public final v e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C1479t f15683f;

    /* JADX WARNING: type inference failed for: r1v1, types: [V0.v, java.lang.Object] */
    public C1478s(C1479t tVar, i iVar, e eVar, long j7) {
        this.f15683f = tVar;
        this.f15679a = iVar;
        this.f15680b = eVar;
        ? obj = new Object();
        obj.f5608c = this;
        obj.f5607b = -1;
        obj.f5606a = j7;
        this.e = obj;
    }

    public final boolean a() {
        if (this.f15682d == null) {
            return false;
        }
        this.f15683f.u("Cancelling scheduled re-open: " + this.f15681c, (Throwable) null);
        this.f15681c.f3848V = true;
        this.f15681c = null;
        this.f15682d.cancel(false);
        this.f15682d = null;
        return true;
    }

    public final void b() {
        boolean z;
        boolean z6 = true;
        if (this.f15681c == null) {
            z = true;
        } else {
            z = false;
        }
        a.m((String) null, z);
        if (this.f15682d != null) {
            z6 = false;
        }
        a.m((String) null, z6);
        v vVar = this.e;
        vVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (vVar.f5607b == -1) {
            vVar.f5607b = uptimeMillis;
        }
        long j7 = uptimeMillis - vVar.f5607b;
        long c8 = (long) vVar.c();
        C1479t tVar = this.f15683f;
        if (j7 >= c8) {
            vVar.f5607b = -1;
            h.l("Camera2CameraImpl", "Camera reopening attempted for " + vVar.c() + "ms without success.");
            tVar.G(4, (C0005f) null, false);
            return;
        }
        this.f15681c = new M(this, this.f15679a);
        tVar.u("Attempting camera re-open in " + vVar.b() + "ms: " + this.f15681c + " activeResuming = " + tVar.f15713w0, (Throwable) null);
        this.f15682d = this.f15680b.schedule((Runnable) this.f15681c, (long) vVar.b(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        int i;
        C1479t tVar = this.f15683f;
        if (!tVar.f15713w0 || ((i = tVar.f15696e0) != 1 && i != 2)) {
            return false;
        }
        return true;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        boolean z;
        this.f15683f.u("CameraDevice.onClosed()", (Throwable) null);
        if (this.f15683f.f15695d0 == null) {
            z = true;
        } else {
            z = false;
        }
        a.m("Unexpected onClose callback on camera device: " + cameraDevice, z);
        int h5 = C1477r.h(this.f15683f.f15685B0);
        if (h5 == 1 || h5 == 4) {
            a.m((String) null, this.f15683f.f15698g0.isEmpty());
            this.f15683f.s();
        } else if (h5 == 5 || h5 == 6) {
            C1479t tVar = this.f15683f;
            int i = tVar.f15696e0;
            if (i != 0) {
                tVar.u("Camera closed due to error: ".concat(C1479t.w(i)), (Throwable) null);
                b();
                return;
            }
            tVar.K(false);
        } else {
            throw new IllegalStateException("Camera closed while in state: ".concat(C1477r.i(this.f15683f.f15685B0)));
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f15683f.u("CameraDevice.onDisconnected()", (Throwable) null);
        onError(cameraDevice, 1);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        boolean z;
        C1479t tVar = this.f15683f;
        tVar.f15695d0 = cameraDevice;
        tVar.f15696e0 = i;
        K2 k22 = tVar.f15684A0;
        ((C1479t) k22.f10051W).u("Camera receive onErrorCallback", (Throwable) null);
        k22.o();
        int h5 = C1477r.h(this.f15683f.f15685B0);
        if (h5 != 1) {
            switch (h5) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    String id = cameraDevice.getId();
                    String w2 = C1479t.w(i);
                    String g8 = C1477r.g(this.f15683f.f15685B0);
                    h.j("Camera2CameraImpl", "CameraDevice.onError(): " + id + " failed with " + w2 + " while in " + g8 + " state. Will attempt recovering from error.");
                    int i8 = 6;
                    boolean z6 = false;
                    if (this.f15683f.f15685B0 == 8 || this.f15683f.f15685B0 == 9 || this.f15683f.f15685B0 == 10 || this.f15683f.f15685B0 == 7 || this.f15683f.f15685B0 == 6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a.m("Attempt to handle open error from non open state: ".concat(C1477r.i(this.f15683f.f15685B0)), z);
                    int i9 = 3;
                    if (i == 1 || i == 2 || i == 4) {
                        String id2 = cameraDevice.getId();
                        String w4 = C1479t.w(i);
                        h.j("Camera2CameraImpl", "Attempt to reopen camera[" + id2 + "] after error[" + w4 + "]");
                        C1479t tVar2 = this.f15683f;
                        if (tVar2.f15696e0 != 0) {
                            z6 = true;
                        }
                        a.m("Can only reopen camera device after error if the camera device is actually in an error state.", z6);
                        if (i == 1) {
                            i9 = 2;
                        } else if (i == 2) {
                            i9 = 1;
                        }
                        tVar2.G(7, new C0005f((Throwable) null, i9), true);
                        tVar2.r();
                        return;
                    }
                    h.l("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C1479t.w(i) + " closing camera.");
                    if (i == 3) {
                        i8 = 5;
                    }
                    this.f15683f.G(5, new C0005f((Throwable) null, i8), true);
                    this.f15683f.r();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(C1477r.i(this.f15683f.f15685B0)));
            }
        }
        String id3 = cameraDevice.getId();
        String w7 = C1479t.w(i);
        String g9 = C1477r.g(this.f15683f.f15685B0);
        h.l("Camera2CameraImpl", "CameraDevice.onError(): " + id3 + " failed with " + w7 + " while in " + g9 + " state. Will finish closing camera.");
        this.f15683f.r();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f15683f.u("CameraDevice.onOpened()", (Throwable) null);
        C1479t tVar = this.f15683f;
        tVar.f15695d0 = cameraDevice;
        tVar.f15696e0 = 0;
        this.e.f5607b = -1;
        int h5 = C1477r.h(tVar.f15685B0);
        if (h5 == 1 || h5 == 4) {
            a.m((String) null, this.f15683f.f15698g0.isEmpty());
            this.f15683f.f15695d0.close();
            this.f15683f.f15695d0 = null;
        } else if (h5 == 5 || h5 == 6 || h5 == 7) {
            this.f15683f.F(9);
            E e8 = this.f15683f.f15702k0;
            String id = cameraDevice.getId();
            C1479t tVar2 = this.f15683f;
            if (e8.e(id, tVar2.f15701j0.f(tVar2.f15695d0.getId()))) {
                this.f15683f.C();
            }
        } else {
            throw new IllegalStateException("onOpened() should not be possible from state: ".concat(C1477r.i(this.f15683f.f15685B0)));
        }
    }
}
