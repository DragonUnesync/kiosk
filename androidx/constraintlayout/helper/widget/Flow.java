package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d0.d;
import d0.g;
import d0.i;
import f0.p;
import f0.q;
import java.util.ArrayList;
import java.util.HashMap;

public class Flow extends q {

    /* renamed from: f0  reason: collision with root package name */
    public final g f7689f0;

    /* JADX WARNING: type inference failed for: r9v1, types: [d0.i, d0.g] */
    /* JADX WARNING: type inference failed for: r2v0, types: [e0.b, java.lang.Object] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11298U = new int[32];
        this.f11303c0 = new HashMap();
        this.f11300W = context;
        super.e(attributeSet);
        ? iVar = new i();
        iVar.f9679f0 = 0;
        iVar.f9680g0 = 0;
        iVar.f9681h0 = 0;
        iVar.f9682i0 = 0;
        iVar.f9683j0 = 0;
        iVar.f9684k0 = 0;
        iVar.f9685l0 = false;
        iVar.f9686m0 = 0;
        iVar.f9687n0 = 0;
        iVar.f9688o0 = new Object();
        iVar.p0 = null;
        iVar.f9689q0 = -1;
        iVar.f9690r0 = -1;
        iVar.f9691s0 = -1;
        iVar.f9692t0 = -1;
        iVar.f9693u0 = -1;
        iVar.f9694v0 = -1;
        iVar.f9695w0 = 0.5f;
        iVar.f9696x0 = 0.5f;
        iVar.f9697y0 = 0.5f;
        iVar.f9698z0 = 0.5f;
        iVar.f9664A0 = 0.5f;
        iVar.f9665B0 = 0.5f;
        iVar.f9666C0 = 0;
        iVar.f9667D0 = 0;
        iVar.f9668E0 = 2;
        iVar.f9669F0 = 2;
        iVar.f9670G0 = 0;
        iVar.f9671H0 = -1;
        iVar.f9672I0 = 0;
        iVar.f9673J0 = new ArrayList();
        iVar.f9674K0 = null;
        iVar.f9675L0 = null;
        iVar.f9676M0 = null;
        iVar.f9678O0 = 0;
        this.f7689f0 = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f11457b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f7689f0.f9672I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f7689f0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f9679f0 = dimensionPixelSize;
                    gVar.f9680g0 = dimensionPixelSize;
                    gVar.f9681h0 = dimensionPixelSize;
                    gVar.f9682i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar2 = this.f7689f0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f9681h0 = dimensionPixelSize2;
                    gVar2.f9683j0 = dimensionPixelSize2;
                    gVar2.f9684k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f7689f0.f9682i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f7689f0.f9683j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f7689f0.f9679f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f7689f0.f9684k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f7689f0.f9680g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f7689f0.f9670G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f7689f0.f9689q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f7689f0.f9690r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f7689f0.f9691s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f7689f0.f9693u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f7689f0.f9692t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f7689f0.f9694v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f7689f0.f9695w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f7689f0.f9697y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f7689f0.f9664A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f7689f0.f9698z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f7689f0.f9665B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f7689f0.f9696x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f7689f0.f9668E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f7689f0.f9669F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f7689f0.f9666C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f7689f0.f9667D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f7689f0.f9671H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f11301a0 = this.f7689f0;
        g();
    }

    public final void f(d dVar, boolean z) {
        g gVar = this.f7689f0;
        int i = gVar.f9681h0;
        if (i <= 0 && gVar.f9682i0 <= 0) {
            return;
        }
        if (z) {
            gVar.f9683j0 = gVar.f9682i0;
            gVar.f9684k0 = i;
            return;
        }
        gVar.f9683j0 = i;
        gVar.f9684k0 = gVar.f9682i0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: d0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r29v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(d0.g r40, int r41, int r42) {
        /*
            r39 = this;
            r0 = r39
            r9 = r40
            int r10 = android.view.View.MeasureSpec.getMode(r41)
            int r11 = android.view.View.MeasureSpec.getSize(r41)
            int r12 = android.view.View.MeasureSpec.getMode(r42)
            int r13 = android.view.View.MeasureSpec.getSize(r42)
            r14 = 0
            if (r9 == 0) goto L_0x05fc
            int r1 = r9.f9705e0
            r15 = 2
            r8 = 1
            r7 = 3
            if (r1 <= 0) goto L_0x008b
            d0.d r1 = r9.f9590I
            if (r1 == 0) goto L_0x0027
            d0.e r1 = (d0.e) r1
            T3.a r1 = r1.f9637g0
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 != 0) goto L_0x0032
            r9.f9686m0 = r14
            r9.f9687n0 = r14
            r9.f9685l0 = r14
            goto L_0x05f2
        L_0x0032:
            r3 = 0
        L_0x0033:
            int r4 = r9.f9705e0
            if (r3 >= r4) goto L_0x008b
            d0.d[] r4 = r9.f9704d0
            r4 = r4[r3]
            if (r4 != 0) goto L_0x003e
            goto L_0x0088
        L_0x003e:
            boolean r5 = r4 instanceof d0.h
            if (r5 == 0) goto L_0x0043
            goto L_0x0088
        L_0x0043:
            int r5 = r4.h(r14)
            int r6 = r4.h(r8)
            if (r5 != r7) goto L_0x0058
            int r2 = r4.f9618j
            if (r2 == r8) goto L_0x0058
            if (r6 != r7) goto L_0x0058
            int r2 = r4.f9619k
            if (r2 == r8) goto L_0x0058
            goto L_0x0088
        L_0x0058:
            if (r5 != r7) goto L_0x005b
            r5 = 2
        L_0x005b:
            if (r6 != r7) goto L_0x005e
            r6 = 2
        L_0x005e:
            e0.b r2 = r9.f9688o0
            r2.f11129a = r5
            r2.f11130b = r6
            int r5 = r4.l()
            r2.f11131c = r5
            int r5 = r4.i()
            r2.f11132d = r5
            r1.d(r4, r2)
            int r5 = r2.e
            r4.y(r5)
            int r5 = r2.f11133f
            r4.v(r5)
            int r2 = r2.f11134g
            r4.f9597P = r2
            if (r2 <= 0) goto L_0x0085
            r2 = 1
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            r4.f9631w = r2
        L_0x0088:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x008b:
            int r6 = r9.f9683j0
            int r5 = r9.f9684k0
            int r4 = r9.f9679f0
            int r3 = r9.f9680g0
            int[] r2 = new int[r15]
            int r1 = r11 - r6
            int r1 = r1 - r5
            int r7 = r9.f9672I0
            if (r7 != r8) goto L_0x009f
            int r1 = r13 - r4
            int r1 = r1 - r3
        L_0x009f:
            r15 = -1
            if (r7 != 0) goto L_0x00af
            int r7 = r9.f9689q0
            if (r7 != r15) goto L_0x00a8
            r9.f9689q0 = r14
        L_0x00a8:
            int r7 = r9.f9690r0
            if (r7 != r15) goto L_0x00bb
            r9.f9690r0 = r14
            goto L_0x00bb
        L_0x00af:
            int r7 = r9.f9689q0
            if (r7 != r15) goto L_0x00b5
            r9.f9689q0 = r14
        L_0x00b5:
            int r7 = r9.f9690r0
            if (r7 != r15) goto L_0x00bb
            r9.f9690r0 = r14
        L_0x00bb:
            d0.d[] r7 = r9.f9704d0
            r15 = 0
            r17 = 0
        L_0x00c0:
            int r14 = r9.f9705e0
            r8 = 8
            if (r15 >= r14) goto L_0x00d4
            d0.d[] r14 = r9.f9704d0
            r14 = r14[r15]
            int r14 = r14.f9603V
            if (r14 != r8) goto L_0x00d0
            int r17 = r17 + 1
        L_0x00d0:
            int r15 = r15 + 1
            r8 = 1
            goto L_0x00c0
        L_0x00d4:
            if (r17 <= 0) goto L_0x00ff
            int r14 = r14 - r17
            d0.d[] r7 = new d0.d[r14]
            r14 = 0
            r15 = 0
        L_0x00dc:
            int r8 = r9.f9705e0
            if (r14 >= r8) goto L_0x00f9
            d0.d[] r8 = r9.f9704d0
            r8 = r8[r14]
            r19 = r3
            int r3 = r8.f9603V
            r20 = r4
            r4 = 8
            if (r3 == r4) goto L_0x00f2
            r7[r15] = r8
            int r15 = r15 + 1
        L_0x00f2:
            int r14 = r14 + 1
            r3 = r19
            r4 = r20
            goto L_0x00dc
        L_0x00f9:
            r19 = r3
            r20 = r4
        L_0x00fd:
            r14 = r7
            goto L_0x0105
        L_0x00ff:
            r19 = r3
            r20 = r4
            r15 = r14
            goto L_0x00fd
        L_0x0105:
            r9.f9677N0 = r14
            r9.f9678O0 = r15
            int r3 = r9.f9670G0
            java.util.ArrayList r8 = r9.f9673J0
            if (r3 == 0) goto L_0x0510
            r4 = 1
            if (r3 == r4) goto L_0x02a3
            r4 = 2
            if (r3 == r4) goto L_0x012c
            r29 = r2
            r32 = r5
            r33 = r6
            r37 = r10
            r36 = r11
            r34 = r12
            r27 = r13
            r30 = r19
            r31 = r20
        L_0x0127:
            r1 = 0
            r35 = 1
            goto L_0x05a1
        L_0x012c:
            int r3 = r9.f9672I0
            if (r3 != 0) goto L_0x015b
            int r4 = r9.f9671H0
            if (r4 > 0) goto L_0x0157
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x0137:
            r17 = r5
            if (r4 >= r15) goto L_0x0155
            if (r4 <= 0) goto L_0x0140
            int r5 = r9.f9666C0
            int r7 = r7 + r5
        L_0x0140:
            r5 = r14[r4]
            if (r5 != 0) goto L_0x0145
            goto L_0x0150
        L_0x0145:
            int r5 = r9.D(r5, r1)
            int r5 = r5 + r7
            if (r5 <= r1) goto L_0x014d
            goto L_0x0155
        L_0x014d:
            int r8 = r8 + 1
            r7 = r5
        L_0x0150:
            int r4 = r4 + 1
            r5 = r17
            goto L_0x0137
        L_0x0155:
            r4 = 0
            goto L_0x0180
        L_0x0157:
            r17 = r5
            r8 = r4
            goto L_0x0155
        L_0x015b:
            r17 = r5
            int r4 = r9.f9671H0
            if (r4 > 0) goto L_0x017f
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x0164:
            if (r4 >= r15) goto L_0x017e
            if (r4 <= 0) goto L_0x016b
            int r8 = r9.f9667D0
            int r5 = r5 + r8
        L_0x016b:
            r8 = r14[r4]
            if (r8 != 0) goto L_0x0170
            goto L_0x017b
        L_0x0170:
            int r8 = r9.C(r8, r1)
            int r8 = r8 + r5
            if (r8 <= r1) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            int r7 = r7 + 1
            r5 = r8
        L_0x017b:
            int r4 = r4 + 1
            goto L_0x0164
        L_0x017e:
            r4 = r7
        L_0x017f:
            r8 = 0
        L_0x0180:
            int[] r5 = r9.f9676M0
            if (r5 != 0) goto L_0x0189
            r5 = 2
            int[] r5 = new int[r5]
            r9.f9676M0 = r5
        L_0x0189:
            if (r4 != 0) goto L_0x018e
            r5 = 1
            if (r3 == r5) goto L_0x0192
        L_0x018e:
            if (r8 != 0) goto L_0x0194
            if (r3 != 0) goto L_0x0194
        L_0x0192:
            r5 = 1
            goto L_0x0195
        L_0x0194:
            r5 = 0
        L_0x0195:
            if (r5 != 0) goto L_0x0285
            if (r3 != 0) goto L_0x01a5
            float r4 = (float) r15
            float r7 = (float) r8
            float r4 = r4 / r7
            r42 = r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            goto L_0x01b0
        L_0x01a5:
            r42 = r5
            float r5 = (float) r15
            float r7 = (float) r4
            float r5 = r5 / r7
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            int r8 = (int) r7
        L_0x01b0:
            d0.d[] r5 = r9.f9675L0
            if (r5 == 0) goto L_0x01b7
            int r7 = r5.length
            if (r7 >= r8) goto L_0x01b9
        L_0x01b7:
            r7 = 0
            goto L_0x01be
        L_0x01b9:
            r7 = 0
            java.util.Arrays.fill(r5, r7)
            goto L_0x01c2
        L_0x01be:
            d0.d[] r5 = new d0.d[r8]
            r9.f9675L0 = r5
        L_0x01c2:
            d0.d[] r5 = r9.f9674K0
            if (r5 == 0) goto L_0x01cf
            int r7 = r5.length
            if (r7 >= r4) goto L_0x01ca
            goto L_0x01cf
        L_0x01ca:
            r7 = 0
            java.util.Arrays.fill(r5, r7)
            goto L_0x01d3
        L_0x01cf:
            d0.d[] r5 = new d0.d[r4]
            r9.f9674K0 = r5
        L_0x01d3:
            r5 = 0
        L_0x01d4:
            if (r5 >= r8) goto L_0x022f
            r7 = 0
        L_0x01d7:
            if (r7 >= r4) goto L_0x0226
            int r16 = r7 * r8
            int r16 = r16 + r5
            r21 = r6
            r6 = 1
            if (r3 != r6) goto L_0x01e6
            int r6 = r5 * r4
            int r16 = r6 + r7
        L_0x01e6:
            r6 = r16
            int r0 = r14.length
            if (r6 < r0) goto L_0x01ee
        L_0x01eb:
            r27 = r13
            goto L_0x021d
        L_0x01ee:
            r0 = r14[r6]
            if (r0 != 0) goto L_0x01f3
            goto L_0x01eb
        L_0x01f3:
            int r6 = r9.D(r0, r1)
            r27 = r13
            d0.d[] r13 = r9.f9675L0
            r13 = r13[r5]
            if (r13 == 0) goto L_0x0205
            int r13 = r13.l()
            if (r13 >= r6) goto L_0x0209
        L_0x0205:
            d0.d[] r6 = r9.f9675L0
            r6[r5] = r0
        L_0x0209:
            int r6 = r9.C(r0, r1)
            d0.d[] r13 = r9.f9674K0
            r13 = r13[r7]
            if (r13 == 0) goto L_0x0219
            int r13 = r13.i()
            if (r13 >= r6) goto L_0x021d
        L_0x0219:
            d0.d[] r6 = r9.f9674K0
            r6[r7] = r0
        L_0x021d:
            int r7 = r7 + 1
            r0 = r39
            r6 = r21
            r13 = r27
            goto L_0x01d7
        L_0x0226:
            r21 = r6
            r27 = r13
            int r5 = r5 + 1
            r0 = r39
            goto L_0x01d4
        L_0x022f:
            r21 = r6
            r27 = r13
            r0 = 0
            r5 = 0
        L_0x0235:
            if (r0 >= r8) goto L_0x024b
            d0.d[] r6 = r9.f9675L0
            r6 = r6[r0]
            if (r6 == 0) goto L_0x0248
            if (r0 <= 0) goto L_0x0242
            int r7 = r9.f9666C0
            int r5 = r5 + r7
        L_0x0242:
            int r6 = r9.D(r6, r1)
            int r6 = r6 + r5
            r5 = r6
        L_0x0248:
            int r0 = r0 + 1
            goto L_0x0235
        L_0x024b:
            r0 = 0
            r6 = 0
        L_0x024d:
            if (r0 >= r4) goto L_0x0263
            d0.d[] r7 = r9.f9674K0
            r7 = r7[r0]
            if (r7 == 0) goto L_0x0260
            if (r0 <= 0) goto L_0x025a
            int r13 = r9.f9667D0
            int r6 = r6 + r13
        L_0x025a:
            int r7 = r9.C(r7, r1)
            int r7 = r7 + r6
            r6 = r7
        L_0x0260:
            int r0 = r0 + 1
            goto L_0x024d
        L_0x0263:
            r0 = 0
            r2[r0] = r5
            r0 = 1
            r2[r0] = r6
            if (r3 != 0) goto L_0x0276
            if (r5 <= r1) goto L_0x0274
            if (r8 <= r0) goto L_0x0274
            int r8 = r8 + -1
        L_0x0271:
            r5 = r42
            goto L_0x027d
        L_0x0274:
            r5 = 1
            goto L_0x027d
        L_0x0276:
            if (r6 <= r1) goto L_0x0274
            if (r4 <= r0) goto L_0x0274
            int r4 = r4 + -1
            goto L_0x0271
        L_0x027d:
            r0 = r39
            r6 = r21
            r13 = r27
            goto L_0x0195
        L_0x0285:
            r21 = r6
            r27 = r13
            r0 = 1
            int[] r1 = r9.f9676M0
            r3 = 0
            r1[r3] = r8
            r1[r0] = r4
            r29 = r2
            r37 = r10
            r36 = r11
            r34 = r12
            r32 = r17
            r30 = r19
            r31 = r20
            r33 = r21
            goto L_0x0127
        L_0x02a3:
            r17 = r5
            r21 = r6
            r27 = r13
            r0 = 1
            int r13 = r9.f9672I0
            if (r15 != 0) goto L_0x02c2
            r29 = r2
            r37 = r10
            r36 = r11
            r34 = r12
            r32 = r17
            r30 = r19
            r31 = r20
            r33 = r21
            r35 = 1
            goto L_0x050d
        L_0x02c2:
            r8.clear()
            d0.f r7 = new d0.f
            d0.c r6 = r9.z
            d0.c r5 = r9.f9582A
            d0.c r4 = r9.f9632x
            d0.c r3 = r9.f9633y
            r28 = r1
            r1 = r7
            r29 = r2
            r2 = r40
            r18 = r3
            r30 = r19
            r3 = r13
            r31 = r20
            r32 = r17
            r17 = r5
            r5 = r18
            r33 = r21
            r0 = r7
            r34 = r12
            r12 = 3
            r7 = r17
            r12 = r8
            r35 = 1
            r8 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r0)
            if (r13 != 0) goto L_0x0389
            r7 = r0
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x02fc:
            if (r0 >= r15) goto L_0x0381
            r8 = r14[r0]
            r6 = r28
            int r17 = r9.D(r8, r6)
            int[] r3 = r8.f9613c0
            r4 = 0
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x0310
            int r1 = r1 + 1
        L_0x0310:
            r18 = r1
            if (r2 == r6) goto L_0x031b
            int r1 = r9.f9666C0
            int r1 = r1 + r2
            int r1 = r1 + r17
            if (r1 <= r6) goto L_0x0321
        L_0x031b:
            d0.d r1 = r7.f9649b
            if (r1 == 0) goto L_0x0321
            r1 = 1
            goto L_0x0322
        L_0x0321:
            r1 = 0
        L_0x0322:
            if (r1 != 0) goto L_0x032f
            if (r0 <= 0) goto L_0x032f
            int r3 = r9.f9671H0
            if (r3 <= 0) goto L_0x032f
            int r3 = r0 % r3
            if (r3 != 0) goto L_0x032f
            r1 = 1
        L_0x032f:
            if (r1 == 0) goto L_0x0365
            d0.f r7 = new d0.f
            d0.c r5 = r9.z
            d0.c r4 = r9.f9582A
            d0.c r3 = r9.f9632x
            d0.c r2 = r9.f9633y
            r1 = r7
            r19 = r2
            r2 = r40
            r20 = r3
            r3 = r13
            r21 = r4
            r4 = r20
            r20 = r5
            r5 = r19
            r28 = r6
            r6 = r20
            r36 = r11
            r11 = r7
            r7 = r21
            r37 = r10
            r10 = r8
            r8 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r11.f9659n = r0
            r12.add(r11)
            r7 = r11
        L_0x0362:
            r2 = r17
            goto L_0x0374
        L_0x0365:
            r28 = r6
            r37 = r10
            r36 = r11
            r10 = r8
            if (r0 <= 0) goto L_0x0362
            int r1 = r9.f9666C0
            int r1 = r1 + r17
            int r1 = r1 + r2
            r2 = r1
        L_0x0374:
            r7.a(r10)
            int r0 = r0 + 1
            r1 = r18
            r11 = r36
            r10 = r37
            goto L_0x02fc
        L_0x0381:
            r37 = r10
            r36 = r11
        L_0x0385:
            r11 = r28
            goto L_0x0405
        L_0x0389:
            r37 = r10
            r36 = r11
            r7 = r0
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0391:
            if (r0 >= r15) goto L_0x0385
            r10 = r14[r0]
            r11 = r28
            int r17 = r9.C(r10, r11)
            int[] r3 = r10.f9613c0
            r3 = r3[r35]
            r8 = 3
            if (r3 != r8) goto L_0x03a4
            int r1 = r1 + 1
        L_0x03a4:
            r18 = r1
            if (r2 == r11) goto L_0x03af
            int r1 = r9.f9667D0
            int r1 = r1 + r2
            int r1 = r1 + r17
            if (r1 <= r11) goto L_0x03b5
        L_0x03af:
            d0.d r1 = r7.f9649b
            if (r1 == 0) goto L_0x03b5
            r1 = 1
            goto L_0x03b6
        L_0x03b5:
            r1 = 0
        L_0x03b6:
            if (r1 != 0) goto L_0x03c3
            if (r0 <= 0) goto L_0x03c3
            int r3 = r9.f9671H0
            if (r3 <= 0) goto L_0x03c3
            int r3 = r0 % r3
            if (r3 != 0) goto L_0x03c3
            r1 = 1
        L_0x03c3:
            if (r1 == 0) goto L_0x03ed
            d0.f r7 = new d0.f
            d0.c r6 = r9.z
            d0.c r5 = r9.f9582A
            d0.c r4 = r9.f9632x
            d0.c r3 = r9.f9633y
            r1 = r7
            r2 = r40
            r19 = r3
            r3 = r13
            r20 = r5
            r5 = r19
            r28 = r14
            r14 = r7
            r7 = r20
            r19 = 3
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.f9659n = r0
            r12.add(r14)
            r7 = r14
        L_0x03ea:
            r2 = r17
            goto L_0x03f9
        L_0x03ed:
            r28 = r14
            r19 = 3
            if (r0 <= 0) goto L_0x03ea
            int r1 = r9.f9667D0
            int r1 = r1 + r17
            int r1 = r1 + r2
            r2 = r1
        L_0x03f9:
            r7.a(r10)
            int r0 = r0 + 1
            r1 = r18
            r14 = r28
            r28 = r11
            goto L_0x0391
        L_0x0405:
            int r0 = r12.size()
            int r2 = r9.f9683j0
            int r3 = r9.f9679f0
            int r4 = r9.f9684k0
            int r5 = r9.f9680g0
            int[] r6 = r9.f9613c0
            r7 = 0
            r8 = r6[r7]
            r7 = 2
            if (r8 == r7) goto L_0x0420
            r6 = r6[r35]
            if (r6 != r7) goto L_0x041e
            goto L_0x0420
        L_0x041e:
            r8 = 0
            goto L_0x0421
        L_0x0420:
            r8 = 1
        L_0x0421:
            if (r1 <= 0) goto L_0x0446
            if (r8 == 0) goto L_0x0446
            r1 = 0
        L_0x0426:
            if (r1 >= r0) goto L_0x0446
            java.lang.Object r6 = r12.get(r1)
            d0.f r6 = (d0.f) r6
            if (r13 != 0) goto L_0x043a
            int r7 = r6.d()
            int r7 = r11 - r7
            r6.e(r7)
            goto L_0x0443
        L_0x043a:
            int r7 = r6.c()
            int r7 = r11 - r7
            r6.e(r7)
        L_0x0443:
            int r1 = r1 + 1
            goto L_0x0426
        L_0x0446:
            d0.c r1 = r9.f9582A
            d0.c r6 = r9.z
            d0.c r7 = r9.f9632x
            d0.c r8 = r9.f9633y
            r28 = r1
            r38 = r6
            r10 = 0
            r14 = 0
            r15 = 0
        L_0x0455:
            if (r10 >= r0) goto L_0x0508
            java.lang.Object r16 = r12.get(r10)
            r41 = r1
            r1 = r16
            d0.f r1 = (d0.f) r1
            if (r13 != 0) goto L_0x04b3
            int r5 = r0 + -1
            if (r10 >= r5) goto L_0x0479
            int r5 = r10 + 1
            java.lang.Object r5 = r12.get(r5)
            d0.f r5 = (d0.f) r5
            d0.d r5 = r5.f9649b
            d0.c r5 = r5.f9633y
            r28 = r5
            r42 = r6
            r5 = 0
            goto L_0x047f
        L_0x0479:
            int r5 = r9.f9680g0
            r28 = r41
            r42 = r6
        L_0x047f:
            d0.d r6 = r1.f9649b
            d0.c r6 = r6.f9582A
            r16 = r1
            r17 = r13
            r18 = r7
            r19 = r8
            r20 = r38
            r21 = r28
            r22 = r2
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r1.d()
            int r3 = java.lang.Math.max(r14, r3)
            int r1 = r1.c()
            int r1 = r1 + r15
            if (r10 <= 0) goto L_0x04ae
            int r8 = r9.f9667D0
            int r1 = r1 + r8
        L_0x04ae:
            r15 = r1
            r14 = r3
            r8 = r6
            r3 = 0
            goto L_0x0500
        L_0x04b3:
            r42 = r6
            int r4 = r0 + -1
            if (r10 >= r4) goto L_0x04c9
            int r4 = r10 + 1
            java.lang.Object r4 = r12.get(r4)
            d0.f r4 = (d0.f) r4
            d0.d r4 = r4.f9649b
            d0.c r4 = r4.f9632x
            r38 = r4
            r4 = 0
            goto L_0x04cd
        L_0x04c9:
            int r4 = r9.f9684k0
            r38 = r42
        L_0x04cd:
            d0.d r6 = r1.f9649b
            d0.c r6 = r6.z
            r16 = r1
            r17 = r13
            r18 = r7
            r19 = r8
            r20 = r38
            r21 = r28
            r22 = r2
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r1.d()
            int r2 = r2 + r14
            int r1 = r1.c()
            int r1 = java.lang.Math.max(r15, r1)
            if (r10 <= 0) goto L_0x04fc
            int r7 = r9.f9666C0
            int r2 = r2 + r7
        L_0x04fc:
            r15 = r1
            r14 = r2
            r7 = r6
            r2 = 0
        L_0x0500:
            int r10 = r10 + 1
            r1 = r41
            r6 = r42
            goto L_0x0455
        L_0x0508:
            r1 = 0
            r29[r1] = r14
            r29[r35] = r15
        L_0x050d:
            r1 = 0
            goto L_0x05a1
        L_0x0510:
            r29 = r2
            r32 = r5
            r33 = r6
            r37 = r10
            r36 = r11
            r34 = r12
            r27 = r13
            r28 = r14
            r30 = r19
            r31 = r20
            r35 = 1
            r11 = r1
            r12 = r8
            int r0 = r9.f9672I0
            if (r15 != 0) goto L_0x052d
            goto L_0x050d
        L_0x052d:
            int r1 = r12.size()
            if (r1 != 0) goto L_0x0549
            d0.f r10 = new d0.f
            d0.c r6 = r9.z
            d0.c r7 = r9.f9582A
            d0.c r4 = r9.f9632x
            d0.c r5 = r9.f9633y
            r1 = r10
            r2 = r40
            r3 = r0
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r10)
            goto L_0x0589
        L_0x0549:
            r1 = 0
            java.lang.Object r2 = r12.get(r1)
            r10 = r2
            d0.f r10 = (d0.f) r10
            r10.f9650c = r1
            r2 = 0
            r10.f9649b = r2
            r10.f9657l = r1
            r10.f9658m = r1
            r10.f9659n = r1
            r10.f9660o = r1
            r10.f9661p = r1
            int r1 = r9.f9683j0
            int r2 = r9.f9679f0
            int r3 = r9.f9684k0
            int r4 = r9.f9680g0
            d0.c r5 = r9.f9632x
            d0.c r6 = r9.f9633y
            d0.c r7 = r9.z
            d0.c r8 = r9.f9582A
            r16 = r10
            r17 = r0
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r11
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0589:
            r0 = 0
        L_0x058a:
            if (r0 >= r15) goto L_0x0594
            r1 = r28[r0]
            r10.a(r1)
            int r0 = r0 + 1
            goto L_0x058a
        L_0x0594:
            int r0 = r10.d()
            r1 = 0
            r29[r1] = r0
            int r0 = r10.c()
            r29[r35] = r0
        L_0x05a1:
            r0 = r29[r1]
            int r0 = r0 + r33
            int r0 = r0 + r32
            r1 = r29[r35]
            int r1 = r1 + r31
            int r1 = r1 + r30
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = r37
            if (r4 != r3) goto L_0x05ba
            r0 = r34
            r11 = r36
            goto L_0x05cc
        L_0x05ba:
            if (r4 != r2) goto L_0x05c5
            r5 = r36
            int r11 = java.lang.Math.min(r0, r5)
        L_0x05c2:
            r0 = r34
            goto L_0x05cc
        L_0x05c5:
            if (r4 != 0) goto L_0x05c9
            r11 = r0
            goto L_0x05c2
        L_0x05c9:
            r0 = r34
            r11 = 0
        L_0x05cc:
            if (r0 != r3) goto L_0x05d1
            r13 = r27
            goto L_0x05df
        L_0x05d1:
            if (r0 != r2) goto L_0x05da
            r2 = r27
            int r13 = java.lang.Math.min(r1, r2)
            goto L_0x05df
        L_0x05da:
            if (r0 != 0) goto L_0x05de
            r13 = r1
            goto L_0x05df
        L_0x05de:
            r13 = 0
        L_0x05df:
            r9.f9686m0 = r11
            r9.f9687n0 = r13
            r9.y(r11)
            r9.v(r13)
            int r0 = r9.f9705e0
            if (r0 <= 0) goto L_0x05ef
            r14 = 1
            goto L_0x05f0
        L_0x05ef:
            r14 = 0
        L_0x05f0:
            r9.f9685l0 = r14
        L_0x05f2:
            int r0 = r9.f9686m0
            int r1 = r9.f9687n0
            r2 = r39
            r2.setMeasuredDimension(r0, r1)
            goto L_0x0601
        L_0x05fc:
            r2 = r0
            r0 = 0
            r2.setMeasuredDimension(r0, r0)
        L_0x0601:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(d0.g, int, int):void");
    }

    public final void onMeasure(int i, int i8) {
        h(this.f7689f0, i, i8);
    }

    public void setFirstHorizontalBias(float f8) {
        this.f7689f0.f9697y0 = f8;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f7689f0.f9691s0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f8) {
        this.f7689f0.f9698z0 = f8;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f7689f0.f9692t0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f7689f0.f9668E0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f8) {
        this.f7689f0.f9695w0 = f8;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f7689f0.f9666C0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f7689f0.f9689q0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f7689f0.f9671H0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f7689f0.f9672I0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f7689f0;
        gVar.f9679f0 = i;
        gVar.f9680g0 = i;
        gVar.f9681h0 = i;
        gVar.f9682i0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f7689f0.f9680g0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f7689f0.f9683j0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f7689f0.f9684k0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f7689f0.f9679f0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f7689f0.f9669F0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f8) {
        this.f7689f0.f9696x0 = f8;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f7689f0.f9667D0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f7689f0.f9690r0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f7689f0.f9670G0 = i;
        requestLayout();
    }
}
