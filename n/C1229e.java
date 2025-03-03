package n;

import k2.C1160q;

/* renamed from: n.e  reason: case insensitive filesystem */
public final class C1229e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1230f f13432U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ o f13433V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ m f13434W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1160q f13435X;

    public C1229e(C1160q qVar, C1230f fVar, o oVar, m mVar) {
        this.f13435X = qVar;
        this.f13432U = fVar;
        this.f13433V = oVar;
        this.f13434W = mVar;
    }

    public final void run() {
        C1230f fVar = this.f13432U;
        if (fVar != null) {
            C1160q qVar = this.f13435X;
            ((C1231g) qVar.f13026V).f13462t0 = true;
            fVar.f13437b.c(false);
            ((C1231g) qVar.f13026V).f13462t0 = false;
        }
        o oVar = this.f13433V;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f13434W.q(oVar, (y) null, 4);
        }
    }
}
