package Y;

import H3.C0105w;
import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class e extends i implements Map, j$.util.Map {

    /* renamed from: X  reason: collision with root package name */
    public C0105w f6294X;

    /* renamed from: Y  reason: collision with root package name */
    public b f6295Y;

    /* renamed from: Z  reason: collision with root package name */
    public d f6296Z;

    public e(e eVar) {
        super((Object) null);
        g(eVar);
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final Set entrySet() {
        C0105w wVar = this.f6294X;
        if (wVar != null) {
            return wVar;
        }
        C0105w wVar2 = new C0105w(this, 2);
        this.f6294X = wVar2;
        return wVar2;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.-CC.$default$forEach(this, biConsumer);
    }

    public final boolean k(Collection collection) {
        for (Object containsKey : collection) {
            if (!super.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final Set keySet() {
        b bVar = this.f6295Y;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f6295Y = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.f6308W;
        for (Object remove : collection) {
            super.remove(remove);
        }
        if (i != this.f6308W) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final void putAll(java.util.Map map) {
        b(map.size() + this.f6308W);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final Collection values() {
        d dVar = this.f6296Z;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f6296Z = dVar2;
        return dVar2;
    }
}
