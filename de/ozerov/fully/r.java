package de.ozerov.fully;

import G5.i;
import android.content.DialogInterface;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10907U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f10908V;

    public /* synthetic */ r(int i, Object obj) {
        this.f10907U = i;
        this.f10908V = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10907U) {
            case 0:
                C0805y.V((C0805y) this.f10908V);
                return;
            case 1:
                C0805y.U((C0805y) this.f10908V);
                return;
            default:
                ((i) this.f10908V).f1697a.finish();
                return;
        }
    }
}
