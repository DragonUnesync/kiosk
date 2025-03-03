package S5;

import f6.C0934y;

/* renamed from: S5.h0  reason: case insensitive filesystem */
public final class C0174h0 extends C0934y {
    final /* synthetic */ C0176i0 this$0;
    private final boolean useCacheForAllThreads;

    public C0174h0(C0176i0 i0Var, boolean z) {
        this.this$0 = i0Var;
        this.useCacheForAllThreads = z;
    }

    private <T> S leastUsedArena(S[] sArr) {
        if (sArr == null || sArr.length == 0) {
            return null;
        }
        S s8 = sArr[0];
        if (s8.numThreadCaches.get() == 0) {
            return s8;
        }
        for (int i = 1; i < sArr.length; i++) {
            S s9 = sArr[i];
            if (s9.numThreadCaches.get() < s8.numThreadCaches.get()) {
                s8 = s9;
            }
        }
        return s8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized S5.C0168e0 initialValue() {
        /*
            r10 = this;
            monitor-enter(r10)
            S5.i0 r0 = r10.this$0     // Catch:{ all -> 0x0035 }
            S5.S[] r0 = r0.heapArenas     // Catch:{ all -> 0x0035 }
            S5.S r2 = r10.leastUsedArena(r0)     // Catch:{ all -> 0x0035 }
            S5.i0 r0 = r10.this$0     // Catch:{ all -> 0x0035 }
            S5.S[] r0 = r0.directArenas     // Catch:{ all -> 0x0035 }
            S5.S r3 = r10.leastUsedArena(r0)     // Catch:{ all -> 0x0035 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0035 }
            f6.t r9 = g6.t0.currentExecutor()     // Catch:{ all -> 0x0035 }
            boolean r1 = r10.useCacheForAllThreads     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0037
            boolean r0 = r0 instanceof f6.C0908A     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            if (r9 == 0) goto L_0x0028
            goto L_0x0037
        L_0x0028:
            S5.e0 r0 = new S5.e0     // Catch:{ all -> 0x0035 }
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0035 }
            monitor-exit(r10)
            return r0
        L_0x0035:
            r0 = move-exception
            goto L_0x0074
        L_0x0037:
            S5.e0 r0 = new S5.e0     // Catch:{ all -> 0x0035 }
            S5.i0 r1 = r10.this$0     // Catch:{ all -> 0x0035 }
            int r4 = r1.smallCacheSize     // Catch:{ all -> 0x0035 }
            S5.i0 r1 = r10.this$0     // Catch:{ all -> 0x0035 }
            int r5 = r1.normalCacheSize     // Catch:{ all -> 0x0035 }
            int r6 = S5.C0176i0.DEFAULT_MAX_CACHED_BUFFER_CAPACITY     // Catch:{ all -> 0x0035 }
            int r7 = S5.C0176i0.DEFAULT_CACHE_TRIM_INTERVAL     // Catch:{ all -> 0x0035 }
            r8 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0035 }
            long r1 = S5.C0176i0.DEFAULT_CACHE_TRIM_INTERVAL_MILLIS     // Catch:{ all -> 0x0035 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0072
            if (r9 == 0) goto L_0x0072
            S5.i0 r1 = r10.this$0     // Catch:{ all -> 0x0035 }
            java.lang.Runnable r3 = r1.trimTask     // Catch:{ all -> 0x0035 }
            long r4 = S5.C0176i0.DEFAULT_CACHE_TRIM_INTERVAL_MILLIS     // Catch:{ all -> 0x0035 }
            long r6 = S5.C0176i0.DEFAULT_CACHE_TRIM_INTERVAL_MILLIS     // Catch:{ all -> 0x0035 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0035 }
            r2 = r9
            f6.f r2 = (f6.C0916f) r2     // Catch:{ all -> 0x0035 }
            r2.scheduleAtFixedRate((java.lang.Runnable) r3, (long) r4, (long) r6, (java.util.concurrent.TimeUnit) r8)     // Catch:{ all -> 0x0035 }
        L_0x0072:
            monitor-exit(r10)
            return r0
        L_0x0074:
            monitor-exit(r10)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.C0174h0.initialValue():S5.e0");
    }

    public void onRemoval(C0168e0 e0Var) {
        e0Var.free(false);
    }
}
