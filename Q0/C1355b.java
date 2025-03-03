package q0;

import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: q0.b  reason: case insensitive filesystem */
public abstract class C1355b {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static DecimalFormatSymbols b(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList c(Configuration configuration) {
        return configuration.getLocales();
    }
}
