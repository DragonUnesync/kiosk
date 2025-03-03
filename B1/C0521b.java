package b1;

import M1.e;
import M1.i;
import M1.l;
import S0.c;
import S0.d;
import S0.f;
import S0.g;
import S0.h;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: b1.b  reason: case insensitive filesystem */
public final class C0521b implements e, c {

    /* renamed from: a  reason: collision with root package name */
    public final h f8610a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8611b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f8612c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f8613d;
    public final f[] e;

    /* renamed from: f  reason: collision with root package name */
    public final g[] f8614f;

    /* renamed from: g  reason: collision with root package name */
    public int f8615g;

    /* renamed from: h  reason: collision with root package name */
    public int f8616h;
    public f i;

    /* renamed from: j  reason: collision with root package name */
    public d f8617j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8618k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8619l;

    /* renamed from: m  reason: collision with root package name */
    public long f8620m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f8621n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f8622o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0521b(l lVar) {
        this(new i[2], new M1.c[2]);
        this.f8621n = 1;
        int i8 = this.f8615g;
        f[] fVarArr = this.e;
        P0.l.j(i8 == fVarArr.length);
        for (f u3 : fVarArr) {
            u3.u(1024);
        }
        this.f8622o = lVar;
    }

    public final void a(long j7) {
        boolean z;
        synchronized (this.f8611b) {
            try {
                if (this.f8615g != this.e.length) {
                    if (!this.f8618k) {
                        z = false;
                        P0.l.j(z);
                        this.f8620m = j7;
                    }
                }
                z = true;
                P0.l.j(z);
                this.f8620m = j7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(long j7) {
    }

    public final Object d() {
        boolean z;
        f fVar;
        synchronized (this.f8611b) {
            try {
                d dVar = this.f8617j;
                if (dVar == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    P0.l.j(z);
                    int i8 = this.f8615g;
                    if (i8 == 0) {
                        fVar = null;
                    } else {
                        f[] fVarArr = this.e;
                        int i9 = i8 - 1;
                        this.f8615g = i9;
                        fVar = fVarArr[i9];
                    }
                    this.i = fVar;
                } else {
                    throw dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [S0.d, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r0v2, types: [S0.d, java.lang.Exception] */
    public final d f(Throwable th) {
        switch (this.f8621n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    public final void flush() {
        synchronized (this.f8611b) {
            try {
                this.f8618k = true;
                f fVar = this.i;
                if (fVar != null) {
                    fVar.r();
                    int i8 = this.f8615g;
                    this.f8615g = i8 + 1;
                    this.e[i8] = fVar;
                    this.i = null;
                }
                while (!this.f8612c.isEmpty()) {
                    f fVar2 = (f) this.f8612c.removeFirst();
                    fVar2.r();
                    int i9 = this.f8615g;
                    this.f8615g = i9 + 1;
                    this.e[i9] = fVar2;
                }
                while (!this.f8613d.isEmpty()) {
                    ((g) this.f8613d.removeFirst()).t();
                }
            } finally {
            }
        }
    }

    public final d g(f fVar, g gVar, boolean z) {
        boolean z6;
        switch (this.f8621n) {
            case 0:
                C0520a aVar = (C0520a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f4386Y;
                    byteBuffer.getClass();
                    P0.l.j(byteBuffer.hasArray());
                    if (byteBuffer.arrayOffset() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    P0.l.d(z6);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((U0.c) this.f8622o).getClass();
                    aVar.f8608Y = U0.c.d(remaining, array);
                    aVar.f4391W = fVar.f4388a0;
                    return null;
                } catch (d e8) {
                    return e8;
                }
            default:
                i iVar = (i) fVar;
                M1.c cVar = (M1.c) gVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f4386Y;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    l lVar = (l) this.f8622o;
                    if (z) {
                        lVar.a();
                    }
                    M1.d o2 = lVar.o(array2, 0, limit);
                    long j7 = iVar.f4388a0;
                    long j8 = iVar.f3085d0;
                    cVar.f4391W = j7;
                    cVar.f3071Y = o2;
                    if (j8 != Long.MAX_VALUE) {
                        j7 = j8;
                    }
                    cVar.f3072Z = j7;
                    cVar.f4392X = false;
                    return null;
                } catch (M1.f e9) {
                    return e9;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r1.d(4) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r4.a(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        r4.f4391W = r1.f4388a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r1.d(134217728) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r4.a(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (j(r1.f4388a0) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        r4.f4392X = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = g(r1, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        r0 = f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        r0 = f(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8611b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.f8619l     // Catch:{ all -> 0x0020 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque r1 = r8.f8612c     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0017
            int r1 = r8.f8616h     // Catch:{ all -> 0x0020 }
            if (r1 <= 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r8.f8611b     // Catch:{ all -> 0x0020 }
            r1.wait()     // Catch:{ all -> 0x0020 }
            goto L_0x0003
        L_0x0020:
            r1 = move-exception
            goto L_0x00aa
        L_0x0023:
            boolean r1 = r8.f8619l     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0029:
            java.util.ArrayDeque r1 = r8.f8612c     // Catch:{ all -> 0x0020 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0020 }
            S0.f r1 = (S0.f) r1     // Catch:{ all -> 0x0020 }
            S0.g[] r4 = r8.f8614f     // Catch:{ all -> 0x0020 }
            int r5 = r8.f8616h     // Catch:{ all -> 0x0020 }
            int r5 = r5 - r3
            r8.f8616h = r5     // Catch:{ all -> 0x0020 }
            r4 = r4[r5]     // Catch:{ all -> 0x0020 }
            boolean r5 = r8.f8618k     // Catch:{ all -> 0x0020 }
            r8.f8618k = r2     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            r0 = 4
            boolean r6 = r1.d(r0)
            if (r6 == 0) goto L_0x004a
            r4.a(r0)
            goto L_0x007f
        L_0x004a:
            long r6 = r1.f4388a0
            r4.f4391W = r6
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.d(r0)
            if (r6 == 0) goto L_0x0059
            r4.a(r0)
        L_0x0059:
            long r6 = r1.f4388a0
            boolean r0 = r8.j(r6)
            if (r0 != 0) goto L_0x0063
            r4.f4392X = r3
        L_0x0063:
            S0.d r0 = r8.g(r1, r4, r5)     // Catch:{ RuntimeException -> 0x006e, OutOfMemoryError -> 0x0068 }
            goto L_0x0073
        L_0x0068:
            r0 = move-exception
            S0.d r0 = r8.f(r0)
            goto L_0x0073
        L_0x006e:
            r0 = move-exception
            S0.d r0 = r8.f(r0)
        L_0x0073:
            if (r0 == 0) goto L_0x007f
            java.lang.Object r5 = r8.f8611b
            monitor-enter(r5)
            r8.f8617j = r0     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return r2
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        L_0x007f:
            java.lang.Object r2 = r8.f8611b
            monitor-enter(r2)
            boolean r0 = r8.f8618k     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x008c
            r4.t()     // Catch:{ all -> 0x008a }
            goto L_0x0099
        L_0x008a:
            r0 = move-exception
            goto L_0x00a8
        L_0x008c:
            boolean r0 = r4.f4392X     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0094
            r4.t()     // Catch:{ all -> 0x008a }
            goto L_0x0099
        L_0x0094:
            java.util.ArrayDeque r0 = r8.f8613d     // Catch:{ all -> 0x008a }
            r0.addLast(r4)     // Catch:{ all -> 0x008a }
        L_0x0099:
            r1.r()     // Catch:{ all -> 0x008a }
            int r0 = r8.f8615g     // Catch:{ all -> 0x008a }
            int r4 = r0 + 1
            r8.f8615g = r4     // Catch:{ all -> 0x008a }
            S0.f[] r4 = r8.e     // Catch:{ all -> 0x008a }
            r4[r0] = r1     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            return r3
        L_0x00a8:
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            throw r0
        L_0x00aa:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0521b.h():boolean");
    }

    /* renamed from: i */
    public final g c() {
        synchronized (this.f8611b) {
            try {
                d dVar = this.f8617j;
                if (dVar != null) {
                    throw dVar;
                } else if (this.f8613d.isEmpty()) {
                    return null;
                } else {
                    g gVar = (g) this.f8613d.removeFirst();
                    return gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j7) {
        boolean z;
        synchronized (this.f8611b) {
            long j8 = this.f8620m;
            if (j8 != -9223372036854775807L) {
                if (j7 < j8) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public final void e(f fVar) {
        boolean z;
        synchronized (this.f8611b) {
            try {
                d dVar = this.f8617j;
                if (dVar == null) {
                    if (fVar == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    P0.l.d(z);
                    this.f8612c.addLast(fVar);
                    if (!this.f8612c.isEmpty() && this.f8616h > 0) {
                        this.f8611b.notify();
                    }
                    this.i = null;
                } else {
                    throw dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(g gVar) {
        synchronized (this.f8611b) {
            gVar.r();
            int i8 = this.f8616h;
            this.f8616h = i8 + 1;
            this.f8614f[i8] = gVar;
            if (!this.f8612c.isEmpty() && this.f8616h > 0) {
                this.f8611b.notify();
            }
        }
    }

    public final void release() {
        synchronized (this.f8611b) {
            this.f8619l = true;
            this.f8611b.notify();
        }
        try {
            this.f8610a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C0521b(f[] fVarArr, g[] gVarArr) {
        g gVar;
        f fVar;
        this.f8611b = new Object();
        this.f8620m = -9223372036854775807L;
        this.f8612c = new ArrayDeque();
        this.f8613d = new ArrayDeque();
        this.e = fVarArr;
        this.f8615g = fVarArr.length;
        for (int i8 = 0; i8 < this.f8615g; i8++) {
            f[] fVarArr2 = this.e;
            switch (this.f8621n) {
                case 0:
                    fVar = new f(1);
                    break;
                default:
                    fVar = new f(1);
                    break;
            }
            fVarArr2[i8] = fVar;
        }
        this.f8614f = gVarArr;
        this.f8616h = gVarArr.length;
        for (int i9 = 0; i9 < this.f8616h; i9++) {
            g[] gVarArr2 = this.f8614f;
            switch (this.f8621n) {
                case 0:
                    gVar = new C0520a(this);
                    break;
                default:
                    gVar = new M1.c(this);
                    break;
            }
            gVarArr2[i9] = gVar;
        }
        h hVar = new h(this);
        this.f8610a = hVar;
        hVar.start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0521b(U0.c cVar) {
        this(new f[1], new C0520a[1]);
        this.f8621n = 0;
        this.f8622o = cVar;
    }
}
