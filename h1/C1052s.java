package h1;

import P0.l;
import P0.r;
import R0.A;
import R0.h;
import android.net.Uri;
import java.util.Map;
import org.altbeacon.bluetooth.Pdu;
import p1.F;
import p1.G;

/* renamed from: h1.s  reason: case insensitive filesystem */
public final class C1052s implements h {

    /* renamed from: U  reason: collision with root package name */
    public final h f12508U;

    /* renamed from: V  reason: collision with root package name */
    public final int f12509V;

    /* renamed from: W  reason: collision with root package name */
    public final N f12510W;

    /* renamed from: X  reason: collision with root package name */
    public final byte[] f12511X;

    /* renamed from: Y  reason: collision with root package name */
    public int f12512Y;

    public C1052s(h hVar, int i, N n4) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f12508U = hVar;
        this.f12509V = i;
        this.f12510W = n4;
        this.f12511X = new byte[1];
        this.f12512Y = i;
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    public final long f(R0.l lVar) {
        throw new UnsupportedOperationException();
    }

    public final Map j() {
        return this.f12508U.j();
    }

    public final void o(A a8) {
        a8.getClass();
        this.f12508U.o(a8);
    }

    public final Uri p() {
        return this.f12508U.p();
    }

    public final int x(byte[] bArr, int i, int i8) {
        long max;
        int i9 = this.f12512Y;
        h hVar = this.f12508U;
        if (i9 == 0) {
            byte[] bArr2 = this.f12511X;
            int i10 = 0;
            if (hVar.x(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int x8 = hVar.x(bArr3, i10, i12);
                        if (x8 != -1) {
                            i10 += x8;
                            i12 -= x8;
                        }
                    }
                    while (i11 > 0 && bArr3[i11 - 1] == 0) {
                        i11--;
                    }
                    if (i11 > 0) {
                        r rVar = new r(i11, bArr3);
                        N n4 = this.f12510W;
                        if (!n4.f12329g0) {
                            max = n4.f12326d0;
                        } else {
                            max = Math.max(n4.f12330h0.w(true), n4.f12326d0);
                        }
                        long j7 = max;
                        int a8 = rVar.a();
                        G g8 = n4.f12328f0;
                        g8.getClass();
                        g8.a(a8, rVar);
                        g8.e(j7, 1, a8, 0, (F) null);
                        n4.f12329g0 = true;
                    }
                }
                this.f12512Y = this.f12509V;
            }
            return -1;
        }
        int x9 = hVar.x(bArr, i, Math.min(this.f12512Y, i8));
        if (x9 != -1) {
            this.f12512Y -= x9;
        }
        return x9;
    }
}
