package com.google.android.material.behavior;

import C0.f;
import Z1.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.C1026a;
import i3.C1099a;
import java.util.WeakHashMap;
import v0.C1510H;
import w0.C1575d;

public class SwipeDismissBehavior<V extends View> extends C1026a {

    /* renamed from: a  reason: collision with root package name */
    public f f9156a;

    /* renamed from: b  reason: collision with root package name */
    public B3.f f9157b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9158c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9159d;
    public int e = 2;

    /* renamed from: f  reason: collision with root package name */
    public float f9160f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f9161g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final C1099a f9162h = new C1099a(this);

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f9158c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9158c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9158c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f9156a == null) {
            this.f9156a = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f9162h);
        }
        if (this.f9159d || !this.f9156a.p(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            C1510H.m(view, 1048576);
            C1510H.i(view, 0);
            if (r(view)) {
                C1510H.n(view, C1575d.f16184j, new c(28, (Object) this));
            }
        }
        return false;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f9156a == null) {
            return false;
        }
        if (this.f9159d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f9156a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
