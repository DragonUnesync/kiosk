package f6;

import g6.B;
import g6.n0;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class r extends C0913c implements L {
    private static final C0925o CANCELLATION_CAUSE_HOLDER;
    /* access modifiers changed from: private */
    public static final StackTraceElement[] CANCELLATION_STACK;
    private static final int MAX_LISTENER_STACK_DEPTH = Math.min(8, p0.getInt("io.netty.defaultPromise.maxListenerStackDepth", 8));
    private static final AtomicReferenceFieldUpdater<r, Object> RESULT_UPDATER;
    private static final Object SUCCESS = new Object();
    private static final Object UNCANCELLABLE = new Object();
    private static final C1082c logger;
    private static final C1082c rejectedExecutionLogger;
    private final C0929t executor;
    private C0910C listener;
    private C0922l listeners;
    private boolean notifyingListeners;
    private volatile Object result;
    private short waiters;

    static {
        Class<r> cls = r.class;
        logger = d.getInstance((Class<?>) cls);
        rejectedExecutionLogger = d.getInstance(cls.getName().concat(".rejectedExecution"));
        RESULT_UPDATER = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "result");
        C0925o oVar = new C0925o(C0927q.newInstance(cls, "cancel(...)"));
        CANCELLATION_CAUSE_HOLDER = oVar;
        CANCELLATION_STACK = oVar.cause.getStackTrace();
    }

    public r(C0929t tVar) {
        this.executor = (C0929t) B.checkNotNull(tVar, "executor");
    }

    private void addListener0(C0910C c8) {
        C0910C c9 = this.listener;
        if (c9 == null) {
            C0922l lVar = this.listeners;
            if (lVar == null) {
                this.listener = c8;
            } else {
                lVar.add(c8);
            }
        } else {
            this.listeners = new C0922l(c9, c8);
            this.listener = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0088, code lost:
        return r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean await0(long r13, boolean r15) {
        /*
            r12 = this;
            boolean r0 = r12.isDone()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            boolean r13 = r12.isDone()
            return r13
        L_0x0013:
            if (r15 == 0) goto L_0x0026
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            java.lang.String r14 = r12.toString()
            r13.<init>(r14)
            throw r13
        L_0x0026:
            r12.checkDeadLock()
            long r4 = java.lang.System.nanoTime()
            monitor-enter(r12)
            r0 = 0
            r6 = r13
        L_0x0030:
            boolean r8 = r12.isDone()     // Catch:{ all -> 0x004b }
            if (r8 != 0) goto L_0x007a
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x007a
            r12.incWaiters()     // Catch:{ all -> 0x004b }
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r6 / r8
            long r6 = r6 % r8
            int r7 = (int) r6     // Catch:{ InterruptedException -> 0x0050 }
            r12.wait(r10, r7)     // Catch:{ InterruptedException -> 0x0050 }
            r12.decWaiters()     // Catch:{ all -> 0x004b }
            goto L_0x0057
        L_0x004b:
            r13 = move-exception
            r1 = r0
            goto L_0x0089
        L_0x004e:
            r13 = move-exception
            goto L_0x0076
        L_0x0050:
            r6 = move-exception
            if (r15 != 0) goto L_0x0075
            r12.decWaiters()     // Catch:{ all -> 0x0073 }
            r0 = 1
        L_0x0057:
            boolean r6 = r12.isDone()     // Catch:{ all -> 0x004b }
            if (r6 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0069
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0067 }
            r13.interrupt()     // Catch:{ all -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            r13 = move-exception
            goto L_0x0093
        L_0x0069:
            monitor-exit(r12)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x006b:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004b }
            long r6 = r6 - r4
            long r6 = r13 - r6
            goto L_0x0030
        L_0x0073:
            r13 = move-exception
            goto L_0x0089
        L_0x0075:
            throw r6     // Catch:{ all -> 0x004e }
        L_0x0076:
            r12.decWaiters()     // Catch:{ all -> 0x004b }
            throw r13     // Catch:{ all -> 0x004b }
        L_0x007a:
            boolean r13 = r12.isDone()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0087
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0067 }
            r14.interrupt()     // Catch:{ all -> 0x0067 }
        L_0x0087:
            monitor-exit(r12)     // Catch:{ all -> 0x0067 }
            return r13
        L_0x0089:
            if (r1 == 0) goto L_0x0092
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0067 }
            r14.interrupt()     // Catch:{ all -> 0x0067 }
        L_0x0092:
            throw r13     // Catch:{ all -> 0x0067 }
        L_0x0093:
            monitor-exit(r12)     // Catch:{ all -> 0x0067 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.r.await0(long, boolean):boolean");
    }

    private Throwable cause0(Object obj) {
        if (!(obj instanceof C0925o)) {
            return null;
        }
        C0925o oVar = CANCELLATION_CAUSE_HOLDER;
        if (obj == oVar) {
            C0926p pVar = new C0926p((C0923m) null);
            AtomicReferenceFieldUpdater<r, Object> atomicReferenceFieldUpdater = RESULT_UPDATER;
            C0925o oVar2 = new C0925o(pVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != oVar) {
                    obj = this.result;
                }
            }
            return pVar;
        }
        return ((C0925o) obj).cause;
    }

    private synchronized boolean checkNotifyWaiters() {
        boolean z;
        try {
            if (this.waiters > 0) {
                notifyAll();
            }
            if (this.listener == null && this.listeners == null) {
                z = false;
            } else {
                z = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return z;
    }

    private void decWaiters() {
        this.waiters = (short) (this.waiters - 1);
    }

    private void incWaiters() {
        short s8 = this.waiters;
        if (s8 != Short.MAX_VALUE) {
            this.waiters = (short) (s8 + 1);
            return;
        }
        throw new IllegalStateException("too many waiters: " + this);
    }

    private static boolean isCancelled0(Object obj) {
        if (!(obj instanceof C0925o) || !(((C0925o) obj).cause instanceof CancellationException)) {
            return false;
        }
        return true;
    }

    private static boolean isDone0(Object obj) {
        if (obj == null || obj == UNCANCELLABLE) {
            return false;
        }
        return true;
    }

    public static void notifyListener(C0929t tVar, C0909B b8, C0910C c8) {
        notifyListenerWithStackOverFlowProtection((C0929t) B.checkNotNull(tVar, "eventExecutor"), (C0909B) B.checkNotNull(b8, "future"), (C0910C) B.checkNotNull(c8, "listener"));
    }

    /* access modifiers changed from: private */
    public static void notifyListener0(C0909B b8, C0910C c8) {
        try {
            c8.operationComplete(b8);
        } catch (Throwable th) {
            if (logger.isWarnEnabled()) {
                C1082c cVar = logger;
                cVar.warn("An exception was thrown by " + c8.getClass().getName() + ".operationComplete()", th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = g6.C0980m.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void notifyListenerWithStackOverFlowProtection(f6.C0929t r3, f6.C0909B r4, f6.C0910C r5) {
        /*
            f6.a r3 = (f6.C0911a) r3
            boolean r0 = r3.inEventLoop()
            if (r0 == 0) goto L_0x0025
            g6.m r0 = g6.C0980m.get()
            int r1 = r0.futureListenerStackDepth()
            int r2 = MAX_LISTENER_STACK_DEPTH
            if (r1 >= r2) goto L_0x0025
            int r3 = r1 + 1
            r0.setFutureListenerStackDepth(r3)
            notifyListener0(r4, r5)     // Catch:{ all -> 0x0020 }
            r0.setFutureListenerStackDepth(r1)
            return
        L_0x0020:
            r3 = move-exception
            r0.setFutureListenerStackDepth(r1)
            throw r3
        L_0x0025:
            f6.n r0 = new f6.n
            r0.<init>(r4, r5)
            safeExecute(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.r.notifyListenerWithStackOverFlowProtection(f6.t, f6.B, f6.C):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = g6.C0980m.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void notifyListeners() {
        /*
            r4 = this;
            f6.t r0 = r4.executor()
            f6.a r0 = (f6.C0911a) r0
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L_0x0029
            g6.m r1 = g6.C0980m.get()
            int r2 = r1.futureListenerStackDepth()
            int r3 = MAX_LISTENER_STACK_DEPTH
            if (r2 >= r3) goto L_0x0029
            int r0 = r2 + 1
            r1.setFutureListenerStackDepth(r0)
            r4.notifyListenersNow()     // Catch:{ all -> 0x0024 }
            r1.setFutureListenerStackDepth(r2)
            return
        L_0x0024:
            r0 = move-exception
            r1.setFutureListenerStackDepth(r2)
            throw r0
        L_0x0029:
            f6.m r1 = new f6.m
            r1.<init>(r4)
            safeExecute(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.r.notifyListeners():void");
    }

    private void notifyListeners0(C0922l lVar) {
        C0910C[] listeners2 = lVar.listeners();
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            notifyListener0(this, listeners2[i]);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        notifyListener0(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        notifyListeners0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0 = r3.listener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r3.listeners != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r3.notifyingListeners = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0035, code lost:
        r1 = r3.listeners;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0037, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        r3.listener = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003c, code lost:
        r3.listeners = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyListenersNow() {
        /*
            r3 = this;
            monitor-enter(r3)
            f6.C r0 = r3.listener     // Catch:{ all -> 0x0017 }
            f6.l r1 = r3.listeners     // Catch:{ all -> 0x0017 }
            boolean r2 = r3.notifyingListeners     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0042
            if (r0 != 0) goto L_0x000e
            if (r1 != 0) goto L_0x000e
            goto L_0x0042
        L_0x000e:
            r2 = 1
            r3.notifyingListeners = r2     // Catch:{ all -> 0x0017 }
            r2 = 0
            if (r0 == 0) goto L_0x0019
            r3.listener = r2     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r0 = move-exception
            goto L_0x0044
        L_0x0019:
            r3.listeners = r2     // Catch:{ all -> 0x0017 }
        L_0x001b:
            monitor-exit(r3)     // Catch:{ all -> 0x0017 }
        L_0x001c:
            if (r0 == 0) goto L_0x0022
            notifyListener0(r3, r0)
            goto L_0x0025
        L_0x0022:
            r3.notifyListeners0(r1)
        L_0x0025:
            monitor-enter(r3)
            f6.C r0 = r3.listener     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0035
            f6.l r1 = r3.listeners     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0035
            r0 = 0
            r3.notifyingListeners = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            goto L_0x0040
        L_0x0035:
            f6.l r1 = r3.listeners     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x003c
            r3.listener = r2     // Catch:{ all -> 0x0033 }
            goto L_0x003e
        L_0x003c:
            r3.listeners = r2     // Catch:{ all -> 0x0033 }
        L_0x003e:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x001c
        L_0x0040:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0042:
            monitor-exit(r3)     // Catch:{ all -> 0x0017 }
            return
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.r.notifyListenersNow():void");
    }

    private void removeListener0(C0910C c8) {
        if (this.listener == c8) {
            this.listener = null;
            return;
        }
        C0922l lVar = this.listeners;
        if (lVar != null) {
            lVar.remove(c8);
            if (this.listeners.size() == 0) {
                this.listeners = null;
            }
        }
    }

    private static void safeExecute(C0929t tVar, Runnable runnable) {
        try {
            tVar.execute(runnable);
        } catch (Throwable th) {
            rejectedExecutionLogger.error("Failed to submit a listener notification task. Event loop shut down?", th);
        }
    }

    private boolean setFailure0(Throwable th) {
        return setValue0(new C0925o((Throwable) B.checkNotNull(th, "cause")));
    }

    private boolean setSuccess0(Object obj) {
        if (obj == null) {
            obj = SUCCESS;
        }
        return setValue0(obj);
    }

    private boolean setValue0(Object obj) {
        AtomicReferenceFieldUpdater<r, Object> atomicReferenceFieldUpdater = RESULT_UPDATER;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, obj)) {
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                AtomicReferenceFieldUpdater<r, Object> atomicReferenceFieldUpdater2 = RESULT_UPDATER;
                Object obj2 = UNCANCELLABLE;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        return false;
                    }
                }
            }
        }
        if (!checkNotifyWaiters()) {
            return true;
        }
        notifyListeners();
        return true;
    }

    public boolean cancel(boolean z) {
        AtomicReferenceFieldUpdater<r, Object> atomicReferenceFieldUpdater = RESULT_UPDATER;
        C0925o oVar = CANCELLATION_CAUSE_HOLDER;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, oVar)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        if (!checkNotifyWaiters()) {
            return true;
        }
        notifyListeners();
        return true;
    }

    public Throwable cause() {
        return cause0(this.result);
    }

    public void checkDeadLock() {
        C0929t executor2 = executor();
        if (executor2 != null && ((C0911a) executor2).inEventLoop()) {
            throw new C0917g(toString());
        }
    }

    public C0929t executor() {
        return this.executor;
    }

    public Object get() {
        Object obj = this.result;
        if (!isDone0(obj)) {
            await();
            obj = this.result;
        }
        if (obj == SUCCESS || obj == UNCANCELLABLE) {
            return null;
        }
        Throwable cause0 = cause0(obj);
        if (cause0 == null) {
            return obj;
        }
        if (cause0 instanceof CancellationException) {
            throw ((CancellationException) cause0);
        }
        throw new ExecutionException(cause0);
    }

    public Object getNow() {
        Object obj = this.result;
        if ((obj instanceof C0925o) || obj == SUCCESS || obj == UNCANCELLABLE) {
            return null;
        }
        return obj;
    }

    public boolean isCancelled() {
        return isCancelled0(this.result);
    }

    public boolean isDone() {
        return isDone0(this.result);
    }

    public boolean isSuccess() {
        Object obj = this.result;
        if (obj == null || obj == UNCANCELLABLE || (obj instanceof C0925o)) {
            return false;
        }
        return true;
    }

    public L setFailure(Throwable th) {
        if (setFailure0(th)) {
            return this;
        }
        throw new IllegalStateException("complete already: " + this, th);
    }

    public L setSuccess(Object obj) {
        if (setSuccess0(obj)) {
            return this;
        }
        throw new IllegalStateException("complete already: " + this);
    }

    public boolean setUncancellable() {
        AtomicReferenceFieldUpdater<r, Object> atomicReferenceFieldUpdater = RESULT_UPDATER;
        Object obj = UNCANCELLABLE;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, obj)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                Object obj2 = this.result;
                if (!isDone0(obj2) || !isCancelled0(obj2)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return toStringBuilder().toString();
    }

    public StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(n0.simpleClassName((Object) this));
        sb.append('@');
        sb.append(Integer.toHexString(hashCode()));
        Object obj = this.result;
        if (obj == SUCCESS) {
            sb.append("(success)");
        } else if (obj == UNCANCELLABLE) {
            sb.append("(uncancellable)");
        } else if (obj instanceof C0925o) {
            sb.append("(failure: ");
            sb.append(((C0925o) obj).cause);
            sb.append(')');
        } else if (obj != null) {
            sb.append("(success: ");
            sb.append(obj);
            sb.append(')');
        } else {
            sb.append("(incomplete)");
        }
        return sb;
    }

    public boolean tryFailure(Throwable th) {
        return setFailure0(th);
    }

    public boolean trySuccess(Object obj) {
        return setSuccess0(obj);
    }

    public L addListener(C0910C c8) {
        B.checkNotNull(c8, "listener");
        synchronized (this) {
            addListener0(c8);
        }
        if (isDone()) {
            notifyListeners();
        }
        return this;
    }

    public L await() {
        if (isDone()) {
            return this;
        }
        if (!Thread.interrupted()) {
            checkDeadLock();
            synchronized (this) {
                while (!isDone()) {
                    try {
                        incWaiters();
                        wait();
                        decWaiters();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this;
        }
        throw new InterruptedException(toString());
    }

    public L removeListener(C0910C c8) {
        B.checkNotNull(c8, "listener");
        synchronized (this) {
            removeListener0(c8);
        }
        return this;
    }

    public r() {
        this.executor = null;
    }

    public Object get(long j7, TimeUnit timeUnit) {
        Object obj = this.result;
        if (!isDone0(obj)) {
            if (await(j7, timeUnit)) {
                obj = this.result;
            } else {
                throw new TimeoutException();
            }
        }
        if (obj == SUCCESS || obj == UNCANCELLABLE) {
            return null;
        }
        Throwable cause0 = cause0(obj);
        if (cause0 == null) {
            return obj;
        }
        if (cause0 instanceof CancellationException) {
            throw ((CancellationException) cause0);
        }
        throw new ExecutionException(cause0);
    }

    public boolean await(long j7, TimeUnit timeUnit) {
        return await0(timeUnit.toNanos(j7), true);
    }
}
