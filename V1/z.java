package V1;

import P0.r;
import P0.w;
import org.altbeacon.bluetooth.Pdu;
import p1.l;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5964a;

    /* renamed from: b  reason: collision with root package name */
    public final w f5965b;

    /* renamed from: c  reason: collision with root package name */
    public final r f5966c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5967d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5968f;

    /* renamed from: g  reason: collision with root package name */
    public long f5969g;

    /* renamed from: h  reason: collision with root package name */
    public long f5970h;
    public long i;

    public z(int i8) {
        this.f5964a = i8;
        switch (i8) {
            case 1:
                this.f5965b = new w(0);
                this.f5969g = -9223372036854775807L;
                this.f5970h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f5966c = new r();
                return;
            default:
                this.f5965b = new w(0);
                this.f5969g = -9223372036854775807L;
                this.f5970h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f5966c = new r();
                return;
        }
    }

    public static int b(int i8, byte[] bArr) {
        return (bArr[i8 + 3] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | ((bArr[i8 + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i8 + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public static long c(r rVar) {
        r rVar2 = rVar;
        int i8 = rVar2.f3733b;
        if (rVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        rVar2.g(bArr, 0, 9);
        rVar2.H(i8);
        byte b8 = bArr[0];
        if ((b8 & 196) == 68) {
            byte b9 = bArr[2];
            if ((b9 & 4) == 4) {
                byte b10 = bArr[4];
                if ((b10 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j7 = (long) b8;
                    long j8 = (long) b9;
                    return ((j8 & 3) << 13) | ((j7 & 3) << 28) | (((56 & j7) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j8 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b10) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(l lVar) {
        switch (this.f5964a) {
            case 0:
                byte[] bArr = P0.z.f3752f;
                r rVar = this.f5966c;
                rVar.getClass();
                rVar.F(bArr.length, bArr);
                this.f5967d = true;
                lVar.f14410Z = 0;
                return;
            default:
                byte[] bArr2 = P0.z.f3752f;
                r rVar2 = this.f5966c;
                rVar2.getClass();
                rVar2.F(bArr2.length, bArr2);
                this.f5967d = true;
                lVar.f14410Z = 0;
                return;
        }
    }
}
