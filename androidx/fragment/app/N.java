package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class N extends M {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7904a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7905b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7906c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7907d;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7908f = false;

    public N(boolean z) {
        this.f7907d = z;
    }

    public final void b(C0470v vVar, boolean z) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + vVar);
        }
        d(vVar.f8063Y, z);
    }

    public final void c(String str, boolean z) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z);
    }

    public final void d(String str, boolean z) {
        HashMap hashMap = this.f7905b;
        N n4 = (N) hashMap.get(str);
        if (n4 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(n4.f7905b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n4.c((String) it.next(), true);
                }
            }
            n4.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f7906c;
        O o2 = (O) hashMap2.get(str);
        if (o2 != null) {
            o2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(C0470v vVar) {
        if (this.f7908f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f7904a.remove(vVar.f8063Y) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + vVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n4 = (N) obj;
        if (!this.f7904a.equals(n4.f7904a) || !this.f7905b.equals(n4.f7905b) || !this.f7906c.equals(n4.f7906c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f7905b.hashCode();
        return this.f7906c.hashCode() + ((hashCode + (this.f7904a.hashCode() * 31)) * 31);
    }

    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f7904a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f7905b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f7906c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
