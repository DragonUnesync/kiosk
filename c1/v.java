package c1;

import F.h;
import H3.L;
import H3.O;
import H3.i0;
import K.a;
import M0.I;
import M0.r;
import P0.z;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f8875a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (z.f3748a < 26 && z.f3749b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f8797a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false));
            }
            Collections.sort(arrayList, new a(1, new Object()));
        }
        if (z.f3748a < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f8797a)) {
            arrayList.add((n) arrayList.remove(0));
        }
    }

    public static String b(r rVar) {
        Pair d8;
        if ("audio/eac3-joc".equals(rVar.f3036n)) {
            return "audio/eac3";
        }
        String str = rVar.f3036n;
        if ("video/dolby-vision".equals(str) && (d8 = d(rVar)) != null) {
            int intValue = ((Integer) d8.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (!str2.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(str)) {
                return null;
            }
            return "audio/lg-ac3";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        r11 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        r12 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0594, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05ea, code lost:
        if (r13 != r2) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x05ec, code lost:
        Q0.g.u(r1, "Unknown AV1 level: ", "CodecSpecificDataUtil");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x05f2, code lost:
        r1 = new android.util.Pair(java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ff, code lost:
        switch(r12) {
            case 0: goto L_0x0149;
            case 1: goto L_0x0143;
            case 2: goto L_0x013c;
            case 3: goto L_0x0134;
            case 4: goto L_0x012c;
            case 5: goto L_0x0126;
            case 6: goto L_0x0120;
            case 7: goto L_0x011a;
            case 8: goto L_0x0114;
            case 9: goto L_0x010e;
            case 10: goto L_0x0106;
            default: goto L_0x0102;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r13 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        r13 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0114, code lost:
        r13 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        r13 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0120, code lost:
        r13 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        r13 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        r13 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0134, code lost:
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013c, code lost:
        r13 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0143, code lost:
        r12 = 2;
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        r12 = 2;
        r13 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair d(M0.r r27) {
        /*
            r0 = r27
            java.lang.String r1 = "10"
            java.lang.String r3 = "09"
            java.lang.String r4 = "08"
            java.lang.String r5 = "07"
            java.lang.String r6 = "06"
            java.lang.String r7 = "05"
            java.lang.String r8 = "04"
            java.lang.String r9 = "03"
            java.lang.String r10 = "02"
            java.lang.String r11 = "01"
            r16 = 5
            r15 = 3
            byte[] r17 = P0.a.f3688a
            java.lang.String r14 = r0.f3033k
            r18 = 0
            if (r14 != 0) goto L_0x0023
            goto L_0x0604
        L_0x0023:
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r14.split(r2)
            java.lang.String r14 = "video/dolby-vision"
            java.lang.String r13 = r0.f3036n
            boolean r13 = r14.equals(r13)
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 4096(0x1000, float:5.74E-42)
            r21 = 512(0x200, float:7.175E-43)
            r22 = 256(0x100, float:3.59E-43)
            r23 = 128(0x80, float:1.794E-43)
            r24 = 64
            r25 = 32
            java.lang.String r14 = "CodecSpecificDataUtil"
            java.lang.String r12 = r0.f3033k
            if (r13 == 0) goto L_0x024e
            int r0 = r2.length
            java.lang.String r13 = "Ignoring malformed Dolby Vision codec string: "
            if (r0 >= r15) goto L_0x004f
            N.e.H(r13, r12, r14)
            goto L_0x0604
        L_0x004f:
            java.util.regex.Pattern r0 = P0.a.f3690c
            r26 = r11
            r15 = 1
            r11 = r2[r15]
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r11 = r0.matches()
            if (r11 != 0) goto L_0x0065
            N.e.H(r13, r12, r14)
            goto L_0x0604
        L_0x0065:
            java.lang.String r0 = r0.group(r15)
            if (r0 != 0) goto L_0x0072
            r13 = r18
            r11 = r26
        L_0x006f:
            r12 = 2
            goto L_0x0150
        L_0x0072:
            int r11 = r0.hashCode()
            switch(r11) {
                case 1536: goto L_0x00f2;
                case 1537: goto L_0x00e7;
                case 1538: goto L_0x00dc;
                case 1539: goto L_0x00d1;
                case 1540: goto L_0x00c6;
                case 1541: goto L_0x00bb;
                case 1542: goto L_0x00b0;
                case 1543: goto L_0x00a5;
                case 1544: goto L_0x0098;
                case 1545: goto L_0x008b;
                case 1567: goto L_0x007e;
                default: goto L_0x0079;
            }
        L_0x0079:
            r11 = r26
        L_0x007b:
            r12 = -1
            goto L_0x00ff
        L_0x007e:
            boolean r11 = r0.equals(r1)
            if (r11 != 0) goto L_0x0085
            goto L_0x0079
        L_0x0085:
            r11 = r26
            r12 = 10
            goto L_0x00ff
        L_0x008b:
            boolean r11 = r0.equals(r3)
            if (r11 != 0) goto L_0x0092
            goto L_0x0079
        L_0x0092:
            r11 = r26
            r12 = 9
            goto L_0x00ff
        L_0x0098:
            boolean r11 = r0.equals(r4)
            if (r11 != 0) goto L_0x009f
            goto L_0x0079
        L_0x009f:
            r11 = r26
            r12 = 8
            goto L_0x00ff
        L_0x00a5:
            boolean r11 = r0.equals(r5)
            if (r11 != 0) goto L_0x00ac
            goto L_0x0079
        L_0x00ac:
            r11 = r26
            r12 = 7
            goto L_0x00ff
        L_0x00b0:
            boolean r11 = r0.equals(r6)
            if (r11 != 0) goto L_0x00b7
            goto L_0x0079
        L_0x00b7:
            r11 = r26
            r12 = 6
            goto L_0x00ff
        L_0x00bb:
            boolean r11 = r0.equals(r7)
            if (r11 != 0) goto L_0x00c2
            goto L_0x0079
        L_0x00c2:
            r11 = r26
            r12 = 5
            goto L_0x00ff
        L_0x00c6:
            boolean r11 = r0.equals(r8)
            if (r11 != 0) goto L_0x00cd
            goto L_0x0079
        L_0x00cd:
            r11 = r26
            r12 = 4
            goto L_0x00ff
        L_0x00d1:
            boolean r11 = r0.equals(r9)
            if (r11 != 0) goto L_0x00d8
            goto L_0x0079
        L_0x00d8:
            r11 = r26
            r12 = 3
            goto L_0x00ff
        L_0x00dc:
            boolean r11 = r0.equals(r10)
            if (r11 != 0) goto L_0x00e3
            goto L_0x0079
        L_0x00e3:
            r11 = r26
            r12 = 2
            goto L_0x00ff
        L_0x00e7:
            r11 = r26
            boolean r12 = r0.equals(r11)
            if (r12 != 0) goto L_0x00f0
            goto L_0x00fc
        L_0x00f0:
            r12 = 1
            goto L_0x00ff
        L_0x00f2:
            r11 = r26
            java.lang.String r12 = "00"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x00fe
        L_0x00fc:
            goto L_0x007b
        L_0x00fe:
            r12 = 0
        L_0x00ff:
            switch(r12) {
                case 0: goto L_0x0149;
                case 1: goto L_0x0143;
                case 2: goto L_0x013c;
                case 3: goto L_0x0134;
                case 4: goto L_0x012c;
                case 5: goto L_0x0126;
                case 6: goto L_0x0120;
                case 7: goto L_0x011a;
                case 8: goto L_0x0114;
                case 9: goto L_0x010e;
                case 10: goto L_0x0106;
                default: goto L_0x0102;
            }
        L_0x0102:
            r13 = r18
            goto L_0x006f
        L_0x0106:
            r12 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x006f
        L_0x010e:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            goto L_0x006f
        L_0x0114:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r22)
            goto L_0x006f
        L_0x011a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r23)
            goto L_0x006f
        L_0x0120:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r24)
            goto L_0x006f
        L_0x0126:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r25)
            goto L_0x006f
        L_0x012c:
            r12 = 16
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x006f
        L_0x0134:
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x006f
        L_0x013c:
            r12 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x006f
        L_0x0143:
            r12 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            goto L_0x0150
        L_0x0149:
            r12 = 2
            r13 = 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r13 = r15
        L_0x0150:
            if (r13 != 0) goto L_0x0159
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            N.e.H(r1, r0, r14)
            goto L_0x0604
        L_0x0159:
            r0 = r2[r12]
            if (r0 != 0) goto L_0x0161
        L_0x015d:
            r1 = r18
            goto L_0x023c
        L_0x0161:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1537: goto L_0x01e5;
                case 1538: goto L_0x01dc;
                case 1539: goto L_0x01d3;
                case 1540: goto L_0x01ca;
                case 1541: goto L_0x01c1;
                case 1542: goto L_0x01b8;
                case 1543: goto L_0x01af;
                case 1544: goto L_0x01a6;
                case 1545: goto L_0x019c;
                case 1567: goto L_0x0192;
                case 1568: goto L_0x0185;
                case 1569: goto L_0x0178;
                case 1570: goto L_0x016b;
                default: goto L_0x0168;
            }
        L_0x0168:
            r2 = -1
            goto L_0x01ee
        L_0x016b:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0174
            goto L_0x0168
        L_0x0174:
            r2 = 12
            goto L_0x01ee
        L_0x0178:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0181
            goto L_0x0168
        L_0x0181:
            r2 = 11
            goto L_0x01ee
        L_0x0185:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x018e
            goto L_0x0168
        L_0x018e:
            r2 = 10
            goto L_0x01ee
        L_0x0192:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0199
            goto L_0x0168
        L_0x0199:
            r2 = 9
            goto L_0x01ee
        L_0x019c:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L_0x01a3
            goto L_0x0168
        L_0x01a3:
            r2 = 8
            goto L_0x01ee
        L_0x01a6:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L_0x01ad
            goto L_0x0168
        L_0x01ad:
            r2 = 7
            goto L_0x01ee
        L_0x01af:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L_0x01b6
            goto L_0x0168
        L_0x01b6:
            r2 = 6
            goto L_0x01ee
        L_0x01b8:
            boolean r1 = r0.equals(r6)
            if (r1 != 0) goto L_0x01bf
            goto L_0x0168
        L_0x01bf:
            r2 = 5
            goto L_0x01ee
        L_0x01c1:
            boolean r1 = r0.equals(r7)
            if (r1 != 0) goto L_0x01c8
            goto L_0x0168
        L_0x01c8:
            r2 = 4
            goto L_0x01ee
        L_0x01ca:
            boolean r1 = r0.equals(r8)
            if (r1 != 0) goto L_0x01d1
            goto L_0x0168
        L_0x01d1:
            r2 = 3
            goto L_0x01ee
        L_0x01d3:
            boolean r1 = r0.equals(r9)
            if (r1 != 0) goto L_0x01da
            goto L_0x0168
        L_0x01da:
            r2 = 2
            goto L_0x01ee
        L_0x01dc:
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L_0x01e3
            goto L_0x0168
        L_0x01e3:
            r2 = 1
            goto L_0x01ee
        L_0x01e5:
            boolean r1 = r0.equals(r11)
            if (r1 != 0) goto L_0x01ed
            goto L_0x0168
        L_0x01ed:
            r2 = 0
        L_0x01ee:
            switch(r2) {
                case 0: goto L_0x0237;
                case 1: goto L_0x0231;
                case 2: goto L_0x022b;
                case 3: goto L_0x0224;
                case 4: goto L_0x021d;
                case 5: goto L_0x0218;
                case 6: goto L_0x0213;
                case 7: goto L_0x020e;
                case 8: goto L_0x0209;
                case 9: goto L_0x0204;
                case 10: goto L_0x01fd;
                case 11: goto L_0x01f8;
                case 12: goto L_0x01f3;
                default: goto L_0x01f1;
            }
        L_0x01f1:
            goto L_0x015d
        L_0x01f3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            goto L_0x023c
        L_0x01f8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            goto L_0x023c
        L_0x01fd:
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x023c
        L_0x0204:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            goto L_0x023c
        L_0x0209:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            goto L_0x023c
        L_0x020e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            goto L_0x023c
        L_0x0213:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            goto L_0x023c
        L_0x0218:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            goto L_0x023c
        L_0x021d:
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x023c
        L_0x0224:
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x023c
        L_0x022b:
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x023c
        L_0x0231:
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x023c
        L_0x0237:
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x023c:
            if (r1 != 0) goto L_0x0245
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            N.e.H(r1, r0, r14)
            goto L_0x0604
        L_0x0245:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r13, r1)
        L_0x024a:
            r18 = r0
            goto L_0x0604
        L_0x024e:
            r1 = 1024(0x400, float:1.435E-42)
            r3 = 0
            r4 = r2[r3]
            r4.getClass()
            r3 = 16384(0x4000, float:2.2959E-41)
            r5 = 32768(0x8000, float:4.5918E-41)
            r6 = 65536(0x10000, float:9.18355E-41)
            r7 = 20
            M0.i r0 = r0.f3013B
            r8 = 8192(0x2000, float:1.14794E-41)
            int r9 = r4.hashCode()
            switch(r9) {
                case 3004662: goto L_0x02ba;
                case 3006243: goto L_0x02af;
                case 3006244: goto L_0x02a4;
                case 3199032: goto L_0x0299;
                case 3214780: goto L_0x028e;
                case 3356560: goto L_0x0283;
                case 3475740: goto L_0x0278;
                case 3624515: goto L_0x026d;
                default: goto L_0x026a;
            }
        L_0x026a:
            r4 = -1
            goto L_0x02c4
        L_0x026d:
            java.lang.String r9 = "vp09"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0276
            goto L_0x026a
        L_0x0276:
            r4 = 7
            goto L_0x02c4
        L_0x0278:
            java.lang.String r9 = "s263"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0281
            goto L_0x026a
        L_0x0281:
            r4 = 6
            goto L_0x02c4
        L_0x0283:
            java.lang.String r9 = "mp4a"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x028c
            goto L_0x026a
        L_0x028c:
            r4 = 5
            goto L_0x02c4
        L_0x028e:
            java.lang.String r9 = "hvc1"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0297
            goto L_0x026a
        L_0x0297:
            r4 = 4
            goto L_0x02c4
        L_0x0299:
            java.lang.String r9 = "hev1"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x02a2
            goto L_0x026a
        L_0x02a2:
            r4 = 3
            goto L_0x02c4
        L_0x02a4:
            java.lang.String r9 = "avc2"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x02ad
            goto L_0x026a
        L_0x02ad:
            r4 = 2
            goto L_0x02c4
        L_0x02af:
            java.lang.String r9 = "avc1"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x02b8
            goto L_0x026a
        L_0x02b8:
            r4 = 1
            goto L_0x02c4
        L_0x02ba:
            java.lang.String r9 = "av01"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x02c3
            goto L_0x026a
        L_0x02c3:
            r4 = 0
        L_0x02c4:
            switch(r4) {
                case 0: goto L_0x0536;
                case 1: goto L_0x043c;
                case 2: goto L_0x043c;
                case 3: goto L_0x0436;
                case 4: goto L_0x0436;
                case 5: goto L_0x03b3;
                case 6: goto L_0x037b;
                case 7: goto L_0x02c9;
                default: goto L_0x02c7;
            }
        L_0x02c7:
            goto L_0x0604
        L_0x02c9:
            int r0 = r2.length
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            r3 = 3
            if (r0 >= r3) goto L_0x02d4
            N.e.H(r1, r12, r14)
            goto L_0x0604
        L_0x02d4:
            r0 = 1
            r3 = r2[r0]     // Catch:{ NumberFormatException -> 0x0376 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0376 }
            r4 = 2
            r2 = r2[r4]     // Catch:{ NumberFormatException -> 0x0376 }
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0376 }
            if (r3 == 0) goto L_0x02f5
            if (r3 == r0) goto L_0x02f3
            if (r3 == r4) goto L_0x02f1
            r0 = 3
            if (r3 == r0) goto L_0x02ee
            r0 = -1
        L_0x02ec:
            r2 = -1
            goto L_0x02f7
        L_0x02ee:
            r0 = 8
            goto L_0x02ec
        L_0x02f1:
            r0 = 4
            goto L_0x02ec
        L_0x02f3:
            r0 = 2
            goto L_0x02ec
        L_0x02f5:
            r0 = 1
            goto L_0x02ec
        L_0x02f7:
            if (r0 != r2) goto L_0x0300
            java.lang.String r0 = "Unknown VP9 profile: "
            Q0.g.u(r3, r0, r14)
            goto L_0x0604
        L_0x0300:
            r2 = 10
            if (r1 == r2) goto L_0x035a
            r2 = 11
            if (r1 == r2) goto L_0x0357
            if (r1 == r7) goto L_0x0354
            r2 = 21
            if (r1 == r2) goto L_0x0350
            r2 = 30
            if (r1 == r2) goto L_0x034c
            r2 = 31
            if (r1 == r2) goto L_0x0348
            r2 = 40
            if (r1 == r2) goto L_0x0344
            r2 = 41
            if (r1 == r2) goto L_0x0340
            r2 = 50
            if (r1 == r2) goto L_0x033c
            r2 = 51
            if (r1 == r2) goto L_0x0338
            switch(r1) {
                case 60: goto L_0x0334;
                case 61: goto L_0x0330;
                case 62: goto L_0x032c;
                default: goto L_0x0329;
            }
        L_0x0329:
            r2 = -1
            r13 = -1
            goto L_0x035c
        L_0x032c:
            r2 = -1
            r13 = 8192(0x2000, float:1.14794E-41)
            goto L_0x035c
        L_0x0330:
            r2 = -1
            r13 = 4096(0x1000, float:5.74E-42)
            goto L_0x035c
        L_0x0334:
            r2 = -1
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x035c
        L_0x0338:
            r2 = -1
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x035c
        L_0x033c:
            r2 = -1
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x035c
        L_0x0340:
            r2 = -1
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x035c
        L_0x0344:
            r2 = -1
            r13 = 64
            goto L_0x035c
        L_0x0348:
            r2 = -1
            r13 = 32
            goto L_0x035c
        L_0x034c:
            r2 = -1
            r13 = 16
            goto L_0x035c
        L_0x0350:
            r2 = -1
            r13 = 8
            goto L_0x035c
        L_0x0354:
            r2 = -1
            r13 = 4
            goto L_0x035c
        L_0x0357:
            r2 = -1
            r13 = 2
            goto L_0x035c
        L_0x035a:
            r2 = -1
            r13 = 1
        L_0x035c:
            if (r13 != r2) goto L_0x0365
            java.lang.String r0 = "Unknown VP9 level: "
            Q0.g.u(r1, r0, r14)
            goto L_0x0604
        L_0x0365:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.<init>(r0, r2)
        L_0x0372:
            r18 = r1
            goto L_0x0604
        L_0x0376:
            N.e.H(r1, r12, r14)
            goto L_0x0604
        L_0x037b:
            android.util.Pair r0 = new android.util.Pair
            r1 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.<init>(r3, r3)
            int r3 = r2.length
            java.lang.String r4 = "Ignoring malformed H263 codec string: "
            r5 = 3
            if (r3 >= r5) goto L_0x0390
            N.e.H(r4, r12, r14)
            goto L_0x024a
        L_0x0390:
            r1 = r2[r1]     // Catch:{ NumberFormatException -> 0x03ae }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x03ae }
            r3 = 2
            r2 = r2[r3]     // Catch:{ NumberFormatException -> 0x03ae }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x03ae }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x03ae }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x03ae }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x03ae }
            r3.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x03ae }
            r18 = r3
            goto L_0x0604
        L_0x03ae:
            N.e.H(r4, r12, r14)
            goto L_0x024a
        L_0x03b3:
            int r0 = r2.length
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            r3 = 3
            if (r0 == r3) goto L_0x03be
            N.e.H(r1, r12, r14)
            goto L_0x0604
        L_0x03be:
            r0 = 1
            r3 = r2[r0]     // Catch:{ NumberFormatException -> 0x0431 }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r3, r0)     // Catch:{ NumberFormatException -> 0x0431 }
            java.lang.String r0 = M0.I.f(r0)     // Catch:{ NumberFormatException -> 0x0431 }
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)     // Catch:{ NumberFormatException -> 0x0431 }
            if (r0 == 0) goto L_0x0604
            r0 = 2
            r2 = r2[r0]     // Catch:{ NumberFormatException -> 0x0431 }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0431 }
            r2 = 17
            if (r0 == r2) goto L_0x041c
            if (r0 == r7) goto L_0x0418
            r2 = 23
            if (r0 == r2) goto L_0x0414
            r2 = 29
            if (r0 == r2) goto L_0x0410
            r2 = 39
            if (r0 == r2) goto L_0x040c
            r2 = 42
            if (r0 == r2) goto L_0x0408
            switch(r0) {
                case 1: goto L_0x0405;
                case 2: goto L_0x0402;
                case 3: goto L_0x03ff;
                case 4: goto L_0x03fc;
                case 5: goto L_0x03f9;
                case 6: goto L_0x03f6;
                default: goto L_0x03f3;
            }     // Catch:{ NumberFormatException -> 0x0431 }
        L_0x03f3:
            r0 = -1
            r15 = -1
            goto L_0x041f
        L_0x03f6:
            r0 = -1
            r15 = 6
            goto L_0x041f
        L_0x03f9:
            r0 = -1
            r15 = 5
            goto L_0x041f
        L_0x03fc:
            r0 = -1
            r15 = 4
            goto L_0x041f
        L_0x03ff:
            r0 = -1
            r15 = 3
            goto L_0x041f
        L_0x0402:
            r0 = -1
            r15 = 2
            goto L_0x041f
        L_0x0405:
            r0 = -1
            r15 = 1
            goto L_0x041f
        L_0x0408:
            r0 = -1
            r15 = 42
            goto L_0x041f
        L_0x040c:
            r0 = -1
            r15 = 39
            goto L_0x041f
        L_0x0410:
            r0 = -1
            r15 = 29
            goto L_0x041f
        L_0x0414:
            r0 = -1
            r15 = 23
            goto L_0x041f
        L_0x0418:
            r0 = -1
            r15 = 20
            goto L_0x041f
        L_0x041c:
            r0 = -1
            r15 = 17
        L_0x041f:
            if (r15 == r0) goto L_0x0604
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0431 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x0431 }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0431 }
            r0.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x0431 }
            goto L_0x024a
        L_0x0431:
            N.e.H(r1, r12, r14)
            goto L_0x0604
        L_0x0436:
            android.util.Pair r18 = P0.a.c(r12, r2, r0)
            goto L_0x0604
        L_0x043c:
            int r0 = r2.length
            java.lang.String r4 = "Ignoring malformed AVC codec string: "
            r7 = 2
            if (r0 >= r7) goto L_0x0447
            N.e.H(r4, r12, r14)
            goto L_0x0604
        L_0x0447:
            r0 = 1
            r9 = r2[r0]     // Catch:{ NumberFormatException -> 0x0531 }
            int r9 = r9.length()     // Catch:{ NumberFormatException -> 0x0531 }
            r10 = 6
            if (r9 != r10) goto L_0x046a
            r9 = r2[r0]     // Catch:{ NumberFormatException -> 0x0531 }
            r10 = 0
            java.lang.String r9 = r9.substring(r10, r7)     // Catch:{ NumberFormatException -> 0x0531 }
            r7 = 16
            int r9 = java.lang.Integer.parseInt(r9, r7)     // Catch:{ NumberFormatException -> 0x0531 }
            r2 = r2[r0]     // Catch:{ NumberFormatException -> 0x0531 }
            r0 = 4
            java.lang.String r2 = r2.substring(r0)     // Catch:{ NumberFormatException -> 0x0531 }
            int r0 = java.lang.Integer.parseInt(r2, r7)     // Catch:{ NumberFormatException -> 0x0531 }
            goto L_0x047e
        L_0x046a:
            r7 = 16
            int r0 = r2.length     // Catch:{ NumberFormatException -> 0x0531 }
            r9 = 3
            if (r0 < r9) goto L_0x0520
            r0 = 1
            r9 = r2[r0]     // Catch:{ NumberFormatException -> 0x0531 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0531 }
            r0 = 2
            r2 = r2[r0]     // Catch:{ NumberFormatException -> 0x0531 }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0531 }
        L_0x047e:
            r2 = 66
            if (r9 == r2) goto L_0x04ad
            r2 = 77
            if (r9 == r2) goto L_0x04ab
            r2 = 88
            if (r9 == r2) goto L_0x04a9
            r2 = 100
            if (r9 == r2) goto L_0x04a6
            r2 = 110(0x6e, float:1.54E-43)
            if (r9 == r2) goto L_0x04a3
            r2 = 122(0x7a, float:1.71E-43)
            if (r9 == r2) goto L_0x04a0
            r2 = 244(0xf4, float:3.42E-43)
            if (r9 == r2) goto L_0x049d
            r2 = -1
        L_0x049b:
            r4 = -1
            goto L_0x04af
        L_0x049d:
            r2 = 64
            goto L_0x049b
        L_0x04a0:
            r2 = 32
            goto L_0x049b
        L_0x04a3:
            r2 = 16
            goto L_0x049b
        L_0x04a6:
            r2 = 8
            goto L_0x049b
        L_0x04a9:
            r2 = 4
            goto L_0x049b
        L_0x04ab:
            r2 = 2
            goto L_0x049b
        L_0x04ad:
            r2 = 1
            goto L_0x049b
        L_0x04af:
            if (r2 != r4) goto L_0x04b8
            java.lang.String r0 = "Unknown AVC profile: "
            Q0.g.u(r9, r0, r14)
            goto L_0x0604
        L_0x04b8:
            switch(r0) {
                case 10: goto L_0x0506;
                case 11: goto L_0x0503;
                case 12: goto L_0x04ff;
                case 13: goto L_0x04fb;
                default: goto L_0x04bb;
            }
        L_0x04bb:
            switch(r0) {
                case 20: goto L_0x04f7;
                case 21: goto L_0x04f3;
                case 22: goto L_0x04ef;
                default: goto L_0x04be;
            }
        L_0x04be:
            switch(r0) {
                case 30: goto L_0x04eb;
                case 31: goto L_0x04e7;
                case 32: goto L_0x04e3;
                default: goto L_0x04c1;
            }
        L_0x04c1:
            switch(r0) {
                case 40: goto L_0x04df;
                case 41: goto L_0x04db;
                case 42: goto L_0x04d7;
                default: goto L_0x04c4;
            }
        L_0x04c4:
            switch(r0) {
                case 50: goto L_0x04d3;
                case 51: goto L_0x04ce;
                case 52: goto L_0x04ca;
                default: goto L_0x04c7;
            }
        L_0x04c7:
            r1 = -1
            r13 = -1
            goto L_0x0508
        L_0x04ca:
            r1 = -1
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0508
        L_0x04ce:
            r1 = -1
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0508
        L_0x04d3:
            r1 = -1
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0508
        L_0x04d7:
            r1 = -1
            r13 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0508
        L_0x04db:
            r1 = -1
            r13 = 4096(0x1000, float:5.74E-42)
            goto L_0x0508
        L_0x04df:
            r1 = -1
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0508
        L_0x04e3:
            r1 = -1
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x0508
        L_0x04e7:
            r1 = -1
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x0508
        L_0x04eb:
            r1 = -1
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0508
        L_0x04ef:
            r1 = -1
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x0508
        L_0x04f3:
            r1 = -1
            r13 = 64
            goto L_0x0508
        L_0x04f7:
            r1 = -1
            r13 = 32
            goto L_0x0508
        L_0x04fb:
            r1 = -1
            r13 = 16
            goto L_0x0508
        L_0x04ff:
            r1 = -1
            r13 = 8
            goto L_0x0508
        L_0x0503:
            r1 = -1
            r13 = 4
            goto L_0x0508
        L_0x0506:
            r1 = -1
            r13 = 1
        L_0x0508:
            if (r13 != r1) goto L_0x0511
            java.lang.String r1 = "Unknown AVC level: "
            Q0.g.u(r0, r1, r14)
            goto L_0x0604
        L_0x0511:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.<init>(r1, r2)
            goto L_0x024a
        L_0x0520:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0531 }
            r0.<init>(r4)     // Catch:{ NumberFormatException -> 0x0531 }
            r0.append(r12)     // Catch:{ NumberFormatException -> 0x0531 }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x0531 }
            P0.l.B(r14, r0)     // Catch:{ NumberFormatException -> 0x0531 }
            goto L_0x0604
        L_0x0531:
            N.e.H(r4, r12, r14)
            goto L_0x0604
        L_0x0536:
            r7 = 16
            int r4 = r2.length
            java.lang.String r9 = "Ignoring malformed AV1 codec string: "
            r10 = 4
            if (r4 >= r10) goto L_0x0543
            N.e.H(r9, r12, r14)
            goto L_0x0604
        L_0x0543:
            r15 = 1
            r4 = r2[r15]     // Catch:{ NumberFormatException -> 0x0601 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0601 }
            r11 = 2
            r13 = r2[r11]     // Catch:{ NumberFormatException -> 0x0601 }
            r1 = 0
            java.lang.String r1 = r13.substring(r1, r11)     // Catch:{ NumberFormatException -> 0x0601 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0601 }
            r13 = 3
            r2 = r2[r13]     // Catch:{ NumberFormatException -> 0x0601 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0601 }
            if (r4 == 0) goto L_0x0566
            java.lang.String r0 = "Unknown AV1 profile: "
            Q0.g.u(r4, r0, r14)
            goto L_0x0604
        L_0x0566:
            r4 = 8
            if (r2 == r4) goto L_0x0575
            r9 = 10
            if (r2 == r9) goto L_0x0575
            java.lang.String r0 = "Unknown AV1 bit depth: "
            Q0.g.u(r2, r0, r14)
            goto L_0x0604
        L_0x0575:
            if (r2 != r4) goto L_0x0579
            r0 = 1
            goto L_0x058b
        L_0x0579:
            if (r0 == 0) goto L_0x058a
            byte[] r2 = r0.f2960d
            if (r2 != 0) goto L_0x0587
            int r0 = r0.f2959c
            r2 = 7
            if (r0 == r2) goto L_0x0587
            r2 = 6
            if (r0 != r2) goto L_0x058a
        L_0x0587:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x058b
        L_0x058a:
            r0 = 2
        L_0x058b:
            switch(r1) {
                case 0: goto L_0x05e8;
                case 1: goto L_0x05e5;
                case 2: goto L_0x05e2;
                case 3: goto L_0x05de;
                case 4: goto L_0x05da;
                case 5: goto L_0x05d6;
                case 6: goto L_0x05d2;
                case 7: goto L_0x05ce;
                case 8: goto L_0x05ca;
                case 9: goto L_0x05c6;
                case 10: goto L_0x05c2;
                case 11: goto L_0x05be;
                case 12: goto L_0x05ba;
                case 13: goto L_0x05b6;
                case 14: goto L_0x05b2;
                case 15: goto L_0x05ad;
                case 16: goto L_0x05a9;
                case 17: goto L_0x05a6;
                case 18: goto L_0x05a3;
                case 19: goto L_0x05a0;
                case 20: goto L_0x059d;
                case 21: goto L_0x059a;
                case 22: goto L_0x0597;
                case 23: goto L_0x0592;
                default: goto L_0x058e;
            }
        L_0x058e:
            r2 = -1
            r13 = -1
            goto L_0x05ea
        L_0x0592:
            r13 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0594:
            r2 = -1
            goto L_0x05ea
        L_0x0597:
            r13 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0594
        L_0x059a:
            r13 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0594
        L_0x059d:
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0594
        L_0x05a0:
            r13 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0594
        L_0x05a3:
            r13 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0594
        L_0x05a6:
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0594
        L_0x05a9:
            r2 = -1
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x05ea
        L_0x05ad:
            r2 = -1
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x05ea
        L_0x05b2:
            r2 = -1
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x05ea
        L_0x05b6:
            r2 = -1
            r13 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05ea
        L_0x05ba:
            r2 = -1
            r13 = 4096(0x1000, float:5.74E-42)
            goto L_0x05ea
        L_0x05be:
            r2 = -1
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x05ea
        L_0x05c2:
            r2 = -1
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x05ea
        L_0x05c6:
            r2 = -1
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x05ea
        L_0x05ca:
            r2 = -1
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x05ea
        L_0x05ce:
            r2 = -1
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x05ea
        L_0x05d2:
            r2 = -1
            r13 = 64
            goto L_0x05ea
        L_0x05d6:
            r2 = -1
            r13 = 32
            goto L_0x05ea
        L_0x05da:
            r2 = -1
            r13 = 16
            goto L_0x05ea
        L_0x05de:
            r2 = -1
            r13 = 8
            goto L_0x05ea
        L_0x05e2:
            r2 = -1
            r13 = 4
            goto L_0x05ea
        L_0x05e5:
            r2 = -1
            r13 = 2
            goto L_0x05ea
        L_0x05e8:
            r2 = -1
            r13 = 1
        L_0x05ea:
            if (r13 != r2) goto L_0x05f2
            java.lang.String r0 = "Unknown AV1 level: "
            Q0.g.u(r1, r0, r14)
            goto L_0x0604
        L_0x05f2:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.<init>(r0, r2)
            goto L_0x0372
        L_0x0601:
            N.e.H(r9, r12, r14)
        L_0x0604:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.v.d(M0.r):android.util.Pair");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [D2.j, c1.t, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048 A[Catch:{ all -> 0x006b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List e(java.lang.String r5, boolean r6, boolean r7) {
        /*
            java.lang.String r0 = "MediaCodecList API didn't list secure decoder for: "
            java.lang.Class<c1.v> r1 = c1.v.class
            monitor-enter(r1)
            c1.r r2 = new c1.r     // Catch:{ all -> 0x006b }
            r2.<init>(r5, r6, r7)     // Catch:{ all -> 0x006b }
            java.util.HashMap r3 = f8875a     // Catch:{ all -> 0x006b }
            java.lang.Object r4 = r3.get(r2)     // Catch:{ all -> 0x006b }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0016
            monitor-exit(r1)
            return r4
        L_0x0016:
            D2.j r4 = new D2.j     // Catch:{ all -> 0x006b }
            r4.<init>()     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x0022
            if (r7 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r7 = 0
            goto L_0x0023
        L_0x0022:
            r7 = 1
        L_0x0023:
            r4.f1093U = r7     // Catch:{ all -> 0x006b }
            java.util.ArrayList r7 = f(r2, r4)     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x006d
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x006d
            int r6 = P0.z.f3748a     // Catch:{ all -> 0x006b }
            r4 = 23
            if (r6 > r4) goto L_0x006d
            a1.a r6 = new a1.a     // Catch:{ all -> 0x006b }
            r7 = 8
            r6.<init>((int) r7)     // Catch:{ all -> 0x006b }
            java.util.ArrayList r7 = f(r2, r6)     // Catch:{ all -> 0x006b }
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x006d
            java.lang.String r6 = "MediaCodecUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r4.<init>(r0)     // Catch:{ all -> 0x006b }
            r4.append(r5)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = ". Assuming: "
            r4.append(r0)     // Catch:{ all -> 0x006b }
            r0 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x006b }
            c1.n r0 = (c1.n) r0     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.f8797a     // Catch:{ all -> 0x006b }
            r4.append(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x006b }
            P0.l.B(r6, r0)     // Catch:{ all -> 0x006b }
            goto L_0x006d
        L_0x006b:
            r5 = move-exception
            goto L_0x0079
        L_0x006d:
            a(r5, r7)     // Catch:{ all -> 0x006b }
            H3.O r5 = H3.O.m(r7)     // Catch:{ all -> 0x006b }
            r3.put(r2, r5)     // Catch:{ all -> 0x006b }
            monitor-exit(r1)
            return r5
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.v.e(java.lang.String, boolean, boolean):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0124 A[SYNTHETIC, Splitter:B:73:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList f(c1.r r23, c1.t r24) {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014d }
            r5.<init>()     // Catch:{ Exception -> 0x014d }
            java.lang.String r14 = r1.f8872a     // Catch:{ Exception -> 0x014d }
            int r15 = r24.f()     // Catch:{ Exception -> 0x014d }
            boolean r13 = r24.j()     // Catch:{ Exception -> 0x014d }
            r16 = 0
            r12 = 0
        L_0x001a:
            if (r12 >= r15) goto L_0x0173
            android.media.MediaCodecInfo r0 = r2.c(r12)     // Catch:{ Exception -> 0x014d }
            int r6 = P0.z.f3748a     // Catch:{ Exception -> 0x014d }
            r7 = 29
            if (r6 < r7) goto L_0x0032
            boolean r8 = r0.isAlias()     // Catch:{ Exception -> 0x014d }
            if (r8 == 0) goto L_0x0032
        L_0x002c:
            r18 = r12
            r22 = r13
            goto L_0x0143
        L_0x0032:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014d }
            boolean r8 = h(r0, r11, r13, r14)     // Catch:{ Exception -> 0x014d }
            if (r8 != 0) goto L_0x003d
            goto L_0x002c
        L_0x003d:
            java.lang.String r10 = c(r0, r11, r14)     // Catch:{ Exception -> 0x014d }
            if (r10 != 0) goto L_0x0044
            goto L_0x002c
        L_0x0044:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x0114 }
            boolean r8 = r2.h(r4, r10, r9)     // Catch:{ Exception -> 0x0114 }
            boolean r17 = r2.e(r4, r9)     // Catch:{ Exception -> 0x0114 }
            boolean r7 = r1.f8874c     // Catch:{ Exception -> 0x0114 }
            if (r7 != 0) goto L_0x0056
            if (r17 != 0) goto L_0x002c
        L_0x0056:
            if (r7 == 0) goto L_0x005b
            if (r8 != 0) goto L_0x005b
            goto L_0x002c
        L_0x005b:
            boolean r7 = r2.h(r3, r10, r9)     // Catch:{ Exception -> 0x0114 }
            boolean r8 = r2.e(r3, r9)     // Catch:{ Exception -> 0x0114 }
            boolean r2 = r1.f8873b
            if (r2 != 0) goto L_0x0069
            if (r8 != 0) goto L_0x002c
        L_0x0069:
            if (r2 == 0) goto L_0x006e
            if (r7 != 0) goto L_0x006e
            goto L_0x002c
        L_0x006e:
            r8 = 29
            if (r6 < r8) goto L_0x007b
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0114 }
            r19 = r8
            r17 = 1
            goto L_0x0085
        L_0x007b:
            boolean r8 = i(r0, r14)     // Catch:{ Exception -> 0x0114 }
            r17 = 1
            r8 = r8 ^ 1
            r19 = r8
        L_0x0085:
            boolean r20 = i(r0, r14)     // Catch:{ Exception -> 0x0114 }
            r8 = 29
            if (r6 < r8) goto L_0x0092
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0114 }
            goto L_0x00b6
        L_0x0092:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = F.h.E(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0114 }
            if (r6 != 0) goto L_0x00b4
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0114 }
            if (r6 != 0) goto L_0x00b4
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0114 }
            if (r0 != 0) goto L_0x00b4
            r8 = 1
            goto L_0x00b5
        L_0x00b4:
            r8 = 0
        L_0x00b5:
            r0 = r8
        L_0x00b6:
            if (r13 == 0) goto L_0x00ba
            if (r2 == r7) goto L_0x00be
        L_0x00ba:
            if (r13 != 0) goto L_0x00dd
            if (r2 != 0) goto L_0x00dd
        L_0x00be:
            r2 = 0
            r6 = r11
            r7 = r14
            r8 = r10
            r17 = r10
            r10 = r19
            r21 = r11
            r11 = r20
            r18 = r12
            r12 = r0
            r22 = r13
            r13 = r2
            c1.n r0 = c1.n.h(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00d9 }
            r5.add(r0)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x0143
        L_0x00d9:
            r0 = move-exception
            r1 = r21
            goto L_0x011c
        L_0x00dd:
            r17 = r10
            r21 = r11
            r18 = r12
            r22 = r13
            if (r22 != 0) goto L_0x0143
            if (r7 == 0) goto L_0x0143
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d9 }
            r2.<init>()     // Catch:{ Exception -> 0x00d9 }
            r13 = r21
            r2.append(r13)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r6 = ".secure"
            r2.append(r6)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0111 }
            r2 = 1
            r7 = r14
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r0
            r1 = r13
            r13 = r2
            c1.n r0 = c1.n.h(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x010f }
            r5.add(r0)     // Catch:{ Exception -> 0x010f }
            return r5
        L_0x010f:
            r0 = move-exception
            goto L_0x011c
        L_0x0111:
            r0 = move-exception
            r1 = r13
            goto L_0x011c
        L_0x0114:
            r0 = move-exception
            r17 = r10
            r1 = r11
            r18 = r12
            r22 = r13
        L_0x011c:
            int r2 = P0.z.f3748a     // Catch:{ Exception -> 0x014d }
            r6 = 23
            java.lang.String r7 = "MediaCodecUtil"
            if (r2 > r6) goto L_0x014f
            boolean r2 = r5.isEmpty()     // Catch:{ Exception -> 0x014d }
            if (r2 != 0) goto L_0x014f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d }
            r0.<init>()     // Catch:{ Exception -> 0x014d }
            java.lang.String r2 = "Skipping codec "
            r0.append(r2)     // Catch:{ Exception -> 0x014d }
            r0.append(r1)     // Catch:{ Exception -> 0x014d }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014d }
            P0.l.o(r7, r0)     // Catch:{ Exception -> 0x014d }
        L_0x0143:
            int r12 = r18 + 1
            r1 = r23
            r2 = r24
            r13 = r22
            goto L_0x001a
        L_0x014d:
            r0 = move-exception
            goto L_0x0174
        L_0x014f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d }
            r2.<init>()     // Catch:{ Exception -> 0x014d }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x014d }
            r2.append(r1)     // Catch:{ Exception -> 0x014d }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014d }
            r1 = r17
            r2.append(r1)     // Catch:{ Exception -> 0x014d }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014d }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014d }
            P0.l.o(r7, r1)     // Catch:{ Exception -> 0x014d }
            throw r0     // Catch:{ Exception -> 0x014d }
        L_0x0173:
            return r5
        L_0x0174:
            c1.s r1 = new c1.s
            java.lang.String r2 = "Failed to query underlying media codecs"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.v.f(c1.r, c1.t):java.util.ArrayList");
    }

    public static i0 g(i iVar, r rVar, boolean z, boolean z6) {
        List list;
        String str = rVar.f3036n;
        iVar.getClass();
        List e = e(str, z, z6);
        String b8 = b(rVar);
        if (b8 == null) {
            list = i0.f2073Y;
        } else {
            iVar.getClass();
            list = e(b8, z, z6);
        }
        L j7 = O.j();
        j7.d(e);
        j7.d(list);
        return j7.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = z.f3748a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(z.f3750c))) {
            String str3 = z.f3749b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (z.f3748a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (I.k(str)) {
            return true;
        }
        String E8 = h.E(mediaCodecInfo.getName());
        if (E8.startsWith("arc.")) {
            return false;
        }
        if (E8.startsWith("omx.google.") || E8.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((E8.startsWith("omx.sec.") && E8.contains(".sw.")) || E8.equals("omx.qcom.video.decoder.hevcswvdec") || E8.startsWith("c2.android.") || E8.startsWith("c2.google.")) {
            return true;
        }
        if (E8.startsWith("omx.") || E8.startsWith("c2.")) {
            return false;
        }
        return true;
    }
}
