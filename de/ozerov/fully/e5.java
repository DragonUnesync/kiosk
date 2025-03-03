package de.ozerov.fully;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;

public final class e5 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10616U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ g5 f10617V;

    public /* synthetic */ e5(g5 g5Var, int i) {
        this.f10616U = i;
        this.f10617V = g5Var;
    }

    public final void run() {
        switch (this.f10616U) {
            case 0:
                if (!this.f10617V.f10664g.f10139t0) {
                    g5 g5Var = this.f10617V;
                    if (g5Var.f10664g.f10125e0 != null && !g5Var.f10677u.N().equals("")) {
                        g5 g5Var2 = this.f10617V;
                        if (g5Var2.f10664g.f10125e0.startsWith(g5Var2.f10677u.N()) && this.f10617V.f10664g.canGoBackOrForward(-2)) {
                            this.f10617V.f10664g.goBackOrForward(-2);
                            return;
                        }
                    }
                    WebBackForwardList copyBackForwardList = this.f10617V.f10664g.copyBackForwardList();
                    WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1);
                    if (itemAtIndex == null) {
                        return;
                    }
                    if (!itemAtIndex.getUrl().equals("about:blank") || !this.f10617V.f10664g.canGoBackOrForward(-2)) {
                        this.f10617V.f10664g.goBackOrForward(-1);
                        return;
                    } else {
                        this.f10617V.f10664g.goBackOrForward(-2);
                        return;
                    }
                } else {
                    this.f10617V.f10678v.postDelayed(this, 100);
                    return;
                }
            default:
                if (!this.f10617V.f10664g.f10139t0) {
                    this.f10617V.f10664g.goForward();
                    return;
                } else {
                    this.f10617V.f10678v.postDelayed(this, 100);
                    return;
                }
        }
    }
}
