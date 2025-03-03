package b6;

import e6.C0844c;
import e6.L;
import e6.P;
import e6.S;
import e6.U;
import io.netty.internal.tcnative.SSL;
import java.security.cert.X509Certificate;

/* renamed from: b6.l  reason: case insensitive filesystem */
public final class C0566l extends C0844c implements T {
    private static final P leakDetector = S.instance().newResourceLeakDetector(C0566l.class);
    private long chain;
    private final U leak = leakDetector.track(this);
    private long privateKey;
    private final X509Certificate[] x509CertificateChain;

    public C0566l(long j7, long j8, X509Certificate[] x509CertificateArr) {
        this.chain = j7;
        this.privateKey = j8;
        this.x509CertificateChain = x509CertificateArr;
    }

    public void deallocate() {
        SSL.freeX509Chain(this.chain);
        this.chain = 0;
        SSL.freePrivateKey(this.privateKey);
        this.privateKey = 0;
        U u3 = this.leak;
        if (u3 != null) {
            ((L) u3).close(this);
        }
    }

    public boolean release() {
        U u3 = this.leak;
        if (u3 != null) {
            ((L) u3).record();
        }
        return super.release();
    }

    public C0566l retain() {
        U u3 = this.leak;
        if (u3 != null) {
            ((L) u3).record();
        }
        super.retain();
        return this;
    }

    public C0566l touch(Object obj) {
        U u3 = this.leak;
        if (u3 != null) {
            ((L) u3).record(obj);
        }
        return this;
    }
}
