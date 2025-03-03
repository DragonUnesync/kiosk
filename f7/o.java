package f7;

import N.e;
import P6.f;
import Z6.b;
import b7.C0597c;
import b7.C0598d;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l7.q;
import u.C1455O;

public final class o implements Closeable {

    /* renamed from: t0  reason: collision with root package name */
    public static final C0936A f11737t0;

    /* renamed from: U  reason: collision with root package name */
    public final h f11738U;

    /* renamed from: V  reason: collision with root package name */
    public final LinkedHashMap f11739V = new LinkedHashMap();

    /* renamed from: W  reason: collision with root package name */
    public final String f11740W;

    /* renamed from: X  reason: collision with root package name */
    public int f11741X;

    /* renamed from: Y  reason: collision with root package name */
    public int f11742Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f11743Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0598d f11744a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C0597c f11745b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C0597c f11746c0;

    /* renamed from: d0  reason: collision with root package name */
    public final C0597c f11747d0;

    /* renamed from: e0  reason: collision with root package name */
    public final z f11748e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f11749f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f11750g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f11751h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f11752i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C0936A f11753j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0936A f11754k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f11755l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f11756m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f11757n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f11758o0;
    public final Socket p0;

    /* renamed from: q0  reason: collision with root package name */
    public final x f11759q0;

    /* renamed from: r0  reason: collision with root package name */
    public final k f11760r0;

    /* renamed from: s0  reason: collision with root package name */
    public final LinkedHashSet f11761s0;

    static {
        C0936A a8 = new C0936A();
        a8.c(7, 65535);
        a8.c(5, 16384);
        f11737t0 = a8;
    }

    public o(C1455O o2) {
        this.f11738U = (h) o2.f15533f;
        String str = (String) o2.f15531c;
        if (str != null) {
            this.f11740W = str;
            this.f11742Y = 3;
            C0598d dVar = (C0598d) o2.f15529a;
            this.f11744a0 = dVar;
            this.f11745b0 = dVar.e();
            this.f11746c0 = dVar.e();
            this.f11747d0 = dVar.e();
            this.f11748e0 = z.f11811a;
            C0936A a8 = new C0936A();
            a8.c(7, 16777216);
            this.f11753j0 = a8;
            C0936A a9 = f11737t0;
            this.f11754k0 = a9;
            this.f11758o0 = (long) a9.a();
            Socket socket = (Socket) o2.f15530b;
            if (socket != null) {
                this.p0 = socket;
                l7.o oVar = (l7.o) o2.e;
                if (oVar != null) {
                    this.f11759q0 = new x(oVar);
                    q qVar = (q) o2.f15532d;
                    if (qVar != null) {
                        this.f11760r0 = new k(this, new s(qVar));
                        this.f11761s0 = new LinkedHashSet();
                        return;
                    }
                    f.i("source");
                    throw null;
                }
                f.i("sink");
                throw null;
            }
            f.i("socket");
            throw null;
        }
        f.i("connectionName");
        throw null;
    }

    public final void close() {
        k(1, 9, (IOException) null);
    }

    public final void flush() {
        this.f11759q0.flush();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|f|12|(2:14|(5:16|17|18|30|19))|21|22|23|24|25|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(int r4, int r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            N.e.E(r4, r0)
            java.lang.String r0 = "streamCode"
            N.e.E(r5, r0)
            byte[] r0 = Z6.b.f6982a
            r3.o(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.f11739V     // Catch:{ all -> 0x002b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x002b }
            r0 = 0
            if (r4 != 0) goto L_0x002d
            java.util.LinkedHashMap r4 = r3.f11739V     // Catch:{ all -> 0x002b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x002b }
            f7.w[] r1 = new f7.w[r0]     // Catch:{ all -> 0x002b }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x002b }
            java.util.LinkedHashMap r1 = r3.f11739V     // Catch:{ all -> 0x002b }
            r1.clear()     // Catch:{ all -> 0x002b }
            goto L_0x002e
        L_0x002b:
            r4 = move-exception
            goto L_0x0058
        L_0x002d:
            r4 = 0
        L_0x002e:
            monitor-exit(r3)
            f7.w[] r4 = (f7.w[]) r4
            if (r4 == 0) goto L_0x003e
            int r1 = r4.length
        L_0x0034:
            if (r0 >= r1) goto L_0x003e
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            int r0 = r0 + 1
            goto L_0x0034
        L_0x003e:
            f7.x r4 = r3.f11759q0     // Catch:{ IOException -> 0x0043 }
            r4.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            java.net.Socket r4 = r3.p0     // Catch:{ IOException -> 0x0048 }
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            b7.c r4 = r3.f11745b0
            r4.e()
            b7.c r4 = r3.f11746c0
            r4.e()
            b7.c r4 = r3.f11747d0
            r4.e()
            return
        L_0x0058:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.o.k(int, int, java.io.IOException):void");
    }

    public final synchronized w l(int i) {
        return (w) this.f11739V.get(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f11743Z     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.f11751h0     // Catch:{ all -> 0x0018 }
            long r4 = r6.f11750g0     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.f11752i0     // Catch:{ all -> 0x0018 }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.o.m(long):boolean");
    }

    public final synchronized w n(int i) {
        w wVar;
        wVar = (w) this.f11739V.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void o(int i) {
        e.E(i, "statusCode");
        synchronized (this.f11759q0) {
            synchronized (this) {
                if (!this.f11743Z) {
                    this.f11743Z = true;
                    int i8 = this.f11741X;
                    this.f11759q0.n(b.f6982a, i8, i);
                }
            }
        }
    }

    public final synchronized void p(long j7) {
        long j8 = this.f11755l0 + j7;
        this.f11755l0 = j8;
        long j9 = j8 - this.f11756m0;
        if (j9 >= ((long) (this.f11753j0.a() / 2))) {
            s(0, j9);
            this.f11756m0 += j9;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f11759q0.f11805W);
        r6 = (long) r3;
        r8.f11757n0 += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r9, boolean r10, l7.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            f7.x r12 = r8.f11759q0
            r12.l(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f11757n0     // Catch:{ InterruptedException -> 0x0059 }
            long r5 = r8.f11758o0     // Catch:{ InterruptedException -> 0x0059 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0034
            java.util.LinkedHashMap r3 = r8.f11739V     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r3 == 0) goto L_0x002c
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            r9 = move-exception
            goto L_0x0066
        L_0x002c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0034:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch:{ all -> 0x002a }
            int r4 = (int) r3     // Catch:{ all -> 0x002a }
            f7.x r3 = r8.f11759q0     // Catch:{ all -> 0x002a }
            int r3 = r3.f11805W     // Catch:{ all -> 0x002a }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x002a }
            long r4 = r8.f11757n0     // Catch:{ all -> 0x002a }
            long r6 = (long) r3     // Catch:{ all -> 0x002a }
            long r4 = r4 + r6
            r8.f11757n0 = r4     // Catch:{ all -> 0x002a }
            monitor-exit(r8)
            long r12 = r12 - r6
            f7.x r4 = r8.f11759q0
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            r4.l(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r9.interrupt()     // Catch:{ all -> 0x002a }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.o.q(int, boolean, l7.f, long):void");
    }

    public final void r(int i, int i8) {
        e.E(i8, "errorCode");
        this.f11745b0.c(new j(this.f11740W + '[' + i + "] writeSynReset", this, i, i8, 2), 0);
    }

    public final void s(int i, long j7) {
        this.f11745b0.c(new n(this.f11740W + '[' + i + "] windowUpdate", this, i, j7), 0);
    }
}
