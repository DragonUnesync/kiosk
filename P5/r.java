package P5;

import de.ozerov.fully.g5;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0140c f3916U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ boolean f3917V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ boolean f3918W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ String f3919X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3920Y;

    public /* synthetic */ r(C0140c cVar, boolean z, boolean z6, String str, int i) {
        this.f3916U = cVar;
        this.f3917V = z;
        this.f3918W = z6;
        this.f3919X = str;
        this.f3920Y = i;
    }

    public final void run() {
        C0140c cVar = this.f3916U;
        boolean z = this.f3917V;
        boolean z6 = this.f3918W;
        String str = this.f3919X;
        if (z) {
            g5 f8 = cVar.f3879b.f9917F0.f(z6, false, false);
            if (f8 != null) {
                f8.g(str);
                return;
            }
            return;
        }
        int i = this.f3920Y;
        if (i > -1) {
            g5 l8 = cVar.f3879b.f9917F0.l(i);
            if (l8 != null) {
                l8.g(str);
                if (z6) {
                    cVar.f3879b.f9917F0.i(l8);
                    return;
                }
                return;
            }
            return;
        }
        cVar.f3879b.f9917F0.n(str, false);
    }
}
