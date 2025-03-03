package o;

import java.util.Locale;

public abstract class T {
    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }
}
