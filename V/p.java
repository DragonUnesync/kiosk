package v;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15861U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ q f15862V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f15863W;

    public /* synthetic */ p(q qVar, String str, int i) {
        this.f15861U = i;
        this.f15862V = qVar;
        this.f15863W = str;
    }

    public final void run() {
        switch (this.f15861U) {
            case 0:
                this.f15862V.f15865b.onCameraAvailable(this.f15863W);
                return;
            default:
                this.f15862V.f15865b.onCameraUnavailable(this.f15863W);
                return;
        }
    }
}
