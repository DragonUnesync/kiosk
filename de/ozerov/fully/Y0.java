package de.ozerov.fully;

import android.content.DialogInterface;
import b3.C0528a;
import d4.k;
import n2.a;

public final /* synthetic */ class Y0 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10509U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0528a f10510V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Runnable f10511W;

    public /* synthetic */ Y0(C0528a aVar, Runnable runnable, int i) {
        this.f10509U = i;
        this.f10510V = aVar;
        this.f10511W = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10509U) {
            case 0:
                k kVar = (k) this.f10510V.e;
                kVar.getClass();
                kVar.R2("kioskMode", true);
                dialogInterface.cancel();
                Runnable runnable = this.f10511W;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                C0528a aVar = this.f10510V;
                k kVar2 = (k) aVar.e;
                kVar2.getClass();
                kVar2.R2("ignoreJustOnceLauncher", true);
                if (!((FullyActivity) aVar.f8656d).w()) {
                    dialogInterface.cancel();
                }
                Runnable runnable2 = this.f10511W;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                C0528a aVar2 = this.f10510V;
                k kVar3 = (k) aVar2.e;
                kVar3.getClass();
                kVar3.R2("kioskMode", false);
                aVar2.f8654b = false;
                if (a.p0()) {
                    LauncherReplacement.a((FullyActivity) aVar2.f8656d);
                }
                aVar2.d();
                dialogInterface.cancel();
                Runnable runnable3 = this.f10511W;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
