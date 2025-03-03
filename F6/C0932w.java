package f6;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: f6.w  reason: case insensitive filesystem */
public interface C0932w extends ScheduledExecutorService, Iterable {
    boolean isShuttingDown();

    C0929t next();

    @Deprecated
    void shutdown();

    C0909B shutdownGracefully(long j7, long j8, TimeUnit timeUnit);

    C0909B terminationFuture();
}
