package o;

import android.view.View;
import n.k;
import n.m;

/* renamed from: o.i  reason: case insensitive filesystem */
public final class C1273i implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final C1269g f13972U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1277k f13973V;

    public C1273i(C1277k kVar, C1269g gVar) {
        this.f13973V = kVar;
        this.f13972U = gVar;
    }

    public final void run() {
        k kVar;
        C1277k kVar2 = this.f13973V;
        m mVar = kVar2.f13980W;
        if (!(mVar == null || (kVar = mVar.f13482Y) == null)) {
            kVar.s(mVar);
        }
        View view = (View) kVar2.f13985b0;
        if (!(view == null || view.getWindowToken() == null)) {
            C1269g gVar = this.f13972U;
            if (!gVar.b()) {
                if (gVar.e != null) {
                    gVar.d(0, 0, false, false);
                }
            }
            kVar2.f13996m0 = gVar;
        }
        kVar2.f13998o0 = null;
    }
}
