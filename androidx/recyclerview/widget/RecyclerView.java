package androidx.recyclerview.widget;

import B.C0003d;
import C0.d;
import D6.j;
import E.e;
import O7.b;
import Q0.g;
import Y.i;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.woxthebox.draglistview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n2.a;
import q0.C1361h;
import v0.C1510H;
import v0.C1539l;
import v0.C1553z;

public class RecyclerView extends ViewGroup {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final float DECELERATION_RATE = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final g0 sDefaultEdgeEffectFactory = new Object();
    static final Interpolator sQuinticInterpolator = new d(2);
    static boolean sVerboseLoggingEnabled;
    l0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    F mAdapter;
    C0491b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private I mChildDrawingOrderCallback;
    C0492c mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private J mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C0507s mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private V mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    M mItemAnimator;
    private K mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<N> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    Q mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final b0 mObserver;
    private List<T> mOnChildAttachStateListeners;
    private U mOnFlingListener;
    private final ArrayList<V> mOnItemTouchListeners;
    final List<j0> mPendingAccessibilityImportanceChange;
    c0 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    C0506q mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Z mRecycler;
    a0 mRecyclerListener;
    final List<a0> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private W mScrollListener;
    private List<W> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C1539l mScrollingChildHelper;
    final f0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final i0 mViewFlinger;
    private final s0 mViewInfoProcessCallback;
    final t0 mViewInfoStore;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.recyclerview.widget.g0, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            int[] r3 = new int[]{r3}
            NESTED_SCROLLING_ATTRS = r3
            r3 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r3 = java.lang.Math.log(r3)
            r5 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r5 = java.lang.Math.log(r5)
            double r3 = r3 / r5
            float r3 = (float) r3
            DECELERATION_RATE = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            FORCE_INVALIDATE_DISPLAY_LIST = r2
            r4 = 23
            if (r3 < r4) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r3
            POST_UPDATES_ON_ANIMATION = r1
            ALLOW_THREAD_GAP_WORK = r1
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r2
            IGNORE_DETACHED_FOCUSED_CHILD = r2
            r3 = 4
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r2] = r4
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r3[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r3[r0] = r1
            r2 = 3
            r3[r2] = r1
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r3
            C0.d r1 = new C0.d
            r1.<init>(r0)
            sQuinticInterpolator = r1
            androidx.recyclerview.widget.g0 r0 = new androidx.recyclerview.widget.g0
            r0.<init>()
            sDefaultEdgeEffectFactory = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static int b(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i8) {
        if (i > 0 && edgeEffect != null && e.n(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(e.s(edgeEffect, (((float) (-i)) * FLING_DESTRETCH_FACTOR) / ((float) i8), 0.5f) * (((float) (-i8)) / FLING_DESTRETCH_FACTOR));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i >= 0 || edgeEffect2 == null || e.n(edgeEffect2) == DECELERATION_RATE) {
            return i;
        } else {
            float f8 = (float) i8;
            float f9 = (((float) i) * FLING_DESTRETCH_FACTOR) / f8;
            int round2 = Math.round(e.s(edgeEffect2, f9, 0.5f) * (f8 / FLING_DESTRETCH_FACTOR));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
    }

    public static void clearNestedRecyclerViewIfNotNested(j0 j0Var) {
        WeakReference<RecyclerView> weakReference = j0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != j0Var.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            j0Var.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    public static j0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((S) view.getLayoutParams()).f8323U;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        S s8 = (S) view.getLayoutParams();
        Rect rect2 = s8.f8324V;
        rect.set((view.getLeft() - rect2.left) - s8.leftMargin, (view.getTop() - rect2.top) - s8.topMargin, view.getRight() + rect2.right + s8.rightMargin, view.getBottom() + rect2.bottom + s8.bottomMargin);
    }

    private C1539l getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1539l(this);
        }
        return this.mScrollingChildHelper;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public final void a(j0 j0Var) {
        boolean z;
        View view = j0Var.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.mRecycler.m(getChildViewHolder(view));
        if (j0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.a(view, -1, true);
        } else {
            C0492c cVar = this.mChildHelper;
            int indexOfChild = cVar.f8372a.f8270a.indexOfChild(view);
            if (indexOfChild >= 0) {
                cVar.f8373b.K(indexOfChild);
                cVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void absorbGlows(int i, int i8) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i8 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i8);
            }
        }
        if (i != 0 || i8 != 0) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            postInvalidateOnAnimation();
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i8) {
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.getClass();
        }
        super.addFocusables(arrayList, i, i8);
    }

    public void addItemDecoration(N n4, int i) {
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(n4);
        } else {
            this.mItemDecorations.add(i, n4);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(T t8) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(t8);
    }

    public void addOnItemTouchListener(V v4) {
        this.mOnItemTouchListeners.add(v4);
    }

    public void addOnScrollListener(W w2) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(w2);
    }

    public void addRecyclerListener(a0 a0Var) {
        boolean z;
        if (a0Var != null) {
            z = true;
        } else {
            z = false;
        }
        a.h("'listener' arg cannot be null.", z);
        this.mRecyclerListeners.add(a0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void animateAppearance(androidx.recyclerview.widget.j0 r8, androidx.recyclerview.widget.L r9, androidx.recyclerview.widget.L r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.M r0 = r7.mItemAnimator
            r1 = r0
            androidx.recyclerview.widget.j r1 = (androidx.recyclerview.widget.C0499j) r1
            if (r9 == 0) goto L_0x0024
            r1.getClass()
            int r3 = r9.f8281a
            int r5 = r10.f8281a
            if (r3 != r5) goto L_0x001a
            int r0 = r9.f8282b
            int r2 = r10.f8282b
            if (r0 == r2) goto L_0x0024
        L_0x001a:
            int r4 = r9.f8282b
            int r6 = r10.f8282b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L_0x0033
        L_0x0024:
            r1.l(r8)
            android.view.View r9 = r8.itemView
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.i
            r9.add(r8)
            r8 = 1
        L_0x0033:
            if (r8 == 0) goto L_0x0038
            r7.postAnimationRunner()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.animateAppearance(androidx.recyclerview.widget.j0, androidx.recyclerview.widget.L, androidx.recyclerview.widget.L):void");
    }

    public void animateDisappearance(j0 j0Var, L l8, L l9) {
        int i;
        int i8;
        boolean z;
        a(j0Var);
        j0Var.setIsRecyclable(false);
        C0499j jVar = (C0499j) this.mItemAnimator;
        jVar.getClass();
        int i9 = l8.f8281a;
        int i10 = l8.f8282b;
        View view = j0Var.itemView;
        if (l9 == null) {
            i = view.getLeft();
        } else {
            i = l9.f8281a;
        }
        int i11 = i;
        if (l9 == null) {
            i8 = view.getTop();
        } else {
            i8 = l9.f8282b;
        }
        int i12 = i8;
        if (j0Var.isRemoved() || (i9 == i11 && i10 == i12)) {
            jVar.l(j0Var);
            jVar.f8429h.add(j0Var);
            z = true;
        } else {
            view.layout(i11, i12, view.getWidth() + i11, view.getHeight() + i12);
            z = jVar.g(j0Var, i9, i10, i11, i12);
        }
        if (z) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(g.n(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        throw new IllegalStateException(g.n(this, g.r(str)));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(g.n(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(g.n(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(j0 j0Var) {
        M m8 = this.mItemAnimator;
        if (m8 != null) {
            C0499j jVar = (C0499j) m8;
            if (!j0Var.getUnmodifiedPayloads().isEmpty() || !jVar.f8428g || j0Var.isInvalid()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof S) || !this.mLayout.q((S) layoutParams)) {
            return false;
        }
        return true;
    }

    public void clearOldPositions() {
        int h5 = this.mChildHelper.h();
        for (int i = 0; i < h5; i++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        Z z = this.mRecycler;
        ArrayList arrayList = z.f8357c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((j0) arrayList.get(i8)).clearOldPosition();
        }
        ArrayList arrayList2 = z.f8355a;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((j0) arrayList2.get(i9)).clearOldPosition();
        }
        ArrayList arrayList3 = z.f8356b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                ((j0) z.f8356b.get(i10)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<T> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<W> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        Q q7 = this.mLayout;
        if (q7 != null && q7.o()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        Q q7 = this.mLayout;
        if (q7 != null && q7.o()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        Q q7 = this.mLayout;
        if (q7 != null && q7.o()) {
            return this.mLayout.w(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        Q q7 = this.mLayout;
        if (q7 != null && q7.p()) {
            return this.mLayout.x(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        Q q7 = this.mLayout;
        if (q7 != null && q7.p()) {
            return this.mLayout.y(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        Q q7 = this.mLayout;
        if (q7 != null && q7.p()) {
            return this.mLayout.z(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i8) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return b(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return b(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = C1361h.f14708a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
        } else if (this.mAdapterHelper.g()) {
            C0491b bVar = this.mAdapterHelper;
            int i8 = bVar.f8370f;
            if ((i8 & 4) != 0 && (i8 & 11) == 0) {
                int i9 = C1361h.f14708a;
                Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.j();
                if (!this.mLayoutWasDefered) {
                    int e = this.mChildHelper.e();
                    int i10 = 0;
                    while (true) {
                        if (i10 < e) {
                            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                                dispatchLayout();
                                break;
                            }
                            i10++;
                        } else {
                            this.mAdapterHelper.b();
                            break;
                        }
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                Trace.endSection();
            } else if (bVar.g()) {
                int i11 = C1361h.f14708a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [androidx.recyclerview.widget.L, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v16, types: [androidx.recyclerview.widget.L, java.lang.Object] */
    public final void d() {
        View view;
        r0 r0Var;
        int i;
        boolean z = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        t0 t0Var = this.mViewInfoStore;
        t0Var.f8521a.clear();
        t0Var.f8522b.b();
        onEnterLayoutOrScroll();
        j();
        j0 j0Var = null;
        if (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            j0Var = findContainingViewHolder(view);
        }
        long j7 = -1;
        if (j0Var == null) {
            f0 f0Var = this.mState;
            f0Var.f8405m = -1;
            f0Var.f8404l = -1;
            f0Var.f8406n = -1;
        } else {
            f0 f0Var2 = this.mState;
            if (this.mAdapter.hasStableIds()) {
                j7 = j0Var.getItemId();
            }
            f0Var2.f8405m = j7;
            f0 f0Var3 = this.mState;
            if (this.mDataSetHasChangedAfterLayout) {
                i = -1;
            } else if (j0Var.isRemoved()) {
                i = j0Var.mOldPosition;
            } else {
                i = j0Var.getAbsoluteAdapterPosition();
            }
            f0Var3.f8404l = i;
            f0 f0Var4 = this.mState;
            View view2 = j0Var.itemView;
            int id = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id = view2.getId();
                }
            }
            f0Var4.f8406n = id;
        }
        f0 f0Var5 = this.mState;
        if (!f0Var5.f8402j || !this.mItemsChanged) {
            z = false;
        }
        f0Var5.f8401h = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        f0Var5.f8400g = f0Var5.f8403k;
        f0Var5.e = this.mAdapter.getItemCount();
        g(this.mMinMaxLayoutPositions);
        if (this.mState.f8402j) {
            int e = this.mChildHelper.e();
            for (int i8 = 0; i8 < e; i8++) {
                j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i8));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    M m8 = this.mItemAnimator;
                    M.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    m8.getClass();
                    ? obj = new Object();
                    obj.a(childViewHolderInt);
                    i iVar = this.mViewInfoStore.f8521a;
                    r0 r0Var2 = (r0) iVar.get(childViewHolderInt);
                    if (r0Var2 == null) {
                        r0Var2 = r0.a();
                        iVar.put(childViewHolderInt, r0Var2);
                    }
                    r0Var2.f8511b = obj;
                    r0Var2.f8510a |= 4;
                    if (this.mState.f8401h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f8522b.g(childViewHolderInt, getChangedHolderKey(childViewHolderInt));
                    }
                }
            }
        }
        if (this.mState.f8403k) {
            saveOldPositions();
            f0 f0Var6 = this.mState;
            boolean z6 = f0Var6.f8399f;
            f0Var6.f8399f = false;
            this.mLayout.p0(this.mRecycler, f0Var6);
            this.mState.f8399f = z6;
            for (int i9 = 0; i9 < this.mChildHelper.e(); i9++) {
                j0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i9));
                if (!childViewHolderInt2.shouldIgnore() && ((r0Var = (r0) this.mViewInfoStore.f8521a.get(childViewHolderInt2)) == null || (r0Var.f8510a & 4) == 0)) {
                    M.b(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    M m9 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    m9.getClass();
                    ? obj2 = new Object();
                    obj2.a(childViewHolderInt2);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, obj2);
                    } else {
                        i iVar2 = this.mViewInfoStore.f8521a;
                        r0 r0Var3 = (r0) iVar2.get(childViewHolderInt2);
                        if (r0Var3 == null) {
                            r0Var3 = r0.a();
                            iVar2.put(childViewHolderInt2, r0Var3);
                        }
                        r0Var3.f8510a |= 2;
                        r0Var3.f8511b = obj2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f8398d = 2;
    }

    public void defaultOnMeasure(int i, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = C1510H.f15874a;
        setMeasuredDimension(Q.r(i, paddingRight, getMinimumWidth()), Q.r(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        int size;
        j0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        F f8 = this.mAdapter;
        if (!(f8 == null || childViewHolderInt == null)) {
            f8.onViewAttachedToWindow(childViewHolderInt);
        }
        List<T> list = this.mOnChildAttachStateListeners;
        if (list != null && list.size() - 1 >= 0) {
            this.mOnChildAttachStateListeners.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public void dispatchChildDetached(View view) {
        int size;
        j0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        F f8 = this.mAdapter;
        if (!(f8 == null || childViewHolderInt == null)) {
            f8.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<T> list = this.mOnChildAttachStateListeners;
        if (list != null && list.size() - 1 >= 0) {
            this.mOnChildAttachStateListeners.get(size).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r10v15, types: [androidx.recyclerview.widget.L, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0385, code lost:
        if (r0.mChildHelper.f8374c.contains(r1) == false) goto L_0x0420;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0407  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchLayout() {
        /*
            r17 = this;
            r0 = r17
            androidx.recyclerview.widget.F r1 = r0.mAdapter
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r1)
            return
        L_0x000e:
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            androidx.recyclerview.widget.f0 r1 = r0.mState
            r3 = 0
            r1.i = r3
            boolean r1 = r0.mLastAutoMeasureSkippedDueToExact
            r4 = 1
            if (r1 == 0) goto L_0x0034
            int r1 = r0.mLastAutoMeasureNonExactMeasuredWidth
            int r5 = r17.getWidth()
            if (r1 != r5) goto L_0x0032
            int r1 = r0.mLastAutoMeasureNonExactMeasuredHeight
            int r5 = r17.getHeight()
            if (r1 == r5) goto L_0x0034
        L_0x0032:
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r0.mLastAutoMeasureNonExactMeasuredWidth = r3
            r0.mLastAutoMeasureNonExactMeasuredHeight = r3
            r0.mLastAutoMeasureSkippedDueToExact = r3
            androidx.recyclerview.widget.f0 r5 = r0.mState
            int r5 = r5.f8398d
            if (r5 != r4) goto L_0x004d
            r17.d()
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            r1.D0(r0)
            r17.e()
            goto L_0x0085
        L_0x004d:
            androidx.recyclerview.widget.b r5 = r0.mAdapterHelper
            java.util.ArrayList r6 = r5.f8368c
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0060
            java.util.ArrayList r5 = r5.f8367b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0060
            goto L_0x007d
        L_0x0060:
            if (r1 != 0) goto L_0x007d
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            int r1 = r1.f8321h0
            int r5 = r17.getWidth()
            if (r1 != r5) goto L_0x007d
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            int r1 = r1.f8322i0
            int r5 = r17.getHeight()
            if (r1 == r5) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            r1.D0(r0)
            goto L_0x0085
        L_0x007d:
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            r1.D0(r0)
            r17.e()
        L_0x0085:
            androidx.recyclerview.widget.f0 r1 = r0.mState
            r5 = 4
            r1.a(r5)
            r17.startInterceptRequestLayout()
            r17.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.f0 r1 = r0.mState
            r1.f8398d = r4
            boolean r1 = r1.f8402j
            r6 = 0
            if (r1 == 0) goto L_0x02c6
            androidx.recyclerview.widget.c r1 = r0.mChildHelper
            int r1 = r1.e()
            int r1 = r1 - r4
        L_0x00a1:
            if (r1 < 0) goto L_0x01d5
            androidx.recyclerview.widget.c r7 = r0.mChildHelper
            android.view.View r7 = r7.d(r1)
            androidx.recyclerview.widget.j0 r7 = getChildViewHolderInt(r7)
            boolean r8 = r7.shouldIgnore()
            if (r8 == 0) goto L_0x00b5
            goto L_0x01d1
        L_0x00b5:
            long r8 = r0.getChangedHolderKey(r7)
            androidx.recyclerview.widget.M r10 = r0.mItemAnimator
            r10.getClass()
            androidx.recyclerview.widget.L r10 = new androidx.recyclerview.widget.L
            r10.<init>()
            r10.a(r7)
            androidx.recyclerview.widget.t0 r11 = r0.mViewInfoStore
            Y.g r11 = r11.f8522b
            java.lang.Object r11 = r11.d(r8)
            androidx.recyclerview.widget.j0 r11 = (androidx.recyclerview.widget.j0) r11
            if (r11 == 0) goto L_0x01cc
            boolean r12 = r11.shouldIgnore()
            if (r12 != 0) goto L_0x01cc
            androidx.recyclerview.widget.t0 r12 = r0.mViewInfoStore
            Y.i r12 = r12.f8521a
            java.lang.Object r12 = r12.get(r11)
            androidx.recyclerview.widget.r0 r12 = (androidx.recyclerview.widget.r0) r12
            if (r12 == 0) goto L_0x00eb
            int r12 = r12.f8510a
            r12 = r12 & r4
            if (r12 == 0) goto L_0x00eb
            r12 = 1
            goto L_0x00ec
        L_0x00eb:
            r12 = 0
        L_0x00ec:
            androidx.recyclerview.widget.t0 r13 = r0.mViewInfoStore
            Y.i r13 = r13.f8521a
            java.lang.Object r13 = r13.get(r7)
            androidx.recyclerview.widget.r0 r13 = (androidx.recyclerview.widget.r0) r13
            if (r13 == 0) goto L_0x00ff
            int r13 = r13.f8510a
            r13 = r13 & r4
            if (r13 == 0) goto L_0x00ff
            r13 = 1
            goto L_0x0100
        L_0x00ff:
            r13 = 0
        L_0x0100:
            if (r12 == 0) goto L_0x010b
            if (r11 != r7) goto L_0x010b
            androidx.recyclerview.widget.t0 r8 = r0.mViewInfoStore
            r8.a(r7, r10)
            goto L_0x01d1
        L_0x010b:
            androidx.recyclerview.widget.t0 r14 = r0.mViewInfoStore
            androidx.recyclerview.widget.L r14 = r14.b(r11, r5)
            androidx.recyclerview.widget.t0 r15 = r0.mViewInfoStore
            r15.a(r7, r10)
            androidx.recyclerview.widget.t0 r10 = r0.mViewInfoStore
            r15 = 8
            androidx.recyclerview.widget.L r10 = r10.b(r7, r15)
            if (r14 != 0) goto L_0x01a2
            androidx.recyclerview.widget.c r10 = r0.mChildHelper
            int r10 = r10.e()
            r12 = 0
        L_0x0127:
            if (r12 >= r10) goto L_0x0181
            androidx.recyclerview.widget.c r13 = r0.mChildHelper
            android.view.View r13 = r13.d(r12)
            androidx.recyclerview.widget.j0 r13 = getChildViewHolderInt(r13)
            if (r13 != r7) goto L_0x0136
            goto L_0x017e
        L_0x0136:
            long r14 = r0.getChangedHolderKey(r13)
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x017e
            androidx.recyclerview.widget.F r1 = r0.mAdapter
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0164
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L_0x0164
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = Q0.g.n(r0, r3)
            r1.<init>(r2)
            throw r1
        L_0x0164:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = Q0.g.n(r0, r3)
            r1.<init>(r2)
            throw r1
        L_0x017e:
            int r12 = r12 + 1
            goto L_0x0127
        L_0x0181:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r9 = " cannot be found but it is necessary for "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r17.exceptionLabel()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r2, r7)
            goto L_0x01d1
        L_0x01a2:
            r11.setIsRecyclable(r3)
            if (r12 == 0) goto L_0x01aa
            r0.a(r11)
        L_0x01aa:
            if (r11 == r7) goto L_0x01c0
            if (r13 == 0) goto L_0x01b1
            r0.a(r7)
        L_0x01b1:
            r11.mShadowedHolder = r7
            r0.a(r11)
            androidx.recyclerview.widget.Z r8 = r0.mRecycler
            r8.m(r11)
            r7.setIsRecyclable(r3)
            r7.mShadowingHolder = r11
        L_0x01c0:
            androidx.recyclerview.widget.M r8 = r0.mItemAnimator
            boolean r7 = r8.a(r11, r7, r14, r10)
            if (r7 == 0) goto L_0x01d1
            r17.postAnimationRunner()
            goto L_0x01d1
        L_0x01cc:
            androidx.recyclerview.widget.t0 r8 = r0.mViewInfoStore
            r8.a(r7, r10)
        L_0x01d1:
            int r1 = r1 + -1
            goto L_0x00a1
        L_0x01d5:
            androidx.recyclerview.widget.t0 r1 = r0.mViewInfoStore
            androidx.recyclerview.widget.s0 r2 = r0.mViewInfoProcessCallback
            Y.i r1 = r1.f8521a
            int r5 = r1.f6308W
            int r5 = r5 - r4
        L_0x01de:
            if (r5 < 0) goto L_0x02c6
            java.lang.Object r7 = r1.f(r5)
            r9 = r7
            androidx.recyclerview.widget.j0 r9 = (androidx.recyclerview.widget.j0) r9
            java.lang.Object r7 = r1.h(r5)
            androidx.recyclerview.widget.r0 r7 = (androidx.recyclerview.widget.r0) r7
            int r8 = r7.f8510a
            r10 = r8 & 3
            r11 = 3
            if (r10 != r11) goto L_0x0204
            r8 = r2
            androidx.recyclerview.widget.D r8 = (androidx.recyclerview.widget.D) r8
            androidx.recyclerview.widget.RecyclerView r8 = r8.f8270a
            androidx.recyclerview.widget.Q r10 = r8.mLayout
            android.view.View r9 = r9.itemView
            androidx.recyclerview.widget.Z r8 = r8.mRecycler
            r10.x0(r9, r8)
            goto L_0x02b6
        L_0x0204:
            r10 = r8 & 1
            if (r10 == 0) goto L_0x022d
            androidx.recyclerview.widget.L r8 = r7.f8511b
            if (r8 != 0) goto L_0x021c
            r8 = r2
            androidx.recyclerview.widget.D r8 = (androidx.recyclerview.widget.D) r8
            androidx.recyclerview.widget.RecyclerView r8 = r8.f8270a
            androidx.recyclerview.widget.Q r10 = r8.mLayout
            android.view.View r9 = r9.itemView
            androidx.recyclerview.widget.Z r8 = r8.mRecycler
            r10.x0(r9, r8)
            goto L_0x02b6
        L_0x021c:
            androidx.recyclerview.widget.L r10 = r7.f8512c
            r11 = r2
            androidx.recyclerview.widget.D r11 = (androidx.recyclerview.widget.D) r11
            androidx.recyclerview.widget.RecyclerView r11 = r11.f8270a
            androidx.recyclerview.widget.Z r12 = r11.mRecycler
            r12.m(r9)
            r11.animateDisappearance(r9, r8, r10)
            goto L_0x02b6
        L_0x022d:
            r10 = r8 & 14
            r11 = 14
            if (r10 != r11) goto L_0x0241
            androidx.recyclerview.widget.L r8 = r7.f8511b
            androidx.recyclerview.widget.L r10 = r7.f8512c
            r11 = r2
            androidx.recyclerview.widget.D r11 = (androidx.recyclerview.widget.D) r11
            androidx.recyclerview.widget.RecyclerView r11 = r11.f8270a
            r11.animateAppearance(r9, r8, r10)
            goto L_0x02b6
        L_0x0241:
            r10 = r8 & 12
            r11 = 12
            if (r10 != r11) goto L_0x0292
            androidx.recyclerview.widget.L r8 = r7.f8511b
            androidx.recyclerview.widget.L r10 = r7.f8512c
            r11 = r2
            androidx.recyclerview.widget.D r11 = (androidx.recyclerview.widget.D) r11
            r11.getClass()
            r9.setIsRecyclable(r3)
            androidx.recyclerview.widget.RecyclerView r14 = r11.f8270a
            boolean r11 = r14.mDataSetHasChangedAfterLayout
            if (r11 == 0) goto L_0x0266
            androidx.recyclerview.widget.M r11 = r14.mItemAnimator
            boolean r8 = r11.a(r9, r9, r8, r10)
            if (r8 == 0) goto L_0x02b6
            r14.postAnimationRunner()
            goto L_0x02b6
        L_0x0266:
            androidx.recyclerview.widget.M r11 = r14.mItemAnimator
            androidx.recyclerview.widget.j r11 = (androidx.recyclerview.widget.C0499j) r11
            r11.getClass()
            int r12 = r8.f8281a
            int r13 = r10.f8281a
            if (r12 != r13) goto L_0x027f
            int r15 = r8.f8282b
            int r4 = r10.f8282b
            if (r15 == r4) goto L_0x027a
            goto L_0x027f
        L_0x027a:
            r11.c(r9)
            r4 = 0
            goto L_0x028c
        L_0x027f:
            int r4 = r8.f8282b
            int r15 = r10.f8282b
            r8 = r11
            r10 = r12
            r11 = r4
            r12 = r13
            r13 = r15
            boolean r4 = r8.g(r9, r10, r11, r12, r13)
        L_0x028c:
            if (r4 == 0) goto L_0x02b6
            r14.postAnimationRunner()
            goto L_0x02b6
        L_0x0292:
            r4 = r8 & 4
            if (r4 == 0) goto L_0x02a6
            androidx.recyclerview.widget.L r4 = r7.f8511b
            r8 = r2
            androidx.recyclerview.widget.D r8 = (androidx.recyclerview.widget.D) r8
            androidx.recyclerview.widget.RecyclerView r8 = r8.f8270a
            androidx.recyclerview.widget.Z r10 = r8.mRecycler
            r10.m(r9)
            r8.animateDisappearance(r9, r4, r6)
            goto L_0x02b6
        L_0x02a6:
            r4 = r8 & 8
            if (r4 == 0) goto L_0x02b6
            androidx.recyclerview.widget.L r4 = r7.f8511b
            androidx.recyclerview.widget.L r8 = r7.f8512c
            r10 = r2
            androidx.recyclerview.widget.D r10 = (androidx.recyclerview.widget.D) r10
            androidx.recyclerview.widget.RecyclerView r10 = r10.f8270a
            r10.animateAppearance(r9, r4, r8)
        L_0x02b6:
            r7.f8510a = r3
            r7.f8511b = r6
            r7.f8512c = r6
            c0.f r4 = androidx.recyclerview.widget.r0.f8509d
            r4.c(r7)
            int r5 = r5 + -1
            r4 = 1
            goto L_0x01de
        L_0x02c6:
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            androidx.recyclerview.widget.Z r2 = r0.mRecycler
            r1.w0(r2)
            androidx.recyclerview.widget.f0 r1 = r0.mState
            int r2 = r1.e
            r1.f8396b = r2
            r0.mDataSetHasChangedAfterLayout = r3
            r0.mDispatchItemsChangedEvent = r3
            r1.f8402j = r3
            r1.f8403k = r3
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            r1.f8313Z = r3
            androidx.recyclerview.widget.Z r1 = r0.mRecycler
            java.util.ArrayList r1 = r1.f8356b
            if (r1 == 0) goto L_0x02e8
            r1.clear()
        L_0x02e8:
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            boolean r2 = r1.f8318e0
            if (r2 == 0) goto L_0x02f7
            r1.f8317d0 = r3
            r1.f8318e0 = r3
            androidx.recyclerview.widget.Z r1 = r0.mRecycler
            r1.n()
        L_0x02f7:
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            androidx.recyclerview.widget.f0 r2 = r0.mState
            r1.q0(r2)
            r17.onExitLayoutOrScroll()
            r0.stopInterceptRequestLayout(r3)
            androidx.recyclerview.widget.t0 r1 = r0.mViewInfoStore
            Y.i r2 = r1.f8521a
            r2.clear()
            Y.g r1 = r1.f8522b
            r1.b()
            int[] r1 = r0.mMinMaxLayoutPositions
            r2 = r1[r3]
            r4 = 1
            r5 = r1[r4]
            r0.g(r1)
            int[] r1 = r0.mMinMaxLayoutPositions
            r7 = r1[r3]
            if (r7 != r2) goto L_0x0327
            r1 = r1[r4]
            if (r1 == r5) goto L_0x0325
            goto L_0x0327
        L_0x0325:
            r4 = 0
            goto L_0x0328
        L_0x0327:
            r4 = 1
        L_0x0328:
            if (r4 == 0) goto L_0x032d
            r0.dispatchOnScrolled(r3, r3)
        L_0x032d:
            boolean r1 = r0.mPreserveFocusAfterLayout
            r4 = -1
            r2 = -1
            if (r1 == 0) goto L_0x0420
            androidx.recyclerview.widget.F r1 = r0.mAdapter
            if (r1 == 0) goto L_0x0420
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0420
            int r1 = r17.getDescendantFocusability()
            r7 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r7) goto L_0x0420
            int r1 = r17.getDescendantFocusability()
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r7) goto L_0x0356
            boolean r1 = r17.isFocused()
            if (r1 == 0) goto L_0x0356
            goto L_0x0420
        L_0x0356:
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x0389
            android.view.View r1 = r17.getFocusedChild()
            boolean r7 = IGNORE_DETACHED_FOCUSED_CHILD
            if (r7 == 0) goto L_0x037d
            android.view.ViewParent r7 = r1.getParent()
            if (r7 == 0) goto L_0x0370
            boolean r7 = r1.hasFocus()
            if (r7 != 0) goto L_0x037d
        L_0x0370:
            androidx.recyclerview.widget.c r1 = r0.mChildHelper
            int r1 = r1.e()
            if (r1 != 0) goto L_0x0389
            r17.requestFocus()
            goto L_0x0420
        L_0x037d:
            androidx.recyclerview.widget.c r7 = r0.mChildHelper
            java.util.ArrayList r7 = r7.f8374c
            boolean r1 = r7.contains(r1)
            if (r1 != 0) goto L_0x0389
            goto L_0x0420
        L_0x0389:
            androidx.recyclerview.widget.f0 r1 = r0.mState
            long r7 = r1.f8405m
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x03a2
            androidx.recyclerview.widget.F r1 = r0.mAdapter
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L_0x03a2
            androidx.recyclerview.widget.f0 r1 = r0.mState
            long r7 = r1.f8405m
            androidx.recyclerview.widget.j0 r1 = r0.findViewHolderForItemId(r7)
            goto L_0x03a3
        L_0x03a2:
            r1 = r6
        L_0x03a3:
            if (r1 == 0) goto L_0x03bd
            androidx.recyclerview.widget.c r7 = r0.mChildHelper
            android.view.View r8 = r1.itemView
            java.util.ArrayList r7 = r7.f8374c
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x03bd
            android.view.View r7 = r1.itemView
            boolean r7 = r7.hasFocusable()
            if (r7 != 0) goto L_0x03ba
            goto L_0x03bd
        L_0x03ba:
            android.view.View r6 = r1.itemView
            goto L_0x0405
        L_0x03bd:
            androidx.recyclerview.widget.c r1 = r0.mChildHelper
            int r1 = r1.e()
            if (r1 <= 0) goto L_0x0405
            androidx.recyclerview.widget.f0 r1 = r0.mState
            int r7 = r1.f8404l
            if (r7 == r2) goto L_0x03cc
            r3 = r7
        L_0x03cc:
            int r1 = r1.b()
            r7 = r3
        L_0x03d1:
            if (r7 >= r1) goto L_0x03e8
            androidx.recyclerview.widget.j0 r8 = r0.findViewHolderForAdapterPosition(r7)
            if (r8 != 0) goto L_0x03da
            goto L_0x03e8
        L_0x03da:
            android.view.View r9 = r8.itemView
            boolean r9 = r9.hasFocusable()
            if (r9 == 0) goto L_0x03e5
            android.view.View r6 = r8.itemView
            goto L_0x0405
        L_0x03e5:
            int r7 = r7 + 1
            goto L_0x03d1
        L_0x03e8:
            int r1 = java.lang.Math.min(r1, r3)
            r3 = 1
            int r1 = r1 - r3
        L_0x03ee:
            if (r1 < 0) goto L_0x0405
            androidx.recyclerview.widget.j0 r3 = r0.findViewHolderForAdapterPosition(r1)
            if (r3 != 0) goto L_0x03f7
            goto L_0x0405
        L_0x03f7:
            android.view.View r7 = r3.itemView
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x0402
            android.view.View r6 = r3.itemView
            goto L_0x0405
        L_0x0402:
            int r1 = r1 + -1
            goto L_0x03ee
        L_0x0405:
            if (r6 == 0) goto L_0x0420
            androidx.recyclerview.widget.f0 r1 = r0.mState
            int r1 = r1.f8406n
            long r7 = (long) r1
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x041d
            android.view.View r1 = r6.findViewById(r1)
            if (r1 == 0) goto L_0x041d
            boolean r3 = r1.isFocusable()
            if (r3 == 0) goto L_0x041d
            r6 = r1
        L_0x041d:
            r6.requestFocus()
        L_0x0420:
            androidx.recyclerview.widget.f0 r1 = r0.mState
            r1.f8405m = r4
            r1.f8404l = r2
            r1.f8406n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchLayout():void");
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean z) {
        return getScrollingChildHelper().a(f8, f9, z);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        return getScrollingChildHelper().b(f8, f9);
    }

    public boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i8, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i, i8, i9, i10, iArr, 0, (int[]) null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.t0(i);
        }
        onScrollStateChanged(i);
        W w2 = this.mScrollListener;
        if (w2 != null) {
            w2.onScrollStateChanged(this, i);
        }
        List<W> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i8) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i8);
        onScrolled(i, i8);
        W w2 = this.mScrollListener;
        if (w2 != null) {
            w2.onScrolled(this, i, i8);
        }
        List<W> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i8);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            j0 j0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (j0Var.itemView.getParent() == this && !j0Var.shouldIgnore() && (i = j0Var.mPendingAccessibilityState) != -1) {
                View view = j0Var.itemView;
                WeakHashMap weakHashMap = C1510H.f15874a;
                view.setImportantForAccessibility(i);
                j0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z6;
        boolean z8;
        int i8;
        boolean z9 = true;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z10 = false;
        for (int i9 = 0; i9 < size; i9++) {
            this.mItemDecorations.get(i9).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i8 = getPaddingBottom();
            } else {
                i8 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i8), DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z8 = false;
            } else {
                z8 = true;
            }
            z |= z8;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z6 = false;
            } else {
                z6 = true;
            }
            z |= z6;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z |= z10;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) {
            z9 = z;
        }
        if (z9) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public final void e() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.f8397c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f8376W;
            if (parcelable != null) {
                this.mLayout.r0(parcelable);
            }
            this.mPendingSavedState = null;
        }
        f0 f0Var = this.mState;
        f0Var.f8400g = false;
        this.mLayout.p0(this.mRecycler, f0Var);
        f0 f0Var2 = this.mState;
        f0Var2.f8399f = false;
        if (!f0Var2.f8402j || this.mItemAnimator == null) {
            z = false;
        } else {
            z = true;
        }
        f0Var2.f8402j = z;
        f0Var2.f8398d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            ((g0) this.mEdgeEffectFactory).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mBottomGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            ((g0) this.mEdgeEffectFactory).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mLeftGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            ((g0) this.mEdgeEffectFactory).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mRightGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            ((g0) this.mEdgeEffectFactory).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mTopGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            V v4 = this.mOnItemTouchListeners.get(i);
            if (!v4.onInterceptTouchEvent(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = v4;
                return true;
            }
        }
        return false;
    }

    public final void fillRemainingScrollValues(f0 f0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f8422W;
            overScroller.getFinalX();
            overScroller.getCurrX();
            f0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        f0Var.getClass();
    }

    public View findChildViewUnder(float f8, float f9) {
        for (int e = this.mChildHelper.e() - 1; e >= 0; e--) {
            View d8 = this.mChildHelper.d(e);
            float translationX = d8.getTranslationX();
            float translationY = d8.getTranslationY();
            if (f8 >= ((float) d8.getLeft()) + translationX && f8 <= ((float) d8.getRight()) + translationX && f9 >= ((float) d8.getTop()) + translationY && f9 <= ((float) d8.getBottom()) + translationY) {
                return d8;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public j0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public j0 findViewHolderForAdapterPosition(int i) {
        j0 j0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h5 = this.mChildHelper.h();
        for (int i8 = 0; i8 < h5; i8++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i8));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                C0492c cVar = this.mChildHelper;
                if (!cVar.f8374c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                j0Var = childViewHolderInt;
            }
        }
        return j0Var;
    }

    public j0 findViewHolderForItemId(long j7) {
        F f8 = this.mAdapter;
        j0 j0Var = null;
        if (f8 != null && f8.hasStableIds()) {
            int h5 = this.mChildHelper.h();
            for (int i = 0; i < h5; i++) {
                j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j7) {
                    C0492c cVar = this.mChildHelper;
                    if (!cVar.f8374c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    j0Var = childViewHolderInt;
                }
            }
        }
        return j0Var;
    }

    public j0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public j0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01fb, code lost:
        if (r2 < r14) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            androidx.recyclerview.widget.Q r1 = r0.mLayout
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r3 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r3)
            return r2
        L_0x000f:
            boolean r3 = r0.mLayoutSuppressed
            if (r3 == 0) goto L_0x0014
            return r2
        L_0x0014:
            boolean r1 = r1.o()
            androidx.recyclerview.widget.Q r3 = r0.mLayout
            boolean r3 = r3.p()
            if (r1 == 0) goto L_0x002c
            int r4 = java.lang.Math.abs(r20)
            int r5 = r0.mMinFlingVelocity
            if (r4 >= r5) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r4 = r20
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x003b
            int r5 = java.lang.Math.abs(r21)
            int r6 = r0.mMinFlingVelocity
            if (r5 >= r6) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r5 = r21
            goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            if (r4 != 0) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            return r2
        L_0x0041:
            r6 = 0
            if (r4 == 0) goto L_0x0084
            android.widget.EdgeEffect r7 = r0.mLeftGlow
            if (r7 == 0) goto L_0x0066
            float r7 = E.e.n(r7)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x0066
            android.widget.EdgeEffect r7 = r0.mLeftGlow
            int r8 = -r4
            int r9 = r19.getWidth()
            boolean r7 = r0.p(r7, r8, r9)
            if (r7 == 0) goto L_0x0063
            android.widget.EdgeEffect r4 = r0.mLeftGlow
            r4.onAbsorb(r8)
        L_0x0062:
            r4 = 0
        L_0x0063:
            r7 = r4
            r4 = 0
            goto L_0x0085
        L_0x0066:
            android.widget.EdgeEffect r7 = r0.mRightGlow
            if (r7 == 0) goto L_0x0084
            float r7 = E.e.n(r7)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x0084
            android.widget.EdgeEffect r7 = r0.mRightGlow
            int r8 = r19.getWidth()
            boolean r7 = r0.p(r7, r4, r8)
            if (r7 == 0) goto L_0x0063
            android.widget.EdgeEffect r7 = r0.mRightGlow
            r7.onAbsorb(r4)
            goto L_0x0062
        L_0x0084:
            r7 = 0
        L_0x0085:
            if (r5 == 0) goto L_0x00c6
            android.widget.EdgeEffect r8 = r0.mTopGlow
            if (r8 == 0) goto L_0x00a8
            float r8 = E.e.n(r8)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00a8
            android.widget.EdgeEffect r8 = r0.mTopGlow
            int r9 = -r5
            int r10 = r19.getHeight()
            boolean r8 = r0.p(r8, r9, r10)
            if (r8 == 0) goto L_0x00a6
            android.widget.EdgeEffect r5 = r0.mTopGlow
            r5.onAbsorb(r9)
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            r8 = 0
            goto L_0x00c8
        L_0x00a8:
            android.widget.EdgeEffect r8 = r0.mBottomGlow
            if (r8 == 0) goto L_0x00c6
            float r8 = E.e.n(r8)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00c6
            android.widget.EdgeEffect r8 = r0.mBottomGlow
            int r9 = r19.getHeight()
            boolean r8 = r0.p(r8, r5, r9)
            if (r8 == 0) goto L_0x00a6
            android.widget.EdgeEffect r8 = r0.mBottomGlow
            r8.onAbsorb(r5)
            goto L_0x00a5
        L_0x00c6:
            r8 = r5
            r5 = 0
        L_0x00c8:
            if (r7 != 0) goto L_0x00cc
            if (r5 == 0) goto L_0x00e7
        L_0x00cc:
            int r9 = r0.mMaxFlingVelocity
            int r10 = -r9
            int r7 = java.lang.Math.min(r7, r9)
            int r7 = java.lang.Math.max(r10, r7)
            int r9 = r0.mMaxFlingVelocity
            int r10 = -r9
            int r5 = java.lang.Math.min(r5, r9)
            int r5 = java.lang.Math.max(r10, r5)
            androidx.recyclerview.widget.i0 r9 = r0.mViewFlinger
            r9.a(r7, r5)
        L_0x00e7:
            if (r4 != 0) goto L_0x00f1
            if (r8 != 0) goto L_0x00f1
            if (r7 != 0) goto L_0x00ef
            if (r5 == 0) goto L_0x00f0
        L_0x00ef:
            r2 = 1
        L_0x00f0:
            return r2
        L_0x00f1:
            float r5 = (float) r4
            float r7 = (float) r8
            boolean r10 = r0.dispatchNestedPreFling(r5, r7)
            if (r10 != 0) goto L_0x022f
            if (r1 != 0) goto L_0x0100
            if (r3 == 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            r10 = 0
            goto L_0x0101
        L_0x0100:
            r10 = 1
        L_0x0101:
            r0.dispatchNestedFling(r5, r7, r10)
            androidx.recyclerview.widget.U r5 = r0.mOnFlingListener
            if (r5 == 0) goto L_0x0201
            androidx.recyclerview.widget.B r5 = (androidx.recyclerview.widget.B) r5
            androidx.recyclerview.widget.RecyclerView r7 = r5.f8264a
            androidx.recyclerview.widget.Q r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0114
            goto L_0x0201
        L_0x0114:
            androidx.recyclerview.widget.RecyclerView r11 = r5.f8264a
            androidx.recyclerview.widget.F r11 = r11.getAdapter()
            if (r11 != 0) goto L_0x011e
            goto L_0x0201
        L_0x011e:
            androidx.recyclerview.widget.RecyclerView r11 = r5.f8264a
            int r11 = r11.getMinFlingVelocity()
            int r12 = java.lang.Math.abs(r8)
            if (r12 > r11) goto L_0x0130
            int r12 = java.lang.Math.abs(r4)
            if (r12 <= r11) goto L_0x0201
        L_0x0130:
            boolean r11 = r7 instanceof androidx.recyclerview.widget.e0
            if (r11 != 0) goto L_0x0136
            goto L_0x0201
        L_0x0136:
            if (r11 != 0) goto L_0x013a
            r13 = 0
            goto L_0x0146
        L_0x013a:
            androidx.recyclerview.widget.A r13 = new androidx.recyclerview.widget.A
            androidx.recyclerview.widget.RecyclerView r14 = r5.f8264a
            android.content.Context r14 = r14.getContext()
            r15 = 0
            r13.<init>(r5, r14, r15)
        L_0x0146:
            if (r13 != 0) goto L_0x014a
            goto L_0x0201
        L_0x014a:
            int r14 = r7.Q()
            if (r14 != 0) goto L_0x0154
        L_0x0150:
            r2 = -1
        L_0x0151:
            r5 = -1
            goto L_0x01ff
        L_0x0154:
            boolean r16 = r7.p()
            if (r16 == 0) goto L_0x015f
            androidx.emoji2.text.f r5 = r5.e(r7)
            goto L_0x016b
        L_0x015f:
            boolean r16 = r7.o()
            if (r16 == 0) goto L_0x016a
            androidx.emoji2.text.f r5 = r5.d(r7)
            goto L_0x016b
        L_0x016a:
            r5 = 0
        L_0x016b:
            if (r5 != 0) goto L_0x016e
            goto L_0x0150
        L_0x016e:
            int r12 = r7.G()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r15 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
            r17 = 0
        L_0x0181:
            if (r6 >= r12) goto L_0x01a5
            android.view.View r9 = r7.F(r6)
            if (r9 != 0) goto L_0x018c
            r18 = r12
            goto L_0x01a0
        L_0x018c:
            r18 = r12
            int r12 = androidx.recyclerview.widget.B.b(r9, r5)
            if (r12 > 0) goto L_0x0199
            if (r12 <= r2) goto L_0x0199
            r17 = r9
            r2 = r12
        L_0x0199:
            if (r12 < 0) goto L_0x01a0
            if (r12 >= r15) goto L_0x01a0
            r16 = r9
            r15 = r12
        L_0x01a0:
            int r6 = r6 + 1
            r12 = r18
            goto L_0x0181
        L_0x01a5:
            boolean r2 = r7.o()
            if (r2 == 0) goto L_0x01b1
            if (r4 <= 0) goto L_0x01af
        L_0x01ad:
            r2 = 1
            goto L_0x01b4
        L_0x01af:
            r2 = 0
            goto L_0x01b4
        L_0x01b1:
            if (r8 <= 0) goto L_0x01af
            goto L_0x01ad
        L_0x01b4:
            if (r2 == 0) goto L_0x01bd
            if (r16 == 0) goto L_0x01bd
            int r2 = androidx.recyclerview.widget.Q.S(r16)
            goto L_0x0151
        L_0x01bd:
            if (r2 != 0) goto L_0x01c6
            if (r17 == 0) goto L_0x01c6
            int r2 = androidx.recyclerview.widget.Q.S(r17)
            goto L_0x0151
        L_0x01c6:
            if (r2 == 0) goto L_0x01ca
            r16 = r17
        L_0x01ca:
            if (r16 != 0) goto L_0x01cd
            goto L_0x0150
        L_0x01cd:
            int r5 = androidx.recyclerview.widget.Q.S(r16)
            int r6 = r7.Q()
            if (r11 == 0) goto L_0x01f1
            r9 = r7
            androidx.recyclerview.widget.e0 r9 = (androidx.recyclerview.widget.e0) r9
            r11 = 1
            int r6 = r6 - r11
            android.graphics.PointF r6 = r9.e(r6)
            if (r6 == 0) goto L_0x01f1
            float r9 = r6.x
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x01ef
            float r6 = r6.y
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x01f1
        L_0x01ef:
            r11 = 1
            goto L_0x01f2
        L_0x01f1:
            r11 = 0
        L_0x01f2:
            if (r11 != r2) goto L_0x01f6
            r11 = -1
            goto L_0x01f7
        L_0x01f6:
            r11 = 1
        L_0x01f7:
            int r2 = r5 + r11
            if (r2 < 0) goto L_0x0150
            if (r2 < r14) goto L_0x0151
            goto L_0x0150
        L_0x01ff:
            if (r2 != r5) goto L_0x0203
        L_0x0201:
            r2 = 1
            goto L_0x020a
        L_0x0203:
            r13.f8547a = r2
            r7.M0(r13)
            r2 = 1
            return r2
        L_0x020a:
            if (r10 == 0) goto L_0x022f
            if (r3 == 0) goto L_0x0210
            r1 = r1 | 2
        L_0x0210:
            r0.startNestedScroll(r1, r2)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r1 = java.lang.Math.max(r3, r1)
            int r3 = r0.mMaxFlingVelocity
            int r4 = -r3
            int r3 = java.lang.Math.min(r8, r3)
            int r3 = java.lang.Math.max(r4, r3)
            androidx.recyclerview.widget.i0 r4 = r0.mViewFlinger
            r4.a(r1, r3)
            return r2
        L_0x022f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        int i8;
        int i9;
        char c8;
        boolean z6;
        boolean z8;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        View view3 = view;
        int i12 = i;
        this.mLayout.getClass();
        if (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z || !(i12 == 2 || i12 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view3, i12);
            if (findNextFocus != null || !z) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.e0(view3, i12, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.p()) {
                if (i12 == 2) {
                    i11 = 130;
                } else {
                    i11 = 33;
                }
                if (instance.findNextFocus(this, view3, i11) == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i12 = i11;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.mLayout.o()) {
                if (this.mLayout.R() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i12 == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z8 ^ z9) {
                    i10 = 66;
                } else {
                    i10 = 17;
                }
                if (instance.findNextFocus(this, view3, i10) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i12 = i10;
                }
            }
            if (z6) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.e0(view3, i12, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view3, i12);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!(view2 == null || view2 == this || view2 == view3 || findContainingItemView(view2) == null)) {
                if (view3 == null || findContainingItemView(view) == null) {
                    return view2;
                }
                this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view3, this.mTempRect);
                offsetDescendantRectToMyCoords(view2, this.mTempRect2);
                if (this.mLayout.R() == 1) {
                    i8 = -1;
                } else {
                    i8 = 1;
                }
                Rect rect = this.mTempRect;
                int i13 = rect.left;
                Rect rect2 = this.mTempRect2;
                int i14 = rect2.left;
                if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                    i9 = 1;
                } else {
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    if ((i15 > i16 || i13 >= i16) && i13 > i14) {
                        i9 = -1;
                    } else {
                        i9 = 0;
                    }
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                    c8 = 1;
                } else {
                    int i19 = rect.bottom;
                    int i20 = rect2.bottom;
                    if ((i19 > i20 || i17 >= i20) && i17 > i18) {
                        c8 = 65535;
                    } else {
                        c8 = 0;
                    }
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 17) {
                            if (i12 != 33) {
                                if (i12 != 66) {
                                    if (i12 != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i12);
                                        throw new IllegalArgumentException(g.n(this, sb));
                                    } else if (c8 > 0) {
                                        return view2;
                                    }
                                } else if (i9 > 0) {
                                    return view2;
                                }
                            } else if (c8 < 0) {
                                return view2;
                            }
                        } else if (i9 < 0) {
                            return view2;
                        }
                    } else if (c8 > 0) {
                        return view2;
                    } else {
                        if (c8 == 0 && i9 * i8 > 0) {
                            return view2;
                        }
                    }
                } else if (c8 < 0) {
                    return view2;
                } else {
                    if (c8 == 0 && i9 * i8 < 0) {
                        return view2;
                    }
                }
            }
            return super.focusSearch(view3, i12);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view3, i12);
        } else {
            m(view2, (View) null);
            return view3;
        }
    }

    public final void g(int[] iArr) {
        int e = this.mChildHelper.e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i8 = UNDEFINED_DURATION;
        for (int i9 = 0; i9 < e; i9++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i8) {
                    i8 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i8;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Q q7 = this.mLayout;
        if (q7 != null) {
            return q7.C();
        }
        throw new IllegalStateException(g.n(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Q q7 = this.mLayout;
        if (q7 != null) {
            return q7.D(getContext(), attributeSet);
        }
        throw new IllegalStateException(g.n(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public F getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(j0 j0Var) {
        if (j0Var.hasAnyOfTheFlags(524) || !j0Var.isBound()) {
            return -1;
        }
        C0491b bVar = this.mAdapterHelper;
        int i = j0Var.mPosition;
        ArrayList arrayList = bVar.f8367b;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0490a aVar = (C0490a) arrayList.get(i8);
            int i9 = aVar.f8362a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = aVar.f8363b;
                    if (i10 <= i) {
                        int i11 = aVar.f8365d;
                        if (i10 + i11 > i) {
                            return -1;
                        }
                        i -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = aVar.f8363b;
                    if (i12 == i) {
                        i = aVar.f8365d;
                    } else {
                        if (i12 < i) {
                            i--;
                        }
                        if (aVar.f8365d <= i) {
                            i++;
                        }
                    }
                }
            } else if (aVar.f8363b <= i) {
                i += aVar.f8365d;
            }
        }
        return i;
    }

    public int getBaseline() {
        Q q7 = this.mLayout;
        if (q7 == null) {
            return super.getBaseline();
        }
        q7.getClass();
        return -1;
    }

    public long getChangedHolderKey(j0 j0Var) {
        if (this.mAdapter.hasStableIds()) {
            return j0Var.getItemId();
        }
        return (long) j0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        j0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildDrawingOrder(int i, int i8) {
        return super.getChildDrawingOrder(i, i8);
    }

    public long getChildItemId(View view) {
        j0 childViewHolderInt;
        F f8 = this.mAdapter;
        if (f8 == null || !f8.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        j0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public j0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public l0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public J getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public M getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        S s8 = (S) view.getLayoutParams();
        boolean z = s8.f8325W;
        Rect rect = s8.f8324V;
        if (!z) {
            return rect;
        }
        if (this.mState.f8400g && (s8.f8323U.isUpdated() || s8.f8323U.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i8 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i8 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        s8.f8325W = false;
        return rect;
    }

    public N getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public Q getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public U getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public Y getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public final void h(int i, int i8, MotionEvent motionEvent) {
        boolean z;
        float f8;
        float f9;
        int i9;
        int i10;
        int i11;
        Q q7 = this.mLayout;
        if (q7 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int[] iArr = this.mReusableIntPair;
            int i12 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean o2 = q7.o();
            boolean p3 = this.mLayout.p();
            if (p3) {
                z = o2 | true;
            } else {
                z = o2;
            }
            if (motionEvent == null) {
                f8 = ((float) getHeight()) / 2.0f;
            } else {
                f8 = motionEvent.getY();
            }
            if (motionEvent == null) {
                f9 = ((float) getWidth()) / 2.0f;
            } else {
                f9 = motionEvent.getX();
            }
            int k8 = i - k(i, f8);
            int l8 = i8 - l(i8, f9);
            startNestedScroll(z ? 1 : 0, 1);
            if (o2) {
                i9 = k8;
            } else {
                i9 = 0;
            }
            if (p3) {
                i10 = l8;
            } else {
                i10 = 0;
            }
            if (dispatchNestedPreScroll(i9, i10, this.mReusableIntPair, this.mScrollOffset, 1)) {
                int[] iArr2 = this.mReusableIntPair;
                k8 -= iArr2[0];
                l8 -= iArr2[1];
            }
            if (o2) {
                i11 = k8;
            } else {
                i11 = 0;
            }
            if (p3) {
                i12 = l8;
            }
            scrollByInternal(i11, i12, motionEvent, 1);
            C0507s sVar = this.mGapWorker;
            if (!(sVar == null || (k8 == 0 && l8 == 0))) {
                sVar.a(this, k8, l8);
            }
            stopNestedScroll(1);
        }
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g()) {
            return true;
        }
        return false;
    }

    public final void i(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x8 = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x8;
            this.mInitialTouchX = x8;
            int y8 = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y8;
            this.mInitialTouchY = y8;
        }
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0491b(new D(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(g.n(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C0505p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            Q q7 = this.mLayout;
            if (q7 != null) {
                q7.m("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isAnimating() {
        M m8 = this.mItemAnimator;
        if (m8 == null || !m8.f()) {
            return false;
        }
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f15957d;
    }

    public final void j() {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C0491b bVar = this.mAdapterHelper;
            bVar.k(bVar.f8367b);
            bVar.k(bVar.f8368c);
            bVar.f8370f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.k0();
            }
        }
        if (this.mItemAnimator == null || !this.mLayout.N0()) {
            this.mAdapterHelper.c();
        } else {
            this.mAdapterHelper.j();
        }
        if (this.mItemsAddedOrRemoved || this.mItemsChanged) {
            z = true;
        } else {
            z = false;
        }
        f0 f0Var = this.mState;
        if (!this.mFirstLayoutComplete || this.mItemAnimator == null || ((!(z8 = this.mDataSetHasChangedAfterLayout) && !z && !this.mLayout.f8313Z) || (z8 && !this.mAdapter.hasStableIds()))) {
            z6 = false;
        } else {
            z6 = true;
        }
        f0Var.f8402j = z6;
        f0 f0Var2 = this.mState;
        if (f0Var2.f8402j && z && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.N0()) {
            z9 = true;
        }
        f0Var2.f8403k = z9;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.B0(i);
            awakenScrollBars();
        }
    }

    public final int k(int i, float f8) {
        float height = f8 / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f9 = DECELERATION_RATE;
        if (edgeEffect == null || e.n(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (!(edgeEffect2 == null || e.n(edgeEffect2) == DECELERATION_RATE)) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float s8 = e.s(this.mRightGlow, width, height);
                    if (e.n(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f9 = s8;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f10 = -e.s(this.mLeftGlow, -width, 1.0f - height);
                if (e.n(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        }
        return Math.round(f9 * ((float) getWidth()));
    }

    public final int l(int i, float f8) {
        float width = f8 / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect = this.mTopGlow;
        float f9 = DECELERATION_RATE;
        if (edgeEffect == null || e.n(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (!(edgeEffect2 == null || e.n(edgeEffect2) == DECELERATION_RATE)) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float s8 = e.s(this.mBottomGlow, height, 1.0f - width);
                    if (e.n(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f9 = s8;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f10 = -e.s(this.mTopGlow, -height, width);
                if (e.n(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        }
        return Math.round(f9 * ((float) getHeight()));
    }

    public final void m(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof S) {
            S s8 = (S) layoutParams;
            if (!s8.f8325W) {
                Rect rect = this.mTempRect;
                int i = rect.left;
                Rect rect2 = s8.f8324V;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        Q q7 = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z6 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        q7.y0(this, view, rect3, z6, z);
    }

    public void markItemDecorInsetsDirty() {
        int h5 = this.mChildHelper.h();
        for (int i = 0; i < h5; i++) {
            ((S) this.mChildHelper.g(i).getLayoutParams()).f8325W = true;
        }
        ArrayList arrayList = this.mRecycler.f8357c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            S s8 = (S) ((j0) arrayList.get(i8)).itemView.getLayoutParams();
            if (s8 != null) {
                s8.f8325W = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h5 = this.mChildHelper.h();
        for (int i = 0; i < h5; i++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        Z z = this.mRecycler;
        ArrayList arrayList = z.f8357c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j0 j0Var = (j0) arrayList.get(i8);
            if (j0Var != null) {
                j0Var.addFlags(6);
                j0Var.addChangePayload((Object) null);
            }
        }
        F f8 = z.f8361h.mAdapter;
        if (f8 == null || !f8.hasStableIds()) {
            z.g();
        }
    }

    public final void n() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            postInvalidateOnAnimation();
        }
    }

    public void nestedScrollBy(int i, int i8) {
        h(i, i8, (MotionEvent) null);
    }

    public final void o(F f8, boolean z, boolean z6) {
        F f9 = this.mAdapter;
        if (f9 != null) {
            f9.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z6) {
            removeAndRecycleViews();
        }
        C0491b bVar = this.mAdapterHelper;
        bVar.k(bVar.f8367b);
        bVar.k(bVar.f8368c);
        int i = 0;
        bVar.f8370f = 0;
        F f10 = this.mAdapter;
        this.mAdapter = f8;
        if (f8 != null) {
            f8.registerAdapterDataObserver(this.mObserver);
            f8.onAttachedToRecyclerView(this);
        }
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.b0();
        }
        Z z8 = this.mRecycler;
        F f11 = this.mAdapter;
        z8.f8355a.clear();
        z8.g();
        z8.f(f10, true);
        Y c8 = z8.c();
        if (f10 != null) {
            c8.f8353b--;
        }
        if (!z && c8.f8353b == 0) {
            while (true) {
                SparseArray sparseArray = c8.f8352a;
                if (i >= sparseArray.size()) {
                    break;
                }
                X x8 = (X) sparseArray.valueAt(i);
                Iterator it = x8.f8348a.iterator();
                while (it.hasNext()) {
                    C0003d.d(((j0) it.next()).itemView);
                }
                x8.f8348a.clear();
                i++;
            }
        }
        if (f11 != null) {
            c8.f8353b++;
        } else {
            c8.getClass();
        }
        z8.e();
        this.mState.f8399f = true;
    }

    public void offsetChildrenHorizontal(int i) {
        int e = this.mChildHelper.e();
        for (int i8 = 0; i8 < e; i8++) {
            this.mChildHelper.d(i8).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int e = this.mChildHelper.e();
        for (int i8 = 0; i8 < e; i8++) {
            this.mChildHelper.d(i8).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i8) {
        int h5 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h5; i9++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i9 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i8));
                }
                childViewHolderInt.offsetPosition(i8, false);
                this.mState.f8399f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f8357c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = (j0) arrayList.get(i10);
            if (j0Var != null && j0Var.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i10 + " holder " + j0Var + " now at position " + (j0Var.mPosition + i8));
                }
                j0Var.offsetPosition(i8, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int h5 = this.mChildHelper.h();
        int i16 = -1;
        if (i < i8) {
            i11 = i;
            i10 = i8;
            i9 = -1;
        } else {
            i10 = i;
            i11 = i8;
            i9 = 1;
        }
        for (int i17 = 0; i17 < h5; i17++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i17));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i11 && i15 <= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i17 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i8 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i9, false);
                }
                this.mState.f8399f = true;
            }
        }
        Z z = this.mRecycler;
        z.getClass();
        if (i < i8) {
            i13 = i;
            i12 = i8;
        } else {
            i12 = i;
            i13 = i8;
            i16 = 1;
        }
        ArrayList arrayList = z.f8357c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            j0 j0Var = (j0) arrayList.get(i18);
            if (j0Var != null && (i14 = j0Var.mPosition) >= i13 && i14 <= i12) {
                if (i14 == i) {
                    j0Var.offsetPosition(i8 - i, false);
                } else {
                    j0Var.offsetPosition(i16, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i18 + " holder " + j0Var);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i8, boolean z) {
        int i9 = i + i8;
        int h5 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h5; i10++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i11 = childViewHolderInt.mPosition;
                if (i11 >= i9) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i10 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i8));
                    }
                    childViewHolderInt.offsetPosition(-i8, z);
                    this.mState.f8399f = true;
                } else if (i11 >= i) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i10 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i8, z);
                    this.mState.f8399f = true;
                }
            }
        }
        Z z6 = this.mRecycler;
        ArrayList arrayList = z6.f8357c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null) {
                int i12 = j0Var.mPosition;
                if (i12 >= i9) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + j0Var + " now at position " + (j0Var.mPosition - i8));
                    }
                    j0Var.offsetPosition(-i8, z);
                } else if (i12 >= i) {
                    j0Var.addFlags(8);
                    z6.h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, androidx.recyclerview.widget.s] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r1 >= 30.0f) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r5.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.Z r2 = r5.mRecycler
            r2.e()
            androidx.recyclerview.widget.Q r2 = r5.mLayout
            if (r2 == 0) goto L_0x0026
            r2.f8314a0 = r1
            r2.c0(r5)
        L_0x0026:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x0091
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.C0507s.f8513Y
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.s r1 = (androidx.recyclerview.widget.C0507s) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L_0x0074
            androidx.recyclerview.widget.s r1 = new androidx.recyclerview.widget.s
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f8515U = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f8518X = r2
            r5.mGapWorker = r1
            java.util.WeakHashMap r1 = v0.C1510H.f15874a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0068:
            androidx.recyclerview.widget.s r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f8517W = r3
            r0.set(r2)
        L_0x0074:
            androidx.recyclerview.widget.s r0 = r5.mGapWorker
            r0.getClass()
            boolean r1 = sDebugAssertionsEnabled
            java.util.ArrayList r0 = r0.f8515U
            if (r1 == 0) goto L_0x008e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L_0x008e:
            r0.add(r5)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        C0507s sVar;
        super.onDetachedFromWindow();
        M m8 = this.mItemAnimator;
        if (m8 != null) {
            m8.e();
        }
        stopScroll();
        int i = 0;
        this.mIsAttached = false;
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.f8314a0 = false;
            q7.d0(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (r0.f8509d.a() != null);
        Z z = this.mRecycler;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = z.f8357c;
            if (i8 >= arrayList.size()) {
                break;
            }
            C0003d.d(((j0) arrayList.get(i8)).itemView);
            i8++;
        }
        z.f(z.f8361h.mAdapter, false);
        while (i < getChildCount()) {
            int i9 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                A0.a aVar = (A0.a) childAt.getTag(2131362386);
                if (aVar == null) {
                    aVar = new A0.a();
                    childAt.setTag(2131362386, aVar);
                }
                ArrayList arrayList2 = aVar.f23a;
                int K4 = j.K(arrayList2);
                if (-1 >= K4) {
                    i = i9;
                } else {
                    arrayList2.get(K4).getClass();
                    throw new ClassCastException();
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (ALLOW_THREAD_GAP_WORK && (sVar = this.mGapWorker) != null) {
            boolean remove = sVar.f8515U.remove(this);
            if (!sDebugAssertionsEnabled || remove) {
                this.mGapWorker = null;
                return;
            }
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f8;
        float f9;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.mLayout.p()) {
                    f9 = -motionEvent.getAxisValue(9);
                } else {
                    f9 = DECELERATION_RATE;
                }
                if (this.mLayout.o()) {
                    f8 = motionEvent.getAxisValue(10);
                    if (!(f9 == DECELERATION_RATE && f8 == DECELERATION_RATE)) {
                        h((int) (f8 * this.mScaledHorizontalScrollFactor), (int) (f9 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.p()) {
                        f9 = -axisValue;
                    } else if (this.mLayout.o()) {
                        f8 = axisValue;
                        f9 = DECELERATION_RATE;
                        h((int) (f8 * this.mScaledHorizontalScrollFactor), (int) (f9 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f9 = DECELERATION_RATE;
            }
            f8 = DECELERATION_RATE;
            h((int) (f8 * this.mScaledHorizontalScrollFactor), (int) (f9 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z6;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (f(motionEvent)) {
            n();
            setScrollState(0);
            return true;
        }
        Q q7 = this.mLayout;
        if (q7 == null) {
            return false;
        }
        boolean o2 = q7.o();
        boolean p3 = this.mLayout.p();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x8 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x8;
            this.mInitialTouchX = x8;
            int y8 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y8;
            this.mInitialTouchY = y8;
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || e.n(edgeEffect) == DECELERATION_RATE || canScrollHorizontally(-1)) {
                z = false;
            } else {
                e.s(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / ((float) getHeight())));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (!(edgeEffect2 == null || e.n(edgeEffect2) == DECELERATION_RATE || canScrollHorizontally(1))) {
                e.s(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / ((float) getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (!(edgeEffect3 == null || e.n(edgeEffect3) == DECELERATION_RATE || canScrollVertically(-1))) {
                e.s(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / ((float) getWidth()));
                z = true;
            }
            EdgeEffect edgeEffect4 = this.mBottomGlow;
            if (!(edgeEffect4 == null || e.n(edgeEffect4) == DECELERATION_RATE || canScrollVertically(1))) {
                e.s(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / ((float) getWidth())));
                z = true;
            }
            if (z || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (p3) {
                o2 |= true;
            }
            startNestedScroll(o2 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x9 - this.mInitialTouchX;
                int i8 = y9 - this.mInitialTouchY;
                if (!o2 || Math.abs(i) <= this.mTouchSlop) {
                    z6 = false;
                } else {
                    this.mLastTouchX = x9;
                    z6 = true;
                }
                if (p3 && Math.abs(i8) > this.mTouchSlop) {
                    this.mLastTouchY = y9;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            n();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        } else if (actionMasked == 6) {
            i(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11 = C1361h.f14708a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    public void onMeasure(int i, int i8) {
        Q q7 = this.mLayout;
        if (q7 == null) {
            defaultOnMeasure(i, i8);
            return;
        }
        boolean z = false;
        if (q7.W()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.mLayout.f8309V.defaultOnMeasure(i, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.f8398d == 1) {
                    d();
                }
                this.mLayout.E0(i, i8);
                this.mState.i = true;
                e();
                this.mLayout.G0(i, i8);
                if (this.mLayout.J0()) {
                    this.mLayout.E0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), b.MAX_POW2), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), b.MAX_POW2));
                    this.mState.i = true;
                    e();
                    this.mLayout.G0(i, i8);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.f8309V.defaultOnMeasure(i, i8);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                j();
                onExitLayoutOrScroll();
                f0 f0Var = this.mState;
                if (f0Var.f8403k) {
                    f0Var.f8400g = true;
                } else {
                    this.mAdapterHelper.c();
                    this.mState.f8400g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f8403k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            F f8 = this.mAdapter;
            if (f8 != null) {
                this.mState.e = f8.getItemCount();
            } else {
                this.mState.e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.f8309V.defaultOnMeasure(i, i8);
            stopInterceptRequestLayout(false);
            this.mState.f8400g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c0 c0Var = (c0) parcelable;
        this.mPendingSavedState = c0Var;
        super.onRestoreInstanceState(c0Var.f367U);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, androidx.recyclerview.widget.c0, B0.b] */
    public Parcelable onSaveInstanceState() {
        ? bVar = new B0.b(super.onSaveInstanceState());
        c0 c0Var = this.mPendingSavedState;
        if (c0Var != null) {
            bVar.f8376W = c0Var.f8376W;
        } else {
            Q q7 = this.mLayout;
            if (q7 != null) {
                bVar.f8376W = q7.s0();
            } else {
                bVar.f8376W = null;
            }
        }
        return bVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i8) {
    }

    public void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        if (i != i9 || i8 != i10) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x020e
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x020e
        L_0x000f:
            androidx.recyclerview.widget.V r0 = r6.mInterceptingOnItemTouchListener
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r18.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = 0
            goto L_0x0031
        L_0x001d:
            boolean r0 = r17.f(r18)
            goto L_0x0031
        L_0x0022:
            r0.onTouchEvent(r6, r7)
            int r0 = r18.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.mInterceptingOnItemTouchListener = r0
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r17.n()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.Q r0 = r6.mLayout
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.o()
            androidx.recyclerview.widget.Q r0 = r6.mLayout
            boolean r11 = r0.p()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0053:
            int r0 = r18.getActionMasked()
            int r2 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0063
            int[] r3 = r6.mNestedOffsets
            r3[r9] = r8
            r3[r8] = r8
        L_0x0063:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r3 = r6.mNestedOffsets
            r4 = r3[r8]
            float r4 = (float) r4
            r3 = r3[r9]
            float r3 = (float) r3
            r12.offsetLocation(r4, r3)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01e4
            if (r0 == r9) goto L_0x01a3
            r4 = 2
            if (r0 == r4) goto L_0x00ae
            if (r0 == r1) goto L_0x00a6
            r1 = 5
            if (r0 == r1) goto L_0x008a
            r1 = 6
            if (r0 == r1) goto L_0x0085
            goto L_0x0205
        L_0x0085:
            r17.i(r18)
            goto L_0x0205
        L_0x008a:
            int r0 = r7.getPointerId(r2)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x0205
        L_0x00a6:
            r17.n()
            r6.setScrollState(r8)
            goto L_0x0205
        L_0x00ae:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00d1:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x011a
            if (r10 == 0) goto L_0x00fe
            if (r0 <= 0) goto L_0x00f3
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00fa
        L_0x00f3:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00fa:
            if (r0 == 0) goto L_0x00fe
            r2 = 1
            goto L_0x00ff
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            if (r11 == 0) goto L_0x0115
            if (r1 <= 0) goto L_0x010b
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x0112
        L_0x010b:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x0112:
            if (r1 == 0) goto L_0x0115
            r2 = 1
        L_0x0115:
            if (r2 == 0) goto L_0x011a
            r6.setScrollState(r9)
        L_0x011a:
            int r2 = r6.mScrollState
            if (r2 != r9) goto L_0x0205
            int[] r2 = r6.mReusableIntPair
            r2[r8] = r8
            r2[r9] = r8
            float r2 = r18.getY()
            int r2 = r6.k(r0, r2)
            int r15 = r0 - r2
            float r0 = r18.getX()
            int r0 = r6.l(r1, r0)
            int r16 = r1 - r0
            if (r10 == 0) goto L_0x013c
            r1 = r15
            goto L_0x013d
        L_0x013c:
            r1 = 0
        L_0x013d:
            if (r11 == 0) goto L_0x0142
            r2 = r16
            goto L_0x0143
        L_0x0142:
            r2 = 0
        L_0x0143:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0172
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0172:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0184
            r1 = r15
            goto L_0x0185
        L_0x0184:
            r1 = 0
        L_0x0185:
            if (r11 == 0) goto L_0x0189
            r2 = r0
            goto L_0x018a
        L_0x0189:
            r2 = 0
        L_0x018a:
            boolean r1 = r6.scrollByInternal(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0197
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0197:
            androidx.recyclerview.widget.s r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x0205
            if (r15 != 0) goto L_0x019f
            if (r0 == 0) goto L_0x0205
        L_0x019f:
            r1.a(r6, r15, r0)
            goto L_0x0205
        L_0x01a3:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            int r1 = r6.mMaxFlingVelocity
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01bf
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01c0
        L_0x01bf:
            r1 = 0
        L_0x01c0:
            if (r11 == 0) goto L_0x01cc
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01cd
        L_0x01cc:
            r2 = 0
        L_0x01cd:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01d5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01dd
        L_0x01d5:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01e0
        L_0x01dd:
            r6.setScrollState(r8)
        L_0x01e0:
            r17.n()
            goto L_0x020a
        L_0x01e4:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x0202
            r10 = r10 | 2
        L_0x0202:
            r6.startNestedScroll(r10, r8)
        L_0x0205:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x020a:
            r12.recycle()
            return r9
        L_0x020e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(EdgeEffect edgeEffect, int i, int i8) {
        if (i > 0) {
            return true;
        }
        float n4 = e.n(edgeEffect) * ((float) i8);
        double log = Math.log((double) ((((float) Math.abs(-i)) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION)));
        double d8 = (double) DECELERATION_RATE;
        if (((float) (Math.exp((d8 / (d8 - 1.0d)) * log) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)))) < n4) {
            return true;
        }
        return false;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            WeakHashMap weakHashMap = C1510H.f15874a;
            postOnAnimation(runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(j0 j0Var, L l8) {
        j0Var.setFlags(0, 8192);
        if (this.mState.f8401h && j0Var.isUpdated() && !j0Var.isRemoved() && !j0Var.shouldIgnore()) {
            this.mViewInfoStore.f8522b.g(j0Var, getChangedHolderKey(j0Var));
        }
        i iVar = this.mViewInfoStore.f8521a;
        r0 r0Var = (r0) iVar.get(j0Var);
        if (r0Var == null) {
            r0Var = r0.a();
            iVar.put(j0Var, r0Var);
        }
        r0Var.f8511b = l8;
        r0Var.f8510a |= 4;
    }

    public void removeAndRecycleViews() {
        M m8 = this.mItemAnimator;
        if (m8 != null) {
            m8.e();
        }
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.v0(this.mRecycler);
            this.mLayout.w0(this.mRecycler);
        }
        Z z = this.mRecycler;
        z.f8355a.clear();
        z.g();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAnimatingView(android.view.View r8) {
        /*
            r7 = this;
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.c r0 = r7.mChildHelper
            P5.E r1 = r0.f8373b
            androidx.recyclerview.widget.D r2 = r0.f8372a
            int r3 = r0.f8375d
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L_0x001d
            android.view.View r0 = r0.e
            if (r0 != r8) goto L_0x0015
        L_0x0013:
            r4 = 0
            goto L_0x0046
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r0)
            throw r8
        L_0x001d:
            r6 = 2
            if (r3 == r6) goto L_0x007e
            r0.f8375d = r6     // Catch:{ all -> 0x0031 }
            androidx.recyclerview.widget.RecyclerView r3 = r2.f8270a     // Catch:{ all -> 0x0031 }
            int r3 = r3.indexOfChild(r8)     // Catch:{ all -> 0x0031 }
            r6 = -1
            if (r3 != r6) goto L_0x0033
            r0.k(r8)     // Catch:{ all -> 0x0031 }
        L_0x002e:
            r0.f8375d = r5
            goto L_0x0046
        L_0x0031:
            r8 = move-exception
            goto L_0x007b
        L_0x0033:
            boolean r6 = r1.D(r3)     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0043
            r1.I(r3)     // Catch:{ all -> 0x0031 }
            r0.k(r8)     // Catch:{ all -> 0x0031 }
            r2.c(r3)     // Catch:{ all -> 0x0031 }
            goto L_0x002e
        L_0x0043:
            r0.f8375d = r5
            goto L_0x0013
        L_0x0046:
            if (r4 == 0) goto L_0x0075
            androidx.recyclerview.widget.j0 r0 = getChildViewHolderInt(r8)
            androidx.recyclerview.widget.Z r1 = r7.mRecycler
            r1.m(r0)
            androidx.recyclerview.widget.Z r1 = r7.mRecycler
            r1.j(r0)
            boolean r0 = sVerboseLoggingEnabled
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "after removing animated view: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.d(r0, r8)
        L_0x0075:
            r8 = r4 ^ 1
            r7.stopInterceptRequestLayout(r8)
            return r4
        L_0x007b:
            r0.f8375d = r5
            throw r8
        L_0x007e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    public void removeDetachedView(View view, boolean z) {
        j0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(g.n(this, sb));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(g.n(this, sb2));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(N n4) {
        boolean z;
        Q q7 = this.mLayout;
        if (q7 != null) {
            q7.m("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(n4);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(T t8) {
        List<T> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(t8);
        }
    }

    public void removeOnItemTouchListener(V v4) {
        this.mOnItemTouchListeners.remove(v4);
        if (this.mInterceptingOnItemTouchListener == v4) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(W w2) {
        List<W> list = this.mScrollListeners;
        if (list != null) {
            list.remove(w2);
        }
    }

    public void removeRecyclerListener(a0 a0Var) {
        this.mRecyclerListeners.remove(a0Var);
    }

    public void repositionShadowingViews() {
        j0 j0Var;
        int e = this.mChildHelper.e();
        for (int i = 0; i < e; i++) {
            View d8 = this.mChildHelper.d(i);
            j0 childViewHolder = getChildViewHolder(d8);
            if (!(childViewHolder == null || (j0Var = childViewHolder.mShadowingHolder) == null)) {
                View view = j0Var.itemView;
                int left = d8.getLeft();
                int top = d8.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        C0513y yVar = this.mLayout.f8312Y;
        if ((yVar == null || !yVar.e) && !isComputingLayout() && view2 != null) {
            m(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.y0(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h5 = this.mChildHelper.h();
        int i = 0;
        while (i < h5) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (!sDebugAssertionsEnabled || childViewHolderInt.mPosition != -1 || childViewHolderInt.isRemoved()) {
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.saveOldPosition();
                }
                i++;
            } else {
                throw new IllegalStateException(g.n(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
        }
    }

    public void scrollBy(int i, int i8) {
        Q q7 = this.mLayout;
        if (q7 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean o2 = q7.o();
            boolean p3 = this.mLayout.p();
            if (o2 || p3) {
                if (!o2) {
                    i = 0;
                }
                if (!p3) {
                    i8 = 0;
                }
                scrollByInternal(i, i8, (MotionEvent) null, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean scrollByInternal(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r17.consumePendingUpdateOperations()
            androidx.recyclerview.widget.F r0 = r8.mAdapter
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0028
            int[] r0 = r8.mReusableIntPair
            r0[r12] = r12
            r0[r11] = r12
            r8.scrollStep(r9, r10, r0)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            goto L_0x002d
        L_0x0028:
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.N> r0 = r8.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r17.invalidate()
        L_0x0038:
            int[] r7 = r8.mReusableIntPair
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r8.mScrollOffset
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r16
            r6 = r21
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r12]
            int r15 = r15 - r1
            r0 = r0[r11]
            int r2 = r16 - r0
            if (r1 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r0 = 0
            goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            int r1 = r8.mLastTouchX
            int[] r3 = r8.mScrollOffset
            r4 = r3[r12]
            int r1 = r1 - r4
            r8.mLastTouchX = r1
            int r1 = r8.mLastTouchY
            r3 = r3[r11]
            int r1 = r1 - r3
            r8.mLastTouchY = r1
            int[] r1 = r8.mNestedOffsets
            r5 = r1[r12]
            int r5 = r5 + r4
            r1[r12] = r5
            r4 = r1[r11]
            int r4 = r4 + r3
            r1[r11] = r4
            int r1 = r17.getOverScrollMode()
            r3 = 2
            if (r1 == r3) goto L_0x011a
            if (r20 == 0) goto L_0x0117
            int r1 = r20.getSource()
            r3 = 8194(0x2002, float:1.1482E-41)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x008d
            goto L_0x0117
        L_0x008d:
            float r1 = r20.getX()
            float r3 = (float) r15
            float r4 = r20.getY()
            float r2 = (float) r2
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b7
            r17.ensureLeftGlow()
            android.widget.EdgeEffect r7 = r8.mLeftGlow
            float r15 = -r3
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r15 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
            float r4 = r5 - r4
            E.e.s(r7, r15, r4)
        L_0x00b5:
            r4 = 1
            goto L_0x00d2
        L_0x00b7:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d1
            r17.ensureRightGlow()
            android.widget.EdgeEffect r7 = r8.mRightGlow
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r11 = r3 / r11
            int r15 = r17.getHeight()
            float r15 = (float) r15
            float r4 = r4 / r15
            E.e.s(r7, r11, r4)
            goto L_0x00b5
        L_0x00d1:
            r4 = 0
        L_0x00d2:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ed
            r17.ensureTopGlow()
            android.widget.EdgeEffect r4 = r8.mTopGlow
            float r5 = -r2
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r5 = r5 / r7
            int r7 = r17.getWidth()
            float r7 = (float) r7
            float r1 = r1 / r7
            E.e.s(r4, r5, r1)
        L_0x00eb:
            r4 = 1
            goto L_0x0108
        L_0x00ed:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0108
            r17.ensureBottomGlow()
            android.widget.EdgeEffect r4 = r8.mBottomGlow
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r7 = r2 / r7
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r1 = r1 / r11
            float r5 = r5 - r1
            E.e.s(r4, r7, r5)
            goto L_0x00eb
        L_0x0108:
            if (r4 != 0) goto L_0x0112
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0112
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0117
        L_0x0112:
            java.util.WeakHashMap r1 = v0.C1510H.f15874a
            r17.postInvalidateOnAnimation()
        L_0x0117:
            r17.considerReleasingGlowsOnScroll(r18, r19)
        L_0x011a:
            if (r14 != 0) goto L_0x011e
            if (r13 == 0) goto L_0x0121
        L_0x011e:
            r8.dispatchOnScrolled(r14, r13)
        L_0x0121:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x012a
            r17.invalidate()
        L_0x012a:
            if (r0 != 0) goto L_0x0133
            if (r14 != 0) goto L_0x0133
            if (r13 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r11 = 0
            goto L_0x0134
        L_0x0133:
            r11 = 1
        L_0x0134:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.scrollByInternal(int, int, android.view.MotionEvent, int):boolean");
    }

    public void scrollStep(int i, int i8, int[] iArr) {
        int i9;
        int i10;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i11 = C1361h.f14708a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            i9 = this.mLayout.A0(i, this.mRecycler, this.mState);
        } else {
            i9 = 0;
        }
        if (i8 != 0) {
            i10 = this.mLayout.C0(i8, this.mRecycler, this.mState);
        } else {
            i10 = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i9;
            iArr[1] = i10;
        }
    }

    public void scrollTo(int i, int i8) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            Q q7 = this.mLayout;
            if (q7 == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            q7.B0(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(l0 l0Var) {
        this.mAccessibilityDelegate = l0Var;
        C1510H.p(this, l0Var);
    }

    public void setAdapter(F f8) {
        setLayoutFrozen(false);
        o(f8, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(I i) {
        if (i != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(j0 j0Var, int i) {
        if (isComputingLayout()) {
            j0Var.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(j0Var);
            return false;
        }
        View view = j0Var.itemView;
        WeakHashMap weakHashMap = C1510H.f15874a;
        view.setImportantForAccessibility(i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(J j7) {
        j7.getClass();
        this.mEdgeEffectFactory = j7;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(M m8) {
        M m9 = this.mItemAnimator;
        if (m9 != null) {
            m9.e();
            this.mItemAnimator.f8297a = null;
        }
        this.mItemAnimator = m8;
        if (m8 != null) {
            m8.f8297a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        Z z = this.mRecycler;
        z.e = i;
        z.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(Q q7) {
        RecyclerView recyclerView;
        if (q7 != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                M m8 = this.mItemAnimator;
                if (m8 != null) {
                    m8.e();
                }
                this.mLayout.v0(this.mRecycler);
                this.mLayout.w0(this.mRecycler);
                Z z = this.mRecycler;
                z.f8355a.clear();
                z.g();
                if (this.mIsAttached) {
                    Q q8 = this.mLayout;
                    q8.f8314a0 = false;
                    q8.d0(this);
                }
                this.mLayout.H0((RecyclerView) null);
                this.mLayout = null;
            } else {
                Z z6 = this.mRecycler;
                z6.f8355a.clear();
                z6.g();
            }
            C0492c cVar = this.mChildHelper;
            cVar.f8373b.J();
            ArrayList arrayList = cVar.f8374c;
            int size = arrayList.size() - 1;
            while (true) {
                recyclerView = cVar.f8372a.f8270a;
                if (size < 0) {
                    break;
                }
                j0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(recyclerView);
                }
                arrayList.remove(size);
                size--;
            }
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.mLayout = q7;
            if (q7 != null) {
                if (q7.f8309V == null) {
                    q7.H0(this);
                    if (this.mIsAttached) {
                        Q q9 = this.mLayout;
                        q9.f8314a0 = true;
                        q9.c0(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(q7);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(g.n(q7.f8309V, sb));
                }
            }
            this.mRecycler.n();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1539l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f15957d) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            C1553z.n(scrollingChildHelper.f15956c);
        }
        scrollingChildHelper.f15957d = z;
    }

    public void setOnFlingListener(U u3) {
        this.mOnFlingListener = u3;
    }

    @Deprecated
    public void setOnScrollListener(W w2) {
        this.mScrollListener = w2;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(Y y8) {
        Z z = this.mRecycler;
        RecyclerView recyclerView = z.f8361h;
        z.f(recyclerView.mAdapter, false);
        Y y9 = z.f8360g;
        if (y9 != null) {
            y9.f8353b--;
        }
        z.f8360g = y8;
        if (!(y8 == null || recyclerView.getAdapter() == null)) {
            z.f8360g.f8353b++;
        }
        z.e();
    }

    @Deprecated
    public void setRecyclerListener(a0 a0Var) {
    }

    public void setScrollState(int i) {
        C0513y yVar;
        if (i != this.mScrollState) {
            if (sVerboseLoggingEnabled) {
                StringBuilder p3 = g.p(i, "setting scroll state to ", " from ");
                p3.append(this.mScrollState);
                Log.d(TAG, p3.toString(), new Exception());
            }
            this.mScrollState = i;
            if (i != 2) {
                i0 i0Var = this.mViewFlinger;
                i0Var.f8426a0.removeCallbacks(i0Var);
                i0Var.f8422W.abortAnimation();
                Q q7 = this.mLayout;
                if (!(q7 == null || (yVar = q7.f8312Y) == null)) {
                    yVar.i();
                }
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(h0 h0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        int i8 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = accessibilityEvent.getContentChangeTypes();
        } else {
            i = 0;
        }
        if (i != 0) {
            i8 = i;
        }
        this.mEatenAccessibilityChangeFlags |= i8;
        return true;
    }

    public void smoothScrollBy(int i, int i8) {
        smoothScrollBy(i, i8, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            Q q7 = this.mLayout;
            if (q7 == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                q7.L0(this, i);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                throw new IllegalStateException(g.n(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        C0513y yVar;
        setScrollState(0);
        i0 i0Var = this.mViewFlinger;
        i0Var.f8426a0.removeCallbacks(i0Var);
        i0Var.f8422W.abortAnimation();
        Q q7 = this.mLayout;
        if (q7 != null && (yVar = q7.f8312Y) != null) {
            yVar.i();
        }
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void viewRangeUpdate(int i, int i8, Object obj) {
        int i9;
        int i10;
        int h5 = this.mChildHelper.h();
        int i11 = i8 + i;
        for (int i12 = 0; i12 < h5; i12++) {
            View g8 = this.mChildHelper.g(i12);
            j0 childViewHolderInt = getChildViewHolderInt(g8);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i10 = childViewHolderInt.mPosition) >= i && i10 < i11) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((S) g8.getLayoutParams()).f8325W = true;
            }
        }
        Z z = this.mRecycler;
        ArrayList arrayList = z.f8357c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null && (i9 = j0Var.mPosition) >= i && i9 < i11) {
                j0Var.addFlags(2);
                z.h(size);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.recyclerview.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: androidx.recyclerview.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: androidx.recyclerview.widget.q} */
    /* JADX WARNING: type inference failed for: r1v4, types: [androidx.recyclerview.widget.f0, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r16.<init>(r17, r18, r19)
            androidx.recyclerview.widget.b0 r0 = new androidx.recyclerview.widget.b0
            r0.<init>(r7)
            r7.mObserver = r0
            androidx.recyclerview.widget.Z r0 = new androidx.recyclerview.widget.Z
            r0.<init>(r7)
            r7.mRecycler = r0
            androidx.recyclerview.widget.t0 r0 = new androidx.recyclerview.widget.t0
            r0.<init>()
            r7.mViewInfoStore = r0
            androidx.recyclerview.widget.C r0 = new androidx.recyclerview.widget.C
            r11 = 0
            r0.<init>(r7, r11)
            r7.mUpdateChildViewsRunnable = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.mTempRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.mTempRect2 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.mTempRectF = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.mRecyclerListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.mItemDecorations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.mOnItemTouchListeners = r0
            r7.mInterceptRequestLayoutDepth = r11
            r7.mDataSetHasChangedAfterLayout = r11
            r7.mDispatchItemsChangedEvent = r11
            r7.mLayoutOrScrollCounter = r11
            r7.mDispatchScrollCounter = r11
            androidx.recyclerview.widget.g0 r0 = sDefaultEdgeEffectFactory
            r7.mEdgeEffectFactory = r0
            androidx.recyclerview.widget.j r0 = new androidx.recyclerview.widget.j
            r0.<init>()
            r7.mItemAnimator = r0
            r7.mScrollState = r11
            r0 = -1
            r7.mScrollPointerId = r0
            r1 = 1
            r7.mScaledHorizontalScrollFactor = r1
            r7.mScaledVerticalScrollFactor = r1
            r12 = 1
            r7.mPreserveFocusAfterLayout = r12
            androidx.recyclerview.widget.i0 r1 = new androidx.recyclerview.widget.i0
            r1.<init>(r7)
            r7.mViewFlinger = r1
            boolean r1 = ALLOW_THREAD_GAP_WORK
            if (r1 == 0) goto L_0x0085
            androidx.recyclerview.widget.q r1 = new androidx.recyclerview.widget.q
            r1.<init>()
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            r7.mPrefetchRegistry = r1
            androidx.recyclerview.widget.f0 r1 = new androidx.recyclerview.widget.f0
            r1.<init>()
            r1.f8395a = r0
            r1.f8396b = r11
            r1.f8397c = r11
            r1.f8398d = r12
            r1.e = r11
            r1.f8399f = r11
            r1.f8400g = r11
            r1.f8401h = r11
            r1.i = r11
            r1.f8402j = r11
            r1.f8403k = r11
            r7.mState = r1
            r7.mItemsAddedOrRemoved = r11
            r7.mItemsChanged = r11
            androidx.recyclerview.widget.D r1 = new androidx.recyclerview.widget.D
            r1.<init>(r7)
            r7.mItemAnimatorListener = r1
            r7.mPostedAnimatorRunner = r11
            r14 = 2
            int[] r1 = new int[r14]
            r7.mMinMaxLayoutPositions = r1
            int[] r1 = new int[r14]
            r7.mScrollOffset = r1
            int[] r1 = new int[r14]
            r7.mNestedOffsets = r1
            int[] r1 = new int[r14]
            r7.mReusableIntPair = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.mPendingAccessibilityImportanceChange = r1
            androidx.recyclerview.widget.C r1 = new androidx.recyclerview.widget.C
            r1.<init>(r7, r12)
            r7.mItemAnimatorRunner = r1
            r7.mLastAutoMeasureNonExactMeasuredWidth = r11
            r7.mLastAutoMeasureNonExactMeasuredHeight = r11
            androidx.recyclerview.widget.D r1 = new androidx.recyclerview.widget.D
            r1.<init>(r7)
            r7.mViewInfoProcessCallback = r1
            r7.setScrollContainer(r12)
            r7.setFocusableInTouchMode(r12)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r17)
            int r2 = r1.getScaledTouchSlop()
            r7.mTouchSlop = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x00f9
            java.lang.reflect.Method r4 = v0.C1511I.f15880a
            float r4 = v0.C1538k.a(r1)
            goto L_0x00fd
        L_0x00f9:
            float r4 = v0.C1511I.a(r1, r8)
        L_0x00fd:
            r7.mScaledHorizontalScrollFactor = r4
            if (r2 < r3) goto L_0x0106
            float r4 = v0.C1538k.b(r1)
            goto L_0x010a
        L_0x0106:
            float r4 = v0.C1511I.a(r1, r8)
        L_0x010a:
            r7.mScaledVerticalScrollFactor = r4
            int r4 = r1.getScaledMinimumFlingVelocity()
            r7.mMinFlingVelocity = r4
            int r1 = r1.getScaledMaximumFlingVelocity()
            r7.mMaxFlingVelocity = r1
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r1 = r1 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r1 = r1 * r4
            r7.mPhysicalCoef = r1
            int r1 = r16.getOverScrollMode()
            if (r1 != r14) goto L_0x013a
            r1 = 1
            goto L_0x013b
        L_0x013a:
            r1 = 0
        L_0x013b:
            r7.setWillNotDraw(r1)
            androidx.recyclerview.widget.M r1 = r7.mItemAnimator
            androidx.recyclerview.widget.K r4 = r7.mItemAnimatorListener
            r1.f8297a = r4
            r16.initAdapterManager()
            androidx.recyclerview.widget.c r1 = new androidx.recyclerview.widget.c
            androidx.recyclerview.widget.D r4 = new androidx.recyclerview.widget.D
            r4.<init>(r7)
            r1.<init>(r4)
            r7.mChildHelper = r1
            java.util.WeakHashMap r1 = v0.C1510H.f15874a
            if (r2 < r3) goto L_0x015c
            int r1 = v0.C1504B.a(r16)
            goto L_0x015d
        L_0x015c:
            r1 = 0
        L_0x015d:
            r15 = 8
            if (r1 != 0) goto L_0x0166
            if (r2 < r3) goto L_0x0166
            v0.C1504B.b(r7, r15)
        L_0x0166:
            int r1 = r16.getImportantForAccessibility()
            if (r1 != 0) goto L_0x016f
            r7.setImportantForAccessibility(r12)
        L_0x016f:
            android.content.Context r1 = r16.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r7.mAccessibilityManager = r1
            androidx.recyclerview.widget.l0 r1 = new androidx.recyclerview.widget.l0
            r1.<init>(r7)
            r7.setAccessibilityDelegateCompat(r1)
            int[] r3 = a2.C0414a.f7167a
            android.content.res.TypedArray r6 = r8.obtainStyledAttributes(r9, r3, r10, r11)
            r1 = r16
            r2 = r17
            r4 = r18
            r5 = r6
            r13 = r6
            r6 = r19
            v0.C1510H.o(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = r13.getString(r15)
            int r2 = r13.getInt(r14, r0)
            if (r2 != r0) goto L_0x01a7
            r0 = 262144(0x40000, float:3.67342E-40)
            r7.setDescendantFocusability(r0)
        L_0x01a7:
            boolean r0 = r13.getBoolean(r12, r12)
            r7.mClipToPadding = r0
            r0 = 3
            boolean r2 = r13.getBoolean(r0, r11)
            r7.mEnableFastScroller = r2
            r3 = 4
            if (r2 == 0) goto L_0x01d1
            r2 = 6
            android.graphics.drawable.Drawable r2 = r13.getDrawable(r2)
            android.graphics.drawable.StateListDrawable r2 = (android.graphics.drawable.StateListDrawable) r2
            r4 = 7
            android.graphics.drawable.Drawable r4 = r13.getDrawable(r4)
            android.graphics.drawable.Drawable r5 = r13.getDrawable(r3)
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            r6 = 5
            android.graphics.drawable.Drawable r6 = r13.getDrawable(r6)
            r7.initFastScroller(r2, r4, r5, r6)
        L_0x01d1:
            r13.recycle()
            java.lang.String r2 = ": Could not instantiate the LayoutManager: "
            if (r1 == 0) goto L_0x0333
            java.lang.String r1 = r1.trim()
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x0333
            char r4 = r1.charAt(r11)
            r5 = 46
            if (r4 != r5) goto L_0x01fe
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r17.getPackageName()
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L_0x0223
        L_0x01fe:
            java.lang.String r4 = "."
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x0207
            goto L_0x0223
        L_0x0207:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r6 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r6 = r6.getPackage()
            java.lang.String r6 = r6.getName()
            r4.append(r6)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0223:
            boolean r4 = r16.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            if (r4 == 0) goto L_0x0240
            java.lang.Class r4 = r16.getClass()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            goto L_0x0244
        L_0x0232:
            r0 = move-exception
            goto L_0x02a1
        L_0x0234:
            r0 = move-exception
            goto L_0x02bf
        L_0x0237:
            r0 = move-exception
            goto L_0x02dd
        L_0x023a:
            r0 = move-exception
            goto L_0x02f9
        L_0x023d:
            r0 = move-exception
            goto L_0x0315
        L_0x0240:
            java.lang.ClassLoader r4 = r17.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
        L_0x0244:
            java.lang.Class r4 = java.lang.Class.forName(r1, r11, r4)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.Class<androidx.recyclerview.widget.Q> r5 = androidx.recyclerview.widget.Q.class
            java.lang.Class r4 = r4.asSubclass(r5)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.Class<?>[] r5 = LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE     // Catch:{ NoSuchMethodException -> 0x0268 }
            java.lang.reflect.Constructor r5 = r4.getConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x0268 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0268 }
            r3[r11] = r8     // Catch:{ NoSuchMethodException -> 0x0268 }
            r3[r12] = r9     // Catch:{ NoSuchMethodException -> 0x0268 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)     // Catch:{ NoSuchMethodException -> 0x0268 }
            r3[r14] = r6     // Catch:{ NoSuchMethodException -> 0x0268 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch:{ NoSuchMethodException -> 0x0268 }
            r3[r0] = r6     // Catch:{ NoSuchMethodException -> 0x0268 }
        L_0x0266:
            r13 = r3
            goto L_0x0270
        L_0x0268:
            r0 = move-exception
            r5 = r0
            r3 = 0
            java.lang.reflect.Constructor r5 = r4.getConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x027e }
            goto L_0x0266
        L_0x0270:
            r5.setAccessible(r12)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.Object r0 = r5.newInstance(r13)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            androidx.recyclerview.widget.Q r0 = (androidx.recyclerview.widget.Q) r0     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            r7.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            goto L_0x0333
        L_0x027e:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.String r5 = r18.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            r4.append(r1)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x023d, InvocationTargetException -> 0x023a, InstantiationException -> 0x0237, IllegalAccessException -> 0x0234, ClassCastException -> 0x0232 }
        L_0x02a1:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r18.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x02bf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r18.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x02dd:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r18.getPositionDescription()
            r4.append(r5)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x02f9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r18.getPositionDescription()
            r4.append(r5)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0315:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r18.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0333:
            int[] r3 = NESTED_SCROLLING_ATTRS
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r3, r10, r11)
            r1 = r16
            r2 = r17
            r4 = r18
            r5 = r0
            r6 = r19
            v0.C1510H.o(r1, r2, r3, r4, r5, r6)
            boolean r1 = r0.getBoolean(r11, r12)
            r0.recycle()
            r7.setNestedScrollingEnabled(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 2131362166(0x7f0a0176, float:1.8344105E38)
            r7.setTag(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public j0 findViewHolderForPosition(int i, boolean z) {
        int h5 = this.mChildHelper.h();
        j0 j0Var = null;
        for (int i8 = 0; i8 < h5; i8++) {
            j0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i8));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                C0492c cVar = this.mChildHelper;
                if (!cVar.f8374c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                j0Var = childViewHolderInt;
            }
        }
        return j0Var;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i >= 1) {
            return;
        }
        if (!sDebugAssertionsEnabled || i >= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                int i8 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i8 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i8);
                    sendAccessibilityEventUnchecked(obtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
                return;
            }
            return;
        }
        throw new IllegalStateException(g.n(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
    }

    public void smoothScrollBy(int i, int i8, Interpolator interpolator) {
        smoothScrollBy(i, i8, interpolator, UNDEFINED_DURATION);
    }

    public boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().c(i, i8, iArr, iArr2, i9);
    }

    public boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr, int i11) {
        return getScrollingChildHelper().d(i, i8, i9, i10, iArr, i11, (int[]) null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().f(i);
    }

    public void smoothScrollBy(int i, int i8, Interpolator interpolator, int i9) {
        smoothScrollBy(i, i8, interpolator, i9, false);
    }

    public boolean startNestedScroll(int i, int i8) {
        return getScrollingChildHelper().g(i, i8);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().h(i);
    }

    public void smoothScrollBy(int i, int i8, Interpolator interpolator, int i9, boolean z) {
        Q q7 = this.mLayout;
        if (q7 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i10 = 0;
            if (!q7.o()) {
                i = 0;
            }
            if (!this.mLayout.p()) {
                i8 = 0;
            }
            if (i != 0 || i8 != 0) {
                if (i9 == Integer.MIN_VALUE || i9 > 0) {
                    if (z) {
                        if (i != 0) {
                            i10 = 1;
                        }
                        if (i8 != 0) {
                            i10 |= 2;
                        }
                        startNestedScroll(i10, 1);
                    }
                    this.mViewFlinger.c(i, i8, interpolator, i9);
                    return;
                }
                scrollBy(i, i8);
            }
        }
    }

    public final void dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().d(i, i8, i9, i10, iArr, i11, iArr2);
    }

    public void addItemDecoration(N n4) {
        addItemDecoration(n4, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Q q7 = this.mLayout;
        if (q7 != null) {
            return q7.E(layoutParams);
        }
        throw new IllegalStateException(g.n(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
