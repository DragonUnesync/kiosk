package f6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: f6.c  reason: case insensitive filesystem */
public abstract class C0913c implements C0909B {
    public Object get() {
        await();
        Throwable cause = cause();
        if (cause == null) {
            return getNow();
        }
        if (cause instanceof CancellationException) {
            throw ((CancellationException) cause);
        }
        throw new ExecutionException(cause);
    }

    public Object get(long j7, TimeUnit timeUnit) {
        if (await(j7, timeUnit)) {
            Throwable cause = cause();
            if (cause == null) {
                return getNow();
            }
            if (cause instanceof CancellationException) {
                throw ((CancellationException) cause);
            }
            throw new ExecutionException(cause);
        }
        throw new TimeoutException();
    }
}
