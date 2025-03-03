package q0;

import android.os.Build;
import java.util.Locale;

/* renamed from: q0.d  reason: case insensitive filesystem */
public final class C1357d {

    /* renamed from: b  reason: collision with root package name */
    public static final C1357d f14702b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final C1359f f14703a;

    public C1357d(C1359f fVar) {
        this.f14703a = fVar;
    }

    public static C1357d a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1357d(new C1360g(C1355b.a(localeArr)));
        }
        return new C1357d(new C1358e(localeArr));
    }

    public static C1357d b(String str) {
        if (str == null || str.isEmpty()) {
            return f14702b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i8 = C1356c.f14701a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final Locale c() {
        return this.f14703a.get(0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1357d) {
            if (this.f14703a.equals(((C1357d) obj).f14703a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14703a.hashCode();
    }

    public final String toString() {
        return this.f14703a.toString();
    }
}
