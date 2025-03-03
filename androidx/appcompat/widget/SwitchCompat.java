package androidx.appcompat.widget;

import B.C0003d;
import E.e;
import E0.h;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.j;
import com.woxthebox.draglistview.R;
import g2.C0949b;
import java.util.WeakHashMap;
import l.C1167a;
import n2.a;
import o.C1286o0;
import o.C1298v;
import o.w1;
import v0.C1510H;
import v0.C1549v;

public class SwitchCompat extends CompoundButton {

    /* renamed from: O0  reason: collision with root package name */
    public static final C0949b f7515O0 = new C0949b(Float.class, "thumbPos", 7);

    /* renamed from: P0  reason: collision with root package name */
    public static final int[] f7516P0 = {16842912};

    /* renamed from: A0  reason: collision with root package name */
    public int f7517A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f7518B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f7519C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f7520D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f7521E0;

    /* renamed from: F0  reason: collision with root package name */
    public final TextPaint f7522F0;

    /* renamed from: G0  reason: collision with root package name */
    public final ColorStateList f7523G0;

    /* renamed from: H0  reason: collision with root package name */
    public StaticLayout f7524H0;

    /* renamed from: I0  reason: collision with root package name */
    public StaticLayout f7525I0;

    /* renamed from: J0  reason: collision with root package name */
    public final C1167a f7526J0;

    /* renamed from: K0  reason: collision with root package name */
    public ObjectAnimator f7527K0;

    /* renamed from: L0  reason: collision with root package name */
    public C1298v f7528L0;

    /* renamed from: M0  reason: collision with root package name */
    public h f7529M0;

    /* renamed from: N0  reason: collision with root package name */
    public final Rect f7530N0;

    /* renamed from: U  reason: collision with root package name */
    public Drawable f7531U;

    /* renamed from: V  reason: collision with root package name */
    public ColorStateList f7532V = null;

    /* renamed from: W  reason: collision with root package name */
    public PorterDuff.Mode f7533W = null;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f7534a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7535b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f7536c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f7537d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    public PorterDuff.Mode f7538e0 = null;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7539f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7540g0 = false;

    /* renamed from: h0  reason: collision with root package name */
    public int f7541h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7542i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f7543j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7544k0;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f7545l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f7546m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f7547n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f7548o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f7549q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f7550r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f7551s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f7552t0;

    /* renamed from: u0  reason: collision with root package name */
    public final VelocityTracker f7553u0 = VelocityTracker.obtain();

