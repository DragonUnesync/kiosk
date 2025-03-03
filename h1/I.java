package h1;

import H3.M;
import H3.O;
import H3.i0;
import M0.C0129q;
import M0.Y;
import M0.r;
import T0.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

public final class I implements C1059z, C1058y {

    /* renamed from: U  reason: collision with root package name */
    public final C1059z[] f12294U;

    /* renamed from: V  reason: collision with root package name */
    public final IdentityHashMap f12295V;

    /* renamed from: W  reason: collision with root package name */
    public final C1048n f12296W;

    /* renamed from: X  reason: collision with root package name */
    public final ArrayList f12297X = new ArrayList();

    /* renamed from: Y  reason: collision with root package name */
    public final HashMap f12298Y = new HashMap();

    /* renamed from: Z  reason: collision with root package name */
    public C1058y f12299Z;

    /* renamed from: a0  reason: collision with root package name */
    public f0 f12300a0;

    /* renamed from: b0  reason: collision with root package name */
    public C1059z[] f12301b0;

    /* renamed from: c0  reason: collision with root package name */
    public C1047m f12302c0;

    public I(C1048n nVar, long[] jArr, C1059z... zVarArr) {
        this.f12296W = nVar;
        this.f12294U = zVarArr;
        nVar.getClass();
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        this.f12302c0 = new C1047m(i0Var, i0Var);
        this.f12295V = new IdentityHashMap();
        this.f12301b0 = new C1059z[0];
        for (int i = 0; i < zVarArr.length; i++) {
            long j7 = jArr[i];
            if (j7 != 0) {
                this.f12294U[i] = new e0(zVarArr[i], j7);
            }
        }
    }

