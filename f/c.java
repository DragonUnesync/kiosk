package F;

import java.util.concurrent.Callable;

public final class c implements Callable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1393U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f1394V;

    public /* synthetic */ c(int i, Object obj) {
        this.f1393U = i;
        this.f1394V = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r3 = this;
            int r0 = r3.f1393U
            switch(r0) {
                case 0: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.f1394V
            z2.c r0 = (z2.c) r0
            monitor-enter(r0)
            java.lang.Object r1 = r3.f1394V     // Catch:{ all -> 0x0014 }
            z2.c r1 = (z2.c) r1     // Catch:{ all -> 0x0014 }
            java.io.BufferedWriter r2 = r1.f16436c0     // Catch:{ all -> 0x0014 }
            if (r2 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0032
        L_0x0014:
            r1 = move-exception
            goto L_0x0034
        L_0x0016:
            r1.x()     // Catch:{ all -> 0x0014 }
            java.lang.Object r1 = r3.f1394V     // Catch:{ all -> 0x0014 }
            z2.c r1 = (z2.c) r1     // Catch:{ all -> 0x0014 }
            boolean r1 = r1.q()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r3.f1394V     // Catch:{ all -> 0x0014 }
            z2.c r1 = (z2.c) r1     // Catch:{ all -> 0x0014 }
            r1.v()     // Catch:{ all -> 0x0014 }
            java.lang.Object r1 = r3.f1394V     // Catch:{ all -> 0x0014 }
            z2.c r1 = (z2.c) r1     // Catch:{ all -> 0x0014 }
            r2 = 0
            r1.f16438e0 = r2     // Catch:{ all -> 0x0014 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
        L_0x0032:
            r0 = 0
            return r0
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1
        L_0x0036:
            java.lang.Object r0 = r3.f1394V
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.c.call():java.lang.Object");
    }
}
