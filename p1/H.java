package p1;

import P0.l;
import org.altbeacon.bluetooth.Pdu;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14331a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f14332b;

    /* renamed from: c  reason: collision with root package name */
    public int f14333c;

    /* renamed from: d  reason: collision with root package name */
    public long f14334d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f14335f;

    /* renamed from: g  reason: collision with root package name */
    public int f14336g;

    public final void a(G g8, F f8) {
        if (this.f14333c > 0) {
            g8.e(this.f14334d, this.e, this.f14335f, this.f14336g, f8);
            this.f14333c = 0;
        }
    }

    public final void b(G g8, long j7, int i, int i8, int i9, F f8) {
        boolean z;
        if (this.f14336g <= i8 + i9) {
            z = true;
        } else {
            z = false;
        }
        l.i("TrueHD chunk samples must be contiguous in the sample queue.", z);
        if (this.f14332b) {
            int i10 = this.f14333c;
            int i11 = i10 + 1;
            this.f14333c = i11;
            if (i10 == 0) {
                this.f14334d = j7;
                this.e = i;
                this.f14335f = 0;
            }
            this.f14335f += i8;
            this.f14336g = i9;
            if (i11 >= 16) {
                a(g8, f8);
            }
        }
    }

    public final void c(p pVar) {
        char c8;
        if (!this.f14332b) {
            byte[] bArr = this.f14331a;
            int i = 0;
            pVar.v(bArr, 0, 10);
            pVar.k();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b8 = bArr[7];
                if ((b8 & 254) == 186) {
                    if ((b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE) == 187) {
                        c8 = 9;
                    } else {
                        c8 = 8;
                    }
                    i = 40 << ((bArr[c8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.f14332b = true;
            }
        }
    }
}
