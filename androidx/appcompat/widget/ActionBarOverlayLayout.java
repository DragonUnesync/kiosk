package androidx.appcompat.widget;

import B.C0003d;
import C3.m;
import M0.C0123k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import h.C1012M;
import java.util.WeakHashMap;
import m0.C1197c;
import n.x;
import o.C1261c;
import o.C1263d;
import o.C1265e;
import o.C1267f;
import o.C1276j0;
import o.C1277k;
import o.C1278k0;
import o.j1;
import o.o1;
import v0.C1510H;
import v0.C1525X;
import v0.C1526Y;
import v0.C1527Z;
import v0.C1540m;
import v0.C1541n;
import v0.C1551x;
import v0.C1553z;
import v0.a0;
import v0.g0;
import v0.j0;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C1276j0, C1540m, C1541n {

    /* renamed from: A0  reason: collision with root package name */
    public static final j0 f7415A0;

    /* renamed from: B0  reason: collision with root package name */
    public static final Rect f7416B0 = new Rect();

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f7417z0 = {2130968579, 16842841};

    /* renamed from: U  reason: collision with root package name */
    public int f7418U;

    /* renamed from: V  reason: collision with root package name */
    public int f7419V = 0;

    /* renamed from: W  reason: collision with root package name */
    public ContentFrameLayout f7420W;

    /* renamed from: a0  reason: collision with root package name */
    public ActionBarContainer f7421a0;

    /* renamed from: b0  reason: collision with root package name */
    public C1278k0 f7422b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f7423c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f7424d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7425e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7426f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7427g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f7428h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7429i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f7430j0 = new Rect();

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f7431k0 = new Rect();

    /* renamed from: l0  reason: collision with root package name */
    public final Rect f7432l0 = new Rect();

    /* renamed from: m0  reason: collision with root package name */
    public final Rect f7433m0 = new Rect();

    /* renamed from: n0  reason: collision with root package name */
    public j0 f7434n0;

    /* renamed from: o0  reason: collision with root package name */
    public j0 f7435o0;
    public j0 p0;

    /* renamed from: q0  reason: collision with root package name */
    public j0 f7436q0;

    /* renamed from: r0  reason: collision with root package name */
    public C1263d f7437r0;

    /* renamed from: s0  reason: collision with root package name */
    public OverScroller f7438s0;

    /* renamed from: t0  reason: collision with root package name */
    public ViewPropertyAnimator f7439t0;

    /* renamed from: u0  reason: collision with root package name */
    public final m f7440u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C1261c f7441v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C1261c f7442w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C0123k f7443x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C1267f f7444y0;

    static {
        a0 a0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a0Var = new C1527Z();
        } else if (i >= 29) {
            a0Var = new C1526Y();
        } else {
            a0Var = new C1525X();
        }
        a0Var.g(C1197c.b(0, 1, 0, 1));
        f7415A0 = a0Var.b();
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [o.f, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        j0 j0Var = j0.f15951b;
        this.f7434n0 = j0Var;
        this.f7435o0 = j0Var;
        this.p0 = j0Var;
        this.f7436q0 = j0Var;
        this.f7440u0 = new m(4, this);
        this.f7441v0 = new C1261c(this, 0);
        this.f7442w0 = new C1261c(this, 1);
        i(context);
        this.f7443x0 = new C0123k(9);
        ? view = new View(context);
        view.setWillNotDraw(true);
        this.f7444y0 = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z6;
        int i;
        C1265e eVar = (C1265e) view.getLayoutParams();
        int i8 = eVar.leftMargin;
        int i9 = rect.left;
        if (i8 != i9) {
            eVar.leftMargin = i9;
            z6 = true;
        } else {
            z6 = false;
        }
        int i10 = eVar.topMargin;
        int i11 = rect.top;
        if (i10 != i11) {
            eVar.topMargin = i11;
            z6 = true;
        }
        int i12 = eVar.rightMargin;
        int i13 = rect.right;
        if (i12 != i13) {
            eVar.rightMargin = i13;
            z6 = true;
        }
        if (!z || eVar.bottomMargin == (i = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i;
        return true;
    }

    public final void a(View view, View view2, int i, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(View view, int i, int i8, int[] iArr, int i9) {
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1265e;
    }

    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        e(view, i, i8, i9, i10, i11);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f7423c0 != null) {
            if (this.f7421a0.getVisibility() == 0) {
                i = (int) (this.f7421a0.getTranslationY() + ((float) this.f7421a0.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f7423c0.setBounds(0, i, getWidth(), this.f7423c0.getIntrinsicHeight() + i);
            this.f7423c0.draw(canvas);
        }
    }

    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i, i8, i9, i10);
        }
    }

    public final boolean f(View view, View view2, int i, int i8) {
        if (i8 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f7421a0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C0123k kVar = this.f7443x0;
        return kVar.f2965c | kVar.f2964b;
    }

    public CharSequence getTitle() {
        k();
        return ((o1) this.f7422b0).f14023a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f7441v0);
        removeCallbacks(this.f7442w0);
        ViewPropertyAnimator viewPropertyAnimator = this.f7439t0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f7417z0);
        boolean z = false;
        this.f7418U = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f7423c0 = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.f7438s0 = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((o1) this.f7422b0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((o1) this.f7422b0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final void k() {
        C1278k0 k0Var;
        if (this.f7420W == null) {
            this.f7420W = (ContentFrameLayout) findViewById(2131361848);
            this.f7421a0 = (ActionBarContainer) findViewById(2131361849);
            View findViewById = findViewById(2131361847);
            if (findViewById instanceof C1278k0) {
                k0Var = (C1278k0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                k0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f7422b0 = k0Var;
        }
    }

    public final void l(n.m mVar, x xVar) {
        k();
        o1 o1Var = (o1) this.f7422b0;
        C1277k kVar = o1Var.f14033m;
        Toolbar toolbar = o1Var.f14023a;
        if (kVar == null) {
            o1Var.f14033m = new C1277k(toolbar.getContext());
        }
        C1277k kVar2 = o1Var.f14033m;
        kVar2.f13982Y = xVar;
        if (mVar != null || toolbar.f7576U != null) {
            toolbar.f();
            n.m mVar2 = toolbar.f7576U.f7445m0;
            if (mVar2 != mVar) {
                if (mVar2 != null) {
                    mVar2.r(toolbar.f7567I0);
                    mVar2.r(toolbar.f7568J0);
                }
                if (toolbar.f7568J0 == null) {
                    toolbar.f7568J0 = new j1(toolbar);
                }
                kVar2.f13994k0 = true;
                if (mVar != null) {
                    mVar.b(kVar2, toolbar.f7585g0);
                    mVar.b(toolbar.f7568J0, toolbar.f7585g0);
                } else {
                    kVar2.g(toolbar.f7585g0, (n.m) null);
                    toolbar.f7568J0.g(toolbar.f7585g0, (n.m) null);
                    kVar2.d();
                    toolbar.f7568J0.d();
                }
                toolbar.f7576U.setPopupTheme(toolbar.f7586h0);
                toolbar.f7576U.setPresenter(kVar2);
                toolbar.f7567I0 = kVar2;
                toolbar.w();
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        j0 g8 = j0.g(this, windowInsets);
        boolean g9 = g(this.f7421a0, new Rect(g8.b(), g8.d(), g8.c(), g8.a()), false);
        WeakHashMap weakHashMap = C1510H.f15874a;
        Rect rect = this.f7430j0;
        C1553z.b(this, g8, rect);
        int i = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        g0 g0Var = g8.f15952a;
        j0 l8 = g0Var.l(i, i8, i9, i10);
        this.f7434n0 = l8;
        boolean z = true;
        if (!this.f7435o0.equals(l8)) {
            this.f7435o0 = this.f7434n0;
            g9 = true;
        }
        Rect rect2 = this.f7431k0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = g9;
        }
        if (z) {
            requestLayout();
        }
        return g0Var.a().f15952a.c().f15952a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1551x.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1265e eVar = (C1265e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.leftMargin + paddingLeft;
                int i13 = eVar.topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.k()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f7421a0
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f7421a0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            o.e r0 = (o.C1265e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f7421a0
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f7421a0
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f7421a0
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap r4 = v0.C1510H.f15874a
            int r4 = r12.getWindowSystemUiVisibility()
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            int r6 = r12.f7418U
            boolean r7 = r12.f7425e0
            if (r7 == 0) goto L_0x0074
            androidx.appcompat.widget.ActionBarContainer r7 = r12.f7421a0
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L_0x0074
            int r7 = r12.f7418U
            int r6 = r6 + r7
            goto L_0x0074
        L_0x0062:
            androidx.appcompat.widget.ActionBarContainer r6 = r12.f7421a0
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r6 = r12.f7421a0
            int r6 = r6.getMeasuredHeight()
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            android.graphics.Rect r7 = r12.f7430j0
            android.graphics.Rect r8 = r12.f7432l0
            r8.set(r7)
            v0.j0 r7 = r12.f7434n0
            r12.p0 = r7
            boolean r7 = r12.f7424d0
            if (r7 != 0) goto L_0x00aa
            if (r4 != 0) goto L_0x00aa
            o.f r4 = r12.f7444y0
            v0.j0 r7 = f7415A0
            android.graphics.Rect r9 = r12.f7433m0
            v0.C1553z.b(r4, r7, r9)
            android.graphics.Rect r4 = f7416B0
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x00aa
            int r4 = r8.top
            int r4 = r4 + r6
            r8.top = r4
            int r4 = r8.bottom
            r8.bottom = r4
            v0.j0 r4 = r12.p0
            v0.g0 r4 = r4.f15952a
            v0.j0 r2 = r4.l(r2, r6, r2, r2)
            r12.p0 = r2
            goto L_0x00ed
        L_0x00aa:
            v0.j0 r2 = r12.p0
            int r2 = r2.b()
            v0.j0 r4 = r12.p0
            int r4 = r4.d()
            int r4 = r4 + r6
            v0.j0 r6 = r12.p0
            int r6 = r6.c()
            v0.j0 r7 = r12.p0
            int r7 = r7.a()
            m0.c r2 = m0.C1197c.b(r2, r4, r6, r7)
            v0.j0 r4 = r12.p0
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x00d5
            v0.Z r6 = new v0.Z
            r6.<init>(r4)
            goto L_0x00e4
        L_0x00d5:
            r7 = 29
            if (r6 < r7) goto L_0x00df
            v0.Y r6 = new v0.Y
            r6.<init>(r4)
            goto L_0x00e4
        L_0x00df:
            v0.X r6 = new v0.X
            r6.<init>(r4)
        L_0x00e4:
            r6.g(r2)
            v0.j0 r2 = r6.b()
            r12.p0 = r2
        L_0x00ed:
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f7420W
            g(r2, r8, r5)
            v0.j0 r2 = r12.f7436q0
            v0.j0 r4 = r12.p0
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0115
            v0.j0 r2 = r12.p0
            r12.f7436q0 = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f7420W
            android.view.WindowInsets r2 = r2.f()
            if (r2 == 0) goto L_0x0115
            android.view.WindowInsets r5 = v0.C1551x.a(r4, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0115
            v0.j0.g(r4, r5)
        L_0x0115:
            androidx.appcompat.widget.ContentFrameLayout r7 = r12.f7420W
            r9 = 0
            r11 = 0
            r6 = r12
            r8 = r13
            r10 = r14
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f7420W
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            o.e r2 = (o.C1265e) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f7420W
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f7420W
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f7420W
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r13 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r1 = r2 << 16
            int r14 = android.view.View.resolveSizeAndState(r0, r14, r1)
            r12.setMeasuredDimension(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f8, float f9, boolean z) {
        if (!this.f7426f0 || !z) {
            return false;
        }
        this.f7438s0.fling(0, 0, 0, (int) f9, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.f7438s0.getFinalY() > this.f7421a0.getHeight()) {
            h();
            this.f7442w0.run();
        } else {
            h();
            this.f7441v0.run();
        }
        this.f7427g0 = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        int i11 = this.f7428h0 + i8;
        this.f7428h0 = i11;
        setActionBarHideOffset(i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (h.C1012M) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            M0.k r1 = r0.f7443x0
            r1.f2964b = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f7428h0 = r1
            r0.h()
            o.d r1 = r0.f7437r0
            if (r1 == 0) goto L_0x001d
            h.M r1 = (h.C1012M) r1
            m.j r2 = r1.f12151t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f12151t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f7421a0.getVisibility() != 0) {
            return false;
        }
        return this.f7426f0;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f7426f0 && !this.f7427g0) {
            if (this.f7428h0 <= this.f7421a0.getHeight()) {
                h();
                postDelayed(this.f7441v0, 600);
                return;
            }
            h();
            postDelayed(this.f7442w0, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z6;
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i8 = this.f7429i0 ^ i;
        this.f7429i0 = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        C1263d dVar = this.f7437r0;
        if (dVar != null) {
            C1012M m8 = (C1012M) dVar;
            m8.f12146o = !z6;
            if (z || !z6) {
                if (m8.f12148q) {
                    m8.f12148q = false;
                    m8.Y(true);
                }
            } else if (!m8.f12148q) {
                m8.f12148q = true;
                m8.Y(true);
            }
        }
        if ((i8 & 256) != 0 && this.f7437r0 != null) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            C1551x.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f7419V = i;
        C1263d dVar = this.f7437r0;
        if (dVar != null) {
            ((C1012M) dVar).f12145n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f7421a0.setTranslationY((float) (-Math.max(0, Math.min(i, this.f7421a0.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C1263d dVar) {
        this.f7437r0 = dVar;
        if (getWindowToken() != null) {
            ((C1012M) this.f7437r0).f12145n = this.f7419V;
            int i = this.f7429i0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = C1510H.f15874a;
                C1551x.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f7425e0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f7426f0) {
            this.f7426f0 = z;
            if (!z) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        k();
        o1 o1Var = (o1) this.f7422b0;
        o1Var.f14026d = i != 0 ? C0003d.r(o1Var.f14023a.getContext(), i) : null;
        o1Var.c();
    }

    public void setLogo(int i) {
        Drawable drawable;
        k();
        o1 o1Var = (o1) this.f7422b0;
        if (i != 0) {
            drawable = C0003d.r(o1Var.f14023a.getContext(), i);
        } else {
            drawable = null;
        }
        o1Var.e = drawable;
        o1Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.f7424d0 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((o1) this.f7422b0).f14031k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        o1 o1Var = (o1) this.f7422b0;
        if (!o1Var.f14028g) {
            o1Var.f14029h = charSequence;
            if ((o1Var.f14024b & 8) != 0) {
                Toolbar toolbar = o1Var.f14023a;
                toolbar.setTitle(charSequence);
                if (o1Var.f14028g) {
                    C1510H.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        o1 o1Var = (o1) this.f7422b0;
        o1Var.f14026d = drawable;
        o1Var.c();
    }
}
