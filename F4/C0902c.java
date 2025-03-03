package f4;

import M3.d;
import java.math.BigInteger;

/* renamed from: f4.c  reason: case insensitive filesystem */
public abstract class C0902c {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11680a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f11681b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger[] f11682c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f11682c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f11682c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    public static String a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i8 = 0; i8 < i; i8++) {
            bigInteger = bigInteger.add(f11682c[(i - i8) - 1].multiply(BigInteger.valueOf((long) iArr[i8])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw d.a();
    }

    public static int b(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        while (true) {
            int i8 = 0;
            while (true) {
                int i9 = iArr[0];
                if (i >= i9 || z) {
                    return i;
                }
                int i10 = i + 1;
                int i11 = iArr[i];
                if (i10 == i9) {
                    z = true;
                }
                if (i11 < 900) {
                    iArr2[i8] = i11;
                    i8++;
                } else {
                    if (!(i11 == 900 || i11 == 901 || i11 == 928)) {
                        switch (i11) {
                            case 922:
                            case 923:
                            case 924:
                                break;
                        }
                    }
                    z = true;
                    if (!(i8 % 15 == 0 && i11 == 902 && !z) && i8 > 0) {
                        sb.append(a(iArr2, i8));
                    }
                }
                i = i10;
                if (i8 % 15 == 0 && i11 == 902) {
                }
                sb.append(a(iArr2, i8));
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r12 != 900) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d9, code lost:
        r11 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dc, code lost:
        r3 = 0;
        r8 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e1, code lost:
        r3 = 0;
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0105, code lost:
        r3 = 0;
        r8 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x013c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int[] r18, int r19, java.lang.StringBuilder r20) {
        /*
            r0 = r20
            r1 = 0
            r2 = r18[r1]
            int r2 = r2 - r19
            r3 = 1
            int r2 = r2 << r3
            int[] r4 = new int[r2]
            int[] r2 = new int[r2]
            r5 = r19
            r6 = 0
            r7 = 0
        L_0x0011:
            r8 = r18[r1]
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            if (r5 >= r8) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            int r8 = r5 + 1
            r11 = r18[r5]
            if (r11 >= r10) goto L_0x002f
            int r5 = r11 / 30
            r4[r7] = r5
            int r5 = r7 + 1
            int r11 = r11 % 30
            r4[r5] = r11
            int r7 = r7 + 2
        L_0x002d:
            r5 = r8
            goto L_0x0011
        L_0x002f:
            if (r11 == r9) goto L_0x0044
            r9 = 928(0x3a0, float:1.3E-42)
            if (r11 == r9) goto L_0x0042
            switch(r11) {
                case 900: goto L_0x003c;
                case 901: goto L_0x0042;
                case 902: goto L_0x0042;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r11) {
                case 922: goto L_0x0042;
                case 923: goto L_0x0042;
                case 924: goto L_0x0042;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x002d
        L_0x003c:
            int r5 = r7 + 1
            r4[r7] = r10
            r7 = r5
            goto L_0x002d
        L_0x0042:
            r6 = 1
            goto L_0x0011
        L_0x0044:
            r4[r7] = r9
            int r5 = r5 + 2
            r8 = r18[r8]
            r2[r7] = r8
            int r7 = r7 + 1
            goto L_0x0011
        L_0x004f:
            r6 = 0
            r8 = 1
            r11 = 1
        L_0x0052:
            if (r6 >= r7) goto L_0x0144
            r12 = r4[r6]
            int r13 = u.C1477r.h(r8)
            r14 = 3
            r15 = 2
            r16 = 6
            r17 = 32
            if (r13 == 0) goto L_0x0116
            r1 = 5
            if (r13 == r3) goto L_0x00f0
            r3 = 4
            if (r13 == r15) goto L_0x00c6
            char[] r15 = f11680a
            r9 = 29
            if (r13 == r14) goto L_0x00b1
            if (r13 == r3) goto L_0x0099
            if (r13 == r1) goto L_0x0073
        L_0x0072:
            goto L_0x008e
        L_0x0073:
            if (r12 >= r9) goto L_0x007e
            char r17 = r15[r12]
            r8 = r11
        L_0x0078:
            r3 = r17
        L_0x007a:
            r1 = 913(0x391, float:1.28E-42)
            goto L_0x0137
        L_0x007e:
            if (r12 == r9) goto L_0x0093
            if (r12 == r10) goto L_0x0093
            r1 = 913(0x391, float:1.28E-42)
            if (r12 == r1) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r1 = r2[r6]
            char r1 = (char) r1
            r0.append(r1)
        L_0x008d:
            r8 = r11
        L_0x008e:
            r1 = 913(0x391, float:1.28E-42)
        L_0x0090:
            r3 = 0
            goto L_0x0137
        L_0x0093:
            r1 = 913(0x391, float:1.28E-42)
            r3 = 0
            r8 = 1
            goto L_0x0137
        L_0x0099:
            r1 = 26
            if (r12 >= r1) goto L_0x00a3
            int r12 = r12 + 65
            char r1 = (char) r12
            r3 = r1
            r8 = r11
            goto L_0x007a
        L_0x00a3:
            if (r12 == r1) goto L_0x00aa
            if (r12 == r10) goto L_0x00a8
            goto L_0x008d
        L_0x00a8:
            r8 = 1
            goto L_0x008e
        L_0x00aa:
            r8 = r11
        L_0x00ab:
            r1 = 913(0x391, float:1.28E-42)
        L_0x00ad:
            r3 = 32
            goto L_0x0137
        L_0x00b1:
            if (r12 >= r9) goto L_0x00b6
            char r17 = r15[r12]
            goto L_0x0078
        L_0x00b6:
            if (r12 == r9) goto L_0x0093
            if (r12 == r10) goto L_0x0093
            r1 = 913(0x391, float:1.28E-42)
            if (r12 == r1) goto L_0x00bf
            goto L_0x0072
        L_0x00bf:
            r1 = r2[r6]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0072
        L_0x00c6:
            r1 = 25
            if (r12 >= r1) goto L_0x00cf
            char[] r1 = f11681b
            char r17 = r1[r12]
            goto L_0x0078
        L_0x00cf:
            if (r12 == r10) goto L_0x0093
            r1 = 913(0x391, float:1.28E-42)
            if (r12 == r1) goto L_0x00e9
            switch(r12) {
                case 25: goto L_0x00e4;
                case 26: goto L_0x00ab;
                case 27: goto L_0x00df;
                case 28: goto L_0x0093;
                case 29: goto L_0x00d9;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            goto L_0x0072
        L_0x00d9:
            r11 = r8
            r1 = 913(0x391, float:1.28E-42)
        L_0x00dc:
            r3 = 0
            r8 = 6
            goto L_0x0137
        L_0x00df:
            r1 = 913(0x391, float:1.28E-42)
        L_0x00e1:
            r3 = 0
            r8 = 2
            goto L_0x0137
        L_0x00e4:
            r1 = 913(0x391, float:1.28E-42)
            r3 = 0
            r8 = 4
            goto L_0x0137
        L_0x00e9:
            r1 = r2[r6]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0072
        L_0x00f0:
            r3 = 26
            if (r12 >= r3) goto L_0x00f9
            int r12 = r12 + 97
        L_0x00f6:
            char r1 = (char) r12
            r3 = r1
            goto L_0x007a
        L_0x00f9:
            if (r12 == r10) goto L_0x00a8
            r3 = 913(0x391, float:1.28E-42)
            if (r12 == r3) goto L_0x010e
            switch(r12) {
                case 26: goto L_0x00ab;
                case 27: goto L_0x0108;
                case 28: goto L_0x0103;
                case 29: goto L_0x00d9;
                default: goto L_0x0102;
            }
        L_0x0102:
            goto L_0x008e
        L_0x0103:
            r1 = 913(0x391, float:1.28E-42)
        L_0x0105:
            r3 = 0
            r8 = 3
            goto L_0x0137
        L_0x0108:
            r11 = r8
            r1 = 913(0x391, float:1.28E-42)
            r3 = 0
            r8 = 5
            goto L_0x0137
        L_0x010e:
            r1 = r2[r6]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0072
        L_0x0116:
            r1 = 26
            if (r12 >= r1) goto L_0x011d
            int r12 = r12 + 65
            goto L_0x00f6
        L_0x011d:
            if (r12 == r10) goto L_0x0132
            r1 = 913(0x391, float:1.28E-42)
            if (r12 == r1) goto L_0x012a
            switch(r12) {
                case 26: goto L_0x00ad;
                case 27: goto L_0x00e1;
                case 28: goto L_0x0105;
                case 29: goto L_0x0128;
                default: goto L_0x0126;
            }
        L_0x0126:
            goto L_0x0090
        L_0x0128:
            r11 = r8
            goto L_0x00dc
        L_0x012a:
            r3 = r2[r6]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x0090
        L_0x0132:
            r1 = 913(0x391, float:1.28E-42)
            r8 = 1
            goto L_0x0090
        L_0x0137:
            if (r3 == 0) goto L_0x013c
            r0.append(r3)
        L_0x013c:
            int r6 = r6 + 1
            r1 = 0
            r3 = 1
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0052
        L_0x0144:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C0902c.c(int[], int, java.lang.StringBuilder):int");
    }
}
