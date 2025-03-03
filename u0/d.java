package U0;

import B.B;
import B7.g;
import H3.M;
import H3.i0;
import H3.n0;
import M0.C;
import M0.F;
import M0.H;
import M0.K;
import M0.L;
import M0.N;
import M0.O;
import M0.P;
import M0.Q;
import M0.V;
import M0.W;
import M0.X;
import M0.c0;
import M0.e0;
import M0.h0;
import O0.c;
import P0.h;
import P0.k;
import P0.l;
import P0.t;
import P0.v;
import P0.z;
import T0.C0220l;
import T0.C0225q;
import T0.C0228u;
import T0.C0232y;
import Y0.f;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import h1.C1031B;
import h1.C1053t;
import h1.G;
import java.io.IOException;
import java.util.List;
import u.C1455O;

public final class d implements O, G, f {

    /* renamed from: U  reason: collision with root package name */
    public final t f5324U;

    /* renamed from: V  reason: collision with root package name */
    public final V f5325V;

    /* renamed from: W  reason: collision with root package name */
    public final W f5326W;

    /* renamed from: X  reason: collision with root package name */
    public final C1455O f5327X;

    /* renamed from: Y  reason: collision with root package name */
    public final SparseArray f5328Y;

    /* renamed from: Z  reason: collision with root package name */
    public k f5329Z;

    /* renamed from: a0  reason: collision with root package name */
    public Q f5330a0;

    /* renamed from: b0  reason: collision with root package name */
    public v f5331b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f5332c0;

    /* JADX WARNING: type inference failed for: r0v2, types: [u.O, java.lang.Object] */
    public d(t tVar) {
        tVar.getClass();
        this.f5324U = tVar;
        int i = z.f3748a;
        Looper myLooper = Looper.myLooper();
        this.f5329Z = new k(myLooper == null ? Looper.getMainLooper() : myLooper, tVar, new b(8));
        V v4 = new V();
        this.f5325V = v4;
        this.f5326W = new W();
        ? obj = new Object();
        obj.f15529a = v4;
        M m8 = H3.O.f2026V;
        obj.f15530b = i0.f2073Y;
        obj.f15531c = n0.f2094a0;
        this.f5327X = obj;
        this.f5328Y = new SparseArray();
    }

    public final void A(boolean z) {
        L(G(), 9, new b(21));
    }

    public final void B(int i, int i8) {
        L(K(), 24, new b(22));
    }

    public final void C(F f8) {
        L(G(), 14, new b(27));
    }

    public final void D(H h5) {
        L(G(), 28, new g(26));
    }

    public final void E(h0 h0Var) {
        a K4 = K();
        L(K4, 25, new C0228u(K4, h0Var));
    }

    public final void F(boolean z) {
        L(G(), 7, new g(28));
    }

    public final a G() {
        return I((C1031B) this.f5327X.f15532d);
    }

