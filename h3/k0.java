package H3;

import java.util.Map;

public final class k0 extends U {

    /* renamed from: X  reason: collision with root package name */
    public final transient n0 f2083X;

    /* renamed from: Y  reason: collision with root package name */
    public final transient Object[] f2084Y;

    /* renamed from: Z  reason: collision with root package name */
    public final transient int f2085Z;

    public k0(n0 n0Var, Object[] objArr, int i) {
        this.f2083X = n0Var;
        this.f2084Y = objArr;
        this.f2085Z = i;
    }

    public final int c(int i, Object[] objArr) {
        return b().c(i, objArr);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f2083X.get(key))) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return true;
    }

    public final x0 h() {
        return b().listIterator(0);
    }

    public final O m() {
        return new j0(this);
    }

    public final int size() {
        return this.f2085Z;
    }
}
