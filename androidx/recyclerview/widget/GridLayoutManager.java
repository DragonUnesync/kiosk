package androidx.recyclerview.widget;

import N.e;
import O7.b;
import Q0.g;
import R2.c;
import T0.C;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;
import u.C1477r;
import v0.C1510H;
import w0.C1576e;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: A0  reason: collision with root package name */
    public int[] f8273A0;

    /* renamed from: B0  reason: collision with root package name */
    public View[] f8274B0;

    /* renamed from: C0  reason: collision with root package name */
    public final SparseIntArray f8275C0 = new SparseIntArray();

    /* renamed from: D0  reason: collision with root package name */
    public final SparseIntArray f8276D0 = new SparseIntArray();

    /* renamed from: E0  reason: collision with root package name */
    public final c f8277E0 = new c(20, (byte) 0);

    /* renamed from: F0  reason: collision with root package name */
    public final Rect f8278F0 = new Rect();

    /* renamed from: y0  reason: collision with root package name */
    public boolean f8279y0 = false;

    /* renamed from: z0  reason: collision with root package name */
    public int f8280z0 = -1;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        super(context, attributeSet, i, i8);
        A1(Q.T(context, attributeSet, i, i8).f8305b);
    }

    public final int A0(int i, Z z, f0 f0Var) {
        B1();
        u1();
        return super.A0(i, z, f0Var);
    }

    public final void A1(int i) {
        if (i != this.f8280z0) {
            this.f8279y0 = true;
            if (i >= 1) {
                this.f8280z0 = i;
                this.f8277E0.l0();
                z0();
                return;
            }
            throw new IllegalArgumentException(g.m(i, "Span count should be at least 1. Provided "));
        }
    }

    public final void B1() {
        int paddingBottom;
        int paddingTop;
        if (this.f8283j0 == 1) {
            paddingBottom = this.f8321h0 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f8322i0 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        t1(paddingBottom - paddingTop);
    }

    public final S C() {
        if (this.f8283j0 == 0) {
            return new C0508t(-2, -1);
        }
        return new C0508t(-1, -2);
    }

    public final int C0(int i, Z z, f0 f0Var) {
        B1();
        u1();
        return super.C0(i, z, f0Var);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.recyclerview.widget.S, androidx.recyclerview.widget.t] */
    public final S D(Context context, AttributeSet attributeSet) {
        ? s8 = new S(context, attributeSet);
        s8.f8519Y = -1;
        s8.f8520Z = 0;
        return s8;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.recyclerview.widget.S, androidx.recyclerview.widget.t] */
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.recyclerview.widget.S, androidx.recyclerview.widget.t] */
    public final S E(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? s8 = new S((ViewGroup.MarginLayoutParams) layoutParams);
            s8.f8519Y = -1;
            s8.f8520Z = 0;
            return s8;
        }
        ? s9 = new S(layoutParams);
        s9.f8519Y = -1;
        s9.f8520Z = 0;
        return s9;
    }

    public final void F0(Rect rect, int i, int i8) {
        int i9;
        int i10;
        if (this.f8273A0 == null) {
            super.F0(rect, i, i8);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f8283j0 == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f8309V;
            WeakHashMap weakHashMap = C1510H.f15874a;
            i10 = Q.r(i8, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f8273A0;
            i9 = Q.r(i, iArr[iArr.length - 1] + paddingRight, this.f8309V.getMinimumWidth());
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f8309V;
            WeakHashMap weakHashMap2 = C1510H.f15874a;
            i9 = Q.r(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f8273A0;
            i10 = Q.r(i8, iArr2[iArr2.length - 1] + paddingBottom, this.f8309V.getMinimumHeight());
        }
        this.f8309V.setMeasuredDimension(i9, i10);
    }

    public final int I(Z z, f0 f0Var) {
        if (this.f8283j0 == 1) {
            return this.f8280z0;
        }
        if (f0Var.b() < 1) {
            return 0;
        }
        return w1(f0Var.b() - 1, z, f0Var) + 1;
    }

    public final boolean N0() {
        if (this.f8292t0 != null || this.f8279y0) {
            return false;
        }
        return true;
    }

    public final void P0(f0 f0Var, C0511w wVar, C0506q qVar) {
        int i = this.f8280z0;
        for (int i8 = 0; i8 < this.f8280z0 && (r3 = wVar.f8537d) >= 0 && r3 < f0Var.b() && i > 0; i8++) {
            qVar.a(wVar.f8537d, Math.max(0, wVar.f8539g));
            this.f8277E0.getClass();
            i--;
            wVar.f8537d += wVar.e;
        }
    }

    public final int U(Z z, f0 f0Var) {
        if (this.f8283j0 == 0) {
            return this.f8280z0;
        }
        if (f0Var.b() < 1) {
            return 0;
        }
        return w1(f0Var.b() - 1, z, f0Var) + 1;
    }

    public final View c1(Z z, f0 f0Var, boolean z6, boolean z8) {
        int i;
        int i8;
        int G8 = G();
        int i9 = 1;
        if (z8) {
            i8 = G() - 1;
            i = -1;
            i9 = -1;
        } else {
            i = G8;
            i8 = 0;
        }
        int b8 = f0Var.b();
        U0();
        int k8 = this.f8285l0.k();
        int g8 = this.f8285l0.g();
        View view = null;
        View view2 = null;
        while (i8 != i) {
            View F8 = F(i8);
            int S8 = Q.S(F8);
            if (S8 >= 0 && S8 < b8 && x1(S8, z, f0Var) == 0) {
                if (((S) F8.getLayoutParams()).f8323U.isRemoved()) {
                    if (view2 == null) {
                        view2 = F8;
                    }
                } else if (this.f8285l0.e(F8) < g8 && this.f8285l0.b(F8) >= k8) {
                    return F8;
                } else {
                    if (view == null) {
                        view = F8;
                    }
                }
            }
            i8 += i9;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == r5) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0101, code lost:
        if (r13 == r5) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.f8308U.f8374c.contains(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View e0(android.view.View r23, int r24, androidx.recyclerview.widget.Z r25, androidx.recyclerview.widget.f0 r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f8309V
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0023
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.findContainingItemView(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            androidx.recyclerview.widget.c r6 = r0.f8308U
            java.util.ArrayList r6 = r6.f8374c
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0023
            goto L_0x0017
        L_0x0023:
            if (r3 != 0) goto L_0x0026
            return r4
        L_0x0026:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.t r6 = (androidx.recyclerview.widget.C0508t) r6
            int r7 = r6.f8519Y
            int r6 = r6.f8520Z
            int r6 = r6 + r7
            android.view.View r5 = super.e0(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0038
            return r4
        L_0x0038:
            r5 = r24
            int r5 = r0.T0(r5)
            r9 = 1
            if (r5 != r9) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            boolean r10 = r0.f8288o0
            r11 = -1
            if (r5 == r10) goto L_0x0051
            int r5 = r22.G()
            int r5 = r5 - r9
            r10 = -1
            r12 = -1
            goto L_0x0058
        L_0x0051:
            int r5 = r22.G()
            r10 = r5
            r5 = 0
            r12 = 1
        L_0x0058:
            int r13 = r0.f8283j0
            if (r13 != r9) goto L_0x0064
            boolean r13 = r22.h1()
            if (r13 == 0) goto L_0x0064
            r13 = 1
            goto L_0x0065
        L_0x0064:
            r13 = 0
        L_0x0065:
            int r14 = r0.w1(r5, r1, r2)
            r11 = r5
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r5 = r4
        L_0x0071:
            if (r11 == r10) goto L_0x007f
            r17 = r10
            int r10 = r0.w1(r11, r1, r2)
            android.view.View r1 = r0.F(r11)
            if (r1 != r3) goto L_0x0083
        L_0x007f:
            r21 = r5
            goto L_0x013b
        L_0x0083:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0096
            if (r10 == r14) goto L_0x0096
            if (r4 == 0) goto L_0x008e
            goto L_0x007f
        L_0x008e:
            r18 = r3
            r21 = r5
        L_0x0092:
            r19 = r9
            goto L_0x012b
        L_0x0096:
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            androidx.recyclerview.widget.t r10 = (androidx.recyclerview.widget.C0508t) r10
            int r2 = r10.f8519Y
            r18 = r3
            int r3 = r10.f8520Z
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ae
            if (r2 != r7) goto L_0x00ae
            if (r3 != r6) goto L_0x00ae
            return r1
        L_0x00ae:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00be
        L_0x00b6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00be:
            r21 = r5
        L_0x00c0:
            r19 = r9
            goto L_0x0103
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e2
            if (r5 <= r9) goto L_0x00d8
        L_0x00d7:
            goto L_0x00c0
        L_0x00d8:
            if (r5 != r9) goto L_0x0092
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0092
            goto L_0x00d7
        L_0x00e2:
            if (r4 != 0) goto L_0x0092
            r19 = r9
            R2.c r9 = r0.f8310W
            boolean r9 = r9.o0(r1)
            if (r9 == 0) goto L_0x00f7
            R2.c r9 = r0.f8311X
            boolean r9 = r9.o0(r1)
            if (r9 == 0) goto L_0x00f7
            goto L_0x012b
        L_0x00f7:
            if (r5 <= r12) goto L_0x00fa
            goto L_0x0103
        L_0x00fa:
            if (r5 != r12) goto L_0x012b
            if (r2 <= r8) goto L_0x0100
            r5 = 1
            goto L_0x0101
        L_0x0100:
            r5 = 0
        L_0x0101:
            if (r13 != r5) goto L_0x012b
        L_0x0103:
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x011a
            int r4 = r10.f8519Y
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x012f
        L_0x011a:
            int r5 = r10.f8519Y
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r8 = r5
            r9 = r19
            r5 = r1
            goto L_0x012f
        L_0x012b:
            r9 = r19
            r5 = r21
        L_0x012f:
            int r11 = r11 + r16
            r1 = r25
            r2 = r26
            r10 = r17
            r3 = r18
            goto L_0x0071
        L_0x013b:
            if (r4 == 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r4 = r21
        L_0x0140:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.e0(android.view.View, int, androidx.recyclerview.widget.Z, androidx.recyclerview.widget.f0):android.view.View");
    }

    public final void g0(Z z, f0 f0Var, C1576e eVar) {
        super.g0(z, f0Var, eVar);
        eVar.i(GridView.class.getName());
    }

    public final void i0(Z z, f0 f0Var, View view, C1576e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0508t)) {
            h0(view, eVar);
            return;
        }
        C0508t tVar = (C0508t) layoutParams;
        int w1 = w1(tVar.f8323U.getLayoutPosition(), z, f0Var);
        int i = this.f8283j0;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(tVar.f8519Y, tVar.f8520Z, w1, 1, false, false));
            return;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(w1, 1, tVar.f8519Y, tVar.f8520Z, false, false));
    }

    public final void i1(Z z, f0 f0Var, C0511w wVar, C0510v vVar) {
        boolean z6;
        int i;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z9;
        View b8;
        Z z10 = z;
        f0 f0Var2 = f0Var;
        C0511w wVar2 = wVar;
        C0510v vVar2 = vVar;
        int j7 = this.f8285l0.j();
        if (j7 != 1073741824) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (G() > 0) {
            i = this.f8273A0[this.f8280z0];
        } else {
            i = 0;
        }
        if (z6) {
            B1();
        }
        if (wVar2.e == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i17 = this.f8280z0;
        if (!z8) {
            i17 = x1(wVar2.f8537d, z10, f0Var2) + y1(wVar2.f8537d, z10, f0Var2);
        }
        int i18 = 0;
        while (i18 < this.f8280z0 && (r14 = wVar2.f8537d) >= 0 && r14 < f0Var.b() && i17 > 0) {
            int i19 = wVar2.f8537d;
            int y12 = y1(i19, z10, f0Var2);
            if (y12 <= this.f8280z0) {
                i17 -= y12;
                if (i17 < 0 || (b8 = wVar2.b(z10)) == null) {
                    break;
                }
                this.f8274B0[i18] = b8;
                i18++;
            } else {
                throw new IllegalArgumentException(e.z(C1477r.e("Item at position ", i19, " requires ", y12, " spans but GridLayoutManager has only "), this.f8280z0, " spans."));
            }
        }
        if (i18 == 0) {
            vVar2.f8531b = true;
            return;
        }
        if (z8) {
            i9 = i18;
            i10 = 0;
            i8 = 1;
        } else {
            i10 = i18 - 1;
            i9 = -1;
            i8 = -1;
        }
        int i20 = 0;
        while (i10 != i9) {
            View view = this.f8274B0[i10];
            C0508t tVar = (C0508t) view.getLayoutParams();
            int y13 = y1(Q.S(view), z10, f0Var2);
            tVar.f8520Z = y13;
            tVar.f8519Y = i20;
            i20 += y13;
            i10 += i8;
        }
        float f8 = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i18; i22++) {
            View view2 = this.f8274B0[i22];
            if (wVar2.f8542k != null) {
                z9 = false;
                if (z8) {
                    l(view2, -1, true);
                } else {
                    l(view2, 0, true);
                }
            } else if (z8) {
                z9 = false;
                l(view2, -1, false);
            } else {
                z9 = false;
                l(view2, 0, false);
            }
            n(view2, this.f8278F0);
            z1(view2, j7, z9);
            int c8 = this.f8285l0.c(view2);
            if (c8 > i21) {
                i21 = c8;
            }
            float d8 = (((float) this.f8285l0.d(view2)) * 1.0f) / ((float) ((C0508t) view2.getLayoutParams()).f8520Z);
            if (d8 > f8) {
                f8 = d8;
            }
        }
        if (z6) {
            t1(Math.max(Math.round(f8 * ((float) this.f8280z0)), i));
            i21 = 0;
            for (int i23 = 0; i23 < i18; i23++) {
                View view3 = this.f8274B0[i23];
                z1(view3, b.MAX_POW2, true);
                int c9 = this.f8285l0.c(view3);
                if (c9 > i21) {
                    i21 = c9;
                }
            }
        }
        for (int i24 = 0; i24 < i18; i24++) {
            View view4 = this.f8274B0[i24];
            if (this.f8285l0.c(view4) != i21) {
                C0508t tVar2 = (C0508t) view4.getLayoutParams();
                Rect rect = tVar2.f8324V;
                int i25 = rect.top + rect.bottom + tVar2.topMargin + tVar2.bottomMargin;
                int i26 = rect.left + rect.right + tVar2.leftMargin + tVar2.rightMargin;
                int v12 = v1(tVar2.f8519Y, tVar2.f8520Z);
                if (this.f8283j0 == 1) {
                    i16 = Q.H(v12, b.MAX_POW2, i26, tVar2.width, false);
                    i15 = View.MeasureSpec.makeMeasureSpec(i21 - i25, b.MAX_POW2);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, b.MAX_POW2);
                    i15 = Q.H(v12, b.MAX_POW2, i25, tVar2.height, false);
                    i16 = makeMeasureSpec;
                }
                if (K0(view4, i16, i15, (S) view4.getLayoutParams())) {
                    view4.measure(i16, i15);
                }
            }
        }
        vVar2.f8530a = i21;
        if (this.f8283j0 != 1) {
            if (wVar2.f8538f == -1) {
                int i27 = wVar2.f8535b;
                i14 = i27 - i21;
                i13 = i27;
            } else {
                int i28 = wVar2.f8535b;
                i13 = i28 + i21;
                i14 = i28;
            }
            i12 = 0;
            i11 = 0;
        } else if (wVar2.f8538f == -1) {
            i11 = wVar2.f8535b;
            i12 = i11 - i21;
            i14 = 0;
            i13 = 0;
        } else {
            int i29 = wVar2.f8535b;
            i12 = i29;
            i13 = 0;
            i11 = i29 + i21;
            i14 = 0;
        }
        for (int i30 = 0; i30 < i18; i30++) {
            View view5 = this.f8274B0[i30];
            C0508t tVar3 = (C0508t) view5.getLayoutParams();
            if (this.f8283j0 != 1) {
                i12 = getPaddingTop() + this.f8273A0[tVar3.f8519Y];
                i11 = this.f8285l0.d(view5) + i12;
            } else if (h1()) {
                int paddingLeft = getPaddingLeft() + this.f8273A0[this.f8280z0 - tVar3.f8519Y];
                i13 = paddingLeft;
                i14 = paddingLeft - this.f8285l0.d(view5);
            } else {
                i14 = getPaddingLeft() + this.f8273A0[tVar3.f8519Y];
                i13 = this.f8285l0.d(view5) + i14;
            }
            Q.Y(view5, i14, i12, i13, i11);
            if (tVar3.f8323U.isRemoved() || tVar3.f8323U.isUpdated()) {
                vVar2.f8532c = true;
            }
            vVar2.f8533d = view5.hasFocusable() | vVar2.f8533d;
        }
        Arrays.fill(this.f8274B0, (Object) null);
    }

    public final void j0(int i, int i8) {
        c cVar = this.f8277E0;
        cVar.l0();
        ((SparseIntArray) cVar.f4337W).clear();
    }

    public final void j1(Z z, f0 f0Var, C c8, int i) {
        boolean z6;
        B1();
        if (f0Var.b() > 0 && !f0Var.f8400g) {
            if (i == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            int x12 = x1(c8.f4609b, z, f0Var);
            if (z6) {
                while (x12 > 0) {
                    int i8 = c8.f4609b;
                    if (i8 <= 0) {
                        break;
                    }
                    int i9 = i8 - 1;
                    c8.f4609b = i9;
                    x12 = x1(i9, z, f0Var);
                }
            } else {
                int b8 = f0Var.b() - 1;
                int i10 = c8.f4609b;
                while (i10 < b8) {
                    int i11 = i10 + 1;
                    int x13 = x1(i11, z, f0Var);
                    if (x13 <= x12) {
                        break;
                    }
                    i10 = i11;
                    x12 = x13;
                }
                c8.f4609b = i10;
            }
        }
        u1();
    }

    public final void k0() {
        c cVar = this.f8277E0;
        cVar.l0();
        ((SparseIntArray) cVar.f4337W).clear();
    }

    public final void l0(int i, int i8) {
        c cVar = this.f8277E0;
        cVar.l0();
        ((SparseIntArray) cVar.f4337W).clear();
    }

    public final void m0(int i, int i8) {
        c cVar = this.f8277E0;
        cVar.l0();
        ((SparseIntArray) cVar.f4337W).clear();
    }

    public final void o0(RecyclerView recyclerView, int i, int i8) {
        c cVar = this.f8277E0;
        cVar.l0();
        ((SparseIntArray) cVar.f4337W).clear();
    }

    public final void p0(Z z, f0 f0Var) {
        boolean z6 = f0Var.f8400g;
        SparseIntArray sparseIntArray = this.f8276D0;
        SparseIntArray sparseIntArray2 = this.f8275C0;
        if (z6) {
            int G8 = G();
            for (int i = 0; i < G8; i++) {
                C0508t tVar = (C0508t) F(i).getLayoutParams();
                int layoutPosition = tVar.f8323U.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, tVar.f8520Z);
                sparseIntArray.put(layoutPosition, tVar.f8519Y);
            }
        }
        super.p0(z, f0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void p1(boolean z) {
        if (!z) {
            super.p1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final boolean q(S s8) {
        return s8 instanceof C0508t;
    }

    public final void q0(f0 f0Var) {
        super.q0(f0Var);
        this.f8279y0 = false;
    }

    public final void t1(int i) {
        int i8;
        int[] iArr = this.f8273A0;
        int i9 = this.f8280z0;
        if (!(iArr != null && iArr.length == i9 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i9 + 1)];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i / i9;
        int i12 = i % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 <= 0 || i9 - i10 >= i12) {
                i8 = i11;
            } else {
                i8 = i11 + 1;
                i10 -= i9;
            }
            i13 += i8;
            iArr[i14] = i13;
        }
        this.f8273A0 = iArr;
    }

    public final void u1() {
        View[] viewArr = this.f8274B0;
        if (viewArr == null || viewArr.length != this.f8280z0) {
            this.f8274B0 = new View[this.f8280z0];
        }
    }

    public final int v(f0 f0Var) {
        return R0(f0Var);
    }

    public final int v1(int i, int i8) {
        if (this.f8283j0 != 1 || !h1()) {
            int[] iArr = this.f8273A0;
            return iArr[i8 + i] - iArr[i];
        }
        int[] iArr2 = this.f8273A0;
        int i9 = this.f8280z0;
        return iArr2[i9 - i] - iArr2[(i9 - i) - i8];
    }

    public final int w(f0 f0Var) {
        return S0(f0Var);
    }

    public final int w1(int i, Z z, f0 f0Var) {
        boolean z6 = f0Var.f8400g;
        c cVar = this.f8277E0;
        if (!z6) {
            int i8 = this.f8280z0;
            cVar.getClass();
            return c.g0(i, i8);
        }
        int b8 = z.b(i);
        if (b8 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        int i9 = this.f8280z0;
        cVar.getClass();
        return c.g0(b8, i9);
    }

    public final int x1(int i, Z z, f0 f0Var) {
        boolean z6 = f0Var.f8400g;
        c cVar = this.f8277E0;
        if (!z6) {
            int i8 = this.f8280z0;
            cVar.getClass();
            return i % i8;
        }
        int i9 = this.f8276D0.get(i, -1);
        if (i9 != -1) {
            return i9;
        }
        int b8 = z.b(i);
        if (b8 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        int i10 = this.f8280z0;
        cVar.getClass();
        return b8 % i10;
    }

    public final int y(f0 f0Var) {
        return R0(f0Var);
    }

    public final int y1(int i, Z z, f0 f0Var) {
        boolean z6 = f0Var.f8400g;
        c cVar = this.f8277E0;
        if (!z6) {
            cVar.getClass();
            return 1;
        }
        int i8 = this.f8275C0.get(i, -1);
        if (i8 != -1) {
            return i8;
        }
        if (z.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        cVar.getClass();
        return 1;
    }

    public final int z(f0 f0Var) {
        return S0(f0Var);
    }

    public final void z1(View view, int i, boolean z) {
        int i8;
        int i9;
        boolean z6;
        C0508t tVar = (C0508t) view.getLayoutParams();
        Rect rect = tVar.f8324V;
        int i10 = rect.top + rect.bottom + tVar.topMargin + tVar.bottomMargin;
        int i11 = rect.left + rect.right + tVar.leftMargin + tVar.rightMargin;
        int v12 = v1(tVar.f8519Y, tVar.f8520Z);
        if (this.f8283j0 == 1) {
            i8 = Q.H(v12, i, i11, tVar.width, false);
            i9 = Q.H(this.f8285l0.l(), this.f8320g0, i10, tVar.height, true);
        } else {
            int H8 = Q.H(v12, i, i10, tVar.height, false);
            int H9 = Q.H(this.f8285l0.l(), this.f8319f0, i11, tVar.width, true);
            i9 = H8;
            i8 = H9;
        }
        S s8 = (S) view.getLayoutParams();
        if (z) {
            z6 = K0(view, i8, i9, s8);
        } else {
            z6 = I0(view, i8, i9, s8);
        }
        if (z6) {
            view.measure(i8, i9);
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        A1(i);
    }
}
