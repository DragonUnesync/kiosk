package androidx.recyclerview.widget;

import O7.b;
import R2.c;
import a2.C0414a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v0.C1510H;
import w0.C1576e;

public abstract class Q {

    /* renamed from: U  reason: collision with root package name */
    public C0492c f8308U;

    /* renamed from: V  reason: collision with root package name */
    public RecyclerView f8309V;

    /* renamed from: W  reason: collision with root package name */
    public final c f8310W;

    /* renamed from: X  reason: collision with root package name */
    public final c f8311X;

    /* renamed from: Y  reason: collision with root package name */
    public C0513y f8312Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f8313Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f8314a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f8315b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f8316c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public int f8317d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8318e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8319f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f8320g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f8321h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8322i0;

    public Q() {
        O o2 = new O(0, this);
        O o8 = new O(1, this);
        this.f8310W = new c(o2);
        this.f8311X = new c(o8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r5 == 1073741824) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int H(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001e
            if (r7 < 0) goto L_0x0013
        L_0x0010:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0031
        L_0x0013:
            if (r7 != r1) goto L_0x001b
            if (r5 == r2) goto L_0x0023
            if (r5 == 0) goto L_0x001b
            if (r5 == r3) goto L_0x0023
        L_0x001b:
            r5 = 0
            r7 = 0
            goto L_0x0031
        L_0x001e:
            if (r7 < 0) goto L_0x0021
            goto L_0x0010
        L_0x0021:
            if (r7 != r1) goto L_0x0025
        L_0x0023:
            r7 = r4
            goto L_0x0031
        L_0x0025:
            if (r7 != r0) goto L_0x001b
            if (r5 == r2) goto L_0x002e
            if (r5 != r3) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r5 = 0
            goto L_0x0023
        L_0x002e:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0023
        L_0x0031:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.H(int, int, int, int, boolean):int");
    }

    public static int J(View view) {
        return view.getBottom() + ((S) view.getLayoutParams()).f8324V.bottom;
    }

    public static int L(View view) {
        return view.getLeft() - ((S) view.getLayoutParams()).f8324V.left;
    }

    public static int M(View view) {
        Rect rect = ((S) view.getLayoutParams()).f8324V;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int N(View view) {
        Rect rect = ((S) view.getLayoutParams()).f8324V;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int O(View view) {
        return view.getRight() + ((S) view.getLayoutParams()).f8324V.right;
    }

    public static int P(View view) {
        return view.getTop() - ((S) view.getLayoutParams()).f8324V.top;
    }

    public static int S(View view) {
        return ((S) view.getLayoutParams()).f8323U.getLayoutPosition();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.recyclerview.widget.P, java.lang.Object] */
    public static P T(Context context, AttributeSet attributeSet, int i, int i8) {
        ? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0414a.f7167a, i, i8);
        obj.f8304a = obtainStyledAttributes.getInt(0, 1);
        obj.f8305b = obtainStyledAttributes.getInt(10, 1);
        obj.f8306c = obtainStyledAttributes.getBoolean(9, false);
        obj.f8307d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean X(int i, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (i9 > 0 && i != i9) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    public static void Y(View view, int i, int i8, int i9, int i10) {
        S s8 = (S) view.getLayoutParams();
        Rect rect = s8.f8324V;
        view.layout(i + rect.left + s8.leftMargin, i8 + rect.top + s8.topMargin, (i9 - rect.right) - s8.rightMargin, (i10 - rect.bottom) - s8.bottomMargin);
    }

    public static int r(int i, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i8, i9));
        }
        if (mode != 1073741824) {
            return Math.max(i8, i9);
        }
        return size;
    }

    public final void A(Z z) {
        for (int G8 = G() - 1; G8 >= 0; G8--) {
            View F8 = F(G8);
            j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(F8);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                }
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f8309V.mAdapter.hasStableIds()) {
                F(G8);
                this.f8308U.c(G8);
                z.k(F8);
                this.f8309V.mViewInfoStore.c(childViewHolderInt);
            } else {
                if (F(G8) != null) {
                    this.f8308U.j(G8);
                }
                z.j(childViewHolderInt);
            }
        }
    }

    public abstract int A0(int i, Z z, f0 f0Var);

    public View B(int i) {
        int G8 = G();
        for (int i8 = 0; i8 < G8; i8++) {
            View F8 = F(i8);
            j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(F8);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f8309V.mState.f8400g || !childViewHolderInt.isRemoved())) {
                return F8;
            }
        }
        return null;
    }

    public abstract void B0(int i);

    public abstract S C();

    public abstract int C0(int i, Z z, f0 f0Var);

    public S D(Context context, AttributeSet attributeSet) {
        return new S(context, attributeSet);
    }

    public final void D0(RecyclerView recyclerView) {
        E0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), b.MAX_POW2), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), b.MAX_POW2));
    }

    public S E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof S) {
            return new S((S) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new S((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new S(layoutParams);
    }

    public final void E0(int i, int i8) {
        this.f8321h0 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f8319f0 = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f8321h0 = 0;
        }
        this.f8322i0 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        this.f8320g0 = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f8322i0 = 0;
        }
    }

    public final View F(int i) {
        C0492c cVar = this.f8308U;
        if (cVar != null) {
            return cVar.d(i);
        }
        return null;
    }

    public void F0(Rect rect, int i, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.f8309V;
        WeakHashMap weakHashMap = C1510H.f15874a;
        this.f8309V.setMeasuredDimension(r(i, paddingRight, recyclerView.getMinimumWidth()), r(i8, paddingBottom, this.f8309V.getMinimumHeight()));
    }

    public final int G() {
        C0492c cVar = this.f8308U;
        if (cVar != null) {
            return cVar.e();
        }
        return 0;
    }

    public final void G0(int i, int i8) {
        int G8 = G();
        if (G8 == 0) {
            this.f8309V.defaultOnMeasure(i, i8);
            return;
        }
        int i9 = RecyclerView.UNDEFINED_DURATION;
        int i10 = RecyclerView.UNDEFINED_DURATION;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < G8; i13++) {
            View F8 = F(i13);
            Rect rect = this.f8309V.mTempRect;
            K(F8, rect);
            int i14 = rect.left;
            if (i14 < i11) {
                i11 = i14;
            }
            int i15 = rect.right;
            if (i15 > i9) {
                i9 = i15;
            }
            int i16 = rect.top;
            if (i16 < i12) {
                i12 = i16;
            }
            int i17 = rect.bottom;
            if (i17 > i10) {
                i10 = i17;
            }
        }
        this.f8309V.mTempRect.set(i11, i12, i9, i10);
        F0(this.f8309V.mTempRect, i, i8);
    }

    public final void H0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f8309V = null;
            this.f8308U = null;
            this.f8321h0 = 0;
            this.f8322i0 = 0;
        } else {
            this.f8309V = recyclerView;
            this.f8308U = recyclerView.mChildHelper;
            this.f8321h0 = recyclerView.getWidth();
            this.f8322i0 = recyclerView.getHeight();
        }
        this.f8319f0 = b.MAX_POW2;
        this.f8320g0 = b.MAX_POW2;
    }

    public int I(Z z, f0 f0Var) {
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean I0(View view, int i, int i8, S s8) {
        if (view.isLayoutRequested() || !this.f8315b0 || !X(view.getWidth(), i, s8.width) || !X(view.getHeight(), i8, s8.height)) {
            return true;
        }
        return false;
    }

    public boolean J0() {
        return false;
    }

    public void K(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public final boolean K0(View view, int i, int i8, S s8) {
        if (!this.f8315b0 || !X(view.getMeasuredWidth(), i, s8.width) || !X(view.getMeasuredHeight(), i8, s8.height)) {
            return true;
        }
        return false;
    }

    public abstract void L0(RecyclerView recyclerView, int i);

    public final void M0(C0513y yVar) {
        C0513y yVar2 = this.f8312Y;
        if (!(yVar2 == null || yVar == yVar2 || !yVar2.e)) {
            yVar2.i();
        }
        this.f8312Y = yVar;
        RecyclerView recyclerView = this.f8309V;
        i0 i0Var = recyclerView.mViewFlinger;
        i0Var.f8426a0.removeCallbacks(i0Var);
        i0Var.f8422W.abortAnimation();
        if (yVar.f8553h) {
            Log.w("RecyclerView", "An instance of " + yVar.getClass().getSimpleName() + " was started more than once. Each instance of" + yVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        yVar.f8548b = recyclerView;
        yVar.f8549c = this;
        int i = yVar.f8547a;
        if (i != -1) {
            recyclerView.mState.f8395a = i;
            yVar.e = true;
            yVar.f8550d = true;
            yVar.f8551f = recyclerView.mLayout.B(i);
            yVar.f8548b.mViewFlinger.b();
            yVar.f8553h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean N0() {
        return false;
    }

    public final int Q() {
        F f8;
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            f8 = recyclerView.getAdapter();
        } else {
            f8 = null;
        }
        if (f8 != null) {
            return f8.getItemCount();
        }
        return 0;
    }

    public final int R() {
        RecyclerView recyclerView = this.f8309V;
        WeakHashMap weakHashMap = C1510H.f15874a;
        return recyclerView.getLayoutDirection();
    }

    public int U(Z z, f0 f0Var) {
        return -1;
    }

    public final void V(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((S) view.getLayoutParams()).f8324V;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.f8309V == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.f8309V.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean W();

    public void Z(int i) {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
    }

    public void a0(int i) {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
    }

    public void b0() {
    }

    public void c0(RecyclerView recyclerView) {
    }

    public abstract void d0(RecyclerView recyclerView);

    public View e0(View view, int i, Z z, f0 f0Var) {
        return null;
    }

    public void f0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f8309V;
        Z z = recyclerView.mRecycler;
        if (accessibilityEvent != null) {
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f8309V.canScrollVertically(-1) && !this.f8309V.canScrollHorizontally(-1) && !this.f8309V.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            F f8 = this.f8309V.mAdapter;
            if (f8 != null) {
                accessibilityEvent.setItemCount(f8.getItemCount());
            }
        }
    }

    public void g0(Z z, f0 f0Var, C1576e eVar) {
        boolean canScrollVertically = this.f8309V.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
        if (canScrollVertically || this.f8309V.canScrollHorizontally(-1)) {
            eVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f8309V.canScrollVertically(1) || this.f8309V.canScrollHorizontally(1)) {
            eVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(U(z, f0Var), I(z, f0Var), false, 0));
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final void h0(View view, C1576e eVar) {
        j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
            C0492c cVar = this.f8308U;
            if (!cVar.f8374c.contains(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f8309V;
                i0(recyclerView.mRecycler, recyclerView.mState, view, eVar);
            }
        }
    }

    public void i0(Z z, f0 f0Var, View view, C1576e eVar) {
    }

    public void j0(int i, int i8) {
    }

    public void k0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(android.view.View r10, int r11, boolean r12) {
        /*
            r9 = this;
            androidx.recyclerview.widget.j0 r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r10)
            r1 = 1
            if (r12 != 0) goto L_0x0016
            boolean r12 = r0.isRemoved()
            if (r12 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView r12 = r9.f8309V
            androidx.recyclerview.widget.t0 r12 = r12.mViewInfoStore
            r12.c(r0)
            goto L_0x0030
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView r12 = r9.f8309V
            androidx.recyclerview.widget.t0 r12 = r12.mViewInfoStore
            Y.i r12 = r12.f8521a
            java.lang.Object r2 = r12.get(r0)
            androidx.recyclerview.widget.r0 r2 = (androidx.recyclerview.widget.r0) r2
            if (r2 != 0) goto L_0x002b
            androidx.recyclerview.widget.r0 r2 = androidx.recyclerview.widget.r0.a()
            r12.put(r0, r2)
        L_0x002b:
            int r12 = r2.f8510a
            r12 = r12 | r1
            r2.f8510a = r12
        L_0x0030:
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            androidx.recyclerview.widget.S r12 = (androidx.recyclerview.widget.S) r12
            boolean r2 = r0.wasReturnedFromScrap()
            java.lang.String r3 = "RecyclerView"
            r4 = 0
            if (r2 != 0) goto L_0x0125
            boolean r2 = r0.isScrap()
            if (r2 == 0) goto L_0x0047
            goto L_0x0125
        L_0x0047:
            android.view.ViewParent r2 = r10.getParent()
            androidx.recyclerview.widget.RecyclerView r5 = r9.f8309V
            if (r2 != r5) goto L_0x0100
            androidx.recyclerview.widget.c r2 = r9.f8308U
            androidx.recyclerview.widget.D r5 = r2.f8372a
            androidx.recyclerview.widget.RecyclerView r5 = r5.f8270a
            int r5 = r5.indexOfChild(r10)
            r6 = -1
            if (r5 != r6) goto L_0x005e
        L_0x005c:
            r5 = -1
            goto L_0x006c
        L_0x005e:
            P5.E r2 = r2.f8373b
            boolean r7 = r2.D(r5)
            if (r7 == 0) goto L_0x0067
            goto L_0x005c
        L_0x0067:
            int r2 = r2.A(r5)
            int r5 = r5 - r2
        L_0x006c:
            if (r11 != r6) goto L_0x0074
            androidx.recyclerview.widget.c r11 = r9.f8308U
            int r11 = r11.e()
        L_0x0074:
            if (r5 == r6) goto L_0x00e4
            if (r5 == r11) goto L_0x013b
            androidx.recyclerview.widget.RecyclerView r10 = r9.f8309V
            androidx.recyclerview.widget.Q r10 = r10.mLayout
            android.view.View r2 = r10.F(r5)
            if (r2 == 0) goto L_0x00c7
            r10.F(r5)
            androidx.recyclerview.widget.c r6 = r10.f8308U
            r6.c(r5)
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            androidx.recyclerview.widget.S r5 = (androidx.recyclerview.widget.S) r5
            androidx.recyclerview.widget.j0 r6 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
            boolean r7 = r6.isRemoved()
            if (r7 == 0) goto L_0x00b5
            androidx.recyclerview.widget.RecyclerView r7 = r10.f8309V
            androidx.recyclerview.widget.t0 r7 = r7.mViewInfoStore
            Y.i r7 = r7.f8521a
            java.lang.Object r8 = r7.get(r6)
            androidx.recyclerview.widget.r0 r8 = (androidx.recyclerview.widget.r0) r8
            if (r8 != 0) goto L_0x00af
            androidx.recyclerview.widget.r0 r8 = androidx.recyclerview.widget.r0.a()
            r7.put(r6, r8)
        L_0x00af:
            int r7 = r8.f8510a
            r1 = r1 | r7
            r8.f8510a = r1
            goto L_0x00bc
        L_0x00b5:
            androidx.recyclerview.widget.RecyclerView r1 = r10.f8309V
            androidx.recyclerview.widget.t0 r1 = r1.mViewInfoStore
            r1.c(r6)
        L_0x00bc:
            androidx.recyclerview.widget.c r10 = r10.f8308U
            boolean r1 = r6.isRemoved()
            r10.b(r2, r11, r5, r1)
            goto L_0x013b
        L_0x00c7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            r12.<init>(r0)
            r12.append(r5)
            androidx.recyclerview.widget.RecyclerView r10 = r10.f8309V
            java.lang.String r10 = r10.toString()
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x00e4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r12.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f8309V
            int r10 = r0.indexOfChild(r10)
            r12.append(r10)
            androidx.recyclerview.widget.RecyclerView r10 = r9.f8309V
            java.lang.String r10 = Q0.g.n(r10, r12)
            r11.<init>(r10)
            throw r11
        L_0x0100:
            androidx.recyclerview.widget.c r2 = r9.f8308U
            r2.a(r10, r11, r4)
            r12.f8325W = r1
            androidx.recyclerview.widget.y r11 = r9.f8312Y
            if (r11 == 0) goto L_0x013b
            boolean r1 = r11.e
            if (r1 == 0) goto L_0x013b
            androidx.recyclerview.widget.RecyclerView r1 = r11.f8548b
            int r1 = r1.getChildLayoutPosition(r10)
            int r2 = r11.f8547a
            if (r1 != r2) goto L_0x013b
            r11.f8551f = r10
            boolean r10 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r10 == 0) goto L_0x013b
            java.lang.String r10 = "smooth scroll target view has been attached"
            android.util.Log.d(r3, r10)
            goto L_0x013b
        L_0x0125:
            boolean r1 = r0.isScrap()
            if (r1 == 0) goto L_0x012f
            r0.unScrap()
            goto L_0x0132
        L_0x012f:
            r0.clearReturnedFromScrapFlag()
        L_0x0132:
            androidx.recyclerview.widget.c r1 = r9.f8308U
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            r1.b(r10, r11, r2, r4)
        L_0x013b:
            boolean r10 = r12.f8326X
            if (r10 == 0) goto L_0x015d
            boolean r10 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r10 == 0) goto L_0x0156
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "consuming pending invalidate on child "
            r10.<init>(r11)
            androidx.recyclerview.widget.j0 r11 = r12.f8323U
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r3, r10)
        L_0x0156:
            android.view.View r10 = r0.itemView
            r10.invalidate()
            r12.f8326X = r4
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.l(android.view.View, int, boolean):void");
    }

    public void l0(int i, int i8) {
    }

    public void m(String str) {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void m0(int i, int i8) {
    }

    public final void n(View view, Rect rect) {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public void n0(int i) {
    }

    public abstract boolean o();

    public void o0(RecyclerView recyclerView, int i, int i8) {
        n0(i);
    }

    public abstract boolean p();

    public abstract void p0(Z z, f0 f0Var);

    public boolean q(S s8) {
        return s8 != null;
    }

    public abstract void q0(f0 f0Var);

    public void r0(Parcelable parcelable) {
    }

    public void s(int i, int i8, f0 f0Var, C0506q qVar) {
    }

    public Parcelable s0() {
        return null;
    }

    public void t(int i, C0506q qVar) {
    }

    public void t0(int i) {
    }

    public abstract int u(f0 f0Var);

    public final void u0() {
        for (int G8 = G() - 1; G8 >= 0; G8--) {
            this.f8308U.j(G8);
        }
    }

    public abstract int v(f0 f0Var);

    public final void v0(Z z) {
        for (int G8 = G() - 1; G8 >= 0; G8--) {
            if (!RecyclerView.getChildViewHolderInt(F(G8)).shouldIgnore()) {
                View F8 = F(G8);
                if (F(G8) != null) {
                    this.f8308U.j(G8);
                }
                z.i(F8);
            }
        }
    }

    public abstract int w(f0 f0Var);

    public final void w0(Z z) {
        ArrayList arrayList;
        int size = z.f8355a.size();
        int i = size - 1;
        while (true) {
            arrayList = z.f8355a;
            if (i < 0) {
                break;
            }
            View view = ((j0) arrayList.get(i)).itemView;
            j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.f8309V.removeDetachedView(view, false);
                }
                M m8 = this.f8309V.mItemAnimator;
                if (m8 != null) {
                    m8.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                j0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                z.j(childViewHolderInt2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = z.f8356b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f8309V.invalidate();
        }
    }

    public abstract int x(f0 f0Var);

    public final void x0(View view, Z z) {
        C0492c cVar = this.f8308U;
        D d8 = cVar.f8372a;
        int i = cVar.f8375d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i != 2) {
            try {
                cVar.f8375d = 1;
                cVar.e = view;
                int indexOfChild = d8.f8270a.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (cVar.f8373b.I(indexOfChild)) {
                        cVar.k(view);
                    }
                    d8.c(indexOfChild);
                }
                cVar.f8375d = 0;
                cVar.e = null;
                z.i(view);
            } catch (Throwable th) {
                cVar.f8375d = 0;
                cVar.e = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public abstract int y(f0 f0Var);

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.f8321h0
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.f8322i0
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.R()
            r7 = 1
            if (r3 != r7) goto L_0x005c
            if (r2 == 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0064
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0063:
            r2 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto L_0x00ae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L_0x007c
            goto L_0x00b3
        L_0x007c:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.f8321h0
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.f8322i0
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f8309V
            android.graphics.Rect r5 = r5.mTempRect
            r8.K(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto L_0x00b3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto L_0x00b3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto L_0x00b3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            if (r11 != 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00ba
            r9.scrollBy(r11, r10)
            goto L_0x00bd
        L_0x00ba:
            r9.smoothScrollBy(r11, r10)
        L_0x00bd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Q.y0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int z(f0 f0Var);

    public final void z0() {
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }
}
