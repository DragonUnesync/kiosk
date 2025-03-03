package H0;

import P6.f;
import android.util.Log;
import androidx.fragment.app.C0470v;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1812a = c.f1811a;

    public static c a(C0470v vVar) {
        while (vVar != null) {
            if (vVar.p()) {
                vVar.l();
            }
            vVar = vVar.f8080q0;
        }
        return f1812a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1805U.getClass().getName()), aVar);
        }
    }

    public static final void c(C0470v vVar, String str) {
        f.e(vVar, "fragment");
        f.e(str, "previousFragmentId");
        b(new a(vVar, "Attempting to reuse fragment " + vVar + " with previous ID " + str));
        a(vVar).getClass();
    }
}
