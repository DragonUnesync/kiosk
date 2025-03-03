package de.ozerov.fully;

import android.content.DialogInterface;
import android.util.Log;
import b3.C0528a;
import d4.k;

public final /* synthetic */ class E1 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9875U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9876V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ k f9877W;

    public /* synthetic */ E1(MainActivity mainActivity, k kVar, int i) {
        this.f9875U = i;
        this.f9876V = mainActivity;
        this.f9877W = kVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.f9876V;
        k kVar = this.f9877W;
        switch (this.f9875U) {
            case 0:
                int i8 = MainActivity.f10101U;
                mainActivity.getClass();
                C0528a.k(mainActivity);
                kVar.getClass();
                kVar.R2("ignoreJustOnceLauncher", false);
                mainActivity.finish();
                return;
            default:
                int i9 = MainActivity.f10101U;
                mainActivity.getClass();
                try {
                    dialogInterface.cancel();
                    kVar.getClass();
                    kVar.R2("kioskMode", false);
                    LauncherReplacement.a(mainActivity);
                    mainActivity.finish();
                    return;
                } catch (Exception e) {
                    Log.e("MainActivity", "Failed disabling Kiosk mode");
                    e.printStackTrace();
                    return;
                }
        }
    }
}
