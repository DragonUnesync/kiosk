package f6;

import g6.B;
import g6.p0;
import g6.t0;
import h6.C1082c;
import h6.d;
import java.security.AccessController;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class G extends C0916f implements K {
    public static final G INSTANCE = new G();
    private static final long SCHEDULE_QUIET_PERIOD_INTERVAL;
    /* access modifiers changed from: private */
    public static final C1082c logger;
    final a0 quietPeriodTask;
    /* access modifiers changed from: private */
    public final AtomicBoolean started;
    final BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue();
    private final F taskRunner;
    private final C0909B terminationFuture;
    volatile Thread thread;
    final ThreadFactory threadFactory;

    static {
        C1082c instance = d.getInstance((Class<?>) G.class);
        logger = instance;
        int i = 1;
        int i8 = p0.getInt("io.netty.globalEventExecutor.quietPeriodSeconds", 1);
        if (i8 > 0) {
            i = i8;
        }
        instance.debug("-Dio.netty.globalEventExecutor.quietPeriodSeconds: {}", (Object) Integer.valueOf(i));
        SCHEDULE_QUIET_PERIOD_INTERVAL = TimeUnit.SECONDS.toNanos((long) i);
    }

    private G() {
        Callable callable = Executors.callable(new D(this), (Object) null);
        long currentTimeNanos = getCurrentTimeNanos();
        long j7 = SCHEDULE_QUIET_PERIOD_INTERVAL;
        a0 a0Var = new a0((C0916f) this, (Callable<Object>) callable, C0916f.deadlineNanos(currentTimeNanos, j7), -j7);
        this.quietPeriodTask = a0Var;
        this.taskRunner = new F(this);
        this.started = new AtomicBoolean();
        this.terminationFuture = new C0933x(this, new UnsupportedOperationException());
        scheduledTaskQueue().add(a0Var);
        this.threadFactory = t0.apply((ThreadFactory) new C0928s(C0928s.toPoolName(G.class), false, 5, (ThreadGroup) null), (C0929t) this);
    }

    private void addTask(Runnable runnable) {
        this.taskQueue.add(B.checkNotNull(runnable, "task"));
    }

    private void execute0(Runnable runnable) {
        addTask((Runnable) B.checkNotNull(runnable, "task"));
        if (!inEventLoop()) {
            startThread();
        }
    }

    private void fetchFromScheduledTaskQueue() {
        long currentTimeNanos = getCurrentTimeNanos();
        Runnable pollScheduledTask = pollScheduledTask(currentTimeNanos);
        while (pollScheduledTask != null) {
            this.taskQueue.add(pollScheduledTask);
            pollScheduledTask = pollScheduledTask(currentTimeNanos);
        }
    }

    private void startThread() {
        if (this.started.compareAndSet(false, true)) {
            Thread newThread = this.threadFactory.newThread(this.taskRunner);
            AccessController.doPrivileged(new E(this, newThread));
            this.thread = newThread;
            newThread.start();
        }
    }

    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return false;
    }

    public void execute(Runnable runnable) {
        execute0(runnable);
    }

    public boolean inEventLoop(Thread thread2) {
        if (thread2 == this.thread) {
            return true;
        }
        return false;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isShuttingDown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    @Deprecated
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public C0909B shutdownGracefully(long j7, long j8, TimeUnit timeUnit) {
        return terminationFuture();
    }

    public Runnable takeTask() {
        Runnable runnable;
        BlockingQueue<Runnable> blockingQueue = this.taskQueue;
        do {
            a0 peekScheduledTask = peekScheduledTask();
            runnable = null;
            if (peekScheduledTask == null) {
                try {
                    return blockingQueue.take();
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                long delayNanos = peekScheduledTask.delayNanos();
                if (delayNanos > 0) {
                    try {
                        runnable = blockingQueue.poll(delayNanos, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException unused2) {
                        return null;
                    }
                }
                if (runnable == null) {
                    fetchFromScheduledTaskQueue();
                    runnable = blockingQueue.poll();
                    continue;
                }
            }
        } while (runnable == null);
        return runnable;
    }

    public C0909B terminationFuture() {
        return this.terminationFuture;
    }
}
