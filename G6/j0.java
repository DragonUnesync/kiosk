package g6;

import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.security.PrivilegedExceptionAction;

public final class j0 implements PrivilegedExceptionAction {
    final /* synthetic */ SocketAddress val$remoteAddress;
    final /* synthetic */ SocketChannel val$socketChannel;

    public j0(SocketChannel socketChannel, SocketAddress socketAddress) {
        this.val$socketChannel = socketChannel;
        this.val$remoteAddress = socketAddress;
    }

    public Boolean run() {
        return Boolean.valueOf(this.val$socketChannel.connect(this.val$remoteAddress));
    }
}
