package P5;

import de.ozerov.fully.C0783u1;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3924U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0155s f3925V;

    public /* synthetic */ t(C0155s sVar, int i) {
        this.f3924U = i;
        this.f3925V = sVar;
    }

    public final void run() {
        switch (this.f3924U) {
            case 0:
                C0155s sVar = this.f3925V;
                C0783u1.b(sVar.f3879b, sVar.f3921v, sVar.f3922w);
                if (sVar.f3879b.w()) {
                    sVar.f3879b.runOnUiThread(new t(sVar, 1));
                    return;
                }
                return;
            default:
                this.f3925V.f3879b.f9952o1.b();
                return;
        }
    }
}
