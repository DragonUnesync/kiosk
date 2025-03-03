package H3;

import N7.a;
import Y.c;
import Y.e;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: H3.w  reason: case insensitive filesystem */
public final class C0105w extends AbstractSet {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2130U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Map f2131V;

    public /* synthetic */ C0105w(Map map, int i) {
        this.f2130U = i;
        this.f2131V = map;
    }

    public void clear() {
        switch (this.f2130U) {
            case 0:
                ((C0107y) this.f2131V).clear();
                return;
            case 1:
                ((C0107y) this.f2131V).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    public boolean contains(Object obj) {
        switch (this.f2130U) {
            case 0:
                C0107y yVar = (C0107y) this.f2131V;
                Map c8 = yVar.c();
                if (c8 != null) {
                    return c8.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = yVar.e(entry.getKey());
                    if (e == -1 || !a.e(yVar.l()[e], entry.getValue())) {
                        return false;
                    }
                    return true;
                }
                return false;
            case 1:
                return ((C0107y) this.f2131V).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.f2130U) {
            case 0:
                C0107y yVar = (C0107y) this.f2131V;
                Map c8 = yVar.c();
                if (c8 != null) {
                    return c8.entrySet().iterator();
                }
                return new C0104v(yVar, 1);
            case 1:
                C0107y yVar2 = (C0107y) this.f2131V;
                Map c9 = yVar2.c();
                if (c9 != null) {
                    return c9.keySet().iterator();
                }
                return new C0104v(yVar2, 0);
            default:
                return new c((e) this.f2131V);
        }
    }

    public boolean remove(Object obj) {
        switch (this.f2130U) {
            case 0:
                C0107y yVar = (C0107y) this.f2131V;
                Map c8 = yVar.c();
                if (c8 != null) {
                    return c8.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!yVar.g()) {
                        int d8 = yVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = yVar.f2137U;
                        Objects.requireNonNull(obj2);
                        int r8 = C0103u.r(key, value, d8, obj2, yVar.i(), yVar.j(), yVar.l());
                        if (r8 != -1) {
                            yVar.f(r8, d8);
                            yVar.f2142Z--;
                            yVar.f2141Y += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C0107y yVar2 = (C0107y) this.f2131V;
                Map c9 = yVar2.c();
                if (c9 != null) {
                    return c9.keySet().remove(obj);
                }
                if (yVar2.h(obj) != C0107y.f2136d0) {
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    public final int size() {
        switch (this.f2130U) {
            case 0:
                return ((C0107y) this.f2131V).size();
            case 1:
                return ((C0107y) this.f2131V).size();
            default:
                return ((e) this.f2131V).f6308W;
        }
    }
}
