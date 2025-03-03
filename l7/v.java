package l7;

import g7.l;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class v extends d {

    /* renamed from: m  reason: collision with root package name */
    public final Socket f13250m;

    public v(Socket socket) {
        this.f13250m = socket;
    }

    public final void j() {
        Socket socket = this.f13250m;
        try {
            socket.close();
        } catch (Exception e) {
            Logger logger = m.f13230a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + socket, e);
        } catch (AssertionError e8) {
            if (l.f(e8)) {
                Logger logger2 = m.f13230a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + socket, e8);
                return;
            }
            throw e8;
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
