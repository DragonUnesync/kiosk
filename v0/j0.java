package v0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import m0.C1197c;

public final class j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f15951b;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f15952a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f15951b = f0.f15940q;
        } else {
            f15951b = g0.f15948b;
        }
    }

    public j0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f15952a = new f0(this, windowInsets);
        } else if (i >= 29) {
            this.f15952a = new e0(this, windowInsets);
        } else if (i >= 28) {
            this.f15952a = new d0(this, windowInsets);
        } else {
            this.f15952a = new c0(this, windowInsets);
        }
    }

    public static C1197c e(C1197c cVar, int i, int i8, int i9, int i10) {
        int max = Math.max(0, cVar.f13316a - i);
        int max2 = Math.max(0, cVar.f13317b - i8);
        int max3 = Math.max(0, cVar.f13318c - i9);
        int max4 = Math.max(0, cVar.f13319d - i10);
        if (max == i && max2 == i8 && max3 == i9 && max4 == i10) {
            return cVar;
        }
        return C1197c.b(max, max2, max3, max4);
    }

    public static j0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        j0 j0Var = new j0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            j0 h5 = C1510H.h(view);
            g0 g0Var = j0Var.f15952a;
            g0Var.p(h5);
            g0Var.d(view.getRootView());
        }
        return j0Var;
    }

    public final int a() {
        return this.f15952a.j().f13319d;
    }

    public final int b() {
        return this.f15952a.j().f13316a;
    }

    public final int c() {
        return this.f15952a.j().f13318c;
    }

    public final int d() {
        return this.f15952a.j().f13317b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return Objects.equals(this.f15952a, ((j0) obj).f15952a);
    }

    public final WindowInsets f() {
        g0 g0Var = this.f15952a;
        if (g0Var instanceof b0) {
            return ((b0) g0Var).f15925c;
        }
        return null;
    }

    public final int hashCode() {
        g0 g0Var = this.f15952a;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.hashCode();
    }

    public j0() {
        this.f15952a = new g0(this);
    }
}
