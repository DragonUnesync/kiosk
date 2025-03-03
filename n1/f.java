package N1;

import P0.l;
import P0.r;
import P0.z;
import org.altbeacon.bluetooth.Pdu;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3343a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f3344b;

    /* renamed from: c  reason: collision with root package name */
    public int f3345c;

    /* renamed from: d  reason: collision with root package name */
    public int f3346d;
    public int e;

    public f() {
        this.f3343a = 1;
        this.f3344b = z.f3752f;
    }

    public void a() {
        boolean z;
        int i;
        boolean z6;
        int i8;
        switch (this.f3343a) {
            case 1:
                int i9 = this.f3345c;
                if (i9 < 0 || (i9 >= (i = this.e) && !(i9 == i && this.f3346d == 0))) {
                    z = false;
                } else {
                    z = true;
                }
                l.j(z);
                return;
            default:
                int i10 = this.f3346d;
                if (i10 < 0 || (i10 >= (i8 = this.f3345c) && !(i10 == i8 && this.e == 0))) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                l.j(z6);
                return;
        }
    }

    public int b() {
        return ((this.e - this.f3345c) * 8) - this.f3346d;
    }

    public void c() {
        switch (this.f3343a) {
            case 1:
                if (this.f3346d != 0) {
                    this.f3346d = 0;
                    this.f3345c++;
                    a();
                    return;
                }
                return;
            default:
                int i = this.e;
                if (i > 0) {
                    u(8 - i);
                    return;
                }
                return;
        }
    }

    public boolean d(int i) {
        int i8 = this.f3346d;
        int i9 = i / 8;
        int i10 = i8 + i9;
        int i11 = (this.e + i) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f3345c) {
                int i12 = this.f3345c;
            } else if (s(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i122 = this.f3345c;
        if (i10 < i122) {
            return true;
        }
        if (i10 == i122 && i11 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z;
        int i = this.f3346d;
        int i8 = this.e;
        int i9 = 0;
        while (this.f3346d < this.f3345c && !h()) {
            i9++;
        }
        if (this.f3346d == this.f3345c) {
            z = true;
        } else {
            z = false;
        }
        this.f3346d = i;
        this.e = i8;
        if (z || !d((i9 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z;
        if (this.f3346d == 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        return this.f3345c;
    }

    public int g() {
        return (this.f3345c * 8) + this.f3346d;
    }

    public boolean h() {
        boolean z;
        boolean z6;
        boolean z8;
        switch (this.f3343a) {
            case 1:
                if ((this.f3344b[this.f3345c] & (128 >> this.f3346d)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                t();
                return z;
            case 2:
                if ((this.f3344b[this.f3346d] & (128 >> this.e)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                t();
                return z6;
            default:
                if ((((this.f3344b[this.f3346d] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> this.e) & 1) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                u(1);
                return z8;
        }
    }

    public int i(int i) {
        switch (this.f3343a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f3346d += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.f3346d;
                    if (i9 > 8) {
                        int i10 = i9 - 8;
                        this.f3346d = i10;
                        byte[] bArr = this.f3344b;
                        int i11 = this.f3345c;
                        this.f3345c = i11 + 1;
                        i8 |= (bArr[i11] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << i10;
                    } else {
                        byte[] bArr2 = this.f3344b;
                        int i12 = this.f3345c;
                        int i13 = (-1 >>> (32 - i)) & (i8 | ((bArr2[i12] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> (8 - i9)));
                        if (i9 == 8) {
                            this.f3346d = 0;
                            this.f3345c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                }
            case 2:
                this.e += i;
                int i14 = 0;
                while (true) {
                    int i15 = this.e;
                    int i16 = 2;
                    if (i15 > 8) {
                        int i17 = i15 - 8;
                        this.e = i17;
                        byte[] bArr3 = this.f3344b;
                        int i18 = this.f3346d;
                        i14 |= (bArr3[i18] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << i17;
                        if (!s(i18 + 1)) {
                            i16 = 1;
                        }
                        this.f3346d = i18 + i16;
                    } else {
                        byte[] bArr4 = this.f3344b;
                        int i19 = this.f3346d;
                        int i20 = (-1 >>> (32 - i)) & (i14 | ((bArr4[i19] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> (8 - i15)));
                        if (i15 == 8) {
                            this.e = 0;
                            if (!s(i19 + 1)) {
                                i16 = 1;
                            }
                            this.f3346d = i19 + i16;
                        }
                        a();
                        return i20;
                    }
                }
            default:
                int i21 = this.f3346d;
                int min = Math.min(i, 8 - this.e);
                int i22 = i21 + 1;
                byte[] bArr5 = this.f3344b;
                int i23 = ((bArr5[i21] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> this.e) & (255 >> (8 - min));
                while (min < i) {
                    i23 |= (bArr5[i22] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << min;
                    min += 8;
                    i22++;
                }
                int i24 = i23 & (-1 >>> (32 - i));
                u(i);
                return i24;
        }
    }

    public void j(int i, byte[] bArr) {
        int i8 = i >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArr2 = this.f3344b;
            int i10 = this.f3345c;
            int i11 = i10 + 1;
            this.f3345c = i11;
            byte b8 = bArr2[i10];
            int i12 = this.f3346d;
            byte b9 = (byte) (b8 << i12);
            bArr[i9] = b9;
            bArr[i9] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b9);
        }
        int i13 = i & 7;
        if (i13 != 0) {
            byte b10 = (byte) (bArr[i8] & (255 >> i13));
            bArr[i8] = b10;
            int i14 = this.f3346d;
            if (i14 + i13 > 8) {
                byte[] bArr3 = this.f3344b;
                int i15 = this.f3345c;
                this.f3345c = i15 + 1;
                bArr[i8] = (byte) (b10 | ((bArr3[i15] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << i14));
                this.f3346d = i14 - 8;
            }
            int i16 = this.f3346d + i13;
            this.f3346d = i16;
            byte[] bArr4 = this.f3344b;
            int i17 = this.f3345c;
            bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
            if (i16 == 8) {
                this.f3346d = 0;
                this.f3345c = i17 + 1;
            }
            a();
        }
    }

    public long k(int i) {
        if (i <= 32) {
            int i8 = i(i);
            int i9 = z.f3748a;
            return 4294967295L & ((long) i8);
        }
        int i10 = i(i - 32);
        int i11 = i(32);
        int i12 = z.f3748a;
        return (4294967295L & ((long) i11)) | ((((long) i10) & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        boolean z;
        if (this.f3346d == 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        System.arraycopy(this.f3344b, this.f3345c, bArr, 0, i);
        this.f3345c += i;
        a();
    }

    public int m() {
        int i = 0;
        int i8 = 0;
        while (!h()) {
            i8++;
        }
        int i9 = (1 << i8) - 1;
        if (i8 > 0) {
            i = i(i8);
        }
        return i9 + i;
    }

    public int n() {
        int i;
        int m8 = m();
        if (m8 % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((m8 + 1) / 2) * i;
    }

    public int o() {
        return m();
    }

    public void p(int i, byte[] bArr) {
        this.f3344b = bArr;
        this.f3345c = 0;
        this.f3346d = 0;
        this.e = i;
    }

    public void q(r rVar) {
        p(rVar.f3734c, rVar.f3732a);
        r(rVar.f3733b * 8);
    }

    public void r(int i) {
        int i8 = i / 8;
        this.f3345c = i8;
        this.f3346d = i - (i8 * 8);
        a();
    }

    public boolean s(int i) {
        if (2 <= i && i < this.f3345c) {
            byte[] bArr = this.f3344b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void t() {
        switch (this.f3343a) {
            case 1:
                int i = this.f3346d + 1;
                this.f3346d = i;
                if (i == 8) {
                    this.f3346d = 0;
                    this.f3345c++;
                }
                a();
                return;
            default:
                int i8 = 1;
                int i9 = this.e + 1;
                this.e = i9;
                if (i9 == 8) {
                    this.e = 0;
                    int i10 = this.f3346d;
                    if (s(i10 + 1)) {
                        i8 = 2;
                    }
                    this.f3346d = i10 + i8;
                }
                a();
                return;
        }
    }

    public void u(int i) {
        int i8;
        switch (this.f3343a) {
            case 1:
                int i9 = i / 8;
                int i10 = this.f3345c + i9;
                this.f3345c = i10;
                int i11 = (i - (i9 * 8)) + this.f3346d;
                this.f3346d = i11;
                if (i11 > 7) {
                    this.f3345c = i10 + 1;
                    this.f3346d = i11 - 8;
                }
                a();
                return;
            case 2:
                int i12 = this.f3346d;
                int i13 = i / 8;
                int i14 = i12 + i13;
                this.f3346d = i14;
                int i15 = (i - (i13 * 8)) + this.e;
                this.e = i15;
                if (i15 > 7) {
                    this.f3346d = i14 + 1;
                    this.e = i15 - 8;
                }
                while (true) {
                    i12++;
                    if (i12 > this.f3346d) {
                        a();
                        return;
                    } else if (s(i12)) {
                        this.f3346d++;
                        i12 += 2;
                    }
                }
            default:
                int i16 = i / 8;
                int i17 = this.f3346d + i16;
                this.f3346d = i17;
                int i18 = (i - (i16 * 8)) + this.e;
                this.e = i18;
                boolean z = true;
                if (i18 > 7) {
                    this.f3346d = i17 + 1;
                    this.e = i18 - 8;
                }
                int i19 = this.f3346d;
                if (i19 < 0 || (i19 >= (i8 = this.f3345c) && !(i19 == i8 && this.e == 0))) {
                    z = false;
                }
                l.j(z);
                return;
        }
    }

    public void v(int i) {
        boolean z;
        if (this.f3346d == 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.f3345c += i;
        a();
    }

    public f(byte[] bArr) {
        this.f3343a = 3;
        this.f3344b = bArr;
        this.f3345c = bArr.length;
    }

    public f(byte[] bArr, int i, int i8) {
        this.f3343a = 2;
        this.f3344b = bArr;
        this.f3346d = i;
        this.f3345c = i8;
        this.e = 0;
        a();
    }

    public f(int i, byte[] bArr) {
        this.f3343a = 1;
        this.f3344b = bArr;
        this.e = i;
    }

    public f(int i, int i8) {
        this.f3343a = 0;
        this.f3345c = i;
        this.f3346d = i8;
        this.f3344b = new byte[((i8 * 2) - 1)];
        this.e = 0;
    }
}
