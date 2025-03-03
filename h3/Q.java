package H3;

import java.io.Serializable;

public class Q extends C0101s implements Serializable {

    /* renamed from: X  reason: collision with root package name */
    public final transient n0 f2028X;

    public Q(n0 n0Var, int i) {
        this.f2028X = n0Var;
    }

    public final boolean b(Object obj) {
        if (obj == null || !super.b(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public n0 a() {
        return this.f2028X;
    }

    public final O d(String str) {
        O o2 = (O) this.f2028X.get(str);
        if (o2 != null) {
            return o2;
        }
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final U e() {
        return this.f2028X.keySet();
    }
}
