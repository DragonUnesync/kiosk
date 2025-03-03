package K1;

import M3.n;
import P0.r;
import S3.b;
import java.io.EOFException;
import p1.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2555a;

    /* renamed from: b  reason: collision with root package name */
    public int f2556b;

    /* renamed from: c  reason: collision with root package name */
    public int f2557c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2558d;
    public final Object e;

    public e() {
        this.f2558d = new f();
        this.e = new r(0, new byte[65025]);
        this.f2556b = -1;
    }

    public int a(int i) {
        int i8;
        int i9 = 0;
        this.f2557c = 0;
        do {
            int i10 = this.f2557c;
            int i11 = i + i10;
            f fVar = (f) this.f2558d;
            if (i11 >= fVar.f2561c) {
                break;
            }
            int[] iArr = fVar.f2563f;
            this.f2557c = i10 + 1;
            i8 = iArr[i10 + i];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public boolean b(l lVar) {
        boolean z;
        boolean z6;
        int i;
        if (lVar != null) {
            z = true;
        } else {
            z = false;
        }
        P0.l.j(z);
        boolean z8 = this.f2555a;
        r rVar = (r) this.e;
        if (z8) {
            this.f2555a = false;
            rVar.E(0);
        }
        while (!this.f2555a) {
            int i8 = this.f2556b;
            f fVar = (f) this.f2558d;
            if (i8 < 0) {
                if (fVar.b(lVar, -1) && fVar.a(lVar, true)) {
                    int i9 = fVar.f2562d;
                    if ((fVar.f2559a & 1) == 1 && rVar.f3734c == 0) {
                        i9 += a(0);
                        i = this.f2557c;
                    } else {
                        i = 0;
                    }
                    try {
                        lVar.m(i9);
                        this.f2556b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a8 = a(this.f2556b);
            int i10 = this.f2556b + this.f2557c;
            if (a8 > 0) {
                rVar.b(rVar.f3734c + a8);
                try {
                    lVar.c(rVar.f3732a, rVar.f3734c, a8, false);
                    rVar.G(rVar.f3734c + a8);
                    if (fVar.f2563f[i10 - 1] != 255) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.f2555a = z6;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i10 == fVar.f2561c) {
                i10 = -1;
            }
            this.f2556b = i10;
        }
        return true;
    }

    public e(b bVar, n[] nVarArr, boolean z, int i, int i8) {
        this.f2558d = bVar;
        this.e = nVarArr;
        this.f2555a = z;
        this.f2556b = i;
        this.f2557c = i8;
    }
}
