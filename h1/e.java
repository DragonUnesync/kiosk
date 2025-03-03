package H1;

import org.altbeacon.bluetooth.Pdu;
import p1.l;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f1929d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1930a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f1931b;

    /* renamed from: c  reason: collision with root package name */
    public int f1932c;

    public static long a(int i, boolean z, byte[] bArr) {
        long j7 = ((long) bArr[0]) & 255;
        if (z) {
            j7 &= ~f1929d[i - 1];
        }
        for (int i8 = 1; i8 < i; i8++) {
            j7 = (j7 << 8) | (((long) bArr[i8]) & 255);
        }
        return j7;
    }

    public static int b(int i) {
        for (int i8 = 0; i8 < 8; i8++) {
            if ((f1929d[i8] & ((long) i)) != 0) {
                return i8 + 1;
            }
        }
        return -1;
    }

    public final long c(l lVar, boolean z, boolean z6, int i) {
        int i8 = this.f1931b;
        byte[] bArr = this.f1930a;
        if (i8 == 0) {
            if (!lVar.c(bArr, 0, 1, z)) {
                return -1;
            }
            int b8 = b(bArr[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            this.f1932c = b8;
            if (b8 != -1) {
                this.f1931b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i9 = this.f1932c;
        if (i9 > i) {
            this.f1931b = 0;
            return -2;
        }
        if (i9 != 1) {
            lVar.c(bArr, 1, i9 - 1, false);
        }
        this.f1931b = 0;
        return a(this.f1932c, z6, bArr);
    }
}
