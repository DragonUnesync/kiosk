package T0;

import M0.X;
import P0.l;
import P0.t;
import android.os.Looper;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Z f4770a;

    /* renamed from: b  reason: collision with root package name */
    public final Y f4771b;

    /* renamed from: c  reason: collision with root package name */
    public final t f4772c;

    /* renamed from: d  reason: collision with root package name */
    public int f4773d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f4774f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4775g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4776h;
    public boolean i;

    public a0(Y y8, Z z, X x8, int i8, t tVar, Looper looper) {
        this.f4771b = y8;
        this.f4770a = z;
        this.f4774f = looper;
        this.f4772c = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[SYNTHETIC, Splitter:B:17:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f4775g     // Catch:{ all -> 0x0040 }
            P0.l.j(r0)     // Catch:{ all -> 0x0040 }
            android.os.Looper r0 = r6.f4774f     // Catch:{ all -> 0x0040 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0040 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0040 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            P0.l.j(r0)     // Catch:{ all -> 0x0040 }
            P0.t r0 = r6.f4772c     // Catch:{ all -> 0x0040 }
            r0.getClass()     // Catch:{ all -> 0x0040 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r0 = r0 + r7
        L_0x0022:
            boolean r2 = r6.i     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0042
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0042
            P0.t r2 = r6.f4772c     // Catch:{ all -> 0x0040 }
            r2.getClass()     // Catch:{ all -> 0x0040 }
            r6.wait(r7)     // Catch:{ all -> 0x0040 }
            P0.t r7 = r6.f4772c     // Catch:{ all -> 0x0040 }
            r7.getClass()     // Catch:{ all -> 0x0040 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r7 = r0 - r7
            goto L_0x0022
        L_0x0040:
            r7 = move-exception
            goto L_0x004e
        L_0x0042:
            if (r2 == 0) goto L_0x0046
            monitor-exit(r6)
            return
        L_0x0046:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0040 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0040 }
            throw r7     // Catch:{ all -> 0x0040 }
        L_0x004e:
            monitor-exit(r6)     // Catch:{ all -> 0x0040 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.a0.a(long):void");
    }

    public final synchronized void b(boolean z) {
        this.f4776h = z | this.f4776h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        l.j(!this.f4775g);
        this.f4775g = true;
        F f8 = (F) this.f4771b;
        synchronized (f8) {
            if (!f8.f4665w0) {
                if (f8.f4648e0.getThread().isAlive()) {
                    f8.f4646c0.a(14, this).b();
                    return;
                }
            }
            l.B("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
