package p1;

import D2.j;
import P0.l;
import P0.z;

public final class x implements z {

    /* renamed from: a  reason: collision with root package name */
    public final j f14447a;

    /* renamed from: b  reason: collision with root package name */
    public final j f14448b;

    /* renamed from: c  reason: collision with root package name */
    public long f14449c;

    public x(long j7, long[] jArr, long[] jArr2) {
        boolean z;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f14447a = new j(length, 2);
            this.f14448b = new j(length, 2);
        } else {
            int i = length + 1;
            j jVar = new j(i, 2);
            this.f14447a = jVar;
            j jVar2 = new j(i, 2);
            this.f14448b = jVar2;
            jVar.i(0);
            jVar2.i(0);
        }
        this.f14447a.k(jArr);
        this.f14448b.k(jArr2);
        this.f14449c = j7;
    }

    public final void a(long j7, long j8) {
        j jVar = this.f14448b;
        int i = jVar.f1093U;
        j jVar2 = this.f14447a;
        if (i == 0 && j7 > 0) {
            jVar2.i(0);
            jVar.i(0);
        }
        jVar2.i(j8);
        jVar.i(j7);
    }

    public final boolean g() {
        if (this.f14448b.f1093U > 0) {
            return true;
        }
        return false;
    }

    public final y i(long j7) {
        j jVar = this.f14448b;
        if (jVar.f1093U == 0) {
            C1330A a8 = C1330A.f14318c;
            return new y(a8, a8);
        }
        int b8 = z.b(jVar, j7);
        long n4 = jVar.n(b8);
        j jVar2 = this.f14447a;
        C1330A a9 = new C1330A(n4, jVar2.n(b8));
        if (n4 == j7 || b8 == jVar.f1093U - 1) {
            return new y(a9, a9);
        }
        int i = b8 + 1;
        return new y(a9, new C1330A(jVar.n(i), jVar2.n(i)));
    }

    public final long k() {
        return this.f14449c;
    }
}
