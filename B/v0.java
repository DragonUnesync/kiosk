package B;

import D.C0;
import D.C0036c;
import D.C0041e0;
import D.C0048i;
import D.C0068w;
import D.C0069x;
import D.C0071z;
import D.K;
import D.K0;
import D.L0;
import D.N;
import D.O0;
import D.X;
import E.f;
import H.l;
import P.b;
import Q0.g;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import com.bumptech.glide.c;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import n2.a;
import t.C1412a;
import u.C1477r;
import z3.e;

public abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f336a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Object f337b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public int f338c = 2;

    /* renamed from: d  reason: collision with root package name */
    public L0 f339d;
    public L0 e;

    /* renamed from: f  reason: collision with root package name */
    public L0 f340f;

    /* renamed from: g  reason: collision with root package name */
    public C0048i f341g;

    /* renamed from: h  reason: collision with root package name */
    public L0 f342h;
    public Rect i;

    /* renamed from: j  reason: collision with root package name */
    public Matrix f343j = new Matrix();

    /* renamed from: k  reason: collision with root package name */
    public C0071z f344k;

    /* renamed from: l  reason: collision with root package name */
    public C0071z f345l;

    /* renamed from: m  reason: collision with root package name */
    public C0 f346m = C0.a();

    /* renamed from: n  reason: collision with root package name */
    public C0 f347n = C0.a();

    public v0(L0 l02) {
        this.e = l02;
        this.f340f = l02;
    }

    public final void A(C0071z zVar) {
        w();
        synchronized (this.f337b) {
            try {
                C0071z zVar2 = this.f344k;
                if (zVar == zVar2) {
                    this.f336a.remove(zVar2);
                    this.f344k = null;
                }
                C0071z zVar3 = this.f345l;
                if (zVar == zVar3) {
                    this.f336a.remove(zVar3);
                    this.f345l = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f341g = null;
        this.i = null;
        this.f340f = this.e;
        this.f339d = null;
        this.f342h = null;
    }

    public final void B(List list) {
        if (!list.isEmpty()) {
            this.f346m = (C0) list.get(0);
            if (list.size() > 1) {
                this.f347n = (C0) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (N n4 : ((C0) it.next()).b()) {
                    if (n4.f829j == null) {
                        n4.f829j = getClass();
                    }
                }
            }
        }
    }

    public final void a(C0071z zVar, C0071z zVar2, L0 l02, L0 l03) {
        synchronized (this.f337b) {
            this.f344k = zVar;
            this.f345l = zVar2;
            this.f336a.add(zVar);
            if (zVar2 != null) {
                this.f336a.add(zVar2);
            }
        }
        this.f339d = l02;
        this.f342h = l03;
        this.f340f = l(zVar.l(), this.f339d, this.f342h);
        p();
    }

    public final C0071z b() {
        C0071z zVar;
        synchronized (this.f337b) {
            zVar = this.f344k;
        }
        return zVar;
    }

    public final C0068w c() {
        synchronized (this.f337b) {
            try {
                C0071z zVar = this.f344k;
                if (zVar == null) {
                    e eVar = C0068w.f955f;
                    return eVar;
                }
                C0068w m8 = zVar.m();
                return m8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        C0071z b8 = b();
        a.l(b8, "No camera attached to use case: " + this);
        return b8.l().e();
    }

    public abstract L0 e(boolean z, O0 o02);

    public final String f() {
        L0 l02 = this.f340f;
        String d02 = l02.d0("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(d02);
        return d02;
    }

    public final int g(C0071z zVar, boolean z) {
        int g8 = zVar.l().g(((X) this.f340f).h0(0));
        if (zVar.j() || !z) {
            return g8;
        }
        return f.f(-g8);
    }

    public final C0071z h() {
        C0071z zVar;
        synchronized (this.f337b) {
            zVar = this.f345l;
        }
        return zVar;
    }

    public Set i() {
        return Collections.emptySet();
    }

    public abstract K0 j(K k8);

    public final boolean k(C0071z zVar) {
        int G8 = ((X) this.f340f).G();
        if (G8 == -1 || G8 == 0) {
            return false;
        }
        if (G8 == 1) {
            return true;
        }
        if (G8 == 2) {
            return zVar.f();
        }
        throw new AssertionError(g.m(G8, "Unknown mirrorMode: "));
    }

    public final L0 l(C0069x xVar, L0 l02, L0 l03) {
        C0041e0 e0Var;
        if (l03 != null) {
            e0Var = C0041e0.c(l03);
            e0Var.f920U.remove(l.f1802E);
        } else {
            e0Var = C0041e0.b();
        }
        boolean q02 = this.e.q0(X.i);
        TreeMap treeMap = e0Var.f920U;
        if (q02 || this.e.q0(X.f870m)) {
            C0036c cVar = X.f874q;
            if (treeMap.containsKey(cVar)) {
                treeMap.remove(cVar);
            }
        }
        L0 l04 = this.e;
        C0036c cVar2 = X.f874q;
        if (l04.q0(cVar2)) {
            C0036c cVar3 = X.f872o;
            if (treeMap.containsKey(cVar3) && ((b) this.e.b0(cVar2)).f3683b != null) {
                treeMap.remove(cVar3);
            }
        }
        for (C0036c J8 : this.e.J()) {
            N.e.J(e0Var, e0Var, this.e, J8);
        }
        if (l02 != null) {
            for (C0036c cVar4 : l02.J()) {
                if (!cVar4.f888a.equals(l.f1802E.f888a)) {
                    N.e.J(e0Var, e0Var, l02, cVar4);
                }
            }
        }
        if (treeMap.containsKey(X.f870m)) {
            C0036c cVar5 = X.i;
            if (treeMap.containsKey(cVar5)) {
                treeMap.remove(cVar5);
            }
        }
        C0036c cVar6 = X.f874q;
        if (treeMap.containsKey(cVar6)) {
            ((b) e0Var.b0(cVar6)).getClass();
        }
        return r(xVar, j(e0Var));
    }

    public final void m() {
        this.f338c = 1;
        o();
    }

    public final void n() {
        Iterator it = this.f336a.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).p(this);
        }
    }

    public final void o() {
        int h5 = C1477r.h(this.f338c);
        HashSet hashSet = this.f336a;
        if (h5 == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).c(this);
            }
        } else if (h5 == 1) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((u0) it2.next()).e(this);
            }
        }
    }

    public void p() {
    }

    public void q() {
    }

    public abstract L0 r(C0069x xVar, K0 k02);

    public void s() {
    }

    public void t() {
    }

    public abstract C0048i u(C1412a aVar);

    public abstract C0048i v(C0048i iVar, C0048i iVar2);

    public abstract void w();

    public void x(Matrix matrix) {
        this.f343j = new Matrix(matrix);
    }

    public final boolean y(int i8) {
        Size i9;
        int h02 = ((X) this.f340f).h0(-1);
        if (h02 != -1 && h02 == i8) {
            return false;
        }
        K0 j7 = j(this.e);
        X x8 = (X) j7.b();
        int h03 = x8.h0(-1);
        if (h03 == -1 || h03 != i8) {
            E e8 = (E) j7;
            switch (e8.f144a) {
                case 0:
                    e8.f145b.e(X.f867j, Integer.valueOf(i8));
                    break;
                case 1:
                    e8.f145b.e(X.f867j, Integer.valueOf(i8));
                    break;
                default:
                    C0036c cVar = X.f867j;
                    Integer valueOf = Integer.valueOf(i8);
                    C0041e0 e0Var = e8.f145b;
                    e0Var.e(cVar, valueOf);
                    e0Var.e(X.f868k, Integer.valueOf(i8));
                    break;
            }
        }
        if (!(h03 == -1 || i8 == -1 || h03 == i8)) {
            if (Math.abs(c.z(i8) - c.z(h03)) % 180 == 90 && (i9 = x8.i()) != null) {
                E e9 = (E) j7;
                Size size = new Size(i9.getHeight(), i9.getWidth());
                switch (e9.f144a) {
                    case 0:
                        e9.f145b.e(X.f870m, size);
                        break;
                    case 1:
                        e9.f145b.e(X.f870m, size);
                        break;
                    default:
                        e9.f145b.e(X.f870m, size);
                        break;
                }
            }
        }
        this.e = j7.b();
        C0071z b8 = b();
        if (b8 == null) {
            this.f340f = this.e;
            return true;
        }
        this.f340f = l(b8.l(), this.f339d, this.f342h);
        return true;
    }

    public void z(Rect rect) {
        this.i = rect;
    }
}
