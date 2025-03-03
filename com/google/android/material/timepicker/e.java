package com.google.android.material.timepicker;

import U.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import f3.C0899a;
import java.util.WeakHashMap;
import v0.C1510H;
import z3.g;
import z3.h;
import z3.j;

public abstract class e extends ConstraintLayout {

    /* renamed from: m0  reason: collision with root package name */
    public final p f9504m0 = new p(15, (Object) this);

    /* renamed from: n0  reason: collision with root package name */
    public int f9505n0;

    /* renamed from: o0  reason: collision with root package name */
    public final g f9506o0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969340);
        LayoutInflater.from(context).inflate(2131558514, this);
        g gVar = new g();
        this.f9506o0 = gVar;
        h hVar = new h(0.5f);
        j e = gVar.f16469U.f16454a.e();
        e.e = hVar;
        e.f16495f = hVar;
        e.f16496g = hVar;
        e.f16497h = hVar;
        gVar.setShapeAppearanceModel(e.a());
        this.f9506o0.j(ColorStateList.valueOf(-1));
        g gVar2 = this.f9506o0;
        WeakHashMap weakHashMap = C1510H.f15874a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11666t, 2130969340, 0);
        this.f9505n0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.f9504m0;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    public abstract void f();

    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.f9504m0;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    public final void setBackgroundColor(int i) {
        this.f9506o0.j(ColorStateList.valueOf(i));
    }
}
