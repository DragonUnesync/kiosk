package R7;

import D4.h;
import java.util.Locale;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4358a = new h(4);

    /* renamed from: b  reason: collision with root package name */
    public static final h f4359b = new h(5);

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f4360c = {"input", "keygen", "object", "select", "textarea"};

    public static String a(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }

    public static String b(String str) {
        return a(str).trim();
    }
}
