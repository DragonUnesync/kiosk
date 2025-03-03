package com.google.android.flexbox;

import C7.d;
import Q0.g;
import V1.C0347f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e3.C0838a;
import e3.b;
import e3.c;
import e3.e;
import e3.j;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import v0.C1510H;

public class FlexboxLayout extends ViewGroup implements C0838a {

    /* renamed from: U  reason: collision with root package name */
    public int f9097U;

    /* renamed from: V  reason: collision with root package name */
    public int f9098V;

    /* renamed from: W  reason: collision with root package name */
    public int f9099W;

    /* renamed from: a0  reason: collision with root package name */
    public int f9100a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f9101b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f9102c0 = -1;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f9103d0;

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f9104e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f9105f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f9106g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f9107h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9108i0;

    /* renamed from: j0  reason: collision with root package name */
    public int[] f9109j0;

    /* renamed from: k0  reason: collision with root package name */
    public SparseIntArray f9110k0;

    /* renamed from: l0  reason: collision with root package name */
    public final d f9111l0 = new d((C0838a) this);

    /* renamed from: m0  reason: collision with root package name */
    public List f9112m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public final C0347f f9113n0 = new Object();

    /* JADX WARNING: type inference failed for: r2v2, types: [V1.f, java.lang.Object] */
    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11255a, 0, 0);
        this.f9097U = obtainStyledAttributes.getInt(5, 0);
        this.f9098V = obtainStyledAttributes.getInt(6, 0);
        this.f9099W = obtainStyledAttributes.getInt(7, 0);
        this.f9100a0 = obtainStyledAttributes.getInt(1, 0);
        this.f9101b0 = obtainStyledAttributes.getInt(0, 0);
        this.f9102c0 = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = obtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.f9106g0 = i;
            this.f9105f0 = i;
        }
        int i8 = obtainStyledAttributes.getInt(11, 0);
        if (i8 != 0) {
            this.f9106g0 = i8;
        }
        int i9 = obtainStyledAttributes.getInt(10, 0);
        if (i9 != 0) {
            this.f9105f0 = i9;
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(View view, int i, int i8, c cVar) {
        if (!p(i, i8)) {
            return;
        }
        if (j()) {
            int i9 = cVar.e;
            int i10 = this.f9108i0;
            cVar.e = i9 + i10;
            cVar.f11206f += i10;
            return;
        }
        int i11 = cVar.e;
        int i12 = this.f9107h0;
        cVar.e = i11 + i12;
        cVar.f11206f += i12;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, e3.d] */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f9110k0 == null) {
            this.f9110k0 = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f9110k0;
        d dVar = this.f9111l0;
        C0838a aVar = (C0838a) dVar.f732V;
        int flexItemCount = aVar.getFlexItemCount();
        ArrayList j7 = dVar.j(flexItemCount);
        ? obj = new Object();
        if (view == null || !(layoutParams instanceof b)) {
            obj.f11219V = 1;
        } else {
            obj.f11219V = ((b) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            obj.f11218U = flexItemCount;
        } else if (i < aVar.getFlexItemCount()) {
            obj.f11218U = i;
            for (int i8 = i; i8 < flexItemCount; i8++) {
                ((e3.d) j7.get(i8)).f11218U++;
            }
        } else {
            obj.f11218U = flexItemCount;
        }
        j7.add(obj);
        this.f9109j0 = d.B(flexItemCount + 1, j7, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    public final View b(int i) {
        return getChildAt(i);
    }

    public final int c(View view, int i, int i8) {
        int i9;
        int i10 = 0;
        if (j()) {
            if (p(i, i8)) {
                i10 = this.f9108i0;
            }
            if ((this.f9106g0 & 4) <= 0) {
                return i10;
            }
            i9 = this.f9108i0;
        } else {
            if (p(i, i8)) {
                i10 = this.f9107h0;
            }
            if ((this.f9105f0 & 4) <= 0) {
                return i10;
            }
            i9 = this.f9107h0;
        }
        return i10 + i9;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final int d(int i, int i8, int i9) {
        return ViewGroup.getChildMeasureSpec(i, i8, i9);
    }

    public final void e(Canvas canvas, boolean z, boolean z6) {
        int i;
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f9112m0.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) this.f9112m0.get(i11);
            for (int i12 = 0; i12 < cVar.f11208h; i12++) {
                int i13 = cVar.f11214o + i12;
                View o2 = o(i13);
                if (!(o2 == null || o2.getVisibility() == 8)) {
                    e eVar = (e) o2.getLayoutParams();
                    if (p(i13, i12)) {
                        if (z) {
                            i10 = o2.getRight() + eVar.rightMargin;
                        } else {
                            i10 = (o2.getLeft() - eVar.leftMargin) - this.f9108i0;
                        }
                        n(canvas, i10, cVar.f11203b, cVar.f11207g);
                    }
                    if (i12 == cVar.f11208h - 1 && (this.f9106g0 & 4) > 0) {
                        if (z) {
                            i9 = (o2.getLeft() - eVar.leftMargin) - this.f9108i0;
                        } else {
                            i9 = o2.getRight() + eVar.rightMargin;
                        }
                        n(canvas, i9, cVar.f11203b, cVar.f11207g);
                    }
                }
            }
            if (q(i11)) {
                if (z6) {
                    i8 = cVar.f11205d;
                } else {
                    i8 = cVar.f11203b - this.f9107h0;
                }
                m(canvas, paddingLeft, i8, max);
            }
            if (r(i11) && (this.f9105f0 & 4) > 0) {
                if (z6) {
                    i = cVar.f11203b - this.f9107h0;
                } else {
                    i = cVar.f11205d;
                }
                m(canvas, paddingLeft, i, max);
            }
        }
    }

    public final void f(c cVar) {
        if (j()) {
            if ((this.f9106g0 & 4) > 0) {
                int i = cVar.e;
                int i8 = this.f9108i0;
                cVar.e = i + i8;
                cVar.f11206f += i8;
            }
        } else if ((this.f9105f0 & 4) > 0) {
            int i9 = cVar.e;
            int i10 = this.f9107h0;
            cVar.e = i9 + i10;
            cVar.f11206f += i10;
        }
    }

    public final View g(int i) {
        return o(i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, e3.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f11220U = 1;
        marginLayoutParams.f11221V = 0.0f;
        marginLayoutParams.f11222W = 1.0f;
        marginLayoutParams.f11223X = -1;
        marginLayoutParams.f11224Y = -1.0f;
        marginLayoutParams.f11225Z = -1;
        marginLayoutParams.f11226a0 = -1;
        marginLayoutParams.f11227b0 = 16777215;
        marginLayoutParams.f11228c0 = 16777215;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11256b);
        marginLayoutParams.f11220U = obtainStyledAttributes.getInt(8, 1);
        marginLayoutParams.f11221V = obtainStyledAttributes.getFloat(2, 0.0f);
        marginLayoutParams.f11222W = obtainStyledAttributes.getFloat(3, 1.0f);
        marginLayoutParams.f11223X = obtainStyledAttributes.getInt(0, -1);
        marginLayoutParams.f11224Y = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        marginLayoutParams.f11225Z = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        marginLayoutParams.f11226a0 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        marginLayoutParams.f11227b0 = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        marginLayoutParams.f11228c0 = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        marginLayoutParams.f11229d0 = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    public int getAlignContent() {
        return this.f9101b0;
    }

    public int getAlignItems() {
        return this.f9100a0;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f9103d0;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f9104e0;
    }

    public int getFlexDirection() {
        return this.f9097U;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f9112m0.size());
        for (c cVar : this.f9112m0) {
            if (cVar.a() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public List<c> getFlexLinesInternal() {
        return this.f9112m0;
    }

    public int getFlexWrap() {
        return this.f9098V;
    }

    public int getJustifyContent() {
        return this.f9099W;
    }

    public int getLargestMainSize() {
        int i = RecyclerView.UNDEFINED_DURATION;
        for (c cVar : this.f9112m0) {
            i = Math.max(i, cVar.e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f9102c0;
    }

    public int getShowDividerHorizontal() {
        return this.f9105f0;
    }

    public int getShowDividerVertical() {
        return this.f9106g0;
    }

    public int getSumOfCrossSize() {
        int i;
        int i8;
        int size = this.f9112m0.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f9112m0.get(i10);
            if (q(i10)) {
                if (j()) {
                    i8 = this.f9107h0;
                } else {
                    i8 = this.f9108i0;
                }
                i9 += i8;
            }
            if (r(i10)) {
                if (j()) {
                    i = this.f9107h0;
                } else {
                    i = this.f9108i0;
                }
                i9 += i;
            }
            i9 += cVar.f11207g;
        }
        return i9;
    }

    public final void h(View view, int i) {
    }

    public final int i(int i, int i8, int i9) {
        return ViewGroup.getChildMeasureSpec(i, i8, i9);
    }

    public final boolean j() {
        int i = this.f9097U;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public final int k(View view) {
        return 0;
    }

    public final void l(Canvas canvas, boolean z, boolean z6) {
        int i;
        int i8;
        int i9;
        int i10;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f9112m0.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) this.f9112m0.get(i11);
            for (int i12 = 0; i12 < cVar.f11208h; i12++) {
                int i13 = cVar.f11214o + i12;
                View o2 = o(i13);
                if (!(o2 == null || o2.getVisibility() == 8)) {
                    e eVar = (e) o2.getLayoutParams();
                    if (p(i13, i12)) {
                        if (z6) {
                            i10 = o2.getBottom() + eVar.bottomMargin;
                        } else {
                            i10 = (o2.getTop() - eVar.topMargin) - this.f9107h0;
                        }
                        m(canvas, cVar.f11202a, i10, cVar.f11207g);
                    }
                    if (i12 == cVar.f11208h - 1 && (this.f9105f0 & 4) > 0) {
                        if (z6) {
                            i9 = (o2.getTop() - eVar.topMargin) - this.f9107h0;
                        } else {
                            i9 = o2.getBottom() + eVar.bottomMargin;
                        }
                        m(canvas, cVar.f11202a, i9, cVar.f11207g);
                    }
                }
            }
            if (q(i11)) {
                if (z) {
                    i8 = cVar.f11204c;
                } else {
                    i8 = cVar.f11202a - this.f9108i0;
                }
                n(canvas, i8, paddingTop, max);
            }
            if (r(i11) && (this.f9106g0 & 4) > 0) {
                if (z) {
                    i = cVar.f11202a - this.f9108i0;
                } else {
                    i = cVar.f11204c;
                }
                n(canvas, i, paddingTop, max);
            }
        }
    }

    public final void m(Canvas canvas, int i, int i8, int i9) {
        Drawable drawable = this.f9103d0;
        if (drawable != null) {
            drawable.setBounds(i, i8, i9 + i, this.f9107h0 + i8);
            this.f9103d0.draw(canvas);
        }
    }

    public final void n(Canvas canvas, int i, int i8, int i9) {
        Drawable drawable = this.f9104e0;
        if (drawable != null) {
            drawable.setBounds(i, i8, this.f9108i0 + i, i9 + i8);
            this.f9104e0.draw(canvas);
        }
    }

    public final View o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f9109j0;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9 = true;
        if (this.f9104e0 != null || this.f9103d0 != null) {
            if (this.f9105f0 != 0 || this.f9106g0 != 0) {
                WeakHashMap weakHashMap = C1510H.f15874a;
                int layoutDirection = getLayoutDirection();
                int i = this.f9097U;
                boolean z10 = false;
                if (i == 0) {
                    if (layoutDirection == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f9098V != 2) {
                        z9 = false;
                    }
                    e(canvas, z, z9);
                } else if (i == 1) {
                    if (layoutDirection != 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (this.f9098V != 2) {
                        z9 = false;
                    }
                    e(canvas, z6, z9);
                } else if (i == 2) {
                    if (layoutDirection == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (this.f9098V == 2) {
                        z8 = !z8;
                    }
                    l(canvas, z8, false);
                } else if (i == 3) {
                    if (layoutDirection == 1) {
                        z10 = true;
                    }
                    if (this.f9098V == 2) {
                        z10 = !z10;
                    }
                    l(canvas, z10, true);
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        WeakHashMap weakHashMap = C1510H.f15874a;
        int layoutDirection = getLayoutDirection();
        int i11 = this.f9097U;
        boolean z11 = false;
        if (i11 == 0) {
            if (layoutDirection == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            s(i, i8, i9, i10, z6);
        } else if (i11 == 1) {
            if (layoutDirection != 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            s(i, i8, i9, i10, z8);
        } else if (i11 == 2) {
            if (layoutDirection == 1) {
                z11 = true;
            }
            if (this.f9098V == 2) {
                z9 = true ^ z11;
            } else {
                z9 = z11;
            }
            t(i, i8, i9, z9, false, i10);
        } else if (i11 == 3) {
            if (layoutDirection == 1) {
                z11 = true;
            }
            if (this.f9098V == 2) {
                z10 = true ^ z11;
            } else {
                z10 = z11;
            }
            t(i, i8, i9, z10, true, i10);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f9097U);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r9 = r17
            r10 = r18
            android.util.SparseIntArray r1 = r0.f9110k0
            if (r1 != 0) goto L_0x0015
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            int r2 = r16.getChildCount()
            r1.<init>(r2)
            r0.f9110k0 = r1
        L_0x0015:
            android.util.SparseIntArray r1 = r0.f9110k0
            C7.d r11 = r0.f9111l0
            java.lang.Object r2 = r11.f732V
            e3.a r2 = (e3.C0838a) r2
            int r3 = r2.getFlexItemCount()
            int r4 = r1.size()
            r12 = 0
            if (r4 == r3) goto L_0x0029
            goto L_0x0043
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 >= r3) goto L_0x005b
            android.view.View r5 = r2.b(r4)
            if (r5 != 0) goto L_0x0033
            goto L_0x0058
        L_0x0033:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            e3.b r5 = (e3.b) r5
            int r5 = r5.getOrder()
            int r6 = r1.get(r4)
            if (r5 == r6) goto L_0x0058
        L_0x0043:
            android.util.SparseIntArray r1 = r0.f9110k0
            java.lang.Object r2 = r11.f732V
            e3.a r2 = (e3.C0838a) r2
            int r2 = r2.getFlexItemCount()
            java.util.ArrayList r3 = r11.j(r2)
            int[] r1 = C7.d.B(r2, r3, r1)
            r0.f9109j0 = r1
            goto L_0x005b
        L_0x0058:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x005b:
            int r1 = r0.f9097U
            V1.f r13 = r0.f9113n0
            r2 = 0
            r14 = 3
            r15 = 2
            if (r1 == 0) goto L_0x00bb
            r3 = 1
            if (r1 == r3) goto L_0x00bb
            if (r1 == r15) goto L_0x0082
            if (r1 != r14) goto L_0x006c
            goto L_0x0082
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid value for the flex direction is set: "
            r2.<init>(r3)
            int r3 = r0.f9097U
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0082:
            java.util.List r1 = r0.f9112m0
            r1.clear()
            r13.f5767a = r2
            r13.f5768b = r12
            C7.d r1 = r0.f9111l0
            V1.f r2 = r0.f9113n0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r3 = r18
            r4 = r17
            r1.e(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r1 = r13.f5767a
            r0.f9112m0 = r1
            r11.l(r9, r10, r12)
            int r1 = r16.getPaddingLeft()
            int r2 = r16.getPaddingRight()
            int r2 = r2 + r1
            r11.k(r9, r10, r2)
            r11.E(r12)
            int r1 = r0.f9097U
            int r2 = r13.f5768b
            r0.u(r1, r9, r10, r2)
            goto L_0x0169
        L_0x00bb:
            java.util.List r1 = r0.f9112m0
            r1.clear()
            r13.f5767a = r2
            r13.f5768b = r12
            C7.d r1 = r0.f9111l0
            V1.f r2 = r0.f9113n0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r3 = r17
            r4 = r18
            r1.e(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r1 = r13.f5767a
            r0.f9112m0 = r1
            r11.l(r9, r10, r12)
            int r1 = r0.f9100a0
            if (r1 != r14) goto L_0x0153
            java.util.List r1 = r0.f9112m0
            java.util.Iterator r1 = r1.iterator()
        L_0x00e6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0153
            java.lang.Object r2 = r1.next()
            e3.c r2 = (e3.c) r2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
        L_0x00f5:
            int r5 = r2.f11208h
            if (r4 >= r5) goto L_0x0150
            int r5 = r2.f11214o
            int r5 = r5 + r4
            android.view.View r5 = r0.o(r5)
            if (r5 == 0) goto L_0x014d
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L_0x010b
            goto L_0x014d
        L_0x010b:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            e3.e r6 = (e3.e) r6
            int r7 = r0.f9098V
            if (r7 == r15) goto L_0x012f
            int r7 = r2.f11211l
            int r8 = r5.getBaseline()
            int r7 = r7 - r8
            int r8 = r6.topMargin
            int r7 = java.lang.Math.max(r7, r8)
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x014d
        L_0x012f:
            int r7 = r2.f11211l
            int r8 = r5.getMeasuredHeight()
            int r7 = r7 - r8
            int r8 = r5.getBaseline()
            int r8 = r8 + r7
            int r7 = r6.bottomMargin
            int r7 = java.lang.Math.max(r8, r7)
            int r5 = r5.getMeasuredHeight()
            int r6 = r6.topMargin
            int r5 = r5 + r6
            int r5 = r5 + r7
            int r3 = java.lang.Math.max(r3, r5)
        L_0x014d:
            int r4 = r4 + 1
            goto L_0x00f5
        L_0x0150:
            r2.f11207g = r3
            goto L_0x00e6
        L_0x0153:
            int r1 = r16.getPaddingTop()
            int r2 = r16.getPaddingBottom()
            int r2 = r2 + r1
            r11.k(r9, r10, r2)
            r11.E(r12)
            int r1 = r0.f9097U
            int r2 = r13.f5768b
            r0.u(r1, r9, r10, r2)
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    public final boolean p(int i, int i8) {
        int i9 = 1;
        while (i9 <= i8) {
            View o2 = o(i - i9);
            if (o2 == null || o2.getVisibility() == 8) {
                i9++;
            } else if (j()) {
                if ((this.f9106g0 & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f9105f0 & 2) != 0) {
                return true;
            } else {
                return false;
            }
        }
        if (j()) {
            if ((this.f9106g0 & 1) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9105f0 & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean q(int i) {
        if (i < 0 || i >= this.f9112m0.size()) {
            return false;
        }
        int i8 = 0;
        while (i8 < i) {
            if (((c) this.f9112m0.get(i8)).a() <= 0) {
                i8++;
            } else if (j()) {
                if ((this.f9105f0 & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f9106g0 & 2) != 0) {
                return true;
            } else {
                return false;
            }
        }
        if (j()) {
            if ((this.f9105f0 & 1) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9106g0 & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean r(int i) {
        if (i < 0 || i >= this.f9112m0.size()) {
            return false;
        }
        for (int i8 = i + 1; i8 < this.f9112m0.size(); i8++) {
            if (((c) this.f9112m0.get(i8)).a() > 0) {
                return false;
            }
        }
        if (j()) {
            if ((this.f9105f0 & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9106g0 & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r29, int r30, int r31, int r32, boolean r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r32 - r30
            int r4 = r31 - r29
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List r6 = r0.f9112m0
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x021e
            java.util.List r9 = r0.f9112m0
            java.lang.Object r9 = r9.get(r8)
            e3.c r9 = (e3.c) r9
            boolean r10 = r0.q(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f9107h0
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f9099W
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c4
            if (r10 == r13) goto L_0x00ba
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00a7
            r7 = 3
            if (r10 == r7) goto L_0x008f
            if (r10 == r15) goto L_0x0076
            r7 = 5
            if (r10 != r7) goto L_0x0060
            int r7 = r9.a()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00c9
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.f9099W
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0076:
            int r7 = r9.a()
            if (r7 == 0) goto L_0x0084
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0085
        L_0x0084:
            r10 = 0
        L_0x0085:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00c9
        L_0x008f:
            float r7 = (float) r1
            int r10 = r9.a()
            if (r10 == r13) goto L_0x009a
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x009c
        L_0x009a:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x009c:
            int r12 = r9.e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00c9
        L_0x00a7:
            float r7 = (float) r1
            int r10 = r9.e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
        L_0x00b8:
            r10 = 0
            goto L_0x00c9
        L_0x00ba:
            int r7 = r9.e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00b8
        L_0x00c4:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
            goto L_0x00b8
        L_0x00c9:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00ce:
            int r10 = r9.f11208h
            if (r14 >= r10) goto L_0x0212
            int r10 = r9.f11214o
            int r10 = r10 + r14
            android.view.View r18 = r0.o(r10)
            if (r18 == 0) goto L_0x00e3
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00ef
        L_0x00e3:
            r27 = r1
            r25 = r14
            r22 = 2
            r23 = 4
            r26 = 1
            goto L_0x020a
        L_0x00ef:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            e3.e r15 = (e3.e) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.p(r10, r14)
            if (r10 == 0) goto L_0x010e
            int r10 = r0.f9108i0
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x0112
        L_0x010e:
            r19 = r12
            r20 = 0
        L_0x0112:
            int r10 = r9.f11208h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0124
            int r10 = r0.f9106g0
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0126
            int r10 = r0.f9108i0
            r21 = r10
            goto L_0x0128
        L_0x0124:
            r16 = 4
        L_0x0126:
            r21 = 0
        L_0x0128:
            int r10 = r0.f9098V
            r12 = 2
            if (r10 != r12) goto L_0x018c
            if (r33 == 0) goto L_0x0162
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r22 = r10 - r11
            int r10 = r18.getMeasuredHeight()
            int r23 = r3 - r10
            int r24 = java.lang.Math.round(r19)
            C7.d r10 = r0.f9111l0
            r11 = r18
            r25 = 2
            r12 = r9
            r26 = 1
            r13 = r22
            r25 = r14
            r22 = 2
            r14 = r23
            r27 = r1
            r1 = r15
            r23 = 4
            r15 = r24
            r16 = r3
            r10.w(r11, r12, r13, r14, r15, r16)
            goto L_0x01d4
        L_0x0162:
            r27 = r1
            r25 = r14
            r1 = r15
            r22 = 2
            r23 = 4
            r26 = 1
            int r13 = java.lang.Math.round(r7)
            int r10 = r18.getMeasuredHeight()
            int r14 = r3 - r10
            int r10 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredWidth()
            int r15 = r11 + r10
            C7.d r10 = r0.f9111l0
            r11 = r18
            r12 = r9
            r16 = r3
            r10.w(r11, r12, r13, r14, r15, r16)
            goto L_0x01d4
        L_0x018c:
            r27 = r1
            r25 = r14
            r1 = r15
            r22 = 2
            r23 = 4
            r26 = 1
            if (r33 == 0) goto L_0x01b7
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r13 = r10 - r11
            int r15 = java.lang.Math.round(r19)
            int r10 = r18.getMeasuredHeight()
            int r16 = r10 + r5
            C7.d r10 = r0.f9111l0
            r11 = r18
            r12 = r9
            r14 = r5
            r10.w(r11, r12, r13, r14, r15, r16)
            goto L_0x01d4
        L_0x01b7:
            int r13 = java.lang.Math.round(r7)
            int r10 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredWidth()
            int r15 = r11 + r10
            int r10 = r18.getMeasuredHeight()
            int r16 = r10 + r5
            C7.d r10 = r0.f9111l0
            r11 = r18
            r12 = r9
            r14 = r5
            r10.w(r11, r12, r13, r14, r15, r16)
        L_0x01d4:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r33 == 0) goto L_0x01fc
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.b(r11, r12, r13, r14, r15)
            goto L_0x0208
        L_0x01fc:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.b(r11, r12, r13, r14, r15)
        L_0x0208:
            r12 = r19
        L_0x020a:
            int r14 = r25 + 1
            r1 = r27
            r13 = 1
            r15 = 4
            goto L_0x00ce
        L_0x0212:
            r27 = r1
            int r1 = r9.f11207g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r27
            goto L_0x001e
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.s(int, int, int, int, boolean):void");
    }

    public void setAlignContent(int i) {
        if (this.f9101b0 != i) {
            this.f9101b0 = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f9100a0 != i) {
            this.f9100a0 = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f9103d0) {
            this.f9103d0 = drawable;
            if (drawable != null) {
                this.f9107h0 = drawable.getIntrinsicHeight();
            } else {
                this.f9107h0 = 0;
            }
            if (this.f9103d0 == null && this.f9104e0 == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f9104e0) {
            this.f9104e0 = drawable;
            if (drawable != null) {
                this.f9108i0 = drawable.getIntrinsicWidth();
            } else {
                this.f9108i0 = 0;
            }
            if (this.f9103d0 == null && this.f9104e0 == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f9097U != i) {
            this.f9097U = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<c> list) {
        this.f9112m0 = list;
    }

    public void setFlexWrap(int i) {
        if (this.f9098V != i) {
            this.f9098V = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f9099W != i) {
            this.f9099W = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f9102c0 != i) {
            this.f9102c0 = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f9105f0) {
            this.f9105f0 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f9106g0) {
            this.f9106g0 = i;
            requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(int r30, int r31, int r32, boolean r33, boolean r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r32 - r30
            int r6 = r35 - r31
            int r5 = r5 - r3
            java.util.List r3 = r0.f9112m0
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x020b
            java.util.List r9 = r0.f9112m0
            java.lang.Object r9 = r9.get(r8)
            e3.c r9 = (e3.c) r9
            boolean r10 = r0.q(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f9108i0
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.f9099W
            r15 = 1
            r14 = 4
            r11 = 0
            if (r10 == 0) goto L_0x00bf
            if (r10 == r15) goto L_0x00b6
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00a6
            r12 = 3
            if (r10 == r12) goto L_0x008f
            if (r10 == r14) goto L_0x0076
            r12 = 5
            if (r10 != r12) goto L_0x0060
            int r10 = r9.a()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00c3
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.f9099W
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0076:
            int r10 = r9.a()
            if (r10 == 0) goto L_0x0084
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0085
        L_0x0084:
            r12 = 0
        L_0x0085:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00c3
        L_0x008f:
            float r10 = (float) r1
            int r7 = r9.a()
            if (r7 == r15) goto L_0x009a
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x009c
        L_0x009a:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x009c:
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00c3
        L_0x00a6:
            float r7 = (float) r1
            int r10 = r9.e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r7 = r7 + r10
            int r12 = r6 - r2
            float r12 = (float) r12
            float r13 = r12 - r10
            r10 = r7
        L_0x00b4:
            r12 = 0
            goto L_0x00c3
        L_0x00b6:
            int r7 = r9.e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
        L_0x00bd:
            float r13 = (float) r7
            goto L_0x00b4
        L_0x00bf:
            float r10 = (float) r1
            int r7 = r6 - r2
            goto L_0x00bd
        L_0x00c3:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00c8:
            int r11 = r9.f11208h
            if (r12 >= r11) goto L_0x0203
            int r11 = r9.f11214o
            int r11 = r11 + r12
            android.view.View r18 = r0.o(r11)
            if (r18 == 0) goto L_0x00dd
            int r14 = r18.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x00e5
        L_0x00dd:
            r25 = r12
            r26 = 4
            r27 = 1
            goto L_0x01fd
        L_0x00e5:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            e3.e r15 = (e3.e) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.p(r11, r12)
            if (r11 == 0) goto L_0x0106
            int r11 = r0.f9107h0
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x010c
        L_0x0106:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x010c:
            int r10 = r9.f11208h
            r16 = 1
            int r10 = r10 + -1
            if (r12 != r10) goto L_0x011f
            int r10 = r0.f9105f0
            r14 = 4
            r10 = r10 & r14
            if (r10 <= 0) goto L_0x0120
            int r10 = r0.f9107h0
            r22 = r10
            goto L_0x0122
        L_0x011f:
            r14 = 4
        L_0x0120:
            r22 = 0
        L_0x0122:
            if (r33 == 0) goto L_0x017d
            if (r34 == 0) goto L_0x0155
            int r10 = r18.getMeasuredWidth()
            int r17 = r5 - r10
            int r10 = java.lang.Math.round(r20)
            int r11 = r18.getMeasuredHeight()
            int r23 = r10 - r11
            int r24 = java.lang.Math.round(r20)
            C7.d r10 = r0.f9111l0
            r13 = 1
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = 4
            r14 = r17
            r28 = r15
            r27 = 1
            r15 = r23
            r16 = r5
            r17 = r24
            r10.x(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c4
        L_0x0155:
            r25 = r12
            r28 = r15
            r26 = 4
            r27 = 1
            int r10 = r18.getMeasuredWidth()
            int r14 = r5 - r10
            int r15 = java.lang.Math.round(r19)
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r17 = r11 + r10
            C7.d r10 = r0.f9111l0
            r13 = 1
            r11 = r18
            r12 = r9
            r16 = r5
            r10.x(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c4
        L_0x017d:
            r25 = r12
            r28 = r15
            r26 = 4
            r27 = 1
            if (r34 == 0) goto L_0x01a6
            int r10 = java.lang.Math.round(r20)
            int r11 = r18.getMeasuredHeight()
            int r15 = r10 - r11
            int r10 = r18.getMeasuredWidth()
            int r16 = r10 + r4
            int r17 = java.lang.Math.round(r20)
            C7.d r10 = r0.f9111l0
            r13 = 0
            r11 = r18
            r12 = r9
            r14 = r4
            r10.x(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c4
        L_0x01a6:
            int r15 = java.lang.Math.round(r19)
            int r10 = r18.getMeasuredWidth()
            int r16 = r10 + r4
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r17 = r11 + r10
            C7.d r10 = r0.f9111l0
            r13 = 0
            r11 = r18
            r12 = r9
            r14 = r4
            r10.x(r11, r12, r13, r14, r15, r16, r17)
        L_0x01c4:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r28
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r16 = r10 + r19
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r34 == 0) goto L_0x01ed
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.b(r11, r12, r13, r14, r15)
            goto L_0x01f9
        L_0x01ed:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.b(r11, r12, r13, r14, r15)
        L_0x01f9:
            r10 = r16
            r13 = r20
        L_0x01fd:
            int r12 = r25 + 1
            r14 = 4
            r15 = 1
            goto L_0x00c8
        L_0x0203:
            int r7 = r9.f11207g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(int, int, int, boolean, boolean, int):void");
    }

    public final void u(int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (i == 0 || i == 1) {
            i11 = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            i12 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i11 = getLargestMainSize();
            i12 = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            throw new IllegalArgumentException(g.m(i, "Invalid flex direction: "));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i12) {
                i10 = View.combineMeasuredStates(i10, 16777216);
            } else {
                size = i12;
            }
            i13 = View.resolveSizeAndState(size, i8, i10);
        } else if (mode == 0) {
            i13 = View.resolveSizeAndState(i12, i8, i10);
        } else if (mode == 1073741824) {
            if (size < i12) {
                i10 = View.combineMeasuredStates(i10, 16777216);
            }
            i13 = View.resolveSizeAndState(size, i8, i10);
        } else {
            throw new IllegalStateException(g.m(mode, "Unknown width mode is set: "));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i11) {
                i10 = View.combineMeasuredStates(i10, 256);
            } else {
                size2 = i11;
            }
            i14 = View.resolveSizeAndState(size2, i9, i10);
        } else if (mode2 == 0) {
            i14 = View.resolveSizeAndState(i11, i9, i10);
        } else if (mode2 == 1073741824) {
            if (size2 < i11) {
                i10 = View.combineMeasuredStates(i10, 256);
            }
            i14 = View.resolveSizeAndState(size2, i9, i10);
        } else {
            throw new IllegalStateException(g.m(mode2, "Unknown height mode is set: "));
        }
        setMeasuredDimension(i13, i14);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, e3.e] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, e3.e] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, e3.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(eVar);
            marginLayoutParams.f11220U = 1;
            marginLayoutParams.f11221V = 0.0f;
            marginLayoutParams.f11222W = 1.0f;
            marginLayoutParams.f11223X = -1;
            marginLayoutParams.f11224Y = -1.0f;
            marginLayoutParams.f11225Z = -1;
            marginLayoutParams.f11226a0 = -1;
            marginLayoutParams.f11227b0 = 16777215;
            marginLayoutParams.f11228c0 = 16777215;
            marginLayoutParams.f11220U = eVar.f11220U;
            marginLayoutParams.f11221V = eVar.f11221V;
            marginLayoutParams.f11222W = eVar.f11222W;
            marginLayoutParams.f11223X = eVar.f11223X;
            marginLayoutParams.f11224Y = eVar.f11224Y;
            marginLayoutParams.f11225Z = eVar.f11225Z;
            marginLayoutParams.f11226a0 = eVar.f11226a0;
            marginLayoutParams.f11227b0 = eVar.f11227b0;
            marginLayoutParams.f11228c0 = eVar.f11228c0;
            marginLayoutParams.f11229d0 = eVar.f11229d0;
            return marginLayoutParams;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams2.f11220U = 1;
            marginLayoutParams2.f11221V = 0.0f;
            marginLayoutParams2.f11222W = 1.0f;
            marginLayoutParams2.f11223X = -1;
            marginLayoutParams2.f11224Y = -1.0f;
            marginLayoutParams2.f11225Z = -1;
            marginLayoutParams2.f11226a0 = -1;
            marginLayoutParams2.f11227b0 = 16777215;
            marginLayoutParams2.f11228c0 = 16777215;
            return marginLayoutParams2;
        } else {
            ? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams3.f11220U = 1;
            marginLayoutParams3.f11221V = 0.0f;
            marginLayoutParams3.f11222W = 1.0f;
            marginLayoutParams3.f11223X = -1;
            marginLayoutParams3.f11224Y = -1.0f;
            marginLayoutParams3.f11225Z = -1;
            marginLayoutParams3.f11226a0 = -1;
            marginLayoutParams3.f11227b0 = 16777215;
            marginLayoutParams3.f11228c0 = 16777215;
            return marginLayoutParams3;
        }
    }
}
