package J1;

import M0.I;
import P0.r;
import P0.z;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import p1.C1332b;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2359a = "OpusHead".getBytes(StandardCharsets.UTF_8);

    static {
        int i = z.f3748a;
    }

    public static b a(int i, r rVar) {
        long j7;
        rVar.H(i + 12);
        rVar.I(1);
        b(rVar);
        rVar.I(2);
        int v4 = rVar.v();
        if ((v4 & 128) != 0) {
            rVar.I(2);
        }
        if ((v4 & 64) != 0) {
            rVar.I(rVar.v());
        }
        if ((v4 & 32) != 0) {
            rVar.I(2);
        }
        rVar.I(1);
        b(rVar);
        String f8 = I.f(rVar.v());
        if ("audio/mpeg".equals(f8) || "audio/vnd.dts".equals(f8) || "audio/vnd.dts.hd".equals(f8)) {
            return new b(f8, (byte[]) null, -1, -1);
        }
        rVar.I(4);
        long x8 = rVar.x();
        long x9 = rVar.x();
        rVar.I(1);
        int b8 = b(rVar);
        byte[] bArr = new byte[b8];
        rVar.g(bArr, 0, b8);
        long j8 = -1;
        if (x9 > 0) {
            j7 = x9;
        } else {
            j7 = -1;
        }
        if (x8 > 0) {
            j8 = x8;
        }
        return new b(f8, bArr, j7, j8);
    }

    public static int b(r rVar) {
        int v4 = rVar.v();
        int i = v4 & 127;
        while ((v4 & 128) == 128) {
            v4 = rVar.v();
            i = (i << 7) | (v4 & 127);
        }
        return i;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public static Q0.f d(r rVar) {
        long p3;
        long p8;
        rVar.H(8);
        if (c(rVar.i()) == 0) {
            p3 = rVar.x();
            p8 = rVar.x();
        } else {
            p3 = rVar.p();
            p8 = rVar.p();
        }
        return new Q0.f(p3, p8, rVar.x());
    }

    public static Pair e(r rVar, int i, int i8) {
        boolean z;
        Pair pair;
        boolean z6;
        boolean z8;
        Integer num;
        s sVar;
        int i9;
        int i10;
        boolean z9;
        byte[] bArr;
        r rVar2 = rVar;
        int i11 = rVar2.f3733b;
        while (i11 - i < i8) {
            rVar2.H(i11);
            int i12 = rVar.i();
            boolean z10 = false;
            if (i12 > 0) {
                z = true;
            } else {
                z = false;
            }
            C1332b.d("childAtomSize must be positive", z);
            if (rVar.i() == 1936289382) {
                int i13 = i11 + 8;
                int i14 = -1;
                int i15 = 0;
                String str = null;
                Integer num2 = null;
                while (i13 - i11 < i12) {
                    rVar2.H(i13);
                    int i16 = rVar.i();
                    int i17 = rVar.i();
                    if (i17 == 1718775137) {
                        num2 = Integer.valueOf(rVar.i());
                    } else if (i17 == 1935894637) {
                        rVar2.I(4);
                        str = rVar2.t(4, StandardCharsets.UTF_8);
                    } else if (i17 == 1935894633) {
                        i14 = i13;
                        i15 = i16;
                    }
                    i13 += i16;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    if (num2 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    C1332b.d("frma atom is mandatory", z6);
                    if (i14 != -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    C1332b.d("schi atom is mandatory", z8);
                    int i18 = i14 + 8;
                    while (true) {
                        if (i18 - i14 >= i15) {
                            num = num2;
                            sVar = null;
                            break;
                        }
                        rVar2.H(i18);
                        int i19 = rVar.i();
                        if (rVar.i() == 1952804451) {
                            int c8 = c(rVar.i());
                            rVar2.I(1);
                            if (c8 == 0) {
                                rVar2.I(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int v4 = rVar.v();
                                i10 = v4 & 15;
                                i9 = (v4 & 240) >> 4;
                            }
                            if (rVar.v() == 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            int v8 = rVar.v();
                            byte[] bArr2 = new byte[16];
                            rVar2.g(bArr2, 0, 16);
                            if (!z9 || v8 != 0) {
                                bArr = null;
                            } else {
                                int v9 = rVar.v();
                                byte[] bArr3 = new byte[v9];
                                rVar2.g(bArr3, 0, v9);
                                bArr = bArr3;
                            }
                            num = num2;
                            sVar = new s(z9, str, v8, bArr2, i9, i10, bArr);
                        } else {
                            Integer num3 = num2;
                            i18 += i19;
                        }
                    }
                    if (sVar != null) {
                        z10 = true;
                    }
                    C1332b.d("tenc atom is mandatory", z10);
                    int i20 = z.f3748a;
                    pair = Pair.create(num, sVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i11 += i12;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, C3.r] */
    /* JADX WARNING: type inference failed for: r6v41, types: [V0.j, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07aa, code lost:
        if (r12 == 2) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0984, code lost:
        if (r1 != 14) goto L_0x0998;
     */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x099d  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x09b3  */
    /* JADX WARNING: Removed duplicated region for block: B:641:0x09e6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static C3.r f(P0.r r61, int r62, int r63, java.lang.String r64, M0.C0126n r65, boolean r66) {
        /*
            r9 = r61
            r10 = r64
            r11 = r65
            java.lang.String r6 = "audio/mhm1"
            java.lang.String r16 = "audio/ac4"
            java.lang.String r17 = "audio/eac3"
            r18 = 0
            r1 = 0
            r12 = 12
            r9.H(r12)
            int r12 = r61.i()
            C3.r r13 = new C3.r
            r13.<init>()
            J1.s[] r8 = new J1.s[r12]
            r13.f617c = r8
            r13.f616b = r1
            r8 = 0
        L_0x0024:
            if (r8 >= r12) goto L_0x0d8a
            int r14 = r9.f3733b
            int r15 = r61.i()
            if (r15 <= 0) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            java.lang.String r2 = "childAtomSize must be positive"
            p1.C1332b.d(r2, r7)
            int r7 = r61.i()
            r5 = 1635148593(0x61766331, float:2.840654E20)
            if (r7 == r5) goto L_0x0d37
            r5 = 1635148595(0x61766333, float:2.8406544E20)
            if (r7 == r5) goto L_0x0d37
            r5 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 == r5) goto L_0x0d37
            r5 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 == r5) goto L_0x0d37
            r5 = 1836070006(0x6d703476, float:4.646239E27)
            if (r7 == r5) goto L_0x0d37
            r5 = 1752589105(0x68766331, float:4.6541277E24)
            if (r7 == r5) goto L_0x0d37
            r5 = 1751479857(0x68657631, float:4.3344087E24)
            if (r7 == r5) goto L_0x0d37
            r5 = 1932670515(0x73323633, float:1.4119387E31)
            if (r7 == r5) goto L_0x0d37
            r5 = 1211250227(0x48323633, float:182488.8)
            if (r7 == r5) goto L_0x0d37
            r5 = 1748121139(0x68323633, float:3.366324E24)
            if (r7 == r5) goto L_0x0d37
            r5 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 == r5) goto L_0x0d37
            r5 = 1987063865(0x76703039, float:1.2178997E33)
            if (r7 == r5) goto L_0x0d37
            r5 = 1635135537(0x61763031, float:2.8383572E20)
            if (r7 == r5) goto L_0x0d37
            r5 = 1685479798(0x64766176, float:1.8179687E22)
            if (r7 == r5) goto L_0x0d37
            r5 = 1685479729(0x64766131, float:1.817961E22)
            if (r7 == r5) goto L_0x0d37
            r5 = 1685481573(0x64766865, float:1.8181686E22)
            if (r7 == r5) goto L_0x0d37
            r5 = 1685481521(0x64766831, float:1.8181627E22)
            if (r7 != r5) goto L_0x00a6
            r40 = r6
            r34 = r8
            r11 = r10
            r35 = r12
            r12 = r13
            r39 = r14
            r38 = r15
            r2 = 0
            r3 = 1
            r22 = 2
            r25 = 7
            r13 = r9
        L_0x00a2:
            r9 = 16
            goto L_0x0d4c
        L_0x00a6:
            r5 = 1836069985(0x6d703461, float:4.6462328E27)
            r4 = 1700998451(0x65632d33, float:6.7050686E22)
            r3 = 1633889587(0x61632d33, float:2.6191674E20)
            r1 = 1701733217(0x656e6361, float:7.0359778E22)
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 == r5) goto L_0x0128
            if (r7 == r1) goto L_0x0128
            if (r7 == r3) goto L_0x0128
            if (r7 == r4) goto L_0x0128
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 == r5) goto L_0x0128
            r5 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r7 == r5) goto L_0x0128
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 == r5) goto L_0x0128
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 == r5) goto L_0x0128
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r5) goto L_0x0128
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r5) goto L_0x0128
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r7 == r5) goto L_0x0128
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 == r5) goto L_0x0128
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 == r5) goto L_0x0128
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r5) goto L_0x0128
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r5) goto L_0x0128
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 == r5) goto L_0x0128
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r5) goto L_0x0128
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r5) goto L_0x0128
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 == r5) goto L_0x0128
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 == r5) goto L_0x0128
            if (r7 == r0) goto L_0x0128
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 == r5) goto L_0x0128
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 == r5) goto L_0x0128
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 == r5) goto L_0x0128
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 == r5) goto L_0x0128
            r5 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r7 != r5) goto L_0x012c
        L_0x0128:
            r5 = 16
            goto L_0x021a
        L_0x012c:
            r0 = 1664495672(0x63363038, float:3.360782E21)
            r1 = 1937010800(0x73747070, float:1.9366469E31)
            r2 = 2004251764(0x77767474, float:4.998699E33)
            r3 = 1954034535(0x74783367, float:7.865797E31)
            r4 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 == r4) goto L_0x0145
            if (r7 == r3) goto L_0x0145
            if (r7 == r2) goto L_0x0145
            if (r7 == r1) goto L_0x0145
            if (r7 != r0) goto L_0x0149
        L_0x0145:
            r33 = 16
            goto L_0x01bd
        L_0x0149:
            r5 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r5) goto L_0x019d
            r0 = 16
            int r1 = r14 + 16
            r9.H(r1)
            if (r7 != r5) goto L_0x0178
            r61.q()
            java.lang.String r0 = r61.q()
            if (r0 == 0) goto L_0x0178
            M0.q r1 = new M0.q
            r1.<init>()
            java.lang.String r2 = java.lang.Integer.toString(r62)
            r1.f2989a = r2
            java.lang.String r0 = M0.I.o(r0)
            r1.f2999m = r0
            M0.r r0 = new M0.r
            r0.<init>(r1)
            r13.f618d = r0
        L_0x0178:
            r31 = r6
            r25 = r8
            r11 = r10
            r35 = r12
            r12 = r13
            r39 = r14
            r38 = r15
            r10 = 0
            r14 = 2
            r15 = 1
            r20 = 8
            r21 = 255(0xff, float:3.57E-43)
            r22 = 10
            r24 = 9
            r26 = 1835365492(0x6d657474, float:4.4383032E27)
            r28 = 5
            r30 = 0
            r32 = 7
            r13 = r9
            r9 = 16
            goto L_0x0d77
        L_0x019d:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r7 != r0) goto L_0x0178
            M0.q r0 = new M0.q
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r62)
            r0.f2989a = r1
            java.lang.String r1 = "application/x-camera-motion"
            java.lang.String r1 = M0.I.o(r1)
            r0.f2999m = r1
            M0.r r1 = new M0.r
            r1.<init>(r0)
            r13.f618d = r1
            goto L_0x0178
        L_0x01bd:
            int r5 = r14 + 16
            r9.H(r5)
            java.lang.String r5 = "application/ttml+xml"
            r34 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 != r4) goto L_0x01cf
        L_0x01cb:
            r1 = r34
        L_0x01cd:
            r0 = 0
            goto L_0x01f4
        L_0x01cf:
            if (r7 != r3) goto L_0x01e2
            int r0 = r15 + -16
            byte[] r1 = new byte[r0]
            r2 = 0
            r9.g(r1, r2, r0)
            H3.i0 r0 = H3.O.r(r1)
            java.lang.String r5 = "application/x-quicktime-tx3g"
            r1 = r34
            goto L_0x01f4
        L_0x01e2:
            if (r7 != r2) goto L_0x01e7
            java.lang.String r5 = "application/x-mp4-vtt"
            goto L_0x01cb
        L_0x01e7:
            if (r7 != r1) goto L_0x01ec
            r1 = r18
            goto L_0x01cd
        L_0x01ec:
            if (r7 != r0) goto L_0x0214
            r0 = 1
            r13.f616b = r0
            java.lang.String r5 = "application/x-mp4-cea-608"
            goto L_0x01cb
        L_0x01f4:
            M0.q r3 = new M0.q
            r3.<init>()
            java.lang.String r4 = java.lang.Integer.toString(r62)
            r3.f2989a = r4
            java.lang.String r4 = M0.I.o(r5)
            r3.f2999m = r4
            r3.f2992d = r10
            r3.f3004r = r1
            r3.f3002p = r0
            M0.r r0 = new M0.r
            r0.<init>(r3)
            r13.f618d = r0
            goto L_0x0178
        L_0x0214:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x021a:
            int r0 = r14 + 16
            r9.H(r0)
            r0 = 6
            if (r66 == 0) goto L_0x022a
            int r5 = r61.B()
            r9.I(r0)
            goto L_0x0230
        L_0x022a:
            r5 = 8
            r9.I(r5)
            r5 = 0
        L_0x0230:
            r53 = 21
            r4 = 24
            r54 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = 4
            if (r5 == 0) goto L_0x02ca
            r1 = 1
            if (r5 != r1) goto L_0x023e
            goto L_0x02ca
        L_0x023e:
            r1 = 2
            if (r5 != r1) goto L_0x02b6
            r1 = 16
            r9.I(r1)
            long r56 = r61.p()
            double r56 = java.lang.Double.longBitsToDouble(r56)
            long r0 = java.lang.Math.round(r56)
            int r1 = (int) r0
            int r0 = r61.z()
            r9.I(r3)
            int r5 = r61.z()
            int r56 = r61.z()
            r31 = 1
            r57 = r56 & 1
            r29 = 2
            if (r57 == 0) goto L_0x026d
            r57 = 1
            goto L_0x026f
        L_0x026d:
            r57 = 0
        L_0x026f:
            r56 = r56 & 2
            if (r56 == 0) goto L_0x0276
            r56 = 1
            goto L_0x0278
        L_0x0276:
            r56 = 0
        L_0x0278:
            if (r57 != 0) goto L_0x02a3
            r3 = 8
            if (r5 != r3) goto L_0x0282
            r3 = 3
        L_0x027f:
            r5 = 8
            goto L_0x02ab
        L_0x0282:
            r3 = 16
            if (r5 != r3) goto L_0x028d
            if (r56 == 0) goto L_0x028b
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x027f
        L_0x028b:
            r3 = 2
            goto L_0x027f
        L_0x028d:
            if (r5 != r4) goto L_0x0297
            if (r56 == 0) goto L_0x0294
            r3 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x027f
        L_0x0294:
            r3 = 21
            goto L_0x027f
        L_0x0297:
            r3 = 32
            if (r5 != r3) goto L_0x02a9
            if (r56 == 0) goto L_0x02a0
            r3 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x027f
        L_0x02a0:
            r3 = 22
            goto L_0x027f
        L_0x02a3:
            r3 = 32
            if (r5 != r3) goto L_0x02a9
            r3 = 4
            goto L_0x027f
        L_0x02a9:
            r3 = -1
            goto L_0x027f
        L_0x02ab:
            r9.I(r5)
            r4 = r1
            r5 = 1767992678(0x69616d66, float:1.7032808E25)
            r1 = r0
            r0 = r3
            r3 = 0
            goto L_0x02f1
        L_0x02b6:
            r40 = r6
            r34 = r8
            r11 = r10
            r35 = r12
            r12 = r13
            r39 = r14
            r38 = r15
            r2 = 0
            r22 = 2
            r25 = 7
            r13 = r9
            goto L_0x0d1c
        L_0x02ca:
            int r0 = r61.B()
            r1 = 6
            r9.I(r1)
            int r1 = r61.w()
            int r3 = r9.f3733b
            r56 = 4
            int r3 = r3 + -4
            r9.H(r3)
            int r3 = r61.i()
            r4 = 1
            if (r5 != r4) goto L_0x02eb
            r4 = 16
            r9.I(r4)
        L_0x02eb:
            r4 = r1
            r5 = 1767992678(0x69616d66, float:1.7032808E25)
            r1 = r0
            r0 = -1
        L_0x02f1:
            if (r7 != r5) goto L_0x02f5
            r1 = -1
            r4 = -1
        L_0x02f5:
            int r5 = r9.f3733b
            r57 = r1
            r1 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 != r1) goto L_0x0334
            android.util.Pair r1 = e(r9, r14, r15)
            if (r1 == 0) goto L_0x032d
            java.lang.Object r7 = r1.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r11 != 0) goto L_0x0312
            r55 = r4
            r4 = 0
            goto L_0x031e
        L_0x0312:
            r55 = r4
            java.lang.Object r4 = r1.second
            J1.s r4 = (J1.s) r4
            java.lang.String r4 = r4.f2468b
            M0.n r4 = r11.k(r4)
        L_0x031e:
            java.lang.Object r1 = r1.second
            J1.s r1 = (J1.s) r1
            r58 = r4
            java.lang.Object r4 = r13.f617c
            J1.s[] r4 = (J1.s[]) r4
            r4[r8] = r1
            r4 = r58
            goto L_0x0330
        L_0x032d:
            r55 = r4
            r4 = r11
        L_0x0330:
            r9.H(r5)
            goto L_0x0337
        L_0x0334:
            r55 = r4
            r4 = r11
        L_0x0337:
            java.lang.String r1 = "audio/ac3"
            r58 = r5
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 != r5) goto L_0x0343
            r5 = r1
            goto L_0x040d
        L_0x0343:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 != r5) goto L_0x034c
            r5 = r17
            goto L_0x040d
        L_0x034c:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 != r5) goto L_0x0355
            r5 = r16
            goto L_0x040d
        L_0x0355:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 != r5) goto L_0x035e
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x040d
        L_0x035e:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r5) goto L_0x040b
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 != r5) goto L_0x036a
            goto L_0x040b
        L_0x036a:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 != r5) goto L_0x0373
            java.lang.String r5 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x040d
        L_0x0373:
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r7 != r5) goto L_0x037c
            java.lang.String r5 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x040d
        L_0x037c:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 != r5) goto L_0x0385
            java.lang.String r5 = "audio/3gpp"
            goto L_0x040d
        L_0x0385:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 != r5) goto L_0x038e
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x040d
        L_0x038e:
            java.lang.String r5 = "audio/raw"
            r46 = r5
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 != r5) goto L_0x039c
        L_0x0397:
            r5 = r46
            r0 = 2
            goto L_0x040d
        L_0x039c:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 != r5) goto L_0x03a7
            r5 = r46
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x040d
        L_0x03a7:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 != r5) goto L_0x03b4
            r5 = -1
            if (r0 != r5) goto L_0x03b0
            goto L_0x0397
        L_0x03b0:
            r5 = r46
            goto L_0x040d
        L_0x03b4:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r5) goto L_0x0408
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 != r5) goto L_0x03bf
            goto L_0x0408
        L_0x03bf:
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 != r5) goto L_0x03c7
            java.lang.String r5 = "audio/mha1"
            goto L_0x040d
        L_0x03c7:
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 != r5) goto L_0x03ce
            r5 = r6
            goto L_0x040d
        L_0x03ce:
            r5 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 != r5) goto L_0x03d6
            java.lang.String r5 = "audio/alac"
            goto L_0x040d
        L_0x03d6:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 != r5) goto L_0x03de
            java.lang.String r5 = "audio/g711-alaw"
            goto L_0x040d
        L_0x03de:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 != r5) goto L_0x03e6
            java.lang.String r5 = "audio/g711-mlaw"
            goto L_0x040d
        L_0x03e6:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 != r5) goto L_0x03ee
            java.lang.String r5 = "audio/opus"
            goto L_0x040d
        L_0x03ee:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r5) goto L_0x03f6
            java.lang.String r5 = "audio/flac"
            goto L_0x040d
        L_0x03f6:
            r5 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r7 != r5) goto L_0x03fe
            java.lang.String r5 = "audio/true-hd"
            goto L_0x040d
        L_0x03fe:
            r5 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r7 != r5) goto L_0x0406
            java.lang.String r5 = "audio/iamf"
            goto L_0x040d
        L_0x0406:
            r5 = 0
            goto L_0x040d
        L_0x0408:
            java.lang.String r5 = "audio/mpeg"
            goto L_0x040d
        L_0x040b:
            java.lang.String r5 = "audio/vnd.dts.hd"
        L_0x040d:
            r36 = r0
            r11 = r5
            r34 = r8
            r35 = r12
            r7 = r55
            r5 = r57
            r8 = r58
            r0 = 0
            r37 = 0
            r59 = 0
        L_0x041f:
            int r12 = r8 - r14
            if (r12 >= r15) goto L_0x0cc1
            r9.H(r8)
            int r12 = r61.i()
            r38 = r15
            if (r12 <= 0) goto L_0x0430
            r15 = 1
            goto L_0x0431
        L_0x0430:
            r15 = 0
        L_0x0431:
            p1.C1332b.d(r2, r15)
            int r15 = r61.i()
            r39 = r14
            r14 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r15 != r14) goto L_0x04ae
            r14 = 8
            int r15 = r8 + 8
            r9.H(r15)
            r14 = 1
            r9.I(r14)
            int r15 = r61.v()
            r9.I(r14)
            boolean r31 = j$.util.Objects.equals(r11, r6)
            if (r31 == 0) goto L_0x046c
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r40 = r6
            java.lang.Object[] r6 = new java.lang.Object[r14]
            r14 = 0
            r6[r14] = r15
            java.lang.String r15 = "mhm1.%02X"
            java.lang.String r6 = java.lang.String.format(r15, r6)
            r41 = r2
            r2 = r6
            goto L_0x0480
        L_0x046c:
            r40 = r6
            r14 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r41 = r2
            r15 = 1
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r14] = r6
            java.lang.String r6 = "mha1.%02X"
            java.lang.String r2 = java.lang.String.format(r6, r2)
        L_0x0480:
            int r6 = r61.B()
            byte[] r15 = new byte[r6]
            r9.g(r15, r14, r6)
            if (r0 != 0) goto L_0x0490
            H3.i0 r0 = H3.O.r(r15)
            goto L_0x049a
        L_0x0490:
            java.lang.Object r0 = r0.get(r14)
            byte[] r0 = (byte[]) r0
            H3.i0 r0 = H3.O.s(r15, r0)
        L_0x049a:
            r43 = r1
            r37 = r2
        L_0x049e:
            r1 = r3
            r6 = r7
            r15 = r8
            r46 = r11
            r7 = r12
            r12 = r13
            r2 = 0
            r22 = 2
            r25 = 7
            r13 = r9
            r11 = r10
            goto L_0x0cac
        L_0x04ae:
            r41 = r2
            r40 = r6
            r2 = 1835557200(0x6d686150, float:4.4948854E27)
            if (r15 != r2) goto L_0x04de
            r2 = 8
            int r6 = r8 + 8
            r9.H(r6)
            int r2 = r61.v()
            if (r2 <= 0) goto L_0x04db
            byte[] r6 = new byte[r2]
            r14 = 0
            r9.g(r6, r14, r2)
            if (r0 != 0) goto L_0x04d1
            H3.i0 r0 = H3.O.r(r6)
            goto L_0x04db
        L_0x04d1:
            java.lang.Object r0 = r0.get(r14)
            byte[] r0 = (byte[]) r0
            H3.i0 r0 = H3.O.s(r0, r6)
        L_0x04db:
            r43 = r1
            goto L_0x049e
        L_0x04de:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 == r2) goto L_0x04ea
            if (r66 == 0) goto L_0x0509
            r6 = 2002876005(0x77617665, float:4.5729223E33)
            if (r15 != r6) goto L_0x0509
        L_0x04ea:
            r42 = r0
            r43 = r1
            r1 = r3
            r6 = r7
            r49 = r8
            r46 = r11
            r50 = r12
            r12 = r13
            r3 = 9
            r7 = 3
            r8 = 5
            r14 = 12
            r22 = 2
            r25 = 7
            r13 = r9
            r11 = r10
            r9 = 66
            r10 = 13
            goto L_0x0ba5
        L_0x0509:
            r2 = 1684103987(0x64616333, float:1.6630662E22)
            if (r15 != r2) goto L_0x0592
            r2 = 8
            int r6 = r8 + 8
            r9.H(r6)
            java.lang.String r6 = java.lang.Integer.toString(r62)
            N1.f r14 = new N1.f
            r14.<init>()
            r14.q(r9)
            r15 = 2
            int r30 = r14.i(r15)
            int[] r15 = p1.C1332b.f14343d
            r15 = r15[r30]
            r14.u(r2)
            int[] r2 = p1.C1332b.f14344f
            r42 = r0
            r0 = 3
            int r43 = r14.i(r0)
            r0 = r2[r43]
            r2 = 1
            int r31 = r14.i(r2)
            if (r31 == 0) goto L_0x0540
            int r0 = r0 + r2
        L_0x0540:
            r2 = 5
            int r43 = r14.i(r2)
            int[] r2 = p1.C1332b.f14345g
            r2 = r2[r43]
            int r2 = r2 * 1000
            r14.c()
            int r14 = r14.f()
            r9.H(r14)
            M0.q r14 = new M0.q
            r14.<init>()
            r14.f2989a = r6
            java.lang.String r6 = M0.I.o(r1)
            r14.f2999m = r6
            r14.f2979B = r0
            r14.f2980C = r15
            r14.f3003q = r4
            r14.f2992d = r10
            r14.f2995h = r2
            r14.i = r2
            M0.r r0 = new M0.r
            r0.<init>(r14)
            r13.f618d = r0
            r43 = r1
            r1 = r3
            r6 = r7
            r49 = r8
            r46 = r11
            r50 = r12
            r12 = r13
        L_0x0580:
            r3 = 9
            r7 = 3
            r8 = 5
            r14 = 12
            r22 = 2
            r25 = 7
            r13 = r9
            r11 = r10
            r9 = 66
            r10 = 13
            goto L_0x0ba2
        L_0x0592:
            r42 = r0
            r0 = 1684366131(0x64656333, float:1.692581E22)
            if (r15 != r0) goto L_0x0646
            r0 = 8
            int r2 = r8 + 8
            r9.H(r2)
            java.lang.String r0 = java.lang.Integer.toString(r62)
            N1.f r2 = new N1.f
            r2.<init>()
            r2.q(r9)
            r6 = 13
            int r14 = r2.i(r6)
            int r14 = r14 * 1000
            r6 = 3
            r2.u(r6)
            r15 = 2
            int r43 = r2.i(r15)
            int[] r15 = p1.C1332b.f14343d
            r15 = r15[r43]
            r6 = 10
            r2.u(r6)
            int[] r6 = p1.C1332b.f14344f
            r43 = r1
            r1 = 3
            int r44 = r2.i(r1)
            r6 = r6[r44]
            r1 = 1
            int r31 = r2.i(r1)
            if (r31 == 0) goto L_0x05d9
            int r6 = r6 + r1
        L_0x05d9:
            r1 = 3
            r2.u(r1)
            r1 = 4
            int r44 = r2.i(r1)
            r1 = 1
            r2.u(r1)
            if (r44 <= 0) goto L_0x05fa
            r44 = r7
            r7 = 6
            r2.u(r7)
            int r7 = r2.i(r1)
            if (r7 == 0) goto L_0x05f6
            r7 = 2
            int r6 = r6 + r7
        L_0x05f6:
            r2.u(r1)
            goto L_0x05fc
        L_0x05fa:
            r44 = r7
        L_0x05fc:
            int r7 = r2.b()
            r1 = 7
            if (r7 <= r1) goto L_0x0610
            r2.u(r1)
            r1 = 1
            int r7 = r2.i(r1)
            if (r7 == 0) goto L_0x0610
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x0612
        L_0x0610:
            r1 = r17
        L_0x0612:
            r2.c()
            int r2 = r2.f()
            r9.H(r2)
            M0.q r2 = new M0.q
            r2.<init>()
            r2.f2989a = r0
            java.lang.String r0 = M0.I.o(r1)
            r2.f2999m = r0
            r2.f2979B = r6
            r2.f2980C = r15
            r2.f3003q = r4
            r2.f2992d = r10
            r2.i = r14
            M0.r r0 = new M0.r
            r0.<init>(r2)
            r13.f618d = r0
            r1 = r3
            r49 = r8
            r46 = r11
            r50 = r12
            r12 = r13
            r6 = r44
            goto L_0x0580
        L_0x0646:
            r43 = r1
            r44 = r7
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r15 != r0) goto L_0x0a00
            r0 = 8
            int r1 = r8 + 8
            r9.H(r1)
            java.lang.String r0 = java.lang.Integer.toString(r62)
            N1.f r1 = new N1.f
            r1.<init>()
            r1.q(r9)
            int r2 = r1.b()
            r6 = 3
            int r7 = r1.i(r6)
            r6 = 1
            if (r7 > r6) goto L_0x09ed
            r14 = 7
            int r15 = r1.i(r14)
            boolean r14 = r1.h()
            if (r14 == 0) goto L_0x067e
            r14 = 48000(0xbb80, float:6.7262E-41)
        L_0x067c:
            r6 = 4
            goto L_0x0682
        L_0x067e:
            r14 = 44100(0xac44, float:6.1797E-41)
            goto L_0x067c
        L_0x0682:
            r1.u(r6)
            r45 = r5
            r6 = 9
            int r5 = r1.i(r6)
            r6 = 1
            if (r15 <= r6) goto L_0x06bd
            if (r7 == 0) goto L_0x06aa
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x06a8
            r6 = 16
            r1.u(r6)
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x06a8
            r6 = 128(0x80, float:1.794E-43)
            r1.u(r6)
        L_0x06a8:
            r6 = 1
            goto L_0x06bd
        L_0x06aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid AC-4 DSI version: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x06bd:
            if (r7 != r6) goto L_0x06d5
            int r6 = r1.b()
            r15 = 66
            if (r6 < r15) goto L_0x06ce
            r1.u(r15)
            r1.c()
            goto L_0x06d5
        L_0x06ce:
            java.lang.String r0 = "Invalid AC-4 DSI bitrate."
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x06d5:
            V0.j r6 = new V0.j
            r6.<init>()
            r15 = 1
            r6.f5529a = r15
            r15 = -1
            r6.f5530b = r15
            r6.f5531c = r15
            r15 = 1
            r6.f5532d = r15
            r15 = 2
            r6.e = r15
            r15 = 0
            r6.f5533f = r15
            r46 = r11
            r15 = 0
        L_0x06ee:
            if (r15 >= r5) goto L_0x0920
            if (r7 != 0) goto L_0x070e
            boolean r5 = r1.h()
            r11 = 5
            int r48 = r1.i(r11)
            int r49 = r1.i(r11)
            r51 = r3
            r50 = r12
            r12 = r49
            r9 = 0
            r11 = 0
            r49 = r8
            r8 = r48
            r48 = 0
            goto L_0x0760
        L_0x070e:
            r30 = r5
            r11 = 8
            int r5 = r1.i(r11)
            int r9 = r1.i(r11)
            r11 = 255(0xff, float:3.57E-43)
            if (r9 != r11) goto L_0x0728
            r11 = 16
            int r49 = r1.i(r11)
            int r49 = r49 + r9
        L_0x0726:
            r9 = 2
            goto L_0x072b
        L_0x0728:
            r49 = r9
            goto L_0x0726
        L_0x072b:
            if (r5 <= r9) goto L_0x073b
            r9 = 8
            int r5 = r49 * 8
            r1.u(r5)
            r5 = 1
            int r15 = r15 + r5
            r9 = r61
            r5 = r30
            goto L_0x06ee
        L_0x073b:
            r9 = 8
            int r11 = r1.b()
            int r11 = r2 - r11
            int r11 = r11 / r9
            r48 = r5
            r9 = 5
            int r5 = r1.i(r9)
            r9 = 31
            if (r5 != r9) goto L_0x0751
            r9 = 1
            goto L_0x0752
        L_0x0751:
            r9 = 0
        L_0x0752:
            r51 = r3
            r50 = r12
            r12 = r48
            r48 = r11
            r11 = r49
            r49 = r8
            r8 = r5
            r5 = 0
        L_0x0760:
            if (r5 != 0) goto L_0x076c
            if (r9 != 0) goto L_0x076c
            r3 = 6
            if (r8 != r3) goto L_0x076c
            r52 = r13
            r3 = 1
            goto L_0x0884
        L_0x076c:
            r52 = r13
            r3 = 3
            int r13 = r1.i(r3)
            r6.f5533f = r13
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x077f
            r3 = 5
            r1.u(r3)
        L_0x077f:
            r3 = 2
            r1.u(r3)
            r13 = 1
            if (r7 != r13) goto L_0x078b
            if (r12 == r13) goto L_0x078d
            if (r12 != r3) goto L_0x078b
            goto L_0x078d
        L_0x078b:
            r3 = 5
            goto L_0x0791
        L_0x078d:
            r1.u(r3)
            goto L_0x078b
        L_0x0791:
            r1.u(r3)
            r3 = 10
            r1.u(r3)
            if (r7 != r13) goto L_0x07e1
            if (r12 <= 0) goto L_0x07a3
            boolean r3 = r1.h()
            r6.f5529a = r3
        L_0x07a3:
            boolean r3 = r6.f5529a
            if (r3 == 0) goto L_0x07da
            if (r12 == r13) goto L_0x07ac
            r3 = 2
            if (r12 != r3) goto L_0x07ae
        L_0x07ac:
            r3 = 5
            goto L_0x07b1
        L_0x07ae:
            r13 = 24
            goto L_0x07d5
        L_0x07b1:
            int r13 = r1.i(r3)
            if (r13 < 0) goto L_0x07bd
            r3 = 15
            if (r13 > r3) goto L_0x07bd
            r6.f5530b = r13
        L_0x07bd:
            r3 = 11
            if (r13 < r3) goto L_0x07d3
            r3 = 14
            if (r13 > r3) goto L_0x07d3
            boolean r3 = r1.h()
            r6.f5532d = r3
            r3 = 2
            int r13 = r1.i(r3)
            r6.e = r13
            goto L_0x07ae
        L_0x07d3:
            r3 = 2
            goto L_0x07ae
        L_0x07d5:
            r1.u(r13)
        L_0x07d8:
            r13 = 1
            goto L_0x07dc
        L_0x07da:
            r3 = 2
            goto L_0x07d8
        L_0x07dc:
            if (r12 == r13) goto L_0x07e3
            if (r12 != r3) goto L_0x07e1
            goto L_0x07e3
        L_0x07e1:
            r3 = 1
            goto L_0x080c
        L_0x07e3:
            boolean r13 = r1.h()
            if (r13 == 0) goto L_0x07f2
            boolean r13 = r1.h()
            if (r13 == 0) goto L_0x07f2
            r1.u(r3)
        L_0x07f2:
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x07e1
            r1.t()
            r3 = 8
            int r13 = r1.i(r3)
            r10 = 0
        L_0x0802:
            if (r10 >= r13) goto L_0x07e1
            r1.u(r3)
            r3 = 1
            int r10 = r10 + r3
            r3 = 8
            goto L_0x0802
        L_0x080c:
            if (r5 != 0) goto L_0x0874
            if (r9 == 0) goto L_0x0812
            goto L_0x0874
        L_0x0812:
            r1.t()
            if (r8 == 0) goto L_0x085f
            if (r8 == r3) goto L_0x085f
            r5 = 2
            if (r8 == r5) goto L_0x085f
            r5 = 3
            if (r8 == r5) goto L_0x084a
            r5 = 4
            if (r8 == r5) goto L_0x084a
            r5 = 5
            if (r8 == r5) goto L_0x0834
            r5 = 7
            int r8 = r1.i(r5)
            r5 = 0
        L_0x082b:
            if (r5 >= r8) goto L_0x087d
            r9 = 8
            r1.u(r9)
            int r5 = r5 + r3
            goto L_0x082b
        L_0x0834:
            if (r12 != 0) goto L_0x083a
            p1.C1332b.q(r1, r6)
            goto L_0x087d
        L_0x083a:
            r5 = 3
            int r8 = r1.i(r5)
            r5 = 0
        L_0x0840:
            r9 = 2
            int r10 = r8 + 2
            if (r5 >= r10) goto L_0x087d
            p1.C1332b.r(r1, r6)
            int r5 = r5 + r3
            goto L_0x0840
        L_0x084a:
            if (r12 != 0) goto L_0x0855
            r5 = 0
            r8 = 3
        L_0x084e:
            if (r5 >= r8) goto L_0x087d
            p1.C1332b.q(r1, r6)
            int r5 = r5 + r3
            goto L_0x084e
        L_0x0855:
            r8 = 3
            r5 = 0
        L_0x0857:
            if (r5 >= r8) goto L_0x087d
            p1.C1332b.r(r1, r6)
            int r5 = r5 + r3
            r8 = 3
            goto L_0x0857
        L_0x085f:
            if (r12 != 0) goto L_0x086a
            r5 = 0
            r8 = 2
        L_0x0863:
            if (r5 >= r8) goto L_0x087d
            p1.C1332b.q(r1, r6)
            int r5 = r5 + r3
            goto L_0x0863
        L_0x086a:
            r8 = 2
            r5 = 0
        L_0x086c:
            if (r5 >= r8) goto L_0x087d
            p1.C1332b.r(r1, r6)
            int r5 = r5 + r3
            r8 = 2
            goto L_0x086c
        L_0x0874:
            if (r12 != 0) goto L_0x087a
            p1.C1332b.q(r1, r6)
            goto L_0x087d
        L_0x087a:
            p1.C1332b.r(r1, r6)
        L_0x087d:
            r1.t()
            boolean r3 = r1.h()
        L_0x0884:
            if (r3 == 0) goto L_0x0896
            r3 = 7
            int r5 = r1.i(r3)
            r3 = 0
        L_0x088c:
            if (r3 >= r5) goto L_0x0896
            r8 = 15
            r1.u(r8)
            r9 = 1
            int r3 = r3 + r9
            goto L_0x088c
        L_0x0896:
            if (r12 <= 0) goto L_0x08e4
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x08b6
            int r3 = r1.b()
            r9 = 66
            if (r3 >= r9) goto L_0x08a8
            r3 = 0
            goto L_0x08ac
        L_0x08a8:
            r1.u(r9)
            r3 = 1
        L_0x08ac:
            if (r3 == 0) goto L_0x08af
            goto L_0x08b8
        L_0x08af:
            java.lang.String r0 = "Can't parse bitrate DSI."
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x08b6:
            r9 = 66
        L_0x08b8:
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x08e2
            r1.c()
            r3 = 16
            int r5 = r1.i(r3)
            r1.v(r5)
            r8 = 5
            int r3 = r1.i(r8)
            r5 = 0
        L_0x08d0:
            if (r5 >= r3) goto L_0x08de
            r10 = 3
            r1.u(r10)
            r10 = 8
            r1.u(r10)
            r12 = 1
            int r5 = r5 + r12
            goto L_0x08d0
        L_0x08de:
            r10 = 8
            r12 = 1
            goto L_0x08e8
        L_0x08e2:
            r8 = 5
            goto L_0x08de
        L_0x08e4:
            r8 = 5
            r9 = 66
            goto L_0x08de
        L_0x08e8:
            r1.c()
            if (r7 != r12) goto L_0x0903
            int r3 = r1.b()
            int r2 = r2 - r3
            int r2 = r2 / r10
            int r2 = r2 - r48
            if (r11 < r2) goto L_0x08fc
            int r11 = r11 - r2
            r1.v(r11)
            goto L_0x0903
        L_0x08fc:
            java.lang.String r0 = "pres_bytes is smaller than presentation bytes read."
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x0903:
            boolean r1 = r6.f5529a
            if (r1 == 0) goto L_0x092b
            int r1 = r6.f5530b
            r2 = -1
            if (r1 == r2) goto L_0x090d
            goto L_0x092b
        L_0x090d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't determine channel mode of presentation "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x0920:
            r51 = r3
            r49 = r8
            r50 = r12
            r52 = r13
            r8 = 5
            r9 = 66
        L_0x092b:
            boolean r1 = r6.f5529a
            if (r1 == 0) goto L_0x099d
            int r1 = r6.f5530b
            boolean r2 = r6.f5532d
            int r3 = r6.e
            switch(r1) {
                case 0: goto L_0x0974;
                case 1: goto L_0x096f;
                case 2: goto L_0x096a;
                case 3: goto L_0x0965;
                case 4: goto L_0x0960;
                case 5: goto L_0x095b;
                case 6: goto L_0x0956;
                case 7: goto L_0x095b;
                case 8: goto L_0x0956;
                case 9: goto L_0x095b;
                case 10: goto L_0x0956;
                case 11: goto L_0x0951;
                case 12: goto L_0x094c;
                case 13: goto L_0x0947;
                case 14: goto L_0x0942;
                case 15: goto L_0x093d;
                default: goto L_0x0938;
            }
        L_0x0938:
            r5 = 11
            r47 = -1
            goto L_0x0978
        L_0x093d:
            r5 = 11
            r47 = 24
            goto L_0x0978
        L_0x0942:
            r5 = 11
            r47 = 14
            goto L_0x0978
        L_0x0947:
            r5 = 11
            r47 = 13
            goto L_0x0978
        L_0x094c:
            r5 = 11
            r47 = 12
            goto L_0x0978
        L_0x0951:
            r5 = 11
            r47 = 11
            goto L_0x0978
        L_0x0956:
            r5 = 11
            r47 = 8
            goto L_0x0978
        L_0x095b:
            r5 = 11
            r47 = 7
            goto L_0x0978
        L_0x0960:
            r5 = 11
            r47 = 6
            goto L_0x0978
        L_0x0965:
            r5 = 11
            r47 = 5
            goto L_0x0978
        L_0x096a:
            r5 = 11
            r47 = 3
            goto L_0x0978
        L_0x096f:
            r5 = 11
            r47 = 2
            goto L_0x0978
        L_0x0974:
            r5 = 11
            r47 = 1
        L_0x0978:
            if (r1 == r5) goto L_0x0987
            r5 = 12
            if (r1 == r5) goto L_0x0987
            r10 = 13
            if (r1 == r10) goto L_0x0989
            r5 = 14
            if (r1 != r5) goto L_0x0998
            goto L_0x0989
        L_0x0987:
            r10 = 13
        L_0x0989:
            if (r2 != 0) goto L_0x098d
            int r47 = r47 + -2
        L_0x098d:
            if (r3 == 0) goto L_0x0996
            r1 = 1
            if (r3 == r1) goto L_0x0993
            goto L_0x0998
        L_0x0993:
            int r47 = r47 + -2
            goto L_0x0998
        L_0x0996:
            int r47 = r47 + -4
        L_0x0998:
            r1 = r47
        L_0x099a:
            r3 = 16
            goto L_0x09b1
        L_0x099d:
            r10 = 13
            int r1 = r6.f5531c
            int r2 = r6.f5533f
            r3 = 4
            if (r2 != r3) goto L_0x099a
            r3 = 16
            if (r1 != r3) goto L_0x09ad
            r47 = 21
            goto L_0x09af
        L_0x09ad:
            r47 = r1
        L_0x09af:
            r1 = r47
        L_0x09b1:
            if (r1 <= 0) goto L_0x09e6
            M0.q r2 = new M0.q
            r2.<init>()
            r2.f2989a = r0
            java.lang.String r0 = M0.I.o(r16)
            r2.f2999m = r0
            r2.f2979B = r1
            r2.f2980C = r14
            r2.f3003q = r4
            r11 = r64
            r2.f2992d = r11
            M0.r r0 = new M0.r
            r0.<init>(r2)
            r12 = r52
            r12.f618d = r0
            r6 = r44
            r5 = r45
            r1 = r51
            r3 = 9
            r7 = 3
            r14 = 12
            r22 = 2
            r25 = 7
            r13 = r61
            goto L_0x0ba2
        L_0x09e6:
            java.lang.String r0 = "Can't determine channel count of presentation."
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x09ed:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported AC-4 DSI version: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x0a00:
            r51 = r3
            r45 = r5
            r49 = r8
            r46 = r11
            r50 = r12
            r12 = r13
            r3 = 16
            r8 = 5
            r9 = 66
            r11 = r10
            r10 = 13
            r0 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r15 != r0) goto L_0x0a43
            if (r51 <= 0) goto L_0x0a2d
            r0 = r42
            r15 = r49
            r7 = r50
            r1 = r51
            r6 = r1
            r2 = 0
            r5 = 2
            r22 = 2
            r25 = 7
            r13 = r61
            goto L_0x0cac
        L_0x0a2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.<init>(r1)
            r1 = r51
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x0a43:
            r1 = r51
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r15 == r0) goto L_0x0a4f
            r0 = 1969517683(0x75647473, float:2.8960097E32)
            if (r15 != r0) goto L_0x0a5c
        L_0x0a4f:
            r3 = 9
            r7 = 3
            r14 = 12
            r22 = 2
            r25 = 7
            r13 = r61
            goto L_0x0b7e
        L_0x0a5c:
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r15 != r0) goto L_0x0a8b
            r5 = 8
            int r0 = r50 + -8
            byte[] r2 = f2359a
            int r6 = r2.length
            int r6 = r6 + r0
            byte[] r6 = java.util.Arrays.copyOf(r2, r6)
            int r7 = r49 + 8
            r13 = r61
            r13.H(r7)
            int r2 = r2.length
            r13.g(r6, r2, r0)
            java.util.ArrayList r0 = p1.C1332b.b(r6)
            r6 = r44
            r5 = r45
            r15 = r49
            r7 = r50
            r2 = 0
            r22 = 2
        L_0x0a87:
            r25 = 7
            goto L_0x0cac
        L_0x0a8b:
            r5 = 8
            r13 = r61
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r15 != r0) goto L_0x0ac8
            r14 = 12
            int r0 = r50 + -12
            int r2 = r50 + -8
            byte[] r2 = new byte[r2]
            r6 = 102(0x66, float:1.43E-43)
            r7 = 0
            r2[r7] = r6
            r6 = 76
            r7 = 1
            r2[r7] = r6
            r6 = 97
            r22 = 2
            r2[r22] = r6
            r6 = 67
            r7 = 3
            r2[r7] = r6
            int r6 = r49 + 12
            r13.H(r6)
            r6 = 4
            r13.g(r2, r6, r0)
            H3.i0 r0 = H3.O.r(r2)
            r6 = r44
            r5 = r45
        L_0x0ac2:
            r15 = r49
            r7 = r50
            r2 = 0
            goto L_0x0a87
        L_0x0ac8:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r6 = 4
            r7 = 3
            r14 = 12
            r22 = 2
            if (r15 != r0) goto L_0x0b1d
            int r2 = r50 + -12
            byte[] r15 = new byte[r2]
            int r0 = r49 + 12
            r13.H(r0)
            r0 = 0
            r13.g(r15, r0, r2)
            byte[] r0 = P0.a.f3688a
            P0.r r0 = new P0.r
            r0.<init>((byte[]) r15)
            r2 = 9
            r0.H(r2)
            int r2 = r0.v()
            r3 = 20
            r0.H(r3)
            int r0 = r0.z()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            H3.i0 r3 = H3.O.r(r15)
            r5 = r0
            r6 = r2
            r0 = r3
            goto L_0x0ac2
        L_0x0b1d:
            r0 = 1767990114(0x69616362, float:1.7029852E25)
            r3 = 9
            if (r15 != r0) goto L_0x0b77
            int r0 = r49 + 9
            r13.H(r0)
            r23 = r18
            r0 = 0
        L_0x0b2c:
            if (r0 >= r3) goto L_0x0b5c
            int r2 = r13.f3733b
            int r15 = r13.f3734c
            if (r2 == r15) goto L_0x0b54
            int r2 = r61.v()
            long r5 = (long) r2
            r27 = 127(0x7f, double:6.27E-322)
            long r27 = r5 & r27
            r25 = 7
            int r2 = r0 * 7
            long r27 = r27 << r2
            long r23 = r23 | r27
            r27 = 128(0x80, double:6.32E-322)
            long r5 = r5 & r27
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0b4e
            goto L_0x0b5e
        L_0x0b4e:
            r2 = 1
            int r0 = r0 + r2
            r5 = 8
            r6 = 4
            goto L_0x0b2c
        L_0x0b54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempting to read a byte over the limit."
            r0.<init>(r1)
            throw r0
        L_0x0b5c:
            r25 = 7
        L_0x0b5e:
            int r0 = E.e.c(r23)
            byte[] r2 = new byte[r0]
            r5 = 0
            r13.g(r2, r5, r0)
            H3.i0 r0 = H3.O.r(r2)
            r6 = r44
            r5 = r45
        L_0x0b70:
            r15 = r49
            r7 = r50
            r2 = 0
            goto L_0x0cac
        L_0x0b77:
            r25 = 7
            r6 = r44
            r5 = r45
            goto L_0x0ba2
        L_0x0b7e:
            M0.q r0 = new M0.q
            r0.<init>()
            java.lang.String r2 = java.lang.Integer.toString(r62)
            r0.f2989a = r2
            java.lang.String r2 = M0.I.o(r46)
            r0.f2999m = r2
            r5 = r45
            r0.f2979B = r5
            r6 = r44
            r0.f2980C = r6
            r0.f3003q = r4
            r0.f2992d = r11
            M0.r r2 = new M0.r
            r2.<init>(r0)
            r12.f618d = r2
        L_0x0ba2:
            r0 = r42
            goto L_0x0b70
        L_0x0ba5:
            if (r15 != r2) goto L_0x0bb0
            r9 = r41
            r0 = r49
            r15 = r0
            r7 = r50
        L_0x0bae:
            r2 = -1
            goto L_0x0bea
        L_0x0bb0:
            int r0 = r13.f3733b
            r15 = r49
            if (r0 < r15) goto L_0x0bb9
            r3 = 1
        L_0x0bb7:
            r8 = 0
            goto L_0x0bbb
        L_0x0bb9:
            r3 = 0
            goto L_0x0bb7
        L_0x0bbb:
            p1.C1332b.d(r8, r3)
        L_0x0bbe:
            int r3 = r0 - r15
            r7 = r50
            if (r3 >= r7) goto L_0x0be6
            r13.H(r0)
            int r3 = r61.i()
            r9 = r41
            if (r3 <= 0) goto L_0x0bd1
            r8 = 1
            goto L_0x0bd2
        L_0x0bd1:
            r8 = 0
        L_0x0bd2:
            p1.C1332b.d(r9, r8)
            int r8 = r61.i()
            if (r8 != r2) goto L_0x0bdc
            goto L_0x0bae
        L_0x0bdc:
            int r0 = r0 + r3
            r50 = r7
            r41 = r9
            r7 = 3
            r8 = 0
            r9 = 66
            goto L_0x0bbe
        L_0x0be6:
            r9 = r41
            r0 = -1
            goto L_0x0bae
        L_0x0bea:
            if (r0 == r2) goto L_0x0ca3
            J1.b r0 = a(r0, r13)
            java.lang.Object r3 = r0.f2349W
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r8 = r0.f2350X
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x0c99
            java.lang.String r2 = "audio/vorbis"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0c69
            P0.r r2 = new P0.r
            r2.<init>((byte[]) r8)
            r10 = 1
            r2.I(r10)
            r14 = 0
        L_0x0c0c:
            int r31 = r2.a()
            if (r31 <= 0) goto L_0x0c24
            int r10 = r2.f()
            r41 = r9
            r9 = 255(0xff, float:3.57E-43)
            if (r10 != r9) goto L_0x0c28
            int r14 = r14 + r9
            r10 = 1
            r2.I(r10)
            r9 = r41
            goto L_0x0c0c
        L_0x0c24:
            r41 = r9
            r9 = 255(0xff, float:3.57E-43)
        L_0x0c28:
            int r10 = r2.v()
            int r10 = r10 + r14
            r14 = 0
        L_0x0c2e:
            int r21 = r2.a()
            if (r21 <= 0) goto L_0x0c46
            r21 = r0
            int r0 = r2.f()
            if (r0 != r9) goto L_0x0c44
            int r14 = r14 + r9
            r0 = 1
            r2.I(r0)
            r0 = r21
            goto L_0x0c2e
        L_0x0c44:
            r0 = 1
            goto L_0x0c49
        L_0x0c46:
            r21 = r0
            goto L_0x0c44
        L_0x0c49:
            int r31 = r2.v()
            int r31 = r31 + r14
            byte[] r14 = new byte[r10]
            int r2 = r2.f3733b
            r0 = 0
            java.lang.System.arraycopy(r8, r2, r14, r0, r10)
            int r2 = r2 + r10
            int r2 = r2 + r31
            int r10 = r8.length
            int r10 = r10 - r2
            byte[] r9 = new byte[r10]
            java.lang.System.arraycopy(r8, r2, r9, r0, r10)
            H3.i0 r0 = H3.O.s(r14, r9)
            r59 = r21
            r2 = 0
            goto L_0x0caa
        L_0x0c69:
            r21 = r0
            r41 = r9
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0c8c
            N1.f r0 = new N1.f
            int r2 = r8.length
            r0.<init>((int) r2, (byte[]) r8)
            r2 = 0
            p1.a r0 = p1.C1332b.p(r0, r2)
            int r5 = r0.f14338b
            int r6 = r0.f14339c
            java.lang.String r0 = r0.f14337a
            r60 = r6
            r6 = r5
            r5 = r60
            goto L_0x0c8f
        L_0x0c8c:
            r2 = 0
            r0 = r37
        L_0x0c8f:
            H3.i0 r8 = H3.O.r(r8)
            r37 = r0
            r0 = r8
            r59 = r21
            goto L_0x0caa
        L_0x0c99:
            r21 = r0
            r41 = r9
            r2 = 0
            r59 = r21
            r0 = r42
            goto L_0x0caa
        L_0x0ca3:
            r41 = r9
            r2 = 0
            r0 = r42
            r3 = r46
        L_0x0caa:
            r46 = r3
        L_0x0cac:
            int r8 = r15 + r7
            r3 = r1
            r7 = r6
            r10 = r11
            r9 = r13
            r15 = r38
            r14 = r39
            r6 = r40
            r2 = r41
            r1 = r43
            r11 = r46
            r13 = r12
            goto L_0x041f
        L_0x0cc1:
            r42 = r0
            r40 = r6
            r6 = r7
            r46 = r11
            r12 = r13
            r39 = r14
            r38 = r15
            r2 = 0
            r22 = 2
            r25 = 7
            r13 = r9
            r11 = r10
            java.lang.Object r0 = r12.f618d
            M0.r r0 = (M0.r) r0
            if (r0 != 0) goto L_0x0d1c
            if (r46 == 0) goto L_0x0d1c
            M0.q r0 = new M0.q
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r62)
            r0.f2989a = r1
            java.lang.String r1 = M0.I.o(r46)
            r0.f2999m = r1
            r1 = r37
            r0.f2996j = r1
            r0.f2979B = r5
            r0.f2980C = r6
            r1 = r36
            r0.f2981D = r1
            r1 = r42
            r0.f3002p = r1
            r0.f3003q = r4
            r0.f2992d = r11
            r1 = r59
            if (r1 == 0) goto L_0x0d15
            long r3 = r1.f2347U
            int r3 = E.e.u(r3)
            r0.f2995h = r3
            long r3 = r1.f2348V
            int r1 = E.e.u(r3)
            r0.i = r1
        L_0x0d15:
            M0.r r1 = new M0.r
            r1.<init>(r0)
            r12.f618d = r1
        L_0x0d1c:
            r25 = r34
            r31 = r40
            r9 = 16
            r10 = 0
            r14 = 2
            r15 = 1
            r20 = 8
            r21 = 255(0xff, float:3.57E-43)
            r22 = 10
            r24 = 9
            r26 = 1835365492(0x6d657474, float:4.4383032E27)
            r28 = 5
            r30 = 0
            r32 = 7
            goto L_0x0d77
        L_0x0d37:
            r40 = r6
            r34 = r8
            r11 = r10
            r35 = r12
            r12 = r13
            r39 = r14
            r38 = r15
            r2 = 0
            r22 = 2
            r25 = 7
            r13 = r9
            r3 = 1
            goto L_0x00a2
        L_0x0d4c:
            r0 = r61
            r10 = 0
            r1 = r7
            r14 = 2
            r2 = r39
            r15 = 1
            r21 = 255(0xff, float:3.57E-43)
            r22 = 10
            r24 = 9
            r3 = r38
            r26 = 1835365492(0x6d657474, float:4.4383032E27)
            r4 = r62
            r20 = 8
            r30 = 0
            r5 = r63
            r31 = r40
            r6 = r65
            r28 = 5
            r7 = r12
            r25 = r34
            r32 = 7
            r8 = r25
            h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0d77:
            int r0 = r39 + r38
            r13.H(r0)
            int r8 = r25 + 1
            r10 = r11
            r9 = r13
            r6 = r31
            r1 = 0
            r11 = r65
            r13 = r12
            r12 = r35
            goto L_0x0024
        L_0x0d8a:
            r12 = r13
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.f.f(P0.r, int, int, java.lang.String, M0.n, boolean):C3.r");
    }

    /* JADX WARNING: type inference failed for: r5v62, types: [java.lang.Object, J1.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        if (r6 == 0) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d2, code lost:
        r27 = -9223372036854775807L;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x09de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x01ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0623 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList g(Q0.b r62, p1.v r63, long r64, M0.C0126n r66, boolean r67, boolean r68, G3.d r69) {
        /*
            r0 = r62
            r1 = r63
            java.lang.String r2 = "BoxParsers"
            java.lang.String r3 = "audio/raw"
            r6 = -1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
        L_0x000f:
            java.util.ArrayList r11 = r0.f4015Y
            int r12 = r11.size()
            if (r10 >= r12) goto L_0x09e6
            java.lang.Object r11 = r11.get(r10)
            Q0.b r11 = (Q0.b) r11
            int r12 = r11.f4018V
            r13 = 1953653099(0x7472616b, float:7.681346E31)
            if (r12 == r13) goto L_0x002e
            r17 = r2
            r21 = r3
            r0 = r8
            r41 = r10
        L_0x002b:
            r1 = 1
            goto L_0x09c8
        L_0x002e:
            r12 = 1836476516(0x6d766864, float:4.7662196E27)
            Q0.c r12 = r0.t(r12)
            r12.getClass()
            r13 = 1835297121(0x6d646961, float:4.4181236E27)
            Q0.b r14 = r11.r(r13)
            r14.getClass()
            r15 = 1751411826(0x68646c72, float:4.3148E24)
            Q0.c r15 = r14.t(r15)
            r15.getClass()
            P0.r r15 = r15.f4016W
            r9 = 16
            r15.H(r9)
            int r15 = r15.i()
            r4 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r15 != r4) goto L_0x005e
            r4 = 1
            goto L_0x0084
        L_0x005e:
            r4 = 1986618469(0x76696465, float:1.1834389E33)
            if (r15 != r4) goto L_0x0065
            r4 = 2
            goto L_0x0084
        L_0x0065:
            r4 = 1952807028(0x74657874, float:7.272211E31)
            if (r15 == r4) goto L_0x0083
            r4 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r15 == r4) goto L_0x0083
            r4 = 1937072756(0x73756274, float:1.944137E31)
            if (r15 == r4) goto L_0x0083
            r4 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r15 != r4) goto L_0x007a
            goto L_0x0083
        L_0x007a:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r15 != r4) goto L_0x0081
            r4 = 5
            goto L_0x0084
        L_0x0081:
            r4 = -1
            goto L_0x0084
        L_0x0083:
            r4 = 3
        L_0x0084:
            java.lang.String r15 = ""
            r36 = 0
            r13 = 4
            if (r4 != r6) goto L_0x0098
            r0 = r69
            r43 = r2
            r44 = r3
            r42 = r8
            r41 = r10
            r3 = 0
            goto L_0x02e1
        L_0x0098:
            r5 = 1953196132(0x746b6864, float:7.46037E31)
            Q0.c r5 = r11.t(r5)
            r5.getClass()
            P0.r r5 = r5.f4016W
            r9 = 8
            r5.H(r9)
            int r19 = r5.i()
            int r19 = c(r19)
            if (r19 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r9 = 16
        L_0x00b6:
            r5.I(r9)
            int r9 = r5.i()
            r5.I(r13)
            int r13 = r5.f3733b
            if (r19 != 0) goto L_0x00c6
            r7 = 4
            goto L_0x00c8
        L_0x00c6:
            r7 = 8
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= r7) goto L_0x00f6
            byte[] r0 = r5.f3732a
            int r23 = r13 + r6
            byte r0 = r0[r23]
            r23 = r13
            r13 = -1
            if (r0 == r13) goto L_0x00ef
            if (r19 != 0) goto L_0x00e2
            long r6 = r5.x()
            goto L_0x00e6
        L_0x00e2:
            long r6 = r5.A()
        L_0x00e6:
            int r0 = (r6 > r36 ? 1 : (r6 == r36 ? 0 : -1))
            if (r0 != 0) goto L_0x00ec
        L_0x00ea:
            r6 = r21
        L_0x00ec:
            r0 = 16
            goto L_0x00fa
        L_0x00ef:
            r0 = 1
            int r6 = r6 + r0
            r0 = r62
            r13 = r23
            goto L_0x00c9
        L_0x00f6:
            r5.I(r7)
            goto L_0x00ea
        L_0x00fa:
            r5.I(r0)
            int r13 = r5.i()
            int r0 = r5.i()
            r23 = r6
            r6 = 4
            r5.I(r6)
            int r6 = r5.i()
            int r5 = r5.i()
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r13 != 0) goto L_0x0122
            if (r0 != r7) goto L_0x0122
            r7 = -65536(0xffffffffffff0000, float:NaN)
            if (r6 != r7) goto L_0x0124
            if (r5 != 0) goto L_0x0124
            r0 = 90
            goto L_0x013f
        L_0x0122:
            r7 = -65536(0xffffffffffff0000, float:NaN)
        L_0x0124:
            if (r13 != 0) goto L_0x0133
            if (r0 != r7) goto L_0x0133
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 != r7) goto L_0x0131
            if (r5 != 0) goto L_0x0131
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x013f
        L_0x0131:
            r7 = -65536(0xffffffffffff0000, float:NaN)
        L_0x0133:
            if (r13 != r7) goto L_0x013e
            if (r0 != 0) goto L_0x013e
            if (r6 != 0) goto L_0x013e
            if (r5 != r7) goto L_0x013e
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x013f
        L_0x013e:
            r0 = 0
        L_0x013f:
            int r5 = (r64 > r21 ? 1 : (r64 == r21 ? 0 : -1))
            if (r5 != 0) goto L_0x0146
            r25 = r23
            goto L_0x0148
        L_0x0146:
            r25 = r64
        L_0x0148:
            P0.r r5 = r12.f4016W
            Q0.f r5 = d(r5)
            long r5 = r5.f4023W
            int r7 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x015c
            r41 = r10
            r12 = r21
        L_0x0158:
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            goto L_0x016c
        L_0x015c:
            int r7 = P0.z.f3748a
            java.math.RoundingMode r31 = java.math.RoundingMode.DOWN
            r27 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r5
            long r12 = P0.z.W(r25, r27, r29, r31)
            r41 = r10
            goto L_0x0158
        L_0x016c:
            Q0.b r10 = r14.r(r7)
            r10.getClass()
            r7 = 1937007212(0x7374626c, float:1.9362132E31)
            Q0.b r10 = r10.r(r7)
            r10.getClass()
            r7 = 1835296868(0x6d646864, float:4.418049E27)
            Q0.c r7 = r14.t(r7)
            r7.getClass()
            P0.r r7 = r7.f4016W
            r14 = 8
            r7.H(r14)
            int r14 = r7.i()
            int r14 = c(r14)
            r42 = r8
            if (r14 != 0) goto L_0x019d
            r8 = 8
            goto L_0x019f
        L_0x019d:
            r8 = 16
        L_0x019f:
            r7.I(r8)
            long r33 = r7.x()
            int r8 = r7.f3733b
            if (r14 != 0) goto L_0x01ac
            r1 = 4
            goto L_0x01ae
        L_0x01ac:
            r1 = 8
        L_0x01ae:
            r43 = r2
            r2 = 0
        L_0x01b1:
            if (r2 >= r1) goto L_0x01ec
            r44 = r3
            byte[] r3 = r7.f3732a
            int r18 = r8 + r2
            byte r3 = r3[r18]
            r18 = r8
            r8 = -1
            if (r3 == r8) goto L_0x01e5
            if (r14 != 0) goto L_0x01c9
            long r1 = r7.x()
        L_0x01c6:
            r23 = r1
            goto L_0x01ce
        L_0x01c9:
            long r1 = r7.A()
            goto L_0x01c6
        L_0x01ce:
            int r1 = (r23 > r36 ? 1 : (r23 == r36 ? 0 : -1))
            if (r1 != 0) goto L_0x01d5
        L_0x01d2:
            r27 = r21
            goto L_0x01f2
        L_0x01d5:
            int r1 = P0.z.f3748a
            java.math.RoundingMode r29 = java.math.RoundingMode.DOWN
            r25 = 1000000(0xf4240, double:4.940656E-318)
            r27 = r33
            long r1 = P0.z.W(r23, r25, r27, r29)
            r27 = r1
            goto L_0x01f2
        L_0x01e5:
            r3 = 1
            int r2 = r2 + r3
            r8 = r18
            r3 = r44
            goto L_0x01b1
        L_0x01ec:
            r44 = r3
            r7.I(r1)
            goto L_0x01d2
        L_0x01f2:
            int r1 = r7.B()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            int r3 = r1 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            r2.append(r3)
            r3 = 5
            int r7 = r1 >> 5
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r2.append(r7)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r2.append(r1)
            java.lang.String r24 = r2.toString()
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            Q0.c r1 = r10.t(r1)
            if (r1 == 0) goto L_0x09de
            P0.r r1 = r1.f4016W
            r21 = r1
            r22 = r9
            r23 = r0
            r25 = r66
            r26 = r68
            C3.r r0 = f(r21, r22, r23, r24, r25, r26)
            if (r67 != 0) goto L_0x02b0
            r1 = 1701082227(0x65647473, float:6.742798E22)
            Q0.b r1 = r11.r(r1)
            if (r1 == 0) goto L_0x02b0
            r2 = 1701606260(0x656c7374, float:6.9788014E22)
            Q0.c r1 = r1.t(r2)
            if (r1 != 0) goto L_0x024b
            r1 = 0
            goto L_0x02a5
        L_0x024b:
            P0.r r1 = r1.f4016W
            r2 = 8
            r1.H(r2)
            int r2 = r1.i()
            int r2 = c(r2)
            int r7 = r1.z()
            long[] r8 = new long[r7]
            long[] r10 = new long[r7]
            r14 = 0
        L_0x0263:
            if (r14 >= r7) goto L_0x02a1
            r3 = 1
            if (r2 != r3) goto L_0x026d
            long r18 = r1.A()
            goto L_0x0271
        L_0x026d:
            long r18 = r1.x()
        L_0x0271:
            r8[r14] = r18
            if (r2 != r3) goto L_0x0280
            long r18 = r1.p()
            r60 = r18
            r18 = r2
            r2 = r60
            goto L_0x0287
        L_0x0280:
            int r3 = r1.i()
            r18 = r2
            long r2 = (long) r3
        L_0x0287:
            r10[r14] = r2
            short r2 = r1.s()
            r3 = 1
            if (r2 != r3) goto L_0x0299
            r2 = 2
            r1.I(r2)
            int r14 = r14 + r3
            r2 = r18
            r3 = 5
            goto L_0x0263
        L_0x0299:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x02a1:
            android.util.Pair r1 = android.util.Pair.create(r8, r10)
        L_0x02a5:
            if (r1 == 0) goto L_0x02b0
            java.lang.Object r2 = r1.first
            long[] r2 = (long[]) r2
            java.lang.Object r1 = r1.second
            long[] r1 = (long[]) r1
            goto L_0x02b2
        L_0x02b0:
            r1 = 0
            r2 = 0
        L_0x02b2:
            java.lang.Object r3 = r0.f618d
            r29 = r3
            M0.r r29 = (M0.r) r29
            if (r29 != 0) goto L_0x02bc
            r3 = 0
            goto L_0x02df
        L_0x02bc:
            J1.r r3 = new J1.r
            int r7 = r0.f616b
            r30 = r7
            java.lang.Object r7 = r0.f617c
            r31 = r7
            J1.s[] r31 = (J1.s[]) r31
            int r0 = r0.f615a
            r32 = r0
            r18 = r3
            r19 = r9
            r20 = r4
            r21 = r33
            r23 = r5
            r25 = r12
            r33 = r2
            r34 = r1
            r18.<init>(r19, r20, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34)
        L_0x02df:
            r0 = r69
        L_0x02e1:
            java.lang.Object r1 = r0.apply(r3)
            r3 = r1
            J1.r r3 = (J1.r) r3
            if (r3 != 0) goto L_0x02f2
            r0 = r42
            r17 = r43
            r21 = r44
            goto L_0x002b
        L_0x02f2:
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            Q0.b r1 = r11.r(r1)
            r1.getClass()
            r2 = 1835626086(0x6d696e66, float:4.515217E27)
            Q0.b r1 = r1.r(r2)
            r1.getClass()
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            Q0.b r1 = r1.r(r2)
            r1.getClass()
            r2 = 1937011578(0x7374737a, float:1.936741E31)
            Q0.c r2 = r1.t(r2)
            M0.r r4 = r3.f2462g
            if (r2 == 0) goto L_0x0371
            J1.d r5 = new J1.d
            r5.<init>()
            P0.r r2 = r2.f4016W
            r5.f2353W = r2
            r6 = 12
            r2.H(r6)
            int r6 = r2.z()
            java.lang.String r7 = r4.f3036n
            r11 = r44
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0346
            int r7 = r4.f3016E
            int r8 = r4.f3014C
            int r7 = P0.z.A(r7, r8)
            if (r6 == 0) goto L_0x0349
            int r8 = r6 % r7
            if (r8 == 0) goto L_0x0346
            goto L_0x0349
        L_0x0346:
            r12 = r43
            goto L_0x0365
        L_0x0349:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Audio sample size mismatch. stsd sample size: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r9 = ", stsz sample size: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r12 = r43
            P0.l.B(r12, r6)
            r6 = r7
        L_0x0365:
            if (r6 != 0) goto L_0x0368
            r6 = -1
        L_0x0368:
            r5.f2351U = r6
            int r2 = r2.z()
            r5.f2352V = r2
            goto L_0x0383
        L_0x0371:
            r12 = r43
            r11 = r44
            r2 = 1937013298(0x73747a32, float:1.9369489E31)
            Q0.c r2 = r1.t(r2)
            if (r2 == 0) goto L_0x09d6
            J1.e r5 = new J1.e
            r5.<init>(r2)
        L_0x0383:
            int r2 = r5.c()
            if (r2 != 0) goto L_0x03a3
            J1.u r1 = new J1.u
            r2 = 0
            long[] r4 = new long[r2]
            int[] r5 = new int[r2]
            long[] r7 = new long[r2]
            int[] r8 = new int[r2]
            r9 = 0
            r6 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r21 = r11
        L_0x039d:
            r17 = r12
        L_0x039f:
            r0 = r42
            goto L_0x09c3
        L_0x03a3:
            int r6 = r3.f2458b
            r7 = 2
            if (r6 != r7) goto L_0x03f6
            long r6 = r3.f2461f
            int r8 = (r6 > r36 ? 1 : (r6 == r36 ? 0 : -1))
            if (r8 <= 0) goto L_0x03f6
            float r8 = (float) r2
            float r6 = (float) r6
            r7 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r7
            float r8 = r8 / r6
            M0.q r4 = r4.a()
            r4.f3008v = r8
            M0.r r6 = new M0.r
            r6.<init>(r4)
            J1.r r4 = new J1.r
            r17 = r4
            J1.s[] r7 = r3.f2466l
            r30 = r7
            long[] r7 = r3.i
            r32 = r7
            long[] r7 = r3.f2464j
            r33 = r7
            int r7 = r3.f2457a
            r18 = r7
            int r7 = r3.f2458b
            r19 = r7
            long r7 = r3.f2459c
            r20 = r7
            long r7 = r3.f2460d
            r22 = r7
            long r7 = r3.e
            r24 = r7
            long r7 = r3.f2461f
            r26 = r7
            int r7 = r3.f2463h
            r29 = r7
            int r3 = r3.f2465k
            r31 = r3
            r28 = r6
            r17.<init>(r18, r19, r20, r22, r24, r26, r28, r29, r30, r31, r32, r33)
            r3 = r4
        L_0x03f6:
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            Q0.c r4 = r1.t(r4)
            if (r4 != 0) goto L_0x040b
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            Q0.c r4 = r1.t(r4)
            r4.getClass()
            r6 = 1
            goto L_0x040c
        L_0x040b:
            r6 = 0
        L_0x040c:
            r7 = 1937011555(0x73747363, float:1.9367382E31)
            Q0.c r7 = r1.t(r7)
            r7.getClass()
            r8 = 1937011827(0x73747473, float:1.9367711E31)
            Q0.c r8 = r1.t(r8)
            r8.getClass()
            r9 = 1937011571(0x73747373, float:1.9367401E31)
            Q0.c r9 = r1.t(r9)
            if (r9 == 0) goto L_0x042c
            P0.r r9 = r9.f4016W
            goto L_0x042d
        L_0x042c:
            r9 = 0
        L_0x042d:
            r10 = 1668576371(0x63747473, float:4.5093966E21)
            Q0.c r1 = r1.t(r10)
            if (r1 == 0) goto L_0x0439
            P0.r r1 = r1.f4016W
            goto L_0x043a
        L_0x0439:
            r1 = 0
        L_0x043a:
            J1.a r10 = new J1.a
            P0.r r7 = r7.f4016W
            P0.r r4 = r4.f4016W
            r10.<init>(r7, r4, r6)
            P0.r r4 = r8.f4016W
            r6 = 12
            r4.H(r6)
            int r7 = r4.z()
            r8 = 1
            int r7 = r7 - r8
            int r8 = r4.z()
            int r13 = r4.z()
            if (r1 == 0) goto L_0x0462
            r1.H(r6)
            int r14 = r1.z()
            goto L_0x0463
        L_0x0462:
            r14 = 0
        L_0x0463:
            if (r9 == 0) goto L_0x047b
            r9.H(r6)
            int r16 = r9.z()
            if (r16 <= 0) goto L_0x0477
            int r17 = r9.z()
            r18 = 1
            int r17 = r17 + -1
            goto L_0x047e
        L_0x0477:
            r9 = 0
        L_0x0478:
            r17 = -1
            goto L_0x047e
        L_0x047b:
            r16 = 0
            goto L_0x0478
        L_0x047e:
            int r6 = r5.a()
            M0.r r0 = r3.f2462g
            r19 = r8
            java.lang.String r8 = r0.f3036n
            r20 = r15
            r15 = -1
            if (r6 == r15) goto L_0x04a4
            boolean r15 = r11.equals(r8)
            if (r15 != 0) goto L_0x04aa
            java.lang.String r15 = "audio/g711-mlaw"
            boolean r15 = r15.equals(r8)
            if (r15 != 0) goto L_0x04aa
            java.lang.String r15 = "audio/g711-alaw"
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x04a4
            goto L_0x04aa
        L_0x04a4:
            r22 = r0
            r21 = r11
            goto L_0x0549
        L_0x04aa:
            if (r7 != 0) goto L_0x04a4
            if (r14 != 0) goto L_0x04a4
            if (r16 != 0) goto L_0x04a4
            int r1 = r10.f2340a
            long[] r4 = new long[r1]
            int[] r5 = new int[r1]
        L_0x04b6:
            boolean r7 = r10.a()
            if (r7 == 0) goto L_0x04c7
            int r7 = r10.f2341b
            long r8 = r10.f2343d
            r4[r7] = r8
            int r8 = r10.f2342c
            r5[r7] = r8
            goto L_0x04b6
        L_0x04c7:
            long r7 = (long) r13
            r9 = 8192(0x2000, float:1.14794E-41)
            int r9 = r9 / r6
            r10 = 0
            r13 = 0
        L_0x04cd:
            if (r10 >= r1) goto L_0x04d9
            r14 = r5[r10]
            int r14 = P0.z.f(r14, r9)
            int r13 = r13 + r14
            r14 = 1
            int r10 = r10 + r14
            goto L_0x04cd
        L_0x04d9:
            long[] r10 = new long[r13]
            int[] r14 = new int[r13]
            long[] r15 = new long[r13]
            int[] r13 = new int[r13]
            r22 = r0
            r21 = r11
            r0 = 0
            r11 = 0
            r16 = 0
            r17 = 0
        L_0x04eb:
            if (r11 >= r1) goto L_0x053f
            r19 = r5[r11]
            r23 = r4[r11]
            r60 = r17
            r17 = r1
            r1 = r16
            r16 = r60
            r61 = r19
            r19 = r4
            r4 = r61
        L_0x04ff:
            if (r4 <= 0) goto L_0x052c
            int r20 = java.lang.Math.min(r9, r4)
            r10[r16] = r23
            r25 = r5
            int r5 = r6 * r20
            r14[r16] = r5
            int r1 = java.lang.Math.max(r1, r5)
            r26 = r6
            long r5 = (long) r0
            long r5 = r5 * r7
            r15[r16] = r5
            r5 = 1
            r13[r16] = r5
            r6 = r14[r16]
            long r5 = (long) r6
            long r23 = r23 + r5
            int r0 = r0 + r20
            int r4 = r4 - r20
            r5 = 1
            int r16 = r16 + 1
            r5 = r25
            r6 = r26
            goto L_0x04ff
        L_0x052c:
            r25 = r5
            r26 = r6
            r5 = 1
            int r11 = r11 + r5
            r4 = r19
            r5 = r25
            r60 = r16
            r16 = r1
            r1 = r17
            r17 = r60
            goto L_0x04eb
        L_0x053f:
            long r0 = (long) r0
            long r7 = r7 * r0
            r0 = r7
            r11 = r15
            r47 = r16
            r15 = r3
            goto L_0x06ab
        L_0x0549:
            long[] r0 = new long[r2]
            int[] r6 = new int[r2]
            long[] r8 = new long[r2]
            int[] r11 = new int[r2]
            r24 = r4
            r25 = r7
            r4 = r16
            r7 = r17
            r26 = r36
            r28 = r26
            r15 = 0
            r23 = 0
            r52 = 0
            r17 = r3
            r16 = r14
            r3 = 0
            r14 = r13
            r13 = r19
            r19 = 0
        L_0x056c:
            if (r15 >= r2) goto L_0x0623
            r30 = 1
        L_0x0570:
            if (r19 != 0) goto L_0x058d
            boolean r30 = r10.a()
            if (r30 == 0) goto L_0x058d
            r31 = r13
            r32 = r14
            long r13 = r10.f2343d
            r33 = r2
            int r2 = r10.f2342c
            r19 = r2
            r28 = r13
            r13 = r31
            r14 = r32
            r2 = r33
            goto L_0x0570
        L_0x058d:
            r33 = r2
            r31 = r13
            r32 = r14
            if (r30 != 0) goto L_0x05b1
            java.lang.String r2 = "Unexpected end of chunk data"
            P0.l.B(r12, r2)
            long[] r0 = java.util.Arrays.copyOf(r0, r15)
            int[] r6 = java.util.Arrays.copyOf(r6, r15)
            long[] r8 = java.util.Arrays.copyOf(r8, r15)
            int[] r11 = java.util.Arrays.copyOf(r11, r15)
            r2 = r15
        L_0x05ab:
            r5 = r19
            r7 = r23
            goto L_0x0628
        L_0x05b1:
            if (r1 == 0) goto L_0x05c6
        L_0x05b3:
            if (r52 != 0) goto L_0x05c3
            if (r16 <= 0) goto L_0x05c3
            int r52 = r1.z()
            int r23 = r1.i()
            r2 = -1
            int r16 = r16 + -1
            goto L_0x05b3
        L_0x05c3:
            r2 = -1
            int r52 = r52 + -1
        L_0x05c6:
            r2 = r23
            r0[r15] = r28
            int r13 = r5.e()
            r6[r15] = r13
            if (r13 <= r3) goto L_0x05d3
            r3 = r13
        L_0x05d3:
            long r13 = (long) r2
            long r13 = r26 + r13
            r8[r15] = r13
            if (r9 != 0) goto L_0x05dc
            r13 = 1
            goto L_0x05dd
        L_0x05dc:
            r13 = 0
        L_0x05dd:
            r11[r15] = r13
            if (r15 != r7) goto L_0x05f7
            r13 = 1
            r11[r15] = r13
            r14 = -1
            int r4 = r4 + r14
            if (r4 <= 0) goto L_0x05f0
            r9.getClass()
            int r7 = r9.z()
            int r7 = r7 - r13
        L_0x05f0:
            r23 = r2
            r30 = r3
            r13 = r32
            goto L_0x05f9
        L_0x05f7:
            r14 = -1
            goto L_0x05f0
        L_0x05f9:
            long r2 = (long) r13
            long r26 = r26 + r2
            int r2 = r31 + -1
            if (r2 != 0) goto L_0x060e
            if (r25 <= 0) goto L_0x060e
            int r2 = r24.z()
            int r3 = r24.i()
            int r25 = r25 + -1
        L_0x060c:
            r13 = r2
            goto L_0x0610
        L_0x060e:
            r3 = r13
            goto L_0x060c
        L_0x0610:
            r2 = r6[r15]
            r31 = r3
            long r2 = (long) r2
            long r28 = r28 + r2
            int r19 = r19 + -1
            r2 = 1
            int r15 = r15 + r2
            r3 = r30
            r14 = r31
            r2 = r33
            goto L_0x056c
        L_0x0623:
            r33 = r2
            r31 = r13
            goto L_0x05ab
        L_0x0628:
            long r9 = (long) r7
            long r9 = r26 + r9
            if (r1 == 0) goto L_0x0640
            r15 = r16
        L_0x062f:
            if (r15 <= 0) goto L_0x0640
            int r7 = r1.z()
            if (r7 == 0) goto L_0x063a
            r1 = 0
            r7 = -1
            goto L_0x0642
        L_0x063a:
            r1.i()
            r7 = -1
            int r15 = r15 + r7
            goto L_0x062f
        L_0x0640:
            r7 = -1
            r1 = 1
        L_0x0642:
            if (r4 != 0) goto L_0x0654
            if (r31 != 0) goto L_0x0654
            if (r5 != 0) goto L_0x0654
            if (r25 != 0) goto L_0x0654
            r13 = r52
            if (r13 != 0) goto L_0x0656
            if (r1 != 0) goto L_0x0651
            goto L_0x0656
        L_0x0651:
            r15 = r17
            goto L_0x06a1
        L_0x0654:
            r13 = r52
        L_0x0656:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Inconsistent stbl box for track "
            r14.<init>(r15)
            r15 = r17
            int r7 = r15.f2457a
            r14.append(r7)
            java.lang.String r7 = ": remainingSynchronizationSamples "
            r14.append(r7)
            r14.append(r4)
            java.lang.String r4 = ", remainingSamplesAtTimestampDelta "
            r14.append(r4)
            r4 = r31
            r14.append(r4)
            java.lang.String r4 = ", remainingSamplesInChunk "
            r14.append(r4)
            r14.append(r5)
            java.lang.String r4 = ", remainingTimestampDeltaChanges "
            r14.append(r4)
            r7 = r25
            r14.append(r7)
            java.lang.String r4 = ", remainingSamplesAtTimestampOffset "
            r14.append(r4)
            r14.append(r13)
            if (r1 != 0) goto L_0x0695
            java.lang.String r1 = ", ctts invalid"
            goto L_0x0697
        L_0x0695:
            r1 = r20
        L_0x0697:
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            P0.l.B(r12, r1)
        L_0x06a1:
            r47 = r3
            r14 = r6
            r13 = r11
            r11 = r8
            r60 = r9
            r10 = r0
            r0 = r60
        L_0x06ab:
            java.math.RoundingMode r16 = java.math.RoundingMode.DOWN
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r15.f2459c
            r3 = r0
            r9 = r16
            long r50 = P0.z.W(r3, r5, r7, r9)
            long r7 = r15.f2459c
            long[] r9 = r15.i
            if (r9 != 0) goto L_0x06d5
            P0.z.V(r11, r7)
            J1.u r1 = new J1.u
            r43 = r1
            r44 = r15
            r45 = r10
            r46 = r14
            r48 = r11
            r49 = r13
            r43.<init>(r44, r45, r46, r47, r48, r49, r50)
            goto L_0x039d
        L_0x06d5:
            int r3 = r9.length
            int r5 = r15.f2458b
            long[] r6 = r15.f2464j
            r4 = 1
            if (r3 != r4) goto L_0x07ac
            if (r5 != r4) goto L_0x07ac
            int r3 = r11.length
            r4 = 2
            if (r3 < r4) goto L_0x07ac
            r6.getClass()
            r3 = 0
            r19 = r6[r3]
            r23 = r9[r3]
            long r3 = r15.f2459c
            r25 = r7
            long r7 = r15.f2460d
            r27 = r3
            r3 = r23
            r23 = r6
            r17 = r12
            r12 = r5
            r5 = r27
            r27 = r12
            r24 = r13
            r12 = r25
            r25 = r2
            r2 = r9
            r9 = r16
            long r3 = P0.z.W(r3, r5, r7, r9)
            long r3 = r19 + r3
            int r5 = r11.length
            r6 = 1
            int r5 = r5 - r6
            r6 = 0
            r7 = 4
            int r8 = P0.z.i(r7, r6, r5)
            int r9 = r11.length
            int r9 = r9 - r7
            int r5 = P0.z.i(r9, r6, r5)
            r28 = r11[r6]
            int r6 = (r28 > r19 ? 1 : (r28 == r19 ? 0 : -1))
            if (r6 > 0) goto L_0x0734
            r6 = r11[r8]
            int r8 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0734
            r5 = r11[r5]
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0734
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0734
            r5 = 1
            goto L_0x0735
        L_0x0734:
            r5 = 0
        L_0x0735:
            if (r5 == 0) goto L_0x07a7
            long r30 = r0 - r3
            long r3 = r19 - r28
            r9 = r22
            int r5 = r9.f3015D
            long r7 = (long) r5
            long r5 = r15.f2459c
            r19 = r5
            r5 = r7
            r28 = r7
            r7 = r19
            r19 = r9
            r9 = r16
            long r7 = P0.z.W(r3, r5, r7, r9)
            long r5 = r15.f2459c
            r3 = r30
            r30 = r5
            r5 = r28
            r28 = r0
            r0 = r7
            r7 = r30
            r9 = r16
            long r3 = P0.z.W(r3, r5, r7, r9)
            int r5 = (r0 > r36 ? 1 : (r0 == r36 ? 0 : -1))
            if (r5 != 0) goto L_0x0770
            int r5 = (r3 > r36 ? 1 : (r3 == r36 ? 0 : -1))
            if (r5 == 0) goto L_0x076d
            goto L_0x0770
        L_0x076d:
            r0 = r63
            goto L_0x07ba
        L_0x0770:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x076d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x076d
            int r1 = (int) r0
            r0 = r63
            r0.f14435a = r1
            int r1 = (int) r3
            r0.f14436b = r1
            P0.z.V(r11, r12)
            r1 = 0
            r3 = r2[r1]
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r15.f2460d
            r9 = r16
            long r50 = P0.z.W(r3, r5, r7, r9)
            J1.u r1 = new J1.u
            r43 = r1
            r44 = r15
            r45 = r10
            r46 = r14
            r48 = r11
            r49 = r24
            r43.<init>(r44, r45, r46, r47, r48, r49, r50)
            goto L_0x039f
        L_0x07a7:
            r28 = r0
        L_0x07a9:
            r19 = r22
            goto L_0x076d
        L_0x07ac:
            r28 = r0
            r25 = r2
            r27 = r5
            r23 = r6
            r2 = r9
            r17 = r12
            r24 = r13
            goto L_0x07a9
        L_0x07ba:
            int r1 = r2.length
            r3 = 1
            if (r1 != r3) goto L_0x080b
            r1 = 0
            r3 = r2[r1]
            int r5 = (r3 > r36 ? 1 : (r3 == r36 ? 0 : -1))
            if (r5 != 0) goto L_0x0807
            r23.getClass()
            r2 = r23[r1]
            r4 = 0
        L_0x07cb:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x07e4
            r5 = r11[r4]
            long r48 = r5 - r2
            java.math.RoundingMode r54 = java.math.RoundingMode.DOWN
            r50 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r15.f2459c
            r52 = r5
            long r5 = P0.z.W(r48, r50, r52, r54)
            r11[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x07cb
        L_0x07e4:
            long r48 = r28 - r2
            java.math.RoundingMode r54 = java.math.RoundingMode.DOWN
            r50 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r15.f2459c
            r52 = r2
            long r50 = P0.z.W(r48, r50, r52, r54)
            J1.u r2 = new J1.u
            r43 = r2
            r44 = r15
            r45 = r10
            r46 = r14
            r48 = r11
            r49 = r24
            r43.<init>(r44, r45, r46, r47, r48, r49, r50)
            r1 = r2
            goto L_0x039f
        L_0x0807:
            r3 = r27
            r4 = 1
            goto L_0x080d
        L_0x080b:
            r1 = 0
            goto L_0x0807
        L_0x080d:
            if (r3 != r4) goto L_0x0811
            r4 = 1
            goto L_0x0812
        L_0x0811:
            r4 = 0
        L_0x0812:
            int r5 = r2.length
            int[] r5 = new int[r5]
            int r6 = r2.length
            int[] r6 = new int[r6]
            r23.getClass()
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x081f:
            int r13 = r2.length
            if (r7 >= r13) goto L_0x089a
            r13 = r2
            r1 = r23[r7]
            r26 = -1
            int r16 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r16 == 0) goto L_0x0886
            r26 = r13[r7]
            java.math.RoundingMode r32 = java.math.RoundingMode.DOWN
            r20 = r13
            r16 = r14
            long r13 = r15.f2459c
            r22 = r8
            r33 = r9
            long r8 = r15.f2460d
            r28 = r13
            r30 = r8
            long r8 = P0.z.W(r26, r28, r30, r32)
            r13 = 1
            int r14 = P0.z.e(r11, r1, r13)
            r5[r7] = r14
        L_0x084a:
            r14 = r5[r7]
            if (r14 < 0) goto L_0x0859
            r26 = r24[r14]
            r26 = r26 & 1
            if (r26 != 0) goto L_0x0859
            int r14 = r14 - r13
            r5[r7] = r14
            r13 = 1
            goto L_0x084a
        L_0x0859:
            long r1 = r1 + r8
            int r8 = P0.z.a(r11, r1, r4)
            r6[r7] = r8
            r8 = 2
            if (r3 != r8) goto L_0x0874
        L_0x0863:
            r9 = r6[r7]
            int r13 = r11.length
            r14 = 1
            int r13 = r13 - r14
            if (r9 >= r13) goto L_0x0874
            int r9 = r9 + r14
            r13 = r11[r9]
            int r26 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r26 > 0) goto L_0x0874
            r6[r7] = r9
            goto L_0x0863
        L_0x0874:
            r1 = r6[r7]
            r2 = r5[r7]
            int r9 = r1 - r2
            int r9 = r9 + r33
            if (r12 == r2) goto L_0x0880
            r2 = 1
            goto L_0x0881
        L_0x0880:
            r2 = 0
        L_0x0881:
            r2 = r22 | r2
            r12 = r1
        L_0x0884:
            r1 = 1
            goto L_0x0892
        L_0x0886:
            r22 = r8
            r33 = r9
            r20 = r13
            r16 = r14
            r8 = 2
            r2 = r22
            goto L_0x0884
        L_0x0892:
            int r7 = r7 + r1
            r8 = r2
            r14 = r16
            r2 = r20
            r1 = 0
            goto L_0x081f
        L_0x089a:
            r20 = r2
            r22 = r8
            r16 = r14
            r2 = r25
            if (r9 == r2) goto L_0x08a6
            r1 = 1
            goto L_0x08a7
        L_0x08a6:
            r1 = 0
        L_0x08a7:
            r1 = r22 | r1
            if (r1 == 0) goto L_0x08ae
            long[] r2 = new long[r9]
            goto L_0x08af
        L_0x08ae:
            r2 = r10
        L_0x08af:
            if (r1 == 0) goto L_0x08b4
            int[] r3 = new int[r9]
            goto L_0x08b6
        L_0x08b4:
            r3 = r16
        L_0x08b6:
            if (r1 == 0) goto L_0x08ba
            r47 = 0
        L_0x08ba:
            if (r1 == 0) goto L_0x08bf
            int[] r4 = new int[r9]
            goto L_0x08c1
        L_0x08bf:
            r4 = r24
        L_0x08c1:
            long[] r7 = new long[r9]
            r13 = r20
            r25 = r36
            r29 = r47
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x08cc:
            int r14 = r13.length
            if (r8 >= r14) goto L_0x095b
            r27 = r23[r8]
            r14 = r5[r8]
            r0 = r6[r8]
            r20 = r5
            if (r1 == 0) goto L_0x08ed
            int r5 = r0 - r14
            java.lang.System.arraycopy(r10, r14, r2, r12, r5)
            r22 = r6
            r6 = r16
            java.lang.System.arraycopy(r6, r14, r3, r12, r5)
            r16 = r10
            r10 = r24
            java.lang.System.arraycopy(r10, r14, r4, r12, r5)
            goto L_0x08f5
        L_0x08ed:
            r22 = r6
            r6 = r16
            r16 = r10
            r10 = r24
        L_0x08f5:
            r5 = r29
        L_0x08f7:
            if (r14 >= r0) goto L_0x093d
            java.math.RoundingMode r35 = java.math.RoundingMode.DOWN
            r45 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r9
            r24 = r10
            long r9 = r15.f2460d
            r43 = r25
            r47 = r9
            r49 = r35
            long r9 = P0.z.W(r43, r45, r47, r49)
            r29 = r11[r14]
            long r29 = r29 - r27
            r31 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r13
            r40 = r14
            long r13 = r15.f2459c
            r33 = r13
            long r13 = P0.z.W(r29, r31, r33, r35)
            int r29 = (r13 > r36 ? 1 : (r13 == r36 ? 0 : -1))
            if (r29 >= 0) goto L_0x0927
            r38 = 1
        L_0x0927:
            long r9 = r9 + r13
            r7[r12] = r9
            if (r1 == 0) goto L_0x0932
            r9 = r3[r12]
            if (r9 <= r5) goto L_0x0932
            r5 = r6[r40]
        L_0x0932:
            r9 = 1
            int r12 = r12 + r9
            int r14 = r40 + 1
            r10 = r24
            r9 = r38
            r13 = r39
            goto L_0x08f7
        L_0x093d:
            r38 = r9
            r24 = r10
            r39 = r13
            r9 = 1
            r13 = r39[r8]
            long r25 = r25 + r13
            int r8 = r8 + r9
            r0 = r63
            r29 = r5
            r10 = r16
            r5 = r20
            r9 = r38
            r13 = r39
            r16 = r6
            r6 = r22
            goto L_0x08cc
        L_0x095b:
            java.math.RoundingMode r49 = java.math.RoundingMode.DOWN
            r45 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r15.f2460d
            r43 = r25
            r47 = r0
            long r32 = P0.z.W(r43, r45, r47, r49)
            if (r9 == 0) goto L_0x09b0
            M0.q r0 = r19.a()
            r1 = 1
            r0.f3005s = r1
            M0.r r1 = new M0.r
            r1.<init>(r0)
            J1.r r0 = new J1.r
            r43 = r0
            J1.s[] r5 = r15.f2466l
            r56 = r5
            long[] r5 = r15.i
            r58 = r5
            long[] r5 = r15.f2464j
            r59 = r5
            int r5 = r15.f2457a
            r44 = r5
            int r5 = r15.f2458b
            r45 = r5
            long r5 = r15.f2459c
            r46 = r5
            long r5 = r15.f2460d
            r48 = r5
            long r5 = r15.e
            r50 = r5
            long r5 = r15.f2461f
            r52 = r5
            int r5 = r15.f2463h
            r55 = r5
            int r5 = r15.f2465k
            r57 = r5
            r54 = r1
            r43.<init>(r44, r45, r46, r48, r50, r52, r54, r55, r56, r57, r58, r59)
            r26 = r0
            goto L_0x09b2
        L_0x09b0:
            r26 = r15
        L_0x09b2:
            J1.u r1 = new J1.u
            r25 = r1
            r27 = r2
            r28 = r3
            r30 = r7
            r31 = r4
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x039f
        L_0x09c3:
            r0.add(r1)
            goto L_0x002b
        L_0x09c8:
            int r10 = r41 + 1
            r1 = r63
            r8 = r0
            r2 = r17
            r3 = r21
            r6 = -1
            r0 = r62
            goto L_0x000f
        L_0x09d6:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x09de:
            r1 = 0
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x09e6:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.f.g(Q0.b, p1.v, long, M0.n, boolean, boolean, G3.d):java.util.ArrayList");
    }

    /* JADX WARNING: type inference failed for: r7v32, types: [D2.k, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x065c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(P0.r r45, int r46, int r47, int r48, int r49, int r50, M0.C0126n r51, C3.r r52, int r53) {
        /*
            r0 = r45
            r1 = r47
            r2 = r48
            r3 = r51
            r4 = r52
            r5 = 16
            int r6 = r1 + 16
            r0.H(r6)
            r0.I(r5)
            int r5 = r45.B()
            int r6 = r45.B()
            r8 = 50
            r0.I(r8)
            int r8 = r0.f3733b
            r10 = 1701733238(0x656e6376, float:7.035987E22)
            r11 = r46
            if (r11 != r10) goto L_0x0053
            android.util.Pair r10 = e(r0, r1, r2)
            if (r10 == 0) goto L_0x0050
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r3 != 0) goto L_0x003c
            r3 = 0
            goto L_0x0046
        L_0x003c:
            java.lang.Object r12 = r10.second
            J1.s r12 = (J1.s) r12
            java.lang.String r12 = r12.f2468b
            M0.n r3 = r3.k(r12)
        L_0x0046:
            java.lang.Object r12 = r4.f617c
            J1.s[] r12 = (J1.s[]) r12
            java.lang.Object r10 = r10.second
            J1.s r10 = (J1.s) r10
            r12[r53] = r10
        L_0x0050:
            r0.H(r8)
        L_0x0053:
            r10 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r12 = "video/3gpp"
            if (r11 != r10) goto L_0x005d
            java.lang.String r10 = "video/mpeg"
            goto L_0x0065
        L_0x005d:
            r10 = 1211250227(0x48323633, float:182488.8)
            if (r11 != r10) goto L_0x0064
            r10 = r12
            goto L_0x0065
        L_0x0064:
            r10 = 0
        L_0x0065:
            r18 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = -1
            r24 = -1
            r25 = -1
            r26 = -1
            r27 = -1
            r28 = 8
            r29 = 8
            r30 = 0
            r31 = 0
        L_0x0084:
            int r14 = r8 - r1
            if (r14 >= r2) goto L_0x0098
            r0.H(r8)
            int r14 = r0.f3733b
            int r9 = r45.i()
            if (r9 != 0) goto L_0x00af
            int r15 = r0.f3733b
            int r15 = r15 - r1
            if (r15 != r2) goto L_0x00af
        L_0x0098:
            r32 = r5
            r53 = r20
            r2 = r25
            r20 = r26
            r12 = r27
            r25 = r28
            r26 = r29
            r4 = 0
            r27 = r3
            r28 = r6
            r3 = r23
            goto L_0x08c5
        L_0x00af:
            if (r9 <= 0) goto L_0x00b3
            r15 = 1
            goto L_0x00b4
        L_0x00b3:
            r15 = 0
        L_0x00b4:
            java.lang.String r7 = "childAtomSize must be positive"
            p1.C1332b.d(r7, r15)
            int r15 = r45.i()
            r1 = 1635148611(0x61766343, float:2.8406573E20)
            if (r15 != r1) goto L_0x011e
            if (r10 != 0) goto L_0x00c7
            r1 = 1
        L_0x00c5:
            r7 = 0
            goto L_0x00c9
        L_0x00c7:
            r1 = 0
            goto L_0x00c5
        L_0x00c9:
            p1.C1332b.d(r7, r1)
            r1 = 8
            int r14 = r14 + r1
            r0.H(r14)
            p1.d r1 = p1.C1334d.a(r45)
            int r7 = r1.f14369b
            r4.f615a = r7
            if (r31 != 0) goto L_0x00e0
            float r7 = r1.f14376k
            r19 = r7
        L_0x00e0:
            java.util.ArrayList r7 = r1.f14368a
            java.lang.String r10 = "video/avc"
            java.lang.String r14 = r1.f14377l
            int r15 = r1.f14375j
            int r2 = r1.f14373g
            r20 = r2
            int r2 = r1.f14374h
            r21 = r2
            int r2 = r1.i
            r24 = r2
            int r2 = r1.e
            int r1 = r1.f14372f
            r29 = r1
            r27 = r3
            r32 = r5
            r28 = r6
            r33 = r8
            r51 = r12
            r25 = r20
            r26 = r21
            r3 = r23
            r12 = r24
            r1 = 8
            r4 = 0
            r6 = 3
            r8 = -1
            r20 = r7
            r23 = r11
            r21 = r14
            r24 = r15
            r7 = 1
            r11 = 2
            r15 = r2
            goto L_0x08aa
        L_0x011e:
            r1 = 1752589123(0x68766343, float:4.6541328E24)
            java.lang.String r2 = "video/hevc"
            if (r15 != r1) goto L_0x018a
            if (r10 != 0) goto L_0x012a
            r1 = 1
        L_0x0128:
            r7 = 0
            goto L_0x012c
        L_0x012a:
            r1 = 0
            goto L_0x0128
        L_0x012c:
            p1.C1332b.d(r7, r1)
            r1 = 8
            int r14 = r14 + r1
            r0.H(r14)
            r1 = 0
            p1.w r10 = p1.w.a(r0, r1, r7)
            int r1 = r10.f14438b
            r4.f615a = r1
            if (r31 != 0) goto L_0x0144
            float r1 = r10.i
            r19 = r1
        L_0x0144:
            int r1 = r10.f14443h
            r7 = -1
            if (r1 == r7) goto L_0x014b
            r23 = r1
        L_0x014b:
            java.util.List r1 = r10.f14437a
            int r7 = r10.f14444j
            java.lang.String r13 = r10.f14445k
            int r14 = r10.e
            int r15 = r10.f14441f
            r20 = r1
            int r1 = r10.f14442g
            r21 = r1
            int r1 = r10.f14439c
            r24 = r1
            int r1 = r10.f14440d
            B3.q r10 = r10.f14446l
            r29 = r1
            r27 = r3
            r32 = r5
            r28 = r6
            r33 = r8
            r51 = r12
            r25 = r14
            r26 = r15
            r12 = r21
            r3 = r23
            r15 = r24
            r1 = 8
            r4 = 0
            r6 = 3
            r8 = -1
            r24 = r7
            r23 = r11
            r21 = r13
            r7 = 1
            r11 = 2
            r13 = r10
            r10 = r2
            goto L_0x08aa
        L_0x018a:
            r1 = 1818785347(0x6c687643, float:1.12411706E27)
            if (r15 != r1) goto L_0x025f
            boolean r1 = r2.equals(r10)
            java.lang.String r2 = "lhvC must follow hvcC atom"
            p1.C1332b.d(r2, r1)
            if (r13 == 0) goto L_0x01a7
            java.lang.Object r1 = r13.f449U
            H3.O r1 = (H3.O) r1
            int r1 = r1.size()
            r2 = 2
            if (r1 < r2) goto L_0x01a7
            r1 = 1
            goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            java.lang.String r2 = "must have at least two layers"
            p1.C1332b.d(r2, r1)
            r1 = 8
            int r14 = r14 + r1
            r0.H(r14)
            r13.getClass()
            r1 = 1
            p1.w r2 = p1.w.a(r0, r1, r13)
            int r1 = r4.f615a
            int r7 = r2.f14438b
            if (r1 != r7) goto L_0x01c3
            r1 = 1
            goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            java.lang.String r7 = "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"
            p1.C1332b.d(r7, r1)
            int r1 = r2.e
            r7 = -1
            r10 = r25
            if (r1 == r7) goto L_0x01da
            if (r10 != r1) goto L_0x01d4
            r1 = 1
            goto L_0x01d5
        L_0x01d4:
            r1 = 0
        L_0x01d5:
            java.lang.String r14 = "colorSpace must be the same for both views"
            p1.C1332b.d(r14, r1)
        L_0x01da:
            int r1 = r2.f14441f
            r14 = r26
            if (r1 == r7) goto L_0x01ea
            if (r14 != r1) goto L_0x01e4
            r1 = 1
            goto L_0x01e5
        L_0x01e4:
            r1 = 0
        L_0x01e5:
            java.lang.String r15 = "colorRange must be the same for both views"
            p1.C1332b.d(r15, r1)
        L_0x01ea:
            int r1 = r2.f14442g
            if (r1 == r7) goto L_0x01fb
            r7 = r27
            if (r7 != r1) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            java.lang.String r15 = "colorTransfer must be the same for both views"
            p1.C1332b.d(r15, r1)
            goto L_0x01fd
        L_0x01fb:
            r7 = r27
        L_0x01fd:
            int r1 = r2.f14439c
            r15 = r28
            r21 = r7
            if (r15 != r1) goto L_0x0207
            r1 = 1
            goto L_0x0208
        L_0x0207:
            r1 = 0
        L_0x0208:
            java.lang.String r7 = "bitdepthLuma must be the same for both views"
            p1.C1332b.d(r7, r1)
            int r1 = r2.f14440d
            r7 = r29
            r25 = r7
            if (r7 != r1) goto L_0x0217
            r1 = 1
            goto L_0x0218
        L_0x0217:
            r1 = 0
        L_0x0218:
            java.lang.String r7 = "bitdepthChroma must be the same for both views"
            p1.C1332b.d(r7, r1)
            r1 = r20
            if (r1 == 0) goto L_0x0257
            H3.L r7 = H3.O.j()
            r7.d(r1)
            java.util.List r1 = r2.f14437a
            r7.d(r1)
            H3.i0 r20 = r7.g()
            java.lang.String r1 = "video/mv-hevc"
            java.lang.String r2 = r2.f14445k
            r27 = r3
            r32 = r5
            r28 = r6
            r33 = r8
            r51 = r12
            r26 = r14
            r12 = r21
            r3 = r23
            r29 = r25
            r4 = 0
            r6 = 3
            r7 = 1
            r8 = -1
            r21 = r2
            r25 = r10
            r23 = r11
            r11 = 2
            r10 = r1
            r1 = 8
            goto L_0x08aa
        L_0x0257:
            java.lang.String r0 = "initializationData must be already set from hvcC atom"
            r1 = 0
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x025f:
            r51 = r12
            r1 = r20
            r2 = r25
            r20 = r26
            r12 = r27
            r25 = r28
            r26 = r29
            r4 = 1986361461(0x76657875, float:1.16355385E33)
            if (r15 != r4) goto L_0x038c
            r4 = 8
            int r15 = r14 + 8
            r0.H(r15)
            int r4 = r0.f3733b
            r27 = r3
            r15 = 0
        L_0x027e:
            int r3 = r4 - r14
            if (r3 >= r9) goto L_0x0320
            r0.H(r4)
            int r3 = r45.i()
            r53 = r1
            if (r3 <= 0) goto L_0x028f
            r1 = 1
            goto L_0x0290
        L_0x028f:
            r1 = 0
        L_0x0290:
            p1.C1332b.d(r7, r1)
            int r1 = r45.i()
            r28 = r6
            r6 = 1702454643(0x65796573, float:7.360879E22)
            if (r1 != r6) goto L_0x030d
            r1 = 8
            int r15 = r4 + 8
            r0.H(r15)
            int r1 = r0.f3733b
        L_0x02a7:
            int r6 = r1 - r4
            if (r6 >= r3) goto L_0x0304
            r0.H(r1)
            int r6 = r45.i()
            if (r6 <= 0) goto L_0x02b6
            r15 = 1
            goto L_0x02b7
        L_0x02b6:
            r15 = 0
        L_0x02b7:
            p1.C1332b.d(r7, r15)
            int r15 = r45.i()
            r29 = r7
            r7 = 1937011305(0x73747269, float:1.936708E31)
            if (r15 != r7) goto L_0x02fc
            r7 = 4
            r0.I(r7)
            int r1 = r45.v()
            H3.P r6 = new H3.P
            D2.k r7 = new D2.k
            r32 = r5
            r15 = 1
            r5 = r1 & 1
            r33 = r8
            if (r5 != r15) goto L_0x02dd
            r5 = 1
        L_0x02db:
            r15 = 2
            goto L_0x02df
        L_0x02dd:
            r5 = 0
            goto L_0x02db
        L_0x02df:
            r8 = r1 & 2
            if (r8 != r15) goto L_0x02e7
            r8 = 1
        L_0x02e4:
            r15 = 8
            goto L_0x02e9
        L_0x02e7:
            r8 = 0
            goto L_0x02e4
        L_0x02e9:
            r1 = r1 & r15
            if (r1 != r15) goto L_0x02ee
            r1 = 1
            goto L_0x02ef
        L_0x02ee:
            r1 = 0
        L_0x02ef:
            r7.<init>()
            r7.f1095a = r5
            r7.f1096b = r8
            r7.f1097c = r1
            r6.<init>((java.lang.Object) r7)
            goto L_0x030b
        L_0x02fc:
            r32 = r5
            r33 = r8
            int r1 = r1 + r6
            r7 = r29
            goto L_0x02a7
        L_0x0304:
            r32 = r5
            r29 = r7
            r33 = r8
            r6 = 0
        L_0x030b:
            r15 = r6
            goto L_0x0313
        L_0x030d:
            r32 = r5
            r29 = r7
            r33 = r8
        L_0x0313:
            int r4 = r4 + r3
            r1 = r53
            r6 = r28
            r7 = r29
            r5 = r32
            r8 = r33
            goto L_0x027e
        L_0x0320:
            r53 = r1
            r32 = r5
            r28 = r6
            r33 = r8
            if (r15 != 0) goto L_0x032c
            r1 = 0
            goto L_0x0331
        L_0x032c:
            H3.P r1 = new H3.P
            r1.<init>((java.lang.Object) r15)
        L_0x0331:
            if (r1 == 0) goto L_0x0361
            java.lang.Object r1 = r1.f2027U
            H3.P r1 = (H3.P) r1
            java.lang.Object r1 = r1.f2027U
            D2.k r1 = (D2.k) r1
            if (r13 == 0) goto L_0x0364
            java.lang.Object r3 = r13.f449U
            H3.O r3 = (H3.O) r3
            int r3 = r3.size()
            r4 = 2
            if (r3 < r4) goto L_0x0364
            boolean r3 = r1.f1095a
            if (r3 == 0) goto L_0x0352
            boolean r3 = r1.f1096b
            if (r3 == 0) goto L_0x0352
            r3 = 1
            goto L_0x0353
        L_0x0352:
            r3 = 0
        L_0x0353:
            java.lang.String r4 = "both eye views must be marked as available"
            p1.C1332b.d(r4, r3)
            boolean r1 = r1.f1097c
            r3 = 1
            r1 = r1 ^ r3
            java.lang.String r3 = "for MV-HEVC, eye_views_reversed must be set to false"
            p1.C1332b.d(r3, r1)
        L_0x0361:
            r3 = r23
            goto L_0x0373
        L_0x0364:
            r3 = r23
            r4 = -1
            if (r3 != r4) goto L_0x0373
            boolean r1 = r1.f1097c
            if (r1 == 0) goto L_0x036f
            r1 = 5
            goto L_0x0370
        L_0x036f:
            r1 = 4
        L_0x0370:
            r23 = r1
            goto L_0x0375
        L_0x0373:
            r23 = r3
        L_0x0375:
            r3 = r23
            r15 = r25
            r29 = r26
            r1 = 8
            r4 = 0
            r6 = 3
            r7 = 1
            r8 = -1
            r25 = r2
            r23 = r11
            r26 = r20
            r11 = 2
        L_0x0388:
            r20 = r53
            goto L_0x08aa
        L_0x038c:
            r53 = r1
            r27 = r3
            r32 = r5
            r28 = r6
            r33 = r8
            r3 = r23
            r1 = 1685480259(0x64766343, float:1.8180206E22)
            if (r15 == r1) goto L_0x03a2
            r1 = 1685485123(0x64767643, float:1.8185683E22)
            if (r15 != r1) goto L_0x03af
        L_0x03a2:
            r23 = r11
            r29 = r13
            r1 = 8
            r4 = 0
            r6 = 3
            r7 = 1
            r8 = -1
            r11 = 2
            goto L_0x089d
        L_0x03af:
            r1 = 1987076931(0x76706343, float:1.21891066E33)
            if (r15 != r1) goto L_0x0452
            if (r10 != 0) goto L_0x03b9
            r1 = 1
        L_0x03b7:
            r2 = 0
            goto L_0x03bb
        L_0x03b9:
            r1 = 0
            goto L_0x03b7
        L_0x03bb:
            p1.C1332b.d(r2, r1)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            if (r11 != r1) goto L_0x03ca
            java.lang.String r1 = "video/x-vnd.on2.vp8"
        L_0x03c7:
            r4 = 12
            goto L_0x03cc
        L_0x03ca:
            r1 = r2
            goto L_0x03c7
        L_0x03cc:
            int r14 = r14 + r4
            r0.H(r14)
            int r4 = r45.v()
            byte r4 = (byte) r4
            int r5 = r45.v()
            byte r5 = (byte) r5
            int r6 = r45.v()
            r7 = 4
            int r8 = r6 >> 4
            r7 = 1
            int r10 = r6 >> 1
            r12 = 7
            r10 = r10 & r12
            byte r10 = (byte) r10
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0420
            byte r2 = (byte) r8
            byte[] r12 = P0.a.f3688a
            r12 = 12
            byte[] r14 = new byte[r12]
            r12 = 0
            r14[r12] = r7
            r14[r7] = r7
            r12 = 2
            r14[r12] = r4
            r4 = 3
            r14[r4] = r12
            r12 = 4
            r14[r12] = r7
            r15 = 5
            r14[r15] = r5
            r5 = 6
            r14[r5] = r4
            r4 = 7
            r14[r4] = r7
            r4 = 8
            r14[r4] = r2
            r2 = 9
            r14[r2] = r12
            r4 = 10
            r14[r4] = r7
            r2 = 11
            r14[r2] = r10
            H3.i0 r20 = H3.O.r(r14)
            goto L_0x0424
        L_0x0420:
            r4 = 10
            r20 = r53
        L_0x0424:
            r2 = r6 & 1
            if (r2 == 0) goto L_0x042a
            r2 = 1
            goto L_0x042b
        L_0x042a:
            r2 = 0
        L_0x042b:
            int r5 = r45.v()
            int r6 = r45.v()
            int r25 = M0.C0121i.f(r5)
            if (r2 == 0) goto L_0x043b
            r2 = 1
            goto L_0x043c
        L_0x043b:
            r2 = 2
        L_0x043c:
            int r5 = M0.C0121i.g(r6)
            r10 = r1
            r26 = r2
            r12 = r5
            r15 = r8
            r29 = r15
            r23 = r11
            r1 = 8
            r4 = 0
            r6 = 3
            r7 = 1
            r8 = -1
            r11 = 2
            goto L_0x08aa
        L_0x0452:
            r4 = 10
            r1 = 1635135811(0x61763143, float:2.8384055E20)
            java.lang.String r5 = "BoxParsers"
            if (r15 != r1) goto L_0x0695
            r1 = 8
            int r2 = r9 + -8
            byte[] r6 = new byte[r2]
            r7 = 0
            r0.g(r6, r7, r2)
            H3.i0 r20 = H3.O.r(r6)
            int r14 = r14 + r1
            r0.H(r14)
            N1.f r1 = new N1.f
            byte[] r2 = r0.f3732a
            int r6 = r2.length
            r1.<init>((int) r6, (byte[]) r2)
            int r2 = r0.f3733b
            r6 = 8
            int r2 = r2 * 8
            r1.r(r2)
            r2 = 1
            r1.v(r2)
            r2 = 3
            int r6 = r1.i(r2)
            r8 = 6
            r1.u(r8)
            boolean r2 = r1.h()
            boolean r10 = r1.h()
            r37 = -1
            r12 = 2
            if (r6 != r12) goto L_0x04ad
            if (r2 == 0) goto L_0x04ad
            if (r10 == 0) goto L_0x049f
            r2 = 12
            goto L_0x04a1
        L_0x049f:
            r2 = 10
        L_0x04a1:
            if (r10 == 0) goto L_0x04a6
            r6 = 12
            goto L_0x04a8
        L_0x04a6:
            r6 = 10
        L_0x04a8:
            r42 = r2
            r43 = r6
            goto L_0x04c6
        L_0x04ad:
            if (r6 > r12) goto L_0x04c2
            if (r2 == 0) goto L_0x04b4
            r6 = 10
            goto L_0x04b6
        L_0x04b4:
            r6 = 8
        L_0x04b6:
            if (r2 == 0) goto L_0x04bb
            r2 = 10
            goto L_0x04bd
        L_0x04bb:
            r2 = 8
        L_0x04bd:
            r43 = r2
            r42 = r6
            goto L_0x04c6
        L_0x04c2:
            r42 = -1
            r43 = -1
        L_0x04c6:
            r2 = 13
            r1.u(r2)
            r1.t()
            r6 = 4
            int r10 = r1.i(r6)
            r44 = 0
            r6 = 1
            if (r10 == r6) goto L_0x0500
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported obu_type: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            P0.l.s(r5, r1)
            M0.i r1 = new M0.i
            r34 = r1
            r35 = r37
            r36 = r37
            r38 = r42
            r39 = r43
            r40 = r44
            r34.<init>(r35, r36, r37, r38, r39, r40)
        L_0x04fa:
            r6 = 5
            r12 = 4
            r14 = 12
            goto L_0x0675
        L_0x0500:
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x051d
            java.lang.String r1 = "Unsupported obu_extension_flag"
            P0.l.s(r5, r1)
            M0.i r1 = new M0.i
            r34 = r1
            r35 = r37
            r36 = r37
            r38 = r42
            r39 = r43
            r40 = r44
            r34.<init>(r35, r36, r37, r38, r39, r40)
            goto L_0x04fa
        L_0x051d:
            boolean r6 = r1.h()
            r1.t()
            if (r6 == 0) goto L_0x0547
            r6 = 8
            int r10 = r1.i(r6)
            r6 = 127(0x7f, float:1.78E-43)
            if (r10 <= r6) goto L_0x0547
            java.lang.String r1 = "Excessive obu_size"
            P0.l.s(r5, r1)
            M0.i r1 = new M0.i
            r34 = r1
            r35 = r37
            r36 = r37
            r38 = r42
            r39 = r43
            r40 = r44
            r34.<init>(r35, r36, r37, r38, r39, r40)
            goto L_0x04fa
        L_0x0547:
            r6 = 3
            int r10 = r1.i(r6)
            r1.t()
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x056c
            java.lang.String r1 = "Unsupported reduced_still_picture_header"
            P0.l.s(r5, r1)
            M0.i r1 = new M0.i
            r34 = r1
            r35 = r37
            r36 = r37
            r38 = r42
            r39 = r43
            r40 = r44
            r34.<init>(r35, r36, r37, r38, r39, r40)
            goto L_0x04fa
        L_0x056c:
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x058a
            java.lang.String r1 = "Unsupported timing_info_present_flag"
            P0.l.s(r5, r1)
            M0.i r1 = new M0.i
            r34 = r1
            r35 = r37
            r36 = r37
            r38 = r42
            r39 = r43
            r40 = r44
            r34.<init>(r35, r36, r37, r38, r39, r40)
            goto L_0x04fa
        L_0x058a:
            boolean r6 = r1.h()
            if (r6 == 0) goto L_0x05a8
            java.lang.String r1 = "Unsupported initial_display_delay_present_flag"
            P0.l.s(r5, r1)
            M0.i r1 = new M0.i
            r34 = r1
            r35 = r37
            r36 = r37
            r38 = r42
            r39 = r43
            r40 = r44
            r34.<init>(r35, r36, r37, r38, r39, r40)
            goto L_0x04fa
        L_0x05a8:
            r6 = 5
            int r5 = r1.i(r6)
            r12 = 0
        L_0x05ae:
            if (r12 > r5) goto L_0x05c4
            r14 = 12
            r1.u(r14)
            int r15 = r1.i(r6)
            r4 = 7
            if (r15 <= r4) goto L_0x05bf
            r1.t()
        L_0x05bf:
            r4 = 1
            int r12 = r12 + r4
            r4 = 10
            goto L_0x05ae
        L_0x05c4:
            r4 = 1
            r12 = 4
            r14 = 12
            int r5 = r1.i(r12)
            int r15 = r1.i(r12)
            int r5 = r5 + r4
            r1.u(r5)
            int r15 = r15 + r4
            r1.u(r15)
            boolean r4 = r1.h()
            if (r4 == 0) goto L_0x05e3
            r4 = 7
            r1.u(r4)
            goto L_0x05e4
        L_0x05e3:
            r4 = 7
        L_0x05e4:
            r1.u(r4)
            boolean r5 = r1.h()
            if (r5 == 0) goto L_0x05f1
            r15 = 2
            r1.u(r15)
        L_0x05f1:
            boolean r15 = r1.h()
            if (r15 == 0) goto L_0x05fb
            r15 = 1
            r16 = 2
            goto L_0x0600
        L_0x05fb:
            r15 = 1
            int r16 = r1.i(r15)
        L_0x0600:
            if (r16 <= 0) goto L_0x060b
            boolean r16 = r1.h()
            if (r16 != 0) goto L_0x060b
            r1.u(r15)
        L_0x060b:
            if (r5 == 0) goto L_0x0612
            r5 = 3
            r1.u(r5)
            goto L_0x0613
        L_0x0612:
            r5 = 3
        L_0x0613:
            r1.u(r5)
            boolean r5 = r1.h()
            r15 = 2
            if (r10 != r15) goto L_0x0622
            if (r5 == 0) goto L_0x0622
            r1.t()
        L_0x0622:
            r5 = 1
            if (r10 == r5) goto L_0x062d
            boolean r5 = r1.h()
            if (r5 == 0) goto L_0x062d
            r5 = 1
            goto L_0x062e
        L_0x062d:
            r5 = 0
        L_0x062e:
            boolean r10 = r1.h()
            if (r10 == 0) goto L_0x0668
            r10 = 8
            int r15 = r1.i(r10)
            int r4 = r1.i(r10)
            int r16 = r1.i(r10)
            if (r5 != 0) goto L_0x064d
            r5 = 1
            if (r15 != r5) goto L_0x064e
            if (r4 != r2) goto L_0x064e
            if (r16 != 0) goto L_0x064e
            r1 = 1
            goto L_0x0654
        L_0x064d:
            r5 = 1
        L_0x064e:
            int r17 = r1.i(r5)
            r1 = r17
        L_0x0654:
            int r37 = M0.C0121i.f(r15)
            if (r1 != r5) goto L_0x065c
            r1 = 1
            goto L_0x065d
        L_0x065c:
            r1 = 2
        L_0x065d:
            int r2 = M0.C0121i.g(r4)
            r40 = r1
            r41 = r2
            r39 = r37
            goto L_0x066e
        L_0x0668:
            r39 = -1
            r40 = -1
            r41 = -1
        L_0x066e:
            M0.i r1 = new M0.i
            r38 = r1
            r38.<init>(r39, r40, r41, r42, r43, r44)
        L_0x0675:
            java.lang.String r2 = "video/av01"
            int r4 = r1.e
            int r5 = r1.f2961f
            int r10 = r1.f2957a
            int r15 = r1.f2958b
            int r1 = r1.f2959c
            r12 = r1
            r29 = r5
            r25 = r10
            r23 = r11
            r26 = r15
            r1 = 8
            r6 = 3
            r7 = 1
            r8 = -1
            r11 = 2
            r10 = r2
            r15 = r4
            r4 = 0
            goto L_0x08aa
        L_0x0695:
            r4 = 12
            r6 = 5
            r7 = 0
            r8 = 6
            r1 = 1668050025(0x636c6c69, float:4.3612434E21)
            r16 = 25
            if (r15 != r1) goto L_0x06d7
            if (r18 != 0) goto L_0x06ad
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r16)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r18 = r1.order(r5)
        L_0x06ad:
            r1 = r18
            r5 = 21
            r1.position(r5)
            short r5 = r45.s()
            r1.putShort(r5)
            short r5 = r45.s()
            r1.putShort(r5)
            r18 = r1
            r23 = r11
            r15 = r25
            r29 = r26
            r1 = 8
            r4 = 0
            r6 = 3
            r7 = 1
            r8 = -1
            r11 = 2
            r25 = r2
        L_0x06d3:
            r26 = r20
            goto L_0x0388
        L_0x06d7:
            r1 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r15 != r1) goto L_0x0755
            if (r18 != 0) goto L_0x06e8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r16)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r18 = r1.order(r5)
        L_0x06e8:
            r1 = r18
            short r5 = r45.s()
            short r14 = r45.s()
            short r15 = r45.s()
            short r4 = r45.s()
            short r6 = r45.s()
            short r7 = r45.s()
            short r8 = r45.s()
            r23 = r11
            short r11 = r45.s()
            long r34 = r45.x()
            long r36 = r45.x()
            r29 = r13
            r13 = 1
            r1.position(r13)
            r1.putShort(r6)
            r1.putShort(r7)
            r1.putShort(r5)
            r1.putShort(r14)
            r1.putShort(r15)
            r1.putShort(r4)
            r1.putShort(r8)
            r1.putShort(r11)
            r4 = 10000(0x2710, double:4.9407E-320)
            long r6 = r34 / r4
            int r7 = (int) r6
            short r6 = (short) r7
            r1.putShort(r6)
            long r4 = r36 / r4
            int r5 = (int) r4
            short r4 = (short) r5
            r1.putShort(r4)
            r18 = r1
            r15 = r25
            r13 = r29
            r1 = 8
            r4 = 0
        L_0x074b:
            r6 = 3
            r7 = 1
        L_0x074d:
            r8 = -1
            r11 = 2
        L_0x074f:
            r25 = r2
            r29 = r26
            goto L_0x06d3
        L_0x0755:
            r23 = r11
            r29 = r13
            r1 = 1681012275(0x64323633, float:1.3149704E22)
            if (r15 != r1) goto L_0x0771
            if (r10 != 0) goto L_0x0763
            r1 = 1
        L_0x0761:
            r4 = 0
            goto L_0x0765
        L_0x0763:
            r1 = 0
            goto L_0x0761
        L_0x0765:
            p1.C1332b.d(r4, r1)
            r10 = r51
            r15 = r25
            r13 = r29
            r1 = 8
            goto L_0x074b
        L_0x0771:
            r4 = 0
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 != r1) goto L_0x07ab
            if (r10 != 0) goto L_0x077b
            r1 = 1
            goto L_0x077c
        L_0x077b:
            r1 = 0
        L_0x077c:
            p1.C1332b.d(r4, r1)
            J1.b r1 = a(r14, r0)
            java.lang.Object r5 = r1.f2350X
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x078e
            H3.i0 r5 = H3.O.r(r5)
            goto L_0x0790
        L_0x078e:
            r5 = r53
        L_0x0790:
            java.lang.Object r6 = r1.f2349W
            java.lang.String r6 = (java.lang.String) r6
            r30 = r1
            r10 = r6
            r15 = r25
            r13 = r29
            r1 = 8
            r6 = 3
            r7 = 1
            r8 = -1
            r11 = 2
            r25 = r2
            r29 = r26
            r26 = r20
            r20 = r5
            goto L_0x08aa
        L_0x07ab:
            r1 = 1885434736(0x70617370, float:2.7909473E29)
            if (r15 != r1) goto L_0x07ce
            r1 = 8
            int r14 = r14 + r1
            r0.H(r14)
            int r5 = r45.z()
            int r6 = r45.z()
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r5 / r6
            r19 = r5
            r15 = r25
            r13 = r29
            r6 = 3
            r7 = 1
            r8 = -1
            r11 = 2
            r31 = 1
            goto L_0x074f
        L_0x07ce:
            r1 = 8
            r6 = 1937126244(0x73763364, float:1.9506033E31)
            if (r15 != r6) goto L_0x07ff
            int r15 = r14 + 8
        L_0x07d7:
            int r5 = r15 - r14
            if (r5 >= r9) goto L_0x07f7
            r0.H(r15)
            int r5 = r45.i()
            int r6 = r45.i()
            r7 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r6 != r7) goto L_0x07f5
            byte[] r6 = r0.f3732a
            int r5 = r5 + r15
            byte[] r5 = java.util.Arrays.copyOfRange(r6, r15, r5)
            r22 = r5
            goto L_0x07f9
        L_0x07f5:
            int r15 = r15 + r5
            goto L_0x07d7
        L_0x07f7:
            r22 = r4
        L_0x07f9:
            r15 = r25
            r13 = r29
            goto L_0x074b
        L_0x07ff:
            r6 = 1936995172(0x73743364, float:1.9347576E31)
            if (r15 != r6) goto L_0x082d
            int r5 = r45.v()
            r6 = 3
            r0.I(r6)
            if (r5 != 0) goto L_0x0826
            int r5 = r45.v()
            if (r5 == 0) goto L_0x0823
            r7 = 1
            if (r5 == r7) goto L_0x0821
            r8 = 2
            if (r5 == r8) goto L_0x081f
            if (r5 == r6) goto L_0x081d
            goto L_0x0827
        L_0x081d:
            r3 = 3
            goto L_0x0827
        L_0x081f:
            r3 = 2
            goto L_0x0827
        L_0x0821:
            r3 = 1
            goto L_0x0827
        L_0x0823:
            r7 = 1
            r3 = 0
            goto L_0x0827
        L_0x0826:
            r7 = 1
        L_0x0827:
            r15 = r25
            r13 = r29
            goto L_0x074d
        L_0x082d:
            r6 = 3
            r7 = 1
            r8 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r15 != r8) goto L_0x0895
            r8 = -1
            if (r2 != r8) goto L_0x085d
            if (r12 != r8) goto L_0x085d
            int r11 = r45.i()
            r13 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r11 == r13) goto L_0x085f
            r13 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r11 != r13) goto L_0x0848
            goto L_0x085f
        L_0x0848:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Unsupported color type: "
            r13.<init>(r14)
            java.lang.String r11 = Q0.d.b(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            P0.l.B(r5, r11)
        L_0x085d:
            r11 = 2
            goto L_0x0897
        L_0x085f:
            int r2 = r45.B()
            int r5 = r45.B()
            r11 = 2
            r0.I(r11)
            r12 = 19
            if (r9 != r12) goto L_0x0879
            int r12 = r45.v()
            r12 = r12 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0879
            r12 = 1
            goto L_0x087a
        L_0x0879:
            r12 = 0
        L_0x087a:
            int r2 = M0.C0121i.f(r2)
            if (r12 == 0) goto L_0x0882
            r12 = 1
            goto L_0x0883
        L_0x0882:
            r12 = 2
        L_0x0883:
            int r5 = M0.C0121i.g(r5)
            r20 = r53
            r15 = r25
            r13 = r29
            r25 = r2
            r29 = r26
            r26 = r12
            r12 = r5
            goto L_0x08aa
        L_0x0895:
            r8 = -1
            goto L_0x085d
        L_0x0897:
            r15 = r25
            r13 = r29
            goto L_0x074f
        L_0x089d:
            G3.e r5 = G3.e.d(r45)
            if (r5 == 0) goto L_0x0897
            java.lang.String r5 = r5.f1639U
            java.lang.String r10 = "video/dolby-vision"
            r21 = r5
            goto L_0x0897
        L_0x08aa:
            int r2 = r33 + r9
            r1 = r47
            r4 = r52
            r8 = r2
            r11 = r23
            r6 = r28
            r5 = r32
            r2 = r48
            r23 = r3
            r28 = r15
            r3 = r27
            r27 = r12
            r12 = r51
            goto L_0x0084
        L_0x08c5:
            if (r10 != 0) goto L_0x08c8
            return
        L_0x08c8:
            M0.q r0 = new M0.q
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r49)
            r0.f2989a = r1
            java.lang.String r1 = M0.I.o(r10)
            r0.f2999m = r1
            r7 = r21
            r0.f2996j = r7
            r1 = r32
            r0.f3006t = r1
            r1 = r28
            r0.f3007u = r1
            r1 = r19
            r0.f3010x = r1
            r1 = r50
            r0.f3009w = r1
            r7 = r22
            r0.f3011y = r7
            r0.z = r3
            r7 = r53
            r0.f3002p = r7
            r14 = r24
            r0.f3001o = r14
            r3 = r27
            r0.f3003q = r3
            if (r18 == 0) goto L_0x0906
            byte[] r7 = r18.array()
            goto L_0x0907
        L_0x0906:
            r7 = r4
        L_0x0907:
            M0.i r1 = new M0.i
            r45 = r1
            r46 = r2
            r47 = r20
            r48 = r12
            r49 = r25
            r50 = r26
            r51 = r7
            r45.<init>(r46, r47, r48, r49, r50, r51)
            r0.f2978A = r1
            r7 = r30
            if (r7 == 0) goto L_0x0930
            long r1 = r7.f2347U
            int r1 = E.e.u(r1)
            r0.f2995h = r1
            long r1 = r7.f2348V
            int r1 = E.e.u(r1)
            r0.i = r1
        L_0x0930:
            M0.r r1 = new M0.r
            r1.<init>(r0)
            r0 = r52
            r0.f618d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.f.h(P0.r, int, int, int, int, int, M0.n, C3.r, int):void");
    }
}
