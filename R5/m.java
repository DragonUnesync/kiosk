package R5;

import T5.B0;
import T5.C0247g0;
import T5.C0250i;
import T5.C0260n;
import T5.C0263o0;
import T5.K;
import T5.L;
import T5.Z0;
import java.net.SocketAddress;

public final class m extends C0260n {
    private static final C0247g0 METADATA = new C0247g0(false);
    private final L config = new B0(this);

    public m() {
        super((K) null);
    }

    public L config() {
        return this.config;
    }

    public void doBeginRead() {
        throw new UnsupportedOperationException();
    }

    public void doClose() {
        throw new UnsupportedOperationException();
    }

    public void doDisconnect() {
        throw new UnsupportedOperationException();
    }

    public void doWrite(C0263o0 o0Var) {
        throw new UnsupportedOperationException();
    }

    public boolean isActive() {
        return false;
    }

    public boolean isCompatible(Z0 z02) {
        return false;
    }

    public boolean isOpen() {
        return false;
    }

    public SocketAddress localAddress0() {
        return null;
    }

    public C0247g0 metadata() {
        return METADATA;
    }

    public C0250i newUnsafe() {
        return new l(this);
    }

    public SocketAddress remoteAddress0() {
        return null;
    }
}
