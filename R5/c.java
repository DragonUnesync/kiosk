package R5;

import T5.C0251i0;
import T5.W;
import T5.a1;
import e6.C0849h;
import g6.B;
import g6.n0;
import java.net.SocketAddress;
import java.util.Map;

public abstract class c {
    protected final b bootstrap;

    public c(b bVar) {
        this.bootstrap = (b) B.checkNotNull(bVar, "bootstrap");
    }

    public final Map<C0849h, Object> attrs() {
        return this.bootstrap.attrs();
    }

    public final j channelFactory() {
        return this.bootstrap.channelFactory();
    }

    public final a1 group() {
        return this.bootstrap.group();
    }

    public final W handler() {
        return this.bootstrap.handler();
    }

    public final SocketAddress localAddress() {
        return this.bootstrap.localAddress();
    }

    public final Map<C0251i0, Object> options() {
        return this.bootstrap.options();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(n0.simpleClassName((Object) this));
        sb.append('(');
        a1 group = group();
        if (group != null) {
            sb.append("group: ");
            sb.append(n0.simpleClassName((Object) group));
            sb.append(", ");
        }
        j channelFactory = channelFactory();
        if (channelFactory != null) {
            sb.append("channelFactory: ");
            sb.append(channelFactory);
            sb.append(", ");
        }
        SocketAddress localAddress = localAddress();
        if (localAddress != null) {
            sb.append("localAddress: ");
            sb.append(localAddress);
            sb.append(", ");
        }
        Map<C0251i0, Object> options = options();
        if (!options.isEmpty()) {
            sb.append("options: ");
            sb.append(options);
            sb.append(", ");
        }
        Map<C0849h, Object> attrs = attrs();
        if (!attrs.isEmpty()) {
            sb.append("attrs: ");
            sb.append(attrs);
            sb.append(", ");
        }
        W handler = handler();
        if (handler != null) {
            sb.append("handler: ");
            sb.append(handler);
            sb.append(", ");
        }
        if (sb.charAt(sb.length() - 1) == '(') {
            sb.append(')');
        } else {
            sb.setCharAt(sb.length() - 2, ')');
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
