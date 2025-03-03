package f6;

import g6.C0967a0;
import g6.C0977j;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public final class a0 extends V implements Z, C0967a0 {
    private long deadlineNanos;
    private long id;
    private final long periodNanos;
    private int queueIndex = -1;

    public a0(C0916f fVar, Runnable runnable, long j7) {
        super((C0929t) fVar, runnable);
        this.deadlineNanos = j7;
        this.periodNanos = 0;
    }

    public static long deadlineToDelayNanos(long j7, long j8) {
        if (j8 == 0) {
            return 0;
        }
        return Math.max(0, j8 - j7);
    }

    private C0916f scheduledExecutor() {
        return (C0916f) executor();
    }

    private static long validatePeriod(long j7) {
        if (j7 != 0) {
            return j7;
        }
        throw new IllegalArgumentException("period: 0 (expected: != 0)");
    }

    public boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            scheduledExecutor().removeScheduled(this);
        }
        return cancel;
    }

    public boolean cancelWithoutRemove(boolean z) {
        return super.cancel(z);
    }

    public long deadlineNanos() {
        return this.deadlineNanos;
    }

    public long delayNanos() {
        return delayNanos(scheduledExecutor().getCurrentTimeNanos());
    }

    public C0929t executor() {
        return super.executor();
    }

    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(delayNanos(), TimeUnit.NANOSECONDS);
    }

    public int priorityQueueIndex(C0977j jVar) {
        return this.queueIndex;
    }

    public void run() {
        try {
            if (delayNanos() > 0) {
                if (isCancelled()) {
                    ((C0977j) scheduledExecutor().scheduledTaskQueue()).removeTyped((Object) this);
                } else {
                    scheduledExecutor().scheduleFromEventLoop(this);
                }
            } else if (this.periodNanos == 0) {
                if (setUncancellableInternal()) {
                    setSuccessInternal(runTask());
                }
            } else if (!isCancelled()) {
                runTask();
                if (!executor().isShutdown()) {
                    long j7 = this.periodNanos;
                    if (j7 > 0) {
                        this.deadlineNanos += j7;
                    } else {
                        this.deadlineNanos = scheduledExecutor().getCurrentTimeNanos() - this.periodNanos;
                    }
                    if (!isCancelled()) {
                        scheduledExecutor().scheduledTaskQueue().add(this);
                    }
                }
            }
        } catch (Throwable th) {
            setFailureInternal(th);
        }
    }

    public void setConsumed() {
        if (this.periodNanos == 0) {
            this.deadlineNanos = 0;
        }
    }

    public a0 setId(long j7) {
        if (this.id == 0) {
            this.id = j7;
        }
        return this;
    }

    public StringBuilder toStringBuilder() {
        StringBuilder stringBuilder = super.toStringBuilder();
        stringBuilder.setCharAt(stringBuilder.length() - 1, ',');
        stringBuilder.append(" deadline: ");
        stringBuilder.append(this.deadlineNanos);
        stringBuilder.append(", period: ");
        stringBuilder.append(this.periodNanos);
        stringBuilder.append(')');
        return stringBuilder;
    }

    public int compareTo(Delayed delayed) {
        if (this == delayed) {
            return 0;
        }
        a0 a0Var = (a0) delayed;
        int i = ((deadlineNanos() - a0Var.deadlineNanos()) > 0 ? 1 : ((deadlineNanos() - a0Var.deadlineNanos()) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return (i <= 0 && this.id < a0Var.id) ? -1 : 1;
    }

    public long delayNanos(long j7) {
        return deadlineToDelayNanos(j7, this.deadlineNanos);
    }

    public void priorityQueueIndex(C0977j jVar, int i) {
        this.queueIndex = i;
    }

    public a0(C0916f fVar, Runnable runnable, long j7, long j8) {
        super((C0929t) fVar, runnable);
        this.deadlineNanos = j7;
        this.periodNanos = validatePeriod(j8);
    }

    public a0(C0916f fVar, Callable<Object> callable, long j7, long j8) {
        super((C0929t) fVar, callable);
        this.deadlineNanos = j7;
        this.periodNanos = validatePeriod(j8);
    }

    public a0(C0916f fVar, Callable<Object> callable, long j7) {
        super((C0929t) fVar, callable);
        this.deadlineNanos = j7;
        this.periodNanos = 0;
    }
}
