package f1;

import E.e;
import P0.l;
import P0.z;
import R0.A;
import R0.B;
import R0.C;
import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* renamed from: f1.F  reason: case insensitive filesystem */
public final class C0887F implements C0890c {

    /* renamed from: U  reason: collision with root package name */
    public final C f11496U = new C(e.c(8000));

    /* renamed from: V  reason: collision with root package name */
    public C0887F f11497V;

    public final String a() {
        boolean z;
        int d8 = d();
        if (d8 != -1) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        int i = z.f3748a;
        Locale locale = Locale.US;
        return "RTP/AVP;unicast;client_port=" + d8 + "-" + (1 + d8);
    }

    public final void close() {
        this.f11496U.close();
        C0887F f8 = this.f11497V;
        if (f8 != null) {
            f8.close();
        }
    }

    public final int d() {
        int i;
        DatagramSocket datagramSocket = this.f11496U.f4240c0;
        if (datagramSocket == null) {
            i = -1;
        } else {
            i = datagramSocket.getLocalPort();
        }
        if (i == -1) {
            return -1;
        }
        return i;
    }

    public final long f(R0.l lVar) {
        this.f11496U.f(lVar);
        return -1;
    }

    public final Map j() {
        return Collections.emptyMap();
    }

    public final boolean n() {
        return true;
    }

    public final void o(A a8) {
        this.f11496U.o(a8);
    }

    public final Uri p() {
        return this.f11496U.f4239b0;
    }

    public final C0886E u() {
        return null;
    }

    public final int x(byte[] bArr, int i, int i8) {
        try {
            return this.f11496U.x(bArr, i, i8);
        } catch (B e) {
            if (e.f4265U == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
