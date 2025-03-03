package androidx.activity;

import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;
import h.C1022j;

class ComponentActivity$3 implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1022j f7260U;

    public ComponentActivity$3(C1022j jVar) {
        this.f7260U = jVar;
    }

    public final void c(r rVar, C0485l lVar) {
        if (lVar == C0485l.ON_DESTROY) {
            this.f7260U.f7288V.f1140U = null;
            if (!this.f7260U.isChangingConfigurations()) {
                this.f7260U.d().a();
            }
            j jVar = this.f7260U.f7294b0;
            C1022j jVar2 = jVar.f7287X;
            jVar2.getWindow().getDecorView().removeCallbacks(jVar);
            jVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
        }
    }
}
