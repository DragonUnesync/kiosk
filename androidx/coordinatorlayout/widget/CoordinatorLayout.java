package androidx.coordinatorlayout.widget;

import B0.b;
import B3.q;
import C7.e;
import M0.C0123k;
import T2.c;
import Y.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c0.C0608f;
import g0.C0941a;
import h0.C1026a;
import h0.C1027b;
import h0.C1028c;
import h0.C1029d;
import h0.f;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import u0.C1488c;
import v0.C1510H;
import v0.C1540m;
import v0.C1541n;
import v0.C1542o;
import v0.C1551x;
import v0.C1553z;
import v0.j0;

public class CoordinatorLayout extends ViewGroup implements C1540m, C1541n {

    /* renamed from: q0  reason: collision with root package name */
    public static final String f7705q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final Class[] f7706r0 = {Context.class, AttributeSet.class};

    /* renamed from: s0  reason: collision with root package name */
    public static final ThreadLocal f7707s0 = new ThreadLocal();

    /* renamed from: t0  reason: collision with root package name */
    public static final e f7708t0 = new e(3);

    /* renamed from: u0  reason: collision with root package name */
    public static final C1488c f7709u0 = new C1488c(12);

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f7710U = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public final q f7711V = new q(17);

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f7712W = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList f7713a0 = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public final int[] f7714b0 = new int[2];

    /* renamed from: c0  reason: collision with root package name */
    public final int[] f7715c0 = new int[2];

    /* renamed from: d0  reason: collision with root package name */
    public boolean f7716d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7717e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int[] f7718f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f7719g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f7720h0;

    /* renamed from: i0  reason: collision with root package name */
    public c f7721i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7722j0;

    /* renamed from: k0  reason: collision with root package name */
    public j0 f7723k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7724l0;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f7725m0;