    /* renamed from: v0  reason: collision with root package name */
    public final int f7554v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f7555w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f7556x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f7557y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f7558z0;

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, l.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        r3 = j0.f.c(r13, (r3 = r1.getResourceId(3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r6 = 2130969656(0x7f040438, float:1.7548E38)
            r12.<init>(r13, r14, r6)
            r7 = 0
            r12.f7532V = r7
            r12.f7533W = r7
            r8 = 0
            r12.f7534a0 = r8
            r12.f7535b0 = r8
            r12.f7537d0 = r7
            r12.f7538e0 = r7
            r12.f7539f0 = r8
            r12.f7540g0 = r8
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f7553u0 = r0
            r9 = 1
            r12.f7521E0 = r9
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f7530N0 = r0
            android.content.Context r0 = r12.getContext()
            o.d1.a(r12, r0)
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>(r9)
            r12.f7522F0 = r10
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r10.density = r0
            int[] r2 = g.C0940a.f11834w
            d4.k r11 = d4.k.K2(r13, r14, r2, r6)
            java.lang.Object r0 = r11.f9767W
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r12
            r1 = r13
            r3 = r14
            r5 = r6
            v0.C1510H.o(r0, r1, r2, r3, r4, r5)
            r0 = 2
            android.graphics.drawable.Drawable r1 = r11.I(r0)
            r12.f7531U = r1
            if (r1 == 0) goto L_0x0060
            r1.setCallback(r12)
        L_0x0060:
            r1 = 11
            android.graphics.drawable.Drawable r1 = r11.I(r1)
            r12.f7536c0 = r1
            if (r1 == 0) goto L_0x006d
            r1.setCallback(r12)
        L_0x006d:
            java.lang.Object r1 = r11.f9767W
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            java.lang.CharSequence r2 = r1.getText(r8)
            r12.setTextOnInternal(r2)
            java.lang.CharSequence r2 = r1.getText(r9)
            r12.setTextOffInternal(r2)
            r2 = 3
            boolean r3 = r1.getBoolean(r2, r9)
            r12.p0 = r3
            r3 = 8
            int r3 = r1.getDimensionPixelSize(r3, r8)
            r12.f7541h0 = r3
            r3 = 5
            int r3 = r1.getDimensionPixelSize(r3, r8)
            r12.f7542i0 = r3
            r3 = 6
            int r3 = r1.getDimensionPixelSize(r3, r8)
            r12.f7543j0 = r3
            r3 = 4
            boolean r3 = r1.getBoolean(r3, r8)
            r12.f7544k0 = r3
            r3 = 9
            android.content.res.ColorStateList r3 = r11.v(r3)
            if (r3 == 0) goto L_0x00af
            r12.f7532V = r3
            r12.f7534a0 = r9
        L_0x00af:
            r3 = 10
            r4 = -1
            int r3 = r1.getInt(r3, r4)
            android.graphics.PorterDuff$Mode r3 = o.C1286o0.c(r3, r7)
            android.graphics.PorterDuff$Mode r5 = r12.f7533W
            if (r5 == r3) goto L_0x00c2
            r12.f7533W = r3
            r12.f7535b0 = r9
        L_0x00c2:
            boolean r3 = r12.f7534a0
            if (r3 != 0) goto L_0x00ca
            boolean r3 = r12.f7535b0
            if (r3 == 0) goto L_0x00cd
        L_0x00ca:
            r12.a()
        L_0x00cd:
            r3 = 12
            android.content.res.ColorStateList r3 = r11.v(r3)
            if (r3 == 0) goto L_0x00d9
            r12.f7537d0 = r3
            r12.f7539f0 = r9
        L_0x00d9:
            r3 = 13
            int r3 = r1.getInt(r3, r4)
            android.graphics.PorterDuff$Mode r3 = o.C1286o0.c(r3, r7)
            android.graphics.PorterDuff$Mode r5 = r12.f7538e0
            if (r5 == r3) goto L_0x00eb
            r12.f7538e0 = r3
            r12.f7540g0 = r9
        L_0x00eb:
            boolean r3 = r12.f7539f0
            if (r3 != 0) goto L_0x00f3
            boolean r3 = r12.f7540g0
            if (r3 == 0) goto L_0x00f6
        L_0x00f3:
            r12.b()
        L_0x00f6:
            r3 = 7
            int r1 = r1.getResourceId(r3, r8)
            if (r1 == 0) goto L_0x01b7
            int[] r3 = g.C0940a.f11835x
            android.content.res.TypedArray r1 = r13.obtainStyledAttributes(r1, r3)
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0116
            int r3 = r1.getResourceId(r2, r8)
            if (r3 == 0) goto L_0x0116
            android.content.res.ColorStateList r3 = j0.f.c(r13, r3)
            if (r3 == 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x011a:
            if (r3 == 0) goto L_0x011f
            r12.f7523G0 = r3
            goto L_0x0125
        L_0x011f:
            android.content.res.ColorStateList r3 = r12.getTextColors()
            r12.f7523G0 = r3
        L_0x0125:
            int r3 = r1.getDimensionPixelSize(r8, r8)
            if (r3 == 0) goto L_0x013a
            float r3 = (float) r3
            float r5 = r10.getTextSize()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x013a
            r10.setTextSize(r3)
            r12.requestLayout()
        L_0x013a:
            int r3 = r1.getInt(r9, r4)
            int r4 = r1.getInt(r0, r4)
            if (r3 == r9) goto L_0x0150
            if (r3 == r0) goto L_0x014d
            if (r3 == r2) goto L_0x014a
            r2 = r7
            goto L_0x0152
        L_0x014a:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            goto L_0x0152
        L_0x014d:
            android.graphics.Typeface r2 = android.graphics.Typeface.SERIF
            goto L_0x0152
        L_0x0150:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
        L_0x0152:
            r3 = 0
            if (r4 <= 0) goto L_0x017f
            if (r2 != 0) goto L_0x015c
            android.graphics.Typeface r2 = android.graphics.Typeface.defaultFromStyle(r4)
            goto L_0x0160
        L_0x015c:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r4)
        L_0x0160:
            r12.setSwitchTypeface(r2)
            if (r2 == 0) goto L_0x016a
            int r2 = r2.getStyle()
            goto L_0x016b
        L_0x016a:
            r2 = 0
        L_0x016b:
            int r2 = ~r2
            r2 = r2 & r4
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0172
            goto L_0x0173
        L_0x0172:
            r9 = 0
        L_0x0173:
            r10.setFakeBoldText(r9)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x017b
            r3 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x017b:
            r10.setTextSkewX(r3)
            goto L_0x0188
        L_0x017f:
            r10.setFakeBoldText(r8)
            r10.setTextSkewX(r3)
            r12.setSwitchTypeface(r2)
        L_0x0188:
            r0 = 14
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x01a8
            l.a r0 = new l.a
            android.content.Context r2 = r12.getContext()
            r0.<init>()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r0.f13055a = r2
            r12.f7526J0 = r0
            goto L_0x01aa
        L_0x01a8:
            r12.f7526J0 = r7
        L_0x01aa:
            java.lang.CharSequence r0 = r12.f7545l0
            r12.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r12.f7547n0
            r12.setTextOffInternal(r0)
            r1.recycle()
        L_0x01b7:
            o.X r0 = new o.X
            r0.<init>(r12)
            r0.f(r14, r6)
            r11.M2()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r13)
            int r0 = r13.getScaledTouchSlop()
            r12.f7550r0 = r0
            int r13 = r13.getScaledMinimumFlingVelocity()
            r12.f7554v0 = r13
            o.v r13 = r12.getEmojiTextViewHelper()
            r13.b(r14, r6)
            r12.refreshDrawableState()
            boolean r13 = r12.isChecked()
            r12.setChecked(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1298v getEmojiTextViewHelper() {
        if (this.f7528L0 == null) {
            this.f7528L0 = new C1298v(this);
        }
        return this.f7528L0;
    }

    private boolean getTargetCheckedState() {
        if (this.f7555w0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f8;
        boolean z = w1.f14104a;
        if (getLayoutDirection() == 1) {
            f8 = 1.0f - this.f7555w0;
        } else {
            f8 = this.f7555w0;
        }
        return (int) ((f8 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f7536c0;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f7530N0;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f7531U;
        if (drawable2 != null) {
            rect = C1286o0.b(drawable2);
        } else {
            rect = C1286o0.f14022c;
        }
        return ((((this.f7556x0 - this.f7558z0) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f7547n0 = charSequence;
        C1298v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod o12 = ((a) emojiTextViewHelper.f14098b.f17V).o1(this.f7526J0);
        if (o12 != null) {
            charSequence = o12.getTransformation(charSequence, this);
        }
        this.f7548o0 = charSequence;
        this.f7525I0 = null;
        if (this.p0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f7545l0 = charSequence;
        C1298v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod o12 = ((a) emojiTextViewHelper.f14098b.f17V).o1(this.f7526J0);
        if (o12 != null) {
            charSequence = o12.getTransformation(charSequence, this);
        }
        this.f7546m0 = charSequence;
        this.f7524H0 = null;
        if (this.p0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f7531U;
        if (drawable == null) {
            return;
        }
        if (this.f7534a0 || this.f7535b0) {
            Drawable mutate = e.z(drawable).mutate();
            this.f7531U = mutate;
            if (this.f7534a0) {
                mutate.setTintList(this.f7532V);
            }
            if (this.f7535b0) {
                this.f7531U.setTintMode(this.f7533W);
            }
            if (this.f7531U.isStateful()) {
                this.f7531U.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f7536c0;
        if (drawable == null) {
            return;
        }
        if (this.f7539f0 || this.f7540g0) {
            Drawable mutate = e.z(drawable).mutate();
            this.f7536c0 = mutate;
            if (this.f7539f0) {
                mutate.setTintList(this.f7537d0);
            }
            if (this.f7540g0) {
                this.f7536c0.setTintMode(this.f7538e0);
            }
            if (this.f7536c0.isStateful()) {
                this.f7536c0.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f7545l0);
        setTextOffInternal(this.f7547n0);
        requestLayout();
    }

    public final void d() {
        if (this.f7529M0 == null && ((a) this.f7528L0.f14098b.f17V).t0() && j.f7792k != null) {
            j a8 = j.a();
            int b8 = a8.b();
            if (b8 == 3 || b8 == 0) {
                h hVar = new h(this);
                this.f7529M0 = hVar;
                a8.f(hVar);
            }
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i8;
        int i9 = this.f7517A0;
        int i10 = this.f7518B0;
        int i11 = this.f7519C0;
        int i12 = this.f7520D0;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f7531U;
        if (drawable != null) {
            rect = C1286o0.b(drawable);
        } else {
            rect = C1286o0.f14022c;
        }
        Drawable drawable2 = this.f7536c0;
        Rect rect2 = this.f7530N0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i13 = rect2.left;
            thumbOffset += i13;
            if (rect != null) {
                int i14 = rect.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = rect.top;
                int i16 = rect2.top;
                if (i15 > i16) {
                    i = (i15 - i16) + i10;
                } else {
                    i = i10;
                }
                int i17 = rect.right;
                int i18 = rect2.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                    this.f7536c0.setBounds(i9, i, i11, i8);
                }
            } else {
                i = i10;
            }
            i8 = i12;
            this.f7536c0.setBounds(i9, i, i11, i8);
        }
        Drawable drawable3 = this.f7531U;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i21 = thumbOffset - rect2.left;
            int i22 = thumbOffset + this.f7558z0 + rect2.right;
            this.f7531U.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f7531U;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
        Drawable drawable2 = this.f7536c0;
        if (drawable2 != null) {
            drawable2.setHotspot(f8, f9);
        }
    }

    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7531U;
        if (drawable == null || !drawable.isStateful()) {
            z = false;
        } else {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f7536c0;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        boolean z = w1.f14104a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f7556x0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f7543j0;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        boolean z = w1.f14104a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f7556x0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f7543j0;
        }
        return compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return N7.a.y(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.p0;
    }

    public boolean getSplitTrack() {
        return this.f7544k0;
    }

    public int getSwitchMinWidth() {
        return this.f7542i0;
    }

    public int getSwitchPadding() {
        return this.f7543j0;
    }

    public CharSequence getTextOff() {
        return this.f7547n0;
    }

    public CharSequence getTextOn() {
        return this.f7545l0;
    }

    public Drawable getThumbDrawable() {
        return this.f7531U;
    }

    public final float getThumbPosition() {
        return this.f7555w0;
    }

    public int getThumbTextPadding() {
        return this.f7541h0;
    }

    public ColorStateList getThumbTintList() {
        return this.f7532V;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f7533W;
    }

    public Drawable getTrackDrawable() {
        return this.f7536c0;
    }

    public ColorStateList getTrackTintList() {
        return this.f7537d0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f7538e0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7531U;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7536c0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f7527K0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f7527K0.end();
            this.f7527K0 = null;
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7516P0);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int i;
        super.onDraw(canvas);
        Drawable drawable = this.f7536c0;
        Rect rect = this.f7530N0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i8 = this.f7518B0;
        int i9 = this.f7520D0;
        int i10 = i8 + rect.top;
        int i11 = i9 - rect.bottom;
        Drawable drawable2 = this.f7531U;
        if (drawable != null) {
            if (!this.f7544k0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b8 = C1286o0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b8.left;
                rect.right -= b8.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f7524H0;
        } else {
            staticLayout = this.f7525I0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f7523G0;
            TextPaint textPaint = this.f7522F0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (staticLayout.getWidth() / 2)), (float) (((i10 + i11) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f7545l0;
            } else {
                charSequence = this.f7547n0;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        super.onLayout(z, i, i8, i9, i10);
        int i16 = 0;
        if (this.f7531U != null) {
            Drawable drawable = this.f7536c0;
            Rect rect = this.f7530N0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b8 = C1286o0.b(this.f7531U);
            i11 = Math.max(0, b8.left - rect.left);
            i16 = Math.max(0, b8.right - rect.right);
        } else {
            i11 = 0;
        }
        boolean z6 = w1.f14104a;
        if (getLayoutDirection() == 1) {
            i13 = getPaddingLeft() + i11;
            i12 = ((this.f7556x0 + i13) - i11) - i16;
        } else {
            i12 = (getWidth() - getPaddingRight()) - i16;
            i13 = (i12 - this.f7556x0) + i11 + i16;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i17 = this.f7557y0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i17 / 2);
            int i18 = height;
            i14 = i17 + height;
            i15 = i18;
        } else if (gravity != 80) {
            i15 = getPaddingTop();
            i14 = this.f7557y0 + i15;
        } else {
            i14 = getHeight() - getPaddingBottom();
            i15 = i14 - this.f7557y0;
        }
        this.f7517A0 = i13;
        this.f7518B0 = i15;
        this.f7520D0 = i14;
        this.f7519C0 = i12;
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (this.p0) {
            StaticLayout staticLayout = this.f7524H0;
            TextPaint textPaint = this.f7522F0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f7546m0;
                if (charSequence != null) {
                    i14 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i14 = 0;
                }
                this.f7524H0 = new StaticLayout(charSequence, textPaint, i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f7525I0 == null) {
                CharSequence charSequence2 = this.f7548o0;
                if (charSequence2 != null) {
                    i13 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i13 = 0;
                }
                this.f7525I0 = new StaticLayout(charSequence2, textPaint, i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f7531U;
        Rect rect = this.f7530N0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i10 = (this.f7531U.getIntrinsicWidth() - rect.left) - rect.right;
            i9 = this.f7531U.getIntrinsicHeight();
        } else {
            i10 = 0;
            i9 = 0;
        }
        if (this.p0) {
            i11 = (this.f7541h0 * 2) + Math.max(this.f7524H0.getWidth(), this.f7525I0.getWidth());
        } else {
            i11 = 0;
        }
        this.f7558z0 = Math.max(i11, i10);
        Drawable drawable2 = this.f7536c0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f7536c0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f7531U;
        if (drawable3 != null) {
            Rect b8 = C1286o0.b(drawable3);
            i16 = Math.max(i16, b8.left);
            i17 = Math.max(i17, b8.right);
        }
        if (this.f7521E0) {
            i12 = Math.max(this.f7542i0, (this.f7558z0 * 2) + i16 + i17);
        } else {
            i12 = this.f7542i0;
        }
        int max = Math.max(i15, i9);
        this.f7556x0 = i12;
        this.f7557y0 = max;
        super.onMeasure(i, i8);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f7545l0;
        } else {
            charSequence = this.f7547n0;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 != 3) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.f7553u0
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.f7550r0
            r3 = 1
            if (r1 == 0) goto L_0x00fb
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L_0x0091
            if (r1 == r6) goto L_0x0019
            if (r1 == r4) goto L_0x0091
            goto L_0x0147
        L_0x0019:
            int r0 = r9.f7549q0
            if (r0 == r3) goto L_0x0062
            if (r0 == r6) goto L_0x0021
            goto L_0x0147
        L_0x0021:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.f7551s0
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = o.w1.f14104a
            int r0 = r9.getLayoutDirection()
            if (r0 != r3) goto L_0x0048
            float r1 = -r1
        L_0x0048:
            float r0 = r9.f7555w0
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0057
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r9.f7551s0 = r10
            r9.setThumbPosition(r5)
        L_0x0061:
            return r3
        L_0x0062:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.f7551s0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0083
            float r4 = r9.f7552t0
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0147
        L_0x0083:
            r9.f7549q0 = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.f7551s0 = r0
            r9.f7552t0 = r1
            return r3
        L_0x0091:
            int r1 = r9.f7549q0
            r2 = 0
            if (r1 != r6) goto L_0x00f5
            r9.f7549q0 = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto L_0x00a6
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L_0x00a6
            r1 = 1
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto L_0x00db
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.f7554v0
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d6
            boolean r1 = o.w1.f14104a
            int r1 = r9.getLayoutDirection()
            if (r1 != r3) goto L_0x00d1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cf
        L_0x00cd:
            r0 = 1
            goto L_0x00dc
        L_0x00cf:
            r0 = 0
            goto L_0x00dc
        L_0x00d1:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
            goto L_0x00cd
        L_0x00d6:
            boolean r0 = r9.getTargetCheckedState()
            goto L_0x00dc
        L_0x00db:
            r0 = r6
        L_0x00dc:
            if (r0 == r6) goto L_0x00e1
            r9.playSoundEffect(r2)
        L_0x00e1:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        L_0x00f5:
            r9.f7549q0 = r2
            r0.clear()
            goto L_0x0147
        L_0x00fb:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L_0x0147
            android.graphics.drawable.Drawable r4 = r9.f7531U
            if (r4 != 0) goto L_0x010e
            goto L_0x0147
        L_0x010e:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.f7531U
            android.graphics.Rect r6 = r9.f7530N0
            r5.getPadding(r6)
            int r5 = r9.f7518B0
            int r5 = r5 - r2
            int r7 = r9.f7517A0
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.f7558z0
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.f7520D0
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0147
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0147
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0147
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0147
            r9.f7549q0 = r3
            r9.f7551s0 = r0
            r9.f7552t0 = r1
        L_0x0147:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        Class<CharSequence> cls = CharSequence.class;
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f7545l0;
                if (obj == null) {
                    obj = getResources().getString(2131951623);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = C1510H.f15874a;
                new C1549v(R.id.tag_state_description, cls, 64, 30, 2).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f7547n0;
            if (obj3 == null) {
                obj3 = getResources().getString(2131951622);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = C1510H.f15874a;
            new C1549v(R.id.tag_state_description, cls, 64, 30, 2).d(this, obj4);
        }
        float f8 = 0.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f7527K0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f8 = 1.0f;
            }
            setThumbPosition(f8);
            return;
        }
        if (isChecked) {
            f8 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f7515O0, new float[]{f8});
        this.f7527K0 = ofFloat;
        ofFloat.setDuration(250);
        this.f7527K0.setAutoCancel(true);
        this.f7527K0.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(N7.a.B(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.f7545l0);
        setTextOffInternal(this.f7547n0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f7521E0 = z;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.p0 != z) {
            this.p0 = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f7544k0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f7542i0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f7543j0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f7522F0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f7547n0;
            if (obj == null) {
                obj = getResources().getString(2131951622);
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            new C1549v(R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f7545l0;
            if (obj == null) {
                obj = getResources().getString(2131951623);
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            new C1549v(R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7531U;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f7531U = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f8) {
        this.f7555w0 = f8;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0003d.r(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f7541h0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7532V = colorStateList;
        this.f7534a0 = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7533W = mode;
        this.f7535b0 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7536c0;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f7536c0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0003d.r(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7537d0 = colorStateList;
        this.f7539f0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f7538e0 = mode;
        this.f7540g0 = true;
        b();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f7531U || drawable == this.f7536c0) {
            return true;
        }
        return false;
    }
}
