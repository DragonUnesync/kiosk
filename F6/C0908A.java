package f6;

import g6.C0980m;
import h6.C1082c;
import h6.d;

/* renamed from: f6.A  reason: case insensitive filesystem */
public final class C0908A extends Thread {
    private static final C1082c logger = d.getInstance((Class<?>) C0908A.class);
    private final boolean cleanupFastThreadLocals = true;
    private C0980m threadLocalMap;

    public C0908A(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, C0935z.wrap(runnable), str);
    }

    public final void setThreadLocalMap(C0980m mVar) {
        if (this != Thread.currentThread()) {
            C1082c cVar = logger;
            if (cVar.isWarnEnabled()) {
                cVar.warn((Throwable) new RuntimeException("It's not thread-safe to set 'threadLocalMap' which doesn't belong to the caller thread"));
            }
        }
        this.threadLocalMap = mVar;
    }

    public final C0980m threadLocalMap() {
        if (this != Thread.currentThread()) {
            C1082c cVar = logger;
            if (cVar.isWarnEnabled()) {
                cVar.warn((Throwable) new RuntimeException("It's not thread-safe to get 'threadLocalMap' which doesn't belong to the caller thread"));
            }
        }
        return this.threadLocalMap;
    }
}
