package Z5;

import N.e;
import g6.B;

/* renamed from: Z5.p  reason: case insensitive filesystem */
public abstract class C0398p extends C0396n implements i0 {
    private T method;
    private String uri;

    public C0398p(r0 r0Var, T t8, String str, boolean z) {
        super(r0Var, z, false);
        this.method = (T) B.checkNotNull(t8, "method");
        this.uri = (String) B.checkNotNull(str, "uri");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0398p)) {
            return false;
        }
        C0398p pVar = (C0398p) obj;
        if (!method().equals(pVar.method()) || !uri().equalsIgnoreCase(pVar.uri()) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return e.u((this.method.hashCode() + 31) * 31, 31, this.uri) + super.hashCode();
    }

    public T method() {
        return this.method;
    }

    public String uri() {
        return this.uri;
    }
}
