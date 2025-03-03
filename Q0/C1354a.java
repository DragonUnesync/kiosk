package q0;

import E.d;
import P6.f;
import android.os.Build;
import java.util.Locale;

/* renamed from: q0.a  reason: case insensitive filesystem */
public abstract class C1354a {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            d.c(30);
        }
        if (i >= 30) {
            d.c(31);
        }
        if (i >= 30) {
            d.c(33);
        }
        if (i >= 30) {
            d.c(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                f.d(str, "CODENAME");
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    f.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                    f.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
