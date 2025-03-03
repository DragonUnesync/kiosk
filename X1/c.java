package x1;

import P5.E;
import p1.C1330A;
import p1.u;
import p1.y;
import p1.z;

public final class c extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f16245b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f16246c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(E e, z zVar, z zVar2) {
        super(zVar);
        this.f16246c = e;
        this.f16245b = zVar2;
    }

    public final y i(long j7) {
        y i = this.f16245b.i(j7);
        C1330A a8 = i.f14450a;
        long j8 = a8.f14319a;
        long j9 = this.f16246c.f3809V;
        C1330A a9 = new C1330A(j8, a8.f14320b + j9);
        C1330A a10 = i.f14451b;
        return new y(a9, new C1330A(a10.f14319a, a10.f14320b + j9));
    }
}
