package t2;

import F.b;
import j$.util.concurrent.ConcurrentHashMap;
import u2.C1490a;
import u2.t;
import v2.c;
import v2.d;
import y2.C1632g;

public final class k implements d, C1632g, Comparable {

    /* renamed from: W  reason: collision with root package name */
    public static final ConcurrentHashMap f15202W = new ConcurrentHashMap(10000, 0.75f);

    /* renamed from: X  reason: collision with root package name */
    public static final b f15203X = new b(3);

    /* renamed from: U  reason: collision with root package name */
    public final int f15204U;

    /* renamed from: V  reason: collision with root package name */
    public final d f15205V;

    public k(int i, d dVar) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        } else if (dVar != null) {
            this.f15204U = i;
            this.f15205V = dVar;
        } else {
            throw new NullPointerException("type == null");
        }
    }

    public static k e(int i, d dVar) {
        j jVar = (j) f15203X.get();
        jVar.f15200a = i;
        jVar.f15201b = dVar;
        ConcurrentHashMap concurrentHashMap = f15202W;
        k kVar = (k) concurrentHashMap.get(jVar);
        if (kVar == null) {
            kVar = new k(jVar.f15200a, jVar.f15201b);
            k kVar2 = (k) concurrentHashMap.putIfAbsent(kVar, kVar);
            if (kVar2 != null) {
                return kVar2;
            }
        }
        return kVar;
    }

    public final String a() {
        return h(true);
    }

    public final boolean b(int i, d dVar) {
        if (this.f15204U != i || !this.f15205V.equals(dVar)) {
            return false;
        }
        return true;
    }

    public final int c() {
        return this.f15205V.c();
    }

    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int i = kVar.f15204U;
        int i8 = this.f15204U;
        if (i8 < i) {
            return -1;
        }
        if (i8 > i) {
            return 1;
        }
        if (this != kVar) {
            int compareTo = this.f15205V.getType().f16075U.compareTo(kVar.f15205V.getType().f16075U);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final int d() {
        return this.f15205V.getType().d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return b(kVar.f15204U, kVar.f15205V);
        } else if (!(obj instanceof j)) {
            return false;
        } else {
            j jVar = (j) obj;
            return b(jVar.f15200a, jVar.f15201b);
        }
    }

    public final boolean f() {
        int i = this.f15205V.getType().f16076V;
        if (i == 4 || i == 7) {
            return true;
        }
        return false;
    }

    public final String g() {
        return "v" + this.f15204U;
    }

    public final c getType() {
        return this.f15205V.getType();
    }

    public final String h(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(g());
        sb.append(":");
        d dVar = this.f15205V;
        c type = dVar.getType();
        sb.append(type);
        if (type != dVar) {
            sb.append("=");
            if (z && (dVar instanceof t)) {
                sb.append(((t) dVar).f());
            } else if (!z || !(dVar instanceof C1490a)) {
                sb.append(dVar);
            } else {
                sb.append(dVar.a());
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return (this.f15205V.hashCode() * 31) + this.f15204U;
    }

    public final String toString() {
        return h(false);
    }
}
