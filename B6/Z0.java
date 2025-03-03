package b6;

import g6.B;

public abstract class Z0 {
    private final Throwable cause;

    public Z0() {
        this.cause = null;
    }

    public final Throwable cause() {
        return this.cause;
    }

    public final boolean isSuccess() {
        if (this.cause == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        Throwable cause2 = cause();
        if (cause2 == null) {
            return getClass().getSimpleName().concat("(SUCCESS)");
        }
        return getClass().getSimpleName() + '(' + cause2 + ')';
    }

    public Z0(Throwable th) {
        this.cause = (Throwable) B.checkNotNull(th, "cause");
    }
}
