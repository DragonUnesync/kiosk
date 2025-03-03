package f6;

import g6.B;

public final class O {
    /* access modifiers changed from: private */
    public L aggregatePromise;
    /* access modifiers changed from: private */
    public Throwable cause;
    /* access modifiers changed from: private */
    public int doneCount;
    /* access modifiers changed from: private */
    public final C0929t executor;
    /* access modifiers changed from: private */
    public int expectedCount;
    private final C0910C listener = new N(this);

    public O(C0929t tVar) {
        this.executor = (C0929t) B.checkNotNull(tVar, "executor");
    }

    public static /* synthetic */ int access$204(O o2) {
        int i = o2.doneCount + 1;
        o2.doneCount = i;
        return i;
    }

    private void checkAddAllowed() {
        if (this.aggregatePromise != null) {
            throw new IllegalStateException("Adding promises is not allowed after finished adding");
        }
    }

    private void checkInEventLoop() {
        if (!((C0911a) this.executor).inEventLoop()) {
            throw new IllegalStateException("Must be called from EventExecutor thread");
        }
    }

    /* access modifiers changed from: private */
    public boolean tryPromise() {
        Throwable th = this.cause;
        if (th == null) {
            return this.aggregatePromise.trySuccess((Object) null);
        }
        return this.aggregatePromise.tryFailure(th);
    }

    public void add(C0909B b8) {
        checkAddAllowed();
        checkInEventLoop();
        this.expectedCount++;
        b8.addListener(this.listener);
    }

    public void finish(L l8) {
        B.checkNotNull(l8, "aggregatePromise");
        checkInEventLoop();
        if (this.aggregatePromise == null) {
            this.aggregatePromise = l8;
            if (this.doneCount == this.expectedCount) {
                tryPromise();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already finished");
    }
}
