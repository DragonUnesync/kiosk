package h3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import h0.C1026a;
import v0.C1510H;

/* renamed from: h3.a  reason: case insensitive filesystem */
public abstract class C1078a extends C1026a {

    /* renamed from: a  reason: collision with root package name */
    public l f12613a;

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f12613a == null) {
            this.f12613a = new l(view);
        }
        l lVar = this.f12613a;
        View view2 = lVar.f9303U;
        lVar.f9304V = view2.getTop();
        lVar.f9305W = view2.getLeft();
        l lVar2 = this.f12613a;
        View view3 = lVar2.f9303U;
        C1510H.k(view3, 0 - (view3.getTop() - lVar2.f9304V));
        C1510H.j(view3, 0 - (view3.getLeft() - lVar2.f9305W));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
