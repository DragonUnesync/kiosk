package c7;

import P6.f;
import Q5.a;
import java.io.IOException;
import java.net.ProtocolException;
import l7.w;
import l7.y;

/* renamed from: c7.d  reason: case insensitive filesystem */
public final class C0624d implements w {

    /* renamed from: U  reason: collision with root package name */
    public final w f8907U;

    /* renamed from: V  reason: collision with root package name */
    public final long f8908V;

    /* renamed from: W  reason: collision with root package name */
    public long f8909W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f8910X = true;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8911Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f8912Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ a f8913a0;

    public C0624d(a aVar, w wVar, long j7) {
        f.e(wVar, "delegate");
        this.f8913a0 = aVar;
        this.f8907U = wVar;
        this.f8908V = j7;
        if (j7 == 0) {
            l((IOException) null);
        }
    }

    public final y a() {
        return this.f8907U.a();
    }

    public final void close() {
        if (!this.f8912Z) {
            this.f8912Z = true;
            try {
                k();
                l((IOException) null);
            } catch (IOException e) {
                throw l(e);
            }
        }
    }

    public final long f(l7.f fVar, long j7) {
        f.e(fVar, "sink");
        if (!this.f8912Z) {
            try {
                long f8 = this.f8907U.f(fVar, 8192);
                if (this.f8910X) {
                    this.f8910X = false;
                    a aVar = this.f8913a0;
                    aVar.getClass();
                    f.e((h) aVar.f4123b, "call");
                }
                if (f8 == -1) {
                    l((IOException) null);
                    return -1;
                }
                long j8 = this.f8909W + f8;
                long j9 = this.f8908V;
                if (j9 == -1 || j8 <= j9) {
                    this.f8909W = j8;
                    if (j8 == j9) {
                        l((IOException) null);
                    }
                    return f8;
                }
                throw new ProtocolException("expected " + j9 + " bytes but received " + j8);
            } catch (IOException e) {
                throw l(e);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void k() {
        this.f8907U.close();
    }

    public final IOException l(IOException iOException) {
        if (this.f8911Y) {
            return iOException;
        }
        this.f8911Y = true;
        a aVar = this.f8913a0;
        if (iOException == null && this.f8910X) {
            this.f8910X = false;
            aVar.getClass();
            f.e((h) aVar.f4123b, "call");
        }
        return aVar.a(true, false, iOException);
    }

    public final String toString() {
        return C0624d.class.getSimpleName() + '(' + this.f8907U + ')';
    }
}
