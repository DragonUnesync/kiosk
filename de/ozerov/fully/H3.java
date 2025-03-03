package de.ozerov.fully;

import Z1.c;
import android.app.AlertDialog;
import android.view.View;
import d4.k;
import n2.a;

public final /* synthetic */ class H3 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10000U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ J3 f10001V;

    public /* synthetic */ H3(J3 j32, int i) {
        this.f10000U = i;
        this.f10001V = j32;
    }

    public final void onClick(View view) {
        J3 j32 = this.f10001V;
        switch (this.f10000U) {
            case 0:
                j32.P();
                if (j32.f10028Q0.e2().equals("")) {
                    a.b1(j32.f10027P0, "Please select the Single App to run");
                    return;
                } else if (P.y(j32.f10027P0)) {
                    a.b1(j32.f10027P0, "It's impossible to enable the single app mode on Android TV devices");
                    return;
                } else if (j32.f10028Q0.d0().length() >= 4) {
                    k kVar = j32.f10028Q0;
                    kVar.getClass();
                    kVar.R2("kioskMode", true);
                    k kVar2 = j32.f10028Q0;
                    kVar2.getClass();
                    kVar2.R2("singleAppMode", true);
                    j32.f10027P0.f9952o1.c();
                    return;
                } else {
                    return;
                }
            case 1:
                if (((c) j32.f10028Q0.f9767W).n("kioskTestMode", false)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(j32.f10027P0);
                    builder.setTitle("Keep Test Mode on?");
                    builder.setMessage("Test mode is enabled. In test mode Fully will unlock kiosk and get back from your single app after 60 seconds automatically. Do you want to keep it on?");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes", new I3(j32, 0));
                    builder.setNegativeButton("No", new I3(j32, 1));
                    a.Z0(builder.create());
                    return;
                }
                j32.f10027P0.f9921J0.c();
                j32.f10027P0.f9949l1.b();
                return;
            case 2:
                j32.f10027P0.f9921J0.g();
                return;
            default:
                j32.getClass();
                C0805y yVar = new C0805y();
                yVar.f11105q1 = "Pick application";
                yVar.f11106r1 = true;
                yVar.f11111z1 = new androidx.camera.lifecycle.c(11, j32);
                yVar.T(j32.f10027P0.l(), "AppPicker");
                return;
        }
    }
}