    /* renamed from: n0  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f7726n0;

    /* renamed from: o0  reason: collision with root package name */
    public Z1.c f7727o0;
    public final C0123k p0 = new C0123k(9);

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f7705q0 = str;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968903);
        int[] iArr = C0941a.f11837a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130968903, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 2130968903, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f7718f0 = intArray;
            float f8 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f7718f0;
                iArr2[i] = (int) (((float) iArr2[i]) * f8);
            }
        }
        this.f7725m0 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new C1028c(this));
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f7709u0.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C1029d dVar, int i8, int i9) {
        int i10;
        int i11;
        int i12 = dVar.f12263c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i);
        int i13 = dVar.f12264d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 == 1) {
            i10 = rect.left + (rect.width() / 2);
        } else if (i16 != 5) {
            i10 = rect.left;
        } else {
            i10 = rect.right;
        }
        if (i17 == 16) {
            i11 = rect.top + (rect.height() / 2);
        } else if (i17 != 80) {
            i11 = rect.top;
        } else {
            i11 = rect.bottom;
        }
        if (i14 == 1) {
            i10 -= i8 / 2;
        } else if (i14 != 5) {
            i10 -= i8;
        }
        if (i15 == 16) {
            i11 -= i9 / 2;
        } else if (i15 != 80) {
            i11 -= i9;
        }
        rect2.set(i10, i11, i8 + i10, i9 + i11);
    }

    public static C1029d n(View view) {
        C1029d dVar = (C1029d) view.getLayoutParams();
        if (!dVar.f12262b) {
            C1027b bVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (C1027b) cls.getAnnotation(C1027b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    C1026a aVar = (C1026a) bVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C1026a aVar2 = dVar.f12261a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f12261a = aVar;
                        dVar.f12262b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            dVar.f12262b = true;
        }
        return dVar;
    }

    public static void u(View view, int i) {
        C1029d dVar = (C1029d) view.getLayoutParams();
        int i8 = dVar.i;
        if (i8 != i) {
            C1510H.j(view, i - i8);
            dVar.i = i;
        }
    }

    public static void v(View view, int i) {
        C1029d dVar = (C1029d) view.getLayoutParams();
        int i8 = dVar.f12268j;
        if (i8 != i) {
            C1510H.k(view, i - i8);
            dVar.f12268j = i;
        }
    }

    public final void a(View view, View view2, int i, int i8) {
        C0123k kVar = this.p0;
        if (i8 == 1) {
            kVar.f2965c = i;
        } else {
            kVar.f2964b = i;
        }
        this.f7720h0 = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((C1029d) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    public final void b(View view, int i) {
        C0123k kVar = this.p0;
        if (i == 1) {
            kVar.f2965c = 0;
        } else {
            kVar.f2964b = 0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C1029d dVar = (C1029d) childAt.getLayoutParams();
            if (dVar.a(i)) {
                C1026a aVar = dVar.f12261a;
                if (aVar != null) {
                    aVar.p(childAt, view, i);
                }
                if (i == 0) {
                    dVar.f12271m = false;
                } else if (i == 1) {
                    dVar.f12272n = false;
                }
            }
        }
        this.f7720h0 = null;
    }

    public final void c(View view, int i, int i8, int[] iArr, int i9) {
        C1026a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                int i13 = i9;
            } else {
                C1029d dVar = (C1029d) childAt.getLayoutParams();
                if (dVar.a(i9) && (aVar = dVar.f12261a) != null) {
                    int[] iArr2 = this.f7714b0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int[] iArr3 = iArr2;
                    aVar.j(this, childAt, view, i, i8, iArr2, i9);
                    if (i > 0) {
                        min = Math.max(i10, iArr3[0]);
                    } else {
                        min = Math.min(i10, iArr3[0]);
                    }
                    i10 = min;
                    if (i8 > 0) {
                        min2 = Math.max(i11, iArr3[1]);
                    } else {
                        min2 = Math.min(i11, iArr3[1]);
                    }
                    i11 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z) {
            p(1);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C1029d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        C1026a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                int i15 = i11;
            } else {
                C1029d dVar = (C1029d) childAt.getLayoutParams();
                if (dVar.a(i11) && (aVar = dVar.f12261a) != null) {
                    int[] iArr2 = this.f7714b0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i8, i9, i10, iArr2);
                    if (i9 > 0) {
                        min = Math.max(i12, iArr2[0]);
                    } else {
                        min = Math.min(i12, iArr2[0]);
                    }
                    i12 = min;
                    if (i10 > 0) {
                        min2 = Math.max(i13, iArr2[1]);
                    } else {
                        min2 = Math.min(i13, iArr2[1]);
                    }
                    i13 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z) {
            p(1);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j7) {
        C1026a aVar = ((C1029d) view.getLayoutParams()).f12261a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j7);
    }

    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7725m0;
        if (drawable == null || !drawable.isStateful()) {
            z = false;
        } else {
            z = drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        d(view, i, i8, i9, i10, 0, this.f7715c0);
    }

    public final boolean f(View view, View view2, int i, int i8) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1029d dVar = (C1029d) childAt.getLayoutParams();
                C1026a aVar = dVar.f12261a;
                if (aVar != null) {
                    boolean o2 = aVar.o(childAt, i, i8);
                    z |= o2;
                    if (i8 == 0) {
                        dVar.f12271m = o2;
                    } else if (i8 == 1) {
                        dVar.f12272n = o2;
                    }
                } else if (i8 == 0) {
                    dVar.f12271m = false;
                } else if (i8 == 1) {
                    dVar.f12272n = false;
                }
            }
        }
        return z;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1029d();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1029d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return DesugarCollections.unmodifiableList(this.f7710U);
    }

    public final j0 getLastWindowInsets() {
        return this.f7723k0;
    }

    public int getNestedScrollAxes() {
        C0123k kVar = this.p0;
        return kVar.f2965c | kVar.f2964b;
    }

    public Drawable getStatusBarBackground() {
        return this.f7725m0;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C1029d dVar, Rect rect, int i, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i8 + max2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        i iVar = (i) this.f7711V.f450V;
        int i = iVar.f6308W;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < i; i8++) {
            ArrayList arrayList2 = (ArrayList) iVar.j(i8);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar.f(i8));
            }
        }
        ArrayList arrayList3 = this.f7713a0;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = f.f12275a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = f.f12275a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        f.a(this, view, matrix);
        ThreadLocal threadLocal3 = f.f12276b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.f7718f0;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i, int i8) {
        C1488c cVar = f7709u0;
        Rect g8 = g();
        k(view, g8);
        try {
            return g8.contains(i, i8);
        } finally {
            g8.setEmpty();
            cVar.c(g8);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f7722j0) {
            if (this.f7721i0 == null) {
                this.f7721i0 = new c(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f7721i0);
        }
        if (this.f7723k0 == null) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            if (getFitsSystemWindows()) {
                C1551x.c(this);
            }
        }
        this.f7717e0 = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f7722j0 && this.f7721i0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f7721i0);
        }
        View view = this.f7720h0;
        if (view != null) {
            b(view, 0);
        }
        this.f7717e0 = false;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f7724l0 && this.f7725m0 != null) {
            j0 j0Var = this.f7723k0;
            if (j0Var != null) {
                i = j0Var.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f7725m0.setBounds(0, 0, getWidth(), i);
                this.f7725m0.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r8 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r8;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        C1026a aVar;
        WeakHashMap weakHashMap = C1510H.f15874a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f7710U;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((aVar = ((C1029d) view.getLayoutParams()).f12261a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0186, code lost:
        if (r0.h(r32, r20, r25, r8, r26) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r7 = 1
            r32.s()
            int r0 = r32.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0031
            android.view.View r2 = r6.getChildAt(r1)
            B3.q r3 = r6.f7711V
            java.lang.Object r3 = r3.f450V
            Y.i r3 = (Y.i) r3
            int r4 = r3.f6308W
            r5 = 0
        L_0x001b:
            if (r5 >= r4) goto L_0x002f
            java.lang.Object r9 = r3.j(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x002d
            r0 = 1
            goto L_0x0032
        L_0x002d:
            int r5 = r5 + r7
            goto L_0x001b
        L_0x002f:
            int r1 = r1 + r7
            goto L_0x000c
        L_0x0031:
            r0 = 0
        L_0x0032:
            boolean r1 = r6.f7722j0
            if (r0 == r1) goto L_0x0066
            if (r0 == 0) goto L_0x0053
            boolean r0 = r6.f7717e0
            if (r0 == 0) goto L_0x0050
            T2.c r0 = r6.f7721i0
            if (r0 != 0) goto L_0x0047
            T2.c r0 = new T2.c
            r0.<init>((androidx.coordinatorlayout.widget.CoordinatorLayout) r6)
            r6.f7721i0 = r0
        L_0x0047:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            T2.c r1 = r6.f7721i0
            r0.addOnPreDrawListener(r1)
        L_0x0050:
            r6.f7722j0 = r7
            goto L_0x0066
        L_0x0053:
            boolean r0 = r6.f7717e0
            if (r0 == 0) goto L_0x0064
            T2.c r0 = r6.f7721i0
            if (r0 == 0) goto L_0x0064
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            T2.c r1 = r6.f7721i0
            r0.removeOnPreDrawListener(r1)
        L_0x0064:
            r6.f7722j0 = r8
        L_0x0066:
            int r9 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r10 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            java.util.WeakHashMap r2 = v0.C1510H.f15874a
            int r11 = r32.getLayoutDirection()
            if (r11 != r7) goto L_0x0080
            r12 = 1
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            int r13 = android.view.View.MeasureSpec.getMode(r33)
            int r14 = android.view.View.MeasureSpec.getSize(r33)
            int r15 = android.view.View.MeasureSpec.getMode(r34)
            int r16 = android.view.View.MeasureSpec.getSize(r34)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            v0.j0 r2 = r6.f7723k0
            if (r2 == 0) goto L_0x00aa
            boolean r2 = r32.getFitsSystemWindows()
            if (r2 == 0) goto L_0x00aa
            r19 = 1
            goto L_0x00ac
        L_0x00aa:
            r19 = 0
        L_0x00ac:
            java.util.ArrayList r5 = r6.f7710U
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = 0
            r1 = 0
        L_0x00b6:
            if (r1 >= r4) goto L_0x01ea
            java.lang.Object r20 = r5.get(r1)
            android.view.View r20 = (android.view.View) r20
            int r7 = r20.getVisibility()
            r8 = 8
            if (r7 != r8) goto L_0x00d7
            r22 = r1
            r28 = r4
            r29 = r5
            r23 = r9
            r24 = r10
            r27 = r11
            r1 = 1
            r21 = 0
            goto L_0x01d9
        L_0x00d7:
            android.view.ViewGroup$LayoutParams r7 = r20.getLayoutParams()
            h0.d r7 = (h0.C1029d) r7
            int r8 = r7.e
            if (r8 < 0) goto L_0x011e
            if (r13 == 0) goto L_0x011e
            int r8 = r6.m(r8)
            r22 = r0
            int r0 = r7.f12263c
            if (r0 != 0) goto L_0x00f0
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f0:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r0 = r0 & 7
            r23 = r1
            r1 = 3
            if (r0 != r1) goto L_0x00fd
            if (r12 == 0) goto L_0x0102
        L_0x00fd:
            r1 = 5
            if (r0 != r1) goto L_0x010c
            if (r12 == 0) goto L_0x010c
        L_0x0102:
            int r0 = r14 - r10
            int r0 = r0 - r8
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
        L_0x010a:
            r8 = r0
            goto L_0x0124
        L_0x010c:
            if (r0 != r1) goto L_0x0110
            if (r12 == 0) goto L_0x0115
        L_0x0110:
            r1 = 3
            if (r0 != r1) goto L_0x011c
            if (r12 == 0) goto L_0x011c
        L_0x0115:
            int r8 = r8 - r9
            r1 = 0
            int r0 = java.lang.Math.max(r1, r8)
            goto L_0x010a
        L_0x011c:
            r1 = 0
            goto L_0x0123
        L_0x011e:
            r22 = r0
            r23 = r1
            goto L_0x011c
        L_0x0123:
            r8 = 0
        L_0x0124:
            if (r19 == 0) goto L_0x0159
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0159
            v0.j0 r0 = r6.f7723k0
            int r0 = r0.b()
            v0.j0 r1 = r6.f7723k0
            int r1 = r1.c()
            int r1 = r1 + r0
            v0.j0 r0 = r6.f7723k0
            int r0 = r0.d()
            r24 = r2
            v0.j0 r2 = r6.f7723k0
            int r2 = r2.a()
            int r2 = r2 + r0
            int r0 = r14 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r1 = r16 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r25 = r0
            r26 = r1
            goto L_0x015f
        L_0x0159:
            r24 = r2
            r25 = r33
            r26 = r34
        L_0x015f:
            h0.a r0 = r7.f12261a
            if (r0 == 0) goto L_0x0189
            r2 = r22
            r22 = r23
            r21 = 0
            r1 = r32
            r23 = r9
            r9 = r2
            r30 = r24
            r24 = r10
            r10 = r30
            r2 = r20
            r27 = r11
            r11 = r3
            r3 = r25
            r28 = r4
            r4 = r8
            r29 = r5
            r5 = r26
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01ad
            goto L_0x01a0
        L_0x0189:
            r28 = r4
            r29 = r5
            r27 = r11
            r21 = 0
            r11 = r3
            r30 = r23
            r23 = r9
            r9 = r22
            r22 = r30
            r31 = r24
            r24 = r10
            r10 = r31
        L_0x01a0:
            r5 = 0
            r0 = r32
            r1 = r20
            r2 = r25
            r3 = r8
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01ad:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r11, r0)
            int r1 = r20.getMeasuredHeight()
            int r1 = r1 + r18
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r10, r1)
            int r2 = r20.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r3 = r0
            r0 = r2
            r2 = r1
            r1 = 1
        L_0x01d9:
            int r4 = r22 + 1
            r1 = r4
            r9 = r23
            r10 = r24
            r11 = r27
            r4 = r28
            r5 = r29
            r7 = 1
            r8 = 0
            goto L_0x00b6
        L_0x01ea:
            r9 = r0
            r10 = r2
            r11 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r11, r1, r0)
            int r1 = r9 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r10, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f8, float f9, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1029d dVar = (C1029d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    C1026a aVar = dVar.f12261a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f8, float f9) {
        C1026a aVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1029d dVar = (C1029d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f12261a) != null) {
                    z |= aVar.i(view);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
        c(view, i, i8, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        e(view, i, i8, i9, i10, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h0.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h0.e eVar = (h0.e) parcelable;
        super.onRestoreInstanceState(eVar.f367U);
        SparseArray sparseArray = eVar.f12274W;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C1026a aVar = n(childAt).f12261a;
            if (!(id == -1 || aVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, B0.b, h0.e] */
    public final Parcelable onSaveInstanceState() {
        Parcelable n4;
        ? bVar = new b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C1026a aVar = ((C1029d) childAt.getLayoutParams()).f12261a;
            if (!(id == -1 || aVar == null || (n4 = aVar.n(childAt)) == null)) {
                sparseArray.append(id, n4);
            }
        }
        bVar.f12274W = sparseArray;
        return bVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f7719g0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f7719g0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            h0.d r6 = (h0.C1029d) r6
            h0.a r6 = r6.f12261a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f7719g0
            boolean r6 = r6.q(r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f7719g0
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.t(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x004b A[EDGE_INSN: B:127:0x004b->B:8:0x004b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap r7 = v0.C1510H.f15874a
            int r7 = r25.getLayoutDirection()
            java.util.ArrayList r14 = r0.f7710U
            int r15 = r14.size()
            android.graphics.Rect r13 = g()
            android.graphics.Rect r12 = g()
            android.graphics.Rect r11 = g()
            r9 = 0
        L_0x001d:
            u0.c r8 = f7709u0
            if (r9 >= r15) goto L_0x02ff
            java.lang.Object r16 = r14.get(r9)
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams()
            r3 = r16
            h0.d r3 = (h0.C1029d) r3
            if (r1 != 0) goto L_0x004e
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x004e
            r5 = r1
            r6 = r7
            r21 = r9
            r8 = r11
            r4 = r12
            r7 = r13
            r13 = r14
            r1 = r15
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x004b:
            r15 = 1
            goto L_0x02f3
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 >= r9) goto L_0x0110
            java.lang.Object r5 = r14.get(r4)
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = r3.f12270l
            if (r6 != r5) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            h0.d r5 = (h0.C1029d) r5
            android.view.View r6 = r5.f12269k
            if (r6 == 0) goto L_0x00e8
            android.graphics.Rect r6 = g()
            android.graphics.Rect r10 = g()
            r18 = r14
            android.graphics.Rect r14 = g()
            r19 = r8
            android.view.View r8 = r5.f12269k
            r0.k(r8, r6)
            r8 = 0
            r0.i(r2, r10, r8)
            r17 = r15
            int r15 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            r20 = r3
            r3 = r19
            r19 = 0
            r8 = r7
            r21 = r9
            r9 = r6
            r19 = r7
            r7 = r10
            r10 = r14
            r22 = r11
            r11 = r5
            r23 = r12
            r12 = r15
            r24 = r13
            r13 = r1
            l(r8, r9, r10, r11, r12, r13)
            int r8 = r14.left
            int r9 = r7.left
            if (r8 != r9) goto L_0x00b1
            int r8 = r14.top
            int r9 = r7.top
            if (r8 == r9) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r10 = 0
            goto L_0x00b2
        L_0x00b1:
            r10 = 1
        L_0x00b2:
            r0.h(r5, r14, r15, r1)
            int r1 = r14.left
            int r8 = r7.left
            int r1 = r1 - r8
            int r8 = r14.top
            int r9 = r7.top
            int r8 = r8 - r9
            if (r1 == 0) goto L_0x00c4
            v0.C1510H.j(r2, r1)
        L_0x00c4:
            if (r8 == 0) goto L_0x00c9
            v0.C1510H.k(r2, r8)
        L_0x00c9:
            if (r10 == 0) goto L_0x00d4
            h0.a r1 = r5.f12261a
            if (r1 == 0) goto L_0x00d4
            android.view.View r5 = r5.f12269k
            r1.d(r0, r2, r5)
        L_0x00d4:
            r6.setEmpty()
            r3.c(r6)
            r7.setEmpty()
            r3.c(r7)
            r14.setEmpty()
            r3.c(r14)
        L_0x00e6:
            r1 = 1
            goto L_0x00fa
        L_0x00e8:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            goto L_0x00e6
        L_0x00fa:
            int r4 = r4 + r1
            r1 = r26
            r8 = r3
            r15 = r17
            r14 = r18
            r7 = r19
            r3 = r20
            r9 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            goto L_0x004f
        L_0x0110:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r4 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            r1 = 1
            r0.i(r2, r4, r1)
            r1 = r20
            int r5 = r1.f12266g
            if (r5 == 0) goto L_0x0187
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0187
            int r5 = r1.f12266g
            r6 = r19
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r7 = r5 & 112(0x70, float:1.57E-43)
            r8 = 48
            if (r7 == r8) goto L_0x0157
            r8 = 80
            if (r7 == r8) goto L_0x0145
            r7 = r24
            goto L_0x0163
        L_0x0145:
            r7 = r24
            int r8 = r7.bottom
            int r9 = r25.getHeight()
            int r10 = r4.top
            int r9 = r9 - r10
            int r8 = java.lang.Math.max(r8, r9)
            r7.bottom = r8
            goto L_0x0163
        L_0x0157:
            r7 = r24
            int r8 = r7.top
            int r9 = r4.bottom
            int r8 = java.lang.Math.max(r8, r9)
            r7.top = r8
        L_0x0163:
            r5 = r5 & 7
            r8 = 3
            if (r5 == r8) goto L_0x017c
            r8 = 5
            if (r5 == r8) goto L_0x016c
            goto L_0x018b
        L_0x016c:
            int r5 = r7.right
            int r8 = r25.getWidth()
            int r9 = r4.left
            int r8 = r8 - r9
            int r5 = java.lang.Math.max(r5, r8)
            r7.right = r5
            goto L_0x018b
        L_0x017c:
            int r5 = r7.left
            int r8 = r4.right
            int r5 = java.lang.Math.max(r5, r8)
            r7.left = r5
            goto L_0x018b
        L_0x0187:
            r6 = r19
            r7 = r24
        L_0x018b:
            int r1 = r1.f12267h
            if (r1 == 0) goto L_0x029e
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x029e
            java.util.WeakHashMap r1 = v0.C1510H.f15874a
            boolean r1 = r2.isLaidOut()
            if (r1 != 0) goto L_0x019f
            goto L_0x029e
        L_0x019f:
            int r1 = r2.getWidth()
            if (r1 <= 0) goto L_0x029e
            int r1 = r2.getHeight()
            if (r1 > 0) goto L_0x01ad
            goto L_0x029e
        L_0x01ad:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            h0.d r1 = (h0.C1029d) r1
            h0.a r5 = r1.f12261a
            android.graphics.Rect r8 = g()
            android.graphics.Rect r9 = g()
            int r10 = r2.getLeft()
            int r11 = r2.getTop()
            int r12 = r2.getRight()
            int r13 = r2.getBottom()
            r9.set(r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0203
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L_0x0203
            boolean r5 = r9.contains(r8)
            if (r5 == 0) goto L_0x01df
            goto L_0x0206
        L_0x01df:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r8.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0203:
            r8.set(r9)
        L_0x0206:
            r9.setEmpty()
            r3.c(r9)
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x021a
            r8.setEmpty()
            r3.c(r8)
            goto L_0x029e
        L_0x021a:
            int r5 = r1.f12267h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r9 = 48
            r10 = r5 & 48
            if (r10 != r9) goto L_0x023a
            int r10 = r8.top
            int r11 = r1.topMargin
            int r10 = r10 - r11
            int r11 = r1.f12268j
            int r10 = r10 - r11
            int r11 = r7.top
            if (r10 >= r11) goto L_0x023a
            int r11 = r11 - r10
            v(r2, r11)
            r10 = 1
        L_0x0237:
            r11 = 80
            goto L_0x023c
        L_0x023a:
            r10 = 0
            goto L_0x0237
        L_0x023c:
            r12 = r5 & 80
            if (r12 != r11) goto L_0x0256
            int r12 = r25.getHeight()
            int r13 = r8.bottom
            int r12 = r12 - r13
            int r13 = r1.bottomMargin
            int r12 = r12 - r13
            int r13 = r1.f12268j
            int r12 = r12 + r13
            int r13 = r7.bottom
            if (r12 >= r13) goto L_0x0256
            int r12 = r12 - r13
            v(r2, r12)
            r10 = 1
        L_0x0256:
            if (r10 != 0) goto L_0x025e
            r10 = 0
            v(r2, r10)
        L_0x025c:
            r12 = 3
            goto L_0x0260
        L_0x025e:
            r10 = 0
            goto L_0x025c
        L_0x0260:
            r13 = r5 & 3
            if (r13 != r12) goto L_0x0277
            int r13 = r8.left
            int r14 = r1.leftMargin
            int r13 = r13 - r14
            int r14 = r1.i
            int r13 = r13 - r14
            int r14 = r7.left
            if (r13 >= r14) goto L_0x0277
            int r14 = r14 - r13
            u(r2, r14)
            r13 = 1
        L_0x0275:
            r14 = 5
            goto L_0x0279
        L_0x0277:
            r13 = 0
            goto L_0x0275
        L_0x0279:
            r5 = r5 & r14
            if (r5 != r14) goto L_0x0292
            int r5 = r25.getWidth()
            int r15 = r8.right
            int r5 = r5 - r15
            int r15 = r1.rightMargin
            int r5 = r5 - r15
            int r1 = r1.i
            int r5 = r5 + r1
            int r1 = r7.right
            if (r5 >= r1) goto L_0x0292
            int r5 = r5 - r1
            u(r2, r5)
            r13 = 1
        L_0x0292:
            if (r13 != 0) goto L_0x0297
            u(r2, r10)
        L_0x0297:
            r8.setEmpty()
            r3.c(r8)
            goto L_0x02a5
        L_0x029e:
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x02a5:
            r1 = 2
            r5 = r26
            if (r5 == r1) goto L_0x02d0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            h0.d r1 = (h0.C1029d) r1
            android.graphics.Rect r1 = r1.f12273o
            r8 = r22
            r8.set(r1)
            boolean r1 = r8.equals(r4)
            if (r1 == 0) goto L_0x02c3
            r1 = r17
            r13 = r18
            goto L_0x004b
        L_0x02c3:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            h0.d r1 = (h0.C1029d) r1
            android.graphics.Rect r1 = r1.f12273o
            r1.set(r4)
        L_0x02ce:
            r1 = 1
            goto L_0x02d3
        L_0x02d0:
            r8 = r22
            goto L_0x02ce
        L_0x02d3:
            int r2 = r21 + 1
            r1 = r17
        L_0x02d7:
            r13 = r18
            if (r2 >= r1) goto L_0x004b
            java.lang.Object r3 = r13.get(r2)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            h0.d r15 = (h0.C1029d) r15
            h0.a r15 = r15.f12261a
            if (r15 == 0) goto L_0x02ee
            r15.b(r3)
        L_0x02ee:
            r15 = 1
            int r2 = r2 + r15
            r18 = r13
            goto L_0x02d7
        L_0x02f3:
            int r2 = r21 + 1
            r15 = r1
            r9 = r2
            r12 = r4
            r1 = r5
            r11 = r8
            r14 = r13
            r13 = r7
            r7 = r6
            goto L_0x001d
        L_0x02ff:
            r3 = r8
            r8 = r11
            r4 = r12
            r7 = r13
            r7.setEmpty()
            r3.c(r7)
            r4.setEmpty()
            r3.c(r4)
            r8.setEmpty()
            r3.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        int i8;
        C1029d dVar = (C1029d) view.getLayoutParams();
        View view2 = dVar.f12269k;
        if (view2 != null || dVar.f12265f == -1) {
            C1488c cVar = f7709u0;
            if (view2 != null) {
                Rect g8 = g();
                Rect g9 = g();
                try {
                    k(view2, g8);
                    C1029d dVar2 = (C1029d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i, g8, g9, dVar2, measuredWidth, measuredHeight);
                    h(dVar2, g9, measuredWidth, measuredHeight);
                    view.layout(g9.left, g9.top, g9.right, g9.bottom);
                } finally {
                    g8.setEmpty();
                    cVar.c(g8);
                    g9.setEmpty();
                    cVar.c(g9);
                }
            } else {
                int i9 = dVar.e;
                if (i9 >= 0) {
                    C1029d dVar3 = (C1029d) view.getLayoutParams();
                    int i10 = dVar3.f12263c;
                    if (i10 == 0) {
                        i10 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i10, i);
                    int i11 = absoluteGravity & 7;
                    int i12 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i == 1) {
                        i9 = width - i9;
                    }
                    int m8 = m(i9) - measuredWidth2;
                    if (i11 == 1) {
                        m8 += measuredWidth2 / 2;
                    } else if (i11 == 5) {
                        m8 += measuredWidth2;
                    }
                    if (i12 == 16) {
                        i8 = measuredHeight2 / 2;
                    } else if (i12 != 80) {
                        i8 = 0;
                    } else {
                        i8 = measuredHeight2;
                    }
                    int max = Math.max(getPaddingLeft() + dVar3.leftMargin, Math.min(m8, ((width - getPaddingRight()) - measuredWidth2) - dVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + dVar3.topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - dVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                C1029d dVar4 = (C1029d) view.getLayoutParams();
                Rect g10 = g();
                g10.set(getPaddingLeft() + dVar4.leftMargin, getPaddingTop() + dVar4.topMargin, (getWidth() - getPaddingRight()) - dVar4.rightMargin, (getHeight() - getPaddingBottom()) - dVar4.bottomMargin);
                if (this.f7723k0 != null) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        g10.left = this.f7723k0.b() + g10.left;
                        g10.top = this.f7723k0.d() + g10.top;
                        g10.right -= this.f7723k0.c();
                        g10.bottom -= this.f7723k0.a();
                    }
                }
                Rect g11 = g();
                int i13 = dVar4.f12263c;
                if ((i13 & 7) == 0) {
                    i13 |= 8388611;
                }
                if ((i13 & 112) == 0) {
                    i13 |= 48;
                }
                Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), g10, g11, i);
                view.layout(g11.left, g11.top, g11.right, g11.bottom);
                g10.setEmpty();
                cVar.c(g10);
                g11.setEmpty();
                cVar.c(g11);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int i8;
        MotionEvent motionEvent2 = motionEvent;
        int i9 = i;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f7712W;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            if (isChildrenDrawingOrderEnabled) {
                i8 = getChildDrawingOrder(childCount, i10);
            } else {
                i8 = i10;
            }
            arrayList.add(getChildAt(i8));
        }
        e eVar = f7708t0;
        if (eVar != null) {
            Collections.sort(arrayList, eVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            C1026a aVar = ((C1029d) view.getLayoutParams()).f12261a;
            if (z && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i9 == 0) {
                        aVar.f(this, view, motionEvent3);
                    } else if (i9 == 1) {
                        aVar.q(view, motionEvent3);
                    }
                }
            } else if (!z && aVar != null) {
                if (i9 == 0) {
                    z = aVar.f(this, view, motionEvent2);
                } else if (i9 == 1) {
                    z = aVar.q(view, motionEvent2);
                }
                if (z) {
                    this.f7719g0 = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C1026a aVar = ((C1029d) view.getLayoutParams()).f12261a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f7716d0) {
            t(false);
            this.f7716d0 = true;
        }
    }

    public final void s() {
        C0608f fVar;
        ArrayList arrayList = this.f7710U;
        arrayList.clear();
        q qVar = this.f7711V;
        i iVar = (i) qVar.f450V;
        int i = iVar.f6308W;
        int i8 = 0;
        while (true) {
            fVar = (C0608f) qVar.f449U;
            if (i8 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) iVar.j(i8);
            if (arrayList2 != null) {
                arrayList2.clear();
                fVar.c(arrayList2);
            }
            i8++;
        }
        iVar.clear();
        int childCount = getChildCount();
        int i9 = 0;
        loop1:
        while (true) {
            i iVar2 = (i) qVar.f450V;
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                C1029d n4 = n(childAt);
                int i10 = n4.f12265f;
                if (i10 == -1) {
                    n4.f12270l = null;
                    n4.f12269k = null;
                } else {
                    View view = n4.f12269k;
                    if (view != null && view.getId() == i10) {
                        View view2 = n4.f12269k;
                        ViewParent parent = view2.getParent();
                        while (parent != this) {
                            if (parent == null || parent == childAt) {
                                n4.f12270l = null;
                                n4.f12269k = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                                parent = parent.getParent();
                            }
                        }
                        n4.f12270l = view2;
                    }
                    View findViewById = findViewById(i10);
                    n4.f12269k = findViewById;
                    if (findViewById != null) {
                        if (findViewById != this) {
                            ViewParent parent2 = findViewById.getParent();
                            while (true) {
                                if (parent2 == this || parent2 == null) {
                                    n4.f12270l = findViewById;
                                } else if (parent2 != childAt) {
                                    if (parent2 instanceof View) {
                                        findViewById = (View) parent2;
                                    }
                                    parent2 = parent2.getParent();
                                } else if (isInEditMode()) {
                                    n4.f12270l = null;
                                    n4.f12269k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            }
                        } else if (isInEditMode()) {
                            n4.f12270l = null;
                            n4.f12269k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else if (isInEditMode()) {
                        n4.f12270l = null;
                        n4.f12269k = null;
                    } else {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i10) + " to anchor view " + childAt);
                    }
                }
                if (!iVar2.containsKey(childAt)) {
                    iVar2.put(childAt, (Object) null);
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (i11 != i9) {
                        View childAt2 = getChildAt(i11);
                        if (childAt2 != n4.f12270l) {
                            WeakHashMap weakHashMap = C1510H.f15874a;
                            int layoutDirection = getLayoutDirection();
                            int absoluteGravity = Gravity.getAbsoluteGravity(((C1029d) childAt2.getLayoutParams()).f12266g, layoutDirection);
                            if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n4.f12267h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                                C1026a aVar = n4.f12261a;
                                if (aVar != null) {
                                    aVar.b(childAt);
                                }
                            }
                        }
                        if (!iVar2.containsKey(childAt2) && !iVar2.containsKey(childAt2)) {
                            iVar2.put(childAt2, (Object) null);
                        }
                        if (iVar2.containsKey(childAt2) && iVar2.containsKey(childAt)) {
                            ArrayList arrayList3 = (ArrayList) iVar2.get(childAt2);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) fVar.a();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                iVar2.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
                i9++;
            } else {
                ArrayList arrayList4 = (ArrayList) qVar.f451W;
                arrayList4.clear();
                HashSet hashSet = (HashSet) qVar.f452X;
                hashSet.clear();
                int i12 = iVar2.f6308W;
                for (int i13 = 0; i13 < i12; i13++) {
                    qVar.t(iVar2.f(i13), arrayList4, hashSet);
                }
                arrayList.addAll(arrayList4);
                Collections.reverse(arrayList);
                return;
            }
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f7726n0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f7725m0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7725m0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7725m0.setState(getDrawableState());
                }
                Drawable drawable4 = this.f7725m0;
                WeakHashMap weakHashMap = C1510H.f15874a;
                E.e.v(drawable4, getLayoutDirection());
                Drawable drawable5 = this.f7725m0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f7725m0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = C1510H.f15874a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f7725m0;
        if (drawable != null && drawable.isVisible() != z) {
            this.f7725m0.setVisible(z, false);
        }
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1026a aVar = ((C1029d) childAt.getLayoutParams()).f12261a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((C1029d) getChildAt(i8).getLayoutParams()).getClass();
        }
        this.f7719g0 = null;
        this.f7716d0 = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f7725m0) {
            return true;
        }
        return false;
    }

    public final void w() {
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (getFitsSystemWindows()) {
            if (this.f7727o0 == null) {
                this.f7727o0 = new Z1.c(26, (Object) this);
            }
            C1553z.m(this, this.f7727o0);
            setSystemUiVisibility(1280);
            return;
        }
        C1553z.m(this, (C1542o) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1029d) {
            return new C1029d((C1029d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1029d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1029d(layoutParams);
    }
}
