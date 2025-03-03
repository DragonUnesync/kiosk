package v0;

import android.view.View;
import android.view.WindowInsets;
import m0.C1197c;

public class c0 extends b0 {

    /* renamed from: m  reason: collision with root package name */
    public C1197c f15929m = null;

    public c0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
    }

    public j0 b() {
        return j0.g((View) null, this.f15925c.consumeStableInsets());
    }

    public j0 c() {
        return j0.g((View) null, this.f15925c.consumeSystemWindowInsets());
    }

    public final C1197c h() {
        if (this.f15929m == null) {
            WindowInsets windowInsets = this.f15925c;
            this.f15929m = C1197c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f15929m;
    }

    public boolean m() {
        return this.f15925c.isConsumed();
    }

    public void q(C1197c cVar) {
        this.f15929m = cVar;
    }
}
