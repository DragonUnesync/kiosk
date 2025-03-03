package g6;

import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.security.PrivilegedExceptionAction;

public final class k0 implements PrivilegedExceptionAction {
    final /* synthetic */ SocketAddress val$address;
    final /* synthetic */ SocketChannel val$socketChannel;

    public k0(SocketChannel socketChannel, SocketAddress socketAddress) {
        this.val$socketChannel = socketChannel;
        this.val$address = socketAddress;
    }

    public Void run() {
        this.val$socketChannel.bind(this.val$address);
        return null;
    }
}
