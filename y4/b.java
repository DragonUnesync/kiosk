package y4;

import G4.a;
import G5.s;
import T5.C0265p0;
import T5.C0274u0;
import T5.K;
import T5.Y;
import a1.C0412c;
import de.ozerov.fully.M2;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import l4.C1175a;
import l4.C1176b;
import p1.E;
import t5.C1429a;
import u4.d;
import w5.C1591a;
import x5.C1607b;

public final class b extends a implements C0265p0, C1634a {

    /* renamed from: X  reason: collision with root package name */
    public static final C1175a f16393X = C1176b.a(b.class);

    /* renamed from: W  reason: collision with root package name */
    public int f16394W;

    public static void k(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            f16393X.error("Auth cancelled. Unexpected exception thrown by auth mechanism.", th);
        }
    }

    public final void c(Y y8, A4.b bVar) {
        d();
        if (this.f16394W != 1) {
            k(new C0412c((Object) this, 24, (Object) bVar));
            this.f16394W = 1;
        }
    }

    public final void channelRead(Y y8, Object obj) {
        if (obj instanceof P4.a) {
            P4.a aVar = (P4.a) obj;
            d();
            C1591a aVar2 = (C1591a) aVar.e;
            aVar2.getClass();
            if (E.b(aVar2)) {
                k(new M2(this, aVar));
                this.f16394W = 1;
                K channel = y8.channel();
                s.o(channel, new C1429a(aVar, "CONNECT failed as CONNACK contained an Error Code: " + aVar.e + ".", 1), 3);
            } else if (aVar.f3783j == null) {
                s.k(y8.channel(), C1607b.PROTOCOL_ERROR, new C1429a(aVar, "Auth method in CONNACK must be present.", 1));
            } else {
                throw null;
            }
        } else if (!(obj instanceof M4.a)) {
            y8.fireChannelRead(obj);
        } else {
            d();
            d dVar = ((M4.a) obj).f3166f;
            throw null;
        }
    }

    public final void close(Y y8, C0274u0 u0Var) {
        y8.close(u0Var);
    }

    public final void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        y8.connect(socketAddress, socketAddress2, u0Var);
    }

    public final void disconnect(Y y8, C0274u0 u0Var) {
        y8.disconnect(u0Var);
    }

    public final void flush(Y y8) {
        y8.flush();
    }

    public final long g() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        throw null;
    }

    public final C1607b h() {
        return C1607b.NOT_AUTHORIZED;
    }

    public final String i() {
        return "Timeout while waiting for AUTH or CONNACK.";
    }

    public final void read(Y y8) {
        y8.read();
    }

    public final void write(Y y8, Object obj, C0274u0 u0Var) {
        if (!(obj instanceof O4.a)) {
            y8.write(obj, u0Var);
            return;
        }
        throw null;
    }
}
