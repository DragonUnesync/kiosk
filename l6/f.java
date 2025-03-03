package l6;

import java.util.concurrent.TimeUnit;
import m6.b;

public abstract class f {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    public abstract e a();

    public b b(Runnable runnable) {
        return c(runnable, TimeUnit.NANOSECONDS);
    }

    public b c(Runnable runnable, TimeUnit timeUnit) {
        e a8 = a();
        d dVar = new d(runnable, a8);
        a8.a(dVar, timeUnit);
        return dVar;
    }
}
