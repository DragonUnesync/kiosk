package f6;

import java.util.concurrent.CancellationException;

/* renamed from: f6.p  reason: case insensitive filesystem */
public final class C0926p extends CancellationException {
    private C0926p() {
    }

    public Throwable fillInStackTrace() {
        setStackTrace(r.CANCELLATION_STACK);
        return this;
    }

    public String toString() {
        return CancellationException.class.getName();
    }

    public /* synthetic */ C0926p(C0923m mVar) {
        this();
    }
}
