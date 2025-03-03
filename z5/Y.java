package Z5;

import S5.C0185n;

public final class Y extends X implements C0405x {
    public Y(i0 i0Var, C0185n nVar, L l8) {
        super(i0Var, nVar, l8);
    }

    public T getMethod() {
        return ((i0) this.message).method();
    }

    public String getUri() {
        return ((i0) this.message).uri();
    }

    public T method() {
        return getMethod();
    }

    public String toString() {
        return P.appendFullRequest(new StringBuilder(256), this).toString();
    }

    public String uri() {
        return getUri();
    }

    public C0405x touch(Object obj) {
        super.touch(obj);
        return this;
    }
}
