package r1;

import H3.M;
import H3.i0;

public final class f implements C1376a {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f14846a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14847b;

    public f(int i, i0 i0Var) {
        this.f14847b = i;
        this.f14846a = i0Var;
    }

    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v4, types: [r1.g] */
    /* JADX WARNING: type inference failed for: r13v5, types: [r1.g] */
    /* JADX WARNING: type inference failed for: r11v5, types: [r1.c] */
    /* JADX WARNING: type inference failed for: r7v11, types: [r1.h] */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r7v14, types: [r1.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static r1.f b(int r19, P0.r r20) {
        /*
            r0 = r20
            r1 = 4
            java.lang.String r2 = "initialCapacity"
            H3.C0103u.e(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r0.f3734c
            r4 = 0
            r5 = -2
            r6 = 0
        L_0x000f:
            int r7 = r20.a()
            r8 = 8
            if (r7 <= r8) goto L_0x01e1
            int r7 = r20.k()
            int r9 = r20.k()
            int r10 = r0.f3733b
            int r10 = r10 + r9
            r0.G(r10)
            r9 = 1
            r11 = 1414744396(0x5453494c, float:3.62987127E12)
            r12 = 2
            if (r7 != r11) goto L_0x0036
            int r7 = r20.k()
            r1.f r7 = b(r7, r0)
            goto L_0x0186
        L_0x0036:
            r11 = 12
            r13 = 0
            switch(r7) {
                case 1718776947: goto L_0x0098;
                case 1751742049: goto L_0x0078;
                case 1752331379: goto L_0x0050;
                case 1852994675: goto L_0x003f;
                default: goto L_0x003c;
            }
        L_0x003c:
            r7 = r13
            goto L_0x0186
        L_0x003f:
            r1.h r7 = new r1.h
            int r8 = r20.a()
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = r0.t(r8, r11)
            r7.<init>(r8)
            goto L_0x0186
        L_0x0050:
            int r14 = r20.k()
            r0.I(r11)
            r20.k()
            int r15 = r20.k()
            int r16 = r20.k()
            r0.I(r1)
            int r17 = r20.k()
            int r18 = r20.k()
            r0.I(r8)
            r1.d r7 = new r1.d
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x0186
        L_0x0078:
            int r7 = r20.k()
            r0.I(r8)
            int r8 = r20.k()
            int r13 = r20.k()
            r0.I(r1)
            r20.k()
            r0.I(r11)
            r1.c r11 = new r1.c
            r11.<init>(r7, r8, r13)
            r7 = r11
            goto L_0x0186
        L_0x0098:
            java.lang.String r7 = "StreamFormatChunk"
            if (r5 != r12) goto L_0x00e2
            r0.I(r1)
            int r8 = r20.k()
            int r11 = r20.k()
            r0.I(r1)
            int r14 = r20.k()
            switch(r14) {
                case 808802372: goto L_0x00bf;
                case 826496577: goto L_0x00bc;
                case 828601953: goto L_0x00bc;
                case 842289229: goto L_0x00b9;
                case 859066445: goto L_0x00b6;
                case 875967048: goto L_0x00bc;
                case 877677894: goto L_0x00bf;
                case 1145656883: goto L_0x00bf;
                case 1145656920: goto L_0x00bf;
                case 1196444237: goto L_0x00b3;
                case 1482049860: goto L_0x00bf;
                case 1684633208: goto L_0x00bf;
                case 1735420525: goto L_0x00b3;
                case 2021026148: goto L_0x00bf;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            r15 = r13
            goto L_0x00c1
        L_0x00b3:
            java.lang.String r15 = "video/mjpeg"
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r15 = "video/mp43"
            goto L_0x00c1
        L_0x00b9:
            java.lang.String r15 = "video/mp42"
            goto L_0x00c1
        L_0x00bc:
            java.lang.String r15 = "video/avc"
            goto L_0x00c1
        L_0x00bf:
            java.lang.String r15 = "video/mp4v-es"
        L_0x00c1:
            if (r15 != 0) goto L_0x00ca
            java.lang.String r8 = "Ignoring track with unsupported compression "
            Q0.g.u(r14, r8, r7)
            goto L_0x003c
        L_0x00ca:
            M0.q r7 = new M0.q
            r7.<init>()
            r7.f3006t = r8
            r7.f3007u = r11
            r7.g(r15)
            r1.g r13 = new r1.g
            M0.r r8 = new M0.r
            r8.<init>(r7)
            r13.<init>(r8)
            goto L_0x003c
        L_0x00e2:
            if (r5 != r9) goto L_0x016f
            int r8 = r20.o()
            java.lang.String r11 = "audio/raw"
            java.lang.String r14 = "audio/mp4a-latm"
            if (r8 == r9) goto L_0x010b
            r15 = 85
            if (r8 == r15) goto L_0x0108
            r15 = 255(0xff, float:3.57E-43)
            if (r8 == r15) goto L_0x0106
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r8 == r15) goto L_0x0103
            r15 = 8193(0x2001, float:1.1481E-41)
            if (r8 == r15) goto L_0x0100
            r15 = r13
            goto L_0x010c
        L_0x0100:
            java.lang.String r15 = "audio/vnd.dts"
            goto L_0x010c
        L_0x0103:
            java.lang.String r15 = "audio/ac3"
            goto L_0x010c
        L_0x0106:
            r15 = r14
            goto L_0x010c
        L_0x0108:
            java.lang.String r15 = "audio/mpeg"
            goto L_0x010c
        L_0x010b:
            r15 = r11
        L_0x010c:
            if (r15 != 0) goto L_0x0115
            java.lang.String r11 = "Ignoring track with unsupported format tag "
            Q0.g.u(r8, r11, r7)
            goto L_0x003c
        L_0x0115:
            int r7 = r20.o()
            int r8 = r20.k()
            r13 = 6
            r0.I(r13)
            int r13 = r20.o()
            int r13 = P0.z.z(r13)
            int r16 = r20.a()
            if (r16 <= 0) goto L_0x0136
            int r16 = r20.o()
            r1 = r16
            goto L_0x0137
        L_0x0136:
            r1 = 0
        L_0x0137:
            byte[] r9 = new byte[r1]
            r0.g(r9, r4, r1)
            M0.q r4 = new M0.q
            r4.<init>()
            java.lang.String r12 = M0.I.o(r15)
            r4.f2999m = r12
            r4.f2979B = r7
            r4.f2980C = r8
            boolean r7 = r11.equals(r15)
            if (r7 == 0) goto L_0x0155
            if (r13 == 0) goto L_0x0155
            r4.f2981D = r13
        L_0x0155:
            boolean r7 = r14.equals(r15)
            if (r7 == 0) goto L_0x0163
            if (r1 <= 0) goto L_0x0163
            H3.i0 r1 = H3.O.r(r9)
            r4.f3002p = r1
        L_0x0163:
            r1.g r13 = new r1.g
            M0.r r1 = new M0.r
            r1.<init>(r4)
            r13.<init>(r1)
            goto L_0x003c
        L_0x016f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Ignoring strf box for unsupported track type: "
            r1.<init>(r4)
            java.lang.String r4 = P0.z.F(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            P0.l.B(r7, r1)
            goto L_0x003c
        L_0x0186:
            if (r7 == 0) goto L_0x01d7
            int r1 = r7.getType()
            r4 = 1752331379(0x68727473, float:4.5798432E24)
            if (r1 != r4) goto L_0x01c5
            r1 = r7
            r1.d r1 = (r1.d) r1
            r4 = 1935960438(0x73646976, float:1.809666E31)
            int r1 = r1.f14831a
            if (r1 == r4) goto L_0x01c4
            r4 = 1935963489(0x73647561, float:1.8100348E31)
            if (r1 == r4) goto L_0x01c2
            r4 = 1937012852(0x73747874, float:1.936895E31)
            if (r1 == r4) goto L_0x01bf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Found unsupported streamType fourCC: "
            r4.<init>(r5)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "AviStreamHeaderChunk"
            P0.l.B(r4, r1)
            r1 = -1
            r5 = -1
            goto L_0x01c5
        L_0x01bf:
            r1 = 3
            r5 = 3
            goto L_0x01c5
        L_0x01c2:
            r5 = 1
            goto L_0x01c5
        L_0x01c4:
            r5 = 2
        L_0x01c5:
            int r1 = r2.length
            int r4 = r6 + 1
            int r1 = H3.I.f(r1, r4)
            int r8 = r2.length
            if (r1 > r8) goto L_0x01d0
            goto L_0x01d4
        L_0x01d0:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
        L_0x01d4:
            r2[r6] = r7
            r6 = r4
        L_0x01d7:
            r0.H(r10)
            r0.G(r3)
            r1 = 4
            r4 = 0
            goto L_0x000f
        L_0x01e1:
            r1.f r0 = new r1.f
            H3.i0 r1 = H3.O.i(r6, r2)
            r2 = r19
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.f.b(int, P0.r):r1.f");
    }

    public final C1376a a(Class cls) {
        M o2 = this.f14846a.listIterator(0);
        while (o2.hasNext()) {
            C1376a aVar = (C1376a) o2.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    public final int getType() {
        return this.f14847b;
    }
}
