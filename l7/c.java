package l7;

import P6.f;
import g7.l;
import java.io.IOException;
import java.io.InputStream;

public final class c implements w {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13205U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f13206V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f13207W;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f13205U = i;
        this.f13206V = obj;
        this.f13207W = obj2;
    }

    public final y a() {
        switch (this.f13205U) {
            case 0:
                return (v) this.f13206V;
            default:
                return (y) this.f13207W;
        }
    }

    public final void close() {
        switch (this.f13205U) {
            case 0:
                c cVar = (c) this.f13207W;
                v vVar = (v) this.f13206V;
                vVar.h();
                try {
                    cVar.close();
                    if (vVar.i()) {
                        throw vVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (vVar.i()) {
                        e = vVar.k(e);
                    }
                    throw e;
                } finally {
                    vVar.i();
                }
            default:
                ((InputStream) this.f13206V).close();
                return;
        }
    }

    public final long f(f fVar, long j7) {
        switch (this.f13205U) {
            case 0:
                f.e(fVar, "sink");
                c cVar = (c) this.f13207W;
                v vVar = (v) this.f13206V;
                vVar.h();
                try {
                    long f8 = cVar.f(fVar, 8192);
                    if (!vVar.i()) {
                        return f8;
                    }
                    throw vVar.k((IOException) null);
                } catch (IOException e) {
                    e = e;
                    if (vVar.i()) {
                        e = vVar.k(e);
                    }
                    throw e;
                } finally {
                    vVar.i();
                }
            default:
                f.e(fVar, "sink");
                try {
                    ((y) this.f13207W).f();
                    r v4 = fVar.v(1);
                    int read = ((InputStream) this.f13206V).read(v4.f13239a, v4.f13241c, (int) Math.min(8192, (long) (8192 - v4.f13241c)));
                    if (read == -1) {
                        if (v4.f13240b == v4.f13241c) {
                            fVar.f13215U = v4.a();
                            s.a(v4);
                        }
                        return -1;
                    }
                    v4.f13241c += read;
                    long j8 = (long) read;
                    fVar.f13216V += j8;
                    return j8;
                } catch (AssertionError e8) {
                    if (l.f(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    public final String toString() {
        switch (this.f13205U) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f13207W) + ')';
            default:
                return "source(" + ((InputStream) this.f13206V) + ')';
        }
    }
}
