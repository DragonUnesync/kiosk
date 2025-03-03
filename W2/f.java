package W2;

import F.a;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6162a = new a(1);

    /* renamed from: b  reason: collision with root package name */
    public static final a f6163b = new a(2);

    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
