package de.ozerov.fully;

import android.content.Intent;
import android.view.View;

/* renamed from: de.ozerov.fully.a3  reason: case insensitive filesystem */
public final /* synthetic */ class C0666a3 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10550U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ProvisioningActivity f10551V;

    public /* synthetic */ C0666a3(ProvisioningActivity provisioningActivity, int i) {
        this.f10550U = i;
        this.f10551V = provisioningActivity;
    }

    public final void onClick(View view) {
        ProvisioningActivity provisioningActivity = this.f10551V;
        switch (this.f10550U) {
            case 0:
                int i = ProvisioningActivity.f10263k0;
                provisioningActivity.finish();
                return;
            case 1:
                int i8 = ProvisioningActivity.f10263k0;
                provisioningActivity.findViewById(2131362215).setVisibility(8);
                try {
                    provisioningActivity.startActivityForResult(new Intent("android.app.action.SET_NEW_PASSWORD"), 1015);
                    provisioningActivity.f10278i0 = true;
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 2:
                int i9 = ProvisioningActivity.f10263k0;
                provisioningActivity.d();
                provisioningActivity.h();
                return;
            case 3:
                int i10 = ProvisioningActivity.f10263k0;
                provisioningActivity.findViewById(2131362373).setVisibility(8);
                provisioningActivity.f10273d0.n(false, false, new C0678c3(provisioningActivity, 3));
                provisioningActivity.f10277h0 = true;
                return;
            default:
                int i11 = ProvisioningActivity.f10263k0;
                provisioningActivity.e();
                return;
        }
    }
}
