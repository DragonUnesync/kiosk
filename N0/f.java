package N0;

import java.util.Arrays;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f3244a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3245b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3246c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3247d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3248f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3249g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3250h;
    public final short[] i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f3251j;

    /* renamed from: k  reason: collision with root package name */
    public int f3252k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f3253l;

    /* renamed from: m  reason: collision with root package name */
    public int f3254m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f3255n;

    /* renamed from: o  reason: collision with root package name */
    public int f3256o;

    /* renamed from: p  reason: collision with root package name */
    public int f3257p;

    /* renamed from: q  reason: collision with root package name */
    public int f3258q;

    /* renamed from: r  reason: collision with root package name */
    public int f3259r;

    /* renamed from: s  reason: collision with root package name */
    public int f3260s;

    /* renamed from: t  reason: collision with root package name */
    public int f3261t;

    /* renamed from: u  reason: collision with root package name */
    public int f3262u;

    /* renamed from: v  reason: collision with root package name */
    public int f3263v;

    /* renamed from: w  reason: collision with root package name */
    public double f3264w;

    public f(int i8, int i9, float f8, float f9, int i10) {
        this.f3244a = i8;
        this.f3245b = i9;
        this.f3246c = f8;
        this.f3247d = f9;
        this.e = ((float) i8) / ((float) i10);
        this.f3248f = i8 / 400;
        int i11 = i8 / 65;
        this.f3249g = i11;
        int i12 = i11 * 2;
        this.f3250h = i12;
        this.i = new short[i12];
        this.f3251j = new short[(i12 * i9)];
        this.f3253l = new short[(i12 * i9)];
        this.f3255n = new short[(i12 * i9)];
    }

    public static void e(int i8, int i9, short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = (i10 * i9) + i13;
            int i15 = (i12 * i9) + i13;
            int i16 = (i11 * i9) + i13;
            for (int i17 = 0; i17 < i8; i17++) {
                sArr[i14] = (short) (((sArr3[i15] * i17) + ((i8 - i17) * sArr2[i16])) / i8);
                i14 += i9;
                i16 += i9;
                i15 += i9;
            }
        }
    }

    public final void a(short[] sArr, int i8, int i9) {
        short[] c8 = c(this.f3253l, this.f3254m, i9);
        this.f3253l = c8;
        int i10 = this.f3245b;
        System.arraycopy(sArr, i8 * i10, c8, this.f3254m * i10, i10 * i9);
        this.f3254m += i9;
    }

    public final void b(short[] sArr, int i8, int i9) {
        int i10 = this.f3250h / i9;
        int i11 = this.f3245b;
        int i12 = i9 * i11;
        int i13 = i8 * i11;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 += sArr[(i14 * i12) + i13 + i16];
            }
            this.i[i14] = (short) (i15 / i12);
        }
    }

    public final short[] c(short[] sArr, int i8, int i9) {
        int length = sArr.length;
        int i10 = this.f3245b;
        int i11 = length / i10;
        if (i8 + i9 <= i11) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i11 * 3) / 2) + i9) * i10);
    }

    public final int d(short[] sArr, int i8, int i9, int i10) {
        int i11 = i8 * this.f3245b;
        int i12 = 255;
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        while (i9 <= i10) {
            int i16 = 0;
            for (int i17 = 0; i17 < i9; i17++) {
                i16 += Math.abs(sArr[i11 + i17] - sArr[(i11 + i9) + i17]);
            }
            if (i16 * i14 < i13 * i9) {
                i14 = i9;
                i13 = i16;
            }
            if (i16 * i12 > i15 * i9) {
                i12 = i9;
                i15 = i16;
            }
            i9++;
        }
        this.f3262u = i13 / i14;
        this.f3263v = i15 / i12;
        return i14;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01a4: MOVE  (r3v2 int) = (r20v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01aa  */
    public final void f() {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.f3254m
            float r2 = r0.f3246c
            float r3 = r0.f3247d
            float r2 = r2 / r3
            double r4 = (double) r2
            float r2 = r0.e
            float r2 = r2 * r3
            r6 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r3 = r0.f3244a
            int r8 = r0.f3245b
            r9 = 0
            r10 = 1
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0036
            r6 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x0027
            goto L_0x0036
        L_0x0027:
            short[] r4 = r0.f3251j
            int r5 = r0.f3252k
            r0.a(r4, r9, r5)
            r0.f3252k = r9
        L_0x0030:
            r20 = r1
            r19 = r3
            goto L_0x019c
        L_0x0036:
            int r6 = r0.f3252k
            int r7 = r0.f3250h
            if (r6 >= r7) goto L_0x003d
            goto L_0x0030
        L_0x003d:
            r15 = 0
        L_0x003e:
            int r11 = r0.f3259r
            if (r11 <= 0) goto L_0x0057
            int r11 = java.lang.Math.min(r7, r11)
            short[] r12 = r0.f3251j
            r0.a(r12, r15, r11)
            int r12 = r0.f3259r
            int r12 = r12 - r11
            r0.f3259r = r12
            int r15 = r15 + r11
            r20 = r1
            r19 = r3
            goto L_0x018a
        L_0x0057:
            short[] r11 = r0.f3251j
            r12 = 4000(0xfa0, float:5.605E-42)
            if (r3 <= r12) goto L_0x0060
            int r12 = r3 / 4000
            goto L_0x0061
        L_0x0060:
            r12 = 1
        L_0x0061:
            int r13 = r0.f3249g
            int r14 = r0.f3248f
            if (r8 != r10) goto L_0x0072
            if (r12 != r10) goto L_0x0072
            int r11 = r0.d(r11, r15, r14, r13)
            r20 = r1
            r19 = r3
            goto L_0x00a7
        L_0x0072:
            r0.b(r11, r15, r12)
            int r10 = r14 / r12
            r19 = r3
            int r3 = r13 / r12
            r20 = r1
            short[] r1 = r0.i
            int r3 = r0.d(r1, r9, r10, r3)
            r10 = 1
            if (r12 == r10) goto L_0x00a6
            int r3 = r3 * r12
            int r12 = r12 * 4
            int r10 = r3 - r12
            int r3 = r3 + r12
            if (r10 >= r14) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r14 = r10
        L_0x0091:
            if (r3 <= r13) goto L_0x0095
        L_0x0093:
            r3 = 1
            goto L_0x0097
        L_0x0095:
            r13 = r3
            goto L_0x0093
        L_0x0097:
            if (r8 != r3) goto L_0x009e
            int r11 = r0.d(r11, r15, r14, r13)
            goto L_0x00a7
        L_0x009e:
            r0.b(r11, r15, r3)
            int r11 = r0.d(r1, r9, r14, r13)
            goto L_0x00a7
        L_0x00a6:
            r11 = r3
        L_0x00a7:
            int r1 = r0.f3262u
            int r3 = r0.f3263v
            if (r1 == 0) goto L_0x00bf
            int r10 = r0.f3260s
            if (r10 != 0) goto L_0x00b2
            goto L_0x00bf
        L_0x00b2:
            int r12 = r1 * 3
            if (r3 <= r12) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            int r3 = r1 * 2
            int r12 = r0.f3261t
            int r12 = r12 * 3
            if (r3 > r12) goto L_0x00c0
        L_0x00bf:
            r10 = r11
        L_0x00c0:
            r0.f3261t = r1
            r0.f3260s = r11
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0120
            short[] r1 = r0.f3251j
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            double r11 = (double) r10
            double r13 = r4 - r13
            double r11 = r11 / r13
            double r13 = r0.f3264w
            double r11 = r11 + r13
            long r13 = java.lang.Math.round(r11)
            int r3 = (int) r13
            double r13 = (double) r3
            double r11 = r11 - r13
            r0.f3264w = r11
            goto L_0x00fb
        L_0x00e3:
            double r13 = (double) r10
            double r11 = r11 - r4
            double r11 = r11 * r13
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r4 - r13
            double r11 = r11 / r13
            double r13 = r0.f3264w
            double r11 = r11 + r13
            long r13 = java.lang.Math.round(r11)
            int r3 = (int) r13
            r0.f3259r = r3
            double r13 = (double) r3
            double r11 = r11 - r13
            r0.f3264w = r11
            r3 = r10
        L_0x00fb:
            short[] r11 = r0.f3253l
            int r12 = r0.f3254m
            short[] r13 = r0.c(r11, r12, r3)
            r0.f3253l = r13
            int r14 = r0.f3254m
            int r18 = r15 + r10
            int r12 = r0.f3245b
            r11 = r3
            r21 = r15
            r15 = r1
            r16 = r21
            r17 = r1
            e(r11, r12, r13, r14, r15, r16, r17, r18)
            int r1 = r0.f3254m
            int r1 = r1 + r3
            r0.f3254m = r1
            int r10 = r10 + r3
            int r10 = r10 + r21
            r15 = r10
            goto L_0x018a
        L_0x0120:
            r21 = r15
            short[] r1 = r0.f3251j
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x013e
            double r11 = (double) r10
            double r11 = r11 * r4
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 - r4
            double r11 = r11 / r13
            double r13 = r0.f3264w
            double r11 = r11 + r13
            long r13 = java.lang.Math.round(r11)
            int r3 = (int) r13
            double r13 = (double) r3
            double r11 = r11 - r13
            r0.f3264w = r11
            goto L_0x0158
        L_0x013e:
            double r13 = (double) r10
            double r11 = r11 * r4
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 - r15
            double r11 = r11 * r13
            double r13 = r15 - r4
            double r11 = r11 / r13
            double r13 = r0.f3264w
            double r11 = r11 + r13
            long r13 = java.lang.Math.round(r11)
            int r3 = (int) r13
            r0.f3259r = r3
            double r13 = (double) r3
            double r11 = r11 - r13
            r0.f3264w = r11
            r3 = r10
        L_0x0158:
            short[] r11 = r0.f3253l
            int r12 = r0.f3254m
            int r15 = r10 + r3
            short[] r11 = r0.c(r11, r12, r15)
            r0.f3253l = r11
            int r12 = r21 * r8
            int r13 = r0.f3254m
            int r13 = r13 * r8
            int r14 = r10 * r8
            java.lang.System.arraycopy(r1, r12, r11, r13, r14)
            short[] r13 = r0.f3253l
            int r11 = r0.f3254m
            int r14 = r11 + r10
            int r16 = r21 + r10
            int r12 = r0.f3245b
            r11 = r3
            r10 = r15
            r15 = r1
            r17 = r1
            r18 = r21
            e(r11, r12, r13, r14, r15, r16, r17, r18)
            int r1 = r0.f3254m
            int r1 = r1 + r10
            r0.f3254m = r1
            int r15 = r21 + r3
        L_0x018a:
            int r1 = r15 + r7
            if (r1 <= r6) goto L_0x0291
            int r1 = r0.f3252k
            int r1 = r1 - r15
            short[] r3 = r0.f3251j
            int r15 = r15 * r8
            int r4 = r1 * r8
            java.lang.System.arraycopy(r3, r15, r3, r9, r4)
            r0.f3252k = r1
        L_0x019c:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0290
            int r1 = r0.f3254m
            r3 = r20
            if (r1 != r3) goto L_0x01aa
            goto L_0x0290
        L_0x01aa:
            r1 = r19
            float r4 = (float) r1
            float r4 = r4 / r2
            long r4 = (long) r4
            long r1 = (long) r1
        L_0x01b0:
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01cb
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01cb
            r10 = 2
            long r12 = r4 % r10
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x01cb
            long r12 = r1 % r10
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x01cb
            long r4 = r4 / r10
            long r1 = r1 / r10
            goto L_0x01b0
        L_0x01cb:
            int r6 = r0.f3254m
            int r6 = r6 - r3
            short[] r7 = r0.f3255n
            int r10 = r0.f3256o
            short[] r7 = r0.c(r7, r10, r6)
            r0.f3255n = r7
            short[] r10 = r0.f3253l
            int r11 = r3 * r8
            int r12 = r0.f3256o
            int r12 = r12 * r8
            int r13 = r6 * r8
            java.lang.System.arraycopy(r10, r11, r7, r12, r13)
            r0.f3254m = r3
            int r3 = r0.f3256o
            int r3 = r3 + r6
            r0.f3256o = r3
            r3 = 0
        L_0x01ed:
            int r6 = r0.f3256o
            int r7 = r6 + -1
            if (r3 >= r7) goto L_0x027d
        L_0x01f3:
            int r6 = r0.f3257p
            r7 = 1
            int r6 = r6 + r7
            long r10 = (long) r6
            long r12 = r10 * r4
            int r14 = r0.f3258q
            long r14 = (long) r14
            long r16 = r14 * r1
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x025e
            short[] r6 = r0.f3253l
            int r10 = r0.f3254m
            short[] r6 = r0.c(r6, r10, r7)
            r0.f3253l = r6
            r6 = 0
        L_0x020e:
            if (r6 >= r8) goto L_0x024d
            short[] r7 = r0.f3253l
            int r10 = r0.f3254m
            int r10 = r10 * r8
            int r10 = r10 + r6
            short[] r11 = r0.f3255n
            int r12 = r3 * r8
            int r12 = r12 + r6
            short r13 = r11[r12]
            int r12 = r12 + r8
            short r11 = r11[r12]
            int r12 = r0.f3258q
            long r14 = (long) r12
            long r14 = r14 * r1
            int r12 = r0.f3257p
            r17 = r10
            long r9 = (long) r12
            long r9 = r9 * r4
            r18 = 1
            int r12 = r12 + 1
            r19 = r1
            long r1 = (long) r12
            long r1 = r1 * r4
            long r14 = r1 - r14
            long r1 = r1 - r9
            long r9 = (long) r13
            long r9 = r9 * r14
            long r12 = r1 - r14
            long r14 = (long) r11
            long r12 = r12 * r14
            long r12 = r12 + r9
            long r12 = r12 / r1
            int r1 = (int) r12
            short r1 = (short) r1
            r7[r17] = r1
            int r6 = r6 + 1
            r1 = r19
            r9 = 0
            goto L_0x020e
        L_0x024d:
            r19 = r1
            int r1 = r0.f3258q
            r9 = 1
            int r1 = r1 + r9
            r0.f3258q = r1
            int r1 = r0.f3254m
            int r1 = r1 + r9
            r0.f3254m = r1
            r1 = r19
            r9 = 0
            goto L_0x01f3
        L_0x025e:
            r19 = r1
            r9 = 1
            r0.f3257p = r6
            int r1 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x0276
            r1 = 0
            r0.f3257p = r1
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0270
            r10 = 1
            goto L_0x0271
        L_0x0270:
            r10 = 0
        L_0x0271:
            P0.l.j(r10)
            r0.f3258q = r1
        L_0x0276:
            int r3 = r3 + 1
            r1 = r19
            r9 = 0
            goto L_0x01ed
        L_0x027d:
            if (r7 != 0) goto L_0x0280
            goto L_0x0290
        L_0x0280:
            short[] r1 = r0.f3255n
            int r2 = r7 * r8
            int r6 = r6 - r7
            int r6 = r6 * r8
            r10 = 0
            java.lang.System.arraycopy(r1, r2, r1, r10, r6)
            int r1 = r0.f3256o
            int r1 = r1 - r7
            r0.f3256o = r1
        L_0x0290:
            return
        L_0x0291:
            r10 = 0
            r3 = r19
            r1 = r20
            r9 = 0
            r10 = 1
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.f.f():void");
    }
}
