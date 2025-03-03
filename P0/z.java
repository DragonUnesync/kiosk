package P0;

import B.C0003d;
import D2.j;
import F.h;
import H3.O;
import M0.I;
import M0.J;
import M0.Q;
import Q0.g;
import T0.C0232y;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.sdp.SdpErrno;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3748a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f3749b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f3750c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f3751d;
    public static final String e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f3752f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    public static final long[] f3753g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f3754h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f3755j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: k  reason: collision with root package name */
    public static HashMap f3756k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f3757l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f3758m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f3759n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f3760o = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f3761p = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i8 = Build.VERSION.SDK_INT;
        f3748a = i8;
        String str = Build.DEVICE;
        f3749b = str;
        String str2 = Build.MANUFACTURER;
        f3750c = str2;
        String str3 = Build.MODEL;
        f3751d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i8;
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static int A(int i8, int i9) {
        int i10 = 2;
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 != 21) {
                        if (i8 != 22) {
                            if (i8 != 268435456) {
                                if (i8 != 1342177280) {
                                    if (i8 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    i10 = 3;
                }
                i10 = 4;
            } else {
                i10 = 1;
            }
        }
        return i10 * i9;
    }

    public static long B(long j7, float f8) {
        if (f8 == 1.0f) {
            return j7;
        }
        return Math.round(((double) j7) / ((double) f8));
    }

    public static String C(StringBuilder sb, Formatter formatter, long j7) {
        long j8;
        String str;
        Formatter formatter2 = formatter;
        if (j7 == -9223372036854775807L) {
            j8 = 0;
        } else {
            j8 = j7;
        }
        if (j8 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j8) + 500) / 1000;
        long j9 = abs % 60;
        long j10 = (abs / 60) % 60;
        long j11 = abs / 3600;
        sb.setLength(0);
        if (j11 > 0) {
            return formatter2.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(j9)}).toString();
        }
        return formatter2.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j10), Long.valueOf(j9)}).toString();
    }

    public static String[] D() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f3748a >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            strArr[i8] = P(strArr[i8]);
        }
        return strArr;
    }

    public static String E(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e8) {
            l.p("Util", "Failed to read system property ".concat(str), e8);
            return null;
        }
    }

    public static String F(int i8) {
        switch (i8) {
            case SdpErrno.ERROR_INVALID_RESET_TOKEN /*-2*/:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i8 >= 10000) {
                    return C1477r.c(i8, "custom (", ")");
                }
                return "?";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean G(M0.Q r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = r6
            T0.y r1 = (T0.C0232y) r1
            int r2 = r1.D()
            r3 = 1
            if (r2 != r3) goto L_0x001d
            r4 = 2
            r5 = r6
            E2.a r5 = (E2.a) r5
            boolean r4 = r5.e(r4)
            if (r4 == 0) goto L_0x001d
            r1.K()
        L_0x001b:
            r0 = 1
            goto L_0x0039
        L_0x001d:
            r1 = 4
            if (r2 != r1) goto L_0x0039
            r2 = r6
            E2.a r2 = (E2.a) r2
            boolean r1 = r2.e(r1)
            if (r1 == 0) goto L_0x0039
            r1 = r2
            T0.y r1 = (T0.C0232y) r1
            int r1 = r1.v()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.k(r4, r1, r0)
            goto L_0x001b
        L_0x0039:
            E2.a r6 = (E2.a) r6
            boolean r1 = r6.e(r3)
            if (r1 == 0) goto L_0x0047
            T0.y r6 = (T0.C0232y) r6
            r6.P(r3)
            goto L_0x0048
        L_0x0047:
            r3 = r0
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.z.G(M0.Q):boolean");
    }

    public static int H(Uri uri, String str) {
        int i8;
        char c8 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && h.n("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int lastIndexOf = lastPathSegment.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    String E8 = h.E(lastPathSegment.substring(lastIndexOf + 1));
                    E8.getClass();
                    switch (E8.hashCode()) {
                        case 104579:
                            if (E8.equals("ism")) {
                                c8 = 0;
                                break;
                            }
                            break;
                        case 108321:
                            if (E8.equals("mpd")) {
                                c8 = 1;
                                break;
                            }
                            break;
                        case 3242057:
                            if (E8.equals("isml")) {
                                c8 = 2;
                                break;
                            }
                            break;
                        case 3299913:
                            if (E8.equals("m3u8")) {
                                c8 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 2:
                            i8 = 1;
                            break;
                        case 1:
                            i8 = 0;
                            break;
                        case 3:
                            i8 = 2;
                            break;
                        default:
                            i8 = 4;
                            break;
                    }
                    if (i8 != 4) {
                        return i8;
                    }
                }
                String path = uri.getPath();
                path.getClass();
                Matcher matcher = f3755j.matcher(path);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    if (group == null) {
                        return 1;
                    }
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                    return 1;
                }
            }
            return 4;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c8 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c8 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c8 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c8 = 3;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static boolean I(r rVar, r rVar2, Inflater inflater) {
        if (rVar.a() <= 0) {
            return false;
        }
        if (rVar2.f3732a.length < rVar.a()) {
            rVar2.b(rVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(rVar.f3732a, rVar.f3733b, rVar.a());
        int i8 = 0;
        while (true) {
            try {
                byte[] bArr = rVar2.f3732a;
                i8 += inflater.inflate(bArr, i8, bArr.length - i8);
                if (inflater.finished()) {
                    rVar2.G(i8);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else {
                    byte[] bArr2 = rVar2.f3732a;
                    if (i8 == bArr2.length) {
                        rVar2.b(bArr2.length * 2);
                    }
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static void J(int i8) {
        Integer.toString(i8, 36);
    }

    public static boolean K(int i8) {
        if (i8 == 3 || i8 == 2 || i8 == 268435456 || i8 == 21 || i8 == 1342177280 || i8 == 22 || i8 == 1610612736 || i8 == 4) {
            return true;
        }
        return false;
    }

    public static boolean L(Context context) {
        int i8 = f3748a;
        if (i8 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            String str = f3751d;
            if ((i8 != 30 || (!h.n(str, "moto g(20)") && !h.n(str, "rmx3231"))) && (i8 != 34 || !h.n(str, "sm-x200"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean M(int i8) {
        if (i8 == 10 || i8 == 13) {
            return true;
        }
        return false;
    }

    public static boolean N(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    public static long O(long j7) {
        if (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) {
            return j7;
        }
        return j7 * 1000;
    }

    public static String P(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String E8 = h.E(str);
        int i8 = 0;
        String str2 = E8.split("-", 2)[0];
        if (f3756k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f3757l;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i9 = 0; i9 < strArr.length; i9 += 2) {
                hashMap.put(strArr[i9], strArr[i9 + 1]);
            }
            f3756k = hashMap;
        }
        String str4 = (String) f3756k.get(str2);
        if (str4 != null) {
            StringBuilder r8 = g.r(str4);
            r8.append(E8.substring(str2.length()));
            E8 = r8.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return E8;
        }
        while (true) {
            String[] strArr2 = f3758m;
            if (i8 >= strArr2.length) {
                return E8;
            }
            if (E8.startsWith(strArr2[i8])) {
                return strArr2[i8 + 1] + E8.substring(strArr2[i8].length());
            }
            i8 += 2;
        }
    }

    public static Object[] Q(int i8, Object[] objArr) {
        boolean z;
        if (i8 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        return Arrays.copyOf(objArr, i8);
    }

    public static long R(String str) {
        Matcher matcher = f3754h.matcher(str);
        if (matcher.matches()) {
            int i8 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i8 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i8 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i8 != 0) {
                return timeInMillis - (((long) i8) * 60000);
            }
            return timeInMillis;
        }
        throw J.a((RuntimeException) null, "Invalid date/time format: " + str);
    }

    public static void S(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void T(ArrayList arrayList, int i8, int i9) {
        if (i8 < 0 || i9 > arrayList.size() || i8 > i9) {
            throw new IllegalArgumentException();
        } else if (i8 != i9) {
            arrayList.subList(i8, i9).clear();
        }
    }

    public static long U(int i8, long j7) {
        return W(j7, 1000000, (long) i8, RoundingMode.DOWN);
    }

    public static void V(long[] jArr, long j7) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i8 = 0;
        int i9 = (j7 > 1000000 ? 1 : (j7 == 1000000 ? 0 : -1));
        if (i9 >= 0 && j7 % 1000000 == 0) {
            long o2 = C0003d.o(j7, 1000000, RoundingMode.UNNECESSARY);
            while (i8 < jArr.length) {
                jArr[i8] = C0003d.o(jArr[i8], o2, roundingMode);
                i8++;
            }
        } else if (i9 >= 0 || 1000000 % j7 != 0) {
            for (int i10 = 0; i10 < jArr.length; i10++) {
                long j8 = jArr[i10];
                if (j8 != 0) {
                    int i11 = (j7 > j8 ? 1 : (j7 == j8 ? 0 : -1));
                    if (i11 >= 0 && j7 % j8 == 0) {
                        jArr[i10] = C0003d.o(1000000, C0003d.o(j7, j8, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i11 >= 0 || j8 % j7 != 0) {
                        jArr[i10] = X(j8, 1000000, j7, roundingMode);
                    } else {
                        jArr[i10] = C0003d.K(1000000, C0003d.o(j8, j7, RoundingMode.UNNECESSARY));
                    }
                }
            }
        } else {
            long o8 = C0003d.o(1000000, j7, RoundingMode.UNNECESSARY);
            while (i8 < jArr.length) {
                jArr[i8] = C0003d.K(jArr[i8], o8);
                i8++;
            }
        }
    }

    public static long W(long j7, long j8, long j9, RoundingMode roundingMode) {
        if (j7 == 0 || j8 == 0) {
            return 0;
        }
        int i8 = (j9 > j8 ? 1 : (j9 == j8 ? 0 : -1));
        if (i8 >= 0 && j9 % j8 == 0) {
            return C0003d.o(j7, C0003d.o(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i8 < 0 && j8 % j9 == 0) {
            return C0003d.K(j7, C0003d.o(j8, j9, RoundingMode.UNNECESSARY));
        }
        int i9 = (j9 > j7 ? 1 : (j9 == j7 ? 0 : -1));
        if (i9 >= 0 && j9 % j7 == 0) {
            return C0003d.o(j8, C0003d.o(j9, j7, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i9 >= 0 || j7 % j9 != 0) {
            return X(j7, j8, j9, roundingMode);
        }
        return C0003d.K(j8, C0003d.o(j7, j9, RoundingMode.UNNECESSARY));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        r2 = (double) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        if ((-9.223372036854776E18d - r2) >= 1.0d) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r2 >= 9.223372036854776E18d) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        if ((r13 & r1) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        return (long) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0119, code lost:
        throw new java.lang.ArithmeticException("rounded value is out of range for input " + r9 + " and rounding mode " + r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long X(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            long r0 = B.C0003d.K(r9, r11)
            r2 = -9223372036854775808
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0018
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0018
            long r9 = B.C0003d.o(r0, r13, r15)
            return r9
        L_0x0018:
            long r0 = java.lang.Math.abs(r11)
            long r6 = java.lang.Math.abs(r13)
            long r0 = B.C0003d.p(r0, r6)
            java.math.RoundingMode r6 = java.math.RoundingMode.UNNECESSARY
            long r11 = B.C0003d.o(r11, r0, r6)
            long r13 = B.C0003d.o(r13, r0, r6)
            long r0 = java.lang.Math.abs(r9)
            long r7 = java.lang.Math.abs(r13)
            long r0 = B.C0003d.p(r0, r7)
            long r9 = B.C0003d.o(r9, r0, r6)
            long r13 = B.C0003d.o(r13, r0, r6)
            long r0 = B.C0003d.K(r9, r11)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0053
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0053
            long r9 = B.C0003d.o(r0, r13, r15)
            return r9
        L_0x0053:
            double r11 = (double) r11
            double r13 = (double) r13
            double r11 = r11 / r13
            double r9 = (double) r9
            double r9 = r9 * r11
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0060
            return r4
        L_0x0060:
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            return r2
        L_0x0067:
            int r0 = J3.c.f2502a
            boolean r0 = g7.l.g(r9)
            if (r0 == 0) goto L_0x0122
            int[] r0 = J3.b.f2501a
            int r1 = r15.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            r4 = 0
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L_0x00e0;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00c3;
                case 4: goto L_0x0095;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00ab;
                case 7: goto L_0x0097;
                case 8: goto L_0x0087;
                default: goto L_0x0081;
            }
        L_0x0081:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x0087:
            double r2 = java.lang.Math.rint(r9)
            double r4 = r9 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
        L_0x0095:
            r2 = r9
            goto L_0x00e7
        L_0x0097:
            double r2 = java.lang.Math.rint(r9)
            double r4 = r9 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
            double r2 = java.lang.Math.copySign(r6, r9)
            double r2 = r2 + r9
            goto L_0x00e7
        L_0x00ab:
            double r2 = java.lang.Math.rint(r9)
            goto L_0x00e7
        L_0x00b0:
            boolean r0 = J3.c.a(r9)
            if (r0 == 0) goto L_0x00b7
            goto L_0x0095
        L_0x00b7:
            long r2 = (long) r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00be
            r0 = 1
            goto L_0x00bf
        L_0x00be:
            r0 = -1
        L_0x00bf:
            long r4 = (long) r0
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L_0x00e7
        L_0x00c3:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            boolean r0 = J3.c.a(r9)
            if (r0 == 0) goto L_0x00ce
            goto L_0x0095
        L_0x00ce:
            long r4 = (long) r9
            long r4 = r4 + r2
        L_0x00d0:
            double r2 = (double) r4
            goto L_0x00e7
        L_0x00d2:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            boolean r0 = J3.c.a(r9)
            if (r0 == 0) goto L_0x00dd
            goto L_0x0095
        L_0x00dd:
            long r4 = (long) r9
            long r4 = r4 - r2
            goto L_0x00d0
        L_0x00e0:
            boolean r0 = J3.c.a(r9)
            if (r0 == 0) goto L_0x011a
            goto L_0x0095
        L_0x00e7:
            double r13 = r13 - r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 0
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f1
            r13 = 1
            goto L_0x00f2
        L_0x00f1:
            r13 = 0
        L_0x00f2:
            int r14 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r14 >= 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r1 = 0
        L_0x00f8:
            r11 = r13 & r1
            if (r11 == 0) goto L_0x00fe
            long r9 = (long) r2
            return r9
        L_0x00fe:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "rounded value is out of range for input "
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " and rounding mode "
            r12.append(r9)
            r12.append(r15)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x011a:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "mode was UNNECESSARY, but rounding was necessary"
            r9.<init>(r10)
            throw r9
        L_0x0122:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "input is infinite or NaN"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.z.X(long, long, long, java.math.RoundingMode):long");
    }

    public static boolean Y(Q q7, boolean z) {
        if (q7 == null) {
            return true;
        }
        C0232y yVar = (C0232y) q7;
        if (!yVar.C() || yVar.D() == 1 || yVar.D() == 4) {
            return true;
        }
        if (z) {
            yVar.Y();
            if (yVar.f4945b1.f4760n != 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] Z(String str, String str2) {
        return str.split(str2, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(long[] r5, long r6, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r5, r6)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r1 = r0 + 1
            int r2 = r5.length
            if (r1 >= r2) goto L_0x0015
            r2 = r5[r1]
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0008
        L_0x0015:
            if (r8 == 0) goto L_0x0019
            r5 = r0
            goto L_0x001a
        L_0x0019:
            r5 = r1
        L_0x001a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.z.a(long[], long, boolean):int");
    }

    public static String[] a0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int b(j jVar, long j7) {
        int i8 = jVar.f1093U - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            if (jVar.n(i10) < j7) {
                i9 = i10 + 1;
            } else {
                i8 = i10 - 1;
            }
        }
        int i11 = i8 + 1;
        if (i11 < jVar.f1093U && jVar.n(i11) == j7) {
            return i11;
        }
        if (i8 == -1) {
            return 0;
        }
        return i8;
    }

    public static String b0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sb.append(Character.forDigit((bArr[i8] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i8] & 15, 16));
        }
        return sb.toString();
    }

    public static int c(O o2, Long l8, boolean z) {
        int i8;
        int binarySearch = Collections.binarySearch(o2, l8);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                int i9 = binarySearch - 1;
                if (i9 < 0 || ((Comparable) o2.get(i9)).compareTo(l8) != 0) {
                    i8 = binarySearch;
                } else {
                    binarySearch = i9;
                }
            }
            i8 = binarySearch;
        }
        if (z) {
            return Math.max(0, i8);
        }
        return i8;
    }

    public static long c0(long j7) {
        if (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) {
            return j7;
        }
        return j7 / 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(int[] r3, int r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x0019
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0014
            r2 = r3[r1]
            if (r2 != r4) goto L_0x0014
            r0 = r1
            goto L_0x000a
        L_0x0014:
            if (r5 == 0) goto L_0x0018
            r3 = r0
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            if (r6 == 0) goto L_0x0020
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.z.d(int[], int, boolean, boolean):int");
    }

    public static int e(long[] jArr, long j7, boolean z) {
        int i8;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                int i9 = binarySearch - 1;
                if (i9 < 0 || jArr[i9] != j7) {
                    i8 = binarySearch;
                } else {
                    binarySearch = i9;
                }
            }
            i8 = binarySearch;
        }
        if (z) {
            return Math.max(0, i8);
        }
        return i8;
    }

    public static int f(int i8, int i9) {
        return ((i8 + i9) - 1) / i9;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f8, f10));
    }

    public static int i(int i8, int i9, int i10) {
        return Math.max(i9, Math.min(i8, i10));
    }

    public static long j(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    public static boolean k(Object[] objArr, Object obj) {
        for (Object equals : objArr) {
            if (Objects.equals(equals, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int l(int i8, int i9, int i10, byte[] bArr) {
        while (i8 < i9) {
            i10 = f3759n[((i10 >>> 24) ^ (bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE)) & Pdu.MANUFACTURER_DATA_PDU_TYPE] ^ (i10 << 8);
            i8++;
        }
        return i10;
    }

    public static Handler m(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        l.k(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int p(int i8) {
        if (i8 == 20) {
            return 30;
        }
        if (i8 == 22) {
            return 31;
        }
        if (i8 == 30) {
            return 34;
        }
        switch (i8) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i8) {
                    case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                        return 25;
                    case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                    case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                    case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                    case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static AudioFormat q(int i8, int i9, int i10) {
        return new AudioFormat.Builder().setSampleRate(i8).setChannelMask(i9).setEncoding(i10).build();
    }

    public static int r(int i8) {
        int i9 = f3748a;
        if (i8 != 10) {
            if (i8 == 12) {
                return 743676;
            }
            if (i8 != 24) {
                switch (i8) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            } else if (i9 >= 32) {
                return 67108860;
            } else {
                return 0;
            }
        } else if (i9 >= 32) {
            return 737532;
        } else {
            return 6396;
        }
    }

    public static byte[] s(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) (Character.digit(str.charAt(i9 + 1), 16) + (Character.digit(str.charAt(i9), 16) << 4));
        }
        return bArr;
    }

    public static int t(int i8, String str) {
        int i9 = 0;
        for (String e8 : a0(str)) {
            if (i8 == I.i(I.e(e8))) {
                i9++;
            }
        }
        return i9;
    }

    public static String u(int i8, String str) {
        String[] a02 = a0(str);
        if (a02.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : a02) {
            if (i8 == I.i(I.e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int v(int i8) {
        if (i8 == 2 || i8 == 4) {
            return 6005;
        }
        if (i8 == 10) {
            return 6004;
        }
        if (i8 == 7) {
            return 6005;
        }
        if (i8 == 8) {
            return 6003;
        }
        switch (i8) {
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                return 6003;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                return 6005;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i8) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r5 = r5.split("_", -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(java.lang.String r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            java.lang.String r2 = "_"
            java.lang.String[] r5 = r5.split(r2, r1)
            int r1 = r5.length
            r2 = 2
            if (r1 >= r2) goto L_0x0010
            return r0
        L_0x0010:
            int r3 = r1 + -1
            r3 = r5[r3]
            r4 = 3
            if (r1 < r4) goto L_0x0024
            int r1 = r1 - r2
            r5 = r5[r1]
            java.lang.String r1 = "neg"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            r3.getClass()     // Catch:{ NumberFormatException -> 0x002f }
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x002f }
            if (r5 == 0) goto L_0x002f
            int r0 = -r0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.z.w(java.lang.String):int");
    }

    public static long x(long j7, float f8) {
        if (f8 == 1.0f) {
            return j7;
        }
        return Math.round(((double) j7) * ((double) f8));
    }

    public static long y(long j7) {
        if (j7 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j7 + SystemClock.elapsedRealtime();
    }

    public static int z(int i8) {
        if (i8 == 8) {
            return 3;
        }
        if (i8 == 16) {
            return 2;
        }
        if (i8 == 24) {
            return 21;
        }
        if (i8 != 32) {
            return 0;
        }
        return 22;
    }
}
