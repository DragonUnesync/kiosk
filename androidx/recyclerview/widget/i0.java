package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import v0.C1510H;

public final class i0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public int f8420U;

    /* renamed from: V  reason: collision with root package name */
    public int f8421V;

    /* renamed from: W  reason: collision with root package name */
    public OverScroller f8422W;

    /* renamed from: X  reason: collision with root package name */
    public Interpolator f8423X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8424Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f8425Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f8426a0;

    public i0(RecyclerView recyclerView) {
        this.f8426a0 = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f8423X = interpolator;
        this.f8422W = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i, int i8) {
        RecyclerView recyclerView = this.f8426a0;
        recyclerView.setScrollState(2);
        this.f8421V = 0;
        this.f8420U = 0;
        Interpolator interpolator = this.f8423X;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f8423X = interpolator2;
            this.f8422W = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f8422W.fling(0, 0, i, i8, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f8424Y) {
            this.f8425Z = true;
            return;
        }
        RecyclerView recyclerView = this.f8426a0;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = C1510H.f15874a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i8, Interpolator interpolator, int i9) {
        boolean z;
        int i10;
        RecyclerView recyclerView = this.f8426a0;
        if (i9 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i8);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i10 = recyclerView.getWidth();
            } else {
                i10 = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            i9 = Math.min((int) (((((float) abs) / ((float) i10)) + 1.0f) * 300.0f), 2000);
        }
        int i11 = i9;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f8423X != interpolator) {
            this.f8423X = interpolator;
            this.f8422W = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f8421V = 0;
        this.f8420U = 0;
        recyclerView.setScrollState(2);
        this.f8422W.startScroll(0, 0, i, i8, i11);
        if (Build.VERSION.SDK_INT < 23) {
            this.f8422W.computeScrollOffset();
        }
        b();
    }

    public final void run() {
        int i;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z6;
        boolean z8;
        int i11;
        RecyclerView recyclerView = this.f8426a0;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f8422W.abortAnimation();
            return;
        }
        this.f8425Z = false;
        this.f8424Y = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f8422W;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            this.f8420U = currX;
            this.f8421V = currY;
            int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(currX - this.f8420U);
            int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(currY - this.f8421V);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, (int[]) null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                consumeFlingInHorizontalStretch -= iArr2[0];
                consumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i12 = iArr4[0];
                int i13 = iArr4[1];
                int i14 = consumeFlingInHorizontalStretch - i12;
                int i15 = consumeFlingInVerticalStretch - i13;
                C0513y yVar = recyclerView.mLayout.f8312Y;
                if (yVar != null && !yVar.f8550d && yVar.e) {
                    int b8 = recyclerView.mState.b();
                    if (b8 == 0) {
                        yVar.i();
                    } else if (yVar.f8547a >= b8) {
                        yVar.f8547a = b8 - 1;
                        yVar.g(i12, i13);
                    } else {
                        yVar.g(i12, i13);
                    }
                }
                i10 = i13;
                i9 = i12;
                i8 = i14;
                i = i15;
            } else {
                i8 = consumeFlingInHorizontalStretch;
                i = consumeFlingInVerticalStretch;
                i10 = 0;
                i9 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i9, i10, i8, i, (int[]) null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i16 = i8 - iArr6[0];
            int i17 = i - iArr6[1];
            if (!(i9 == 0 && i10 == 0)) {
                recyclerView.dispatchOnScrolled(i9, i10);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (overScroller.isFinished() || ((z || i16 != 0) && (z6 || i17 != 0))) {
                z8 = true;
            } else {
                z8 = false;
            }
            C0513y yVar2 = recyclerView.mLayout.f8312Y;
            if ((yVar2 == null || !yVar2.f8550d) && z8) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i16 < 0) {
                        i11 = -currVelocity;
                    } else if (i16 > 0) {
                        i11 = currVelocity;
                    } else {
                        i11 = 0;
                    }
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i11, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C0506q qVar = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = qVar.f8493c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    qVar.f8494d = 0;
                }
            } else {
                b();
                C0507s sVar = recyclerView.mGapWorker;
                if (sVar != null) {
                    sVar.a(recyclerView, i9, i10);
                }
            }
        }
        C0513y yVar3 = recyclerView.mLayout.f8312Y;
        if (yVar3 != null && yVar3.f8550d) {
            yVar3.g(0, 0);
        }
        this.f8424Y = false;
        if (this.f8425Z) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = C1510H.f15874a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.stopNestedScroll(1);
    }
}
