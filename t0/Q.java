package T0;

import U0.d;
import android.util.Pair;
import g1.g;
import h1.C1031B;
import h1.C1053t;

public final /* synthetic */ class Q implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4718U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ T f4719V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Pair f4720W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1053t f4721X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g f4722Y;

    public /* synthetic */ Q(T t8, Pair pair, C1053t tVar, g gVar, int i) {
        this.f4718U = i;
        this.f4719V = t8;
        this.f4720W = pair;
        this.f4721X = tVar;
        this.f4722Y = gVar;
    }

    public final void run() {
        switch (this.f4718U) {
            case 0:
                Pair pair = this.f4720W;
                ((d) this.f4719V.f4730V.i).g(((Integer) pair.first).intValue(), (C1031B) pair.second, this.f4721X, this.f4722Y);
                return;
            case 1:
                Pair pair2 = this.f4720W;
                ((d) this.f4719V.f4730V.i).x(((Integer) pair2.first).intValue(), (C1031B) pair2.second, this.f4721X, this.f4722Y);
                return;
            default:
                Pair pair3 = this.f4720W;
                ((d) this.f4719V.f4730V.i).r(((Integer) pair3.first).intValue(), (C1031B) pair3.second, this.f4721X, this.f4722Y);
                return;
        }
    }
}
