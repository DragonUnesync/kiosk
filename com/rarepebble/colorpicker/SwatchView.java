package com.rarepebble.colorpicker;

import D2.o;
import I5.a;
import I5.b;
import I5.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public class SwatchView extends d implements a {

    /* renamed from: V  reason: collision with root package name */
    public final Paint f9548V;

    /* renamed from: W  reason: collision with root package name */
    public final Path f9549W;

    /* renamed from: a0  reason: collision with root package name */
    public final Paint f9550a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Path f9551b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Path f9552c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Paint f9553d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Paint f9554e0;

    /* renamed from: f0  reason: collision with root package name */
    public final float f9555f0;

    public SwatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            this.f9555f0 = context.getTheme().obtainStyledAttributes(attributeSet, b.f2317a, 0, 0).getDimension(0, 0.0f);
        } else {
            this.f9555f0 = 0.0f;
        }
        this.f9548V = com.bumptech.glide.d.l(context);
        this.f9550a0 = com.bumptech.glide.d.k(context);
        this.f9553d0 = new Paint();
        this.f9554e0 = new Paint();
        this.f9549W = new Path();
        this.f9551b0 = new Path();
        this.f9552c0 = new Path();
    }

    public final void a(o oVar) {
        this.f9554e0.setColor(Color.HSVToColor(oVar.f1137V, (float[]) oVar.f1138W));
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f9549W;
        canvas.drawPath(path, this.f9550a0);
        canvas.drawPath(this.f9551b0, this.f9553d0);
        canvas.drawPath(this.f9552c0, this.f9554e0);
        canvas.drawPath(path, this.f9548V);
    }

    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        float strokeWidth = this.f9548V.getStrokeWidth() / 2.0f;
        float min = (float) Math.min(i, i8);
        float f8 = this.f9555f0;
        float f9 = (f8 * 2.0f) + min;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (min * min)));
        float f10 = min - sqrt;
        float degrees = (float) Math.toDegrees(Math.atan2((double) sqrt, (double) min));
        float f11 = 270.0f - degrees;
        float f12 = degrees - 45.0f;
        float f13 = 90.0f - degrees;
        Path path = this.f9549W;
        path.reset();
        path.moveTo(strokeWidth, strokeWidth);
        float f14 = f8 - strokeWidth;
        float f15 = -f14;
        RectF rectF = new RectF(f15, f15, f14, f14);
        rectF.offset(f10, strokeWidth);
        path.arcTo(rectF, 0.0f, f13);
        float f16 = f8 + min;
        float f17 = -f16;
        RectF rectF2 = new RectF(f17, f17, f16, f16);
        rectF2.offset(min, min);
        path.arcTo(rectF2, f11, 2.0f * f12);
        float f18 = 90.0f - f13;
        RectF rectF3 = new RectF(f15, f15, f14, f14);
        rectF3.offset(strokeWidth, f10);
        path.arcTo(rectF3, f18, f13);
        path.lineTo(strokeWidth, strokeWidth);
        path.close();
        Path path2 = this.f9551b0;
        path2.reset();
        path2.moveTo(strokeWidth, strokeWidth);
        RectF rectF4 = new RectF(f17, f17, f16, f16);
        rectF4.offset(min, min);
        path2.arcTo(rectF4, 225.0f, f12);
        RectF rectF5 = new RectF(f15, f15, f14, f14);
        rectF5.offset(strokeWidth, f10);
        path2.arcTo(rectF5, f18, f13);
        path2.lineTo(strokeWidth, strokeWidth);
        path2.close();
        Path path3 = this.f9552c0;
        path3.reset();
        path3.moveTo(strokeWidth, strokeWidth);
        RectF rectF6 = new RectF(f15, f15, f14, f14);
        rectF6.offset(f10, strokeWidth);
        path3.arcTo(rectF6, 0.0f, f13);
        RectF rectF7 = new RectF(f17, f17, f16, f16);
        rectF7.offset(min, min);
        path3.arcTo(rectF7, f11, f12);
        path3.lineTo(strokeWidth, strokeWidth);
        path3.close();
    }

    public void setOriginalColor(int i) {
        this.f9553d0.setColor(i);
        invalidate();
    }
}
