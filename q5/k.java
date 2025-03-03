package Q5;

import java.io.BufferedReader;
import java.util.List;

public final class k extends Thread {

    /* renamed from: Z  reason: collision with root package name */
    public static int f4186Z;

    /* renamed from: U  reason: collision with root package name */
    public final BufferedReader f4187U;

    /* renamed from: V  reason: collision with root package name */
    public final List f4188V;

    /* renamed from: W  reason: collision with root package name */
    public final c f4189W;

    /* renamed from: X  reason: collision with root package name */
    public final c f4190X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile boolean f4191Y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(java.lang.String r4, java.io.InputStream r5, java.util.List r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Gobbler#"
            r4.<init>(r0)
            java.lang.Class<Q5.k> r0 = Q5.k.class
            monitor-enter(r0)
            int r1 = f4186Z     // Catch:{ all -> 0x0032 }
            int r2 = r1 + 1
            f4186Z = r2     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            r4 = 1
            r3.f4191Y = r4
            java.io.BufferedReader r4 = new java.io.BufferedReader
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r5)
            r4.<init>(r0)
            r3.f4187U = r4
            r3.f4188V = r6
            r4 = 0
            r3.f4189W = r4
            r3.f4190X = r4
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.k.<init>(java.lang.String, java.io.InputStream, java.util.List):void");
    }

    public final void a() {
        if (!this.f4191Y) {
            synchronized (this) {
                this.f4191Y = true;
                notifyAll();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0035 A[EDGE_INSN: B:35:0x0035->B:27:0x0035 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0008 A[Catch:{ IOException -> 0x0012 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r2 = this;
        L_0x0000:
            java.io.BufferedReader r0 = r2.f4187U     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = r0.readLine()     // Catch:{ IOException -> 0x0012 }
            if (r0 == 0) goto L_0x0035
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x0012 }
            java.util.List r1 = r2.f4188V     // Catch:{ IOException -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            r1.add(r0)     // Catch:{ IOException -> 0x0012 }
            goto L_0x0014
        L_0x0012:
            goto L_0x002c
        L_0x0014:
            Q5.c r1 = r2.f4189W     // Catch:{ IOException -> 0x0012 }
            if (r1 == 0) goto L_0x001b
            r1.a(r0)     // Catch:{ IOException -> 0x0012 }
        L_0x001b:
            boolean r0 = r2.f4191Y     // Catch:{ IOException -> 0x0012 }
            if (r0 != 0) goto L_0x0000
            monitor-enter(r2)     // Catch:{ IOException -> 0x0012 }
            r0 = 128(0x80, double:6.32E-322)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x002a
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            goto L_0x001b
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ IOException -> 0x0012 }
        L_0x002c:
            Q5.c r0 = r2.f4190X
            if (r0 == 0) goto L_0x0035
            r0.d()
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            java.io.BufferedReader r1 = r2.f4187U     // Catch:{ IOException -> 0x003c }
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003d
        L_0x003c:
        L_0x003d:
            if (r0 != 0) goto L_0x0046
            Q5.c r0 = r2.f4190X
            if (r0 == 0) goto L_0x0046
            r0.d()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.k.run():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(java.lang.String r4, java.io.InputStream r5, Q5.c r6, Q5.c r7) {
        /*
            r3 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Gobbler#"
            r4.<init>(r0)
            java.lang.Class<Q5.k> r0 = Q5.k.class
            monitor-enter(r0)
            int r1 = f4186Z     // Catch:{ all -> 0x0032 }
            int r2 = r1 + 1
            f4186Z = r2     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            r4 = 1
            r3.f4191Y = r4
            java.io.BufferedReader r4 = new java.io.BufferedReader
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r5)
            r4.<init>(r0)
            r3.f4187U = r4
            r3.f4189W = r6
            r3.f4190X = r7
            r4 = 0
            r3.f4188V = r4
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.k.<init>(java.lang.String, java.io.InputStream, Q5.c, Q5.c):void");
    }
}
