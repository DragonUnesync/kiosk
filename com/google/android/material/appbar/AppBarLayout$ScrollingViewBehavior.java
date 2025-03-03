package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f3.C0899a;
import h0.C1026a;
import h0.C1029d;
import h3.C1078a;
import java.util.ArrayList;
import n2.a;
import v0.C1510H;

public class AppBarLayout$ScrollingViewBehavior extends C1078a {

    /* renamed from: b  reason: collision with root package name */
    public final int f9142b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
        }
    }

    public final void b(View view) {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        C1026a aVar = ((C1029d) view2.getLayoutParams()).f12261a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i8 = this.f9142b;
            if (i8 == 0) {
                i = 0;
            } else {
                i = a.o((int) (0.0f * ((float) i8)), 0, i8);
            }
            C1510H.k(view, bottom - i);
        }
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9) {
        int i10 = view.getLayoutParams().height;
        if (i10 != -1 && i10 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11667u);
        this.f9142b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
