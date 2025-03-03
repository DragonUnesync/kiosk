package de.ozerov.fully;

import android.content.DialogInterface;
import android.view.KeyEvent;
import o.s1;

public final class I0 implements DialogInterface.OnKeyListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10006U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f10007V;

    public /* synthetic */ I0(int i, Object obj) {
        this.f10006U = i;
        this.f10007V = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.f10006U) {
            case 0:
                s1 s1Var = (s1) this.f10007V;
                C0780t4 t4Var = (C0780t4) s1Var.f14070a;
                if (!(t4Var instanceof FullyActivity) || !((FullyActivity) t4Var).f9921J0.i() || !((FullyActivity) ((C0780t4) s1Var.f14070a)).f9961z0.G().booleanValue() || (i != 24 && i != 25)) {
                    return false;
                }
                return true;
            default:
                C0737m2 m2Var = (C0737m2) this.f10007V;
                C0780t4 t4Var2 = m2Var.f10797a;
                if (!(t4Var2 instanceof FullyActivity) || !((FullyActivity) t4Var2).f9921J0.i() || !m2Var.f10798b.G().booleanValue() || (i != 24 && i != 25)) {
                    return false;
                }
                return true;
        }
    }
}
