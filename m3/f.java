package M3;

import org.altbeacon.bluetooth.Pdu;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f3139a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3140b;

    public f(int i, int i8) {
        this.f3139a = i;
        this.f3140b = i8;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i, byte[] bArr);

    public boolean c() {
        return false;
    }

    public f d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c8;
        int i = this.f3139a;
        byte[] bArr = new byte[i];
        int i8 = this.f3140b;
        StringBuilder sb = new StringBuilder((i + 1) * i8);
        for (int i9 = 0; i9 < i8; i9++) {
            bArr = b(i9, bArr);
            for (int i10 = 0; i10 < i; i10++) {
                byte b8 = bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                if (b8 < 64) {
                    c8 = '#';
                } else if (b8 < 128) {
                    c8 = '+';
                } else if (b8 < 192) {
                    c8 = '.';
                } else {
                    c8 = ' ';
                }
                sb.append(c8);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
