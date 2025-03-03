package W1;

import J1.e;
import M0.C0129q;
import M0.I;
import M0.J;
import P0.r;
import P0.z;
import java.math.RoundingMode;
import p1.F;
import p1.G;
import p1.q;

public final class a implements b {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f6122m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f6123n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a  reason: collision with root package name */
    public final q f6124a;

    /* renamed from: b  reason: collision with root package name */
    public final G f6125b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6126c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6127d;
    public final byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public final r f6128f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6129g;

    /* renamed from: h  reason: collision with root package name */
    public final M0.r f6130h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public long f6131j;

    /* renamed from: k  reason: collision with root package name */
    public int f6132k;

    /* renamed from: l  reason: collision with root package name */
    public long f6133l;

    public a(q qVar, G g8, e eVar) {
        this.f6124a = qVar;
        this.f6125b = g8;
        this.f6126c = eVar;
        int i8 = eVar.f2355V;
        int max = Math.max(1, i8 / 10);
        this.f6129g = max;
        r rVar = new r((byte[]) eVar.f2358Y);
        rVar.o();
        int o2 = rVar.o();
        this.f6127d = o2;
        int i9 = eVar.f2354U;
        int i10 = eVar.f2356W;
        int i11 = (((i10 - (i9 * 4)) * 8) / (eVar.f2357X * i9)) + 1;
        if (o2 == i11) {
            int f8 = z.f(max, o2);
            this.e = new byte[(f8 * i10)];
            this.f6128f = new r(o2 * 2 * i9 * f8);
            int i12 = ((i10 * i8) * 8) / o2;
            C0129q qVar2 = new C0129q();
            qVar2.f2999m = I.o("audio/raw");
            qVar2.f2995h = i12;
            qVar2.i = i12;
            qVar2.f3000n = max * 2 * i9;
            qVar2.f2979B = i9;
            qVar2.f2980C = i8;
            qVar2.f2981D = 2;
            this.f6130h = new M0.r(qVar2);
            return;
        }
        throw J.a((RuntimeException) null, "Expected frames per block: " + i11 + "; got: " + o2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046 A[EDGE_INSN: B:41:0x0046->B:11:0x0046 ?: BREAK  
    EDGE_INSN: B:42:0x0046->B:11:0x0046 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    public final boolean a(p1.l r26, long r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            int r3 = r0.f6132k
            J1.e r4 = r0.f6126c
            int r5 = r4.f2354U
            int r5 = r5 * 2
            int r3 = r3 / r5
            int r5 = r0.f6129g
            int r3 = r5 - r3
            int r6 = r0.f6127d
            int r3 = P0.z.f(r3, r6)
            int r7 = r4.f2356W
            int r3 = r3 * r7
            r9 = 0
            int r12 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0023
        L_0x0021:
            r9 = 1
            goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            byte[] r10 = r0.e
            if (r9 != 0) goto L_0x0046
            int r12 = r0.i
            if (r12 >= r3) goto L_0x0046
            int r12 = r3 - r12
            long r12 = (long) r12
            long r12 = java.lang.Math.min(r12, r1)
            int r13 = (int) r12
            int r12 = r0.i
            r14 = r26
            int r10 = r14.x(r10, r12, r13)
            r12 = -1
            if (r10 != r12) goto L_0x0040
            goto L_0x0021
        L_0x0040:
            int r12 = r0.i
            int r12 = r12 + r10
            r0.i = r12
            goto L_0x0024
        L_0x0046:
            int r1 = r0.i
            int r1 = r1 / r7
            if (r1 <= 0) goto L_0x014c
            r2 = 0
        L_0x004c:
            P0.r r3 = r0.f6128f
            if (r2 >= r1) goto L_0x0119
            r12 = 0
        L_0x0051:
            int r13 = r4.f2354U
            if (r12 >= r13) goto L_0x010d
            byte[] r14 = r3.f3732a
            int r15 = r2 * r7
            int r16 = r12 * 4
            int r16 = r16 + r15
            int r15 = r13 * 4
            int r15 = r15 + r16
            int r17 = r7 / r13
            int r17 = r17 + -4
            int r18 = r16 + 1
            byte r11 = r10[r18]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r8 = r10[r16]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r11
            short r8 = (short) r8
            int r16 = r16 + 2
            byte r11 = r10[r16]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r16 = r9
            r9 = 88
            int r11 = java.lang.Math.min(r11, r9)
            int[] r19 = f6123n
            r20 = r19[r11]
            int r21 = r2 * r6
            int r21 = r21 * r13
            int r21 = r21 + r12
            int r21 = r21 * 2
            r9 = r8 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r14[r21] = r9
            int r9 = r21 + 1
            r27 = r11
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r14[r9] = r11
            r11 = r27
            r22 = r5
            r9 = 0
        L_0x00a0:
            int r5 = r17 * 2
            if (r9 >= r5) goto L_0x0101
            int r5 = r9 / 8
            int r23 = r9 / 2
            int r23 = r23 % 4
            int r5 = r5 * r13
            int r5 = r5 * 4
            int r5 = r5 + r15
            int r5 = r5 + r23
            byte r5 = r10[r5]
            r23 = r10
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r24 = r9 % 2
            if (r24 != 0) goto L_0x00be
            r5 = r5 & 15
            goto L_0x00c0
        L_0x00be:
            int r5 = r10 >> 4
        L_0x00c0:
            r10 = r5 & 7
            int r10 = r10 * 2
            r18 = 1
            int r10 = r10 + 1
            int r10 = r10 * r20
            int r10 = r10 >> 3
            r20 = r5 & 8
            if (r20 == 0) goto L_0x00d1
            int r10 = -r10
        L_0x00d1:
            int r8 = r8 + r10
            r10 = -32768(0xffffffffffff8000, float:NaN)
            r27 = r15
            r15 = 32767(0x7fff, float:4.5916E-41)
            int r8 = P0.z.i(r8, r10, r15)
            int r10 = r13 * 2
            int r21 = r10 + r21
            r10 = r8 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r14[r21] = r10
            int r10 = r21 + 1
            int r15 = r8 >> 8
            byte r15 = (byte) r15
            r14[r10] = r15
            int[] r10 = f6122m
            r5 = r10[r5]
            int r11 = r11 + r5
            r5 = 0
            r10 = 88
            int r11 = P0.z.i(r11, r5, r10)
            r20 = r19[r11]
            int r9 = r9 + 1
            r15 = r27
            r10 = r23
            goto L_0x00a0
        L_0x0101:
            r23 = r10
            r18 = 1
            int r12 = r12 + 1
            r9 = r16
            r5 = r22
            goto L_0x0051
        L_0x010d:
            r22 = r5
            r16 = r9
            r23 = r10
            r18 = 1
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0119:
            r22 = r5
            r16 = r9
            int r6 = r6 * r1
            int r6 = r6 * 2
            int r2 = r4.f2354U
            int r6 = r6 * r2
            r2 = 0
            r3.H(r2)
            r3.G(r6)
            int r2 = r0.i
            int r1 = r1 * r7
            int r2 = r2 - r1
            r0.i = r2
            int r1 = r3.f3734c
            p1.G r2 = r0.f6125b
            r2.a(r1, r3)
            int r2 = r0.f6132k
            int r2 = r2 + r1
            r0.f6132k = r2
            int r1 = r4.f2354U
            int r1 = r1 * 2
            int r2 = r2 / r1
            r1 = r22
            if (r2 < r1) goto L_0x014e
            r0.d(r1)
            goto L_0x014e
        L_0x014c:
            r16 = r9
        L_0x014e:
            if (r16 == 0) goto L_0x015c
            int r1 = r0.f6132k
            int r2 = r4.f2354U
            int r2 = r2 * 2
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x015c
            r0.d(r1)
        L_0x015c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.a.a(p1.l, long):boolean");
    }

    public final void b(int i8, long j7) {
        this.f6124a.l(new f(this.f6126c, this.f6127d, (long) i8, j7));
        this.f6125b.c(this.f6130h);
    }

    public final void c(long j7) {
        this.i = 0;
        this.f6131j = j7;
        this.f6132k = 0;
        this.f6133l = 0;
    }

    public final void d(int i8) {
        int i9 = i8;
        long j7 = this.f6131j;
        long j8 = this.f6133l;
        e eVar = this.f6126c;
        long j9 = (long) eVar.f2355V;
        int i10 = z.f3748a;
        long W7 = j7 + z.W(j8, 1000000, j9, RoundingMode.DOWN);
        int i11 = i9 * 2 * eVar.f2354U;
        this.f6125b.e(W7, 1, i11, this.f6132k - i11, (F) null);
        this.f6133l += (long) i9;
        this.f6132k -= i11;
    }
}
