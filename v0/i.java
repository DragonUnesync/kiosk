package V0;

import B.C0002c;
import M0.h0;
import T0.C0214f;
import T0.C0229v;
import a1.C0412c;
import android.os.Handler;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5526a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5527b;

    /* renamed from: c  reason: collision with root package name */
    public final C0229v f5528c;

    public /* synthetic */ i(Handler handler, C0229v vVar, int i) {
        this.f5526a = i;
        this.f5527b = handler;
        this.f5528c = vVar;
    }

    private final void b(C0214f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.f5527b;
        if (handler != null) {
            handler.post(new C0002c((Object) this, 25, (Object) fVar));
        }
    }

    public final void a(C0214f fVar) {
        switch (this.f5526a) {
            case 0:
                b(fVar);
                return;
            default:
                synchronized (fVar) {
                }
                Handler handler = this.f5527b;
                if (handler != null) {
                    handler.post(new C0412c((Object) this, 13, (Object) fVar));
                    return;
                }
                return;
        }
    }

    public void c(h0 h0Var) {
        Handler handler = this.f5527b;
        if (handler != null) {
            handler.post(new C0412c((Object) this, 12, (Object) h0Var));
        }
    }
}
