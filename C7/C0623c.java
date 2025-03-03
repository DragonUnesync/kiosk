package c7;

import P6.f;
import Q5.a;
import java.io.IOException;
import java.net.ProtocolException;
import l7.u;
import l7.y;

/* renamed from: c7.c  reason: case insensitive filesystem */
public final class C0623c implements u {

    /* renamed from: U  reason: collision with root package name */
    public final u f8901U;

    /* renamed from: V  reason: collision with root package name */
    public final long f8902V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8903W;

    /* renamed from: X  reason: collision with root package name */
    public long f8904X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8905Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ a f8906Z;

    public C0623c(a aVar, u uVar, long j7) {
        f.e(uVar, "delegate");
        this.f8906Z = aVar;
        this.f8901U = uVar;
        this.f8902V = j7;
    }

    public final y a() {
        return this.f8901U.a();
    }

    public final void close() {
        if (!this.f8905Y) {
            this.f8905Y = true;
            long j7 = this.f8902V;
            if (j7 == -1 || this.f8904X == j7) {
                try {
                    k();
                    l((IOException) null);
                } catch (IOException e) {
                    throw l(e);
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final void flush() {
        try {
            m();
        } catch (IOException e) {
            throw l(e);
        }
    }

    public final void h(l7.f fVar, long j7) {
        if (!this.f8905Y) {
            long j8 = this.f8902V;
            if (j8 == -1 || this.f8904X + j7 <= j8) {
                try {
                    this.f8901U.h(fVar, j7);
                    this.f8904X += j7;
                } catch (IOException e) {
                    throw l(e);
                }
            } else {
                throw new ProtocolException("expected " + j8 + " bytes but received " + (this.f8904X + j7));
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void k() {
        this.f8901U.close();
    }

    public final IOException l(IOException iOException) {
        if (this.f8903W) {
            return iOException;
        }
        this.f8903W = true;
        return this.f8906Z.a(false, true, iOException);
    }

    public final void m() {
        this.f8901U.flush();
    }

    public final String toString() {
        return C0623c.class.getSimpleName() + '(' + this.f8901U + ')';
    }
}
