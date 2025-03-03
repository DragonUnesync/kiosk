package com.google.android.material.snackbar;

import A.f;
import B3.h;
import B3.j;
import B3.q;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final f i;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(6, false);
        this.f9160f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f9161g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.e = 0;
        this.i = fVar;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar = this.i;
        fVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                q.K().h0((h) fVar.f17V);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            q.K().Y((h) fVar.f17V);
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    public final boolean r(View view) {
        this.i.getClass();
        return view instanceof j;
    }
}
