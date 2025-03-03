package androidx.swiperefreshlayout.widget;

import M0.C0123k;
import O7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import d2.C0632a;
import de.ozerov.fully.C0708h3;
import e2.C0828a;
import e2.C0831d;
import e2.C0832e;
import e2.C0833f;
import e2.C0834g;
import e2.C0835h;
import e2.C0836i;
import e2.C0837j;
import j0.f;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1539l;
import v0.C1540m;
import v0.C1541n;
import v0.C1553z;

public class SwipeRefreshLayout extends ViewGroup implements C1541n, C1540m {

    /* renamed from: H0  reason: collision with root package name */
    public static final int[] f8563H0 = {16842766};

    /* renamed from: A0  reason: collision with root package name */
    public C0708h3 f8564A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f8565B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f8566C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f8567D0;

    /* renamed from: E0  reason: collision with root package name */
    public final C0833f f8568E0 = new C0833f(this, 0);

    /* renamed from: F0  reason: collision with root package name */
    public final C0834g f8569F0 = new C0834g(this, 2);

    /* renamed from: G0  reason: collision with root package name */
    public final C0834g f8570G0 = new C0834g(this, 3);

    /* renamed from: U  reason: collision with root package name */
    public View f8571U;

    /* renamed from: V  reason: collision with root package name */
    public C0836i f8572V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8573W = false;

    /* renamed from: a0  reason: collision with root package name */
    public final int f8574a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f8575b0 = -1.0f;

    /* renamed from: c0  reason: collision with root package name */
    public float f8576c0;

    /* renamed from: d0  reason: collision with root package name */
    public final C0123k f8577d0;

    /* renamed from: e0  reason: collision with root package name */
    public final C1539l f8578e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int[] f8579f0 = new int[2];

    /* renamed from: g0  reason: collision with root package name */
    public final int[] f8580g0 = new int[2];

    /* renamed from: h0  reason: collision with root package name */
    public final int[] f8581h0 = new int[2];

    /* renamed from: i0  reason: collision with root package name */
    public boolean f8582i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f8583j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f8584k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f8585l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f8586m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f8587n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f8588o0 = -1;
    public final DecelerateInterpolator p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C0828a f8589q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f8590r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public int f8591s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f8592t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f8593u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f8594v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C0832e f8595w0;

    /* renamed from: x0  reason: collision with root package name */
    public C0834g f8596x0;

    /* renamed from: y0  reason: collision with root package name */
    public C0834g f8597y0;

    /* renamed from: z0  reason: collision with root package name */
    public C0708h3 f8598z0;

