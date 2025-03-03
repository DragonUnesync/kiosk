package androidx.core.widget;

import E.e;
import M0.C0123k;
import O7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import com.woxthebox.draglistview.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.C1354a;
import v0.C1510H;
import v0.C1534g;
import v0.C1539l;
import v0.C1541n;
import v0.C1553z;
import y.C1609a;
import y0.C1617c;
import y0.C1619e;
import y0.C1620f;
import y0.C1621g;

public class NestedScrollView extends FrameLayout implements C1541n {

    /* renamed from: A0  reason: collision with root package name */
    public static final int[] f7748A0 = {16843130};

    /* renamed from: y0  reason: collision with root package name */
    public static final float f7749y0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: z0  reason: collision with root package name */
    public static final g f7750z0 = new g(3);

    /* renamed from: U  reason: collision with root package name */
    public final float f7751U;

    /* renamed from: V  reason: collision with root package name */
    public long f7752V;

    /* renamed from: W  reason: collision with root package name */
    public final Rect f7753W = new Rect();

    /* renamed from: a0  reason: collision with root package name */
    public final OverScroller f7754a0;

    /* renamed from: b0  reason: collision with root package name */
    public final EdgeEffect f7755b0;

    /* renamed from: c0  reason: collision with root package name */
    public final EdgeEffect f7756c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f7757d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7758e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7759f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    public View f7760g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7761h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public VelocityTracker f7762i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7763j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7764k0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public final int f7765l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f7766m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f7767n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7768o0 = -1;
    public final int[] p0 = new int[2];

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f7769q0 = new int[2];

    /* renamed from: r0  reason: collision with root package name */
    public int f7770r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f7771s0;

