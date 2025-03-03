package z3;

import D7.b;
import T0.W;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j$.util.Objects;
import java.util.BitSet;
import m0.C1195a;
import n0.C1232a;
import r3.c;
import s3.C1404a;
import y.C1609a;
import y3.C1633a;

public class g extends Drawable implements C1232a, u {

    /* renamed from: q0  reason: collision with root package name */
    public static final Paint f16468q0;

    /* renamed from: U  reason: collision with root package name */
    public f f16469U;

    /* renamed from: V  reason: collision with root package name */
    public final s[] f16470V;

    /* renamed from: W  reason: collision with root package name */
    public final s[] f16471W;

    /* renamed from: X  reason: collision with root package name */
    public final BitSet f16472X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f16473Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Matrix f16474Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Path f16475a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Path f16476b0;

    /* renamed from: c0  reason: collision with root package name */
    public final RectF f16477c0;

    /* renamed from: d0  reason: collision with root package name */
    public final RectF f16478d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Region f16479e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Region f16480f0;

    /* renamed from: g0  reason: collision with root package name */
    public k f16481g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Paint f16482h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Paint f16483i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1633a f16484j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1609a f16485k0;

    /* renamed from: l0  reason: collision with root package name */
    public final W f16486l0;

    /* renamed from: m0  reason: collision with root package name */
    public PorterDuffColorFilter f16487m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuffColorFilter f16488n0;

    /* renamed from: o0  reason: collision with root package name */
    public final RectF f16489o0;
    public final boolean p0;

    static {
        Paint paint = new Paint(1);
        f16468q0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f16469U;
        this.f16486l0.b(fVar.f16454a, fVar.i, rectF, this.f16485k0, path);
        if (this.f16469U.f16460h != 1.0f) {
            Matrix matrix = this.f16474Z;
            matrix.reset();
            float f8 = this.f16469U.f16460h;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f16489o0, true);
    }

