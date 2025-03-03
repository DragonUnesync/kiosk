package h1;

import A1.d;
import H3.P;
import M0.C;
import M0.C0137z;
import P0.l;
import P0.z;
import R0.A;
import R0.m;
import U0.j;
import Y0.h;
import android.os.Looper;
import androidx.camera.lifecycle.c;
import d4.k;
import l1.e;
import m1.C1206a;
import p1.r;

public final class T extends C1035a {

    /* renamed from: h  reason: collision with root package name */
    public final d f12381h;
    public final c i;

    /* renamed from: j  reason: collision with root package name */
    public final h f12382j;

    /* renamed from: k  reason: collision with root package name */
    public final C1048n f12383k;

    /* renamed from: l  reason: collision with root package name */
    public final int f12384l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f12385m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12386n = true;

    /* renamed from: o  reason: collision with root package name */
    public long f12387o = -9223372036854775807L;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12388p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12389q;

    /* renamed from: r  reason: collision with root package name */
    public A f12390r;

    /* renamed from: s  reason: collision with root package name */
    public C f12391s;

    public T(C c8, d dVar, c cVar, h hVar, C1048n nVar, int i8, boolean z) {
        this.f12391s = c8;
        this.f12381h = dVar;
        this.i = cVar;
        this.f12382j = hVar;
        this.f12383k = nVar;
        this.f12384l = i8;
        this.f12385m = z;
    }

    public final C1059z b(C1031B b8, e eVar, long j7) {
        R0.h g8 = this.f12381h.g();
        A a8 = this.f12390r;
        if (a8 != null) {
            ((m) g8).o(a8);
        }
        C0137z zVar = h().f2786b;
        zVar.getClass();
        l.k(this.f12435g);
        k kVar = new k(6, (Object) (r) this.i.f7669V);
        Y0.e eVar2 = new Y0.e(this.f12433d.f6317c, 0, b8);
        Y0.e a9 = a(b8);
        long O8 = z.O(zVar.e);
        return new Q(zVar.f3060a, g8, kVar, this.f12382j, eVar2, this.f12383k, a9, this, eVar, this.f12384l, this.f12385m, O8, (C1206a) null);
    }

    public final synchronized C h() {
        return this.f12391s;
    }

    public final void j() {
    }

    public final void l(A a8) {
        this.f12390r = a8;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j jVar = this.f12435g;
        l.k(jVar);
        h hVar = this.f12382j;
        hVar.c(myLooper, jVar);
        hVar.i();
        t();
    }

    public final void n(C1059z zVar) {
        Q q7 = (Q) zVar;
        if (q7.f12367q0) {
            for (X x8 : q7.f12365n0) {
                x8.j();
                P p3 = x8.f12413h;
                if (p3 != null) {
                    p3.D0(x8.e);
                    x8.f12413h = null;
                    x8.f12412g = null;
                }
            }
        }
        q7.f12357f0.e(q7);
        q7.f12362k0.removeCallbacksAndMessages((Object) null);
        q7.f12363l0 = null;
        q7.f12345I0 = true;
    }

    public final void p() {
        this.f12382j.release();
    }

    public final synchronized void s(C c8) {
        this.f12391s = c8;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [f1.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r7 = this;
            h1.c0 r6 = new h1.c0
            long r1 = r7.f12387o
            boolean r3 = r7.f12388p
            boolean r4 = r7.f12389q
            M0.C r5 = r7.h()
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            boolean r0 = r7.f12386n
            if (r0 == 0) goto L_0x001b
            f1.q r0 = new f1.q
            r1 = 1
            r0.<init>(r6, r1)
            r6 = r0
        L_0x001b:
            r7.m(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.T.t():void");
    }

    public final void u(long j7, boolean z, boolean z6) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f12387o;
        }
        if (this.f12386n || this.f12387o != j7 || this.f12388p != z || this.f12389q != z6) {
            this.f12387o = j7;
            this.f12388p = z;
            this.f12389q = z6;
            this.f12386n = false;
            t();
        }
    }
}
