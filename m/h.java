package M;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ k f2747U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f2748V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f2749W;

    public /* synthetic */ h(k kVar, int i, int i8) {
        this.f2747U = kVar;
        this.f2748V = i;
        this.f2749W = i8;
    }

    public final void run() {
        boolean z;
        k kVar = this.f2747U;
        int i = kVar.i;
        int i8 = this.f2748V;
        boolean z6 = true;
        if (i != i8) {
            kVar.i = i8;
            z = true;
        } else {
            z = false;
        }
        int i9 = kVar.f2765h;
        int i10 = this.f2749W;
        if (i9 != i10) {
            kVar.f2765h = i10;
        } else {
            z6 = z;
        }
        if (z6) {
            kVar.e();
        }
    }
}
