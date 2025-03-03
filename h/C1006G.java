package h;

import android.view.MenuItem;
import android.view.View;
import n.k;
import n.m;
import o.l1;

/* renamed from: h.G  reason: case insensitive filesystem */
public final class C1006G implements l1, k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1007H f12112U;

    public /* synthetic */ C1006G(C1007H h5) {
        this.f12112U = h5;
    }

    public boolean q(m mVar, MenuItem menuItem) {
        return false;
    }

    public void s(m mVar) {
        C1007H h5 = this.f12112U;
        boolean p3 = h5.f12113a.f14023a.p();
        w wVar = h5.f12114b;
        if (p3) {
            wVar.onPanelClosed(108, mVar);
        } else if (wVar.onPreparePanel(0, (View) null, mVar)) {
            wVar.onMenuOpened(108, mVar);
        }
    }
}
