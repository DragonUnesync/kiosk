package de.ozerov.fully;

import android.view.View;

/* renamed from: de.ozerov.fully.b2  reason: case insensitive filesystem */
public final /* synthetic */ class C0671b2 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10562U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10563V;

    public /* synthetic */ C0671b2(C0695f2 f2Var, int i) {
        this.f10562U = i;
        this.f10563V = f2Var;
    }

    public final void onClick(View view) {
        switch (this.f10562U) {
            case 0:
                this.f10563V.f10627V.getFragmentManager().popBackStack();
                return;
            default:
                C0695f2 f2Var = this.f10563V;
                f2Var.f10627V.C();
                new C0813z1().T(f2Var.f10627V.l(), "localFilesMigrationSelector");
                return;
        }
    }
}