    /* renamed from: t0  reason: collision with root package name */
    public C1621g f7772t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C0123k f7773u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C1539l f7774v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f7775w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C1534g f7776x0 = new C1534g(getContext(), new C1609a((Object) this));

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = C1617c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f7755b0 = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = C1617c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f7756c0 = edgeEffect2;
        this.f7751U = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f7754a0 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7765l0 = viewConfiguration.getScaledTouchSlop();
        this.f7766m0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7767n0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7748A0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f7773u0 = new C0123k(9);
        this.f7774v0 = new C1539l(this);
        setNestedScrollingEnabled(true);
        C1510H.p(this, f7750z0);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m((View) parent, nestedScrollView)) {
            return false;
        }
        return true;
    }

    public final void a(View view, View view2, int i, int i8) {
        C0123k kVar = this.f7773u0;
        if (i8 == 1) {
            kVar.f2965c = i;
        } else {
            kVar.f2964b = i;
        }
        w(2, i8);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, int i) {
        C0123k kVar = this.f7773u0;
        if (i == 1) {
            kVar.f2965c = 0;
        } else {
            kVar.f2964b = 0;
        }
        y(i);
    }

    public final void c(View view, int i, int i8, int[] iArr, int i9) {
        i(i, i8, iArr, (int[]) null, i9);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.f7754a0
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.f7754a0
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.f7754a0
            int r0 = r0.getCurrY()
            int r1 = r14.f7771s0
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.f7756c0
            android.widget.EdgeEffect r4 = r14.f7755b0
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0049
            float r8 = E.e.n(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0049
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = E.e.s(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0047
            r4.finish()
        L_0x0047:
            int r1 = r1 - r2
            goto L_0x0069
        L_0x0049:
            if (r1 >= 0) goto L_0x0069
            float r8 = E.e.n(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0069
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = E.e.s(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0047
            r3.finish()
            goto L_0x0047
        L_0x0069:
            r14.f7771s0 = r0
            int[] r0 = r14.f7769q0
            r2 = 1
            r11 = 0
            r0[r2] = r11
            r10 = 1
            r6 = 0
            r9 = 0
            r5 = r14
            r7 = r1
            r8 = r0
            r5.i(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            boolean r5 = q0.C1354a.a()
            if (r5 == 0) goto L_0x0094
            android.widget.OverScroller r5 = r14.f7754a0
            float r5 = r5.getCurrVelocity()
            float r5 = java.lang.Math.abs(r5)
            y0.C1619e.a(r14, r5)
        L_0x0094:
            if (r1 == 0) goto L_0x00b9
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.q(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r11
            r6 = 0
            r8 = 0
            v0.l r5 = r14.f7774v0
            int[] r10 = r14.p0
            r11 = 1
            r9 = r1
            r12 = r0
            r5.d(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00b9:
            if (r1 == 0) goto L_0x00f0
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00c5
            if (r0 != r2) goto L_0x00e8
            if (r13 <= 0) goto L_0x00e8
        L_0x00c5:
            if (r1 >= 0) goto L_0x00d8
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00e8
            android.widget.OverScroller r0 = r14.f7754a0
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00e8
        L_0x00d8:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00e8
            android.widget.OverScroller r0 = r14.f7754a0
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00e8:
            android.widget.OverScroller r0 = r14.f7754a0
            r0.abortAnimation()
            r14.y(r2)
        L_0x00f0:
            android.widget.OverScroller r0 = r14.f7754a0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00fc
            r14.postInvalidateOnAnimation()
            goto L_0x00ff
        L_0x00fc:
            r14.y(r2)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        o(i10, i11, iArr);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || j(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchNestedFling(float f8, float f9, boolean z) {
        return this.f7774v0.a(f8, f9, z);
    }

    public final boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f7774v0.b(f8, f9);
    }

    public final boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2) {
        return this.f7774v0.c(i, i8, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr) {
        return this.f7774v0.d(i, i8, i9, i10, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f7755b0;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f7756c0;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i8 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i8 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        o(i10, i11, (int[]) null);
    }

    public final boolean f(View view, View view2, int i, int i8) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f7753W;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !n(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C0123k kVar = this.f7773u0;
        return kVar.f2965c | kVar.f2964b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f7775w0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f7775w0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f7775w0;
    }

    public final int h(Rect rect) {
        int i;
        int i8;
        int i9;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i10 - verticalFadingEdgeLength;
        } else {
            i = i10;
        }
        int i11 = rect.bottom;
        if (i11 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i9 = rect.top - scrollY;
            } else {
                i9 = rect.bottom - i;
            }
            return Math.min(i9, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i11 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i8 = 0 - (i - rect.bottom);
            } else {
                i8 = 0 - (scrollY - rect.top);
            }
            return Math.max(i8, -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f7774v0.f(0);
    }

    public final boolean i(int i, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f7774v0.c(i, i8, iArr, (int[]) null, i9);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f7774v0.f15957d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f7753W.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode == 62) {
                            if (keyEvent.isShiftPressed()) {
                                i = 33;
                            }
                            r(i);
                            return false;
                        } else if (keyCode == 92) {
                            return l(33);
                        } else {
                            if (keyCode == 93) {
                                return l(130);
                            }
                            if (keyCode == 122) {
                                r(33);
                                return false;
                            } else if (keyCode != 123) {
                                return false;
                            } else {
                                r(130);
                                return false;
                            }
                        }
                    } else if (keyEvent.isAltPressed()) {
                        return l(130);
                    } else {
                        return g(130);
                    }
                } else if (keyEvent.isAltPressed()) {
                    return l(33);
                } else {
                    return g(33);
                }
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.f7754a0.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f7771s0 = getScrollY();
            postInvalidateOnAnimation();
            if (C1354a.a()) {
                C1619e.a(this, Math.abs(this.f7754a0.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f7753W;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
    }

    public final void measureChild(View view, int i, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i, int i8) {
        Rect rect = this.f7753W;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i < getScrollY() || rect.top - i > getScrollY() + i8) {
            return false;
        }
        return true;
    }

    public final void o(int i, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f7774v0.d(0, scrollY2, 0, i - scrollY2, (int[]) null, i8, iArr);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7759f0 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 1
            int r4 = r27.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x0356
            boolean r4 = r0.f7761h0
            if (r4 != 0) goto L_0x0356
            int r4 = r27.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r27.getX()
            int r11 = (int) r11
            goto L_0x0046
        L_0x002f:
            int r4 = r27.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0043
            float r10 = r1.getAxisValue(r9)
            int r4 = r26.getWidth()
            int r11 = r4 / 2
            r4 = 26
            goto L_0x0046
        L_0x0043:
            r4 = 0
            r10 = 0
            r11 = 0
        L_0x0046:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0356
            float r12 = r26.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r27.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005c
            r12 = 1
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            int r10 = -r10
            r0.t(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x0354
            v0.g r10 = r0.f7776x0
            r10.getClass()
            int r11 = r27.getSource()
            int r12 = r27.getDeviceId()
            int r13 = r10.f15945f
            int[] r14 = r10.f15947h
            r5 = 34
            if (r13 != r11) goto L_0x0085
            int r13 = r10.f15946g
            if (r13 != r12) goto L_0x0085
            int r13 = r10.e
            if (r13 == r4) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r2 = 0
            r6 = 0
            goto L_0x0143
        L_0x0085:
            android.content.Context r13 = r10.f15941a
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r13)
            int r7 = r27.getDeviceId()
            int r15 = r27.getSource()
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "android"
            java.lang.String r9 = "dimen"
            r8 = -1
            if (r3 < r5) goto L_0x00a4
            java.lang.reflect.Method r21 = v0.C1511I.f15880a
            int r7 = D.F.i(r2, r7, r4, r15)
        L_0x00a2:
            r5 = 0
            goto L_0x00e5
        L_0x00a4:
            java.lang.reflect.Method r21 = v0.C1511I.f15880a
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r7)
            if (r7 == 0) goto L_0x00e1
            android.view.InputDevice$MotionRange r7 = r7.getMotionRange(r4, r15)
            if (r7 == 0) goto L_0x00e1
            android.content.res.Resources r7 = r13.getResources()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r15 != r5) goto L_0x00c5
            r5 = 26
            if (r4 != r5) goto L_0x00c5
            java.lang.String r5 = "config_viewMinRotaryEncoderFlingVelocity"
            int r5 = r7.getIdentifier(r5, r9, r6)
            goto L_0x00c6
        L_0x00c5:
            r5 = -1
        L_0x00c6:
            j$.util.Objects.requireNonNull(r2)
            if (r5 == r8) goto L_0x00dc
            if (r5 == 0) goto L_0x00d8
            int r5 = r7.getDimensionPixelSize(r5)
            if (r5 >= 0) goto L_0x00d6
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d6:
            r7 = r5
            goto L_0x00a2
        L_0x00d8:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a2
        L_0x00dc:
            int r5 = r2.getScaledMinimumFlingVelocity()
            goto L_0x00d6
        L_0x00e1:
            r5 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e5:
            r14[r5] = r7
            int r5 = r27.getDeviceId()
            int r7 = r27.getSource()
            r15 = 34
            if (r3 < r15) goto L_0x00f9
            int r2 = D.F.h(r2, r5, r4, r7)
        L_0x00f7:
            r3 = 1
            goto L_0x0139
        L_0x00f9:
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r5)
            if (r3 == 0) goto L_0x0107
            android.view.InputDevice$MotionRange r3 = r3.getMotionRange(r4, r7)
            if (r3 == 0) goto L_0x0107
            r3 = 1
            goto L_0x0108
        L_0x0107:
            r3 = 0
        L_0x0108:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L_0x010f
        L_0x010c:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00f7
        L_0x010f:
            android.content.res.Resources r3 = r13.getResources()
            r13 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r13) goto L_0x0122
            r7 = 26
            if (r4 != r7) goto L_0x0122
            java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r6 = r3.getIdentifier(r7, r9, r6)
            goto L_0x0123
        L_0x0122:
            r6 = -1
        L_0x0123:
            j$.util.Objects.requireNonNull(r2)
            if (r6 == r8) goto L_0x0134
            if (r6 == 0) goto L_0x010c
            int r2 = r3.getDimensionPixelSize(r6)
            if (r2 >= 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r5 = r2
        L_0x0132:
            r2 = r5
            goto L_0x00f7
        L_0x0134:
            int r2 = r2.getScaledMaximumFlingVelocity()
            goto L_0x00f7
        L_0x0139:
            r14[r3] = r2
            r10.f15945f = r11
            r10.f15946g = r12
            r10.e = r4
            r2 = 0
            r6 = 1
        L_0x0143:
            r3 = r14[r2]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0156
            android.view.VelocityTracker r1 = r10.f15943c
            if (r1 == 0) goto L_0x0354
            r1.recycle()
            r1 = 0
            r10.f15943c = r1
            goto L_0x0354
        L_0x0156:
            android.view.VelocityTracker r2 = r10.f15943c
            if (r2 != 0) goto L_0x0160
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f15943c = r2
        L_0x0160:
            android.view.VelocityTracker r2 = r10.f15943c
            java.util.Map r3 = v0.C1546s.f15964a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r3 < r5) goto L_0x016e
            goto L_0x01c9
        L_0x016e:
            int r3 = r27.getSource()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r5) goto L_0x01c9
            java.util.Map r3 = v0.C1546s.f15964a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x0186
            v0.t r5 = new v0.t
            r5.<init>()
            r3.put(r2, r5)
        L_0x0186:
            java.lang.Object r3 = r3.get(r2)
            v0.t r3 = (v0.C1547t) r3
            r3.getClass()
            long r7 = r27.getEventTime()
            int r5 = r3.f15968d
            long[] r9 = r3.f15966b
            if (r5 == 0) goto L_0x01ab
            int r5 = r3.e
            r11 = r9[r5]
            long r11 = r7 - r11
            r22 = 40
            int r5 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ab
            r5 = 0
            r3.f15968d = r5
            r5 = 0
            r3.f15967c = r5
        L_0x01ab:
            int r5 = r3.e
            r11 = 1
            int r5 = r5 + r11
            r12 = 20
            int r5 = r5 % r12
            r3.e = r5
            int r13 = r3.f15968d
            if (r13 == r12) goto L_0x01bb
            int r13 = r13 + r11
            r3.f15968d = r13
        L_0x01bb:
            r11 = 26
            float r1 = r1.getAxisValue(r11)
            float[] r11 = r3.f15965a
            r11[r5] = r1
            int r1 = r3.e
            r9[r1] = r7
        L_0x01c9:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = v0.C1546s.f15964a
            java.lang.Object r5 = r5.get(r2)
            v0.t r5 = (v0.C1547t) r5
            if (r5 == 0) goto L_0x02cc
            int r7 = r5.f15968d
            r8 = 2
            if (r7 >= r8) goto L_0x01e7
        L_0x01e0:
            r24 = r2
            r1 = 0
        L_0x01e3:
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L_0x02a2
        L_0x01e7:
            int r8 = r5.e
            r9 = 20
            int r11 = r8 + 20
            r12 = 1
            int r7 = r7 - r12
            int r11 = r11 - r7
            int r11 = r11 % r9
            long[] r7 = r5.f15966b
            r8 = r7[r8]
        L_0x01f5:
            r12 = r7[r11]
            long r22 = r8 - r12
            r24 = 100
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 <= 0) goto L_0x020b
            int r12 = r5.f15968d
            r15 = 1
            int r12 = r12 - r15
            r5.f15968d = r12
            int r11 = r11 + r15
            r17 = 20
            int r11 = r11 % 20
            goto L_0x01f5
        L_0x020b:
            r15 = 1
            r17 = 20
            int r8 = r5.f15968d
            r9 = 2
            if (r8 >= r9) goto L_0x0214
            goto L_0x01e0
        L_0x0214:
            float[] r3 = r5.f15965a
            if (r8 != r9) goto L_0x022b
            int r11 = r11 + r15
            int r11 = r11 % 20
            r8 = r7[r11]
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0222
            goto L_0x01e0
        L_0x0222:
            r3 = r3[r11]
            long r8 = r8 - r12
            float r7 = (float) r8
            float r3 = r3 / r7
            r24 = r2
            r1 = r3
            goto L_0x01e3
        L_0x022b:
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x022e:
            int r13 = r5.f15968d
            r15 = 1
            int r13 = r13 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 >= r13) goto L_0x0289
            int r13 = r9 + r11
            r17 = 20
            int r19 = r13 % 20
            r22 = r7[r19]
            int r13 = r13 + r15
            int r13 = r13 % 20
            r24 = r7[r13]
            int r19 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r19 != 0) goto L_0x0250
            r24 = r2
            r13 = r3
            r2 = 1
            goto L_0x0282
        L_0x0250:
            int r12 = r12 + r15
            r15 = 0
            int r24 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r24 >= 0) goto L_0x0258
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0258:
            float r15 = java.lang.Math.abs(r8)
            float r15 = r15 * r16
            r24 = r2
            double r1 = (double) r15
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r18 = r18 * r1
            r1 = r3[r13]
            r15 = r7[r13]
            r13 = r3
            long r2 = r15 - r22
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r1 - r18
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r1 = r1 + r8
            r2 = 1
            if (r12 != r2) goto L_0x0281
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
        L_0x0281:
            r8 = r1
        L_0x0282:
            int r9 = r9 + r2
            r3 = r13
            r2 = r24
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L_0x022e
        L_0x0289:
            r24 = r2
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0292
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0292:
            float r1 = java.lang.Math.abs(r8)
            float r1 = r1 * r16
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r18
            goto L_0x01e3
        L_0x02a2:
            float r2 = (float) r2
            float r1 = r1 * r2
            r5.f15967c = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r3 = java.lang.Math.abs(r2)
            float r3 = -r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x02bb
            float r1 = java.lang.Math.abs(r2)
            float r1 = -r1
            r5.f15967c = r1
            goto L_0x02ce
        L_0x02bb:
            float r1 = r5.f15967c
            float r3 = java.lang.Math.abs(r2)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ce
            float r1 = java.lang.Math.abs(r2)
            r5.f15967c = r1
            goto L_0x02ce
        L_0x02cc:
            r24 = r2
        L_0x02ce:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L_0x02db
            r1 = r24
            float r1 = D.F.c(r1, r4)
            goto L_0x02ff
        L_0x02db:
            r1 = r24
            if (r4 != 0) goto L_0x02e4
            float r1 = r1.getXVelocity()
            goto L_0x02ff
        L_0x02e4:
            r2 = 1
            if (r4 != r2) goto L_0x02ec
            float r1 = r1.getYVelocity()
            goto L_0x02ff
        L_0x02ec:
            java.util.Map r2 = v0.C1546s.f15964a
            java.lang.Object r1 = r2.get(r1)
            v0.t r1 = (v0.C1547t) r1
            if (r1 == 0) goto L_0x02fe
            r2 = 26
            if (r4 == r2) goto L_0x02fb
            goto L_0x02fe
        L_0x02fb:
            float r1 = r1.f15967c
            goto L_0x02ff
        L_0x02fe:
            r1 = 0
        L_0x02ff:
            y.a r2 = r10.f15942b
            java.lang.Object r2 = r2.f16325a
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            float r3 = r2.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            if (r6 != 0) goto L_0x0321
            float r4 = r10.f15944d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0326
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0326
        L_0x0321:
            android.widget.OverScroller r3 = r2.f7754a0
            r3.abortAnimation()
        L_0x0326:
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r4 = r14[r4]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0333
            goto L_0x0354
        L_0x0333:
            r3 = 1
            r4 = r14[r3]
            int r3 = -r4
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0348
            r7 = 0
            goto L_0x0352
        L_0x0348:
            android.widget.OverScroller r3 = r2.f7754a0
            r3.abortAnimation()
            int r3 = (int) r1
            r2.k(r3)
            r7 = r1
        L_0x0352:
            r10.f15944d = r7
        L_0x0354:
            r1 = 1
            return r1
        L_0x0356:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f7761h0) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i8 = this.f7768o0;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y8 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y8 - this.f7757d0) > this.f7765l0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f7761h0 = true;
                                this.f7757d0 = y8;
                                if (this.f7762i0 == null) {
                                    this.f7762i0 = VelocityTracker.obtain();
                                }
                                this.f7762i0.addMovement(motionEvent);
                                this.f7770r0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.f7761h0 = false;
            this.f7768o0 = -1;
            VelocityTracker velocityTracker = this.f7762i0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7762i0 = null;
            }
            if (this.f7754a0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y9 = (int) motionEvent.getY();
            int x8 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y9 >= childAt.getTop() - scrollY && y9 < childAt.getBottom() - scrollY && x8 >= childAt.getLeft() && x8 < childAt.getRight()) {
                    this.f7757d0 = y9;
                    this.f7768o0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f7762i0;
                    if (velocityTracker2 == null) {
                        this.f7762i0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f7762i0.addMovement(motionEvent);
                    this.f7754a0.computeScrollOffset();
                    if (!x(motionEvent) && this.f7754a0.isFinished()) {
                        z = false;
                    }
                    this.f7761h0 = z;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.f7754a0.isFinished()) {
                z = false;
            }
            this.f7761h0 = z;
            VelocityTracker velocityTracker3 = this.f7762i0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f7762i0 = null;
            }
        }
        return this.f7761h0;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z, i, i8, i9, i10);
        int i12 = 0;
        this.f7758e0 = false;
        View view = this.f7760g0;
        if (view != null && m(view, this)) {
            View view2 = this.f7760g0;
            Rect rect = this.f7753W;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h5 = h(rect);
            if (h5 != 0) {
                scrollBy(0, h5);
            }
        }
        this.f7760g0 = null;
        if (!this.f7759f0) {
            if (this.f7772t0 != null) {
                scrollTo(getScrollX(), this.f7772t0.f16358U);
                this.f7772t0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f7759f0 = true;
    }

    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        if (this.f7763j0 && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, b.MAX_POW2));
            }
        }
    }

    public final boolean onNestedFling(View view, float f8, float f9, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        k((int) f9);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return this.f7774v0.b(f8, f9);
    }

    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
        i(i, i8, iArr, (int[]) null, 0);
    }

    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        o(i10, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public final void onOverScrolled(int i, int i8, boolean z, boolean z6) {
        super.scrollTo(i, i8);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && n(view, 0, getHeight())) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1621g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1621g gVar = (C1621g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f7772t0 = gVar;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, y0.g] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f16358U = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        super.onScrollChanged(i, i8, i9, i10);
    }

    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && n(findFocus, 0, i10)) {
            Rect rect = this.f7753W;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h5 = h(rect);
            if (h5 == 0) {
                return;
            }
            if (this.f7764k0) {
                v(0, h5, false);
            } else {
                scrollBy(0, h5);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f7762i0 == null) {
            this.f7762i0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7770r0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f8 = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.f7770r0);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f7756c0;
            EdgeEffect edgeEffect2 = this.f7755b0;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f7762i0;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f7767n0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f7768o0);
                if (Math.abs(yVelocity) >= this.f7766m0) {
                    if (e.n(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (e.n(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (u(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            k(i);
                        }
                    } else {
                        int i8 = -yVelocity;
                        float f9 = (float) i8;
                        if (!this.f7774v0.b(0.0f, f9)) {
                            dispatchNestedFling(0.0f, f9, true);
                            k(i8);
                        }
                    }
                } else if (this.f7754a0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f7768o0 = -1;
                this.f7761h0 = false;
                VelocityTracker velocityTracker2 = this.f7762i0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f7762i0 = null;
                }
                y(0);
                this.f7755b0.onRelease();
                this.f7756c0.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f7768o0);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f7768o0 + " in onTouchEvent");
                } else {
                    int y8 = (int) motionEvent2.getY(findPointerIndex);
                    int i9 = this.f7757d0 - y8;
                    float x8 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i9) / ((float) getHeight());
                    if (e.n(edgeEffect2) != 0.0f) {
                        float f10 = -e.s(edgeEffect2, -height, x8);
                        if (e.n(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f8 = f10;
                    } else if (e.n(edgeEffect) != 0.0f) {
                        float s8 = e.s(edgeEffect, height, 1.0f - x8);
                        if (e.n(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f8 = s8;
                    }
                    int round = Math.round(f8 * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i10 = i9 - round;
                    if (!this.f7761h0 && Math.abs(i10) > this.f7765l0) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f7761h0 = true;
                        i10 = i10 > 0 ? i10 - this.f7765l0 : i10 + this.f7765l0;
                    }
                    if (this.f7761h0) {
                        int t8 = t(i10, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.f7757d0 = y8 - t8;
                        this.f7770r0 += t8;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f7761h0 && getChildCount() > 0 && this.f7754a0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f7768o0 = -1;
                this.f7761h0 = false;
                VelocityTracker velocityTracker3 = this.f7762i0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f7762i0 = null;
                }
                y(0);
                this.f7755b0.onRelease();
                this.f7756c0.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f7757d0 = (int) motionEvent2.getY(actionIndex);
                this.f7768o0 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f7757d0 = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f7768o0));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f7761h0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f7754a0.isFinished()) {
                this.f7754a0.abortAnimation();
                y(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.f7757d0 = (int) motionEvent.getY();
            this.f7768o0 = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f7762i0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7768o0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f7757d0 = (int) motionEvent.getY(i);
            this.f7768o0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f7762i0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i8, int i9, int i10) {
        boolean z;
        boolean z6;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i11 = i9 + i;
        if (i8 <= 0 && i8 >= 0) {
            z = false;
        } else {
            i8 = 0;
            z = true;
        }
        if (i11 > i10) {
            z6 = true;
        } else if (i11 < 0) {
            z6 = true;
            i10 = 0;
        } else {
            i10 = i11;
            z6 = false;
        }
        if (z6 && !this.f7774v0.f(1)) {
            this.f7754a0.springBack(i8, i10, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i10);
        if (z || z6) {
            return true;
        }
        return false;
    }

    public final void r(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f7753W;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        s(i, i8, i9);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f7758e0) {
            Rect rect = this.f7753W;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h5 = h(rect);
            if (h5 != 0) {
                scrollBy(0, h5);
            }
        } else {
            this.f7760g0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z6;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h5 = h(rect);
        if (h5 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            if (z) {
                scrollBy(0, h5);
            } else {
                v(0, h5, false);
            }
        }
        return z6;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f7762i0) != null) {
            velocityTracker.recycle();
            this.f7762i0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f7758e0 = true;
        super.requestLayout();
    }

    public final boolean s(int i, int i8, int i9) {
        boolean z;
        boolean z6;
        int i10;
        boolean z8;
        boolean z9;
        int i11 = i;
        int i12 = i8;
        int i13 = i9;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i11 == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i12 < bottom && top < i13) {
                if (i12 >= top || bottom >= i13) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (view == null) {
                    view = view2;
                    z10 = z8;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z10) {
                        if (z8) {
                            if (!z9) {
                            }
                        }
                    } else if (z8) {
                        view = view2;
                        z10 = true;
                    } else if (!z9) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i12 < scrollY || i13 > i14) {
            if (z) {
                i10 = i12 - scrollY;
            } else {
                i10 = i13 - i14;
            }
            t(i10, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i11);
        }
        return z6;
    }

    public final void scrollTo(int i, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i8 < 0) {
                i8 = 0;
            } else if (height + i8 > height2) {
                i8 = height2 - height;
            }
            if (i != getScrollX() || i8 != getScrollY()) {
                super.scrollTo(i, i8);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f7763j0) {
            this.f7763j0 = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1539l lVar = this.f7774v0;
        if (lVar.f15957d) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            C1553z.n(lVar.f15956c);
        }
        lVar.f15957d = z;
    }

    public void setOnScrollChangeListener(C1620f fVar) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f7764k0 = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.f7774v0.g(i, 0);
    }

    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i, int i8, int i9, boolean z) {
        int i10;
        int i11;
        boolean z6;
        boolean z8;
        boolean z9;
        VelocityTracker velocityTracker;
        int i12 = i8;
        int i13 = i9;
        if (i13 == 1) {
            w(2, i13);
        }
        boolean c8 = this.f7774v0.c(0, i, this.f7769q0, this.p0, i9);
        int[] iArr = this.f7769q0;
        int[] iArr2 = this.p0;
        if (c8) {
            i11 = i - iArr[1];
            i10 = iArr2[1];
        } else {
            i11 = i;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!q(i11, 0, scrollY, scrollRange) || this.f7774v0.f(i13)) {
            z8 = false;
        } else {
            z8 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i14 = scrollRange;
        this.f7774v0.d(0, scrollY2, 0, i11 - scrollY2, this.p0, i9, iArr);
        int i15 = i10 + iArr2[1];
        int i16 = i11 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f7756c0;
        EdgeEffect edgeEffect2 = this.f7755b0;
        if (i17 < 0) {
            if (z6) {
                e.s(edgeEffect2, ((float) (-i16)) / ((float) getHeight()), ((float) i12) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > i14 && z6) {
            e.s(edgeEffect, ((float) i16) / ((float) getHeight()), 1.0f - (((float) i12) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z9 = false;
        } else {
            z9 = z8;
        }
        if (z9 && i13 == 0 && (velocityTracker = this.f7762i0) != null) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            y(i13);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float n4 = e.n(edgeEffect) * ((float) getHeight());
        float f8 = this.f7751U * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f8));
        double d8 = (double) f7749y0;
        if (((float) (Math.exp((d8 / (d8 - 1.0d)) * log) * ((double) f8))) < n4) {
            return true;
        }
        return false;
    }

    public final void v(int i, int i8, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f7752V > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f7754a0;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z) {
                    w(2, 1);
                } else {
                    y(1);
                }
                this.f7771s0 = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.f7754a0.isFinished()) {
                    this.f7754a0.abortAnimation();
                    y(1);
                }
                scrollBy(i, i8);
            }
            this.f7752V = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean w(int i, int i8) {
        return this.f7774v0.g(2, i8);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f7755b0;
        if (e.n(edgeEffect) != 0.0f) {
            e.s(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f7756c0;
        if (e.n(edgeEffect2) == 0.0f) {
            return z;
        }
        e.s(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void y(int i) {
        this.f7774v0.h(i);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
