package u;

import G.a;
import G.h;
import G.i;
import L3.b;
import a0.j;
import a0.k;
import a0.m;
import android.hardware.camera2.CameraDevice;
import com.bumptech.glide.d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k2.C1160q;
import w.v;

public final /* synthetic */ class X implements k, a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ Y f15564U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ v f15565V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ List f15566W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f15567X;

    public /* synthetic */ X(Y y8, CameraDevice cameraDevice, v vVar, List list) {
        this.f15564U = y8;
        this.f15567X = cameraDevice;
        this.f15565V = vVar;
        this.f15566W = list;
    }

    public b apply(Object obj) {
        b bVar;
        Y y8 = this.f15564U;
        CameraDevice cameraDevice = (CameraDevice) this.f15567X;
        v vVar = this.f15565V;
        List list = this.f15566W;
        List list2 = (List) obj;
        if (y8.f15587v.f2535a) {
            Iterator it = y8.f15569b.f().iterator();
            while (it.hasNext()) {
                ((Y) it.next()).j();
            }
        }
        y8.l("start openCaptureSession");
        synchronized (y8.f15568a) {
            try {
                if (y8.f15578m) {
                    bVar = new G.k(1, new CancellationException("Opener is disabled"));
                } else {
                    y8.f15569b.l(y8);
                    m i = d.i(new X(y8, list, new C1160q(cameraDevice, y8.f15570c), vVar));
                    y8.f15574h = i;
                    C1160q qVar = new C1160q(19, (Object) y8);
                    i.d(new h(i, 0, qVar), D7.b.l());
                    bVar = i.d(y8.f15574h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public Object h(j jVar) {
        boolean z;
        String str;
        Y y8 = this.f15564U;
        List list = this.f15566W;
        C1160q qVar = (C1160q) this.f15567X;
        v vVar = this.f15565V;
        synchronized (y8.f15568a) {
            y8.m(list);
            if (y8.i == null) {
                z = true;
            } else {
                z = false;
            }
            n2.a.m("The openCaptureSessionCompleter can only set once!", z);
            y8.i = jVar;
            ((v.i) qVar.f13026V).c(vVar);
            str = "openCaptureSession[session=" + y8 + "]";
        }
        return str;
    }

    public /* synthetic */ X(Y y8, List list, C1160q qVar, v vVar) {
        this.f15564U = y8;
        this.f15566W = list;
        this.f15567X = qVar;
        this.f15565V = vVar;
    }
}
