package M;

import a0.j;
import a0.m;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2745U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ j f2746V;

    public /* synthetic */ g(j jVar, int i) {
        this.f2745U = i;
        this.f2746V = jVar;
    }

    public final void run() {
        switch (this.f2745U) {
            case 0:
                this.f2746V.a();
                return;
            case 1:
                this.f2746V.b();
                return;
            default:
                j jVar = this.f2746V;
                l lVar = jVar.f2758r;
                if (lVar != null) {
                    lVar.m();
                }
                if (jVar.f2757q == null) {
                    j jVar2 = jVar.f2756p;
                    jVar2.f7014d = true;
                    m mVar = jVar2.f7012b;
                    if (mVar != null && mVar.f7017V.cancel(true)) {
                        jVar2.f7011a = null;
                        jVar2.f7012b = null;
                        jVar2.f7013c = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
