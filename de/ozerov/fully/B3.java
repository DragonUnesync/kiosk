package de.ozerov.fully;

import Z1.c;
import android.os.Handler;
import d4.k;
import java.util.HashMap;
import n2.a;
import org.altbeacon.beacon.service.RangedBeacon;
import org.json.JSONObject;

public final /* synthetic */ class B3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9800U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ E3 f9801V;

    public /* synthetic */ B3(E3 e32, int i) {
        this.f9800U = i;
        this.f9801V = e32;
    }

    public final void run() {
        switch (this.f9800U) {
            case 0:
                E3 e32 = this.f9801V;
                if (e32.f9881a.w() && !e32.f9881a.f9950m1.f10018c.booleanValue()) {
                    e32.f9881a.f9917F0.n(C0778t2.b(e32.f9882b.N(), "INTERNET_DISCONNECT", (String) null), false);
                    return;
                }
                return;
            case 1:
                E3 e33 = this.f9801V;
                if (e33.f9881a.w() && !e33.f9881a.f9950m1.f10018c.booleanValue()) {
                    C0794w0.g(e33.f9881a);
                    new Handler().postDelayed(new B3(e33, 3), RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
                    return;
                }
                return;
            case 2:
                E3 e34 = this.f9801V;
                e34.a();
                FullyActivity fullyActivity = e34.f9881a;
                if (!fullyActivity.f9933V0.m()) {
                    fullyActivity.f9949l1.b();
                    return;
                }
                return;
            case 3:
                FullyActivity fullyActivity2 = this.f9801V.f9881a;
                if (fullyActivity2.w()) {
                    C0794w0.j(fullyActivity2);
                    return;
                }
                return;
            case 4:
                this.f9801V.a();
                return;
            case 5:
                FullyActivity fullyActivity3 = this.f9801V.f9881a;
                fullyActivity3.f9932U0.h(fullyActivity3);
                return;
            case 6:
                E3 e35 = this.f9801V;
                FullyActivity fullyActivity4 = e35.f9881a;
                fullyActivity4.f9917F0.s(true);
                k kVar = e35.f9882b;
                if (((c) kVar.f9767W).n("reloadOnInternet", false)) {
                    a.b1(fullyActivity4, "Reloading on Internet Reconnect...");
                    fullyActivity4.f9951n1.a();
                }
                ((c) kVar.f9767W).n("rewindOnInternet", false);
                U0.e("internetReconnect", (HashMap) null);
                fullyActivity4.f9935X0.b0("internetReconnect", (JSONObject) null);
                if (C0794w0.f11017a && C0794w0.f11018b != null) {
                    C0794w0.a();
                    C0794w0.f11018b.i++;
                    return;
                }
                return;
            case 7:
                E3 e36 = this.f9801V;
                FullyActivity fullyActivity5 = e36.f9881a;
                fullyActivity5.f9917F0.s(false);
                U0.e("internetDisconnect", (HashMap) null);
                fullyActivity5.f9935X0.b0("internetDisconnect", (JSONObject) null);
                k kVar2 = e36.f9882b;
                int O8 = kVar2.O();
                if (O8 != 0 && !kVar2.N().trim().isEmpty()) {
                    new Handler().postDelayed(new B3(e36, 0), ((long) O8) * 1000);
                }
                if (((c) kVar2.f9767W).n("resetWifiOnDisconnection", false)) {
                    new Handler().postDelayed(new B3(e36, 1), RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
                    return;
                }
                return;
            case 8:
                k kVar3 = this.f9801V.f9882b;
                kVar3.V2("systemWallpaperLastUrl", kVar3.j2());
                return;
            default:
                k kVar4 = this.f9801V.f9882b;
                kVar4.V2("lockscreenWallpaperLastUrl", kVar4.k1());
                return;
        }
    }
}
