package D;

import A.g;
import A.h;
import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: D.k0  reason: case insensitive filesystem */
public class C0053k0 implements K {

    /* renamed from: V  reason: collision with root package name */
    public static final C0051j0 f918V;

    /* renamed from: W  reason: collision with root package name */
    public static final C0053k0 f919W;

    /* renamed from: U  reason: collision with root package name */
    public final TreeMap f920U;

    static {
        C0051j0 j0Var = new C0051j0(0);
        f918V = j0Var;
        f919W = new C0053k0(new TreeMap(j0Var));
    }

    public C0053k0(TreeMap treeMap) {
        this.f920U = treeMap;
    }

    public static C0053k0 a(K k8) {
        if (C0053k0.class.equals(k8.getClass())) {
            return (C0053k0) k8;
        }
        TreeMap treeMap = new TreeMap(f918V);
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

    public final Set J() {
        return DesugarCollections.unmodifiableSet(this.f920U.keySet());
    }

    public final void Q(g gVar) {
        for (Map.Entry entry : this.f920U.tailMap(new C0036c("camera2.captureRequest.option.", Void.class, (CaptureRequest.Key) null)).entrySet()) {
            if (((C0036c) entry.getKey()).f888a.startsWith("camera2.captureRequest.option.")) {
                C0036c cVar = (C0036c) entry.getKey();
                K k8 = (K) gVar.f20W;
                ((h) gVar.f19V).f22b.d(cVar, k8.m(cVar), k8.b0(cVar));
            } else {
                return;
            }
        }
    }

    public final Object Y(C0036c cVar, J j7) {
        Map map = (Map) this.f920U.get(cVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + cVar);
        } else if (map.containsKey(j7)) {
            return map.get(j7);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + cVar + " with priority=" + j7);
        }
    }

    public final Object b0(C0036c cVar) {
        Map map = (Map) this.f920U.get(cVar);
        if (map != null) {
            return map.get((J) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + cVar);
    }

    public final Set g(C0036c cVar) {
        Map map = (Map) this.f920U.get(cVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return DesugarCollections.unmodifiableSet(map.keySet());
    }

    public final J m(C0036c cVar) {
        Map map = (Map) this.f920U.get(cVar);
        if (map != null) {
            return (J) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + cVar);
    }

    public final Object o0(C0036c cVar, Object obj) {
        try {
            return b0(cVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    public final boolean q0(C0036c cVar) {
        return this.f920U.containsKey(cVar);
    }
}
