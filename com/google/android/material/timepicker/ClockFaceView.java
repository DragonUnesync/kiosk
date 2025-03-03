package com.google.android.material.timepicker;

import O7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.bumptech.glide.c;
import f0.C0879g;
import f0.C0880h;
import f0.l;
import f3.C0899a;
import j0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v0.C1510H;

class ClockFaceView extends e implements d {

    /* renamed from: A0  reason: collision with root package name */
    public final int f9472A0;

    /* renamed from: B0  reason: collision with root package name */
    public final String[] f9473B0;

    /* renamed from: C0  reason: collision with root package name */
    public float f9474C0;

    /* renamed from: D0  reason: collision with root package name */
    public final ColorStateList f9475D0;
    public final ClockHandView p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f9476q0 = new Rect();

    /* renamed from: r0  reason: collision with root package name */
    public final RectF f9477r0 = new RectF();

    /* renamed from: s0  reason: collision with root package name */
    public final Rect f9478s0 = new Rect();

    /* renamed from: t0  reason: collision with root package name */
    public final SparseArray f9479t0;

    /* renamed from: u0  reason: collision with root package name */
    public final c f9480u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int[] f9481v0;

    /* renamed from: w0  reason: collision with root package name */
    public final float[] f9482w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int f9483x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int f9484y0;

    /* renamed from: z0  reason: collision with root package name */
    public final int f9485z0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f9479t0 = sparseArray;
        this.f9482w0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11652d, 2130969340, 2132018325);
        Resources resources = getResources();
        ColorStateList j7 = c.j(context, obtainStyledAttributes, 1);
        this.f9475D0 = j7;
        LayoutInflater.from(context).inflate(2131558513, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131362233);
        this.p0 = clockHandView;
        this.f9483x0 = resources.getDimensionPixelSize(2131165778);
        int colorForState = j7.getColorForState(new int[]{16842913}, j7.getDefaultColor());
        this.f9481v0 = new int[]{colorForState, colorForState, j7.getDefaultColor()};
        clockHandView.f9488W.add(this);
        int defaultColor = f.c(context, 2131100374).getDefaultColor();
        ColorStateList j8 = c.j(context, obtainStyledAttributes, 0);
        setBackgroundColor(j8 != null ? j8.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f9480u0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f9473B0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f9473B0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f9473B0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(2131558512, this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f9473B0[i]);
                textView.setTag(2131362249, Integer.valueOf(i));
                int i8 = (i / 12) + 1;
                textView.setTag(2131362234, Integer.valueOf(i8));
                z = i8 > 1 ? true : z;
                C1510H.p(textView, this.f9480u0);
                textView.setTextColor(this.f9475D0);
            }
        }
        ClockHandView clockHandView2 = this.p0;
        if (clockHandView2.f9487V && !z) {
            clockHandView2.f9498j0 = 1;
        }
        clockHandView2.f9487V = z;
        clockHandView2.invalidate();
        this.f9484y0 = resources.getDimensionPixelSize(2131165806);
        this.f9485z0 = resources.getDimensionPixelSize(2131165807);
        this.f9472A0 = resources.getDimensionPixelSize(2131165785);
    }

    public final void f() {
        int i;
        l lVar = new l();
        lVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getId() != 2131361938 && !"skip".equals(childAt.getTag())) {
                int i9 = (Integer) childAt.getTag(2131362234);
                if (i9 == null) {
                    i9 = 1;
                }
                if (!hashMap.containsKey(i9)) {
                    hashMap.put(i9, new ArrayList());
                }
                ((List) hashMap.get(i9)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(((float) this.f9505n0) * 0.66f);
            } else {
                i = this.f9505n0;
            }
            float f8 = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                HashMap hashMap2 = lVar.f11455c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new C0879g());
                }
                C0880h hVar = ((C0879g) hashMap2.get(Integer.valueOf(id2))).f11372d;
                hVar.f11430w = 2131361938;
                hVar.f11431x = i;
                hVar.f11432y = f8;
                f8 += 360.0f / ((float) list.size());
            }
        }
        lVar.a(this);
        setConstraintSet((l) null);
        requestLayout();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f9479t0;
            if (i10 < sparseArray.size()) {
                ((TextView) sparseArray.get(i10)).setVisibility(0);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z;
        RadialGradient radialGradient;
        RectF rectF2 = this.p0.f9492d0;
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f9479t0;
            int size = sparseArray.size();
            rectF = this.f9477r0;
            rect = this.f9476q0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f8) {
                    textView = textView2;
                    f8 = height;
                }
            }
            i++;
        }
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            TextView textView3 = (TextView) sparseArray.get(i8);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f9478s0;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f9481v0, this.f9482w0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f9473B0.length, false, 1));
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        g();
    }

    public final void onMeasure(int i, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f9472A0) / Math.max(Math.max(((float) this.f9484y0) / ((float) displayMetrics.heightPixels), ((float) this.f9485z0) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, b.MAX_POW2);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
