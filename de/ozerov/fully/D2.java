package de.ozerov.fully;

import B3.n;
import android.app.ActivityManager;
import android.util.Log;
import n2.a;

public final /* synthetic */ class D2 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9857U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ G2 f9858V;

    public /* synthetic */ D2(G2 g22, int i) {
        this.f9857U = i;
        this.f9858V = g22;
    }

    public final void run() {
        switch (this.f9857U) {
            case 0:
                G2 g22 = this.f9858V;
                if (g22.f9969d != null) {
                    FullyActivity fullyActivity = g22.f9966a;
                    if (fullyActivity.w()) {
                        try {
                            ((ActivityManager) fullyActivity.getSystemService("activity")).killBackgroundProcesses(g22.f9969d);
                        } catch (Exception unused) {
                            Log.e("OtherAppManager", "Can't kill background process for " + g22.f9969d);
                        }
                        g22.f9969d = null;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                G2 g23 = this.f9858V;
                FullyActivity fullyActivity2 = g23.f9966a;
                if (fullyActivity2.w()) {
                    fullyActivity2.f9921J0.a();
                    g23.f9975l = null;
                    a.b1(fullyActivity2, "Unlock kiosk by Fully due to test mode");
                    return;
                }
                return;
            case 2:
                this.f9858V.f9970f = false;
                return;
            case 3:
                G2 g24 = this.f9858V;
                if (!g24.f9966a.f10980u0 || g24.f9970f || !g24.f9966a.f9921J0.i()) {
                    n nVar = g24.f9974k;
                    if (nVar != null) {
                        nVar.a(3);
                    }
                    g24.f9974k = null;
                    return;
                }
                g24.d();
                return;
            case 4:
                G2 g25 = this.f9858V;
                n nVar2 = g25.f9974k;
                if (nVar2 != null) {
                    nVar2.a(3);
                }
                g25.f9974k = null;
                g25.f9971g = false;
                g25.a(0);
                return;
            case 5:
                G2 g26 = this.f9858V;
                FullyActivity fullyActivity3 = g26.f9966a;
                if (fullyActivity3.w() && fullyActivity3.f9921J0.i()) {
                    g26.f();
                    return;
                }
                return;
            default:
                G2 g27 = this.f9858V;
                FullyActivity fullyActivity4 = g27.f9966a;
                if (fullyActivity4.w() && fullyActivity4.f9921J0.i()) {
                    g27.e();
                    return;
                }
                return;
        }
    }
}
