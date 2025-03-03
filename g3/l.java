package G3;

public final class l implements i {

    /* renamed from: X  reason: collision with root package name */
    public static final k f1653X = new k(0);

    /* renamed from: U  reason: collision with root package name */
    public final Object f1654U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public volatile i f1655V;

    /* renamed from: W  reason: collision with root package name */
    public Object f1656W;

    public l(i iVar) {
        this.f1655V = iVar;
    }

    public final Object get() {
        i iVar = this.f1655V;
        k kVar = f1653X;
        if (iVar != kVar) {
            synchronized (this.f1654U) {
                try {
                    if (this.f1655V != kVar) {
                        Object obj = this.f1655V.get();
                        this.f1656W = obj;
                        this.f1655V = kVar;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1656W;
    }

    public final String toString() {
        Object obj = this.f1655V;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f1653X) {
            obj = "<supplier that returned " + this.f1656W + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
