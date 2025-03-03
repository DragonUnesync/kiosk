package com.google.android.material.sidesheet;

import A3.d;
import C0.f;
import D7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.c;
import f3.C0899a;
import h0.C1026a;
import h0.C1029d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import v0.C1510H;
import w0.C1575d;
import z3.g;
import z3.k;

public class SideSheetBehavior<V extends View> extends C1026a {

    /* renamed from: a  reason: collision with root package name */
    public b f9370a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9371b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f9372c;

    /* renamed from: d  reason: collision with root package name */
    public final k f9373d;
    public final A3.g e = new A3.g(this);

    /* renamed from: f  reason: collision with root package name */
    public final float f9374f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9375g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f9376h = 5;
    public f i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9377j;

    /* renamed from: k  reason: collision with root package name */
    public final float f9378k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f9379l;

    /* renamed from: m  reason: collision with root package name */
    public int f9380m;

    /* renamed from: n  reason: collision with root package name */
    public int f9381n;

    /* renamed from: o  reason: collision with root package name */
    public int f9382o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f9383p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f9384q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9385r = -1;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f9386s;

    /* renamed from: t  reason: collision with root package name */
    public int f9387t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f9388u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    public final d f9389v = new d(this, 0);

    public SideSheetBehavior() {
    }

    public final void c(C1029d dVar) {
        this.f9383p = null;
        this.i = null;
    }

