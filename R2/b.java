package R2;

import B.q0;
import D2.B;
import D2.m;
import P2.c;
import W2.k;
import Y.e;
import Y.i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final B f4332c;

    /* renamed from: a  reason: collision with root package name */
    public final e f4333a = new i((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f4334b = new AtomicReference();

    static {
        Class<Object> cls = Object.class;
        Class<Object> cls2 = Object.class;
        Class<Object> cls3 = Object.class;
        Class<Object> cls4 = Object.class;
        f4332c = new B(cls4, cls2, cls3, Collections.singletonList(new m(cls, Object.class, Object.class, Collections.emptyList(), new c(0), (q0) null)), (q0) null);
    }

    public final void a(Class cls, Class cls2, Class cls3, B b8) {
        synchronized (this.f4333a) {
            e eVar = this.f4333a;
            k kVar = new k(cls, cls2, cls3);
            if (b8 == null) {
                b8 = f4332c;
            }
            eVar.put(kVar, b8);
        }
    }
}
