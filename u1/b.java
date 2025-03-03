package U1;

import P0.r;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f5376c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f5377d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final r f5378a = new r();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f5379b = new StringBuilder();

    public static String a(r rVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = rVar.f3733b;
        int i8 = rVar.f3734c;
        while (i < i8 && !z) {
            char c8 = (char) rVar.f3732a[i];
            if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c8);
            }
        }
        rVar.I(i - rVar.f3733b);
        return sb.toString();
    }

    public static String b(r rVar, StringBuilder sb) {
        c(rVar);
        if (rVar.a() == 0) {
            return null;
        }
        String a8 = a(rVar, sb);
        if (!"".equals(a8)) {
            return a8;
        }
        return "" + ((char) rVar.v());
    }

    public static void c(r rVar) {
        while (true) {
            boolean z = true;
            while (rVar.a() > 0 && z) {
                int i = rVar.f3733b;
                byte[] bArr = rVar.f3732a;
                byte b8 = bArr[i];
                char c8 = (char) b8;
                if (c8 == 9 || c8 == 10 || c8 == 12 || c8 == 13 || c8 == ' ') {
                    rVar.I(1);
                } else {
                    int i8 = rVar.f3734c;
                    int i9 = i + 2;
                    if (i9 <= i8) {
                        int i10 = i + 1;
                        if (b8 == 47 && bArr[i10] == 42) {
                            while (true) {
                                int i11 = i9 + 1;
                                if (i11 >= i8) {
                                    break;
                                } else if (((char) bArr[i9]) == '*' && ((char) bArr[i11]) == '/') {
                                    i9 += 2;
                                    i8 = i9;
                                } else {
                                    i9 = i11;
                                }
                            }
                            rVar.I(i8 - rVar.f3733b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}
