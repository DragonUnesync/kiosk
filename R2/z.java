package r2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import u2.t;
import u2.u;
import v2.c;

public final class z extends F {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f14941f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f14942g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(C1387f fVar, int i) {
        super("proto_ids", fVar, 4);
        this.f14941f = i;
        switch (i) {
            case 1:
                super("string_ids", fVar, 4);
                this.f14942g = new TreeMap();
                return;
            case 2:
                super("type_ids", fVar, 4);
                this.f14942g = new TreeMap();
                return;
            case 3:
                super((String) null, fVar, 4);
                o oVar = new o();
                oVar.g(0);
                this.f14942g = Collections.singletonList(oVar);
                return;
            default:
                this.f14942g = new TreeMap();
                return;
        }
    }

    private final void r() {
    }

    public final Collection c() {
        switch (this.f14941f) {
            case 0:
                return ((TreeMap) this.f14942g).values();
            case 1:
                return ((TreeMap) this.f14942g).values();
            case 2:
                return ((TreeMap) this.f14942g).values();
            default:
                return (List) this.f14942g;
        }
    }

    public final void k() {
        switch (this.f14941f) {
            case 0:
                int i = 0;
                for (y g8 : ((TreeMap) this.f14942g).values()) {
                    g8.g(i);
                    i++;
                }
                return;
            case 1:
                int i8 = 0;
                for (C1379C g9 : ((TreeMap) this.f14942g).values()) {
                    g9.g(i8);
                    i8++;
                }
                return;
            case 2:
                int i9 = 0;
                for (C1380D g10 : ((TreeMap) this.f14942g).values()) {
                    g10.g(i9);
                    i9++;
                }
                return;
            default:
                return;
        }
    }

    public int l(t tVar) {
        if (tVar != null) {
            f();
            C1379C c8 = (C1379C) ((TreeMap) this.f14942g).get(tVar);
            if (c8 != null) {
                return c8.e();
            }
            throw new IllegalArgumentException("not found");
        }
        throw new NullPointerException("string == null");
    }

    public int m(u uVar) {
        if (uVar != null) {
            return n(uVar.f15772U);
        }
        throw new NullPointerException("type == null");
    }

    public int n(c cVar) {
        if (cVar != null) {
            f();
            C1380D d8 = (C1380D) ((TreeMap) this.f14942g).get(cVar);
            if (d8 != null) {
                return d8.e();
            }
            throw new IllegalArgumentException("not found: " + cVar);
        }
        throw new NullPointerException("type == null");
    }

    public void o(t tVar) {
        C1379C c8 = new C1379C(tVar);
        synchronized (this) {
            g();
            if (((C1379C) ((TreeMap) this.f14942g).get(tVar)) == null) {
                ((TreeMap) this.f14942g).put(tVar, c8);
            }
        }
    }

    public synchronized void p(u uVar) {
        if (uVar != null) {
            g();
            c cVar = uVar.f15772U;
            if (((C1380D) ((TreeMap) this.f14942g).get(cVar)) == null) {
                ((TreeMap) this.f14942g).put(cVar, new n(uVar));
            }
        } else {
            throw new NullPointerException("type == null");
        }
    }

    public synchronized void q(c cVar) {
        if (cVar != null) {
            g();
            if (((C1380D) ((TreeMap) this.f14942g).get(cVar)) == null) {
                ((TreeMap) this.f14942g).put(cVar, new n(new u(cVar)));
            }
        } else {
            throw new NullPointerException("type == null");
        }
    }
}
