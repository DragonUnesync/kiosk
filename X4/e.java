package x4;

import com.bumptech.glide.g;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f16290U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ f f16291V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ g f16292W;

    public /* synthetic */ e(f fVar, g gVar, int i) {
        this.f16290U = i;
        this.f16291V = fVar;
        this.f16292W = gVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bumptech.glide.g, l5.b] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.bumptech.glide.g, l5.b] */
    public final void run() {
        switch (this.f16290U) {
            case 0:
                f fVar = this.f16291V;
                fVar.getClass();
                fVar.a(new g("Session expired as connection was closed.", this.f16292W));
                return;
            default:
                f fVar2 = this.f16291V;
                if (fVar2.e != null) {
                    fVar2.e = null;
                    fVar2.a(new g("Session expired after expiry interval", this.f16292W));
                    return;
                }
                return;
        }
    }
}
