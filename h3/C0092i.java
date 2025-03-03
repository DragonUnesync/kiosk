package H3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: H3.i  reason: case insensitive filesystem */
public class C0092i extends C0087d implements SortedMap {

    /* renamed from: Y  reason: collision with root package name */
    public SortedSet f2071Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f0 f2072Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0092i(f0 f0Var, SortedMap sortedMap) {
        super(f0Var, sortedMap);
        this.f2072Z = f0Var;
    }

    public SortedSet b() {
        return new C0093j(this.f2072Z, d());
    }

    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f2071Y;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b8 = b();
        this.f2071Y = b8;
        return b8;
    }

    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f2061W;
    }

    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0092i(this.f2072Z, d().headMap(obj));
    }

    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0092i(this.f2072Z, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0092i(this.f2072Z, d().tailMap(obj));
    }
}
