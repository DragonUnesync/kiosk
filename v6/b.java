package V6;

import java.util.Iterator;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f5990a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5991b;

    public b(c cVar, int i) {
        this.f5990a = cVar;
        this.f5991b = i;
        if (i < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    public final Iterator iterator() {
        return new D6.b(this);
    }
}
