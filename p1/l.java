package p1;

import M0.C0122j;
import M0.D;
import P0.z;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class l implements p {

    /* renamed from: U  reason: collision with root package name */
    public final byte[] f14405U = new byte[4096];

    /* renamed from: V  reason: collision with root package name */
    public final C0122j f14406V;

    /* renamed from: W  reason: collision with root package name */
    public final long f14407W;

    /* renamed from: X  reason: collision with root package name */
    public long f14408X;

    /* renamed from: Y  reason: collision with root package name */
    public byte[] f14409Y = new byte[65536];

    /* renamed from: Z  reason: collision with root package name */
    public int f14410Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f14411a0;

    static {
        D.a("media3.extractor");
    }

    public l(C0122j jVar, long j7, long j8) {
        this.f14406V = jVar;
        this.f14408X = j7;
        this.f14407W = j8;
    }

    public final boolean b(int i, boolean z) {
        e(i);
        int i8 = this.f14411a0 - this.f14410Z;
        while (i8 < i) {
            i8 = h(this.f14410Z, this.f14409Y, i, i8, z);
            if (i8 == -1) {
                return false;
            }
            this.f14411a0 = this.f14410Z + i8;
        }
        this.f14410Z += i;
        return true;
    }

    public final boolean c(byte[] bArr, int i, int i8, boolean z) {
        int i9;
        int i10 = this.f14411a0;
        if (i10 == 0) {
            i9 = 0;
        } else {
            i9 = Math.min(i10, i8);
            System.arraycopy(this.f14409Y, 0, bArr, i, i9);
            q(i9);
        }
        int i11 = i9;
        while (i11 < i8 && i11 != -1) {
            i11 = h(i, bArr, i8, i11, z);
        }
        if (i11 != -1) {
            this.f14408X += (long) i11;
        }
        if (i11 != -1) {
            return true;
        }
        return false;
    }

    public final void e(int i) {
        int i8 = this.f14410Z + i;
        byte[] bArr = this.f14409Y;
        if (i8 > bArr.length) {
            this.f14409Y = Arrays.copyOf(this.f14409Y, z.i(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    public final int g(byte[] bArr, int i, int i8) {
        int i9;
        e(i8);
        int i10 = this.f14411a0;
        int i11 = this.f14410Z;
        int i12 = i10 - i11;
        if (i12 == 0) {
            i9 = h(i11, this.f14409Y, i8, 0, true);
            if (i9 == -1) {
                return -1;
            }
            this.f14411a0 += i9;
        } else {
            i9 = Math.min(i8, i12);
        }
        System.arraycopy(this.f14409Y, this.f14410Z, bArr, i, i9);
        this.f14410Z += i9;
        return i9;
    }

    public final int h(int i, byte[] bArr, int i8, int i9, boolean z) {
        if (!Thread.interrupted()) {
            int x8 = this.f14406V.x(bArr, i + i9, i8 - i9);
            if (x8 != -1) {
                return i9 + x8;
            }
            if (i9 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final long i() {
        return this.f14407W;
    }

    public final void k() {
        this.f14410Z = 0;
    }

    public final int l(int i) {
        int min = Math.min(this.f14411a0, i);
        q(min);
        if (min == 0) {
            byte[] bArr = this.f14405U;
            min = h(0, bArr, Math.min(i, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f14408X += (long) min;
        }
        return min;
    }

    public final void m(int i) {
        int min = Math.min(this.f14411a0, i);
        q(min);
        int i8 = min;
        while (i8 < i && i8 != -1) {
            byte[] bArr = this.f14405U;
            i8 = h(-i8, bArr, Math.min(i, bArr.length + i8), i8, false);
        }
        if (i8 != -1) {
            this.f14408X += (long) i8;
        }
    }

    public final void q(int i) {
        byte[] bArr;
        int i8 = this.f14411a0 - i;
        this.f14411a0 = i8;
        this.f14410Z = 0;
        byte[] bArr2 = this.f14409Y;
        if (i8 < bArr2.length - 524288) {
            bArr = new byte[(65536 + i8)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i8);
        this.f14409Y = bArr;
    }

    public final boolean r(byte[] bArr, int i, int i8, boolean z) {
        if (!b(i8, z)) {
            return false;
        }
        System.arraycopy(this.f14409Y, this.f14410Z - i8, bArr, i, i8);
        return true;
    }

    public final void readFully(byte[] bArr, int i, int i8) {
        c(bArr, i, i8, false);
    }

    public final long s() {
        return this.f14408X + ((long) this.f14410Z);
    }

    public final void v(byte[] bArr, int i, int i8) {
        r(bArr, i, i8, false);
    }

    public final void w(int i) {
        b(i, false);
    }

    public final int x(byte[] bArr, int i, int i8) {
        int i9 = this.f14411a0;
        int i10 = 0;
        if (i9 != 0) {
            int min = Math.min(i9, i8);
            System.arraycopy(this.f14409Y, 0, bArr, i, min);
            q(min);
            i10 = min;
        }
        if (i10 == 0) {
            i10 = h(i, bArr, i8, 0, true);
        }
        if (i10 != -1) {
            this.f14408X += (long) i10;
        }
        return i10;
    }

    public final long y() {
        return this.f14408X;
    }
}
