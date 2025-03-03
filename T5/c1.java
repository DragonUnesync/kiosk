package T5;

import f6.C0929t;
import g6.B;

public final class c1 extends C0284z0 {
    private final Throwable cause;

    public c1(K k8, C0929t tVar, Throwable th) {
        super(k8, tVar);
        this.cause = (Throwable) B.checkNotNull(th, "cause");
    }

    public Throwable cause() {
        return this.cause;
    }

    public boolean isSuccess() {
        return false;
    }
}
