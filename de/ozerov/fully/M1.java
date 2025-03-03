package de.ozerov.fully;

import F5.g;
import F5.i;
import java.util.HashMap;

public final /* synthetic */ class M1 implements i, g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N1 f10093a;

    public /* synthetic */ M1(N1 n12) {
        this.f10093a = n12;
    }

    public void a() {
        g5 g5Var;
        N1 n12 = this.f10093a;
        if (n12.e.f9961z0.s1().booleanValue()) {
            FullyActivity fullyActivity = n12.e;
            if (!fullyActivity.f9920I0.f10190v && !fullyActivity.x("preferences") && !n12.e.x("order")) {
                n12.e.f9958x1.b();
            }
        }
        FullyActivity fullyActivity2 = n12.e;
        if (fullyActivity2.f9917F0 != null && !fullyActivity2.v() && !n12.e.y("playlistItemSelector") && !n12.e.f10981v0 && (g5Var = n12.e.f9917F0.f10711d) != null) {
            U0.e("onTabFocus", (HashMap) null);
            MyWebView myWebView = g5Var.f10664g;
            if (myWebView != null && myWebView.isFocusable()) {
                g5Var.f10664g.requestFocus();
            }
        }
    }
}
