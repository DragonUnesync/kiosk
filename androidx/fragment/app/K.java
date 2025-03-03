package androidx.fragment.app;

import Q0.g;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class K implements I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f7856a;

    public K(L l8) {
        this.f7856a = l8;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        L l8 = this.f7856a;
        l8.getClass();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + l8.f7873a);
        }
        boolean z = false;
        if (l8.f7876d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
        } else {
            C0450a aVar = (C0450a) g.l(1, l8.f7876d);
            l8.f7879h = aVar;
            Iterator it = aVar.f7955a.iterator();
            while (it.hasNext()) {
                C0470v vVar = ((S) it.next()).f7929b;
                if (vVar != null) {
                    vVar.f8071g0 = true;
                }
            }
            z = l8.T(arrayList, arrayList2, -1, 0);
        }
        if (!l8.f7884n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(L.E((C0450a) it2.next()));
            }
            Iterator it3 = l8.f7884n.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        C0470v vVar2 = (C0470v) it4.next();
                        throw null;
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
        return z;
    }
}
