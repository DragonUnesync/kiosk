package P0;

import H3.U;
import N.e;
import Q7.g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.altbeacon.bluetooth.Pdu;

public final class r {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f3730d = {13, 10};
    public static final char[] e = {10};

    /* renamed from: f  reason: collision with root package name */
    public static final U f3731f = U.j(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a  reason: collision with root package name */
    public byte[] f3732a;

    /* renamed from: b  reason: collision with root package name */
    public int f3733b;

    /* renamed from: c  reason: collision with root package name */
    public int f3734c;

    public r() {
        this.f3732a = z.f3752f;
    }

    public final long A() {
        long p3 = p();
        if (p3 >= 0) {
            return p3;
        }
        throw new IllegalStateException(e.w("Top bit not zero: ", p3));
    }

    public final int B() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        this.f3733b = i + 2;
        return (bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public final long C() {
        int i;
        int i8;
        long j7 = (long) this.f3732a[this.f3733b];
        int i9 = 7;
        while (true) {
            i = 1;
            if (i9 < 0) {
                break;
            }
            int i10 = 1 << i9;
            if ((((long) i10) & j7) != 0) {
                i9--;
            } else if (i9 < 6) {
                j7 &= (long) (i10 - 1);
                i8 = 7 - i9;
            } else if (i9 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 != 0) {
            while (i < i8) {
                byte b8 = this.f3732a[this.f3733b + i];
                if ((b8 & 192) == 128) {
                    j7 = (j7 << 6) | ((long) (b8 & 63));
                    i++;
                } else {
                    throw new NumberFormatException(e.w("Invalid UTF-8 sequence continuation byte: ", j7));
                }
            }
            this.f3733b += i8;
            return j7;
        }
        throw new NumberFormatException(e.w("Invalid UTF-8 sequence first byte: ", j7));
    }

    public final Charset D() {
        if (a() >= 3) {
            byte[] bArr = this.f3732a;
            int i = this.f3733b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f3733b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f3732a;
        int i8 = this.f3733b;
        byte b8 = bArr2[i8];
        if (b8 == -2 && bArr2[i8 + 1] == -1) {
            this.f3733b = i8 + 2;
            return StandardCharsets.UTF_16BE;
        } else if (b8 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        } else {
            this.f3733b = i8 + 2;
            return StandardCharsets.UTF_16LE;
        }
    }

    public final void E(int i) {
        byte[] bArr = this.f3732a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        F(i, bArr);
    }

    public final void F(int i, byte[] bArr) {
        this.f3732a = bArr;
        this.f3734c = i;
        this.f3733b = 0;
    }

    public final void G(int i) {
        boolean z;
        if (i < 0 || i > this.f3732a.length) {
            z = false;
        } else {
            z = true;
        }
        l.d(z);
        this.f3734c = i;
    }

    public final void H(int i) {
        boolean z;
        if (i < 0 || i > this.f3734c) {
            z = false;
        } else {
            z = true;
        }
        l.d(z);
        this.f3733b = i;
    }

    public final void I(int i) {
        H(this.f3733b + i);
    }

    public final int a() {
        return this.f3734c - this.f3733b;
    }

    public final void b(int i) {
        byte[] bArr = this.f3732a;
        if (i > bArr.length) {
            this.f3732a = Arrays.copyOf(bArr, i);
        }
    }

    public final int c() {
        return this.f3733b;
    }

    public final char d(Charset charset) {
        boolean contains = f3731f.contains(charset);
        l.c("Unsupported charset: " + charset, contains);
        return (char) (e(charset) >> 16);
    }

    public final int e(Charset charset) {
        byte b8;
        int i;
        byte b9;
        byte b10;
        boolean z;
        boolean z6 = false;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            long j7 = (long) (this.f3732a[this.f3733b] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            char c8 = (char) ((int) j7);
            if (((long) c8) == j7) {
                z = true;
            } else {
                z = false;
            }
            g.e(z, "Out of range: %s", j7);
            b8 = (byte) c8;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f3732a;
                int i8 = this.f3733b;
                b9 = bArr[i8];
                b10 = bArr[i8 + 1];
            } else if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f3732a;
                int i9 = this.f3733b;
                b9 = bArr2[i9 + 1];
                b10 = bArr2[i9];
            }
            b8 = (byte) ((char) ((b10 & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (b9 << 8)));
        }
        long j8 = (long) b8;
        char c9 = (char) ((int) j8);
        if (((long) c9) == j8) {
            z6 = true;
        }
        g.e(z6, "Out of range: %s", j8);
        return (c9 << 16) + i;
    }

    public final int f() {
        return this.f3732a[this.f3733b] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
    }

    public final void g(byte[] bArr, int i, int i8) {
        System.arraycopy(this.f3732a, this.f3733b, bArr, i, i8);
        this.f3733b += i8;
    }

    public final char h(Charset charset, char[] cArr) {
        int e8 = e(charset);
        if (e8 != 0) {
            char c8 = (char) (e8 >> 16);
            for (char c9 : cArr) {
                if (c9 == c8) {
                    this.f3733b += e8 & 65535;
                    return c8;
                }
            }
        }
        return 0;
    }

    public final int i() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        int i9 = i + 2;
        this.f3733b = i9;
        byte b8 = ((bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24);
        int i10 = i + 3;
        this.f3733b = i10;
        this.f3733b = i + 4;
        return (bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | b8 | ((bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public final String j(Charset charset) {
        int i;
        boolean contains = f3731f.contains(charset);
        l.c("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            D();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16LE) || charset.equals(StandardCharsets.UTF_16BE)) {
            i = 2;
        } else {
            throw new IllegalArgumentException("Unsupported charset: " + charset);
        }
        int i8 = this.f3733b;
        while (true) {
            int i9 = this.f3734c;
            if (i8 >= i9 - (i - 1)) {
                i8 = i9;
                break;
            } else if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && z.M(this.f3732a[i8])) {
                break;
            } else {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f3732a;
                    if (bArr[i8] == 0 && z.M(bArr[i8 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f3732a;
                    if (bArr2[i8 + 1] == 0 && z.M(bArr2[i8])) {
                        break;
                    }
                }
                i8 += i;
            }
        }
        String t8 = t(i8 - this.f3733b, charset);
        if (this.f3733b != this.f3734c && h(charset, f3730d) == 13) {
            h(charset, e);
        }
        return t8;
    }

    public final int k() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        byte b8 = bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        int i9 = i + 2;
        this.f3733b = i9;
        byte b9 = ((bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | b8;
        int i10 = i + 3;
        this.f3733b = i10;
        this.f3733b = i + 4;
        return ((bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | b9 | ((bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
    }

    public final long l() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        int i9 = i + 2;
        this.f3733b = i9;
        long j7 = (((long) bArr[i]) & 255) | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i + 3;
        this.f3733b = i10;
        int i11 = i + 4;
        this.f3733b = i11;
        long j8 = j7 | ((((long) bArr[i9]) & 255) << 16) | ((((long) bArr[i10]) & 255) << 24);
        int i12 = i + 5;
        this.f3733b = i12;
        int i13 = i + 6;
        this.f3733b = i13;
        long j9 = j8 | ((((long) bArr[i11]) & 255) << 32) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i + 7;
        this.f3733b = i14;
        this.f3733b = i + 8;
        return ((((long) bArr[i14]) & 255) << 56) | j9 | ((((long) bArr[i13]) & 255) << 48);
    }

    public final long m() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        int i9 = i + 2;
        this.f3733b = i9;
        int i10 = i + 3;
        this.f3733b = i10;
        this.f3733b = i + 4;
        return ((((long) bArr[i10]) & 255) << 24) | (((long) bArr[i]) & 255) | ((((long) bArr[i8]) & 255) << 8) | ((((long) bArr[i9]) & 255) << 16);
    }

    public final int n() {
        int k8 = k();
        if (k8 >= 0) {
            return k8;
        }
        throw new IllegalStateException(Q0.g.m(k8, "Top bit not zero: "));
    }

    public final int o() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        byte b8 = bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        this.f3733b = i + 2;
        return ((bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | b8;
    }

    public final long p() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        int i9 = i + 2;
        this.f3733b = i9;
        int i10 = i + 3;
        this.f3733b = i10;
        long j7 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i8]) & 255) << 48) | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i + 4;
        this.f3733b = i11;
        int i12 = i + 5;
        this.f3733b = i12;
        long j8 = j7 | ((((long) bArr[i10]) & 255) << 32) | ((((long) bArr[i11]) & 255) << 24);
        int i13 = i + 6;
        this.f3733b = i13;
        int i14 = i + 7;
        this.f3733b = i14;
        this.f3733b = i + 8;
        return (((long) bArr[i14]) & 255) | j8 | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 8);
    }

    public final String q() {
        if (a() == 0) {
            return null;
        }
        int i = this.f3733b;
        while (i < this.f3734c && this.f3732a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f3732a;
        int i8 = this.f3733b;
        int i9 = z.f3748a;
        String str = new String(bArr, i8, i - i8, StandardCharsets.UTF_8);
        this.f3733b = i;
        if (i < this.f3734c) {
            this.f3733b = i + 1;
        }
        return str;
    }

    public final String r(int i) {
        int i8;
        if (i == 0) {
            return "";
        }
        int i9 = this.f3733b;
        int i10 = (i9 + i) - 1;
        if (i10 >= this.f3734c || this.f3732a[i10] != 0) {
            i8 = i;
        } else {
            i8 = i - 1;
        }
        byte[] bArr = this.f3732a;
        int i11 = z.f3748a;
        String str = new String(bArr, i9, i8, StandardCharsets.UTF_8);
        this.f3733b += i;
        return str;
    }

    public final short s() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        this.f3733b = i + 2;
        return (short) ((bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8));
    }

    public final String t(int i, Charset charset) {
        String str = new String(this.f3732a, this.f3733b, i, charset);
        this.f3733b += i;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        this.f3733b = i + 1;
        return bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
    }

    public final int w() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        this.f3733b = i + 2;
        byte b8 = (bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
        this.f3733b = i + 4;
        return b8;
    }

    public final long x() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        int i9 = i + 2;
        this.f3733b = i9;
        int i10 = i + 3;
        this.f3733b = i10;
        this.f3733b = i + 4;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i8]) & 255) << 16) | ((((long) bArr[i9]) & 255) << 8);
    }

    public final int y() {
        byte[] bArr = this.f3732a;
        int i = this.f3733b;
        int i8 = i + 1;
        this.f3733b = i8;
        int i9 = i + 2;
        this.f3733b = i9;
        int i10 = (bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8;
        this.f3733b = i + 3;
        return (bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | i10 | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
    }

    public final int z() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(Q0.g.m(i, "Top bit not zero: "));
    }

    public r(int i) {
        this.f3732a = new byte[i];
        this.f3734c = i;
    }

    public r(byte[] bArr) {
        this.f3732a = bArr;
        this.f3734c = bArr.length;
    }

    public r(int i, byte[] bArr) {
        this.f3732a = bArr;
        this.f3734c = i;
    }
}
