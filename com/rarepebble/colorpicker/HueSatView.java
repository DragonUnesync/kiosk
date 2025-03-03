package com.rarepebble.colorpicker;

import D2.o;
import I5.a;
import I5.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;

public class HueSatView extends d implements a {

    /* renamed from: h0  reason: collision with root package name */
    public static Bitmap f9538h0;

    /* renamed from: V  reason: collision with root package name */
    public final Paint f9539V;

    /* renamed from: W  reason: collision with root package name */
    public final Paint f9540W;

    /* renamed from: a0  reason: collision with root package name */
    public final Path f9541a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Path f9542b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Rect f9543c0 = new Rect();

    /* renamed from: d0  reason: collision with root package name */
    public int f9544d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f9545e0;

    /* renamed from: f0  reason: collision with root package name */
    public final PointF f9546f0 = new PointF();

    /* renamed from: g0  reason: collision with root package name */
    public final o f9547g0 = new o();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HueSatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9539V = com.bumptech.glide.d.l(context);
        Paint l8 = com.bumptech.glide.d.l(context);
        this.f9540W = l8;
        l8.setColor(-16777216);
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, TypedValue.applyDimension(1, 7.0f, context.getResources().getDisplayMetrics()), Path.Direction.CW);
        this.f9541a0 = path;
        this.f9542b0 = new Path();
        if (f9538h0 == null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int min = Math.min(128, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 2);
            int[] iArr = new int[(min * min)];
            float[] fArr = {0.0f, 0.0f, 1.0f};
            for (int i = 0; i < min; i++) {
                int i8 = 0;
                while (i8 < min) {
                    int i9 = (i * min) + i8;
                    float f8 = (float) min;
                    double d8 = (double) (f8 - 1.0f);
                    int i10 = i8;
                    double d9 = (d8 - ((double) ((float) i8))) / d8;
                    double d10 = (d8 - ((double) ((float) i))) / d8;
                    float f9 = (float) ((d9 * d9) + (d10 * d10));
                    if (f9 <= (2.0f / f8) + 1.0f) {
                        fArr[0] = (float) ((Math.atan2(d10, d9) * 360.0d) / 1.5707963267948966d);
                        fArr[1] = f9;
                        iArr[i9] = Color.HSVToColor(255, fArr);
                    }
                    i8 = i10 + 1;
                }
            }
            f9538h0 = Bitmap.createBitmap(iArr, min, min, Bitmap.Config.ARGB_8888);
        }
    }

    public final void a(o oVar) {
        int i;
        PointF pointF = this.f9546f0;
        float[] fArr = (float[]) oVar.f1138W;
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = ((float) this.f9544d0) - 1.0f;
        double sqrt = Math.sqrt((double) f9) * ((double) f10);
        double d8 = (((double) (f8 / 360.0f)) * 3.141592653589793d) / 2.0d;
        pointF.set(f10 - ((float) (Math.cos(d8) * sqrt)), f10 - ((float) (Math.sin(d8) * sqrt)));
        Paint paint = this.f9540W;
        if (((double) this.f9547g0.h(1.0f)) > 0.5d) {
            i = -16777216;
        } else {
            i = -1;
        }
        paint.setColor(i);
        invalidate();
    }

    public final boolean b(PointF pointF, float f8, float f9, boolean z) {
        boolean z6;
        float min = Math.min(f8, (float) this.f9544d0);
        float min2 = Math.min(f9, (float) this.f9545e0);
        float f10 = ((float) this.f9544d0) - min;
        float f11 = ((float) this.f9545e0) - min2;
        float sqrt = (float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)));
        float f12 = (float) this.f9544d0;
        if (sqrt > f12) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 || !z) {
            if (z6) {
                min = f12 - ((f10 * f12) / sqrt);
                min2 = f12 - ((f11 * f12) / sqrt);
            }
            pointF.set(min, min2);
        }
        return !z6;
    }

    public final void c() {
        int i;
        PointF pointF = this.f9546f0;
        float f8 = pointF.x;
        float f9 = pointF.y;
        double d8 = (double) (((float) this.f9544d0) - 1.0f);
        double d9 = (d8 - ((double) f9)) / d8;
        float f10 = pointF.x;
        float f11 = pointF.y;
        double d10 = (double) (((float) this.f9544d0) - 1.0f);
        double d11 = (d10 - ((double) f10)) / d10;
        double d12 = (d10 - ((double) f11)) / d10;
        o oVar = this.f9547g0;
        float[] fArr = (float[]) oVar.f1138W;
        fArr[0] = (float) ((Math.atan2(d9, (d8 - ((double) f8)) / d8) * 360.0d) / 1.5707963267948966d);
        fArr[1] = (float) ((d12 * d12) + (d11 * d11));
        oVar.l(this);
        Paint paint = this.f9540W;
        if (((double) this.f9547g0.h(1.0f)) > 0.5d) {
            i = -16777216;
        } else {
            i = -1;
        }
        paint.setColor(i);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Path path = this.f9542b0;
        canvas.clipPath(path);
        canvas.drawBitmap(f9538h0, (Rect) null, this.f9543c0, (Paint) null);
        PointF pointF = this.f9546f0;
        canvas.translate(pointF.x, pointF.y);
        canvas.drawPath(this.f9541a0, this.f9540W);
        canvas.restore();
        canvas.drawPath(path, this.f9539V);
    }

    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        this.f9544d0 = i;
        this.f9545e0 = i8;
        this.f9543c0.set(0, 0, i, i8);
        float strokeWidth = this.f9539V.getStrokeWidth() / 2.0f;
        Path path = this.f9542b0;
        int i11 = (int) (((float) i) - strokeWidth);
        int i12 = (int) (((float) i8) - strokeWidth);
        path.reset();
        float f8 = (float) i11;
        path.moveTo(f8, strokeWidth);
        float f9 = (float) i12;
        path.lineTo(f8, f9);
        path.lineTo(strokeWidth, f9);
        path.addArc(new RectF(strokeWidth, strokeWidth, (float) (i11 * 2), (float) (i12 * 2)), 180.0f, 270.0f);
        path.close();
        a(this.f9547g0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        PointF pointF = this.f9546f0;
        if (actionMasked == 0) {
            boolean b8 = b(pointF, motionEvent.getX(), motionEvent.getY(), true);
            if (b8) {
                c();
            }
            return b8;
        } else if (actionMasked != 2) {
            return super.onTouchEvent(motionEvent);
        } else {
            b(pointF, motionEvent.getX(), motionEvent.getY(), false);
            c();
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
    }
}
