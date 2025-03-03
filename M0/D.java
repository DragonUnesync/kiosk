package M0;

import java.util.HashSet;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f2790a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static String f2791b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (D.class) {
            if (f2790a.add(str)) {
                f2791b += ", " + str;
            }
        }
    }
}
