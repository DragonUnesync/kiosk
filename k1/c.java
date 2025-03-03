package K1;

import A1.d;
import J1.b;
import M0.H;
import P0.r;
import de.ozerov.fully.K2;
import java.util.Arrays;
import org.altbeacon.bluetooth.Pdu;
import p1.C1332b;
import p1.t;

public final class c extends j {

    /* renamed from: n  reason: collision with root package name */
    public t f2550n;

    /* renamed from: o  reason: collision with root package name */
    public b f2551o;

    public final long b(r rVar) {
        byte[] bArr = rVar.f3732a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 4;
        if (i == 6 || i == 7) {
            rVar.I(4);
            rVar.C();
        }
        int u3 = C1332b.u(i, rVar);
        rVar.H(0);
        return (long) u3;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [J1.b, java.lang.Object] */
    public final boolean c(r rVar, long j7, d dVar) {
        r rVar2 = rVar;
        d dVar2 = dVar;
        byte[] bArr = rVar2.f3732a;
        t tVar = this.f2550n;
        if (tVar == null) {
            t tVar2 = new t(17, bArr);
            this.f2550n = tVar2;
            dVar2.f35V = tVar2.c(Arrays.copyOfRange(bArr, 9, rVar2.f3734c), (H) null);
            return true;
        }
        byte b8 = bArr[0];
        if ((b8 & Byte.MAX_VALUE) == 3) {
            K2 v4 = C1332b.v(rVar);
            t tVar3 = new t(tVar.f14423a, tVar.f14424b, tVar.f14425c, tVar.f14426d, tVar.e, tVar.f14428g, tVar.f14429h, tVar.f14430j, v4, tVar.f14432l);
            this.f2550n = tVar3;
            ? obj = new Object();
            obj.f2349W = tVar3;
            obj.f2350X = v4;
            obj.f2347U = -1;
            obj.f2348V = -1;
            this.f2551o = obj;
            return true;
        } else if (b8 != -1) {
            return true;
        } else {
            b bVar = this.f2551o;
            if (bVar != null) {
                bVar.f2347U = j7;
                dVar2.f36W = bVar;
            }
            ((M0.r) dVar2.f35V).getClass();
            return false;
        }
    }

    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.f2550n = null;
            this.f2551o = null;
        }
    }
}
