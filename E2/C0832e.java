package e2;

import I0.a;
import Q0.g;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: e2.e  reason: case insensitive filesystem */
public final class C0832e extends Drawable implements Animatable {

    /* renamed from: a0  reason: collision with root package name */
    public static final LinearInterpolator f11188a0 = new LinearInterpolator();

    /* renamed from: b0  reason: collision with root package name */
    public static final a f11189b0 = new a(1);

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f11190c0 = {-16777216};

    /* renamed from: U  reason: collision with root package name */
    public final C0831d f11191U;

    /* renamed from: V  reason: collision with root package name */
    public float f11192V;

    /* renamed from: W  reason: collision with root package name */
    public final Resources f11193W;

    /* renamed from: X  reason: collision with root package name */
    public final ValueAnimator f11194X;

    /* renamed from: Y  reason: collision with root package name */
    public float f11195Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f11196Z;

    public C0832e(Context context) {
        context.getClass();
        this.f11193W = context.getResources();
        C0831d dVar = new C0831d();
        this.f11191U = dVar;
        dVar.i = f11190c0;
        dVar.a(0);
        dVar.f11175h = 2.5f;
        dVar.f11170b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0829b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f11188a0);
        ofFloat.addListener(new C0830c(this, dVar));
        this.f11194X = ofFloat;
    }

    public static void d(float f8, C0831d dVar) {
        if (f8 > 0.75f) {
            float f9 = (f8 - 0.75f) / 0.25f;
            int[] iArr = dVar.i;
            int i = dVar.f11176j;
            int i8 = iArr[i];
            int i9 = iArr[(i + 1) % iArr.length];
            int i10 = (i8 >> 24) & 255;
            int i11 = (i8 >> 16) & 255;
            int i12 = (i8 >> 8) & 255;
            int i13 = i8 & 255;
            dVar.f11187u = ((i10 + ((int) (((float) (((i9 >> 24) & 255) - i10)) * f9))) << 24) | ((i11 + ((int) (((float) (((i9 >> 16) & 255) - i11)) * f9))) << 16) | ((i12 + ((int) (((float) (((i9 >> 8) & 255) - i12)) * f9))) << 8) | (i13 + ((int) (f9 * ((float) ((i9 & 255) - i13)))));
            return;
        }
        dVar.f11187u = dVar.i[dVar.f11176j];
    }

    public final void a(float f8, C0831d dVar, boolean z) {
        float f9;
        float f10;
        if (this.f11196Z) {
            d(f8, dVar);
            float floor = (float) (Math.floor((double) (dVar.f11179m / 0.8f)) + 1.0d);
            float f11 = dVar.f11177k;
            float f12 = dVar.f11178l;
            dVar.e = (((f12 - 0.01f) - f11) * f8) + f11;
            dVar.f11173f = f12;
            float f13 = dVar.f11179m;
            dVar.f11174g = g.j(floor, f13, f8, f13);
        } else if (f8 != 1.0f || z) {
            float f14 = dVar.f11179m;
            a aVar = f11189b0;
            if (f8 < 0.5f) {
                f9 = dVar.f11177k;
                f10 = (aVar.getInterpolation(f8 / 0.5f) * 0.79f) + 0.01f + f9;
            } else {
                float f15 = dVar.f11177k + 0.79f;
                float f16 = f15;
                f9 = f15 - (((1.0f - aVar.getInterpolation((f8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f16;
            }
            dVar.e = f9;
            dVar.f11173f = f10;
            dVar.f11174g = (0.20999998f * f8) + f14;
            this.f11192V = (f8 + this.f11195Y) * 216.0f;
        }
    }

    public final void b(float f8, float f9, float f10, float f11) {
        float f12 = this.f11193W.getDisplayMetrics().density;
        float f13 = f9 * f12;
        C0831d dVar = this.f11191U;
        dVar.f11175h = f13;
        dVar.f11170b.setStrokeWidth(f13);
        dVar.f11183q = f8 * f12;
        dVar.a(0);
        dVar.f11184r = (int) (f10 * f12);
        dVar.f11185s = (int) (f11 * f12);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f11192V, bounds.exactCenterX(), bounds.exactCenterY());
        C0831d dVar = this.f11191U;
        RectF rectF = dVar.f11169a;
        float f8 = dVar.f11183q;
        float f9 = (dVar.f11175h / 2.0f) + f8;
        if (f8 <= 0.0f) {
            f9 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) dVar.f11184r) * dVar.f11182p) / 2.0f, dVar.f11175h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f9, ((float) bounds.centerY()) - f9, ((float) bounds.centerX()) + f9, ((float) bounds.centerY()) + f9);
        float f10 = dVar.e;
        float f11 = dVar.f11174g;
        float f12 = (f10 + f11) * 360.0f;
        float f13 = ((dVar.f11173f + f11) * 360.0f) - f12;
        Paint paint = dVar.f11170b;
        paint.setColor(dVar.f11187u);
        paint.setAlpha(dVar.f11186t);
        float f14 = dVar.f11175h / 2.0f;
        rectF.inset(f14, f14);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f11172d);
        float f15 = -f14;
        rectF.inset(f15, f15);
        canvas.drawArc(rectF, f12, f13, false, paint);
        if (dVar.f11180n) {
            Path path = dVar.f11181o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f11181o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            dVar.f11181o.moveTo(0.0f, 0.0f);
            dVar.f11181o.lineTo(((float) dVar.f11184r) * dVar.f11182p, 0.0f);
            Path path3 = dVar.f11181o;
            float f16 = dVar.f11182p;
            path3.lineTo((((float) dVar.f11184r) * f16) / 2.0f, ((float) dVar.f11185s) * f16);
            dVar.f11181o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) dVar.f11184r) * dVar.f11182p) / 2.0f), (dVar.f11175h / 2.0f) + rectF.centerY());
            dVar.f11181o.close();
            Paint paint2 = dVar.f11171c;
            paint2.setColor(dVar.f11187u);
            paint2.setAlpha(dVar.f11186t);
            canvas.save();
            canvas.rotate(f12 + f13, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f11181o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f11191U.f11186t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f11194X.isRunning();
    }

    public final void setAlpha(int i) {
        this.f11191U.f11186t = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11191U.f11170b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.f11194X.cancel();
        C0831d dVar = this.f11191U;
        float f8 = dVar.e;
        dVar.f11177k = f8;
        float f9 = dVar.f11173f;
        dVar.f11178l = f9;
        dVar.f11179m = dVar.f11174g;
        if (f9 != f8) {
            this.f11196Z = true;
            this.f11194X.setDuration(666);
            this.f11194X.start();
            return;
        }
        dVar.a(0);
        dVar.f11177k = 0.0f;
        dVar.f11178l = 0.0f;
        dVar.f11179m = 0.0f;
        dVar.e = 0.0f;
        dVar.f11173f = 0.0f;
        dVar.f11174g = 0.0f;
        this.f11194X.setDuration(1332);
        this.f11194X.start();
    }

    public final void stop() {
        this.f11194X.cancel();
        this.f11192V = 0.0f;
        C0831d dVar = this.f11191U;
        if (dVar.f11180n) {
            dVar.f11180n = false;
        }
        dVar.a(0);
        dVar.f11177k = 0.0f;
        dVar.f11178l = 0.0f;
        dVar.f11179m = 0.0f;
        dVar.e = 0.0f;
        dVar.f11173f = 0.0f;
        dVar.f11174g = 0.0f;
        invalidateSelf();
    }
}
