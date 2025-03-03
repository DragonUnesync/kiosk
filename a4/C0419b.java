package a4;

/* renamed from: a4.b  reason: case insensitive filesystem */
public final class C0419b extends C0425h {

    /* renamed from: a  reason: collision with root package name */
    public static final int[][] f7185a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019a, code lost:
        r11 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a5, code lost:
        if (r4 != false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01bc, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e7, code lost:
        if (r19 == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e9, code lost:
        if (r11 != 'e') goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01eb, code lost:
        r11 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ee, code lost:
        r11 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f0, code lost:
        r19 = r5;
        r14 = r10;
        r10 = r22;
        r3 = 0.7f;
        r5 = 1;
        r22 = r20;
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        r4 = false;
        r5 = false;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0152, code lost:
        if (r4 != false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0154, code lost:
        r4 = false;
        r5 = false;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0158, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015b, code lost:
        r11 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015e, code lost:
        r5 = false;
        r11 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0164, code lost:
        r18 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x025d A[LOOP:5: B:151:0x025b->B:152:0x025d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l c(int r26, S3.a r27, java.util.Map r28) {
        /*
            r25 = this;
            r0 = r27
            r1 = r28
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0013
            M3.c r7 = M3.c.f3131b0
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            int r7 = r0.f4504V
            int r8 = r0.b(r6)
            r9 = 6
            int[] r10 = new int[r9]
            r11 = r8
            r12 = 0
            r13 = 0
        L_0x0020:
            if (r8 >= r7) goto L_0x02c3
            boolean r14 = r0.a(r8)
            if (r14 == r12) goto L_0x0036
            r14 = r10[r13]
            int r14 = r14 + r5
            r10[r13] = r14
            r9 = r26
            r2 = 0
            r3 = 64
            r4 = -1
            r6 = 2
            goto L_0x02bd
        L_0x0036:
            r14 = 5
            if (r13 != r14) goto L_0x02b2
            r2 = -1
            r15 = 103(0x67, float:1.44E-43)
            r16 = 1048576000(0x3e800000, float:0.25)
        L_0x003e:
            int[][] r17 = f7185a
            r14 = 105(0x69, float:1.47E-43)
            r3 = 1060320051(0x3f333333, float:0.7)
            if (r15 > r14) goto L_0x0056
            r14 = r17[r15]
            float r3 = a4.C0425h.e(r10, r14, r3)
            int r14 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0054
            r16 = r3
            r2 = r15
        L_0x0054:
            int r15 = r15 + r5
            goto L_0x003e
        L_0x0056:
            if (r2 < 0) goto L_0x0299
            int r14 = r8 - r11
            int r14 = r14 / r4
            int r14 = r11 - r14
            int r14 = java.lang.Math.max(r6, r14)
            boolean r14 = r0.d(r14, r11)
            if (r14 == 0) goto L_0x0299
            int[] r2 = new int[]{r11, r8, r2}
            r7 = r2[r4]
            java.util.ArrayList r8 = new java.util.ArrayList
            r10 = 20
            r8.<init>(r10)
            byte r11 = (byte) r7
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            r8.add(r11)
            switch(r7) {
                case 103: goto L_0x008a;
                case 104: goto L_0x0087;
                case 105: goto L_0x0084;
                default: goto L_0x007f;
            }
        L_0x007f:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0084:
            r14 = 99
            goto L_0x008c
        L_0x0087:
            r14 = 100
            goto L_0x008c
        L_0x008a:
            r14 = 101(0x65, float:1.42E-43)
        L_0x008c:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r10)
            r10 = r2[r6]
            r16 = r2[r5]
            int[] r6 = new int[r9]
            r11 = r14
            r4 = 0
            r12 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r14 = r10
            r10 = r16
        L_0x00a9:
            if (r18 != 0) goto L_0x0208
            a4.C0425h.f(r10, r0, r6)
            r13 = -1
            r14 = 0
            r22 = 1048576000(0x3e800000, float:0.25)
        L_0x00b2:
            r9 = 107(0x6b, float:1.5E-43)
            if (r14 >= r9) goto L_0x00c5
            r9 = r17[r14]
            float r9 = a4.C0425h.e(r6, r9, r3)
            int r24 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r24 >= 0) goto L_0x00c3
            r22 = r9
            r13 = r14
        L_0x00c3:
            int r14 = r14 + r5
            goto L_0x00b2
        L_0x00c5:
            if (r13 < 0) goto L_0x0205
            byte r9 = (byte) r13
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r8.add(r9)
            r9 = 106(0x6a, float:1.49E-43)
            if (r13 == r9) goto L_0x00d5
            r23 = 1
        L_0x00d5:
            if (r13 == r9) goto L_0x00dd
            int r21 = r21 + 1
            int r14 = r21 * r13
            int r14 = r14 + r7
            r7 = r14
        L_0x00dd:
            r22 = r10
            r3 = 6
            r14 = 0
        L_0x00e1:
            if (r14 >= r3) goto L_0x00e9
            r24 = r6[r14]
            int r22 = r22 + r24
            int r14 = r14 + r5
            goto L_0x00e1
        L_0x00e9:
            switch(r13) {
                case 103: goto L_0x0200;
                case 104: goto L_0x0200;
                case 105: goto L_0x0200;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            r14 = 96
            java.lang.String r5 = "]C1"
            switch(r11) {
                case 99: goto L_0x01aa;
                case 100: goto L_0x0167;
                case 101: goto L_0x00f9;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            r3 = 64
            r14 = 100
            goto L_0x01bc
        L_0x00f9:
            r3 = 64
            if (r13 >= r3) goto L_0x0114
            if (r4 != r12) goto L_0x0106
            int r3 = r13 + 32
            char r3 = (char) r3
            r15.append(r3)
            goto L_0x010c
        L_0x0106:
            int r3 = r13 + 160
            char r3 = (char) r3
            r15.append(r3)
        L_0x010c:
            r3 = 64
        L_0x010e:
            r4 = 0
        L_0x010f:
            r5 = 0
        L_0x0110:
            r14 = 100
            goto L_0x01e5
        L_0x0114:
            if (r13 >= r14) goto L_0x012a
            if (r4 != r12) goto L_0x0121
            r3 = 64
            int r4 = r13 + -64
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x010e
        L_0x0121:
            r3 = 64
            int r4 = r13 + 64
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x010e
        L_0x012a:
            r3 = 64
            if (r13 == r9) goto L_0x0130
            r23 = 0
        L_0x0130:
            if (r13 == r9) goto L_0x0164
            switch(r13) {
                case 96: goto L_0x010f;
                case 97: goto L_0x010f;
                case 98: goto L_0x0162;
                case 99: goto L_0x015e;
                case 100: goto L_0x015a;
                case 101: goto L_0x0148;
                case 102: goto L_0x0136;
                default: goto L_0x0135;
            }
        L_0x0135:
            goto L_0x010f
        L_0x0136:
            if (r1 == 0) goto L_0x010f
            int r9 = r15.length()
            if (r9 != 0) goto L_0x0142
            r15.append(r5)
            goto L_0x010f
        L_0x0142:
            r5 = 29
            r15.append(r5)
            goto L_0x010f
        L_0x0148:
            if (r12 != 0) goto L_0x0150
            if (r4 == 0) goto L_0x0150
        L_0x014c:
            r4 = 0
            r5 = 0
            r12 = 1
            goto L_0x0110
        L_0x0150:
            if (r12 == 0) goto L_0x0158
            if (r4 == 0) goto L_0x0158
        L_0x0154:
            r4 = 0
            r5 = 0
            r12 = 0
            goto L_0x0110
        L_0x0158:
            r4 = 1
            goto L_0x010f
        L_0x015a:
            r5 = 0
        L_0x015b:
            r11 = 100
            goto L_0x0110
        L_0x015e:
            r5 = 0
            r11 = 99
            goto L_0x0110
        L_0x0162:
            r5 = 1
            goto L_0x015b
        L_0x0164:
            r18 = 1
            goto L_0x010f
        L_0x0167:
            r3 = 64
            if (r13 >= r14) goto L_0x017b
            if (r4 != r12) goto L_0x0174
            int r4 = r13 + 32
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x010e
        L_0x0174:
            int r4 = r13 + 160
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x010e
        L_0x017b:
            if (r13 == r9) goto L_0x017f
            r23 = 0
        L_0x017f:
            if (r13 == r9) goto L_0x0164
            switch(r13) {
                case 96: goto L_0x010f;
                case 97: goto L_0x010f;
                case 98: goto L_0x01a8;
                case 99: goto L_0x015e;
                case 100: goto L_0x019e;
                case 101: goto L_0x0199;
                case 102: goto L_0x0185;
                default: goto L_0x0184;
            }
        L_0x0184:
            goto L_0x010f
        L_0x0185:
            if (r1 == 0) goto L_0x010f
            int r9 = r15.length()
            if (r9 != 0) goto L_0x0192
            r15.append(r5)
            goto L_0x010f
        L_0x0192:
            r5 = 29
            r15.append(r5)
            goto L_0x010f
        L_0x0199:
            r5 = 0
        L_0x019a:
            r11 = 101(0x65, float:1.42E-43)
            goto L_0x0110
        L_0x019e:
            if (r12 != 0) goto L_0x01a3
            if (r4 == 0) goto L_0x01a3
            goto L_0x014c
        L_0x01a3:
            if (r12 == 0) goto L_0x0158
            if (r4 == 0) goto L_0x0158
            goto L_0x0154
        L_0x01a8:
            r5 = 1
            goto L_0x019a
        L_0x01aa:
            r3 = 64
            r14 = 100
            if (r13 >= r14) goto L_0x01be
            r5 = 10
            if (r13 >= r5) goto L_0x01b9
            r5 = 48
            r15.append(r5)
        L_0x01b9:
            r15.append(r13)
        L_0x01bc:
            r5 = 0
            goto L_0x01e5
        L_0x01be:
            if (r13 == r9) goto L_0x01c2
            r23 = 0
        L_0x01c2:
            if (r13 == r9) goto L_0x01e2
            switch(r13) {
                case 100: goto L_0x01de;
                case 101: goto L_0x01da;
                case 102: goto L_0x01c8;
                default: goto L_0x01c7;
            }
        L_0x01c7:
            goto L_0x01bc
        L_0x01c8:
            if (r1 == 0) goto L_0x01bc
            int r9 = r15.length()
            if (r9 != 0) goto L_0x01d4
            r15.append(r5)
            goto L_0x01bc
        L_0x01d4:
            r5 = 29
            r15.append(r5)
            goto L_0x01bc
        L_0x01da:
            r5 = 0
            r11 = 101(0x65, float:1.42E-43)
            goto L_0x01e5
        L_0x01de:
            r5 = 0
            r11 = 100
            goto L_0x01e5
        L_0x01e2:
            r5 = 0
            r18 = 1
        L_0x01e5:
            r9 = 101(0x65, float:1.42E-43)
            if (r19 == 0) goto L_0x01f0
            if (r11 != r9) goto L_0x01ee
            r11 = 100
            goto L_0x01f0
        L_0x01ee:
            r11 = 101(0x65, float:1.42E-43)
        L_0x01f0:
            r19 = r5
            r14 = r10
            r10 = r22
            r3 = 1060320051(0x3f333333, float:0.7)
            r5 = 1
            r9 = 6
            r22 = r20
            r20 = r13
            goto L_0x00a9
        L_0x0200:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0205:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x0208:
            int r1 = r10 - r14
            int r3 = r0.c(r10)
            int r4 = r3 - r14
            r5 = 2
            int r4 = r4 / r5
            int r4 = r4 + r3
            int r5 = r0.f4504V
            int r4 = java.lang.Math.min(r5, r4)
            boolean r0 = r0.d(r3, r4)
            if (r0 == 0) goto L_0x0296
            r0 = r22
            int r21 = r21 * r0
            int r7 = r7 - r21
            r3 = 103(0x67, float:1.44E-43)
            int r7 = r7 % r3
            if (r7 != r0) goto L_0x0291
            int r0 = r15.length()
            if (r0 == 0) goto L_0x028e
            if (r0 <= 0) goto L_0x023e
            if (r23 == 0) goto L_0x023e
            r3 = 99
            if (r11 != r3) goto L_0x0240
            r3 = 2
            int r4 = r0 + -2
            r15.delete(r4, r0)
        L_0x023e:
            r3 = 1
            goto L_0x0246
        L_0x0240:
            r3 = 1
            int r4 = r0 + -1
            r15.delete(r4, r0)
        L_0x0246:
            r0 = r2[r3]
            r3 = 0
            r2 = r2[r3]
            int r0 = r0 + r2
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r14
            float r1 = (float) r1
            float r1 = r1 / r2
            float r1 = r1 + r3
            int r2 = r8.size()
            byte[] r3 = new byte[r2]
            r4 = 0
        L_0x025b:
            if (r4 >= r2) goto L_0x026c
            java.lang.Object r5 = r8.get(r4)
            java.lang.Byte r5 = (java.lang.Byte) r5
            byte r5 = r5.byteValue()
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x025b
        L_0x026c:
            r5 = 1
            M3.l r2 = new M3.l
            java.lang.String r4 = r15.toString()
            M3.n r6 = new M3.n
            r9 = r26
            float r7 = (float) r9
            r6.<init>(r0, r7)
            M3.n r0 = new M3.n
            r0.<init>(r1, r7)
            r1 = 2
            M3.n[] r1 = new M3.n[r1]
            r7 = 0
            r1[r7] = r6
            r1[r5] = r0
            M3.a r0 = M3.a.f3110Y
            r2.<init>(r4, r3, r1, r0)
            return r2
        L_0x028e:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x0291:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x0296:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x0299:
            r9 = r26
            r3 = 64
            r2 = 0
            r4 = r10[r2]
            r5 = 1
            r6 = r10[r5]
            int r4 = r4 + r6
            int r11 = r11 + r4
            int r4 = r13 + -1
            r6 = 2
            java.lang.System.arraycopy(r10, r6, r10, r2, r4)
            r10[r4] = r2
            r10[r13] = r2
            r4 = -1
            int r13 = r13 + r4
            goto L_0x02ba
        L_0x02b2:
            r9 = r26
            r2 = 0
            r3 = 64
            r4 = -1
            r6 = 2
            int r13 = r13 + r5
        L_0x02ba:
            r10[r13] = r5
            r12 = r12 ^ r5
        L_0x02bd:
            int r8 = r8 + r5
            r4 = 2
            r6 = 0
            r9 = 6
            goto L_0x0020
        L_0x02c3:
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0419b.c(int, S3.a, java.util.Map):M3.l");
    }
}
