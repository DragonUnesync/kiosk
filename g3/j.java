package G3;

import java.io.Serializable;

public final class j implements i, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final transient Object f1648U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final i f1649V;

    /* renamed from: W  reason: collision with root package name */
    public volatile transient boolean f1650W;

    /* renamed from: X  reason: collision with root package name */
    public transient Object f1651X;

    public j(i iVar) {
        this.f1649V = iVar;
    }

    public final Object get() {
        if (!this.f1650W) {
            synchronized (this.f1648U) {
                try {
                    if (!this.f1650W) {
                        Object obj = this.f1649V.get();
                        this.f1651X = obj;
                        this.f1650W = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1651X;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f1650W) {
            obj = "<supplier that returned " + this.f1651X + ">";
        } else {
            obj = this.f1649V;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
