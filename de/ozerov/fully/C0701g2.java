package de.ozerov.fully;

import android.view.ViewTreeObserver;

/* renamed from: de.ozerov.fully.g2  reason: case insensitive filesystem */
public final /* synthetic */ class C0701g2 implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0737m2 f10643a;

    public /* synthetic */ C0701g2(C0737m2 m2Var) {
        this.f10643a = m2Var;
    }

    public final void onWindowFocusChanged(boolean z) {
        C0737m2 m2Var = this.f10643a;
        if (!z) {
            C0780t4 t4Var = m2Var.f10797a;
            if ((t4Var instanceof FullyActivity) && ((FullyActivity) t4Var).f9921J0.i() && m2Var.f10798b.E().booleanValue()) {
                W3.a(t4Var);
                return;
            }
            return;
        }
        m2Var.getClass();
    }
}
