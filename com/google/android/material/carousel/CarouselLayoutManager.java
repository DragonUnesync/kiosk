package com.google.android.material.carousel;

import Q0.d;
import Q0.g;
import U.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.Z;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import f3.C0899a;
import m3.C1209a;
import m3.C1210b;
import m3.C1212d;

public class CarouselLayoutManager extends Q implements e0 {

    /* renamed from: j0  reason: collision with root package name */
    public final C1212d f9242j0;

    /* renamed from: k0  reason: collision with root package name */
    public d f9243k0;

    /* renamed from: l0  reason: collision with root package name */
    public final View.OnLayoutChangeListener f9244l0;

    public CarouselLayoutManager() {
        C1212d dVar = new C1212d();
        new C1209a();
        this.f9244l0 = new f(3, this);
        this.f9242j0 = dVar;
        z0();
        Q0(0);
    }

    public final int A0(int i, Z z, f0 f0Var) {
        if (!O0() || G() == 0 || i == 0) {
            return 0;
        }
        View view = z.l(0, Long.MAX_VALUE).itemView;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void B0(int i) {
    }

    public final S C() {
        return new S(-2, -2);
    }

    public final int C0(int i, Z z, f0 f0Var) {
        if (!p() || G() == 0 || i == 0) {
            return 0;
        }
        View view = z.l(0, Long.MAX_VALUE).itemView;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void K(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        rect.centerY();
        if (O0()) {
            rect.centerX();
        }
        throw null;
    }

    public final void L0(RecyclerView recyclerView, int i) {
        A a8 = new A(this, recyclerView.getContext(), 1);
        a8.f8547a = i;
        M0(a8);
    }

    public final boolean O0() {
        if (this.f9243k0.f4018V == 0) {
            return true;
        }
        return false;
    }

    public final boolean P0() {
        if (!O0() || R() != 1) {
            return false;
        }
        return true;
    }

    public final void Q0(int i) {
        C1210b bVar;
        if (i == 0 || i == 1) {
            m((String) null);
            d dVar = this.f9243k0;
            if (dVar == null || i != dVar.f4018V) {
                if (i == 0) {
                    bVar = new C1210b(this, 1);
                } else if (i == 1) {
                    bVar = new C1210b(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.f9243k0 = bVar;
                z0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(g.m(i, "invalid orientation:"));
    }

    public final boolean W() {
        return true;
    }

    public final void c0(RecyclerView recyclerView) {
        C1212d dVar = this.f9242j0;
        Context context = recyclerView.getContext();
        float f8 = dVar.f13352a;
        if (f8 <= 0.0f) {
            f8 = context.getResources().getDimension(2131165467);
        }
        dVar.f13352a = f8;
        float f9 = dVar.f13353b;
        if (f9 <= 0.0f) {
            f9 = context.getResources().getDimension(2131165466);
        }
        dVar.f13353b = f9;
        z0();
        recyclerView.addOnLayoutChangeListener(this.f9244l0);
    }

    public final void d0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f9244l0);
    }

    public final PointF e(int i) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r7 == 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (P0() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r7 == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (P0() != false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View e0(android.view.View r5, int r6, androidx.recyclerview.widget.Z r7, androidx.recyclerview.widget.f0 r8) {
        /*
            r4 = this;
            int r7 = r4.G()
            r8 = 0
            if (r7 != 0) goto L_0x0008
            return r8
        L_0x0008:
            Q0.d r7 = r4.f9243k0
            int r7 = r7.f4018V
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L_0x0054
            r3 = 2
            if (r6 == r3) goto L_0x0052
            r3 = 17
            if (r6 == r3) goto L_0x004a
            r3 = 33
            if (r6 == r3) goto L_0x0047
            r3 = 66
            if (r6 == r3) goto L_0x003e
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L_0x003b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L_0x0038:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0055
        L_0x003b:
            if (r7 != r2) goto L_0x0038
            goto L_0x0052
        L_0x003e:
            if (r7 != 0) goto L_0x0038
            boolean r6 = r4.P0()
            if (r6 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0047:
            if (r7 != r2) goto L_0x0038
            goto L_0x0054
        L_0x004a:
            if (r7 != 0) goto L_0x0038
            boolean r6 = r4.P0()
            if (r6 == 0) goto L_0x0054
        L_0x0052:
            r6 = 1
            goto L_0x0055
        L_0x0054:
            r6 = -1
        L_0x0055:
            if (r6 != r0) goto L_0x0058
            return r8
        L_0x0058:
            r7 = 0
            if (r6 != r1) goto L_0x008c
            int r5 = androidx.recyclerview.widget.Q.S(r5)
            if (r5 != 0) goto L_0x0062
            return r8
        L_0x0062:
            android.view.View r5 = r4.F(r7)
            int r5 = androidx.recyclerview.widget.Q.S(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x007b
            int r6 = r4.Q()
            if (r5 < r6) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            Q0.d r5 = r4.f9243k0
            r5.h()
            r5 = 0
            throw r5
        L_0x007b:
            boolean r5 = r4.P0()
            if (r5 == 0) goto L_0x0087
            int r5 = r4.G()
            int r7 = r5 + -1
        L_0x0087:
            android.view.View r5 = r4.F(r7)
            goto L_0x00c7
        L_0x008c:
            int r5 = androidx.recyclerview.widget.Q.S(r5)
            int r6 = r4.Q()
            int r6 = r6 - r2
            if (r5 != r6) goto L_0x0098
            return r8
        L_0x0098:
            int r5 = r4.G()
            int r5 = r5 - r2
            android.view.View r5 = r4.F(r5)
            int r5 = androidx.recyclerview.widget.Q.S(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto L_0x00b6
            int r6 = r4.Q()
            if (r5 < r6) goto L_0x00af
            goto L_0x00b6
        L_0x00af:
            Q0.d r5 = r4.f9243k0
            r5.h()
            r5 = 0
            throw r5
        L_0x00b6:
            boolean r5 = r4.P0()
            if (r5 == 0) goto L_0x00bd
            goto L_0x00c3
        L_0x00bd:
            int r5 = r4.G()
            int r7 = r5 + -1
        L_0x00c3:
            android.view.View r5 = r4.F(r7)
        L_0x00c7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.e0(android.view.View, int, androidx.recyclerview.widget.Z, androidx.recyclerview.widget.f0):android.view.View");
    }

    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (G() > 0) {
            accessibilityEvent.setFromIndex(Q.S(F(0)));
            accessibilityEvent.setToIndex(Q.S(F(G() - 1)));
        }
    }

    public final void j0(int i, int i8) {
        Q();
    }

    public final void m0(int i, int i8) {
        Q();
    }

    public final boolean o() {
        return O0();
    }

    public final boolean p() {
        return !O0();
    }

    public final void p0(Z z, f0 f0Var) {
        int i;
        if (f0Var.b() > 0) {
            if (O0()) {
                i = this.f8321h0;
            } else {
                i = this.f8322i0;
            }
            if (((float) i) > 0.0f) {
                P0();
                View view = z.l(0, Long.MAX_VALUE).itemView;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        v0(z);
    }

    public final void q0(f0 f0Var) {
        if (G() != 0) {
            Q.S(F(0));
        }
    }

    public final int u(f0 f0Var) {
        G();
        return 0;
    }

    public final int v(f0 f0Var) {
        return 0;
    }

    public final int w(f0 f0Var) {
        return 0;
    }

    public final int x(f0 f0Var) {
        G();
        return 0;
    }

    public final int y(f0 f0Var) {
        return 0;
    }

    public final boolean y0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z6) {
        return false;
    }

    public final int z(f0 f0Var) {
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        new C1209a();
        this.f9244l0 = new f(3, this);
        this.f9242j0 = new C1212d();
        z0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11650b);
            obtainStyledAttributes.getInt(0, 0);
            z0();
            Q0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
