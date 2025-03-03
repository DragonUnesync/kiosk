package S3;

import java.util.Arrays;

public final class b implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public final int f4505U;

    /* renamed from: V  reason: collision with root package name */
    public final int f4506V;

    /* renamed from: W  reason: collision with root package name */
    public final int f4507W;

    /* renamed from: X  reason: collision with root package name */
    public final int[] f4508X;

    public b(int i, int i8) {
        if (i <= 0 || i8 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4505U = i;
        this.f4506V = i8;
        int i9 = (i + 31) / 32;
        this.f4507W = i9;
        this.f4508X = new int[(i9 * i8)];
    }

    public final void a(int i, int i8) {
        int i9 = (i / 32) + (i8 * this.f4507W);
        int[] iArr = this.f4508X;
        iArr[i9] = (1 << (i & 31)) ^ iArr[i9];
    }

    public final boolean b(int i, int i8) {
        if (((this.f4508X[(i / 32) + (i8 * this.f4507W)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int[] c() {
        int[] iArr = this.f4508X;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f4507W;
        int i8 = length / i;
        int i9 = (length % i) << 5;
        int i10 = iArr[length];
        int i11 = 31;
        while ((i10 >>> i11) == 0) {
            i11--;
        }
        return new int[]{i9 + i11, i8};
    }

    public final Object clone() {
        int i = this.f4507W;
        return new b(this.f4505U, this.f4506V, i, (int[]) this.f4508X.clone());
    }

    public final a d(a aVar, int i) {
        int i8 = aVar.f4504V;
        int i9 = this.f4505U;
        if (i8 < i9) {
            aVar = new a(i9);
        } else {
            int length = aVar.f4503U.length;
            for (int i10 = 0; i10 < length; i10++) {
                aVar.f4503U[i10] = 0;
            }
        }
        int i11 = this.f4507W;
        int i12 = i * i11;
        for (int i13 = 0; i13 < i11; i13++) {
            aVar.f4503U[(i13 << 5) / 32] = this.f4508X[i12 + i13];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i = 0;
        int i8 = 0;
        while (true) {
            iArr = this.f4508X;
            if (i8 < iArr.length && iArr[i8] == 0) {
                i8++;
            }
        }
        if (i8 == iArr.length) {
            return null;
        }
        int i9 = this.f4507W;
        int i10 = i8 / i9;
        int i11 = (i8 % i9) << 5;
        while ((iArr[i8] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i11 + i, i10};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (S3.b) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof S3.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            S3.b r4 = (S3.b) r4
            int r0 = r4.f4505U
            int r2 = r3.f4505U
            if (r2 != r0) goto L_0x0026
            int r0 = r3.f4506V
            int r2 = r4.f4506V
            if (r0 != r2) goto L_0x0026
            int r0 = r3.f4507W
            int r2 = r4.f4507W
            if (r0 != r2) goto L_0x0026
            int[] r0 = r3.f4508X
            int[] r4 = r4.f4508X
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L_0x0026
            r4 = 1
            return r4
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.b.equals(java.lang.Object):boolean");
    }

    public final void f(int i, int i8) {
        int i9 = (i / 32) + (i8 * this.f4507W);
        int[] iArr = this.f4508X;
        iArr[i9] = (1 << (i & 31)) | iArr[i9];
    }

    public final void g(int i, int i8, int i9, int i10) {
        if (i8 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i10 <= 0 || i9 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i11 = i9 + i;
            int i12 = i10 + i8;
            if (i12 > this.f4506V || i11 > this.f4505U) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i8 < i12) {
                int i13 = this.f4507W * i8;
                for (int i14 = i; i14 < i11; i14++) {
                    int i15 = (i14 / 32) + i13;
                    int[] iArr = this.f4508X;
                    iArr[i15] = iArr[i15] | (1 << (i14 & 31));
                }
                i8++;
            }
        }
    }

    public final int hashCode() {
        int i = this.f4505U;
        return Arrays.hashCode(this.f4508X) + (((((((i * 31) + i) * 31) + this.f4506V) * 31) + this.f4507W) * 31);
    }

    public final String toString() {
        String str;
        int i = this.f4505U;
        int i8 = this.f4506V;
        StringBuilder sb = new StringBuilder((i + 1) * i8);
        for (int i9 = 0; i9 < i8; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                if (b(i10, i9)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public b(int i, int i8, int i9, int[] iArr) {
        this.f4505U = i;
        this.f4506V = i8;
        this.f4507W = i9;
        this.f4508X = iArr;
    }
}
