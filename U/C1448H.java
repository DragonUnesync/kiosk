package u;

import D7.b;
import F.h;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import de.ozerov.fully.M2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.i;

/* renamed from: u.H  reason: case insensitive filesystem */
public final class C1448H extends U {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15496a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15497b;

    public C1448H(int i, List list) {
        Object obj;
        this.f15496a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f15497b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    obj = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    obj = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    obj = new C1442B(list);
                }
                this.f15497b = obj;
                return;
        }
    }

    private final void i(Y y8) {
    }

    public void a(Y y8) {
        switch (this.f15496a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onActive((CameraCaptureSession) ((i) y8.x().f13026V).f15852V);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).a(y8);
                }
                return;
            default:
                return;
        }
    }

    public void b(Y y8) {
        switch (this.f15496a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onCaptureQueueEmpty((CameraCaptureSession) ((i) y8.x().f13026V).f15852V);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).b(y8);
                }
                return;
            default:
                return;
        }
    }

    public void c(Y y8) {
        switch (this.f15496a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onClosed((CameraCaptureSession) ((i) y8.x().f13026V).f15852V);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).c(y8);
                }
                return;
            default:
                return;
        }
    }

    public final void d(Y y8) {
        switch (this.f15496a) {
            case 0:
                synchronized (((C1449I) this.f15497b).f15498a) {
                    try {
                        switch (C1477r.h(((C1449I) this.f15497b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(C1477r.j(((C1449I) this.f15497b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((C1449I) this.f15497b).c();
                                break;
                            case 7:
                                h.j("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        h.l("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(C1477r.j(((C1449I) this.f15497b).i)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onConfigureFailed((CameraCaptureSession) ((i) y8.x().f13026V).f15852V);
                return;
            default:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d(y8);
                }
                return;
        }
    }

    public final void e(Y y8) {
        switch (this.f15496a) {
            case 0:
                synchronized (((C1449I) this.f15497b).f15498a) {
                    try {
                        switch (C1477r.h(((C1449I) this.f15497b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(C1477r.j(((C1449I) this.f15497b).i)));
                            case 3:
                                C1449I i = (C1449I) this.f15497b;
                                i.i = 5;
                                i.e = y8;
                                h.j("CaptureSession", "Attempting to send capture request onConfigured");
                                C1449I i8 = (C1449I) this.f15497b;
                                i8.j(i8.f15502f);
                                C1449I i9 = (C1449I) this.f15497b;
                                i9.f15510o.g().d(new M2(16, (Object) i9), b.l());
                                break;
                            case 5:
                                ((C1449I) this.f15497b).e = y8;
                                break;
                            case 6:
                                y8.j();
                                break;
                        }
                        h.j("CaptureSession", "CameraCaptureSession.onConfigured() mState=".concat(C1477r.j(((C1449I) this.f15497b).i)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onConfigured((CameraCaptureSession) ((i) y8.x().f13026V).f15852V);
                return;
            default:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).e(y8);
                }
                return;
        }
    }

    public final void f(Y y8) {
        switch (this.f15496a) {
            case 0:
                synchronized (((C1449I) this.f15497b).f15498a) {
                    try {
                        if (C1477r.h(((C1449I) this.f15497b).i) != 0) {
                            h.j("CaptureSession", "CameraCaptureSession.onReady() ".concat(C1477r.j(((C1449I) this.f15497b).i)));
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(C1477r.j(((C1449I) this.f15497b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onReady((CameraCaptureSession) ((i) y8.x().f13026V).f15852V);
                return;
            default:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).f(y8);
                }
                return;
        }
    }

    public final void g(Y y8) {
        switch (this.f15496a) {
            case 0:
                synchronized (((C1449I) this.f15497b).f15498a) {
                    try {
                        if (((C1449I) this.f15497b).i != 1) {
                            h.j("CaptureSession", "onSessionFinished()");
                            ((C1449I) this.f15497b).c();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(C1477r.j(((C1449I) this.f15497b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).g(y8);
                }
                return;
        }
    }

    public void h(Y y8, Surface surface) {
        switch (this.f15496a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f15497b).onSurfacePrepared((CameraCaptureSession) ((i) y8.x().f13026V).f15852V, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f15497b).iterator();
                while (it.hasNext()) {
                    ((U) it.next()).h(y8, surface);
                }
                return;
            default:
                return;
        }
    }

    public C1448H(C1449I i) {
        this.f15496a = 0;
        this.f15497b = i;
    }
}
