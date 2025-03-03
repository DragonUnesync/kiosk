package p1;

import P0.l;
import P0.z;
import de.ozerov.fully.K2;
import r1.b;
import r1.e;

public class s implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14420a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14421b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14422c;

    public /* synthetic */ s(Object obj, long j7, int i) {
        this.f14420a = i;
        this.f14422c = obj;
        this.f14421b = j7;
    }

    public final boolean g() {
        switch (this.f14420a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public final y i(long j7) {
        long j8;
        switch (this.f14420a) {
            case 0:
                t tVar = (t) this.f14422c;
                l.k(tVar.f14431k);
                K2 k22 = tVar.f14431k;
                long[] jArr = (long[]) k22.f10050V;
                int e = z.e(jArr, z.j((((long) tVar.e) * j7) / 1000000, 0, tVar.f14430j - 1), false);
                long j9 = 0;
                if (e == -1) {
                    j8 = 0;
                } else {
                    j8 = jArr[e];
                }
                long[] jArr2 = (long[]) k22.f10051W;
                if (e != -1) {
                    j9 = jArr2[e];
                }
                int i = tVar.e;
                long j10 = (j8 * 1000000) / ((long) i);
                long j11 = this.f14421b;
                C1330A a8 = new C1330A(j10, j9 + j11);
                if (j10 == j7 || e == jArr.length - 1) {
                    return new y(a8, a8);
                }
                int i8 = e + 1;
                return new y(a8, new C1330A((jArr[i8] * 1000000) / ((long) i), j11 + jArr2[i8]));
            case 1:
                return (y) this.f14422c;
            default:
                b bVar = (b) this.f14422c;
                y b8 = bVar.i[0].b(j7);
                int i9 = 1;
                while (true) {
                    e[] eVarArr = bVar.i;
                    if (i9 >= eVarArr.length) {
                        return b8;
                    }
                    y b9 = eVarArr[i9].b(j7);
                    if (b9.f14450a.f14320b < b8.f14450a.f14320b) {
                        b8 = b9;
                    }
                    i9++;
                }
        }
    }

    public final long k() {
        switch (this.f14420a) {
            case 0:
                return ((t) this.f14422c).b();
            case 1:
                return this.f14421b;
            default:
                return this.f14421b;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(long j7) {
        this(j7, 0);
        this.f14420a = 1;
    }

    public s(long j7, long j8) {
        this.f14420a = 1;
        this.f14421b = j7;
        C1330A a8 = j8 == 0 ? C1330A.f14318c : new C1330A(0, j8);
        this.f14422c = new y(a8, a8);
    }
}
