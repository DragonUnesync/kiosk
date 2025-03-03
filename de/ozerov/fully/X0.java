package de.ozerov.fully;

import android.content.DialogInterface;
import b3.C0528a;
import d4.k;

public final /* synthetic */ class X0 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10497U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0528a f10498V;

    public /* synthetic */ X0(C0528a aVar, int i) {
        this.f10497U = i;
        this.f10498V = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10497U) {
            case 0:
                this.f10498V.e(true);
                return;
            case 1:
                C0528a aVar = this.f10498V;
                FullyActivity fullyActivity = (FullyActivity) aVar.f8656d;
                if (!fullyActivity.w()) {
                    dialogInterface.cancel();
                }
                fullyActivity.f9919H0.d(true);
                if (P.E(fullyActivity)) {
                    C0528a.k(fullyActivity);
                    return;
                } else {
                    aVar.l(true);
                    return;
                }
            case 2:
                C0528a aVar2 = this.f10498V;
                FullyActivity fullyActivity2 = (FullyActivity) aVar2.f8656d;
                C0528a.k(fullyActivity2);
                fullyActivity2.f9919H0.d(true);
                k kVar = (k) aVar2.e;
                kVar.getClass();
                kVar.R2("ignoreJustOnceLauncher", false);
                return;
            case 3:
                C0528a aVar3 = this.f10498V;
                aVar3.getClass();
                dialogInterface.cancel();
                k kVar2 = (k) aVar3.e;
                kVar2.getClass();
                kVar2.R2("kioskMode", false);
                aVar3.e(true);
                return;
            case 4:
                FullyActivity fullyActivity3 = (FullyActivity) this.f10498V.f8656d;
                if (fullyActivity3.w()) {
                    dialogInterface.dismiss();
                }
                fullyActivity3.f9919H0.d(true);
                return;
            case 5:
                if (((FullyActivity) this.f10498V.f8656d).w()) {
                    dialogInterface.cancel();
                    return;
                }
                return;
            case 6:
                FullyActivity fullyActivity4 = (FullyActivity) this.f10498V.f8656d;
                if (fullyActivity4.w()) {
                    dialogInterface.dismiss();
                }
                k kVar3 = fullyActivity4.f9961z0;
                kVar3.getClass();
                kVar3.R2("confirmExit", false);
                fullyActivity4.f9919H0.d(true);
                return;
            case 7:
                C0528a aVar4 = this.f10498V;
                FullyActivity fullyActivity5 = (FullyActivity) aVar4.f8656d;
                if (fullyActivity5.w()) {
                    dialogInterface.dismiss();
                }
                k kVar4 = fullyActivity5.f9961z0;
                kVar4.getClass();
                kVar4.R2("kioskMode", false);
                aVar4.e(true);
                return;
            case 8:
                C0528a aVar5 = this.f10498V;
                k kVar5 = (k) aVar5.e;
                kVar5.getClass();
                kVar5.R2("kioskMode", false);
                aVar5.f8654b = false;
                return;
            default:
                C0528a aVar6 = this.f10498V;
                aVar6.f();
                k kVar6 = (k) aVar6.e;
                kVar6.getClass();
                kVar6.R2("ignoreJustOnceLauncher", false);
                return;
        }
    }
}
