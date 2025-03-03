package J1;

import K1.g;
import P0.l;
import de.ozerov.fully.K2;
import l1.C1171a;
import p1.s;
import p1.t;
import p1.z;

public final class b implements g {

    /* renamed from: U  reason: collision with root package name */
    public long f2347U;

    /* renamed from: V  reason: collision with root package name */
    public long f2348V;

    /* renamed from: W  reason: collision with root package name */
    public Object f2349W;

    /* renamed from: X  reason: collision with root package name */
    public Object f2350X;

    public b(int i, long j7) {
        l.j(((C1171a) this.f2349W) == null);
        this.f2347U = j7;
        this.f2348V = j7 + ((long) i);
    }

    public z g() {
        boolean z;
        if (this.f2347U != -1) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        return new s((t) this.f2349W, this.f2347U, 0);
    }

    public long h(p1.l lVar) {
        long j7 = this.f2348V;
        if (j7 < 0) {
            return -1;
        }
        long j8 = -(j7 + 2);
        this.f2348V = -1;
        return j8;
    }

    public void p(long j7) {
        long[] jArr = (long[]) ((K2) this.f2350X).f10050V;
        this.f2348V = jArr[P0.z.e(jArr, j7, true)];
    }

    public b(String str, byte[] bArr, long j7, long j8) {
        this.f2349W = str;
        this.f2350X = bArr;
        this.f2347U = j7;
        this.f2348V = j8;
    }
}
