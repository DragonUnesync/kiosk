package w;

import android.os.Build;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final e f16152a;

    public h(e eVar) {
        this.f16152a = eVar;
    }

    public static h a(Object obj) {
        int i;
        if (obj == null || (i = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (i >= 31) {
            return new h(new e(obj));
        }
        return new h(new e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f16152a.equals(((h) obj).f16152a);
    }

    public final int hashCode() {
        return this.f16152a.hashCode();
    }

    public final String toString() {
        return this.f16152a.toString();
    }
}
