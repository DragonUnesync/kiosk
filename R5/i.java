package R5;

import d6.C0648d;
import java.net.SocketAddress;

public final class i extends c {
    public i(h hVar) {
        super(hVar);
    }

    public SocketAddress remoteAddress() {
        return ((h) this.bootstrap).remoteAddress();
    }

    public C0648d resolver() {
        return ((h) this.bootstrap).resolver();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.setLength(sb.length() - 1);
        C0648d resolver = resolver();
        if (resolver != null) {
            sb.append(", resolver: ");
            sb.append(resolver);
        }
        SocketAddress remoteAddress = remoteAddress();
        if (remoteAddress != null) {
            sb.append(", remoteAddress: ");
            sb.append(remoteAddress);
        }
        sb.append(')');
        return sb.toString();
    }
}
