package de.ozerov.fully;

import d4.k;

/* renamed from: de.ozerov.fully.d3  reason: case insensitive filesystem */
public final /* synthetic */ class C0684d3 implements C2 {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10600U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ProvisioningActivity f10601V;

    public /* synthetic */ C0684d3(ProvisioningActivity provisioningActivity, int i) {
        this.f10600U = i;
        this.f10601V = provisioningActivity;
    }

    public final void j(String str) {
        ProvisioningActivity provisioningActivity = this.f10601V;
        switch (this.f10600U) {
            case 0:
                int i = ProvisioningActivity.f10263k0;
                if (str == null) {
                    provisioningActivity.b(0, "Done", "Settings imported successfully from " + provisioningActivity.f10274e0, false);
                    k kVar = provisioningActivity.f10264U;
                    kVar.getClass();
                    kVar.R2("isSettingImportedFromAssets", true);
                } else {
                    provisioningActivity.a(2, str);
                }
                provisioningActivity.g();
                return;
            default:
                int i8 = ProvisioningActivity.f10263k0;
                if (str == null) {
                    provisioningActivity.b(0, "Done", "Settings imported successfully from " + provisioningActivity.f10269Z, false);
                    k kVar2 = provisioningActivity.f10264U;
                    kVar2.getClass();
                    kVar2.R2("isSettingImportedFromAssets", true);
                } else {
                    provisioningActivity.a(2, str);
                }
                provisioningActivity.g();
                return;
        }
    }
}
