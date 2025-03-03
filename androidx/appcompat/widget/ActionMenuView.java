package androidx.appcompat.widget;

import D2.G;
import O7.b;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.RecyclerView;
import h1.C1048n;
import k2.C1160q;
import n.C1220A;
import n.k;
import n.l;
import n.m;
import n.o;
import n.x;
import n.y;
import o.C1269g;
import o.C1275j;
import o.C1277k;
import o.C1279l;
import o.C1281m;
import o.C1283n;
import o.C1305y0;
import o.C1307z0;
import o.w1;

public class ActionMenuView extends C1307z0 implements l, C1220A {

    /* renamed from: m0  reason: collision with root package name */
    public m f7445m0;

    /* renamed from: n0  reason: collision with root package name */
    public Context f7446n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7447o0 = 0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public C1277k f7448q0;

    /* renamed from: r0  reason: collision with root package name */
    public G f7449r0;

    /* renamed from: s0  reason: collision with root package name */
    public k f7450s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f7451t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f7452u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f7453v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f7454w0;

    /* renamed from: x0  reason: collision with root package name */
    public C1283n f7455x0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f7453v0 = (int) (56.0f * f8);
        this.f7454w0 = (int) (f8 * 4.0f);
        this.f7446n0 = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.m] */
    public static C1281m l() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f14002a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C1281m m(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof o.C1281m
            if (r0 == 0) goto L_0x0012
            o.m r0 = new o.m
            o.m r1 = (o.C1281m) r1
            r0.<init>(r1)
            boolean r1 = r1.f14002a
            r0.f14002a = r1
            goto L_0x0017
        L_0x0012:
            o.m r0 = new o.m
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.gravity
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.gravity = r1
        L_0x001f:
            return r0
        L_0x0020:
            o.m r1 = l()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m(android.view.ViewGroup$LayoutParams):o.m");
    }

    public final void c(m mVar) {
        this.f7445m0 = mVar;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1281m;
    }

    public final boolean d(o oVar) {
        return this.f7445m0.q(oVar, (y) null, 0);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f7445m0 == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f7445m0 = mVar;
            mVar.f13482Y = new C1160q(11, (Object) this);
            C1277k kVar = new C1277k(context);
            this.f7448q0 = kVar;
            kVar.f13989f0 = true;
            kVar.f13990g0 = true;
            x xVar = this.f7449r0;
            if (xVar == null) {
                xVar = new C1048n(9);
            }
            kVar.f13982Y = xVar;
            this.f7445m0.b(kVar, this.f7446n0);
            C1277k kVar2 = this.f7448q0;
            kVar2.f13985b0 = this;
            this.f7445m0 = kVar2.f13980W;
        }
        return this.f7445m0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1277k kVar = this.f7448q0;
        C1275j jVar = kVar.f13986c0;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f13988e0) {
            return kVar.f13987d0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f7447o0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ C1305y0 h() {
        return l();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.y0, android.widget.LinearLayout$LayoutParams] */
    public final C1305y0 i(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ C1305y0 j(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C1279l)) {
            z = ((C1279l) childAt).b();
        }
        if (i <= 0 || !(childAt2 instanceof C1279l)) {
            return z;
        }
        return z | ((C1279l) childAt2).c();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1277k kVar = this.f7448q0;
        if (kVar != null) {
            kVar.d();
            if (this.f7448q0.e()) {
                this.f7448q0.c();
                this.f7448q0.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1277k kVar = this.f7448q0;
        if (kVar != null) {
            kVar.c();
            C1269g gVar = kVar.f13997n0;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        boolean z6;
        int i11;
        int i12;
        int i13;
        if (!this.f7451t0) {
            super.onLayout(z, i, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i9 - i;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z8 = w1.f14104a;
        if (getLayoutDirection() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C1281m mVar = (C1281m) childAt.getLayoutParams();
                if (mVar.f14002a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z6) {
                        i12 = getPaddingLeft() + mVar.leftMargin;
                        i13 = i12 + measuredWidth;
                    } else {
                        i13 = (getWidth() - getPaddingRight()) - mVar.rightMargin;
                        i12 = i13 - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i12, i19, i13, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + mVar.leftMargin) + mVar.rightMargin;
                    n(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        if (i22 > 0) {
            i11 = paddingRight / i22;
        } else {
            i11 = 0;
        }
        int max = Math.max(0, i11);
        if (z6) {
            int width = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C1281m mVar2 = (C1281m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f14002a) {
                    int i24 = width - mVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width = i24 - ((measuredWidth3 + mVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C1281m mVar3 = (C1281m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f14002a) {
                int i27 = paddingLeft + mVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + mVar3.rightMargin + max + i27;
            }
        }
    }

    public final void onMeasure(int i, int i8) {
        boolean z;
        int i9;
        boolean z6;
        boolean z8;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        int i17;
        ActionMenuItemView actionMenuItemView;
        boolean z13;
        int i18;
        boolean z14;
        m mVar;
        boolean z15 = this.f7451t0;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f7451t0 = z;
        if (z15 != z) {
            this.f7452u0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f7451t0 || (mVar = this.f7445m0) == null || size == this.f7452u0)) {
            this.f7452u0 = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f7451t0 || childCount <= 0) {
            int i19 = i8;
            for (int i20 = 0; i20 < childCount; i20++) {
                C1281m mVar2 = (C1281m) getChildAt(i20).getLayoutParams();
                mVar2.rightMargin = 0;
                mVar2.leftMargin = 0;
            }
            super.onMeasure(i, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
        int i21 = size2 - paddingRight;
        int i22 = this.f7453v0;
        int i23 = i21 / i22;
        int i24 = i21 % i22;
        if (i23 == 0) {
            setMeasuredDimension(i21, 0);
            return;
        }
        int i25 = (i24 / i23) + i22;
        int childCount2 = getChildCount();
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z16 = false;
        long j7 = 0;
        int i30 = 0;
        while (true) {
            i9 = this.f7454w0;
            if (i29 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i29);
            int i31 = size3;
            int i32 = i21;
            if (childAt.getVisibility() == 8) {
                i15 = mode;
                i16 = paddingBottom;
            } else {
                boolean z17 = childAt instanceof ActionMenuItemView;
                int i33 = i27 + 1;
                if (z17) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C1281m mVar3 = (C1281m) childAt.getLayoutParams();
                mVar3.f14006f = false;
                mVar3.f14004c = 0;
                mVar3.f14003b = 0;
                mVar3.f14005d = false;
                mVar3.leftMargin = 0;
                mVar3.rightMargin = 0;
                if (!z17 || TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                mVar3.e = z12;
                if (mVar3.f14002a) {
                    i17 = 1;
                } else {
                    i17 = i23;
                }
                int i34 = i33;
                C1281m mVar4 = (C1281m) childAt.getLayoutParams();
                i15 = mode;
                i16 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z17) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (i17 <= 0 || (z13 && i17 < 2)) {
                    i18 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i25, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i18 = measuredWidth / i25;
                    if (measuredWidth % i25 != 0) {
                        i18++;
                    }
                    if (z13 && i18 < 2) {
                        i18 = 2;
                    }
                }
                if (mVar4.f14002a || !z13) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                mVar4.f14005d = z14;
                mVar4.f14003b = i18;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i25, b.MAX_POW2), makeMeasureSpec);
                i28 = Math.max(i28, i18);
                if (mVar3.f14005d) {
                    i30++;
                }
                if (mVar3.f14002a) {
                    z16 = true;
                }
                i23 -= i18;
                i26 = Math.max(i26, childAt.getMeasuredHeight());
                if (i18 == 1) {
                    j7 |= (long) (1 << i29);
                }
                i27 = i34;
            }
            i29++;
            size3 = i31;
            i21 = i32;
            paddingBottom = i16;
            mode = i15;
        }
        int i35 = mode;
        int i36 = i21;
        int i37 = size3;
        if (!z16 || i27 != 2) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z18 = false;
        while (true) {
            if (i30 <= 0 || i23 <= 0) {
                z8 = z18;
            } else {
                int i38 = Integer.MAX_VALUE;
                int i39 = 0;
                int i40 = 0;
                long j8 = 0;
                while (i40 < childCount2) {
                    C1281m mVar5 = (C1281m) getChildAt(i40).getLayoutParams();
                    boolean z19 = z18;
                    if (mVar5.f14005d) {
                        int i41 = mVar5.f14003b;
                        if (i41 < i38) {
                            j8 = 1 << i40;
                            i38 = i41;
                            i39 = 1;
                        } else if (i41 == i38) {
                            j8 |= 1 << i40;
                            i39++;
                        }
                    }
                    i40++;
                    z18 = z19;
                }
                z8 = z18;
                j7 |= j8;
                if (i39 > i23) {
                    break;
                }
                int i42 = i38 + 1;
                int i43 = 0;
                while (i43 < childCount2) {
                    View childAt2 = getChildAt(i43);
                    C1281m mVar6 = (C1281m) childAt2.getLayoutParams();
                    int i44 = i26;
                    int i45 = childMeasureSpec;
                    int i46 = childCount2;
                    long j9 = (long) (1 << i43);
                    if ((j8 & j9) != 0) {
                        if (!z6 || !mVar6.e) {
                            z11 = true;
                        } else {
                            z11 = true;
                            if (i23 == 1) {
                                childAt2.setPadding(i9 + i25, 0, i9, 0);
                            }
                        }
                        mVar6.f14003b += z11 ? 1 : 0;
                        mVar6.f14006f = z11;
                        i23--;
                    } else if (mVar6.f14003b == i42) {
                        j7 |= j9;
                    }
                    i43++;
                    childMeasureSpec = i45;
                    i26 = i44;
                    childCount2 = i46;
                }
                z18 = true;
            }
        }
        z8 = z18;
        int i47 = i26;
        int i48 = childMeasureSpec;
        int i49 = childCount2;
        if (z16 || i27 != 1) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i23 <= 0 || j7 == 0 || (i23 >= i27 - 1 && !z9 && i28 <= 1)) {
            i10 = i49;
            z10 = z8;
        } else {
            float bitCount = (float) Long.bitCount(j7);
            if (!z9) {
                if ((j7 & 1) != 0 && !((C1281m) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i50 = i49 - 1;
                if ((j7 & ((long) (1 << i50))) != 0 && !((C1281m) getChildAt(i50).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i14 = (int) (((float) (i23 * i25)) / bitCount);
            } else {
                i14 = 0;
            }
            boolean z20 = z8;
            i10 = i49;
            for (int i51 = 0; i51 < i10; i51++) {
                if ((j7 & ((long) (1 << i51))) != 0) {
                    View childAt3 = getChildAt(i51);
                    C1281m mVar7 = (C1281m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar7.f14004c = i14;
                        mVar7.f14006f = true;
                        if (i51 == 0 && !mVar7.e) {
                            mVar7.leftMargin = (-i14) / 2;
                        }
                        z20 = true;
                    } else {
                        if (mVar7.f14002a) {
                            mVar7.f14004c = i14;
                            mVar7.f14006f = true;
                            mVar7.rightMargin = (-i14) / 2;
                            z20 = true;
                        } else {
                            if (i51 != 0) {
                                mVar7.leftMargin = i14 / 2;
                            }
                            if (i51 != i10 - 1) {
                                mVar7.rightMargin = i14 / 2;
                            }
                        }
                    }
                }
            }
            z10 = z20;
        }
        if (z10) {
            int i52 = 0;
            while (i52 < i10) {
                View childAt4 = getChildAt(i52);
                C1281m mVar8 = (C1281m) childAt4.getLayoutParams();
                if (!mVar8.f14006f) {
                    i13 = i48;
                } else {
                    i13 = i48;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar8.f14003b * i25) + mVar8.f14004c, b.MAX_POW2), i13);
                }
                i52++;
                i48 = i13;
            }
        }
        if (i35 != 1073741824) {
            i12 = i36;
            i11 = i47;
        } else {
            i11 = i37;
            i12 = i36;
        }
        setMeasuredDimension(i12, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f7448q0.f13994k0 = z;
    }

    public void setOnMenuItemClickListener(C1283n nVar) {
        this.f7455x0 = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1277k kVar = this.f7448q0;
        C1275j jVar = kVar.f13986c0;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
            return;
        }
        kVar.f13988e0 = true;
        kVar.f13987d0 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.p0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f7447o0 != i) {
            this.f7447o0 = i;
            if (i == 0) {
                this.f7446n0 = getContext();
            } else {
                this.f7446n0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1277k kVar) {
        this.f7448q0 = kVar;
        kVar.f13985b0 = this;
        this.f7445m0 = kVar.f13980W;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
