package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {

    /* renamed from: U  reason: collision with root package name */
    public int f9352U = -1;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public int getBaseline() {
        return this.f9352U;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i9 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.f9352U == -1 || childAt.getBaseline() == -1) {
                    i11 = paddingTop;
                } else {
                    i11 = (this.f9352U + paddingTop) - childAt.getBaseline();
                }
                childAt.layout(i13, i11, measuredWidth + i13, measuredHeight + i11);
            }
        }
    }

    public final void onMeasure(int i, int i8) {
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i8);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i12 = Math.max(i12, baseline);
                    i13 = Math.max(i13, childAt.getMeasuredHeight() - baseline);
                }
                i10 = Math.max(i10, childAt.getMeasuredWidth());
                i9 = Math.max(i9, childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        if (i12 != -1) {
            i9 = Math.max(i9, Math.max(i13, getPaddingBottom()) + i12);
            this.f9352U = i12;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i10, getSuggestedMinimumWidth()), i, i11), View.resolveSizeAndState(Math.max(i9, getSuggestedMinimumHeight()), i8, i11 << 16));
    }
}
