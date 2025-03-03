package k4;

import M3.o;
import S3.b;
import java.util.ArrayList;
import java.util.Iterator;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final d f13042f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final b f13043a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13044b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f13045c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f13046d = new int[5];
    public final o e;

    public e(b bVar, o oVar) {
        this.f13043a = bVar;
        this.e = oVar;
    }

    public static float a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i = 0;
        for (int i8 = 0; i8 < 5; i8++) {
            int i9 = iArr[i8];
            if (i9 == 0) {
                return false;
            }
            i += i9;
        }
        if (i < 7) {
            return false;
        }
        float f8 = ((float) i) / 7.0f;
        float f9 = f8 / 2.0f;
        if (Math.abs(f8 - ((float) iArr[0])) >= f9 || Math.abs(f8 - ((float) iArr[1])) >= f9 || Math.abs((f8 * 3.0f) - ((float) iArr[2])) >= 3.0f * f9 || Math.abs(f8 - ((float) iArr[3])) >= f9 || Math.abs(f8 - ((float) iArr[4])) >= f9) {
            return false;
        }
        return true;
    }

    public static double e(c cVar, c cVar2) {
        double d8 = (double) (cVar.f3164a - cVar2.f3164a);
        double d9 = (double) (cVar.f3165b - cVar2.f3165b);
        return (d9 * d9) + (d8 * d8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:251:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r18, int r19, int[] r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            int r3 = r3 + r5
            r5 = 2
            r6 = r1[r5]
            int r3 = r3 + r6
            r6 = 3
            r7 = r1[r6]
            int r3 = r3 + r7
            r7 = 4
            r8 = r1[r7]
            int r3 = r3 + r8
            r8 = r19
            float r8 = a(r1, r8)
            int r8 = (int) r8
            r9 = r1[r5]
            S3.b r10 = r0.f13043a
            int r11 = r10.f4506V
            int[] r12 = r0.f13046d
            java.util.Arrays.fill(r12, r2)
            r13 = r18
        L_0x002b:
            if (r13 < 0) goto L_0x003b
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x003b
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + -1
            goto L_0x002b
        L_0x003b:
            r15 = 5
            if (r13 >= 0) goto L_0x0042
        L_0x003e:
            r9 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x00de
        L_0x0042:
            if (r13 < 0) goto L_0x0055
            boolean r16 = r10.b(r8, r13)
            if (r16 != 0) goto L_0x0055
            r14 = r12[r4]
            if (r14 > r9) goto L_0x0055
            int r14 = r14 + 1
            r12[r4] = r14
            int r13 = r13 + -1
            goto L_0x0042
        L_0x0055:
            if (r13 < 0) goto L_0x003e
            r14 = r12[r4]
            if (r14 <= r9) goto L_0x005c
            goto L_0x003e
        L_0x005c:
            if (r13 < 0) goto L_0x006f
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x006f
            r14 = r12[r2]
            if (r14 > r9) goto L_0x006f
            int r14 = r14 + 1
            r12[r2] = r14
            int r13 = r13 + -1
            goto L_0x005c
        L_0x006f:
            r13 = r12[r2]
            if (r13 <= r9) goto L_0x0074
            goto L_0x003e
        L_0x0074:
            int r13 = r18 + 1
        L_0x0076:
            if (r13 >= r11) goto L_0x0086
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x0086
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + 1
            goto L_0x0076
        L_0x0086:
            if (r13 != r11) goto L_0x0089
            goto L_0x003e
        L_0x0089:
            if (r13 >= r11) goto L_0x009c
            boolean r14 = r10.b(r8, r13)
            if (r14 != 0) goto L_0x009c
            r14 = r12[r6]
            if (r14 >= r9) goto L_0x009c
            int r14 = r14 + 1
            r12[r6] = r14
            int r13 = r13 + 1
            goto L_0x0089
        L_0x009c:
            if (r13 == r11) goto L_0x003e
            r14 = r12[r6]
            if (r14 < r9) goto L_0x00a3
            goto L_0x003e
        L_0x00a3:
            if (r13 >= r11) goto L_0x00b6
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x00b6
            r14 = r12[r7]
            if (r14 >= r9) goto L_0x00b6
            int r14 = r14 + 1
            r12[r7] = r14
            int r13 = r13 + 1
            goto L_0x00a3
        L_0x00b6:
            r11 = r12[r7]
            if (r11 < r9) goto L_0x00bb
            goto L_0x003e
        L_0x00bb:
            r9 = r12[r2]
            r14 = r12[r4]
            int r9 = r9 + r14
            r14 = r12[r5]
            int r9 = r9 + r14
            r14 = r12[r6]
            int r9 = r9 + r14
            int r9 = r9 + r11
            int r9 = r9 - r3
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * 5
            int r11 = r3 * 2
            if (r9 < r11) goto L_0x00d4
            goto L_0x003e
        L_0x00d4:
            boolean r9 = b(r12)
            if (r9 == 0) goto L_0x003e
            float r9 = a(r12, r13)
        L_0x00de:
            boolean r11 = java.lang.Float.isNaN(r9)
            if (r11 != 0) goto L_0x0321
            int r11 = (int) r9
            r1 = r1[r5]
            java.util.Arrays.fill(r12, r2)
            r13 = r8
        L_0x00eb:
            if (r13 < 0) goto L_0x00fb
            boolean r14 = r10.b(r13, r11)
            if (r14 == 0) goto L_0x00fb
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + -1
            goto L_0x00eb
        L_0x00fb:
            int r14 = r10.f4505U
            if (r13 >= 0) goto L_0x0103
        L_0x00ff:
            r1 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x019e
        L_0x0103:
            if (r13 < 0) goto L_0x0117
            boolean r16 = r10.b(r13, r11)
            if (r16 != 0) goto L_0x0117
            r15 = r12[r4]
            if (r15 > r1) goto L_0x0117
            int r15 = r15 + 1
            r12[r4] = r15
            int r13 = r13 + -1
            r15 = 5
            goto L_0x0103
        L_0x0117:
            if (r13 < 0) goto L_0x00ff
            r15 = r12[r4]
            if (r15 <= r1) goto L_0x011e
            goto L_0x00ff
        L_0x011e:
            if (r13 < 0) goto L_0x0131
            boolean r15 = r10.b(r13, r11)
            if (r15 == 0) goto L_0x0131
            r15 = r12[r2]
            if (r15 > r1) goto L_0x0131
            int r15 = r15 + 1
            r12[r2] = r15
            int r13 = r13 + -1
            goto L_0x011e
        L_0x0131:
            r13 = r12[r2]
            if (r13 <= r1) goto L_0x0136
            goto L_0x00ff
        L_0x0136:
            int r8 = r8 + r4
        L_0x0137:
            if (r8 >= r14) goto L_0x0147
            boolean r13 = r10.b(r8, r11)
            if (r13 == 0) goto L_0x0147
            r13 = r12[r5]
            int r13 = r13 + r4
            r12[r5] = r13
            int r8 = r8 + 1
            goto L_0x0137
        L_0x0147:
            if (r8 != r14) goto L_0x014a
            goto L_0x00ff
        L_0x014a:
            if (r8 >= r14) goto L_0x015d
            boolean r13 = r10.b(r8, r11)
            if (r13 != 0) goto L_0x015d
            r13 = r12[r6]
            if (r13 >= r1) goto L_0x015d
            int r13 = r13 + 1
            r12[r6] = r13
            int r8 = r8 + 1
            goto L_0x014a
        L_0x015d:
            if (r8 == r14) goto L_0x00ff
            r13 = r12[r6]
            if (r13 < r1) goto L_0x0164
            goto L_0x00ff
        L_0x0164:
            if (r8 >= r14) goto L_0x0177
            boolean r13 = r10.b(r8, r11)
            if (r13 == 0) goto L_0x0177
            r13 = r12[r7]
            if (r13 >= r1) goto L_0x0177
            int r13 = r13 + 1
            r12[r7] = r13
            int r8 = r8 + 1
            goto L_0x0164
        L_0x0177:
            r13 = r12[r7]
            if (r13 < r1) goto L_0x017c
            goto L_0x00ff
        L_0x017c:
            r1 = r12[r2]
            r15 = r12[r4]
            int r1 = r1 + r15
            r15 = r12[r5]
            int r1 = r1 + r15
            r15 = r12[r6]
            int r1 = r1 + r15
            int r1 = r1 + r13
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r13 = 5
            int r1 = r1 * 5
            if (r1 < r3) goto L_0x0194
            goto L_0x00ff
        L_0x0194:
            boolean r1 = b(r12)
            if (r1 == 0) goto L_0x00ff
            float r1 = a(r12, r8)
        L_0x019e:
            boolean r8 = java.lang.Float.isNaN(r1)
            if (r8 != 0) goto L_0x0321
            int r8 = (int) r1
            java.util.Arrays.fill(r12, r2)
            r13 = 0
        L_0x01a9:
            if (r11 < r13) goto L_0x01c0
            if (r8 < r13) goto L_0x01c0
            int r15 = r8 - r13
            int r7 = r11 - r13
            boolean r7 = r10.b(r15, r7)
            if (r7 == 0) goto L_0x01c0
            r7 = r12[r5]
            int r7 = r7 + r4
            r12[r5] = r7
            int r13 = r13 + 1
            r7 = 4
            goto L_0x01a9
        L_0x01c0:
            r7 = r12[r5]
            if (r7 != 0) goto L_0x01c6
            goto L_0x0321
        L_0x01c6:
            if (r11 < r13) goto L_0x01dc
            if (r8 < r13) goto L_0x01dc
            int r7 = r8 - r13
            int r15 = r11 - r13
            boolean r7 = r10.b(r7, r15)
            if (r7 != 0) goto L_0x01dc
            r7 = r12[r4]
            int r7 = r7 + r4
            r12[r4] = r7
            int r13 = r13 + 1
            goto L_0x01c6
        L_0x01dc:
            r7 = r12[r4]
            if (r7 != 0) goto L_0x01e2
            goto L_0x0321
        L_0x01e2:
            if (r11 < r13) goto L_0x01f8
            if (r8 < r13) goto L_0x01f8
            int r7 = r8 - r13
            int r15 = r11 - r13
            boolean r7 = r10.b(r7, r15)
            if (r7 == 0) goto L_0x01f8
            r7 = r12[r2]
            int r7 = r7 + r4
            r12[r2] = r7
            int r13 = r13 + 1
            goto L_0x01e2
        L_0x01f8:
            r7 = r12[r2]
            if (r7 != 0) goto L_0x01fe
            goto L_0x0321
        L_0x01fe:
            r7 = 1
        L_0x01ff:
            int r13 = r11 + r7
            int r15 = r10.f4506V
            if (r13 >= r15) goto L_0x0218
            int r2 = r8 + r7
            if (r2 >= r14) goto L_0x0218
            boolean r2 = r10.b(r2, r13)
            if (r2 == 0) goto L_0x0218
            r2 = r12[r5]
            int r2 = r2 + r4
            r12[r5] = r2
            int r7 = r7 + 1
            r2 = 0
            goto L_0x01ff
        L_0x0218:
            int r2 = r11 + r7
            if (r2 >= r15) goto L_0x022e
            int r13 = r8 + r7
            if (r13 >= r14) goto L_0x022e
            boolean r2 = r10.b(r13, r2)
            if (r2 != 0) goto L_0x022e
            r2 = r12[r6]
            int r2 = r2 + r4
            r12[r6] = r2
            int r7 = r7 + 1
            goto L_0x0218
        L_0x022e:
            r2 = r12[r6]
            if (r2 != 0) goto L_0x0234
            goto L_0x0321
        L_0x0234:
            int r2 = r11 + r7
            if (r2 >= r15) goto L_0x024b
            int r13 = r8 + r7
            if (r13 >= r14) goto L_0x024b
            boolean r2 = r10.b(r13, r2)
            if (r2 == 0) goto L_0x024b
            r2 = 4
            r13 = r12[r2]
            int r13 = r13 + r4
            r12[r2] = r13
            int r7 = r7 + 1
            goto L_0x0234
        L_0x024b:
            r2 = 4
            r7 = r12[r2]
            if (r7 != 0) goto L_0x0252
            goto L_0x0321
        L_0x0252:
            r2 = 0
            r7 = 0
            r8 = 5
        L_0x0255:
            if (r2 >= r8) goto L_0x0261
            r10 = r12[r2]
            if (r10 != 0) goto L_0x025d
            goto L_0x0321
        L_0x025d:
            int r7 = r7 + r10
            int r2 = r2 + 1
            goto L_0x0255
        L_0x0261:
            r2 = 7
            if (r7 >= r2) goto L_0x0266
            goto L_0x0321
        L_0x0266:
            float r2 = (float) r7
            r7 = 1088421888(0x40e00000, float:7.0)
            float r2 = r2 / r7
            r8 = 1068146622(0x3faa9fbe, float:1.333)
            float r8 = r2 / r8
            r10 = 0
            r11 = r12[r10]
            float r10 = (float) r11
            float r10 = r2 - r10
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0321
            r10 = r12[r4]
            float r10 = (float) r10
            float r10 = r2 - r10
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0321
            r10 = 1077936128(0x40400000, float:3.0)
            float r11 = r2 * r10
            r5 = r12[r5]
            float r5 = (float) r5
            float r11 = r11 - r5
            float r5 = java.lang.Math.abs(r11)
            float r10 = r10 * r8
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0321
            r5 = r12[r6]
            float r5 = (float) r5
            float r5 = r2 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0321
            r5 = 4
            r5 = r12[r5]
            float r5 = (float) r5
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0321
            float r2 = (float) r3
            float r2 = r2 / r7
            r3 = 0
        L_0x02b9:
            java.util.ArrayList r5 = r0.f13044b
            int r6 = r5.size()
            if (r3 >= r6) goto L_0x0311
            java.lang.Object r6 = r5.get(r3)
            k4.c r6 = (k4.c) r6
            float r7 = r6.f3165b
            float r7 = r9 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x030e
            float r7 = r6.f3164a
            float r8 = r1 - r7
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x030e
            float r8 = r6.f13040c
            float r10 = r2 - r8
            float r10 = java.lang.Math.abs(r10)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x02f1
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x030e
        L_0x02f1:
            int r10 = r6.f13041d
            int r11 = r10 + 1
            float r10 = (float) r10
            float r7 = r7 * r10
            float r7 = r7 + r1
            float r1 = (float) r11
            float r7 = r7 / r1
            float r6 = r6.f3165b
            float r6 = r6 * r10
            float r6 = r6 + r9
            float r6 = r6 / r1
            float r10 = r10 * r8
            float r10 = r10 + r2
            float r10 = r10 / r1
            k4.c r1 = new k4.c
            r1.<init>(r7, r6, r10, r11)
            r5.set(r3, r1)
            goto L_0x0320
        L_0x030e:
            int r3 = r3 + 1
            goto L_0x02b9
        L_0x0311:
            k4.c r3 = new k4.c
            r3.<init>(r1, r9, r2, r4)
            r5.add(r3)
            M3.o r1 = r0.e
            if (r1 == 0) goto L_0x0320
            r1.a(r3)
        L_0x0320:
            return r4
        L_0x0321:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e.c(int, int, int[]):boolean");
    }

    public final boolean d() {
        ArrayList arrayList = this.f13044b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f8 = 0.0f;
        int i = 0;
        float f9 = 0.0f;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f13041d >= 2) {
                i++;
                f9 += cVar.f13040c;
            }
        }
        if (i < 3) {
            return false;
        }
        float f10 = f9 / ((float) size);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f8 += Math.abs(((c) it2.next()).f13040c - f10);
        }
        if (f8 <= f9 * 0.05f) {
            return true;
        }
        return false;
    }
}
