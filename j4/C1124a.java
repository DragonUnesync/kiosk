package j4;

import G5.q;
import M3.d;
import java.io.UnsupportedEncodingException;

/* renamed from: j4.a  reason: case insensitive filesystem */
public abstract class C1124a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f12867a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(q qVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (qVar.a() >= 11) {
                int b8 = qVar.b(11);
                sb.append(f(b8 / 45));
                sb.append(f(b8 % 45));
                i -= 2;
            } else {
                throw d.a();
            }
        }
        if (i == 1) {
            if (qVar.a() >= 6) {
                sb.append(f(qVar.b(6)));
            } else {
                throw d.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i8 = length + 1;
                        if (sb.charAt(i8) == '%') {
                            sb.deleteCharAt(i8);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016f, code lost:
        if (r2 == 2) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0173, code lost:
        if ((r21 * 10) >= r0) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(G5.q r25, java.lang.StringBuilder r26, int r27, S3.c r28, java.util.ArrayList r29, java.util.EnumMap r30) {
        /*
            r0 = r27
            r1 = r30
            r2 = 64
            r3 = 2
            r4 = 8
            r5 = 128(0x80, float:1.794E-43)
            r6 = 1
            r7 = 3
            int r8 = r0 << 3
            int r9 = r25.a()
            if (r8 > r9) goto L_0x019d
            byte[] r8 = new byte[r0]
            r9 = 0
            r10 = 0
        L_0x0019:
            if (r10 >= r0) goto L_0x0026
            r11 = r25
            int r12 = r11.b(r4)
            byte r12 = (byte) r12
            r8[r10] = r12
            int r10 = r10 + r6
            goto L_0x0019
        L_0x0026:
            if (r28 != 0) goto L_0x0184
            java.lang.String r10 = S3.g.f4531a
            if (r1 == 0) goto L_0x003e
            M3.c r10 = M3.c.f3128Y
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L_0x003e
            java.lang.Object r0 = r1.get(r10)
            java.lang.String r0 = r0.toString()
            goto L_0x0188
        L_0x003e:
            if (r0 <= r7) goto L_0x0054
            byte r1 = r8[r9]
            r10 = -17
            if (r1 != r10) goto L_0x0054
            byte r1 = r8[r6]
            r10 = -69
            if (r1 != r10) goto L_0x0054
            byte r1 = r8[r3]
            r10 = -65
            if (r1 != r10) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            r10 = 0
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x006b:
            if (r10 >= r0) goto L_0x0074
            if (r11 != 0) goto L_0x007a
            if (r12 != 0) goto L_0x007a
            if (r13 == 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            r4 = r19
            r2 = r20
            goto L_0x013f
        L_0x007a:
            byte r4 = r8[r10]
            r7 = r4 & 255(0xff, float:3.57E-43)
            if (r13 == 0) goto L_0x0087
            if (r14 <= 0) goto L_0x008d
            r4 = r4 & r5
            if (r4 == 0) goto L_0x008a
            int r14 = r14 + -1
        L_0x0087:
            r3 = 8
            goto L_0x00b6
        L_0x008a:
            r3 = 8
            goto L_0x00b5
        L_0x008d:
            r3 = r4 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0087
            r3 = r4 & 64
            if (r3 == 0) goto L_0x008a
            int r3 = r14 + 1
            r24 = r4 & 32
            if (r24 != 0) goto L_0x009f
            int r16 = r16 + 1
            r14 = r3
            goto L_0x0087
        L_0x009f:
            r3 = 2
            int r24 = r14 + 2
            r3 = r4 & 16
            if (r3 != 0) goto L_0x00ab
            int r17 = r17 + 1
            r14 = r24
            goto L_0x0087
        L_0x00ab:
            r3 = 3
            int r14 = r14 + r3
            r3 = 8
            r4 = r4 & r3
            if (r4 != 0) goto L_0x00b5
            int r18 = r18 + 1
            goto L_0x00b6
        L_0x00b5:
            r13 = 0
        L_0x00b6:
            r4 = 160(0xa0, float:2.24E-43)
            r3 = 127(0x7f, float:1.78E-43)
            if (r11 == 0) goto L_0x00d4
            if (r7 <= r3) goto L_0x00c2
            if (r7 >= r4) goto L_0x00c2
            r11 = 0
            goto L_0x00d4
        L_0x00c2:
            r4 = 159(0x9f, float:2.23E-43)
            if (r7 <= r4) goto L_0x00d4
            r4 = 192(0xc0, float:2.69E-43)
            if (r7 < r4) goto L_0x00d2
            r4 = 215(0xd7, float:3.01E-43)
            if (r7 == r4) goto L_0x00d2
            r4 = 247(0xf7, float:3.46E-43)
            if (r7 != r4) goto L_0x00d4
        L_0x00d2:
            int r21 = r21 + 1
        L_0x00d4:
            if (r12 == 0) goto L_0x0132
            if (r15 <= 0) goto L_0x00e7
            if (r7 < r2) goto L_0x00e5
            if (r7 == r3) goto L_0x00e5
            r3 = 252(0xfc, float:3.53E-43)
            if (r7 <= r3) goto L_0x00e1
            goto L_0x00e5
        L_0x00e1:
            int r15 = r15 + -1
            goto L_0x0136
        L_0x00e5:
            r12 = 0
            goto L_0x0136
        L_0x00e7:
            if (r7 == r5) goto L_0x00f1
            r4 = 160(0xa0, float:2.24E-43)
            if (r7 == r4) goto L_0x00f1
            r2 = 239(0xef, float:3.35E-43)
            if (r7 <= r2) goto L_0x00f6
        L_0x00f1:
            r4 = r19
            r2 = r20
            goto L_0x012d
        L_0x00f6:
            if (r7 <= r4) goto L_0x010d
            r2 = 224(0xe0, float:3.14E-43)
            if (r7 >= r2) goto L_0x010d
            r2 = r20
            int r20 = r2 + 1
            int r2 = r23 + 1
            if (r2 <= r9) goto L_0x010a
            r9 = r2
            r23 = r9
        L_0x0107:
            r22 = 0
            goto L_0x0136
        L_0x010a:
            r23 = r2
            goto L_0x0107
        L_0x010d:
            r2 = r20
            if (r7 <= r3) goto L_0x0126
            int r15 = r15 + r6
            int r3 = r22 + 1
            r4 = r19
            r20 = r2
            if (r3 <= r4) goto L_0x0121
            r19 = r3
            r22 = r19
        L_0x011e:
            r23 = 0
            goto L_0x0136
        L_0x0121:
            r22 = r3
            r19 = r4
            goto L_0x011e
        L_0x0126:
            r4 = r19
            r20 = r2
            r22 = 0
            goto L_0x011e
        L_0x012d:
            r20 = r2
            r19 = r4
            goto L_0x00e5
        L_0x0132:
            r4 = r19
            r2 = r20
        L_0x0136:
            int r10 = r10 + r6
            r2 = 64
            r3 = 2
            r4 = 8
            r7 = 3
            goto L_0x006b
        L_0x013f:
            if (r13 == 0) goto L_0x0144
            if (r14 <= 0) goto L_0x0144
            r13 = 0
        L_0x0144:
            if (r12 == 0) goto L_0x0149
            if (r15 <= 0) goto L_0x0149
            r12 = 0
        L_0x0149:
            java.lang.String r3 = "UTF8"
            if (r13 == 0) goto L_0x0157
            if (r1 != 0) goto L_0x0155
            int r16 = r16 + r17
            int r16 = r16 + r18
            if (r16 <= 0) goto L_0x0157
        L_0x0155:
            r0 = r3
            goto L_0x0188
        L_0x0157:
            java.lang.String r1 = "SJIS"
            if (r12 == 0) goto L_0x0166
            boolean r5 = S3.g.f4532b
            if (r5 != 0) goto L_0x0164
            r5 = 3
            if (r9 >= r5) goto L_0x0164
            if (r4 < r5) goto L_0x0166
        L_0x0164:
            r0 = r1
            goto L_0x0188
        L_0x0166:
            java.lang.String r4 = "ISO8859_1"
            if (r11 == 0) goto L_0x0178
            if (r12 == 0) goto L_0x0178
            r5 = 2
            if (r9 != r5) goto L_0x0171
            if (r2 == r5) goto L_0x0164
        L_0x0171:
            int r2 = r21 * 10
            if (r2 < r0) goto L_0x0176
            goto L_0x0164
        L_0x0176:
            r0 = r4
            goto L_0x0188
        L_0x0178:
            if (r11 == 0) goto L_0x017b
            goto L_0x0176
        L_0x017b:
            if (r12 == 0) goto L_0x017e
            goto L_0x0164
        L_0x017e:
            if (r13 == 0) goto L_0x0181
            goto L_0x0155
        L_0x0181:
            java.lang.String r0 = S3.g.f4531a
            goto L_0x0188
        L_0x0184:
            java.lang.String r0 = r28.name()
        L_0x0188:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0198 }
            r1.<init>(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x0198 }
            r0 = r26
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0198 }
            r0 = r29
            r0.add(r8)
            return
        L_0x0198:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x019d:
            M3.d r0 = M3.d.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C1124a.b(G5.q, java.lang.StringBuilder, int, S3.c, java.util.ArrayList, java.util.EnumMap):void");
    }

    public static void c(q qVar, StringBuilder sb, int i) {
        int i8;
        if (i * 13 <= qVar.a()) {
            byte[] bArr = new byte[(i * 2)];
            int i9 = 0;
            while (i > 0) {
                int b8 = qVar.b(13);
                int i10 = (b8 % 96) | ((b8 / 96) << 8);
                if (i10 < 2560) {
                    i8 = 41377;
                } else {
                    i8 = 42657;
                }
                int i11 = i10 + i8;
                bArr[i9] = (byte) (i11 >> 8);
                bArr[i9 + 1] = (byte) i11;
                i9 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw d.a();
            }
        } else {
            throw d.a();
        }
    }

    public static void d(q qVar, StringBuilder sb, int i) {
        int i8;
        if (i * 13 <= qVar.a()) {
            byte[] bArr = new byte[(i * 2)];
            int i9 = 0;
            while (i > 0) {
                int b8 = qVar.b(13);
                int i10 = (b8 % 192) | ((b8 / 192) << 8);
                if (i10 < 7936) {
                    i8 = 33088;
                } else {
                    i8 = 49472;
                }
                int i11 = i10 + i8;
                bArr[i9] = (byte) (i11 >> 8);
                bArr[i9 + 1] = (byte) i11;
                i9 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw d.a();
            }
        } else {
            throw d.a();
        }
    }

    public static void e(q qVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (qVar.a() >= 10) {
                int b8 = qVar.b(10);
                if (b8 < 1000) {
                    sb.append(f(b8 / 100));
                    sb.append(f((b8 / 10) % 10));
                    sb.append(f(b8 % 10));
                    i -= 3;
                } else {
                    throw d.a();
                }
            } else {
                throw d.a();
            }
        }
        if (i == 2) {
            if (qVar.a() >= 7) {
                int b9 = qVar.b(7);
                if (b9 < 100) {
                    sb.append(f(b9 / 10));
                    sb.append(f(b9 % 10));
                    return;
                }
                throw d.a();
            }
            throw d.a();
        } else if (i != 1) {
        } else {
            if (qVar.a() >= 4) {
                int b10 = qVar.b(4);
                if (b10 < 10) {
                    sb.append(f(b10));
                    return;
                }
                throw d.a();
            }
            throw d.a();
        }
    }

    public static char f(int i) {
        char[] cArr = f12867a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw d.a();
    }
}
