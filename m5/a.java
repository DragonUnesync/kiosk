package M5;

public final class a implements B6.a, L5.a {

    /* renamed from: W  reason: collision with root package name */
    public static final Object f3172W = new Object();

    /* renamed from: U  reason: collision with root package name */
    public volatile B6.a f3173U;

    /* renamed from: V  reason: collision with root package name */
    public volatile Object f3174V = f3172W;

    public a(B6.a aVar) {
        this.f3173U = aVar;
    }

    public static L5.a a(B6.a aVar) {
        if (aVar instanceof L5.a) {
            return (L5.a) aVar;
        }
        aVar.getClass();
        return new a(aVar);
    }

    public static B6.a b(B6.a aVar) {
        aVar.getClass();
        if (aVar instanceof a) {
            return aVar;
        }
        return new a(aVar);
    }

    public final Object get() {
        Object obj = this.f3174V;
        Object obj2 = f3172W;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f3174V;
                    if (obj == obj2) {
                        obj = this.f3173U.get();
                        Object obj3 = this.f3174V;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f3174V = obj;
                        this.f3173U = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
