package h1;

import M0.V;
import M0.W;
import M0.X;
import P0.z;
import j$.util.Objects;

/* renamed from: h1.v  reason: case insensitive filesystem */
public final class C1055v extends r {
    public static final Object e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f12522c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12523d;

    public C1055v(X x8, Object obj, Object obj2) {
        super(x8);
        this.f12522c = obj;
        this.f12523d = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.f12523d) != null) {
            obj = obj2;
        }
        return this.f12507b.b(obj);
    }

    public final V f(int i, V v4, boolean z) {
        this.f12507b.f(i, v4, z);
        if (Objects.equals(v4.f2863b, this.f12523d) && z) {
            v4.f2863b = e;
        }
        return v4;
    }

    public final Object l(int i) {
        Object l8 = this.f12507b.l(i);
        int i8 = z.f3748a;
        if (Objects.equals(l8, this.f12523d)) {
            return e;
        }
        return l8;
    }

    public final W m(int i, W w2, long j7) {
        this.f12507b.m(i, w2, j7);
        if (Objects.equals(w2.f2870a, this.f12522c)) {
            w2.f2870a = W.f2868q;
        }
        return w2;
    }
}
