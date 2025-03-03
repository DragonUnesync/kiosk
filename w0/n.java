package W0;

import A1.b;
import M0.C0122j;
import M0.H;
import M0.J;
import P0.r;
import P0.z;
import R2.c;
import S0.f;
import Y0.h;
import android.os.Handler;
import h1.U;
import h1.X;
import l1.e;
import p1.F;
import p1.G;
import y1.C1625a;

public final class n implements G {

    /* renamed from: a  reason: collision with root package name */
    public final X f6109a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6110b = new c(0, 5);

    /* renamed from: c  reason: collision with root package name */
    public final C1625a f6111c = new f(1);

    /* renamed from: d  reason: collision with root package name */
    public long f6112d = -9223372036854775807L;
    public final /* synthetic */ o e;

    /* JADX WARNING: type inference failed for: r2v3, types: [S0.f, y1.a] */
    public n(o oVar, e eVar) {
        this.e = oVar;
        this.f6109a = new X(eVar, (h) null, (Y0.e) null);
    }

    public final void a(int i, r rVar) {
        f(rVar, i, 0);
    }

    public final int b(C0122j jVar, int i, boolean z) {
        return d(jVar, i, z);
    }

    public final void c(M0.r rVar) {
        this.f6109a.c(rVar);
    }

    public final int d(C0122j jVar, int i, boolean z) {
        X x8 = this.f6109a;
        x8.getClass();
        return x8.d(jVar, i, z);
    }

    public final void e(long j7, int i, int i8, int i9, F f8) {
        long j8;
        long j9;
        this.f6109a.e(j7, i, i8, i9, f8);
        while (this.f6109a.w(false)) {
            C1625a aVar = this.f6111c;
            aVar.r();
            if (this.f6109a.B(this.f6110b, aVar, 0, false) == -4) {
                aVar.v();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j10 = aVar.f4388a0;
                H p3 = this.e.f6115W.p(aVar);
                if (p3 != null) {
                    b bVar = (b) p3.f2837U[0];
                    String str = bVar.f27U;
                    String str2 = bVar.f28V;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j9 = z.R(z.o(bVar.f31Y));
                        } catch (J unused) {
                            j9 = -9223372036854775807L;
                        }
                        if (j9 != -9223372036854775807L) {
                            m mVar = new m(j10, j9);
                            Handler handler = this.e.f6116X;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        X x8 = this.f6109a;
        U u3 = x8.f12407a;
        synchronized (x8) {
            int i10 = x8.f12423s;
            if (i10 == 0) {
                j8 = -1;
            } else {
                j8 = x8.h(i10);
            }
        }
        u3.b(j8);
    }

    public final void f(r rVar, int i, int i8) {
        X x8 = this.f6109a;
        x8.getClass();
        x8.f(rVar, i, 0);
    }
}
