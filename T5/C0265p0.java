package T5;

import java.net.SocketAddress;

/* renamed from: T5.p0  reason: case insensitive filesystem */
public interface C0265p0 extends W {
    void close(Y y8, C0274u0 u0Var);

    void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var);

    void disconnect(Y y8, C0274u0 u0Var);

    void flush(Y y8);

    void read(Y y8);

    void write(Y y8, Object obj, C0274u0 u0Var);
}
