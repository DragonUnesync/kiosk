package r2;

import java.util.Collection;
import java.util.TreeMap;
import u2.h;

public final class l extends t {

    /* renamed from: f  reason: collision with root package name */
    public final TreeMap f14902f = new TreeMap();

    public l(C1387f fVar) {
        super("field_ids", fVar, 4);
    }

    public final Collection c() {
        return this.f14902f.values();
    }

    public final int l(h hVar) {
        if (hVar != null) {
            f();
            k kVar = (k) this.f14902f.get(hVar);
            if (kVar != null) {
                return kVar.e();
            }
            throw new IllegalArgumentException("not found");
        }
        throw new NullPointerException("ref == null");
    }

    public final synchronized void m(h hVar) {
        if (hVar != null) {
            g();
            if (((k) this.f14902f.get(hVar)) == null) {
                this.f14902f.put(hVar, new s(hVar));
            }
        } else {
            throw new NullPointerException("field == null");
        }
    }
}
