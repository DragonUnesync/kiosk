package K1;

import java.math.BigInteger;
import p1.C1330A;
import p1.y;
import p1.z;

public final class a implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2537a;

    public a(b bVar) {
        this.f2537a = bVar;
    }

    public final boolean g() {
        return true;
    }

    public final y i(long j7) {
        long j8 = j7;
        b bVar = this.f2537a;
        BigInteger valueOf = BigInteger.valueOf((((long) bVar.f2541X.i) * j8) / 1000000);
        long j9 = bVar.f2540W;
        long j10 = bVar.f2539V;
        C1330A a8 = new C1330A(j8, P0.z.j((valueOf.multiply(BigInteger.valueOf(j9 - j10)).divide(BigInteger.valueOf(bVar.f2543Z)).longValue() + j10) - 30000, bVar.f2539V, j9 - 1));
        return new y(a8, a8);
    }

    public final long k() {
        b bVar = this.f2537a;
        return (bVar.f2543Z * 1000000) / ((long) bVar.f2541X.i);
    }
}
