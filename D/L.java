package D;

import a0.j;
import a0.k;

public final /* synthetic */ class L implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f805U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ N f806V;

    public /* synthetic */ L(N n4, int i) {
        this.f805U = i;
        this.f806V = n4;
    }

    private final Object a(j jVar) {
        N n4 = this.f806V;
        synchronized (n4.f822a) {
            n4.f825d = jVar;
        }
        return "DeferrableSurface-termination(" + n4 + ")";
    }

    public final Object h(j jVar) {
        switch (this.f805U) {
            case 0:
                return a(jVar);
            default:
                N n4 = this.f806V;
                synchronized (n4.f822a) {
                    n4.f826f = jVar;
                }
                return "DeferrableSurface-close(" + n4 + ")";
        }
    }
}
