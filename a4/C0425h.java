package a4;

import A1.d;
import M3.c;
import M3.f;
import M3.h;
import M3.j;
import M3.l;
import M3.m;
import M3.n;
import S3.a;
import S3.e;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: a4.h  reason: case insensitive filesystem */
public abstract class C0425h implements j {
    public static float e(int[] iArr, int[] iArr2, float f8) {
        float f9;
        int length = iArr.length;
        int i = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i += iArr[i9];
            i8 += iArr2[i9];
        }
        if (i < i8) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = (float) i;
        float f11 = f10 / ((float) i8);
        float f12 = f8 * f11;
        float f13 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            float f14 = ((float) iArr2[i10]) * f11;
            float f15 = (float) i11;
            if (f15 > f14) {
                f9 = f15 - f14;
            } else {
                f9 = f14 - f15;
            }
            if (f9 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f9;
        }
        return f13 / f10;
    }

    public static void f(int i, a aVar, int[] iArr) {
        int length = iArr.length;
        int i8 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i9 = aVar.f4504V;
        if (i < i9) {
            boolean z = !aVar.a(i);
            while (i < i9) {
                if (aVar.a(i) == z) {
                    i8++;
                    if (i8 == length) {
                        break;
                    }
                    iArr[i8] = 1;
                    z = !z;
                } else {
                    iArr[i8] = iArr[i8] + 1;
                }
                i++;
            }
            if (i8 == length) {
                return;
            }
            if (i8 != length - 1 || i != i9) {
                throw h.f3144W;
            }
            return;
        }
        throw h.f3144W;
    }

    public static void g(int i, a aVar, int[] iArr) {
        int length = iArr.length;
        boolean a8 = aVar.a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.a(i) != a8) {
                length--;
                a8 = !a8;
            }
        }
        if (length < 0) {
            f(i + 1, aVar, iArr);
            return;
        }
        throw h.f3144W;
    }

    public void a() {
    }

    public l b(d dVar, EnumMap enumMap) {
        try {
            return d(dVar, enumMap);
        } catch (h e) {
            if (enumMap == null || !enumMap.containsKey(c.f3127X) || !((e) dVar.f35V).f4520a.c()) {
                throw e;
            }
            f d8 = ((e) dVar.f35V).f4520a.d();
            l d9 = d(new d(new e(d8)), enumMap);
            EnumMap enumMap2 = d9.e;
            m mVar = m.f3153U;
            int i = 270;
            if (enumMap2 != null && enumMap2.containsKey(mVar)) {
                i = (((Integer) enumMap2.get(mVar)).intValue() + 270) % 360;
            }
            d9.b(mVar, Integer.valueOf(i));
            n[] nVarArr = d9.f3151c;
            if (nVarArr != null) {
                int i8 = d8.f3140b;
                for (int i9 = 0; i9 < nVarArr.length; i9++) {
                    n nVar = nVarArr[i9];
                    nVarArr[i9] = new n((((float) i8) - nVar.f3165b) - 1.0f, nVar.f3164a);
                }
            }
            return d9;
        }
    }

    public abstract l c(int i, a aVar, Map map);

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a A[Catch:{ k -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l d(A1.d r19, java.util.EnumMap r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.f35V
            S3.e r2 = (S3.e) r2
            M3.f r2 = r2.f4520a
            int r3 = r2.f3139a
            int r2 = r2.f3140b
            S3.a r4 = new S3.a
            r4.<init>(r3)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0021
            M3.c r7 = M3.c.f3127X
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x0021
            r7 = 1
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x0027
            r8 = 8
            goto L_0x0028
        L_0x0027:
            r8 = 5
        L_0x0028:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r5, r8)
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = 15
        L_0x0034:
            int r9 = r2 / 2
            r10 = 0
        L_0x0037:
            if (r10 >= r7) goto L_0x00d1
            int r11 = r10 + 1
            int r12 = r11 / 2
            r10 = r10 & 1
            if (r10 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            int r12 = -r12
        L_0x0043:
            int r12 = r12 * r8
            int r12 = r12 + r9
            if (r12 < 0) goto L_0x00d1
            if (r12 >= r2) goto L_0x00d1
            S3.a r4 = r0.y(r4, r12)     // Catch:{ h -> 0x00c6 }
            r10 = 0
        L_0x004f:
            r13 = 2
            if (r10 >= r13) goto L_0x00c2
            if (r10 != r5) goto L_0x0072
            r4.e()
            if (r1 == 0) goto L_0x0072
            M3.c r13 = M3.c.f3133d0
            boolean r14 = r1.containsKey(r13)
            if (r14 == 0) goto L_0x0072
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<M3.c> r15 = M3.c.class
            r14.<init>(r15)
            r14.putAll(r1)
            r14.remove(r13)
            r13 = r18
            r1 = r14
            goto L_0x0074
        L_0x0072:
            r13 = r18
        L_0x0074:
            M3.l r14 = r13.c(r12, r4, r1)     // Catch:{ k -> 0x00b5 }
            if (r10 != r5) goto L_0x00b8
            M3.m r15 = M3.m.f3153U     // Catch:{ k -> 0x00b5 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ k -> 0x00b5 }
            r14.b(r15, r5)     // Catch:{ k -> 0x00b5 }
            M3.n[] r5 = r14.f3151c     // Catch:{ k -> 0x00b5 }
            if (r5 == 0) goto L_0x00b8
            M3.n r15 = new M3.n     // Catch:{ k -> 0x00b5 }
            float r0 = (float) r3
            r16 = r1
            r1 = r5[r6]     // Catch:{ k -> 0x00b3 }
            float r6 = r1.f3164a     // Catch:{ k -> 0x00b3 }
            float r6 = r0 - r6
            r17 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r17
            float r1 = r1.f3165b     // Catch:{ k -> 0x00b3 }
            r15.<init>(r6, r1)     // Catch:{ k -> 0x00b3 }
            r6 = 0
            r5[r6] = r15     // Catch:{ k -> 0x00b3 }
            M3.n r1 = new M3.n     // Catch:{ k -> 0x00b3 }
            r15 = 1
            r6 = r5[r15]     // Catch:{ k -> 0x00b3 }
            float r15 = r6.f3164a     // Catch:{ k -> 0x00b3 }
            float r0 = r0 - r15
            float r0 = r0 - r17
            float r6 = r6.f3165b     // Catch:{ k -> 0x00b3 }
            r1.<init>(r0, r6)     // Catch:{ k -> 0x00b3 }
            r0 = 1
            r5[r0] = r1     // Catch:{ k -> 0x00b9 }
            goto L_0x00b8
        L_0x00b3:
            r0 = 1
            goto L_0x00b9
        L_0x00b5:
            r16 = r1
            goto L_0x00b3
        L_0x00b8:
            return r14
        L_0x00b9:
            int r10 = r10 + 1
            r0 = r19
            r1 = r16
            r5 = 1
            r6 = 0
            goto L_0x004f
        L_0x00c2:
            r13 = r18
            r0 = 1
            goto L_0x00ca
        L_0x00c6:
            r13 = r18
            r0 = 1
        L_0x00ca:
            r0 = r19
            r10 = r11
            r5 = 1
            r6 = 0
            goto L_0x0037
        L_0x00d1:
            r13 = r18
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0425h.d(A1.d, java.util.EnumMap):M3.l");
    }
}
