package l1;

import H3.C0103u;
import H3.O;
import M1.m;
import U0.a;
import U0.d;
import h1.C1031B;
import u.C1455O;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ c f13097U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f13098V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ long f13099W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ long f13100X;

    public /* synthetic */ b(c cVar, int i, long j7, long j8) {
        this.f13097U = cVar;
        this.f13098V = i;
        this.f13099W = j7;
        this.f13100X = j8;
    }

    public final void run() {
        C1031B b8;
        d dVar = this.f13097U.f13102b;
        C1455O o2 = dVar.f5327X;
        if (((O) o2.f15530b).isEmpty()) {
            b8 = null;
        } else {
            b8 = (C1031B) C0103u.l((O) o2.f15530b);
        }
        a I8 = dVar.I(b8);
        a aVar = I8;
        dVar.L(I8, 1006, new m(aVar, this.f13098V, this.f13099W, this.f13100X));
    }
}
