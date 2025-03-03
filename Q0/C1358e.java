package q0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import u.C1477r;

/* renamed from: q0.e  reason: case insensitive filesystem */
public final class C1358e implements C1359f {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f14704c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f14705a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14706b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public C1358e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f14705a = f14704c;
            this.f14706b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException(C1477r.c(i, "list[", "] is null"));
            }
        }
        this.f14705a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f14706b = sb.toString();
    }

    public final String a() {
        return this.f14706b;
    }

    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1358e)) {
            return false;
        }
        Locale[] localeArr = ((C1358e) obj).f14705a;
        Locale[] localeArr2 = this.f14705a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f14705a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f14705a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        if (this.f14705a.length == 0) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f14705a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f14705a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
