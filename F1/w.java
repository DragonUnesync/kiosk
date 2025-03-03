package f1;

import G3.e;
import H3.i0;
import P0.l;
import Z1.c;
import a1.C0412c;
import de.ozerov.fully.K2;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import l1.n;
import l1.p;

public final class w implements Closeable {

    /* renamed from: a0  reason: collision with root package name */
    public static final Charset f11625a0 = StandardCharsets.UTF_8;

    /* renamed from: U  reason: collision with root package name */
    public final K2 f11626U;

    /* renamed from: V  reason: collision with root package name */
    public final p f11627V = new p("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: W  reason: collision with root package name */
    public final Map f11628W = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: X  reason: collision with root package name */
    public v f11629X;

    /* renamed from: Y  reason: collision with root package name */
    public Socket f11630Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile boolean f11631Z;

    public w(K2 k22) {
        this.f11626U = k22;
    }

    public final void close() {
        if (!this.f11631Z) {
            try {
                v vVar = this.f11629X;
                if (vVar != null) {
                    vVar.close();
                }
                this.f11627V.e((n) null);
                Socket socket = this.f11630Y;
                if (socket != null) {
                    socket.close();
                }
                this.f11631Z = true;
            } catch (Throwable th) {
                this.f11631Z = true;
                throw th;
            }
        }
    }

    public final void k(Socket socket) {
        this.f11630Y = socket;
        this.f11629X = new v(this, socket.getOutputStream());
        this.f11627V.f(new u(this, socket.getInputStream()), new c(21, (Object) this), 0);
    }

    public final void l(i0 i0Var) {
        l.k(this.f11629X);
        v vVar = this.f11629X;
        vVar.getClass();
        vVar.f11623W.post(new C0412c(vVar, new e(x.f11638h).c(i0Var).getBytes(f11625a0), i0Var));
    }
}
