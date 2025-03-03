package H3;

import N7.a;
import java.util.Map;

/* renamed from: H3.x  reason: case insensitive filesystem */
public final class C0106x extends C0099p {

    /* renamed from: U  reason: collision with root package name */
    public final Object f2133U;

    /* renamed from: V  reason: collision with root package name */
    public int f2134V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C0107y f2135W;

    public C0106x(C0107y yVar, int i) {
        this.f2135W = yVar;
        Object obj = C0107y.f2136d0;
        this.f2133U = yVar.j()[i];
        this.f2134V = i;
    }

    public final void a() {
        int i = this.f2134V;
        Object obj = this.f2133U;
        C0107y yVar = this.f2135W;
        if (i != -1 && i < yVar.size()) {
            if (a.e(obj, yVar.j()[this.f2134V])) {
                return;
            }
        }
        Object obj2 = C0107y.f2136d0;
        this.f2134V = yVar.e(obj);
    }

    public final Object getKey() {
        return this.f2133U;
    }

    public final Object getValue() {
        C0107y yVar = this.f2135W;
        Map c8 = yVar.c();
        if (c8 != null) {
            return c8.get(this.f2133U);
        }
        a();
        int i = this.f2134V;
        if (i == -1) {
            return null;
        }
        return yVar.l()[i];
    }

    public final Object setValue(Object obj) {
        C0107y yVar = this.f2135W;
        Map c8 = yVar.c();
        Object obj2 = this.f2133U;
        if (c8 != null) {
            return c8.put(obj2, obj);
        }
        a();
        int i = this.f2134V;
        if (i == -1) {
            yVar.put(obj2, obj);
            return null;
        }
        Object obj3 = yVar.l()[i];
        yVar.l()[this.f2134V] = obj;
        return obj3;
    }
}
