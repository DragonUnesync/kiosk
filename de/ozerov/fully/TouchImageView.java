package de.ozerov.fully;

import V.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
public class TouchImageView extends ImageView {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f10372y0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public float f10373U;

    /* renamed from: V  reason: collision with root package name */
    public final Matrix f10374V;

    /* renamed from: W  reason: collision with root package name */
    public final Matrix f10375W;

    /* renamed from: a0  reason: collision with root package name */
    public C0751o4 f10376a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f10377b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f10378c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f10379d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f10380e0;

    /* renamed from: f0  reason: collision with root package name */
    public float[] f10381f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Context f10382g0;

    /* renamed from: h0  reason: collision with root package name */
    public C0727k4 f10383h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView.ScaleType f10384i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f10385j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f10386k0;

    /* renamed from: l0  reason: collision with root package name */
    public C0757p4 f10387l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f10388m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f10389n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f10390o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f10391q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f10392r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f10393s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f10394t0;

    /* renamed from: u0  reason: collision with root package name */
    public final ScaleGestureDetector f10395u0;

    /* renamed from: v0  reason: collision with root package name */
    public final GestureDetector f10396v0;

    /* renamed from: w0  reason: collision with root package name */
    public GestureDetector.OnDoubleTapListener f10397w0 = null;

