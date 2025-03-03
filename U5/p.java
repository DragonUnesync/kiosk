package U5;

import T5.C0250i;
import T5.N;
import T5.b1;
import T5.p1;
import T5.r1;
import e6.C0859s;
import f6.C0916f;
import f6.W;
import g6.B;
import g6.Y;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class p extends r1 {
    private static final boolean DISABLE_KEY_SET_OPTIMIZATION = p0.getBoolean("io.netty.noKeySetOptimization", false);
    private static final int SELECTOR_AUTO_REBUILD_THRESHOLD;
    private static final C1082c logger = d.getInstance((Class<?>) p.class);
    private int cancelledKeys;
    private volatile int ioRatio = 50;
    private boolean needsToSelectAgain;
    private final AtomicLong nextWakeupNanos = new AtomicLong(-1);
    private final SelectorProvider provider;
    private final C0859s selectNowSupplier = new j(this);
    private final p1 selectStrategy;
    private t selectedKeys;
    private Selector selector;
    private Selector unwrappedSelector;

    static {
        int i = 0;
        if (Y.javaVersion() < 7 && p0.get("sun.nio.ch.bugLevel") == null) {
            try {
                AccessController.doPrivileged(new k());
            } catch (SecurityException e) {
                logger.debug("Unable to get/set System Property: sun.nio.ch.bugLevel", (Throwable) e);
            }
        }
        int i8 = p0.getInt("io.netty.selectorAutoRebuildThreshold", 512);
        if (i8 >= 3) {
            i = i8;
        }
        SELECTOR_AUTO_REBUILD_THRESHOLD = i;
        C1082c cVar = logger;
        if (cVar.isDebugEnabled()) {
            cVar.debug("-Dio.netty.noKeySetOptimization: {}", (Object) Boolean.valueOf(DISABLE_KEY_SET_OPTIMIZATION));
            cVar.debug("-Dio.netty.selectorAutoRebuildThreshold: {}", (Object) Integer.valueOf(i));
        }
    }

    public p(q qVar, Executor executor, SelectorProvider selectorProvider, p1 p1Var, W w2, b1 b1Var, b1 b1Var2) {
        super(qVar, executor, false, newTaskQueue(b1Var), newTaskQueue(b1Var2), w2);
        this.provider = (SelectorProvider) B.checkNotNull(selectorProvider, "selectorProvider");
        this.selectStrategy = (p1) B.checkNotNull(p1Var, "selectStrategy");
        o openSelector = openSelector();
        this.selector = openSelector.selector;
        this.unwrappedSelector = openSelector.unwrappedSelector;
    }

    private void closeAll() {
        selectAgain();
        Set<SelectionKey> keys = this.selector.keys();
        ArrayList arrayList = new ArrayList(keys.size());
        for (SelectionKey next : keys) {
            Object attachment = next.attachment();
            if (attachment instanceof i) {
                arrayList.add((i) attachment);
            } else {
                next.cancel();
                if (attachment == null) {
                    invokeChannelUnregistered((r) null, next, (Throwable) null);
                } else {
                    throw new ClassCastException();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            ((C0250i) iVar.unsafe()).close(((C0250i) iVar.unsafe()).voidPromise());
        }
    }

    private static void handleLoopException(Throwable th) {
        logger.warn("Unexpected exception in the selector loop.", th);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException unused) {
        }
    }

    private static void invokeChannelUnregistered(r rVar, SelectionKey selectionKey, Throwable th) {
        try {
            selectionKey.channel();
            rVar.a();
        } catch (Exception e) {
            logger.warn("Unexpected exception while running NioTask.channelUnregistered()", (Throwable) e);
        }
    }

    private static Queue<Runnable> newTaskQueue(b1 b1Var) {
        if (b1Var == null) {
            return newTaskQueue0(r1.DEFAULT_MAX_PENDING_TASKS);
        }
        return b1Var.a();
    }

    private static Queue<Runnable> newTaskQueue0(int i) {
        if (i == Integer.MAX_VALUE) {
            return Y.newMpscQueue();
        }
        return Y.newMpscQueue(i);
    }

    private o openSelector() {
        try {
            AbstractSelector openSelector = this.provider.openSelector();
            if (DISABLE_KEY_SET_OPTIMIZATION) {
                return new o(openSelector);
            }
            Object doPrivileged = AccessController.doPrivileged(new l(this));
            if (doPrivileged instanceof Class) {
                Class cls = (Class) doPrivileged;
                if (cls.isAssignableFrom(openSelector.getClass())) {
                    t tVar = new t();
                    Object doPrivileged2 = AccessController.doPrivileged(new m(this, cls, openSelector, tVar));
                    if (doPrivileged2 instanceof Exception) {
                        this.selectedKeys = null;
                        logger.trace("failed to instrument a special java.util.Set into: {}", openSelector, (Exception) doPrivileged2);
                        return new o(openSelector);
                    }
                    this.selectedKeys = tVar;
                    logger.trace("instrumented a special java.util.Set into: {}", (Object) openSelector);
                    return new o(openSelector, new u(openSelector, tVar));
                }
            }
            if (doPrivileged instanceof Throwable) {
                logger.trace("failed to instrument a special java.util.Set into: {}", openSelector, (Throwable) doPrivileged);
            }
            return new o(openSelector);
        } catch (IOException e) {
            throw new N("failed to open a new selector", e);
        }
    }

    private void processSelectedKey(SelectionKey selectionKey, i iVar) {
        h unsafe = iVar.unsafe();
        if (!selectionKey.isValid()) {
            try {
                if (iVar.eventLoop() == this) {
                    ((C0250i) unsafe).close(((C0250i) unsafe).voidPromise());
                }
            } catch (Throwable unused) {
            }
        } else {
            try {
                int readyOps = selectionKey.readyOps();
                if ((readyOps & 8) != 0) {
                    selectionKey.interestOps(selectionKey.interestOps() & -9);
                    ((g) unsafe).finishConnect();
                }
                if ((readyOps & 4) != 0) {
                    ((g) unsafe).forceFlush();
                }
                if ((readyOps & 17) != 0 || readyOps == 0) {
                    ((b) unsafe).read();
                }
            } catch (CancelledKeyException unused2) {
                ((C0250i) unsafe).close(((C0250i) unsafe).voidPromise());
            }
        }
    }

    private void processSelectedKeys() {
        if (this.selectedKeys != null) {
            processSelectedKeysOptimized();
        } else {
            processSelectedKeysPlain(this.selector.selectedKeys());
        }
    }

    private void processSelectedKeysOptimized() {
        int i = 0;
        while (true) {
            t tVar = this.selectedKeys;
            if (i < tVar.size) {
                SelectionKey[] selectionKeyArr = tVar.keys;
                SelectionKey selectionKey = selectionKeyArr[i];
                selectionKeyArr[i] = null;
                Object attachment = selectionKey.attachment();
                if (attachment instanceof i) {
                    processSelectedKey(selectionKey, (i) attachment);
                } else if (attachment == null) {
                    processSelectedKey(selectionKey, (r) null);
                } else {
                    throw new ClassCastException();
                }
                if (this.needsToSelectAgain) {
                    this.selectedKeys.reset(i + 1);
                    selectAgain();
                    i = -1;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void processSelectedKeysPlain(Set<SelectionKey> set) {
        if (!set.isEmpty()) {
            Iterator<SelectionKey> it = set.iterator();
            while (true) {
                SelectionKey next = it.next();
                Object attachment = next.attachment();
                it.remove();
                if (attachment instanceof i) {
                    processSelectedKey(next, (i) attachment);
                } else if (attachment == null) {
                    processSelectedKey(next, (r) null);
                } else {
                    throw new ClassCastException();
                }
                if (it.hasNext()) {
                    if (this.needsToSelectAgain) {
                        selectAgain();
                        Set<SelectionKey> selectedKeys2 = this.selector.selectedKeys();
                        if (!selectedKeys2.isEmpty()) {
                            it = selectedKeys2.iterator();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void rebuildSelector0() {
        Selector selector2 = this.selector;
        if (selector2 != null) {
            try {
                o openSelector = openSelector();
                int i = 0;
                for (SelectionKey next : selector2.keys()) {
                    Object attachment = next.attachment();
                    try {
                        if (next.isValid()) {
                            if (next.channel().keyFor(openSelector.unwrappedSelector) == null) {
                                int interestOps = next.interestOps();
                                next.cancel();
                                SelectionKey register = next.channel().register(openSelector.unwrappedSelector, interestOps, attachment);
                                if (attachment instanceof i) {
                                    ((i) attachment).selectionKey = register;
                                }
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        logger.warn("Failed to re-register a Channel to the new Selector.", (Throwable) e);
                        if (attachment instanceof i) {
                            i iVar = (i) attachment;
                            ((C0250i) iVar.unsafe()).close(((C0250i) iVar.unsafe()).voidPromise());
                        } else if (attachment == null) {
                            invokeChannelUnregistered((r) null, next, e);
                        } else {
                            throw new ClassCastException();
                        }
                    }
                }
                this.selector = openSelector.selector;
                this.unwrappedSelector = openSelector.unwrappedSelector;
                try {
                    selector2.close();
                } catch (Throwable th) {
                    if (logger.isWarnEnabled()) {
                        logger.warn("Failed to close the old Selector.", th);
                    }
                }
                C1082c cVar = logger;
                if (cVar.isInfoEnabled()) {
                    cVar.info("Migrated " + i + " channel(s) to the new Selector.");
                }
            } catch (Exception e8) {
                logger.warn("Failed to create a new Selector.", (Throwable) e8);
            }
        }
    }

    private int select(long j7) {
        if (j7 == Long.MAX_VALUE) {
            return this.selector.select();
        }
        long deadlineToDelayNanos = C0916f.deadlineToDelayNanos(j7 + 995000) / 1000000;
        if (deadlineToDelayNanos <= 0) {
            return this.selector.selectNow();
        }
        return this.selector.select(deadlineToDelayNanos);
    }

    private void selectAgain() {
        this.needsToSelectAgain = false;
        try {
            this.selector.selectNow();
        } catch (Throwable th) {
            logger.warn("Failed to update SelectionKeys.", th);
        }
    }

    private boolean unexpectedSelectorWakeup(int i) {
        if (Thread.interrupted()) {
            C1082c cVar = logger;
            if (cVar.isDebugEnabled()) {
                cVar.debug("Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop.");
            }
            return true;
        }
        int i8 = SELECTOR_AUTO_REBUILD_THRESHOLD;
        if (i8 <= 0 || i < i8) {
            return false;
        }
        logger.warn("Selector.select() returned prematurely {} times in a row; rebuilding Selector {}.", Integer.valueOf(i), this.selector);
        rebuildSelector();
        return true;
    }

    public boolean afterScheduledTaskSubmitted(long j7) {
        if (j7 < this.nextWakeupNanos.get()) {
            return true;
        }
        return false;
    }

    public boolean beforeScheduledTaskSubmitted(long j7) {
        if (j7 < this.nextWakeupNanos.get()) {
            return true;
        }
        return false;
    }

    public void cancel(SelectionKey selectionKey) {
        selectionKey.cancel();
        int i = this.cancelledKeys + 1;
        this.cancelledKeys = i;
        if (i >= 256) {
            this.cancelledKeys = 0;
            this.needsToSelectAgain = true;
        }
    }

    public void cleanup() {
        try {
            this.selector.close();
        } catch (IOException e) {
            logger.warn("Failed to close a selector.", (Throwable) e);
        }
    }

    public void rebuildSelector() {
        if (!inEventLoop()) {
            execute(new n(this));
        } else {
            rebuildSelector0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x011f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0120, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0122, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0123, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x012e, code lost:
        closeAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0135, code lost:
        if (confirmShutdown() != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0147, code lost:
        r2.debug("CancelledKeyException" + " raised by a Selector {} - JDK bug?", r9.selector, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0165, code lost:
        closeAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x016c, code lost:
        if (confirmShutdown() != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x016e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0178, code lost:
        if (isShuttingDown() != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x017a, code lost:
        closeAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0181, code lost:
        if (confirmShutdown() != false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0184, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0188, code lost:
        handleLoopException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x018b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x018c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b9, code lost:
        if (unexpectedSelectorWakeup(r3) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00ef, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00f0, code lost:
        r3 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00f3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00f4, code lost:
        r3 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2 != -1) goto L_0x005a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x012e A[Catch:{ Error -> 0x013a, all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0147 A[Catch:{ CancelledKeyException -> 0x0122, Error -> 0x0074, all -> 0x011f, all -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0165 A[Catch:{ Error -> 0x0172, all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0074 A[Catch:{ all -> 0x0099, all -> 0x006c, CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }, ExcHandler: Error (r0v6 'e' java.lang.Error A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:33:0x005c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            T5.p1 r2 = r9.selectStrategy     // Catch:{ IOException -> 0x00f7 }
            e6.s r3 = r9.selectNowSupplier     // Catch:{ IOException -> 0x00f7 }
            boolean r4 = r9.hasTasks()     // Catch:{ IOException -> 0x00f7 }
            T5.W0 r2 = (T5.W0) r2     // Catch:{ IOException -> 0x00f7 }
            int r2 = r2.calculateStrategy(r3, r4)     // Catch:{ IOException -> 0x00f7 }
            r3 = -3
            if (r2 == r3) goto L_0x0033
            r3 = -2
            if (r2 == r3) goto L_0x001a
            r3 = -1
            if (r2 == r3) goto L_0x0033
            goto L_0x005a
        L_0x001a:
            boolean r2 = r9.isShuttingDown()     // Catch:{ Error -> 0x002c, all -> 0x002a }
            if (r2 == 0) goto L_0x0002
            r9.closeAll()     // Catch:{ Error -> 0x002c, all -> 0x002a }
            boolean r2 = r9.confirmShutdown()     // Catch:{ Error -> 0x002c, all -> 0x002a }
            if (r2 == 0) goto L_0x0002
            return
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            r0 = move-exception
            goto L_0x0032
        L_0x002e:
            handleLoopException(r2)
            goto L_0x0002
        L_0x0032:
            throw r0
        L_0x0033:
            long r3 = r9.nextScheduledTaskDeadlineNanos()     // Catch:{ IOException -> 0x00f7 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0042
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0042:
            java.util.concurrent.atomic.AtomicLong r7 = r9.nextWakeupNanos     // Catch:{ IOException -> 0x00f7 }
            r7.set(r3)     // Catch:{ IOException -> 0x00f7 }
            boolean r7 = r9.hasTasks()     // Catch:{ all -> 0x0052 }
            if (r7 != 0) goto L_0x0055
            int r2 = r9.select(r3)     // Catch:{ all -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            r2 = move-exception
            goto L_0x00f9
        L_0x0055:
            java.util.concurrent.atomic.AtomicLong r3 = r9.nextWakeupNanos     // Catch:{ IOException -> 0x00f7 }
            r3.lazySet(r5)     // Catch:{ IOException -> 0x00f7 }
        L_0x005a:
            int r3 = r1 + 1
            r9.cancelledKeys = r0     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            r9.needsToSelectAgain = r0     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            int r4 = r9.ioRatio     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            r5 = 100
            if (r4 != r5) goto L_0x007f
            if (r2 <= 0) goto L_0x007a
            r9.processSelectedKeys()     // Catch:{ all -> 0x006c }
            goto L_0x007a
        L_0x006c:
            r1 = move-exception
            r9.runAllTasks()     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            throw r1     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            goto L_0x0125
        L_0x0074:
            r0 = move-exception
            goto L_0x013e
        L_0x0077:
            r1 = move-exception
            goto L_0x013f
        L_0x007a:
            boolean r4 = r9.runAllTasks()     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            goto L_0x00b0
        L_0x007f:
            if (r2 <= 0) goto L_0x00aa
            long r5 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            r9.processSelectedKeys()     // Catch:{ all -> 0x0099 }
            long r7 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            long r7 = r7 - r5
            int r5 = 100 - r4
            long r5 = (long) r5     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            long r7 = r7 * r5
            long r4 = (long) r4     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            long r7 = r7 / r4
            boolean r4 = r9.runAllTasks(r7)     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            goto L_0x00b0
        L_0x0099:
            r1 = move-exception
            long r7 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            long r7 = r7 - r5
            int r2 = 100 - r4
            long r5 = (long) r2     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            long r7 = r7 * r5
            long r4 = (long) r4     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            long r7 = r7 / r4
            r9.runAllTasks(r7)     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            throw r1     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
        L_0x00aa:
            r4 = 0
            boolean r4 = r9.runAllTasks(r4)     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
        L_0x00b0:
            if (r4 != 0) goto L_0x00bd
            if (r2 <= 0) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            boolean r1 = r9.unexpectedSelectorWakeup(r3)     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            if (r1 == 0) goto L_0x00d4
        L_0x00bb:
            r3 = 0
            goto L_0x00d4
        L_0x00bd:
            r2 = 3
            if (r3 <= r2) goto L_0x00bb
            h6.c r2 = logger     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            boolean r4 = r2.isDebugEnabled()     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            if (r4 == 0) goto L_0x00bb
            java.lang.String r4 = "Selector.select() returned prematurely {} times in a row for Selector {}."
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            java.nio.channels.Selector r5 = r9.selector     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            r2.debug(r4, r1, r5)     // Catch:{ CancelledKeyException -> 0x0077, Error -> 0x0074, all -> 0x0071 }
            goto L_0x00bb
        L_0x00d4:
            boolean r1 = r9.isShuttingDown()     // Catch:{ Error -> 0x00e6, all -> 0x00e4 }
            if (r1 == 0) goto L_0x00eb
            r9.closeAll()     // Catch:{ Error -> 0x00e6, all -> 0x00e4 }
            boolean r1 = r9.confirmShutdown()     // Catch:{ Error -> 0x00e6, all -> 0x00e4 }
            if (r1 == 0) goto L_0x00eb
            return
        L_0x00e4:
            r1 = move-exception
            goto L_0x00e8
        L_0x00e6:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e8:
            handleLoopException(r1)
        L_0x00eb:
            r1 = r3
            goto L_0x0002
        L_0x00ee:
            throw r0
        L_0x00ef:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x0125
        L_0x00f3:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x013f
        L_0x00f7:
            r2 = move-exception
            goto L_0x00ff
        L_0x00f9:
            java.util.concurrent.atomic.AtomicLong r3 = r9.nextWakeupNanos     // Catch:{ IOException -> 0x00f7 }
            r3.lazySet(r5)     // Catch:{ IOException -> 0x00f7 }
            throw r2     // Catch:{ IOException -> 0x00f7 }
        L_0x00ff:
            r9.rebuildSelector0()     // Catch:{ CancelledKeyException -> 0x00f3, Error -> 0x0074, all -> 0x00ef }
            handleLoopException(r2)     // Catch:{ CancelledKeyException -> 0x0122, Error -> 0x0074, all -> 0x011f }
            boolean r1 = r9.isShuttingDown()     // Catch:{ Error -> 0x0117, all -> 0x0115 }
            if (r1 == 0) goto L_0x0001
            r9.closeAll()     // Catch:{ Error -> 0x0117, all -> 0x0115 }
            boolean r1 = r9.confirmShutdown()     // Catch:{ Error -> 0x0117, all -> 0x0115 }
            if (r1 == 0) goto L_0x0001
            return
        L_0x0115:
            r1 = move-exception
            goto L_0x0119
        L_0x0117:
            r0 = move-exception
            goto L_0x011e
        L_0x0119:
            handleLoopException(r1)
            goto L_0x0001
        L_0x011e:
            throw r0
        L_0x011f:
            r1 = move-exception
            r3 = 0
            goto L_0x0125
        L_0x0122:
            r1 = move-exception
            r3 = 0
            goto L_0x013f
        L_0x0125:
            handleLoopException(r1)     // Catch:{ all -> 0x013c }
            boolean r1 = r9.isShuttingDown()     // Catch:{ Error -> 0x013a, all -> 0x0138 }
            if (r1 == 0) goto L_0x00eb
            r9.closeAll()     // Catch:{ Error -> 0x013a, all -> 0x0138 }
            boolean r1 = r9.confirmShutdown()     // Catch:{ Error -> 0x013a, all -> 0x0138 }
            if (r1 == 0) goto L_0x00eb
            return
        L_0x0138:
            r1 = move-exception
            goto L_0x00e8
        L_0x013a:
            r0 = move-exception
            throw r0
        L_0x013c:
            r0 = move-exception
            goto L_0x0174
        L_0x013e:
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013f:
            h6.c r2 = logger     // Catch:{ all -> 0x013c }
            boolean r4 = r2.isDebugEnabled()     // Catch:{ all -> 0x013c }
            if (r4 == 0) goto L_0x015f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            r4.<init>()     // Catch:{ all -> 0x013c }
            java.lang.String r5 = "CancelledKeyException"
            r4.append(r5)     // Catch:{ all -> 0x013c }
            java.lang.String r5 = " raised by a Selector {} - JDK bug?"
            r4.append(r5)     // Catch:{ all -> 0x013c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x013c }
            java.nio.channels.Selector r5 = r9.selector     // Catch:{ all -> 0x013c }
            r2.debug(r4, r5, r1)     // Catch:{ all -> 0x013c }
        L_0x015f:
            boolean r1 = r9.isShuttingDown()     // Catch:{ Error -> 0x0172, all -> 0x016f }
            if (r1 == 0) goto L_0x00eb
            r9.closeAll()     // Catch:{ Error -> 0x0172, all -> 0x016f }
            boolean r1 = r9.confirmShutdown()     // Catch:{ Error -> 0x0172, all -> 0x016f }
            if (r1 == 0) goto L_0x00eb
            return
        L_0x016f:
            r1 = move-exception
            goto L_0x00e8
        L_0x0172:
            r0 = move-exception
            throw r0
        L_0x0174:
            boolean r1 = r9.isShuttingDown()     // Catch:{ Error -> 0x0186, all -> 0x0184 }
            if (r1 == 0) goto L_0x018b
            r9.closeAll()     // Catch:{ Error -> 0x0186, all -> 0x0184 }
            boolean r1 = r9.confirmShutdown()     // Catch:{ Error -> 0x0186, all -> 0x0184 }
            if (r1 == 0) goto L_0x018b
            return
        L_0x0184:
            r1 = move-exception
            goto L_0x0188
        L_0x0186:
            r0 = move-exception
            goto L_0x018c
        L_0x0188:
            handleLoopException(r1)
        L_0x018b:
            throw r0
        L_0x018c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.p.run():void");
    }

    public int selectNow() {
        return this.selector.selectNow();
    }

    public Selector unwrappedSelector() {
        return this.unwrappedSelector;
    }

    public void wakeup(boolean z) {
        if (!z && this.nextWakeupNanos.getAndSet(-1) != -1) {
            this.selector.wakeup();
        }
    }

    private static void processSelectedKey(SelectionKey selectionKey, r rVar) {
        try {
            selectionKey.channel();
            rVar.b();
            if (!selectionKey.isValid()) {
                invokeChannelUnregistered(rVar, selectionKey, (Throwable) null);
            }
        } catch (Exception e) {
            selectionKey.cancel();
            invokeChannelUnregistered(rVar, selectionKey, e);
        } catch (Throwable th) {
            selectionKey.cancel();
            invokeChannelUnregistered(rVar, selectionKey, (Throwable) null);
            throw th;
        }
    }
}
