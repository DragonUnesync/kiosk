package T0;

import U0.d;
import android.util.Pair;
import g1.g;
import h1.C1031B;

public final /* synthetic */ class P implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4714U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ T f4715V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Pair f4716W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ g f4717X;

    public /* synthetic */ P(T t8, Pair pair, g gVar, int i) {
        this.f4714U = i;
        this.f4715V = t8;
        this.f4716W = pair;
        this.f4717X = gVar;
    }

    public final void run() {
        switch (this.f4714U) {
            case 0:
                Pair pair = this.f4716W;
                int intValue = ((Integer) pair.first).intValue();
                C1031B b8 = (C1031B) pair.second;
                b8.getClass();
                ((d) this.f4715V.f4730V.i).u(intValue, b8, this.f4717X);
                return;
            default:
                Pair pair2 = this.f4716W;
                ((d) this.f4715V.f4730V.i).s(((Integer) pair2.first).intValue(), (C1031B) pair2.second, this.f4717X);
                return;
        }
    }
}
