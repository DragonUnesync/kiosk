package g6;

import java.net.Socket;
import java.net.SocketAddress;
import java.security.PrivilegedExceptionAction;

public final class i0 implements PrivilegedExceptionAction {
    final /* synthetic */ SocketAddress val$bindpoint;
    final /* synthetic */ Socket val$socket;

    public i0(Socket socket, SocketAddress socketAddress) {
        this.val$socket = socket;
        this.val$bindpoint = socketAddress;
    }

    public Void run() {
        this.val$socket.bind(this.val$bindpoint);
        return null;
    }
}
