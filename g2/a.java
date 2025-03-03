package G2;

public final class a extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1627U = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|(4:9|10|11|12)(2:13|(2:15|24)(1:23))|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0009 A[LOOP:0: B:4:0x0009->B:21:0x0009, LOOP_START, SYNTHETIC, Splitter:B:4:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r3 = this;
            int r0 = r3.f1627U
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.run()
            return
        L_0x0009:
            java.util.concurrent.locks.ReentrantLock r0 = l7.d.f13208h     // Catch:{ InterruptedException -> 0x0009 }
            r0.lock()     // Catch:{ InterruptedException -> 0x0009 }
            l7.d r1 = g7.C0996d.b()     // Catch:{ all -> 0x0026 }
            l7.d r2 = l7.d.f13211l     // Catch:{ all -> 0x0026 }
            if (r1 != r2) goto L_0x001d
            r1 = 0
            l7.d.f13211l = r1     // Catch:{ all -> 0x0026 }
            r0.unlock()     // Catch:{ InterruptedException -> 0x0009 }
            return
        L_0x001d:
            r0.unlock()     // Catch:{ InterruptedException -> 0x0009 }
            if (r1 == 0) goto L_0x0009
            r1.j()     // Catch:{ InterruptedException -> 0x0009 }
            goto L_0x0009
        L_0x0026:
            r1 = move-exception
            r0.unlock()     // Catch:{ InterruptedException -> 0x0009 }
            throw r1     // Catch:{ InterruptedException -> 0x0009 }
        L_0x002b:
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.a.run():void");
    }

    public /* synthetic */ a(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ a(String str) {
        super(str);
    }
}
