package P0;

import D.C0054l;
import D.C0060o;
import D.C0064s;
import Z1.a;
import Z1.d;
import android.graphics.PorterDuffColorFilter;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.appcompat.view.menu.ActionMenuItemView;
import de.ozerov.fully.U0;
import de.ozerov.fully.g5;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import u.C1465f;
import u.C1472m;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3703U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f3704V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f3705W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f3706X;

    public /* synthetic */ g(Object obj, int i, Object obj2, int i8) {
        this.f3703U = i8;
        this.f3705W = obj;
        this.f3704V = i;
        this.f3706X = obj2;
    }

    public final void run() {
        switch (this.f3703U) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f3705W).iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (!jVar.f3710d) {
                        int i = this.f3704V;
                        if (i != -1) {
                            jVar.f3708b.c(i);
                        }
                        jVar.f3709c = true;
                        ((h) this.f3706X).a(jVar.f3707a);
                    }
                }
                return;
            case 1:
                ((d) ((a) this.f3705W).f6948c).f(this.f3704V, (Serializable) this.f3706X);
                return;
            case 2:
                g5 l8 = ((U0) this.f3705W).f10414a.f9917F0.l(this.f3704V);
                if (l8 != null) {
                    l8.g((String) this.f3706X);
                    return;
                }
                return;
            case 3:
                ((ActionMenuItemView) this.f3705W).getCompoundDrawables()[this.f3704V].setColorFilter((PorterDuffColorFilter) this.f3706X);
                return;
            case 4:
                ((C0054l) this.f3705W).c(this.f3704V, (C0060o) this.f3706X);
                return;
            case 5:
                ((C0054l) this.f3705W).b(this.f3704V, (C0064s) this.f3706X);
                return;
            case 6:
                ((CameraCaptureSession.CaptureCallback) ((C1465f) this.f3705W).f15614b).onCaptureSequenceAborted((CameraCaptureSession) this.f3706X, this.f3704V);
                return;
            default:
                ((CameraDevice.StateCallback) ((C1472m) this.f3705W).f15667b).onError((CameraDevice) this.f3706X, this.f3704V);
                return;
        }
    }

    public /* synthetic */ g(Object obj, AutoCloseable autoCloseable, int i, int i8) {
        this.f3703U = i8;
        this.f3705W = obj;
        this.f3706X = autoCloseable;
        this.f3704V = i;
    }
}
