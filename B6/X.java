package b6;

import io.netty.internal.tcnative.SSL;
import io.netty.internal.tcnative.SSLContext;
import java.util.concurrent.locks.Lock;

public final class X extends C0544d0 {
    public X(F0 f02, V v4) {
        super(f02, v4, SSL.SSL_SESS_CACHE_SERVER, new C0538b0(f02.engineMap));
    }

    public boolean setSessionIdContext(byte[] bArr) {
        Lock writeLock = this.context.ctxLock.writeLock();
        writeLock.lock();
        try {
            return SSLContext.setSessionIdContext(this.context.ctx, bArr);
        } finally {
            writeLock.unlock();
        }
    }
}
