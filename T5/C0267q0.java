package T5;

import java.net.SocketAddress;

/* renamed from: T5.q0  reason: case insensitive filesystem */
public abstract class C0267q0 extends X implements C0265p0 {
    @C0237b0
    public void close(Y y8, C0274u0 u0Var) {
        y8.close(u0Var);
    }

    @C0237b0
    public void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        y8.connect(socketAddress, socketAddress2, u0Var);
    }

    @C0237b0
    public void disconnect(Y y8, C0274u0 u0Var) {
        y8.disconnect(u0Var);
    }

    @C0237b0
    public void flush(Y y8) {
        y8.flush();
    }

    @C0237b0
    public void read(Y y8) {
        y8.read();
    }
}
