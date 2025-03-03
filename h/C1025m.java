package h;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: h.m  reason: case insensitive filesystem */
public abstract class C1025m {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
