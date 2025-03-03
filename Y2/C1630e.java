package y2;

/* renamed from: y2.e  reason: case insensitive filesystem */
public final class C1630e extends C1631f {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1630e f16378Y;

    /* renamed from: V  reason: collision with root package name */
    public int[] f16379V;

    /* renamed from: W  reason: collision with root package name */
    public int f16380W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f16381X;

    static {
        C1630e eVar = new C1630e(0);
        f16378Y = eVar;
        eVar.f16382U = false;
    }

    public C1630e(int i) {
        super(true);
        try {
            this.f16379V = new int[i];
            this.f16380W = 0;
            this.f16381X = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final void e(int i) {
        d();
        int i8 = this.f16380W;
        int[] iArr = this.f16379V;
        boolean z = false;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[(((i8 * 3) / 2) + 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f16379V = iArr2;
        }
        int[] iArr3 = this.f16379V;
        int i9 = this.f16380W;
        int i10 = i9 + 1;
        this.f16380W = i10;
        iArr3[i9] = i;
        if (this.f16381X && i10 > 1) {
            if (i >= iArr3[i9 - 1]) {
                z = true;
            }
            this.f16381X = z;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1630e)) {
            return false;
        }
        C1630e eVar = (C1630e) obj;
        if (this.f16381X != eVar.f16381X || this.f16380W != eVar.f16380W) {
            return false;
        }
        for (int i = 0; i < this.f16380W; i++) {
            if (this.f16379V[i] != eVar.f16379V[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        if (i < this.f16380W) {
            try {
                return this.f16379V[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IndexOutOfBoundsException("n < 0");
            }
        } else {
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public final void g(int i, int i8) {
        d();
        if (i < this.f16380W) {
            try {
                this.f16379V[i] = i8;
                this.f16381X = false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                if (i < 0) {
                    throw new IllegalArgumentException("n < 0");
                }
            }
        } else {
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public final int hashCode() {
        int i = 0;
        for (int i8 = 0; i8 < this.f16380W; i8++) {
            i = (i * 31) + this.f16379V[i8];
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f16380W * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f16380W; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f16379V[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}