    public final void e() {
        this.f9383p = null;
        this.i = null;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || C1510H.d(view) != null) && this.f9375g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f9386s) != null) {
                velocityTracker.recycle();
                this.f9386s = null;
            }
            if (this.f9386s == null) {
                this.f9386s = VelocityTracker.obtain();
            }
            this.f9386s.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.f9387t = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.f9377j) {
                this.f9377j = false;
                return false;
            }
            if (this.f9377j || (fVar = this.i) == null || !fVar.p(motionEvent)) {
                return false;
            }
            return true;
        }
        this.f9377j = true;
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v26, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            z3.g r2 = r10.f9371b
            java.util.WeakHashMap r3 = v0.C1510H.f15874a
            boolean r3 = r11.getFitsSystemWindows()
            if (r3 == 0) goto L_0x0015
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 != 0) goto L_0x0015
            r12.setFitsSystemWindows(r1)
        L_0x0015:
            java.lang.ref.WeakReference r3 = r10.f9383p
            r4 = 5
            r5 = 0
            if (r3 != 0) goto L_0x00ad
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r12)
            r10.f9383p = r3
            android.content.Context r3 = r12.getContext()
            android.view.animation.PathInterpolator r6 = new android.view.animation.PathInterpolator
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r5, r5, r5, r7)
            r7 = 2130969412(0x7f040344, float:1.7547505E38)
            B.C0003d.J(r3, r7, r6)
            r6 = 2130969395(0x7f040333, float:1.754747E38)
            r7 = 300(0x12c, float:4.2E-43)
            B.C0003d.I(r3, r6, r7)
            r6 = 2130969400(0x7f040338, float:1.754748E38)
            r7 = 150(0x96, float:2.1E-43)
            B.C0003d.I(r3, r6, r7)
            r6 = 2130969399(0x7f040337, float:1.7547479E38)
            r7 = 100
            B.C0003d.I(r3, r6, r7)
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131165402(0x7f0700da, float:1.794502E38)
            r3.getDimension(r6)
            r6 = 2131165401(0x7f0700d9, float:1.7945018E38)
            r3.getDimension(r6)
            r6 = 2131165403(0x7f0700db, float:1.7945022E38)
            r3.getDimension(r6)
            if (r2 == 0) goto L_0x0076
            r12.setBackground(r2)
            float r3 = r10.f9374f
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0072
            float r3 = v0.C1553z.e(r12)
        L_0x0072:
            r2.i(r3)
            goto L_0x007d
        L_0x0076:
            android.content.res.ColorStateList r3 = r10.f9372c
            if (r3 == 0) goto L_0x007d
            v0.C1510H.r(r12, r3)
        L_0x007d:
            int r3 = r10.f9376h
            if (r3 != r4) goto L_0x0083
            r3 = 4
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            int r6 = r12.getVisibility()
            if (r6 == r3) goto L_0x008d
            r12.setVisibility(r3)
        L_0x008d:
            r10.u()
            int r3 = r12.getImportantForAccessibility()
            if (r3 != 0) goto L_0x0099
            r12.setImportantForAccessibility(r1)
        L_0x0099:
            java.lang.CharSequence r3 = v0.C1510H.d(r12)
            if (r3 != 0) goto L_0x00ad
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131951953(0x7f130151, float:1.9540335E38)
            java.lang.String r3 = r3.getString(r6)
            v0.C1510H.q(r12, r3)
        L_0x00ad:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            h0.d r3 = (h0.C1029d) r3
            int r3 = r3.f12263c
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r13)
            r6 = 3
            if (r3 != r6) goto L_0x00be
            r3 = 1
            goto L_0x00bf
        L_0x00be:
            r3 = 0
        L_0x00bf:
            D7.b r7 = r10.f9370a
            if (r7 == 0) goto L_0x00c9
            int r7 = r7.x()
            if (r7 == r3) goto L_0x015d
        L_0x00c9:
            z3.k r7 = r10.f9373d
            r8 = 0
            if (r3 != 0) goto L_0x0115
            A3.a r3 = new A3.a
            r3.<init>(r10, r1)
            r10.f9370a = r3
            if (r7 == 0) goto L_0x015d
            java.lang.ref.WeakReference r3 = r10.f9383p
            if (r3 == 0) goto L_0x00f2
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00f2
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof h0.C1029d
            if (r9 == 0) goto L_0x00f2
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            h0.d r8 = (h0.C1029d) r8
        L_0x00f2:
            if (r8 == 0) goto L_0x00f9
            int r3 = r8.rightMargin
            if (r3 <= 0) goto L_0x00f9
            goto L_0x015d
        L_0x00f9:
            z3.j r3 = r7.e()
            z3.a r7 = new z3.a
            r7.<init>(r5)
            r3.f16495f = r7
            z3.a r7 = new z3.a
            r7.<init>(r5)
            r3.f16496g = r7
            z3.k r3 = r3.a()
            if (r2 == 0) goto L_0x015d
            r2.setShapeAppearanceModel(r3)
            goto L_0x015d
        L_0x0115:
            if (r3 != r1) goto L_0x0200
            A3.a r3 = new A3.a
            r3.<init>(r10, r0)
            r10.f9370a = r3
            if (r7 == 0) goto L_0x015d
            java.lang.ref.WeakReference r3 = r10.f9383p
            if (r3 == 0) goto L_0x013b
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x013b
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof h0.C1029d
            if (r9 == 0) goto L_0x013b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            h0.d r8 = (h0.C1029d) r8
        L_0x013b:
            if (r8 == 0) goto L_0x0142
            int r3 = r8.leftMargin
            if (r3 <= 0) goto L_0x0142
            goto L_0x015d
        L_0x0142:
            z3.j r3 = r7.e()
            z3.a r7 = new z3.a
            r7.<init>(r5)
            r3.e = r7
            z3.a r7 = new z3.a
            r7.<init>(r5)
            r3.f16497h = r7
            z3.k r3 = r3.a()
            if (r2 == 0) goto L_0x015d
            r2.setShapeAppearanceModel(r3)
        L_0x015d:
            C0.f r2 = r10.i
            if (r2 != 0) goto L_0x016e
            C0.f r2 = new C0.f
            android.content.Context r3 = r11.getContext()
            A3.d r5 = r10.f9389v
            r2.<init>(r3, r11, r5)
            r10.i = r2
        L_0x016e:
            D7.b r2 = r10.f9370a
            int r2 = r2.v(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.f9380m = r13
            D7.b r13 = r10.f9370a
            int r13 = r13.w(r11)
            r10.f9381n = r13
            int r13 = r12.getWidth()
            r10.f9379l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L_0x019a
            D7.b r3 = r10.f9370a
            int r13 = r3.b(r13)
            goto L_0x019b
        L_0x019a:
            r13 = 0
        L_0x019b:
            r10.f9382o = r13
            int r13 = r10.f9376h
            if (r13 == r1) goto L_0x01c5
            r3 = 2
            if (r13 == r3) goto L_0x01c5
            if (r13 == r6) goto L_0x01cd
            if (r13 != r4) goto L_0x01af
            D7.b r13 = r10.f9370a
            int r0 = r13.r()
            goto L_0x01cd
        L_0x01af:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r13 = r10.f9376h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01c5:
            D7.b r13 = r10.f9370a
            int r13 = r13.v(r12)
            int r0 = r2 - r13
        L_0x01cd:
            v0.C1510H.j(r12, r0)
            java.lang.ref.WeakReference r12 = r10.f9384q
            if (r12 != 0) goto L_0x01e6
            int r12 = r10.f9385r
            r13 = -1
            if (r12 == r13) goto L_0x01e6
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L_0x01e6
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.f9384q = r12
        L_0x01e6:
            java.util.LinkedHashSet r11 = r10.f9388u
            java.util.Iterator r11 = r11.iterator()
        L_0x01ec:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01ff
            java.lang.Object r12 = r11.next()
            if (r12 != 0) goto L_0x01f9
            goto L_0x01ec
        L_0x01f9:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        L_0x01ff:
            return r1
        L_0x0200:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid sheet edge position value: "
            java.lang.String r13 = ". Must be 0 or 1."
            java.lang.String r12 = u.C1477r.c(r3, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final void m(View view, Parcelable parcelable) {
        int i8 = ((A3.f) parcelable).f88W;
        if (i8 == 1 || i8 == 2) {
            i8 = 5;
        }
        this.f9376h = i8;
    }

    public final Parcelable n(View view) {
        return new A3.f(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9376h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f9386s) != null) {
            velocityTracker.recycle();
            this.f9386s = null;
        }
        if (this.f9386s == null) {
            this.f9386s = VelocityTracker.obtain();
        }
        this.f9386s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f9377j && s()) {
            float abs = Math.abs(((float) this.f9387t) - motionEvent.getX());
            f fVar = this.i;
            if (abs > ((float) fVar.f512b)) {
                fVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f9377j;
    }

    public final void r(int i8) {
        View view;
        int i9;
        if (this.f9376h != i8) {
            this.f9376h = i8;
            WeakReference weakReference = this.f9383p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.f9376h == 5) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
                if (view.getVisibility() != i9) {
                    view.setVisibility(i9);
                }
                Iterator it = this.f9388u.iterator();
                if (!it.hasNext()) {
                    u();
                    return;
                }
                throw Q0.g.k(it);
            }
        }
    }

    public final boolean s() {
        if (this.i == null || (!this.f9375g && this.f9376h != 1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r3 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L_0x0019
            r0 = 5
            if (r4 != r0) goto L_0x000d
            D7.b r0 = r2.f9370a
            int r0 = r0.r()
            goto L_0x001f
        L_0x000d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = Q0.g.m(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x0019:
            D7.b r0 = r2.f9370a
            int r0 = r0.q()
        L_0x001f:
            C0.f r1 = r2.i
            if (r1 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0030
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L_0x0057
            goto L_0x004d
        L_0x0030:
            int r5 = r3.getTop()
            r1.f526r = r3
            r3 = -1
            r1.f513c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L_0x004b
            int r5 = r1.f511a
            if (r5 != 0) goto L_0x004b
            android.view.View r5 = r1.f526r
            if (r5 == 0) goto L_0x004b
            r5 = 0
            r1.f526r = r5
        L_0x004b:
            if (r3 == 0) goto L_0x0057
        L_0x004d:
            r3 = 2
            r2.r(r3)
            A3.g r3 = r2.e
            r3.a(r4)
            goto L_0x005a
        L_0x0057:
            r2.r(r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f9383p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C1510H.m(view, 262144);
            C1510H.i(view, 0);
            C1510H.m(view, 1048576);
            C1510H.i(view, 0);
            if (this.f9376h != 5) {
                C1510H.n(view, C1575d.f16184j, new A3.b(5, 0, this));
            }
            if (this.f9376h != 3) {
                C1510H.n(view, C1575d.f16183h, new A3.b(3, 0, this));
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11669w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9372c = c.j(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f9373d = k.b(context, attributeSet, 0, 2132018182).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f9385r = resourceId;
            WeakReference weakReference = this.f9384q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f9384q = null;
            WeakReference weakReference2 = this.f9383p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f9373d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f9371b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f9372c;
            if (colorStateList != null) {
                this.f9371b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f9371b.setTint(typedValue.data);
            }
        }
        this.f9374f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f9375g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
