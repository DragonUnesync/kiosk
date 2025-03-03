package Z5;

import e6.C0847f;
import g6.B;

public final class T implements Comparable {
    public static final T CONNECT;
    public static final T DELETE;
    public static final T GET;
    public static final T HEAD;
    public static final T OPTIONS;
    public static final T PATCH;
    public static final T POST;
    public static final T PUT;
    public static final T TRACE;
    private static final S methodMap;
    private final C0847f name;

    static {
        T t8 = new T("OPTIONS");
        OPTIONS = t8;
        T t9 = new T("GET");
        GET = t9;
        T t10 = new T("HEAD");
        HEAD = t10;
        T t11 = new T("POST");
        POST = t11;
        T t12 = new T("PUT");
        PUT = t12;
        T t13 = new T("PATCH");
        PATCH = t13;
        T t14 = new T("DELETE");
        DELETE = t14;
        T t15 = new T("TRACE");
        TRACE = t15;
        T t16 = new T("CONNECT");
        CONNECT = t16;
        methodMap = new S(new Q(t8.toString(), t8), new Q(t9.toString(), t9), new Q(t10.toString(), t10), new Q(t11.toString(), t11), new Q(t12.toString(), t12), new Q(t13.toString(), t13), new Q(t14.toString(), t14), new Q(t15.toString(), t15), new Q(t16.toString(), t16));
    }

    public T(String str) {
        String checkNonEmptyAfterTrim = B.checkNonEmptyAfterTrim(str, "name");
        for (int i = 0; i < checkNonEmptyAfterTrim.length(); i++) {
            char charAt = checkNonEmptyAfterTrim.charAt(i);
            if (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) {
                throw new IllegalArgumentException("invalid character in name");
            }
        }
        this.name = C0847f.cached(checkNonEmptyAfterTrim);
    }

    public C0847f asciiName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        return name().equals(((T) obj).name());
    }

    public int hashCode() {
        return name().hashCode();
    }

    public String name() {
        return this.name.toString();
    }

    public String toString() {
        return this.name.toString();
    }

    public int compareTo(T t8) {
        if (t8 == this) {
            return 0;
        }
        return name().compareTo(t8.name());
    }
}
