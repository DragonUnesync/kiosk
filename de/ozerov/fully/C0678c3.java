package de.ozerov.fully;

/* renamed from: de.ozerov.fully.c3  reason: case insensitive filesystem */
public final /* synthetic */ class C0678c3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10581U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ProvisioningActivity f10582V;

    public /* synthetic */ C0678c3(ProvisioningActivity provisioningActivity, int i) {
        this.f10581U = i;
        this.f10582V = provisioningActivity;
    }

    public final void run() {
        ProvisioningActivity provisioningActivity = this.f10582V;
        switch (this.f10581U) {
            case 0:
                int i = ProvisioningActivity.f10263k0;
                provisioningActivity.k();
                return;
            case 1:
                int i8 = ProvisioningActivity.f10263k0;
                provisioningActivity.getClass();
                C0794w0.A0(provisioningActivity, false, false);
                return;
            case 2:
                int i9 = ProvisioningActivity.f10263k0;
                provisioningActivity.i();
                return;
            default:
                int i10 = ProvisioningActivity.f10263k0;
                provisioningActivity.g();
                return;
        }
    }
}
