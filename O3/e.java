package o3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import g3.C0959b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n0.C1233b;
import n0.C1234c;
import t3.h;
import t3.i;
import w3.C1590d;
import x3.d;
import z3.C1646a;
import z3.f;
import z3.g;
import z3.j;

public final class e extends g implements Drawable.Callback, h {

    /* renamed from: A1  reason: collision with root package name */
    public static final ShapeDrawable f14208A1 = new ShapeDrawable(new OvalShape());

    /* renamed from: z1  reason: collision with root package name */
    public static final int[] f14209z1 = {16842910};

    /* renamed from: A0  reason: collision with root package name */
    public Drawable f14210A0;

    /* renamed from: B0  reason: collision with root package name */
    public ColorStateList f14211B0;

    /* renamed from: C0  reason: collision with root package name */
    public float f14212C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f14213D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f14214E0;

    /* renamed from: F0  reason: collision with root package name */
    public Drawable f14215F0;

    /* renamed from: G0  reason: collision with root package name */
    public RippleDrawable f14216G0;

    /* renamed from: H0  reason: collision with root package name */
    public ColorStateList f14217H0;

    /* renamed from: I0  reason: collision with root package name */
    public float f14218I0;

    /* renamed from: J0  reason: collision with root package name */
    public SpannableStringBuilder f14219J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f14220K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f14221L0;

    /* renamed from: M0  reason: collision with root package name */
    public Drawable f14222M0;

    /* renamed from: N0  reason: collision with root package name */
    public ColorStateList f14223N0;

    /* renamed from: O0  reason: collision with root package name */
    public C0959b f14224O0;

    /* renamed from: P0  reason: collision with root package name */
    public C0959b f14225P0;

    /* renamed from: Q0  reason: collision with root package name */
    public float f14226Q0;

    /* renamed from: R0  reason: collision with root package name */
    public float f14227R0;

    /* renamed from: S0  reason: collision with root package name */
    public float f14228S0;

    /* renamed from: T0  reason: collision with root package name */
    public float f14229T0;

    /* renamed from: U0  reason: collision with root package name */
    public float f14230U0;

    /* renamed from: V0  reason: collision with root package name */
    public float f14231V0;

    /* renamed from: W0  reason: collision with root package name */
    public float f14232W0;

    /* renamed from: X0  reason: collision with root package name */
    public float f14233X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final Context f14234Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final Paint f14235Z0 = new Paint(1);

    /* renamed from: a1  reason: collision with root package name */
    public final Paint.FontMetrics f14236a1 = new Paint.FontMetrics();

    /* renamed from: b1  reason: collision with root package name */
    public final RectF f14237b1 = new RectF();

    /* renamed from: c1  reason: collision with root package name */
    public final PointF f14238c1 = new PointF();

    /* renamed from: d1  reason: collision with root package name */
    public final Path f14239d1 = new Path();

    /* renamed from: e1  reason: collision with root package name */
    public final i f14240e1;

    /* renamed from: f1  reason: collision with root package name */
    public int f14241f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f14242g1;

    /* renamed from: h1  reason: collision with root package name */
    public int f14243h1;

    /* renamed from: i1  reason: collision with root package name */
    public int f14244i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f14245j1;

    /* renamed from: k1  reason: collision with root package name */
    public int f14246k1;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f14247l1;

    /* renamed from: m1  reason: collision with root package name */
    public int f14248m1;

    /* renamed from: n1  reason: collision with root package name */
    public int f14249n1 = 255;

    /* renamed from: o1  reason: collision with root package name */
    public ColorFilter f14250o1;

    /* renamed from: p1  reason: collision with root package name */
    public PorterDuffColorFilter f14251p1;

    /* renamed from: q1  reason: collision with root package name */
    public ColorStateList f14252q1;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f14253r0;

    /* renamed from: r1  reason: collision with root package name */
    public PorterDuff.Mode f14254r1 = PorterDuff.Mode.SRC_IN;

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f14255s0;
    public int[] s1;

    /* renamed from: t0  reason: collision with root package name */
    public float f14256t0;
    public ColorStateList t1;

    /* renamed from: u0  reason: collision with root package name */
    public float f14257u0 = -1.0f;

    /* renamed from: u1  reason: collision with root package name */
    public WeakReference f14258u1 = new WeakReference((Object) null);

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f14259v0;

