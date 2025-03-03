package u;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;
import n2.a;
import v.i;

public final /* synthetic */ class W implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15562U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Y f15563V;

    public /* synthetic */ W(Y y8, int i) {
        this.f15562U = i;
        this.f15563V = y8;
    }

    public final void run() {
        switch (this.f15562U) {
            case 0:
                Y y8 = this.f15563V;
                y8.g(y8);
                return;
            default:
                Y y9 = this.f15563V;
                y9.l("Session call super.close()");
                a.l(y9.f15573g, "Need to call openCaptureSession before using this API.");
                C1455O o2 = y9.f15569b;
                synchronized (o2.f15530b) {
                    ((LinkedHashSet) o2.f15532d).add(y9);
                }
                ((CameraCaptureSession) ((i) y9.f15573g.f13026V).f15852V).close();
                y9.f15571d.execute(new W(y9, 0));
                return;
        }
    }
}
