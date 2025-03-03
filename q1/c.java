package Q1;

import P0.l;
import P0.z;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4095a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f4096b;

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4097c;

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4098d = Pattern.compile("\\\\an(\\d+)");

    static {
        int i = z.f3748a;
        Locale locale = Locale.US;
        f4096b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        f4097c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
    }

    public static PointF a(String str) {
        String str2;
        String str3;
        Matcher matcher = f4096b.matcher(str);
        Matcher matcher2 = f4097c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                l.s("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        } else if (!find2) {
            return null;
        } else {
            str2 = matcher2.group(1);
            str3 = matcher2.group(2);
        }
        str2.getClass();
        float parseFloat = Float.parseFloat(str2.trim());
        str3.getClass();
        return new PointF(parseFloat, Float.parseFloat(str3.trim()));
    }
}
