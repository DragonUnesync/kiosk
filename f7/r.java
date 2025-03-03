package f7;

import P6.f;
import Z6.b;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import l7.i;
import l7.q;
import l7.w;
import l7.y;
import org.altbeacon.bluetooth.Pdu;

public final class r implements w {

    /* renamed from: U  reason: collision with root package name */
    public final q f11769U;

    /* renamed from: V  reason: collision with root package name */
    public int f11770V;

    /* renamed from: W  reason: collision with root package name */
    public int f11771W;

    /* renamed from: X  reason: collision with root package name */
    public int f11772X;

    /* renamed from: Y  reason: collision with root package name */
    public int f11773Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11774Z;

    public r(q qVar) {
        f.e(qVar, "source");
        this.f11769U = qVar;
    }

    public final y a() {
        return this.f11769U.f13236U.a();
    }

    public final void close() {
    }

    public final long f(l7.f fVar, long j7) {
        int i;
        int p3;
        f.e(fVar, "sink");
        do {
            int i8 = this.f11773Y;
            q qVar = this.f11769U;
            if (i8 == 0) {
                qVar.v((long) this.f11774Z);
                this.f11774Z = 0;
                if ((this.f11771W & 4) != 0) {
                    return -1;
                }
                i = this.f11772X;
                int r8 = b.r(qVar);
                this.f11773Y = r8;
                this.f11770V = r8;
                byte m8 = qVar.m() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                this.f11771W = qVar.m() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                Logger logger = s.f11775X;
                if (logger.isLoggable(Level.FINE)) {
                    i iVar = f.f11718a;
                    logger.fine(f.a(this.f11772X, this.f11770V, m8, this.f11771W, true));
                }
                p3 = qVar.p() & Integer.MAX_VALUE;
                this.f11772X = p3;
                if (m8 != 9) {
                    throw new IOException(m8 + " != TYPE_CONTINUATION");
                }
            } else {
                long f8 = qVar.f(fVar, Math.min(8192, (long) i8));
                if (f8 == -1) {
                    return -1;
                }
                this.f11773Y -= (int) f8;
                return f8;
            }
        } while (p3 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
