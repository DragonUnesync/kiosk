package androidx.fragment.app;

import U.p;
import android.util.Log;
import androidx.activity.t;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7838a = false;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f7839b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public t f7840c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L f7841d;

    public D(L l8) {
        this.f7841d = l8;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        L l8 = this.f7841d;
        if (isLoggable) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + l8);
        }
        l8.getClass();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + l8.f7879h);
        }
        C0450a aVar = l8.f7879h;
        if (aVar != null) {
            aVar.f7971s = false;
            aVar.d();
            C0450a aVar2 = l8.f7879h;
            p pVar = new p(12, (Object) l8);
            if (aVar2.f7969q == null) {
                aVar2.f7969q = new ArrayList();
            }
            aVar2.f7969q.add(pVar);
            l8.f7879h.e(false, true);
            l8.i = true;
            l8.z(true);
            l8.D();
            l8.i = false;
            l8.f7879h = null;
        }
    }
}
