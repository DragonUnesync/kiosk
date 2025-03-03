package f1;

import java.util.regex.Pattern;

/* renamed from: f1.D  reason: case insensitive filesystem */
public abstract class C0885D {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f11488a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f11489b = Pattern.compile("^([a-z])=$");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f11490c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f11491d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f1.C0884C a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            f1.B r2 = new f1.B
            r2.<init>()
            java.lang.String r3 = f1.x.f11638h
            boolean r4 = r0.contains(r3)
            if (r4 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r3 = f1.x.f11637g
        L_0x0013:
            int r4 = P0.z.f3748a
            r4 = -1
            java.lang.String[] r3 = r0.split(r3, r4)
            int r5 = r3.length
            r6 = 0
            r0 = r6
            r8 = 0
            r9 = 0
        L_0x001f:
            H3.L r10 = r2.f11469b
            if (r8 >= r5) goto L_0x0257
            r11 = r3[r8]
            java.lang.String r12 = ""
            boolean r13 = r12.equals(r11)
            if (r13 == 0) goto L_0x002f
            goto L_0x0182
        L_0x002f:
            java.util.regex.Pattern r13 = f11488a
            java.util.regex.Matcher r13 = r13.matcher(r11)
            boolean r14 = r13.matches()
            java.lang.String r15 = "i"
            if (r14 != 0) goto L_0x0068
            java.util.regex.Pattern r10 = f11489b
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r12 = r10.matches()
            if (r12 == 0) goto L_0x0055
            java.lang.String r10 = r10.group(r1)
            boolean r10 = j$.util.Objects.equals(r10, r15)
            if (r10 == 0) goto L_0x0055
            goto L_0x0182
        L_0x0055:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Malformed SDP line: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.b(r6, r0)
            throw r0
        L_0x0068:
            java.lang.String r14 = r13.group(r1)
            r14.getClass()
            r7 = 2
            java.lang.String r13 = r13.group(r7)
            r13.getClass()
            int r16 = r14.hashCode()
            r4 = 4
            switch(r16) {
                case 97: goto L_0x0116;
                case 98: goto L_0x010b;
                case 99: goto L_0x0101;
                case 100: goto L_0x007f;
                case 101: goto L_0x00f7;
                case 102: goto L_0x007f;
                case 103: goto L_0x007f;
                case 104: goto L_0x007f;
                case 105: goto L_0x00ef;
                case 106: goto L_0x007f;
                case 107: goto L_0x00e4;
                case 108: goto L_0x007f;
                case 109: goto L_0x00d9;
                case 110: goto L_0x007f;
                case 111: goto L_0x00cf;
                case 112: goto L_0x00c5;
                case 113: goto L_0x007f;
                case 114: goto L_0x00ba;
                case 115: goto L_0x00af;
                case 116: goto L_0x00a3;
                case 117: goto L_0x0098;
                case 118: goto L_0x008d;
                case 119: goto L_0x007f;
                case 120: goto L_0x007f;
                case 121: goto L_0x007f;
                case 122: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0121
        L_0x0081:
            java.lang.String r15 = "z"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 14
            goto L_0x0122
        L_0x008d:
            java.lang.String r15 = "v"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 0
            goto L_0x0122
        L_0x0098:
            java.lang.String r15 = "u"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 4
            goto L_0x0122
        L_0x00a3:
            java.lang.String r15 = "t"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 9
            goto L_0x0122
        L_0x00af:
            java.lang.String r15 = "s"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 2
            goto L_0x0122
        L_0x00ba:
            java.lang.String r15 = "r"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 13
            goto L_0x0122
        L_0x00c5:
            java.lang.String r15 = "p"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 6
            goto L_0x0122
        L_0x00cf:
            java.lang.String r15 = "o"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 1
            goto L_0x0122
        L_0x00d9:
            java.lang.String r15 = "m"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 12
            goto L_0x0122
        L_0x00e4:
            java.lang.String r15 = "k"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 10
            goto L_0x0122
        L_0x00ef:
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 3
            goto L_0x0122
        L_0x00f7:
            java.lang.String r15 = "e"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 5
            goto L_0x0122
        L_0x0101:
            java.lang.String r15 = "c"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 7
            goto L_0x0122
        L_0x010b:
            java.lang.String r15 = "b"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 8
            goto L_0x0122
        L_0x0116:
            java.lang.String r15 = "a"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0121
            r14 = 11
            goto L_0x0122
        L_0x0121:
            r14 = -1
        L_0x0122:
            switch(r14) {
                case 0: goto L_0x0232;
                case 1: goto L_0x022e;
                case 2: goto L_0x022a;
                case 3: goto L_0x021e;
                case 4: goto L_0x0216;
                case 5: goto L_0x0212;
                case 6: goto L_0x020e;
                case 7: goto L_0x0202;
                case 8: goto L_0x01dd;
                case 9: goto L_0x01da;
                case 10: goto L_0x01cf;
                case 11: goto L_0x018e;
                case 12: goto L_0x0126;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x0182
        L_0x0126:
            if (r0 == 0) goto L_0x0138
            f1.b r0 = r0.a()     // Catch:{ IllegalArgumentException -> 0x0132, IllegalStateException -> 0x0130 }
            r10.a(r0)     // Catch:{ IllegalArgumentException -> 0x0132, IllegalStateException -> 0x0130 }
            goto L_0x0138
        L_0x0130:
            r0 = move-exception
            goto L_0x0133
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            M0.J r0 = M0.J.b(r0, r6)
            throw r0
        L_0x0138:
            java.util.regex.Pattern r0 = f11491d
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r9 = r0.matches()
            java.lang.String r10 = "Malformed SDP media description line: "
            if (r9 == 0) goto L_0x0185
            java.lang.String r9 = r0.group(r1)
            r9.getClass()
            java.lang.String r7 = r0.group(r7)
            r7.getClass()
            r11 = 3
            java.lang.String r11 = r0.group(r11)
            r11.getClass()
            java.lang.String r0 = r0.group(r4)
            r0.getClass()
            c7.e r4 = new c7.e     // Catch:{ NumberFormatException -> 0x0172 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0172 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0172 }
            r4.<init>(r9, r7, r11, r0)     // Catch:{ NumberFormatException -> 0x0172 }
            r0 = r4
            goto L_0x017d
        L_0x0172:
            r0 = move-exception
            java.lang.String r4 = r10.concat(r13)
            java.lang.String r7 = "SDPParser"
            P0.l.C(r7, r4, r0)
            r0 = r6
        L_0x017d:
            if (r0 != 0) goto L_0x0181
            r9 = 1
            goto L_0x0182
        L_0x0181:
            r9 = 0
        L_0x0182:
            r10 = -1
            goto L_0x023b
        L_0x0185:
            java.lang.String r0 = r10.concat(r13)
            M0.J r0 = M0.J.b(r6, r0)
            throw r0
        L_0x018e:
            if (r9 == 0) goto L_0x0191
            goto L_0x0182
        L_0x0191:
            java.util.regex.Pattern r4 = f11490c
            java.util.regex.Matcher r4 = r4.matcher(r13)
            boolean r10 = r4.matches()
            if (r10 == 0) goto L_0x01bc
            java.lang.String r10 = r4.group(r1)
            r10.getClass()
            java.lang.String r4 = r4.group(r7)
            if (r4 != 0) goto L_0x01ab
            goto L_0x01ac
        L_0x01ab:
            r12 = r4
        L_0x01ac:
            if (r0 != 0) goto L_0x01b4
            java.util.HashMap r4 = r2.f11468a
            r4.put(r10, r12)
            goto L_0x0182
        L_0x01b4:
            java.lang.Cloneable r4 = r0.f8918f
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r10, r12)
            goto L_0x0182
        L_0x01bc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Malformed Attribute line: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.b(r6, r0)
            throw r0
        L_0x01cf:
            if (r9 == 0) goto L_0x01d2
            goto L_0x0182
        L_0x01d2:
            if (r0 != 0) goto L_0x01d7
            r2.i = r13
            goto L_0x0182
        L_0x01d7:
            r0.i = r13
            goto L_0x0182
        L_0x01da:
            r2.f11472f = r13
            goto L_0x0182
        L_0x01dd:
            if (r9 == 0) goto L_0x01e0
            goto L_0x0182
        L_0x01e0:
            java.lang.String r4 = ":\\s?"
            r10 = -1
            java.lang.String[] r4 = r13.split(r4, r10)
            int r11 = r4.length
            if (r11 != r7) goto L_0x01ec
            r7 = 1
            goto L_0x01ed
        L_0x01ec:
            r7 = 0
        L_0x01ed:
            P0.l.d(r7)
            r4 = r4[r1]
            int r4 = java.lang.Integer.parseInt(r4)
            if (r0 != 0) goto L_0x01fd
            int r4 = r4 * 1000
            r2.f11470c = r4
            goto L_0x023b
        L_0x01fd:
            int r4 = r4 * 1000
            r0.f8916c = r4
            goto L_0x023b
        L_0x0202:
            r10 = -1
            if (r9 == 0) goto L_0x0206
            goto L_0x023b
        L_0x0206:
            if (r0 != 0) goto L_0x020b
            r2.f11474h = r13
            goto L_0x023b
        L_0x020b:
            r0.f8920h = r13
            goto L_0x023b
        L_0x020e:
            r10 = -1
            r2.f11477l = r13
            goto L_0x023b
        L_0x0212:
            r10 = -1
            r2.f11476k = r13
            goto L_0x023b
        L_0x0216:
            r10 = -1
            android.net.Uri r4 = android.net.Uri.parse(r13)
            r2.f11473g = r4
            goto L_0x023b
        L_0x021e:
            r10 = -1
            if (r9 == 0) goto L_0x0222
            goto L_0x023b
        L_0x0222:
            if (r0 != 0) goto L_0x0227
            r2.f11475j = r13
            goto L_0x023b
        L_0x0227:
            r0.f8919g = r13
            goto L_0x023b
        L_0x022a:
            r10 = -1
            r2.f11471d = r13
            goto L_0x023b
        L_0x022e:
            r10 = -1
            r2.e = r13
            goto L_0x023b
        L_0x0232:
            r10 = -1
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x023f
        L_0x023b:
            int r8 = r8 + r1
            r4 = -1
            goto L_0x001f
        L_0x023f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SDP version "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = " is not supported."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.b(r6, r0)
            throw r0
        L_0x0257:
            if (r0 == 0) goto L_0x0269
            f1.b r0 = r0.a()     // Catch:{ IllegalArgumentException -> 0x0263, IllegalStateException -> 0x0261 }
            r10.a(r0)     // Catch:{ IllegalArgumentException -> 0x0263, IllegalStateException -> 0x0261 }
            goto L_0x0269
        L_0x0261:
            r0 = move-exception
            goto L_0x0264
        L_0x0263:
            r0 = move-exception
        L_0x0264:
            M0.J r0 = M0.J.b(r0, r6)
            throw r0
        L_0x0269:
            f1.C r0 = new f1.C     // Catch:{ IllegalArgumentException -> 0x0271, IllegalStateException -> 0x026f }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0271, IllegalStateException -> 0x026f }
            return r0
        L_0x026f:
            r0 = move-exception
            goto L_0x0272
        L_0x0271:
            r0 = move-exception
        L_0x0272:
            M0.J r0 = M0.J.b(r0, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0885D.a(java.lang.String):f1.C");
    }
}
