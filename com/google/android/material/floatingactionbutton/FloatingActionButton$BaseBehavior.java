package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f3.C0899a;
import h0.C1026a;
import h0.C1029d;

public class FloatingActionButton$BaseBehavior<T> extends C1026a {
    public FloatingActionButton$BaseBehavior() {
    }

    public final boolean a(View view) {
        throw new ClassCastException();
    }

    public final void c(C1029d dVar) {
        if (dVar.f12267h == 0) {
            dVar.f12267h = 80;
        }
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11654g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
