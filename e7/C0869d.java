package e7;

import Z6.b;
import c7.j;
import c7.m;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l7.f;

/* renamed from: e7.d  reason: case insensitive filesystem */
public final class C0869d extends C0866a {

    /* renamed from: X  reason: collision with root package name */
    public long f11284X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ m f11285Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0869d(m mVar, long j7) {
        super(mVar);
        this.f11285Y = mVar;
        this.f11284X = j7;
        if (j7 == 0) {
            k();
        }
    }

    public final void close() {
        if (!this.f11275V) {
            if (this.f11284X != 0 && !b.g(this, TimeUnit.MILLISECONDS)) {
                ((j) this.f11285Y.f8961c).l();
                k();
            }
            this.f11275V = true;
        }
    }

    public final long f(f fVar, long j7) {
        P6.f.e(fVar, "sink");
        if (!this.f11275V) {
            long j8 = this.f11284X;
            if (j8 == 0) {
                return -1;
            }
            long f8 = super.f(fVar, Math.min(j8, 8192));
            if (f8 != -1) {
                long j9 = this.f11284X - f8;
                this.f11284X = j9;
                if (j9 == 0) {
                    k();
                }
                return f8;
            }
            ((j) this.f11285Y.f8961c).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            k();
            throw protocolException;
        }
        throw new IllegalStateException("closed");
    }
}