    /* renamed from: x0  reason: collision with root package name */
    public View.OnTouchListener f10398x0 = null;

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setClickable(true);
        this.f10382g0 = context;
        this.f10395u0 = new ScaleGestureDetector(context, new C0745n4(this));
        this.f10396v0 = new GestureDetector(context, new a(2, this));
        this.f10374V = new Matrix();
        this.f10375W = new Matrix();
        this.f10381f0 = new float[9];
        this.f10373U = 1.0f;
        if (this.f10384i0 == null) {
            this.f10384i0 = ImageView.ScaleType.FIT_CENTER;
        }
        this.f10377b0 = 1.0f;
        this.f10378c0 = 3.0f;
        this.f10379d0 = 0.75f;
        this.f10380e0 = 3.75f;
        setImageMatrix(this.f10374V);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(C0751o4.f10870U);
        this.f10386k0 = false;
        super.setOnTouchListener(new C0739m4(this));
    }

    public static PointF d(TouchImageView touchImageView, float f8, float f9) {
        touchImageView.f10374V.getValues(touchImageView.f10381f0);
        float intrinsicWidth = f8 / ((float) touchImageView.getDrawable().getIntrinsicWidth());
        float intrinsicHeight = f9 / ((float) touchImageView.getDrawable().getIntrinsicHeight());
        return new PointF((touchImageView.getImageWidth() * intrinsicWidth) + touchImageView.f10381f0[2], (touchImageView.getImageHeight() * intrinsicHeight) + touchImageView.f10381f0[5]);
    }

    /* access modifiers changed from: private */
    public float getImageHeight() {
        return this.f10392r0 * this.f10373U;
    }

    /* access modifiers changed from: private */
    public float getImageWidth() {
        return this.f10391q0 * this.f10373U;
    }

    public static float h(float f8, float f9, float f10) {
        float f11;
        float f12;
        if (f10 <= f9) {
            f11 = f9 - f10;
            f12 = 0.0f;
        } else {
            f12 = f9 - f10;
            f11 = 0.0f;
        }
        if (f8 < f12) {
            return (-f8) + f12;
        }
        if (f8 > f11) {
            return (-f8) + f11;
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    public void setState(C0751o4 o4Var) {
        this.f10376a0 = o4Var;
    }

    public final boolean canScrollHorizontally(int i) {
        this.f10374V.getValues(this.f10381f0);
        float f8 = this.f10381f0[2];
        if (getImageWidth() < ((float) this.f10388m0)) {
            return false;
        }
        if (f8 >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f8) + ((float) this.f10388m0) + 1.0f < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.f10374V != null && this.f10375W != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f8 = (float) intrinsicWidth;
            float f9 = ((float) this.f10388m0) / f8;
            float f10 = (float) intrinsicHeight;
            float f11 = ((float) this.f10389n0) / f10;
            int i = C0715i4.f10707a[this.f10384i0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f9 = Math.min(1.0f, Math.min(f9, f11));
                        f11 = f9;
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
                        }
                    }
                    f9 = Math.min(f9, f11);
                } else {
                    f9 = Math.max(f9, f11);
                }
                f11 = f9;
            } else {
                f9 = 1.0f;
                f11 = 1.0f;
            }
            int i8 = this.f10388m0;
            float f12 = ((float) i8) - (f9 * f8);
            int i9 = this.f10389n0;
            float f13 = ((float) i9) - (f11 * f10);
            this.f10391q0 = ((float) i8) - f12;
            this.f10392r0 = ((float) i9) - f13;
            if (this.f10373U == 1.0f && !this.f10385j0) {
                this.f10374V.setScale(f9, f11);
                this.f10374V.postTranslate(f12 / 2.0f, f13 / 2.0f);
                this.f10373U = 1.0f;
            } else {
                if (this.f10393s0 == 0.0f || this.f10394t0 == 0.0f) {
                    i();
                }
                this.f10375W.getValues(this.f10381f0);
                float[] fArr = this.f10381f0;
                float f14 = this.f10391q0 / f8;
                float f15 = this.f10373U;
                fArr[0] = f14 * f15;
                fArr[4] = (this.f10392r0 / f10) * f15;
                float f16 = fArr[2];
                float f17 = fArr[5];
                m(2, f16, this.f10393s0 * f15, getImageWidth(), this.f10390o0, this.f10388m0, intrinsicWidth);
                m(5, f17, this.f10394t0 * this.f10373U, getImageHeight(), this.p0, this.f10389n0, intrinsicHeight);
                this.f10374V.setValues(this.f10381f0);
            }
            g();
            setImageMatrix(this.f10374V);
        }
    }

    public final void f() {
        g();
        this.f10374V.getValues(this.f10381f0);
        float imageWidth = getImageWidth();
        int i = this.f10388m0;
        if (imageWidth < ((float) i)) {
            this.f10381f0[2] = (((float) i) - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        int i8 = this.f10389n0;
        if (imageHeight < ((float) i8)) {
            this.f10381f0[5] = (((float) i8) - getImageHeight()) / 2.0f;
        }
        this.f10374V.setValues(this.f10381f0);
    }

    public final void g() {
        this.f10374V.getValues(this.f10381f0);
        float[] fArr = this.f10381f0;
        float f8 = fArr[2];
        float f9 = fArr[5];
        float h5 = h(f8, (float) this.f10388m0, getImageWidth());
        float h8 = h(f9, (float) this.f10389n0, getImageHeight());
        if (h5 != 0.0f || h8 != 0.0f) {
            this.f10374V.postTranslate(h5, h8);
        }
    }

    public float getCurrentZoom() {
        return this.f10373U;
    }

    public float getMaxZoom() {
        return this.f10378c0;
    }

    public float getMinZoom() {
        return this.f10377b0;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f10384i0;
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF l8 = l((float) (this.f10388m0 / 2), (float) (this.f10389n0 / 2), true);
        l8.x /= (float) intrinsicWidth;
        l8.y /= (float) intrinsicHeight;
        return l8;
    }

    public RectF getZoomedRect() {
        if (this.f10384i0 != ImageView.ScaleType.FIT_XY) {
            PointF l8 = l(0.0f, 0.0f, true);
            PointF l9 = l((float) this.f10388m0, (float) this.f10389n0, true);
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            return new RectF(l8.x / intrinsicWidth, l8.y / intrinsicHeight, l9.x / intrinsicWidth, l9.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public final void i() {
        Matrix matrix = this.f10374V;
        if (matrix != null && this.f10389n0 != 0 && this.f10388m0 != 0) {
            matrix.getValues(this.f10381f0);
            this.f10375W.setValues(this.f10381f0);
            this.f10394t0 = this.f10392r0;
            this.f10393s0 = this.f10391q0;
            this.p0 = this.f10389n0;
            this.f10390o0 = this.f10388m0;
        }
    }

    public final void j(double d8, float f8, float f9, boolean z) {
        float f10;
        float f11;
        if (z) {
            f10 = this.f10379d0;
            f11 = this.f10380e0;
        } else {
            f10 = this.f10377b0;
            f11 = this.f10378c0;
        }
        float f12 = this.f10373U;
        float f13 = (float) (((double) f12) * d8);
        this.f10373U = f13;
        if (f13 > f11) {
            this.f10373U = f11;
            d8 = (double) (f11 / f12);
        } else if (f13 < f10) {
            this.f10373U = f10;
            d8 = (double) (f10 / f12);
        }
        float f14 = (float) d8;
        this.f10374V.postScale(f14, f14, f8, f9);
        f();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [de.ozerov.fully.p4, java.lang.Object] */
    public final void k(float f8, float f9, float f10, ImageView.ScaleType scaleType) {
        if (!this.f10386k0) {
            ? obj = new Object();
            obj.f10884a = f8;
            obj.f10885b = f9;
            obj.f10886c = f10;
            obj.f10887d = scaleType;
            this.f10387l0 = obj;
            return;
        }
        if (scaleType != this.f10384i0) {
            setScaleType(scaleType);
        }
        this.f10373U = 1.0f;
        e();
        j((double) f8, (float) (this.f10388m0 / 2), (float) (this.f10389n0 / 2), true);
        this.f10374V.getValues(this.f10381f0);
        this.f10381f0[2] = -((f9 * getImageWidth()) - (((float) this.f10388m0) * 0.5f));
        this.f10381f0[5] = -((f10 * getImageHeight()) - (((float) this.f10389n0) * 0.5f));
        this.f10374V.setValues(this.f10381f0);
        g();
        setImageMatrix(this.f10374V);
    }

    public final PointF l(float f8, float f9, boolean z) {
        this.f10374V.getValues(this.f10381f0);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f10381f0;
        float f10 = fArr[2];
        float f11 = fArr[5];
        float imageWidth = ((f8 - f10) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f9 - f11) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    public final void m(int i, float f8, float f9, float f10, int i8, int i9, int i10) {
        float f11 = (float) i9;
        if (f10 < f11) {
            float[] fArr = this.f10381f0;
            fArr[i] = (f11 - (((float) i10) * fArr[0])) * 0.5f;
        } else if (f8 > 0.0f) {
            this.f10381f0[i] = -((f10 - f11) * 0.5f);
        } else {
            this.f10381f0[i] = -(((((((float) i8) * 0.5f) + Math.abs(f8)) / f9) * f10) - (f11 * 0.5f));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i();
    }

    public final void onDraw(Canvas canvas) {
        this.f10386k0 = true;
        this.f10385j0 = true;
        C0757p4 p4Var = this.f10387l0;
        if (p4Var != null) {
            k(p4Var.f10884a, p4Var.f10885b, p4Var.f10886c, p4Var.f10887d);
            this.f10387l0 = null;
        }
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
            Context context = this.f10382g0;
            n2.a.b1(context, "Failed to draw image due to " + e.getMessage());
        }
    }

    public final void onMeasure(int i, int i8) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE) {
            intrinsicWidth = Math.min(intrinsicWidth, size);
        } else if (mode != 0) {
            intrinsicWidth = size;
        }
        this.f10388m0 = intrinsicWidth;
        if (mode2 == Integer.MIN_VALUE) {
            intrinsicHeight = Math.min(intrinsicHeight, size2);
        } else if (mode2 != 0) {
            intrinsicHeight = size2;
        }
        this.f10389n0 = intrinsicHeight;
        setMeasuredDimension(this.f10388m0, intrinsicHeight);
        e();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f10373U = bundle.getFloat("saveScale");
            float[] floatArray = bundle.getFloatArray("matrix");
            this.f10381f0 = floatArray;
            this.f10375W.setValues(floatArray);
            this.f10394t0 = bundle.getFloat("matchViewHeight");
            this.f10393s0 = bundle.getFloat("matchViewWidth");
            this.p0 = bundle.getInt("viewHeight");
            this.f10390o0 = bundle.getInt("viewWidth");
            this.f10385j0 = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f10373U);
        bundle.putFloat("matchViewHeight", this.f10392r0);
        bundle.putFloat("matchViewWidth", this.f10391q0);
        bundle.putInt("viewWidth", this.f10388m0);
        bundle.putInt("viewHeight", this.f10389n0);
        this.f10374V.getValues(this.f10381f0);
        bundle.putFloatArray("matrix", this.f10381f0);
        bundle.putBoolean("imageRendered", this.f10385j0);
        return bundle;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        i();
        e();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        i();
        e();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        i();
        e();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i();
        e();
    }

    public void setMaxZoom(float f8) {
        this.f10378c0 = f8;
        this.f10380e0 = f8 * 1.25f;
    }

    public void setMinZoom(float f8) {
        this.f10377b0 = f8;
        this.f10379d0 = f8 * 0.75f;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f10397w0 = onDoubleTapListener;
    }

    public void setOnTouchImageViewListener(C0733l4 l4Var) {
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10398x0 = onTouchListener;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.FIT_START || scaleType == ImageView.ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        }
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.f10384i0 = scaleType;
        if (this.f10386k0) {
            setZoom(this);
        }
    }

    public void setZoom(float f8) {
        k(f8, 0.5f, 0.5f, this.f10384i0);
    }

    public void setZoom(TouchImageView touchImageView) {
        PointF scrollPosition = touchImageView.getScrollPosition();
        k(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }
}
