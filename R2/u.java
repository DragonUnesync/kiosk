package r2;

import java.util.TreeMap;
import u2.q;
import v2.C1558a;

public final class u extends s {
    public final void a(C1387f fVar) {
        fVar.f14887f.p(this.f14903V);
        fVar.e.o(this.f14928W.f15760V.f15763U);
        C1558a aVar = ((q) this.f14928W).f15761W;
        z zVar = fVar.f14888g;
        synchronized (zVar) {
            if (aVar != null) {
                zVar.g();
                if (((y) ((TreeMap) zVar.f14942g).get(aVar)) == null) {
                    ((TreeMap) zVar.f14942g).put(aVar, new y(aVar));
                }
            } else {
                throw new NullPointerException("prototype == null");
            }
        }
    }

    public final q b() {
        return q.TYPE_METHOD_ID_ITEM;
    }

    public final int h(C1387f fVar) {
        z zVar = fVar.f14888g;
        C1558a aVar = ((q) this.f14928W).f15761W;
        if (aVar != null) {
            zVar.f();
            y yVar = (y) ((TreeMap) zVar.f14942g).get(aVar);
            if (yVar != null) {
                return yVar.e();
            }
            throw new IllegalArgumentException("not found");
        }
        zVar.getClass();
        throw new NullPointerException("prototype == null");
    }

    public final String i() {
        return "proto_idx";
    }
}
