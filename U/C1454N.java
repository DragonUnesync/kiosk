package u;

import A.g;
import B.C0022x;
import D.C0;
import D.C0036c;
import D.C0041e0;
import D.J;
import D.K;
import D.L0;
import D.N0;
import D.V;
import H.l;
import N.e;
import android.util.Range;
import java.util.Set;
import java.util.UUID;

/* renamed from: u.N  reason: case insensitive filesystem */
public final class C1454N implements L0 {

    /* renamed from: U  reason: collision with root package name */
    public final C0041e0 f15528U;

    public C1454N() {
        C0041e0 b8 = C0041e0.b();
        b8.e(L0.f812u, new Object());
        b8.e(V.f864g, 34);
        Class<C1455O> cls = C1455O.class;
        b8.e(l.f1803F, cls);
        b8.e(l.f1802E, cls.getCanonicalName() + "-" + UUID.randomUUID());
        this.f15528U = b8;
    }

    public final int A() {
        return ((Integer) b0(V.f864g)).intValue();
    }

    public final /* synthetic */ int B() {
        return e.f(this);
    }

    public final Set J() {
        return this.f15528U.J();
    }

    public final C0 M() {
        return (C0) b0(L0.f810s);
    }

    public final /* synthetic */ int N() {
        return e.h(this);
    }

    public final C1485z P() {
        return (C1485z) o0(L0.f812u, (Object) null);
    }

    public final void Q(g gVar) {
        this.f15528U.Q(gVar);
    }

    public final /* synthetic */ boolean R() {
        return e.l(this);
    }

    public final Object Y(C0036c cVar, J j7) {
        return this.f15528U.Y(cVar, j7);
    }

    public final C0 a0() {
        return (C0) o0(L0.f810s, (Object) null);
    }

    public final Object b0(C0036c cVar) {
        return this.f15528U.b0(cVar);
    }

    public final /* synthetic */ String d0(String str) {
        return e.j(this, str);
    }

    public final /* synthetic */ boolean e0() {
        return e.m(this);
    }

    public final Set g(C0036c cVar) {
        return this.f15528U.g(cVar);
    }

    public final N0 k() {
        return N0.f835Z;
    }

    public final /* synthetic */ int l() {
        return e.k(this);
    }

    public final J m(C0036c cVar) {
        return this.f15528U.m(cVar);
    }

    public final /* synthetic */ C0022x n() {
        return e.d(this);
    }

    public final Object o0(C0036c cVar, Object obj) {
        C0041e0 e0Var = this.f15528U;
        e0Var.getClass();
        try {
            return e0Var.b0(cVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    public final /* synthetic */ String p() {
        return e.i(this);
    }

    public final boolean q0(C0036c cVar) {
        return this.f15528U.f920U.containsKey(cVar);
    }

    public final K x() {
        return this.f15528U;
    }

    public final Range y() {
        return (Range) o0(L0.f815x, (Object) null);
    }
}
