package o;

import androidx.appcompat.widget.Toolbar;
import n.o;

public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13965U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Toolbar f13966V;

    public /* synthetic */ g1(Toolbar toolbar, int i) {
        this.f13965U = i;
        this.f13966V = toolbar;
    }

    public final void run() {
        o oVar;
        switch (this.f13965U) {
            case 0:
                j1 j1Var = this.f13966V.f7568J0;
                if (j1Var == null) {
                    oVar = null;
                } else {
                    oVar = j1Var.f13976V;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13966V.n();
                return;
        }
    }
}
