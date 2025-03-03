package com.google.android.material.snackbar;

import B.C0003d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import g3.C0958a;
import java.util.WeakHashMap;
import v0.C1510H;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: U  reason: collision with root package name */
    public TextView f9390U;

    /* renamed from: V  reason: collision with root package name */
    public Button f9391V;

    /* renamed from: W  reason: collision with root package name */
    public final TimeInterpolator f9392W;

    /* renamed from: a0  reason: collision with root package name */
    public int f9393a0;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9392W = C0003d.J(context, 2130969407, C0958a.f12006b);
    }

    public final boolean a(int i, int i8, int i9) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f9390U.getPaddingTop() == i8 && this.f9390U.getPaddingBottom() == i9) {
            return z;
        }
        TextView textView = this.f9390U;
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i8, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i8, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f9391V;
    }

    public TextView getMessageView() {
        return this.f9390U;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9390U = (TextView) findViewById(2131362492);
        this.f9391V = (Button) findViewById(2131362491);
    }

    public final void onMeasure(int i, int i8) {
        boolean z;
        super.onMeasure(i, i8);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165324);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165323);
            Layout layout = this.f9390U.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                z = false;
            } else {
                z = true;
            }
            if (!z || this.f9393a0 <= 0 || this.f9391V.getMeasuredWidth() <= this.f9393a0) {
                if (!z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i, i8);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f9393a0 = i;
    }
}
