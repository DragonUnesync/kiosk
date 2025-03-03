package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.C1026a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v0.C1510H;

@Deprecated
public abstract class ExpandableBehavior extends C1026a {
    public ExpandableBehavior() {
    }

    public abstract void b(View view);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (!view.isLaidOut()) {
            ArrayList j7 = coordinatorLayout.j(view);
            int size = j7.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view2 = (View) j7.get(i8);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
