package f6;

import g6.B;
import g6.C0977j;
import g6.Z;
import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: f6.f  reason: case insensitive filesystem */
public abstract class C0916f extends C0911a {
    private static final Comparator<a0> SCHEDULED_FUTURE_TASK_COMPARATOR = new C0914d();
    private static final long START_TIME = System.nanoTime();
    static final Runnable WAKEUP_TASK = new C0915e();
    long nextTaskId;
    Z scheduledTaskQueue;

    public C0916f() {
    }

    public static long deadlineNanos(long j7, long j8) {
        long j9 = j7 + j8;
        if (j9 < 0) {
            return Long.MAX_VALUE;
        }
        return j9;
    }

    public static long deadlineToDelayNanos(long j7) {
        return a0.deadlineToDelayNanos(defaultCurrentTimeNanos(), j7);
    }

    public static long defaultCurrentTimeNanos() {
        return System.nanoTime() - START_TIME;
    }

    private static boolean isNullOrEmpty(Queue<a0> queue) {
        if (queue == null || queue.isEmpty()) {
            return true;
        }
        return false;
    }

    private void validateScheduled0(long j7, TimeUnit timeUnit) {
        validateScheduled(j7, timeUnit);
    }

    public boolean afterScheduledTaskSubmitted(long j7) {
        return true;
    }

    public boolean beforeScheduledTaskSubmitted(long j7) {
        return true;
    }

    public void cancelScheduledTasks() {
        Z z = this.scheduledTaskQueue;
        if (!isNullOrEmpty(z)) {
            C0977j jVar = (C0977j) z;
            for (a0 cancelWithoutRemove : (a0[]) jVar.toArray(new a0[0])) {
                cancelWithoutRemove.cancelWithoutRemove(false);
            }
            jVar.clearIgnoringIndexes();
        }
    }

    public long getCurrentTimeNanos() {
        return defaultCurrentTimeNanos();
    }

    public final long nextScheduledTaskDeadlineNanos() {
        a0 peekScheduledTask = peekScheduledTask();
        if (peekScheduledTask != null) {
            return peekScheduledTask.deadlineNanos();
        }
        return -1;
    }

    public final a0 peekScheduledTask() {
        Z z = this.scheduledTaskQueue;
        if (z != null) {
            return (a0) ((C0977j) z).peek();
        }
        return null;
    }

    public final Runnable pollScheduledTask(long j7) {
        a0 peekScheduledTask = peekScheduledTask();
        if (peekScheduledTask == null || peekScheduledTask.deadlineNanos() - j7 > 0) {
            return null;
        }
        this.scheduledTaskQueue.remove();
        peekScheduledTask.setConsumed();
        return peekScheduledTask;
    }

    public final void removeScheduled(a0 a0Var) {
        if (inEventLoop()) {
            ((C0977j) scheduledTaskQueue()).removeTyped((Object) a0Var);
        } else {
            lazyExecute(a0Var);
        }
    }

    public final void scheduleFromEventLoop(a0 a0Var) {
        Z scheduledTaskQueue2 = scheduledTaskQueue();
        long j7 = this.nextTaskId + 1;
        this.nextTaskId = j7;
        scheduledTaskQueue2.add(a0Var.setId(j7));
    }

    public Z scheduledTaskQueue() {
        if (this.scheduledTaskQueue == null) {
            this.scheduledTaskQueue = new C0977j(SCHEDULED_FUTURE_TASK_COMPARATOR, 11);
        }
        return this.scheduledTaskQueue;
    }

    @Deprecated
    public void validateScheduled(long j7, TimeUnit timeUnit) {
    }

    public C0916f(C0932w wVar) {
        super(wVar);
    }

    public Z scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        long j9 = j8;
        TimeUnit timeUnit2 = timeUnit;
        Runnable runnable2 = runnable;
        B.checkNotNull(runnable, "command");
        B.checkNotNull(timeUnit2, "unit");
        if (j7 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", new Object[]{Long.valueOf(j7)}));
        } else if (j9 > 0) {
            validateScheduled0(j7, timeUnit2);
            validateScheduled0(j9, timeUnit2);
            return schedule(new a0(this, runnable, deadlineNanos(getCurrentTimeNanos(), timeUnit2.toNanos(j7)), timeUnit2.toNanos(j9)));
        } else {
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", new Object[]{Long.valueOf(j8)}));
        }
    }

    public Z scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        long j9 = j8;
        TimeUnit timeUnit2 = timeUnit;
        Runnable runnable2 = runnable;
        B.checkNotNull(runnable, "command");
        B.checkNotNull(timeUnit2, "unit");
        if (j7 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", new Object[]{Long.valueOf(j7)}));
        } else if (j9 > 0) {
            validateScheduled0(j7, timeUnit2);
            validateScheduled0(j9, timeUnit2);
            return schedule(new a0(this, runnable, deadlineNanos(getCurrentTimeNanos(), timeUnit2.toNanos(j7)), -timeUnit2.toNanos(j9)));
        } else {
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", new Object[]{Long.valueOf(j8)}));
        }
    }

    public Z schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        B.checkNotNull(runnable, "command");
        B.checkNotNull(timeUnit, "unit");
        if (j7 < 0) {
            j7 = 0;
        }
        validateScheduled0(j7, timeUnit);
        return schedule(new a0(this, runnable, deadlineNanos(getCurrentTimeNanos(), timeUnit.toNanos(j7))));
    }

    public <V> Z schedule(Callable<V> callable, long j7, TimeUnit timeUnit) {
        B.checkNotNull(callable, "callable");
        B.checkNotNull(timeUnit, "unit");
        if (j7 < 0) {
            j7 = 0;
        }
        validateScheduled0(j7, timeUnit);
        return schedule(new a0(this, (Callable<Object>) callable, deadlineNanos(getCurrentTimeNanos(), timeUnit.toNanos(j7))));
    }

    private <V> Z schedule(a0 a0Var) {
        if (inEventLoop()) {
            scheduleFromEventLoop(a0Var);
        } else {
            long deadlineNanos = a0Var.deadlineNanos();
            if (beforeScheduledTaskSubmitted(deadlineNanos)) {
                execute(a0Var);
            } else {
                lazyExecute(a0Var);
                if (afterScheduledTaskSubmitted(deadlineNanos)) {
                    execute(WAKEUP_TASK);
                }
            }
        }
        return a0Var;
    }
}
