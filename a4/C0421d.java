package a4;

import M3.b;

/* renamed from: a4.d  reason: case insensitive filesystem */
public final class C0421d extends C0425h {

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f7190c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7191d;
    public static final int e;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f7192a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final int[] f7193b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f7191d = iArr;
        e = iArr[47];
    }

    public static void h(CharSequence charSequence, int i, int i8) {
        int i9 = 0;
        int i10 = 1;
        for (int i11 = i - 1; i11 >= 0; i11--) {
            i9 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i11)) * i10;
            i10++;
            if (i10 > i8) {
                i10 = 1;
            }
        }
        if (charSequence.charAt(i) != f7190c[i9 % 47]) {
            throw b.a();
        }
    }

    public static int i(int[] iArr) {
        int i = 0;
        for (int i8 : iArr) {
            i += i8;
        }
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int round = Math.round((((float) iArr[i10]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i10 & 1) == 0) {
                for (int i11 = 0; i11 < round; i11++) {
                    i9 = (i9 << 1) | 1;
                }
            } else {
                i9 <<= round;
            }
        }
        return i9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x018f, code lost:
        throw M3.h.f3144W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0192, code lost:
        throw M3.h.f3144W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r10 = f7190c[r11];
        r9.append(r10);
        r11 = r8.length;
        r13 = r7;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r12 >= r11) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r13 = r13 + r8[r12];
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r11 = r1.b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r10 != '*') goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r9.deleteCharAt(r9.length() - 1);
        r10 = r8.length;
        r12 = 0;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r12 >= r10) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r13 = r13 + r8[r12];
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        if (r11 == r1.f4504V) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r1.a(r11) == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r9.length() < r4) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        r1 = r9.length();
        h(r9, r1 - 2, 20);
        h(r9, r1 - 1, 15);
        r9.setLength(r9.length() - r4);
        r1 = r9.length();
        r8 = new java.lang.StringBuilder(r1);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b9, code lost:
        if (r10 >= r1) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        r11 = r9.charAt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r11 < 'a') goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        if (r11 > 'd') goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        if (r10 >= (r1 - 1)) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        r10 = r10 + 1;
        r12 = r9.charAt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        switch(r11) {
            case 97: goto L_0x0144;
            case 98: goto L_0x00fb;
            case 99: goto L_0x00ea;
            case com.samsung.android.knox.restriction.PhoneRestrictionPolicy.ERROR_SIM_PIN_UNKNOWN :int: goto L_0x00dc;
            default: goto L_0x00d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        if (r12 < 'A') goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        if (r12 > 'Z') goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        r12 = r12 + ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        r4 = (char) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        throw M3.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        if (r12 < 'A') goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        if (r12 > 'O') goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ee, code lost:
        r12 = r12 - ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (r12 != 'Z') goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        r4 = ':';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fa, code lost:
        throw M3.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        if (r12 < 'A') goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        if (r12 > 'E') goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0101, code lost:
        r12 = r12 - '&';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        if (r12 < 'F') goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        if (r12 > 'J') goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        r12 = r12 - 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0111, code lost:
        if (r12 < 'K') goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0113, code lost:
        if (r12 > 'O') goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0115, code lost:
        r12 = r12 + 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011a, code lost:
        if (r12 < 'P') goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011e, code lost:
        if (r12 > 'T') goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0120, code lost:
        r12 = r12 + '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0125, code lost:
        if (r12 != 'U') goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r12 != 'V') goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        r4 = '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0131, code lost:
        if (r12 != 'W') goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0133, code lost:
        r4 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0138, code lost:
        if (r12 < 'X') goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013a, code lost:
        if (r12 > 'Z') goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013c, code lost:
        r4 = 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0143, code lost:
        throw M3.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0144, code lost:
        if (r12 < 'A') goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0146, code lost:
        if (r12 > 'Z') goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0148, code lost:
        r12 = r12 - '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x014a, code lost:
        r8.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0152, code lost:
        throw M3.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0157, code lost:
        throw M3.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0158, code lost:
        r8.append(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x015b, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x015f, code lost:
        r1 = r8.toString();
        r8 = (float) r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018c, code lost:
        return new M3.l(r1, (byte[]) null, new M3.n[]{new M3.n(((float) (r6[1] + r6[0])) / 2.0f, r8), new M3.n((((float) r13) / 2.0f) + ((float) r7), r8)}, M3.a.f3109X);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l c(int r17, S3.a r18, java.util.Map r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 64
            r3 = 0
            r4 = 2
            r5 = 1
            int r6 = r1.f4504V
            int r7 = r1.b(r3)
            int[] r8 = r0.f7193b
            java.util.Arrays.fill(r8, r3)
            int r9 = r8.length
            r10 = r7
            r11 = 0
            r12 = 0
        L_0x0018:
            if (r7 >= r6) goto L_0x01c4
            boolean r13 = r1.a(r7)
            if (r13 == r11) goto L_0x002a
            r13 = r8[r12]
            int r13 = r13 + r5
            r8[r12] = r13
            r13 = r17
            r14 = 2
            goto L_0x01c0
        L_0x002a:
            int r13 = r9 + -1
            if (r12 != r13) goto L_0x01b9
            int r13 = i(r8)
            int r14 = e
            if (r13 != r14) goto L_0x01a4
            int[] r6 = new int[]{r10, r7}
            r7 = r6[r5]
            int r7 = r1.b(r7)
            java.util.Arrays.fill(r8, r3)
            java.lang.StringBuilder r9 = r0.f7192a
            r9.setLength(r3)
        L_0x0048:
            a4.C0425h.f(r7, r1, r8)
            int r10 = i(r8)
            if (r10 < 0) goto L_0x01a1
            r11 = 0
        L_0x0052:
            int[] r12 = f7191d
            int r13 = r12.length
            if (r11 >= r13) goto L_0x019e
            r12 = r12[r11]
            if (r12 != r10) goto L_0x0198
            char[] r10 = f7190c
            char r10 = r10[r11]
            r9.append(r10)
            int r11 = r8.length
            r13 = r7
            r12 = 0
        L_0x0065:
            if (r12 >= r11) goto L_0x006c
            r14 = r8[r12]
            int r13 = r13 + r14
            int r12 = r12 + r5
            goto L_0x0065
        L_0x006c:
            int r11 = r1.b(r13)
            r12 = 42
            if (r10 != r12) goto L_0x0193
            int r10 = r9.length()
            int r10 = r10 - r5
            r9.deleteCharAt(r10)
            int r10 = r8.length
            r12 = 0
            r13 = 0
        L_0x007f:
            if (r12 >= r10) goto L_0x0086
            r14 = r8[r12]
            int r13 = r13 + r14
            int r12 = r12 + r5
            goto L_0x007f
        L_0x0086:
            int r8 = r1.f4504V
            if (r11 == r8) goto L_0x0190
            boolean r1 = r1.a(r11)
            if (r1 == 0) goto L_0x0190
            int r1 = r9.length()
            if (r1 < r4) goto L_0x018d
            int r1 = r9.length()
            int r8 = r1 + -2
            r10 = 20
            h(r9, r8, r10)
            int r1 = r1 - r5
            r8 = 15
            h(r9, r1, r8)
            int r1 = r9.length()
            int r1 = r1 - r4
            r9.setLength(r1)
            int r1 = r9.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            r10 = 0
        L_0x00b9:
            if (r10 >= r1) goto L_0x015f
            char r11 = r9.charAt(r10)
            r12 = 97
            if (r11 < r12) goto L_0x0158
            r12 = 100
            if (r11 > r12) goto L_0x0158
            int r12 = r1 + -1
            if (r10 >= r12) goto L_0x0153
            int r10 = r10 + r5
            char r12 = r9.charAt(r10)
            r14 = 79
            r15 = 90
            r4 = 65
            switch(r11) {
                case 97: goto L_0x0144;
                case 98: goto L_0x00fb;
                case 99: goto L_0x00ea;
                case 100: goto L_0x00dc;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            r4 = 0
            goto L_0x014a
        L_0x00dc:
            if (r12 < r4) goto L_0x00e5
            if (r12 > r15) goto L_0x00e5
            int r12 = r12 + 32
        L_0x00e2:
            char r4 = (char) r12
            goto L_0x014a
        L_0x00e5:
            M3.d r1 = M3.d.a()
            throw r1
        L_0x00ea:
            if (r12 < r4) goto L_0x00f1
            if (r12 > r14) goto L_0x00f1
            int r12 = r12 + -32
            goto L_0x00e2
        L_0x00f1:
            if (r12 != r15) goto L_0x00f6
            r4 = 58
            goto L_0x014a
        L_0x00f6:
            M3.d r1 = M3.d.a()
            throw r1
        L_0x00fb:
            if (r12 < r4) goto L_0x0104
            r4 = 69
            if (r12 > r4) goto L_0x0104
            int r12 = r12 + -38
            goto L_0x00e2
        L_0x0104:
            r4 = 70
            if (r12 < r4) goto L_0x010f
            r4 = 74
            if (r12 > r4) goto L_0x010f
            int r12 = r12 + -11
            goto L_0x00e2
        L_0x010f:
            r4 = 75
            if (r12 < r4) goto L_0x0118
            if (r12 > r14) goto L_0x0118
            int r12 = r12 + 16
            goto L_0x00e2
        L_0x0118:
            r4 = 80
            if (r12 < r4) goto L_0x0123
            r4 = 84
            if (r12 > r4) goto L_0x0123
            int r12 = r12 + 43
            goto L_0x00e2
        L_0x0123:
            r4 = 85
            if (r12 != r4) goto L_0x0128
            goto L_0x00d9
        L_0x0128:
            r4 = 86
            if (r12 != r4) goto L_0x012f
            r4 = 64
            goto L_0x014a
        L_0x012f:
            r4 = 87
            if (r12 != r4) goto L_0x0136
            r4 = 96
            goto L_0x014a
        L_0x0136:
            r4 = 88
            if (r12 < r4) goto L_0x013f
            if (r12 > r15) goto L_0x013f
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x014a
        L_0x013f:
            M3.d r1 = M3.d.a()
            throw r1
        L_0x0144:
            if (r12 < r4) goto L_0x014e
            if (r12 > r15) goto L_0x014e
            int r12 = r12 - r2
            goto L_0x00e2
        L_0x014a:
            r8.append(r4)
            goto L_0x015b
        L_0x014e:
            M3.d r1 = M3.d.a()
            throw r1
        L_0x0153:
            M3.d r1 = M3.d.a()
            throw r1
        L_0x0158:
            r8.append(r11)
        L_0x015b:
            int r10 = r10 + r5
            r4 = 2
            goto L_0x00b9
        L_0x015f:
            java.lang.String r1 = r8.toString()
            r2 = r6[r5]
            r4 = r6[r3]
            int r2 = r2 + r4
            float r2 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r6 = (float) r7
            float r7 = (float) r13
            float r7 = r7 / r4
            float r7 = r7 + r6
            M3.l r4 = new M3.l
            M3.n r6 = new M3.n
            r13 = r17
            float r8 = (float) r13
            r6.<init>(r2, r8)
            M3.n r2 = new M3.n
            r2.<init>(r7, r8)
            r7 = 2
            M3.n[] r7 = new M3.n[r7]
            r7[r3] = r6
            r7[r5] = r2
            M3.a r2 = M3.a.f3109X
            r3 = 0
            r4.<init>(r1, r3, r7, r2)
            return r4
        L_0x018d:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0190:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0193:
            r13 = r17
            r7 = r11
            goto L_0x0048
        L_0x0198:
            r13 = r17
            int r11 = r11 + r5
            r4 = 2
            goto L_0x0052
        L_0x019e:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x01a1:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x01a4:
            r13 = r17
            r4 = r8[r3]
            r14 = r8[r5]
            int r4 = r4 + r14
            int r10 = r10 + r4
            int r4 = r12 + -1
            r14 = 2
            java.lang.System.arraycopy(r8, r14, r8, r3, r4)
            r8[r4] = r3
            r8[r12] = r3
            int r12 = r12 + -1
            goto L_0x01bd
        L_0x01b9:
            r13 = r17
            r14 = 2
            int r12 = r12 + r5
        L_0x01bd:
            r8[r12] = r5
            r11 = r11 ^ r5
        L_0x01c0:
            int r7 = r7 + r5
            r4 = 2
            goto L_0x0018
        L_0x01c4:
            M3.h r1 = M3.h.f3144W
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0421d.c(int, S3.a, java.util.Map):M3.l");
    }
}
