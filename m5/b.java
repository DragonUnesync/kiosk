package M5;

import B6.a;

public final class b implements a, L5.a {

    /* renamed from: U  reason: collision with root package name */
    public final Object f3175U;

    public b(Object obj) {
        this.f3175U = obj;
    }

    public static b a(Object obj) {
        if (obj != null) {
            return new b(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final Object get() {
        return this.f3175U;
    }
}
