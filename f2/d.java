package F2;

import B2.f;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import y.C1609a;
import z2.c;

public final class d implements a {

    /* renamed from: U  reason: collision with root package name */
    public final A1.d f1515U;

    /* renamed from: V  reason: collision with root package name */
    public final File f1516V;

    /* renamed from: W  reason: collision with root package name */
    public final long f1517W;

    /* renamed from: X  reason: collision with root package name */
    public final A1.d f1518X = new A1.d(11);

    /* renamed from: Y  reason: collision with root package name */
    public c f1519Y;

    public d(File file) {
        this.f1516V = file;
        this.f1517W = 262144000;
        this.f1515U = new A1.d(12);
    }

    public final synchronized c a() {
        try {
            if (this.f1519Y == null) {
                this.f1519Y = c.r(this.f1516V, this.f1517W);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f1519Y;
    }

    public final File b(f fVar) {
        String B8 = this.f1515U.B(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + B8 + " for for Key: " + fVar);
        }
        try {
            C1609a p3 = a().p(B8);
            if (p3 != null) {
                return ((File[]) p3.f16325a)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public final synchronized void c() {
        this.f1519Y = null;
    }

    public final synchronized void clear() {
        try {
            c a8 = a();
            a8.close();
            z2.f.a(a8.f16428U);
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            } catch (Throwable th) {
                c();
                throw th;
            }
        }
        c();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(B2.f r8, B.q0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = "Put: Obtained: "
            A1.d r2 = r7.f1515U
            java.lang.String r2 = r2.B(r8)
            A1.d r3 = r7.f1518X
            monitor-enter(r3)
            java.lang.Object r4 = r3.f35V     // Catch:{ all -> 0x0029 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0029 }
            F2.b r4 = (F2.b) r4     // Catch:{ all -> 0x0029 }
            if (r4 != 0) goto L_0x002c
            java.lang.Object r4 = r3.f36W     // Catch:{ all -> 0x0029 }
            F2.c r4 = (F2.c) r4     // Catch:{ all -> 0x0029 }
            F2.b r4 = r4.a()     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r3.f35V     // Catch:{ all -> 0x0029 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x0029 }
            r5.put(r2, r4)     // Catch:{ all -> 0x0029 }
            goto L_0x002c
        L_0x0029:
            r8 = move-exception
            goto L_0x00c9
        L_0x002c:
            int r5 = r4.f1513b     // Catch:{ all -> 0x0029 }
            r6 = 1
            int r5 = r5 + r6
            r4.f1513b = r5     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.locks.ReentrantLock r3 = r4.f1512a
            r3.lock()
            java.lang.String r3 = "DiskLruCacheWrapper"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x005b }
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r4.<init>(r1)     // Catch:{ all -> 0x005b }
            r4.append(r2)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = " for for Key: "
            r4.append(r1)     // Catch:{ all -> 0x005b }
            r4.append(r8)     // Catch:{ all -> 0x005b }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x005b }
            android.util.Log.v(r3, r8)     // Catch:{ all -> 0x005b }
            goto L_0x005d
        L_0x005b:
            r8 = move-exception
            goto L_0x00c3
        L_0x005d:
            z2.c r8 = r7.a()     // Catch:{ IOException -> 0x00a1 }
            y.a r1 = r8.p(r2)     // Catch:{ IOException -> 0x00a1 }
            if (r1 == 0) goto L_0x006d
            A1.d r8 = r7.f1518X
            r8.H(r2)
            return
        L_0x006d:
            com.bumptech.glide.j r8 = r8.n(r2)     // Catch:{ IOException -> 0x00a1 }
            if (r8 == 0) goto L_0x00a3
            java.io.File r0 = r8.h()     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = r9.f301W     // Catch:{ all -> 0x0098 }
            java.lang.Object r3 = r9.f302X     // Catch:{ all -> 0x0098 }
            B2.i r3 = (B2.i) r3     // Catch:{ all -> 0x0098 }
            java.lang.Object r9 = r9.f300V     // Catch:{ all -> 0x0098 }
            B2.b r9 = (B2.b) r9     // Catch:{ all -> 0x0098 }
            boolean r9 = r9.e(r1, r0, r3)     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x0090
            java.lang.Object r9 = r8.f9010X     // Catch:{ all -> 0x0098 }
            z2.c r9 = (z2.c) r9     // Catch:{ all -> 0x0098 }
            z2.c.k(r9, r8, r6)     // Catch:{ all -> 0x0098 }
            r8.f9007U = r6     // Catch:{ all -> 0x0098 }
        L_0x0090:
            boolean r9 = r8.f9007U     // Catch:{ IOException -> 0x00a1 }
            if (r9 != 0) goto L_0x00bd
            r8.c()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00bd
        L_0x0098:
            r9 = move-exception
            boolean r0 = r8.f9007U     // Catch:{ IOException -> 0x00a1 }
            if (r0 != 0) goto L_0x00a0
            r8.c()     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            throw r9     // Catch:{ IOException -> 0x00a1 }
        L_0x00a1:
            r8 = move-exception
            goto L_0x00ad
        L_0x00a3:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a1 }
            java.lang.String r9 = r0.concat(r2)     // Catch:{ IOException -> 0x00a1 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00a1 }
            throw r8     // Catch:{ IOException -> 0x00a1 }
        L_0x00ad:
            java.lang.String r9 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x005b }
            if (r9 == 0) goto L_0x00bd
            java.lang.String r9 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r9, r0, r8)     // Catch:{ all -> 0x005b }
        L_0x00bd:
            A1.d r8 = r7.f1518X
            r8.H(r2)
            return
        L_0x00c3:
            A1.d r9 = r7.f1518X
            r9.H(r2)
            throw r8
        L_0x00c9:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.d.i(B2.f, B.q0):void");
    }
}
