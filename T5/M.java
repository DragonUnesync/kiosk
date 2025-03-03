package T5;

import java.net.SocketAddress;

public abstract class M extends C0245f0 implements C0265p0 {
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

    @C0237b0
    public void write(Y y8, Object obj, C0274u0 u0Var) {
        y8.write(obj, u0Var);
    }
}
