package M0;

import F.h;
import P0.z;
import android.text.TextUtils;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f2839a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f2840b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        C0123k g8;
        int a8;
        if (str == null) {
            return false;
        }
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c8 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c8 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c8 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c8 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c8 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c8 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c8 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c8 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c8 = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c8 = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c8 = 10;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (g8 = g(str2)) == null || (a8 = g8.a()) == 0 || a8 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String e : z.a0(str)) {
            String e8 = e(e);
            if (e8 != null && k(e8)) {
                return e8;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] a02 = z.a0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : a02) {
            if (str2.equals(e(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int d(String str, String str2) {
        C0123k g8;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c8 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c8 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c8 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c8 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c8 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c8 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c8 = 8;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c8 = 9;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c8 = 10;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c8 = 11;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (g8 = g(str2)) == null) {
                    return 0;
                }
                return g8.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        C0123k g8;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String E8 = h.E(str.trim());
        if (E8.startsWith("avc1") || E8.startsWith("avc3")) {
            return "video/avc";
        }
        if (E8.startsWith("hev1") || E8.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (E8.startsWith("dvav") || E8.startsWith("dva1") || E8.startsWith("dvhe") || E8.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (E8.startsWith("av01")) {
            return "video/av01";
        }
        if (E8.startsWith("vp9") || E8.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (E8.startsWith("vp8") || E8.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (E8.startsWith("mp4a")) {
            if (E8.startsWith("mp4a.") && (g8 = g(E8)) != null) {
                str2 = f(g8.f2964b);
            }
            if (str2 == null) {
                return "audio/mp4a-latm";
            }
            return str2;
        } else if (E8.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (E8.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (E8.startsWith("ac-3") || E8.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (E8.startsWith("ec-3") || E8.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (E8.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (E8.startsWith("ac-4") || E8.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (E8.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (E8.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (E8.startsWith("dtsh") || E8.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (E8.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (E8.startsWith("opus")) {
                return "audio/opus";
            }
            if (E8.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (E8.startsWith("flac")) {
                return "audio/flac";
            }
            if (E8.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (E8.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (E8.contains("cea708")) {
                return "application/cea-708";
            }
            if (E8.contains("eia608") || E8.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f2839a;
            if (arrayList.size() <= 0) {
                return null;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case PhoneRestrictionPolicy.ERROR_SIM_PIN_UNKNOWN /*100*/:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static C0123k g(String str) {
        int i;
        Matcher matcher = f2840b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i = Integer.parseInt(group2);
            } else {
                i = 0;
            }
            return new C0123k(parseInt, i, 1);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (n(str)) {
            return 2;
        }
        if (m(str)) {
            return 3;
        }
        if (l(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f2839a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String e : z.a0(str)) {
            String e8 = e(e);
            if (e8 != null && n(e8)) {
                return e8;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str) {
        if ("image".equals(h(str)) || "application/x-image-uri".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean m(String str) {
        if ("text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean n(String str) {
        return "video".equals(h(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        String E8 = h.E(str);
        E8.getClass();
        char c8 = 65535;
        switch (E8.hashCode()) {
            case -1007807498:
                if (E8.equals("audio/x-flac")) {
                    c8 = 0;
                    break;
                }
                break;
            case -979095690:
                if (E8.equals("application/x-mpegurl")) {
                    c8 = 1;
                    break;
                }
                break;
            case -586683234:
                if (E8.equals("audio/x-wav")) {
                    c8 = 2;
                    break;
                }
                break;
            case -432836268:
                if (E8.equals("audio/mpeg-l1")) {
                    c8 = 3;
                    break;
                }
                break;
            case -432836267:
                if (E8.equals("audio/mpeg-l2")) {
                    c8 = 4;
                    break;
                }
                break;
            case 187090231:
                if (E8.equals("audio/mp3")) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case 2:
                return "audio/wav";
            case 3:
                return "audio/mpeg-L1";
            case 4:
                return "audio/mpeg-L2";
            case 5:
                return "audio/mpeg";
            default:
                return E8;
        }
    }
}
