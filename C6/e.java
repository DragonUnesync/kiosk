package C6;

import O6.a;
import P6.f;
import P6.g;
import java.io.Serializable;

public final class e implements a, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public g f714U;

    /* renamed from: V  reason: collision with root package name */
    public volatile Object f715V = g.f720b;

    /* renamed from: W  reason: collision with root package name */
    public final Object f716W = this;

    public e(a aVar) {
        f.e(aVar, "initializer");
        this.f714U = (g) aVar;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [P6.g, java.lang.Object, O6.a] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f715V;
        Object obj3 = g.f720b;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this.f716W) {
            obj = this.f715V;
            if (obj == obj3) {
                ? r12 = this.f714U;
                f.b(r12);
                obj = r12.invoke();
                this.f715V = obj;
                this.f714U = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f715V != g.f720b) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
