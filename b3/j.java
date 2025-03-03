package B3;

import E.e;
import I0.a;
import O7.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1551x;
import z3.k;

public abstract class j extends FrameLayout {

    /* renamed from: i0  reason: collision with root package name */
    public static final i f401i0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public k f402U;

    /* renamed from: V  reason: collision with root package name */
    public final k f403V;

    /* renamed from: W  reason: collision with root package name */
    public int f404W;

    /* renamed from: a0  reason: collision with root package name */
    public final float f405a0;

    /* renamed from: b0  reason: collision with root package name */
    public final float f406b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f407c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f408d0;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f409e0;

    /* renamed from: f0  reason: collision with root package name */
    public PorterDuff.Mode f410f0;

    /* renamed from: g0  reason: collision with root package name */
    public Rect f411g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f412h0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: z3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = E3.a.a(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = f3.C0899a.f11670x
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0023
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = v0.C1510H.f15874a
            v0.C1553z.l(r4, r2)
        L_0x0023:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.f404W = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003a
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0044
        L_0x003a:
            z3.j r6 = z3.k.b(r5, r6, r0, r0)
            z3.k r6 = r6.a()
            r4.f403V = r6
        L_0x0044:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.f405a0 = r6
            r6 = 4
            android.content.res.ColorStateList r5 = com.bumptech.glide.c.j(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = t3.k.g(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.f406b0 = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.f407c0 = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.f408d0 = r6
            r1.recycle()
            B3.i r6 = f401i0
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00e5
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130968856(0x7f040118, float:1.7546377E38)
            int r6 = D7.b.o(r4, r6)
            r1 = 2130968834(0x7f040102, float:1.7546333E38)
            int r1 = D7.b.o(r4, r1)
            int r5 = D7.b.F(r5, r6, r1)
            z3.k r6 = r4.f403V
            if (r6 == 0) goto L_0x00b2
            I0.a r0 = B3.k.f413u
            z3.g r0 = new z3.g
            r0.<init>((z3.k) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.j(r5)
            goto L_0x00ce
        L_0x00b2:
            android.content.res.Resources r6 = r4.getResources()
            I0.a r1 = B3.k.f413u
            r1 = 2131165979(0x7f07031b, float:1.794619E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00ce:
            android.content.res.ColorStateList r5 = r4.f409e0
            if (r5 == 0) goto L_0x00dc
            android.graphics.drawable.Drawable r5 = E.e.z(r0)
            android.content.res.ColorStateList r6 = r4.f409e0
            r5.setTintList(r6)
            goto L_0x00e0
        L_0x00dc:
            android.graphics.drawable.Drawable r5 = E.e.z(r0)
        L_0x00e0:
            java.util.WeakHashMap r6 = v0.C1510H.f15874a
            r4.setBackground(r5)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.j.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public void setBaseTransientBottomBar(k kVar) {
        this.f402U = kVar;
    }

    public float getActionTextColorAlpha() {
        return this.f406b0;
    }

    public int getAnimationMode() {
        return this.f404W;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f405a0;
    }

    public int getMaxInlineActionWidth() {
        return this.f408d0;
    }

    public int getMaxWidth() {
        return this.f407c0;
    }

    public final void onAttachedToWindow() {
        WindowInsets n4;
        super.onAttachedToWindow();
        k kVar = this.f402U;
        if (!(kVar == null || Build.VERSION.SDK_INT < 29 || (n4 = kVar.i.getRootWindowInsets()) == null)) {
            kVar.f431p = n4.getMandatorySystemGestureInsets().bottom;
            kVar.e();
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1551x.c(this);
    }

    public final void onDetachedFromWindow() {
        boolean z;
        boolean z6;
        super.onDetachedFromWindow();
        k kVar = this.f402U;
        if (kVar != null) {
            q K4 = q.K();
            h hVar = kVar.f435t;
            synchronized (K4.f449U) {
                z = true;
                if (!K4.R(hVar)) {
                    p pVar = (p) K4.f452X;
                    if (pVar == null || pVar.f444a.get() != hVar) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (!z6) {
                        z = false;
                    }
                }
            }
            if (z) {
                k.f416x.post(new e(kVar, 1));
            }
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        k kVar = this.f402U;
        if (kVar != null && kVar.f433r) {
            kVar.d();
            kVar.f433r = false;
        }
    }

    public void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int i9 = this.f407c0;
        if (i9 > 0 && getMeasuredWidth() > i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, b.MAX_POW2), i8);
        }
    }

    public void setAnimationMode(int i) {
        this.f404W = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f409e0 == null)) {
            drawable = e.z(drawable.mutate());
            drawable.setTintList(this.f409e0);
            drawable.setTintMode(this.f410f0);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f409e0 = colorStateList;
        if (getBackground() != null) {
            Drawable z = e.z(getBackground().mutate());
            z.setTintList(colorStateList);
            z.setTintMode(this.f410f0);
            if (z != getBackground()) {
                super.setBackgroundDrawable(z);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f410f0 = mode;
        if (getBackground() != null) {
            Drawable z = e.z(getBackground().mutate());
            z.setTintMode(mode);
            if (z != getBackground()) {
                super.setBackgroundDrawable(z);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f412h0 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f411g0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            k kVar = this.f402U;
            if (kVar != null) {
                a aVar = k.f413u;
                kVar.e();
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        i iVar;
        if (onClickListener != null) {
            iVar = null;
        } else {
            iVar = f401i0;
        }
        setOnTouchListener(iVar);
        super.setOnClickListener(onClickListener);
    }
}
