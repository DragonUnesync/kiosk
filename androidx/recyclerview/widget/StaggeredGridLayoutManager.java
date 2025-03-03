package androidx.recyclerview.widget;

import N5.c;
import Q5.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import v0.C1510H;

public class StaggeredGridLayoutManager extends Q implements e0 {

    /* renamed from: A0  reason: collision with root package name */
    public final Rect f8327A0;

    /* renamed from: B0  reason: collision with root package name */
    public final n0 f8328B0;

    /* renamed from: C0  reason: collision with root package name */
    public final boolean f8329C0;

    /* renamed from: D0  reason: collision with root package name */
    public int[] f8330D0;

    /* renamed from: E0  reason: collision with root package name */
    public final C0501l f8331E0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f8332j0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public final c[] f8333k0;

    /* renamed from: l0  reason: collision with root package name */
    public final f f8334l0;

    /* renamed from: m0  reason: collision with root package name */
    public final f f8335m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f8336n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f8337o0;
    public final C0509u p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f8338q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f8339r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public final BitSet f8340s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f8341t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public int f8342u0 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: v0  reason: collision with root package name */
    public final g f8343v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f8344w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f8345x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f8346y0;

    /* renamed from: z0  reason: collision with root package name */
    public q0 f8347z0;

    /* JADX WARNING: type inference failed for: r0v2, types: [Q5.g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [androidx.recyclerview.widget.u, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        ? obj = new Object();
        this.f8343v0 = obj;
        this.f8344w0 = 2;
        this.f8327A0 = new Rect();
        this.f8328B0 = new n0(this);
        this.f8329C0 = true;
        this.f8331E0 = new C0501l(1, this);
        P T8 = Q.T(context, attributeSet, i, i8);
        int i9 = T8.f8304a;
        if (i9 == 0 || i9 == 1) {
            m((String) null);
            if (i9 != this.f8336n0) {
                this.f8336n0 = i9;
                f fVar = this.f8334l0;
                this.f8334l0 = this.f8335m0;
                this.f8335m0 = fVar;
                z0();
            }
            int i10 = T8.f8305b;
            m((String) null);
            if (i10 != this.f8332j0) {
                obj.a();
                z0();
                this.f8332j0 = i10;
                this.f8340s0 = new BitSet(this.f8332j0);
                this.f8333k0 = new c[this.f8332j0];
                for (int i11 = 0; i11 < this.f8332j0; i11++) {
                    this.f8333k0[i11] = new c(this, i11);
                }
                z0();
            }
            boolean z = T8.f8306c;
            m((String) null);
            q0 q0Var = this.f8347z0;
            if (!(q0Var == null || q0Var.f8502b0 == z)) {
                q0Var.f8502b0 = z;
            }
            this.f8338q0 = z;
            z0();
            ? obj2 = new Object();
            obj2.f8523a = true;
            obj2.f8527f = 0;
            obj2.f8528g = 0;
            this.p0 = obj2;
            this.f8334l0 = f.a(this, this.f8336n0);
            this.f8335m0 = f.a(this, 1 - this.f8336n0);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int r1(int i, int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i8) - i9), mode);
        }
        return i;
    }

    public final int A0(int i, Z z, f0 f0Var) {
        return n1(i, z, f0Var);
    }

    public final void B0(int i) {
        q0 q0Var = this.f8347z0;
        if (!(q0Var == null || q0Var.f8495U == i)) {
            q0Var.f8498X = null;
            q0Var.f8497W = 0;
            q0Var.f8495U = -1;
            q0Var.f8496V = -1;
        }
        this.f8341t0 = i;
        this.f8342u0 = RecyclerView.UNDEFINED_DURATION;
        z0();
    }

    public final S C() {
        if (this.f8336n0 == 0) {
            return new S(-2, -1);
        }
        return new S(-1, -2);
    }

    public final int C0(int i, Z z, f0 f0Var) {
        return n1(i, z, f0Var);
    }

    public final S D(Context context, AttributeSet attributeSet) {
        return new S(context, attributeSet);
    }

    public final S E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new S((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new S(layoutParams);
    }

    public final void F0(Rect rect, int i, int i8) {
        int i9;
        int i10;
        int i11 = this.f8332j0;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f8336n0 == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f8309V;
            WeakHashMap weakHashMap = C1510H.f15874a;
            i10 = Q.r(i8, height, recyclerView.getMinimumHeight());
            i9 = Q.r(i, (this.f8337o0 * i11) + paddingRight, this.f8309V.getMinimumWidth());
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f8309V;
            WeakHashMap weakHashMap2 = C1510H.f15874a;
            i9 = Q.r(i, width, recyclerView2.getMinimumWidth());
            i10 = Q.r(i8, (this.f8337o0 * i11) + paddingBottom, this.f8309V.getMinimumHeight());
        }
        this.f8309V.setMeasuredDimension(i9, i10);
    }

    public final void L0(RecyclerView recyclerView, int i) {
        C0513y yVar = new C0513y(recyclerView.getContext());
        yVar.f8547a = i;
        M0(yVar);
    }

    public final boolean N0() {
        if (this.f8347z0 == null) {
            return true;
        }
        return false;
    }

    public final int O0(int i) {
        boolean z;
        if (G() != 0) {
            if (i < Y0()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f8339r0) {
                return -1;
            }
            return 1;
        } else if (this.f8339r0) {
            return 1;
        } else {
            return -1;
        }
    }

    public final boolean P0() {
        int i;
        if (!(G() == 0 || this.f8344w0 == 0 || !this.f8314a0)) {
            if (this.f8339r0) {
                i = Z0();
                Y0();
            } else {
                i = Y0();
                Z0();
            }
            g gVar = this.f8343v0;
            if (i == 0 && d1() != null) {
                gVar.a();
                this.f8313Z = true;
                z0();
                return true;
            }
        }
        return false;
    }

    public final int Q0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        f fVar = this.f8334l0;
        boolean z = !this.f8329C0;
        return Q7.g.l(f0Var, fVar, V0(z), U0(z), this, this.f8329C0);
    }

    public final int R0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        f fVar = this.f8334l0;
        boolean z = !this.f8329C0;
        return Q7.g.m(f0Var, fVar, V0(z), U0(z), this, this.f8329C0, this.f8339r0);
    }

    public final int S0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        f fVar = this.f8334l0;
        boolean z = !this.f8329C0;
        return Q7.g.n(f0Var, fVar, V0(z), U0(z), this, this.f8329C0);
    }

    public final int T0(Z z, C0509u uVar, f0 f0Var) {
        int i;
        int i8;
        boolean z6;
        int i9;
        int i10;
        c cVar;
        boolean z8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Z z9 = z;
        C0509u uVar2 = uVar;
        int i19 = 1;
        this.f8340s0.set(0, this.f8332j0, true);
        C0509u uVar3 = this.p0;
        if (uVar3.i) {
            if (uVar2.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = RecyclerView.UNDEFINED_DURATION;
            }
        } else if (uVar2.e == 1) {
            i = uVar2.f8528g + uVar2.f8524b;
        } else {
            i = uVar2.f8527f - uVar2.f8524b;
        }
        int i20 = uVar2.e;
        for (int i21 = 0; i21 < this.f8332j0; i21++) {
            if (!((ArrayList) this.f8333k0[i21].f3372f).isEmpty()) {
                q1(this.f8333k0[i21], i20, i);
            }
        }
        if (this.f8339r0) {
            i8 = this.f8334l0.g();
        } else {
            i8 = this.f8334l0.k();
        }
        boolean z10 = false;
        while (true) {
            int i22 = uVar2.f8525c;
            if (i22 < 0 || i22 >= f0Var.b()) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6 && (uVar3.i || !this.f8340s0.isEmpty())) {
                View view = z9.l(uVar2.f8525c, Long.MAX_VALUE).itemView;
                uVar2.f8525c += uVar2.f8526d;
                o0 o0Var = (o0) view.getLayoutParams();
                int layoutPosition = o0Var.f8323U.getLayoutPosition();
                g gVar = this.f8343v0;
                int[] iArr = gVar.f4142U;
                if (iArr == null || layoutPosition >= iArr.length) {
                    i10 = -1;
                } else {
                    i10 = iArr[layoutPosition];
                }
                if (i10 == -1) {
                    if (h1(uVar2.e)) {
                        i18 = this.f8332j0 - i19;
                        i17 = -1;
                        i16 = -1;
                    } else {
                        i17 = this.f8332j0;
                        i18 = 0;
                        i16 = 1;
                    }
                    c cVar2 = null;
                    if (uVar2.e == i19) {
                        int k8 = this.f8334l0.k();
                        int i23 = Integer.MAX_VALUE;
                        while (i18 != i17) {
                            c cVar3 = this.f8333k0[i18];
                            int i24 = cVar3.i(k8);
                            if (i24 < i23) {
                                i23 = i24;
                                cVar2 = cVar3;
                            }
                            i18 += i16;
                        }
                    } else {
                        int g8 = this.f8334l0.g();
                        int i25 = RecyclerView.UNDEFINED_DURATION;
                        while (i18 != i17) {
                            c cVar4 = this.f8333k0[i18];
                            int k9 = cVar4.k(g8);
                            if (k9 > i25) {
                                cVar2 = cVar4;
                                i25 = k9;
                            }
                            i18 += i16;
                        }
                    }
                    cVar = cVar2;
                    gVar.c(layoutPosition);
                    gVar.f4142U[layoutPosition] = cVar.e;
                } else {
                    cVar = this.f8333k0[i10];
                }
                o0Var.f8459Y = cVar;
                if (uVar2.e == 1) {
                    z8 = false;
                    l(view, -1, false);
                } else {
                    z8 = false;
                    l(view, 0, false);
                }
                if (this.f8336n0 == 1) {
                    i11 = 1;
                    f1(view, Q.H(this.f8337o0, this.f8319f0, z8 ? 1 : 0, o0Var.width, z8), Q.H(this.f8322i0, this.f8320g0, getPaddingBottom() + getPaddingTop(), o0Var.height, true));
                } else {
                    i11 = 1;
                    f1(view, Q.H(this.f8321h0, this.f8319f0, getPaddingRight() + getPaddingLeft(), o0Var.width, true), Q.H(this.f8337o0, this.f8320g0, 0, o0Var.height, false));
                }
                if (uVar2.e == i11) {
                    i13 = cVar.i(i8);
                    i12 = this.f8334l0.c(view) + i13;
                } else {
                    i12 = cVar.k(i8);
                    i13 = i12 - this.f8334l0.c(view);
                }
                if (uVar2.e == 1) {
                    c cVar5 = o0Var.f8459Y;
                    cVar5.getClass();
                    o0 o0Var2 = (o0) view.getLayoutParams();
                    o0Var2.f8459Y = cVar5;
                    ArrayList arrayList = (ArrayList) cVar5.f3372f;
                    arrayList.add(view);
                    cVar5.f3370c = RecyclerView.UNDEFINED_DURATION;
                    if (arrayList.size() == 1) {
                        cVar5.f3369b = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (o0Var2.f8323U.isRemoved() || o0Var2.f8323U.isUpdated()) {
                        cVar5.f3371d = ((StaggeredGridLayoutManager) cVar5.f3373g).f8334l0.c(view) + cVar5.f3371d;
                    }
                } else {
                    c cVar6 = o0Var.f8459Y;
                    cVar6.getClass();
                    o0 o0Var3 = (o0) view.getLayoutParams();
                    o0Var3.f8459Y = cVar6;
                    ArrayList arrayList2 = (ArrayList) cVar6.f3372f;
                    arrayList2.add(0, view);
                    cVar6.f3369b = RecyclerView.UNDEFINED_DURATION;
                    if (arrayList2.size() == 1) {
                        cVar6.f3370c = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (o0Var3.f8323U.isRemoved() || o0Var3.f8323U.isUpdated()) {
                        cVar6.f3371d = ((StaggeredGridLayoutManager) cVar6.f3373g).f8334l0.c(view) + cVar6.f3371d;
                    }
                }
                if (!e1() || this.f8336n0 != 1) {
                    i14 = this.f8335m0.k() + (cVar.e * this.f8337o0);
                    i15 = this.f8335m0.c(view) + i14;
                } else {
                    i15 = this.f8335m0.g() - (((this.f8332j0 - 1) - cVar.e) * this.f8337o0);
                    i14 = i15 - this.f8335m0.c(view);
                }
                if (this.f8336n0 == 1) {
                    Q.Y(view, i14, i13, i15, i12);
                } else {
                    Q.Y(view, i13, i14, i12, i15);
                }
                q1(cVar, uVar3.e, i);
                j1(z9, uVar3);
                if (uVar3.f8529h && view.hasFocusable()) {
                    this.f8340s0.set(cVar.e, false);
                }
                i19 = 1;
                z10 = true;
            }
        }
        if (!z10) {
            j1(z9, uVar3);
        }
        if (uVar3.e == -1) {
            i9 = this.f8334l0.k() - b1(this.f8334l0.k());
        } else {
            i9 = a1(this.f8334l0.g()) - this.f8334l0.g();
        }
        if (i9 > 0) {
            return Math.min(uVar2.f8524b, i9);
        }
        return 0;
    }

    public final View U0(boolean z) {
        int k8 = this.f8334l0.k();
        int g8 = this.f8334l0.g();
        View view = null;
        for (int G8 = G() - 1; G8 >= 0; G8--) {
            View F8 = F(G8);
            int e = this.f8334l0.e(F8);
            int b8 = this.f8334l0.b(F8);
            if (b8 > k8 && e < g8) {
                if (b8 <= g8 || !z) {
                    return F8;
                }
                if (view == null) {
                    view = F8;
                }
            }
        }
        return view;
    }

    public final View V0(boolean z) {
        int k8 = this.f8334l0.k();
        int g8 = this.f8334l0.g();
        int G8 = G();
        View view = null;
        for (int i = 0; i < G8; i++) {
            View F8 = F(i);
            int e = this.f8334l0.e(F8);
            if (this.f8334l0.b(F8) > k8 && e < g8) {
                if (e >= k8 || !z) {
                    return F8;
                }
                if (view == null) {
                    view = F8;
                }
            }
        }
        return view;
    }

    public final boolean W() {
        if (this.f8344w0 != 0) {
            return true;
        }
        return false;
    }

    public final void W0(Z z, f0 f0Var, boolean z6) {
        int g8;
        int a12 = a1(RecyclerView.UNDEFINED_DURATION);
        if (a12 != Integer.MIN_VALUE && (g8 = this.f8334l0.g() - a12) > 0) {
            int i = g8 - (-n1(-g8, z, f0Var));
            if (z6 && i > 0) {
                this.f8334l0.p(i);
            }
        }
    }

    public final void X0(Z z, f0 f0Var, boolean z6) {
        int k8;
        int b12 = b1(Integer.MAX_VALUE);
        if (b12 != Integer.MAX_VALUE && (k8 = b12 - this.f8334l0.k()) > 0) {
            int n12 = k8 - n1(k8, z, f0Var);
            if (z6 && n12 > 0) {
                this.f8334l0.p(-n12);
            }
        }
    }

    public final int Y0() {
        if (G() == 0) {
            return 0;
        }
        return Q.S(F(0));
    }

    public final void Z(int i) {
        super.Z(i);
        for (int i8 = 0; i8 < this.f8332j0; i8++) {
            c cVar = this.f8333k0[i8];
            int i9 = cVar.f3369b;
            if (i9 != Integer.MIN_VALUE) {
                cVar.f3369b = i9 + i;
            }
            int i10 = cVar.f3370c;
            if (i10 != Integer.MIN_VALUE) {
                cVar.f3370c = i10 + i;
            }
        }
    }

    public final int Z0() {
        int G8 = G();
        if (G8 == 0) {
            return 0;
        }
        return Q.S(F(G8 - 1));
    }

    public final void a0(int i) {
        super.a0(i);
        for (int i8 = 0; i8 < this.f8332j0; i8++) {
            c cVar = this.f8333k0[i8];
            int i9 = cVar.f3369b;
            if (i9 != Integer.MIN_VALUE) {
                cVar.f3369b = i9 + i;
            }
            int i10 = cVar.f3370c;
            if (i10 != Integer.MIN_VALUE) {
                cVar.f3370c = i10 + i;
            }
        }
    }

    public final int a1(int i) {
        int i8 = this.f8333k0[0].i(i);
        for (int i9 = 1; i9 < this.f8332j0; i9++) {
            int i10 = this.f8333k0[i9].i(i);
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public final void b0() {
        this.f8343v0.a();
        for (int i = 0; i < this.f8332j0; i++) {
            this.f8333k0[i].b();
        }
    }

    public final int b1(int i) {
        int k8 = this.f8333k0[0].k(i);
        for (int i8 = 1; i8 < this.f8332j0; i8++) {
            int k9 = this.f8333k0[i8].k(i);
            if (k9 < k8) {
                k8 = k9;
            }
        }
        return k8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c1(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.f8339r0
            if (r0 == 0) goto L_0x0009
            int r0 = r10.Z0()
            goto L_0x000d
        L_0x0009:
            int r0 = r10.Y0()
        L_0x000d:
            r1 = 8
            if (r13 != r1) goto L_0x001b
            if (r11 >= r12) goto L_0x0017
            int r2 = r12 + 1
        L_0x0015:
            r3 = r11
            goto L_0x001e
        L_0x0017:
            int r2 = r11 + 1
            r3 = r12
            goto L_0x001e
        L_0x001b:
            int r2 = r11 + r12
            goto L_0x0015
        L_0x001e:
            Q5.g r4 = r10.f8343v0
            int[] r5 = r4.f4142U
            r6 = -1
            if (r5 != 0) goto L_0x0027
            goto L_0x009b
        L_0x0027:
            int r5 = r5.length
            if (r3 < r5) goto L_0x002c
            goto L_0x009b
        L_0x002c:
            java.util.ArrayList r5 = r4.f4143V
            if (r5 != 0) goto L_0x0032
        L_0x0030:
            r5 = -1
            goto L_0x0081
        L_0x0032:
            r7 = 0
            if (r5 != 0) goto L_0x0036
            goto L_0x004f
        L_0x0036:
            int r5 = r5.size()
            int r5 = r5 + -1
        L_0x003c:
            if (r5 < 0) goto L_0x004f
            java.util.ArrayList r8 = r4.f4143V
            java.lang.Object r8 = r8.get(r5)
            androidx.recyclerview.widget.p0 r8 = (androidx.recyclerview.widget.p0) r8
            int r9 = r8.f8487U
            if (r9 != r3) goto L_0x004c
            r7 = r8
            goto L_0x004f
        L_0x004c:
            int r5 = r5 + -1
            goto L_0x003c
        L_0x004f:
            if (r7 == 0) goto L_0x0056
            java.util.ArrayList r5 = r4.f4143V
            r5.remove(r7)
        L_0x0056:
            java.util.ArrayList r5 = r4.f4143V
            int r5 = r5.size()
            r7 = 0
        L_0x005d:
            if (r7 >= r5) goto L_0x006f
            java.util.ArrayList r8 = r4.f4143V
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.p0 r8 = (androidx.recyclerview.widget.p0) r8
            int r8 = r8.f8487U
            if (r8 < r3) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            int r7 = r7 + 1
            goto L_0x005d
        L_0x006f:
            r7 = -1
        L_0x0070:
            if (r7 == r6) goto L_0x0030
            java.util.ArrayList r5 = r4.f4143V
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.p0 r5 = (androidx.recyclerview.widget.p0) r5
            java.util.ArrayList r8 = r4.f4143V
            r8.remove(r7)
            int r5 = r5.f8487U
        L_0x0081:
            if (r5 != r6) goto L_0x008d
            int[] r5 = r4.f4142U
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.f4142U
            int r5 = r5.length
            goto L_0x009b
        L_0x008d:
            int r5 = r5 + 1
            int[] r7 = r4.f4142U
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f4142U
            java.util.Arrays.fill(r7, r3, r5, r6)
        L_0x009b:
            r5 = 1
            if (r13 == r5) goto L_0x00af
            r6 = 2
            if (r13 == r6) goto L_0x00ab
            if (r13 == r1) goto L_0x00a4
            goto L_0x00b2
        L_0x00a4:
            r4.e(r11, r5)
            r4.d(r12, r5)
            goto L_0x00b2
        L_0x00ab:
            r4.e(r11, r12)
            goto L_0x00b2
        L_0x00af:
            r4.d(r11, r12)
        L_0x00b2:
            if (r2 > r0) goto L_0x00b5
            return
        L_0x00b5:
            boolean r11 = r10.f8339r0
            if (r11 == 0) goto L_0x00be
            int r11 = r10.Y0()
            goto L_0x00c2
        L_0x00be:
            int r11 = r10.Z0()
        L_0x00c2:
            if (r3 > r11) goto L_0x00c7
            r10.z0()
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c1(int, int, int):void");
    }

    public final void d0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f8309V;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f8331E0);
        }
        for (int i = 0; i < this.f8332j0; i++) {
            this.f8333k0[i].b();
        }
        recyclerView.requestLayout();
    }

    public final View d1() {
        char c8;
        boolean z;
        boolean z6;
        int G8 = G();
        int i = G8 - 1;
        BitSet bitSet = new BitSet(this.f8332j0);
        bitSet.set(0, this.f8332j0, true);
        int i8 = -1;
        if (this.f8336n0 != 1 || !e1()) {
            c8 = 65535;
        } else {
            c8 = 1;
        }
        if (this.f8339r0) {
            G8 = -1;
        } else {
            i = 0;
        }
        if (i < G8) {
            i8 = 1;
        }
        while (i != G8) {
            View F8 = F(i);
            o0 o0Var = (o0) F8.getLayoutParams();
            if (bitSet.get(o0Var.f8459Y.e)) {
                c cVar = o0Var.f8459Y;
                if (this.f8339r0) {
                    int i9 = cVar.f3370c;
                    if (i9 == Integer.MIN_VALUE) {
                        cVar.a();
                        i9 = cVar.f3370c;
                    }
                    if (i9 < this.f8334l0.g()) {
                        ((o0) ((View) Q0.g.l(1, (ArrayList) cVar.f3372f)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(o0Var.f8459Y.e);
                } else {
                    int i10 = cVar.f3369b;
                    if (i10 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) cVar.f3372f).get(0);
                        cVar.f3369b = ((StaggeredGridLayoutManager) cVar.f3373g).f8334l0.e(view);
                        ((o0) view.getLayoutParams()).getClass();
                        i10 = cVar.f3369b;
                    }
                    if (i10 > this.f8334l0.k()) {
                        ((o0) ((View) ((ArrayList) cVar.f3372f).get(0)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(o0Var.f8459Y.e);
                }
                return F8;
            }
            i += i8;
            if (i != G8) {
                View F9 = F(i);
                if (this.f8339r0) {
                    int b8 = this.f8334l0.b(F8);
                    int b9 = this.f8334l0.b(F9);
                    if (b8 < b9) {
                        return F8;
                    }
                    if (b8 != b9) {
                        continue;
                    }
                } else {
                    int e = this.f8334l0.e(F8);
                    int e8 = this.f8334l0.e(F9);
                    if (e > e8) {
                        return F8;
                    }
                    if (e != e8) {
                        continue;
                    }
                }
                if (o0Var.f8459Y.e - ((o0) F9.getLayoutParams()).f8459Y.e < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (c8 < 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z != z6) {
                    return F8;
                }
            }
        }
        return null;
    }

    public final PointF e(int i) {
        int O02 = O0(i);
        PointF pointF = new PointF();
        if (O02 == 0) {
            return null;
        }
        if (this.f8336n0 == 0) {
            pointF.x = (float) O02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) O02;
        }
        return pointF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r8.f8336n0 == 1) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r8.f8336n0 == 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0060, code lost:
        if (e1() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006d, code lost:
        if (e1() == false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View e0(android.view.View r9, int r10, androidx.recyclerview.widget.Z r11, androidx.recyclerview.widget.f0 r12) {
        /*
            r8 = this;
            int r0 = r8.G()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f8309V
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x0020
        L_0x000e:
            android.view.View r9 = r0.findContainingItemView(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.c r0 = r8.f8308U
            java.util.ArrayList r0 = r0.f8374c
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0020
            goto L_0x000c
        L_0x0020:
            if (r9 != 0) goto L_0x0023
            return r1
        L_0x0023:
            r8.m1()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0064
            r4 = 2
            if (r10 == r4) goto L_0x0056
            r4 = 17
            if (r10 == r4) goto L_0x0051
            r4 = 33
            if (r10 == r4) goto L_0x004c
            r4 = 66
            if (r10 == r4) goto L_0x0047
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x0042
        L_0x003f:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0070
        L_0x0042:
            int r10 = r8.f8336n0
            if (r10 != r0) goto L_0x003f
            goto L_0x005a
        L_0x0047:
            int r10 = r8.f8336n0
            if (r10 != 0) goto L_0x003f
            goto L_0x005a
        L_0x004c:
            int r10 = r8.f8336n0
            if (r10 != r0) goto L_0x003f
            goto L_0x0062
        L_0x0051:
            int r10 = r8.f8336n0
            if (r10 != 0) goto L_0x003f
            goto L_0x0062
        L_0x0056:
            int r10 = r8.f8336n0
            if (r10 != r0) goto L_0x005c
        L_0x005a:
            r10 = 1
            goto L_0x0070
        L_0x005c:
            boolean r10 = r8.e1()
            if (r10 == 0) goto L_0x005a
        L_0x0062:
            r10 = -1
            goto L_0x0070
        L_0x0064:
            int r10 = r8.f8336n0
            if (r10 != r0) goto L_0x0069
            goto L_0x0062
        L_0x0069:
            boolean r10 = r8.e1()
            if (r10 == 0) goto L_0x0062
            goto L_0x005a
        L_0x0070:
            if (r10 != r3) goto L_0x0073
            return r1
        L_0x0073:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            androidx.recyclerview.widget.o0 r3 = (androidx.recyclerview.widget.o0) r3
            r3.getClass()
            N5.c r3 = r3.f8459Y
            if (r10 != r0) goto L_0x0085
            int r4 = r8.Z0()
            goto L_0x0089
        L_0x0085:
            int r4 = r8.Y0()
        L_0x0089:
            r8.p1(r4, r12)
            r8.o1(r10)
            androidx.recyclerview.widget.u r5 = r8.p0
            int r6 = r5.f8526d
            int r6 = r6 + r4
            r5.f8525c = r6
            androidx.emoji2.text.f r6 = r8.f8334l0
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f8524b = r6
            r5.f8529h = r0
            r6 = 0
            r5.f8523a = r6
            r8.T0(r11, r5, r12)
            boolean r11 = r8.f8339r0
            r8.f8345x0 = r11
            android.view.View r11 = r3.j(r4, r10)
            if (r11 == 0) goto L_0x00ba
            if (r11 == r9) goto L_0x00ba
            return r11
        L_0x00ba:
            boolean r11 = r8.h1(r10)
            if (r11 == 0) goto L_0x00d5
            int r11 = r8.f8332j0
            int r11 = r11 - r0
        L_0x00c3:
            if (r11 < 0) goto L_0x00ea
            N5.c[] r12 = r8.f8333k0
            r12 = r12[r11]
            android.view.View r12 = r12.j(r4, r10)
            if (r12 == 0) goto L_0x00d2
            if (r12 == r9) goto L_0x00d2
            return r12
        L_0x00d2:
            int r11 = r11 + -1
            goto L_0x00c3
        L_0x00d5:
            r11 = 0
        L_0x00d6:
            int r12 = r8.f8332j0
            if (r11 >= r12) goto L_0x00ea
            N5.c[] r12 = r8.f8333k0
            r12 = r12[r11]
            android.view.View r12 = r12.j(r4, r10)
            if (r12 == 0) goto L_0x00e7
            if (r12 == r9) goto L_0x00e7
            return r12
        L_0x00e7:
            int r11 = r11 + 1
            goto L_0x00d6
        L_0x00ea:
            boolean r11 = r8.f8338q0
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00f1
            r12 = 1
            goto L_0x00f2
        L_0x00f1:
            r12 = 0
        L_0x00f2:
            if (r11 != r12) goto L_0x00f6
            r11 = 1
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r11 == 0) goto L_0x00fe
            int r12 = r3.e()
            goto L_0x0102
        L_0x00fe:
            int r12 = r3.f()
        L_0x0102:
            android.view.View r12 = r8.B(r12)
            if (r12 == 0) goto L_0x010b
            if (r12 == r9) goto L_0x010b
            return r12
        L_0x010b:
            boolean r10 = r8.h1(r10)
            if (r10 == 0) goto L_0x013a
            int r10 = r8.f8332j0
            int r10 = r10 - r0
        L_0x0114:
            if (r10 < 0) goto L_0x015d
            int r12 = r3.e
            if (r10 != r12) goto L_0x011b
            goto L_0x0137
        L_0x011b:
            if (r11 == 0) goto L_0x0126
            N5.c[] r12 = r8.f8333k0
            r12 = r12[r10]
            int r12 = r12.e()
            goto L_0x012e
        L_0x0126:
            N5.c[] r12 = r8.f8333k0
            r12 = r12[r10]
            int r12 = r12.f()
        L_0x012e:
            android.view.View r12 = r8.B(r12)
            if (r12 == 0) goto L_0x0137
            if (r12 == r9) goto L_0x0137
            return r12
        L_0x0137:
            int r10 = r10 + -1
            goto L_0x0114
        L_0x013a:
            int r10 = r8.f8332j0
            if (r6 >= r10) goto L_0x015d
            if (r11 == 0) goto L_0x0149
            N5.c[] r10 = r8.f8333k0
            r10 = r10[r6]
            int r10 = r10.e()
            goto L_0x0151
        L_0x0149:
            N5.c[] r10 = r8.f8333k0
            r10 = r10[r6]
            int r10 = r10.f()
        L_0x0151:
            android.view.View r10 = r8.B(r10)
            if (r10 == 0) goto L_0x015a
            if (r10 == r9) goto L_0x015a
            return r10
        L_0x015a:
            int r6 = r6 + 1
            goto L_0x013a
        L_0x015d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e0(android.view.View, int, androidx.recyclerview.widget.Z, androidx.recyclerview.widget.f0):android.view.View");
    }

    public final boolean e1() {
        if (R() == 1) {
            return true;
        }
        return false;
    }

    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (G() > 0) {
            View V02 = V0(false);
            View U02 = U0(false);
            if (V02 != null && U02 != null) {
                int S8 = Q.S(V02);
                int S9 = Q.S(U02);
                if (S8 < S9) {
                    accessibilityEvent.setFromIndex(S8);
                    accessibilityEvent.setToIndex(S9);
                    return;
                }
                accessibilityEvent.setFromIndex(S9);
                accessibilityEvent.setToIndex(S8);
            }
        }
    }

    public final void f1(View view, int i, int i8) {
        Rect rect = this.f8327A0;
        n(view, rect);
        o0 o0Var = (o0) view.getLayoutParams();
        int r12 = r1(i, o0Var.leftMargin + rect.left, o0Var.rightMargin + rect.right);
        int r13 = r1(i8, o0Var.topMargin + rect.top, o0Var.bottomMargin + rect.bottom);
        if (I0(view, r12, r13, o0Var)) {
            view.measure(r12, r13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0409, code lost:
        if (P0() != false) goto L_0x040d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g1(androidx.recyclerview.widget.Z r17, androidx.recyclerview.widget.f0 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.q0 r3 = r0.f8347z0
            r4 = -1
            androidx.recyclerview.widget.n0 r5 = r0.f8328B0
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f8341t0
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.v0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f8341t0
            if (r3 != r4) goto L_0x002f
            androidx.recyclerview.widget.q0 r3 = r0.f8347z0
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            Q5.g r8 = r0.f8343v0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = r5.f8457g
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x020e
            r5.a()
            androidx.recyclerview.widget.q0 r11 = r0.f8347z0
            if (r11 == 0) goto L_0x00c3
            int r12 = r11.f8497W
            r13 = 0
            if (r12 <= 0) goto L_0x0088
            int r14 = r0.f8332j0
            if (r12 != r14) goto L_0x007a
            r11 = 0
        L_0x0049:
            int r12 = r0.f8332j0
            if (r11 >= r12) goto L_0x0088
            N5.c[] r12 = r0.f8333k0
            r12 = r12[r11]
            r12.b()
            androidx.recyclerview.widget.q0 r12 = r0.f8347z0
            int[] r14 = r12.f8498X
            r14 = r14[r11]
            if (r14 == r10) goto L_0x006f
            boolean r12 = r12.f8503c0
            if (r12 == 0) goto L_0x0068
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.g()
        L_0x0066:
            int r14 = r14 + r12
            goto L_0x006f
        L_0x0068:
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.k()
            goto L_0x0066
        L_0x006f:
            N5.c[] r12 = r0.f8333k0
            r12 = r12[r11]
            r12.f3369b = r14
            r12.f3370c = r14
            int r11 = r11 + 1
            goto L_0x0049
        L_0x007a:
            r11.f8498X = r13
            r11.f8497W = r6
            r11.f8499Y = r6
            r11.f8500Z = r13
            r11.f8501a0 = r13
            int r12 = r11.f8496V
            r11.f8495U = r12
        L_0x0088:
            androidx.recyclerview.widget.q0 r11 = r0.f8347z0
            boolean r12 = r11.f8504d0
            r0.f8346y0 = r12
            boolean r11 = r11.f8502b0
            r0.m(r13)
            androidx.recyclerview.widget.q0 r12 = r0.f8347z0
            if (r12 == 0) goto L_0x009d
            boolean r13 = r12.f8502b0
            if (r13 == r11) goto L_0x009d
            r12.f8502b0 = r11
        L_0x009d:
            r0.f8338q0 = r11
            r16.z0()
            r16.m1()
            androidx.recyclerview.widget.q0 r11 = r0.f8347z0
            int r12 = r11.f8495U
            if (r12 == r4) goto L_0x00b2
            r0.f8341t0 = r12
            boolean r12 = r11.f8503c0
            r5.f8454c = r12
            goto L_0x00b6
        L_0x00b2:
            boolean r12 = r0.f8339r0
            r5.f8454c = r12
        L_0x00b6:
            int r12 = r11.f8499Y
            if (r12 <= r7) goto L_0x00ca
            int[] r12 = r11.f8500Z
            r8.f4142U = r12
            java.util.ArrayList r11 = r11.f8501a0
            r8.f4143V = r11
            goto L_0x00ca
        L_0x00c3:
            r16.m1()
            boolean r11 = r0.f8339r0
            r5.f8454c = r11
        L_0x00ca:
            boolean r11 = r2.f8400g
            if (r11 != 0) goto L_0x01cb
            int r11 = r0.f8341t0
            if (r11 != r4) goto L_0x00d4
            goto L_0x01cb
        L_0x00d4:
            if (r11 < 0) goto L_0x01c7
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00de
            goto L_0x01c7
        L_0x00de:
            androidx.recyclerview.widget.q0 r11 = r0.f8347z0
            if (r11 == 0) goto L_0x00f3
            int r12 = r11.f8495U
            if (r12 == r4) goto L_0x00f3
            int r11 = r11.f8497W
            if (r11 >= r7) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r5.f8453b = r10
            int r11 = r0.f8341t0
            r5.f8452a = r11
            goto L_0x020c
        L_0x00f3:
            int r11 = r0.f8341t0
            android.view.View r11 = r0.B(r11)
            if (r11 == 0) goto L_0x0188
            boolean r12 = r0.f8339r0
            if (r12 == 0) goto L_0x0104
            int r12 = r16.Z0()
            goto L_0x0108
        L_0x0104:
            int r12 = r16.Y0()
        L_0x0108:
            r5.f8452a = r12
            int r12 = r0.f8342u0
            if (r12 == r10) goto L_0x013a
            boolean r12 = r5.f8454c
            if (r12 == 0) goto L_0x0126
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.g()
            int r13 = r0.f8342u0
            int r12 = r12 - r13
            androidx.emoji2.text.f r13 = r0.f8334l0
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            r5.f8453b = r12
            goto L_0x020c
        L_0x0126:
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.k()
            int r13 = r0.f8342u0
            int r12 = r12 + r13
            androidx.emoji2.text.f r13 = r0.f8334l0
            int r11 = r13.e(r11)
            int r12 = r12 - r11
            r5.f8453b = r12
            goto L_0x020c
        L_0x013a:
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.c(r11)
            androidx.emoji2.text.f r13 = r0.f8334l0
            int r13 = r13.l()
            if (r12 <= r13) goto L_0x015d
            boolean r11 = r5.f8454c
            if (r11 == 0) goto L_0x0153
            androidx.emoji2.text.f r11 = r0.f8334l0
            int r11 = r11.g()
            goto L_0x0159
        L_0x0153:
            androidx.emoji2.text.f r11 = r0.f8334l0
            int r11 = r11.k()
        L_0x0159:
            r5.f8453b = r11
            goto L_0x020c
        L_0x015d:
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.e(r11)
            androidx.emoji2.text.f r13 = r0.f8334l0
            int r13 = r13.k()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x0171
            int r11 = -r12
            r5.f8453b = r11
            goto L_0x020c
        L_0x0171:
            androidx.emoji2.text.f r12 = r0.f8334l0
            int r12 = r12.g()
            androidx.emoji2.text.f r13 = r0.f8334l0
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0184
            r5.f8453b = r12
            goto L_0x020c
        L_0x0184:
            r5.f8453b = r10
            goto L_0x020c
        L_0x0188:
            int r11 = r0.f8341t0
            r5.f8452a = r11
            int r12 = r0.f8342u0
            if (r12 != r10) goto L_0x01ad
            int r11 = r0.O0(r11)
            if (r11 != r7) goto L_0x0198
            r11 = 1
            goto L_0x0199
        L_0x0198:
            r11 = 0
        L_0x0199:
            r5.f8454c = r11
            if (r11 == 0) goto L_0x01a4
            androidx.emoji2.text.f r11 = r9.f8334l0
            int r11 = r11.g()
            goto L_0x01aa
        L_0x01a4:
            androidx.emoji2.text.f r11 = r9.f8334l0
            int r11 = r11.k()
        L_0x01aa:
            r5.f8453b = r11
            goto L_0x01c4
        L_0x01ad:
            boolean r11 = r5.f8454c
            if (r11 == 0) goto L_0x01bb
            androidx.emoji2.text.f r11 = r9.f8334l0
            int r11 = r11.g()
            int r11 = r11 - r12
            r5.f8453b = r11
            goto L_0x01c4
        L_0x01bb:
            androidx.emoji2.text.f r11 = r9.f8334l0
            int r11 = r11.k()
            int r11 = r11 + r12
            r5.f8453b = r11
        L_0x01c4:
            r5.f8455d = r7
            goto L_0x020c
        L_0x01c7:
            r0.f8341t0 = r4
            r0.f8342u0 = r10
        L_0x01cb:
            boolean r11 = r0.f8345x0
            if (r11 == 0) goto L_0x01ec
            int r11 = r18.b()
            int r12 = r16.G()
            int r12 = r12 - r7
        L_0x01d8:
            if (r12 < 0) goto L_0x01ea
            android.view.View r13 = r0.F(r12)
            int r13 = androidx.recyclerview.widget.Q.S(r13)
            if (r13 < 0) goto L_0x01e7
            if (r13 >= r11) goto L_0x01e7
            goto L_0x0208
        L_0x01e7:
            int r12 = r12 + -1
            goto L_0x01d8
        L_0x01ea:
            r13 = 0
            goto L_0x0208
        L_0x01ec:
            int r11 = r18.b()
            int r12 = r16.G()
            r13 = 0
        L_0x01f5:
            if (r13 >= r12) goto L_0x01ea
            android.view.View r14 = r0.F(r13)
            int r14 = androidx.recyclerview.widget.Q.S(r14)
            if (r14 < 0) goto L_0x0205
            if (r14 >= r11) goto L_0x0205
            r13 = r14
            goto L_0x0208
        L_0x0205:
            int r13 = r13 + 1
            goto L_0x01f5
        L_0x0208:
            r5.f8452a = r13
            r5.f8453b = r10
        L_0x020c:
            r5.e = r7
        L_0x020e:
            androidx.recyclerview.widget.q0 r11 = r0.f8347z0
            if (r11 != 0) goto L_0x0229
            int r11 = r0.f8341t0
            if (r11 != r4) goto L_0x0229
            boolean r11 = r5.f8454c
            boolean r12 = r0.f8345x0
            if (r11 != r12) goto L_0x0224
            boolean r11 = r16.e1()
            boolean r12 = r0.f8346y0
            if (r11 == r12) goto L_0x0229
        L_0x0224:
            r8.a()
            r5.f8455d = r7
        L_0x0229:
            int r8 = r16.G()
            if (r8 <= 0) goto L_0x02d6
            androidx.recyclerview.widget.q0 r8 = r0.f8347z0
            if (r8 == 0) goto L_0x0237
            int r8 = r8.f8497W
            if (r8 >= r7) goto L_0x02d6
        L_0x0237:
            boolean r8 = r5.f8455d
            if (r8 == 0) goto L_0x0256
            r3 = 0
        L_0x023c:
            int r8 = r0.f8332j0
            if (r3 >= r8) goto L_0x02d6
            N5.c[] r8 = r0.f8333k0
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f8453b
            if (r8 == r10) goto L_0x0253
            N5.c[] r9 = r0.f8333k0
            r9 = r9[r3]
            r9.f3369b = r8
            r9.f3370c = r8
        L_0x0253:
            int r3 = r3 + 1
            goto L_0x023c
        L_0x0256:
            if (r3 != 0) goto L_0x0274
            int[] r3 = r5.f8456f
            if (r3 != 0) goto L_0x025d
            goto L_0x0274
        L_0x025d:
            r3 = 0
        L_0x025e:
            int r8 = r0.f8332j0
            if (r3 >= r8) goto L_0x02d6
            N5.c[] r8 = r0.f8333k0
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f8456f
            r9 = r9[r3]
            r8.f3369b = r9
            r8.f3370c = r9
            int r3 = r3 + 1
            goto L_0x025e
        L_0x0274:
            r3 = 0
        L_0x0275:
            int r8 = r0.f8332j0
            if (r3 >= r8) goto L_0x02b5
            N5.c[] r8 = r0.f8333k0
            r8 = r8[r3]
            boolean r11 = r0.f8339r0
            int r12 = r5.f8453b
            if (r11 == 0) goto L_0x0288
            int r13 = r8.i(r10)
            goto L_0x028c
        L_0x0288:
            int r13 = r8.k(r10)
        L_0x028c:
            r8.b()
            if (r13 != r10) goto L_0x0292
            goto L_0x02b2
        L_0x0292:
            java.lang.Object r14 = r8.f3373g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r14
            if (r11 == 0) goto L_0x02a0
            androidx.emoji2.text.f r15 = r14.f8334l0
            int r15 = r15.g()
            if (r13 < r15) goto L_0x02b2
        L_0x02a0:
            if (r11 != 0) goto L_0x02ab
            androidx.emoji2.text.f r11 = r14.f8334l0
            int r11 = r11.k()
            if (r13 <= r11) goto L_0x02ab
            goto L_0x02b2
        L_0x02ab:
            if (r12 == r10) goto L_0x02ae
            int r13 = r13 + r12
        L_0x02ae:
            r8.f3370c = r13
            r8.f3369b = r13
        L_0x02b2:
            int r3 = r3 + 1
            goto L_0x0275
        L_0x02b5:
            N5.c[] r3 = r0.f8333k0
            int r8 = r3.length
            int[] r11 = r5.f8456f
            if (r11 == 0) goto L_0x02bf
            int r11 = r11.length
            if (r11 >= r8) goto L_0x02c6
        L_0x02bf:
            N5.c[] r9 = r9.f8333k0
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f8456f = r9
        L_0x02c6:
            r9 = 0
        L_0x02c7:
            if (r9 >= r8) goto L_0x02d6
            int[] r11 = r5.f8456f
            r12 = r3[r9]
            int r12 = r12.k(r10)
            r11[r9] = r12
            int r9 = r9 + 1
            goto L_0x02c7
        L_0x02d6:
            r16.A(r17)
            androidx.recyclerview.widget.u r3 = r0.p0
            r3.f8523a = r6
            androidx.emoji2.text.f r8 = r0.f8335m0
            int r8 = r8.l()
            int r9 = r0.f8332j0
            int r9 = r8 / r9
            r0.f8337o0 = r9
            androidx.emoji2.text.f r9 = r0.f8335m0
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f8452a
            r0.p1(r8, r2)
            boolean r8 = r5.f8454c
            if (r8 == 0) goto L_0x030f
            r0.o1(r4)
            r0.T0(r1, r3, r2)
            r0.o1(r7)
            int r4 = r5.f8452a
            int r8 = r3.f8526d
            int r4 = r4 + r8
            r3.f8525c = r4
            r0.T0(r1, r3, r2)
            goto L_0x0322
        L_0x030f:
            r0.o1(r7)
            r0.T0(r1, r3, r2)
            r0.o1(r4)
            int r4 = r5.f8452a
            int r8 = r3.f8526d
            int r4 = r4 + r8
            r3.f8525c = r4
            r0.T0(r1, r3, r2)
        L_0x0322:
            androidx.emoji2.text.f r3 = r0.f8335m0
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x032e
            goto L_0x03cf
        L_0x032e:
            int r3 = r16.G()
            r4 = 0
            r8 = 0
        L_0x0334:
            if (r8 >= r3) goto L_0x0356
            android.view.View r9 = r0.F(r8)
            androidx.emoji2.text.f r11 = r0.f8335m0
            int r11 = r11.c(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0346
            goto L_0x0353
        L_0x0346:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.o0 r9 = (androidx.recyclerview.widget.o0) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x0353:
            int r8 = r8 + 1
            goto L_0x0334
        L_0x0356:
            int r8 = r0.f8337o0
            int r9 = r0.f8332j0
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.emoji2.text.f r9 = r0.f8335m0
            int r9 = r9.i()
            if (r9 != r10) goto L_0x0373
            androidx.emoji2.text.f r9 = r0.f8335m0
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x0373:
            int r9 = r0.f8332j0
            int r9 = r4 / r9
            r0.f8337o0 = r9
            androidx.emoji2.text.f r9 = r0.f8335m0
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f8337o0
            if (r4 != r8) goto L_0x0387
            goto L_0x03cf
        L_0x0387:
            r4 = 0
        L_0x0388:
            if (r4 >= r3) goto L_0x03cf
            android.view.View r9 = r0.F(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.o0 r10 = (androidx.recyclerview.widget.o0) r10
            r10.getClass()
            boolean r11 = r16.e1()
            if (r11 == 0) goto L_0x03b5
            int r11 = r0.f8336n0
            if (r11 != r7) goto L_0x03b5
            int r11 = r0.f8332j0
            int r11 = r11 - r7
            N5.c r10 = r10.f8459Y
            int r10 = r10.e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.f8337o0
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03cc
        L_0x03b5:
            N5.c r10 = r10.f8459Y
            int r10 = r10.e
            int r11 = r0.f8337o0
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f8336n0
            if (r12 != r7) goto L_0x03c8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03cc
        L_0x03c8:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03cc:
            int r4 = r4 + 1
            goto L_0x0388
        L_0x03cf:
            int r3 = r16.G()
            if (r3 <= 0) goto L_0x03e6
            boolean r3 = r0.f8339r0
            if (r3 == 0) goto L_0x03e0
            r0.W0(r1, r2, r7)
            r0.X0(r1, r2, r6)
            goto L_0x03e6
        L_0x03e0:
            r0.X0(r1, r2, r7)
            r0.W0(r1, r2, r6)
        L_0x03e6:
            if (r19 == 0) goto L_0x040c
            boolean r3 = r2.f8400g
            if (r3 != 0) goto L_0x040c
            int r3 = r0.f8344w0
            if (r3 == 0) goto L_0x040c
            int r3 = r16.G()
            if (r3 <= 0) goto L_0x040c
            android.view.View r3 = r16.d1()
            if (r3 == 0) goto L_0x040c
            androidx.recyclerview.widget.RecyclerView r3 = r0.f8309V
            if (r3 == 0) goto L_0x0405
            androidx.recyclerview.widget.l r4 = r0.f8331E0
            r3.removeCallbacks(r4)
        L_0x0405:
            boolean r3 = r16.P0()
            if (r3 == 0) goto L_0x040c
            goto L_0x040d
        L_0x040c:
            r7 = 0
        L_0x040d:
            boolean r3 = r2.f8400g
            if (r3 == 0) goto L_0x0414
            r5.a()
        L_0x0414:
            boolean r3 = r5.f8454c
            r0.f8345x0 = r3
            boolean r3 = r16.e1()
            r0.f8346y0 = r3
            if (r7 == 0) goto L_0x0426
            r5.a()
            r0.g1(r1, r2, r6)
        L_0x0426:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g1(androidx.recyclerview.widget.Z, androidx.recyclerview.widget.f0, boolean):void");
    }

    public final boolean h1(int i) {
        boolean z;
        boolean z6;
        boolean z8;
        if (this.f8336n0 == 0) {
            if (i == -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 != this.f8339r0) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f8339r0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 == e1()) {
            return true;
        }
        return false;
    }

    public final void i1(int i, f0 f0Var) {
        int i8;
        int i9;
        if (i > 0) {
            i9 = Z0();
            i8 = 1;
        } else {
            i9 = Y0();
            i8 = -1;
        }
        C0509u uVar = this.p0;
        uVar.f8523a = true;
        p1(i9, f0Var);
        o1(i8);
        uVar.f8525c = i9 + uVar.f8526d;
        uVar.f8524b = Math.abs(i);
    }

    public final void j0(int i, int i8) {
        c1(i, i8, 1);
    }

    public final void j1(Z z, C0509u uVar) {
        int i;
        int i8;
        if (uVar.f8523a && !uVar.i) {
            if (uVar.f8524b != 0) {
                int i9 = 1;
                if (uVar.e == -1) {
                    int i10 = uVar.f8527f;
                    int k8 = this.f8333k0[0].k(i10);
                    while (i9 < this.f8332j0) {
                        int k9 = this.f8333k0[i9].k(i10);
                        if (k9 > k8) {
                            k8 = k9;
                        }
                        i9++;
                    }
                    int i11 = i10 - k8;
                    if (i11 < 0) {
                        i8 = uVar.f8528g;
                    } else {
                        i8 = uVar.f8528g - Math.min(i11, uVar.f8524b);
                    }
                    k1(z, i8);
                    return;
                }
                int i12 = uVar.f8528g;
                int i13 = this.f8333k0[0].i(i12);
                while (i9 < this.f8332j0) {
                    int i14 = this.f8333k0[i9].i(i12);
                    if (i14 < i13) {
                        i13 = i14;
                    }
                    i9++;
                }
                int i15 = i13 - uVar.f8528g;
                if (i15 < 0) {
                    i = uVar.f8527f;
                } else {
                    i = Math.min(i15, uVar.f8524b) + uVar.f8527f;
                }
                l1(z, i);
            } else if (uVar.e == -1) {
                k1(z, uVar.f8528g);
            } else {
                l1(z, uVar.f8527f);
            }
        }
    }

    public final void k0() {
        this.f8343v0.a();
        z0();
    }

    public final void k1(Z z, int i) {
        int G8 = G() - 1;
        while (G8 >= 0) {
            View F8 = F(G8);
            if (this.f8334l0.e(F8) >= i && this.f8334l0.o(F8) >= i) {
                o0 o0Var = (o0) F8.getLayoutParams();
                o0Var.getClass();
                if (((ArrayList) o0Var.f8459Y.f3372f).size() != 1) {
                    c cVar = o0Var.f8459Y;
                    ArrayList arrayList = (ArrayList) cVar.f3372f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    o0 o0Var2 = (o0) view.getLayoutParams();
                    o0Var2.f8459Y = null;
                    if (o0Var2.f8323U.isRemoved() || o0Var2.f8323U.isUpdated()) {
                        cVar.f3371d -= ((StaggeredGridLayoutManager) cVar.f3373g).f8334l0.c(view);
                    }
                    if (size == 1) {
                        cVar.f3369b = RecyclerView.UNDEFINED_DURATION;
                    }
                    cVar.f3370c = RecyclerView.UNDEFINED_DURATION;
                    x0(F8, z);
                    G8--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void l0(int i, int i8) {
        c1(i, i8, 8);
    }

    public final void l1(Z z, int i) {
        while (G() > 0) {
            View F8 = F(0);
            if (this.f8334l0.b(F8) <= i && this.f8334l0.n(F8) <= i) {
                o0 o0Var = (o0) F8.getLayoutParams();
                o0Var.getClass();
                if (((ArrayList) o0Var.f8459Y.f3372f).size() != 1) {
                    c cVar = o0Var.f8459Y;
                    ArrayList arrayList = (ArrayList) cVar.f3372f;
                    View view = (View) arrayList.remove(0);
                    o0 o0Var2 = (o0) view.getLayoutParams();
                    o0Var2.f8459Y = null;
                    if (arrayList.size() == 0) {
                        cVar.f3370c = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (o0Var2.f8323U.isRemoved() || o0Var2.f8323U.isUpdated()) {
                        cVar.f3371d -= ((StaggeredGridLayoutManager) cVar.f3373g).f8334l0.c(view);
                    }
                    cVar.f3369b = RecyclerView.UNDEFINED_DURATION;
                    x0(F8, z);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void m(String str) {
        if (this.f8347z0 == null) {
            super.m(str);
        }
    }

    public final void m0(int i, int i8) {
        c1(i, i8, 2);
    }

    public final void m1() {
        if (this.f8336n0 == 1 || !e1()) {
            this.f8339r0 = this.f8338q0;
        } else {
            this.f8339r0 = !this.f8338q0;
        }
    }

    public final int n1(int i, Z z, f0 f0Var) {
        if (G() == 0 || i == 0) {
            return 0;
        }
        i1(i, f0Var);
        C0509u uVar = this.p0;
        int T02 = T0(z, uVar, f0Var);
        if (uVar.f8524b >= T02) {
            if (i < 0) {
                i = -T02;
            } else {
                i = T02;
            }
        }
        this.f8334l0.p(-i);
        this.f8345x0 = this.f8339r0;
        uVar.f8524b = 0;
        j1(z, uVar);
        return i;
    }

    public final boolean o() {
        if (this.f8336n0 == 0) {
            return true;
        }
        return false;
    }

    public final void o0(RecyclerView recyclerView, int i, int i8) {
        c1(i, i8, 4);
    }

    public final void o1(int i) {
        boolean z;
        C0509u uVar = this.p0;
        uVar.e = i;
        boolean z6 = this.f8339r0;
        int i8 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z6 != z) {
            i8 = -1;
        }
        uVar.f8526d = i8;
    }

    public final boolean p() {
        if (this.f8336n0 == 1) {
            return true;
        }
        return false;
    }

    public final void p0(Z z, f0 f0Var) {
        g1(z, f0Var, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p1(int r5, androidx.recyclerview.widget.f0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.u r0 = r4.p0
            r1 = 0
            r0.f8524b = r1
            r0.f8525c = r5
            androidx.recyclerview.widget.y r2 = r4.f8312Y
            r3 = 1
            if (r2 == 0) goto L_0x0012
            boolean r2 = r2.e
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0034
            int r6 = r6.f8395a
            r2 = -1
            if (r6 == r2) goto L_0x0034
            boolean r2 = r4.f8339r0
            if (r6 >= r5) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r2 != r5) goto L_0x002b
            androidx.emoji2.text.f r5 = r4.f8334l0
            int r5 = r5.l()
        L_0x0029:
            r6 = 0
            goto L_0x0036
        L_0x002b:
            androidx.emoji2.text.f r5 = r4.f8334l0
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L_0x0036
        L_0x0034:
            r5 = 0
            goto L_0x0029
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f8309V
            if (r2 == 0) goto L_0x0051
            boolean r2 = r2.mClipToPadding
            if (r2 == 0) goto L_0x0051
            androidx.emoji2.text.f r2 = r4.f8334l0
            int r2 = r2.k()
            int r2 = r2 - r6
            r0.f8527f = r2
            androidx.emoji2.text.f r6 = r4.f8334l0
            int r6 = r6.g()
            int r6 = r6 + r5
            r0.f8528g = r6
            goto L_0x005d
        L_0x0051:
            androidx.emoji2.text.f r2 = r4.f8334l0
            int r2 = r2.f()
            int r2 = r2 + r5
            r0.f8528g = r2
            int r5 = -r6
            r0.f8527f = r5
        L_0x005d:
            r0.f8529h = r1
            r0.f8523a = r3
            androidx.emoji2.text.f r5 = r4.f8334l0
            int r5 = r5.i()
            if (r5 != 0) goto L_0x0072
            androidx.emoji2.text.f r5 = r4.f8334l0
            int r5 = r5.f()
            if (r5 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r0.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p1(int, androidx.recyclerview.widget.f0):void");
    }

    public final boolean q(S s8) {
        return s8 instanceof o0;
    }

    public final void q0(f0 f0Var) {
        this.f8341t0 = -1;
        this.f8342u0 = RecyclerView.UNDEFINED_DURATION;
        this.f8347z0 = null;
        this.f8328B0.a();
    }

    public final void q1(c cVar, int i, int i8) {
        int i9 = cVar.f3371d;
        int i10 = cVar.e;
        if (i == -1) {
            int i11 = cVar.f3369b;
            if (i11 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) cVar.f3372f).get(0);
                cVar.f3369b = ((StaggeredGridLayoutManager) cVar.f3373g).f8334l0.e(view);
                ((o0) view.getLayoutParams()).getClass();
                i11 = cVar.f3369b;
            }
            if (i11 + i9 <= i8) {
                this.f8340s0.set(i10, false);
                return;
            }
            return;
        }
        int i12 = cVar.f3370c;
        if (i12 == Integer.MIN_VALUE) {
            cVar.a();
            i12 = cVar.f3370c;
        }
        if (i12 - i9 >= i8) {
            this.f8340s0.set(i10, false);
        }
    }

    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof q0) {
            q0 q0Var = (q0) parcelable;
            this.f8347z0 = q0Var;
            if (this.f8341t0 != -1) {
                q0Var.f8498X = null;
                q0Var.f8497W = 0;
                q0Var.f8495U = -1;
                q0Var.f8496V = -1;
                q0Var.f8498X = null;
                q0Var.f8497W = 0;
                q0Var.f8499Y = 0;
                q0Var.f8500Z = null;
                q0Var.f8501a0 = null;
            }
            z0();
        }
    }

    public final void s(int i, int i8, f0 f0Var, C0506q qVar) {
        C0509u uVar;
        int i9;
        int i10;
        if (this.f8336n0 != 0) {
            i = i8;
        }
        if (G() != 0 && i != 0) {
            i1(i, f0Var);
            int[] iArr = this.f8330D0;
            if (iArr == null || iArr.length < this.f8332j0) {
                this.f8330D0 = new int[this.f8332j0];
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f8332j0;
                uVar = this.p0;
                if (i12 >= i14) {
                    break;
                }
                if (uVar.f8526d == -1) {
                    i9 = uVar.f8527f;
                    i10 = this.f8333k0[i12].k(i9);
                } else {
                    i9 = this.f8333k0[i12].i(uVar.f8528g);
                    i10 = uVar.f8528g;
                }
                int i15 = i9 - i10;
                if (i15 >= 0) {
                    this.f8330D0[i13] = i15;
                    i13++;
                }
                i12++;
            }
            Arrays.sort(this.f8330D0, 0, i13);
            while (i11 < i13) {
                int i16 = uVar.f8525c;
                if (i16 >= 0 && i16 < f0Var.b()) {
                    qVar.a(uVar.f8525c, this.f8330D0[i11]);
                    uVar.f8525c += uVar.f8526d;
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, androidx.recyclerview.widget.q0] */
    /* JADX WARNING: type inference failed for: r1v27, types: [android.os.Parcelable, java.lang.Object, androidx.recyclerview.widget.q0] */
    public final Parcelable s0() {
        int i;
        View view;
        int i8;
        int k8;
        int[] iArr;
        q0 q0Var = this.f8347z0;
        if (q0Var != null) {
            ? obj = new Object();
            obj.f8497W = q0Var.f8497W;
            obj.f8495U = q0Var.f8495U;
            obj.f8496V = q0Var.f8496V;
            obj.f8498X = q0Var.f8498X;
            obj.f8499Y = q0Var.f8499Y;
            obj.f8500Z = q0Var.f8500Z;
            obj.f8502b0 = q0Var.f8502b0;
            obj.f8503c0 = q0Var.f8503c0;
            obj.f8504d0 = q0Var.f8504d0;
            obj.f8501a0 = q0Var.f8501a0;
            return obj;
        }
        ? obj2 = new Object();
        obj2.f8502b0 = this.f8338q0;
        obj2.f8503c0 = this.f8345x0;
        obj2.f8504d0 = this.f8346y0;
        g gVar = this.f8343v0;
        if (gVar == null || (iArr = gVar.f4142U) == null) {
            obj2.f8499Y = 0;
        } else {
            obj2.f8500Z = iArr;
            obj2.f8499Y = iArr.length;
            obj2.f8501a0 = gVar.f4143V;
        }
        int i9 = -1;
        if (G() > 0) {
            if (this.f8345x0) {
                i = Z0();
            } else {
                i = Y0();
            }
            obj2.f8495U = i;
            if (this.f8339r0) {
                view = U0(true);
            } else {
                view = V0(true);
            }
            if (view != null) {
                i9 = Q.S(view);
            }
            obj2.f8496V = i9;
            int i10 = this.f8332j0;
            obj2.f8497W = i10;
            obj2.f8498X = new int[i10];
            for (int i11 = 0; i11 < this.f8332j0; i11++) {
                if (this.f8345x0) {
                    i8 = this.f8333k0[i11].i(RecyclerView.UNDEFINED_DURATION);
                    if (i8 != Integer.MIN_VALUE) {
                        k8 = this.f8334l0.g();
                    } else {
                        obj2.f8498X[i11] = i8;
                    }
                } else {
                    i8 = this.f8333k0[i11].k(RecyclerView.UNDEFINED_DURATION);
                    if (i8 != Integer.MIN_VALUE) {
                        k8 = this.f8334l0.k();
                    } else {
                        obj2.f8498X[i11] = i8;
                    }
                }
                i8 -= k8;
                obj2.f8498X[i11] = i8;
            }
        } else {
            obj2.f8495U = -1;
            obj2.f8496V = -1;
            obj2.f8497W = 0;
        }
        return obj2;
    }

    public final void t0(int i) {
        if (i == 0) {
            P0();
        }
    }

    public final int u(f0 f0Var) {
        return Q0(f0Var);
    }

    public final int v(f0 f0Var) {
        return R0(f0Var);
    }

    public final int w(f0 f0Var) {
        return S0(f0Var);
    }

    public final int x(f0 f0Var) {
        return Q0(f0Var);
    }

    public final int y(f0 f0Var) {
        return R0(f0Var);
    }

    public final int z(f0 f0Var) {
        return S0(f0Var);
    }
}
