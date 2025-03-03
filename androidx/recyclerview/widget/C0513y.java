package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: androidx.recyclerview.widget.y  reason: case insensitive filesystem */
public class C0513y {

    /* renamed from: a  reason: collision with root package name */
    public int f8547a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f8548b;

    /* renamed from: c  reason: collision with root package name */
    public Q f8549c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8550d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public View f8551f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f8552g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8553h;
    public final LinearInterpolator i;

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f8554j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f8555k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f8556l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8557m;

    /* renamed from: n  reason: collision with root package name */
    public float f8558n;

    /* renamed from: o  reason: collision with root package name */
    public int f8559o;

    /* renamed from: p  reason: collision with root package name */
    public int f8560p;

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.recyclerview.widget.d0, java.lang.Object] */
    public C0513y(Context context) {
        ? obj = new Object();
        obj.f8383d = -1;
        obj.f8384f = false;
        obj.f8385g = 0;
        obj.f8380a = 0;
        obj.f8381b = 0;
        obj.f8382c = RecyclerView.UNDEFINED_DURATION;
        obj.e = null;
        this.f8552g = obj;
        this.i = new LinearInterpolator();
        this.f8554j = new DecelerateInterpolator();
        this.f8557m = false;
        this.f8559o = 0;
        this.f8560p = 0;
        this.f8556l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == -1) {
            return i10 - i8;
        }
        if (i12 == 0) {
            int i13 = i10 - i8;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i11 - i9;
            if (i14 < 0) {
                return i14;
            }
            return 0;
        } else if (i12 == 1) {
            return i11 - i9;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i8) {
        Q q7 = this.f8549c;
        if (q7 == null || !q7.o()) {
            return 0;
        }
        S s8 = (S) view.getLayoutParams();
        return a(Q.L(view) - s8.leftMargin, Q.O(view) + s8.rightMargin, q7.getPaddingLeft(), q7.f8321h0 - q7.getPaddingRight(), i8);
    }

    public int c(View view, int i8) {
        Q q7 = this.f8549c;
        if (q7 == null || !q7.p()) {
            return 0;
        }
        S s8 = (S) view.getLayoutParams();
        return a(Q.P(view) - s8.topMargin, Q.J(view) + s8.bottomMargin, q7.getPaddingTop(), q7.f8322i0 - q7.getPaddingBottom(), i8);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int e(int i8) {
        float abs = (float) Math.abs(i8);
        if (!this.f8557m) {
            this.f8558n = d(this.f8556l);
            this.f8557m = true;
        }
        return (int) Math.ceil((double) (abs * this.f8558n));
    }

    public PointF f(int i8) {
        Q q7 = this.f8549c;
        if (q7 instanceof e0) {
            return ((e0) q7).e(i8);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + e0.class.getCanonicalName());
        return null;
    }

    public final void g(int i8, int i9) {
        PointF f8;
        RecyclerView recyclerView = this.f8548b;
        if (this.f8547a == -1 || recyclerView == null) {
            i();
        }
        if (this.f8550d && this.f8551f == null && this.f8549c != null && (f8 = f(this.f8547a)) != null) {
            float f9 = f8.x;
            if (!(f9 == 0.0f && f8.y == 0.0f)) {
                recyclerView.scrollStep((int) Math.signum(f9), (int) Math.signum(f8.y), (int[]) null);
            }
        }
        boolean z = false;
        this.f8550d = false;
        View view = this.f8551f;
        d0 d0Var = this.f8552g;
        if (view != null) {
            if (this.f8548b.getChildLayoutPosition(view) == this.f8547a) {
                View view2 = this.f8551f;
                f0 f0Var = recyclerView.mState;
                h(view2, d0Var);
                d0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f8551f = null;
            }
        }
        if (this.e) {
            f0 f0Var2 = recyclerView.mState;
            if (this.f8548b.mLayout.G() == 0) {
                i();
            } else {
                int i10 = this.f8559o;
                int i11 = i10 - i8;
                if (i10 * i11 <= 0) {
                    i11 = 0;
                }
                this.f8559o = i11;
                int i12 = this.f8560p;
                int i13 = i12 - i9;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f8560p = i13;
                if (i11 == 0 && i13 == 0) {
                    PointF f10 = f(this.f8547a);
                    if (f10 != null) {
                        float f11 = f10.x;
                        if (!(f11 == 0.0f && f10.y == 0.0f)) {
                            float f12 = f10.y;
                            float sqrt = (float) Math.sqrt((double) ((f12 * f12) + (f11 * f11)));
                            float f13 = f10.x / sqrt;
                            f10.x = f13;
                            float f14 = f10.y / sqrt;
                            f10.y = f14;
                            this.f8555k = f10;
                            this.f8559o = (int) (f13 * 10000.0f);
                            this.f8560p = (int) (f14 * 10000.0f);
                            int e8 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            d0Var.f8380a = (int) (((float) this.f8559o) * 1.2f);
                            d0Var.f8381b = (int) (((float) this.f8560p) * 1.2f);
                            d0Var.f8382c = (int) (((float) e8) * 1.2f);
                            d0Var.e = linearInterpolator;
                            d0Var.f8384f = true;
                        }
                    }
                    d0Var.f8383d = this.f8547a;
                    i();
                }
            }
            if (d0Var.f8383d >= 0) {
                z = true;
            }
            d0Var.a(recyclerView);
            if (z && this.e) {
                this.f8550d = true;
                recyclerView.mViewFlinger.b();
            }
        }
    }

    public void h(View view, d0 d0Var) {
        int i8;
        int i9;
        int i10;
        PointF pointF = this.f8555k;
        int i11 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i8 = 0;
        } else if (i10 > 0) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        int b8 = b(view, i8);
        PointF pointF2 = this.f8555k;
        if (!(pointF2 == null || pointF2.y == 0.0f)) {
            i11 = i9 > 0 ? 1 : -1;
        }
        int c8 = c(view, i11);
        int ceil = (int) Math.ceil(((double) e((int) Math.sqrt((double) ((c8 * c8) + (b8 * b8))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f8554j;
            d0Var.f8380a = -b8;
            d0Var.f8381b = -c8;
            d0Var.f8382c = ceil;
            d0Var.e = decelerateInterpolator;
            d0Var.f8384f = true;
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.f8560p = 0;
            this.f8559o = 0;
            this.f8555k = null;
            this.f8548b.mState.f8395a = -1;
            this.f8551f = null;
            this.f8547a = -1;
            this.f8550d = false;
            Q q7 = this.f8549c;
            if (q7.f8312Y == this) {
                q7.f8312Y = null;
            }
            this.f8549c = null;
            this.f8548b = null;
        }
    }
}
