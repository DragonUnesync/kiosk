package K1;

import A1.d;
import H3.O;
import M0.C0129q;
import M0.H;
import M0.I;
import P0.l;
import P0.r;
import java.util.ArrayList;
import java.util.Arrays;
import org.altbeacon.bluetooth.Pdu;
import p1.C1332b;

public final class h extends j {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f2565o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f2566p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    public boolean f2567n;

    public static boolean e(r rVar, byte[] bArr) {
        if (rVar.a() < bArr.length) {
            return false;
        }
        int i = rVar.f3733b;
        byte[] bArr2 = new byte[bArr.length];
        rVar.g(bArr2, 0, bArr.length);
        rVar.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long b(r rVar) {
        byte[] bArr = rVar.f3732a;
        byte b8 = 0;
        byte b9 = bArr[0];
        if (bArr.length > 1) {
            b8 = bArr[1];
        }
        return (((long) this.i) * C1332b.k(b9, b8)) / 1000000;
    }

    public final boolean c(r rVar, long j7, d dVar) {
        if (e(rVar, f2565o)) {
            byte[] copyOf = Arrays.copyOf(rVar.f3732a, rVar.f3734c);
            byte b8 = copyOf[9] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            ArrayList b9 = C1332b.b(copyOf);
            if (((M0.r) dVar.f35V) != null) {
                return true;
            }
            C0129q qVar = new C0129q();
            qVar.f2999m = I.o("audio/opus");
            qVar.f2979B = b8;
            qVar.f2980C = 48000;
            qVar.f3002p = b9;
            dVar.f35V = new M0.r(qVar);
            return true;
        } else if (e(rVar, f2566p)) {
            l.k((M0.r) dVar.f35V);
            if (this.f2567n) {
                return true;
            }
            this.f2567n = true;
            rVar.I(8);
            H t8 = C1332b.t(O.n((String[]) C1332b.w(rVar, false, false).f13026V));
            if (t8 == null) {
                return true;
            }
            C0129q a8 = ((M0.r) dVar.f35V).a();
            a8.f2997k = t8.v(((M0.r) dVar.f35V).f3034l);
            dVar.f35V = new M0.r(a8);
            return true;
        } else {
            l.k((M0.r) dVar.f35V);
            return false;
        }
    }

    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.f2567n = false;
        }
    }
}
