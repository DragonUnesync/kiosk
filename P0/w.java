package P0;

import java.math.RoundingMode;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public long f3742a;

    /* renamed from: b  reason: collision with root package name */
    public long f3743b;

    /* renamed from: c  reason: collision with root package name */
    public long f3744c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal f3745d = new ThreadLocal();

    public w(long j7) {
        g(j7);
    }

    public final synchronized long a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j8 = this.f3742a;
                if (j8 == 9223372036854775806L) {
                    Long l8 = (Long) this.f3745d.get();
                    l8.getClass();
                    j8 = l8.longValue();
                }
                this.f3743b = j8 - j7;
                notifyAll();
            }
            this.f3744c = j7;
            return j7 + this.f3743b;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f3744c;
            if (j8 != -9223372036854775807L) {
                int i = z.f3748a;
                long W7 = z.W(j8, 90000, 1000000, RoundingMode.DOWN);
                long j9 = (4294967296L + W7) / 8589934592L;
                long j10 = ((j9 - 1) * 8589934592L) + j7;
                long j11 = (j9 * 8589934592L) + j7;
                if (Math.abs(j10 - W7) < Math.abs(j11 - W7)) {
                    j7 = j10;
                } else {
                    j7 = j11;
                }
            }
            long j12 = j7;
            int i8 = z.f3748a;
            return a(z.W(j12, 1000000, 90000, RoundingMode.DOWN));
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized long c(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f3744c;
        if (j8 != -9223372036854775807L) {
            int i = z.f3748a;
            long W7 = z.W(j8, 90000, 1000000, RoundingMode.DOWN);
            long j9 = W7 / 8589934592L;
            Long.signum(j9);
            long j10 = (j9 * 8589934592L) + j7;
            long j11 = ((j9 + 1) * 8589934592L) + j7;
            if (j10 >= W7) {
                j7 = j10;
            } else {
                j7 = j11;
            }
        }
        long j12 = j7;
        int i8 = z.f3748a;
        return a(z.W(j12, 1000000, 90000, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j7;
        j7 = this.f3742a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    public final synchronized long e() {
        return this.f3743b;
    }

    public final synchronized boolean f() {
        boolean z;
        if (this.f3743b != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void g(long j7) {
        long j8;
        this.f3742a = j7;
        if (j7 == Long.MAX_VALUE) {
            j8 = 0;
        } else {
            j8 = -9223372036854775807L;
        }
        this.f3743b = j8;
        this.f3744c = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void h(long r6, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f3742a     // Catch:{ all -> 0x0026 }
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            P0.l.j(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r5.f()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x001a
            monitor-exit(r5)
            return
        L_0x001a:
            if (r8 == 0) goto L_0x0028
            java.lang.ThreadLocal r8 = r5.f3745d     // Catch:{ all -> 0x0026 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0026 }
            r8.set(r6)     // Catch:{ all -> 0x0026 }
            goto L_0x0032
        L_0x0026:
            r6 = move-exception
            goto L_0x0034
        L_0x0028:
            boolean r6 = r5.f()     // Catch:{ all -> 0x0026 }
            if (r6 != 0) goto L_0x0032
            r5.wait()     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0032:
            monitor-exit(r5)
            return
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0026 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.w.h(long, boolean):void");
    }
}
