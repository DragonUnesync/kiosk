package F;

import C0.e;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class i implements Executor {

    /* renamed from: U  reason: collision with root package name */
    public final ArrayDeque f1415U = new ArrayDeque();

    /* renamed from: V  reason: collision with root package name */
    public final Executor f1416V;

    /* renamed from: W  reason: collision with root package name */
    public final e f1417W = new e(4, this);

    /* renamed from: X  reason: collision with root package name */
    public int f1418X = 1;

    /* renamed from: Y  reason: collision with root package name */
    public long f1419Y = 0;

    public i(Executor executor) {
        executor.getClass();
        this.f1416V = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7.f1416V.execute(r7.f1417W);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r7.f1418X == 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = r7.f1415U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r7.f1419Y != r3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r7.f1418X != 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r7.f1418X = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        monitor-enter(r7.f1415U);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3 = r7.f1418X;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004b, code lost:
        if (r3 == 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005b, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0061, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0065, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f1415U
            monitor-enter(r0)
            int r1 = r7.f1418X     // Catch:{ all -> 0x0066 }
            r2 = 4
            if (r1 == r2) goto L_0x0068
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0068
        L_0x000f:
            long r3 = r7.f1419Y     // Catch:{ all -> 0x0066 }
            D2.a r1 = new D2.a     // Catch:{ all -> 0x0066 }
            r5 = 1
            r1.<init>(r8, r5)     // Catch:{ all -> 0x0066 }
            java.util.ArrayDeque r8 = r7.f1415U     // Catch:{ all -> 0x0066 }
            r8.add(r1)     // Catch:{ all -> 0x0066 }
            r8 = 2
            r7.f1418X = r8     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.Executor r0 = r7.f1416V     // Catch:{ RuntimeException -> 0x0044, Error -> 0x0042 }
            C0.e r5 = r7.f1417W     // Catch:{ RuntimeException -> 0x0044, Error -> 0x0042 }
            r0.execute(r5)     // Catch:{ RuntimeException -> 0x0044, Error -> 0x0042 }
            int r0 = r7.f1418X
            if (r0 == r8) goto L_0x002c
            return
        L_0x002c:
            java.util.ArrayDeque r0 = r7.f1415U
            monitor-enter(r0)
            long r5 = r7.f1419Y     // Catch:{ all -> 0x003c }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x003e
            int r1 = r7.f1418X     // Catch:{ all -> 0x003c }
            if (r1 != r8) goto L_0x003e
            r7.f1418X = r2     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r8 = move-exception
            goto L_0x0040
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r8
        L_0x0042:
            r0 = move-exception
            goto L_0x0045
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            java.util.ArrayDeque r2 = r7.f1415U
            monitor-enter(r2)
            int r3 = r7.f1418X     // Catch:{ all -> 0x0061 }
            r4 = 1
            if (r3 == r4) goto L_0x004f
            if (r3 != r8) goto L_0x0058
        L_0x004f:
            java.util.ArrayDeque r8 = r7.f1415U     // Catch:{ all -> 0x0061 }
            boolean r8 = r8.removeLastOccurrence(r1)     // Catch:{ all -> 0x0061 }
            if (r8 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            boolean r8 = r0 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0061 }
            if (r8 == 0) goto L_0x0063
            if (r4 != 0) goto L_0x0063
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r8 = move-exception
            goto L_0x0064
        L_0x0063:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            throw r8
        L_0x0066:
            r8 = move-exception
            goto L_0x006f
        L_0x0068:
            java.util.ArrayDeque r1 = r7.f1415U     // Catch:{ all -> 0x0066 }
            r1.add(r8)     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return
        L_0x006f:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: F.i.execute(java.lang.Runnable):void");
    }
}
