package com.google.android.material.chip;

import B.C0003d;
import D2.G;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import g3.C0959b;
import j0.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.C1233b;
import n0.C1234c;
import o.C1289q;
import o3.C1317a;
import o3.c;
import o3.d;
import o3.e;
import t0.C1414b;
import t0.C1418f;
import t3.i;
import v0.C1510H;
import v0.C1529b;
import w3.C1590d;
import z3.k;
import z3.u;

public class Chip extends C1289q implements d, u, Checkable {

    /* renamed from: t0  reason: collision with root package name */
    public static final Rect f9245t0 = new Rect();

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f9246u0 = {16842913};

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f9247v0 = {16842911};

    /* renamed from: b0  reason: collision with root package name */
    public e f9248b0;

    /* renamed from: c0  reason: collision with root package name */
    public InsetDrawable f9249c0;

    /* renamed from: d0  reason: collision with root package name */
    public RippleDrawable f9250d0;

    /* renamed from: e0  reason: collision with root package name */
    public View.OnClickListener f9251e0;

    /* renamed from: f0  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f9252f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f9253g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9254h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f9255i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f9256j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f9257k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f9258l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f9259m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f9260n0;

    /* renamed from: o0  reason: collision with root package name */
    public final c f9261o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f9262q0 = new Rect();

    /* renamed from: r0  reason: collision with root package name */
    public final RectF f9263r0 = new RectF();

