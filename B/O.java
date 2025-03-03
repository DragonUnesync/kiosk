package B;

import D.Z;
import java.util.concurrent.Executor;

public final class O extends K {

    /* renamed from: n0  reason: collision with root package name */
    public final Executor f191n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Object f192o0 = new Object();
    public W p0;

    /* renamed from: q0  reason: collision with root package name */
    public N f193q0;

    public O(Executor executor) {
        this.f191n0 = executor;
    }

    public final W a(Z z) {
        return z.o();
    }

    public final void c() {
        synchronized (this.f192o0) {
            try {
                W w2 = this.p0;
                if (w2 != null) {
                    w2.close();
                    this.p0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(B.W r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f192o0
            monitor-enter(r0)
            boolean r1 = r6.f186m0     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x000e
            r7.close()     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r7 = move-exception
            goto L_0x0059
        L_0x000e:
            B.N r1 = r6.f193q0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0039
            B.U r1 = r7.e()     // Catch:{ all -> 0x000c }
            long r1 = r1.b()     // Catch:{ all -> 0x000c }
            B.N r3 = r6.f193q0     // Catch:{ all -> 0x000c }
            B.W r3 = r3.f138V     // Catch:{ all -> 0x000c }
            B.U r3 = r3.e()     // Catch:{ all -> 0x000c }
            long r3 = r3.b()     // Catch:{ all -> 0x000c }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002e
            r7.close()     // Catch:{ all -> 0x000c }
            goto L_0x0037
        L_0x002e:
            B.W r1 = r6.p0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x0035:
            r6.p0 = r7     // Catch:{ all -> 0x000c }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0039:
            B.N r1 = new B.N     // Catch:{ all -> 0x000c }
            r1.<init>(r7, r6)     // Catch:{ all -> 0x000c }
            r6.f193q0 = r1     // Catch:{ all -> 0x000c }
            L3.b r7 = r6.b(r1)     // Catch:{ all -> 0x000c }
            A.f r2 = new A.f     // Catch:{ all -> 0x000c }
            r3 = 4
            r2.<init>((int) r3, (java.lang.Object) r1)     // Catch:{ all -> 0x000c }
            F.a r1 = D7.b.l()     // Catch:{ all -> 0x000c }
            G.h r3 = new G.h     // Catch:{ all -> 0x000c }
            r4 = 0
            r3.<init>(r7, r4, r2)     // Catch:{ all -> 0x000c }
            r7.d(r3, r1)     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B.O.f(B.W):void");
    }
}
