package f6;

public final class c0 implements Runnable {
    final /* synthetic */ d0 this$0;

    public c0(d0 d0Var) {
        this.this$0 = d0Var;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 265 */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "An event executor terminated with non-empty task queue ("
            f6.d0 r1 = r10.this$0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread unused = r1.thread = r2
            f6.d0 r1 = r10.this$0
            boolean r1 = r1.interrupted
            if (r1 == 0) goto L_0x001c
            f6.d0 r1 = r10.this$0
            java.lang.Thread r1 = r1.thread
            r1.interrupt()
        L_0x001c:
            f6.d0 r1 = r10.this$0
            r1.updateLastExecutionTime()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 41
            r5 = 5
            f6.d0 r6 = r10.this$0     // Catch:{ all -> 0x01d2 }
            r6.run()     // Catch:{ all -> 0x01d2 }
        L_0x002c:
            f6.d0 r6 = r10.this$0
            int r6 = r6.state
            if (r6 >= r2) goto L_0x0040
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = f6.d0.STATE_UPDATER
            f6.d0 r8 = r10.this$0
            boolean r6 = r7.compareAndSet(r8, r6, r2)
            if (r6 == 0) goto L_0x002c
        L_0x0040:
            f6.d0 r2 = r10.this$0
            long r6 = r2.gracefulShutdownStartTime
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0084
            h6.c r2 = f6.d0.logger
            boolean r2 = r2.isErrorEnabled()
            if (r2 == 0) goto L_0x0084
            h6.c r2 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Buggy "
            r6.<init>(r7)
            java.lang.Class<f6.t> r7 = f6.C0929t.class
            java.lang.String r7 = r7.getSimpleName()
            r6.append(r7)
            java.lang.String r7 = " implementation; "
            r6.append(r7)
            java.lang.Class<f6.d0> r7 = f6.d0.class
            java.lang.String r7 = r7.getSimpleName()
            r6.append(r7)
            java.lang.String r7 = ".confirmShutdown() must be called before run() implementation terminates."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.error(r6)
        L_0x0084:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x00a1 }
            boolean r2 = r2.confirmShutdown()     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x0084
        L_0x008c:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x00a1 }
            int r2 = r2.state     // Catch:{ all -> 0x00a1 }
            if (r2 >= r1) goto L_0x00a4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = f6.d0.STATE_UPDATER     // Catch:{ all -> 0x00a1 }
            f6.d0 r7 = r10.this$0     // Catch:{ all -> 0x00a1 }
            boolean r2 = r6.compareAndSet(r7, r2, r1)     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x008c
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x013e
        L_0x00a4:
            f6.d0 r1 = r10.this$0     // Catch:{ all -> 0x00a1 }
            r1.confirmShutdown()     // Catch:{ all -> 0x00a1 }
            f6.d0 r1 = r10.this$0     // Catch:{ all -> 0x00f6 }
            r1.cleanup()     // Catch:{ all -> 0x00f6 }
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f6.d0.STATE_UPDATER
            f6.d0 r2 = r10.this$0
            r1.set(r2, r5)
            f6.d0 r1 = r10.this$0
            java.util.concurrent.CountDownLatch r1 = r1.threadLock
            r1.countDown()
            f6.d0 r1 = r10.this$0
            int r1 = r1.drainTasks()
            if (r1 <= 0) goto L_0x00eb
            h6.c r2 = f6.d0.logger
            boolean r2 = r2.isWarnEnabled()
            if (r2 == 0) goto L_0x00eb
            h6.c r2 = f6.d0.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
        L_0x00de:
            r5.append(r1)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            r2.warn((java.lang.String) r0)
        L_0x00eb:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            goto L_0x024c
        L_0x00f6:
            r1 = move-exception
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x0134
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x0134
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x0134:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x013e:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x018a }
            r2.cleanup()     // Catch:{ all -> 0x018a }
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x0180
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x0180
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x0180:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x018a:
            r1 = move-exception
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x01c8
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x01c8
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x01c8:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x01d2:
            r6 = move-exception
            h6.c r7 = f6.d0.logger     // Catch:{ all -> 0x0329 }
            java.lang.String r8 = "Unexpected exception from an event executor: "
            r7.warn((java.lang.String) r8, (java.lang.Throwable) r6)     // Catch:{ all -> 0x0329 }
        L_0x01dc:
            f6.d0 r6 = r10.this$0
            int r6 = r6.state
            if (r6 >= r2) goto L_0x01f0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = f6.d0.STATE_UPDATER
            f6.d0 r8 = r10.this$0
            boolean r6 = r7.compareAndSet(r8, r6, r2)
            if (r6 == 0) goto L_0x01dc
        L_0x01f0:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x020d }
            boolean r2 = r2.confirmShutdown()     // Catch:{ all -> 0x020d }
            if (r2 == 0) goto L_0x01f0
        L_0x01f8:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x020d }
            int r2 = r2.state     // Catch:{ all -> 0x020d }
            if (r2 >= r1) goto L_0x0210
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = f6.d0.STATE_UPDATER     // Catch:{ all -> 0x020d }
            f6.d0 r7 = r10.this$0     // Catch:{ all -> 0x020d }
            boolean r2 = r6.compareAndSet(r7, r2, r1)     // Catch:{ all -> 0x020d }
            if (r2 == 0) goto L_0x01f8
            goto L_0x0210
        L_0x020d:
            r1 = move-exception
            goto L_0x0295
        L_0x0210:
            f6.d0 r1 = r10.this$0     // Catch:{ all -> 0x020d }
            r1.confirmShutdown()     // Catch:{ all -> 0x020d }
            f6.d0 r1 = r10.this$0     // Catch:{ all -> 0x024d }
            r1.cleanup()     // Catch:{ all -> 0x024d }
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f6.d0.STATE_UPDATER
            f6.d0 r2 = r10.this$0
            r1.set(r2, r5)
            f6.d0 r1 = r10.this$0
            java.util.concurrent.CountDownLatch r1 = r1.threadLock
            r1.countDown()
            f6.d0 r1 = r10.this$0
            int r1 = r1.drainTasks()
            if (r1 <= 0) goto L_0x00eb
            h6.c r2 = f6.d0.logger
            boolean r2 = r2.isWarnEnabled()
            if (r2 == 0) goto L_0x00eb
            h6.c r2 = f6.d0.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            goto L_0x00de
        L_0x024c:
            return
        L_0x024d:
            r1 = move-exception
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x028b
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x028b
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x028b:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x0295:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x02e1 }
            r2.cleanup()     // Catch:{ all -> 0x02e1 }
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x02d7
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x02d7
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x02d7:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x02e1:
            r1 = move-exception
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x031f
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x031f
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x031f:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x0329:
            r6 = move-exception
        L_0x032a:
            f6.d0 r7 = r10.this$0
            int r7 = r7.state
            if (r7 >= r2) goto L_0x033e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = f6.d0.STATE_UPDATER
            f6.d0 r9 = r10.this$0
            boolean r7 = r8.compareAndSet(r9, r7, r2)
            if (r7 == 0) goto L_0x032a
        L_0x033e:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x035b }
            boolean r2 = r2.confirmShutdown()     // Catch:{ all -> 0x035b }
            if (r2 == 0) goto L_0x033e
        L_0x0346:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x035b }
            int r2 = r2.state     // Catch:{ all -> 0x035b }
            if (r2 >= r1) goto L_0x035e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = f6.d0.STATE_UPDATER     // Catch:{ all -> 0x035b }
            f6.d0 r8 = r10.this$0     // Catch:{ all -> 0x035b }
            boolean r2 = r7.compareAndSet(r8, r2, r1)     // Catch:{ all -> 0x035b }
            if (r2 == 0) goto L_0x0346
            goto L_0x035e
        L_0x035b:
            r1 = move-exception
            goto L_0x03f7
        L_0x035e:
            f6.d0 r1 = r10.this$0     // Catch:{ all -> 0x035b }
            r1.confirmShutdown()     // Catch:{ all -> 0x035b }
            f6.d0 r1 = r10.this$0     // Catch:{ all -> 0x03af }
            r1.cleanup()     // Catch:{ all -> 0x03af }
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f6.d0.STATE_UPDATER
            f6.d0 r2 = r10.this$0
            r1.set(r2, r5)
            f6.d0 r1 = r10.this$0
            java.util.concurrent.CountDownLatch r1 = r1.threadLock
            r1.countDown()
            f6.d0 r1 = r10.this$0
            int r1 = r1.drainTasks()
            if (r1 <= 0) goto L_0x03a5
            h6.c r2 = f6.d0.logger
            boolean r2 = r2.isWarnEnabled()
            if (r2 == 0) goto L_0x03a5
            h6.c r2 = f6.d0.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            r2.warn((java.lang.String) r0)
        L_0x03a5:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r6
        L_0x03af:
            r1 = move-exception
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x03ed
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x03ed
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x03ed:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x03f7:
            f6.d0 r2 = r10.this$0     // Catch:{ all -> 0x0443 }
            r2.cleanup()     // Catch:{ all -> 0x0443 }
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x0439
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x0439
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x0439:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        L_0x0443:
            r1 = move-exception
            f6.C0934y.removeAll()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f6.d0.STATE_UPDATER
            f6.d0 r6 = r10.this$0
            r2.set(r6, r5)
            f6.d0 r2 = r10.this$0
            java.util.concurrent.CountDownLatch r2 = r2.threadLock
            r2.countDown()
            f6.d0 r2 = r10.this$0
            int r2 = r2.drainTasks()
            if (r2 <= 0) goto L_0x0481
            h6.c r5 = f6.d0.logger
            boolean r5 = r5.isWarnEnabled()
            if (r5 == 0) goto L_0x0481
            h6.c r5 = f6.d0.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r5.warn((java.lang.String) r0)
        L_0x0481:
            f6.d0 r0 = r10.this$0
            f6.L r0 = r0.terminationFuture
            r0.setSuccess(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.c0.run():void");
    }
}
