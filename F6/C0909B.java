package f6;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: f6.B  reason: case insensitive filesystem */
public interface C0909B extends Future {
    C0909B addListener(C0910C c8);

    C0909B await();

    boolean await(long j7, TimeUnit timeUnit);

    boolean cancel(boolean z);

    Throwable cause();

    Object getNow();

    boolean isSuccess();

    C0909B removeListener(C0910C c8);
}
