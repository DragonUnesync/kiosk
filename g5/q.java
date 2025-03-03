package G5;

import org.altbeacon.bluetooth.Pdu;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1720a;

    /* renamed from: b  reason: collision with root package name */
    public int f1721b;

    /* renamed from: c  reason: collision with root package name */
    public int f1722c;

    public /* synthetic */ q(byte[] bArr, int i, int i8) {
        this.f1720a = bArr;
        this.f1721b = i;
        this.f1722c = i8;
    }

    public int a() {
        return ((this.f1720a.length - this.f1721b) * 8) - this.f1722c;
    }

    public int b(int i) {
        if (i <= 0 || i > 32 || i > a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i8 = this.f1722c;
        byte b8 = 0;
        byte[] bArr = this.f1720a;
        if (i8 > 0) {
            int i9 = 8 - i8;
            int min = Math.min(i, i9);
            int i10 = i9 - min;
            int i11 = this.f1721b;
            int i12 = (((255 >> (8 - min)) << i10) & bArr[i11]) >> i10;
            i -= min;
            int i13 = this.f1722c + min;
            this.f1722c = i13;
            if (i13 == 8) {
                this.f1722c = 0;
                this.f1721b = i11 + 1;
            }
            b8 = i12;
        }
        if (i <= 0) {
            return b8;
        }
        while (i >= 8) {
            int i14 = b8 << 8;
            int i15 = this.f1721b;
            this.f1721b = i15 + 1;
            i -= 8;
            b8 = i14 | (bArr[i15] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
        }
        if (i <= 0) {
            return b8;
        }
        int i16 = 8 - i;
        int i17 = (b8 << i) | ((bArr[this.f1721b] & ((255 >> i16) << i16)) >> i16);
        this.f1722c += i;
        return i17;
    }

    public q(byte[] bArr) {
        this.f1720a = bArr;
    }
}
