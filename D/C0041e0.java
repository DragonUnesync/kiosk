package D;

import android.util.ArrayMap;
import j$.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: D.e0  reason: case insensitive filesystem */
public final class C0041e0 extends C0053k0 implements C0039d0 {
    /* JADX WARNING: type inference failed for: r0v0, types: [D.k0, D.e0] */
    public static C0041e0 b() {
        return new C0053k0(new TreeMap(C0053k0.f918V));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [D.k0, D.e0] */
    public static C0041e0 c(K k8) {
        TreeMap treeMap = new TreeMap(C0053k0.f918V);
        for (C0036c cVar : k8.J()) {
            Set<J> g8 = k8.g(cVar);
            ArrayMap arrayMap = new ArrayMap();
            for (J j7 : g8) {
                arrayMap.put(j7, k8.Y(cVar, j7));
            }
            treeMap.put(cVar, arrayMap);
        }
        return new C0053k0(treeMap);
    }

    public final void d(C0036c cVar, J j7, Object obj) {
        J j8;
        TreeMap treeMap = this.f920U;
        Map map = (Map) treeMap.get(cVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(cVar, arrayMap);
            arrayMap.put(j7, obj);
            return;
        }
        J j9 = (J) Collections.min(map.keySet());
        if (!Objects.equals(map.get(j9), obj) && j9 == (j8 = J.f797V) && j7 == j8) {
            throw new IllegalArgumentException("Option values conflicts: " + cVar.f888a + ", existing value (" + j9 + ")=" + map.get(j9) + ", conflicting (" + j7 + ")=" + obj);
        }
        map.put(j7, obj);
    }

    public final void e(C0036c cVar, Object obj) {
        d(cVar, J.f798W, obj);
    }
}
