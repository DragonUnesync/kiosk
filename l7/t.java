package l7;

import D6.h;
import P6.f;
import com.bumptech.glide.d;
import m7.C1219b;

public final class t extends i {

    /* renamed from: Y  reason: collision with root package name */
    public final transient byte[][] f13248Y;

    /* renamed from: Z  reason: collision with root package name */
    public final transient int[] f13249Z;

    public t(byte[][] bArr, int[] iArr) {
        super(i.f13217X.f13218U);
        this.f13248Y = bArr;
        this.f13249Z = iArr;
    }

    public final int a() {
        return this.f13249Z[this.f13248Y.length - 1];
    }

    public final String b() {
        return new i(j()).b();
    }

    public final byte[] c() {
        return j();
    }

    public final byte d(int i) {
        int i8;
        byte[][] bArr = this.f13248Y;
        int[] iArr = this.f13249Z;
        d.c((long) iArr[bArr.length - 1], (long) i, 1);
        int b8 = C1219b.b(this, i);
        if (b8 == 0) {
            i8 = 0;
        } else {
            i8 = iArr[b8 - 1];
        }
        return bArr[b8][(i - i8) + iArr[bArr.length + b8]];
    }

    public final boolean e(int i, int i8, int i9, byte[] bArr) {
        int i10;
        f.e(bArr, "other");
        if (i < 0 || i > a() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i11 = i9 + i;
        int b8 = C1219b.b(this, i);
        while (i < i11) {
            int[] iArr = this.f13249Z;
            if (b8 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[b8 - 1];
            }
            byte[][] bArr2 = this.f13248Y;
            int i12 = iArr[bArr2.length + b8];
            int min = Math.min(i11, (iArr[b8] - i10) + i10) - i;
            if (!d.b(bArr2[b8], (i - i10) + i12, bArr, i8, min)) {
                return false;
            }
            i8 += min;
            i += min;
            b8++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.a() != a() || !f(iVar, a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean f(i iVar, int i) {
        int i8;
        f.e(iVar, "other");
        if (a() - i < 0) {
            return false;
        }
        int b8 = C1219b.b(this, 0);
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            int[] iArr = this.f13249Z;
            if (b8 == 0) {
                i8 = 0;
            } else {
                i8 = iArr[b8 - 1];
            }
            byte[][] bArr = this.f13248Y;
            int i11 = iArr[bArr.length + b8];
            int min = Math.min(i, (iArr[b8] - i8) + i8) - i9;
            if (!iVar.e(i10, (i9 - i8) + i11, min, bArr[b8])) {
                return false;
            }
            i10 += min;
            i9 += min;
            b8++;
        }
        return true;
    }

    public final i g() {
        return new i(j()).g();
    }

    public final int hashCode() {
        int i = this.f13219V;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f13248Y;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f13249Z;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            byte[] bArr2 = bArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f13219V = i9;
        return i9;
    }

    public final void i(f fVar, int i) {
        int i8;
        f.e(fVar, "buffer");
        int b8 = C1219b.b(this, 0);
        int i9 = 0;
        while (i9 < i) {
            int[] iArr = this.f13249Z;
            if (b8 == 0) {
                i8 = 0;
            } else {
                i8 = iArr[b8 - 1];
            }
            byte[][] bArr = this.f13248Y;
            int i10 = iArr[bArr.length + b8];
            int min = Math.min(i, (iArr[b8] - i8) + i8) - i9;
            int i11 = (i9 - i8) + i10;
            r rVar = new r(bArr[b8], i11, i11 + min, true);
            r rVar2 = fVar.f13215U;
            if (rVar2 == null) {
                rVar.f13244g = rVar;
                rVar.f13243f = rVar;
                fVar.f13215U = rVar;
            } else {
                r rVar3 = rVar2.f13244g;
                f.b(rVar3);
                rVar3.b(rVar);
            }
            i9 += min;
            b8++;
        }
        fVar.f13216V += (long) i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f13248Y;
        int length = bArr2.length;
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i < length) {
            int[] iArr = this.f13249Z;
            int i10 = iArr[length + i];
            int i11 = iArr[i];
            int i12 = i11 - i8;
            h.D(bArr2[i], i9, bArr, i10, i10 + i12);
            i9 += i12;
            i++;
            i8 = i11;
        }
        return bArr;
    }

    public final String toString() {
        return new i(j()).toString();
    }
}
