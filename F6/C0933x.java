package f6;

import g6.B;

/* renamed from: f6.x  reason: case insensitive filesystem */
public final class C0933x extends C0918h {
    private final Throwable cause;

    public C0933x(C0929t tVar, Throwable th) {
        super(tVar);
        this.cause = (Throwable) B.checkNotNull(th, "cause");
    }

    public Throwable cause() {
        return this.cause;
    }

    public Object getNow() {
        return null;
    }

    public boolean isSuccess() {
        return false;
    }
}
