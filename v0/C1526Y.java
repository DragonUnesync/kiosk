package v0;

import android.view.View;
import android.view.WindowInsets;
import m0.C1197c;
import o.C1280l0;

/* renamed from: v0.Y  reason: case insensitive filesystem */
public class C1526Y extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f15914c;

    public C1526Y() {
        this.f15914c = C1280l0.e();
    }

    public j0 b() {
        a();
        j0 g8 = j0.g((View) null, this.f15914c.build());
        g8.f15952a.o(this.f15917b);
        return g8;
    }

    public void d(C1197c cVar) {
        this.f15914c.setMandatorySystemGestureInsets(cVar.d());
    }

    public void e(C1197c cVar) {
        this.f15914c.setStableInsets(cVar.d());
    }

    public void f(C1197c cVar) {
        this.f15914c.setSystemGestureInsets(cVar.d());
    }

    public void g(C1197c cVar) {
        this.f15914c.setSystemWindowInsets(cVar.d());
    }

    public void h(C1197c cVar) {
        this.f15914c.setTappableElementInsets(cVar.d());
    }

    public C1526Y(j0 j0Var) {
        super(j0Var);
        WindowInsets.Builder builder;
        WindowInsets f8 = j0Var.f();
        if (f8 != null) {
            builder = C1280l0.f(f8);
        } else {
            builder = C1280l0.e();
        }
        this.f15914c = builder;
    }
}
