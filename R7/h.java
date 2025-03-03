package R7;

import E7.d;
import N.e;
import Q7.g;
import R2.c;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4371a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f4372b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4373c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4374d = Pattern.compile("[\\x00-\\x1f]*");
    public static final c e = new c((Supplier) new d(4));

    public static void a(String str, StringBuilder sb, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z6 = false;
        boolean z8 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160) {
                if ((!z || z6) && !z8) {
                    sb.append(' ');
                    z8 = true;
                }
            } else if (!(codePointAt == 8203 || codePointAt == 173)) {
                sb.appendCodePoint(codePointAt);
                z6 = true;
                z8 = false;
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder b() {
        return (StringBuilder) e.F();
    }

    public static boolean c(String str, String... strArr) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String[] strArr) {
        if (Arrays.binarySearch(strArr, str) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean e(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!f(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(int i) {
        if (i == 32 || i == 9 || i == 10 || i == 12 || i == 13) {
            return true;
        }
        return false;
    }

    public static String g(Collection collection, String str) {
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder b8 = b();
        g.D(b8);
        b8.append(obj);
        while (it.hasNext()) {
            Object next = it.next();
            b8.append(str);
            b8.append(next);
        }
        return h(b8);
    }

    public static String h(StringBuilder sb) {
        g.D(sb);
        String sb2 = sb.toString();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            e.u0(sb);
        }
        return sb2;
    }

    public static URL i(URL url, String str) {
        String replaceAll = f4374d.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = url.getPath() + replaceAll;
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = f4372b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder B8 = e.B(replaceFirst, "#");
            B8.append(url2.getRef());
            replaceFirst = B8.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
