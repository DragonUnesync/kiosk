package com.google.android.material.timepicker;

import B.C0003d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import f3.C0899a;
import g3.C0958a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import v0.C1510H;

class ClockHandView extends View {

    /* renamed from: U  reason: collision with root package name */
    public final ValueAnimator f9486U = new ValueAnimator();

    /* renamed from: V  reason: collision with root package name */
    public boolean f9487V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f9488W = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    public final int f9489a0;

    /* renamed from: b0  reason: collision with root package name */
    public final float f9490b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Paint f9491c0;

    /* renamed from: d0  reason: collision with root package name */
    public final RectF f9492d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f9493e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f9494f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f9495g0;

    /* renamed from: h0  reason: collision with root package name */
    public double f9496h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9497i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9498j0;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969340);
        Paint paint = new Paint();
        this.f9491c0 = paint;
        this.f9492d0 = new RectF();
        this.f9498j0 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.e, 2130969340, 2132018325);
        C0003d.I(context, 2130969391, 200);
        C0003d.J(context, 2130969407, C0958a.f12006b);
        this.f9497i0 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9489a0 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f9493e0 = resources.getDimensionPixelSize(2131165779);
        this.f9490b0 = (float) resources.getDimensionPixelSize(2131165777);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = C1510H.f15874a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        if (i == 2) {
            return Math.round(((float) this.f9497i0) * 0.66f);
        }
        return this.f9497i0;
    }

    public final void b(float f8) {
        ValueAnimator valueAnimator = this.f9486U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = f8 % 360.0f;
        this.f9494f0 = f9;
        this.f9496h0 = Math.toRadians((double) (f9 - 90.0f));
        float a8 = (float) a(this.f9498j0);
        float cos = (((float) Math.cos(this.f9496h0)) * a8) + ((float) (getWidth() / 2));
        float sin = (a8 * ((float) Math.sin(this.f9496h0))) + ((float) (getHeight() / 2));
        float f10 = (float) this.f9489a0;
        this.f9492d0.set(cos - f10, sin - f10, cos + f10, sin + f10);
        Iterator it = this.f9488W.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f9474C0 - f9) > 0.001f) {
                clockFaceView.f9474C0 = f9;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a8 = a(this.f9498j0);
        float f8 = (float) width;
        float f9 = (float) a8;
        float f10 = (float) height;
        Paint paint = this.f9491c0;
        paint.setStrokeWidth(0.0f);
        int i = this.f9489a0;
        canvas.drawCircle((((float) Math.cos(this.f9496h0)) * f9) + f8, (f9 * ((float) Math.sin(this.f9496h0))) + f10, (float) i, paint);
        double sin = Math.sin(this.f9496h0);
        double d8 = (double) ((float) (a8 - i));
        paint.setStrokeWidth((float) this.f9493e0);
        canvas.drawLine(f8, f10, (float) (width + ((int) (Math.cos(this.f9496h0) * d8))), (float) (height + ((int) (d8 * sin))), paint);
        canvas.drawCircle(f8, f10, this.f9490b0, paint);
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        if (!this.f9486U.isRunning()) {
            b(this.f9494f0);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z6;
        boolean z8;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        boolean z9 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z6 = this.f9495g0;
                if (this.f9487V) {
                    if (((float) Math.hypot((double) (x8 - ((float) (getWidth() / 2))), (double) (y8 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.f9498j0 = i;
                }
            } else {
                z6 = false;
            }
            z = false;
        } else {
            this.f9495g0 = false;
            z6 = false;
            z = true;
        }
        boolean z10 = this.f9495g0;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y8 - ((float) (getHeight() / 2))), (double) (x8 - ((float) (getWidth() / 2)))));
        int i8 = degrees + 90;
        if (i8 < 0) {
            i8 = degrees + 450;
        }
        float f8 = (float) i8;
        if (this.f9494f0 != f8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z || !z8) {
            if (z8 || z6) {
                b(f8);
            }
            this.f9495g0 = z10 | z9;
            return true;
        }
        z9 = true;
        this.f9495g0 = z10 | z9;
        return true;
    }
}
