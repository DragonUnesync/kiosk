package o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.E;
import h.C1006G;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n.k;
import n.m;

public final class h1 implements C1283n, k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ Toolbar f13971U;

    public /* synthetic */ h1(Toolbar toolbar) {
        this.f13971U = toolbar;
    }

    public boolean q(m mVar, MenuItem menuItem) {
        C1006G g8 = this.f13971U.f7570L0;
        return false;
    }

    public void s(m mVar) {
        Toolbar toolbar = this.f13971U;
        C1277k kVar = toolbar.f7576U.f7448q0;
        if (kVar == null || !kVar.e()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f7562D0.f9767W).iterator();
            while (it.hasNext()) {
                ((E) it.next()).f7842a.t();
            }
        }
        C1006G g8 = toolbar.f7570L0;
        if (g8 != null) {
            g8.s(mVar);
        }
    }
}
