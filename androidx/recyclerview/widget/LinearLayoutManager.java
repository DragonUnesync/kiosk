package androidx.recyclerview.widget;

import Q7.g;
import T0.C;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.f;
import java.util.List;

public class LinearLayoutManager extends Q implements e0 {

    /* renamed from: j0  reason: collision with root package name */
    public int f8283j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public C0511w f8284k0;

    /* renamed from: l0  reason: collision with root package name */
    public f f8285l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8286m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f8287n0 = false;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8288o0 = false;
    public boolean p0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f8289q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public int f8290r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public int f8291s0 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: t0  reason: collision with root package name */
    public C0512x f8292t0 = null;

    /* renamed from: u0  reason: collision with root package name */
    public final C f8293u0 = new C();

    /* renamed from: v0  reason: collision with root package name */
    public final C0510v f8294v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public final int f8295w0 = 2;

    /* renamed from: x0  reason: collision with root package name */
    public final int[] f8296x0 = new int[2];

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.recyclerview.widget.v, java.lang.Object] */
    public LinearLayoutManager(int i) {
        o1(i);
        m((String) null);
        if (this.f8287n0) {
            this.f8287n0 = false;
            z0();
        }
    }

    public int A0(int i, Z z, f0 f0Var) {
        if (this.f8283j0 == 1) {
            return 0;
        }
        return n1(i, z, f0Var);
    }

    public final View B(int i) {
        int G8 = G();
        if (G8 == 0) {
            return null;
        }
        int S8 = i - Q.S(F(0));
        if (S8 >= 0 && S8 < G8) {
            View F8 = F(S8);
            if (Q.S(F8) == i) {
                return F8;
            }
        }
        return super.B(i);
    }

    public final void B0(int i) {
        this.f8290r0 = i;
        this.f8291s0 = RecyclerView.UNDEFINED_DURATION;
        C0512x xVar = this.f8292t0;
        if (xVar != null) {
            xVar.f8544U = -1;
        }
        z0();
    }

    public S C() {
        return new S(-2, -2);
    }

    public int C0(int i, Z z, f0 f0Var) {
        if (this.f8283j0 == 0) {
            return 0;
        }
        return n1(i, z, f0Var);
    }

    public final boolean J0() {
        if (this.f8320g0 == 1073741824 || this.f8319f0 == 1073741824) {
            return false;
        }
        int G8 = G();
        for (int i = 0; i < G8; i++) {
            ViewGroup.LayoutParams layoutParams = F(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void L0(RecyclerView recyclerView, int i) {
        C0513y yVar = new C0513y(recyclerView.getContext());
        yVar.f8547a = i;
        M0(yVar);
    }

    public boolean N0() {
        if (this.f8292t0 == null && this.f8286m0 == this.p0) {
            return true;
        }
        return false;
    }

    public void O0(f0 f0Var, int[] iArr) {
        int i;
        int i8;
        if (f0Var.f8395a != -1) {
            i = this.f8285l0.l();
        } else {
            i = 0;
        }
        if (this.f8284k0.f8538f == -1) {
            i8 = 0;
        } else {
            i8 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i8;
    }

    public void P0(f0 f0Var, C0511w wVar, C0506q qVar) {
        int i = wVar.f8537d;
        if (i >= 0 && i < f0Var.b()) {
            qVar.a(i, Math.max(0, wVar.f8539g));
        }
    }

    public final int Q0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        U0();
        f fVar = this.f8285l0;
        boolean z = !this.f8289q0;
        return g.l(f0Var, fVar, X0(z), W0(z), this, this.f8289q0);
    }

    public final int R0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        U0();
        f fVar = this.f8285l0;
        boolean z = !this.f8289q0;
        return g.m(f0Var, fVar, X0(z), W0(z), this, this.f8289q0, this.f8288o0);
    }

    public final int S0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        U0();
        f fVar = this.f8285l0;
        boolean z = !this.f8289q0;
        return g.n(f0Var, fVar, X0(z), W0(z), this, this.f8289q0);
    }

    public final int T0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f8283j0 == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        } else if (this.f8283j0 == 0) {
                            return 1;
                        } else {
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                    } else if (this.f8283j0 == 1) {
                        return -1;
                    } else {
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                } else if (this.f8283j0 == 0) {
                    return -1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f8283j0 != 1 && h1()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f8283j0 != 1 && h1()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.recyclerview.widget.w, java.lang.Object] */
    public final void U0() {
        if (this.f8284k0 == null) {
            ? obj = new Object();
            obj.f8534a = true;
            obj.f8540h = 0;
            obj.i = 0;
            obj.f8542k = null;
            this.f8284k0 = obj;
        }
    }

    public final int V0(Z z, C0511w wVar, f0 f0Var, boolean z6) {
        int i;
        int i8 = wVar.f8536c;
        int i9 = wVar.f8539g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                wVar.f8539g = i9 + i8;
            }
            k1(z, wVar);
        }
        int i10 = wVar.f8536c + wVar.f8540h;
        while (true) {
            if ((!wVar.f8543l && i10 <= 0) || (i = wVar.f8537d) < 0 || i >= f0Var.b()) {
                break;
            }
            C0510v vVar = this.f8294v0;
            vVar.f8530a = 0;
            vVar.f8531b = false;
            vVar.f8532c = false;
            vVar.f8533d = false;
            i1(z, f0Var, wVar, vVar);
            if (!vVar.f8531b) {
                int i11 = wVar.f8535b;
                int i12 = vVar.f8530a;
                wVar.f8535b = (wVar.f8538f * i12) + i11;
                if (!vVar.f8532c || wVar.f8542k != null || !f0Var.f8400g) {
                    wVar.f8536c -= i12;
                    i10 -= i12;
                }
                int i13 = wVar.f8539g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    wVar.f8539g = i14;
                    int i15 = wVar.f8536c;
                    if (i15 < 0) {
                        wVar.f8539g = i14 + i15;
                    }
                    k1(z, wVar);
                }
                if (z6 && vVar.f8533d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - wVar.f8536c;
    }

    public final boolean W() {
        return true;
    }

    public final View W0(boolean z) {
        if (this.f8288o0) {
            return b1(0, G(), z);
        }
        return b1(G() - 1, -1, z);
    }

    public final View X0(boolean z) {
        if (this.f8288o0) {
            return b1(G() - 1, -1, z);
        }
        return b1(0, G(), z);
    }

    public final int Y0() {
        View b12 = b1(0, G(), false);
        if (b12 == null) {
            return -1;
        }
        return Q.S(b12);
    }

    public final int Z0() {
        View b12 = b1(G() - 1, -1, false);
        if (b12 == null) {
            return -1;
        }
        return Q.S(b12);
    }

    public final View a1(int i, int i8) {
        int i9;
        int i10;
        U0();
        if (i8 <= i && i8 >= i) {
            return F(i);
        }
        if (this.f8285l0.e(F(i)) < this.f8285l0.k()) {
            i10 = 16644;
            i9 = 16388;
        } else {
            i10 = 4161;
            i9 = 4097;
        }
        if (this.f8283j0 == 0) {
            return this.f8310W.b0(i, i8, i10, i9);
        }
        return this.f8311X.b0(i, i8, i10, i9);
    }

    public final View b1(int i, int i8, boolean z) {
        int i9;
        U0();
        if (z) {
            i9 = 24579;
        } else {
            i9 = 320;
        }
        if (this.f8283j0 == 0) {
            return this.f8310W.b0(i, i8, i9, 320);
        }
        return this.f8311X.b0(i, i8, i9, 320);
    }

    public View c1(Z z, f0 f0Var, boolean z6, boolean z8) {
        int i;
        int i8;
        int i9;
        boolean z9;
        boolean z10;
        U0();
        int G8 = G();
        if (z8) {
            i9 = G() - 1;
            i8 = -1;
            i = -1;
        } else {
            i8 = G8;
            i9 = 0;
            i = 1;
        }
        int b8 = f0Var.b();
        int k8 = this.f8285l0.k();
        int g8 = this.f8285l0.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i9 != i8) {
            View F8 = F(i9);
            int S8 = Q.S(F8);
            int e = this.f8285l0.e(F8);
            int b9 = this.f8285l0.b(F8);
            if (S8 >= 0 && S8 < b8) {
                if (!((S) F8.getLayoutParams()).f8323U.isRemoved()) {
                    if (b9 > k8 || e >= k8) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (e < g8 || b9 <= g8) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z9 && !z10) {
                        return F8;
                    }
                    if (z6) {
                        if (!z10) {
                            if (view != null) {
                            }
                            view = F8;
                        }
                    } else if (!z9) {
                        if (view != null) {
                        }
                        view = F8;
                    }
                    view2 = F8;
                } else if (view3 == null) {
                    view3 = F8;
                }
            }
            i9 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final void d0(RecyclerView recyclerView) {
    }

    public final int d1(int i, Z z, f0 f0Var, boolean z6) {
        int g8;
        int g9 = this.f8285l0.g() - i;
        if (g9 <= 0) {
            return 0;
        }
        int i8 = -n1(-g9, z, f0Var);
        int i9 = i + i8;
        if (!z6 || (g8 = this.f8285l0.g() - i9) <= 0) {
            return i8;
        }
        this.f8285l0.p(g8);
        return g8 + i8;
    }

    public final PointF e(int i) {
        if (G() == 0) {
            return null;
        }
        boolean z = false;
        int i8 = 1;
        if (i < Q.S(F(0))) {
            z = true;
        }
        if (z != this.f8288o0) {
            i8 = -1;
        }
        if (this.f8283j0 == 0) {
            return new PointF((float) i8, 0.0f);
        }
        return new PointF(0.0f, (float) i8);
    }

    public View e0(View view, int i, Z z, f0 f0Var) {
        int T02;
        View view2;
        View view3;
        m1();
        if (G() == 0 || (T02 = T0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        U0();
        q1(T02, (int) (((float) this.f8285l0.l()) * 0.33333334f), false, f0Var);
        C0511w wVar = this.f8284k0;
        wVar.f8539g = RecyclerView.UNDEFINED_DURATION;
        wVar.f8534a = false;
        V0(z, wVar, f0Var, true);
        if (T02 == -1) {
            if (this.f8288o0) {
                view2 = a1(G() - 1, -1);
            } else {
                view2 = a1(0, G());
            }
        } else if (this.f8288o0) {
            view2 = a1(0, G());
        } else {
            view2 = a1(G() - 1, -1);
        }
        if (T02 == -1) {
            view3 = g1();
        } else {
            view3 = f1();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public final int e1(int i, Z z, f0 f0Var, boolean z6) {
        int k8;
        int k9 = i - this.f8285l0.k();
        if (k9 <= 0) {
            return 0;
        }
        int i8 = -n1(k9, z, f0Var);
        int i9 = i + i8;
        if (!z6 || (k8 = i9 - this.f8285l0.k()) <= 0) {
            return i8;
        }
        this.f8285l0.p(-k8);
        return i8 - k8;
    }

    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (G() > 0) {
            accessibilityEvent.setFromIndex(Y0());
            accessibilityEvent.setToIndex(Z0());
        }
    }

    public final View f1() {
        int i;
        if (this.f8288o0) {
            i = 0;
        } else {
            i = G() - 1;
        }
        return F(i);
    }

    public final View g1() {
        int i;
        if (this.f8288o0) {
            i = G() - 1;
        } else {
            i = 0;
        }
        return F(i);
    }

    public final boolean h1() {
        if (R() == 1) {
            return true;
        }
        return false;
    }

    public void i1(Z z, f0 f0Var, C0511w wVar, C0510v vVar) {
        int i;
        int i8;
        int i9;
        int i10;
        boolean z6;
        boolean z8;
        View b8 = wVar.b(z);
        if (b8 == null) {
            vVar.f8531b = true;
            return;
        }
        S s8 = (S) b8.getLayoutParams();
        if (wVar.f8542k == null) {
            boolean z9 = this.f8288o0;
            if (wVar.f8538f == -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z9 == z8) {
                l(b8, -1, false);
            } else {
                l(b8, 0, false);
            }
        } else {
            boolean z10 = this.f8288o0;
            if (wVar.f8538f == -1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z10 == z6) {
                l(b8, -1, true);
            } else {
                l(b8, 0, true);
            }
        }
        S s9 = (S) b8.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f8309V.getItemDecorInsetsForChild(b8);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
        int H8 = Q.H(this.f8321h0, this.f8319f0, getPaddingRight() + getPaddingLeft() + s9.leftMargin + s9.rightMargin + i11, s9.width, o());
        int H9 = Q.H(this.f8322i0, this.f8320g0, getPaddingBottom() + getPaddingTop() + s9.topMargin + s9.bottomMargin + i12, s9.height, p());
        if (I0(b8, H8, H9, s9)) {
            b8.measure(H8, H9);
        }
        vVar.f8530a = this.f8285l0.c(b8);
        if (this.f8283j0 == 1) {
            if (h1()) {
                i10 = this.f8321h0 - getPaddingRight();
                i9 = i10 - this.f8285l0.d(b8);
            } else {
                i9 = getPaddingLeft();
                i10 = this.f8285l0.d(b8) + i9;
            }
            if (wVar.f8538f == -1) {
                i = wVar.f8535b;
                i8 = i - vVar.f8530a;
            } else {
                i8 = wVar.f8535b;
                i = vVar.f8530a + i8;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d8 = this.f8285l0.d(b8) + paddingTop;
            if (wVar.f8538f == -1) {
                int i13 = wVar.f8535b;
                int i14 = i13 - vVar.f8530a;
                int i15 = paddingTop;
                i10 = i13;
                i = d8;
                i9 = i14;
                i8 = i15;
            } else {
                int i16 = wVar.f8535b;
                int i17 = vVar.f8530a + i16;
                int i18 = d8;
                i9 = i16;
                i = i18;
                int i19 = i17;
                i8 = paddingTop;
                i10 = i19;
            }
        }
        Q.Y(b8, i9, i8, i10, i);
        if (s8.f8323U.isRemoved() || s8.f8323U.isUpdated()) {
            vVar.f8532c = true;
        }
        vVar.f8533d = b8.hasFocusable();
    }

    public void j1(Z z, f0 f0Var, C c8, int i) {
    }

    public final void k1(Z z, C0511w wVar) {
        if (wVar.f8534a && !wVar.f8543l) {
            int i = wVar.f8539g;
            int i8 = wVar.i;
            if (wVar.f8538f == -1) {
                int G8 = G();
                if (i >= 0) {
                    int f8 = (this.f8285l0.f() - i) + i8;
                    if (this.f8288o0) {
                        for (int i9 = 0; i9 < G8; i9++) {
                            View F8 = F(i9);
                            if (this.f8285l0.e(F8) < f8 || this.f8285l0.o(F8) < f8) {
                                l1(z, 0, i9);
                                return;
                            }
                        }
                        return;
                    }
                    int i10 = G8 - 1;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        View F9 = F(i11);
                        if (this.f8285l0.e(F9) < f8 || this.f8285l0.o(F9) < f8) {
                            l1(z, i10, i11);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i12 = i - i8;
                int G9 = G();
                if (this.f8288o0) {
                    int i13 = G9 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View F10 = F(i14);
                        if (this.f8285l0.b(F10) > i12 || this.f8285l0.n(F10) > i12) {
                            l1(z, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                for (int i15 = 0; i15 < G9; i15++) {
                    View F11 = F(i15);
                    if (this.f8285l0.b(F11) > i12 || this.f8285l0.n(F11) > i12) {
                        l1(z, 0, i15);
                        return;
                    }
                }
            }
        }
    }

    public final void l1(Z z, int i, int i8) {
        if (i != i8) {
            if (i8 > i) {
                for (int i9 = i8 - 1; i9 >= i; i9--) {
                    View F8 = F(i9);
                    if (F(i9) != null) {
                        this.f8308U.j(i9);
                    }
                    z.i(F8);
                }
                return;
            }
            while (i > i8) {
                View F9 = F(i);
                if (F(i) != null) {
                    this.f8308U.j(i);
                }
                z.i(F9);
                i--;
            }
        }
    }

    public final void m(String str) {
        if (this.f8292t0 == null) {
            super.m(str);
        }
    }

    public final void m1() {
        if (this.f8283j0 == 1 || !h1()) {
            this.f8288o0 = this.f8287n0;
        } else {
            this.f8288o0 = !this.f8287n0;
        }
    }

    public final int n1(int i, Z z, f0 f0Var) {
        int i8;
        if (G() == 0 || i == 0) {
            return 0;
        }
        U0();
        this.f8284k0.f8534a = true;
        if (i > 0) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        int abs = Math.abs(i);
        q1(i8, abs, true, f0Var);
        C0511w wVar = this.f8284k0;
        int V02 = V0(z, wVar, f0Var, false) + wVar.f8539g;
        if (V02 < 0) {
            return 0;
        }
        if (abs > V02) {
            i = i8 * V02;
        }
        this.f8285l0.p(-i);
        this.f8284k0.f8541j = i;
        return i;
    }

    public final boolean o() {
        if (this.f8283j0 == 0) {
            return true;
        }
        return false;
    }

    public final void o1(int i) {
        if (i == 0 || i == 1) {
            m((String) null);
            if (i != this.f8283j0 || this.f8285l0 == null) {
                f a8 = f.a(this, i);
                this.f8285l0 = a8;
                this.f8293u0.f4612f = a8;
                this.f8283j0 = i;
                z0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(Q0.g.m(i, "invalid orientation:"));
    }

    public final boolean p() {
        if (this.f8283j0 == 1) {
            return true;
        }
        return false;
    }

    public void p0(Z z, f0 f0Var) {
        View view;
        int i;
        boolean z6;
        int i8;
        int i9;
        List list;
        boolean z8;
        int i10;
        int i11;
        int d12;
        int i12;
        View B8;
        int e;
        int i13;
        int i14;
        View view2;
        View c12;
        boolean z9;
        boolean z10;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        Z z13 = z;
        f0 f0Var2 = f0Var;
        int i18 = -1;
        if (!(this.f8292t0 == null && this.f8290r0 == -1) && f0Var.b() == 0) {
            v0(z);
            return;
        }
        C0512x xVar = this.f8292t0;
        if (xVar != null && (i17 = xVar.f8544U) >= 0) {
            this.f8290r0 = i17;
        }
        U0();
        this.f8284k0.f8534a = false;
        m1();
        RecyclerView recyclerView = this.f8309V;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.f8308U.f8374c.contains(view)) {
            view = null;
        }
        C c8 = this.f8293u0;
        if (!c8.f4611d || this.f8290r0 != -1 || this.f8292t0 != null) {
            c8.g();
            c8.f4610c = this.f8288o0 ^ this.p0;
            if (!f0Var2.f8400g && (i15 = this.f8290r0) != -1) {
                if (i15 < 0 || i15 >= f0Var.b()) {
                    this.f8290r0 = -1;
                    this.f8291s0 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    int i19 = this.f8290r0;
                    c8.f4609b = i19;
                    C0512x xVar2 = this.f8292t0;
                    if (xVar2 == null || xVar2.f8544U < 0) {
                        if (this.f8291s0 == Integer.MIN_VALUE) {
                            View B9 = B(i19);
                            if (B9 == null) {
                                if (G() > 0) {
                                    if (this.f8290r0 < Q.S(F(0))) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 == this.f8288o0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    c8.f4610c = z12;
                                }
                                c8.b();
                            } else if (this.f8285l0.c(B9) > this.f8285l0.l()) {
                                c8.b();
                            } else if (this.f8285l0.e(B9) - this.f8285l0.k() < 0) {
                                c8.e = this.f8285l0.k();
                                c8.f4610c = false;
                            } else if (this.f8285l0.g() - this.f8285l0.b(B9) < 0) {
                                c8.e = this.f8285l0.g();
                                c8.f4610c = true;
                            } else {
                                if (c8.f4610c) {
                                    i16 = this.f8285l0.m() + this.f8285l0.b(B9);
                                } else {
                                    i16 = this.f8285l0.e(B9);
                                }
                                c8.e = i16;
                            }
                        } else {
                            boolean z14 = this.f8288o0;
                            c8.f4610c = z14;
                            if (z14) {
                                c8.e = this.f8285l0.g() - this.f8291s0;
                            } else {
                                c8.e = this.f8285l0.k() + this.f8291s0;
                            }
                        }
                        c8.f4611d = true;
                    } else {
                        boolean z15 = xVar2.f8546W;
                        c8.f4610c = z15;
                        if (z15) {
                            c8.e = this.f8285l0.g() - this.f8292t0.f8545V;
                        } else {
                            c8.e = this.f8285l0.k() + this.f8292t0.f8545V;
                        }
                        c8.f4611d = true;
                    }
                }
            }
            if (G() != 0) {
                RecyclerView recyclerView2 = this.f8309V;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.f8308U.f8374c.contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    S s8 = (S) view2.getLayoutParams();
                    if (!s8.f8323U.isRemoved() && s8.f8323U.getLayoutPosition() >= 0 && s8.f8323U.getLayoutPosition() < f0Var.b()) {
                        c8.d(view2, Q.S(view2));
                        c8.f4611d = true;
                    }
                }
                boolean z16 = this.f8286m0;
                boolean z17 = this.p0;
                if (z16 == z17 && (c12 = c1(z13, f0Var2, c8.f4610c, z17)) != null) {
                    c8.c(c12, Q.S(c12));
                    if (!f0Var2.f8400g && N0()) {
                        int e8 = this.f8285l0.e(c12);
                        int b8 = this.f8285l0.b(c12);
                        int k8 = this.f8285l0.k();
                        int g8 = this.f8285l0.g();
                        if (b8 > k8 || e8 >= k8) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (e8 < g8 || b8 <= g8) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z9 || z10) {
                            if (c8.f4610c) {
                                k8 = g8;
                            }
                            c8.e = k8;
                        }
                    }
                    c8.f4611d = true;
                }
            }
            c8.b();
            if (this.p0) {
                i14 = f0Var.b() - 1;
            } else {
                i14 = 0;
            }
            c8.f4609b = i14;
            c8.f4611d = true;
        } else if (view != null && (this.f8285l0.e(view) >= this.f8285l0.g() || this.f8285l0.b(view) <= this.f8285l0.k())) {
            c8.d(view, Q.S(view));
        }
        C0511w wVar = this.f8284k0;
        if (wVar.f8541j >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        wVar.f8538f = i;
        int[] iArr = this.f8296x0;
        iArr[0] = 0;
        iArr[1] = 0;
        O0(f0Var2, iArr);
        int k9 = this.f8285l0.k() + Math.max(0, iArr[0]);
        int h5 = this.f8285l0.h() + Math.max(0, iArr[1]);
        if (!(!f0Var2.f8400g || (i12 = this.f8290r0) == -1 || this.f8291s0 == Integer.MIN_VALUE || (B8 = B(i12)) == null)) {
            if (this.f8288o0) {
                i13 = this.f8285l0.g() - this.f8285l0.b(B8);
                e = this.f8291s0;
            } else {
                e = this.f8285l0.e(B8) - this.f8285l0.k();
                i13 = this.f8291s0;
            }
            int i20 = i13 - e;
            if (i20 > 0) {
                k9 += i20;
            } else {
                h5 -= i20;
            }
        }
        if (!c8.f4610c ? !this.f8288o0 : this.f8288o0) {
            i18 = 1;
        }
        j1(z13, f0Var2, c8, i18);
        A(z);
        C0511w wVar2 = this.f8284k0;
        if (this.f8285l0.i() == 0 && this.f8285l0.f() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        wVar2.f8543l = z6;
        this.f8284k0.getClass();
        this.f8284k0.i = 0;
        if (c8.f4610c) {
            s1(c8.f4609b, c8.e);
            C0511w wVar3 = this.f8284k0;
            wVar3.f8540h = k9;
            V0(z13, wVar3, f0Var2, false);
            C0511w wVar4 = this.f8284k0;
            i9 = wVar4.f8535b;
            int i21 = wVar4.f8537d;
            int i22 = wVar4.f8536c;
            if (i22 > 0) {
                h5 += i22;
            }
            r1(c8.f4609b, c8.e);
            C0511w wVar5 = this.f8284k0;
            wVar5.f8540h = h5;
            wVar5.f8537d += wVar5.e;
            V0(z13, wVar5, f0Var2, false);
            C0511w wVar6 = this.f8284k0;
            i8 = wVar6.f8535b;
            int i23 = wVar6.f8536c;
            if (i23 > 0) {
                s1(i21, i9);
                C0511w wVar7 = this.f8284k0;
                wVar7.f8540h = i23;
                V0(z13, wVar7, f0Var2, false);
                i9 = this.f8284k0.f8535b;
            }
        } else {
            r1(c8.f4609b, c8.e);
            C0511w wVar8 = this.f8284k0;
            wVar8.f8540h = h5;
            V0(z13, wVar8, f0Var2, false);
            C0511w wVar9 = this.f8284k0;
            i8 = wVar9.f8535b;
            int i24 = wVar9.f8537d;
            int i25 = wVar9.f8536c;
            if (i25 > 0) {
                k9 += i25;
            }
            s1(c8.f4609b, c8.e);
            C0511w wVar10 = this.f8284k0;
            wVar10.f8540h = k9;
            wVar10.f8537d += wVar10.e;
            V0(z13, wVar10, f0Var2, false);
            C0511w wVar11 = this.f8284k0;
            int i26 = wVar11.f8535b;
            int i27 = wVar11.f8536c;
            if (i27 > 0) {
                r1(i24, i8);
                C0511w wVar12 = this.f8284k0;
                wVar12.f8540h = i27;
                V0(z13, wVar12, f0Var2, false);
                i8 = this.f8284k0.f8535b;
            }
            i9 = i26;
        }
        if (G() > 0) {
            if (this.f8288o0 ^ this.p0) {
                int d13 = d1(i8, z13, f0Var2, true);
                i10 = i9 + d13;
                i11 = i8 + d13;
                d12 = e1(i10, z13, f0Var2, false);
            } else {
                int e12 = e1(i9, z13, f0Var2, true);
                i10 = i9 + e12;
                i11 = i8 + e12;
                d12 = d1(i11, z13, f0Var2, false);
            }
            i9 = i10 + d12;
            i8 = i11 + d12;
        }
        if (f0Var2.f8403k && G() != 0 && !f0Var2.f8400g && N0()) {
            List list2 = z13.f8358d;
            int size = list2.size();
            int S8 = Q.S(F(0));
            int i28 = 0;
            int i29 = 0;
            for (int i30 = 0; i30 < size; i30++) {
                j0 j0Var = (j0) list2.get(i30);
                if (!j0Var.isRemoved()) {
                    if (j0Var.getLayoutPosition() < S8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8 != this.f8288o0) {
                        i28 += this.f8285l0.c(j0Var.itemView);
                    } else {
                        i29 += this.f8285l0.c(j0Var.itemView);
                    }
                }
            }
            this.f8284k0.f8542k = list2;
            if (i28 > 0) {
                s1(Q.S(g1()), i9);
                C0511w wVar13 = this.f8284k0;
                wVar13.f8540h = i28;
                wVar13.f8536c = 0;
                wVar13.a((View) null);
                V0(z13, this.f8284k0, f0Var2, false);
            }
            if (i29 > 0) {
                r1(Q.S(f1()), i8);
                C0511w wVar14 = this.f8284k0;
                wVar14.f8540h = i29;
                wVar14.f8536c = 0;
                list = null;
                wVar14.a((View) null);
                V0(z13, this.f8284k0, f0Var2, false);
            } else {
                list = null;
            }
            this.f8284k0.f8542k = list;
        }
        if (!f0Var2.f8400g) {
            f fVar = this.f8285l0;
            fVar.f7785a = fVar.l();
        } else {
            c8.g();
        }
        this.f8286m0 = this.p0;
    }

    public void p1(boolean z) {
        m((String) null);
        if (this.p0 != z) {
            this.p0 = z;
            z0();
        }
    }

    public void q0(f0 f0Var) {
        this.f8292t0 = null;
        this.f8290r0 = -1;
        this.f8291s0 = RecyclerView.UNDEFINED_DURATION;
        this.f8293u0.g();
    }

    public final void q1(int i, int i8, boolean z, f0 f0Var) {
        boolean z6;
        int i9;
        int i10;
        C0511w wVar = this.f8284k0;
        boolean z8 = false;
        int i11 = 1;
        if (this.f8285l0.i() == 0 && this.f8285l0.f() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        wVar.f8543l = z6;
        this.f8284k0.f8538f = i;
        int[] iArr = this.f8296x0;
        iArr[0] = 0;
        iArr[1] = 0;
        O0(f0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z8 = true;
        }
        C0511w wVar2 = this.f8284k0;
        if (z8) {
            i9 = max2;
        } else {
            i9 = max;
        }
        wVar2.f8540h = i9;
        if (!z8) {
            max = max2;
        }
        wVar2.i = max;
        if (z8) {
            wVar2.f8540h = this.f8285l0.h() + i9;
            View f12 = f1();
            C0511w wVar3 = this.f8284k0;
            if (this.f8288o0) {
                i11 = -1;
            }
            wVar3.e = i11;
            int S8 = Q.S(f12);
            C0511w wVar4 = this.f8284k0;
            wVar3.f8537d = S8 + wVar4.e;
            wVar4.f8535b = this.f8285l0.b(f12);
            i10 = this.f8285l0.b(f12) - this.f8285l0.g();
        } else {
            View g12 = g1();
            C0511w wVar5 = this.f8284k0;
            wVar5.f8540h = this.f8285l0.k() + wVar5.f8540h;
            C0511w wVar6 = this.f8284k0;
            if (!this.f8288o0) {
                i11 = -1;
            }
            wVar6.e = i11;
            int S9 = Q.S(g12);
            C0511w wVar7 = this.f8284k0;
            wVar6.f8537d = S9 + wVar7.e;
            wVar7.f8535b = this.f8285l0.e(g12);
            i10 = (-this.f8285l0.e(g12)) + this.f8285l0.k();
        }
        C0511w wVar8 = this.f8284k0;
        wVar8.f8536c = i8;
        if (z) {
            wVar8.f8536c = i8 - i10;
        }
        wVar8.f8539g = i10;
    }

    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof C0512x) {
            C0512x xVar = (C0512x) parcelable;
            this.f8292t0 = xVar;
            if (this.f8290r0 != -1) {
                xVar.f8544U = -1;
            }
            z0();
        }
    }

    public final void r1(int i, int i8) {
        int i9;
        this.f8284k0.f8536c = this.f8285l0.g() - i8;
        C0511w wVar = this.f8284k0;
        if (this.f8288o0) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        wVar.e = i9;
        wVar.f8537d = i;
        wVar.f8538f = 1;
        wVar.f8535b = i8;
        wVar.f8539g = RecyclerView.UNDEFINED_DURATION;
    }

    public final void s(int i, int i8, f0 f0Var, C0506q qVar) {
        int i9;
        if (this.f8283j0 != 0) {
            i = i8;
        }
        if (G() != 0 && i != 0) {
            U0();
            if (i > 0) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            q1(i9, Math.abs(i), true, f0Var);
            P0(f0Var, this.f8284k0, qVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.recyclerview.widget.x, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v9, types: [androidx.recyclerview.widget.x, android.os.Parcelable, java.lang.Object] */
    public final Parcelable s0() {
        C0512x xVar = this.f8292t0;
        if (xVar != null) {
            ? obj = new Object();
            obj.f8544U = xVar.f8544U;
            obj.f8545V = xVar.f8545V;
            obj.f8546W = xVar.f8546W;
            return obj;
        }
        ? obj2 = new Object();
        if (G() > 0) {
            U0();
            boolean z = this.f8286m0 ^ this.f8288o0;
            obj2.f8546W = z;
            if (z) {
                View f12 = f1();
                obj2.f8545V = this.f8285l0.g() - this.f8285l0.b(f12);
                obj2.f8544U = Q.S(f12);
            } else {
                View g12 = g1();
                obj2.f8544U = Q.S(g12);
                obj2.f8545V = this.f8285l0.e(g12) - this.f8285l0.k();
            }
        } else {
            obj2.f8544U = -1;
        }
        return obj2;
    }

    public final void s1(int i, int i8) {
        int i9;
        this.f8284k0.f8536c = i8 - this.f8285l0.k();
        C0511w wVar = this.f8284k0;
        wVar.f8537d = i;
        if (this.f8288o0) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        wVar.e = i9;
        wVar.f8538f = -1;
        wVar.f8535b = i8;
        wVar.f8539g = RecyclerView.UNDEFINED_DURATION;
    }

    public final void t(int i, C0506q qVar) {
        int i8;
        boolean z;
        C0512x xVar = this.f8292t0;
        int i9 = -1;
        if (xVar == null || (i8 = xVar.f8544U) < 0) {
            m1();
            z = this.f8288o0;
            i8 = this.f8290r0;
            if (i8 == -1) {
                if (z) {
                    i8 = i - 1;
                } else {
                    i8 = 0;
                }
            }
        } else {
            z = xVar.f8546W;
        }
        if (!z) {
            i9 = 1;
        }
        for (int i10 = 0; i10 < this.f8295w0 && i8 >= 0 && i8 < i; i10++) {
            qVar.a(i8, 0);
            i8 += i9;
        }
    }

    public final int u(f0 f0Var) {
        return Q0(f0Var);
    }

    public int v(f0 f0Var) {
        return R0(f0Var);
    }

    public int w(f0 f0Var) {
        return S0(f0Var);
    }

    public final int x(f0 f0Var) {
        return Q0(f0Var);
    }

    public int y(f0 f0Var) {
        return R0(f0Var);
    }

    public int z(f0 f0Var) {
        return S0(f0Var);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.recyclerview.widget.v, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        P T8 = Q.T(context, attributeSet, i, i8);
        o1(T8.f8304a);
        boolean z = T8.f8306c;
        m((String) null);
        if (z != this.f8287n0) {
            this.f8287n0 = z;
            z0();
        }
        p1(T8.f8307d);
    }
}
