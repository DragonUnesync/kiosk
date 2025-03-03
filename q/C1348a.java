package q;

import java.util.HashMap;

/* renamed from: q.a  reason: case insensitive filesystem */
public final class C1348a extends C1353f {

    /* renamed from: Y  reason: collision with root package name */
    public final HashMap f14686Y = new HashMap();

    public final C1350c b(Object obj) {
        return (C1350c) this.f14686Y.get(obj);
    }

    public final Object c(Object obj) {
        Object c8 = super.c(obj);
        this.f14686Y.remove(obj);
        return c8;
    }
}
