package com.google.android.material.textfield;

import A.d;
import B.C0003d;
import C3.B;
import C3.C;
import C3.C0031g;
import C3.D;
import C3.E;
import C3.F;
import C3.i;
import C3.n;
import C3.p;
import C3.s;
import C3.v;
import C3.w;
import C3.z;
import D2.G;
import N7.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.material.internal.CheckableImageButton;
import g2.C0955h;
import g2.t;
import g3.C0958a;
import j0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k2.C1160q;
import m0.C1195a;
import o.C1260b0;
import o.C1286o0;
import o.C1292s;
import t0.C1414b;
import t0.C1418f;
import t3.b;
import v0.C1510H;
import w3.C1587a;
import w3.C1590d;
import z3.C1646a;
import z3.e;
import z3.g;
import z3.j;
import z3.k;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] w1 = {new int[]{16842919}, new int[0]};

    /* renamed from: A0  reason: collision with root package name */
    public CharSequence f9396A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f9397B0;

    /* renamed from: C0  reason: collision with root package name */
    public g f9398C0;

    /* renamed from: D0  reason: collision with root package name */
    public g f9399D0;

    /* renamed from: E0  reason: collision with root package name */
    public StateListDrawable f9400E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f9401F0;

    /* renamed from: G0  reason: collision with root package name */
    public g f9402G0;

    /* renamed from: H0  reason: collision with root package name */
    public g f9403H0;

    /* renamed from: I0  reason: collision with root package name */
    public k f9404I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f9405J0;

    /* renamed from: K0  reason: collision with root package name */
    public final int f9406K0;

    /* renamed from: L0  reason: collision with root package name */
    public int f9407L0;

    /* renamed from: M0  reason: collision with root package name */
    public int f9408M0;

    /* renamed from: N0  reason: collision with root package name */
    public int f9409N0;

    /* renamed from: O0  reason: collision with root package name */
    public int f9410O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f9411P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f9412Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f9413R0;

    /* renamed from: S0  reason: collision with root package name */
    public final Rect f9414S0 = new Rect();

    /* renamed from: T0  reason: collision with root package name */
    public final Rect f9415T0 = new Rect();

    /* renamed from: U  reason: collision with root package name */
    public final FrameLayout f9416U;

    /* renamed from: U0  reason: collision with root package name */
    public final RectF f9417U0 = new RectF();

    /* renamed from: V  reason: collision with root package name */
    public final B f9418V;

    /* renamed from: V0  reason: collision with root package name */
    public Typeface f9419V0;

    /* renamed from: W  reason: collision with root package name */
    public final s f9420W;

    /* renamed from: W0  reason: collision with root package name */
    public ColorDrawable f9421W0;

    /* renamed from: X0  reason: collision with root package name */
    public int f9422X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final LinkedHashSet f9423Y0 = new LinkedHashSet();

    /* renamed from: Z0  reason: collision with root package name */
    public ColorDrawable f9424Z0;

    /* renamed from: a0  reason: collision with root package name */
    public EditText f9425a0;

    /* renamed from: a1  reason: collision with root package name */
    public int f9426a1;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f9427b0;

    /* renamed from: b1  reason: collision with root package name */
    public Drawable f9428b1;

    /* renamed from: c0  reason: collision with root package name */
    public int f9429c0 = -1;

    /* renamed from: c1  reason: collision with root package name */
    public ColorStateList f9430c1;

    /* renamed from: d0  reason: collision with root package name */
    public int f9431d0 = -1;

    /* renamed from: d1  reason: collision with root package name */
    public ColorStateList f9432d1;

    /* renamed from: e0  reason: collision with root package name */
    public int f9433e0 = -1;

    /* renamed from: e1  reason: collision with root package name */
    public int f9434e1;

    /* renamed from: f0  reason: collision with root package name */
    public int f9435f0 = -1;

    /* renamed from: f1  reason: collision with root package name */
    public int f9436f1;

    /* renamed from: g0  reason: collision with root package name */
    public final w f9437g0 = new w(this);

    /* renamed from: g1  reason: collision with root package name */
    public int f9438g1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9439h0;

    /* renamed from: h1  reason: collision with root package name */
    public ColorStateList f9440h1;

    /* renamed from: i0  reason: collision with root package name */
    public int f9441i0;

    /* renamed from: i1  reason: collision with root package name */
    public int f9442i1;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f9443j0;

    /* renamed from: j1  reason: collision with root package name */
    public int f9444j1;

    /* renamed from: k0  reason: collision with root package name */
    public F f9445k0 = new B7.g(2);

    /* renamed from: k1  reason: collision with root package name */
    public int f9446k1;

    /* renamed from: l0  reason: collision with root package name */
    public C1260b0 f9447l0;

    /* renamed from: l1  reason: collision with root package name */
    public int f9448l1;

    /* renamed from: m0  reason: collision with root package name */
    public int f9449m0;

    /* renamed from: m1  reason: collision with root package name */
    public int f9450m1;

    /* renamed from: n0  reason: collision with root package name */
    public int f9451n0;

    /* renamed from: n1  reason: collision with root package name */
    public int f9452n1;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f9453o0;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f9454o1;
    public boolean p0;

    /* renamed from: p1  reason: collision with root package name */
    public final b f9455p1;

    /* renamed from: q0  reason: collision with root package name */
    public C1260b0 f9456q0;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f9457q1;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f9458r0;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f9459r1;

    /* renamed from: s0  reason: collision with root package name */
    public int f9460s0;
    public ValueAnimator s1;

    /* renamed from: t0  reason: collision with root package name */
    public C0955h f9461t0;
    public boolean t1;

    /* renamed from: u0  reason: collision with root package name */
    public C0955h f9462u0;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f9463u1;

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f9464v0;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f9465v1;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f9466w0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f9467x0;

    /* renamed from: y0  reason: collision with root package name */
    public ColorStateList f9468y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f9469z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2130969739(0x7f04048b, float:1.7548168E38)
            r9 = 2132018040(0x7f140378, float:1.9674375E38)
            r1 = r18
            android.content.Context r1 = E3.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f9429c0 = r10
            r0.f9431d0 = r10
            r0.f9433e0 = r10
            r0.f9435f0 = r10
            C3.w r1 = new C3.w
            r1.<init>(r0)
            r0.f9437g0 = r1
            B7.g r1 = new B7.g
            r2 = 2
            r1.<init>((int) r2)
            r0.f9445k0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f9414S0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f9415T0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f9417U0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f9423Y0 = r1
            t3.b r1 = new t3.b
            r1.<init>(r0)
            r0.f9455p1 = r1
            r11 = 0
            r0.f9465v1 = r11
            android.content.Context r12 = r17.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f9416U = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = g3.C0958a.f12005a
            r1.f15397Q = r2
            r1.h(r11)
            r1.f15396P = r2
            r1.h(r11)
            int r2 = r1.f15418g
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x0081
            r1.f15418g = r3
            r1.h(r11)
        L_0x0081:
            int[] r15 = f3.C0899a.f11647A
            r6 = 22
            r5 = 20
            r4 = 40
            r3 = 45
            r2 = 49
            int[] r16 = new int[]{r6, r5, r4, r3, r2}
            r1 = 2132018040(0x7f140378, float:1.9674375E38)
            t3.k.a(r12, r7, r8, r1)
            r18 = 2132018040(0x7f140378, float:1.9674375E38)
            r1 = r12
            r2 = r19
            r3 = r15
            r4 = r8
            r5 = r18
            r6 = r16
            t3.k.b(r1, r2, r3, r4, r5, r6)
            d4.k r1 = new d4.k
            r2 = 2132018040(0x7f140378, float:1.9674375E38)
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r2)
            r1.<init>((android.content.Context) r12, (android.content.res.TypedArray) r2)
            C3.B r3 = new C3.B
            r3.<init>(r0, r1)
            r0.f9418V = r3
            r4 = 48
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f9469z0 = r4
            r4 = 4
            java.lang.CharSequence r4 = r2.getText(r4)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 47
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f9459r1 = r4
            r4 = 42
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f9457q1 = r4
            r4 = 6
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00e8
            int r4 = r2.getInt(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00f6
        L_0x00e8:
            r4 = 3
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00f6
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMinWidth(r4)
        L_0x00f6:
            r4 = 5
            boolean r5 = r2.hasValue(r4)
            r6 = 2
            if (r5 == 0) goto L_0x0106
            int r4 = r2.getInt(r4, r10)
            r0.setMaxEms(r4)
            goto L_0x0113
        L_0x0106:
            boolean r4 = r2.hasValue(r6)
            if (r4 == 0) goto L_0x0113
            int r4 = r2.getDimensionPixelSize(r6, r10)
            r0.setMaxWidth(r4)
        L_0x0113:
            z3.j r4 = z3.k.b(r12, r7, r8, r9)
            z3.k r4 = r4.a()
            r0.f9404I0 = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165992(0x7f070328, float:1.7946217E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.f9406K0 = r4
            r4 = 9
            int r4 = r2.getDimensionPixelOffset(r4, r11)
            r0.f9408M0 = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165993(0x7f070329, float:1.7946219E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 16
            int r4 = r2.getDimensionPixelSize(r5, r4)
            r0.f9410O0 = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165994(0x7f07032a, float:1.794622E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 17
            int r4 = r2.getDimensionPixelSize(r5, r4)
            r0.f9411P0 = r4
            int r4 = r0.f9410O0
            r0.f9409N0 = r4
            r4 = 13
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r5)
            r7 = 12
            float r7 = r2.getDimension(r7, r5)
            r8 = 10
            float r8 = r2.getDimension(r8, r5)
            r9 = 11
            float r5 = r2.getDimension(r9, r5)
            z3.k r9 = r0.f9404I0
            z3.j r9 = r9.e()
            r15 = 0
            int r16 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r16 < 0) goto L_0x0188
            z3.a r6 = new z3.a
            r6.<init>(r4)
            r9.e = r6
        L_0x0188:
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x0193
            z3.a r4 = new z3.a
            r4.<init>(r7)
            r9.f16495f = r4
        L_0x0193:
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x019e
            z3.a r4 = new z3.a
            r4.<init>(r8)
            r9.f16496g = r4
        L_0x019e:
            int r4 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x01a9
            z3.a r4 = new z3.a
            r4.<init>(r5)
            r9.f16497h = r4
        L_0x01a9:
            z3.k r4 = r9.a()
            r0.f9404I0 = r4
            r4 = 7
            android.content.res.ColorStateList r4 = com.bumptech.glide.c.l(r12, r1, r4)
            if (r4 == 0) goto L_0x020f
            int r5 = r4.getDefaultColor()
            r0.f9442i1 = r5
            r0.f9413R0 = r5
            boolean r5 = r4.isStateful()
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01ef
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f9444j1 = r5
            r5 = 16842908(0x101009c, float:2.3693995E-38)
            r7 = 16842910(0x101009e, float:2.3694E-38)
            int[] r5 = new int[]{r5, r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f9446k1 = r5
            int[] r5 = new int[]{r6, r7}
            int r4 = r4.getColorForState(r5, r10)
            r0.f9448l1 = r4
            goto L_0x0219
        L_0x01ef:
            int r4 = r0.f9442i1
            r0.f9446k1 = r4
            r4 = 2131100399(0x7f0602ef, float:1.7813178E38)
            android.content.res.ColorStateList r4 = j0.f.c(r12, r4)
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f9444j1 = r5
            int[] r5 = new int[]{r6}
            int r4 = r4.getColorForState(r5, r10)
            r0.f9448l1 = r4
            goto L_0x0219
        L_0x020f:
            r0.f9413R0 = r11
            r0.f9442i1 = r11
            r0.f9444j1 = r11
            r0.f9446k1 = r11
            r0.f9448l1 = r11
        L_0x0219:
            boolean r4 = r2.hasValue(r13)
            if (r4 == 0) goto L_0x0227
            android.content.res.ColorStateList r4 = r1.v(r13)
            r0.f9432d1 = r4
            r0.f9430c1 = r4
        L_0x0227:
            r4 = 14
            android.content.res.ColorStateList r5 = com.bumptech.glide.c.l(r12, r1, r4)
            int r4 = r2.getColor(r4, r11)
            r0.f9438g1 = r4
            r4 = 2131100426(0x7f06030a, float:1.7813233E38)
            int r4 = j0.f.b(r12, r4)
            r0.f9434e1 = r4
            r4 = 2131100427(0x7f06030b, float:1.7813235E38)
            int r4 = j0.f.b(r12, r4)
            r0.f9450m1 = r4
            r4 = 2131100430(0x7f06030e, float:1.7813241E38)
            int r4 = j0.f.b(r12, r4)
            r0.f9436f1 = r4
            if (r5 == 0) goto L_0x0253
            r0.setBoxStrokeColorStateList(r5)
        L_0x0253:
            r4 = 15
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0262
            android.content.res.ColorStateList r4 = com.bumptech.glide.c.l(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x0262:
            r4 = 49
            int r5 = r2.getResourceId(r4, r10)
            if (r5 == r10) goto L_0x0271
            int r4 = r2.getResourceId(r4, r11)
            r0.setHintTextAppearance(r4)
        L_0x0271:
            r4 = 24
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.f9467x0 = r4
            r4 = 25
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.f9468y0 = r4
            r4 = 40
            int r4 = r2.getResourceId(r4, r11)
            r5 = 35
            java.lang.CharSequence r5 = r2.getText(r5)
            r6 = 34
            int r6 = r2.getInt(r6, r13)
            r7 = 36
            boolean r7 = r2.getBoolean(r7, r11)
            r8 = 45
            int r8 = r2.getResourceId(r8, r11)
            r9 = 44
            boolean r9 = r2.getBoolean(r9, r11)
            r12 = 43
            java.lang.CharSequence r12 = r2.getText(r12)
            r15 = 57
            int r15 = r2.getResourceId(r15, r11)
            r13 = 56
            java.lang.CharSequence r13 = r2.getText(r13)
            r10 = 18
            boolean r10 = r2.getBoolean(r10, r11)
            r11 = 19
            r19 = r12
            r12 = -1
            int r11 = r2.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            r11 = 0
            r12 = 22
            int r12 = r2.getResourceId(r12, r11)
            r0.f9451n0 = r12
            r12 = 20
            int r12 = r2.getResourceId(r12, r11)
            r0.f9449m0 = r12
            r12 = 8
            int r12 = r2.getInt(r12, r11)
            r0.setBoxBackgroundMode(r12)
            r0.setErrorContentDescription(r5)
            r0.setErrorAccessibilityLiveRegion(r6)
            int r5 = r0.f9449m0
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r4)
            int r4 = r0.f9451n0
            r0.setCounterTextAppearance(r4)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r15)
            r4 = 41
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x030e
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.setErrorTextColor(r4)
        L_0x030e:
            r4 = 46
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x031d
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.setHelperTextColor(r4)
        L_0x031d:
            r4 = 50
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x032c
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.setHintTextColor(r4)
        L_0x032c:
            r4 = 23
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x033b
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.setCounterTextColor(r4)
        L_0x033b:
            r4 = 21
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x034a
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.setCounterOverflowTextColor(r4)
        L_0x034a:
            r4 = 58
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0359
            android.content.res.ColorStateList r4 = r1.v(r4)
            r0.setPlaceholderTextColor(r4)
        L_0x0359:
            C3.s r4 = new C3.s
            r4.<init>(r0, r1)
            r0.f9420W = r4
            r5 = 0
            r6 = 1
            boolean r2 = r2.getBoolean(r5, r6)
            r1.M2()
            r1 = 2
            r0.setImportantForAccessibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r1 < r5) goto L_0x0378
            if (r1 < r5) goto L_0x0378
            v0.C1504B.b(r0, r6)
        L_0x0378:
            r14.addView(r3)
            r14.addView(r4)
            r0.addView(r14)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r10)
            r1 = r19
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.f9425a0;
        if (!(editText instanceof AutoCompleteTextView) || c.q(editText)) {
            return this.f9398C0;
        }
        int o2 = D7.b.o(this.f9425a0, 2130968816);
        int i8 = this.f9407L0;
        int[][] iArr = w1;
        if (i8 == 2) {
            Context context = getContext();
            g gVar = this.f9398C0;
            TypedValue D8 = android.support.v4.media.session.b.D(2130968856, context, "TextInputLayout");
            int i9 = D8.resourceId;
            if (i9 != 0) {
                i = f.b(context, i9);
            } else {
                i = D8.data;
            }
            g gVar2 = new g(gVar.f16469U.f16454a);
            int F8 = D7.b.F(0.1f, o2, i);
            gVar2.j(new ColorStateList(iArr, new int[]{F8, 0}));
            gVar2.setTint(i);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{F8, i});
            g gVar3 = new g(gVar.f16469U.f16454a);
            gVar3.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else if (i8 != 1) {
            return null;
        } else {
            g gVar4 = this.f9398C0;
            int i10 = this.f9413R0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{D7.b.F(0.1f, o2, i10), i10}), gVar4, gVar4);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f9400E0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f9400E0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f9400E0.addState(new int[0], f(false));
        }
        return this.f9400E0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f9399D0 == null) {
            this.f9399D0 = f(true);
        }
        return this.f9399D0;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f9425a0 == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f9425a0 = editText;
            int i = this.f9429c0;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f9433e0);
            }
            int i8 = this.f9431d0;
            if (i8 != -1) {
                setMaxEms(i8);
            } else {
                setMaxWidth(this.f9435f0);
            }
            this.f9401F0 = false;
            i();
            setTextInputAccessibilityDelegate(new E(this));
            Typeface typeface = this.f9425a0.getTypeface();
            b bVar = this.f9455p1;
            bVar.m(typeface);
            float textSize = this.f9425a0.getTextSize();
            if (bVar.f15419h != textSize) {
                bVar.f15419h = textSize;
                bVar.h(false);
            }
            int i9 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f9425a0.getLetterSpacing();
            if (bVar.f15403W != letterSpacing) {
                bVar.f15403W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.f9425a0.getGravity();
            int i10 = (gravity & -113) | 48;
            if (bVar.f15418g != i10) {
                bVar.f15418g = i10;
                bVar.h(false);
            }
            if (bVar.f15416f != gravity) {
                bVar.f15416f = gravity;
                bVar.h(false);
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            this.f9452n1 = editText.getMinimumHeight();
            this.f9425a0.addTextChangedListener(new C(this, editText));
            if (this.f9430c1 == null) {
                this.f9430c1 = this.f9425a0.getHintTextColors();
            }
            if (this.f9469z0) {
                if (TextUtils.isEmpty(this.f9396A0)) {
                    CharSequence hint = this.f9425a0.getHint();
                    this.f9427b0 = hint;
                    setHint(hint);
                    this.f9425a0.setHint((CharSequence) null);
                }
                this.f9397B0 = true;
            }
            if (i9 >= 29) {
                p();
            }
            if (this.f9447l0 != null) {
                n(this.f9425a0.getText());
            }
            r();
            this.f9437g0.b();
            this.f9418V.bringToFront();
            s sVar = this.f9420W;
            sVar.bringToFront();
            Iterator it = this.f9423Y0.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(this);
            }
            sVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f9396A0)) {
            this.f9396A0 = charSequence;
            b bVar = this.f9455p1;
            if (charSequence == null || !TextUtils.equals(bVar.f15381A, charSequence)) {
                bVar.f15381A = charSequence;
                bVar.f15382B = null;
                Bitmap bitmap = bVar.f15385E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f15385E = null;
                }
                bVar.h(false);
            }
            if (!this.f9454o1) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.p0 != z) {
            if (z) {
                C1260b0 b0Var = this.f9456q0;
                if (b0Var != null) {
                    this.f9416U.addView(b0Var);
                    this.f9456q0.setVisibility(0);
                }
            } else {
                C1260b0 b0Var2 = this.f9456q0;
                if (b0Var2 != null) {
                    b0Var2.setVisibility(8);
                }
                this.f9456q0 = null;
            }
            this.p0 = z;
        }
    }

    public final void a(float f8) {
        b bVar = this.f9455p1;
        if (bVar.f15409b != f8) {
            if (this.s1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.s1 = valueAnimator;
                valueAnimator.setInterpolator(C0003d.J(getContext(), 2130969407, C0958a.f12006b));
                this.s1.setDuration((long) C0003d.I(getContext(), 2130969397, 167));
                this.s1.addUpdateListener(new D(0, this));
            }
            this.s1.setFloatValues(new float[]{bVar.f15409b, f8});
            this.s1.start();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f9416U;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        ColorStateList colorStateList;
        int i;
        int i8;
        g gVar = this.f9398C0;
        if (gVar != null) {
            k kVar = gVar.f16469U.f16454a;
            k kVar2 = this.f9404I0;
            if (kVar != kVar2) {
                gVar.setShapeAppearanceModel(kVar2);
            }
            if (this.f9407L0 == 2 && (i = this.f9409N0) > -1 && (i8 = this.f9412Q0) != 0) {
                g gVar2 = this.f9398C0;
                gVar2.f16469U.f16461j = (float) i;
                gVar2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i8);
                z3.f fVar = gVar2.f16469U;
                if (fVar.f16457d != valueOf) {
                    fVar.f16457d = valueOf;
                    gVar2.onStateChange(gVar2.getState());
                }
            }
            int i9 = this.f9413R0;
            if (this.f9407L0 == 1) {
                i9 = C1195a.b(this.f9413R0, D7.b.n(getContext(), 2130968856, 0));
            }
            this.f9413R0 = i9;
            this.f9398C0.j(ColorStateList.valueOf(i9));
            g gVar3 = this.f9402G0;
            if (!(gVar3 == null || this.f9403H0 == null)) {
                if (this.f9409N0 > -1 && this.f9412Q0 != 0) {
                    if (this.f9425a0.isFocused()) {
                        colorStateList = ColorStateList.valueOf(this.f9434e1);
                    } else {
                        colorStateList = ColorStateList.valueOf(this.f9412Q0);
                    }
                    gVar3.j(colorStateList);
                    this.f9403H0.j(ColorStateList.valueOf(this.f9412Q0));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float d8;
        if (!this.f9469z0) {
            return 0;
        }
        int i = this.f9407L0;
        b bVar = this.f9455p1;
        if (i == 0) {
            d8 = bVar.d();
        } else if (i != 2) {
            return 0;
        } else {
            d8 = bVar.d() / 2.0f;
        }
        return (int) d8;
    }

    public final C0955h d() {
        C0955h hVar = new C0955h();
        hVar.f11969W = (long) C0003d.I(getContext(), 2130969399, 87);
        hVar.f11970X = C0003d.J(getContext(), 2130969409, C0958a.f12005a);
        return hVar;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f9425a0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f9427b0 != null) {
            boolean z = this.f9397B0;
            this.f9397B0 = false;
            CharSequence hint = editText.getHint();
            this.f9425a0.setHint(this.f9427b0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f9425a0.setHint(hint);
                this.f9397B0 = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.f9416U;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i8 = 0; i8 < frameLayout.getChildCount(); i8++) {
                View childAt = frameLayout.getChildAt(i8);
                ViewStructure newChild = viewStructure.newChild(i8);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f9425a0) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f9463u1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f9463u1 = false;
    }

    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f9469z0;
        b bVar = this.f9455p1;
        if (z) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f15382B != null) {
                RectF rectF = bVar.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f15394N;
                    textPaint.setTextSize(bVar.f15387G);
                    float f8 = bVar.f15426p;
                    float f9 = bVar.f15427q;
                    float f10 = bVar.f15386F;
                    if (f10 != 1.0f) {
                        canvas2.scale(f10, f10, f8, f9);
                    }
                    if (bVar.f15414d0 <= 1 || bVar.f15383C) {
                        canvas2.translate(f8, f9);
                        bVar.f15405Y.draw(canvas2);
                    } else {
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(bVar.f15426p - ((float) bVar.f15405Y.getLineStart(0)), f9);
                        float f11 = (float) alpha;
                        textPaint.setAlpha((int) (bVar.f15410b0 * f11));
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31) {
                            float f12 = bVar.f15388H;
                            float f13 = bVar.f15389I;
                            float f14 = bVar.f15390J;
                            int i9 = bVar.f15391K;
                            textPaint.setShadowLayer(f12, f13, f14, C1195a.d(i9, (textPaint.getAlpha() * Color.alpha(i9)) / 255));
                        }
                        bVar.f15405Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f15408a0 * f11));
                        if (i8 >= 31) {
                            float f15 = bVar.f15388H;
                            float f16 = bVar.f15389I;
                            float f17 = bVar.f15390J;
                            int i10 = bVar.f15391K;
                            textPaint.setShadowLayer(f15, f16, f17, C1195a.d(i10, (Color.alpha(i10) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f15405Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f15412c0;
                        float f18 = (float) lineBaseline;
                        float f19 = f18;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f18, textPaint);
                        if (i8 >= 31) {
                            textPaint.setShadowLayer(bVar.f15388H, bVar.f15389I, bVar.f15390J, bVar.f15391K);
                        }
                        String trim = bVar.f15412c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f15405Y.getLineEnd(i), str.length()), 0.0f, f19, textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f9403H0 != null && (gVar = this.f9402G0) != null) {
            gVar.draw(canvas2);
            if (this.f9425a0.isFocused()) {
                Rect bounds = this.f9403H0.getBounds();
                Rect bounds2 = this.f9402G0.getBounds();
                float f20 = bVar.f15409b;
                int centerX = bounds2.centerX();
                bounds.left = C0958a.c(f20, centerX, bounds2.left);
                bounds.right = C0958a.c(f20, centerX, bounds2.right);
                this.f9403H0.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.t1
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.t1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            t3.b r3 = r4.f9455p1
            if (r3 == 0) goto L_0x002f
            r3.f15392L = r1
            android.content.res.ColorStateList r1 = r3.f15421k
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f15420j
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.h(r2)
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            android.widget.EditText r3 = r4.f9425a0
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = v0.C1510H.f15874a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.t1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (!this.f9469z0 || TextUtils.isEmpty(this.f9396A0) || !(this.f9398C0 instanceof i)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.bumptech.glide.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.bumptech.glide.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [com.bumptech.glide.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [com.bumptech.glide.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, z3.k] */
    public final g f(boolean z) {
        float f8;
        float f9;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(2131165966);
        if (z) {
            f8 = dimensionPixelOffset;
        } else {
            f8 = 0.0f;
        }
        EditText editText = this.f9425a0;
        if (editText instanceof z) {
            f9 = ((z) editText).getPopupElevation();
        } else {
            f9 = (float) getResources().getDimensionPixelOffset(2131165558);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131165903);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        e eVar4 = new e(0);
        C1646a aVar = new C1646a(f8);
        C1646a aVar2 = new C1646a(f8);
        C1646a aVar3 = new C1646a(dimensionPixelOffset);
        C1646a aVar4 = new C1646a(dimensionPixelOffset);
        ? obj5 = new Object();
        obj5.f16501a = obj;
        obj5.f16502b = obj2;
        obj5.f16503c = obj3;
        obj5.f16504d = obj4;
        obj5.e = aVar;
        obj5.f16505f = aVar2;
        obj5.f16506g = aVar4;
        obj5.f16507h = aVar3;
        obj5.i = eVar;
        obj5.f16508j = eVar2;
        obj5.f16509k = eVar3;
        obj5.f16510l = eVar4;
        EditText editText2 = this.f9425a0;
        if (editText2 instanceof z) {
            colorStateList = ((z) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g.f16468q0;
            TypedValue D8 = android.support.v4.media.session.b.D(2130968856, context, g.class.getSimpleName());
            int i8 = D8.resourceId;
            if (i8 != 0) {
                i = f.b(context, i8);
            } else {
                i = D8.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(colorStateList);
        gVar.i(f9);
        gVar.setShapeAppearanceModel(obj5);
        z3.f fVar = gVar.f16469U;
        if (fVar.f16459g == null) {
            fVar.f16459g = new Rect();
        }
        gVar.f16469U.f16459g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z && getPrefixText() != null) {
            compoundPaddingLeft = this.f9418V.a();
        } else if (!z || getSuffixText() == null) {
            compoundPaddingLeft = this.f9425a0.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.f9420W.c();
        }
        return compoundPaddingLeft + i;
    }

    public int getBaseline() {
        EditText editText = this.f9425a0;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f9407L0;
        if (i == 1 || i == 2) {
            return this.f9398C0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f9413R0;
    }

    public int getBoxBackgroundMode() {
        return this.f9407L0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f9408M0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e = t3.k.e(this);
        RectF rectF = this.f9417U0;
        if (e) {
            return this.f9404I0.f16507h.a(rectF);
        }
        return this.f9404I0.f16506g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e = t3.k.e(this);
        RectF rectF = this.f9417U0;
        if (e) {
            return this.f9404I0.f16506g.a(rectF);
        }
        return this.f9404I0.f16507h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e = t3.k.e(this);
        RectF rectF = this.f9417U0;
        if (e) {
            return this.f9404I0.e.a(rectF);
        }
        return this.f9404I0.f16505f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e = t3.k.e(this);
        RectF rectF = this.f9417U0;
        if (e) {
            return this.f9404I0.f16505f.a(rectF);
        }
        return this.f9404I0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f9438g1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f9440h1;
    }

    public int getBoxStrokeWidth() {
        return this.f9410O0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f9411P0;
    }

    public int getCounterMaxLength() {
        return this.f9441i0;
    }

    public CharSequence getCounterOverflowDescription() {
        C1260b0 b0Var;
        if (!this.f9439h0 || !this.f9443j0 || (b0Var = this.f9447l0) == null) {
            return null;
        }
        return b0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f9466w0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f9464v0;
    }

    public ColorStateList getCursorColor() {
        return this.f9467x0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f9468y0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f9430c1;
    }

    public EditText getEditText() {
        return this.f9425a0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9420W.f625d0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9420W.f625d0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f9420W.f631j0;
    }

    public int getEndIconMode() {
        return this.f9420W.f627f0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f9420W.f632k0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f9420W.f625d0;
    }

    public CharSequence getError() {
        w wVar = this.f9437g0;
        if (wVar.f665q) {
            return wVar.f664p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f9437g0.f668t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f9437g0.f667s;
    }

    public int getErrorCurrentTextColors() {
        C1260b0 b0Var = this.f9437g0.f666r;
        if (b0Var != null) {
            return b0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f9420W.f621W.getDrawable();
    }

    public CharSequence getHelperText() {
        w wVar = this.f9437g0;
        if (wVar.f672x) {
            return wVar.f671w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1260b0 b0Var = this.f9437g0.f673y;
        if (b0Var != null) {
            return b0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f9469z0) {
            return this.f9396A0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f9455p1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f9455p1;
        return bVar.e(bVar.f15421k);
    }

    public ColorStateList getHintTextColor() {
        return this.f9432d1;
    }

    public F getLengthCounter() {
        return this.f9445k0;
    }

    public int getMaxEms() {
        return this.f9431d0;
    }

    public int getMaxWidth() {
        return this.f9435f0;
    }

    public int getMinEms() {
        return this.f9429c0;
    }

    public int getMinWidth() {
        return this.f9433e0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9420W.f625d0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9420W.f625d0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.p0) {
            return this.f9453o0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f9460s0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f9458r0;
    }

    public CharSequence getPrefixText() {
        return this.f9418V.f558W;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f9418V.f557V.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f9418V.f557V;
    }

    public k getShapeAppearanceModel() {
        return this.f9404I0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f9418V.f559a0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f9418V.f559a0.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f9418V.f562d0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f9418V.f563e0;
    }

    public CharSequence getSuffixText() {
        return this.f9420W.f634m0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f9420W.f635n0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f9420W.f635n0;
    }

    public Typeface getTypeface() {
        return this.f9419V0;
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (!z && getSuffixText() != null) {
            compoundPaddingRight = this.f9420W.c();
        } else if (!z || getPrefixText() == null) {
            compoundPaddingRight = this.f9425a0.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.f9418V.a();
        }
        return i - compoundPaddingRight;
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [C3.i, z3.g] */
    public final void i() {
        int i = this.f9407L0;
        if (i == 0) {
            this.f9398C0 = null;
            this.f9402G0 = null;
            this.f9403H0 = null;
        } else if (i == 1) {
            this.f9398C0 = new g(this.f9404I0);
            this.f9402G0 = new g();
            this.f9403H0 = new g();
        } else if (i == 2) {
            if (!this.f9469z0 || (this.f9398C0 instanceof i)) {
                this.f9398C0 = new g(this.f9404I0);
            } else {
                k kVar = this.f9404I0;
                int i8 = i.f590s0;
                if (kVar == null) {
                    kVar = new k();
                }
                C0031g gVar = new C0031g(kVar, new RectF());
                ? gVar2 = new g((z3.f) gVar);
                gVar2.f591r0 = gVar;
                this.f9398C0 = gVar2;
            }
            this.f9402G0 = null;
            this.f9403H0 = null;
        } else {
            throw new IllegalArgumentException(N.e.z(new StringBuilder(), this.f9407L0, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        s();
        x();
        if (this.f9407L0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f9408M0 = getResources().getDimensionPixelSize(2131165798);
            } else if (c.r(getContext())) {
                this.f9408M0 = getResources().getDimensionPixelSize(2131165797);
            }
        }
        if (this.f9425a0 != null && this.f9407L0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f9425a0;
                WeakHashMap weakHashMap = C1510H.f15874a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(2131165796), this.f9425a0.getPaddingEnd(), getResources().getDimensionPixelSize(2131165795));
            } else if (c.r(getContext())) {
                EditText editText2 = this.f9425a0;
                WeakHashMap weakHashMap2 = C1510H.f15874a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(2131165794), this.f9425a0.getPaddingEnd(), getResources().getDimensionPixelSize(2131165793));
            }
        }
        if (this.f9407L0 != 0) {
            t();
        }
        EditText editText3 = this.f9425a0;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i9 = this.f9407L0;
                if (i9 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i9 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.f9425a0
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.f9425a0
            int r1 = r1.getGravity()
            t3.b r2 = r12.f9455p1
            java.lang.CharSequence r3 = r2.f15381A
            boolean r3 = r2.b(r3)
            r2.f15383C = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.f15413d
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0044
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f15406Z
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
        L_0x0042:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
            goto L_0x0042
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f15406Z
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.f15406Z
            float r10 = r10 / r5
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f9417U0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0081
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            boolean r0 = r2.f15383C
            if (r0 == 0) goto L_0x007d
            int r0 = r9.right
        L_0x007b:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007d:
            float r0 = r2.f15406Z
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0081:
            boolean r0 = r2.f15383C
            if (r0 == 0) goto L_0x008a
            float r0 = r2.f15406Z
            float r3 = r3 + r0
            r0 = r3
            goto L_0x0093
        L_0x008a:
            int r0 = r9.right
            goto L_0x007b
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.f15406Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.f9406K0
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.f9409N0
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            z3.g r0 = r12.f9398C0
            C3.i r0 = (C3.i) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.n(r1, r2, r3, r4)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(C1260b0 b0Var, int i) {
        try {
            a.v(b0Var, i);
            if (Build.VERSION.SDK_INT < 23 || b0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        a.v(b0Var, 2132017611);
        b0Var.setTextColor(f.b(getContext(), 2131099747));
    }

    public final boolean m() {
        w wVar = this.f9437g0;
        if (wVar.f663o != 1 || wVar.f666r == null || TextUtils.isEmpty(wVar.f664p)) {
            return false;
        }
        return true;
    }

    public final void n(Editable editable) {
        int i;
        boolean z;
        int i8;
        C1414b bVar;
        ((B7.g) this.f9445k0).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z6 = this.f9443j0;
        int i9 = this.f9441i0;
        String str = null;
        if (i9 == -1) {
            this.f9447l0.setText(String.valueOf(i));
            this.f9447l0.setContentDescription((CharSequence) null);
            this.f9443j0 = false;
        } else {
            if (i > i9) {
                z = true;
            } else {
                z = false;
            }
            this.f9443j0 = z;
            Context context = getContext();
            C1260b0 b0Var = this.f9447l0;
            int i10 = this.f9441i0;
            if (this.f9443j0) {
                i8 = 2131951668;
            } else {
                i8 = 2131951667;
            }
            b0Var.setContentDescription(context.getString(i8, new Object[]{Integer.valueOf(i), Integer.valueOf(i10)}));
            if (z6 != this.f9443j0) {
                o();
            }
            String str2 = C1414b.f15169b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = C1414b.e;
            } else {
                bVar = C1414b.f15171d;
            }
            C1260b0 b0Var2 = this.f9447l0;
            String string = getContext().getString(2131951669, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f9441i0)});
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                G g8 = C1418f.f15178a;
                str = bVar.c(string).toString();
            }
            b0Var2.setText(str);
        }
        if (this.f9425a0 != null && z6 != this.f9443j0) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1260b0 b0Var = this.f9447l0;
        if (b0Var != null) {
            if (this.f9443j0) {
                i = this.f9449m0;
            } else {
                i = this.f9451n0;
            }
            l(b0Var, i);
            if (!this.f9443j0 && (colorStateList2 = this.f9464v0) != null) {
                this.f9447l0.setTextColor(colorStateList2);
            }
            if (this.f9443j0 && (colorStateList = this.f9466w0) != null) {
                this.f9447l0.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9455p1.g(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        s sVar = this.f9420W;
        sVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f9465v1 = false;
        if (this.f9425a0 != null && this.f9425a0.getMeasuredHeight() < (max = Math.max(sVar.getMeasuredHeight(), this.f9418V.getMeasuredHeight()))) {
            this.f9425a0.setMinimumHeight(max);
            z = true;
        }
        boolean q7 = q();
        if (z || q7) {
            this.f9425a0.post(new d(8, this));
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        super.onLayout(z, i, i8, i9, i10);
        EditText editText = this.f9425a0;
        if (editText != null) {
            ThreadLocal threadLocal = t3.c.f15436a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f9414S0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = t3.c.f15436a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            t3.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = t3.c.f15437b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f9402G0;
            if (gVar != null) {
                int i13 = rect.bottom;
                gVar.setBounds(rect.left, i13 - this.f9410O0, rect.right, i13);
            }
            g gVar2 = this.f9403H0;
            if (gVar2 != null) {
                int i14 = rect.bottom;
                gVar2.setBounds(rect.left, i14 - this.f9411P0, rect.right, i14);
            }
            if (this.f9469z0) {
                float textSize = this.f9425a0.getTextSize();
                b bVar = this.f9455p1;
                if (bVar.f15419h != textSize) {
                    bVar.f15419h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f9425a0.getGravity();
                int i15 = (gravity & -113) | 48;
                if (bVar.f15418g != i15) {
                    bVar.f15418g = i15;
                    bVar.h(false);
                }
                if (bVar.f15416f != gravity) {
                    bVar.f15416f = gravity;
                    bVar.h(false);
                }
                if (this.f9425a0 != null) {
                    boolean e = t3.k.e(this);
                    int i16 = rect.bottom;
                    Rect rect2 = this.f9415T0;
                    rect2.bottom = i16;
                    int i17 = this.f9407L0;
                    if (i17 == 1) {
                        rect2.left = g(rect.left, e);
                        rect2.top = rect.top + this.f9408M0;
                        rect2.right = h(rect.right, e);
                    } else if (i17 != 2) {
                        rect2.left = g(rect.left, e);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, e);
                    } else {
                        rect2.left = this.f9425a0.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.f9425a0.getPaddingRight();
                    }
                    int i18 = rect2.left;
                    int i19 = rect2.top;
                    int i20 = rect2.right;
                    int i21 = rect2.bottom;
                    Rect rect3 = bVar.f15413d;
                    if (!(rect3.left == i18 && rect3.top == i19 && rect3.right == i20 && rect3.bottom == i21)) {
                        rect3.set(i18, i19, i20, i21);
                        bVar.f15393M = true;
                    }
                    if (this.f9425a0 != null) {
                        TextPaint textPaint = bVar.f15395O;
                        textPaint.setTextSize(bVar.f15419h);
                        textPaint.setTypeface(bVar.f15431u);
                        textPaint.setLetterSpacing(bVar.f15403W);
                        float f8 = -textPaint.ascent();
                        rect2.left = this.f9425a0.getCompoundPaddingLeft() + rect.left;
                        if (this.f9407L0 != 1 || this.f9425a0.getMinLines() > 1) {
                            i11 = rect.top + this.f9425a0.getCompoundPaddingTop();
                        } else {
                            i11 = (int) (((float) rect.centerY()) - (f8 / 2.0f));
                        }
                        rect2.top = i11;
                        rect2.right = rect.right - this.f9425a0.getCompoundPaddingRight();
                        if (this.f9407L0 != 1 || this.f9425a0.getMinLines() > 1) {
                            i12 = rect.bottom - this.f9425a0.getCompoundPaddingBottom();
                        } else {
                            i12 = (int) (((float) rect2.top) + f8);
                        }
                        rect2.bottom = i12;
                        int i22 = rect2.left;
                        int i23 = rect2.top;
                        int i24 = rect2.right;
                        Rect rect4 = bVar.f15411c;
                        if (!(rect4.left == i22 && rect4.top == i23 && rect4.right == i24 && rect4.bottom == i12)) {
                            rect4.set(i22, i23, i24, i12);
                            bVar.f15393M = true;
                        }
                        bVar.h(false);
                        if (e() && !this.f9454o1) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i8) {
        EditText editText;
        super.onMeasure(i, i8);
        boolean z = this.f9465v1;
        s sVar = this.f9420W;
        if (!z) {
            sVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f9465v1 = true;
        }
        if (!(this.f9456q0 == null || (editText = this.f9425a0) == null)) {
            this.f9456q0.setGravity(editText.getGravity());
            this.f9456q0.setPadding(this.f9425a0.getCompoundPaddingLeft(), this.f9425a0.getCompoundPaddingTop(), this.f9425a0.getCompoundPaddingRight(), this.f9425a0.getCompoundPaddingBottom());
        }
        sVar.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3.G)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3.G g8 = (C3.G) parcelable;
        super.onRestoreInstanceState(g8.f367U);
        setError(g8.f572W);
        if (g8.f573X) {
            post(new C0.e(1, this));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, z3.k] */
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.f9405J0) {
            z3.c cVar = this.f9404I0.e;
            RectF rectF = this.f9417U0;
            float a8 = cVar.a(rectF);
            float a9 = this.f9404I0.f16505f.a(rectF);
            float a10 = this.f9404I0.f16507h.a(rectF);
            float a11 = this.f9404I0.f16506g.a(rectF);
            k kVar = this.f9404I0;
            c cVar2 = kVar.f16501a;
            c cVar3 = kVar.f16502b;
            c cVar4 = kVar.f16504d;
            c cVar5 = kVar.f16503c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(cVar3);
            j.b(cVar2);
            j.b(cVar5);
            j.b(cVar4);
            C1646a aVar = new C1646a(a9);
            C1646a aVar2 = new C1646a(a8);
            C1646a aVar3 = new C1646a(a11);
            C1646a aVar4 = new C1646a(a10);
            ? obj = new Object();
            obj.f16501a = cVar3;
            obj.f16502b = cVar2;
            obj.f16503c = cVar4;
            obj.f16504d = cVar5;
            obj.e = aVar;
            obj.f16505f = aVar2;
            obj.f16506g = aVar4;
            obj.f16507h = aVar3;
            obj.i = eVar;
            obj.f16508j = eVar2;
            obj.f16509k = eVar3;
            obj.f16510l = eVar4;
            this.f9405J0 = z;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, C3.G, B0.b] */
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ? bVar = new B0.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f572W = getError();
        }
        s sVar = this.f9420W;
        if (sVar.f627f0 == 0 || !sVar.f625d0.f9354a0) {
            z = false;
        } else {
            z = true;
        }
        bVar.f573X = z;
        return bVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f9467x0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue B8 = android.support.v4.media.session.b.B(context, 2130968815);
            if (B8 != null) {
                int i = B8.resourceId;
                if (i != 0) {
                    colorStateList2 = f.c(context, i);
                } else {
                    int i8 = B8.data;
                    if (i8 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i8);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f9425a0;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = E.e.z(this.f9425a0.getTextCursorDrawable()).mutate();
            if ((m() || (this.f9447l0 != null && this.f9443j0)) && (colorStateList = this.f9468y0) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f9425a0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            C3.B r0 = r10.f9418V
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f9425a0
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f9421W0
            if (r6 == 0) goto L_0x003b
            int r6 = r10.f9422X0
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f9421W0 = r6
            r10.f9422X0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.f9425a0
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f9421W0
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.f9425a0
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.f9421W0
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.f9425a0
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f9425a0
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.f9421W0 = r2
        L_0x0076:
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            C3.s r6 = r10.f9420W
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.f627f0
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.f634m0
            if (r7 == 0) goto L_0x0110
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x0110
            o.b0 r7 = r6.f635n0
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.f9425a0
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.f621W
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.f627f0
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.f625d0
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.f9425a0
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.f9424Z0
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.f9426a1
            if (r8 == r7) goto L_0x00eb
            r10.f9426a1 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.f9425a0
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f9424Z0
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            goto L_0x010e
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f9424Z0 = r6
            r10.f9426a1 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f9424Z0
            if (r3 == r6) goto L_0x010d
            r10.f9428b1 = r3
            android.widget.EditText r0 = r10.f9425a0
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            goto L_0x010e
        L_0x010d:
            r5 = r0
        L_0x010e:
            r0 = r5
            goto L_0x0132
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.f9424Z0
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.f9425a0
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f9424Z0
            if (r3 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.f9425a0
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f9428b1
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012f
        L_0x012e:
            r5 = r0
        L_0x012f:
            r10.f9424Z0 = r2
            goto L_0x010e
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        C1260b0 b0Var;
        EditText editText = this.f9425a0;
        if (editText != null && this.f9407L0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = C1286o0.f14020a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(C1292s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f9443j0 || (b0Var = this.f9447l0) == null) {
                E.e.d(mutate);
                this.f9425a0.refreshDrawableState();
            } else {
                mutate.setColorFilter(C1292s.c(b0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.f9425a0;
        if (editText != null && this.f9398C0 != null) {
            if ((this.f9401F0 || editText.getBackground() == null) && this.f9407L0 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f9425a0;
                WeakHashMap weakHashMap = C1510H.f15874a;
                editText2.setBackground(editTextBoxBackground);
                this.f9401F0 = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f9413R0 != i) {
            this.f9413R0 = i;
            this.f9442i1 = i;
            this.f9446k1 = i;
            this.f9448l1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(f.b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f9442i1 = defaultColor;
        this.f9413R0 = defaultColor;
        this.f9444j1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f9446k1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f9448l1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f9407L0) {
            this.f9407L0 = i;
            if (this.f9425a0 != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f9408M0 = i;
    }

    public void setBoxCornerFamily(int i) {
        j e = this.f9404I0.e();
        z3.c cVar = this.f9404I0.e;
        c e8 = com.bumptech.glide.d.e(i);
        e.f16491a = e8;
        j.b(e8);
        e.e = cVar;
        z3.c cVar2 = this.f9404I0.f16505f;
        c e9 = com.bumptech.glide.d.e(i);
        e.f16492b = e9;
        j.b(e9);
        e.f16495f = cVar2;
        z3.c cVar3 = this.f9404I0.f16507h;
        c e10 = com.bumptech.glide.d.e(i);
        e.f16494d = e10;
        j.b(e10);
        e.f16497h = cVar3;
        z3.c cVar4 = this.f9404I0.f16506g;
        c e11 = com.bumptech.glide.d.e(i);
        e.f16493c = e11;
        j.b(e11);
        e.f16496g = cVar4;
        this.f9404I0 = e.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f9438g1 != i) {
            this.f9438g1 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f9434e1 = colorStateList.getDefaultColor();
            this.f9450m1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f9436f1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f9438g1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f9438g1 != colorStateList.getDefaultColor()) {
            this.f9438g1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f9440h1 != colorStateList) {
            this.f9440h1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f9410O0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f9411P0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f9439h0 != z) {
            Editable editable = null;
            w wVar = this.f9437g0;
            if (z) {
                C1260b0 b0Var = new C1260b0(getContext(), (AttributeSet) null);
                this.f9447l0 = b0Var;
                b0Var.setId(2131362568);
                Typeface typeface = this.f9419V0;
                if (typeface != null) {
                    this.f9447l0.setTypeface(typeface);
                }
                this.f9447l0.setMaxLines(1);
                wVar.a(this.f9447l0, 2);
                ((ViewGroup.MarginLayoutParams) this.f9447l0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131165995));
                o();
                if (this.f9447l0 != null) {
                    EditText editText = this.f9425a0;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                wVar.g(this.f9447l0, 2);
                this.f9447l0 = null;
            }
            this.f9439h0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable editable;
        if (this.f9441i0 != i) {
            if (i > 0) {
                this.f9441i0 = i;
            } else {
                this.f9441i0 = -1;
            }
            if (this.f9439h0 && this.f9447l0 != null) {
                EditText editText = this.f9425a0;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                n(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f9449m0 != i) {
            this.f9449m0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f9466w0 != colorStateList) {
            this.f9466w0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f9451n0 != i) {
            this.f9451n0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f9464v0 != colorStateList) {
            this.f9464v0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f9467x0 != colorStateList) {
            this.f9467x0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f9468y0 != colorStateList) {
            this.f9468y0 = colorStateList;
            if (m() || (this.f9447l0 != null && this.f9443j0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f9430c1 = colorStateList;
        this.f9432d1 = colorStateList;
        if (this.f9425a0 != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f9420W.f625d0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f9420W.f625d0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        s sVar = this.f9420W;
        CharSequence text = i != 0 ? sVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = sVar.f625d0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        s sVar = this.f9420W;
        Drawable r8 = i != 0 ? C0003d.r(sVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = sVar.f625d0;
        checkableImageButton.setImageDrawable(r8);
        if (r8 != null) {
            ColorStateList colorStateList = sVar.f629h0;
            PorterDuff.Mode mode = sVar.f630i0;
            TextInputLayout textInputLayout = sVar.f619U;
            com.bumptech.glide.d.a(textInputLayout, checkableImageButton, colorStateList, mode);
            com.bumptech.glide.d.q(textInputLayout, checkableImageButton, sVar.f629h0);
        }
    }

    public void setEndIconMinSize(int i) {
        s sVar = this.f9420W;
        if (i < 0) {
            sVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i != sVar.f631j0) {
            sVar.f631j0 = i;
            CheckableImageButton checkableImageButton = sVar.f625d0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = sVar.f621W;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f9420W.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f9420W;
        View.OnLongClickListener onLongClickListener = sVar.f633l0;
        CheckableImageButton checkableImageButton = sVar.f625d0;
        checkableImageButton.setOnClickListener(onClickListener);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f9420W;
        sVar.f633l0 = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f625d0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        s sVar = this.f9420W;
        sVar.f632k0 = scaleType;
        sVar.f625d0.setScaleType(scaleType);
        sVar.f621W.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        s sVar = this.f9420W;
        if (sVar.f629h0 != colorStateList) {
            sVar.f629h0 = colorStateList;
            com.bumptech.glide.d.a(sVar.f619U, sVar.f625d0, colorStateList, sVar.f630i0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f9420W;
        if (sVar.f630i0 != mode) {
            sVar.f630i0 = mode;
            com.bumptech.glide.d.a(sVar.f619U, sVar.f625d0, sVar.f629h0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f9420W.h(z);
    }

    public void setError(CharSequence charSequence) {
        w wVar = this.f9437g0;
        if (!wVar.f665q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            wVar.c();
            wVar.f664p = charSequence;
            wVar.f666r.setText(charSequence);
            int i = wVar.f662n;
            if (i != 1) {
                wVar.f663o = 1;
            }
            wVar.i(i, wVar.f663o, wVar.h(wVar.f666r, charSequence));
            return;
        }
        wVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        w wVar = this.f9437g0;
        wVar.f668t = i;
        C1260b0 b0Var = wVar.f666r;
        if (b0Var != null) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            b0Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        w wVar = this.f9437g0;
        wVar.f667s = charSequence;
        C1260b0 b0Var = wVar.f666r;
        if (b0Var != null) {
            b0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        w wVar = this.f9437g0;
        if (wVar.f665q != z) {
            wVar.c();
            TextInputLayout textInputLayout = wVar.f657h;
            if (z) {
                C1260b0 b0Var = new C1260b0(wVar.f656g, (AttributeSet) null);
                wVar.f666r = b0Var;
                b0Var.setId(2131362569);
                wVar.f666r.setTextAlignment(5);
                Typeface typeface = wVar.f650B;
                if (typeface != null) {
                    wVar.f666r.setTypeface(typeface);
                }
                int i = wVar.f669u;
                wVar.f669u = i;
                C1260b0 b0Var2 = wVar.f666r;
                if (b0Var2 != null) {
                    textInputLayout.l(b0Var2, i);
                }
                ColorStateList colorStateList = wVar.f670v;
                wVar.f670v = colorStateList;
                C1260b0 b0Var3 = wVar.f666r;
                if (!(b0Var3 == null || colorStateList == null)) {
                    b0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = wVar.f667s;
                wVar.f667s = charSequence;
                C1260b0 b0Var4 = wVar.f666r;
                if (b0Var4 != null) {
                    b0Var4.setContentDescription(charSequence);
                }
                int i8 = wVar.f668t;
                wVar.f668t = i8;
                C1260b0 b0Var5 = wVar.f666r;
                if (b0Var5 != null) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    b0Var5.setAccessibilityLiveRegion(i8);
                }
                wVar.f666r.setVisibility(4);
                wVar.a(wVar.f666r, 0);
            } else {
                wVar.f();
                wVar.g(wVar.f666r, 0);
                wVar.f666r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            wVar.f665q = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        s sVar = this.f9420W;
        sVar.i(i != 0 ? C0003d.r(sVar.getContext(), i) : null);
        com.bumptech.glide.d.q(sVar.f619U, sVar.f621W, sVar.f622a0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f9420W;
        CheckableImageButton checkableImageButton = sVar.f621W;
        View.OnLongClickListener onLongClickListener = sVar.f624c0;
        checkableImageButton.setOnClickListener(onClickListener);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f9420W;
        sVar.f624c0 = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f621W;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        s sVar = this.f9420W;
        if (sVar.f622a0 != colorStateList) {
            sVar.f622a0 = colorStateList;
            com.bumptech.glide.d.a(sVar.f619U, sVar.f621W, colorStateList, sVar.f623b0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f9420W;
        if (sVar.f623b0 != mode) {
            sVar.f623b0 = mode;
            com.bumptech.glide.d.a(sVar.f619U, sVar.f621W, sVar.f622a0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        w wVar = this.f9437g0;
        wVar.f669u = i;
        C1260b0 b0Var = wVar.f666r;
        if (b0Var != null) {
            wVar.f657h.l(b0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        w wVar = this.f9437g0;
        wVar.f670v = colorStateList;
        C1260b0 b0Var = wVar.f666r;
        if (b0Var != null && colorStateList != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f9457q1 != z) {
            this.f9457q1 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        w wVar = this.f9437g0;
        if (!isEmpty) {
            if (!wVar.f672x) {
                setHelperTextEnabled(true);
            }
            wVar.c();
            wVar.f671w = charSequence;
            wVar.f673y.setText(charSequence);
            int i = wVar.f662n;
            if (i != 2) {
                wVar.f663o = 2;
            }
            wVar.i(i, wVar.f663o, wVar.h(wVar.f673y, charSequence));
        } else if (wVar.f672x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        w wVar = this.f9437g0;
        wVar.f649A = colorStateList;
        C1260b0 b0Var = wVar.f673y;
        if (b0Var != null && colorStateList != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        w wVar = this.f9437g0;
        if (wVar.f672x != z) {
            wVar.c();
            if (z) {
                C1260b0 b0Var = new C1260b0(wVar.f656g, (AttributeSet) null);
                wVar.f673y = b0Var;
                b0Var.setId(2131362570);
                wVar.f673y.setTextAlignment(5);
                Typeface typeface = wVar.f650B;
                if (typeface != null) {
                    wVar.f673y.setTypeface(typeface);
                }
                wVar.f673y.setVisibility(4);
                wVar.f673y.setAccessibilityLiveRegion(1);
                int i = wVar.z;
                wVar.z = i;
                C1260b0 b0Var2 = wVar.f673y;
                if (b0Var2 != null) {
                    a.v(b0Var2, i);
                }
                ColorStateList colorStateList = wVar.f649A;
                wVar.f649A = colorStateList;
                C1260b0 b0Var3 = wVar.f673y;
                if (!(b0Var3 == null || colorStateList == null)) {
                    b0Var3.setTextColor(colorStateList);
                }
                wVar.a(wVar.f673y, 1);
                wVar.f673y.setAccessibilityDelegate(new v(wVar));
            } else {
                wVar.c();
                int i8 = wVar.f662n;
                if (i8 == 2) {
                    wVar.f663o = 0;
                }
                wVar.i(i8, wVar.f663o, wVar.h(wVar.f673y, ""));
                wVar.g(wVar.f673y, 1);
                wVar.f673y = null;
                TextInputLayout textInputLayout = wVar.f657h;
                textInputLayout.r();
                textInputLayout.x();
            }
            wVar.f672x = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        w wVar = this.f9437g0;
        wVar.z = i;
        C1260b0 b0Var = wVar.f673y;
        if (b0Var != null) {
            a.v(b0Var, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f9469z0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f9459r1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f9469z0) {
            this.f9469z0 = z;
            if (!z) {
                this.f9397B0 = false;
                if (!TextUtils.isEmpty(this.f9396A0) && TextUtils.isEmpty(this.f9425a0.getHint())) {
                    this.f9425a0.setHint(this.f9396A0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f9425a0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f9396A0)) {
                        setHint(hint);
                    }
                    this.f9425a0.setHint((CharSequence) null);
                }
                this.f9397B0 = true;
            }
            if (this.f9425a0 != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f9455p1;
        TextInputLayout textInputLayout = bVar.f15407a;
        C1590d dVar = new C1590d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f16208j;
        if (colorStateList != null) {
            bVar.f15421k = colorStateList;
        }
        float f8 = dVar.f16209k;
        if (f8 != 0.0f) {
            bVar.i = f8;
        }
        ColorStateList colorStateList2 = dVar.f16201a;
        if (colorStateList2 != null) {
            bVar.f15401U = colorStateList2;
        }
        bVar.f15399S = dVar.e;
        bVar.f15400T = dVar.f16205f;
        bVar.f15398R = dVar.f16206g;
        bVar.f15402V = dVar.i;
        C1587a aVar = bVar.f15435y;
        if (aVar != null) {
            aVar.f16196k = true;
        }
        C1160q qVar = new C1160q(16, (Object) bVar);
        dVar.a();
        bVar.f15435y = new C1587a(qVar, dVar.f16212n);
        dVar.c(textInputLayout.getContext(), bVar.f15435y);
        bVar.h(false);
        this.f9432d1 = bVar.f15421k;
        if (this.f9425a0 != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f9432d1 != colorStateList) {
            if (this.f9430c1 == null) {
                b bVar = this.f9455p1;
                if (bVar.f15421k != colorStateList) {
                    bVar.f15421k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f9432d1 = colorStateList;
            if (this.f9425a0 != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(F f8) {
        this.f9445k0 = f8;
    }

    public void setMaxEms(int i) {
        this.f9431d0 = i;
        EditText editText = this.f9425a0;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.f9435f0 = i;
        EditText editText = this.f9425a0;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f9429c0 = i;
        EditText editText = this.f9425a0;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.f9433e0 = i;
        EditText editText = this.f9425a0;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        s sVar = this.f9420W;
        sVar.f625d0.setContentDescription(i != 0 ? sVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        s sVar = this.f9420W;
        sVar.f625d0.setImageDrawable(i != 0 ? C0003d.r(sVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        s sVar = this.f9420W;
        if (z && sVar.f627f0 != 1) {
            sVar.g(1);
        } else if (!z) {
            sVar.g(0);
        } else {
            sVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        s sVar = this.f9420W;
        sVar.f629h0 = colorStateList;
        com.bumptech.glide.d.a(sVar.f619U, sVar.f625d0, colorStateList, sVar.f630i0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        s sVar = this.f9420W;
        sVar.f630i0 = mode;
        com.bumptech.glide.d.a(sVar.f619U, sVar.f625d0, sVar.f629h0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f9456q0 == null) {
            C1260b0 b0Var = new C1260b0(getContext(), (AttributeSet) null);
            this.f9456q0 = b0Var;
            b0Var.setId(2131362571);
            this.f9456q0.setImportantForAccessibility(2);
            C0955h d8 = d();
            this.f9461t0 = d8;
            d8.f11968V = 67;
            this.f9462u0 = d();
            setPlaceholderTextAppearance(this.f9460s0);
            setPlaceholderTextColor(this.f9458r0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.p0) {
                setPlaceholderTextEnabled(true);
            }
            this.f9453o0 = charSequence;
        }
        EditText editText = this.f9425a0;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f9460s0 = i;
        C1260b0 b0Var = this.f9456q0;
        if (b0Var != null) {
            a.v(b0Var, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f9458r0 != colorStateList) {
            this.f9458r0 = colorStateList;
            C1260b0 b0Var = this.f9456q0;
            if (b0Var != null && colorStateList != null) {
                b0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        B b8 = this.f9418V;
        b8.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        b8.f558W = charSequence2;
        b8.f557V.setText(charSequence);
        b8.e();
    }

    public void setPrefixTextAppearance(int i) {
        a.v(this.f9418V.f557V, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f9418V.f557V.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f9398C0;
        if (gVar != null && gVar.f16469U.f16454a != kVar) {
            this.f9404I0 = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.f9418V.f559a0.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f9418V.f559a0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0003d.r(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        B b8 = this.f9418V;
        if (i < 0) {
            b8.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i != b8.f562d0) {
            b8.f562d0 = i;
            CheckableImageButton checkableImageButton = b8.f559a0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        B b8 = this.f9418V;
        View.OnLongClickListener onLongClickListener = b8.f564f0;
        CheckableImageButton checkableImageButton = b8.f559a0;
        checkableImageButton.setOnClickListener(onClickListener);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        B b8 = this.f9418V;
        b8.f564f0 = onLongClickListener;
        CheckableImageButton checkableImageButton = b8.f559a0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        B b8 = this.f9418V;
        b8.f563e0 = scaleType;
        b8.f559a0.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        B b8 = this.f9418V;
        if (b8.f560b0 != colorStateList) {
            b8.f560b0 = colorStateList;
            com.bumptech.glide.d.a(b8.f556U, b8.f559a0, colorStateList, b8.f561c0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        B b8 = this.f9418V;
        if (b8.f561c0 != mode) {
            b8.f561c0 = mode;
            com.bumptech.glide.d.a(b8.f556U, b8.f559a0, b8.f560b0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f9418V.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        s sVar = this.f9420W;
        sVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        sVar.f634m0 = charSequence2;
        sVar.f635n0.setText(charSequence);
        sVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        a.v(this.f9420W.f635n0, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f9420W.f635n0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(E e) {
        EditText editText = this.f9425a0;
        if (editText != null) {
            C1510H.p(editText, e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f9419V0) {
            this.f9419V0 = typeface;
            this.f9455p1.m(typeface);
            w wVar = this.f9437g0;
            if (typeface != wVar.f650B) {
                wVar.f650B = typeface;
                C1260b0 b0Var = wVar.f666r;
                if (b0Var != null) {
                    b0Var.setTypeface(typeface);
                }
                C1260b0 b0Var2 = wVar.f673y;
                if (b0Var2 != null) {
                    b0Var2.setTypeface(typeface);
                }
            }
            C1260b0 b0Var3 = this.f9447l0;
            if (b0Var3 != null) {
                b0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f9407L0 != 1) {
            FrameLayout frameLayout = this.f9416U;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c8 = c();
            if (c8 != layoutParams.topMargin) {
                layoutParams.topMargin = c8;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z6) {
        boolean z8;
        boolean z9;
        ColorStateList colorStateList;
        C1260b0 b0Var;
        ColorStateList colorStateList2;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f9425a0;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z8 = false;
        } else {
            z8 = true;
        }
        EditText editText2 = this.f9425a0;
        if (editText2 == null || !editText2.hasFocus()) {
            z9 = false;
        } else {
            z9 = true;
        }
        ColorStateList colorStateList3 = this.f9430c1;
        b bVar = this.f9455p1;
        if (colorStateList3 != null) {
            bVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f9430c1;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.f9450m1);
            } else {
                i = this.f9450m1;
            }
            bVar.i(ColorStateList.valueOf(i));
        } else if (m()) {
            C1260b0 b0Var2 = this.f9437g0.f666r;
            if (b0Var2 != null) {
                colorStateList2 = b0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.i(colorStateList2);
        } else if (this.f9443j0 && (b0Var = this.f9447l0) != null) {
            bVar.i(b0Var.getTextColors());
        } else if (!(!z9 || (colorStateList = this.f9432d1) == null || bVar.f15421k == colorStateList)) {
            bVar.f15421k = colorStateList;
            bVar.h(false);
        }
        s sVar = this.f9420W;
        B b8 = this.f9418V;
        if (z8 || !this.f9457q1 || (isEnabled() && z9)) {
            if (z6 || this.f9454o1) {
                ValueAnimator valueAnimator = this.s1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.s1.cancel();
                }
                if (!z || !this.f9459r1) {
                    bVar.k(1.0f);
                } else {
                    a(1.0f);
                }
                this.f9454o1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f9425a0;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                b8.f565g0 = false;
                b8.e();
                sVar.f636o0 = false;
                sVar.n();
            }
        } else if (z6 || !this.f9454o1) {
            ValueAnimator valueAnimator2 = this.s1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.s1.cancel();
            }
            if (!z || !this.f9459r1) {
                bVar.k(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && !((i) this.f9398C0).f591r0.f589q.isEmpty() && e()) {
                ((i) this.f9398C0).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f9454o1 = true;
            C1260b0 b0Var3 = this.f9456q0;
            if (b0Var3 != null && this.p0) {
                b0Var3.setText((CharSequence) null);
                t.a(this.f9416U, this.f9462u0);
                this.f9456q0.setVisibility(4);
            }
            b8.f565g0 = true;
            b8.e();
            sVar.f636o0 = true;
            sVar.n();
        }
    }

    public final void v(Editable editable) {
        int i;
        ((B7.g) this.f9445k0).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.f9416U;
        if (i != 0 || this.f9454o1) {
            C1260b0 b0Var = this.f9456q0;
            if (b0Var != null && this.p0) {
                b0Var.setText((CharSequence) null);
                t.a(frameLayout, this.f9462u0);
                this.f9456q0.setVisibility(4);
            }
        } else if (this.f9456q0 != null && this.p0 && !TextUtils.isEmpty(this.f9453o0)) {
            this.f9456q0.setText(this.f9453o0);
            t.a(frameLayout, this.f9461t0);
            this.f9456q0.setVisibility(0);
            this.f9456q0.bringToFront();
            announceForAccessibility(this.f9453o0);
        }
    }

    public final void w(boolean z, boolean z6) {
        int defaultColor = this.f9440h1.getDefaultColor();
        int colorForState = this.f9440h1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f9440h1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f9412Q0 = colorForState2;
        } else if (z6) {
            this.f9412Q0 = colorForState;
        } else {
            this.f9412Q0 = defaultColor;
        }
    }

    public final void x() {
        boolean z;
        C1260b0 b0Var;
        EditText editText;
        EditText editText2;
        if (this.f9398C0 != null && this.f9407L0 != 0) {
            boolean z6 = false;
            if (isFocused() || ((editText2 = this.f9425a0) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f9425a0) != null && editText.isHovered())) {
                z6 = true;
            }
            if (!isEnabled()) {
                this.f9412Q0 = this.f9450m1;
            } else if (m()) {
                if (this.f9440h1 != null) {
                    w(z, z6);
                } else {
                    this.f9412Q0 = getErrorCurrentTextColors();
                }
            } else if (!this.f9443j0 || (b0Var = this.f9447l0) == null) {
                if (z) {
                    this.f9412Q0 = this.f9438g1;
                } else if (z6) {
                    this.f9412Q0 = this.f9436f1;
                } else {
                    this.f9412Q0 = this.f9434e1;
                }
            } else if (this.f9440h1 != null) {
                w(z, z6);
            } else {
                this.f9412Q0 = b0Var.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            s sVar = this.f9420W;
            sVar.l();
            CheckableImageButton checkableImageButton = sVar.f621W;
            ColorStateList colorStateList = sVar.f622a0;
            TextInputLayout textInputLayout = sVar.f619U;
            com.bumptech.glide.d.q(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = sVar.f629h0;
            CheckableImageButton checkableImageButton2 = sVar.f625d0;
            com.bumptech.glide.d.q(textInputLayout, checkableImageButton2, colorStateList2);
            if (sVar.b() instanceof n) {
                if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                    com.bumptech.glide.d.a(textInputLayout, checkableImageButton2, sVar.f629h0, sVar.f630i0);
                } else {
                    Drawable mutate = E.e.z(checkableImageButton2.getDrawable()).mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                }
            }
            B b8 = this.f9418V;
            com.bumptech.glide.d.q(b8.f556U, b8.f559a0, b8.f560b0);
            if (this.f9407L0 == 2) {
                int i = this.f9409N0;
                if (!z || !isEnabled()) {
                    this.f9409N0 = this.f9410O0;
                } else {
                    this.f9409N0 = this.f9411P0;
                }
                if (this.f9409N0 != i && e() && !this.f9454o1) {
                    if (e()) {
                        ((i) this.f9398C0).n(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f9407L0 == 1) {
                if (!isEnabled()) {
                    this.f9413R0 = this.f9444j1;
                } else if (z6 && !z) {
                    this.f9413R0 = this.f9448l1;
                } else if (z) {
                    this.f9413R0 = this.f9446k1;
                } else {
                    this.f9413R0 = this.f9442i1;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f9418V.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9420W.f625d0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9420W.f625d0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f9420W.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f9420W.f625d0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        s sVar = this.f9420W;
        CheckableImageButton checkableImageButton = sVar.f625d0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = sVar.f629h0;
            PorterDuff.Mode mode = sVar.f630i0;
            TextInputLayout textInputLayout = sVar.f619U;
            com.bumptech.glide.d.a(textInputLayout, checkableImageButton, colorStateList, mode);
            com.bumptech.glide.d.q(textInputLayout, checkableImageButton, sVar.f629h0);
        }
    }
}
