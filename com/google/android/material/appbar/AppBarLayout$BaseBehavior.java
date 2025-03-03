package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h3.C1078a;

public class AppBarLayout$BaseBehavior<T> extends C1078a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f9138b;

    /* renamed from: c  reason: collision with root package name */
    public int f9139c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f9140d;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public VelocityTracker f9141f;

    public AppBarLayout$BaseBehavior() {
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f9138b) {
            int i = this.f9139c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y8 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y8 - this.f9140d) > this.e) {
                this.f9140d = y8;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f9141f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f9139c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9) {
        throw new ClassCastException();
    }

    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i8, int[] iArr, int i9) {
        throw new ClassCastException();
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9, int[] iArr) {
        throw new ClassCastException();
    }

    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    public final boolean o(View view, int i, int i8) {
        throw new ClassCastException();
    }

    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x0045
            r4 = 2
            if (r0 == r4) goto L_0x002c
            r6 = 3
            if (r0 == r6) goto L_0x0049
            r6 = 6
            if (r0 == r6) goto L_0x0013
            goto L_0x0057
        L_0x0013:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            int r6 = r7.getPointerId(r2)
            r5.f9139c = r6
            float r6 = r7.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f9140d = r6
            goto L_0x0057
        L_0x002c:
            int r0 = r5.f9139c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0035
            return r3
        L_0x0035:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f9140d = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L_0x0045:
            android.view.VelocityTracker r0 = r5.f9141f
            if (r0 != 0) goto L_0x0061
        L_0x0049:
            r5.f9138b = r3
            r5.f9139c = r1
            android.view.VelocityTracker r6 = r5.f9141f
            if (r6 == 0) goto L_0x0057
            r6.recycle()
            r6 = 0
            r5.f9141f = r6
        L_0x0057:
            android.view.VelocityTracker r6 = r5.f9141f
            if (r6 == 0) goto L_0x005e
            r6.addMovement(r7)
        L_0x005e:
            boolean r6 = r5.f9138b
            return r6
        L_0x0061:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f9141f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f9141f
            int r0 = r5.f9139c
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
