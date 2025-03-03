package v6;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16133a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f16134b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f16135c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f16136d = new ConcurrentHashMap();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[LOOP:0: B:17:0x0037->B:25:0x0069, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025 A[SYNTHETIC, Splitter:B:9:0x0025] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            f16135c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f16136d = r0
            java.lang.String r0 = "rx2.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            r0 = 1
            goto L_0x001f
        L_0x0019:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0017 }
        L_0x001f:
            f16133a = r0
            java.lang.String r2 = "rx2.purge-period-seconds"
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r0 = 1
            goto L_0x0031
        L_0x002d:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x002b }
        L_0x0031:
            f16134b = r0
            boolean r0 = f16133a
            if (r0 == 0) goto L_0x006d
        L_0x0037:
            java.util.concurrent.atomic.AtomicReference r0 = f16135c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L_0x0042
            goto L_0x006d
        L_0x0042:
            v6.k r3 = new v6.k
            java.lang.String r4 = "RxSchedulerPurge"
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L_0x004d:
            boolean r3 = r0.compareAndSet(r2, r5)
            if (r3 == 0) goto L_0x0063
            androidx.emoji2.text.l r6 = new androidx.emoji2.text.l
            r0 = 2
            r6.<init>(r0)
            int r0 = f16134b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L_0x006d
        L_0x0063:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L_0x004d
            r5.shutdownNow()
            goto L_0x0037
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.n.<clinit>():void");
    }
}
