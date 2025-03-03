package M;

import A.d;
import B.C0010k;
import B.l0;
import B.p0;
import B.s0;
import B.t0;
import D.C0048i;
import D.C0071z;
import D.M;
import D7.b;
import G.i;
import android.graphics.Matrix;
import android.graphics.Rect;
import g7.l;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import n2.a;
import u0.C1486a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f2759a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f2760b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2761c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2762d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2763f;

    /* renamed from: g  reason: collision with root package name */
    public final C0048i f2764g;

    /* renamed from: h  reason: collision with root package name */
    public int f2765h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2766j = false;

    /* renamed from: k  reason: collision with root package name */
    public t0 f2767k;

    /* renamed from: l  reason: collision with root package name */
    public j f2768l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f2769m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public boolean f2770n = false;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f2771o = new ArrayList();

    public k(int i8, int i9, C0048i iVar, Matrix matrix, boolean z, Rect rect, int i10, int i11, boolean z6) {
        this.f2763f = i8;
        this.f2759a = i9;
        this.f2764g = iVar;
        this.f2760b = matrix;
        this.f2761c = z;
        this.f2762d = rect;
        this.i = i10;
        this.f2765h = i11;
        this.e = z6;
        this.f2768l = new j(iVar.f904a, i9);
    }

    public final void a() {
        a.m("Edge is already closed.", !this.f2770n);
    }

    public final void b() {
        l.a();
        this.f2768l.a();
        this.f2770n = true;
    }

    public final t0 c(C0071z zVar, boolean z) {
        l.a();
        a();
        C0048i iVar = this.f2764g;
        C0071z zVar2 = zVar;
        boolean z6 = z;
        t0 t0Var = new t0(iVar.f904a, zVar2, z6, iVar.f905b, new f(this, 0));
        try {
            p0 p0Var = t0Var.f314k;
            j jVar = this.f2768l;
            Objects.requireNonNull(jVar);
            if (jVar.g(p0Var, new g(jVar, 0))) {
                i.d(jVar.e).d(new d(18, p0Var), b.l());
            }
            this.f2767k = t0Var;
            e();
            return t0Var;
        } catch (M e8) {
            throw new AssertionError("Surface is somehow already closed", e8);
        } catch (RuntimeException e9) {
            t0Var.c();
            throw e9;
        }
    }

    public final void d() {
        boolean z;
        l.a();
        a();
        j jVar = this.f2768l;
        jVar.getClass();
        l.a();
        if (jVar.f2757q == null) {
            synchronized (jVar.f822a) {
                z = jVar.f824c;
            }
            if (!z) {
                return;
            }
        }
        this.f2766j = false;
        this.f2768l.a();
        this.f2768l = new j(this.f2764g.f904a, this.f2759a);
        Iterator it = this.f2769m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        s0 s0Var;
        Executor executor;
        l.a();
        C0010k kVar = new C0010k(this.f2762d, this.i, this.f2765h, this.f2761c, this.f2760b, this.e);
        t0 t0Var = this.f2767k;
        if (t0Var != null) {
            synchronized (t0Var.f306a) {
                t0Var.f315l = kVar;
                s0Var = t0Var.f316m;
                executor = t0Var.f317n;
            }
            if (!(s0Var == null || executor == null)) {
                executor.execute(new l0(s0Var, kVar, 0));
            }
        }
        Iterator it = this.f2771o.iterator();
        while (it.hasNext()) {
            ((C1486a) it.next()).accept(kVar);
        }
    }
}
