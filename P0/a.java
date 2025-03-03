package P0;

import java.util.Locale;
import java.util.regex.Pattern;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3688a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f3689b = {"", "A", "B", "C"};

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3690c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9)});
    }

    public static String b(int i, boolean z, int i8, int i9, int[] iArr, int i10) {
        char c8;
        String str = f3689b[i];
        Integer valueOf = Integer.valueOf(i8);
        Integer valueOf2 = Integer.valueOf(i9);
        if (z) {
            c8 = 'H';
        } else {
            c8 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c8), Integer.valueOf(i10)};
        int i11 = z.f3748a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i12])}));
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018d, code lost:
        if (r13.equals("H90") == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair c(java.lang.String r12, java.lang.String[] r13, M0.C0121i r14) {
        /*
            r0 = 16
            r1 = 8
            r2 = 3
            r3 = 6
            r4 = 2
            r5 = 1
            int r6 = r13.length
            java.lang.String r7 = "Ignoring malformed HEVC codec string: "
            java.lang.String r8 = "CodecSpecificDataUtil"
            r9 = 0
            r10 = 4
            if (r6 >= r10) goto L_0x0015
            N.e.H(r7, r12, r8)
            return r9
        L_0x0015:
            java.util.regex.Pattern r6 = f3690c
            r11 = r13[r5]
            java.util.regex.Matcher r6 = r6.matcher(r11)
            boolean r11 = r6.matches()
            if (r11 != 0) goto L_0x0027
            N.e.H(r7, r12, r8)
            return r9
        L_0x0027:
            java.lang.String r12 = r6.group(r5)
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r12)
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0037
            r12 = 1
            goto L_0x0053
        L_0x0037:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x004a
            if (r14 == 0) goto L_0x0048
            int r12 = r14.f2959c
            if (r12 != r3) goto L_0x0048
            r12 = 4096(0x1000, float:5.74E-42)
            goto L_0x0053
        L_0x0048:
            r12 = 2
            goto L_0x0053
        L_0x004a:
            java.lang.String r14 = "6"
            boolean r14 = r14.equals(r12)
            if (r14 == 0) goto L_0x027f
            r12 = 6
        L_0x0053:
            r13 = r13[r2]
            if (r13 != 0) goto L_0x005a
        L_0x0057:
            r14 = r9
            goto L_0x026d
        L_0x005a:
            r14 = -1
            int r6 = r13.hashCode()
            switch(r6) {
                case 70821: goto L_0x01a9;
                case 70914: goto L_0x019d;
                case 70917: goto L_0x0191;
                case 71007: goto L_0x0187;
                case 71010: goto L_0x017b;
                case 74665: goto L_0x016f;
                case 74758: goto L_0x0163;
                case 74761: goto L_0x0157;
                case 74851: goto L_0x014a;
                case 74854: goto L_0x013c;
                case 2193639: goto L_0x012e;
                case 2193642: goto L_0x0120;
                case 2193732: goto L_0x0112;
                case 2193735: goto L_0x0104;
                case 2193738: goto L_0x00f6;
                case 2193825: goto L_0x00e8;
                case 2193828: goto L_0x00da;
                case 2193831: goto L_0x00cd;
                case 2312803: goto L_0x00c0;
                case 2312806: goto L_0x00b3;
                case 2312896: goto L_0x00a6;
                case 2312899: goto L_0x0099;
                case 2312902: goto L_0x008c;
                case 2312989: goto L_0x007f;
                case 2312992: goto L_0x0072;
                case 2312995: goto L_0x0065;
                default: goto L_0x0062;
            }
        L_0x0062:
            r2 = -1
            goto L_0x01b4
        L_0x0065:
            java.lang.String r2 = "L186"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x006e
            goto L_0x0062
        L_0x006e:
            r2 = 25
            goto L_0x01b4
        L_0x0072:
            java.lang.String r2 = "L183"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x007b
            goto L_0x0062
        L_0x007b:
            r2 = 24
            goto L_0x01b4
        L_0x007f:
            java.lang.String r2 = "L180"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0088
            goto L_0x0062
        L_0x0088:
            r2 = 23
            goto L_0x01b4
        L_0x008c:
            java.lang.String r2 = "L156"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0095
            goto L_0x0062
        L_0x0095:
            r2 = 22
            goto L_0x01b4
        L_0x0099:
            java.lang.String r2 = "L153"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00a2
            goto L_0x0062
        L_0x00a2:
            r2 = 21
            goto L_0x01b4
        L_0x00a6:
            java.lang.String r2 = "L150"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00af
            goto L_0x0062
        L_0x00af:
            r2 = 20
            goto L_0x01b4
        L_0x00b3:
            java.lang.String r2 = "L123"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00bc
            goto L_0x0062
        L_0x00bc:
            r2 = 19
            goto L_0x01b4
        L_0x00c0:
            java.lang.String r2 = "L120"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00c9
            goto L_0x0062
        L_0x00c9:
            r2 = 18
            goto L_0x01b4
        L_0x00cd:
            java.lang.String r2 = "H186"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00d6
            goto L_0x0062
        L_0x00d6:
            r2 = 17
            goto L_0x01b4
        L_0x00da:
            java.lang.String r2 = "H183"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00e4
            goto L_0x0062
        L_0x00e4:
            r2 = 16
            goto L_0x01b4
        L_0x00e8:
            java.lang.String r2 = "H180"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x00f2
            goto L_0x0062
        L_0x00f2:
            r2 = 15
            goto L_0x01b4
        L_0x00f6:
            java.lang.String r2 = "H156"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0100
            goto L_0x0062
        L_0x0100:
            r2 = 14
            goto L_0x01b4
        L_0x0104:
            java.lang.String r2 = "H153"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x010e
            goto L_0x0062
        L_0x010e:
            r2 = 13
            goto L_0x01b4
        L_0x0112:
            java.lang.String r2 = "H150"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x011c
            goto L_0x0062
        L_0x011c:
            r2 = 12
            goto L_0x01b4
        L_0x0120:
            java.lang.String r2 = "H123"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x012a
            goto L_0x0062
        L_0x012a:
            r2 = 11
            goto L_0x01b4
        L_0x012e:
            java.lang.String r2 = "H120"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0138
            goto L_0x0062
        L_0x0138:
            r2 = 10
            goto L_0x01b4
        L_0x013c:
            java.lang.String r2 = "L93"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0146
            goto L_0x0062
        L_0x0146:
            r2 = 9
            goto L_0x01b4
        L_0x014a:
            java.lang.String r2 = "L90"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0154
            goto L_0x0062
        L_0x0154:
            r2 = 8
            goto L_0x01b4
        L_0x0157:
            java.lang.String r2 = "L63"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0161
            goto L_0x0062
        L_0x0161:
            r2 = 7
            goto L_0x01b4
        L_0x0163:
            java.lang.String r2 = "L60"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x016d
            goto L_0x0062
        L_0x016d:
            r2 = 6
            goto L_0x01b4
        L_0x016f:
            java.lang.String r2 = "L30"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0179
            goto L_0x0062
        L_0x0179:
            r2 = 5
            goto L_0x01b4
        L_0x017b:
            java.lang.String r2 = "H93"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0185
            goto L_0x0062
        L_0x0185:
            r2 = 4
            goto L_0x01b4
        L_0x0187:
            java.lang.String r3 = "H90"
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L_0x01b4
            goto L_0x0062
        L_0x0191:
            java.lang.String r2 = "H63"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x019b
            goto L_0x0062
        L_0x019b:
            r2 = 2
            goto L_0x01b4
        L_0x019d:
            java.lang.String r2 = "H60"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01a7
            goto L_0x0062
        L_0x01a7:
            r2 = 1
            goto L_0x01b4
        L_0x01a9:
            java.lang.String r2 = "H30"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01b3
            goto L_0x0062
        L_0x01b3:
            r2 = 0
        L_0x01b4:
            switch(r2) {
                case 0: goto L_0x0269;
                case 1: goto L_0x0264;
                case 2: goto L_0x025d;
                case 3: goto L_0x0256;
                case 4: goto L_0x024f;
                case 5: goto L_0x024a;
                case 6: goto L_0x0245;
                case 7: goto L_0x0240;
                case 8: goto L_0x0239;
                case 9: goto L_0x0232;
                case 10: goto L_0x022b;
                case 11: goto L_0x0224;
                case 12: goto L_0x021c;
                case 13: goto L_0x0215;
                case 14: goto L_0x020e;
                case 15: goto L_0x0207;
                case 16: goto L_0x01ff;
                case 17: goto L_0x01f7;
                case 18: goto L_0x01ef;
                case 19: goto L_0x01e9;
                case 20: goto L_0x01e1;
                case 21: goto L_0x01d9;
                case 22: goto L_0x01d1;
                case 23: goto L_0x01c9;
                case 24: goto L_0x01c1;
                case 25: goto L_0x01b9;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            goto L_0x0057
        L_0x01b9:
            r14 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01c1:
            r14 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01c9:
            r14 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01d1:
            r14 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01d9:
            r14 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01e1:
            r14 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01e9:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            goto L_0x026d
        L_0x01ef:
            r14 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01f7:
            r14 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x01ff:
            r14 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0207:
            r14 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x020e:
            r14 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0215:
            r14 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x021c:
            r14 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0224:
            r14 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x022b:
            r14 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0232:
            r14 = 256(0x100, float:3.59E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0239:
            r14 = 64
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0240:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            goto L_0x026d
        L_0x0245:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            goto L_0x026d
        L_0x024a:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            goto L_0x026d
        L_0x024f:
            r14 = 512(0x200, float:7.175E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0256:
            r14 = 128(0x80, float:1.794E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x025d:
            r14 = 32
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x026d
        L_0x0264:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            goto L_0x026d
        L_0x0269:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
        L_0x026d:
            if (r14 != 0) goto L_0x0275
            java.lang.String r12 = "Unknown HEVC level string: "
            N.e.H(r12, r13, r8)
            return r9
        L_0x0275:
            android.util.Pair r13 = new android.util.Pair
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.<init>(r12, r14)
            return r13
        L_0x027f:
            java.lang.String r13 = "Unknown HEVC profile string: "
            N.e.H(r13, r12, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.a.c(java.lang.String, java.lang.String[], M0.i):android.util.Pair");
    }
}
