package S3;

import java.util.Arrays;

public final class a implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public int[] f4503U;

    /* renamed from: V  reason: collision with root package name */
    public int f4504V;

    public a(int i) {
        this.f4504V = i;
        this.f4503U = new int[((i + 31) / 32)];
    }

    public final boolean a(int i) {
        if (((1 << (i & 31)) & this.f4503U[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int b(int i) {
        int i8 = this.f4504V;
        if (i >= i8) {
            return i8;
        }
        int i9 = i / 32;
        int i10 = (-(1 << (i & 31))) & this.f4503U[i9];
        while (i10 == 0) {
            i9++;
            int[] iArr = this.f4503U;
            if (i9 == iArr.length) {
                return i8;
            }
            i10 = iArr[i9];
        }
        return Math.min(Integer.numberOfTrailingZeros(i10) + (i9 << 5), i8);
    }

    public final int c(int i) {
        int i8 = this.f4504V;
        if (i >= i8) {
            return i8;
        }
        int i9 = i / 32;
        int i10 = (-(1 << (i & 31))) & (~this.f4503U[i9]);
        while (i10 == 0) {
            i9++;
            int[] iArr = this.f4503U;
            if (i9 == iArr.length) {
                return i8;
            }
            i10 = ~iArr[i9];
        }
        return Math.min(Integer.numberOfTrailingZeros(i10) + (i9 << 5), i8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [S3.a, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        obj.f4503U = (int[]) this.f4503U.clone();
        obj.f4504V = this.f4504V;
        return obj;
    }

    public final boolean d(int i, int i8) {
        int i9;
        if (i8 < i || i < 0 || i8 > this.f4504V) {
            throw new IllegalArgumentException();
        } else if (i8 == i) {
            return true;
        } else {
            int i10 = i8 - 1;
            int i11 = i / 32;
            int i12 = i10 / 32;
            for (int i13 = i11; i13 <= i12; i13++) {
                int i14 = 31;
                if (i13 > i11) {
                    i9 = 0;
                } else {
                    i9 = i & 31;
                }
                if (i13 >= i12) {
                    i14 = 31 & i10;
                }
                if ((((2 << i14) - (1 << i9)) & this.f4503U[i13]) != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void e() {
        int i;
        int[] iArr = new int[this.f4503U.length];
        int i8 = this.f4504V;
        int i9 = (i8 - 1) / 32;
        int i10 = i9 + 1;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long j7 = (long) this.f4503U[i11];
            long j8 = ((j7 & 1431655765) << 1) | ((j7 >> 1) & 1431655765);
            long j9 = ((j8 & 858993459) << 2) | ((j8 >> 2) & 858993459);
            long j10 = ((j9 & 252645135) << 4) | ((j9 >> 4) & 252645135);
            long j11 = ((j10 & 16711935) << 8) | ((j10 >> 8) & 16711935);
            iArr[i9 - i11] = (int) (((j11 & 65535) << 16) | ((j11 >> 16) & 65535));
            i11++;
        }
        int i12 = i10 << 5;
        if (i8 != i12) {
            int i13 = i12 - i8;
            int i14 = iArr[0] >>> i13;
            for (i = 1; i < i10; i++) {
                int i15 = iArr[i];
                iArr[i - 1] = i14 | (i15 << (32 - i13));
                i14 = i15 >>> i13;
            }
            iArr[i9] = i14;
        }
        this.f4503U = iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (S3.a) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof S3.a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            S3.a r4 = (S3.a) r4
            int r0 = r4.f4504V
            int r2 = r3.f4504V
            if (r2 != r0) goto L_0x001a
            int[] r0 = r3.f4503U
            int[] r4 = r4.f4503U
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L_0x001a
            r4 = 1
            return r4
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.equals(java.lang.Object):boolean");
    }

    public final void f(int i) {
        int[] iArr = this.f4503U;
        int i8 = i / 32;
        iArr[i8] = (1 << (i & 31)) | iArr[i8];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4503U) + (this.f4504V * 31);
    }

    public final String toString() {
        char c8;
        int i = this.f4504V;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i8 = 0; i8 < i; i8++) {
            if ((i8 & 7) == 0) {
                sb.append(' ');
            }
            if (a(i8)) {
                c8 = 'X';
            } else {
                c8 = '.';
            }
            sb.append(c8);
        }
        return sb.toString();
    }
}
