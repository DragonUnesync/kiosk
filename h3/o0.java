package H3;

public final class o0 extends U {

    /* renamed from: c0  reason: collision with root package name */
    public static final Object[] f2103c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final o0 f2104d0;

    /* renamed from: X  reason: collision with root package name */
    public final transient Object[] f2105X;

    /* renamed from: Y  reason: collision with root package name */
    public final transient int f2106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final transient Object[] f2107Z;

    /* renamed from: a0  reason: collision with root package name */
    public final transient int f2108a0;

    /* renamed from: b0  reason: collision with root package name */
    public final transient int f2109b0;

    static {
        Object[] objArr = new Object[0];
        f2103c0 = objArr;
        f2104d0 = new o0(0, 0, 0, objArr, objArr);
    }

    public o0(int i, int i8, int i9, Object[] objArr, Object[] objArr2) {
        this.f2105X = objArr;
        this.f2106Y = i;
        this.f2107Z = objArr2;
        this.f2108a0 = i8;
        this.f2109b0 = i9;
    }

    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.f2105X;
        int i8 = this.f2109b0;
        System.arraycopy(objArr2, 0, objArr, i, i8);
        return i + i8;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f2107Z;
            if (objArr.length != 0) {
                int v4 = C0103u.v(obj);
                while (true) {
                    int i = v4 & this.f2108a0;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v4 = i + 1;
                }
            }
        }
        return false;
    }

    public final Object[] d() {
        return this.f2105X;
    }

    public final int e() {
        return this.f2109b0;
    }

    public final int f() {
        return 0;
    }

    public final boolean g() {
        return false;
    }

    public final x0 h() {
        return b().listIterator(0);
    }

    public final int hashCode() {
        return this.f2106Y;
    }

    public final O m() {
        return O.i(this.f2109b0, this.f2105X);
    }

    public final int size() {
        return this.f2109b0;
    }
}
