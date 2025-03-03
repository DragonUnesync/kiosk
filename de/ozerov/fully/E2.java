package de.ozerov.fully;

import B3.n;
import android.view.View;

public final /* synthetic */ class E2 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9878U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ G2 f9879V;

    public /* synthetic */ E2(G2 g22, int i) {
        this.f9878U = i;
        this.f9879V = g22;
    }

    public final void onClick(View view) {
        switch (this.f9878U) {
            case 0:
                this.f9879V.a(0);
                return;
            default:
                G2 g22 = this.f9879V;
                n nVar = g22.f9974k;
                if (nVar != null) {
                    nVar.a(3);
                }
                g22.f9974k = null;
                g22.f9971g = false;
                g22.a(0);
                return;
        }
    }
}