    public final a H(X x8, int i, C1031B b8) {
        C1031B b9;
        boolean z;
        X x9 = x8;
        int i8 = i;
        if (x8.p()) {
            b9 = null;
        } else {
            b9 = b8;
        }
        this.f5324U.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!x9.equals(((C0232y) this.f5330a0).z()) || i8 != ((C0232y) this.f5330a0).v()) {
            z = false;
        } else {
            z = true;
        }
        long j7 = 0;
        if (b9 == null || !b9.b()) {
            if (z) {
                C0232y yVar = (C0232y) this.f5330a0;
                yVar.Y();
                j7 = yVar.s(yVar.f4945b1);
            } else if (!x8.p()) {
                j7 = z.c0(x9.m(i8, this.f5326W, 0).f2879l);
            }
        } else if (z && ((C0232y) this.f5330a0).t() == b9.f12278b && ((C0232y) this.f5330a0).u() == b9.f12279c) {
            j7 = ((C0232y) this.f5330a0).x();
        }
        X z6 = ((C0232y) this.f5330a0).z();
        int v4 = ((C0232y) this.f5330a0).v();
        long x10 = ((C0232y) this.f5330a0).x();
        C0232y yVar2 = (C0232y) this.f5330a0;
        yVar2.Y();
        return new a(elapsedRealtime, x8, i, b9, j7, z6, v4, (C1031B) this.f5327X.f15532d, x10, z.c0(yVar2.f4945b1.f4764r));
    }

    public final a I(C1031B b8) {
        X x8;
        this.f5330a0.getClass();
        if (b8 == null) {
            x8 = null;
        } else {
            x8 = (X) ((n0) this.f5327X.f15531c).get(b8);
        }
        if (b8 != null && x8 != null) {
            return H(x8, x8.g(b8.f12277a, this.f5325V).f2864c, b8);
        }
        int v4 = ((C0232y) this.f5330a0).v();
        X z = ((C0232y) this.f5330a0).z();
        if (v4 >= z.o()) {
            z = X.f2884a;
        }
        return H(z, v4, (C1031B) null);
    }

    public final a J(int i, C1031B b8) {
        this.f5330a0.getClass();
        if (b8 == null) {
            X z = ((C0232y) this.f5330a0).z();
            if (i >= z.o()) {
                z = X.f2884a;
            }
            return H(z, i, (C1031B) null);
        } else if (((X) ((n0) this.f5327X.f15531c).get(b8)) != null) {
            return I(b8);
        } else {
            return H(X.f2884a, i, b8);
        }
    }

    public final a K() {
        return I((C1031B) this.f5327X.f15533f);
    }

    public final void L(a aVar, int i, h hVar) {
        this.f5328Y.put(i, aVar);
        this.f5329Z.e(i, hVar);
    }

    public final void M(Q q7, Looper looper) {
        boolean z;
        if (this.f5330a0 == null || ((H3.O) this.f5327X.f15530b).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        q7.getClass();
        this.f5330a0 = q7;
        this.f5331b0 = this.f5324U.a(looper, (Handler.Callback) null);
        k kVar = this.f5329Z;
        A.g gVar = new A.g(this, 8, q7);
        Looper looper2 = looper;
        this.f5329Z = new k(kVar.f3714d, looper2, kVar.f3711a, gVar, kVar.i);
    }

    public final void a(int i) {
        L(G(), 6, new b(1));
    }

    public final void b(int i) {
        Q q7 = this.f5330a0;
        q7.getClass();
        C1455O o2 = this.f5327X;
        o2.f15532d = C1455O.e(q7, (H3.O) o2.f15530b, (C1031B) o2.e, (V) o2.f15529a);
        o2.o(((C0232y) q7).z());
        L(G(), 0, new g(22));
    }

    public final void c(e0 e0Var) {
        L(G(), 2, new b(0));
    }

    public final void d(c cVar) {
        L(G(), 27, new b(18));
    }

    public final void e(K k8) {
        a aVar;
        C1031B b8;
        if (!(k8 instanceof C0220l) || (b8 = ((C0220l) k8).f4869b0) == null) {
            aVar = G();
        } else {
            aVar = I(b8);
        }
        L(aVar, 10, new b(4));
    }

    public final void f(int i) {
        L(G(), 8, new b(16));
    }

    public final void g(int i, C1031B b8, C1053t tVar, g1.g gVar) {
        L(J(i, b8), 1002, new b(25));
    }

    public final void h(c0 c0Var) {
        L(G(), 19, new c(2));
    }

    public final void i(boolean z) {
        L(G(), 3, new c(4));
    }

    public final void j() {
    }

    public final void k(int i, C1031B b8, C1053t tVar, g1.g gVar, IOException iOException, boolean z) {
        a J8 = J(i, b8);
        L(J8, 1003, new B(J8, tVar, gVar, iOException, z));
    }

    public final void l(boolean z) {
        L(K(), 23, new b(29));
    }

    public final void m(int i, P p3, P p8) {
        if (i == 1) {
            this.f5332c0 = false;
        }
        Q q7 = this.f5330a0;
        q7.getClass();
        C1455O o2 = this.f5327X;
        o2.f15532d = C1455O.e(q7, (H3.O) o2.f15530b, (C1031B) o2.e, (V) o2.f15529a);
        a G8 = G();
        L(G8, 11, new C0225q(G8, i, p3, p8));
    }

    public final void n(List list) {
        L(G(), 27, new b(7));
    }

    public final void o(int i, boolean z) {
        L(G(), -1, new g(25));
    }

    public final void p(int i, boolean z) {
        L(G(), 5, new b(5));
    }

    public final void q(C c8, int i) {
        L(G(), 1, new g(23));
    }

    public final void r(int i, C1031B b8, C1053t tVar, g1.g gVar) {
        L(J(i, b8), 1001, new b(26));
    }

    public final void s(int i, C1031B b8, g1.g gVar) {
        a J8 = J(i, b8);
        L(J8, 1004, new A.g(J8, 9, gVar));
    }

    public final void t(N n4) {
    }

    public final void u(int i, C1031B b8, g1.g gVar) {
        L(J(i, b8), 1005, new b(28));
    }

    public final void v(K k8) {
        a aVar;
        C1031B b8;
        if (!(k8 instanceof C0220l) || (b8 = ((C0220l) k8).f4869b0) == null) {
            aVar = G();
        } else {
            aVar = I(b8);
        }
        L(aVar, 10, new B(aVar, (Object) k8, 23));
    }

    public final void w(int i) {
        L(G(), 4, new b(11));
    }

    public final void x(int i, C1031B b8, C1053t tVar, g1.g gVar) {
        L(J(i, b8), 1000, new c(6));
    }

    public final void y(M0.M m8) {
        L(G(), 13, new g(21));
    }

    public final void z(L l8) {
        L(G(), 12, new g(20));
    }
}
