package M;

import D7.b;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2743U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ k f2744V;

    public /* synthetic */ f(k kVar, int i) {
        this.f2743U = i;
        this.f2744V = kVar;
    }

    public final void run() {
        switch (this.f2743U) {
            case 0:
                k kVar = this.f2744V;
                kVar.getClass();
                b.H().execute(new f(kVar, 1));
                return;
            default:
                k kVar2 = this.f2744V;
                if (!kVar2.f2770n) {
                    kVar2.d();
                    return;
                }
                return;
        }
    }
}
