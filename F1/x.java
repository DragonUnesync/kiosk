package f1;

import H3.C0103u;
import H3.I;
import H3.L;
import H3.M;
import H3.O;
import H3.Q;
import H3.i0;
import H3.x0;
import M0.J;
import P0.l;
import P0.q;
import P0.z;
import P5.E;
import T7.C;
import android.net.Uri;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f11632a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f11633b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f11634c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f11635d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    public static final Pattern e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f11636f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g  reason: collision with root package name */
    public static final String f11637g = new String(new byte[]{10});

    /* renamed from: h  reason: collision with root package name */
    public static final String f11638h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c8 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c8 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c8 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c8 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c8 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c8 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c8 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c8 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c8 = 8;
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c8 = 9;
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c8 = 10;
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c8 = 11;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case 8:
                return 5;
            case 9:
                return 10;
            case 10:
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static i0 b(String str) {
        if (str == null) {
            M m8 = O.f2026V;
            return i0.f2073Y;
        }
        C0103u.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = z.f3748a;
        int i8 = 0;
        for (String a8 : str.split(",\\s?", -1)) {
            int a9 = a(a8);
            if (a9 != 0) {
                Integer valueOf = Integer.valueOf(a9);
                int i9 = i8 + 1;
                int f8 = I.f(objArr.length, i9);
                if (f8 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, f8);
                }
                objArr[i8] = valueOf;
                i8 = i9;
            }
        }
        return O.i(i8, objArr);
    }

    public static E c(String str) {
        long j7;
        Matcher matcher = f11635d.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            if (group2 != null) {
                try {
                    j7 = ((long) Integer.parseInt(group2)) * 1000;
                } catch (NumberFormatException e8) {
                    throw J.b(e8, str);
                }
            } else {
                j7 = 60000;
            }
            return new E((Object) group, j7, 5);
        }
        throw J.b((Exception) null, str);
    }

    public static C d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i = z.f3748a;
        String[] split = userInfo.split(":", 2);
        return new C(2, split[0], split[1]);
    }

    public static q e(String str) {
        Matcher matcher = e.matcher(str);
        String str2 = "";
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            if (group3 != null) {
                str2 = group3;
            }
            return new q(group, 2, group2, str2);
        }
        Matcher matcher2 = f11636f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new q(group4, 1, str2, str2);
        }
        throw J.b((Exception) null, "Invalid WWW-Authenticate header " + str);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        l.d(encodedAuthority.contains("@"));
        int i = z.f3748a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
    }

    public static i0 g(y yVar) {
        boolean z;
        if (yVar.f11641c.c("CSeq") != null) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        L l8 = new L();
        l8.c(z.n("%s %s %s", h(yVar.f11640b), yVar.f11639a, "RTSP/1.0"));
        Q a8 = yVar.f11641c.a();
        x0 h5 = a8.e().iterator();
        while (h5.hasNext()) {
            String str = (String) h5.next();
            O d8 = a8.d(str);
            for (int i = 0; i < d8.size(); i++) {
                l8.c(z.n("%s: %s", str, d8.get(i)));
            }
        }
        l8.c("");
        l8.c(yVar.f11642d);
        return l8.g();
    }

    public static String h(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
