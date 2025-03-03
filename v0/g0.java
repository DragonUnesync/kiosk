package v0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
import m0.C1197c;

public class g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f15948b;

    /* renamed from: a  reason: collision with root package name */
    public final j0 f15949a;

    static {
        a0 a0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a0Var = new C1527Z();
        } else if (i >= 29) {
            a0Var = new C1526Y();
        } else {
            a0Var = new C1525X();
        }
        f15948b = a0Var.b().f15952a.a().f15952a.b().f15952a.c();
    }

    public g0(j0 j0Var) {
        this.f15949a = j0Var;
    }

    public j0 a() {
        return this.f15949a;
    }

    public j0 b() {
        return this.f15949a;
    }

    public j0 c() {
        return this.f15949a;
    }

    public void d(View view) {
    }

    public C1535h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (n() != g0Var.n() || m() != g0Var.m() || !Objects.equals(j(), g0Var.j()) || !Objects.equals(h(), g0Var.h()) || !Objects.equals(e(), g0Var.e())) {
            return false;
        }
        return true;
    }

    public C1197c f(int i) {
        return C1197c.e;
    }

    public C1197c g() {
        return j();
    }

    public C1197c h() {
        return C1197c.e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public C1197c i() {
        return j();
    }

    public C1197c j() {
        return C1197c.e;
    }

    public C1197c k() {
        return j();
    }

    public j0 l(int i, int i8, int i9, int i10) {
        return f15948b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C1197c[] cVarArr) {
    }

    public void p(j0 j0Var) {
    }

    public void q(C1197c cVar) {
    }
}
