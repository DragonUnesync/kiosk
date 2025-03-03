package Q0;

import M0.C0123k;
import N1.f;
import P0.l;
import java.util.Arrays;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4068a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f4069b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4070c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f4071d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i8, boolean[] zArr) {
        boolean z;
        boolean z6;
        boolean z8;
        int i9 = i8 - i;
        boolean z9 = false;
        if (i9 >= 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        } else if (i9 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        } else if (i9 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i10 = i8 - 1;
            int i11 = i + 2;
            while (i11 < i10) {
                byte b8 = bArr[i11];
                if ((b8 & 254) == 0) {
                    int i12 = i11 - 2;
                    if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b8 == 1) {
                        a(zArr);
                        return i12;
                    }
                    i11 -= 2;
                }
                i11 += 3;
            }
            if (i9 <= 2 ? i9 != 2 ? !zArr[1] || bArr[i10] != 1 : !(zArr[2] && bArr[i8 - 2] == 0 && bArr[i10] == 1) : !(bArr[i8 - 3] == 0 && bArr[i8 - 2] == 0 && bArr[i10] == 1)) {
                z6 = false;
            } else {
                z6 = true;
            }
            zArr[0] = z6;
            if (i9 <= 1 ? !zArr[2] || bArr[i10] != 0 : !(bArr[i8 - 2] == 0 && bArr[i10] == 0)) {
                z8 = false;
            } else {
                z8 = true;
            }
            zArr[1] = z8;
            if (bArr[i10] == 0) {
                z9 = true;
            }
            zArr[2] = z9;
            return i8;
        } else {
            a(zArr);
            return i - 1;
        }
    }

    public static boolean c(byte b8) {
        if (((b8 & 96) >> 5) != 0) {
            return true;
        }
        byte b9 = b8 & 31;
        if (b9 == 1 || b9 == 9 || b9 == 14) {
            return false;
        }
        return true;
    }

    public static C0123k d(f fVar) {
        fVar.t();
        int i = fVar.i(6);
        int i8 = fVar.i(6);
        fVar.i(3);
        return new C0123k(i, i8, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Q0.i e(N1.f r19, boolean r20, int r21, Q0.i r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L_0x0042
            int r2 = r0.i(r5)
            boolean r8 = r19.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = 0
            r11 = 0
        L_0x001e:
            r12 = 32
            if (r10 >= r12) goto L_0x002e
            boolean r12 = r19.h()
            if (r12 == 0) goto L_0x002b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L_0x002b:
            int r10 = r10 + 1
            goto L_0x001e
        L_0x002e:
            r10 = 0
        L_0x002f:
            if (r10 >= r3) goto L_0x003a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L_0x002f
        L_0x003a:
            r13 = r2
        L_0x003b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L_0x0057
        L_0x0042:
            if (r2 == 0) goto L_0x0050
            int r3 = r2.f4026a
            boolean r8 = r2.f4027b
            int r9 = r2.f4028c
            int r11 = r2.f4029d
            int[] r4 = r2.e
            r13 = r3
            goto L_0x003b
        L_0x0050:
            r17 = r4
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0057:
            int r18 = r0.i(r6)
            r2 = 0
        L_0x005c:
            if (r7 >= r1) goto L_0x0071
            boolean r3 = r19.h()
            if (r3 == 0) goto L_0x0066
            int r2 = r2 + 88
        L_0x0066:
            boolean r3 = r19.h()
            if (r3 == 0) goto L_0x006e
            int r2 = r2 + 8
        L_0x006e:
            int r7 = r7 + 1
            goto L_0x005c
        L_0x0071:
            r0.u(r2)
            if (r1 <= 0) goto L_0x007c
            int r6 = r6 - r1
            int r6 = r6 * 2
            r0.u(r6)
        L_0x007c:
            Q0.i r0 = new Q0.i
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.e(N1.f, boolean, int, Q0.i):Q0.i");
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [Q0.l, java.lang.Object] */
    public static l f(byte[] bArr, int i, int i8) {
        byte b8;
        int i9;
        int i10;
        int i11;
        int i12 = i + 2;
        while (true) {
            i8--;
            b8 = bArr[i8];
            if (b8 != 0 || i8 <= i12) {
            }
        }
        if (b8 != 0 && i8 > i12) {
            f fVar = new f(bArr, i12, i8 + 1);
            while (fVar.d(16)) {
                int i13 = fVar.i(8);
                int i14 = 0;
                while (i13 == 255) {
                    i14 += 255;
                    i13 = fVar.i(8);
                }
                int i15 = i14 + i13;
                int i16 = fVar.i(8);
                int i17 = 0;
                while (i16 == 255) {
                    i17 += 255;
                    i16 = fVar.i(8);
                }
                int i18 = i17 + i16;
                if (i18 == 0 || !fVar.d(i18)) {
                    break;
                } else if (i15 == 176) {
                    int m8 = fVar.m();
                    boolean h5 = fVar.h();
                    if (h5) {
                        i9 = fVar.m();
                    } else {
                        i9 = 0;
                    }
                    int m9 = fVar.m();
                    int i19 = -1;
                    for (int i20 = 0; i20 <= m9; i20++) {
                        i19 = fVar.m();
                        fVar.m();
                        int i21 = fVar.i(6);
                        if (i21 == 63) {
                            return null;
                        }
                        if (i21 == 0) {
                            i10 = Math.max(0, m8 - 30);
                        } else {
                            i10 = Math.max(0, (i21 + m8) - 31);
                        }
                        fVar.i(i10);
                        if (h5) {
                            int i22 = fVar.i(6);
                            if (i22 == 63) {
                                return null;
                            }
                            if (i22 == 0) {
                                i11 = Math.max(0, i9 - 30);
                            } else {
                                i11 = Math.max(0, (i22 + i9) - 31);
                            }
                            fVar.i(i11);
                        }
                        if (fVar.h()) {
                            fVar.u(10);
                        }
                    }
                    ? obj = new Object();
                    obj.f4037U = i19;
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Q0.m g(byte[] r30, int r31, int r32, B3.q r33) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            N1.f r4 = new N1.f
            r4.<init>(r0, r1, r2)
            M0.k r4 = d(r4)
            r5 = 2
            int r1 = r1 + r5
            N1.f r6 = new N1.f
            r6.<init>(r0, r1, r2)
            r0 = 4
            r6.u(r0)
            r1 = 3
            int r2 = r6.i(r1)
            r7 = 1
            int r4 = r4.f2965c
            if (r4 == 0) goto L_0x002b
            r9 = 7
            if (r2 != r9) goto L_0x002b
            r9 = 1
            goto L_0x002c
        L_0x002b:
            r9 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x004a
            java.lang.Object r10 = r3.f449U
            H3.O r10 = (H3.O) r10
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x004a
            int r11 = r10.size()
            int r11 = r11 - r7
            int r4 = java.lang.Math.min(r4, r11)
            java.lang.Object r4 = r10.get(r4)
            Q0.h r4 = (Q0.h) r4
            int r4 = r4.f4024a
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            r10 = 0
            if (r9 != 0) goto L_0x0057
            r6.t()
            Q0.i r10 = e(r6, r7, r2, r10)
        L_0x0055:
            r12 = r10
            goto L_0x0070
        L_0x0057:
            if (r3 == 0) goto L_0x0055
            java.lang.Object r11 = r3.f450V
            Q0.j r11 = (Q0.j) r11
            int[] r12 = r11.f4032b
            r12 = r12[r4]
            H3.O r11 = r11.f4031a
            int r13 = r11.size()
            if (r13 <= r12) goto L_0x0055
            java.lang.Object r10 = r11.get(r12)
            Q0.i r10 = (Q0.i) r10
            goto L_0x0055
        L_0x0070:
            r6.o()
            r10 = -1
            r11 = 8
            if (r9 == 0) goto L_0x00b9
            boolean r13 = r6.h()
            if (r13 == 0) goto L_0x0083
            int r13 = r6.i(r11)
            goto L_0x0084
        L_0x0083:
            r13 = -1
        L_0x0084:
            if (r3 == 0) goto L_0x00b4
            java.lang.Object r14 = r3.f451W
            Q0.j r14 = (Q0.j) r14
            if (r14 == 0) goto L_0x00b4
            if (r13 != r10) goto L_0x0092
            int[] r13 = r14.f4032b
            r13 = r13[r4]
        L_0x0092:
            if (r13 == r10) goto L_0x00b4
            H3.O r14 = r14.f4031a
            int r15 = r14.size()
            if (r15 <= r13) goto L_0x00b4
            java.lang.Object r13 = r14.get(r13)
            Q0.k r13 = (Q0.k) r13
            int r14 = r13.f4033a
            int r14 = r13.f4036d
            int r15 = r13.e
            int r10 = r13.f4034b
            int r13 = r13.f4035c
            r29 = r13
            r13 = r10
            r10 = r15
            r15 = r14
            r14 = r29
            goto L_0x0109
        L_0x00b4:
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x0109
        L_0x00b9:
            int r10 = r6.o()
            if (r10 != r1) goto L_0x00c2
            r6.t()
        L_0x00c2:
            int r13 = r6.o()
            int r14 = r6.o()
            boolean r15 = r6.h()
            if (r15 == 0) goto L_0x00fa
            int r15 = r6.o()
            int r16 = r6.o()
            int r17 = r6.o()
            int r18 = r6.o()
            if (r10 == r7) goto L_0x00e8
            if (r10 != r5) goto L_0x00e5
            goto L_0x00e8
        L_0x00e5:
            r19 = 1
            goto L_0x00ea
        L_0x00e8:
            r19 = 2
        L_0x00ea:
            int r15 = r15 + r16
            int r15 = r15 * r19
            int r13 = r13 - r15
            if (r10 != r7) goto L_0x00f3
            r10 = 2
            goto L_0x00f4
        L_0x00f3:
            r10 = 1
        L_0x00f4:
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r14 = r14 - r17
        L_0x00fa:
            r15 = r14
            int r10 = r6.o()
            int r14 = r6.o()
            r29 = r13
            r13 = r10
            r10 = r15
            r15 = r29
        L_0x0109:
            int r16 = r6.o()
            if (r9 != 0) goto L_0x0134
            boolean r17 = r6.h()
            if (r17 == 0) goto L_0x0118
            r17 = 0
            goto L_0x011a
        L_0x0118:
            r17 = r2
        L_0x011a:
            r8 = r17
            r11 = -1
        L_0x011d:
            if (r8 > r2) goto L_0x0131
            r6.o()
            int r5 = r6.o()
            int r11 = java.lang.Math.max(r5, r11)
            r6.o()
            int r8 = r8 + 1
            r5 = 2
            goto L_0x011d
        L_0x0131:
            r18 = r11
            goto L_0x0136
        L_0x0134:
            r18 = -1
        L_0x0136:
            r6.o()
            r6.o()
            r6.o()
            r6.o()
            r6.o()
            r6.o()
            boolean r2 = r6.h()
            if (r2 == 0) goto L_0x015c
            if (r9 == 0) goto L_0x0155
            boolean r2 = r6.h()
            goto L_0x0156
        L_0x0155:
            r2 = 0
        L_0x0156:
            r5 = 6
            if (r2 == 0) goto L_0x015e
            r6.u(r5)
        L_0x015c:
            r0 = 2
            goto L_0x0197
        L_0x015e:
            boolean r2 = r6.h()
            if (r2 == 0) goto L_0x015c
            r2 = 0
        L_0x0165:
            if (r2 >= r0) goto L_0x015c
            r8 = 0
        L_0x0168:
            if (r8 >= r5) goto L_0x0194
            boolean r9 = r6.h()
            if (r9 != 0) goto L_0x0174
            r6.m()
            goto L_0x018d
        L_0x0174:
            int r9 = r2 << 1
            int r9 = r9 + r0
            int r9 = r7 << r9
            r11 = 64
            int r9 = java.lang.Math.min(r11, r9)
            if (r2 <= r7) goto L_0x0184
            r6.n()
        L_0x0184:
            r11 = 0
        L_0x0185:
            if (r11 >= r9) goto L_0x018d
            r6.n()
            int r11 = r11 + 1
            goto L_0x0185
        L_0x018d:
            if (r2 != r1) goto L_0x0191
            r9 = 3
            goto L_0x0192
        L_0x0191:
            r9 = 1
        L_0x0192:
            int r8 = r8 + r9
            goto L_0x0168
        L_0x0194:
            int r2 = r2 + 1
            goto L_0x0165
        L_0x0197:
            r6.u(r0)
            boolean r0 = r6.h()
            if (r0 == 0) goto L_0x01ae
            r0 = 8
            r6.u(r0)
            r6.o()
            r6.o()
            r6.t()
        L_0x01ae:
            int r0 = r6.m()
            r2 = 0
            int[] r5 = new int[r2]
            int[] r8 = new int[r2]
            r2 = -1
            r9 = 0
            r11 = -1
        L_0x01ba:
            if (r9 >= r0) goto L_0x02e6
            if (r9 == 0) goto L_0x028b
            boolean r19 = r6.h()
            if (r19 == 0) goto L_0x028b
            int r1 = r11 + r2
            boolean r20 = r6.h()
            int r21 = r6.m()
            int r21 = r21 + 1
            r17 = 2
            int r20 = r20 * 2
            int r20 = 1 - r20
            int r20 = r20 * r21
            int r7 = r1 + 1
            r22 = r0
            boolean[] r0 = new boolean[r7]
            r23 = r15
            r15 = 0
        L_0x01e1:
            if (r15 > r1) goto L_0x01f7
            boolean r24 = r6.h()
            if (r24 != 0) goto L_0x01f0
            boolean r24 = r6.h()
            r0[r15] = r24
            goto L_0x01f4
        L_0x01f0:
            r21 = 1
            r0[r15] = r21
        L_0x01f4:
            int r15 = r15 + 1
            goto L_0x01e1
        L_0x01f7:
            int[] r15 = new int[r7]
            int[] r7 = new int[r7]
            int r24 = r2 + -1
            r25 = 0
        L_0x01ff:
            if (r24 < 0) goto L_0x0216
            r26 = r8[r24]
            int r26 = r26 + r20
            if (r26 >= 0) goto L_0x0213
            int r27 = r11 + r24
            boolean r27 = r0[r27]
            if (r27 == 0) goto L_0x0213
            int r27 = r25 + 1
            r15[r25] = r26
            r25 = r27
        L_0x0213:
            int r24 = r24 + -1
            goto L_0x01ff
        L_0x0216:
            if (r20 >= 0) goto L_0x0222
            boolean r24 = r0[r1]
            if (r24 == 0) goto L_0x0222
            int r24 = r25 + 1
            r15[r25] = r20
            r25 = r24
        L_0x0222:
            r24 = r14
            r14 = r25
            r25 = r13
            r13 = 0
        L_0x0229:
            if (r13 >= r11) goto L_0x023e
            r26 = r5[r13]
            int r26 = r26 + r20
            if (r26 >= 0) goto L_0x023b
            boolean r27 = r0[r13]
            if (r27 == 0) goto L_0x023b
            int r27 = r14 + 1
            r15[r14] = r26
            r14 = r27
        L_0x023b:
            int r13 = r13 + 1
            goto L_0x0229
        L_0x023e:
            int[] r13 = java.util.Arrays.copyOf(r15, r14)
            int r15 = r11 + -1
            r26 = 0
        L_0x0246:
            if (r15 < 0) goto L_0x025b
            r27 = r5[r15]
            int r27 = r27 + r20
            if (r27 <= 0) goto L_0x0258
            boolean r28 = r0[r15]
            if (r28 == 0) goto L_0x0258
            int r28 = r26 + 1
            r7[r26] = r27
            r26 = r28
        L_0x0258:
            int r15 = r15 + -1
            goto L_0x0246
        L_0x025b:
            if (r20 <= 0) goto L_0x0267
            boolean r1 = r0[r1]
            if (r1 == 0) goto L_0x0267
            int r1 = r26 + 1
            r7[r26] = r20
            r26 = r1
        L_0x0267:
            r1 = r26
            r5 = 0
        L_0x026a:
            if (r5 >= r2) goto L_0x0281
            r15 = r8[r5]
            int r15 = r15 + r20
            if (r15 <= 0) goto L_0x027e
            int r26 = r11 + r5
            boolean r26 = r0[r26]
            if (r26 == 0) goto L_0x027e
            int r26 = r1 + 1
            r7[r1] = r15
            r1 = r26
        L_0x027e:
            int r5 = r5 + 1
            goto L_0x026a
        L_0x0281:
            int[] r0 = java.util.Arrays.copyOf(r7, r1)
            r8 = r0
            r2 = r1
            r5 = r13
            r11 = r14
            r13 = 1
            goto L_0x02d8
        L_0x028b:
            r22 = r0
            r25 = r13
            r24 = r14
            r23 = r15
            int r0 = r6.m()
            int r1 = r6.m()
            int[] r2 = new int[r0]
            r5 = 0
        L_0x029e:
            if (r5 >= r0) goto L_0x02b7
            if (r5 <= 0) goto L_0x02a7
            int r7 = r5 + -1
            r7 = r2[r7]
            goto L_0x02a8
        L_0x02a7:
            r7 = 0
        L_0x02a8:
            int r8 = r6.m()
            r11 = 1
            int r8 = r8 + r11
            int r7 = r7 - r8
            r2[r5] = r7
            r6.t()
            int r5 = r5 + 1
            goto L_0x029e
        L_0x02b7:
            int[] r5 = new int[r1]
            r7 = 0
        L_0x02ba:
            if (r7 >= r1) goto L_0x02d3
            if (r7 <= 0) goto L_0x02c3
            int r8 = r7 + -1
            r8 = r5[r8]
            goto L_0x02c4
        L_0x02c3:
            r8 = 0
        L_0x02c4:
            int r11 = r6.m()
            r13 = 1
            int r11 = r11 + r13
            int r11 = r11 + r8
            r5[r7] = r11
            r6.t()
            int r7 = r7 + 1
            goto L_0x02ba
        L_0x02d3:
            r13 = 1
            r11 = r0
            r8 = r5
            r5 = r2
            r2 = r1
        L_0x02d8:
            int r9 = r9 + 1
            r0 = r22
            r15 = r23
            r14 = r24
            r13 = r25
            r1 = 3
            r7 = 1
            goto L_0x01ba
        L_0x02e6:
            r25 = r13
            r24 = r14
            r23 = r15
            r13 = 1
            boolean r0 = r6.h()
            if (r0 == 0) goto L_0x0302
            int r0 = r6.o()
            r8 = 0
        L_0x02f8:
            if (r8 >= r0) goto L_0x0302
            int r1 = r16 + 5
            r6.u(r1)
            int r8 = r8 + 1
            goto L_0x02f8
        L_0x0302:
            r0 = 2
            r6.u(r0)
            boolean r1 = r6.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x03c7
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x0340
            r1 = 8
            int r5 = r6.i(r1)
            r1 = 255(0xff, float:3.57E-43)
            if (r5 != r1) goto L_0x0330
            r1 = 16
            int r5 = r6.i(r1)
            int r1 = r6.i(r1)
            if (r5 == 0) goto L_0x0340
            if (r1 == 0) goto L_0x0340
            float r2 = (float) r5
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L_0x0340
        L_0x0330:
            r1 = 17
            if (r5 >= r1) goto L_0x0339
            float[] r1 = f4069b
            r2 = r1[r5]
            goto L_0x0340
        L_0x0339:
            java.lang.String r1 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r7 = "NalUnitUtil"
            Q0.g.u(r5, r1, r7)
        L_0x0340:
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x0349
            r6.t()
        L_0x0349:
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x037b
            r1 = 3
            r6.u(r1)
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x035b
            r5 = 1
            goto L_0x035c
        L_0x035b:
            r5 = 2
        L_0x035c:
            boolean r0 = r6.h()
            if (r0 == 0) goto L_0x0378
            r0 = 8
            int r1 = r6.i(r0)
            int r3 = r6.i(r0)
            r6.u(r0)
            int r0 = M0.C0121i.f(r1)
            int r1 = M0.C0121i.g(r3)
            goto L_0x03a5
        L_0x0378:
            r0 = -1
            r1 = -1
            goto L_0x03a5
        L_0x037b:
            if (r3 == 0) goto L_0x03a2
            java.lang.Object r0 = r3.f452X
            Q0.j r0 = (Q0.j) r0
            if (r0 == 0) goto L_0x03a2
            int[] r1 = r0.f4032b
            r1 = r1[r4]
            H3.O r0 = r0.f4031a
            int r3 = r0.size()
            if (r3 <= r1) goto L_0x03a2
            java.lang.Object r0 = r0.get(r1)
            Q0.n r0 = (Q0.n) r0
            int r1 = r0.f4046a
            int r3 = r0.f4047b
            int r0 = r0.f4048c
            r5 = r3
            r29 = r1
            r1 = r0
            r0 = r29
            goto L_0x03a5
        L_0x03a2:
            r0 = -1
            r1 = -1
            r5 = -1
        L_0x03a5:
            boolean r3 = r6.h()
            if (r3 == 0) goto L_0x03b1
            r6.o()
            r6.o()
        L_0x03b1:
            r6.t()
            boolean r3 = r6.h()
            if (r3 == 0) goto L_0x03bc
            int r10 = r10 * 2
        L_0x03bc:
            r19 = r0
            r21 = r1
            r17 = r2
            r20 = r5
            r16 = r10
            goto L_0x03d1
        L_0x03c7:
            r16 = r10
            r17 = 1065353216(0x3f800000, float:1.0)
            r19 = -1
            r20 = -1
            r21 = -1
        L_0x03d1:
            Q0.m r0 = new Q0.m
            r11 = r0
            r13 = r25
            r14 = r24
            r15 = r23
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.g(byte[], int, int, B3.q):Q0.m");
    }

    /* JADX WARNING: Removed duplicated region for block: B:296:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x05af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static B3.q h(byte[] r36, int r37, int r38) {
        /*
            N1.f r0 = new N1.f
            r1 = r36
            r2 = r37
            r3 = r38
            r0.<init>(r1, r2, r3)
            d(r0)
            r1 = 4
            r0.u(r1)
            boolean r2 = r0.h()
            boolean r3 = r0.h()
            r4 = 6
            int r5 = r0.i(r4)
            int r6 = r5 + 1
            r7 = 3
            int r8 = r0.i(r7)
            r9 = 17
            r0.u(r9)
            r9 = 1
            r10 = 0
            Q0.i r11 = e(r0, r9, r8, r10)
            boolean r12 = r0.h()
            r13 = 0
            if (r12 == 0) goto L_0x003a
            r12 = 0
            goto L_0x003b
        L_0x003a:
            r12 = r8
        L_0x003b:
            if (r12 > r8) goto L_0x0049
            r0.o()
            r0.o()
            r0.o()
            int r12 = r12 + 1
            goto L_0x003b
        L_0x0049:
            int r12 = r0.i(r4)
            int r14 = r0.o()
            int r14 = r14 + r9
            H3.i0 r15 = H3.O.r(r11)
            Q0.j r4 = new Q0.j
            int[] r7 = new int[r9]
            r10 = 0
            r4.<init>(r15, r7, r10)
            r7 = 2
            if (r6 < r7) goto L_0x0065
            if (r14 < r7) goto L_0x0065
            r10 = 1
            goto L_0x0066
        L_0x0065:
            r10 = 0
        L_0x0066:
            if (r2 == 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            int r3 = r12 + 1
            if (r3 < r6) goto L_0x0073
            r15 = 1
            goto L_0x0074
        L_0x0073:
            r15 = 0
        L_0x0074:
            if (r10 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x007a
            if (r15 != 0) goto L_0x007d
        L_0x007a:
            r1 = 0
            goto L_0x07ef
        L_0x007d:
            int[] r2 = new int[r7]
            r2[r9] = r3
            r2[r13] = r14
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r10, r2)
            int[][] r2 = (int[][]) r2
            int[] r10 = new int[r14]
            int[] r15 = new int[r14]
            r16 = r2[r13]
            r16[r13] = r13
            r10[r13] = r9
            r15[r13] = r13
            r7 = 1
        L_0x0098:
            if (r7 >= r14) goto L_0x00b8
            r9 = 0
            r18 = 0
        L_0x009d:
            if (r9 > r12) goto L_0x00b4
            boolean r19 = r0.h()
            if (r19 == 0) goto L_0x00af
            r19 = r2[r7]
            int r20 = r18 + 1
            r19[r18] = r9
            r15[r7] = r9
            r18 = r20
        L_0x00af:
            r10[r7] = r18
            int r9 = r9 + 1
            goto L_0x009d
        L_0x00b4:
            int r7 = r7 + 1
            r9 = 1
            goto L_0x0098
        L_0x00b8:
            boolean r7 = r0.h()
            r9 = 8
            if (r7 == 0) goto L_0x016c
            r7 = 64
            r0.u(r7)
            boolean r7 = r0.h()
            if (r7 == 0) goto L_0x00ce
            r0.o()
        L_0x00ce:
            int r7 = r0.o()
        L_0x00d2:
            if (r13 >= r7) goto L_0x016c
            r0.o()
            if (r13 == 0) goto L_0x00e7
            boolean r19 = r0.h()
            if (r19 == 0) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r19 = 0
            r20 = 0
        L_0x00e4:
            r21 = 0
            goto L_0x010c
        L_0x00e7:
            boolean r19 = r0.h()
            boolean r20 = r0.h()
            if (r19 != 0) goto L_0x00f3
            if (r20 == 0) goto L_0x00e4
        L_0x00f3:
            boolean r21 = r0.h()
            if (r21 == 0) goto L_0x00fe
            r1 = 19
            r0.u(r1)
        L_0x00fe:
            r0.u(r9)
            if (r21 == 0) goto L_0x0107
            r1 = 4
            r0.u(r1)
        L_0x0107:
            r1 = 15
            r0.u(r1)
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r1 > r8) goto L_0x0161
            boolean r22 = r0.h()
            if (r22 != 0) goto L_0x0119
            boolean r22 = r0.h()
        L_0x0119:
            if (r22 == 0) goto L_0x0121
            r0.m()
            r22 = 0
            goto L_0x0125
        L_0x0121:
            boolean r22 = r0.h()
        L_0x0125:
            if (r22 != 0) goto L_0x0130
            int r22 = r0.m()
            r23 = r7
            r9 = r22
            goto L_0x0133
        L_0x0130:
            r23 = r7
            r9 = 0
        L_0x0133:
            int r7 = r19 + r20
            r24 = r15
            r15 = 0
        L_0x0138:
            if (r15 >= r7) goto L_0x0158
            r25 = r7
            r7 = 0
        L_0x013d:
            if (r7 > r9) goto L_0x0153
            r0.m()
            r0.m()
            if (r21 == 0) goto L_0x014d
            r0.m()
            r0.m()
        L_0x014d:
            r0.t()
            int r7 = r7 + 1
            goto L_0x013d
        L_0x0153:
            int r15 = r15 + 1
            r7 = r25
            goto L_0x0138
        L_0x0158:
            int r1 = r1 + 1
            r7 = r23
            r15 = r24
            r9 = 8
            goto L_0x010d
        L_0x0161:
            r23 = r7
            r24 = r15
            int r13 = r13 + 1
            r1 = 4
            r9 = 8
            goto L_0x00d2
        L_0x016c:
            r24 = r15
            boolean r1 = r0.h()
            if (r1 != 0) goto L_0x017c
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x017c:
            r0.c()
            r1 = 0
            Q0.i r7 = e(r0, r1, r8, r11)
            boolean r1 = r0.h()
            r9 = 16
            boolean[] r13 = new boolean[r9]
            r19 = r7
            r7 = 0
            r15 = 0
        L_0x0190:
            if (r15 >= r9) goto L_0x019f
            boolean r20 = r0.h()
            r13[r15] = r20
            if (r20 == 0) goto L_0x019c
            int r7 = r7 + 1
        L_0x019c:
            int r15 = r15 + 1
            goto L_0x0190
        L_0x019f:
            if (r7 == 0) goto L_0x01a6
            r15 = 1
            boolean r20 = r13[r15]
            if (r20 != 0) goto L_0x01a9
        L_0x01a6:
            r1 = 0
            goto L_0x07e9
        L_0x01a9:
            int[] r15 = new int[r7]
            r21 = r11
            r9 = 0
        L_0x01ae:
            int r11 = r7 - r1
            if (r9 >= r11) goto L_0x01bc
            r11 = 3
            int r23 = r0.i(r11)
            r15[r9] = r23
            int r9 = r9 + 1
            goto L_0x01ae
        L_0x01bc:
            int r9 = r7 + 1
            int[] r9 = new int[r9]
            if (r1 == 0) goto L_0x01e5
            r11 = 1
        L_0x01c3:
            if (r11 >= r7) goto L_0x01de
            r23 = r2
            r2 = 0
        L_0x01c8:
            if (r2 >= r11) goto L_0x01d9
            r25 = r9[r11]
            r26 = r15[r2]
            r17 = 1
            int r26 = r26 + 1
            int r26 = r26 + r25
            r9[r11] = r26
            int r2 = r2 + 1
            goto L_0x01c8
        L_0x01d9:
            int r11 = r11 + 1
            r2 = r23
            goto L_0x01c3
        L_0x01de:
            r23 = r2
            r2 = 6
            r9[r7] = r2
        L_0x01e3:
            r2 = 2
            goto L_0x01e8
        L_0x01e5:
            r23 = r2
            goto L_0x01e3
        L_0x01e8:
            int[] r11 = new int[r2]
            r2 = 1
            r11[r2] = r7
            r2 = 0
            r11[r2] = r6
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r11)
            int[][] r2 = (int[][]) r2
            int[] r11 = new int[r6]
            r18 = 0
            r11[r18] = r18
            boolean r25 = r0.h()
            r26 = r10
            r10 = 1
        L_0x0205:
            if (r10 >= r6) goto L_0x025a
            if (r25 == 0) goto L_0x0213
            r27 = r8
            r8 = 6
            int r28 = r0.i(r8)
            r11[r10] = r28
            goto L_0x0218
        L_0x0213:
            r27 = r8
            r8 = 6
            r11[r10] = r10
        L_0x0218:
            if (r1 != 0) goto L_0x0235
            r8 = 0
        L_0x021b:
            if (r8 >= r7) goto L_0x0232
            r28 = r2[r10]
            r29 = r15[r8]
            r30 = r1
            r17 = 1
            int r1 = r29 + 1
            int r1 = r0.i(r1)
            r28[r8] = r1
            int r8 = r8 + 1
            r1 = r30
            goto L_0x021b
        L_0x0232:
            r30 = r1
            goto L_0x0253
        L_0x0235:
            r30 = r1
            r1 = 0
        L_0x0238:
            if (r1 >= r7) goto L_0x0253
            r8 = r2[r10]
            r28 = r11[r10]
            int r29 = r1 + 1
            r31 = r9[r29]
            r17 = 1
            int r31 = r17 << r31
            int r31 = r31 + -1
            r28 = r28 & r31
            r31 = r9[r1]
            int r28 = r28 >> r31
            r8[r1] = r28
            r1 = r29
            goto L_0x0238
        L_0x0253:
            int r10 = r10 + 1
            r8 = r27
            r1 = r30
            goto L_0x0205
        L_0x025a:
            r27 = r8
            int[] r1 = new int[r3]
            r7 = 1
            r8 = 0
        L_0x0260:
            r9 = -1
            if (r8 >= r6) goto L_0x029d
            r10 = r11[r8]
            r1[r10] = r9
            r9 = 0
            r10 = 0
        L_0x0269:
            r15 = 16
            if (r9 >= r15) goto L_0x0281
            boolean r15 = r13[r9]
            if (r15 == 0) goto L_0x027e
            r15 = 1
            if (r9 != r15) goto L_0x027c
            r15 = r11[r8]
            r25 = r2[r8]
            r25 = r25[r10]
            r1[r15] = r25
        L_0x027c:
            int r10 = r10 + 1
        L_0x027e:
            int r9 = r9 + 1
            goto L_0x0269
        L_0x0281:
            if (r8 <= 0) goto L_0x029a
            r9 = 0
        L_0x0284:
            if (r9 >= r8) goto L_0x0295
            r10 = r11[r8]
            r10 = r1[r10]
            r15 = r11[r9]
            r15 = r1[r15]
            if (r10 != r15) goto L_0x0292
            r9 = 0
            goto L_0x0296
        L_0x0292:
            int r9 = r9 + 1
            goto L_0x0284
        L_0x0295:
            r9 = 1
        L_0x0296:
            if (r9 == 0) goto L_0x029a
            int r7 = r7 + 1
        L_0x029a:
            int r8 = r8 + 1
            goto L_0x0260
        L_0x029d:
            r8 = 4
            int r2 = r0.i(r8)
            r8 = 2
            if (r7 < r8) goto L_0x07e2
            if (r2 != 0) goto L_0x02a9
            goto L_0x07e2
        L_0x02a9:
            int[] r8 = new int[r7]
            r10 = 0
        L_0x02ac:
            if (r10 >= r7) goto L_0x02b7
            int r13 = r0.i(r2)
            r8[r10] = r13
            int r10 = r10 + 1
            goto L_0x02ac
        L_0x02b7:
            int[] r2 = new int[r3]
            r10 = 0
        L_0x02ba:
            if (r10 >= r6) goto L_0x02c7
            r13 = r11[r10]
            int r13 = java.lang.Math.min(r13, r12)
            r2[r13] = r10
            int r10 = r10 + 1
            goto L_0x02ba
        L_0x02c7:
            H3.L r10 = H3.O.j()
            r13 = 0
        L_0x02cc:
            if (r13 > r12) goto L_0x02f0
            r15 = r1[r13]
            r17 = 1
            int r9 = r7 + -1
            int r9 = java.lang.Math.min(r15, r9)
            if (r9 < 0) goto L_0x02dd
            r9 = r8[r9]
            goto L_0x02de
        L_0x02dd:
            r9 = -1
        L_0x02de:
            Q0.h r15 = new Q0.h
            r25 = r1
            r1 = r2[r13]
            r15.<init>(r1, r9)
            r10.c(r15)
            int r13 = r13 + 1
            r1 = r25
            r9 = -1
            goto L_0x02cc
        L_0x02f0:
            H3.i0 r1 = r10.g()
            r2 = 0
            java.lang.Object r7 = r1.get(r2)
            Q0.h r7 = (Q0.h) r7
            int r2 = r7.f4025b
            r7 = -1
            if (r2 != r7) goto L_0x0308
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x0308:
            r2 = 1
        L_0x0309:
            if (r2 > r12) goto L_0x0319
            java.lang.Object r8 = r1.get(r2)
            Q0.h r8 = (Q0.h) r8
            int r8 = r8.f4025b
            if (r8 == r7) goto L_0x0316
            goto L_0x031a
        L_0x0316:
            int r2 = r2 + 1
            goto L_0x0309
        L_0x0319:
            r2 = -1
        L_0x031a:
            if (r2 != r7) goto L_0x0324
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x0324:
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r6
            r10 = 0
            r8[r10] = r6
            java.lang.Class r12 = java.lang.Boolean.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r12, r8)
            boolean[][] r8 = (boolean[][]) r8
            int[] r13 = new int[r7]
            r13[r9] = r6
            r13[r10] = r6
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r12, r13)
            boolean[][] r7 = (boolean[][]) r7
            r9 = 1
        L_0x0342:
            if (r9 >= r6) goto L_0x0359
            r10 = 0
        L_0x0345:
            if (r10 >= r9) goto L_0x0356
            r12 = r8[r9]
            r13 = r7[r9]
            boolean r15 = r0.h()
            r13[r10] = r15
            r12[r10] = r15
            int r10 = r10 + 1
            goto L_0x0345
        L_0x0356:
            int r9 = r9 + 1
            goto L_0x0342
        L_0x0359:
            r9 = 1
        L_0x035a:
            if (r9 >= r6) goto L_0x037b
            r10 = 0
        L_0x035d:
            if (r10 >= r5) goto L_0x0378
            r12 = 0
        L_0x0360:
            if (r12 >= r9) goto L_0x0375
            r13 = r7[r9]
            boolean r15 = r13[r12]
            if (r15 == 0) goto L_0x0372
            r15 = r7[r12]
            boolean r15 = r15[r10]
            if (r15 == 0) goto L_0x0372
            r15 = 1
            r13[r10] = r15
            goto L_0x0375
        L_0x0372:
            int r12 = r12 + 1
            goto L_0x0360
        L_0x0375:
            int r10 = r10 + 1
            goto L_0x035d
        L_0x0378:
            int r9 = r9 + 1
            goto L_0x035a
        L_0x037b:
            int[] r9 = new int[r3]
            r10 = 0
        L_0x037e:
            if (r10 >= r6) goto L_0x0393
            r12 = 0
            r13 = 0
        L_0x0382:
            if (r12 >= r10) goto L_0x038c
            r15 = r8[r10]
            boolean r15 = r15[r12]
            int r13 = r13 + r15
            int r12 = r12 + 1
            goto L_0x0382
        L_0x038c:
            r12 = r11[r10]
            r9[r12] = r13
            int r10 = r10 + 1
            goto L_0x037e
        L_0x0393:
            r10 = 0
            r12 = 0
        L_0x0395:
            if (r10 >= r6) goto L_0x03a2
            r13 = r11[r10]
            r13 = r9[r13]
            if (r13 != 0) goto L_0x039f
            int r12 = r12 + 1
        L_0x039f:
            int r10 = r10 + 1
            goto L_0x0395
        L_0x03a2:
            r10 = 1
            if (r12 <= r10) goto L_0x03ad
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x03ad:
            int[] r10 = new int[r6]
            int[] r12 = new int[r14]
            boolean r13 = r0.h()
            if (r13 == 0) goto L_0x03c7
            r13 = 0
        L_0x03b8:
            if (r13 >= r6) goto L_0x03c4
            r15 = 3
            int r25 = r0.i(r15)
            r10[r13] = r25
            int r13 = r13 + 1
            goto L_0x03b8
        L_0x03c4:
            r13 = r27
            goto L_0x03cd
        L_0x03c7:
            r13 = r27
            r15 = 0
            java.util.Arrays.fill(r10, r15, r6, r13)
        L_0x03cd:
            r15 = 0
        L_0x03ce:
            if (r15 >= r14) goto L_0x03fe
            r36 = r7
            r27 = r9
            r25 = r11
            r9 = 0
            r11 = 0
        L_0x03d8:
            r7 = r26[r15]
            if (r11 >= r7) goto L_0x03f1
            r7 = r23[r15]
            r7 = r7[r11]
            java.lang.Object r7 = r1.get(r7)
            Q0.h r7 = (Q0.h) r7
            int r7 = r7.f4024a
            r7 = r10[r7]
            int r9 = java.lang.Math.max(r9, r7)
            int r11 = r11 + 1
            goto L_0x03d8
        L_0x03f1:
            int r9 = r9 + 1
            r12[r15] = r9
            int r15 = r15 + 1
            r7 = r36
            r11 = r25
            r9 = r27
            goto L_0x03ce
        L_0x03fe:
            r36 = r7
            r27 = r9
            r25 = r11
            boolean r7 = r0.h()
            if (r7 == 0) goto L_0x0421
            r7 = 0
        L_0x040b:
            if (r7 >= r5) goto L_0x0421
            int r9 = r7 + 1
            r10 = r9
        L_0x0410:
            if (r10 >= r6) goto L_0x041f
            r11 = r8[r10]
            boolean r11 = r11[r7]
            if (r11 == 0) goto L_0x041c
            r11 = 3
            r0.u(r11)
        L_0x041c:
            int r10 = r10 + 1
            goto L_0x0410
        L_0x041f:
            r7 = r9
            goto L_0x040b
        L_0x0421:
            r0.t()
            int r5 = r0.o()
            r7 = 1
            int r5 = r5 + r7
            H3.L r9 = H3.O.j()
            r10 = r21
            r9.c(r10)
            if (r5 <= r7) goto L_0x044b
            r7 = r19
            r9.c(r7)
            r10 = 2
        L_0x043b:
            if (r10 >= r5) goto L_0x044b
            boolean r11 = r0.h()
            Q0.i r7 = e(r0, r11, r13, r7)
            r9.c(r7)
            int r10 = r10 + 1
            goto L_0x043b
        L_0x044b:
            H3.i0 r7 = r9.g()
            int r9 = r0.o()
            int r9 = r9 + r14
            if (r9 <= r14) goto L_0x045e
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x045e:
            r10 = 2
            int r11 = r0.i(r10)
            int[] r13 = new int[r10]
            r10 = 1
            r13[r10] = r3
            r10 = 0
            r13[r10] = r9
            java.lang.Class r15 = java.lang.Boolean.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r15, r13)
            boolean[][] r13 = (boolean[][]) r13
            int[] r15 = new int[r9]
            int[] r10 = new int[r9]
            r19 = r7
            r7 = 0
        L_0x047a:
            if (r7 >= r14) goto L_0x04d4
            r21 = r14
            r14 = 0
            r15[r7] = r14
            r18 = r24[r7]
            r10[r7] = r18
            if (r11 != 0) goto L_0x049c
            r28 = r8
            r8 = r13[r7]
            r29 = r12
            r12 = r26[r7]
            r30 = r6
            r6 = 1
            java.util.Arrays.fill(r8, r14, r12, r6)
            r8 = r26[r7]
            r15[r7] = r8
            r6 = 0
            r8 = 1
            goto L_0x04c9
        L_0x049c:
            r30 = r6
            r28 = r8
            r29 = r12
            r6 = 1
            if (r11 != r6) goto L_0x04c1
            r6 = r24[r7]
            r8 = 0
        L_0x04a8:
            r12 = r26[r7]
            if (r8 >= r12) goto L_0x04bc
            r12 = r13[r7]
            r14 = r23[r7]
            r14 = r14[r8]
            if (r14 != r6) goto L_0x04b6
            r14 = 1
            goto L_0x04b7
        L_0x04b6:
            r14 = 0
        L_0x04b7:
            r12[r8] = r14
            int r8 = r8 + 1
            goto L_0x04a8
        L_0x04bc:
            r8 = 1
            r15[r7] = r8
            r6 = 0
            goto L_0x04c9
        L_0x04c1:
            r6 = 0
            r8 = 1
            r12 = r13[r6]
            r12[r6] = r8
            r15[r6] = r8
        L_0x04c9:
            int r7 = r7 + 1
            r14 = r21
            r8 = r28
            r12 = r29
            r6 = r30
            goto L_0x047a
        L_0x04d4:
            r30 = r6
            r28 = r8
            r29 = r12
            r21 = r14
            r6 = 0
            r8 = 1
            int[] r7 = new int[r3]
            r12 = 2
            int[] r14 = new int[r12]
            r14[r8] = r3
            r14[r6] = r9
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r14)
            boolean[][] r3 = (boolean[][]) r3
            r6 = 0
            r8 = 1
        L_0x04f1:
            if (r8 >= r9) goto L_0x05dd
            if (r11 != r12) goto L_0x0517
            r12 = 0
        L_0x04f6:
            r14 = r26[r8]
            if (r12 >= r14) goto L_0x0517
            r14 = r13[r8]
            boolean r24 = r0.h()
            r14[r12] = r24
            r14 = r15[r8]
            r24 = r13[r8]
            boolean r24 = r24[r12]
            int r14 = r14 + r24
            r15[r8] = r14
            if (r24 == 0) goto L_0x0514
            r14 = r23[r8]
            r14 = r14[r12]
            r10[r8] = r14
        L_0x0514:
            int r12 = r12 + 1
            goto L_0x04f6
        L_0x0517:
            if (r6 != 0) goto L_0x053b
            r12 = r23[r8]
            r14 = 0
            r12 = r12[r14]
            if (r12 != 0) goto L_0x053b
            r12 = r13[r8]
            boolean r12 = r12[r14]
            if (r12 == 0) goto L_0x053b
            r12 = 1
        L_0x0527:
            r14 = r26[r8]
            if (r12 >= r14) goto L_0x053b
            r14 = r23[r8]
            r14 = r14[r12]
            if (r14 != r2) goto L_0x0538
            r14 = r13[r8]
            boolean r14 = r14[r2]
            if (r14 == 0) goto L_0x0538
            r6 = r8
        L_0x0538:
            int r12 = r12 + 1
            goto L_0x0527
        L_0x053b:
            r12 = 0
        L_0x053c:
            r14 = r26[r8]
            if (r12 >= r14) goto L_0x05ba
            r14 = 1
            if (r5 <= r14) goto L_0x05a7
            r14 = r3[r8]
            r24 = r13[r8]
            boolean r24 = r24[r12]
            r14[r12] = r24
            r24 = r13
            double r13 = (double) r5
            r31 = r2
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r2 = J3.c.c(r13, r2)
            r13 = r3[r8]
            boolean r13 = r13[r12]
            if (r13 != 0) goto L_0x058e
            r13 = r23[r8]
            r13 = r13[r12]
            java.lang.Object r13 = r1.get(r13)
            Q0.h r13 = (Q0.h) r13
            r14 = 0
        L_0x0567:
            if (r14 >= r12) goto L_0x058e
            r32 = r23[r8]
            r33 = r5
            r5 = r32[r14]
            java.lang.Object r5 = r1.get(r5)
            Q0.h r5 = (Q0.h) r5
            r32 = r11
            int r11 = r13.f4024a
            r11 = r36[r11]
            int r5 = r5.f4024a
            boolean r5 = r11[r5]
            if (r5 == 0) goto L_0x0587
            r5 = r3[r8]
            r11 = 1
            r5[r12] = r11
            goto L_0x0592
        L_0x0587:
            int r14 = r14 + 1
            r11 = r32
            r5 = r33
            goto L_0x0567
        L_0x058e:
            r33 = r5
            r32 = r11
        L_0x0592:
            r5 = r3[r8]
            boolean r5 = r5[r12]
            if (r5 == 0) goto L_0x05af
            if (r6 <= 0) goto L_0x05a3
            if (r8 != r6) goto L_0x05a3
            int r2 = r0.i(r2)
            r7[r12] = r2
            goto L_0x05af
        L_0x05a3:
            r0.u(r2)
            goto L_0x05af
        L_0x05a7:
            r31 = r2
            r33 = r5
            r32 = r11
            r24 = r13
        L_0x05af:
            int r12 = r12 + 1
            r13 = r24
            r2 = r31
            r11 = r32
            r5 = r33
            goto L_0x053c
        L_0x05ba:
            r31 = r2
            r33 = r5
            r32 = r11
            r24 = r13
            r2 = r15[r8]
            r5 = 1
            if (r2 != r5) goto L_0x05d0
            r2 = r10[r8]
            r2 = r27[r2]
            if (r2 <= 0) goto L_0x05d0
            r0.t()
        L_0x05d0:
            int r8 = r8 + 1
            r13 = r24
            r2 = r31
            r11 = r32
            r5 = r33
            r12 = 2
            goto L_0x04f1
        L_0x05dd:
            if (r6 != 0) goto L_0x05e7
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x05e7:
            int r2 = r0.m()
            int r4 = r2 + 1
            H3.L r5 = H3.O.l(r4)
            r6 = r30
            int[] r8 = new int[r6]
            r10 = 0
        L_0x05f6:
            if (r10 >= r4) goto L_0x066a
            r11 = 16
            int r12 = r0.i(r11)
            int r13 = r0.i(r11)
            boolean r14 = r0.h()
            if (r14 == 0) goto L_0x0621
            r14 = 2
            int r15 = r0.i(r14)
            r14 = 3
            if (r15 != r14) goto L_0x0613
            r0.t()
        L_0x0613:
            r14 = 4
            int r20 = r0.i(r14)
            int r23 = r0.i(r14)
            r32 = r20
            r33 = r23
            goto L_0x0626
        L_0x0621:
            r15 = 0
            r32 = 0
            r33 = 0
        L_0x0626:
            boolean r14 = r0.h()
            if (r14 == 0) goto L_0x0657
            int r14 = r0.m()
            int r20 = r0.m()
            int r23 = r0.m()
            int r24 = r0.m()
            r11 = 1
            if (r15 == r11) goto L_0x0645
            r11 = 2
            if (r15 != r11) goto L_0x0643
            goto L_0x0645
        L_0x0643:
            r11 = 1
            goto L_0x0646
        L_0x0645:
            r11 = 2
        L_0x0646:
            int r14 = r14 + r20
            int r14 = r14 * r11
            int r12 = r12 - r14
            r11 = 1
            if (r15 != r11) goto L_0x0650
            r11 = 2
            goto L_0x0651
        L_0x0650:
            r11 = 1
        L_0x0651:
            int r23 = r23 + r24
            int r23 = r23 * r11
            int r13 = r13 - r23
        L_0x0657:
            r34 = r12
            r35 = r13
            Q0.k r11 = new Q0.k
            r30 = r11
            r31 = r15
            r30.<init>(r31, r32, r33, r34, r35)
            r5.a(r11)
            int r10 = r10 + 1
            goto L_0x05f6
        L_0x066a:
            r10 = 1
            if (r4 <= r10) goto L_0x0686
            boolean r10 = r0.h()
            if (r10 == 0) goto L_0x0686
            double r10 = (double) r4
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r2 = J3.c.c(r10, r2)
            r4 = 1
        L_0x067b:
            if (r4 >= r6) goto L_0x0692
            int r10 = r0.i(r2)
            r8[r4] = r10
            int r4 = r4 + 1
            goto L_0x067b
        L_0x0686:
            r4 = 1
        L_0x0687:
            if (r4 >= r6) goto L_0x0692
            int r10 = java.lang.Math.min(r4, r2)
            r8[r4] = r10
            int r4 = r4 + 1
            goto L_0x0687
        L_0x0692:
            Q0.j r2 = new Q0.j
            H3.i0 r4 = r5.g()
            r5 = 1
            r2.<init>(r4, r8, r5)
            r4 = 2
            r0.u(r4)
            r4 = 1
        L_0x06a1:
            if (r4 >= r6) goto L_0x06af
            r5 = r25[r4]
            r5 = r27[r5]
            if (r5 != 0) goto L_0x06ac
            r0.t()
        L_0x06ac:
            int r4 = r4 + 1
            goto L_0x06a1
        L_0x06af:
            r4 = 1
        L_0x06b0:
            if (r4 >= r9) goto L_0x06e8
            boolean r5 = r0.h()
            r8 = 0
        L_0x06b7:
            r10 = r29[r4]
            if (r8 >= r10) goto L_0x06e5
            if (r8 <= 0) goto L_0x06c4
            if (r5 == 0) goto L_0x06c4
            boolean r10 = r0.h()
            goto L_0x06c9
        L_0x06c4:
            if (r8 != 0) goto L_0x06c8
            r10 = 1
            goto L_0x06c9
        L_0x06c8:
            r10 = 0
        L_0x06c9:
            if (r10 == 0) goto L_0x06e2
            r10 = 0
        L_0x06cc:
            r11 = r26[r4]
            if (r10 >= r11) goto L_0x06dc
            r11 = r3[r4]
            boolean r11 = r11[r10]
            if (r11 == 0) goto L_0x06d9
            r0.m()
        L_0x06d9:
            int r10 = r10 + 1
            goto L_0x06cc
        L_0x06dc:
            r0.m()
            r0.m()
        L_0x06e2:
            int r8 = r8 + 1
            goto L_0x06b7
        L_0x06e5:
            int r4 = r4 + 1
            goto L_0x06b0
        L_0x06e8:
            int r3 = r0.m()
            r15 = 2
            int r3 = r3 + r15
            boolean r4 = r0.h()
            if (r4 == 0) goto L_0x06f8
            r0.u(r3)
            goto L_0x070d
        L_0x06f8:
            r4 = 1
        L_0x06f9:
            if (r4 >= r6) goto L_0x070d
            r5 = 0
        L_0x06fc:
            if (r5 >= r4) goto L_0x070a
            r8 = r28[r4]
            boolean r8 = r8[r5]
            if (r8 == 0) goto L_0x0707
            r0.u(r3)
        L_0x0707:
            int r5 = r5 + 1
            goto L_0x06fc
        L_0x070a:
            int r4 = r4 + 1
            goto L_0x06f9
        L_0x070d:
            int r3 = r0.m()
            r4 = 1
        L_0x0712:
            if (r4 > r3) goto L_0x071c
            r5 = 8
            r0.u(r5)
            int r4 = r4 + 1
            goto L_0x0712
        L_0x071c:
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x07d3
            r0.c()
            boolean r3 = r0.h()
            if (r3 != 0) goto L_0x0730
            boolean r3 = r0.h()
            goto L_0x0731
        L_0x0730:
            r3 = 1
        L_0x0731:
            if (r3 == 0) goto L_0x0736
            r0.t()
        L_0x0736:
            boolean r3 = r0.h()
            boolean r4 = r0.h()
            if (r3 != 0) goto L_0x0742
            if (r4 == 0) goto L_0x0770
        L_0x0742:
            r14 = r21
            r5 = 0
        L_0x0745:
            if (r5 >= r14) goto L_0x0770
            r8 = 0
        L_0x0748:
            r9 = r29[r5]
            if (r8 >= r9) goto L_0x076d
            if (r3 == 0) goto L_0x0753
            boolean r9 = r0.h()
            goto L_0x0754
        L_0x0753:
            r9 = 0
        L_0x0754:
            if (r4 == 0) goto L_0x075b
            boolean r10 = r0.h()
            goto L_0x075c
        L_0x075b:
            r10 = 0
        L_0x075c:
            if (r9 == 0) goto L_0x0763
            r9 = 32
            r0.u(r9)
        L_0x0763:
            if (r10 == 0) goto L_0x076a
            r9 = 18
            r0.u(r9)
        L_0x076a:
            int r8 = r8 + 1
            goto L_0x0748
        L_0x076d:
            int r5 = r5 + 1
            goto L_0x0745
        L_0x0770:
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x077e
            r4 = 4
            int r5 = r0.i(r4)
            r4 = 1
            int r5 = r5 + r4
            goto L_0x077f
        L_0x077e:
            r5 = r6
        L_0x077f:
            H3.L r4 = H3.O.l(r5)
            int[] r8 = new int[r6]
            r9 = 0
        L_0x0786:
            if (r9 >= r5) goto L_0x07b6
            r10 = 3
            r0.u(r10)
            boolean r11 = r0.h()
            if (r11 == 0) goto L_0x0796
            r11 = 1
        L_0x0793:
            r12 = 8
            goto L_0x0798
        L_0x0796:
            r11 = 2
            goto L_0x0793
        L_0x0798:
            int r13 = r0.i(r12)
            int r13 = M0.C0121i.f(r13)
            int r14 = r0.i(r12)
            int r14 = M0.C0121i.g(r14)
            r0.u(r12)
            Q0.n r10 = new Q0.n
            r10.<init>(r13, r11, r14)
            r4.a(r10)
            int r9 = r9 + 1
            goto L_0x0786
        L_0x07b6:
            if (r3 == 0) goto L_0x07c8
            r3 = 1
            if (r5 <= r3) goto L_0x07c8
            r13 = 0
        L_0x07bc:
            if (r13 >= r6) goto L_0x07c8
            r3 = 4
            int r5 = r0.i(r3)
            r8[r13] = r5
            int r13 = r13 + 1
            goto L_0x07bc
        L_0x07c8:
            Q0.j r10 = new Q0.j
            H3.i0 r0 = r4.g()
            r3 = 2
            r10.<init>(r0, r8, r3)
            goto L_0x07d4
        L_0x07d3:
            r10 = 0
        L_0x07d4:
            B3.q r0 = new B3.q
            Q0.j r3 = new Q0.j
            r4 = 0
            r5 = r19
            r3.<init>(r5, r7, r4)
            r0.<init>(r1, r3, r2, r10)
            goto L_0x07f4
        L_0x07e2:
            B3.q r0 = new B3.q
            r1 = 0
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x07e9:
            B3.q r0 = new B3.q
            r0.<init>(r1, r4, r1, r1)
            goto L_0x07f4
        L_0x07ef:
            B3.q r0 = new B3.q
            r0.<init>(r1, r4, r1, r1)
        L_0x07f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.h(byte[], int, int):B3.q");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Q0.p i(byte[] r30, int r31, int r32) {
        /*
            r0 = 1
            int r1 = r31 + 1
            N1.f r2 = new N1.f
            r3 = r30
            r4 = r32
            r2.<init>(r3, r1, r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 16
            r8 = 86
            r9 = 44
            r10 = 244(0xf4, float:3.42E-43)
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            r14 = 3
            if (r4 == r13) goto L_0x0050
            if (r4 == r12) goto L_0x0050
            if (r4 == r11) goto L_0x0050
            if (r4 == r10) goto L_0x0050
            if (r4 == r9) goto L_0x0050
            r15 = 83
            if (r4 == r15) goto L_0x0050
            if (r4 == r8) goto L_0x0050
            r15 = 118(0x76, float:1.65E-43)
            if (r4 == r15) goto L_0x0050
            r15 = 128(0x80, float:1.794E-43)
            if (r4 == r15) goto L_0x0050
            r15 = 138(0x8a, float:1.93E-43)
            if (r4 != r15) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 1
            goto L_0x00b4
        L_0x0050:
            int r15 = r2.m()
            if (r15 != r14) goto L_0x005b
            boolean r16 = r2.h()
            goto L_0x005d
        L_0x005b:
            r16 = 0
        L_0x005d:
            int r17 = r2.m()
            int r18 = r2.m()
            r2.t()
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00ae
            if (r15 == r14) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r19 = 12
            r1 = 12
        L_0x0075:
            r10 = 0
        L_0x0076:
            if (r10 >= r1) goto L_0x00ae
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00a5
            r11 = 6
            if (r10 >= r11) goto L_0x0084
            r11 = 16
            goto L_0x0086
        L_0x0084:
            r11 = 64
        L_0x0086:
            r12 = 0
            r20 = 8
            r21 = 8
        L_0x008b:
            if (r12 >= r11) goto L_0x00a5
            if (r20 == 0) goto L_0x009b
            int r20 = r2.n()
            int r13 = r20 + r21
            int r13 = r13 + 256
            int r13 = r13 % 256
            r20 = r13
        L_0x009b:
            if (r20 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r21 = r20
        L_0x00a0:
            int r12 = r12 + 1
            r13 = 100
            goto L_0x008b
        L_0x00a5:
            int r10 = r10 + 1
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            goto L_0x0076
        L_0x00ae:
            r13 = r16
            r11 = r17
            r12 = r18
        L_0x00b4:
            int r1 = r2.m()
            int r1 = r1 + 4
            int r10 = r2.m()
            if (r10 != 0) goto L_0x00cf
            int r16 = r2.m()
            int r16 = r16 + 4
            r20 = r10
            r23 = r15
            r24 = r16
        L_0x00cc:
            r25 = 0
            goto L_0x00fc
        L_0x00cf:
            if (r10 != r0) goto L_0x00f5
            boolean r16 = r2.h()
            r2.n()
            r2.n()
            int r8 = r2.m()
            r20 = r10
            long r9 = (long) r8
            r23 = r15
            r8 = 0
        L_0x00e5:
            long r14 = (long) r8
            int r24 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r24 >= 0) goto L_0x00f0
            r2.m()
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00f0:
            r25 = r16
            r24 = 0
            goto L_0x00fc
        L_0x00f5:
            r20 = r10
            r23 = r15
            r24 = 0
            goto L_0x00cc
        L_0x00fc:
            r2.m()
            r2.t()
            int r8 = r2.m()
            int r8 = r8 + r0
            int r9 = r2.m()
            int r9 = r9 + r0
            boolean r14 = r2.h()
            int r10 = 2 - r14
            int r9 = r9 * r10
            if (r14 != 0) goto L_0x0119
            r2.t()
        L_0x0119:
            r2.t()
            int r8 = r8 * 16
            int r9 = r9 * 16
            boolean r15 = r2.h()
            r16 = 2
            if (r15 == 0) goto L_0x015f
            int r15 = r2.m()
            int r26 = r2.m()
            int r27 = r2.m()
            int r28 = r2.m()
            if (r23 != 0) goto L_0x013e
            r3 = 1
            r29 = 1
            goto L_0x0151
        L_0x013e:
            r0 = r23
            r3 = 3
            if (r0 != r3) goto L_0x0147
            r3 = 1
            r29 = 1
            goto L_0x014a
        L_0x0147:
            r3 = 1
            r29 = 2
        L_0x014a:
            if (r0 != r3) goto L_0x014e
            r0 = 2
            goto L_0x014f
        L_0x014e:
            r0 = 1
        L_0x014f:
            int r10 = r10 * r0
        L_0x0151:
            int r15 = r15 + r26
            int r15 = r15 * r29
            int r8 = r8 - r15
            int r27 = r27 + r28
            int r27 = r27 * r10
            int r9 = r9 - r27
        L_0x015c:
            r0 = 44
            goto L_0x0161
        L_0x015f:
            r3 = 1
            goto L_0x015c
        L_0x0161:
            if (r4 == r0) goto L_0x0177
            r0 = 86
            if (r4 == r0) goto L_0x0177
            r0 = 100
            if (r4 == r0) goto L_0x0177
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L_0x0177
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 == r0) goto L_0x0177
            r0 = 244(0xf4, float:3.42E-43)
            if (r4 != r0) goto L_0x017d
        L_0x0177:
            r0 = r5 & 16
            if (r0 == 0) goto L_0x017d
            r15 = 0
            goto L_0x017f
        L_0x017d:
            r15 = 16
        L_0x017f:
            boolean r0 = r2.h()
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x025e
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01ba
            r0 = 8
            int r3 = r2.i(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L_0x01aa
            r0 = 16
            int r3 = r2.i(r0)
            int r0 = r2.i(r0)
            if (r3 == 0) goto L_0x01ba
            if (r0 == 0) goto L_0x01ba
            float r3 = (float) r3
            float r0 = (float) r0
            float r17 = r3 / r0
            goto L_0x01ba
        L_0x01aa:
            r0 = 17
            if (r3 >= r0) goto L_0x01b3
            float[] r0 = f4069b
            r17 = r0[r3]
            goto L_0x01ba
        L_0x01b3:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r10 = "NalUnitUtil"
            Q0.g.u(r3, r0, r10)
        L_0x01ba:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01c3
            r2.t()
        L_0x01c3:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01f5
            r0 = 3
            r2.u(r0)
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01d5
            r0 = 1
            goto L_0x01d6
        L_0x01d5:
            r0 = 2
        L_0x01d6:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x01f2
            r3 = 8
            int r10 = r2.i(r3)
            int r16 = r2.i(r3)
            r2.u(r3)
            int r10 = M0.C0121i.f(r10)
            int r3 = M0.C0121i.g(r16)
            goto L_0x01f7
        L_0x01f2:
            r3 = -1
            r10 = -1
            goto L_0x01f7
        L_0x01f5:
            r0 = -1
            goto L_0x01f2
        L_0x01f7:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x0203
            r2.m()
            r2.m()
        L_0x0203:
            boolean r16 = r2.h()
            r30 = r0
            if (r16 == 0) goto L_0x0210
            r0 = 65
            r2.u(r0)
        L_0x0210:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0219
            j(r2)
        L_0x0219:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x0222
            j(r2)
        L_0x0222:
            if (r0 != 0) goto L_0x0226
            if (r16 == 0) goto L_0x0229
        L_0x0226:
            r2.t()
        L_0x0229:
            r2.t()
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0253
            r2.t()
            r2.m()
            r2.m()
            r2.m()
            r2.m()
            int r0 = r2.m()
            r2.m()
            r22 = r0
            r21 = r3
            r19 = r10
            r10 = r17
            r0 = r30
            goto L_0x0267
        L_0x0253:
            r0 = r30
            r21 = r3
            r19 = r10
            r22 = r15
            r10 = r17
            goto L_0x0267
        L_0x025e:
            r22 = r15
            r0 = -1
            r10 = 1065353216(0x3f800000, float:1.0)
            r19 = -1
            r21 = -1
        L_0x0267:
            Q0.p r2 = new Q0.p
            r3 = r2
            r16 = r20
            r15 = r1
            r17 = r24
            r18 = r25
            r20 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.i(byte[], int, int):Q0.p");
    }

    public static void j(f fVar) {
        int m8 = fVar.m() + 1;
        fVar.u(8);
        for (int i = 0; i < m8; i++) {
            fVar.m();
            fVar.m();
            fVar.t();
        }
        fVar.u(20);
    }

    public static int k(int i, byte[] bArr) {
        int i8;
        synchronized (f4070c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i) {
                while (true) {
                    if (i9 >= i - 2) {
                        i9 = i;
                        break;
                    }
                    try {
                        if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i) {
                    int[] iArr = f4071d;
                    if (iArr.length <= i10) {
                        f4071d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f4071d[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f4071d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
