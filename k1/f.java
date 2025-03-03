package K1;

import M0.J;
import P0.r;
import java.io.EOFException;
import p1.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f2559a;

    /* renamed from: b  reason: collision with root package name */
    public long f2560b;

    /* renamed from: c  reason: collision with root package name */
    public int f2561c;

    /* renamed from: d  reason: collision with root package name */
    public int f2562d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2563f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final r f2564g = new r(255);

    public final boolean a(l lVar, boolean z) {
        boolean z6;
        boolean z8;
        this.f2559a = 0;
        this.f2560b = 0;
        this.f2561c = 0;
        this.f2562d = 0;
        this.e = 0;
        r rVar = this.f2564g;
        rVar.E(27);
        try {
            z6 = lVar.r(rVar.f3732a, 0, 27, z);
        } catch (EOFException e8) {
            if (z) {
                z6 = false;
            } else {
                throw e8;
            }
        }
        if (!z6 || rVar.x() != 1332176723) {
            return false;
        }
        if (rVar.v() == 0) {
            this.f2559a = rVar.v();
            this.f2560b = rVar.l();
            rVar.m();
            rVar.m();
            rVar.m();
            int v4 = rVar.v();
            this.f2561c = v4;
            this.f2562d = v4 + 27;
            rVar.E(v4);
            try {
                z8 = lVar.r(rVar.f3732a, 0, this.f2561c, z);
            } catch (EOFException e9) {
                if (z) {
                    z8 = false;
                } else {
                    throw e9;
                }
            }
            if (!z8) {
                return false;
            }
            for (int i = 0; i < this.f2561c; i++) {
                int v8 = rVar.v();
                this.f2563f[i] = v8;
                this.e += v8;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw J.c("unsupported bit stream revision");
        }
    }

    public final boolean b(l lVar, long j7) {
        boolean z;
        int i;
        boolean z6;
        if (lVar.f14408X == lVar.s()) {
            z = true;
        } else {
            z = false;
        }
        P0.l.d(z);
        r rVar = this.f2564g;
        rVar.E(4);
        while (true) {
            i = (j7 > -1 ? 1 : (j7 == -1 ? 0 : -1));
            if (i != 0 && lVar.f14408X + 4 >= j7) {
                break;
            }
            try {
                z6 = lVar.r(rVar.f3732a, 0, 4, true);
            } catch (EOFException unused) {
                z6 = false;
            }
            if (!z6) {
                break;
            }
            rVar.H(0);
            if (rVar.x() == 1332176723) {
                lVar.f14410Z = 0;
                return true;
            }
            lVar.m(1);
        }
        do {
            if ((i != 0 && lVar.f14408X >= j7) || lVar.l(1) == -1) {
                return false;
            }
            break;
        } while (lVar.l(1) == -1);
        return false;
    }
}
