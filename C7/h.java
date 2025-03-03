package c7;

import B3.q;
import C7.d;
import P6.f;
import Q5.a;
import Y6.r;
import Y6.u;
import Z6.b;
import b7.C0597c;
import d7.C0659d;
import g7.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public final r f8923U;

    /* renamed from: V  reason: collision with root package name */
    public final d f8924V;

    /* renamed from: W  reason: collision with root package name */
    public final k f8925W;

    /* renamed from: X  reason: collision with root package name */
    public final g f8926X;

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicBoolean f8927Y = new AtomicBoolean();

    /* renamed from: Z  reason: collision with root package name */
    public Object f8928Z;

    /* renamed from: a0  reason: collision with root package name */
    public C0625e f8929a0;

    /* renamed from: b0  reason: collision with root package name */
    public j f8930b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f8931c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f8932d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8933e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f8934f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public volatile boolean f8935g0;

    /* renamed from: h0  reason: collision with root package name */
    public volatile a f8936h0;

    /* renamed from: i0  reason: collision with root package name */
    public volatile j f8937i0;

    public h(r rVar, d dVar) {
        f.e(rVar, "client");
        this.f8923U = rVar;
        this.f8924V = dVar;
        this.f8925W = (k) rVar.f6697V.f2027U;
        rVar.f6700Y.getClass();
        g gVar = new g(this);
        gVar.g((long) 0, TimeUnit.MILLISECONDS);
        this.f8926X = gVar;
    }

    public final void a(j jVar) {
        byte[] bArr = b.f6982a;
        if (this.f8930b0 == null) {
            this.f8930b0 = jVar;
            jVar.f8951p.add(new f(this, this.f8928Z));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket h5;
        byte[] bArr = b.f6982a;
        j jVar = this.f8930b0;
        if (jVar != null) {
            synchronized (jVar) {
                h5 = h();
            }
            if (this.f8930b0 == null) {
                if (h5 != null) {
                    b.d(h5);
                }
            } else if (h5 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f8926X.i()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            f.b(iOException2);
        }
        return iOException2;
    }

    public final u c() {
        if (this.f8927Y.compareAndSet(false, true)) {
            this.f8926X.h();
            n nVar = n.f12045a;
            this.f8928Z = n.f12045a.g();
            try {
                q qVar = this.f8923U.f6696U;
                synchronized (qVar) {
                    ((ArrayDeque) qVar.f452X).add(this);
                }
                u e = e();
                this.f8923U.f6696U.E(this);
                return e;
            } catch (Throwable th) {
                this.f8923U.f6696U.E(this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed");
        }
    }

    public final Object clone() {
        return new h(this.f8923U, this.f8924V);
    }

    public final void d(boolean z) {
        a aVar;
        synchronized (this) {
            if (!this.f8934f0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (aVar = this.f8936h0) != null) {
            ((C0659d) aVar.f4125d).cancel();
            ((h) aVar.f4123b).f(aVar, true, true, (IOException) null);
        }
        this.f8931c0 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Y6.u e() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y6.r r0 = r10.f8923U
            java.util.List r0 = r0.f6698W
            D6.o.N(r2, r0)
            d7.a r0 = new d7.a
            Y6.r r1 = r10.f8923U
            r0.<init>((Y6.r) r1)
            r2.add(r0)
            d7.a r0 = new d7.a
            Y6.r r1 = r10.f8923U
            Y6.j r1 = r1.f6705d0
            r0.<init>((Y6.j) r1)
            r2.add(r0)
            a7.b r0 = new a7.b
            Y6.r r1 = r10.f8923U
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            c7.a r0 = c7.C0621a.f8896a
            r2.add(r0)
            Y6.r r0 = r10.f8923U
            java.util.List r0 = r0.f6699X
            D6.o.N(r2, r0)
            d7.b r0 = new d7.b
            r0.<init>()
            r2.add(r0)
            d7.f r9 = new d7.f
            C7.d r5 = r10.f8924V
            Y6.r r0 = r10.f8923U
            int r6 = r0.p0
            int r7 = r0.f6717q0
            int r8 = r0.f6718r0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            C7.d r2 = r10.f8924V     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            Y6.u r2 = r9.b(r2)     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            boolean r3 = r10.f8935g0     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            if (r3 != 0) goto L_0x0066
            r10.g(r0)
            return r2
        L_0x0066:
            Z6.b.c(r2)     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            throw r2     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
        L_0x0071:
            r2 = move-exception
            goto L_0x0082
        L_0x0073:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r10.g(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            P6.f.c(r1, r3)     // Catch:{ all -> 0x007f }
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1 = move-exception
            r2 = r1
            r1 = 1
        L_0x0082:
            if (r1 != 0) goto L_0x0087
            r10.g(r0)
        L_0x0087:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.h.e():Y6.u");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException f(Q5.a r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            P6.f.e(r2, r0)
            Q5.a r0 = r1.f8936h0
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.f8932d0     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x0041
        L_0x0019:
            if (r4 == 0) goto L_0x0043
            boolean r0 = r1.f8933e0     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0043
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.f8932d0 = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.f8933e0 = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.f8932d0     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.f8933e0     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f8933e0     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f8934f0     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = 1
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0044
        L_0x0041:
            monitor-exit(r1)
            throw r2
        L_0x0043:
            r3 = 0
        L_0x0044:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0051
            r2 = 0
            r1.f8936h0 = r2
            c7.j r2 = r1.f8930b0
            if (r2 == 0) goto L_0x0051
            r2.h()
        L_0x0051:
            if (r3 == 0) goto L_0x0058
            java.io.IOException r2 = r1.b(r5)
            return r2
        L_0x0058:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.h.f(Q5.a, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f8934f0) {
                this.f8934f0 = false;
                if (!this.f8932d0 && !this.f8933e0) {
                    z = true;
                }
            }
        }
        if (z) {
            return b(iOException);
        }
        return iOException;
    }

    public final Socket h() {
        j jVar = this.f8930b0;
        f.b(jVar);
        byte[] bArr = b.f6982a;
        ArrayList arrayList = jVar.f8951p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (f.a(((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.f8930b0 = null;
            if (arrayList.isEmpty()) {
                jVar.f8952q = System.nanoTime();
                k kVar = this.f8925W;
                kVar.getClass();
                byte[] bArr2 = b.f6982a;
                boolean z = jVar.f8945j;
                C0597c cVar = kVar.f8954b;
                if (!z) {
                    cVar.c(kVar.f8955c, 0);
                } else {
                    jVar.f8945j = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f8956d;
                    concurrentLinkedQueue.remove(jVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    Socket socket = jVar.f8941d;
                    f.b(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.");
    }
}
