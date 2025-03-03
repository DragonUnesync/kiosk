package X0;

import B.q0;
import J3.a;
import M0.r;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

public final class p extends n {

    /* renamed from: j  reason: collision with root package name */
    public final q0 f6268j;

    /* renamed from: k  reason: collision with root package name */
    public final q0 f6269k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6270l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(j jVar, long j7, long j8, long j9, long j10, long j11, List list, long j12, q0 q0Var, q0 q0Var2, long j13, long j14) {
        super(jVar, j7, j8, j9, j11, list, j12, j13, j14);
        this.f6268j = q0Var;
        this.f6269k = q0Var2;
        this.f6270l = j10;
    }

    public final j a(m mVar) {
        q0 q0Var = this.f6268j;
        if (q0Var == null) {
            return this.f6274a;
        }
        r rVar = mVar.f6258U;
        return new j(0, -1, q0Var.i(rVar.f3025a, 0, rVar.f3032j, 0));
    }

    public final long d(long j7) {
        List list = this.f6264f;
        if (list != null) {
            return (long) list.size();
        }
        long j8 = this.f6270l;
        if (j8 != -1) {
            return (j8 - this.f6263d) + 1;
        }
        if (j7 == -9223372036854775807L) {
            return -1;
        }
        BigInteger multiply = BigInteger.valueOf(j7).multiply(BigInteger.valueOf(this.f6275b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = a.f2500a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    public final j h(k kVar, long j7) {
        long j8;
        long j9 = this.f6263d;
        List list = this.f6264f;
        if (list != null) {
            j8 = ((q) list.get((int) (j7 - j9))).f6271a;
        } else {
            j8 = (j7 - j9) * this.e;
        }
        long j10 = j8;
        r rVar = kVar.f6258U;
        return new j(0, -1, this.f6269k.i(rVar.f3025a, j7, rVar.f3032j, j10));
    }
}
