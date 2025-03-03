package g6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Collections;
import java.util.Enumeration;

public abstract class m0 {
    private static final Enumeration<Object> EMPTY = Collections.enumeration(Collections.emptyList());

    public static InetAddress addressByName(String str) {
        try {
            return (InetAddress) AccessController.doPrivileged(new l0(str));
        } catch (PrivilegedActionException e) {
            throw ((UnknownHostException) e.getCause());
        }
    }

    public static Enumeration<InetAddress> addressesFromNetworkInterface(NetworkInterface networkInterface) {
        Enumeration<InetAddress> enumeration = (Enumeration) AccessController.doPrivileged(new g0(networkInterface));
        if (enumeration == null) {
            return empty();
        }
        return enumeration;
    }

    public static void bind(Socket socket, SocketAddress socketAddress) {
        try {
            AccessController.doPrivileged(new i0(socket, socketAddress));
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getCause());
        }
    }

    public static boolean connect(SocketChannel socketChannel, SocketAddress socketAddress) {
        try {
            return ((Boolean) AccessController.doPrivileged(new j0(socketChannel, socketAddress))).booleanValue();
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getCause());
        }
    }

    private static <T> Enumeration<T> empty() {
        return EMPTY;
    }

    public static byte[] hardwareAddressFromNetworkInterface(NetworkInterface networkInterface) {
        try {
            return (byte[]) AccessController.doPrivileged(new h0(networkInterface));
        } catch (PrivilegedActionException e) {
            throw ((SocketException) e.getCause());
        }
    }

    public static void bind(SocketChannel socketChannel, SocketAddress socketAddress) {
        try {
            AccessController.doPrivileged(new k0(socketChannel, socketAddress));
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getCause());
        }
    }
}
