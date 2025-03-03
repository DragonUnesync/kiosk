package w;

import F.i;
import android.os.Build;
import h.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.C1442B;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final u f16176a;

    public v(ArrayList arrayList, i iVar, C1442B b8) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f16176a = new t(arrayList, iVar, b8);
        } else {
            this.f16176a = new s(arrayList, iVar, b8);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t.d(((i) it.next()).f16153a.c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        return this.f16176a.equals(((v) obj).f16176a);
    }

    public final int hashCode() {
        return this.f16176a.hashCode();
    }
}
