package H3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: H3.j  reason: case insensitive filesystem */
public class C0093j extends C0088e implements SortedSet {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ f0 f2076W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0093j(f0 f0Var, SortedMap sortedMap) {
        super(f0Var, sortedMap);
        this.f2076W = f0Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f2064U;
    }

    public final Comparator comparator() {
        return b().comparator();
    }

    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0093j(this.f2076W, b().headMap(obj));
    }

    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0093j(this.f2076W, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0093j(this.f2076W, b().tailMap(obj));
    }
}
