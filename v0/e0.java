package v0;

import android.view.View;
import android.view.WindowInsets;
import m0.C1197c;

public class e0 extends d0 {

    /* renamed from: n  reason: collision with root package name */
    public C1197c f15936n = null;

    /* renamed from: o  reason: collision with root package name */
    public C1197c f15937o = null;

    /* renamed from: p  reason: collision with root package name */
    public C1197c f15938p = null;

    public e0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
    }

    public C1197c g() {
        if (this.f15937o == null) {
            this.f15937o = C1197c.c(this.f15925c.getMandatorySystemGestureInsets());
        }
        return this.f15937o;
    }

    public C1197c i() {
        if (this.f15936n == null) {
            this.f15936n = C1197c.c(this.f15925c.getSystemGestureInsets());
        }
        return this.f15936n;
    }

    public C1197c k() {
        if (this.f15938p == null) {
            this.f15938p = C1197c.c(this.f15925c.getTappableElementInsets());
        }
        return this.f15938p;
    }

    public j0 l(int i, int i8, int i9, int i10) {
        return j0.g((View) null, this.f15925c.inset(i, i8, i9, i10));
    }

    public void q(C1197c cVar) {
    }
}
