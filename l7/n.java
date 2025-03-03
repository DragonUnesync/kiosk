package l7;

import D6.e;
import java.util.RandomAccess;

public final class n extends e implements RandomAccess {

    /* renamed from: U  reason: collision with root package name */
    public final i[] f13231U;

    public n(i[] iVarArr) {
        this.f13231U = iVarArr;
    }

    public final int b() {
        return this.f13231U.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.contains((i) obj);
    }

    public final Object get(int i) {
        return this.f13231U[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }
}
