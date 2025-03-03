package V5;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public enum f {
    IPv4(Inet4Address.class, 1),
    IPv6(Inet6Address.class, 2);
    
    private final int addressNumber;
    private final Class<? extends InetAddress> addressType;

    private f(Class<? extends InetAddress> cls, int i) {
        this.addressType = cls;
        this.addressNumber = i;
    }
}
