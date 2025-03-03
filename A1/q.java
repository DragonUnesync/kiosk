package a1;

import B.q0;
import H3.C0103u;
import H3.O;
import M0.C0119g;
import M0.C0125m;
import M0.C0126n;
import M0.J;
import P0.l;
import P0.z;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.r;

public final class q implements r {

    /* renamed from: A0  reason: collision with root package name */
    public static final Pattern f7114A0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: B0  reason: collision with root package name */
    public static final Pattern f7115B0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: C0  reason: collision with root package name */
    public static final Pattern f7116C0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: D0  reason: collision with root package name */
    public static final Pattern f7117D0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: E0  reason: collision with root package name */
    public static final Pattern f7118E0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: F0  reason: collision with root package name */
    public static final Pattern f7119F0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: G0  reason: collision with root package name */
    public static final Pattern f7120G0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: H0  reason: collision with root package name */
    public static final Pattern f7121H0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: I0  reason: collision with root package name */
    public static final Pattern f7122I0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: J0  reason: collision with root package name */
    public static final Pattern f7123J0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: K0  reason: collision with root package name */
    public static final Pattern f7124K0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: L0  reason: collision with root package name */
    public static final Pattern f7125L0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: M0  reason: collision with root package name */
    public static final Pattern f7126M0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: N0  reason: collision with root package name */
    public static final Pattern f7127N0 = a("AUTOSELECT");

    /* renamed from: O0  reason: collision with root package name */
    public static final Pattern f7128O0 = a("DEFAULT");

    /* renamed from: P0  reason: collision with root package name */
    public static final Pattern f7129P0 = a("FORCED");

    /* renamed from: Q0  reason: collision with root package name */
    public static final Pattern f7130Q0 = a("INDEPENDENT");

    /* renamed from: R0  reason: collision with root package name */
    public static final Pattern f7131R0 = a("GAP");

    /* renamed from: S0  reason: collision with root package name */
    public static final Pattern f7132S0 = a("PRECISE");

    /* renamed from: T0  reason: collision with root package name */
    public static final Pattern f7133T0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: U0  reason: collision with root package name */
    public static final Pattern f7134U0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: V0  reason: collision with root package name */
    public static final Pattern f7135V0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: W  reason: collision with root package name */
    public static final Pattern f7136W = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f7137X = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f7138Y = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f7139Z = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f7140a0 = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    public static final Pattern f7141b0 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c0  reason: collision with root package name */
    public static final Pattern f7142c0 = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: d0  reason: collision with root package name */
    public static final Pattern f7143d0 = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f7144e0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f7145f0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f7146g0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f7147h0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f7148i0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f7149j0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: k0  reason: collision with root package name */
    public static final Pattern f7150k0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f7151l0 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f7152m0 = a("CAN-SKIP-DATERANGES");

    /* renamed from: n0  reason: collision with root package name */
    public static final Pattern f7153n0 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: o0  reason: collision with root package name */
    public static final Pattern f7154o0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern p0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: q0  reason: collision with root package name */
    public static final Pattern f7155q0 = a("CAN-BLOCK-RELOAD");

    /* renamed from: r0  reason: collision with root package name */
    public static final Pattern f7156r0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: s0  reason: collision with root package name */
    public static final Pattern f7157s0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: t0  reason: collision with root package name */
    public static final Pattern f7158t0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: u0  reason: collision with root package name */
    public static final Pattern f7159u0 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: v0  reason: collision with root package name */
    public static final Pattern f7160v0 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: w0  reason: collision with root package name */
    public static final Pattern f7161w0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: x0  reason: collision with root package name */
    public static final Pattern f7162x0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: y0  reason: collision with root package name */
    public static final Pattern f7163y0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: z0  reason: collision with root package name */
    public static final Pattern f7164z0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: U  reason: collision with root package name */
    public final n f7165U;

    /* renamed from: V  reason: collision with root package name */
    public final k f7166V;

