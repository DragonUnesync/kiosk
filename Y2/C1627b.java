package y2;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: y2.b  reason: case insensitive filesystem */
public final class C1627b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16366a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f16367b;

    /* renamed from: c  reason: collision with root package name */
    public int f16368c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f16369d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16370f;

    public C1627b() {
        this(new byte[1000], true);
    }

    public static void g() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    public final void a(int i) {
        int i8 = i - 1;
        if (i < 0 || (i & i8) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i9 = (this.f16368c + i8) & (~i8);
        if (this.f16366a) {
            f(i9);
        } else if (i9 > this.f16367b.length) {
            g();
            throw null;
        }
        Arrays.fill(this.f16367b, this.f16368c, i9, (byte) 0);
        this.f16368c = i9;
    }

    public final void b(int i, String str) {
        int i8;
        if (this.f16369d != null) {
            e();
            int size = this.f16369d.size();
            if (size == 0) {
                i8 = 0;
            } else {
                i8 = ((C1626a) this.f16369d.get(size - 1)).f16365a;
            }
            int i9 = this.f16368c;
            if (i8 <= i9) {
                i8 = i9;
            }
            this.f16369d.add(new C1626a(i8, i + i8, str));
        }
    }

    public final void c(String str) {
        if (this.f16369d != null) {
            e();
            this.f16369d.add(new C1626a(this.f16368c, Integer.MAX_VALUE, str));
        }
    }

    public final boolean d() {
        if (this.f16369d != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        int size;
        ArrayList arrayList = this.f16369d;
        if (arrayList != null && (size = arrayList.size()) != 0) {
            C1626a aVar = (C1626a) this.f16369d.get(size - 1);
            int i = this.f16368c;
            if (aVar.f16365a == Integer.MAX_VALUE) {
                aVar.f16365a = i;
            }
        }
    }

    public final void f(int i) {
        byte[] bArr = this.f16367b;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[((i * 2) + 1000)];
            System.arraycopy(bArr, 0, bArr2, 0, this.f16368c);
            this.f16367b = bArr2;
        }
    }

    public final void h(byte[] bArr) {
        int length = bArr.length;
        int i = this.f16368c;
        int i8 = i + length;
        if ((length | i8) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i8);
        }
        if (this.f16366a) {
            f(i8);
        } else if (i8 > this.f16367b.length) {
            g();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f16367b, i, length);
        this.f16368c = i8;
    }

    public final void i(int i) {
        int i8 = this.f16368c;
        int i9 = i8 + 1;
        if (this.f16366a) {
            f(i9);
        } else if (i9 > this.f16367b.length) {
            g();
            throw null;
        }
        this.f16367b[i8] = (byte) i;
        this.f16368c = i9;
    }

    public final void j(int i) {
        int i8 = this.f16368c;
        int i9 = i8 + 4;
        if (this.f16366a) {
            f(i9);
        } else if (i9 > this.f16367b.length) {
            g();
            throw null;
        }
        byte[] bArr = this.f16367b;
        bArr[i8] = (byte) i;
        bArr[i8 + 1] = (byte) (i >> 8);
        bArr[i8 + 2] = (byte) (i >> 16);
        bArr[i8 + 3] = (byte) (i >> 24);
        this.f16368c = i9;
    }

    public final void k(int i) {
        int i8 = this.f16368c;
        int i9 = i8 + 2;
        if (this.f16366a) {
            f(i9);
        } else if (i9 > this.f16367b.length) {
            g();
            throw null;
        }
        byte[] bArr = this.f16367b;
        bArr[i8] = (byte) i;
        bArr[i8 + 1] = (byte) (i >> 8);
        this.f16368c = i9;
    }

    public final void l(int i) {
        int i8;
        int i9;
        if (this.f16366a) {
            f(this.f16368c + 5);
        }
        int i10 = i >> 7;
        if ((Integer.MIN_VALUE & i) == 0) {
            i8 = 0;
        } else {
            i8 = -1;
        }
        boolean z = true;
        while (true) {
            int i11 = i10;
            int i12 = i;
            i = i11;
            if (z) {
                if (i == i8 && (i & 1) == ((i12 >> 6) & 1)) {
                    z = false;
                } else {
                    z = true;
                }
                int i13 = i12 & 127;
                if (z) {
                    i9 = 128;
                } else {
                    i9 = 0;
                }
                i((byte) (i13 | i9));
                i10 = i >> 7;
            } else {
                return;
            }
        }
    }

    public final int m(int i) {
        if (this.f16366a) {
            f(this.f16368c + 5);
        }
        int i8 = this.f16368c;
        while (true) {
            int i9 = i;
            i >>>= 7;
            if (i != 0) {
                i((byte) ((i9 & 127) | 128));
            } else {
                i((byte) (i9 & 127));
                return this.f16368c - i8;
            }
        }
    }

    public final void n(int i) {
        if (i >= 0) {
            int i8 = this.f16368c + i;
            if (this.f16366a) {
                f(i8);
            } else if (i8 > this.f16367b.length) {
                g();
                throw null;
            }
            Arrays.fill(this.f16367b, this.f16368c, i8, (byte) 0);
            this.f16368c = i8;
            return;
        }
        throw new IllegalArgumentException("count < 0");
    }

    public C1627b(byte[] bArr, boolean z) {
        this.f16366a = z;
        this.f16367b = bArr;
        this.f16368c = 0;
        this.f16369d = null;
        this.e = 0;
        this.f16370f = 0;
    }
}
