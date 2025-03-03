package de.ozerov.fully;

import android.content.DialogInterface;
import android.widget.TextView;
import o.s1;

public final /* synthetic */ class H0 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9988U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ s1 f9989V;

    public /* synthetic */ H0(s1 s1Var, int i) {
        this.f9988U = i;
        this.f9989V = s1Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f9988U) {
            case 0:
                s1 s1Var = this.f9989V;
                C0772s2 s2Var = (C0772s2) s1Var.e;
                if (s2Var != null) {
                    s2Var.f10950a.proceed(((TextView) s1Var.f14072c).getText().toString(), ((TextView) s1Var.f14073d).getText().toString());
                    return;
                }
                return;
            default:
                C0772s2 s2Var2 = (C0772s2) this.f9989V.f14074f;
                if (s2Var2 != null) {
                    s2Var2.f10950a.cancel();
                    return;
                }
                return;
        }
    }
}
