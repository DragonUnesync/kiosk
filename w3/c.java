package W3;

import H3.P;
import U3.a;
import U3.b;
import org.altbeacon.bluetooth.Pdu;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final P f6182a;

    public c(int i) {
        switch (i) {
            case 1:
                this.f6182a = new P((Object) a.f5427o);
                return;
            case 2:
                this.f6182a = new P((Object) a.f5424l);
                return;
            default:
                this.f6182a = new P((Object) a.f5425m);
                return;
        }
    }

    public void a(byte[] bArr, int i, int i8, int i9, int i10) {
        int i11;
        int i12 = i8 + i9;
        if (i10 == 0) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        int[] iArr = new int[(i12 / i11)];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i10 == 0 || i13 % 2 == i10 - 1) {
                iArr[i13 / i11] = bArr[i13 + i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            }
        }
        try {
            this.f6182a.w0(iArr, i9 / i11);
            for (int i14 = 0; i14 < i8; i14++) {
                if (i10 == 0 || i14 % 2 == i10 - 1) {
                    bArr[i14 + i] = (byte) iArr[i14 / i11];
                }
            }
        } catch (b unused) {
            throw M3.b.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03ce, code lost:
        r5 = r7;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x068b, code lost:
        if (r3.length() <= 0) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x068d, code lost:
        r2.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0690, code lost:
        r2 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x069b, code lost:
        if (r4.isEmpty() == false) goto L_0x069e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x069d, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x06a1, code lost:
        return new S3.d(r0, r2, r4, (java.lang.String) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S3.d b(S3.b r25) {
        /*
            r24 = this;
            B.q0 r0 = new B.q0
            r1 = r25
            r0.<init>((S3.b) r1)
            java.lang.Object r1 = r0.f302X
            W3.d r1 = (W3.d) r1
            int r2 = r1.f6189g
            byte[] r3 = new byte[r2]
            java.lang.Object r4 = r0.f300V
            S3.b r4 = (S3.b) r4
            int r5 = r4.f4506V
            r7 = 0
            r8 = 4
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x001d:
            int r6 = r4.f4505U
            if (r8 != r5) goto L_0x0089
            if (r9 != 0) goto L_0x0089
            if (r10 != 0) goto L_0x0089
            int r10 = r11 + 1
            int r15 = r5 + -1
            boolean r19 = r0.x(r15, r7, r5, r6)
            r7 = 1
            int r18 = r19 << 1
            boolean r19 = r0.x(r15, r7, r5, r6)
            if (r19 == 0) goto L_0x0038
            r18 = r18 | 1
        L_0x0038:
            int r18 = r18 << 1
            r7 = 2
            boolean r15 = r0.x(r15, r7, r5, r6)
            if (r15 == 0) goto L_0x0043
            r18 = r18 | 1
        L_0x0043:
            r7 = 1
            int r15 = r18 << 1
            int r7 = r6 + -2
            r19 = r4
            r4 = 0
            boolean r7 = r0.x(r4, r7, r5, r6)
            if (r7 == 0) goto L_0x0053
            r15 = r15 | 1
        L_0x0053:
            r7 = 1
            int r15 = r15 << r7
            int r7 = r6 + -1
            boolean r21 = r0.x(r4, r7, r5, r6)
            if (r21 == 0) goto L_0x005f
            r15 = r15 | 1
        L_0x005f:
            r4 = 1
            int r15 = r15 << r4
            boolean r18 = r0.x(r4, r7, r5, r6)
            if (r18 == 0) goto L_0x0069
            r15 = r15 | 1
        L_0x0069:
            int r15 = r15 << r4
            r4 = 2
            boolean r21 = r0.x(r4, r7, r5, r6)
            if (r21 == 0) goto L_0x0073
            r15 = r15 | 1
        L_0x0073:
            r4 = 1
            int r15 = r15 << r4
            r4 = 3
            boolean r7 = r0.x(r4, r7, r5, r6)
            if (r7 == 0) goto L_0x007e
            r15 = r15 | 1
        L_0x007e:
            byte r4 = (byte) r15
            r3[r11] = r4
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r10
            r10 = 1
            goto L_0x0232
        L_0x0089:
            r19 = r4
            int r4 = r5 + -2
            if (r8 != r4) goto L_0x00f9
            if (r9 != 0) goto L_0x00f9
            r7 = r6 & 3
            if (r7 == 0) goto L_0x00f9
            if (r12 != 0) goto L_0x00f9
            int r7 = r11 + 1
            int r12 = r5 + -3
            r15 = 0
            boolean r12 = r0.x(r12, r15, r5, r6)
            r21 = r7
            r7 = 1
            int r12 = r12 << r7
            boolean r4 = r0.x(r4, r15, r5, r6)
            if (r4 == 0) goto L_0x00ac
            r12 = r12 | 1
        L_0x00ac:
            int r4 = r12 << 1
            int r12 = r5 + -1
            boolean r12 = r0.x(r12, r15, r5, r6)
            if (r12 == 0) goto L_0x00b8
            r4 = r4 | 1
        L_0x00b8:
            int r4 = r4 << r7
            int r12 = r6 + -4
            boolean r12 = r0.x(r15, r12, r5, r6)
            if (r12 == 0) goto L_0x00c3
            r4 = r4 | 1
        L_0x00c3:
            int r4 = r4 << r7
            int r12 = r6 + -3
            boolean r12 = r0.x(r15, r12, r5, r6)
            if (r12 == 0) goto L_0x00ce
            r4 = r4 | 1
        L_0x00ce:
            int r4 = r4 << r7
            int r12 = r6 + -2
            boolean r12 = r0.x(r15, r12, r5, r6)
            if (r12 == 0) goto L_0x00d9
            r4 = r4 | 1
        L_0x00d9:
            int r4 = r4 << r7
            int r12 = r6 + -1
            boolean r18 = r0.x(r15, r12, r5, r6)
            if (r18 == 0) goto L_0x00e4
            r4 = r4 | 1
        L_0x00e4:
            int r4 = r4 << r7
            boolean r12 = r0.x(r7, r12, r5, r6)
            if (r12 == 0) goto L_0x00ed
            r4 = r4 | 1
        L_0x00ed:
            byte r4 = (byte) r4
            r3[r11] = r4
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r21
            r12 = 1
            goto L_0x0232
        L_0x00f9:
            int r7 = r5 + 4
            if (r8 != r7) goto L_0x0173
            r7 = 2
            if (r9 != r7) goto L_0x0173
            r7 = r6 & 7
            if (r7 != 0) goto L_0x0173
            if (r13 != 0) goto L_0x0173
            int r4 = r11 + 1
            int r7 = r5 + -1
            r13 = 0
            boolean r15 = r0.x(r7, r13, r5, r6)
            r13 = 1
            int r15 = r15 << r13
            int r13 = r6 + -1
            boolean r7 = r0.x(r7, r13, r5, r6)
            if (r7 == 0) goto L_0x011b
            r15 = r15 | 1
        L_0x011b:
            r7 = 1
            int r15 = r15 << r7
            int r7 = r6 + -3
            r21 = r4
            r4 = 0
            boolean r20 = r0.x(r4, r7, r5, r6)
            if (r20 == 0) goto L_0x012a
            r15 = r15 | 1
        L_0x012a:
            r4 = 1
            int r15 = r15 << r4
            int r4 = r6 + -2
            r22 = r10
            r10 = 0
            boolean r20 = r0.x(r10, r4, r5, r6)
            if (r20 == 0) goto L_0x0139
            r15 = r15 | 1
        L_0x0139:
            r23 = r12
            r12 = 1
            int r15 = r15 << r12
            boolean r18 = r0.x(r10, r13, r5, r6)
            if (r18 == 0) goto L_0x0145
            r15 = r15 | 1
        L_0x0145:
            int r10 = r15 << 1
            boolean r7 = r0.x(r12, r7, r5, r6)
            if (r7 == 0) goto L_0x014f
            r10 = r10 | 1
        L_0x014f:
            int r7 = r10 << 1
            boolean r4 = r0.x(r12, r4, r5, r6)
            if (r4 == 0) goto L_0x0159
            r7 = r7 | 1
        L_0x0159:
            int r4 = r7 << 1
            boolean r7 = r0.x(r12, r13, r5, r6)
            if (r7 == 0) goto L_0x0163
            r4 = r4 | 1
        L_0x0163:
            byte r4 = (byte) r4
            r3[r11] = r4
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r21
            r10 = r22
            r12 = r23
            r13 = 1
            goto L_0x0232
        L_0x0173:
            r22 = r10
            r23 = r12
            if (r8 != r4) goto L_0x01e2
            if (r9 != 0) goto L_0x01e2
            r7 = r6 & 7
            r10 = 4
            if (r7 != r10) goto L_0x01e2
            if (r14 != 0) goto L_0x01e2
            int r7 = r11 + 1
            int r10 = r5 + -3
            r12 = 0
            boolean r10 = r0.x(r10, r12, r5, r6)
            r14 = 1
            int r10 = r10 << r14
            boolean r4 = r0.x(r4, r12, r5, r6)
            if (r4 == 0) goto L_0x0195
            r10 = r10 | 1
        L_0x0195:
            int r4 = r10 << 1
            int r10 = r5 + -1
            boolean r10 = r0.x(r10, r12, r5, r6)
            if (r10 == 0) goto L_0x01a1
            r4 = r4 | 1
        L_0x01a1:
            int r4 = r4 << r14
            int r10 = r6 + -2
            boolean r10 = r0.x(r12, r10, r5, r6)
            if (r10 == 0) goto L_0x01ac
            r4 = r4 | 1
        L_0x01ac:
            int r4 = r4 << r14
            int r10 = r6 + -1
            boolean r15 = r0.x(r12, r10, r5, r6)
            if (r15 == 0) goto L_0x01b7
            r4 = r4 | 1
        L_0x01b7:
            int r4 = r4 << r14
            boolean r12 = r0.x(r14, r10, r5, r6)
            if (r12 == 0) goto L_0x01c0
            r4 = r4 | 1
        L_0x01c0:
            int r4 = r4 << r14
            r12 = 2
            boolean r15 = r0.x(r12, r10, r5, r6)
            if (r15 == 0) goto L_0x01ca
            r4 = r4 | 1
        L_0x01ca:
            int r4 = r4 << r14
            r12 = 3
            boolean r10 = r0.x(r12, r10, r5, r6)
            if (r10 == 0) goto L_0x01d4
            r4 = r4 | 1
        L_0x01d4:
            byte r4 = (byte) r4
            r3[r11] = r4
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r7
            r10 = r22
            r12 = r23
            r14 = 1
            goto L_0x0232
        L_0x01e2:
            java.lang.Object r4 = r0.f301W
            S3.b r4 = (S3.b) r4
            if (r8 >= r5) goto L_0x01fa
            if (r9 < 0) goto L_0x01fa
            boolean r7 = r4.b(r9, r8)
            if (r7 != 0) goto L_0x01fa
            int r7 = r11 + 1
            int r10 = r0.y(r8, r9, r5, r6)
            byte r10 = (byte) r10
            r3[r11] = r10
            r11 = r7
        L_0x01fa:
            int r7 = r8 + -2
            int r10 = r9 + 2
            if (r7 < 0) goto L_0x0206
            if (r10 < r6) goto L_0x0203
            goto L_0x0206
        L_0x0203:
            r8 = r7
            r9 = r10
            goto L_0x01e2
        L_0x0206:
            int r8 = r8 + -1
            int r9 = r9 + 5
        L_0x020a:
            if (r8 < 0) goto L_0x021e
            if (r9 >= r6) goto L_0x021e
            boolean r7 = r4.b(r9, r8)
            if (r7 != 0) goto L_0x021e
            int r7 = r11 + 1
            int r10 = r0.y(r8, r9, r5, r6)
            byte r10 = (byte) r10
            r3[r11] = r10
            r11 = r7
        L_0x021e:
            int r7 = r8 + 2
            int r10 = r9 + -2
            if (r7 >= r5) goto L_0x022a
            if (r10 >= 0) goto L_0x0227
            goto L_0x022a
        L_0x0227:
            r8 = r7
            r9 = r10
            goto L_0x020a
        L_0x022a:
            int r8 = r8 + 5
            int r9 = r9 + -1
            r10 = r22
            r12 = r23
        L_0x0232:
            if (r8 < r5) goto L_0x06b6
            if (r9 < r6) goto L_0x06b6
            int r0 = r1.f6189g
            if (r11 != r0) goto L_0x06af
            D2.j r0 = r1.f6188f
            java.lang.Object r4 = r0.f1094V
            M0.k[] r4 = (M0.C0123k[]) r4
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x0243:
            if (r6 >= r5) goto L_0x024d
            r8 = r4[r6]
            int r8 = r8.f2964b
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0243
        L_0x024d:
            W3.a[] r5 = new W3.a[r7]
            int r6 = r4.length
            r8 = 0
            r9 = 0
        L_0x0252:
            int r10 = r0.f1093U
            if (r8 >= r6) goto L_0x0279
            r11 = r4[r8]
            r12 = 0
        L_0x0259:
            int r13 = r11.f2964b
            if (r12 >= r13) goto L_0x0274
            int r13 = r11.f2965c
            int r14 = r10 + r13
            int r15 = r9 + 1
            r19 = r0
            W3.a r0 = new W3.a
            byte[] r14 = new byte[r14]
            r0.<init>(r13, r14)
            r5[r9] = r0
            int r12 = r12 + 1
            r9 = r15
            r0 = r19
            goto L_0x0259
        L_0x0274:
            r19 = r0
            int r8 = r8 + 1
            goto L_0x0252
        L_0x0279:
            r0 = 0
            r4 = r5[r0]
            byte[] r0 = r4.f6177b
            int r0 = r0.length
            int r0 = r0 - r10
            int r4 = r0 + -1
            r6 = 0
            r8 = 0
        L_0x0284:
            if (r6 >= r4) goto L_0x029a
            r10 = 0
        L_0x0287:
            if (r10 >= r9) goto L_0x0297
            r11 = r5[r10]
            byte[] r11 = r11.f6177b
            int r12 = r8 + 1
            byte r8 = r3[r8]
            r11[r6] = r8
            int r10 = r10 + 1
            r8 = r12
            goto L_0x0287
        L_0x0297:
            int r6 = r6 + 1
            goto L_0x0284
        L_0x029a:
            r6 = 24
            int r1 = r1.f6184a
            if (r1 != r6) goto L_0x02a2
            r1 = 1
            goto L_0x02a3
        L_0x02a2:
            r1 = 0
        L_0x02a3:
            r6 = 8
            if (r1 == 0) goto L_0x02aa
            r10 = 8
            goto L_0x02ab
        L_0x02aa:
            r10 = r9
        L_0x02ab:
            r11 = 0
        L_0x02ac:
            if (r11 >= r10) goto L_0x02bc
            r12 = r5[r11]
            byte[] r12 = r12.f6177b
            int r13 = r8 + 1
            byte r8 = r3[r8]
            r12[r4] = r8
            int r11 = r11 + 1
            r8 = r13
            goto L_0x02ac
        L_0x02bc:
            r11 = 0
            r4 = r5[r11]
            byte[] r4 = r4.f6177b
            int r4 = r4.length
        L_0x02c2:
            r10 = 7
            if (r0 >= r4) goto L_0x02e8
            r11 = 0
        L_0x02c6:
            if (r11 >= r9) goto L_0x02e5
            if (r1 == 0) goto L_0x02ce
            int r12 = r11 + 8
            int r12 = r12 % r9
            goto L_0x02cf
        L_0x02ce:
            r12 = r11
        L_0x02cf:
            if (r1 == 0) goto L_0x02d6
            if (r12 <= r10) goto L_0x02d6
            int r13 = r0 + -1
            goto L_0x02d7
        L_0x02d6:
            r13 = r0
        L_0x02d7:
            r12 = r5[r12]
            byte[] r12 = r12.f6177b
            int r14 = r8 + 1
            byte r8 = r3[r8]
            r12[r13] = r8
            int r11 = r11 + 1
            r8 = r14
            goto L_0x02c6
        L_0x02e5:
            int r0 = r0 + 1
            goto L_0x02c2
        L_0x02e8:
            if (r8 != r2) goto L_0x06a7
            r0 = 0
            r1 = 0
        L_0x02ec:
            if (r0 >= r7) goto L_0x02f6
            r2 = r5[r0]
            int r2 = r2.f6176a
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L_0x02ec
        L_0x02f6:
            byte[] r0 = new byte[r1]
            r1 = 0
        L_0x02f9:
            if (r1 >= r7) goto L_0x0339
            r2 = r5[r1]
            byte[] r3 = r2.f6177b
            int r2 = r2.f6176a
            int r4 = r3.length
            int[] r8 = new int[r4]
            r9 = 0
        L_0x0305:
            if (r9 >= r4) goto L_0x0310
            byte r11 = r3[r9]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r8[r9] = r11
            int r9 = r9 + 1
            goto L_0x0305
        L_0x0310:
            r15 = r24
            H3.P r4 = r15.f6182a     // Catch:{ b -> 0x0334 }
            int r9 = r3.length     // Catch:{ b -> 0x0334 }
            int r9 = r9 - r2
            r4.w0(r8, r9)     // Catch:{ b -> 0x0334 }
            r4 = 0
        L_0x031a:
            if (r4 >= r2) goto L_0x0324
            r9 = r8[r4]
            byte r9 = (byte) r9
            r3[r4] = r9
            int r4 = r4 + 1
            goto L_0x031a
        L_0x0324:
            r4 = 0
        L_0x0325:
            if (r4 >= r2) goto L_0x0331
            int r8 = r4 * r7
            int r8 = r8 + r1
            byte r9 = r3[r4]
            r0[r8] = r9
            int r4 = r4 + 1
            goto L_0x0325
        L_0x0331:
            int r1 = r1 + 1
            goto L_0x02f9
        L_0x0334:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x0339:
            r15 = r24
            G5.q r1 = new G5.q
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 100
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 0
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 1
            r4.<init>(r5)
            r5 = 2
        L_0x0354:
            r7 = 6
            r8 = 5
            r9 = 29
            r11 = 254(0xfe, float:3.56E-43)
            r12 = 2
            if (r5 != r12) goto L_0x03d8
            r5 = 0
        L_0x035e:
            int r12 = r1.b(r6)
            if (r12 == 0) goto L_0x03d3
            r13 = 128(0x80, float:1.794E-43)
            if (r12 > r13) goto L_0x0375
            if (r5 == 0) goto L_0x036c
            int r12 = r12 + 128
        L_0x036c:
            r5 = 1
            int r12 = r12 - r5
            char r5 = (char) r12
            r2.append(r5)
            r7 = 2
        L_0x0373:
            r12 = 0
            goto L_0x03ce
        L_0x0375:
            r13 = 129(0x81, float:1.81E-43)
            if (r12 != r13) goto L_0x037b
            r7 = 1
            goto L_0x0373
        L_0x037b:
            r13 = 229(0xe5, float:3.21E-43)
            if (r12 > r13) goto L_0x038f
            int r12 = r12 + -130
            r13 = 10
            if (r12 >= r13) goto L_0x038a
            r13 = 48
            r2.append(r13)
        L_0x038a:
            r2.append(r12)
        L_0x038d:
            r12 = 0
            goto L_0x03c1
        L_0x038f:
            java.lang.String r13 = "\u001e\u0004"
            switch(r12) {
                case 230: goto L_0x03cc;
                case 231: goto L_0x03c9;
                case 232: goto L_0x03bd;
                case 233: goto L_0x038d;
                case 234: goto L_0x038d;
                case 235: goto L_0x03ba;
                case 236: goto L_0x03b0;
                case 237: goto L_0x03a6;
                case 238: goto L_0x03a4;
                case 239: goto L_0x03a2;
                case 240: goto L_0x0373;
                case 241: goto L_0x038d;
                default: goto L_0x0394;
            }
        L_0x0394:
            if (r12 != r11) goto L_0x039d
            int r12 = r1.a()
            if (r12 != 0) goto L_0x039d
            goto L_0x038d
        L_0x039d:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x03a2:
            r7 = 4
            goto L_0x0373
        L_0x03a4:
            r7 = 5
            goto L_0x0373
        L_0x03a6:
            java.lang.String r12 = "[)>\u001e06\u001d"
            r2.append(r12)
            r12 = 0
            r3.insert(r12, r13)
            goto L_0x03c1
        L_0x03b0:
            r12 = 0
            java.lang.String r14 = "[)>\u001e05\u001d"
            r2.append(r14)
            r3.insert(r12, r13)
            goto L_0x03c1
        L_0x03ba:
            r12 = 0
            r5 = 1
            goto L_0x03c1
        L_0x03bd:
            r12 = 0
            r2.append(r9)
        L_0x03c1:
            int r13 = r1.a()
            if (r13 > 0) goto L_0x035e
            r7 = 2
            goto L_0x03ce
        L_0x03c9:
            r12 = 0
            r7 = 7
            goto L_0x03ce
        L_0x03cc:
            r12 = 0
            r7 = 3
        L_0x03ce:
            r5 = r7
            r7 = 1
            r10 = 2
            goto L_0x0679
        L_0x03d3:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x03d8:
            r12 = 0
            int r5 = u.C1477r.h(r5)
            r13 = 30
            r14 = 27
            r10 = 40
            r12 = 2
            if (r5 == r12) goto L_0x05c0
            r12 = 32
            r9 = 3
            if (r5 == r9) goto L_0x0504
            r9 = 4
            if (r5 == r9) goto L_0x04a0
            if (r5 == r8) goto L_0x046c
            if (r5 != r7) goto L_0x0467
            int r5 = r1.f1721b
            int r7 = r5 + 1
            int r8 = r1.b(r6)
            int r9 = r5 + 2
            int r7 = W3.b.b(r8, r7)
            if (r7 != 0) goto L_0x0409
            int r5 = r1.a()
            int r7 = r5 / 8
            goto L_0x041e
        L_0x0409:
            r8 = 250(0xfa, float:3.5E-43)
            if (r7 >= r8) goto L_0x040e
            goto L_0x041e
        L_0x040e:
            int r7 = r7 + -249
            int r7 = r7 * 250
            int r8 = r1.b(r6)
            int r5 = r5 + 3
            int r8 = W3.b.b(r8, r9)
            int r7 = r7 + r8
            r9 = r5
        L_0x041e:
            if (r7 < 0) goto L_0x0462
            byte[] r5 = new byte[r7]
            r8 = 0
        L_0x0423:
            if (r8 >= r7) goto L_0x0441
            int r10 = r1.a()
            if (r10 < r6) goto L_0x043c
            int r10 = r1.b(r6)
            int r11 = r9 + 1
            int r9 = W3.b.b(r10, r9)
            byte r9 = (byte) r9
            r5[r8] = r9
            int r8 = r8 + 1
            r9 = r11
            goto L_0x0423
        L_0x043c:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0441:
            r4.add(r5)
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0451 }
            java.lang.String r8 = "ISO8859_1"
            r7.<init>(r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0451 }
            r2.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x0451 }
        L_0x044e:
            r10 = 2
            goto L_0x0677
        L_0x0451:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Platform does not support required encoding: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0462:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0467:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x046c:
            int r5 = r1.a()
            r8 = 16
            if (r5 > r8) goto L_0x0476
            r8 = 4
            goto L_0x049f
        L_0x0476:
            r5 = 0
            r8 = 4
        L_0x0478:
            if (r5 >= r8) goto L_0x0499
            int r9 = r1.b(r7)
            r10 = 31
            if (r9 != r10) goto L_0x048c
            int r5 = r1.f1722c
            int r5 = 8 - r5
            if (r5 == r6) goto L_0x044e
            r1.b(r5)
            goto L_0x049f
        L_0x048c:
            r10 = r9 & 32
            if (r10 != 0) goto L_0x0492
            r9 = r9 | 64
        L_0x0492:
            char r9 = (char) r9
            r2.append(r9)
            int r5 = r5 + 1
            goto L_0x0478
        L_0x0499:
            int r5 = r1.a()
            if (r5 > 0) goto L_0x046c
        L_0x049f:
            goto L_0x044e
        L_0x04a0:
            r5 = 3
            r8 = 4
            int[] r7 = new int[r5]
        L_0x04a4:
            int r9 = r1.a()
            if (r9 != r6) goto L_0x04ab
            goto L_0x0500
        L_0x04ab:
            int r9 = r1.b(r6)
            if (r9 != r11) goto L_0x04b2
            goto L_0x0500
        L_0x04b2:
            int r13 = r1.b(r6)
            W3.b.a(r9, r13, r7)
            r9 = 0
        L_0x04ba:
            if (r9 >= r5) goto L_0x04fa
            r13 = r7[r9]
            if (r13 == 0) goto L_0x04f1
            r14 = 1
            if (r13 == r14) goto L_0x04eb
            r14 = 2
            if (r13 == r14) goto L_0x04e5
            if (r13 == r5) goto L_0x04e1
            r5 = 14
            if (r13 >= r5) goto L_0x04d3
            int r13 = r13 + 44
            char r5 = (char) r13
            r2.append(r5)
            goto L_0x04f6
        L_0x04d3:
            if (r13 >= r10) goto L_0x04dc
            int r13 = r13 + 51
            char r5 = (char) r13
            r2.append(r5)
            goto L_0x04f6
        L_0x04dc:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x04e1:
            r2.append(r12)
            goto L_0x04f6
        L_0x04e5:
            r5 = 62
            r2.append(r5)
            goto L_0x04f6
        L_0x04eb:
            r5 = 42
            r2.append(r5)
            goto L_0x04f6
        L_0x04f1:
            r5 = 13
            r2.append(r5)
        L_0x04f6:
            int r9 = r9 + 1
            r5 = 3
            goto L_0x04ba
        L_0x04fa:
            int r5 = r1.a()
            if (r5 > 0) goto L_0x0502
        L_0x0500:
            goto L_0x044e
        L_0x0502:
            r5 = 3
            goto L_0x04a4
        L_0x0504:
            r5 = 3
            r8 = 4
            int[] r7 = new int[r5]
            r9 = 0
            r16 = 0
        L_0x050b:
            int r8 = r1.a()
            if (r8 != r6) goto L_0x0513
            goto L_0x05b3
        L_0x0513:
            int r8 = r1.b(r6)
            if (r8 != r11) goto L_0x051b
            goto L_0x05b3
        L_0x051b:
            int r11 = r1.b(r6)
            W3.b.a(r8, r11, r7)
            r11 = r16
            r8 = 0
        L_0x0525:
            if (r8 >= r5) goto L_0x05ad
            r6 = r7[r8]
            if (r11 == 0) goto L_0x0584
            r10 = 1
            if (r11 == r10) goto L_0x0576
            r10 = 2
            if (r11 == r10) goto L_0x0552
            if (r11 != r5) goto L_0x054d
            if (r6 >= r12) goto L_0x0548
            char[] r5 = W3.b.e
            char r5 = r5[r6]
            if (r9 == 0) goto L_0x0543
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
        L_0x0541:
            r9 = 0
            goto L_0x0546
        L_0x0543:
            r2.append(r5)
        L_0x0546:
            r11 = 0
            goto L_0x059f
        L_0x0548:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x054d:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0552:
            if (r6 >= r14) goto L_0x0565
            char[] r5 = W3.b.f6181d
            char r5 = r5[r6]
            if (r9 == 0) goto L_0x0561
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            goto L_0x0541
        L_0x0561:
            r2.append(r5)
            goto L_0x0546
        L_0x0565:
            if (r6 == r14) goto L_0x0570
            if (r6 != r13) goto L_0x056b
            r9 = 1
            goto L_0x0546
        L_0x056b:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0570:
            r5 = 29
            r2.append(r5)
            goto L_0x0546
        L_0x0576:
            if (r9 == 0) goto L_0x057f
            int r6 = r6 + 128
            char r5 = (char) r6
            r2.append(r5)
            goto L_0x0541
        L_0x057f:
            char r5 = (char) r6
            r2.append(r5)
            goto L_0x0546
        L_0x0584:
            if (r6 >= r5) goto L_0x058a
            int r5 = r6 + 1
            r11 = r5
            goto L_0x059f
        L_0x058a:
            r5 = 40
            if (r6 >= r5) goto L_0x05a8
            char[] r5 = W3.b.f6180c
            char r5 = r5[r6]
            if (r9 == 0) goto L_0x059c
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            r9 = 0
            goto L_0x059f
        L_0x059c:
            r2.append(r5)
        L_0x059f:
            int r8 = r8 + 1
            r5 = 3
            r6 = 8
            r10 = 40
            goto L_0x0525
        L_0x05a8:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x05ad:
            int r5 = r1.a()
            if (r5 > 0) goto L_0x05b5
        L_0x05b3:
            goto L_0x044e
        L_0x05b5:
            r16 = r11
            r5 = 3
            r6 = 8
            r10 = 40
            r11 = 254(0xfe, float:3.56E-43)
            goto L_0x050b
        L_0x05c0:
            r5 = 3
            int[] r6 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x05c5:
            int r9 = r1.a()
            r10 = 8
            if (r9 != r10) goto L_0x05cf
            goto L_0x044e
        L_0x05cf:
            int r9 = r1.b(r10)
            r11 = 254(0xfe, float:3.56E-43)
            if (r9 != r11) goto L_0x05d9
            goto L_0x044e
        L_0x05d9:
            int r12 = r1.b(r10)
            W3.b.a(r9, r12, r6)
            r9 = r8
            r8 = r7
            r7 = 0
        L_0x05e3:
            if (r7 >= r5) goto L_0x066e
            r12 = r6[r7]
            if (r9 == 0) goto L_0x0645
            r10 = 1
            if (r9 == r10) goto L_0x0634
            r10 = 2
            if (r9 == r10) goto L_0x060a
            if (r9 != r5) goto L_0x0605
            if (r8 == 0) goto L_0x05fb
            int r12 = r12 + 224
            char r5 = (char) r12
            r2.append(r5)
        L_0x05f9:
            r8 = 0
            goto L_0x0601
        L_0x05fb:
            int r12 = r12 + 96
            char r5 = (char) r12
            r2.append(r5)
        L_0x0601:
            r5 = 40
            r9 = 0
            goto L_0x0662
        L_0x0605:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x060a:
            if (r12 >= r14) goto L_0x0621
            char[] r5 = W3.b.f6179b
            char r5 = r5[r12]
            if (r8 == 0) goto L_0x061b
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            r5 = 29
            goto L_0x05f9
        L_0x061b:
            r2.append(r5)
            r5 = 29
            goto L_0x0601
        L_0x0621:
            if (r12 == r14) goto L_0x062e
            if (r12 != r13) goto L_0x0629
            r5 = 29
            r8 = 1
            goto L_0x0601
        L_0x0629:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x062e:
            r5 = 29
            r2.append(r5)
            goto L_0x0601
        L_0x0634:
            r5 = 29
            r10 = 2
            if (r8 == 0) goto L_0x0640
            int r12 = r12 + 128
            char r8 = (char) r12
            r2.append(r8)
            goto L_0x05f9
        L_0x0640:
            char r9 = (char) r12
            r2.append(r9)
            goto L_0x0601
        L_0x0645:
            r10 = 2
            if (r12 >= r5) goto L_0x064d
            int r9 = r12 + 1
            r5 = 40
            goto L_0x0662
        L_0x064d:
            r5 = 40
            if (r12 >= r5) goto L_0x0669
            char[] r17 = W3.b.f6178a
            char r12 = r17[r12]
            if (r8 == 0) goto L_0x065f
            int r12 = r12 + 128
            char r8 = (char) r12
            r2.append(r8)
            r8 = 0
            goto L_0x0662
        L_0x065f:
            r2.append(r12)
        L_0x0662:
            int r7 = r7 + 1
            r5 = 3
            r10 = 8
            goto L_0x05e3
        L_0x0669:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x066e:
            r5 = 40
            r10 = 2
            int r7 = r1.a()
            if (r7 > 0) goto L_0x06a2
        L_0x0677:
            r5 = 2
            r7 = 1
        L_0x0679:
            if (r5 == r7) goto L_0x0687
            int r6 = r1.a()
            if (r6 > 0) goto L_0x0682
            goto L_0x0687
        L_0x0682:
            r6 = 8
            r10 = 7
            goto L_0x0354
        L_0x0687:
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x0690
            r2.append(r3)
        L_0x0690:
            S3.d r1 = new S3.d
            java.lang.String r2 = r2.toString()
            boolean r3 = r4.isEmpty()
            r5 = 0
            if (r3 == 0) goto L_0x069e
            r4 = r5
        L_0x069e:
            r1.<init>(r0, r2, r4, r5)
            return r1
        L_0x06a2:
            r7 = r8
            r8 = r9
            r5 = 3
            goto L_0x05c5
        L_0x06a7:
            r15 = r24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x06af:
            r15 = r24
            M3.d r0 = M3.d.a()
            throw r0
        L_0x06b6:
            r15 = r24
            r4 = 4
            r6 = 0
            r4 = r19
            r7 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.b(S3.b):S3.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[Catch:{ b | d -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S3.d c(S3.b r9, java.util.EnumMap r10) {
        /*
            r8 = this;
            com.bumptech.glide.j r0 = new com.bumptech.glide.j
            r0.<init>((S3.b) r9)
            r9 = 0
            S3.d r9 = r8.d(r0, r10)     // Catch:{ d -> 0x000f, b -> 0x000b }
            return r9
        L_0x000b:
            r1 = move-exception
            r2 = r1
            r1 = r9
            goto L_0x0011
        L_0x000f:
            r1 = move-exception
            r2 = r9
        L_0x0011:
            r0.m()     // Catch:{ b | d -> 0x0052 }
            r0.f9009W = r9     // Catch:{ b | d -> 0x0052 }
            r0.f9010X = r9     // Catch:{ b | d -> 0x0052 }
            r9 = 1
            r0.f9007U = r9     // Catch:{ b | d -> 0x0052 }
            r0.l()     // Catch:{ b | d -> 0x0052 }
            r0.k()     // Catch:{ b | d -> 0x0052 }
            r9 = 0
        L_0x0022:
            java.lang.Object r3 = r0.f9008V     // Catch:{ b | d -> 0x0052 }
            S3.b r3 = (S3.b) r3     // Catch:{ b | d -> 0x0052 }
            int r4 = r3.f4505U     // Catch:{ b | d -> 0x0052 }
            if (r9 >= r4) goto L_0x0046
            int r4 = r9 + 1
            r5 = r4
        L_0x002d:
            int r6 = r3.f4506V     // Catch:{ b | d -> 0x0052 }
            if (r5 >= r6) goto L_0x0044
            boolean r6 = r3.b(r9, r5)     // Catch:{ b | d -> 0x0052 }
            boolean r7 = r3.b(r5, r9)     // Catch:{ b | d -> 0x0052 }
            if (r6 == r7) goto L_0x0041
            r3.a(r5, r9)     // Catch:{ b | d -> 0x0052 }
            r3.a(r9, r5)     // Catch:{ b | d -> 0x0052 }
        L_0x0041:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0044:
            r9 = r4
            goto L_0x0022
        L_0x0046:
            S3.d r9 = r8.d(r0, r10)     // Catch:{ b | d -> 0x0052 }
            j4.e r10 = new j4.e     // Catch:{ b | d -> 0x0052 }
            r10.<init>()     // Catch:{ b | d -> 0x0052 }
            r9.e = r10     // Catch:{ b | d -> 0x0052 }
            return r9
        L_0x0052:
            if (r1 == 0) goto L_0x0056
            throw r1
        L_0x0056:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.c(S3.b, java.util.EnumMap):S3.d");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: S3.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0336 A[Catch:{ IllegalArgumentException -> 0x03bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x034d A[Catch:{ IllegalArgumentException -> 0x03bd }, EDGE_INSN: B:284:0x034d->B:211:0x034d ?: BREAK  
    EDGE_INSN: B:285:0x034d->B:211:0x034d ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03b6 A[LOOP:21: B:112:0x0220->B:242:0x03b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x037b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S3.d d(com.bumptech.glide.j r34, java.util.EnumMap r35) {
        /*
            r33 = this;
            r4 = 2
            r5 = 9
            r6 = 4
            r8 = 1
            j4.f r9 = r34.l()
            j4.c r10 = r34.k()
            int r10 = r10.f12870a
            j4.c r11 = r34.k()
            j4.f r12 = r34.l()
            r13 = 8
            int[] r14 = u.C1477r.k(r13)
            byte r11 = r11.f12871b
            r11 = r14[r11]
            r14 = r34
            java.lang.Object r14 = r14.f9008V
            S3.b r14 = (S3.b) r14
            r15 = 0
            r2 = 0
        L_0x0029:
            int r0 = r14.f4506V
            if (r2 >= r0) goto L_0x003d
            r1 = 0
        L_0x002e:
            if (r1 >= r0) goto L_0x003b
            boolean r18 = j4.C1125b.a(r11, r2, r1)
            if (r18 == 0) goto L_0x0039
            r14.a(r1, r2)
        L_0x0039:
            int r1 = r1 + r8
            goto L_0x002e
        L_0x003b:
            int r2 = r2 + r8
            goto L_0x0029
        L_0x003d:
            int r1 = r12.f12885a
            int r1 = r1 * 4
            int r2 = r1 + 17
            S3.b r11 = new S3.b
            r11.<init>(r2, r2)
            r11.g(r15, r15, r5, r5)
            int r2 = r1 + 9
            r11.g(r2, r15, r13, r5)
            r11.g(r15, r2, r5, r13)
            int[] r2 = r12.f12886b
            int r6 = r2.length
            r13 = 0
        L_0x0057:
            r7 = 5
            if (r13 >= r6) goto L_0x007d
            r20 = r2[r13]
            int r3 = r20 + -2
        L_0x005e:
            if (r15 >= r6) goto L_0x0078
            if (r13 != 0) goto L_0x0068
            if (r15 == 0) goto L_0x0074
            int r5 = r6 + -1
            if (r15 == r5) goto L_0x0074
        L_0x0068:
            int r5 = r6 + -1
            if (r13 != r5) goto L_0x006e
            if (r15 == 0) goto L_0x0074
        L_0x006e:
            r5 = r2[r15]
            int r5 = r5 - r4
            r11.g(r5, r3, r7, r7)
        L_0x0074:
            int r15 = r15 + r8
            r5 = 9
            goto L_0x005e
        L_0x0078:
            int r13 = r13 + r8
            r5 = 9
            r15 = 0
            goto L_0x0057
        L_0x007d:
            r2 = 6
            r3 = 9
            r11.g(r2, r3, r8, r1)
            r11.g(r3, r2, r1, r8)
            int r3 = r12.f12885a
            if (r3 <= r2) goto L_0x0093
            int r1 = r1 + r2
            r3 = 0
            r5 = 3
            r11.g(r1, r3, r5, r2)
            r11.g(r3, r1, r2, r5)
        L_0x0093:
            int r1 = r12.f12888d
            byte[] r3 = new byte[r1]
            int r5 = r0 + -1
            r15 = r5
            r6 = 0
            r12 = 0
            r13 = 0
            r21 = 1
        L_0x009f:
            if (r15 <= 0) goto L_0x0110
            if (r15 != r2) goto L_0x00a7
            r19 = -1
            int r15 = r15 + -1
        L_0x00a7:
            r22 = r13
            r13 = r12
            r12 = r6
            r6 = 0
        L_0x00ac:
            if (r6 >= r0) goto L_0x0102
            if (r21 == 0) goto L_0x00b5
            int r23 = r5 - r6
            r2 = r23
            goto L_0x00b6
        L_0x00b5:
            r2 = r6
        L_0x00b6:
            r24 = r22
            r22 = r13
            r13 = r12
            r12 = 0
        L_0x00bc:
            if (r12 >= r4) goto L_0x00f6
            int r7 = r15 - r12
            boolean r25 = r11.b(r7, r2)
            if (r25 != 0) goto L_0x00ee
            int r4 = r22 + 1
            int r22 = r24 << 1
            boolean r7 = r14.b(r7, r2)
            if (r7 == 0) goto L_0x00d7
            r7 = r22 | 1
            r26 = r0
        L_0x00d4:
            r0 = 8
            goto L_0x00dc
        L_0x00d7:
            r26 = r0
            r7 = r22
            goto L_0x00d4
        L_0x00dc:
            if (r4 != r0) goto L_0x00e9
            int r0 = r13 + 1
            byte r4 = (byte) r7
            r3[r13] = r4
            r13 = r0
            r22 = 0
            r24 = 0
            goto L_0x00f0
        L_0x00e9:
            r22 = r4
            r24 = r7
            goto L_0x00f0
        L_0x00ee:
            r26 = r0
        L_0x00f0:
            int r12 = r12 + r8
            r0 = r26
            r4 = 2
            r7 = 5
            goto L_0x00bc
        L_0x00f6:
            r26 = r0
            int r6 = r6 + r8
            r12 = r13
            r13 = r22
            r22 = r24
            r2 = 6
            r4 = 2
            r7 = 5
            goto L_0x00ac
        L_0x0102:
            r26 = r0
            r21 = r21 ^ 1
            int r15 = r15 + -2
            r6 = r12
            r12 = r13
            r13 = r22
            r2 = 6
            r4 = 2
            r7 = 5
            goto L_0x009f
        L_0x0110:
            if (r6 != r1) goto L_0x03ca
            int r0 = r9.f12888d
            if (r1 != r0) goto L_0x03c2
            int r0 = u.C1477r.h(r10)
            D2.j[] r1 = r9.f12887c
            r0 = r1[r0]
            java.lang.Object r1 = r0.f1094V
            M0.k[] r1 = (M0.C0123k[]) r1
            int r2 = r1.length
            r4 = 0
            r5 = 0
        L_0x0125:
            if (r4 >= r2) goto L_0x012e
            r6 = r1[r4]
            int r6 = r6.f2964b
            int r5 = r5 + r6
            int r4 = r4 + r8
            goto L_0x0125
        L_0x012e:
            W3.a[] r2 = new W3.a[r5]
            int r4 = r1.length
            r6 = 0
            r7 = 0
        L_0x0133:
            int r11 = r0.f1093U
            if (r6 >= r4) goto L_0x0156
            r12 = r1[r6]
            r13 = r7
            r7 = 0
        L_0x013b:
            int r14 = r12.f2964b
            if (r7 >= r14) goto L_0x0153
            int r14 = r12.f2965c
            int r15 = r11 + r14
            int r21 = r13 + 1
            W3.a r8 = new W3.a
            byte[] r15 = new byte[r15]
            r8.<init>(r14, r15)
            r2[r13] = r8
            r8 = 1
            int r7 = r7 + r8
            r13 = r21
            goto L_0x013b
        L_0x0153:
            int r6 = r6 + r8
            r7 = r13
            goto L_0x0133
        L_0x0156:
            r6 = 0
            r0 = r2[r6]
            byte[] r0 = r0.f6177b
            int r0 = r0.length
            int r1 = r5 + -1
        L_0x015e:
            if (r1 < 0) goto L_0x016a
            r4 = r2[r1]
            byte[] r4 = r4.f6177b
            int r4 = r4.length
            if (r4 == r0) goto L_0x016a
            r4 = -1
            int r1 = r1 + r4
            goto L_0x015e
        L_0x016a:
            r4 = -1
            int r1 = r1 + r8
            int r0 = r0 - r11
            r6 = 0
            r11 = 0
        L_0x016f:
            if (r6 >= r0) goto L_0x0185
            r12 = r11
            r11 = 0
        L_0x0173:
            if (r11 >= r7) goto L_0x0182
            r13 = r2[r11]
            byte[] r13 = r13.f6177b
            int r14 = r12 + 1
            byte r12 = r3[r12]
            r13[r6] = r12
            int r11 = r11 + r8
            r12 = r14
            goto L_0x0173
        L_0x0182:
            int r6 = r6 + r8
            r11 = r12
            goto L_0x016f
        L_0x0185:
            r6 = r1
        L_0x0186:
            if (r6 >= r7) goto L_0x0195
            r12 = r2[r6]
            byte[] r12 = r12.f6177b
            int r13 = r11 + 1
            byte r11 = r3[r11]
            r12[r0] = r11
            int r6 = r6 + r8
            r11 = r13
            goto L_0x0186
        L_0x0195:
            r6 = 0
            r12 = r2[r6]
            byte[] r12 = r12.f6177b
            int r12 = r12.length
        L_0x019b:
            if (r0 >= r12) goto L_0x01b8
            r13 = r11
            r11 = 0
        L_0x019f:
            if (r11 >= r7) goto L_0x01b5
            if (r11 >= r1) goto L_0x01a5
            r14 = r0
            goto L_0x01a7
        L_0x01a5:
            int r14 = r0 + 1
        L_0x01a7:
            r15 = r2[r11]
            byte[] r15 = r15.f6177b
            int r19 = r13 + 1
            byte r13 = r3[r13]
            r15[r14] = r13
            int r11 = r11 + r8
            r13 = r19
            goto L_0x019f
        L_0x01b5:
            int r0 = r0 + r8
            r11 = r13
            goto L_0x019b
        L_0x01b8:
            r0 = 0
            r3 = 0
        L_0x01ba:
            if (r3 >= r5) goto L_0x01c3
            r1 = r2[r3]
            int r1 = r1.f6176a
            int r0 = r0 + r1
            int r3 = r3 + r8
            goto L_0x01ba
        L_0x01c3:
            byte[] r0 = new byte[r0]
            r1 = 0
            r3 = 0
        L_0x01c7:
            if (r3 >= r5) goto L_0x0206
            r7 = r2[r3]
            byte[] r8 = r7.f6177b
            int r7 = r7.f6176a
            int r11 = r8.length
            int[] r12 = new int[r11]
            r13 = 0
        L_0x01d3:
            if (r13 >= r11) goto L_0x01de
            byte r14 = r8[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12[r13] = r14
            r14 = 1
            int r13 = r13 + r14
            goto L_0x01d3
        L_0x01de:
            r13 = r33
            H3.P r11 = r13.f6182a     // Catch:{ b -> 0x0201 }
            int r14 = r8.length     // Catch:{ b -> 0x0201 }
            int r14 = r14 - r7
            r11.w0(r12, r14)     // Catch:{ b -> 0x0201 }
            r11 = 0
        L_0x01e8:
            if (r11 >= r7) goto L_0x01f2
            r14 = r12[r11]
            byte r14 = (byte) r14
            r8[r11] = r14
            r14 = 1
            int r11 = r11 + r14
            goto L_0x01e8
        L_0x01f2:
            r14 = 1
            r11 = 0
        L_0x01f4:
            if (r11 >= r7) goto L_0x01ff
            int r12 = r1 + 1
            byte r15 = r8[r11]
            r0[r1] = r15
            int r11 = r11 + r14
            r1 = r12
            goto L_0x01f4
        L_0x01ff:
            int r3 = r3 + r14
            goto L_0x01c7
        L_0x0201:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x0206:
            r13 = r33
            char[] r1 = j4.C1124a.f12867a
            G5.q r1 = new G5.q
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 50
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 1
            r3.<init>(r5)
            r4 = 0
            r5 = -1
            r7 = -1
            r8 = 0
        L_0x0220:
            int r11 = r1.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            j4.d r12 = j4.d.TERMINATOR
            r14 = 7
            r15 = 4
            if (r11 >= r15) goto L_0x022c
        L_0x022a:
            r6 = r12
            goto L_0x026e
        L_0x022c:
            int r11 = r1.b(r15)     // Catch:{ IllegalArgumentException -> 0x03bd }
            if (r11 == 0) goto L_0x022a
            r6 = 1
            if (r11 == r6) goto L_0x026c
            r6 = 2
            if (r11 == r6) goto L_0x0269
            r6 = 3
            if (r11 == r6) goto L_0x0266
            if (r11 == r15) goto L_0x0263
            r6 = 5
            if (r11 == r6) goto L_0x0260
            if (r11 == r14) goto L_0x025d
            r6 = 8
            if (r11 == r6) goto L_0x025a
            r6 = 9
            if (r11 == r6) goto L_0x0257
            r6 = 13
            if (r11 != r6) goto L_0x0251
            j4.d r6 = j4.d.HANZI     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x0251:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x03bd }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x03bd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x0257:
            j4.d r6 = j4.d.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x025a:
            j4.d r6 = j4.d.KANJI     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x025d:
            j4.d r6 = j4.d.ECI     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x0260:
            j4.d r6 = j4.d.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x0263:
            j4.d r6 = j4.d.BYTE     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x0266:
            j4.d r6 = j4.d.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x0269:
            j4.d r6 = j4.d.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x026e
        L_0x026c:
            j4.d r6 = j4.d.NUMERIC     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x026e:
            int[] r11 = r6.f12883U     // Catch:{ IllegalArgumentException -> 0x03bd }
            int r15 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x03bd }
            if (r15 == 0) goto L_0x0375
            r14 = 3
            if (r15 == r14) goto L_0x0357
            r14 = 5
            if (r15 == r14) goto L_0x02fa
            r14 = 7
            if (r15 == r14) goto L_0x02ef
            r14 = 8
            if (r15 == r14) goto L_0x02ef
            int r14 = r9.f12885a
            r24 = r5
            r5 = 9
            if (r15 == r5) goto L_0x02d0
            if (r14 > r5) goto L_0x028f
            r5 = 0
            goto L_0x0296
        L_0x028f:
            r5 = 26
            if (r14 > r5) goto L_0x0295
            r5 = 1
            goto L_0x0296
        L_0x0295:
            r5 = 2
        L_0x0296:
            r5 = r11[r5]     // Catch:{ IllegalArgumentException -> 0x03bd }
            int r5 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            int r11 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x03bd }
            r14 = 1
            if (r11 == r14) goto L_0x02cb
            r14 = 2
            if (r11 == r14) goto L_0x02c6
            r14 = 4
            if (r11 == r14) goto L_0x02b5
            r15 = 6
            if (r11 != r15) goto L_0x02b0
            j4.C1124a.d(r1, r2, r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x02f2
        L_0x02b0:
            M3.d r0 = M3.d.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x02b5:
            r15 = 6
            r26 = r1
            r27 = r2
            r28 = r5
            r29 = r8
            r30 = r3
            r31 = r35
            j4.C1124a.b(r26, r27, r28, r29, r30, r31)     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x02f2
        L_0x02c6:
            r15 = 6
            j4.C1124a.a(r1, r2, r5, r4)     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x02f2
        L_0x02cb:
            r15 = 6
            j4.C1124a.e(r1, r2, r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x02f2
        L_0x02d0:
            r5 = 4
            int r15 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r5 = 9
            if (r14 > r5) goto L_0x02db
            r5 = 0
            goto L_0x02e2
        L_0x02db:
            r5 = 26
            if (r14 > r5) goto L_0x02e1
            r5 = 1
            goto L_0x02e2
        L_0x02e1:
            r5 = 2
        L_0x02e2:
            r5 = r11[r5]     // Catch:{ IllegalArgumentException -> 0x03bd }
            int r5 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r11 = 1
            if (r15 != r11) goto L_0x02f2
            j4.C1124a.c(r1, r2, r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            goto L_0x02f2
        L_0x02ef:
            r24 = r5
            r4 = 1
        L_0x02f2:
            r5 = 8
            r11 = 128(0x80, float:1.794E-43)
            r14 = 192(0xc0, float:2.69E-43)
            goto L_0x0379
        L_0x02fa:
            r24 = r5
            r5 = 8
            int r8 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r11 = 128(0x80, float:1.794E-43)
            r14 = r8 & 128(0x80, float:1.794E-43)
            if (r14 != 0) goto L_0x030d
            r8 = r8 & 127(0x7f, float:1.78E-43)
        L_0x030a:
            r14 = 192(0xc0, float:2.69E-43)
            goto L_0x032e
        L_0x030d:
            r14 = 192(0xc0, float:2.69E-43)
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r11) goto L_0x031c
            int r14 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r8 = r8 & 63
            int r8 = r8 << r5
            r8 = r8 | r14
            goto L_0x030a
        L_0x031c:
            r5 = r8 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            if (r5 != r14) goto L_0x0352
            r5 = 16
            int r15 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r8 = r8 & 31
            int r5 = r8 << 16
            r8 = r5 | r15
        L_0x032e:
            java.util.HashMap r5 = S3.c.f4509W     // Catch:{ IllegalArgumentException -> 0x03bd }
            if (r8 < 0) goto L_0x034d
            r5 = 900(0x384, float:1.261E-42)
            if (r8 >= r5) goto L_0x034d
            java.util.HashMap r5 = S3.c.f4509W     // Catch:{ IllegalArgumentException -> 0x03bd }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x03bd }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r8 = r5
            S3.c r8 = (S3.c) r8     // Catch:{ IllegalArgumentException -> 0x03bd }
            if (r8 == 0) goto L_0x0348
            r5 = 8
            goto L_0x0379
        L_0x0348:
            M3.d r0 = M3.d.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x034d:
            M3.d r0 = M3.d.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x0352:
            M3.d r0 = M3.d.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x0357:
            r11 = 128(0x80, float:1.794E-43)
            r14 = 192(0xc0, float:2.69E-43)
            int r5 = r1.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            r7 = 16
            if (r5 < r7) goto L_0x0370
            r5 = 8
            int r7 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            int r15 = r1.b(r5)     // Catch:{ IllegalArgumentException -> 0x03bd }
            r24 = r15
            goto L_0x0379
        L_0x0370:
            M3.d r0 = M3.d.a()     // Catch:{ IllegalArgumentException -> 0x03bd }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03bd }
        L_0x0375:
            r24 = r5
            goto L_0x02f2
        L_0x0379:
            if (r6 != r12) goto L_0x03b6
            S3.d r1 = new S3.d
            java.lang.String r28 = r2.toString()
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x038b
            r6 = 1
            r29 = 0
            goto L_0x038e
        L_0x038b:
            r29 = r3
            r6 = 1
        L_0x038e:
            if (r10 == r6) goto L_0x03a7
            r12 = 2
            if (r10 == r12) goto L_0x03a4
            r15 = 3
            if (r10 == r15) goto L_0x03a1
            r2 = 4
            if (r10 != r2) goto L_0x039e
            java.lang.String r2 = "H"
        L_0x039b:
            r30 = r2
            goto L_0x03aa
        L_0x039e:
            r16 = 0
            throw r16
        L_0x03a1:
            java.lang.String r2 = "Q"
            goto L_0x039b
        L_0x03a4:
            java.lang.String r2 = "M"
            goto L_0x039b
        L_0x03a7:
            java.lang.String r2 = "L"
            goto L_0x039b
        L_0x03aa:
            r26 = r1
            r27 = r0
            r31 = r7
            r32 = r24
            r26.<init>(r27, r28, r29, r30, r31, r32)
            return r1
        L_0x03b6:
            r16 = 0
            r5 = r24
            r6 = 0
            goto L_0x0220
        L_0x03bd:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x03c2:
            r13 = r33
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x03ca:
            r13 = r33
            M3.d r0 = M3.d.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.d(com.bumptech.glide.j, java.util.EnumMap):S3.d");
    }
}
