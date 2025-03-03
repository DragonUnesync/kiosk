package M0;

import P0.l;
import P0.z;
import android.util.Pair;

public abstract class X {

    /* renamed from: a  reason: collision with root package name */
    public static final U f2884a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [M0.U, java.lang.Object] */
    static {
        z.J(0);
        z.J(1);
        z.J(2);
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, V v4, W w2, int i8, boolean z) {
        int i9 = f(i, v4, false).f2864c;
        if (m(i9, w2, 0).f2882o != i) {
            return i + 1;
        }
        int e = e(i9, i8, z);
        if (e == -1) {
            return -1;
        }
        return m(e, w2, 0).f2881n;
    }

    public int e(int i, int i8, boolean z) {
        if (i8 != 0) {
            if (i8 == 1) {
                return i;
            }
            if (i8 != 2) {
                throw new IllegalStateException();
            } else if (i == c(z)) {
                return a(z);
            } else {
                return i + 1;
            }
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c8;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x8 = (X) obj;
        if (x8.o() != o() || x8.h() != h()) {
            return false;
        }
        W w2 = new W();
        V v4 = new V();
        W w4 = new W();
        V v8 = new V();
        for (int i = 0; i < o(); i++) {
            if (!m(i, w2, 0).equals(x8.m(i, w4, 0))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < h(); i8++) {
            if (!f(i8, v4, true).equals(x8.f(i8, v8, true))) {
                return false;
            }
        }
        int a8 = a(true);
        if (a8 != x8.a(true) || (c8 = c(true)) != x8.c(true)) {
            return false;
        }
        while (a8 != c8) {
            int e = e(a8, 0, true);
            if (e != x8.e(a8, 0, true)) {
                return false;
            }
            a8 = e;
        }
        return true;
    }

    public abstract V f(int i, V v4, boolean z);

    public V g(Object obj, V v4) {
        return f(b(obj), v4, true);
    }

    public abstract int h();

    public final int hashCode() {
        W w2 = new W();
        V v4 = new V();
        int o2 = o() + 217;
        for (int i = 0; i < o(); i++) {
            o2 = (o2 * 31) + m(i, w2, 0).hashCode();
        }
        int h5 = h() + (o2 * 31);
        for (int i8 = 0; i8 < h(); i8++) {
            h5 = (h5 * 31) + f(i8, v4, true).hashCode();
        }
        int a8 = a(true);
        while (a8 != -1) {
            h5 = (h5 * 31) + a8;
            a8 = e(a8, 0, true);
        }
        return h5;
    }

    public final Pair i(W w2, V v4, int i, long j7) {
        Pair j8 = j(w2, v4, i, j7, 0);
        j8.getClass();
        return j8;
    }

    public final Pair j(W w2, V v4, int i, long j7, long j8) {
        l.g(i, o());
        m(i, w2, j8);
        if (j7 == -9223372036854775807L) {
            j7 = w2.f2879l;
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = w2.f2881n;
        f(i8, v4, false);
        while (i8 < w2.f2882o && v4.e != j7) {
            int i9 = i8 + 1;
            if (f(i9, v4, false).e > j7) {
                break;
            }
            i8 = i9;
        }
        f(i8, v4, true);
        long j9 = j7 - v4.e;
        long j10 = v4.f2865d;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        long max = Math.max(0, j9);
        Object obj = v4.f2863b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i8, boolean z) {
        if (i8 != 0) {
            if (i8 == 1) {
                return i;
            }
            if (i8 != 2) {
                throw new IllegalStateException();
            } else if (i == a(z)) {
                return c(z);
            } else {
                return i - 1;
            }
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object l(int i);

    public abstract W m(int i, W w2, long j7);

    public final void n(int i, W w2) {
        m(i, w2, 0);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
