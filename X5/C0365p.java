package X5;

import e6.X;
import g6.B;

/* renamed from: X5.p  reason: case insensitive filesystem */
public class C0365p {
    protected static final X SIGNAL_SUCCESS;
    protected static final X SIGNAL_UNFINISHED;
    public static final C0365p SUCCESS;
    public static final C0365p UNFINISHED;
    private final Throwable cause;

    static {
        Class<C0365p> cls = C0365p.class;
        X valueOf = X.valueOf(cls, "UNFINISHED");
        SIGNAL_UNFINISHED = valueOf;
        X valueOf2 = X.valueOf(cls, "SUCCESS");
        SIGNAL_SUCCESS = valueOf2;
        UNFINISHED = new C0365p(valueOf);
        SUCCESS = new C0365p(valueOf2);
    }

    public C0365p(Throwable th) {
        this.cause = (Throwable) B.checkNotNull(th, "cause");
    }

    public static C0365p failure(Throwable th) {
        return new C0365p((Throwable) B.checkNotNull(th, "cause"));
    }

    public Throwable cause() {
        if (isFailure()) {
            return this.cause;
        }
        return null;
    }

    public boolean isFailure() {
        Throwable th = this.cause;
        if (th == SIGNAL_SUCCESS || th == SIGNAL_UNFINISHED) {
            return false;
        }
        return true;
    }

    public boolean isFinished() {
        if (this.cause != SIGNAL_UNFINISHED) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        if (this.cause == SIGNAL_SUCCESS) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (!isFinished()) {
            return "unfinished";
        }
        if (isSuccess()) {
            return "success";
        }
        String th = cause().toString();
        StringBuilder sb = new StringBuilder(th.length() + 17);
        sb.append("failure(");
        sb.append(th);
        sb.append(')');
        return sb.toString();
    }
}
