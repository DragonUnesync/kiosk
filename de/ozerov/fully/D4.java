package de.ozerov.fully;

import android.view.KeyEvent;
import android.view.View;
import b3.C0528a;

public final /* synthetic */ class D4 implements View.OnKeyListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9859U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f9860V;

    public /* synthetic */ D4(int i, Object obj) {
        this.f9859U = i;
        this.f9860V = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.f9859U) {
            case 0:
                C0716j jVar = ((K4) this.f9860V).f10063m;
                if (jVar != null) {
                    return jVar.b(i, keyEvent);
                }
                return false;
            case 1:
                C0716j jVar2 = ((K4) this.f9860V).f10063m;
                if (jVar2 == null || !jVar2.b(i, keyEvent)) {
                    return false;
                }
                return true;
            default:
                W3 w32 = (W3) this.f9860V;
                w32.getClass();
                if (i == 4 && keyEvent.getAction() == 1) {
                    if (w32.f10477b.f10980u0) {
                        w32.f10477b.onBackPressed();
                    } else {
                        w32.f10477b.f9919H0.b();
                    }
                }
                if (i != 3 || keyEvent.getAction() != 1) {
                    return false;
                }
                C0528a.p(w32.f10477b, (String) null);
                return false;
        }
    }
}
