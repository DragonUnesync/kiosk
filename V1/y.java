package V1;

import M0.C0132u;
import org.altbeacon.bluetooth.Pdu;
import p1.C1335e;
import p1.C1336f;
import p1.C1337g;
import p1.C1338h;
import p1.i;
import p1.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final C1335e f5960a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5961b;

    /* renamed from: c  reason: collision with root package name */
    public C1336f f5962c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5963d;

    public y(C1337g gVar, i iVar, long j7, long j8, long j9, long j10, long j11, int i) {
        this.f5961b = iVar;
        this.f5963d = i;
        this.f5960a = new C1335e(gVar, j7, j8, j9, j10, j11);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public static int c(l lVar, long j7, C0132u uVar) {
        if (j7 == lVar.f14408X) {
            return 0;
        }
        uVar.f3050a = j7;
        return 1;
    }

    public final int b(l lVar, C0132u uVar) {
        long j7;
        l lVar2 = lVar;
        C0132u uVar2 = uVar;
        while (true) {
            C1336f fVar = this.f5962c;
            P0.l.k(fVar);
            long j8 = fVar.f14387f;
            long j9 = fVar.f14388g;
            j7 = fVar.f14389h;
            i iVar = this.f5961b;
            if (j9 - j8 <= ((long) this.f5963d)) {
                this.f5962c = null;
                iVar.C();
                return c(lVar2, j8, uVar2);
            }
            long j10 = j7 - lVar2.f14408X;
            if (j10 >= 0 && j10 <= 262144) {
                lVar2.m((int) j10);
                lVar2.f14410Z = 0;
                C1338h w2 = iVar.w(lVar2, fVar.f14384b);
                int i = w2.f14391a;
                if (i != -3) {
                    long j11 = w2.f14392b;
                    i iVar2 = iVar;
                    long j12 = w2.f14393c;
                    if (i == -2) {
                        fVar.f14386d = j11;
                        fVar.f14387f = j12;
                        fVar.f14389h = C1336f.a(fVar.f14384b, j11, fVar.e, j12, fVar.f14388g, fVar.f14385c);
                    } else if (i == -1) {
                        fVar.e = j11;
                        fVar.f14388g = j12;
                        fVar.f14389h = C1336f.a(fVar.f14384b, fVar.f14386d, j11, fVar.f14387f, j12, fVar.f14385c);
                    } else if (i == 0) {
                        long j13 = j12 - lVar2.f14408X;
                        if (j13 >= 0 && j13 <= 262144) {
                            lVar2.m((int) j13);
                        }
                        this.f5962c = null;
                        iVar2.C();
                        return c(lVar2, j12, uVar2);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.f5962c = null;
                    iVar.C();
                    return c(lVar2, j7, uVar2);
                }
            }
        }
        return c(lVar2, j7, uVar2);
    }

    public final void d(long j7) {
        long j8 = j7;
        C1336f fVar = this.f5962c;
        if (fVar == null || fVar.f14383a != j8) {
            C1335e eVar = this.f5960a;
            long j9 = j7;
            this.f5962c = new C1336f(j9, eVar.f14378a.f(j8), eVar.f14380c, eVar.f14381d, eVar.e, eVar.f14382f);
        }
    }
}
