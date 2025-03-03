package n1;

import B.B;
import B7.g;
import P0.z;
import T0.C0232y;
import U0.a;
import U0.d;
import V0.i;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ i f13708U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f13709V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ long f13710W;

    public /* synthetic */ x(i iVar, Object obj, long j7) {
        this.f13708U = iVar;
        this.f13709V = obj;
        this.f13710W = j7;
    }

    public final void run() {
        i iVar = this.f13708U;
        iVar.getClass();
        int i = z.f3748a;
        C0232y yVar = iVar.f5528c.f4905U;
        d dVar = yVar.f4958m0;
        a K4 = dVar.K();
        long j7 = this.f13710W;
        Object obj = this.f13709V;
        dVar.L(K4, 26, new B(K4, obj, j7));
        if (yVar.f4922K0 == obj) {
            yVar.f4952g0.e(26, new g(18));
        }
    }
}
