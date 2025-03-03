package h;

import android.content.res.Configuration;
import android.os.LocaleList;
import q0.C1357d;

public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList f8 = configuration.getLocales();
        LocaleList f9 = configuration2.getLocales();
        if (!f8.equals(f9)) {
            configuration3.setLocales(f9);
            configuration3.locale = configuration2.locale;
        }
    }

    public static C1357d b(Configuration configuration) {
        return C1357d.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(C1357d dVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dVar.f14703a.a()));
    }

    public static void d(Configuration configuration, C1357d dVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dVar.f14703a.a()));
    }
}
