package de.ozerov.fully;

import android.app.Dialog;
import android.app.admin.DevicePolicyManager;
import android.content.DialogInterface;
import n2.a;

/* renamed from: de.ozerov.fully.d2  reason: case insensitive filesystem */
public final /* synthetic */ class C0683d2 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10598U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10599V;

    public /* synthetic */ C0683d2(C0695f2 f2Var, int i) {
        this.f10598U = i;
        this.f10599V = f2Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10598U) {
            case 0:
                C0695f2 f2Var = this.f10599V;
                if (C0794w0.Z(f2Var.f10627V)) {
                    ((DevicePolicyManager) f2Var.f10627V.getSystemService("device_policy")).clearDeviceOwnerApp(f2Var.f10627V.getPackageName());
                    f2Var.getPreferenceScreen().removeAll();
                    f2Var.addPreferencesFromResource(2132148232);
                    f2Var.d();
                } else {
                    a.b1(f2Var.f10627V, "The app was not device owner");
                }
                dialogInterface.cancel();
                Dialog dialog = f2Var.f10632a0;
                if (dialog != null && dialog.isShowing()) {
                    f2Var.f10632a0.dismiss();
                    return;
                }
                return;
            default:
                C0695f2 f2Var2 = this.f10599V;
                f2Var2.f10626U.P2();
                f2Var2.getPreferenceScreen().removeAll();
                f2Var2.addPreferencesFromResource(2132148232);
                f2Var2.d();
                dialogInterface.cancel();
                Dialog dialog2 = f2Var2.f10632a0;
                if (dialog2 != null && dialog2.isShowing()) {
                    f2Var2.f10632a0.dismiss();
                    return;
                }
                return;
        }
    }
}