    public final boolean b() {
        return this.f12302c0.b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(k1.r[] r23, boolean[] r24, h1.Y[] r25, boolean[] r26, long r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = 0
        L_0x000e:
            int r7 = r1.length
            java.util.IdentityHashMap r8 = r0.f12295V
            if (r6 >= r7) goto L_0x004b
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0019
            r9 = 0
            goto L_0x0020
        L_0x0019:
            java.lang.Object r7 = r8.get(r7)
            r9 = r7
            java.lang.Integer r9 = (java.lang.Integer) r9
        L_0x0020:
            r7 = -1
            if (r9 != 0) goto L_0x0025
            r8 = -1
            goto L_0x0029
        L_0x0025:
            int r8 = r9.intValue()
        L_0x0029:
            r3[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0046
            M0.Y r7 = r8.l()
            java.lang.String r7 = r7.f2886b
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r4[r6] = r7
            goto L_0x0048
        L_0x0046:
            r4[r6] = r7
        L_0x0048:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x004b:
            r8.clear()
            int r6 = r1.length
            h1.Y[] r7 = new h1.Y[r6]
            int r10 = r1.length
            h1.Y[] r10 = new h1.Y[r10]
            int r11 = r1.length
            k1.r[] r15 = new k1.r[r11]
            java.util.ArrayList r14 = new java.util.ArrayList
            h1.z[] r13 = r0.f12294U
            int r11 = r13.length
            r14.<init>(r11)
            r18 = r27
            r12 = 0
        L_0x0062:
            int r11 = r13.length
            if (r12 >= r11) goto L_0x0106
            r11 = 0
        L_0x0066:
            int r5 = r1.length
            if (r11 >= r5) goto L_0x00a0
            r5 = r3[r11]
            if (r5 != r12) goto L_0x0070
            r5 = r2[r11]
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            r10[r11] = r5
            r5 = r4[r11]
            if (r5 != r12) goto L_0x0096
            r5 = r1[r11]
            r5.getClass()
            M0.Y r9 = r5.l()
            r16 = r14
            java.util.HashMap r14 = r0.f12298Y
            java.lang.Object r9 = r14.get(r9)
            M0.Y r9 = (M0.Y) r9
            r9.getClass()
            h1.H r14 = new h1.H
            r14.<init>(r5, r9)
            r15[r11] = r14
            r5 = 0
            goto L_0x009b
        L_0x0096:
            r16 = r14
            r5 = 0
            r15[r11] = r5
        L_0x009b:
            int r11 = r11 + 1
            r14 = r16
            goto L_0x0066
        L_0x00a0:
            r16 = r14
            r5 = 0
            r11 = r13[r12]
            r9 = r12
            r12 = r15
            r20 = r13
            r13 = r24
            r5 = r16
            r14 = r10
            r21 = r15
            r15 = r26
            r16 = r18
            long r11 = r11.d(r12, r13, r14, r15, r16)
            if (r9 != 0) goto L_0x00bd
            r18 = r11
            goto L_0x00c1
        L_0x00bd:
            int r13 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x00fe
        L_0x00c1:
            r11 = 0
            r12 = 0
        L_0x00c3:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x00ed
            r13 = r4[r11]
            r14 = 1
            if (r13 != r9) goto L_0x00dd
            r12 = r10[r11]
            r12.getClass()
            r13 = r10[r11]
            r7[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r8.put(r12, r13)
            r12 = 1
            goto L_0x00ea
        L_0x00dd:
            r13 = r3[r11]
            if (r13 != r9) goto L_0x00ea
            r13 = r10[r11]
            if (r13 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r14 = 0
        L_0x00e7:
            P0.l.j(r14)
        L_0x00ea:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00ed:
            if (r12 == 0) goto L_0x00f4
            r11 = r20[r9]
            r5.add(r11)
        L_0x00f4:
            int r12 = r9 + 1
            r14 = r5
            r13 = r20
            r15 = r21
            r5 = 0
            goto L_0x0062
        L_0x00fe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Children enabled at different positions."
            r1.<init>(r2)
            throw r1
        L_0x0106:
            r5 = r14
            r1 = 0
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            h1.z[] r1 = new h1.C1059z[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            h1.z[] r1 = (h1.C1059z[]) r1
            r0.f12301b0 = r1
            U0.c r1 = new U0.c
            r2 = 25
            r1.<init>(r2)
            java.util.AbstractList r1 = H3.C0103u.z(r5, r1)
            h1.n r2 = r0.f12296W
            r2.getClass()
            h1.m r2 = new h1.m
            r2.<init>(r5, r1)
            r0.f12302c0 = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.I.d(k1.r[], boolean[], h1.Y[], boolean[], long):long");
    }

    public final long e() {
        return this.f12302c0.e();
    }

    public final long f() {
        long j7 = -9223372036854775807L;
        for (C1059z zVar : this.f12301b0) {
            long f8 = zVar.f();
            if (f8 != -9223372036854775807L) {
                if (j7 == -9223372036854775807L) {
                    C1059z[] zVarArr = this.f12301b0;
                    int length = zVarArr.length;
                    int i = 0;
                    while (i < length) {
                        C1059z zVar2 = zVarArr[i];
                        if (zVar2 == zVar) {
                            break;
                        } else if (zVar2.s(f8) == f8) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j7 = f8;
                } else if (f8 != j7) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j7 == -9223372036854775807L || zVar.s(j7) == j7)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j7;
    }

    public final void f0(a0 a0Var) {
        C1059z zVar = (C1059z) a0Var;
        C1058y yVar = this.f12299Z;
        yVar.getClass();
        yVar.f0(this);
    }

    public final boolean h(T0.I i) {
        ArrayList arrayList = this.f12297X;
        if (arrayList.isEmpty()) {
            return this.f12302c0.h(i);
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((C1059z) arrayList.get(i8)).h(i);
        }
        return false;
    }

    public final void i(C1058y yVar, long j7) {
        this.f12299Z = yVar;
        ArrayList arrayList = this.f12297X;
        C1059z[] zVarArr = this.f12294U;
        Collections.addAll(arrayList, zVarArr);
        for (C1059z i : zVarArr) {
            i.i(this, j7);
        }
    }

    public final f0 j() {
        f0 f0Var = this.f12300a0;
        f0Var.getClass();
        return f0Var;
    }

    public final long m(long j7, e0 e0Var) {
        C1059z zVar;
        C1059z[] zVarArr = this.f12301b0;
        if (zVarArr.length > 0) {
            zVar = zVarArr[0];
        } else {
            zVar = this.f12294U[0];
        }
        return zVar.m(j7, e0Var);
    }

    public final long n() {
        return this.f12302c0.n();
    }

    public final void o(C1059z zVar) {
        ArrayList arrayList = this.f12297X;
        arrayList.remove(zVar);
        if (arrayList.isEmpty()) {
            C1059z[] zVarArr = this.f12294U;
            int i = 0;
            for (C1059z j7 : zVarArr) {
                i += j7.j().f12469a;
            }
            Y[] yArr = new Y[i];
            int i8 = 0;
            for (int i9 = 0; i9 < zVarArr.length; i9++) {
                f0 j8 = zVarArr[i9].j();
                int i10 = j8.f12469a;
                int i11 = 0;
                while (i11 < i10) {
                    Y a8 = j8.a(i11);
                    int i12 = a8.f2885a;
                    r[] rVarArr = new r[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        r rVar = a8.f2888d[i13];
                        C0129q a9 = rVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i9);
                        sb.append(":");
                        String str = rVar.f3025a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a9.f2989a = sb.toString();
                        rVarArr[i13] = new r(a9);
                    }
                    Y y8 = new Y(i9 + ":" + a8.f2886b, rVarArr);
                    this.f12298Y.put(y8, a8);
                    yArr[i8] = y8;
                    i11++;
                    i8++;
                }
            }
            this.f12300a0 = new f0(yArr);
            C1058y yVar = this.f12299Z;
            yVar.getClass();
            yVar.o(this);
        }
    }

    public final void r() {
        for (C1059z r8 : this.f12294U) {
            r8.r();
        }
    }

    public final long s(long j7) {
        long s8 = this.f12301b0[0].s(j7);
        int i = 1;
        while (true) {
            C1059z[] zVarArr = this.f12301b0;
            if (i >= zVarArr.length) {
                return s8;
            }
            if (zVarArr[i].s(s8) == s8) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final void t(long j7) {
        for (C1059z t8 : this.f12301b0) {
            t8.t(j7);
        }
    }

    public final void u(long j7) {
        this.f12302c0.u(j7);
    }
}
