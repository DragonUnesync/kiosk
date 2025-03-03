package com.google.android.flexbox;

import C7.d;
import V1.C0347f;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.C0513y;
import androidx.recyclerview.widget.C0514z;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.Z;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import e3.C0838a;
import e3.c;
import e3.f;
import e3.g;
import e3.h;
import e3.i;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends Q implements C0838a, e0 {

    /* renamed from: H0  reason: collision with root package name */
    public static final Rect f9114H0 = new Rect();

    /* renamed from: A0  reason: collision with root package name */
    public int f9115A0 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: B0  reason: collision with root package name */
    public int f9116B0 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: C0  reason: collision with root package name */
    public final SparseArray f9117C0 = new SparseArray();

    /* renamed from: D0  reason: collision with root package name */
    public final Context f9118D0;

    /* renamed from: E0  reason: collision with root package name */
    public View f9119E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f9120F0 = -1;

    /* renamed from: G0  reason: collision with root package name */
    public final C0347f f9121G0 = new Object();

    /* renamed from: j0  reason: collision with root package name */
    public int f9122j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f9123k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f9124l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f9125m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f9126n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f9127o0;
    public List p0 = new ArrayList();

    /* renamed from: q0  reason: collision with root package name */
    public final d f9128q0 = new d((C0838a) this);

    /* renamed from: r0  reason: collision with root package name */
    public Z f9129r0;

    /* renamed from: s0  reason: collision with root package name */
    public f0 f9130s0;

    /* renamed from: t0  reason: collision with root package name */
    public h f9131t0;

    /* renamed from: u0  reason: collision with root package name */
    public final f f9132u0 = new f(this);

    /* renamed from: v0  reason: collision with root package name */
    public androidx.emoji2.text.f f9133v0;

    /* renamed from: w0  reason: collision with root package name */
    public androidx.emoji2.text.f f9134w0;

    /* renamed from: x0  reason: collision with root package name */
    public i f9135x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f9136y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public int f9137z0 = RecyclerView.UNDEFINED_DURATION;

    /* JADX WARNING: type inference failed for: r0v1, types: [V1.f, java.lang.Object] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        P T8 = Q.T(context, attributeSet, i, i8);
        int i9 = T8.f8304a;
        if (i9 != 0) {
            if (i9 == 1) {
                if (T8.f8306c) {
                    e1(3);
                } else {
                    e1(2);
                }
            }
        } else if (T8.f8306c) {
            e1(1);
        } else {
            e1(0);
        }
        int i10 = this.f9123k0;
        if (i10 != 1) {
            if (i10 == 0) {
                u0();
                this.p0.clear();
                f fVar = this.f9132u0;
                f.b(fVar);
                fVar.f11233d = 0;
            }
            this.f9123k0 = 1;
            this.f9133v0 = null;
            this.f9134w0 = null;
            z0();
        }
        if (this.f9124l0 != 4) {
            u0();
            this.p0.clear();
            f fVar2 = this.f9132u0;
            f.b(fVar2);
            fVar2.f11233d = 0;
            this.f9124l0 = 4;
            z0();
        }
        this.f9118D0 = context;
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

    public final int A0(int i, Z z, f0 f0Var) {
        if (!j() || this.f9123k0 == 0) {
            int b12 = b1(i, z, f0Var);
            this.f9117C0.clear();
            return b12;
        }
        int c12 = c1(i);
        this.f9132u0.f11233d += c12;
        this.f9134w0.p(-c12);
        return c12;
    }

    public final void B0(int i) {
        this.f9136y0 = i;
        this.f9137z0 = RecyclerView.UNDEFINED_DURATION;
        i iVar = this.f9135x0;
        if (iVar != null) {
            iVar.f11253U = -1;
        }
        z0();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e3.g, androidx.recyclerview.widget.S] */
    public final S C() {
        ? s8 = new S(-2, -2);
        s8.f11237Y = 0.0f;
        s8.f11238Z = 1.0f;
        s8.f11239a0 = -1;
        s8.f11240b0 = -1.0f;
        s8.f11243e0 = 16777215;
        s8.f11244f0 = 16777215;
        return s8;
    }

    public final int C0(int i, Z z, f0 f0Var) {
        if (j() || (this.f9123k0 == 0 && !j())) {
            int b12 = b1(i, z, f0Var);
            this.f9117C0.clear();
            return b12;
        }
        int c12 = c1(i);
        this.f9132u0.f11233d += c12;
        this.f9134w0.p(-c12);
        return c12;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e3.g, androidx.recyclerview.widget.S] */
    public final S D(Context context, AttributeSet attributeSet) {
        ? s8 = new S(context, attributeSet);
        s8.f11237Y = 0.0f;
        s8.f11238Z = 1.0f;
        s8.f11239a0 = -1;
        s8.f11240b0 = -1.0f;
        s8.f11243e0 = 16777215;
        s8.f11244f0 = 16777215;
        return s8;
    }

    public final void L0(RecyclerView recyclerView, int i) {
        C0513y yVar = new C0513y(recyclerView.getContext());
        yVar.f8547a = i;
        M0(yVar);
    }

    public final int O0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        int b8 = f0Var.b();
        R0();
        View T02 = T0(b8);
        View V02 = V0(b8);
        if (f0Var.b() == 0 || T02 == null || V02 == null) {
            return 0;
        }
        return Math.min(this.f9133v0.l(), this.f9133v0.b(V02) - this.f9133v0.e(T02));
    }

    public final int P0(f0 f0Var) {
        if (G() == 0) {
            return 0;
        }
        int b8 = f0Var.b();
        View T02 = T0(b8);
        View V02 = V0(b8);
        if (!(f0Var.b() == 0 || T02 == null || V02 == null)) {
            int S8 = Q.S(T02);
            int S9 = Q.S(V02);
            int abs = Math.abs(this.f9133v0.b(V02) - this.f9133v0.e(T02));
            int[] iArr = (int[]) this.f9128q0.f734X;
            int i = iArr[S8];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[S9] - i) + 1)))) + ((float) (this.f9133v0.k() - this.f9133v0.e(T02))));
            }
        }
        return 0;
    }

    public final int Q0(f0 f0Var) {
        int i;
        if (G() == 0) {
            return 0;
        }
        int b8 = f0Var.b();
        View T02 = T0(b8);
        View V02 = V0(b8);
        if (f0Var.b() == 0 || T02 == null || V02 == null) {
            return 0;
        }
        View X02 = X0(0, G());
        int i8 = -1;
        if (X02 == null) {
            i = -1;
        } else {
            i = Q.S(X02);
        }
        View X03 = X0(G() - 1, -1);
        if (X03 != null) {
            i8 = Q.S(X03);
        }
        return (int) ((((float) Math.abs(this.f9133v0.b(V02) - this.f9133v0.e(T02))) / ((float) ((i8 - i) + 1))) * ((float) f0Var.b()));
    }

    public final void R0() {
        if (this.f9133v0 == null) {
            if (j()) {
                if (this.f9123k0 == 0) {
                    this.f9133v0 = new C0514z(this, 0);
                    this.f9134w0 = new C0514z(this, 1);
                    return;
                }
                this.f9133v0 = new C0514z(this, 1);
                this.f9134w0 = new C0514z(this, 0);
            } else if (this.f9123k0 == 0) {
                this.f9133v0 = new C0514z(this, 1);
                this.f9134w0 = new C0514z(this, 0);
            } else {
                this.f9133v0 = new C0514z(this, 0);
                this.f9134w0 = new C0514z(this, 1);
            }
        }
    }

    public final int S0(Z z, f0 f0Var, h hVar) {
        int i;
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        d dVar;
        int i15;
        View view;
        int i16;
        int i17;
        int i18;
        boolean z8;
        int i19;
        int i20;
        int i21;
        int i22;
        d dVar2;
        Rect rect;
        Z z9 = z;
        h hVar2 = hVar;
        int i23 = hVar2.f11250f;
        if (i23 != Integer.MIN_VALUE) {
            int i24 = hVar2.f11246a;
            if (i24 < 0) {
                hVar2.f11250f = i23 + i24;
            }
            d1(z9, hVar2);
        }
        int i25 = hVar2.f11246a;
        boolean j7 = j();
        int i26 = i25;
        int i27 = 0;
        while (true) {
            if (i26 <= 0 && !this.f9131t0.f11247b) {
                break;
            }
            List list = this.p0;
            int i28 = hVar2.f11249d;
            if (i28 < 0 || i28 >= f0Var.b() || (i = hVar2.f11248c) < 0 || i >= list.size()) {
                break;
            }
            c cVar = (c) this.p0.get(hVar2.f11248c);
            hVar2.f11249d = cVar.f11214o;
            boolean j8 = j();
            f fVar = this.f9132u0;
            d dVar3 = this.f9128q0;
            Rect rect2 = f9114H0;
            if (j8) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i29 = this.f8321h0;
                int i30 = hVar2.e;
                if (hVar2.f11252h == -1) {
                    i30 -= cVar.f11207g;
                }
                int i31 = i30;
                int i32 = hVar2.f11249d;
                float f8 = (float) fVar.f11233d;
                float f9 = ((float) paddingLeft) - f8;
                float f10 = ((float) (i29 - paddingRight)) - f8;
                float max = Math.max(0.0f, 0.0f);
                int i33 = cVar.f11208h;
                i10 = i25;
                int i34 = i32;
                int i35 = 0;
                while (i34 < i32 + i33) {
                    View b8 = b(i34);
                    if (b8 == null) {
                        i18 = i35;
                        i17 = i31;
                        z8 = j7;
                        i20 = i26;
                        i19 = i27;
                        i22 = i33;
                        rect = rect2;
                        dVar2 = dVar3;
                        i21 = i32;
                        i16 = i34;
                    } else {
                        i22 = i33;
                        i21 = i32;
                        if (hVar2.f11252h == 1) {
                            n(b8, rect2);
                            i20 = i26;
                            l(b8, -1, false);
                        } else {
                            i20 = i26;
                            n(b8, rect2);
                            l(b8, i35, false);
                            i35++;
                        }
                        i19 = i27;
                        long j9 = ((long[]) dVar3.f735Y)[i34];
                        int i36 = (int) j9;
                        int i37 = (int) (j9 >> 32);
                        g gVar = (g) b8.getLayoutParams();
                        if (f1(b8, i36, i37, gVar)) {
                            b8.measure(i36, i37);
                        }
                        float f11 = ((float) (gVar.leftMargin + ((S) b8.getLayoutParams()).f8324V.left)) + f9;
                        float f12 = f10 - ((float) (gVar.rightMargin + ((S) b8.getLayoutParams()).f8324V.right));
                        int i38 = i31 + ((S) b8.getLayoutParams()).f8324V.top;
                        if (this.f9126n0) {
                            i18 = i35;
                            rect = rect2;
                            i17 = i31;
                            dVar2 = dVar3;
                            int round = Math.round(f12) - b8.getMeasuredWidth();
                            z8 = j7;
                            i16 = i34;
                            this.f9128q0.w(b8, cVar, round, i38, Math.round(f12), b8.getMeasuredHeight() + i38);
                        } else {
                            i18 = i35;
                            i17 = i31;
                            z8 = j7;
                            rect = rect2;
                            dVar2 = dVar3;
                            i16 = i34;
                            this.f9128q0.w(b8, cVar, Math.round(f11), i38, b8.getMeasuredWidth() + Math.round(f11), b8.getMeasuredHeight() + i38);
                        }
                        f9 = ((float) (b8.getMeasuredWidth() + gVar.rightMargin + ((S) b8.getLayoutParams()).f8324V.right)) + max + f11;
                        f10 = f12 - (((float) ((b8.getMeasuredWidth() + gVar.leftMargin) + ((S) b8.getLayoutParams()).f8324V.left)) + max);
                    }
                    i34 = i16 + 1;
                    rect2 = rect;
                    dVar3 = dVar2;
                    i33 = i22;
                    i32 = i21;
                    i26 = i20;
                    i27 = i19;
                    j7 = z8;
                    i35 = i18;
                    i31 = i17;
                }
                z6 = j7;
                i9 = i26;
                i8 = i27;
                hVar2.f11248c += this.f9131t0.f11252h;
                i11 = cVar.f11207g;
            } else {
                i10 = i25;
                z6 = j7;
                i9 = i26;
                i8 = i27;
                Rect rect3 = rect2;
                d dVar4 = dVar3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i39 = this.f8322i0;
                int i40 = hVar2.e;
                if (hVar2.f11252h == -1) {
                    int i41 = cVar.f11207g;
                    i12 = i40 + i41;
                    i40 -= i41;
                } else {
                    i12 = i40;
                }
                int i42 = hVar2.f11249d;
                float f13 = (float) (i39 - paddingBottom);
                float f14 = (float) fVar.f11233d;
                float f15 = ((float) paddingTop) - f14;
                float f16 = f13 - f14;
                float max2 = Math.max(0.0f, 0.0f);
                int i43 = cVar.f11208h;
                int i44 = i42;
                int i45 = 0;
                while (i44 < i42 + i43) {
                    View b9 = b(i44);
                    if (b9 == null) {
                        dVar = dVar4;
                        i14 = i44;
                        i13 = i43;
                        i15 = i42;
                    } else {
                        float f17 = f16;
                        long j10 = ((long[]) dVar4.f735Y)[i44];
                        int i46 = (int) j10;
                        int i47 = (int) (j10 >> 32);
                        g gVar2 = (g) b9.getLayoutParams();
                        if (f1(b9, i46, i47, gVar2)) {
                            b9.measure(i46, i47);
                        }
                        float f18 = f15 + ((float) (gVar2.topMargin + ((S) b9.getLayoutParams()).f8324V.top));
                        float f19 = f17 - ((float) (gVar2.rightMargin + ((S) b9.getLayoutParams()).f8324V.bottom));
                        dVar = dVar4;
                        if (hVar2.f11252h == 1) {
                            n(b9, rect3);
                            l(b9, -1, false);
                        } else {
                            n(b9, rect3);
                            l(b9, i45, false);
                            i45++;
                        }
                        int i48 = i45;
                        int i49 = i40 + ((S) b9.getLayoutParams()).f8324V.left;
                        int i50 = i12 - ((S) b9.getLayoutParams()).f8324V.right;
                        boolean z10 = this.f9126n0;
                        if (!z10) {
                            boolean z11 = z10;
                            view = b9;
                            i14 = i44;
                            i13 = i43;
                            i15 = i42;
                            if (this.f9127o0) {
                                this.f9128q0.x(view, cVar, z11, i49, Math.round(f19) - view.getMeasuredHeight(), view.getMeasuredWidth() + i49, Math.round(f19));
                            } else {
                                this.f9128q0.x(view, cVar, z11, i49, Math.round(f18), view.getMeasuredWidth() + i49, view.getMeasuredHeight() + Math.round(f18));
                            }
                        } else if (this.f9127o0) {
                            view = b9;
                            i14 = i44;
                            i13 = i43;
                            i15 = i42;
                            this.f9128q0.x(b9, cVar, z10, i50 - b9.getMeasuredWidth(), Math.round(f19) - b9.getMeasuredHeight(), i50, Math.round(f19));
                        } else {
                            view = b9;
                            i14 = i44;
                            i13 = i43;
                            i15 = i42;
                            this.f9128q0.x(view, cVar, z10, i50 - view.getMeasuredWidth(), Math.round(f18), i50, view.getMeasuredHeight() + Math.round(f18));
                        }
                        float measuredHeight = ((float) (view.getMeasuredHeight() + gVar2.topMargin + ((S) view.getLayoutParams()).f8324V.bottom)) + max2 + f18;
                        f16 = f19 - (((float) ((view.getMeasuredHeight() + gVar2.bottomMargin) + ((S) view.getLayoutParams()).f8324V.top)) + max2);
                        f15 = measuredHeight;
                        i45 = i48;
                    }
                    i44 = i14 + 1;
                    i42 = i15;
                    dVar4 = dVar;
                    i43 = i13;
                }
                hVar2.f11248c += this.f9131t0.f11252h;
                i11 = cVar.f11207g;
            }
            i27 = i8 + i11;
            if (z6 || !this.f9126n0) {
                hVar2.e += cVar.f11207g * hVar2.f11252h;
            } else {
                hVar2.e -= cVar.f11207g * hVar2.f11252h;
            }
            i26 = i9 - cVar.f11207g;
            Z z12 = z;
            i25 = i10;
            j7 = z6;
        }
        int i51 = i25;
        int i52 = i27;
        int i53 = hVar2.f11246a - i52;
        hVar2.f11246a = i53;
        int i54 = hVar2.f11250f;
        if (i54 != Integer.MIN_VALUE) {
            int i55 = i54 + i52;
            hVar2.f11250f = i55;
            if (i53 < 0) {
                hVar2.f11250f = i55 + i53;
            }
            d1(z, hVar2);
        }
        return i51 - hVar2.f11246a;
    }

    public final View T0(int i) {
        int i8;
        View Y02 = Y0(0, G(), i);
        if (Y02 == null || (i8 = ((int[]) this.f9128q0.f734X)[Q.S(Y02)]) == -1) {
            return null;
        }
        return U0(Y02, (c) this.p0.get(i8));
    }

    public final View U0(View view, c cVar) {
        boolean j7 = j();
        int i = cVar.f11208h;
        for (int i8 = 1; i8 < i; i8++) {
            View F8 = F(i8);
            if (!(F8 == null || F8.getVisibility() == 8)) {
                if (!this.f9126n0 || j7) {
                    if (this.f9133v0.e(view) <= this.f9133v0.e(F8)) {
                    }
                } else if (this.f9133v0.b(view) >= this.f9133v0.b(F8)) {
                }
                view = F8;
            }
        }
        return view;
    }

    public final View V0(int i) {
        View Y02 = Y0(G() - 1, -1, i);
        if (Y02 == null) {
            return null;
        }
        return W0(Y02, (c) this.p0.get(((int[]) this.f9128q0.f734X)[Q.S(Y02)]));
    }

    public final boolean W() {
        return true;
    }

    public final View W0(View view, c cVar) {
        boolean j7 = j();
        int G8 = (G() - cVar.f11208h) - 1;
        for (int G9 = G() - 2; G9 > G8; G9--) {
            View F8 = F(G9);
            if (!(F8 == null || F8.getVisibility() == 8)) {
                if (!this.f9126n0 || j7) {
                    if (this.f9133v0.b(view) >= this.f9133v0.b(F8)) {
                    }
                } else if (this.f9133v0.e(view) <= this.f9133v0.e(F8)) {
                }
                view = F8;
            }
        }
        return view;
    }

    public final View X0(int i, int i8) {
        int i9;
        boolean z;
        if (i8 > i) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        while (i != i8) {
            View F8 = F(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f8321h0 - getPaddingRight();
            int paddingBottom = this.f8322i0 - getPaddingBottom();
            int L8 = Q.L(F8) - ((S) F8.getLayoutParams()).leftMargin;
            int P8 = Q.P(F8) - ((S) F8.getLayoutParams()).topMargin;
            int O8 = Q.O(F8) + ((S) F8.getLayoutParams()).rightMargin;
            int J8 = Q.J(F8) + ((S) F8.getLayoutParams()).bottomMargin;
            boolean z6 = false;
            if (L8 >= paddingRight || O8 >= paddingLeft) {
                z = true;
            } else {
                z = false;
            }
            if (P8 >= paddingBottom || J8 >= paddingTop) {
                z6 = true;
            }
            if (z && z6) {
                return F8;
            }
            i += i9;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [e3.h, java.lang.Object] */
    public final View Y0(int i, int i8, int i9) {
        int S8;
        R0();
        int i10 = 1;
        if (this.f9131t0 == null) {
            ? obj = new Object();
            obj.f11252h = 1;
            this.f9131t0 = obj;
        }
        int k8 = this.f9133v0.k();
        int g8 = this.f9133v0.g();
        if (i8 <= i) {
            i10 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i8) {
            View F8 = F(i);
            if (F8 != null && (S8 = Q.S(F8)) >= 0 && S8 < i9) {
                if (((S) F8.getLayoutParams()).f8323U.isRemoved()) {
                    if (view2 == null) {
                        view2 = F8;
                    }
                } else if (this.f9133v0.e(F8) >= k8 && this.f9133v0.b(F8) <= g8) {
                    return F8;
                } else {
                    if (view == null) {
                        view = F8;
                    }
                }
            }
            i += i10;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final int Z0(int i, Z z, f0 f0Var, boolean z6) {
        int i8;
        int g8;
        if (j() || !this.f9126n0) {
            int g9 = this.f9133v0.g() - i;
            if (g9 <= 0) {
                return 0;
            }
            i8 = -b1(-g9, z, f0Var);
        } else {
            int k8 = i - this.f9133v0.k();
            if (k8 <= 0) {
                return 0;
            }
            i8 = b1(k8, z, f0Var);
        }
        int i9 = i + i8;
        if (!z6 || (g8 = this.f9133v0.g() - i9) <= 0) {
            return i8;
        }
        this.f9133v0.p(g8);
        return g8 + i8;
    }

    public final void a(View view, int i, int i8, c cVar) {
        n(view, f9114H0);
        if (j()) {
            int i9 = ((S) view.getLayoutParams()).f8324V.left + ((S) view.getLayoutParams()).f8324V.right;
            cVar.e += i9;
            cVar.f11206f += i9;
            return;
        }
        int i10 = ((S) view.getLayoutParams()).f8324V.top + ((S) view.getLayoutParams()).f8324V.bottom;
        cVar.e += i10;
        cVar.f11206f += i10;
    }

    public final int a1(int i, Z z, f0 f0Var, boolean z6) {
        int i8;
        int k8;
        if (j() || !this.f9126n0) {
            int k9 = i - this.f9133v0.k();
            if (k9 <= 0) {
                return 0;
            }
            i8 = -b1(k9, z, f0Var);
        } else {
            int g8 = this.f9133v0.g() - i;
            if (g8 <= 0) {
                return 0;
            }
            i8 = b1(-g8, z, f0Var);
        }
        int i9 = i + i8;
        if (!z6 || (k8 = i9 - this.f9133v0.k()) <= 0) {
            return i8;
        }
        this.f9133v0.p(-k8);
        return i8 - k8;
    }

    public final View b(int i) {
        View view = (View) this.f9117C0.get(i);
        if (view != null) {
            return view;
        }
        return this.f9129r0.l(i, Long.MAX_VALUE).itemView;
    }

    public final void b0() {
        u0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b1(int r19, androidx.recyclerview.widget.Z r20, androidx.recyclerview.widget.f0 r21) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.G()
            r2 = 0
            if (r1 == 0) goto L_0x0202
            if (r19 != 0) goto L_0x000d
            goto L_0x0202
        L_0x000d:
            r18.R0()
            e3.h r1 = r0.f9131t0
            r3 = 1
            r1.i = r3
            boolean r1 = r18.j()
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.f9126n0
            if (r1 == 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r4 = -1
            if (r1 == 0) goto L_0x002b
            if (r19 >= 0) goto L_0x0029
        L_0x0027:
            r5 = 1
            goto L_0x002e
        L_0x0029:
            r5 = -1
            goto L_0x002e
        L_0x002b:
            if (r19 <= 0) goto L_0x0029
            goto L_0x0027
        L_0x002e:
            int r6 = java.lang.Math.abs(r19)
            e3.h r7 = r0.f9131t0
            r7.f11252h = r5
            boolean r7 = r18.j()
            int r8 = r0.f8321h0
            int r9 = r0.f8319f0
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = r0.f8322i0
            int r10 = r0.f8320g0
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            if (r7 != 0) goto L_0x0052
            boolean r10 = r0.f9126n0
            if (r10 == 0) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            C7.d r15 = r0.f9128q0
            if (r5 != r3) goto L_0x0139
            int r11 = r18.G()
            int r11 = r11 - r3
            android.view.View r11 = r0.F(r11)
            if (r11 != 0) goto L_0x0064
            goto L_0x01d8
        L_0x0064:
            e3.h r12 = r0.f9131t0
            androidx.emoji2.text.f r13 = r0.f9133v0
            int r13 = r13.b(r11)
            r12.e = r13
            int r12 = androidx.recyclerview.widget.Q.S(r11)
            java.lang.Object r13 = r15.f734X
            int[] r13 = (int[]) r13
            r13 = r13[r12]
            java.util.List r14 = r0.p0
            java.lang.Object r13 = r14.get(r13)
            e3.c r13 = (e3.c) r13
            android.view.View r11 = r0.W0(r11, r13)
            e3.h r13 = r0.f9131t0
            r13.getClass()
            int r12 = r12 + r3
            r13.f11249d = r12
            java.lang.Object r14 = r15.f734X
            int[] r14 = (int[]) r14
            int r3 = r14.length
            if (r3 > r12) goto L_0x0096
            r13.f11248c = r4
            goto L_0x009a
        L_0x0096:
            r3 = r14[r12]
            r13.f11248c = r3
        L_0x009a:
            if (r10 == 0) goto L_0x00c1
            androidx.emoji2.text.f r3 = r0.f9133v0
            int r3 = r3.e(r11)
            r13.e = r3
            e3.h r3 = r0.f9131t0
            androidx.emoji2.text.f r10 = r0.f9133v0
            int r10 = r10.e(r11)
            int r10 = -r10
            androidx.emoji2.text.f r11 = r0.f9133v0
            int r11 = r11.k()
            int r11 = r11 + r10
            r3.f11250f = r11
            e3.h r3 = r0.f9131t0
            int r10 = r3.f11250f
            int r10 = java.lang.Math.max(r10, r2)
            r3.f11250f = r10
            goto L_0x00da
        L_0x00c1:
            androidx.emoji2.text.f r3 = r0.f9133v0
            int r3 = r3.b(r11)
            r13.e = r3
            e3.h r3 = r0.f9131t0
            androidx.emoji2.text.f r10 = r0.f9133v0
            int r10 = r10.b(r11)
            androidx.emoji2.text.f r11 = r0.f9133v0
            int r11 = r11.g()
            int r10 = r10 - r11
            r3.f11250f = r10
        L_0x00da:
            e3.h r3 = r0.f9131t0
            int r3 = r3.f11248c
            if (r3 == r4) goto L_0x00ea
            java.util.List r4 = r0.p0
            int r4 = r4.size()
            r10 = 1
            int r4 = r4 - r10
            if (r3 <= r4) goto L_0x01d0
        L_0x00ea:
            e3.h r3 = r0.f9131t0
            int r3 = r3.f11249d
            androidx.recyclerview.widget.f0 r4 = r0.f9130s0
            int r4 = r4.b()
            if (r3 > r4) goto L_0x01d0
            e3.h r3 = r0.f9131t0
            int r4 = r3.f11250f
            int r14 = r6 - r4
            V1.f r11 = r0.f9121G0
            r4 = 0
            r11.f5767a = r4
            r11.f5768b = r2
            if (r14 <= 0) goto L_0x01d0
            if (r7 == 0) goto L_0x0119
            int r3 = r3.f11249d
            java.util.List r4 = r0.p0
            C7.d r10 = r0.f9128q0
            r16 = -1
            r12 = r8
            r13 = r9
            r7 = r15
            r15 = r3
            r17 = r4
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0129
        L_0x0119:
            r7 = r15
            int r15 = r3.f11249d
            java.util.List r3 = r0.p0
            C7.d r10 = r0.f9128q0
            r16 = -1
            r12 = r9
            r13 = r8
            r17 = r3
            r10.e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0129:
            e3.h r3 = r0.f9131t0
            int r3 = r3.f11249d
            r7.l(r8, r9, r3)
            e3.h r3 = r0.f9131t0
            int r3 = r3.f11249d
            r7.E(r3)
            goto L_0x01d0
        L_0x0139:
            r7 = r15
            android.view.View r3 = r0.F(r2)
            if (r3 != 0) goto L_0x0142
            goto L_0x01d8
        L_0x0142:
            e3.h r8 = r0.f9131t0
            androidx.emoji2.text.f r9 = r0.f9133v0
            int r9 = r9.e(r3)
            r8.e = r9
            int r8 = androidx.recyclerview.widget.Q.S(r3)
            java.lang.Object r9 = r7.f734X
            int[] r9 = (int[]) r9
            r9 = r9[r8]
            java.util.List r11 = r0.p0
            java.lang.Object r9 = r11.get(r9)
            e3.c r9 = (e3.c) r9
            android.view.View r3 = r0.U0(r3, r9)
            e3.h r9 = r0.f9131t0
            r9.getClass()
            java.lang.Object r7 = r7.f734X
            int[] r7 = (int[]) r7
            r7 = r7[r8]
            if (r7 != r4) goto L_0x0170
            r7 = 0
        L_0x0170:
            if (r7 <= 0) goto L_0x0184
            java.util.List r4 = r0.p0
            int r9 = r7 + -1
            java.lang.Object r4 = r4.get(r9)
            e3.c r4 = (e3.c) r4
            e3.h r9 = r0.f9131t0
            int r4 = r4.f11208h
            int r8 = r8 - r4
            r9.f11249d = r8
            goto L_0x0186
        L_0x0184:
            r9.f11249d = r4
        L_0x0186:
            e3.h r4 = r0.f9131t0
            if (r7 <= 0) goto L_0x018d
            r8 = 1
            int r7 = r7 - r8
            goto L_0x018e
        L_0x018d:
            r7 = 0
        L_0x018e:
            r4.f11248c = r7
            if (r10 == 0) goto L_0x01b6
            androidx.emoji2.text.f r7 = r0.f9133v0
            int r7 = r7.b(r3)
            r4.e = r7
            e3.h r4 = r0.f9131t0
            androidx.emoji2.text.f r7 = r0.f9133v0
            int r3 = r7.b(r3)
            androidx.emoji2.text.f r7 = r0.f9133v0
            int r7 = r7.g()
            int r3 = r3 - r7
            r4.f11250f = r3
            e3.h r3 = r0.f9131t0
            int r4 = r3.f11250f
            int r4 = java.lang.Math.max(r4, r2)
            r3.f11250f = r4
            goto L_0x01d0
        L_0x01b6:
            androidx.emoji2.text.f r7 = r0.f9133v0
            int r7 = r7.e(r3)
            r4.e = r7
            e3.h r4 = r0.f9131t0
            androidx.emoji2.text.f r7 = r0.f9133v0
            int r3 = r7.e(r3)
            int r3 = -r3
            androidx.emoji2.text.f r7 = r0.f9133v0
            int r7 = r7.k()
            int r7 = r7 + r3
            r4.f11250f = r7
        L_0x01d0:
            e3.h r3 = r0.f9131t0
            int r4 = r3.f11250f
            int r4 = r6 - r4
            r3.f11246a = r4
        L_0x01d8:
            e3.h r3 = r0.f9131t0
            int r4 = r3.f11250f
            r7 = r20
            r8 = r21
            int r3 = r0.S0(r7, r8, r3)
            int r3 = r3 + r4
            if (r3 >= 0) goto L_0x01e8
            return r2
        L_0x01e8:
            if (r1 == 0) goto L_0x01f3
            if (r6 <= r3) goto L_0x01f0
            int r1 = -r5
            int r1 = r1 * r3
            goto L_0x01f7
        L_0x01f0:
            r1 = r19
            goto L_0x01f7
        L_0x01f3:
            if (r6 <= r3) goto L_0x01f0
            int r1 = r5 * r3
        L_0x01f7:
            androidx.emoji2.text.f r2 = r0.f9133v0
            int r3 = -r1
            r2.p(r3)
            e3.h r2 = r0.f9131t0
            r2.f11251g = r1
            return r1
        L_0x0202:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b1(int, androidx.recyclerview.widget.Z, androidx.recyclerview.widget.f0):int");
    }

    public final int c(View view, int i, int i8) {
        if (j()) {
            return ((S) view.getLayoutParams()).f8324V.left + ((S) view.getLayoutParams()).f8324V.right;
        }
        return ((S) view.getLayoutParams()).f8324V.top + ((S) view.getLayoutParams()).f8324V.bottom;
    }

    public final void c0(RecyclerView recyclerView) {
        this.f9119E0 = (View) recyclerView.getParent();
    }

    public final int c1(int i) {
        int i8;
        int i9;
        int i10;
        if (G() == 0 || i == 0) {
            return 0;
        }
        R0();
        boolean j7 = j();
        View view = this.f9119E0;
        if (j7) {
            i8 = view.getWidth();
        } else {
            i8 = view.getHeight();
        }
        if (j7) {
            i9 = this.f8321h0;
        } else {
            i9 = this.f8322i0;
        }
        int R3 = R();
        f fVar = this.f9132u0;
        if (R3 == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i9 + fVar.f11233d) - i8, abs);
            }
            i10 = fVar.f11233d;
            if (i10 + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((i9 - fVar.f11233d) - i8, i);
        } else {
            i10 = fVar.f11233d;
            if (i10 + i >= 0) {
                return i;
            }
        }
        return -i10;
    }

    public final int d(int i, int i8, int i9) {
        return Q.H(this.f8322i0, this.f8320g0, i8, i9, p());
    }

    public final void d0(RecyclerView recyclerView) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(androidx.recyclerview.widget.Z r10, e3.h r11) {
        /*
            r9 = this;
            boolean r0 = r11.i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r11.f11252h
            r1 = -1
            C7.d r2 = r9.f9128q0
            if (r0 != r1) goto L_0x009b
            int r0 = r11.f11250f
            if (r0 >= 0) goto L_0x0012
            goto L_0x0130
        L_0x0012:
            int r0 = r9.G()
            if (r0 != 0) goto L_0x001a
            goto L_0x0130
        L_0x001a:
            int r3 = r0 + -1
            android.view.View r4 = r9.F(r3)
            if (r4 != 0) goto L_0x0024
            goto L_0x0130
        L_0x0024:
            java.lang.Object r2 = r2.f734X
            int[] r2 = (int[]) r2
            int r4 = androidx.recyclerview.widget.Q.S(r4)
            r2 = r2[r4]
            if (r2 != r1) goto L_0x0032
            goto L_0x0130
        L_0x0032:
            java.util.List r1 = r9.p0
            java.lang.Object r1 = r1.get(r2)
            e3.c r1 = (e3.c) r1
            r4 = r3
        L_0x003b:
            if (r4 < 0) goto L_0x0084
            android.view.View r5 = r9.F(r4)
            if (r5 != 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            int r6 = r11.f11250f
            boolean r7 = r9.j()
            if (r7 != 0) goto L_0x0059
            boolean r7 = r9.f9126n0
            if (r7 == 0) goto L_0x0059
            androidx.emoji2.text.f r7 = r9.f9133v0
            int r7 = r7.b(r5)
            if (r7 > r6) goto L_0x0084
            goto L_0x0068
        L_0x0059:
            androidx.emoji2.text.f r7 = r9.f9133v0
            int r7 = r7.e(r5)
            androidx.emoji2.text.f r8 = r9.f9133v0
            int r8 = r8.f()
            int r8 = r8 - r6
            if (r7 < r8) goto L_0x0084
        L_0x0068:
            int r6 = r1.f11214o
            int r5 = androidx.recyclerview.widget.Q.S(r5)
            if (r6 != r5) goto L_0x0081
            if (r2 > 0) goto L_0x0074
            r0 = r4
            goto L_0x0084
        L_0x0074:
            int r0 = r11.f11252h
            int r2 = r2 + r0
            java.util.List r0 = r9.p0
            java.lang.Object r0 = r0.get(r2)
            e3.c r0 = (e3.c) r0
            r1 = r0
            r0 = r4
        L_0x0081:
            int r4 = r4 + -1
            goto L_0x003b
        L_0x0084:
            if (r3 < r0) goto L_0x0130
            android.view.View r11 = r9.F(r3)
            android.view.View r1 = r9.F(r3)
            if (r1 == 0) goto L_0x0095
            androidx.recyclerview.widget.c r1 = r9.f8308U
            r1.j(r3)
        L_0x0095:
            r10.i(r11)
            int r3 = r3 + -1
            goto L_0x0084
        L_0x009b:
            int r0 = r11.f11250f
            if (r0 >= 0) goto L_0x00a1
            goto L_0x0130
        L_0x00a1:
            int r0 = r9.G()
            if (r0 != 0) goto L_0x00a9
            goto L_0x0130
        L_0x00a9:
            r3 = 0
            android.view.View r4 = r9.F(r3)
            if (r4 != 0) goto L_0x00b2
            goto L_0x0130
        L_0x00b2:
            java.lang.Object r2 = r2.f734X
            int[] r2 = (int[]) r2
            int r4 = androidx.recyclerview.widget.Q.S(r4)
            r2 = r2[r4]
            if (r2 != r1) goto L_0x00c0
            goto L_0x0130
        L_0x00c0:
            java.util.List r4 = r9.p0
            java.lang.Object r4 = r4.get(r2)
            e3.c r4 = (e3.c) r4
        L_0x00c8:
            if (r3 >= r0) goto L_0x0119
            android.view.View r5 = r9.F(r3)
            if (r5 != 0) goto L_0x00d1
            goto L_0x0116
        L_0x00d1:
            int r6 = r11.f11250f
            boolean r7 = r9.j()
            if (r7 != 0) goto L_0x00ed
            boolean r7 = r9.f9126n0
            if (r7 == 0) goto L_0x00ed
            androidx.emoji2.text.f r7 = r9.f9133v0
            int r7 = r7.f()
            androidx.emoji2.text.f r8 = r9.f9133v0
            int r8 = r8.e(r5)
            int r7 = r7 - r8
            if (r7 > r6) goto L_0x0119
            goto L_0x00f5
        L_0x00ed:
            androidx.emoji2.text.f r7 = r9.f9133v0
            int r7 = r7.b(r5)
            if (r7 > r6) goto L_0x0119
        L_0x00f5:
            int r6 = r4.f11215p
            int r5 = androidx.recyclerview.widget.Q.S(r5)
            if (r6 != r5) goto L_0x0116
            java.util.List r1 = r9.p0
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r2 < r1) goto L_0x0109
            r1 = r3
            goto L_0x0119
        L_0x0109:
            int r1 = r11.f11252h
            int r2 = r2 + r1
            java.util.List r1 = r9.p0
            java.lang.Object r1 = r1.get(r2)
            e3.c r1 = (e3.c) r1
            r4 = r1
            r1 = r3
        L_0x0116:
            int r3 = r3 + 1
            goto L_0x00c8
        L_0x0119:
            if (r1 < 0) goto L_0x0130
            android.view.View r11 = r9.F(r1)
            android.view.View r0 = r9.F(r1)
            if (r0 == 0) goto L_0x012a
            androidx.recyclerview.widget.c r0 = r9.f8308U
            r0.j(r1)
        L_0x012a:
            r10.i(r11)
            int r1 = r1 + -1
            goto L_0x0119
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.d1(androidx.recyclerview.widget.Z, e3.h):void");
    }

    public final PointF e(int i) {
        View F8;
        int i8;
        if (G() == 0 || (F8 = F(0)) == null) {
            return null;
        }
        if (i < Q.S(F8)) {
            i8 = -1;
        } else {
            i8 = 1;
        }
        if (j()) {
            return new PointF(0.0f, (float) i8);
        }
        return new PointF((float) i8, 0.0f);
    }

    public final void e1(int i) {
        if (this.f9122j0 != i) {
            u0();
            this.f9122j0 = i;
            this.f9133v0 = null;
            this.f9134w0 = null;
            this.p0.clear();
            f fVar = this.f9132u0;
            f.b(fVar);
            fVar.f11233d = 0;
            z0();
        }
    }

    public final void f(c cVar) {
    }

    public final boolean f1(View view, int i, int i8, g gVar) {
        if (view.isLayoutRequested() || !this.f8315b0 || !X(view.getWidth(), i, gVar.width) || !X(view.getHeight(), i8, gVar.height)) {
            return true;
        }
        return false;
    }

    public final View g(int i) {
        return b(i);
    }

    public final void g1(int i) {
        int i8 = -1;
        View X02 = X0(G() - 1, -1);
        if (X02 != null) {
            i8 = Q.S(X02);
        }
        if (i < i8) {
            int G8 = G();
            d dVar = this.f9128q0;
            dVar.n(G8);
            dVar.o(G8);
            dVar.m(G8);
            if (i < ((int[]) dVar.f734X).length) {
                this.f9120F0 = i;
                View F8 = F(0);
                if (F8 != null) {
                    this.f9136y0 = Q.S(F8);
                    if (j() || !this.f9126n0) {
                        this.f9137z0 = this.f9133v0.e(F8) - this.f9133v0.k();
                        return;
                    }
                    this.f9137z0 = this.f9133v0.h() + this.f9133v0.b(F8);
                }
            }
        }
    }

    public final int getAlignContent() {
        return 5;
    }

    public final int getAlignItems() {
        return this.f9124l0;
    }

    public final int getFlexDirection() {
        return this.f9122j0;
    }

    public final int getFlexItemCount() {
        return this.f9130s0.b();
    }

    public final List getFlexLinesInternal() {
        return this.p0;
    }

    public final int getFlexWrap() {
        return this.f9123k0;
    }

    public final int getLargestMainSize() {
        if (this.p0.size() == 0) {
            return 0;
        }
        int size = this.p0.size();
        int i = RecyclerView.UNDEFINED_DURATION;
        for (int i8 = 0; i8 < size; i8++) {
            i = Math.max(i, ((c) this.p0.get(i8)).e);
        }
        return i;
    }

    public final int getMaxLine() {
        return this.f9125m0;
    }

    public final int getSumOfCrossSize() {
        int size = this.p0.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += ((c) this.p0.get(i8)).f11207g;
        }
        return i;
    }

    public final void h(View view, int i) {
        this.f9117C0.put(i, view);
    }

    public final void h1(f fVar, boolean z, boolean z6) {
        int i;
        int i8;
        boolean z8 = false;
        if (z6) {
            if (j()) {
                i8 = this.f8320g0;
            } else {
                i8 = this.f8319f0;
            }
            h hVar = this.f9131t0;
            if (i8 == 0 || i8 == Integer.MIN_VALUE) {
                z8 = true;
            }
            hVar.f11247b = z8;
        } else {
            this.f9131t0.f11247b = false;
        }
        if (j() || !this.f9126n0) {
            this.f9131t0.f11246a = this.f9133v0.g() - fVar.f11232c;
        } else {
            this.f9131t0.f11246a = fVar.f11232c - getPaddingRight();
        }
        h hVar2 = this.f9131t0;
        hVar2.f11249d = fVar.f11230a;
        hVar2.f11252h = 1;
        hVar2.e = fVar.f11232c;
        hVar2.f11250f = RecyclerView.UNDEFINED_DURATION;
        hVar2.f11248c = fVar.f11231b;
        if (z && this.p0.size() > 1 && (i = fVar.f11231b) >= 0 && i < this.p0.size() - 1) {
            h hVar3 = this.f9131t0;
            hVar3.f11248c++;
            hVar3.f11249d += ((c) this.p0.get(fVar.f11231b)).f11208h;
        }
    }

    public final int i(int i, int i8, int i9) {
        return Q.H(this.f8321h0, this.f8319f0, i8, i9, o());
    }

    public final void i1(f fVar, boolean z, boolean z6) {
        int i;
        int i8;
        boolean z8 = false;
        if (z6) {
            if (j()) {
                i8 = this.f8320g0;
            } else {
                i8 = this.f8319f0;
            }
            h hVar = this.f9131t0;
            if (i8 == 0 || i8 == Integer.MIN_VALUE) {
                z8 = true;
            }
            hVar.f11247b = z8;
        } else {
            this.f9131t0.f11247b = false;
        }
        if (j() || !this.f9126n0) {
            this.f9131t0.f11246a = fVar.f11232c - this.f9133v0.k();
        } else {
            this.f9131t0.f11246a = (this.f9119E0.getWidth() - fVar.f11232c) - this.f9133v0.k();
        }
        h hVar2 = this.f9131t0;
        hVar2.f11249d = fVar.f11230a;
        hVar2.f11252h = -1;
        hVar2.e = fVar.f11232c;
        hVar2.f11250f = RecyclerView.UNDEFINED_DURATION;
        int i9 = fVar.f11231b;
        hVar2.f11248c = i9;
        if (z && i9 > 0 && this.p0.size() > (i = fVar.f11231b)) {
            h hVar3 = this.f9131t0;
            hVar3.f11248c--;
            hVar3.f11249d -= ((c) this.p0.get(i)).f11208h;
        }
    }

    public final boolean j() {
        int i = this.f9122j0;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public final void j0(int i, int i8) {
        g1(i);
    }

    public final int k(View view) {
        if (j()) {
            return ((S) view.getLayoutParams()).f8324V.top + ((S) view.getLayoutParams()).f8324V.bottom;
        }
        return ((S) view.getLayoutParams()).f8324V.left + ((S) view.getLayoutParams()).f8324V.right;
    }

    public final void l0(int i, int i8) {
        g1(Math.min(i, i8));
    }

    public final void m0(int i, int i8) {
        g1(i);
    }

    public final void n0(int i) {
        g1(i);
    }

    public final boolean o() {
        int i;
        if (this.f9123k0 == 0) {
            return j();
        }
        if (j()) {
            int i8 = this.f8321h0;
            View view = this.f9119E0;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (i8 > i) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o0(RecyclerView recyclerView, int i, int i8) {
        g1(i);
        g1(i);
    }

    public final boolean p() {
        int i;
        if (this.f9123k0 == 0) {
            return !j();
        }
        if (j()) {
            return true;
        }
        int i8 = this.f8322i0;
        View view = this.f9119E0;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (i8 > i) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [e3.h, java.lang.Object] */
    public final void p0(Z z, f0 f0Var) {
        boolean z6;
        int i;
        boolean z8;
        int i8;
        int i9;
        int i10;
        C0347f fVar;
        View view;
        androidx.emoji2.text.f fVar2;
        int i11;
        View F8;
        boolean z9;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Z z16 = z;
        f0 f0Var2 = f0Var;
        this.f9129r0 = z16;
        this.f9130s0 = f0Var2;
        int b8 = f0Var.b();
        if (b8 != 0 || !f0Var2.f8400g) {
            int R3 = R();
            int i14 = this.f9122j0;
            if (i14 == 0) {
                if (R3 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9126n0 = z10;
                if (this.f9123k0 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f9127o0 = z11;
            } else if (i14 == 1) {
                if (R3 != 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f9126n0 = z12;
                if (this.f9123k0 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f9127o0 = z13;
            } else if (i14 == 2) {
                if (R3 == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f9126n0 = z14;
                if (this.f9123k0 == 2) {
                    this.f9126n0 = !z14;
                }
                this.f9127o0 = false;
            } else if (i14 != 3) {
                this.f9126n0 = false;
                this.f9127o0 = false;
            } else {
                if (R3 == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f9126n0 = z15;
                if (this.f9123k0 == 2) {
                    this.f9126n0 = !z15;
                }
                this.f9127o0 = true;
            }
            R0();
            if (this.f9131t0 == null) {
                ? obj = new Object();
                obj.f11252h = 1;
                this.f9131t0 = obj;
            }
            d dVar = this.f9128q0;
            dVar.n(b8);
            dVar.o(b8);
            dVar.m(b8);
            this.f9131t0.i = false;
            i iVar = this.f9135x0;
            if (iVar != null && (i13 = iVar.f11253U) >= 0 && i13 < b8) {
                this.f9136y0 = i13;
            }
            f fVar3 = this.f9132u0;
            if (!(fVar3.f11234f && this.f9136y0 == -1 && iVar == null)) {
                f.b(fVar3);
                i iVar2 = this.f9135x0;
                if (!f0Var2.f8400g && (i11 = this.f9136y0) != -1) {
                    if (i11 < 0 || i11 >= f0Var.b()) {
                        this.f9136y0 = -1;
                        this.f9137z0 = RecyclerView.UNDEFINED_DURATION;
                    } else {
                        int i15 = this.f9136y0;
                        fVar3.f11230a = i15;
                        fVar3.f11231b = ((int[]) dVar.f734X)[i15];
                        i iVar3 = this.f9135x0;
                        if (iVar3 != null) {
                            int b9 = f0Var.b();
                            int i16 = iVar3.f11253U;
                            if (i16 >= 0 && i16 < b9) {
                                fVar3.f11232c = this.f9133v0.k() + iVar2.f11254V;
                                fVar3.f11235g = true;
                                fVar3.f11231b = -1;
                                fVar3.f11234f = true;
                            }
                        }
                        if (this.f9137z0 == Integer.MIN_VALUE) {
                            View B8 = B(this.f9136y0);
                            if (B8 == null) {
                                if (G() > 0 && (F8 = F(0)) != null) {
                                    if (this.f9136y0 < Q.S(F8)) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    fVar3.e = z9;
                                }
                                f.a(fVar3);
                            } else if (this.f9133v0.c(B8) > this.f9133v0.l()) {
                                f.a(fVar3);
                            } else if (this.f9133v0.e(B8) - this.f9133v0.k() < 0) {
                                fVar3.f11232c = this.f9133v0.k();
                                fVar3.e = false;
                            } else if (this.f9133v0.g() - this.f9133v0.b(B8) < 0) {
                                fVar3.f11232c = this.f9133v0.g();
                                fVar3.e = true;
                            } else {
                                if (fVar3.e) {
                                    i12 = this.f9133v0.m() + this.f9133v0.b(B8);
                                } else {
                                    i12 = this.f9133v0.e(B8);
                                }
                                fVar3.f11232c = i12;
                            }
                        } else if (j() || !this.f9126n0) {
                            fVar3.f11232c = this.f9133v0.k() + this.f9137z0;
                        } else {
                            fVar3.f11232c = this.f9137z0 - this.f9133v0.h();
                        }
                        fVar3.f11234f = true;
                    }
                }
                if (G() != 0) {
                    if (fVar3.e) {
                        view = V0(f0Var.b());
                    } else {
                        view = T0(f0Var.b());
                    }
                    if (view != null) {
                        FlexboxLayoutManager flexboxLayoutManager = fVar3.f11236h;
                        if (flexboxLayoutManager.f9123k0 == 0) {
                            fVar2 = flexboxLayoutManager.f9134w0;
                        } else {
                            fVar2 = flexboxLayoutManager.f9133v0;
                        }
                        if (flexboxLayoutManager.j() || !flexboxLayoutManager.f9126n0) {
                            if (fVar3.e) {
                                fVar3.f11232c = fVar2.m() + fVar2.b(view);
                            } else {
                                fVar3.f11232c = fVar2.e(view);
                            }
                        } else if (fVar3.e) {
                            fVar3.f11232c = fVar2.m() + fVar2.e(view);
                        } else {
                            fVar3.f11232c = fVar2.b(view);
                        }
                        int S8 = Q.S(view);
                        fVar3.f11230a = S8;
                        fVar3.f11235g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.f9128q0.f734X;
                        if (S8 == -1) {
                            S8 = 0;
                        }
                        int i17 = iArr[S8];
                        if (i17 == -1) {
                            i17 = 0;
                        }
                        fVar3.f11231b = i17;
                        int size = flexboxLayoutManager.p0.size();
                        int i18 = fVar3.f11231b;
                        if (size > i18) {
                            fVar3.f11230a = ((c) flexboxLayoutManager.p0.get(i18)).f11214o;
                        }
                        fVar3.f11234f = true;
                    }
                }
                f.a(fVar3);
                fVar3.f11230a = 0;
                fVar3.f11231b = 0;
                fVar3.f11234f = true;
            }
            A(z);
            if (fVar3.e) {
                i1(fVar3, false, true);
            } else {
                h1(fVar3, false, true);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f8321h0, this.f8319f0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f8322i0, this.f8320g0);
            int i19 = this.f8321h0;
            int i20 = this.f8322i0;
            boolean j7 = j();
            Context context = this.f9118D0;
            if (j7) {
                int i21 = this.f9115A0;
                if (i21 == Integer.MIN_VALUE || i21 == i19) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                h hVar = this.f9131t0;
                if (hVar.f11247b) {
                    i = context.getResources().getDisplayMetrics().heightPixels;
                } else {
                    i = hVar.f11246a;
                }
            } else {
                int i22 = this.f9116B0;
                if (i22 == Integer.MIN_VALUE || i22 == i20) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                h hVar2 = this.f9131t0;
                if (hVar2.f11247b) {
                    i = context.getResources().getDisplayMetrics().widthPixels;
                } else {
                    i = hVar2.f11246a;
                }
            }
            int i23 = i;
            this.f9115A0 = i19;
            this.f9116B0 = i20;
            int i24 = this.f9120F0;
            C0347f fVar4 = this.f9121G0;
            if (i24 != -1 || (this.f9136y0 == -1 && !z6)) {
                C0347f fVar5 = fVar4;
                if (i24 != -1) {
                    i10 = Math.min(i24, fVar3.f11230a);
                } else {
                    i10 = fVar3.f11230a;
                }
                fVar5.f5767a = null;
                fVar5.f5768b = 0;
                if (j()) {
                    if (this.p0.size() > 0) {
                        dVar.g(i10, this.p0);
                        this.f9128q0.e(this.f9121G0, makeMeasureSpec, makeMeasureSpec2, i23, i10, fVar3.f11230a, this.p0);
                    } else {
                        dVar.m(b8);
                        List list = this.p0;
                        this.f9128q0.e(this.f9121G0, makeMeasureSpec, makeMeasureSpec2, i23, 0, -1, list);
                    }
                } else if (this.p0.size() > 0) {
                    dVar.g(i10, this.p0);
                    this.f9128q0.e(this.f9121G0, makeMeasureSpec2, makeMeasureSpec, i23, i10, fVar3.f11230a, this.p0);
                } else {
                    dVar.m(b8);
                    List list2 = this.p0;
                    this.f9128q0.e(this.f9121G0, makeMeasureSpec2, makeMeasureSpec, i23, 0, -1, list2);
                }
                this.p0 = fVar5.f5767a;
                dVar.l(makeMeasureSpec, makeMeasureSpec2, i10);
                dVar.E(i10);
            } else if (!fVar3.e) {
                this.p0.clear();
                fVar4.f5767a = null;
                fVar4.f5768b = 0;
                if (j()) {
                    int i25 = fVar3.f11230a;
                    List list3 = this.p0;
                    fVar = fVar4;
                    this.f9128q0.e(this.f9121G0, makeMeasureSpec, makeMeasureSpec2, i23, 0, i25, list3);
                } else {
                    fVar = fVar4;
                    int i26 = fVar3.f11230a;
                    List list4 = this.p0;
                    this.f9128q0.e(this.f9121G0, makeMeasureSpec2, makeMeasureSpec, i23, 0, i26, list4);
                }
                this.p0 = fVar.f5767a;
                dVar.l(makeMeasureSpec, makeMeasureSpec2, 0);
                dVar.E(0);
                int i27 = ((int[]) dVar.f734X)[fVar3.f11230a];
                fVar3.f11231b = i27;
                this.f9131t0.f11248c = i27;
            }
            S0(z16, f0Var2, this.f9131t0);
            if (fVar3.e) {
                i9 = this.f9131t0.e;
                h1(fVar3, true, false);
                S0(z16, f0Var2, this.f9131t0);
                i8 = this.f9131t0.e;
            } else {
                i8 = this.f9131t0.e;
                i1(fVar3, true, false);
                S0(z16, f0Var2, this.f9131t0);
                i9 = this.f9131t0.e;
            }
            if (G() <= 0) {
                return;
            }
            if (fVar3.e) {
                a1(Z0(i8, z16, f0Var2, true) + i9, z16, f0Var2, false);
            } else {
                Z0(a1(i9, z16, f0Var2, true) + i8, z16, f0Var2, false);
            }
        }
    }

    public final boolean q(S s8) {
        return s8 instanceof g;
    }

    public final void q0(f0 f0Var) {
        this.f9135x0 = null;
        this.f9136y0 = -1;
        this.f9137z0 = RecyclerView.UNDEFINED_DURATION;
        this.f9120F0 = -1;
        f.b(this.f9132u0);
        this.f9117C0.clear();
    }

    public final void r0(Parcelable parcelable) {
        if (parcelable instanceof i) {
            this.f9135x0 = (i) parcelable;
            z0();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, e3.i, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.Parcelable, e3.i, java.lang.Object] */
    public final Parcelable s0() {
        i iVar = this.f9135x0;
        if (iVar != null) {
            ? obj = new Object();
            obj.f11253U = iVar.f11253U;
            obj.f11254V = iVar.f11254V;
            return obj;
        }
        ? obj2 = new Object();
        if (G() > 0) {
            View F8 = F(0);
            obj2.f11253U = Q.S(F8);
            obj2.f11254V = this.f9133v0.e(F8) - this.f9133v0.k();
        } else {
            obj2.f11253U = -1;
        }
        return obj2;
    }

    public final void setFlexLines(List list) {
        this.p0 = list;
    }

    public final int u(f0 f0Var) {
        return O0(f0Var);
    }

    public final int v(f0 f0Var) {
        return P0(f0Var);
    }

    public final int w(f0 f0Var) {
        return Q0(f0Var);
    }

    public final int x(f0 f0Var) {
        return O0(f0Var);
    }

    public final int y(f0 f0Var) {
        return P0(f0Var);
    }

    public final int z(f0 f0Var) {
        return Q0(f0Var);
    }
}
