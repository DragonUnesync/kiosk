package de.ozerov.fully;

import A3.b;
import android.content.DialogInterface;

public final /* synthetic */ class B implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9791U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ E f9792V;

    public /* synthetic */ B(E e, int i) {
        this.f9791U = i;
        this.f9792V = e;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f9791U) {
            case 0:
                E e = this.f9792V;
                if (e.w1 != null) {
                    e.V();
                    e.S();
                    return;
                }
                return;
            case 1:
                E e8 = this.f9792V;
                C c8 = e8.f9863m1;
                if (c8 != null) {
                    c8.c();
                }
                e8.S();
                return;
            default:
                b bVar = this.f9792V.f9864n1;
                if (bVar != null) {
                    switch (bVar.f79U) {
                        case 3:
                            C0676c1.a((C0676c1) bVar.f81W, bVar.f80V);
                            return;
                        case 4:
                            Q2.a((Q2) bVar.f81W, bVar.f80V);
                            return;
                        default:
                            Q4.c((Q4) bVar.f81W, bVar.f80V);
                            return;
                    }
                } else {
                    return;
                }
        }
    }
}
