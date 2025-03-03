package S7;

import java.util.ArrayList;
import java.util.Collection;

public final class j extends ArrayList {

    /* renamed from: U  reason: collision with root package name */
    public final k f4556U;

    public j(k kVar, int i) {
        super(i);
        this.f4556U = kVar;
    }

    public final boolean add(Object obj) {
        b();
        return super.add(obj);
    }

    public final boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }

    public final void b() {
        this.f4556U.f4560Y = null;
    }

    public final void clear() {
        b();
        super.clear();
    }

    public final Object remove(int i) {
        b();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    public final void removeRange(int i, int i8) {
        b();
        super.removeRange(i, i8);
    }

    public final boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    public final Object set(int i, Object obj) {
        b();
        return super.set(i, obj);
    }

    public final void add(int i, Object obj) {
        b();
        super.add(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        b();
        return super.addAll(i, collection);
    }

    public final boolean remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
