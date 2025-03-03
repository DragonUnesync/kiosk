package com.google.android.material.behavior;

import B.C0003d;
import C3.m;
import Q0.g;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g3.C0958a;
import h0.C1026a;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends C1026a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f9149a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public int f9150b;

    /* renamed from: c  reason: collision with root package name */
    public int f9151c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f9152d;
    public TimeInterpolator e;

    /* renamed from: f  reason: collision with root package name */
    public int f9153f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f9154g = 2;

    /* renamed from: h  reason: collision with root package name */
    public ViewPropertyAnimator f9155h;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f9153f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9150b = C0003d.I(view.getContext(), 2130969391, 225);
        this.f9151c = C0003d.I(view.getContext(), 2130969397, 175);
        this.f9152d = C0003d.J(view.getContext(), 2130969407, C0958a.f12008d);
        this.e = C0003d.J(view.getContext(), 2130969407, C0958a.f12007c);
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f9149a;
        if (i > 0) {
            if (this.f9154g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f9155h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f9154g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    int i10 = this.f9153f;
                    this.f9155h = view.animate().translationY((float) i10).setInterpolator(this.e).setDuration((long) this.f9151c).setListener(new m(3, this));
                    return;
                }
                throw g.k(it);
            }
        } else if (i < 0 && this.f9154g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f9155h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f9154g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f9155h = view.animate().translationY((float) 0).setInterpolator(this.f9152d).setDuration((long) this.f9150b).setListener(new m(3, this));
                return;
            }
            throw g.k(it2);
        }
    }

    public boolean o(View view, int i, int i8) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
