package f1;

import Q0.q;
import android.net.Uri;
import android.util.Base64;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11615a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f11616b;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c9, code lost:
        r3 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0736, code lost:
        if (r3 <= 0) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0738, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x073a, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x073b, code lost:
        P0.l.d(r14);
        r2 = r38;
        r2.f11615a = new f1.C0896i(r4.a(), r32.f11498a, r3, r2, r11);
        r0 = (java.lang.String) r33.get(r23);
        r1 = P0.z.f3748a;
        r1 = android.net.Uri.parse(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x076d, code lost:
        if (r1.isAbsolute() == false) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0770, code lost:
        r3 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x077c, code lost:
        if (android.text.TextUtils.isEmpty(r3.c("Content-Base")) != false) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x077e, code lost:
        r1 = android.net.Uri.parse(r3.c("Content-Base"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0791, code lost:
        if (android.text.TextUtils.isEmpty(r3.c("Content-Location")) != false) goto L_0x079c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0793, code lost:
        r1 = android.net.Uri.parse(r3.c("Content-Location"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x079c, code lost:
        r1 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07a4, code lost:
        if (r0.equals("*") == false) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07a7, code lost:
        r1 = r1.buildUpon().appendEncodedPath(r0).build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07b3, code lost:
        r2.f11616b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07b5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(f1.l r39, f1.C0889b r40, android.net.Uri r41) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
            java.lang.String r7 = "MP4A-LATM"
            java.lang.String r6 = "L16"
            java.lang.String r9 = "L8"
            r38.<init>()
            H3.n0 r5 = r2.i
            java.lang.String r3 = "control"
            boolean r4 = r5.containsKey(r3)
            java.lang.String r12 = "missing attribute control"
            P0.l.c(r12, r4)
            M0.q r4 = new M0.q
            r4.<init>()
            int r12 = r2.e
            if (r12 <= 0) goto L_0x0027
            r4.f2995h = r12
        L_0x0027:
            f1.a r12 = r2.f11509j
            java.lang.String r11 = r12.f11499b
            java.lang.String r15 = F.h.F(r11)
            r15.getClass()
            java.lang.String r14 = "audio/mp4a-latm"
            java.lang.String r13 = "audio/raw"
            java.lang.String r8 = "audio/3gpp"
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            r23 = r3
            java.lang.String r3 = "video/avc"
            java.lang.String r1 = "video/hevc"
            r24 = r1
            java.lang.String r1 = "audio/opus"
            r25 = r14
            java.lang.String r14 = "audio/g711-alaw"
            r26 = r13
            java.lang.String r13 = "audio/g711-mlaw"
            r27 = r3
            java.lang.String r3 = "audio/amr-wb"
            r28 = r3
            java.lang.String r3 = "video/mp4v-es"
            r29 = r3
            java.lang.String r3 = "video/3gpp"
            r30 = r3
            java.lang.String r3 = "audio/ac3"
            int r31 = r15.hashCode()
            switch(r31) {
                case -1922091719: goto L_0x0151;
                case 2412: goto L_0x0146;
                case 64593: goto L_0x0139;
                case 64934: goto L_0x012c;
                case 74609: goto L_0x0121;
                case 85182: goto L_0x0114;
                case 85183: goto L_0x0107;
                case 2194728: goto L_0x00f8;
                case 2194729: goto L_0x00e8;
                case 2433087: goto L_0x00d8;
                case 2450119: goto L_0x00c8;
                case 2450139: goto L_0x00b8;
                case 1061166827: goto L_0x00aa;
                case 1934494802: goto L_0x009a;
                case 1959269366: goto L_0x008a;
                case 2137188397: goto L_0x007a;
                case 2137209252: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            r31 = r8
        L_0x0067:
            r8 = -1
            goto L_0x015e
        L_0x006a:
            r31 = r8
            java.lang.String r8 = "H263-2000"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0076
            goto L_0x015b
        L_0x0076:
            r8 = 16
            goto L_0x015e
        L_0x007a:
            r31 = r8
            java.lang.String r8 = "H263-1998"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0086
            goto L_0x015b
        L_0x0086:
            r8 = 15
            goto L_0x015e
        L_0x008a:
            r31 = r8
            java.lang.String r8 = "MP4V-ES"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0096
            goto L_0x015b
        L_0x0096:
            r8 = 14
            goto L_0x015e
        L_0x009a:
            r31 = r8
            java.lang.String r8 = "AMR-WB"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00a6
            goto L_0x015b
        L_0x00a6:
            r8 = 13
            goto L_0x015e
        L_0x00aa:
            r31 = r8
            boolean r8 = r15.equals(r7)
            if (r8 != 0) goto L_0x00b4
            goto L_0x015b
        L_0x00b4:
            r8 = 12
            goto L_0x015e
        L_0x00b8:
            r31 = r8
            java.lang.String r8 = "PCMU"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00c4
            goto L_0x015b
        L_0x00c4:
            r8 = 11
            goto L_0x015e
        L_0x00c8:
            r31 = r8
            java.lang.String r8 = "PCMA"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00d4
            goto L_0x015b
        L_0x00d4:
            r8 = 10
            goto L_0x015e
        L_0x00d8:
            r31 = r8
            java.lang.String r8 = "OPUS"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00e4
            goto L_0x015b
        L_0x00e4:
            r8 = 9
            goto L_0x015e
        L_0x00e8:
            r31 = r8
            java.lang.String r8 = "H265"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00f4
            goto L_0x015b
        L_0x00f4:
            r8 = 8
            goto L_0x015e
        L_0x00f8:
            r31 = r8
            java.lang.String r8 = "H264"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0104
            goto L_0x015b
        L_0x0104:
            r8 = 7
            goto L_0x015e
        L_0x0107:
            r31 = r8
            java.lang.String r8 = "VP9"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0112
            goto L_0x015b
        L_0x0112:
            r8 = 6
            goto L_0x015e
        L_0x0114:
            r31 = r8
            java.lang.String r8 = "VP8"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x011f
            goto L_0x015b
        L_0x011f:
            r8 = 5
            goto L_0x015e
        L_0x0121:
            r31 = r8
            boolean r8 = r15.equals(r6)
            if (r8 != 0) goto L_0x012a
            goto L_0x015b
        L_0x012a:
            r8 = 4
            goto L_0x015e
        L_0x012c:
            r31 = r8
            java.lang.String r8 = "AMR"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0137
            goto L_0x015b
        L_0x0137:
            r8 = 3
            goto L_0x015e
        L_0x0139:
            r31 = r8
            java.lang.String r8 = "AC3"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0144
            goto L_0x015b
        L_0x0144:
            r8 = 2
            goto L_0x015e
        L_0x0146:
            r31 = r8
            boolean r8 = r15.equals(r9)
            if (r8 != 0) goto L_0x014f
            goto L_0x015b
        L_0x014f:
            r8 = 1
            goto L_0x015e
        L_0x0151:
            r31 = r8
            java.lang.String r8 = "MPEG4-GENERIC"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x015d
        L_0x015b:
            goto L_0x0067
        L_0x015d:
            r8 = 0
        L_0x015e:
            switch(r8) {
                case 0: goto L_0x0188;
                case 1: goto L_0x0185;
                case 2: goto L_0x0183;
                case 3: goto L_0x0180;
                case 4: goto L_0x0185;
                case 5: goto L_0x017e;
                case 6: goto L_0x017c;
                case 7: goto L_0x0179;
                case 8: goto L_0x0176;
                case 9: goto L_0x0174;
                case 10: goto L_0x0172;
                case 11: goto L_0x0170;
                case 12: goto L_0x0188;
                case 13: goto L_0x016d;
                case 14: goto L_0x016a;
                case 15: goto L_0x0167;
                case 16: goto L_0x0167;
                default: goto L_0x0161;
            }
        L_0x0161:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r11)
            throw r0
        L_0x0167:
            r8 = r30
            goto L_0x018a
        L_0x016a:
            r8 = r29
            goto L_0x018a
        L_0x016d:
            r8 = r28
            goto L_0x018a
        L_0x0170:
            r8 = r13
            goto L_0x018a
        L_0x0172:
            r8 = r14
            goto L_0x018a
        L_0x0174:
            r8 = r1
            goto L_0x018a
        L_0x0176:
            r8 = r24
            goto L_0x018a
        L_0x0179:
            r8 = r27
            goto L_0x018a
        L_0x017c:
            r8 = r0
            goto L_0x018a
        L_0x017e:
            r8 = r10
            goto L_0x018a
        L_0x0180:
            r8 = r31
            goto L_0x018a
        L_0x0183:
            r8 = r3
            goto L_0x018a
        L_0x0185:
            r8 = r26
            goto L_0x018a
        L_0x0188:
            r8 = r25
        L_0x018a:
            r4.g(r8)
            java.lang.String r2 = r2.f11502a
            java.lang.String r15 = "audio"
            boolean r2 = r15.equals(r2)
            int r15 = r12.f11500c
            if (r2 == 0) goto L_0x01b0
            int r2 = r12.f11501d
            r32 = r12
            r12 = -1
            if (r2 == r12) goto L_0x01a1
            goto L_0x01aa
        L_0x01a1:
            boolean r2 = r8.equals(r3)
            if (r2 == 0) goto L_0x01a9
            r2 = 6
            goto L_0x01aa
        L_0x01a9:
            r2 = 1
        L_0x01aa:
            r4.f2980C = r15
            r4.f2979B = r2
            r12 = r2
            goto L_0x01b3
        L_0x01b0:
            r32 = r12
            r12 = -1
        L_0x01b3:
            java.lang.String r2 = "fmtp"
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x01c8
            H3.n0 r2 = H3.n0.f2094a0
            r33 = r5
            r34 = r7
            r37 = r12
            r40 = r15
            goto L_0x021a
        L_0x01c8:
            int r33 = P0.z.f3748a
            r33 = r5
            java.lang.String r5 = " "
            r34 = r7
            r7 = 2
            java.lang.String[] r5 = r2.split(r5, r7)
            r40 = r15
            int r15 = r5.length
            if (r15 != r7) goto L_0x01dc
            r7 = 1
            goto L_0x01dd
        L_0x01dc:
            r7 = 0
        L_0x01dd:
            P0.l.c(r2, r7)
            r2 = 1
            r5 = r5[r2]
            java.lang.String r2 = ";\\s?"
            r7 = 0
            java.lang.String[] r2 = r5.split(r2, r7)
            D2.o r5 = new D2.o
            r7 = 4
            r5.<init>((int) r7)
            int r7 = r2.length
            r15 = 0
        L_0x01f2:
            if (r15 >= r7) goto L_0x0214
            r35 = r7
            r7 = r2[r15]
            r36 = r2
            java.lang.String r2 = "="
            r37 = r12
            r12 = 2
            java.lang.String[] r2 = r7.split(r2, r12)
            r7 = 0
            r12 = r2[r7]
            r7 = 1
            r2 = r2[r7]
            r5.n(r12, r2)
            int r15 = r15 + r7
            r7 = r35
            r2 = r36
            r12 = r37
            goto L_0x01f2
        L_0x0214:
            r37 = r12
            H3.n0 r2 = r5.c()
        L_0x021a:
            int r5 = r8.hashCode()
            switch(r5) {
                case -1664118616: goto L_0x02ab;
                case -1662541442: goto L_0x02a0;
                case -1606874997: goto L_0x0295;
                case -53558318: goto L_0x028a;
                case 187078296: goto L_0x0281;
                case 187094639: goto L_0x0276;
                case 1187890754: goto L_0x026b;
                case 1331836730: goto L_0x0260;
                case 1503095341: goto L_0x0255;
                case 1504891608: goto L_0x024b;
                case 1599127256: goto L_0x0241;
                case 1599127257: goto L_0x0237;
                case 1903231877: goto L_0x022d;
                case 1903589369: goto L_0x0223;
                default: goto L_0x0221;
            }
        L_0x0221:
            goto L_0x02b6
        L_0x0223:
            boolean r0 = r8.equals(r13)
            if (r0 == 0) goto L_0x02b6
            r16 = 13
            goto L_0x02b8
        L_0x022d:
            boolean r0 = r8.equals(r14)
            if (r0 == 0) goto L_0x02b6
            r16 = 12
            goto L_0x02b8
        L_0x0237:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 9
            goto L_0x02b8
        L_0x0241:
            boolean r0 = r8.equals(r10)
            if (r0 == 0) goto L_0x02b6
            r16 = 8
            goto L_0x02b8
        L_0x024b:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x02b6
            r16 = 3
            goto L_0x02b8
        L_0x0255:
            r0 = r31
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 1
            goto L_0x02b8
        L_0x0260:
            r0 = r27
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 6
            goto L_0x02b8
        L_0x026b:
            r0 = r29
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 4
            goto L_0x02b8
        L_0x0276:
            r0 = r26
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 10
            goto L_0x02b8
        L_0x0281:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L_0x02b6
            r16 = 11
            goto L_0x02b8
        L_0x028a:
            r0 = r25
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 0
            goto L_0x02b8
        L_0x0295:
            r0 = r28
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 2
            goto L_0x02b8
        L_0x02a0:
            r0 = r24
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 7
            goto L_0x02b8
        L_0x02ab:
            r0 = r30
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02b6
            r16 = 5
            goto L_0x02b8
        L_0x02b6:
            r16 = -1
        L_0x02b8:
            java.lang.String r0 = "config"
            r1 = 288(0x120, float:4.04E-43)
            r3 = 352(0x160, float:4.93E-43)
            r5 = 320(0x140, float:4.48E-43)
            java.lang.String r7 = "profile-level-id"
            java.lang.String r8 = "missing attribute fmtp"
            r10 = 240(0xf0, float:3.36E-43)
            switch(r16) {
                case 0: goto L_0x060f;
                case 1: goto L_0x05dd;
                case 2: goto L_0x05dd;
                case 3: goto L_0x05c1;
                case 4: goto L_0x0493;
                case 5: goto L_0x048b;
                case 6: goto L_0x03e1;
                case 7: goto L_0x02f9;
                case 8: goto L_0x02f4;
                case 9: goto L_0x02ef;
                case 10: goto L_0x02cf;
                default: goto L_0x02c9;
            }
        L_0x02c9:
            r3 = r40
        L_0x02cb:
            r0 = 0
            r6 = 1
            goto L_0x0736
        L_0x02cf:
            boolean r0 = r11.equals(r9)
            if (r0 != 0) goto L_0x02de
            boolean r0 = r11.equals(r6)
            if (r0 == 0) goto L_0x02dc
            goto L_0x02de
        L_0x02dc:
            r0 = 0
            goto L_0x02df
        L_0x02de:
            r0 = 1
        L_0x02df:
            P0.l.d(r0)
            boolean r0 = r11.equals(r9)
            if (r0 == 0) goto L_0x02ea
            r12 = 3
            goto L_0x02ec
        L_0x02ea:
            r12 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x02ec:
            r4.f2981D = r12
            goto L_0x02c9
        L_0x02ef:
            r4.f3006t = r5
            r4.f3007u = r10
            goto L_0x02c9
        L_0x02f4:
            r4.f3006t = r5
            r4.f3007u = r10
            goto L_0x02c9
        L_0x02f9:
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            P0.l.c(r8, r0)
            java.lang.String r0 = "sprop-max-don-diff"
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto L_0x0332
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            P0.l.h(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 != 0) goto L_0x031b
            r1 = 1
            goto L_0x031c
        L_0x031b:
            r1 = 0
        L_0x031c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "non-zero sprop-max-don-diff "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = " is not supported"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            P0.l.c(r0, r1)
        L_0x0332:
            java.lang.String r0 = "sprop-vps"
            boolean r1 = r2.containsKey(r0)
            java.lang.String r3 = "missing sprop-vps parameter"
            P0.l.c(r3, r1)
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            P0.l.h(r0)
            java.lang.String r1 = "sprop-sps"
            boolean r3 = r2.containsKey(r1)
            java.lang.String r5 = "missing sprop-sps parameter"
            P0.l.c(r5, r3)
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            P0.l.h(r1)
            java.lang.String r3 = "sprop-pps"
            boolean r5 = r2.containsKey(r3)
            java.lang.String r6 = "missing sprop-pps parameter"
            P0.l.c(r6, r5)
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            P0.l.h(r3)
            byte[] r0 = a(r0)
            byte[] r1 = a(r1)
            byte[] r3 = a(r3)
            H3.i0 r0 = H3.O.t(r0, r1, r3)
            r4.e(r0)
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            r3 = 0
            r5 = 4
            Q0.m r0 = Q0.q.g(r0, r5, r1, r3)
            float r1 = r0.f4042f
            r4.f(r1)
            int r1 = r0.e
            r4.d(r1)
            int r1 = r0.f4041d
            r4.h(r1)
            M0.h r1 = new M0.h
            r3 = 0
            r1.<init>(r3)
            int r3 = r0.f4044h
            r1.g(r3)
            int r3 = r0.i
            r1.f(r3)
            int r3 = r0.f4045j
            r1.h(r3)
            int r3 = r0.f4039b
            r5 = 8
            int r3 = r3 + r5
            r1.i(r3)
            int r3 = r0.f4040c
            int r3 = r3 + r5
            r1.e(r3)
            M0.i r1 = r1.b()
            r4.c(r1)
            Q0.i r0 = r0.f4038a
            if (r0 == 0) goto L_0x02c9
            int[] r9 = r0.e
            int r10 = r0.f4030f
            int r5 = r0.f4026a
            boolean r6 = r0.f4027b
            int r7 = r0.f4028c
            int r8 = r0.f4029d
            java.lang.String r0 = P0.a.b(r5, r6, r7, r8, r9, r10)
            r4.b(r0)
            goto L_0x02c9
        L_0x03e1:
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            P0.l.c(r8, r0)
            java.lang.String r0 = "sprop-parameter-sets"
            boolean r1 = r2.containsKey(r0)
            java.lang.String r3 = "missing sprop parameter"
            P0.l.c(r3, r1)
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            P0.l.h(r0)
            java.lang.String r1 = ","
            java.lang.String[] r0 = P0.z.Z(r0, r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L_0x040a
            r1 = 1
            goto L_0x040b
        L_0x040a:
            r1 = 0
        L_0x040b:
            java.lang.String r3 = "empty sprop value"
            P0.l.c(r3, r1)
            r1 = 0
            r3 = r0[r1]
            byte[] r3 = a(r3)
            r5 = 1
            r0 = r0[r5]
            byte[] r0 = a(r0)
            H3.i0 r0 = H3.O.s(r3, r0)
            r4.e(r0)
            java.lang.Object r0 = r0.get(r1)
            byte[] r0 = (byte[]) r0
            int r3 = r0.length
            r5 = 4
            Q0.p r0 = Q0.q.i(r0, r5, r3)
            float r3 = r0.f4056g
            r4.f(r3)
            int r3 = r0.f4055f
            r4.d(r3)
            int r3 = r0.e
            r4.h(r3)
            M0.h r3 = new M0.h
            r3.<init>(r1)
            int r1 = r0.f4064p
            r3.g(r1)
            int r1 = r0.f4065q
            r3.f(r1)
            int r1 = r0.f4066r
            r3.h(r1)
            int r1 = r0.f4057h
            r5 = 8
            int r1 = r1 + r5
            r3.i(r1)
            int r1 = r0.i
            int r1 = r1 + r5
            r3.e(r1)
            M0.i r1 = r3.b()
            r4.c(r1)
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x047c
            java.lang.String r0 = "avc1."
            java.lang.String r0 = r0.concat(r1)
            r4.b(r0)
            goto L_0x02c9
        L_0x047c:
            int r1 = r0.f4052b
            int r3 = r0.f4053c
            int r0 = r0.f4051a
            java.lang.String r0 = P0.a.a(r0, r1, r3)
            r4.b(r0)
            goto L_0x02c9
        L_0x048b:
            r4.h(r3)
            r4.d(r1)
            goto L_0x02c9
        L_0x0493:
            boolean r5 = r2.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            P0.l.d(r5)
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x05a9
            byte[] r0 = P0.z.s(r0)
            H3.i0 r1 = H3.O.r(r0)
            r4.f3002p = r1
            byte[] r1 = P0.a.f3688a
            P0.r r1 = new P0.r
            r1.<init>((byte[]) r0)
            r3 = 0
        L_0x04b6:
            r5 = 3
            int r12 = r3 + 3
            int r5 = r0.length
            if (r12 >= r5) goto L_0x04d7
            int r5 = r1.y()
            r6 = 1
            if (r5 != r6) goto L_0x04cd
            byte r5 = r0[r12]
            r5 = r5 & r10
            r6 = 32
            if (r5 == r6) goto L_0x04cb
            goto L_0x04cd
        L_0x04cb:
            r1 = 1
            goto L_0x04d8
        L_0x04cd:
            int r5 = r1.f3733b
            r6 = 2
            int r5 = r5 - r6
            r1.H(r5)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x04b6
        L_0x04d7:
            r1 = 0
        L_0x04d8:
            java.lang.String r5 = "Invalid input: VOL not found."
            P0.l.c(r5, r1)
            N1.f r1 = new N1.f
            int r5 = r0.length
            r1.<init>((int) r5, (byte[]) r0)
            r0 = 4
            int r3 = r3 + r0
            r5 = 8
            int r3 = r3 * 8
            r1.u(r3)
            r3 = 1
            r1.u(r3)
            r1.u(r5)
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x0500
            r1.u(r0)
            r3 = 3
            r1.u(r3)
        L_0x0500:
            int r0 = r1.i(r0)
            r3 = 15
            if (r0 != r3) goto L_0x050e
            r1.u(r5)
            r1.u(r5)
        L_0x050e:
            boolean r0 = r1.h()
            if (r0 == 0) goto L_0x0528
            r0 = 2
            r1.u(r0)
            r3 = 1
            r1.u(r3)
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x0529
            r3 = 79
            r1.u(r3)
            goto L_0x0529
        L_0x0528:
            r0 = 2
        L_0x0529:
            int r0 = r1.i(r0)
            if (r0 != 0) goto L_0x0531
            r0 = 1
            goto L_0x0532
        L_0x0531:
            r0 = 0
        L_0x0532:
            java.lang.String r3 = "Only supports rectangular video object layer shape."
            P0.l.c(r3, r0)
            boolean r0 = r1.h()
            P0.l.d(r0)
            r0 = 16
            int r0 = r1.i(r0)
            boolean r3 = r1.h()
            P0.l.d(r3)
            boolean r3 = r1.h()
            if (r3 == 0) goto L_0x0565
            if (r0 <= 0) goto L_0x0555
            r3 = 1
            goto L_0x0556
        L_0x0555:
            r3 = 0
        L_0x0556:
            P0.l.d(r3)
            r3 = -1
            int r0 = r0 + r3
            r3 = 0
        L_0x055c:
            if (r0 <= 0) goto L_0x0562
            r5 = 1
            int r3 = r3 + r5
            int r0 = r0 >> r5
            goto L_0x055c
        L_0x0562:
            r1.u(r3)
        L_0x0565:
            boolean r0 = r1.h()
            P0.l.d(r0)
            r0 = 13
            int r3 = r1.i(r0)
            boolean r5 = r1.h()
            P0.l.d(r5)
            int r0 = r1.i(r0)
            boolean r5 = r1.h()
            P0.l.d(r5)
            r5 = 1
            r1.u(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.f3006t = r1
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.f3007u = r0
            goto L_0x05ad
        L_0x05a9:
            r4.f3006t = r3
            r4.f3007u = r1
        L_0x05ad:
            java.lang.Object r0 = r2.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x05b7
            java.lang.String r0 = "1"
        L_0x05b7:
            java.lang.String r1 = "mp4v."
            java.lang.String r0 = r1.concat(r0)
            r4.f2996j = r0
            goto L_0x02c9
        L_0x05c1:
            r1 = r37
            r0 = -1
            if (r1 == r0) goto L_0x05c8
            r0 = 1
            goto L_0x05c9
        L_0x05c8:
            r0 = 0
        L_0x05c9:
            P0.l.d(r0)
            r0 = 48000(0xbb80, float:6.7262E-41)
            r3 = r40
            if (r3 != r0) goto L_0x05d5
            r0 = 1
            goto L_0x05d6
        L_0x05d5:
            r0 = 0
        L_0x05d6:
            java.lang.String r1 = "Invalid OPUS clock rate."
            P0.l.c(r1, r0)
            goto L_0x02cb
        L_0x05dd:
            r3 = r40
            r1 = r37
            r5 = 1
            if (r1 != r5) goto L_0x05e6
            r0 = 1
            goto L_0x05e7
        L_0x05e6:
            r0 = 0
        L_0x05e7:
            java.lang.String r1 = "Multi channel AMR is not currently supported."
            P0.l.c(r1, r0)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r5
            java.lang.String r1 = "fmtp parameters must include octet-align."
            P0.l.c(r1, r0)
            java.lang.String r0 = "octet-align"
            boolean r0 = r2.containsKey(r0)
            java.lang.String r1 = "Only octet aligned mode is currently supported."
            P0.l.c(r1, r0)
            java.lang.String r0 = "interleaving"
            boolean r0 = r2.containsKey(r0)
            r0 = r0 ^ r5
            java.lang.String r1 = "Interleaving mode is not currently supported."
            P0.l.c(r1, r0)
            goto L_0x02cb
        L_0x060f:
            r3 = r40
            r1 = r37
            r5 = 1
            r6 = -1
            if (r1 == r6) goto L_0x061a
            r20 = 1
            goto L_0x061c
        L_0x061a:
            r20 = 0
        L_0x061c:
            P0.l.d(r20)
            boolean r6 = r2.isEmpty()
            r6 = r6 ^ r5
            P0.l.c(r8, r6)
            r5 = r34
            boolean r6 = r11.equals(r5)
            if (r6 == 0) goto L_0x06d5
            java.lang.String r6 = "cpresent"
            boolean r8 = r2.containsKey(r6)
            if (r8 == 0) goto L_0x0647
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = "0"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0647
            r6 = 1
            goto L_0x0648
        L_0x0647:
            r6 = 0
        L_0x0648:
            java.lang.String r8 = "Only supports cpresent=0 in AAC audio."
            P0.l.c(r8, r6)
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "AAC audio stream must include config fmtp parameter"
            if (r0 == 0) goto L_0x06cf
            int r6 = r0.length()
            r8 = 2
            int r6 = r6 % r8
            if (r6 != 0) goto L_0x0661
            r6 = 1
            goto L_0x0662
        L_0x0661:
            r6 = 0
        L_0x0662:
            java.lang.String r8 = "Malformat MPEG4 config: "
            java.lang.String r8 = r8.concat(r0)
            P0.l.c(r8, r6)
            N1.f r6 = new N1.f
            byte[] r0 = P0.z.s(r0)
            int r8 = r0.length
            r6.<init>((int) r8, (byte[]) r0)
            r0 = 1
            int r8 = r6.i(r0)
            if (r8 != 0) goto L_0x067e
            r8 = 1
            goto L_0x067f
        L_0x067e:
            r8 = 0
        L_0x067f:
            java.lang.String r9 = "Only supports audio mux version 0."
            P0.l.c(r9, r8)
            int r8 = r6.i(r0)
            if (r8 != r0) goto L_0x068c
            r0 = 1
            goto L_0x068d
        L_0x068c:
            r0 = 0
        L_0x068d:
            java.lang.String r8 = "Only supports allStreamsSameTimeFraming."
            P0.l.c(r8, r0)
            r0 = 6
            r6.u(r0)
            r0 = 4
            int r0 = r6.i(r0)
            if (r0 != 0) goto L_0x069f
            r0 = 1
            goto L_0x06a0
        L_0x069f:
            r0 = 0
        L_0x06a0:
            java.lang.String r8 = "Only supports one program."
            P0.l.c(r8, r0)
            r0 = 3
            int r0 = r6.i(r0)
            if (r0 != 0) goto L_0x06ae
            r0 = 1
            goto L_0x06af
        L_0x06ae:
            r0 = 0
        L_0x06af:
            java.lang.String r8 = "Only supports one numLayer."
            P0.l.c(r8, r0)
            r0 = 0
            p1.a r6 = p1.C1332b.p(r6, r0)     // Catch:{ J -> 0x06c7 }
            int r8 = r6.f14338b
            r4.f2980C = r8
            int r8 = r6.f14339c
            r4.f2979B = r8
            java.lang.String r6 = r6.f14337a
            r4.b(r6)
            goto L_0x06d6
        L_0x06c7:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x06cf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x06d5:
            r0 = 0
        L_0x06d6:
            java.lang.Object r6 = r2.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x06e6
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x06e6
            java.lang.String r6 = "30"
        L_0x06e6:
            if (r6 == 0) goto L_0x06f0
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x06f0
            r5 = 1
            goto L_0x06f1
        L_0x06f0:
            r5 = 0
        L_0x06f1:
            java.lang.String r7 = "missing profile-level-id param"
            P0.l.c(r7, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mp4a.40."
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f2996j = r5
            r5 = 13
            r7 = 0
            r12 = -1
        L_0x070a:
            if (r7 >= r5) goto L_0x0716
            int[] r6 = p1.C1332b.f14340a
            r6 = r6[r7]
            if (r3 != r6) goto L_0x0713
            r12 = r7
        L_0x0713:
            r6 = 1
            int r7 = r7 + r6
            goto L_0x070a
        L_0x0716:
            r6 = 1
            r5 = -1
            r7 = 0
            r8 = 16
        L_0x071b:
            if (r7 >= r8) goto L_0x0726
            int[] r9 = p1.C1332b.f14341b
            r9 = r9[r7]
            if (r1 != r9) goto L_0x0724
            r5 = r7
        L_0x0724:
            int r7 = r7 + r6
            goto L_0x071b
        L_0x0726:
            r7 = -1
            if (r3 == r7) goto L_0x07b6
            if (r5 == r7) goto L_0x07b6
            r7 = 2
            byte[] r1 = p1.C1332b.a(r7, r12, r5)
            H3.i0 r1 = H3.O.r(r1)
            r4.f3002p = r1
        L_0x0736:
            if (r3 <= 0) goto L_0x073a
            r14 = 1
            goto L_0x073b
        L_0x073a:
            r14 = 0
        L_0x073b:
            P0.l.d(r14)
            f1.i r0 = new f1.i
            M0.r r18 = r4.a()
            r1 = r32
            int r1 = r1.f11498a
            r17 = r0
            r19 = r1
            r20 = r3
            r21 = r2
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            r2 = r38
            r2.f11615a = r0
            r1 = r23
            r0 = r33
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = P0.z.f3748a
            android.net.Uri r1 = android.net.Uri.parse(r0)
            boolean r3 = r1.isAbsolute()
            if (r3 == 0) goto L_0x0770
            goto L_0x07b3
        L_0x0770:
            java.lang.String r1 = "Content-Base"
            r3 = r39
            java.lang.String r4 = r3.c(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0787
            java.lang.String r1 = r3.c(r1)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x079e
        L_0x0787:
            java.lang.String r1 = "Content-Location"
            java.lang.String r4 = r3.c(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x079c
            java.lang.String r1 = r3.c(r1)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x079e
        L_0x079c:
            r1 = r41
        L_0x079e:
            java.lang.String r3 = "*"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x07a7
            goto L_0x07b3
        L_0x07a7:
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r0 = r1.appendEncodedPath(r0)
            android.net.Uri r1 = r0.build()
        L_0x07b3:
            r2.f11616b = r1
            return
        L_0x07b6:
            r2 = r38
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid sample rate or number of channels: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ", "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.t.<init>(f1.l, f1.b, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[(decode.length + 4)];
        System.arraycopy(q.f4068a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f11615a.equals(tVar.f11615a) || !this.f11616b.equals(tVar.f11616b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11616b.hashCode() + ((this.f11615a.hashCode() + 217) * 31);
    }
}
