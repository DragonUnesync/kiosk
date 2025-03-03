package b6;

import g6.B;
import io.netty.internal.tcnative.SSL;
import io.netty.internal.tcnative.SSLContext;
import io.netty.internal.tcnative.SessionTicketKey;
import java.util.Enumeration;
import java.util.concurrent.locks.Lock;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: b6.d0  reason: case insensitive filesystem */
public abstract class C0544d0 implements SSLSessionContext {
    final F0 context;
    private final long mask;
    private final V provider;
    /* access modifiers changed from: private */
    public final C0538b0 sessionCache;
    private final C0550f0 stats;

    public C0544d0(F0 f02, V v4, long j7, C0538b0 b0Var) {
        this.context = f02;
        this.provider = v4;
        this.mask = j7;
        this.stats = new C0550f0(f02);
        this.sessionCache = b0Var;
        SSLContext.setSSLSessionCache(f02.ctx, b0Var);
    }

    public final void destroy() {
        V v4 = this.provider;
        if (v4 != null) {
            v4.destroy();
        }
        this.sessionCache.clear();
    }

    public Enumeration<byte[]> getIds() {
        return new C0541c0(this);
    }

    public SSLSession getSession(byte[] bArr) {
        return this.sessionCache.getSession(new C0547e0(bArr));
    }

    public int getSessionCacheSize() {
        return this.sessionCache.getSessionCacheSize();
    }

    public int getSessionTimeout() {
        return this.sessionCache.getSessionTimeout();
    }

    public final boolean isInCache(C0547e0 e0Var) {
        return this.sessionCache.containsSessionWithId(e0Var);
    }

    public final void removeFromCache(C0547e0 e0Var) {
        this.sessionCache.removeSessionWithId(e0Var);
    }

    public void setSessionCacheEnabled(boolean z) {
        long j7;
        if (z) {
            j7 = this.mask | SSL.SSL_SESS_CACHE_NO_INTERNAL_LOOKUP | SSL.SSL_SESS_CACHE_NO_INTERNAL_STORE;
        } else {
            j7 = SSL.SSL_SESS_CACHE_OFF;
        }
        Lock writeLock = this.context.ctxLock.writeLock();
        writeLock.lock();
        try {
            SSLContext.setSessionCacheMode(this.context.ctx, j7);
            if (!z) {
                this.sessionCache.clear();
            }
        } finally {
            writeLock.unlock();
        }
    }

    public void setSessionCacheSize(int i) {
        B.checkPositiveOrZero(i, "size");
        this.sessionCache.setSessionCacheSize(i);
    }

    public void setSessionFromCache(String str, int i, long j7) {
        this.sessionCache.setSession(j7, str, i);
    }

    public void setSessionTimeout(int i) {
        B.checkPositiveOrZero(i, "seconds");
        Lock writeLock = this.context.ctxLock.writeLock();
        writeLock.lock();
        try {
            SSLContext.setSessionCacheTimeout(this.context.ctx, (long) i);
            this.sessionCache.setSessionTimeout(i);
        } finally {
            writeLock.unlock();
        }
    }

    public void setTicketKeys(C0553g0... g0VarArr) {
        B.checkNotNull(g0VarArr, "keys");
        int length = g0VarArr.length;
        SessionTicketKey[] sessionTicketKeyArr = new SessionTicketKey[length];
        if (length <= 0) {
            Lock writeLock = this.context.ctxLock.writeLock();
            writeLock.lock();
            try {
                SSLContext.clearOptions(this.context.ctx, SSL.SSL_OP_NO_TICKET);
                if (length > 0) {
                    SSLContext.setSessionTicketKeys(this.context.ctx, sessionTicketKeyArr);
                }
            } finally {
                writeLock.unlock();
            }
        } else {
            C0553g0 g0Var = g0VarArr[0];
            throw null;
        }
    }

    public final boolean useKeyManager() {
        if (this.provider != null) {
            return true;
        }
        return false;
    }
}