    public final int b(int i) {
        float f8;
        int i8;
        f fVar = this.f16469U;
        float f9 = fVar.f16464m + 0.0f + fVar.f16463l;
        C1404a aVar = fVar.f16455b;
        if (aVar == null || !aVar.f15083a || C1195a.d(i, 255) != aVar.f15086d) {
            return i;
        }
        float f10 = aVar.e;
        if (f10 <= 0.0f || f9 <= 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = Math.min(((((float) Math.log1p((double) (f9 / f10))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i);
        int F8 = b.F(f8, C1195a.d(i, 255), aVar.f15084b);
        if (f8 > 0.0f && (i8 = aVar.f15085c) != 0) {
            F8 = C1195a.b(C1195a.d(i8, C1404a.f15082f), F8);
        }
        return C1195a.d(F8, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f16472X.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f16469U.f16466o;
        Path path = this.f16475a0;
        C1633a aVar = this.f16484j0;
        if (i != 0) {
            canvas.drawPath(path, aVar.f16386a);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            s sVar = this.f16470V[i8];
            int i9 = this.f16469U.f16465n;
            Matrix matrix = s.f16526b;
            sVar.a(matrix, aVar, i9, canvas);
            this.f16471W[i8].a(matrix, aVar, this.f16469U.f16465n, canvas);
        }
        if (this.p0) {
            double d8 = (double) 0;
            int sin = (int) (Math.sin(Math.toRadians(d8)) * ((double) this.f16469U.f16466o));
            int cos = (int) (Math.cos(Math.toRadians(d8)) * ((double) this.f16469U.f16466o));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, f16468q0);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a8 = kVar.f16505f.a(rectF) * this.f16469U.i;
            canvas.drawRoundRect(rectF, a8, a8, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void draw(Canvas canvas) {
        float f8;
        Canvas canvas2 = canvas;
        Paint paint = this.f16482h0;
        paint.setColorFilter(this.f16487m0);
        int alpha = paint.getAlpha();
        int i = this.f16469U.f16462k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f16483i0;
        paint2.setColorFilter(this.f16488n0);
        paint2.setStrokeWidth(this.f16469U.f16461j);
        int alpha2 = paint2.getAlpha();
        int i8 = this.f16469U.f16462k;
        paint2.setAlpha(((i8 + (i8 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f16473Y;
        Path path = this.f16475a0;
        if (z) {
            float f9 = 0.0f;
            if (g()) {
                f8 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f8 = 0.0f;
            }
            float f10 = -f8;
            k kVar = this.f16469U.f16454a;
            j e = kVar.e();
            c cVar = kVar.e;
            if (!(cVar instanceof h)) {
                cVar = new b(f10, cVar);
            }
            e.e = cVar;
            c cVar2 = kVar.f16505f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f10, cVar2);
            }
            e.f16495f = cVar2;
            c cVar3 = kVar.f16507h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f10, cVar3);
            }
            e.f16497h = cVar3;
            c cVar4 = kVar.f16506g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f10, cVar4);
            }
            e.f16496g = cVar4;
            k a8 = e.a();
            this.f16481g0 = a8;
            float f11 = this.f16469U.i;
            RectF rectF = this.f16478d0;
            rectF.set(f());
            if (g()) {
                f9 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f9, f9);
            this.f16486l0.b(a8, f11, rectF, (C1609a) null, this.f16476b0);
            a(f(), path);
            this.f16473Y = false;
        }
        f fVar = this.f16469U;
        fVar.getClass();
        if (fVar.f16465n > 0) {
            int i9 = Build.VERSION.SDK_INT;
            if (!this.f16469U.f16454a.d(f()) && !path.isConvex() && i9 < 29) {
                canvas.save();
                double d8 = (double) 0;
                canvas2.translate((float) ((int) (Math.sin(Math.toRadians(d8)) * ((double) this.f16469U.f16466o))), (float) ((int) (Math.cos(Math.toRadians(d8)) * ((double) this.f16469U.f16466o))));
                if (!this.p0) {
                    c(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.f16489o0;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f16469U.f16465n * 2) + ((int) rectF2.width()) + width, (this.f16469U.f16465n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f12 = (float) ((getBounds().left - this.f16469U.f16465n) - width);
                    float f13 = (float) ((getBounds().top - this.f16469U.f16465n) - height);
                    canvas3.translate(-f12, -f13);
                    c(canvas3);
                    canvas2.drawBitmap(createBitmap, f12, f13, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f16469U;
        Paint.Style style = fVar2.f16467p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f16454a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        float f8;
        Paint paint = this.f16483i0;
        Path path = this.f16476b0;
        k kVar = this.f16481g0;
        RectF rectF = this.f16478d0;
        rectF.set(f());
        if (g()) {
            f8 = paint.getStrokeWidth() / 2.0f;
        } else {
            f8 = 0.0f;
        }
        rectF.inset(f8, f8);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f16477c0;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f16469U.f16467p;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f16483i0.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public int getAlpha() {
        return this.f16469U.f16462k;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f16469U;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        this.f16469U.getClass();
        if (this.f16469U.f16454a.d(f())) {
            outline.setRoundRect(getBounds(), this.f16469U.f16454a.e.a(f()) * this.f16469U.i);
            return;
        }
        RectF f8 = f();
        Path path = this.f16475a0;
        a(f8, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c.a(outline, path);
        } else if (i >= 29) {
            try {
                r3.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            r3.b.a(outline, path);
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f16469U.f16459g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f16479e0;
        region.set(bounds);
        RectF f8 = f();
        Path path = this.f16475a0;
        a(f8, path);
        Region region2 = this.f16480f0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f16469U.f16455b = new C1404a(context);
        m();
    }

    public final void i(float f8) {
        f fVar = this.f16469U;
        if (fVar.f16464m != f8) {
            fVar.f16464m = f8;
            m();
        }
    }

    public final void invalidateSelf() {
        this.f16473Y = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f16469U.e) == null || !colorStateList.isStateful())) {
            this.f16469U.getClass();
            ColorStateList colorStateList3 = this.f16469U.f16457d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f16469U.f16456c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f16469U;
        if (fVar.f16456c != colorStateList) {
            fVar.f16456c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r5.f16482h0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = r5.f16483i0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(int[] r6) {
        /*
            r5 = this;
            z3.f r0 = r5.f16469U
            android.content.res.ColorStateList r0 = r0.f16456c
            r1 = 1
            if (r0 == 0) goto L_0x001c
            android.graphics.Paint r0 = r5.f16482h0
            int r2 = r0.getColor()
            z3.f r3 = r5.f16469U
            android.content.res.ColorStateList r3 = r3.f16456c
            int r3 = r3.getColorForState(r6, r2)
            if (r2 == r3) goto L_0x001c
            r0.setColor(r3)
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            z3.f r2 = r5.f16469U
            android.content.res.ColorStateList r2 = r2.f16457d
            if (r2 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.f16483i0
            int r3 = r2.getColor()
            z3.f r4 = r5.f16469U
            android.content.res.ColorStateList r4 = r4.f16457d
            int r6 = r4.getColorForState(r6, r3)
            if (r3 == r6) goto L_0x0037
            r2.setColor(r6)
            goto L_0x0038
        L_0x0037:
            r1 = r0
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.g.k(int[]):boolean");
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f16487m0;
        PorterDuffColorFilter porterDuffColorFilter4 = this.f16488n0;
        f fVar = this.f16469U;
        ColorStateList colorStateList = fVar.e;
        PorterDuff.Mode mode = fVar.f16458f;
        Paint paint = this.f16482h0;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b8 = b(color);
            if (b8 != color) {
                porterDuffColorFilter2 = new PorterDuffColorFilter(b8, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter2 = null;
            }
            porterDuffColorFilter = porterDuffColorFilter2;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f16487m0 = porterDuffColorFilter;
        this.f16469U.getClass();
        this.f16488n0 = null;
        this.f16469U.getClass();
        if (!Objects.equals(porterDuffColorFilter3, this.f16487m0) || !Objects.equals(porterDuffColorFilter4, this.f16488n0)) {
            return true;
        }
        return false;
    }

    public final void m() {
        f fVar = this.f16469U;
        float f8 = fVar.f16464m + 0.0f;
        fVar.f16465n = (int) Math.ceil((double) (0.75f * f8));
        this.f16469U.f16466o = (int) Math.ceil((double) (f8 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public Drawable mutate() {
        this.f16469U = new f(this.f16469U);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f16473Y = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean k8 = k(iArr);
        boolean l8 = l();
        if (k8 || l8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void setAlpha(int i) {
        f fVar = this.f16469U;
        if (fVar.f16462k != i) {
            fVar.f16462k = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f16469U.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f16469U.f16454a = kVar;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f16469U.e = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f16469U;
        if (fVar.f16458f != mode) {
            fVar.f16458f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i8) {
        this(k.b(context, attributeSet, i, i8).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        W w2;
        this.f16470V = new s[4];
        this.f16471W = new s[4];
        this.f16472X = new BitSet(8);
        this.f16474Z = new Matrix();
        this.f16475a0 = new Path();
        this.f16476b0 = new Path();
        this.f16477c0 = new RectF();
        this.f16478d0 = new RectF();
        this.f16479e0 = new Region();
        this.f16480f0 = new Region();
        Paint paint = new Paint(1);
        this.f16482h0 = paint;
        Paint paint2 = new Paint(1);
        this.f16483i0 = paint2;
        this.f16484j0 = new C1633a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            w2 = l.f16511a;
        } else {
            w2 = new W();
        }
        this.f16486l0 = w2;
        this.f16489o0 = new RectF();
        this.p0 = true;
        this.f16469U = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f16485k0 = new C1609a((Object) this);
    }
}
