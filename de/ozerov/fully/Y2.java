package de.ozerov.fully;

import Q0.g;
import android.webkit.JavascriptInterface;
import n2.a;
import org.altbeacon.beacon.service.RangedBeacon;

public final class Y2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0803x3 f10513a;

    public Y2(C0803x3 x3Var) {
        this.f10513a = x3Var;
    }

    @JavascriptInterface
    public void onAutoplayBlocked(int i) {
        C0803x3 x3Var = this.f10513a;
        String str = x3Var.f11076a;
        a.b1(x3Var.f11077b, "Autoplay blocked");
    }

    @JavascriptInterface
    public void onPlayerError(int i) {
        C0803x3 x3Var = this.f10513a;
        String str = x3Var.f11076a;
        if (x3Var.f11082h.f10216b == 4) {
            StringBuilder p3 = g.p(i, "Error ", " when playing video ");
            p3.append(x3Var.f11082h.f10215a);
            a.b1(x3Var.f11077b, p3.toString());
            x3Var.f11087n.postDelayed(new W2(x3Var, 3), RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
        }
    }

    @JavascriptInterface
    public void onPlayerReady(int i) {
        String str = this.f10513a.f11076a;
    }

    @JavascriptInterface
    public void onPlayerStateChange(int i) {
        C0803x3 x3Var = this.f10513a;
        String str = x3Var.f11076a;
        O2 o2 = x3Var.f11082h;
        if (o2.f10216b == 4 && !o2.f10217c && i == 0) {
            x3Var.f11077b.runOnUiThread(new W2(x3Var, 3));
        }
        O2 o22 = x3Var.f11082h;
        if (o22.f10216b == 4 && o22.f10217c && i == 0) {
            x3Var.f11077b.runOnUiThread(new X2(this, 0));
        }
        O2 o23 = x3Var.f11082h;
        if (o23.f10216b == 5 && !o23.f10217c && i == 22) {
            x3Var.f11077b.runOnUiThread(new W2(x3Var, 3));
        }
        O2 o24 = x3Var.f11082h;
        if (o24.f10216b == 5 && o24.f10217c && i == 22) {
            x3Var.f11077b.runOnUiThread(new X2(this, 1));
        }
    }
}
