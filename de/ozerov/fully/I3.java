package de.ozerov.fully;

import android.content.DialogInterface;
import d4.k;

public final /* synthetic */ class I3 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10012U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ J3 f10013V;

    public /* synthetic */ I3(J3 j32, int i) {
        this.f10012U = i;
        this.f10013V = j32;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10012U) {
            case 0:
                J3 j32 = this.f10013V;
                j32.f10027P0.f9921J0.c();
                j32.f10027P0.f9949l1.b();
                return;
            default:
                J3 j33 = this.f10013V;
                k kVar = j33.f10028Q0;
                kVar.getClass();
                kVar.R2("kioskTestMode", false);
                j33.f10027P0.f9921J0.c();
                j33.f10027P0.f9949l1.b();
                return;
        }
    }
}
