package f7;

import N.e;
import P6.f;
import Y6.m;
import Z6.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final int f11790a;

    /* renamed from: b  reason: collision with root package name */
    public final o f11791b;

    /* renamed from: c  reason: collision with root package name */
    public long f11792c;

    /* renamed from: d  reason: collision with root package name */
    public long f11793d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f11794f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f11795g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11796h;
    public final u i;

    /* renamed from: j  reason: collision with root package name */
    public final t f11797j;

    /* renamed from: k  reason: collision with root package name */
    public final v f11798k = new v(this);

    /* renamed from: l  reason: collision with root package name */
    public final v f11799l = new v(this);

    /* renamed from: m  reason: collision with root package name */
    public int f11800m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f11801n;

    public w(int i8, o oVar, boolean z, boolean z6, m mVar) {
        f.e(oVar, "connection");
        this.f11790a = i8;
        this.f11791b = oVar;
        this.f11794f = (long) oVar.f11754k0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f11795g = arrayDeque;
        this.i = new u(this, (long) oVar.f11753j0.a(), z6);
        this.f11797j = new t(this, z);
        if (mVar != null) {
            if (!h()) {
                arrayDeque.add(mVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void a() {
        boolean z;
        boolean i8;
        byte[] bArr = b.f6982a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f11784V && uVar.f11787Y) {
                    t tVar = this.f11797j;
                    if (tVar.f11779U || tVar.f11781W) {
                        z = true;
                        i8 = i();
                    }
                }
                z = false;
                i8 = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, (IOException) null);
        } else if (!i8) {
            this.f11791b.n(this.f11790a);
        }
    }

    public final void b() {
        t tVar = this.f11797j;
        if (tVar.f11781W) {
            throw new IOException("stream closed");
        } else if (tVar.f11779U) {
            throw new IOException("stream finished");
        } else if (this.f11800m != 0) {
            Throwable th = this.f11801n;
            if (th == null) {
                int i8 = this.f11800m;
                e.C(i8);
                th = new C0937B(i8);
            }
            throw th;
        }
    }

    public final void c(int i8, IOException iOException) {
        e.E(i8, "rstStatusCode");
        if (d(i8, iOException)) {
            o oVar = this.f11791b;
            oVar.getClass();
            e.E(i8, "statusCode");
            oVar.f11759q0.q(this.f11790a, i8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r2.f11791b.n(r2.f11790a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r3, java.io.IOException r4) {
        /*
            r2 = this;
            byte[] r0 = Z6.b.f6982a
            monitor-enter(r2)
            int r0 = r2.f11800m     // Catch:{ all -> 0x001f }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            r2.f11800m = r3     // Catch:{ all -> 0x001f }
            r2.f11801n = r4     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            f7.u r3 = r2.i     // Catch:{ all -> 0x001f }
            boolean r3 = r3.f11784V     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0021
            f7.t r3 = r2.f11797j     // Catch:{ all -> 0x001f }
            boolean r3 = r3.f11779U     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0021
            monitor-exit(r2)
            return r1
        L_0x001f:
            r3 = move-exception
            goto L_0x002b
        L_0x0021:
            monitor-exit(r2)
            f7.o r3 = r2.f11791b
            int r4 = r2.f11790a
            r3.n(r4)
            r3 = 1
            return r3
        L_0x002b:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.w.d(int, java.io.IOException):boolean");
    }

    public final void e(int i8) {
        e.E(i8, "errorCode");
        if (d(i8, (IOException) null)) {
            this.f11791b.r(this.f11790a, i8);
        }
    }

    public final synchronized int f() {
        return this.f11800m;
    }

    public final t g() {
        synchronized (this) {
            if (!this.f11796h) {
                if (!h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f11797j;
    }

    public final boolean h() {
        boolean z;
        if ((this.f11790a & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f11791b.getClass();
        if (true == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean i() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f11800m     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            f7.u r0 = r3.i     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f11784V     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.f11787Y     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            f7.t r0 = r3.f11797j     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f11779U     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.f11781W     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f11796h     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.w.i():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[Catch:{ all -> 0x0016 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(Y6.m r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            P6.f.e(r3, r0)
            byte[] r0 = Z6.b.f6982a
            monitor-enter(r2)
            boolean r0 = r2.f11796h     // Catch:{ all -> 0x0016 }
            r1 = 1
            if (r0 == 0) goto L_0x0018
            if (r4 != 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            f7.u r3 = r2.i     // Catch:{ all -> 0x0016 }
            r3.getClass()     // Catch:{ all -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            r3 = move-exception
            goto L_0x0037
        L_0x0018:
            r2.f11796h = r1     // Catch:{ all -> 0x0016 }
            java.util.ArrayDeque r0 = r2.f11795g     // Catch:{ all -> 0x0016 }
            r0.add(r3)     // Catch:{ all -> 0x0016 }
        L_0x001f:
            if (r4 == 0) goto L_0x0025
            f7.u r3 = r2.i     // Catch:{ all -> 0x0016 }
            r3.f11784V = r1     // Catch:{ all -> 0x0016 }
        L_0x0025:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0016 }
            r2.notifyAll()     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0036
            f7.o r3 = r2.f11791b
            int r4 = r2.f11790a
            r3.n(r4)
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.w.j(Y6.m, boolean):void");
    }

    public final synchronized void k(int i8) {
        e.E(i8, "errorCode");
        if (this.f11800m == 0) {
            this.f11800m = i8;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
