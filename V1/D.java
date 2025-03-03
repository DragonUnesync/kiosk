package V1;

import P0.r;
import P0.w;
import P0.z;
import p1.q;

public final class D implements H {

    /* renamed from: a  reason: collision with root package name */
    public final C f5689a;

    /* renamed from: b  reason: collision with root package name */
    public final r f5690b = new r(32);

    /* renamed from: c  reason: collision with root package name */
    public int f5691c;

    /* renamed from: d  reason: collision with root package name */
    public int f5692d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5693f;

    public D(C c8) {
        this.f5689a = c8;
    }

    public final void a() {
        this.f5693f = true;
    }

    public final void b(w wVar, q qVar, G g8) {
        this.f5689a.b(wVar, qVar, g8);
        this.f5693f = true;
    }

    public final void c(int i, r rVar) {
        boolean z;
        int i8;
        boolean z6;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i8 = rVar.f3733b + rVar.v();
        } else {
            i8 = -1;
        }
        if (this.f5693f) {
            if (z) {
                this.f5693f = false;
                rVar.H(i8);
                this.f5692d = 0;
            } else {
                return;
            }
        }
        while (rVar.a() > 0) {
            int i9 = this.f5692d;
            r rVar2 = this.f5690b;
            if (i9 < 3) {
                if (i9 == 0) {
                    int v4 = rVar.v();
                    rVar.H(rVar.f3733b - 1);
                    if (v4 == 255) {
                        this.f5693f = true;
                        return;
                    }
                }
                int min = Math.min(rVar.a(), 3 - this.f5692d);
                rVar.g(rVar2.f3732a, this.f5692d, min);
                int i10 = this.f5692d + min;
                this.f5692d = i10;
                if (i10 == 3) {
                    rVar2.H(0);
                    rVar2.G(3);
                    rVar2.I(1);
                    int v8 = rVar2.v();
                    int v9 = rVar2.v();
                    if ((v8 & 128) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.e = z6;
                    int i11 = (((v8 & 15) << 8) | v9) + 3;
                    this.f5691c = i11;
                    byte[] bArr = rVar2.f3732a;
                    if (bArr.length < i11) {
                        rVar2.b(Math.min(4098, Math.max(i11, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(rVar.a(), this.f5691c - this.f5692d);
                rVar.g(rVar2.f3732a, this.f5692d, min2);
                int i12 = this.f5692d + min2;
                this.f5692d = i12;
                int i13 = this.f5691c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.e) {
                        rVar2.G(i13);
                    } else if (z.l(0, i13, -1, rVar2.f3732a) != 0) {
                        this.f5693f = true;
                        return;
                    } else {
                        rVar2.G(this.f5691c - 4);
                    }
                    rVar2.H(0);
                    this.f5689a.e(rVar2);
                    this.f5692d = 0;
                }
            }
        }
    }
}
