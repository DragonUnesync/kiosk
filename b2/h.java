package B2;

import android.text.TextUtils;
import z3.e;

public final class h {
    public static final e e = new e(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f384a;

    /* renamed from: b  reason: collision with root package name */
    public final g f385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f386c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f387d;

    public h(String str, Object obj, g gVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f386c = str;
            this.f384a = obj;
            this.f385b = gVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f386c.equals(((h) obj).f386c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f386c.hashCode();
    }

    public final String toString() {
        return N.e.A(new StringBuilder("Option{key='"), this.f386c, "'}");
    }
}
