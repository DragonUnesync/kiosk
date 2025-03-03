package f6;

import g6.x0;
import java.util.concurrent.CancellationException;

/* renamed from: f6.q  reason: case insensitive filesystem */
public final class C0927q extends CancellationException {
    private C0927q() {
    }

    public static C0927q newInstance(Class<?> cls, String str) {
        return (C0927q) x0.unknownStackTrace(new C0927q(), cls, str);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
