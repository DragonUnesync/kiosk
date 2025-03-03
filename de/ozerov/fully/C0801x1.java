package de.ozerov.fully;

import Q0.g;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import n2.a;

/* renamed from: de.ozerov.fully.x1  reason: case insensitive filesystem */
public final /* synthetic */ class C0801x1 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f11067U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0813z1 f11068V;

    public /* synthetic */ C0801x1(C0813z1 z1Var, int i) {
        this.f11067U = i;
        this.f11068V = z1Var;
    }

    public final void onClick(View view) {
        C0813z1 z1Var = this.f11068V;
        switch (this.f11067U) {
            case 0:
                z1Var.getClass();
                new C0807y1(z1Var, 0).execute(new Void[0]);
                return;
            case 1:
                z1Var.S();
                try {
                    z1Var.f9851g1.startActivityForResult(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + z1Var.f9851g1.getPackageName())), 1021);
                    return;
                } catch (Exception e) {
                    a.b1(z1Var.f9851g1, "Failed to get permission for All Files Access");
                    g.x(e, new StringBuilder("Manage storage permission failed due to "), "z1");
                    return;
                }
            default:
                z1Var.S();
                return;
        }
    }
}