    public q(n nVar, k kVar) {
        this.f7165U = nVar;
        this.f7166V = kVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C0126n b(String str, C0125m[] mVarArr) {
        C0125m[] mVarArr2 = new C0125m[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            C0125m mVar = mVarArr[i];
            mVarArr2[i] = new C0125m(mVar.f2969V, mVar.f2970W, mVar.f2971X, (byte[]) null);
        }
        return new C0126n(str, true, mVarArr2);
    }

    public static C0125m c(String str, String str2, HashMap hashMap) {
        String i = i(str, f7117D0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f7118E0;
        if (equals) {
            String j7 = j(str, pattern, hashMap);
            return new C0125m(C0119g.f2946d, (String) null, "video/mp4", Base64.decode(j7.substring(j7.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = C0119g.f2946d;
            int i8 = z.f3748a;
            return new C0125m(uuid, (String) null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i)) {
            return null;
        } else {
            String j8 = j(str, pattern, hashMap);
            byte[] decode = Base64.decode(j8.substring(j8.indexOf(44)), 0);
            UUID uuid2 = C0119g.e;
            return new C0125m(uuid2, (String) null, "video/mp4", J1.q.a(uuid2, (UUID[]) null, decode));
        }
    }

    public static k d(n nVar, k kVar, q0 q0Var, String str) {
        boolean z;
        int i;
        List list;
        String str2;
        f fVar;
        HashMap hashMap;
        ArrayList arrayList;
        String str3;
        HashMap hashMap2;
        ArrayList arrayList2;
        String str4;
        long j7;
        HashMap hashMap3;
        h hVar;
        C0126n nVar2;
        h hVar2;
        String str5;
        boolean z6;
        long j8;
        String str6;
        long j9;
        int i8;
        String str7;
        boolean z8;
        f fVar2;
        String str8;
        int i9;
        HashMap hashMap4;
        long j10;
        long j11;
        long j12;
        n nVar3 = nVar;
        k kVar2 = kVar;
        boolean z9 = nVar3.f7113c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        j jVar = new j(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str9 = "";
        boolean z10 = z9;
        j jVar2 = jVar;
        String str10 = str9;
        long j13 = -1;
        int i10 = 0;
        boolean z11 = false;
        long j14 = -9223372036854775807L;
        long j15 = 0;
        boolean z12 = false;
        int i11 = 0;
        long j16 = 0;
        int i12 = 1;
        long j17 = -9223372036854775807L;
        long j18 = -9223372036854775807L;
        boolean z13 = false;
        C0126n nVar4 = null;
        long j19 = 0;
        C0126n nVar5 = null;
        long j20 = 0;
        long j21 = 0;
        boolean z14 = false;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        int i13 = 0;
        long j22 = 0;
        boolean z15 = false;
        h hVar3 = null;
        long j23 = 0;
        long j24 = 0;
        ArrayList arrayList7 = arrayList4;
        f fVar3 = null;
        while (q0Var.u()) {
            String v4 = q0Var.v();
            if (v4.startsWith("#EXT")) {
                arrayList6.add(v4);
            }
            if (v4.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j25 = j(v4, f7150k0, hashMap5);
                if ("VOD".equals(j25)) {
                    i10 = 1;
                } else if ("EVENT".equals(j25)) {
                    i10 = 2;
                }
            } else if (v4.equals("#EXT-X-I-FRAMES-ONLY")) {
                z15 = true;
            } else {
                if (v4.startsWith("#EXT-X-START")) {
                    Map emptyMap = Collections.emptyMap();
                    str2 = str9;
                    z11 = f(v4, f7132S0);
                    j14 = (long) (Double.parseDouble(j(v4, f7161w0, emptyMap)) * 1000000.0d);
                } else {
                    str2 = str9;
                    if (v4.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g8 = g(v4, f7151l0);
                        if (g8 == -9.223372036854776E18d) {
                            j10 = -9223372036854775807L;
                        } else {
                            j10 = (long) (g8 * 1000000.0d);
                        }
                        boolean f8 = f(v4, f7152m0);
                        double g9 = g(v4, f7154o0);
                        if (g9 == -9.223372036854776E18d) {
                            j11 = -9223372036854775807L;
                        } else {
                            j11 = (long) (g9 * 1000000.0d);
                        }
                        double g10 = g(v4, p0);
                        if (g10 == -9.223372036854776E18d) {
                            j12 = -9223372036854775807L;
                        } else {
                            j12 = (long) (g10 * 1000000.0d);
                        }
                        jVar2 = new j(j10, f8, j11, j12, f(v4, f7155q0));
                    } else if (v4.startsWith("#EXT-X-PART-INF")) {
                        j18 = (long) (Double.parseDouble(j(v4, f7148i0, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = v4.startsWith("#EXT-X-MAP");
                        Pattern pattern = f7163y0;
                        boolean z16 = z11;
                        Pattern pattern2 = f7118E0;
                        if (startsWith) {
                            String j26 = j(v4, pattern2, hashMap5);
                            String i14 = i(v4, pattern, (String) null, hashMap5);
                            if (i14 != null) {
                                int i15 = z.f3748a;
                                String[] split = i14.split("@", -1);
                                j13 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j19 = Long.parseLong(split[1]);
                                }
                            }
                            int i16 = (j13 > -1 ? 1 : (j13 == -1 ? 0 : -1));
                            if (i16 == 0) {
                                j19 = 0;
                            }
                            if (str11 == null || str12 != null) {
                                hVar3 = new h(j26, j19, j13, str11, str12);
                                if (i16 != 0) {
                                    j19 += j13;
                                }
                                j13 = -1;
                                str9 = str2;
                                z11 = z16;
                            } else {
                                throw J.b((Exception) null, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                        } else {
                            ArrayList arrayList8 = arrayList7;
                            ArrayList arrayList9 = arrayList6;
                            if (v4.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = ((long) Integer.parseInt(j(v4, f7146g0, Collections.emptyMap()))) * 1000000;
                            } else if (v4.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j20 = Long.parseLong(j(v4, f7156r0, Collections.emptyMap()));
                                j16 = j20;
                            } else if (v4.startsWith("#EXT-X-VERSION")) {
                                i12 = Integer.parseInt(j(v4, f7149j0, Collections.emptyMap()));
                            } else {
                                if (v4.startsWith("#EXT-X-DEFINE")) {
                                    String i17 = i(v4, f7134U0, (String) null, hashMap5);
                                    if (i17 != null) {
                                        String str14 = (String) nVar3.f7109j.get(i17);
                                        if (str14 != null) {
                                            hashMap5.put(i17, str14);
                                        }
                                    } else {
                                        hashMap5.put(j(v4, f7123J0, hashMap5), j(v4, f7133T0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    fVar = fVar3;
                                    arrayList = arrayList8;
                                    str3 = str13;
                                    String str15 = str;
                                    nVar3 = nVar;
                                    kVar2 = kVar;
                                    hashMap6 = hashMap2;
                                    str13 = str3;
                                    arrayList2 = arrayList;
                                    hashMap5 = hashMap;
                                } else if (v4.startsWith("#EXTINF")) {
                                    j23 = new BigDecimal(j(v4, f7157s0, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
                                    String str16 = str2;
                                    str10 = i(v4, f7158t0, str16, hashMap5);
                                    str9 = str16;
                                    arrayList7 = arrayList8;
                                    z11 = z16;
                                    arrayList6 = arrayList9;
                                } else {
                                    String str17 = str2;
                                    if (v4.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(j(v4, f7153n0, Collections.emptyMap()));
                                        if (kVar2 == null || !arrayList3.isEmpty()) {
                                            z8 = false;
                                        } else {
                                            z8 = true;
                                        }
                                        l.j(z8);
                                        int i18 = z.f3748a;
                                        int i19 = (int) (j16 - kVar2.f7084k);
                                        int i20 = parseInt + i19;
                                        if (i19 >= 0) {
                                            O o2 = kVar2.f7091r;
                                            if (i20 <= o2.size()) {
                                                while (i19 < i20) {
                                                    h hVar4 = (h) o2.get(i19);
                                                    if (j16 != kVar2.f7084k) {
                                                        int i21 = (kVar2.f7083j - i11) + hVar4.f7067X;
                                                        ArrayList arrayList10 = new ArrayList();
                                                        long j27 = j22;
                                                        int i22 = 0;
                                                        while (true) {
                                                            O o8 = hVar4.f7063g0;
                                                            i9 = i20;
                                                            if (i22 >= o8.size()) {
                                                                break;
                                                            }
                                                            f fVar4 = (f) o8.get(i22);
                                                            int i23 = i21;
                                                            long j28 = j27;
                                                            arrayList10.add(new f(fVar4.f7064U, fVar4.f7065V, fVar4.f7066W, i23, j28, fVar4.f7069Z, fVar4.f7070a0, fVar4.f7071b0, fVar4.f7072c0, fVar4.f7073d0, fVar4.f7074e0, fVar4.f7057f0, fVar4.f7058g0));
                                                            j27 += fVar4.f7066W;
                                                            i22++;
                                                            hashMap6 = hashMap6;
                                                            i20 = i9;
                                                            str17 = str17;
                                                            fVar3 = fVar3;
                                                        }
                                                        fVar2 = fVar3;
                                                        str8 = str17;
                                                        hashMap4 = hashMap6;
                                                        hVar4 = new h(hVar4.f7064U, hVar4.f7065V, hVar4.f7062f0, hVar4.f7066W, i21, j22, hVar4.f7069Z, hVar4.f7070a0, hVar4.f7071b0, hVar4.f7072c0, hVar4.f7073d0, hVar4.f7074e0, arrayList10);
                                                    } else {
                                                        fVar2 = fVar3;
                                                        i9 = i20;
                                                        str8 = str17;
                                                        hashMap4 = hashMap6;
                                                    }
                                                    arrayList3.add(hVar4);
                                                    j22 += hVar4.f7066W;
                                                    long j29 = hVar4.f7073d0;
                                                    if (j29 != -1) {
                                                        j19 = hVar4.f7072c0 + j29;
                                                    }
                                                    String str18 = hVar4.f7071b0;
                                                    if (str18 == null || !str18.equals(Long.toHexString(j20))) {
                                                        str12 = str18;
                                                    }
                                                    j20++;
                                                    i19++;
                                                    int i24 = hVar4.f7067X;
                                                    i13 = i24;
                                                    hVar3 = hVar4.f7065V;
                                                    nVar5 = hVar4.f7069Z;
                                                    str11 = hVar4.f7070a0;
                                                    hashMap6 = hashMap4;
                                                    i20 = i9;
                                                    j21 = j22;
                                                    str17 = str8;
                                                    fVar3 = fVar2;
                                                    n nVar6 = nVar;
                                                    kVar2 = kVar;
                                                }
                                                f fVar5 = fVar3;
                                                str2 = str17;
                                                nVar3 = nVar;
                                                kVar2 = kVar;
                                            }
                                        }
                                        throw new IOException();
                                    }
                                    fVar = fVar3;
                                    str2 = str17;
                                    hashMap2 = hashMap6;
                                    if (v4.startsWith("#EXT-X-KEY")) {
                                        String j30 = j(v4, f7115B0, hashMap5);
                                        String i25 = i(v4, f7116C0, "identity", hashMap5);
                                        if ("NONE".equals(j30)) {
                                            treeMap.clear();
                                            nVar5 = null;
                                            str11 = null;
                                            str12 = null;
                                        } else {
                                            String i26 = i(v4, f7119F0, (String) null, hashMap5);
                                            if (!"identity".equals(i25)) {
                                                String str19 = str13;
                                                if (str19 == null) {
                                                    if ("SAMPLE-AES-CENC".equals(j30) || "SAMPLE-AES-CTR".equals(j30)) {
                                                        str7 = "cenc";
                                                    } else {
                                                        str7 = "cbcs";
                                                    }
                                                    str13 = str7;
                                                } else {
                                                    str13 = str19;
                                                }
                                                C0125m c8 = c(v4, i25, hashMap5);
                                                if (c8 != null) {
                                                    treeMap.put(i25, c8);
                                                    str12 = i26;
                                                    nVar5 = null;
                                                    str11 = null;
                                                }
                                            } else if ("AES-128".equals(j30)) {
                                                str11 = j(v4, pattern2, hashMap5);
                                                str12 = i26;
                                            }
                                            str12 = i26;
                                            str11 = null;
                                        }
                                        nVar3 = nVar;
                                        kVar2 = kVar;
                                        hashMap6 = hashMap2;
                                    } else {
                                        str3 = str13;
                                        if (v4.startsWith("#EXT-X-BYTERANGE")) {
                                            String j31 = j(v4, f7162x0, hashMap5);
                                            int i27 = z.f3748a;
                                            String[] split2 = j31.split("@", -1);
                                            j13 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j19 = Long.parseLong(split2[1]);
                                            }
                                        } else if (v4.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i11 = Integer.parseInt(v4.substring(v4.indexOf(58) + 1));
                                            nVar3 = nVar;
                                            kVar2 = kVar;
                                            hashMap6 = hashMap2;
                                            str13 = str3;
                                            arrayList7 = arrayList8;
                                            str9 = str2;
                                            z11 = z16;
                                            arrayList6 = arrayList9;
                                            fVar3 = fVar;
                                            z12 = true;
                                        } else if (v4.equals("#EXT-X-DISCONTINUITY")) {
                                            i13++;
                                        } else {
                                            if (v4.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j15 == 0) {
                                                    j15 = z.O(z.R(v4.substring(v4.indexOf(58) + 1))) - j22;
                                                } else {
                                                    String str20 = str;
                                                }
                                            } else if (v4.equals("#EXT-X-GAP")) {
                                                nVar3 = nVar;
                                                kVar2 = kVar;
                                                hashMap6 = hashMap2;
                                                str13 = str3;
                                                arrayList7 = arrayList8;
                                                str9 = str2;
                                                z11 = z16;
                                                arrayList6 = arrayList9;
                                                fVar3 = fVar;
                                                z14 = true;
                                            } else if (v4.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                nVar3 = nVar;
                                                kVar2 = kVar;
                                                hashMap6 = hashMap2;
                                                str13 = str3;
                                                arrayList7 = arrayList8;
                                                str9 = str2;
                                                z11 = z16;
                                                arrayList6 = arrayList9;
                                                fVar3 = fVar;
                                                z10 = true;
                                            } else if (v4.equals("#EXT-X-ENDLIST")) {
                                                nVar3 = nVar;
                                                kVar2 = kVar;
                                                hashMap6 = hashMap2;
                                                str13 = str3;
                                                arrayList7 = arrayList8;
                                                str9 = str2;
                                                z11 = z16;
                                                arrayList6 = arrayList9;
                                                fVar3 = fVar;
                                                z13 = true;
                                            } else if (v4.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h5 = h(v4, f7159u0);
                                                Matcher matcher = f7160v0.matcher(v4);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i8 = Integer.parseInt(group);
                                                } else {
                                                    i8 = -1;
                                                }
                                                arrayList5.add(new g(i8, h5, Uri.parse(l.y(str, j(v4, pattern2, hashMap5)))));
                                            } else {
                                                String str21 = str;
                                                if (v4.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (fVar == null && "PART".equals(j(v4, f7121H0, hashMap5))) {
                                                        String j32 = j(v4, pattern2, hashMap5);
                                                        long h8 = h(v4, f7164z0);
                                                        long h9 = h(v4, f7114A0);
                                                        if (str11 == null) {
                                                            str6 = null;
                                                        } else if (str12 != null) {
                                                            str6 = str12;
                                                        } else {
                                                            str6 = Long.toHexString(j20);
                                                        }
                                                        if (nVar5 == null && !treeMap.isEmpty()) {
                                                            C0125m[] mVarArr = (C0125m[]) treeMap.values().toArray(new C0125m[0]);
                                                            C0126n nVar7 = new C0126n(str3, true, mVarArr);
                                                            if (nVar4 == null) {
                                                                nVar4 = b(str3, mVarArr);
                                                            }
                                                            nVar5 = nVar7;
                                                        }
                                                        int i28 = (h8 > -1 ? 1 : (h8 == -1 ? 0 : -1));
                                                        if (i28 == 0 || h9 != -1) {
                                                            if (i28 != 0) {
                                                                j9 = h8;
                                                            } else {
                                                                j9 = 0;
                                                            }
                                                            fVar = new f(j32, hVar3, 0, i13, j21, nVar5, str11, str6, j9, h9, false, false, true);
                                                        }
                                                    }
                                                } else if (v4.startsWith("#EXT-X-PART")) {
                                                    if (str11 == null) {
                                                        str5 = null;
                                                    } else if (str12 != null) {
                                                        str5 = str12;
                                                    } else {
                                                        str5 = Long.toHexString(j20);
                                                    }
                                                    String j33 = j(v4, pattern2, hashMap5);
                                                    long parseDouble = (long) (Double.parseDouble(j(v4, f7147h0, Collections.emptyMap())) * 1000000.0d);
                                                    boolean f9 = f(v4, f7130Q0);
                                                    if (!z10 || !arrayList8.isEmpty()) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    boolean z17 = f9 | z6;
                                                    boolean f10 = f(v4, f7131R0);
                                                    String i29 = i(v4, pattern, (String) null, hashMap5);
                                                    if (i29 != null) {
                                                        int i30 = z.f3748a;
                                                        String[] split3 = i29.split("@", -1);
                                                        j8 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j24 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j8 = -1;
                                                    }
                                                    int i31 = (j8 > -1 ? 1 : (j8 == -1 ? 0 : -1));
                                                    if (i31 == 0) {
                                                        j24 = 0;
                                                    }
                                                    if (nVar5 == null && !treeMap.isEmpty()) {
                                                        C0125m[] mVarArr2 = (C0125m[]) treeMap.values().toArray(new C0125m[0]);
                                                        C0126n nVar8 = new C0126n(str3, true, mVarArr2);
                                                        if (nVar4 == null) {
                                                            nVar4 = b(str3, mVarArr2);
                                                        }
                                                        nVar5 = nVar8;
                                                    }
                                                    ArrayList arrayList11 = arrayList8;
                                                    arrayList11.add(new f(j33, hVar3, parseDouble, i13, j21, nVar5, str11, str5, j24, j8, f10, z17, false));
                                                    j21 += parseDouble;
                                                    if (i31 != 0) {
                                                        j24 += j8;
                                                    }
                                                    nVar3 = nVar;
                                                    kVar2 = kVar;
                                                    hashMap6 = hashMap2;
                                                    str13 = str3;
                                                    arrayList2 = arrayList11;
                                                } else {
                                                    arrayList = arrayList8;
                                                    if (!v4.startsWith("#")) {
                                                        if (str11 == null) {
                                                            str4 = null;
                                                        } else if (str12 != null) {
                                                            str4 = str12;
                                                        } else {
                                                            str4 = Long.toHexString(j20);
                                                        }
                                                        long j34 = j20 + 1;
                                                        String k8 = k(hashMap5, v4);
                                                        h hVar5 = (h) hashMap2.get(k8);
                                                        int i32 = (j13 > -1 ? 1 : (j13 == -1 ? 0 : -1));
                                                        if (i32 == 0) {
                                                            j7 = 0;
                                                        } else {
                                                            if (z15 && hVar3 == null && hVar5 == null) {
                                                                hVar5 = new h(k8, 0, j19, (String) null, (String) null);
                                                                hashMap2.put(k8, hVar5);
                                                            }
                                                            j7 = j19;
                                                        }
                                                        if (nVar5 != null || treeMap.isEmpty()) {
                                                            hashMap3 = hashMap5;
                                                            hVar = hVar5;
                                                            nVar2 = nVar5;
                                                        } else {
                                                            hashMap3 = hashMap5;
                                                            hVar = hVar5;
                                                            C0125m[] mVarArr3 = (C0125m[]) treeMap.values().toArray(new C0125m[0]);
                                                            nVar2 = new C0126n(str3, true, mVarArr3);
                                                            if (nVar4 == null) {
                                                                nVar4 = b(str3, mVarArr3);
                                                            }
                                                        }
                                                        if (hVar3 != null) {
                                                            hVar2 = hVar3;
                                                        } else {
                                                            hVar2 = hVar;
                                                        }
                                                        arrayList3.add(new h(k8, hVar2, str10, j23, i13, j22, nVar2, str11, str4, j7, j13, z14, arrayList));
                                                        j21 = j22 + j23;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (i32 != 0) {
                                                            j7 += j13;
                                                        }
                                                        j19 = j7;
                                                        kVar2 = kVar;
                                                        arrayList7 = arrayList12;
                                                        hashMap6 = hashMap2;
                                                        str13 = str3;
                                                        nVar5 = nVar2;
                                                        j13 = -1;
                                                        j22 = j21;
                                                        j20 = j34;
                                                        hashMap5 = hashMap3;
                                                        str9 = str2;
                                                        str10 = str9;
                                                        z11 = z16;
                                                        arrayList6 = arrayList9;
                                                        fVar3 = fVar;
                                                        z14 = false;
                                                        j23 = 0;
                                                        nVar3 = nVar;
                                                    } else {
                                                        hashMap = hashMap5;
                                                        nVar3 = nVar;
                                                        kVar2 = kVar;
                                                        hashMap6 = hashMap2;
                                                        str13 = str3;
                                                        arrayList2 = arrayList;
                                                        hashMap5 = hashMap;
                                                    }
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList8;
                                            nVar3 = nVar;
                                            kVar2 = kVar;
                                            hashMap6 = hashMap2;
                                            str13 = str3;
                                            arrayList2 = arrayList;
                                            hashMap5 = hashMap;
                                        }
                                        nVar3 = nVar;
                                        kVar2 = kVar;
                                        hashMap6 = hashMap2;
                                        str13 = str3;
                                    }
                                    arrayList2 = arrayList8;
                                }
                                str9 = str2;
                                z11 = z16;
                                arrayList6 = arrayList9;
                                fVar3 = fVar;
                            }
                            arrayList7 = arrayList8;
                            str9 = str2;
                            z11 = z16;
                            arrayList6 = arrayList9;
                        }
                    }
                }
                str9 = str2;
            }
        }
        f fVar6 = fVar3;
        ArrayList arrayList13 = arrayList7;
        ArrayList arrayList14 = arrayList6;
        boolean z18 = z11;
        String str22 = str;
        HashMap hashMap7 = new HashMap();
        int i33 = 0;
        while (i33 < arrayList5.size()) {
            g gVar = (g) arrayList5.get(i33);
            long j35 = gVar.f7060b;
            if (j35 == -1) {
                j35 = (j16 + ((long) arrayList3.size())) - (arrayList13.isEmpty() ? 1 : 0);
            }
            int i34 = gVar.f7061c;
            if (i34 != -1 || j18 == -9223372036854775807L) {
                i = 1;
            } else {
                if (arrayList13.isEmpty()) {
                    list = ((h) C0103u.l(arrayList3)).f7063g0;
                } else {
                    list = arrayList13;
                }
                i = 1;
                i34 = list.size() - 1;
            }
            Uri uri = gVar.f7059a;
            hashMap7.put(uri, new g(i34, j35, uri));
            i33 += i;
        }
        if (fVar6 != null) {
            arrayList13.add(fVar6);
        }
        if (j15 != 0) {
            z = true;
        } else {
            z = false;
        }
        return new k(i10, str, arrayList14, j14, z18, j15, z12, i11, j16, i12, j17, j18, z10, z13, z, nVar4, arrayList3, arrayList13, jVar2, hashMap7);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04b9, code lost:
        r7 = r31;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0564, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0565, code lost:
        r2 = r2 + r0;
        r1 = r39;
        r32 = r5;
        r31 = r7;
        r33 = r15;
        r3 = r22;
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015f, code lost:
        if (r9 > 0) goto L_0x0166;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a1.n e(B.q0 r38, java.lang.String r39) {
        /*
            r1 = r39
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r16 = 0
            r17 = 0
        L_0x0038:
            boolean r18 = r38.u()
            java.lang.String r19 = "application/x-mpegURL"
            java.util.regex.Pattern r0 = f7118E0
            java.util.regex.Pattern r3 = f7123J0
            if (r18 == 0) goto L_0x0235
            java.lang.String r2 = r38.v()
            java.lang.String r15 = "#EXT"
            boolean r15 = r2.startsWith(r15)
            if (r15 == 0) goto L_0x0053
            r14.add(r2)
        L_0x0053:
            java.lang.String r15 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r15 = r2.startsWith(r15)
            java.lang.String r4 = "#EXT-X-DEFINE"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x0070
            java.lang.String r0 = j(r2, r3, r11)
            java.util.regex.Pattern r3 = f7133T0
            java.lang.String r2 = j(r2, r3, r11)
            r11.put(r0, r2)
            goto L_0x00e4
        L_0x0070:
            java.lang.String r3 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x008b
            r2 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r21 = r13
            r30 = r14
            r16 = 1
            goto L_0x021c
        L_0x008b:
            java.lang.String r3 = "#EXT-X-MEDIA"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0097
            r12.add(r2)
            goto L_0x00e4
        L_0x0097:
            java.lang.String r3 = "#EXT-X-SESSION-KEY"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x00d9
            java.util.regex.Pattern r0 = f7116C0
            java.lang.String r3 = "identity"
            java.lang.String r0 = i(r2, r0, r3, r11)
            M0.m r0 = c(r2, r0, r11)
            if (r0 == 0) goto L_0x00e4
            java.util.regex.Pattern r3 = f7115B0
            java.lang.String r2 = j(r2, r3, r11)
            java.lang.String r3 = "SAMPLE-AES-CENC"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00c7
            java.lang.String r3 = "SAMPLE-AES-CTR"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            java.lang.String r2 = "cbcs"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r2 = "cenc"
        L_0x00c9:
            M0.n r3 = new M0.n
            r4 = 1
            M0.m[] r15 = new M0.C0125m[r4]
            r18 = 0
            r15[r18] = r0
            r3.<init>(r2, r4, r15)
            r13.add(r3)
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x00f5
            if (r15 == 0) goto L_0x00e4
            goto L_0x00f5
        L_0x00e4:
            r2 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r21 = r13
            r30 = r14
            goto L_0x021c
        L_0x00f5:
            java.lang.String r3 = "CLOSED-CAPTIONS=NONE"
            boolean r3 = r2.contains(r3)
            r17 = r17 | r3
            if (r15 == 0) goto L_0x0102
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            java.util.Map r4 = java.util.Collections.emptyMap()
            r21 = r13
            java.util.regex.Pattern r13 = f7141b0
            java.lang.String r4 = j(r2, r13, r4)
            int r4 = java.lang.Integer.parseInt(r4)
            java.util.regex.Pattern r13 = f7136W
            java.util.regex.Matcher r13 = r13.matcher(r2)
            boolean r22 = r13.find()
            if (r22 == 0) goto L_0x012e
            r29 = r10
            r10 = 1
            java.lang.String r13 = r13.group(r10)
            r13.getClass()
            int r10 = java.lang.Integer.parseInt(r13)
            goto L_0x0131
        L_0x012e:
            r29 = r10
            r10 = -1
        L_0x0131:
            java.util.regex.Pattern r13 = f7143d0
            r30 = r14
            r14 = 0
            java.lang.String r13 = i(r2, r13, r14, r11)
            r31 = r9
            java.util.regex.Pattern r9 = f7144e0
            java.lang.String r9 = i(r2, r9, r14, r11)
            if (r9 == 0) goto L_0x0162
            int r14 = P0.z.f3748a
            java.lang.String r14 = "x"
            r32 = r8
            r8 = -1
            java.lang.String[] r9 = r9.split(r14, r8)
            r8 = 0
            r14 = r9[r8]
            int r8 = java.lang.Integer.parseInt(r14)
            r14 = 1
            r9 = r9[r14]
            int r9 = java.lang.Integer.parseInt(r9)
            if (r8 <= 0) goto L_0x0164
            if (r9 > 0) goto L_0x0166
            goto L_0x0164
        L_0x0162:
            r32 = r8
        L_0x0164:
            r8 = -1
            r9 = -1
        L_0x0166:
            java.util.regex.Pattern r14 = f7145f0
            r33 = r7
            r7 = 0
            java.lang.String r14 = i(r2, r14, r7, r11)
            if (r14 == 0) goto L_0x0178
            float r14 = java.lang.Float.parseFloat(r14)
        L_0x0175:
            r34 = r12
            goto L_0x017b
        L_0x0178:
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0175
        L_0x017b:
            java.util.regex.Pattern r12 = f7137X
            java.lang.String r12 = i(r2, r12, r7, r11)
            r35 = r5
            java.util.regex.Pattern r5 = f7138Y
            java.lang.String r5 = i(r2, r5, r7, r11)
            r36 = r5
            java.util.regex.Pattern r5 = f7139Z
            java.lang.String r5 = i(r2, r5, r7, r11)
            r37 = r5
            java.util.regex.Pattern r5 = f7140a0
            java.lang.String r5 = i(r2, r5, r7, r11)
            if (r15 == 0) goto L_0x01a4
            java.lang.String r0 = j(r2, r0, r11)
            android.net.Uri r0 = P0.l.z(r1, r0)
            goto L_0x01b6
        L_0x01a4:
            boolean r0 = r38.u()
            if (r0 == 0) goto L_0x022d
            java.lang.String r0 = r38.v()
            java.lang.String r0 = k(r11, r0)
            android.net.Uri r0 = P0.l.z(r1, r0)
        L_0x01b6:
            M0.q r2 = new M0.q
            r2.<init>()
            int r7 = r6.size()
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r2.f2989a = r7
            java.lang.String r7 = M0.I.o(r19)
            r2.f2998l = r7
            r2.f2996j = r13
            r2.f2995h = r10
            r2.i = r4
            r2.f3006t = r8
            r2.f3007u = r9
            r2.f3008v = r14
            r2.f2993f = r3
            M0.r r3 = new M0.r
            r3.<init>(r2)
            a1.m r2 = new a1.m
            r22 = r2
            r23 = r0
            r24 = r3
            r25 = r12
            r26 = r36
            r27 = r37
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r6.add(r2)
            r2 = r35
            java.lang.Object r3 = r2.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L_0x0206
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.put(r0, r3)
        L_0x0206:
            Z0.r r0 = new Z0.r
            r22 = r0
            r23 = r10
            r24 = r4
            r25 = r12
            r26 = r36
            r27 = r37
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r3.add(r0)
        L_0x021c:
            r5 = r2
            r13 = r21
            r10 = r29
            r14 = r30
            r9 = r31
            r8 = r32
            r7 = r33
            r12 = r34
            goto L_0x0038
        L_0x022d:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            M0.J r0 = M0.J.b(r1, r0)
            throw r0
        L_0x0235:
            r2 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r21 = r13
            r30 = r14
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = 0
        L_0x024f:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x02b9
            java.lang.Object r8 = r6.get(r7)
            a1.m r8 = (a1.m) r8
            android.net.Uri r9 = r8.f7099a
            boolean r9 = r5.add(r9)
            if (r9 == 0) goto L_0x02b6
            M0.r r9 = r8.f7100b
            M0.H r10 = r9.f3034l
            if (r10 != 0) goto L_0x026b
            r10 = 1
            goto L_0x026c
        L_0x026b:
            r10 = 0
        L_0x026c:
            P0.l.j(r10)
            Z0.s r10 = new Z0.s
            android.net.Uri r12 = r8.f7099a
            java.lang.Object r12 = r2.get(r12)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.getClass()
            r13 = 0
            r10.<init>(r13, r12, r13)
            M0.H r12 = new M0.H
            r13 = 1
            M0.G[] r14 = new M0.G[r13]
            r13 = 0
            r14[r13] = r10
            r12.<init>((M0.G[]) r14)
            M0.q r9 = r9.a()
            r9.f2997k = r12
            M0.r r10 = new M0.r
            r10.<init>(r9)
            a1.m r9 = new a1.m
            java.lang.String r12 = r8.e
            java.lang.String r13 = r8.f7103f
            android.net.Uri r14 = r8.f7099a
            java.lang.String r15 = r8.f7101c
            java.lang.String r8 = r8.f7102d
            r22 = r9
            r23 = r14
            r24 = r10
            r25 = r15
            r26 = r8
            r27 = r12
            r28 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r4.add(r9)
        L_0x02b6:
            r8 = 1
            int r7 = r7 + r8
            goto L_0x024f
        L_0x02b9:
            r2 = 0
            r8 = 0
            r14 = 0
        L_0x02bc:
            int r5 = r34.size()
            if (r2 >= r5) goto L_0x0574
            r5 = r34
            java.lang.Object r7 = r5.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.util.regex.Pattern r9 = f7124K0
            java.lang.String r9 = j(r7, r9, r11)
            java.lang.String r10 = j(r7, r3, r11)
            M0.q r12 = new M0.q
            r12.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            java.lang.String r15 = ":"
            r13.append(r15)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            r12.f2989a = r13
            r12.f2990b = r10
            java.lang.String r13 = M0.I.o(r19)
            r12.f2998l = r13
            java.util.regex.Pattern r13 = f7128O0
            boolean r13 = f(r7, r13)
            java.util.regex.Pattern r15 = f7129P0
            boolean r15 = f(r7, r15)
            if (r15 == 0) goto L_0x0307
            r15 = 2
            r13 = r13 | r15
        L_0x0307:
            java.util.regex.Pattern r15 = f7127N0
            boolean r15 = f(r7, r15)
            if (r15 == 0) goto L_0x0311
            r13 = r13 | 4
        L_0x0311:
            r12.e = r13
            java.util.regex.Pattern r13 = f7125L0
            r15 = 0
            java.lang.String r13 = i(r7, r13, r15, r11)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L_0x0324
            r22 = r3
            r15 = 0
            goto L_0x035a
        L_0x0324:
            int r15 = P0.z.f3748a
            java.lang.String r15 = ","
            r22 = r3
            r3 = -1
            java.lang.String[] r13 = r13.split(r15, r3)
            java.lang.String r15 = "public.accessibility.describes-video"
            boolean r15 = P0.z.k(r13, r15)
            if (r15 == 0) goto L_0x033a
            r15 = 512(0x200, float:7.175E-43)
            goto L_0x033b
        L_0x033a:
            r15 = 0
        L_0x033b:
            java.lang.String r3 = "public.accessibility.transcribes-spoken-dialog"
            boolean r3 = P0.z.k(r13, r3)
            if (r3 == 0) goto L_0x0345
            r15 = r15 | 4096(0x1000, float:5.74E-42)
        L_0x0345:
            java.lang.String r3 = "public.accessibility.describes-music-and-sound"
            boolean r3 = P0.z.k(r13, r3)
            if (r3 == 0) goto L_0x034f
            r15 = r15 | 1024(0x400, float:1.435E-42)
        L_0x034f:
            java.lang.String r3 = "public.easy-to-read"
            boolean r3 = P0.z.k(r13, r3)
            if (r3 == 0) goto L_0x035a
            r3 = r15 | 8192(0x2000, float:1.14794E-41)
            r15 = r3
        L_0x035a:
            r12.f2993f = r15
            java.util.regex.Pattern r3 = f7122I0
            r13 = 0
            java.lang.String r3 = i(r7, r3, r13, r11)
            r12.f2992d = r3
            java.lang.String r3 = i(r7, r0, r13, r11)
            if (r3 != 0) goto L_0x036d
            r3 = 0
            goto L_0x0371
        L_0x036d:
            android.net.Uri r3 = P0.l.z(r1, r3)
        L_0x0371:
            M0.H r13 = new M0.H
            Z0.s r15 = new Z0.s
            r23 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r15.<init>(r9, r0, r10)
            r0 = 1
            M0.G[] r1 = new M0.G[r0]
            r0 = 0
            r1[r0] = r15
            r13.<init>((M0.G[]) r1)
            java.util.regex.Pattern r0 = f7120G0
            java.lang.String r0 = j(r7, r0, r11)
            int r1 = r0.hashCode()
            switch(r1) {
                case -959297733: goto L_0x03b7;
                case -333210994: goto L_0x03ac;
                case 62628790: goto L_0x03a1;
                case 81665115: goto L_0x0396;
                default: goto L_0x0394;
            }
        L_0x0394:
            r0 = -1
            goto L_0x03c1
        L_0x0396:
            java.lang.String r1 = "VIDEO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x039f
            goto L_0x0394
        L_0x039f:
            r0 = 3
            goto L_0x03c1
        L_0x03a1:
            java.lang.String r1 = "AUDIO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03aa
            goto L_0x0394
        L_0x03aa:
            r0 = 2
            goto L_0x03c1
        L_0x03ac:
            java.lang.String r1 = "CLOSED-CAPTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b5
            goto L_0x0394
        L_0x03b5:
            r0 = 1
            goto L_0x03c1
        L_0x03b7:
            java.lang.String r1 = "SUBTITLES"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c0
            goto L_0x0394
        L_0x03c0:
            r0 = 0
        L_0x03c1:
            switch(r0) {
                case 0: goto L_0x0505;
                case 1: goto L_0x04bf;
                case 2: goto L_0x0429;
                case 3: goto L_0x03d1;
                default: goto L_0x03c4;
            }
        L_0x03c4:
            r34 = r5
            r7 = r31
            r5 = r32
            r15 = r33
        L_0x03cc:
            r1 = 3
            r20 = 0
            goto L_0x0564
        L_0x03d1:
            r0 = 0
        L_0x03d2:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x03ea
            java.lang.Object r1 = r6.get(r0)
            a1.m r1 = (a1.m) r1
            java.lang.String r7 = r1.f7101c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x03e7
            goto L_0x03eb
        L_0x03e7:
            r1 = 1
            int r0 = r0 + r1
            goto L_0x03d2
        L_0x03ea:
            r1 = 0
        L_0x03eb:
            if (r1 == 0) goto L_0x040e
            M0.r r0 = r1.f7100b
            java.lang.String r1 = r0.f3033k
            r7 = 2
            java.lang.String r1 = P0.z.u(r7, r1)
            r12.f2996j = r1
            java.lang.String r1 = M0.I.e(r1)
            java.lang.String r1 = M0.I.o(r1)
            r12.f2999m = r1
            int r1 = r0.f3043u
            r12.f3006t = r1
            int r1 = r0.f3044v
            r12.f3007u = r1
            float r0 = r0.f3045w
            r12.f3008v = r0
        L_0x040e:
            if (r3 != 0) goto L_0x0411
            goto L_0x03c4
        L_0x0411:
            r12.f2997k = r13
            a1.l r0 = new a1.l
            M0.r r1 = new M0.r
            r1.<init>(r12)
            r0.<init>(r3, r1, r10)
            r15 = r33
            r15.add(r0)
            r34 = r5
            r7 = r31
            r5 = r32
            goto L_0x03cc
        L_0x0429:
            r15 = r33
            r0 = 0
        L_0x042c:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x044a
            java.lang.Object r1 = r6.get(r0)
            a1.m r1 = (a1.m) r1
            r34 = r5
            java.lang.String r5 = r1.f7102d
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0445
            r0 = r1
            r1 = 1
            goto L_0x044e
        L_0x0445:
            r1 = 1
            int r0 = r0 + r1
            r5 = r34
            goto L_0x042c
        L_0x044a:
            r34 = r5
            r1 = 1
            r0 = 0
        L_0x044e:
            if (r0 == 0) goto L_0x045f
            M0.r r5 = r0.f7100b
            java.lang.String r5 = r5.f3033k
            java.lang.String r5 = P0.z.u(r1, r5)
            r12.f2996j = r5
            java.lang.String r1 = M0.I.e(r5)
            goto L_0x0460
        L_0x045f:
            r1 = 0
        L_0x0460:
            java.util.regex.Pattern r5 = f7142c0
            r9 = 0
            java.lang.String r5 = i(r7, r5, r9, r11)
            if (r5 == 0) goto L_0x0493
            int r7 = P0.z.f3748a
            java.lang.String r7 = "/"
            r9 = 2
            java.lang.String[] r7 = r5.split(r7, r9)
            r20 = 0
            r7 = r7[r20]
            int r7 = java.lang.Integer.parseInt(r7)
            r12.f2979B = r7
            java.lang.String r7 = "audio/eac3"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0495
            java.lang.String r7 = "/JOC"
            boolean r5 = r5.endsWith(r7)
            if (r5 == 0) goto L_0x0495
            java.lang.String r1 = "ec+3"
            r12.f2996j = r1
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x0495
        L_0x0493:
            r20 = 0
        L_0x0495:
            r12.g(r1)
            if (r3 == 0) goto L_0x04b0
            r12.f2997k = r13
            a1.l r0 = new a1.l
            M0.r r1 = new M0.r
            r1.<init>(r12)
            r0.<init>(r3, r1, r10)
            r5 = r32
            r5.add(r0)
        L_0x04ab:
            r7 = r31
            r1 = 3
            goto L_0x0564
        L_0x04b0:
            r5 = r32
            if (r0 == 0) goto L_0x04ab
            M0.r r8 = new M0.r
            r8.<init>(r12)
        L_0x04b9:
            r7 = r31
            r0 = 1
            r1 = 3
            goto L_0x0565
        L_0x04bf:
            r34 = r5
            r5 = r32
            r15 = r33
            r20 = 0
            java.util.regex.Pattern r0 = f7126M0
            java.lang.String r0 = j(r7, r0, r11)
            java.lang.String r1 = "CC"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x04e1
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r3 = "application/cea-608"
            goto L_0x04ed
        L_0x04e1:
            r1 = 2
            r3 = 7
            java.lang.String r0 = r0.substring(r3)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r3 = "application/cea-708"
        L_0x04ed:
            if (r14 != 0) goto L_0x04f4
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x04f4:
            java.lang.String r3 = M0.I.o(r3)
            r12.f2999m = r3
            r12.f2984G = r0
            M0.r r0 = new M0.r
            r0.<init>(r12)
            r14.add(r0)
            goto L_0x04b9
        L_0x0505:
            r34 = r5
            r5 = r32
            r15 = r33
            r1 = 2
            r20 = 0
            r7 = 0
        L_0x050f:
            int r0 = r6.size()
            if (r7 >= r0) goto L_0x0528
            java.lang.Object r0 = r6.get(r7)
            a1.m r0 = (a1.m) r0
            java.lang.String r1 = r0.e
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0524
            goto L_0x0529
        L_0x0524:
            r0 = 1
            int r7 = r7 + r0
            r1 = 2
            goto L_0x050f
        L_0x0528:
            r0 = 0
        L_0x0529:
            if (r0 == 0) goto L_0x053b
            M0.r r0 = r0.f7100b
            java.lang.String r0 = r0.f3033k
            r1 = 3
            java.lang.String r0 = P0.z.u(r1, r0)
            r12.f2996j = r0
            java.lang.String r0 = M0.I.e(r0)
            goto L_0x053d
        L_0x053b:
            r1 = 3
            r0 = 0
        L_0x053d:
            if (r0 != 0) goto L_0x0541
            java.lang.String r0 = "text/vtt"
        L_0x0541:
            java.lang.String r0 = M0.I.o(r0)
            r12.f2999m = r0
            r12.f2997k = r13
            if (r3 == 0) goto L_0x055b
            a1.l r0 = new a1.l
            M0.r r7 = new M0.r
            r7.<init>(r12)
            r0.<init>(r3, r7, r10)
            r7 = r31
            r7.add(r0)
            goto L_0x0564
        L_0x055b:
            r7 = r31
            java.lang.String r0 = "HlsPlaylistParser"
            java.lang.String r3 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            P0.l.B(r0, r3)
        L_0x0564:
            r0 = 1
        L_0x0565:
            int r2 = r2 + r0
            r1 = r39
            r32 = r5
            r31 = r7
            r33 = r15
            r3 = r22
            r0 = r23
            goto L_0x02bc
        L_0x0574:
            r7 = r31
            r5 = r32
            r15 = r33
            if (r17 == 0) goto L_0x0582
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x0583
        L_0x0582:
            r9 = r14
        L_0x0583:
            a1.n r13 = new a1.n
            r0 = r13
            r1 = r39
            r2 = r30
            r3 = r4
            r4 = r15
            r6 = r7
            r7 = r29
            r10 = r16
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.q.e(B.q0, java.lang.String):a1.n");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (map.isEmpty() || str2 == null) {
            return str2;
        }
        return k(map, str2);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i = i(str, pattern, (String) null, map);
        if (i != null) {
            return i;
        }
        throw J.b((Exception) null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String k(Map map, String str) {
        Matcher matcher = f7135V0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ all -> 0x0098 }, LOOP:3: B:31:0x0069->B:79:0x0069, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(android.net.Uri r7, R0.j r8) {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r8)
            r0.<init>(r1)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L_0x002d
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x0066
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x0029
            goto L_0x0066
        L_0x0029:
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
        L_0x002d:
            r2 = -1
            if (r1 == r2) goto L_0x003b
            boolean r4 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x003b
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
            goto L_0x002d
        L_0x003b:
            r4 = 0
        L_0x003c:
            r5 = 7
            if (r4 >= r5) goto L_0x004f
            java.lang.String r5 = "#EXTM3U"
            char r5 = r5.charAt(r4)     // Catch:{ all -> 0x0098 }
            if (r1 == r5) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
            int r4 = r4 + 1
            goto L_0x003c
        L_0x004f:
            if (r1 == r2) goto L_0x0062
            boolean r3 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x0062
            boolean r3 = P0.z.M(r1)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x0062
            int r1 = r0.read()     // Catch:{ all -> 0x0098 }
            goto L_0x004f
        L_0x0062:
            boolean r3 = P0.z.M(r1)     // Catch:{ all -> 0x0098 }
        L_0x0066:
            r1 = 0
            if (r3 == 0) goto L_0x0101
        L_0x0069:
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x00f7
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x0098 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x007a
            goto L_0x0069
        L_0x007a:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x009a
            r8.add(r2)     // Catch:{ all -> 0x0098 }
            B.q0 r1 = new B.q0     // Catch:{ all -> 0x0098 }
            r2 = 27
            r1.<init>((java.lang.Object) r8, (int) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0098 }
            a1.n r7 = e(r1, r7)     // Catch:{ all -> 0x0098 }
        L_0x0094:
            P0.z.g(r0)
            goto L_0x00f6
        L_0x0098:
            r7 = move-exception
            goto L_0x0108
        L_0x009a:
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXTINF"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXT-X-BYTERANGE"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXT-X-DISCONTINUITY"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "#EXT-X-ENDLIST"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x00db
            goto L_0x00df
        L_0x00db:
            r8.add(r2)     // Catch:{ all -> 0x0098 }
            goto L_0x0069
        L_0x00df:
            r8.add(r2)     // Catch:{ all -> 0x0098 }
            a1.n r1 = r6.f7165U     // Catch:{ all -> 0x0098 }
            a1.k r2 = r6.f7166V     // Catch:{ all -> 0x0098 }
            B.q0 r3 = new B.q0     // Catch:{ all -> 0x0098 }
            r4 = 27
            r3.<init>((java.lang.Object) r8, (int) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0098 }
            a1.k r7 = d(r1, r2, r3, r7)     // Catch:{ all -> 0x0098 }
            goto L_0x0094
        L_0x00f6:
            return r7
        L_0x00f7:
            P0.z.g(r0)
            java.lang.String r7 = "Failed to parse the playlist, could not identify any tags."
            M0.J r7 = M0.J.b(r1, r7)
            throw r7
        L_0x0101:
            java.lang.String r7 = "Input does not start with the #EXTM3U header."
            M0.J r7 = M0.J.b(r1, r7)     // Catch:{ all -> 0x0098 }
            throw r7     // Catch:{ all -> 0x0098 }
        L_0x0108:
            P0.z.g(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.q.n(android.net.Uri, R0.j):java.lang.Object");
    }
}
