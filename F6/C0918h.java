package f6;

import g6.B;
import java.util.concurrent.TimeUnit;

/* renamed from: f6.h  reason: case insensitive filesystem */
public abstract class C0918h extends C0913c {
    private final C0929t executor;

    public C0918h(C0929t tVar) {
        this.executor = tVar;
    }

    public C0909B addListener(C0910C c8) {
        r.notifyListener(executor(), this, (C0910C) B.checkNotNull(c8, "listener"));
        return this;
    }

    public C0909B await() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public C0929t executor() {
        return this.executor;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public C0909B removeListener(C0910C c8) {
        return this;
    }

    public boolean await(long j7, TimeUnit timeUnit) {
        if (!Thread.interrupted()) {
            return true;
        }
        throw new InterruptedException();
    }
}
