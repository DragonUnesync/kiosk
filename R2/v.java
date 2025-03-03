package r2;

import java.util.Collection;
import java.util.TreeMap;
import u2.q;

public final class v extends t {

    /* renamed from: f  reason: collision with root package name */
    public final TreeMap f14929f = new TreeMap();

    public v(C1387f fVar) {
        super("method_ids", fVar, 4);
    }

    public final Collection c() {
        return this.f14929f.values();
    }

    public final int l(q qVar) {
        if (qVar != null) {
            f();
            u uVar = (u) this.f14929f.get(qVar);
            if (uVar != null) {
                return uVar.e();
            }
            throw new IllegalArgumentException("not found");
        }
        throw new NullPointerException("ref == null");
    }

    public final synchronized void m(q qVar) {
        if (qVar != null) {
            g();
            if (((u) this.f14929f.get(qVar)) == null) {
                this.f14929f.put(qVar, new s(qVar));
            }
        } else {
            throw new NullPointerException("method == null");
        }
    }
}
