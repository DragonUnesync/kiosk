package f7;

import N.e;
import Z6.b;
import java.io.IOException;
import l7.f;
import l7.w;
import l7.y;

public final class u implements w {

    /* renamed from: U  reason: collision with root package name */
    public final long f11783U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f11784V;

    /* renamed from: W  reason: collision with root package name */
    public final f f11785W = new Object();

    /* renamed from: X  reason: collision with root package name */
    public final f f11786X = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public boolean f11787Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w f11788Z;

    /* JADX WARNING: type inference failed for: r1v1, types: [l7.f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [l7.f, java.lang.Object] */
    public u(w wVar, long j7, boolean z) {
        this.f11788Z = wVar;
        this.f11783U = j7;
        this.f11784V = z;
    }

    public final y a() {
        return this.f11788Z.f11798k;
    }

    public final void close() {
        long j7;
        w wVar = this.f11788Z;
        synchronized (wVar) {
            this.f11787Y = true;
            f fVar = this.f11786X;
            j7 = fVar.f13216V;
            fVar.t(j7);
            wVar.notifyAll();
        }
        if (j7 > 0) {
            k(j7);
        }
        this.f11788Z.a();
    }

    public final long f(f fVar, long j7) {
        Throwable th;
        boolean z;
        long j8;
        P6.f.e(fVar, "sink");
        do {
            w wVar = this.f11788Z;
            synchronized (wVar) {
                wVar.f11798k.h();
                try {
                    if (wVar.f() == 0 || this.f11784V) {
                        th = null;
                    } else {
                        th = wVar.f11801n;
                        if (th == null) {
                            int f8 = wVar.f();
                            e.C(f8);
                            th = new C0937B(f8);
                        }
                    }
                    if (!this.f11787Y) {
                        f fVar2 = this.f11786X;
                        long j9 = fVar2.f13216V;
                        z = false;
                        if (j9 > 0) {
                            j8 = fVar2.f(fVar, Math.min(8192, j9));
                            long j10 = wVar.f11792c + j8;
                            wVar.f11792c = j10;
                            long j11 = j10 - wVar.f11793d;
                            if (th == null && j11 >= ((long) (wVar.f11791b.f11753j0.a() / 2))) {
                                wVar.f11791b.s(wVar.f11790a, j11);
                                wVar.f11793d = wVar.f11792c;
                            }
                        } else {
                            if (!this.f11784V && th == null) {
                                wVar.l();
                                z = true;
                            }
                            j8 = -1;
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } finally {
                    wVar.f11798k.k();
                }
            }
        } while (z);
        if (j8 != -1) {
            return j8;
        }
        if (th == null) {
            return -1;
        }
        throw th;
    }

    public final void k(long j7) {
        byte[] bArr = b.f6982a;
        this.f11788Z.f11791b.p(j7);
    }
}
