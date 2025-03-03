package f7;

import Z6.b;
import l7.f;
import l7.u;
import l7.y;

public final class t implements u {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f11779U;

    /* renamed from: V  reason: collision with root package name */
    public final f f11780V = new Object();

    /* renamed from: W  reason: collision with root package name */
    public boolean f11781W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ w f11782X;

    /* JADX WARNING: type inference failed for: r1v1, types: [l7.f, java.lang.Object] */
    public t(w wVar, boolean z) {
        this.f11782X = wVar;
        this.f11779U = z;
    }

    public final y a() {
        return this.f11782X.f11799l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        r0 = r13.f11782X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        if (r0.f11797j.f11779U != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r13.f11780V.f13216V <= 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r13.f11780V.f13216V <= 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        k(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r0.f11791b.q(r0.f11790a, true, (l7.f) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r0 = r13.f11782X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r13.f11781W = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        r13.f11782X.f11791b.flush();
        r13.f11782X.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r13 = this;
            f7.w r0 = r13.f11782X
            byte[] r1 = Z6.b.f6982a
            monitor-enter(r0)
            boolean r1 = r13.f11781W     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            int r1 = r0.f()     // Catch:{ all -> 0x0057 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            monitor-exit(r0)
            f7.w r0 = r13.f11782X
            f7.t r3 = r0.f11797j
            boolean r3 = r3.f11779U
            if (r3 != 0) goto L_0x0041
            l7.f r3 = r13.f11780V
            long r3 = r3.f13216V
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0028:
            l7.f r0 = r13.f11780V
            long r0 = r0.f13216V
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0041
            r13.k(r2)
            goto L_0x0028
        L_0x0034:
            if (r1 == 0) goto L_0x0041
            f7.o r7 = r0.f11791b
            int r8 = r0.f11790a
            r11 = 0
            r9 = 1
            r10 = 0
            r7.q(r8, r9, r10, r11)
        L_0x0041:
            f7.w r0 = r13.f11782X
            monitor-enter(r0)
            r13.f11781W = r2     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)
            f7.w r0 = r13.f11782X
            f7.o r0 = r0.f11791b
            r0.flush()
            f7.w r0 = r13.f11782X
            r0.a()
            return
        L_0x0054:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0057:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.t.close():void");
    }

    public final void flush() {
        w wVar = this.f11782X;
        byte[] bArr = b.f6982a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f11780V.f13216V > 0) {
            k(false);
            this.f11782X.f11791b.flush();
        }
    }

    public final void h(f fVar, long j7) {
        byte[] bArr = b.f6982a;
        f fVar2 = this.f11780V;
        fVar2.h(fVar, j7);
        while (fVar2.f13216V >= 16384) {
            k(false);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void k(boolean z) {
        long min;
        boolean z6;
        w wVar = this.f11782X;
        synchronized (wVar) {
            wVar.f11799l.h();
            while (wVar.e >= wVar.f11794f && !this.f11779U && !this.f11781W && wVar.f() == 0) {
                try {
                    wVar.l();
                } catch (Throwable th) {
                    wVar.f11799l.k();
                    throw th;
                }
            }
            wVar.f11799l.k();
            wVar.b();
            min = Math.min(wVar.f11794f - wVar.e, this.f11780V.f13216V);
            wVar.e += min;
            if (!z || min != this.f11780V.f13216V) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        this.f11782X.f11799l.h();
        try {
            w wVar2 = this.f11782X;
            wVar2.f11791b.q(wVar2.f11790a, z6, this.f11780V, min);
        } finally {
            this.f11782X.f11799l.k();
        }
    }
}
