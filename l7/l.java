package l7;

import P6.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class l implements w {

    /* renamed from: U  reason: collision with root package name */
    public final q f13226U;

    /* renamed from: V  reason: collision with root package name */
    public final Inflater f13227V;

    /* renamed from: W  reason: collision with root package name */
    public int f13228W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f13229X;

    public l(q qVar, Inflater inflater) {
        this.f13226U = qVar;
        this.f13227V = inflater;
    }

    public final y a() {
        return this.f13226U.f13236U.a();
    }

    public final void close() {
        if (!this.f13229X) {
            this.f13227V.end();
            this.f13229X = true;
            this.f13226U.close();
        }
    }

    public final long f(f fVar, long j7) {
        long j8;
        f.e(fVar, "sink");
        while (!this.f13229X) {
            q qVar = this.f13226U;
            Inflater inflater = this.f13227V;
            try {
                r v4 = fVar.v(1);
                int min = (int) Math.min(8192, (long) (8192 - v4.f13241c));
                if (inflater.needsInput()) {
                    if (!qVar.k()) {
                        r rVar = qVar.f13237V.f13215U;
                        f.b(rVar);
                        int i = rVar.f13241c;
                        int i8 = rVar.f13240b;
                        int i9 = i - i8;
                        this.f13228W = i9;
                        inflater.setInput(rVar.f13239a, i8, i9);
                    }
                }
                int inflate = inflater.inflate(v4.f13239a, v4.f13241c, min);
                int i10 = this.f13228W;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f13228W -= remaining;
                    qVar.v((long) remaining);
                }
                if (inflate > 0) {
                    v4.f13241c += inflate;
                    j8 = (long) inflate;
                    fVar.f13216V += j8;
                } else {
                    if (v4.f13240b == v4.f13241c) {
                        fVar.f13215U = v4.a();
                        s.a(v4);
                    }
                    j8 = 0;
                }
                if (j8 > 0) {
                    return j8;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1;
                }
                if (qVar.k()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }
}