    /* JADX WARNING: type inference failed for: r2v12, types: [android.widget.ImageView, android.view.View, e2.a] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8574a0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f8583j0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.p0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f8566C0 = (int) (displayMetrics.density * 40.0f);
        ? imageView = new ImageView(getContext());
        float f8 = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(C0632a.f9717a);
        imageView.f11164V = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1553z.l(imageView, f8 * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.f11164V);
        imageView.setBackground(shapeDrawable);
        this.f8589q0 = imageView;
        C0832e eVar = new C0832e(getContext());
        this.f8595w0 = eVar;
        eVar.c(1);
        this.f8589q0.setImageDrawable(this.f8595w0);
        this.f8589q0.setVisibility(8);
        addView(this.f8589q0);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f8593u0 = i;
        this.f8575b0 = (float) i;
        this.f8577d0 = new C0123k(9);
        this.f8578e0 = new C1539l(this);
        setNestedScrollingEnabled(true);
        int i8 = -this.f8566C0;
        this.f8584k0 = i8;
        this.f8592t0 = i8;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f8563H0);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f8589q0.getBackground().setAlpha(i);
        this.f8595w0.setAlpha(i);
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
        if (i9 == 0) {
            onNestedPreScroll(view, i, i8, iArr);
        }
    }

    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        int i12;
        if (i11 == 0) {
            int i13 = iArr[1];
            if (i11 == 0) {
                this.f8578e0.d(i, i8, i9, i10, this.f8580g0, i11, iArr);
            }
            int i14 = i10 - (iArr[1] - i13);
            if (i14 == 0) {
                i12 = i10 + this.f8580g0[1];
            } else {
                i12 = i14;
            }
            if (i12 < 0 && !g()) {
                float abs = this.f8576c0 + ((float) Math.abs(i12));
                this.f8576c0 = abs;
                j(abs);
                iArr[1] = iArr[1] + i14;
            }
        }
    }

    public final boolean dispatchNestedFling(float f8, float f9, boolean z) {
        return this.f8578e0.a(f8, f9, z);
    }

    public final boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f8578e0.b(f8, f9);
    }

    public final boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2) {
        return this.f8578e0.c(i, i8, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr) {
        return this.f8578e0.d(i, i8, i9, i10, iArr, 0, (int[]) null);
    }

    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        d(view, i, i8, i9, i10, i11, this.f8581h0);
    }

    public final boolean f(View view, View view2, int i, int i8) {
        if (i8 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final boolean g() {
        View view = this.f8571U;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final int getChildDrawingOrder(int i, int i8) {
        int i9 = this.f8590r0;
        if (i9 < 0) {
            return i8;
        }
        if (i8 == i - 1) {
            return i9;
        }
        if (i8 >= i9) {
            return i8 + 1;
        }
        return i8;
    }

    public int getNestedScrollAxes() {
        C0123k kVar = this.f8577d0;
        return kVar.f2965c | kVar.f2964b;
    }

    public int getProgressCircleDiameter() {
        return this.f8566C0;
    }

    public int getProgressViewEndOffset() {
        return this.f8593u0;
    }

    public int getProgressViewStartOffset() {
        return this.f8592t0;
    }

    public final void h() {
        if (this.f8571U == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f8589q0)) {
                    this.f8571U = childAt;
                    return;
                }
            }
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f8578e0.f(0);
    }

    public final void i(float f8) {
        if (f8 > this.f8575b0) {
            m(true, true);
            return;
        }
        this.f8573W = false;
        C0832e eVar = this.f8595w0;
        C0831d dVar = eVar.f11191U;
        dVar.e = 0.0f;
        dVar.f11173f = 0.0f;
        eVar.invalidateSelf();
        C0833f fVar = new C0833f(this, 1);
        this.f8591s0 = this.f8584k0;
        C0834g gVar = this.f8570G0;
        gVar.reset();
        gVar.setDuration(200);
        gVar.setInterpolator(this.p0);
        C0828a aVar = this.f8589q0;
        aVar.f11163U = fVar;
        aVar.clearAnimation();
        this.f8589q0.startAnimation(gVar);
        C0832e eVar2 = this.f8595w0;
        C0831d dVar2 = eVar2.f11191U;
        if (dVar2.f11180n) {
            dVar2.f11180n = false;
        }
        eVar2.invalidateSelf();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f8578e0.f15957d;
    }

    public final void j(float f8) {
        C0708h3 h3Var;
        C0708h3 h3Var2;
        C0832e eVar = this.f8595w0;
        C0831d dVar = eVar.f11191U;
        if (!dVar.f11180n) {
            dVar.f11180n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f8 / this.f8575b0));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f8) - this.f8575b0;
        int i = this.f8594v0;
        if (i <= 0) {
            i = this.f8593u0;
        }
        float f9 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f9 * 2.0f) / f9) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i8 = this.f8592t0 + ((int) ((f9 * min) + (f9 * pow * 2.0f)));
        if (this.f8589q0.getVisibility() != 0) {
            this.f8589q0.setVisibility(0);
        }
        this.f8589q0.setScaleX(1.0f);
        this.f8589q0.setScaleY(1.0f);
        if (f8 < this.f8575b0) {
            if (this.f8595w0.f11191U.f11186t > 76 && ((h3Var2 = this.f8598z0) == null || !h3Var2.hasStarted() || h3Var2.hasEnded())) {
                C0708h3 h3Var3 = new C0708h3(this, this.f8595w0.f11191U.f11186t, 76);
                h3Var3.setDuration(300);
                C0828a aVar = this.f8589q0;
                aVar.f11163U = null;
                aVar.clearAnimation();
                this.f8589q0.startAnimation(h3Var3);
                this.f8598z0 = h3Var3;
            }
        } else if (this.f8595w0.f11191U.f11186t < 255 && ((h3Var = this.f8564A0) == null || !h3Var.hasStarted() || h3Var.hasEnded())) {
            C0708h3 h3Var4 = new C0708h3(this, this.f8595w0.f11191U.f11186t, 255);
            h3Var4.setDuration(300);
            C0828a aVar2 = this.f8589q0;
            aVar2.f11163U = null;
            aVar2.clearAnimation();
            this.f8589q0.startAnimation(h3Var4);
            this.f8564A0 = h3Var4;
        }
        C0832e eVar2 = this.f8595w0;
        float min2 = Math.min(0.8f, max * 0.8f);
        C0831d dVar2 = eVar2.f11191U;
        dVar2.e = 0.0f;
        dVar2.f11173f = min2;
        eVar2.invalidateSelf();
        C0832e eVar3 = this.f8595w0;
        float min3 = Math.min(1.0f, max);
        C0831d dVar3 = eVar3.f11191U;
        if (min3 != dVar3.f11182p) {
            dVar3.f11182p = min3;
        }
        eVar3.invalidateSelf();
        C0832e eVar4 = this.f8595w0;
        eVar4.f11191U.f11174g = ((pow * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i8 - this.f8584k0);
    }

    public final void k(float f8) {
        int i = this.f8591s0;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f8592t0 - i)) * f8))) - this.f8589q0.getTop());
    }

    public final void l() {
        this.f8589q0.clearAnimation();
        this.f8595w0.stop();
        this.f8589q0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f8592t0 - this.f8584k0);
        this.f8584k0 = this.f8589q0.getTop();
    }

    public final void m(boolean z, boolean z6) {
        if (this.f8573W != z) {
            this.f8565B0 = z6;
            h();
            this.f8573W = z;
            C0833f fVar = this.f8568E0;
            if (z) {
                this.f8591s0 = this.f8584k0;
                C0834g gVar = this.f8569F0;
                gVar.reset();
                gVar.setDuration(200);
                gVar.setInterpolator(this.p0);
                if (fVar != null) {
                    this.f8589q0.f11163U = fVar;
                }
                this.f8589q0.clearAnimation();
                this.f8589q0.startAnimation(gVar);
                return;
            }
            C0834g gVar2 = new C0834g(this, 1);
            this.f8597y0 = gVar2;
            gVar2.setDuration(150);
            C0828a aVar = this.f8589q0;
            aVar.f11163U = fVar;
            aVar.clearAnimation();
            this.f8589q0.startAnimation(this.f8597y0);
        }
    }

    public final void n(float f8) {
        float f9 = this.f8586m0;
        float f10 = (float) this.f8574a0;
        if (f8 - f9 > f10 && !this.f8587n0) {
            this.f8585l0 = f9 + f10;
            this.f8587n0 = true;
            this.f8595w0.setAlpha(76);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || g() || this.f8573W || this.f8582i0) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i8 = this.f8588o0;
                    if (i8 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i8);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    n(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f8588o0) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.f8588o0 = motionEvent.getPointerId(i);
                        }
                    }
                }
            }
            this.f8587n0 = false;
            this.f8588o0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f8592t0 - this.f8589q0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f8588o0 = pointerId;
            this.f8587n0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f8586m0 = motionEvent.getY(findPointerIndex2);
        }
        return this.f8587n0;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f8571U == null) {
                h();
            }
            View view = this.f8571U;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f8589q0.getMeasuredWidth();
                int measuredHeight2 = this.f8589q0.getMeasuredHeight();
                int i11 = measuredWidth / 2;
                int i12 = measuredWidth2 / 2;
                int i13 = this.f8584k0;
                this.f8589q0.layout(i11 - i12, i13, i11 + i12, measuredHeight2 + i13);
            }
        }
    }

    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        if (this.f8571U == null) {
            h();
        }
        View view = this.f8571U;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), b.MAX_POW2), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), b.MAX_POW2));
            this.f8589q0.measure(View.MeasureSpec.makeMeasureSpec(this.f8566C0, b.MAX_POW2), View.MeasureSpec.makeMeasureSpec(this.f8566C0, b.MAX_POW2));
            this.f8590r0 = -1;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                if (getChildAt(i9) == this.f8589q0) {
                    this.f8590r0 = i9;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f8, float f9, boolean z) {
        return this.f8578e0.a(f8, f9, z);
    }

    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return this.f8578e0.b(f8, f9);
    }

    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
        if (i8 > 0) {
            float f8 = this.f8576c0;
            if (f8 > 0.0f) {
                float f9 = (float) i8;
                if (f9 > f8) {
                    iArr[1] = (int) f8;
                    this.f8576c0 = 0.0f;
                } else {
                    this.f8576c0 = f8 - f9;
                    iArr[1] = i8;
                }
                j(this.f8576c0);
            }
        }
        int[] iArr2 = this.f8579f0;
        if (dispatchNestedPreScroll(i - iArr[0], i8 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        d(view, i, i8, i9, i10, 0, this.f8581h0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f8577d0.f2964b = i;
        startNestedScroll(i & 2);
        this.f8576c0 = 0.0f;
        this.f8582i0 = true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0837j jVar = (C0837j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        setRefreshing(jVar.f11201U);
    }

    public final Parcelable onSaveInstanceState() {
        return new C0837j(super.onSaveInstanceState(), this.f8573W);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.f8573W || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public final void onStopNestedScroll(View view) {
        this.f8577d0.f2964b = 0;
        this.f8582i0 = false;
        float f8 = this.f8576c0;
        if (f8 > 0.0f) {
            i(f8);
            this.f8576c0 = 0.0f;
        }
        stopNestedScroll();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || g() || this.f8573W || this.f8582i0) {
            return false;
        }
        if (actionMasked == 0) {
            this.f8588o0 = motionEvent.getPointerId(0);
            this.f8587n0 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f8588o0);
            if (findPointerIndex < 0) {
                Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f8587n0) {
                this.f8587n0 = false;
                i((motionEvent.getY(findPointerIndex) - this.f8585l0) * 0.5f);
            }
            this.f8588o0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f8588o0);
            if (findPointerIndex2 < 0) {
                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y8 = motionEvent.getY(findPointerIndex2);
            n(y8);
            if (this.f8587n0) {
                float f8 = (y8 - this.f8585l0) * 0.5f;
                if (f8 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                j(f8);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f8588o0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.f8588o0) {
                    if (actionIndex2 == 0) {
                        i = 1;
                    }
                    this.f8588o0 = motionEvent.getPointerId(i);
                }
            }
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f8571U;
        if (view != null) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            if (!C1553z.i(view)) {
                if (!this.f8567D0 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f8) {
        this.f8589q0.setScaleX(f8);
        this.f8589q0.setScaleY(f8);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        C0832e eVar = this.f8595w0;
        C0831d dVar = eVar.f11191U;
        dVar.i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = f.b(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f8575b0 = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f8567D0 = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        C1539l lVar = this.f8578e0;
        if (lVar.f15957d) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            C1553z.n(lVar.f15956c);
        }
        lVar.f15957d = z;
    }

    public void setOnChildScrollUpCallback(C0835h hVar) {
    }

    public void setOnRefreshListener(C0836i iVar) {
        this.f8572V = iVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f8589q0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(f.b(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f8573W == z) {
            m(z, false);
            return;
        }
        this.f8573W = z;
        setTargetOffsetTopAndBottom((this.f8593u0 + this.f8592t0) - this.f8584k0);
        this.f8565B0 = false;
        C0833f fVar = this.f8568E0;
        this.f8589q0.setVisibility(0);
        this.f8595w0.setAlpha(255);
        C0834g gVar = new C0834g(this, 0);
        this.f8596x0 = gVar;
        gVar.setDuration((long) this.f8583j0);
        if (fVar != null) {
            this.f8589q0.f11163U = fVar;
        }
        this.f8589q0.clearAnimation();
        this.f8589q0.startAnimation(this.f8596x0);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f8566C0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f8566C0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f8589q0.setImageDrawable((Drawable) null);
            this.f8595w0.c(i);
            this.f8589q0.setImageDrawable(this.f8595w0);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f8594v0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f8589q0.bringToFront();
        C1510H.k(this.f8589q0, i);
        this.f8584k0 = this.f8589q0.getTop();
    }

    public final boolean startNestedScroll(int i) {
        return this.f8578e0.g(i, 0);
    }

    public final void stopNestedScroll() {
        this.f8578e0.h(0);
    }
}
