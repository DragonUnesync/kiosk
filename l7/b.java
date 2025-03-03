package l7;

import P6.f;
import com.bumptech.glide.d;
import java.io.IOException;
import java.io.OutputStream;

public final class b implements u {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13202U = 1;

    /* renamed from: V  reason: collision with root package name */
    public final v f13203V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f13204W;

    public b(OutputStream outputStream, v vVar) {
        this.f13204W = outputStream;
        this.f13203V = vVar;
    }

    public final y a() {
        switch (this.f13202U) {
            case 0:
                return this.f13203V;
            default:
                return this.f13203V;
        }
    }

    public final void close() {
        switch (this.f13202U) {
            case 0:
                b bVar = (b) this.f13204W;
                v vVar = this.f13203V;
                vVar.h();
                try {
                    bVar.close();
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
                ((OutputStream) this.f13204W).close();
                return;
        }
    }

    public final void flush() {
        switch (this.f13202U) {
            case 0:
                b bVar = (b) this.f13204W;
                v vVar = this.f13203V;
                vVar.h();
                try {
                    bVar.flush();
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
                ((OutputStream) this.f13204W).flush();
                return;
        }
    }

    public final void h(f fVar, long j7) {
        switch (this.f13202U) {
            case 0:
                d.c(fVar.f13216V, 0, j7);
                while (true) {
                    long j8 = 0;
                    if (j7 > 0) {
                        r rVar = fVar.f13215U;
                        f.b(rVar);
                        while (true) {
                            if (j8 < 65536) {
                                j8 += (long) (rVar.f13241c - rVar.f13240b);
                                if (j8 >= j7) {
                                    j8 = j7;
                                } else {
                                    rVar = rVar.f13243f;
                                    f.b(rVar);
                                }
                            }
                        }
                        b bVar = (b) this.f13204W;
                        v vVar = this.f13203V;
                        vVar.h();
                        try {
                            bVar.h(fVar, j8);
                            if (!vVar.i()) {
                                j7 -= j8;
                            } else {
                                throw vVar.k((IOException) null);
                            }
                        } catch (IOException e) {
                            e = e;
                            if (vVar.i()) {
                                e = vVar.k(e);
                            }
                            throw e;
                        } finally {
                            vVar.i();
                        }
                    } else {
                        return;
                    }
                }
            default:
                d.c(fVar.f13216V, 0, j7);
                while (j7 > 0) {
                    this.f13203V.f();
                    r rVar2 = fVar.f13215U;
                    f.b(rVar2);
                    int min = (int) Math.min(j7, (long) (rVar2.f13241c - rVar2.f13240b));
                    ((OutputStream) this.f13204W).write(rVar2.f13239a, rVar2.f13240b, min);
                    int i = rVar2.f13240b + min;
                    rVar2.f13240b = i;
                    long j9 = (long) min;
                    j7 -= j9;
                    fVar.f13216V -= j9;
                    if (i == rVar2.f13241c) {
                        fVar.f13215U = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f13202U) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f13204W) + ')';
            default:
                return "sink(" + ((OutputStream) this.f13204W) + ')';
        }
    }

    public b(v vVar, b bVar) {
        this.f13203V = vVar;
        this.f13204W = bVar;
    }
}
