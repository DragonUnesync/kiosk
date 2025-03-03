package com.google.android.material.datepicker;

import android.view.View;
import v0.C1542o;
import v0.j0;

public final class l implements C1542o {

    /* renamed from: U  reason: collision with root package name */
    public final View f9303U;

    /* renamed from: V  reason: collision with root package name */
    public int f9304V;

    /* renamed from: W  reason: collision with root package name */
    public int f9305W;

    public l(View view) {
        this.f9303U = view;
    }

    public j0 i(View view, j0 j0Var) {
        int i = j0Var.f15952a.f(7).f13317b;
        View view2 = this.f9303U;
        int i8 = this.f9304V;
        if (i8 >= 0) {
            view2.getLayoutParams().height = i8 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f9305W + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return j0Var;
    }

    public l(View view, int i, int i8) {
        this.f9304V = i;
        this.f9303U = view;
        this.f9305W = i8;
    }
}
