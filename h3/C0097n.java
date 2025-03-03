package H3;

import java.util.Collection;
import java.util.Set;

/* renamed from: H3.n  reason: case insensitive filesystem */
public final class C0097n extends C0094k implements Set {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f2093Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0097n(H h5, Object obj, Set set) {
        super(h5, obj, set, (C0094k) null);
        this.f2093Z = h5;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean s8 = C0103u.s((Set) this.f2079V, collection);
        if (s8) {
            int size2 = this.f2079V.size();
            this.f2093Z.f2102Y += size2 - size;
            d();
        }
        return s8;
    }
}
