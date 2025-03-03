package f6;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public class V extends r implements RunnableFuture {
    private static final Runnable CANCELLED = new U("CANCELLED");
    private static final Runnable COMPLETED = new U("COMPLETED");
    private static final Runnable FAILED = new U("FAILED");
    private Object task;

    /* JADX WARNING: type inference failed for: r1v1, types: [f6.T] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V(f6.C0929t r1, java.lang.Runnable r2, java.lang.Object r3) {
        /*
            r0 = this;
            r0.<init>(r1)
            if (r3 != 0) goto L_0x0006
            goto L_0x000c
        L_0x0006:
            f6.T r1 = new f6.T
            r1.<init>(r2, r3)
            r2 = r1
        L_0x000c:
            r0.task = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.V.<init>(f6.t, java.lang.Runnable, java.lang.Object):void");
    }

    private boolean clearTaskAfterCompletion(boolean z, Runnable runnable) {
        if (z) {
            this.task = runnable;
        }
        return z;
    }

    public boolean cancel(boolean z) {
        return clearTaskAfterCompletion(super.cancel(z), CANCELLED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public void run() {
        try {
            if (setUncancellableInternal()) {
                setSuccessInternal(runTask());
            }
        } catch (Throwable th) {
            setFailureInternal(th);
        }
    }

    public Object runTask() {
        Object obj = this.task;
        if (obj instanceof Callable) {
            return ((Callable) obj).call();
        }
        ((Runnable) obj).run();
        return null;
    }

    public final L setFailure(Throwable th) {
        throw new IllegalStateException();
    }

    public final L setFailureInternal(Throwable th) {
        super.setFailure(th);
        clearTaskAfterCompletion(true, FAILED);
        return this;
    }

    public final L setSuccess(Object obj) {
        throw new IllegalStateException();
    }

    public final L setSuccessInternal(Object obj) {
        super.setSuccess(obj);
        clearTaskAfterCompletion(true, COMPLETED);
        return this;
    }

    public final boolean setUncancellableInternal() {
        return setUncancellable();
    }

    public StringBuilder toStringBuilder() {
        StringBuilder stringBuilder = super.toStringBuilder();
        stringBuilder.setCharAt(stringBuilder.length() - 1, ',');
        stringBuilder.append(" task: ");
        stringBuilder.append(this.task);
        stringBuilder.append(')');
        return stringBuilder;
    }

    public final boolean tryFailure(Throwable th) {
        return false;
    }

    public final boolean trySuccess(Object obj) {
        return false;
    }

    public V(C0929t tVar, Runnable runnable) {
        super(tVar);
        this.task = runnable;
    }

    public V(C0929t tVar, Callable<Object> callable) {
        super(tVar);
        this.task = callable;
    }
}
