package p1;

import D1.e;
import D1.k;
import M0.G;
import M0.H;
import P0.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f14434c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f14435a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f14436b = -1;

    public final boolean a(String str) {
        Matcher matcher = f14434c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = z.f3748a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f14435a = parseInt;
            this.f14436b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(H h5) {
        int i = 0;
        while (true) {
            G[] gArr = h5.f2837U;
            if (i < gArr.length) {
                G g8 = gArr[i];
                if (g8 instanceof e) {
                    e eVar = (e) g8;
                    if ("iTunSMPB".equals(eVar.f998W) && a(eVar.f999X)) {
                        return;
                    }
                } else if (g8 instanceof k) {
                    k kVar = (k) g8;
                    if ("com.apple.iTunes".equals(kVar.f1011V) && "iTunSMPB".equals(kVar.f1012W) && a(kVar.f1013X)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
