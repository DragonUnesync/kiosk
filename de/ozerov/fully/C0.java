package de.ozerov.fully;

import U.p;
import android.view.ViewTreeObserver;
import o.s1;

public final class C0 implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9805b;

    public /* synthetic */ C0(int i, Object obj) {
        this.f9804a = i;
        this.f9805b = obj;
    }

    public final void onWindowFocusChanged(boolean z) {
        switch (this.f9804a) {
            case 0:
                if (!z) {
                    D0 d02 = (D0) this.f9805b;
                    FullyActivity fullyActivity = d02.f9850f1;
                    if (fullyActivity == null || (fullyActivity.f9921J0.i() && d02.f9850f1.f9961z0.E().booleanValue())) {
                        W3.a(d02.f9851g1);
                        d02.f9854j1.postDelayed(new p(20, (Object) this), 300);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!z) {
                    s1 s1Var = (s1) this.f9805b;
                    C0780t4 t4Var = (C0780t4) s1Var.f14070a;
                    if ((t4Var instanceof FullyActivity) && ((FullyActivity) t4Var).f9921J0.i() && ((FullyActivity) ((C0780t4) s1Var.f14070a)).f9961z0.E().booleanValue()) {
                        W3.a((C0780t4) s1Var.f14070a);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