    /* renamed from: s0  reason: collision with root package name */
    public final C1317a f9264s0 = new C1317a(0, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2130968782(0x7f0400ce, float:1.7546227E38)
            r1 = 2132018247(0x7f140447, float:1.9674795E38)
            r2 = r18
            android.content.Context r1 = E3.a.a(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f9262q0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f9263r0 = r1
            o3.a r1 = new o3.a
            r2 = 0
            r1.<init>(r2, r0)
            r0.f9264s0 = r1
            android.content.Context r9 = r17.getContext()
            r10 = 1
            r11 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0034
            goto L_0x0094
        L_0x0034:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0045:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03df
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03d7
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03d1
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03cb
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x03c3
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03c3
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03c3
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03c3
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r11)
            if (r1 == r11) goto L_0x0094
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0094:
            o3.e r12 = new o3.e
            r12.<init>(r9, r7)
            int[] r13 = f3.C0899a.f11651c
            r14 = 0
            int[] r6 = new int[r14]
            android.content.Context r1 = r12.f14234Y0
            r5 = 2132018247(0x7f140447, float:1.9674795E38)
            r2 = r19
            r3 = r13
            r4 = r8
            android.content.res.TypedArray r1 = t3.k.f(r1, r2, r3, r4, r5, r6)
            r15 = 37
            boolean r2 = r1.hasValue(r15)
            r12.f14265y1 = r2
            r2 = 24
            android.content.Context r3 = r12.f14234Y0
            android.content.res.ColorStateList r2 = com.bumptech.glide.c.j(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.f14253r0
            if (r4 == r2) goto L_0x00c8
            r12.f14253r0 = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00c8:
            r2 = 11
            android.content.res.ColorStateList r2 = com.bumptech.glide.c.j(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.f14255s0
            if (r4 == r2) goto L_0x00db
            r12.f14255s0 = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00db:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r12.f14256t0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f0
            r12.f14256t0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x00f0:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x00ff
            float r2 = r1.getDimension(r2, r4)
            r12.A(r2)
        L_0x00ff:
            r2 = 22
            android.content.res.ColorStateList r2 = com.bumptech.glide.c.j(r3, r1, r2)
            r12.F(r2)
            r6 = 23
            float r2 = r1.getDimension(r6, r4)
            r12.G(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = com.bumptech.glide.c.j(r3, r1, r2)
            r12.P(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0123
            java.lang.String r2 = ""
        L_0x0123:
            java.lang.CharSequence r5 = r12.f14264y0
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 != 0) goto L_0x0137
            r12.f14264y0 = r2
            t3.i r2 = r12.f14240e1
            r2.f15459d = r10
            r12.invalidateSelf()
            r12.u()
        L_0x0137:
            boolean r2 = r1.hasValue(r14)
            if (r2 == 0) goto L_0x0149
            int r2 = r1.getResourceId(r14, r14)
            if (r2 == 0) goto L_0x0149
            w3.d r5 = new w3.d
            r5.<init>(r3, r2)
            goto L_0x014a
        L_0x0149:
            r5 = 0
        L_0x014a:
            float r2 = r5.f16209k
            float r2 = r1.getDimension(r10, r2)
            r5.f16209k = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r11 = 2
            if (r2 >= r6) goto L_0x015d
            android.content.res.ColorStateList r6 = com.bumptech.glide.c.j(r3, r1, r11)
            r5.f16208j = r6
        L_0x015d:
            r12.Q(r5)
            r5 = 3
            int r6 = r1.getInt(r5, r14)
            if (r6 == r10) goto L_0x0176
            if (r6 == r11) goto L_0x0171
            if (r6 == r5) goto L_0x016c
            goto L_0x017a
        L_0x016c:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r12.f14260v1 = r5
            goto L_0x017a
        L_0x0171:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r12.f14260v1 = r5
            goto L_0x017a
        L_0x0176:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
            r12.f14260v1 = r5
        L_0x017a:
            r5 = 18
            boolean r5 = r1.getBoolean(r5, r14)
            r12.E(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x01a0
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x01a0
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x01a0
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r14)
            r12.E(r6)
        L_0x01a0:
            r6 = 14
            android.graphics.drawable.Drawable r6 = com.bumptech.glide.c.o(r3, r1, r6)
            r12.B(r6)
            r6 = 17
            boolean r16 = r1.hasValue(r6)
            if (r16 == 0) goto L_0x01b8
            android.content.res.ColorStateList r6 = com.bumptech.glide.c.j(r3, r1, r6)
            r12.D(r6)
        L_0x01b8:
            r6 = 16
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r1.getDimension(r6, r15)
            r12.C(r6)
            r6 = 31
            boolean r6 = r1.getBoolean(r6, r14)
            r12.M(r6)
            if (r7 == 0) goto L_0x01e7
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x01e7
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x01e7
            r6 = 26
            boolean r6 = r1.getBoolean(r6, r14)
            r12.M(r6)
        L_0x01e7:
            r6 = 25
            android.graphics.drawable.Drawable r6 = com.bumptech.glide.c.o(r3, r1, r6)
            r12.H(r6)
            r6 = 30
            android.content.res.ColorStateList r6 = com.bumptech.glide.c.j(r3, r1, r6)
            r12.L(r6)
            r6 = 28
            float r6 = r1.getDimension(r6, r4)
            r12.J(r6)
            r6 = 6
            boolean r6 = r1.getBoolean(r6, r14)
            r12.w(r6)
            r6 = 10
            boolean r6 = r1.getBoolean(r6, r14)
            r12.z(r6)
            if (r7 == 0) goto L_0x022e
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x022e
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r5, r6)
            if (r5 != 0) goto L_0x022e
            r5 = 8
            boolean r5 = r1.getBoolean(r5, r14)
            r12.z(r5)
        L_0x022e:
            r5 = 7
            android.graphics.drawable.Drawable r5 = com.bumptech.glide.c.o(r3, r1, r5)
            r12.x(r5)
            r5 = 9
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x0245
            android.content.res.ColorStateList r5 = com.bumptech.glide.c.j(r3, r1, r5)
            r12.y(r5)
        L_0x0245:
            r5 = 39
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x0258
            int r5 = r1.getResourceId(r5, r14)
            if (r5 == 0) goto L_0x0258
            g3.b r5 = g3.C0959b.a(r3, r5)
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r12.f14224O0 = r5
            r5 = 33
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x026e
            int r5 = r1.getResourceId(r5, r14)
            if (r5 == 0) goto L_0x026e
            g3.b r5 = g3.C0959b.a(r3, r5)
            goto L_0x026f
        L_0x026e:
            r5 = 0
        L_0x026f:
            r12.f14225P0 = r5
            r3 = 21
            float r3 = r1.getDimension(r3, r4)
            float r5 = r12.f14226Q0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0285
            r12.f14226Q0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x0285:
            r3 = 35
            float r3 = r1.getDimension(r3, r4)
            r12.O(r3)
            r3 = 34
            float r3 = r1.getDimension(r3, r4)
            r12.N(r3)
            r3 = 41
            float r3 = r1.getDimension(r3, r4)
            float r5 = r12.f14229T0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02ab
            r12.f14229T0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x02ab:
            r3 = 40
            float r3 = r1.getDimension(r3, r4)
            float r5 = r12.f14230U0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02bf
            r12.f14230U0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x02bf:
            r3 = 29
            float r3 = r1.getDimension(r3, r4)
            r12.K(r3)
            r3 = 27
            float r3 = r1.getDimension(r3, r4)
            r12.I(r3)
            r3 = 13
            float r3 = r1.getDimension(r3, r4)
            float r4 = r12.f14233X0
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x02e5
            r12.f14233X0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x02e5:
            r3 = 4
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1.getDimensionPixelSize(r3, r4)
            r12.f14263x1 = r3
            r1.recycle()
            int[] r6 = new int[r14]
            r15 = 2132018247(0x7f140447, float:1.9674795E38)
            t3.k.a(r9, r7, r8, r15)
            r1 = r9
            r5 = r2
            r2 = r19
            r3 = r13
            r4 = r8
            r11 = r5
            r5 = r15
            t3.k.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r13, r8, r15)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r14)
            r0.f9257k0 = r2
            android.content.Context r2 = r17.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 48
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r10, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f9259m0 = r2
            r1.recycle()
            r0.setChipDrawable(r12)
            float r1 = v0.C1553z.e(r17)
            r12.i(r1)
            int[] r6 = new int[r14]
            r14 = 2132018247(0x7f140447, float:1.9674795E38)
            t3.k.a(r9, r7, r8, r14)
            r1 = r9
            r2 = r19
            r3 = r13
            r4 = r8
            r5 = r14
            t3.k.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r13, r8, r14)
            r2 = 23
            if (r11 >= r2) goto L_0x0366
            r2 = 2
            android.content.res.ColorStateList r2 = com.bumptech.glide.c.j(r9, r1, r2)
            r0.setTextColor(r2)
        L_0x0366:
            r2 = 37
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            o3.c r1 = new o3.c
            r1.<init>(r0, r0)
            r0.f9261o0 = r1
            r17.e()
            if (r2 != 0) goto L_0x0383
            o3.b r1 = new o3.b
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0383:
            boolean r1 = r0.f9253g0
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r12.f14264y0
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r12.f14260v1
            r0.setEllipsize(r1)
            r17.h()
            o3.e r1 = r0.f9248b0
            boolean r1 = r1.w1
            if (r1 != 0) goto L_0x03a1
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x03a1:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.g()
            boolean r1 = r0.f9257k0
            if (r1 == 0) goto L_0x03b3
            int r1 = r0.f9259m0
            r0.setMinHeight(r1)
        L_0x03b3:
            int r1 = r17.getLayoutDirection()
            r0.f9258l0 = r1
            de.ozerov.fully.q r1 = new de.ozerov.fully.q
            r2 = 2
            r1.<init>(r2, r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x03c3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03cb:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03d1:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03d7:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03df:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f9263r0;
        rectF.setEmpty();
        if (c() && this.f9251e0 != null) {
            e eVar = this.f9248b0;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.T()) {
                float f8 = eVar.f14233X0 + eVar.f14232W0 + eVar.f14218I0 + eVar.f14231V0 + eVar.f14230U0;
                if (E.e.q(eVar) == 0) {
                    float f9 = (float) bounds.right;
                    rectF.right = f9;
                    rectF.left = f9 - f8;
                } else {
                    float f10 = (float) bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f8;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f9262q0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private C1590d getTextAppearance() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14240e1.f15460f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f9255i0 != z) {
            this.f9255i0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f9254h0 != z) {
            this.f9254h0 = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i8;
        int i9;
        this.f9259m0 = i;
        if (!this.f9257k0) {
            InsetDrawable insetDrawable = this.f9249c0;
            if (insetDrawable == null) {
                int[] iArr = x3.d.f16269a;
                f();
            } else if (insetDrawable != null) {
                this.f9249c0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = x3.d.f16269a;
                f();
            }
        } else {
            int max = Math.max(0, i - ((int) this.f9248b0.f14256t0));
            int max2 = Math.max(0, i - this.f9248b0.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i8 = max2 / 2;
                } else {
                    i8 = 0;
                }
                if (max > 0) {
                    i9 = max / 2;
                } else {
                    i9 = 0;
                }
                if (this.f9249c0 != null) {
                    Rect rect = new Rect();
                    this.f9249c0.getPadding(rect);
                    if (rect.top == i9 && rect.bottom == i9 && rect.left == i8 && rect.right == i8) {
                        int[] iArr3 = x3.d.f16269a;
                        f();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.f9249c0 = new InsetDrawable(this.f9248b0, i8, i9, i8, i9);
                int[] iArr4 = x3.d.f16269a;
                f();
                return;
            }
            InsetDrawable insetDrawable2 = this.f9249c0;
            if (insetDrawable2 == null) {
                int[] iArr5 = x3.d.f16269a;
                f();
            } else if (insetDrawable2 != null) {
                this.f9249c0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = x3.d.f16269a;
                f();
            }
        }
    }

    public final boolean c() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            Drawable drawable = eVar.f14215F0;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof C1233b) {
                drawable = ((C1234c) ((C1233b) drawable)).f13560Z;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        e eVar = this.f9248b0;
        if (eVar == null || !eVar.f14220K0) {
            return false;
        }
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        int i8;
        if (!this.p0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f9261o0;
        AccessibilityManager accessibilityManager = cVar.f498h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x8 = motionEvent.getX();
                float y8 = motionEvent.getY();
                Chip chip = cVar.f14207q;
                if (!chip.c() || !chip.getCloseIconTouchBounds().contains(x8, y8)) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i9 = cVar.f502m;
                if (i9 != i) {
                    cVar.f502m = i;
                    cVar.q(i, 128);
                    cVar.q(i9, 256);
                }
                if (i != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i8 = cVar.f502m) != Integer.MIN_VALUE) {
                if (i8 == Integer.MIN_VALUE) {
                    return true;
                }
                cVar.f502m = RecyclerView.UNDEFINED_DURATION;
                cVar.q(i8, 256);
                return true;
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.p0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f9261o0;
        cVar.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i8 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                        case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i8 = 33;
                                } else if (keyCode == 21) {
                                    i8 = 17;
                                } else if (keyCode != 22) {
                                    i8 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i9 = 0;
                                while (i < repeatCount && cVar.m(i8, (Rect) null)) {
                                    i++;
                                    i9 = 1;
                                }
                                i = i9;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i10 = cVar.f501l;
                    if (i10 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f14207q;
                        if (i10 == 0) {
                            boolean performClick = chip.performClick();
                        } else if (i10 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f9251e0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.p0) {
                                chip.f9261o0.q(1, 1);
                            }
                        }
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = cVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = cVar.m(1, (Rect) null);
            }
        }
        if (i == 0 || cVar.f501l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        e eVar = this.f9248b0;
        boolean z = false;
        if (eVar != null && e.t(eVar.f14215F0)) {
            e eVar2 = this.f9248b0;
            int isEnabled = isEnabled();
            if (this.f9256j0) {
                isEnabled++;
            }
            if (this.f9255i0) {
                isEnabled++;
            }
            if (this.f9254h0) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f9256j0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f9255i0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f9254h0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(eVar2.s1, iArr)) {
                eVar2.s1 = iArr;
                if (eVar2.T()) {
                    z = eVar2.v(eVar2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!c() || (eVar = this.f9248b0) == null || !eVar.f14214E0 || this.f9251e0 == null) {
            C1510H.p(this, (C1529b) null);
            this.p0 = false;
            return;
        }
        C1510H.p(this, this.f9261o0);
        this.p0 = true;
    }

    public final void f() {
        this.f9250d0 = new RippleDrawable(x3.d.a(this.f9248b0.f14262x0), getBackgroundDrawable(), (Drawable) null);
        this.f9248b0.getClass();
        RippleDrawable rippleDrawable = this.f9250d0;
        WeakHashMap weakHashMap = C1510H.f15874a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f9248b0) != null) {
            int q7 = (int) (eVar.q() + eVar.f14233X0 + eVar.f14230U0);
            e eVar2 = this.f9248b0;
            int p3 = (int) (eVar2.p() + eVar2.f14226Q0 + eVar2.f14229T0);
            if (this.f9249c0 != null) {
                Rect rect = new Rect();
                this.f9249c0.getPadding(rect);
                p3 += rect.left;
                q7 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = C1510H.f15874a;
            setPaddingRelative(p3, paddingTop, q7, paddingBottom);
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f9260n0)) {
            return this.f9260n0;
        }
        if (d()) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9249c0;
        if (insetDrawable == null) {
            return this.f9248b0;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14222M0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14223N0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14255s0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return Math.max(0.0f, eVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9248b0;
    }

    public float getChipEndPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14233X0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f9248b0;
        if (eVar == null || (drawable = eVar.f14210A0) == null) {
            return null;
        }
        if (drawable instanceof C1233b) {
            drawable = ((C1234c) ((C1233b) drawable)).f13560Z;
        }
        return drawable;
    }

    public float getChipIconSize() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14212C0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14211B0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14256t0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14226Q0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14259v0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14261w0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f9248b0;
        if (eVar == null || (drawable = eVar.f14215F0) == null) {
            return null;
        }
        if (drawable instanceof C1233b) {
            drawable = ((C1234c) ((C1233b) drawable)).f13560Z;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14219J0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14232W0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14218I0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14231V0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14217H0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14260v1;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.p0) {
            c cVar = this.f9261o0;
            if (cVar.f501l == 1 || cVar.f500k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0959b getHideMotionSpec() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14225P0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14228S0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14227R0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14262x0;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f9248b0.f16469U.f16454a;
    }

    public C0959b getShowMotionSpec() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14224O0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14230U0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f9248b0;
        if (eVar != null) {
            return eVar.f14229T0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f9248b0;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        C1590d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f9264s0);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bumptech.glide.d.t(this, this.f9248b0);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9246u0);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f9247v0);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.p0) {
            c cVar = this.f9261o0;
            int i8 = cVar.f501l;
            if (i8 != Integer.MIN_VALUE) {
                cVar.j(i8);
            }
            if (z) {
                cVar.m(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f9258l0 != i) {
            this.f9258l0 = i;
            g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f9254h0
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = 1
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.f9254h0
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f9251e0
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.p0
            if (r0 == 0) goto L_0x0043
            o3.c r0 = r5.f9261o0
            r0.q(r3, r3)
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f9260n0 = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9250d0) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9250d0) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.w(z);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.w(eVar.f14234Y0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        e eVar = this.f9248b0;
        if (eVar == null) {
            this.f9253g0 = z;
        } else if (eVar.f14220K0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.x(C0003d.r(eVar.f14234Y0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.y(f.c(eVar.f14234Y0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.z(eVar.f14234Y0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14255s0 != colorStateList) {
            eVar.f14255s0 = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList c8;
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14255s0 != (c8 = f.c(eVar.f14234Y0, i))) {
            eVar.f14255s0 = c8;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.A(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.A(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f9248b0;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f14258u1 = new WeakReference((Object) null);
            }
            this.f9248b0 = eVar;
            eVar.w1 = false;
            eVar.f14258u1 = new WeakReference(this);
            b(this.f9259m0);
        }
    }

    public void setChipEndPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14233X0 != f8) {
            eVar.f14233X0 = f8;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            float dimension = eVar.f14234Y0.getResources().getDimension(i);
            if (eVar.f14233X0 != dimension) {
                eVar.f14233X0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.B(C0003d.r(eVar.f14234Y0, i));
        }
    }

    public void setChipIconSize(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.C(f8);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.C(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.D(f.c(eVar.f14234Y0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.E(eVar.f14234Y0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14256t0 != f8) {
            eVar.f14256t0 = f8;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            float dimension = eVar.f14234Y0.getResources().getDimension(i);
            if (eVar.f14256t0 != dimension) {
                eVar.f14256t0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStartPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14226Q0 != f8) {
            eVar.f14226Q0 = f8;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            float dimension = eVar.f14234Y0.getResources().getDimension(i);
            if (eVar.f14226Q0 != dimension) {
                eVar.f14226Q0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.F(f.c(eVar.f14234Y0, i));
        }
    }

    public void setChipStrokeWidth(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.G(f8);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.G(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1414b bVar;
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14219J0 != charSequence) {
            String str = C1414b.f15169b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = C1414b.e;
            } else {
                bVar = C1414b.f15171d;
            }
            bVar.getClass();
            G g8 = C1418f.f15178a;
            eVar.f14219J0 = bVar.c(charSequence);
            eVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.I(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.I(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.H(C0003d.r(eVar.f14234Y0, i));
        }
        e();
    }

    public void setCloseIconSize(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.J(f8);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.J(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.K(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.K(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.L(f.c(eVar.f14234Y0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i9 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i8, i9, i10);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i9 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i8, i9, i10);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.i(f8);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9248b0 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                e eVar = this.f9248b0;
                if (eVar != null) {
                    eVar.f14260v1 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f9257k0 = z;
        b(this.f9259m0);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0959b bVar) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.f14225P0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.f14225P0 = C0959b.a(eVar.f14234Y0, i);
        }
    }

    public void setIconEndPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.N(f8);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.N(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.O(f8);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.O(eVar.f14234Y0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(t3.e eVar) {
    }

    public void setLayoutDirection(int i) {
        if (this.f9248b0 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.f14263x1 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9252f0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9251e0 = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.P(colorStateList);
        }
        this.f9248b0.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.P(f.c(eVar.f14234Y0, i));
            this.f9248b0.getClass();
            f();
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f9248b0.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0959b bVar) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.f14224O0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.f14224O0 = C0959b.a(eVar.f14234Y0, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        e eVar = this.f9248b0;
        if (eVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (eVar.w1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            e eVar2 = this.f9248b0;
            if (eVar2 != null && !TextUtils.equals(eVar2.f14264y0, charSequence)) {
                eVar2.f14264y0 = charSequence;
                eVar2.f14240e1.f15459d = true;
                eVar2.invalidateSelf();
                eVar2.u();
            }
        }
    }

    public void setTextAppearance(C1590d dVar) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14230U0 != f8) {
            eVar.f14230U0 = f8;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            float dimension = eVar.f14234Y0.getResources().getDimension(i);
            if (eVar.f14230U0 != dimension) {
                eVar.f14230U0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public final void setTextSize(int i, float f8) {
        super.setTextSize(i, f8);
        e eVar = this.f9248b0;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f8, getResources().getDisplayMetrics());
            i iVar = eVar.f14240e1;
            C1590d dVar = iVar.f15460f;
            if (dVar != null) {
                dVar.f16209k = applyDimension;
                iVar.f15456a.setTextSize(applyDimension);
                eVar.u();
                eVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f8) {
        e eVar = this.f9248b0;
        if (eVar != null && eVar.f14229T0 != f8) {
            eVar.f14229T0 = f8;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            float dimension = eVar.f14234Y0.getResources().getDimension(i);
            if (eVar.f14229T0 != dimension) {
                eVar.f14229T0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.M(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.z(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.E(z);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.Q(new C1590d(eVar.f14234Y0, i));
        }
        h();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.f9248b0;
        if (eVar != null) {
            eVar.Q(new C1590d(eVar.f14234Y0, i));
        }
        h();
    }
}
