package de.ozerov.fully;

import android.app.Dialog;

public final /* synthetic */ class W1 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10471U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10472V;

    public /* synthetic */ W1(C0695f2 f2Var, int i) {
        this.f10471U = i;
        this.f10472V = f2Var;
    }

    public final void run() {
        C0695f2 f2Var = this.f10472V;
        switch (this.f10471U) {
            case 0:
                int i = C0695f2.f10625d0;
                f2Var.getClass();
                try {
                    f2Var.f10627V.getWindow().getDecorView().findViewById(16908290).requestLayout();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                int i8 = C0695f2.f10625d0;
                f2Var.getPreferenceScreen().removeAll();
                f2Var.addPreferencesFromResource(2132148232);
                f2Var.d();
                Dialog dialog = f2Var.f10632a0;
                if (dialog != null && dialog.isShowing()) {
                    f2Var.f10632a0.dismiss();
                    return;
                }
                return;
        }
    }
}
