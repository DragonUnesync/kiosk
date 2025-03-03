package B3;

import android.view.View;
import v0.C1542o;
import v0.j0;

public final class f implements C1542o {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ k f398U;

    public /* synthetic */ f(k kVar) {
        this.f398U = kVar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f398U.a(0);
    }

    public j0 i(View view, j0 j0Var) {
        int a8 = j0Var.a();
        k kVar = this.f398U;
        kVar.f428m = a8;
        kVar.f429n = j0Var.b();
        kVar.f430o = j0Var.c();
        kVar.e();
        return j0Var;
    }
}
