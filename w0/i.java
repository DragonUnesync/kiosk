package W0;

import P0.l;
import X0.b;
import X0.m;
import i1.C1091d;
import java.io.IOException;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final C1091d f6081a;

    /* renamed from: b  reason: collision with root package name */
    public final m f6082b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6083c;

    /* renamed from: d  reason: collision with root package name */
    public final h f6084d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6085f;

    public i(long j7, m mVar, b bVar, C1091d dVar, long j8, h hVar) {
        this.e = j7;
        this.f6082b = mVar;
        this.f6083c = bVar;
        this.f6085f = j8;
        this.f6081a = dVar;
        this.f6084d = hVar;
    }

    public final i a(long j7, m mVar) {
        long j8;
        long j9 = j7;
        h c8 = this.f6082b.c();
        h c9 = mVar.c();
        if (c8 == null) {
            return new i(j7, mVar, this.f6083c, this.f6081a, this.f6085f, c8);
        } else if (!c8.L()) {
            return new i(j7, mVar, this.f6083c, this.f6081a, this.f6085f, c9);
        } else {
            long i02 = c8.i0(j9);
            if (i02 == 0) {
                return new i(j7, mVar, this.f6083c, this.f6081a, this.f6085f, c9);
            }
            l.k(c9);
            long Z7 = c8.Z();
            long b8 = c8.b(Z7);
            long j10 = i02 + Z7;
            long j11 = j10 - 1;
            long h5 = c8.h(j11, j9) + c8.b(j11);
            long Z8 = c9.Z();
            long j12 = Z7;
            long b9 = c9.b(Z8);
            h hVar = c8;
            long j13 = this.f6085f;
            int i = (h5 > b9 ? 1 : (h5 == b9 ? 0 : -1));
            if (i == 0) {
                j8 = (j10 - Z8) + j13;
                long j14 = j7;
            } else if (i < 0) {
                throw new IOException();
            } else if (b9 < b8) {
                j8 = j13 - (c9.e(b8, j7) - j12);
            } else {
                j8 = (hVar.e(b9, j7) - Z8) + j13;
            }
            return new i(j7, mVar, this.f6083c, this.f6081a, j8, c9);
        }
    }

    public final long b(long j7) {
        h hVar = this.f6084d;
        l.k(hVar);
        return hVar.t(this.e, j7) + this.f6085f;
    }

    public final long c(long j7) {
        long b8 = b(j7);
        h hVar = this.f6084d;
        l.k(hVar);
        return (hVar.j0(this.e, j7) + b8) - 1;
    }

    public final long d() {
        h hVar = this.f6084d;
        l.k(hVar);
        return hVar.i0(this.e);
    }

    public final long e(long j7) {
        long f8 = f(j7);
        h hVar = this.f6084d;
        l.k(hVar);
        return hVar.h(j7 - this.f6085f, this.e) + f8;
    }

    public final long f(long j7) {
        h hVar = this.f6084d;
        l.k(hVar);
        return hVar.b(j7 - this.f6085f);
    }

    public final boolean g(long j7, long j8) {
        h hVar = this.f6084d;
        l.k(hVar);
        if (!hVar.L() && j8 != -9223372036854775807L && e(j7) > j8) {
            return false;
        }
        return true;
    }
}
