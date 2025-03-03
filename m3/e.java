package M3;

import org.altbeacon.bluetooth.Pdu;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final f f3138c;

    public e(f fVar) {
        super(fVar.f3139a, fVar.f3140b);
        this.f3138c = fVar;
    }

    public final byte[] a() {
        byte[] a8 = this.f3138c.a();
        int i = this.f3139a * this.f3140b;
        byte[] bArr = new byte[i];
        for (int i8 = 0; i8 < i; i8++) {
            bArr[i8] = (byte) (255 - (a8[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE));
        }
        return bArr;
    }

    public final byte[] b(int i, byte[] bArr) {
        byte[] b8 = this.f3138c.b(i, bArr);
        for (int i8 = 0; i8 < this.f3139a; i8++) {
            b8[i8] = (byte) (255 - (b8[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE));
        }
        return b8;
    }

    public final boolean c() {
        return this.f3138c.c();
    }

    public final f d() {
        return new e(this.f3138c.d());
    }
}
