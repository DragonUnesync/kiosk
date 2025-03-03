package de.ozerov.fully;

import B3.q;
import android.app.admin.DevicePolicyManager;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.HashMap;
import n2.a;

public final /* synthetic */ class K0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10038U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U0 f10039V;

    public /* synthetic */ K0(U0 u02, int i) {
        this.f10038U = i;
        this.f10039V = u02;
    }

    public final void run() {
        switch (this.f10038U) {
            case 0:
                FullyActivity fullyActivity = this.f10039V.f10414a;
                fullyActivity.f9949l1.c();
                fullyActivity.f9919H0.b();
                return;
            case 1:
                this.f10039V.f10414a.f9917F0.q();
                return;
            case 2:
                this.f10039V.f10414a.f9917F0.h();
                return;
            case 3:
                this.f10039V.f10414a.f9943f1.d();
                return;
            case 4:
                FullyActivity fullyActivity2 = this.f10039V.f10414a;
                P.O();
                return;
            case 5:
                FullyActivity fullyActivity3 = this.f10039V.f10414a;
                fullyActivity3.f9949l1.c();
                fullyActivity3.f9919H0.b();
                return;
            case 6:
                this.f10039V.f10414a.f9917F0.g();
                return;
            case 7:
                this.f10039V.f10414a.f9921J0.b();
                return;
            case 8:
                C0794w0.v0(this.f10039V.f10414a);
                return;
            case 9:
                MyWebView.e(this.f10039V.f10414a);
                return;
            case 10:
                this.f10039V.f10414a.moveTaskToBack(true);
                return;
            case 11:
                this.f10039V.f10414a.f9946i1.f((String) null);
                return;
            case 12:
                this.f10039V.f10414a.f9944g1.d(100);
                return;
            case 13:
                this.f10039V.f10414a.f9919H0.d(true);
                return;
            case EnterpriseDeviceManager.KNOX_2_3:
                this.f10039V.f10414a.f9943f1.f();
                return;
            case EnterpriseDeviceManager.KNOX_2_4:
                this.f10039V.f10414a.f9921J0.c();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                this.f10039V.f10414a.f9928Q0.b(true, (Runnable) null);
                return;
            case EnterpriseDeviceManager.KNOX_2_5:
                this.f10039V.f10416c.d();
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                this.f10039V.f10414a.f9951n1.getClass();
                return;
            case EnterpriseDeviceManager.KNOX_2_6:
                this.f10039V.f10416c.getWebTab().k();
                return;
            case EnterpriseDeviceManager.KNOX_2_7:
                V4 v4 = this.f10039V.f10414a.f9928Q0;
                C0740n nVar = v4.f10445c;
                if (nVar != null) {
                    nVar.h();
                    v4.f10445c.f10820b.setVisibility(8);
                    return;
                }
                return;
            case 21:
                this.f10039V.f10414a.f9919H0.g();
                return;
            case 22:
                FullyActivity fullyActivity4 = this.f10039V.f10414a;
                C0794w0.K0(fullyActivity4, fullyActivity4.f9961z0.Z().booleanValue());
                return;
            case 23:
                FullyActivity fullyActivity5 = this.f10039V.f10414a;
                fullyActivity5.f9921J0.d();
                fullyActivity5.f9919H0.b();
                C0794w0.q0(0, "JsInterface", "Kiosk unlocked by JS API");
                return;
            case 24:
                g5 g5Var = this.f10039V.f10414a.f9917F0.f10711d;
                if (g5Var != null) {
                    U0.e("onTabFocus", (HashMap) null);
                    MyWebView myWebView = g5Var.f10664g;
                    if (myWebView != null && myWebView.isFocusable()) {
                        g5Var.f10664g.requestFocus();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                this.f10039V.f10414a.f9942e1.a();
                return;
            case 26:
                U0 u02 = this.f10039V;
                u02.f10414a.f9917F0.e(u02.f10416c.getWebTab());
                return;
            case 27:
                FullyActivity fullyActivity6 = this.f10039V.f10414a;
                if (!C0794w0.Z(fullyActivity6) || !a.z0()) {
                    P.K();
                    return;
                } else {
                    ((DevicePolicyManager) fullyActivity6.getSystemService("device_policy")).reboot(DeviceOwnerReceiver.a(fullyActivity6));
                    return;
                }
            case 28:
                q.s0(this.f10039V.f10414a.f9943f1.f11042a, true, true);
                return;
            default:
                U0 u03 = this.f10039V;
                u03.f10414a.f9917F0.i(u03.f10416c.getWebTab());
                return;
        }
    }
}
