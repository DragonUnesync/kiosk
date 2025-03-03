package e7;

import P5.E;
import P6.f;
import W6.d;
import W6.l;
import Y6.o;
import Y6.r;
import Z6.b;
import c7.j;
import c7.m;
import d7.C0660e;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l7.q;

/* renamed from: e7.c  reason: case insensitive filesystem */
public final class C0868c extends C0866a {

    /* renamed from: X  reason: collision with root package name */
    public final o f11280X;

    /* renamed from: Y  reason: collision with root package name */
    public long f11281Y = -1;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f11282Z = true;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ m f11283a0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0868c(m mVar, o oVar) {
        super(mVar);
        f.e(oVar, "url");
        this.f11283a0 = mVar;
        this.f11280X = oVar;
    }

    public final void close() {
        if (!this.f11275V) {
            if (this.f11282Z && !b.g(this, TimeUnit.MILLISECONDS)) {
                ((j) this.f11283a0.f8961c).l();
                k();
            }
            this.f11275V = true;
        }
    }

    public final long f(l7.f fVar, long j7) {
        f.e(fVar, "sink");
        if (this.f11275V) {
            throw new IllegalStateException("closed");
        } else if (!this.f11282Z) {
            return -1;
        } else {
            long j8 = this.f11281Y;
            m mVar = this.f11283a0;
            if (j8 == 0 || j8 == -1) {
                if (j8 != -1) {
                    ((q) mVar.f8962d).s(Long.MAX_VALUE);
                }
                try {
                    this.f11281Y = ((q) mVar.f8962d).o();
                    String obj = d.s0(((q) mVar.f8962d).s(Long.MAX_VALUE)).toString();
                    if (this.f11281Y < 0 || (obj.length() > 0 && !l.a0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f11281Y + obj + '\"');
                    }
                    if (this.f11281Y == 0) {
                        this.f11282Z = false;
                        mVar.f8964g = ((E) mVar.f8963f).H();
                        r rVar = (r) mVar.f8960b;
                        f.b(rVar);
                        Y6.m mVar2 = (Y6.m) mVar.f8964g;
                        f.b(mVar2);
                        C0660e.b(rVar.f6705d0, this.f11280X, mVar2);
                        k();
                    }
                    if (!this.f11282Z) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long f8 = super.f(fVar, Math.min(8192, this.f11281Y));
            if (f8 != -1) {
                this.f11281Y -= f8;
                return f8;
            }
            ((j) mVar.f8961c).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            k();
            throw protocolException;
        }
    }
}
