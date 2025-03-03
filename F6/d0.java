package f6;

import N.e;
import Q0.g;
import g6.B;
import g6.C0977j;
import g6.Y;
import g6.Z;
import g6.p0;
import g6.t0;
import h6.C1082c;
import h6.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d0 extends C0916f implements K {
    static final int DEFAULT_MAX_PENDING_EXECUTOR_TASKS = Math.max(16, p0.getInt("io.netty.eventexecutor.maxPendingTasks", Integer.MAX_VALUE));
    private static final Runnable NOOP_TASK = new b0();
    private static final AtomicReferenceFieldUpdater<d0, g0> PROPERTIES_UPDATER;
    private static final long SCHEDULE_PURGE_INTERVAL = TimeUnit.SECONDS.toNanos(1);
    /* access modifiers changed from: private */
    public static final AtomicIntegerFieldUpdater<d0> STATE_UPDATER;
    /* access modifiers changed from: private */
    public static final C1082c logger;
    private final boolean addTaskWakesUp;
    private final Executor executor;
    private volatile long gracefulShutdownQuietPeriod;
    /* access modifiers changed from: private */
    public long gracefulShutdownStartTime;
    private volatile long gracefulShutdownTimeout;
    /* access modifiers changed from: private */
    public volatile boolean interrupted;
    private long lastExecutionTime;
    private final int maxPendingTasks;
    private final W rejectedExecutionHandler;
    private final Set<Runnable> shutdownHooks = new LinkedHashSet();
    /* access modifiers changed from: private */
    public volatile int state = 1;
    private final Queue<Runnable> taskQueue;
    /* access modifiers changed from: private */
    public final L terminationFuture = new r(G.INSTANCE);
    /* access modifiers changed from: private */
    public volatile Thread thread;
    /* access modifiers changed from: private */
    public final CountDownLatch threadLock = new CountDownLatch(1);
    private volatile g0 threadProperties;

    static {
        Class<d0> cls = d0.class;
        logger = d.getInstance((Class<?>) cls);
        STATE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(cls, "state");
        PROPERTIES_UPDATER = AtomicReferenceFieldUpdater.newUpdater(cls, g0.class, "threadProperties");
    }

    public d0(C0932w wVar, Executor executor2, boolean z, Queue<Runnable> queue, W w2) {
        super(wVar);
        this.addTaskWakesUp = z;
        this.maxPendingTasks = DEFAULT_MAX_PENDING_EXECUTOR_TASKS;
        this.executor = t0.apply(executor2, (C0929t) this);
        this.taskQueue = (Queue) B.checkNotNull(queue, "taskQueue");
        this.rejectedExecutionHandler = (W) B.checkNotNull(w2, "rejectedHandler");
    }

    private void doStartThread() {
        this.executor.execute(new c0(this));
    }

    private boolean ensureThreadStarted(int i) {
        if (i != 1) {
            return false;
        }
        try {
            doStartThread();
            return false;
        } catch (Throwable th) {
            STATE_UPDATER.set(this, 5);
            this.terminationFuture.tryFailure(th);
            if (!(th instanceof Exception)) {
                Y.throwException(th);
            }
            return true;
        }
    }

    private void execute0(Runnable runnable) {
        B.checkNotNull(runnable, "task");
        execute(runnable, wakesUpForTask(runnable));
    }

    private boolean fetchFromScheduledTaskQueue() {
        Runnable pollScheduledTask;
        Z z = this.scheduledTaskQueue;
        if (z == null || ((C0977j) z).isEmpty()) {
            return true;
        }
        long currentTimeNanos = getCurrentTimeNanos();
        do {
            pollScheduledTask = pollScheduledTask(currentTimeNanos);
            if (pollScheduledTask == null) {
                return true;
            }
        } while (this.taskQueue.offer(pollScheduledTask));
        this.scheduledTaskQueue.add((a0) pollScheduledTask);
        return false;
    }

    private void lazyExecute0(Runnable runnable) {
        execute((Runnable) B.checkNotNull(runnable, "task"), false);
    }

    public static Runnable pollTaskFrom(Queue<Runnable> queue) {
        Runnable poll;
        do {
            poll = queue.poll();
        } while (poll == C0916f.WAKEUP_TASK);
        return poll;
    }

    public static void reject() {
        throw new RejectedExecutionException("event executor terminated");
    }

    private boolean runShutdownHooks() {
        boolean z = false;
        while (!this.shutdownHooks.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.shutdownHooks);
            this.shutdownHooks.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    C0911a.runTask((Runnable) it.next());
                } catch (Throwable th) {
                    logger.warn("Shutdown hook raised an exception.", th);
                }
                z = true;
            }
        }
        if (z) {
            this.lastExecutionTime = getCurrentTimeNanos();
        }
        return z;
    }

    private void startThread() {
        if (this.state == 1 && STATE_UPDATER.compareAndSet(this, 1, 2)) {
            try {
                doStartThread();
            } catch (Throwable th) {
                STATE_UPDATER.compareAndSet(this, 2, 1);
                throw th;
            }
        }
    }

    private void throwIfInEventLoop(String str) {
        if (inEventLoop()) {
            throw new RejectedExecutionException(e.y("Calling ", str, " from within the EventLoop is not allowed"));
        }
    }

    public void addTask(Runnable runnable) {
        B.checkNotNull(runnable, "task");
        if (!offerTask(runnable)) {
            reject(runnable);
        }
    }

    public void afterRunningAllTasks() {
    }

    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        B.checkNotNull(timeUnit, "unit");
        if (!inEventLoop()) {
            this.threadLock.await(j7, timeUnit);
            return isTerminated();
        }
        throw new IllegalStateException("cannot await termination of the current thread");
    }

    public void cleanup() {
    }

    public boolean confirmShutdown() {
        if (!isShuttingDown()) {
            return false;
        }
        if (inEventLoop()) {
            cancelScheduledTasks();
            if (this.gracefulShutdownStartTime == 0) {
                this.gracefulShutdownStartTime = getCurrentTimeNanos();
            }
            if (!runAllTasks() && !runShutdownHooks()) {
                long currentTimeNanos = getCurrentTimeNanos();
                if (isShutdown() || currentTimeNanos - this.gracefulShutdownStartTime > this.gracefulShutdownTimeout || currentTimeNanos - this.lastExecutionTime > this.gracefulShutdownQuietPeriod) {
                    return true;
                }
                this.taskQueue.offer(C0916f.WAKEUP_TASK);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused) {
                }
                return false;
            } else if (isShutdown() || this.gracefulShutdownQuietPeriod == 0) {
                return true;
            } else {
                this.taskQueue.offer(C0916f.WAKEUP_TASK);
                return false;
            }
        } else {
            throw new IllegalStateException("must be invoked from an event loop");
        }
    }

    public final int drainTasks() {
        int i = 0;
        while (true) {
            Runnable poll = this.taskQueue.poll();
            if (poll == null) {
                return i;
            }
            if (C0916f.WAKEUP_TASK != poll) {
                i++;
            }
        }
    }

    public void execute(Runnable runnable) {
        execute0(runnable);
    }

    public boolean hasTasks() {
        return !this.taskQueue.isEmpty();
    }

    public boolean inEventLoop(Thread thread2) {
        if (thread2 == this.thread) {
            return true;
        }
        return false;
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        throwIfInEventLoop("invokeAll");
        return super.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        throwIfInEventLoop("invokeAny");
        return super.invokeAny(collection);
    }

    public boolean isShutdown() {
        if (this.state >= 4) {
            return true;
        }
        return false;
    }

    public boolean isShuttingDown() {
        if (this.state >= 3) {
            return true;
        }
        return false;
    }

    public boolean isTerminated() {
        if (this.state == 5) {
            return true;
        }
        return false;
    }

    public void lazyExecute(Runnable runnable) {
        lazyExecute0(runnable);
    }

    public final boolean offerTask(Runnable runnable) {
        if (isShutdown()) {
            reject();
        }
        return this.taskQueue.offer(runnable);
    }

    public Runnable pollTask() {
        return pollTaskFrom(this.taskQueue);
    }

    public boolean removeTask(Runnable runnable) {
        return this.taskQueue.remove(B.checkNotNull(runnable, "task"));
    }

    public abstract void run();

    public boolean runAllTasks() {
        boolean fetchFromScheduledTaskQueue;
        boolean z = false;
        do {
            fetchFromScheduledTaskQueue = fetchFromScheduledTaskQueue();
            if (runAllTasksFrom(this.taskQueue)) {
                z = true;
                continue;
            }
        } while (!fetchFromScheduledTaskQueue);
        if (z) {
            this.lastExecutionTime = getCurrentTimeNanos();
        }
        afterRunningAllTasks();
        return z;
    }

    public final boolean runAllTasksFrom(Queue<Runnable> queue) {
        Runnable pollTaskFrom = pollTaskFrom(queue);
        if (pollTaskFrom == null) {
            return false;
        }
        do {
            C0911a.safeExecute(pollTaskFrom);
            pollTaskFrom = pollTaskFrom(queue);
        } while (pollTaskFrom != null);
        return true;
    }

    @Deprecated
    public void shutdown() {
        if (!isShutdown()) {
            boolean inEventLoop = inEventLoop();
            while (!isShuttingDown()) {
                int i = this.state;
                int i8 = 4;
                boolean z = true;
                if (!(inEventLoop || i == 1 || i == 2 || i == 3)) {
                    z = false;
                    i8 = i;
                }
                if (STATE_UPDATER.compareAndSet(this, i, i8)) {
                    if (!ensureThreadStarted(i) && z) {
                        this.taskQueue.offer(C0916f.WAKEUP_TASK);
                        if (!this.addTaskWakesUp) {
                            wakeup(inEventLoop);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C0909B shutdownGracefully(long j7, long j8, TimeUnit timeUnit) {
        B.checkPositiveOrZero(j7, "quietPeriod");
        if (j8 >= j7) {
            B.checkNotNull(timeUnit, "unit");
            if (isShuttingDown()) {
                return terminationFuture();
            }
            boolean inEventLoop = inEventLoop();
            while (!isShuttingDown()) {
                int i = this.state;
                int i8 = 3;
                boolean z = true;
                if (!(inEventLoop || i == 1 || i == 2)) {
                    z = false;
                    i8 = i;
                }
                if (STATE_UPDATER.compareAndSet(this, i, i8)) {
                    this.gracefulShutdownQuietPeriod = timeUnit.toNanos(j7);
                    this.gracefulShutdownTimeout = timeUnit.toNanos(j8);
                    if (ensureThreadStarted(i)) {
                        return this.terminationFuture;
                    }
                    if (z) {
                        this.taskQueue.offer(C0916f.WAKEUP_TASK);
                        if (!this.addTaskWakesUp) {
                            wakeup(inEventLoop);
                        }
                    }
                    return terminationFuture();
                }
            }
            return terminationFuture();
        }
        StringBuilder sb = new StringBuilder("timeout: ");
        sb.append(j8);
        sb.append(" (expected >= quietPeriod (");
        throw new IllegalArgumentException(g.o(sb, j7, "))"));
    }

    public C0909B terminationFuture() {
        return this.terminationFuture;
    }

    public void updateLastExecutionTime() {
        this.lastExecutionTime = getCurrentTimeNanos();
    }

    public boolean wakesUpForTask(Runnable runnable) {
        return true;
    }

    public void wakeup(boolean z) {
        if (!z) {
            this.taskQueue.offer(C0916f.WAKEUP_TASK);
        }
    }

    private void execute(Runnable runnable, boolean z) {
        boolean z6;
        boolean inEventLoop = inEventLoop();
        addTask(runnable);
        if (!inEventLoop) {
            startThread();
            if (isShutdown()) {
                try {
                    z6 = removeTask(runnable);
                } catch (UnsupportedOperationException unused) {
                    z6 = false;
                }
                if (z6) {
                    reject();
                }
            }
        }
        if (!this.addTaskWakesUp && z) {
            wakeup(inEventLoop);
        }
    }

    public final void reject(Runnable runnable) {
        ((X) this.rejectedExecutionHandler).rejected(runnable, this);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j7, TimeUnit timeUnit) {
        throwIfInEventLoop("invokeAll");
        return super.invokeAll(collection, j7, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j7, TimeUnit timeUnit) {
        throwIfInEventLoop("invokeAny");
        return super.invokeAny(collection, j7, timeUnit);
    }

    public boolean runAllTasks(long j7) {
        long j8;
        fetchFromScheduledTaskQueue();
        Runnable pollTask = pollTask();
        if (pollTask == null) {
            afterRunningAllTasks();
            return false;
        }
        long currentTimeNanos = j7 > 0 ? getCurrentTimeNanos() + j7 : 0;
        long j9 = 0;
        while (true) {
            C0911a.safeExecute(pollTask);
            j9++;
            if ((63 & j9) == 0) {
                j8 = getCurrentTimeNanos();
                if (j8 >= currentTimeNanos) {
                    break;
                }
            }
            pollTask = pollTask();
            if (pollTask == null) {
                j8 = getCurrentTimeNanos();
                break;
            }
        }
        afterRunningAllTasks();
        this.lastExecutionTime = j8;
        return true;
    }
}
