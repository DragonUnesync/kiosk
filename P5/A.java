package P5;

import A1.d;
import K1.i;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

public final class A implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final InputStream f3794U;

    /* renamed from: V  reason: collision with root package name */
    public final Socket f3795V;

    /* renamed from: W  reason: collision with root package name */
    public Thread f3796W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ P f3797X;

    public A(P p3, InputStream inputStream, Socket socket) {
        this.f3797X = p3;
        this.f3794U = inputStream;
        this.f3795V = socket;
    }

    public final void run() {
        InputStream inputStream = this.f3794U;
        P p3 = this.f3797X;
        Socket socket = this.f3795V;
        try {
            OutputStream outputStream = socket.getOutputStream();
            i iVar = p3.f3864f;
            G g8 = new G(this.f3797X, new d(25), this.f3794U, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                g8.d();
            }
            P.i(outputStream);
            P.i(inputStream);
            P.i(socket);
        } catch (Exception e) {
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                P.f3856p.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", e);
            }
            P.i((Object) null);
            P.i(inputStream);
            P.i(socket);
        } catch (Throwable th) {
            P.i((Object) null);
            P.i(inputStream);
            P.i(socket);
            ((List) p3.e.f3810W).remove(this);
            throw th;
        }
        ((List) p3.e.f3810W).remove(this);
    }
}
