package de.ozerov.fully;

import android.os.Handler;
import android.util.Log;
import n2.a;

/* renamed from: de.ozerov.fully.k  reason: case insensitive filesystem */
public final /* synthetic */ class C0722k implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10762U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0740n f10763V;

    public /* synthetic */ C0722k(C0740n nVar, int i) {
        this.f10762U = i;
        this.f10763V = nVar;
    }

    public final void run() {
        C0740n nVar = this.f10763V;
        switch (this.f10762U) {
            case 0:
                nVar.f10829m = false;
                return;
            case 1:
                if (nVar.f10826j || nVar.f10827k) {
                    nVar.f10824g.setVisibility(8);
                    nVar.f10822d.setVisibility(8);
                    K4 k42 = nVar.f10821c;
                    if (k42.e == 1) {
                        k42.f10053a.suspend();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (!nVar.f10826j && !nVar.f10827k) {
                    nVar.f10822d.setAlpha(1.0f);
                    nVar.f10824g.animate().alpha(0.0f).setDuration((long) (nVar.f10840x / 2));
                    new Handler().postDelayed(new C0722k(nVar, 5), (long) (nVar.f10840x / 2));
                    return;
                }
                return;
            case 3:
                Runnable runnable = nVar.f10817G;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                Runnable runnable2 = nVar.f10817G;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 5:
                if (!nVar.f10826j && !nVar.f10827k) {
                    nVar.f10824g.setVisibility(8);
                    return;
                }
                return;
            case 6:
                nVar.f10823f.setVisibility(8);
                return;
            case 7:
                Runnable runnable3 = nVar.f10815E;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 8:
                Log.w("n", "Timeout loading media " + nVar.f10830n);
                a.a1(0, nVar.f10819a, "Timeout loading media: " + nVar.f10830n);
                nVar.p();
                return;
            case 9:
                if (nVar.f10826j || nVar.f10827k) {
                    nVar.f10822d.setAlpha(0.0f);
                    nVar.f10824g.animate().alpha(0.0f).setDuration((long) (nVar.f10841y / 2));
                    new Handler().postDelayed(new C0722k(nVar, 1), (long) (nVar.f10841y / 2));
                    return;
                }
                return;
            case 10:
                W2 w2 = nVar.f10814D;
                if (w2 != null) {
                    w2.run();
                    return;
                }
                return;
            default:
                nVar.p();
                return;
        }
    }
}
