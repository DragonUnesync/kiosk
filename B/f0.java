package B;

import A.d;
import D.C0041e0;
import D.C0048i;
import D.C0053k0;
import D.C0059n0;
import D.C0069x;
import D.C0071z;
import D.I;
import D.K;
import D.K0;
import D.L0;
import D.O0;
import D.V;
import D.X;
import D.y0;
import D.z0;
import D7.b;
import F.e;
import M.h;
import M.k;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import g7.l;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import n2.a;
import t.C1412a;

public final class f0 extends v0 {

    /* renamed from: v  reason: collision with root package name */
    public static final d0 f237v = new Object();

    /* renamed from: w  reason: collision with root package name */
    public static final e f238w = b.H();

    /* renamed from: o  reason: collision with root package name */
    public e0 f239o;

    /* renamed from: p  reason: collision with root package name */
    public e f240p;

    /* renamed from: q  reason: collision with root package name */
    public y0 f241q;

    /* renamed from: r  reason: collision with root package name */
    public p0 f242r;

    /* renamed from: s  reason: collision with root package name */
    public k f243s;

    /* renamed from: t  reason: collision with root package name */
    public t0 f244t;

    /* renamed from: u  reason: collision with root package name */
    public z0 f245u;

    public final void C() {
        z0 z0Var = this.f245u;
        if (z0Var != null) {
            z0Var.b();
            this.f245u = null;
        }
        p0 p0Var = this.f242r;
        if (p0Var != null) {
            p0Var.a();
            this.f242r = null;
        }
        k kVar = this.f243s;
        if (kVar != null) {
            kVar.b();
            this.f243s = null;
        }
        this.f244t = null;
    }

    public final void D() {
        C0071z b8 = b();
        k kVar = this.f243s;
        if (b8 != null && kVar != null) {
            l.n(new h(kVar, g(b8, k(b8)), ((X) this.f340f).p0()));
        }
    }

    public final void E(e0 e0Var) {
        l.a();
        Size size = null;
        if (e0Var == null) {
            this.f239o = null;
            this.f338c = 2;
            o();
            return;
        }
        this.f239o = e0Var;
        this.f240p = f238w;
        C0048i iVar = this.f341g;
        if (iVar != null) {
            size = iVar.f904a;
        }
        if (size != null) {
            F((C0059n0) this.f340f, iVar);
            n();
        }
        m();
    }

    public final void F(C0059n0 n0Var, C0048i iVar) {
        boolean z;
        Rect rect;
        boolean z6;
        C0048i iVar2 = iVar;
        l.a();
        C0071z b8 = b();
        Objects.requireNonNull(b8);
        C();
        if (this.f243s == null) {
            z = true;
        } else {
            z = false;
        }
        Rect rect2 = null;
        a.m((String) null, z);
        Matrix matrix = this.f343j;
        boolean j7 = b8.j();
        Size size = iVar2.f904a;
        Rect rect3 = this.i;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        int g8 = g(b8, k(b8));
        int p0 = ((X) this.f340f).p0();
        if (!b8.j() || !k(b8)) {
            z6 = false;
        } else {
            z6 = true;
        }
        k kVar = r1;
        k kVar2 = new k(1, 34, iVar, matrix, j7, rect, g8, p0, z6);
        this.f243s = kVar;
        d dVar = new d(3, this);
        l.a();
        kVar.a();
        kVar.f2769m.add(dVar);
        t0 c8 = this.f243s.c(b8, true);
        this.f244t = c8;
        this.f242r = c8.f314k;
        if (this.f239o != null) {
            D();
            e0 e0Var = this.f239o;
            e0Var.getClass();
            t0 t0Var = this.f244t;
            t0Var.getClass();
            this.f240p.execute(new C0002c((Object) e0Var, 3, (Object) t0Var));
        }
        y0 d8 = y0.d(n0Var, iVar2.f904a);
        j0 j0Var = d8.f959b;
        j0Var.getClass();
        ((C0041e0) j0Var.f267X).e(I.f787j, iVar2.f906c);
        int f8 = N.e.f(n0Var);
        if (f8 != 0) {
            j0Var.getClass();
            if (f8 != 0) {
                ((C0041e0) j0Var.f267X).e(L0.f808B, Integer.valueOf(f8));
            }
        }
        C1412a aVar = iVar2.f907d;
        if (aVar != null) {
            j0Var.e(aVar);
        }
        if (this.f239o != null) {
            d8.b(this.f242r, iVar2.f905b, ((X) this.f340f).G());
        }
        z0 z0Var = this.f245u;
        if (z0Var != null) {
            z0Var.b();
        }
        z0 z0Var2 = new z0(new C(2, this));
        this.f245u = z0Var2;
        d8.f962f = z0Var2;
        this.f241q = d8;
        Object[] objArr = {d8.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(DesugarCollections.unmodifiableList(arrayList));
    }

    public final L0 e(boolean z, O0 o02) {
        f237v.getClass();
        C0059n0 n0Var = d0.f232a;
        n0Var.getClass();
        K a8 = o02.a(N.e.c(n0Var), 1);
        if (z) {
            a8 = N.e.I(a8, n0Var);
        }
        if (a8 == null) {
            return null;
        }
        return new C0059n0(C0053k0.a(((E) j(a8)).f145b));
    }

    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final K0 j(K k8) {
        return new E(C0041e0.c(k8), 2);
    }

    public final L0 r(C0069x xVar, K0 k02) {
        ((C0041e0) k02.a()).e(V.f864g, 34);
        return k02.b();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    public final C0048i u(C1412a aVar) {
        this.f241q.a(aVar);
        Object[] objArr = {this.f241q.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(DesugarCollections.unmodifiableList(arrayList));
        C7.d a8 = this.f341g.a();
        a8.f735Y = aVar;
        return a8.d();
    }

    public final C0048i v(C0048i iVar, C0048i iVar2) {
        F((C0059n0) this.f340f, iVar);
        return iVar;
    }

    public final void w() {
        C();
    }

    public final void z(Rect rect) {
        this.i = rect;
        D();
    }
}
