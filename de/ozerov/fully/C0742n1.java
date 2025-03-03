package de.ozerov.fully;

import Q.h;
import android.content.DialogInterface;
import android.util.Log;
import d4.k;

/* renamed from: de.ozerov.fully.n1  reason: case insensitive filesystem */
public final /* synthetic */ class C0742n1 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10844U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0686e f10845V;

    public /* synthetic */ C0742n1(C0686e eVar, int i) {
        this.f10844U = i;
        this.f10845V = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10844U) {
            case 0:
                ((FullyActivity) ((h) this.f10845V.f10605b).f4005V).f9925N0.h();
                dialogInterface.cancel();
                return;
            default:
                C0686e eVar = this.f10845V;
                eVar.getClass();
                Log.w("LicenseManager", "User selected to forget the changed device ID");
                C0794w0.q0(1, "LicenseManager", "User selected to forget the changed device ID");
                h hVar = (h) eVar.f10605b;
                ((k) hVar.f4006W).T2("");
                ((k) hVar.f4006W).V2("licenseVolumeKey", "");
                dialogInterface.cancel();
                return;
        }
    }
}
