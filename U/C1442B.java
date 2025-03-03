package u;

import a0.j;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;

/* renamed from: u.B  reason: case insensitive filesystem */
public final class C1442B extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15490a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15491b;

    public /* synthetic */ C1442B(int i, Object obj) {
        this.f15490a = i;
        this.f15491b = obj;
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                Y y8 = (Y) this.f15491b;
                y8.k(cameraCaptureSession);
                y8.a(y8);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                Y y8 = (Y) this.f15491b;
                y8.k(cameraCaptureSession);
                y8.b(y8);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                Y y8 = (Y) this.f15491b;
                y8.k(cameraCaptureSession);
                y8.c(y8);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        j jVar;
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((Y) this.f15491b).k(cameraCaptureSession);
                    Y y8 = (Y) this.f15491b;
                    y8.d(y8);
                    synchronized (((Y) this.f15491b).f15568a) {
                        a.l(((Y) this.f15491b).i, "OpenCaptureSession completer should not null");
                        Y y9 = (Y) this.f15491b;
                        jVar = y9.i;
                        y9.i = null;
                    }
                    jVar.b(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((Y) this.f15491b).f15568a) {
                        a.l(((Y) this.f15491b).i, "OpenCaptureSession completer should not null");
                        Y y10 = (Y) this.f15491b;
                        j jVar2 = y10.i;
                        y10.i = null;
                        jVar2.b(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        j jVar;
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((Y) this.f15491b).k(cameraCaptureSession);
                    Y y8 = (Y) this.f15491b;
                    y8.e(y8);
                    synchronized (((Y) this.f15491b).f15568a) {
                        a.l(((Y) this.f15491b).i, "OpenCaptureSession completer should not null");
                        Y y9 = (Y) this.f15491b;
                        jVar = y9.i;
                        y9.i = null;
                    }
                    jVar.a((Object) null);
                    return;
                } catch (Throwable th) {
                    synchronized (((Y) this.f15491b).f15568a) {
                        a.l(((Y) this.f15491b).i, "OpenCaptureSession completer should not null");
                        Y y10 = (Y) this.f15491b;
                        j jVar2 = y10.i;
                        y10.i = null;
                        jVar2.a((Object) null);
                        throw th;
                    }
                }
            default:
                Surface b8 = cameraCaptureSession.getInputSurface();
                if (b8 != null) {
                    ((g0) this.f15491b).f15624c0 = c.s(1, b8);
                    return;
                }
                return;
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                Y y8 = (Y) this.f15491b;
                y8.k(cameraCaptureSession);
                y8.f(y8);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f15490a) {
            case 0:
                Iterator it = ((ArrayList) this.f15491b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                Y y8 = (Y) this.f15491b;
                y8.k(cameraCaptureSession);
                y8.h(y8, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public C1442B(List list) {
        this.f15490a = 0;
        this.f15491b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C1443C)) {
                ((ArrayList) this.f15491b).add(stateCallback);
            }
        }
    }
}