    /* renamed from: v1  reason: collision with root package name */
    public TextUtils.TruncateAt f14260v1;

    /* renamed from: w0  reason: collision with root package name */
    public float f14261w0;
    public boolean w1;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f14262x0;

    /* renamed from: x1  reason: collision with root package name */
    public int f14263x1;

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence f14264y0;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f14265y1;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f14266z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968782, 2132018247);
        h(context);
        this.f14234Y0 = context;
        i iVar = new i(this);
        this.f14240e1 = iVar;
        this.f14264y0 = "";
        iVar.f15456a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f14209z1;
        setState(iArr);
        if (!Arrays.equals(this.s1, iArr)) {
            this.s1 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.w1 = true;
        int[] iArr2 = d.f16269a;
        f14208A1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean t(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public final void A(float f8) {
        if (this.f14257u0 != f8) {
            this.f14257u0 = f8;
            j e = this.f16469U.f16454a.e();
            e.e = new C1646a(f8);
            e.f16495f = new C1646a(f8);
            e.f16496g = new C1646a(f8);
            e.f16497h = new C1646a(f8);
            setShapeAppearanceModel(e.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.f14210A0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C1233b) {
            drawable2 = ((C1234c) ((C1233b) drawable2)).f13560Z;
        }
        if (drawable2 != drawable) {
            float p3 = p();
            if (drawable != null) {
                drawable3 = E.e.z(drawable).mutate();
            }
            this.f14210A0 = drawable3;
            float p8 = p();
            U(drawable2);
            if (S()) {
                n(this.f14210A0);
            }
            invalidateSelf();
            if (p3 != p8) {
                u();
            }
        }
    }

    public final void C(float f8) {
        if (this.f14212C0 != f8) {
            float p3 = p();
            this.f14212C0 = f8;
            float p8 = p();
            invalidateSelf();
            if (p3 != p8) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f14213D0 = true;
        if (this.f14211B0 != colorStateList) {
            this.f14211B0 = colorStateList;
            if (S()) {
                this.f14210A0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.f14266z0 != z) {
            boolean S8 = S();
            this.f14266z0 = z;
            boolean S9 = S();
            if (S8 != S9) {
                if (S9) {
                    n(this.f14210A0);
                } else {
                    U(this.f14210A0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f14259v0 != colorStateList) {
            this.f14259v0 = colorStateList;
            if (this.f14265y1) {
                f fVar = this.f16469U;
                if (fVar.f16457d != colorStateList) {
                    fVar.f16457d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f8) {
        if (this.f14261w0 != f8) {
            this.f14261w0 = f8;
            this.f14235Z0.setStrokeWidth(f8);
            if (this.f14265y1) {
                this.f16469U.f16461j = f8;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.f14215F0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C1233b) {
            drawable2 = ((C1234c) ((C1233b) drawable2)).f13560Z;
        }
        if (drawable2 != drawable) {
            float q7 = q();
            if (drawable != null) {
                drawable3 = E.e.z(drawable).mutate();
            }
            this.f14215F0 = drawable3;
            int[] iArr = d.f16269a;
            this.f14216G0 = new RippleDrawable(d.a(this.f14262x0), this.f14215F0, f14208A1);
            float q8 = q();
            U(drawable2);
            if (T()) {
                n(this.f14215F0);
            }
            invalidateSelf();
            if (q7 != q8) {
                u();
            }
        }
    }

    public final void I(float f8) {
        if (this.f14232W0 != f8) {
            this.f14232W0 = f8;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f8) {
        if (this.f14218I0 != f8) {
            this.f14218I0 = f8;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f8) {
        if (this.f14231V0 != f8) {
            this.f14231V0 = f8;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f14217H0 != colorStateList) {
            this.f14217H0 = colorStateList;
            if (T()) {
                this.f14215F0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.f14214E0 != z) {
            boolean T8 = T();
            this.f14214E0 = z;
            boolean T9 = T();
            if (T8 != T9) {
                if (T9) {
                    n(this.f14215F0);
                } else {
                    U(this.f14215F0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f8) {
        if (this.f14228S0 != f8) {
            float p3 = p();
            this.f14228S0 = f8;
            float p8 = p();
            invalidateSelf();
            if (p3 != p8) {
                u();
            }
        }
    }

    public final void O(float f8) {
        if (this.f14227R0 != f8) {
            float p3 = p();
            this.f14227R0 = f8;
            float p8 = p();
            invalidateSelf();
            if (p3 != p8) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f14262x0 != colorStateList) {
            this.f14262x0 = colorStateList;
            this.t1 = null;
            onStateChange(getState());
        }
    }

    public final void Q(C1590d dVar) {
        i iVar = this.f14240e1;
        if (iVar.f15460f != dVar) {
            iVar.f15460f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f15456a;
                Context context = this.f14234Y0;
                C1317a aVar = iVar.f15457b;
                dVar.f(context, textPaint, aVar);
                h hVar = (h) iVar.e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                iVar.f15459d = true;
            }
            h hVar2 = (h) iVar.e.get();
            if (hVar2 != null) {
                e eVar = (e) hVar2;
                eVar.u();
                eVar.invalidateSelf();
                eVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        if (!this.f14221L0 || this.f14222M0 == null || !this.f14247l1) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (!this.f14266z0 || this.f14210A0 == null) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        if (!this.f14214E0 || this.f14215F0 == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i8;
        int i9;
        RectF rectF;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f14249n1) != 0) {
            if (i < 255) {
                float f8 = (float) bounds.left;
                float f9 = (float) bounds.top;
                float f10 = (float) bounds.right;
                float f11 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i13 = canvas.saveLayerAlpha(f8, f9, f10, f11, i);
                } else {
                    i13 = canvas.saveLayerAlpha(f8, f9, f10, f11, i, 31);
                }
                i8 = i13;
            } else {
                i8 = 0;
            }
            boolean z6 = this.f14265y1;
            Paint paint = this.f14235Z0;
            RectF rectF2 = this.f14237b1;
            if (!z6) {
                paint.setColor(this.f14241f1);
                paint.setStyle(Paint.Style.FILL);
                rectF2.set(bounds);
                canvas2.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (!this.f14265y1) {
                paint.setColor(this.f14242g1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f14250o1;
                if (colorFilter == null) {
                    colorFilter = this.f14251p1;
                }
                paint.setColorFilter(colorFilter);
                rectF2.set(bounds);
                canvas2.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (this.f14265y1) {
                super.draw(canvas);
            }
            if (this.f14261w0 > 0.0f && !this.f14265y1) {
                paint.setColor(this.f14244i1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f14265y1) {
                    ColorFilter colorFilter2 = this.f14250o1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f14251p1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f12 = this.f14261w0 / 2.0f;
                rectF2.set(((float) bounds.left) + f12, ((float) bounds.top) + f12, ((float) bounds.right) - f12, ((float) bounds.bottom) - f12);
                float f13 = this.f14257u0 - (this.f14261w0 / 2.0f);
                canvas2.drawRoundRect(rectF2, f13, f13, paint);
            }
            paint.setColor(this.f14245j1);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            if (!this.f14265y1) {
                canvas2.drawRoundRect(rectF2, r(), r(), paint);
                i9 = 0;
            } else {
                RectF rectF3 = new RectF(bounds);
                Path path = this.f14239d1;
                f fVar = this.f16469U;
                this.f16486l0.b(fVar.f16454a, fVar.i, rectF3, this.f16485k0, path);
                RectF f14 = f();
                i9 = 0;
                d(canvas, paint, path, this.f16469U.f16454a, f14);
            }
            if (S()) {
                o(bounds, rectF2);
                float f15 = rectF2.left;
                float f16 = rectF2.top;
                canvas2.translate(f15, f16);
                this.f14210A0.setBounds(i9, i9, (int) rectF2.width(), (int) rectF2.height());
                this.f14210A0.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (R()) {
                o(bounds, rectF2);
                float f17 = rectF2.left;
                float f18 = rectF2.top;
                canvas2.translate(f17, f18);
                this.f14222M0.setBounds(i9, i9, (int) rectF2.width(), (int) rectF2.height());
                this.f14222M0.draw(canvas2);
                canvas2.translate(-f17, -f18);
            }
            if (!this.w1 || this.f14264y0 == null) {
                rectF = rectF2;
                i11 = i8;
                i10 = 255;
            } else {
                PointF pointF = this.f14238c1;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f14264y0;
                i iVar = this.f14240e1;
                if (charSequence != null) {
                    float p3 = p() + this.f14226Q0 + this.f14229T0;
                    if (E.e.q(this) == 0) {
                        pointF.x = ((float) bounds.left) + p3;
                    } else {
                        pointF.x = ((float) bounds.right) - p3;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f15456a;
                    Paint.FontMetrics fontMetrics = this.f14236a1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF2.setEmpty();
                if (this.f14264y0 != null) {
                    float p8 = p() + this.f14226Q0 + this.f14229T0;
                    float q7 = q() + this.f14233X0 + this.f14230U0;
                    if (E.e.q(this) == 0) {
                        rectF2.left = ((float) bounds.left) + p8;
                        rectF2.right = ((float) bounds.right) - q7;
                    } else {
                        rectF2.left = ((float) bounds.left) + q7;
                        rectF2.right = ((float) bounds.right) - p8;
                    }
                    rectF2.top = (float) bounds.top;
                    rectF2.bottom = (float) bounds.bottom;
                }
                C1590d dVar = iVar.f15460f;
                TextPaint textPaint2 = iVar.f15456a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f15460f.e(this.f14234Y0, textPaint2, iVar.f15457b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(iVar.a(this.f14264y0.toString())) > Math.round(rectF2.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i12 = canvas.save();
                    canvas2.clipRect(rectF2);
                } else {
                    i12 = 0;
                }
                CharSequence charSequence2 = this.f14264y0;
                if (z && this.f14260v1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF2.width(), this.f14260v1);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                int i14 = length;
                i10 = 255;
                float f19 = pointF.x;
                rectF = rectF2;
                float f20 = pointF.y;
                i11 = i8;
                canvas.drawText(charSequence3, 0, i14, f19, f20, textPaint2);
                if (z) {
                    canvas2.restoreToCount(i12);
                }
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f21 = this.f14233X0 + this.f14232W0;
                    if (E.e.q(this) == 0) {
                        float f22 = ((float) bounds.right) - f21;
                        rectF.right = f22;
                        rectF.left = f22 - this.f14218I0;
                    } else {
                        float f23 = ((float) bounds.left) + f21;
                        rectF.left = f23;
                        rectF.right = f23 + this.f14218I0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f24 = this.f14218I0;
                    float f25 = exactCenterY - (f24 / 2.0f);
                    rectF.top = f25;
                    rectF.bottom = f25 + f24;
                }
                float f26 = rectF.left;
                float f27 = rectF.top;
                canvas2.translate(f26, f27);
                this.f14215F0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = d.f16269a;
                this.f14216G0.setBounds(this.f14215F0.getBounds());
                this.f14216G0.jumpToCurrentState();
                this.f14216G0.draw(canvas2);
                canvas2.translate(-f26, -f27);
            }
            if (this.f14249n1 < i10) {
                canvas2.restoreToCount(i11);
            }
        }
    }

    public final int getAlpha() {
        return this.f14249n1;
    }

    public final ColorFilter getColorFilter() {
        return this.f14250o1;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f14256t0;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f14240e1.a(this.f14264y0.toString()) + p() + this.f14226Q0 + this.f14229T0 + this.f14230U0 + this.f14233X0), this.f14263x1);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.f14265y1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f14257u0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f14256t0, this.f14257u0);
        }
        outline.setAlpha(((float) this.f14249n1) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        C1590d dVar;
        ColorStateList colorStateList;
        if (s(this.f14253r0) || s(this.f14255s0) || s(this.f14259v0) || (((dVar = this.f14240e1.f15460f) != null && (colorStateList = dVar.f16208j) != null && colorStateList.isStateful()) || ((this.f14221L0 && this.f14222M0 != null && this.f14220K0) || t(this.f14210A0) || t(this.f14222M0) || s(this.f14252q1)))) {
            return true;
        }
        return false;
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            E.e.v(drawable, E.e.q(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f14215F0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.s1);
                }
                drawable.setTintList(this.f14217H0);
                return;
            }
            Drawable drawable2 = this.f14210A0;
            if (drawable == drawable2 && this.f14213D0) {
                drawable2.setTintList(this.f14211B0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (S() || R()) {
            float f8 = this.f14226Q0 + this.f14227R0;
            if (this.f14247l1) {
                drawable = this.f14222M0;
            } else {
                drawable = this.f14210A0;
            }
            float f9 = this.f14212C0;
            if (f9 <= 0.0f && drawable != null) {
                f9 = (float) drawable.getIntrinsicWidth();
            }
            if (E.e.q(this) == 0) {
                float f10 = ((float) rect.left) + f8;
                rectF.left = f10;
                rectF.right = f10 + f9;
            } else {
                float f11 = ((float) rect.right) - f8;
                rectF.right = f11;
                rectF.left = f11 - f9;
            }
            if (this.f14247l1) {
                drawable2 = this.f14222M0;
            } else {
                drawable2 = this.f14210A0;
            }
            float f12 = this.f14212C0;
            if (f12 <= 0.0f && drawable2 != null) {
                f12 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f14234Y0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f12) {
                    f12 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f12;
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= E.e.v(this.f14210A0, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= E.e.v(this.f14222M0, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= E.e.v(this.f14215F0, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (S()) {
            onLevelChange |= this.f14210A0.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f14222M0.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f14215F0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f14265y1) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.s1);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f8 = this.f14227R0;
        if (this.f14247l1) {
            drawable = this.f14222M0;
        } else {
            drawable = this.f14210A0;
        }
        float f9 = this.f14212C0;
        if (f9 <= 0.0f && drawable != null) {
            f9 = (float) drawable.getIntrinsicWidth();
        }
        return f9 + f8 + this.f14228S0;
    }

    public final float q() {
        if (T()) {
            return this.f14231V0 + this.f14218I0 + this.f14232W0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.f14265y1) {
            return this.f16469U.f16454a.e.a(f());
        }
        return this.f14257u0;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    public final void setAlpha(int i) {
        if (this.f14249n1 != i) {
            this.f14249n1 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f14250o1 != colorFilter) {
            this.f14250o1 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f14252q1 != colorStateList) {
            this.f14252q1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f14254r1 != mode) {
            this.f14254r1 = mode;
            ColorStateList colorStateList = this.f14252q1;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.f14251p1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z6) {
        boolean visible = super.setVisible(z, z6);
        if (S()) {
            visible |= this.f14210A0.setVisible(z, z6);
        }
        if (R()) {
            visible |= this.f14222M0.setVisible(z, z6);
        }
        if (T()) {
            visible |= this.f14215F0.setVisible(z, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        d dVar = (d) this.f14258u1.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f9259m0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(int[] r9, int[] r10) {
        /*
            r8 = this;
            r0 = 1
            boolean r1 = super.onStateChange(r9)
            android.content.res.ColorStateList r2 = r8.f14253r0
            r3 = 0
            if (r2 == 0) goto L_0x0011
            int r4 = r8.f14241f1
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            int r2 = r8.b(r2)
            int r4 = r8.f14241f1
            if (r4 == r2) goto L_0x001d
            r8.f14241f1 = r2
            r1 = 1
        L_0x001d:
            android.content.res.ColorStateList r4 = r8.f14255s0
            if (r4 == 0) goto L_0x0028
            int r5 = r8.f14242g1
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            int r4 = r8.b(r4)
            int r5 = r8.f14242g1
            if (r5 == r4) goto L_0x0034
            r8.f14242g1 = r4
            r1 = 1
        L_0x0034:
            int r2 = m0.C1195a.b(r4, r2)
            int r4 = r8.f14243h1
            if (r4 == r2) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            z3.f r5 = r8.f16469U
            android.content.res.ColorStateList r5 = r5.f16456c
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r4 = r4 | r5
            if (r4 == 0) goto L_0x0055
            r8.f14243h1 = r2
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r8.j(r1)
            r1 = 1
        L_0x0055:
            android.content.res.ColorStateList r2 = r8.f14259v0
            if (r2 == 0) goto L_0x0060
            int r4 = r8.f14244i1
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            int r4 = r8.f14244i1
            if (r4 == r2) goto L_0x0068
            r8.f14244i1 = r2
            r1 = 1
        L_0x0068:
            android.content.res.ColorStateList r2 = r8.t1
            if (r2 == 0) goto L_0x007b
            boolean r2 = x3.d.b(r9)
            if (r2 == 0) goto L_0x007b
            android.content.res.ColorStateList r2 = r8.t1
            int r4 = r8.f14245j1
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            int r4 = r8.f14245j1
            if (r4 == r2) goto L_0x0082
            r8.f14245j1 = r2
        L_0x0082:
            t3.i r2 = r8.f14240e1
            w3.d r2 = r2.f15460f
            if (r2 == 0) goto L_0x0093
            android.content.res.ColorStateList r2 = r2.f16208j
            if (r2 == 0) goto L_0x0093
            int r4 = r8.f14246k1
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            int r4 = r8.f14246k1
            if (r4 == r2) goto L_0x009b
            r8.f14246k1 = r2
            r1 = 1
        L_0x009b:
            int[] r2 = r8.getState()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00b5
        L_0x00a2:
            int r4 = r2.length
            r5 = 0
        L_0x00a4:
            if (r5 >= r4) goto L_0x00b5
            r6 = r2[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto L_0x00b3
            boolean r2 = r8.f14220K0
            if (r2 == 0) goto L_0x00b5
            r2 = 1
            goto L_0x00b6
        L_0x00b3:
            int r5 = r5 + r0
            goto L_0x00a4
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            boolean r4 = r8.f14247l1
            if (r4 == r2) goto L_0x00d0
            android.graphics.drawable.Drawable r4 = r8.f14222M0
            if (r4 == 0) goto L_0x00d0
            float r1 = r8.p()
            r8.f14247l1 = r2
            float r2 = r8.p()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00cf
            r1 = 1
            r2 = 1
            goto L_0x00d1
        L_0x00cf:
            r1 = 1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            android.content.res.ColorStateList r4 = r8.f14252q1
            if (r4 == 0) goto L_0x00dc
            int r5 = r8.f14248m1
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            int r5 = r8.f14248m1
            if (r5 == r4) goto L_0x00fe
            r8.f14248m1 = r4
            android.content.res.ColorStateList r1 = r8.f14252q1
            android.graphics.PorterDuff$Mode r4 = r8.f14254r1
            if (r1 == 0) goto L_0x00fa
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fa
        L_0x00ec:
            int[] r5 = r8.getState()
            int r1 = r1.getColorForState(r5, r3)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r1, r4)
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r8.f14251p1 = r5
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            android.graphics.drawable.Drawable r1 = r8.f14210A0
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x010e
            android.graphics.drawable.Drawable r1 = r8.f14210A0
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x010e:
            android.graphics.drawable.Drawable r1 = r8.f14222M0
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x011d
            android.graphics.drawable.Drawable r1 = r8.f14222M0
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x011d:
            android.graphics.drawable.Drawable r1 = r8.f14215F0
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x013a
            int r1 = r9.length
            int r4 = r10.length
            int r1 = r1 + r4
            int[] r1 = new int[r1]
            int r4 = r9.length
            java.lang.System.arraycopy(r9, r3, r1, r3, r4)
            int r9 = r9.length
            int r4 = r10.length
            java.lang.System.arraycopy(r10, r3, r1, r9, r4)
            android.graphics.drawable.Drawable r9 = r8.f14215F0
            boolean r9 = r9.setState(r1)
            r0 = r0 | r9
        L_0x013a:
            int[] r9 = x3.d.f16269a
            android.graphics.drawable.RippleDrawable r9 = r8.f14216G0
            boolean r9 = t(r9)
            if (r9 == 0) goto L_0x014b
            android.graphics.drawable.RippleDrawable r9 = r8.f14216G0
            boolean r9 = r9.setState(r10)
            r0 = r0 | r9
        L_0x014b:
            if (r0 == 0) goto L_0x0150
            r8.invalidateSelf()
        L_0x0150:
            if (r2 == 0) goto L_0x0155
            r8.u()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e.v(int[], int[]):boolean");
    }

    public final void w(boolean z) {
        if (this.f14220K0 != z) {
            this.f14220K0 = z;
            float p3 = p();
            if (!z && this.f14247l1) {
                this.f14247l1 = false;
            }
            float p8 = p();
            invalidateSelf();
            if (p3 != p8) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f14222M0 != drawable) {
            float p3 = p();
            this.f14222M0 = drawable;
            float p8 = p();
            U(this.f14222M0);
            n(this.f14222M0);
            invalidateSelf();
            if (p3 != p8) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f14223N0 != colorStateList) {
            this.f14223N0 = colorStateList;
            if (this.f14221L0 && (drawable = this.f14222M0) != null && this.f14220K0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        if (this.f14221L0 != z) {
            boolean R3 = R();
            this.f14221L0 = z;
            boolean R8 = R();
            if (R3 != R8) {
                if (R8) {
                    n(this.f14222M0);
                } else {
                    U(this.f14222M0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
