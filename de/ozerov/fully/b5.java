package de.ozerov.fully;

import android.view.View;

public final /* synthetic */ class b5 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10569U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ i5 f10570V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ g5 f10571W;

    public /* synthetic */ b5(g5 g5Var, i5 i5Var) {
        this.f10569U = 0;
        this.f10571W = g5Var;
        this.f10570V = i5Var;
    }

    public final void onClick(View view) {
        switch (this.f10569U) {
            case 0:
                g5 g5Var = this.f10571W;
                g5Var.getClass();
                this.f10570V.e(g5Var);
                return;
            case 1:
                this.f10570V.e(this.f10571W);
                return;
            default:
                this.f10570V.i(this.f10571W);
                return;
        }
    }

    public /* synthetic */ b5(i5 i5Var, g5 g5Var, int i) {
        this.f10569U = i;
        this.f10570V = i5Var;
        this.f10571W = g5Var;
    }
}
