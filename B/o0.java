package B;

import android.view.Surface;
import u0.C1486a;

public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f290U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1486a f291V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Surface f292W;

    public /* synthetic */ o0(C1486a aVar, Surface surface, int i) {
        this.f290U = i;
        this.f291V = aVar;
        this.f292W = surface;
    }

    public final void run() {
        switch (this.f290U) {
            case 0:
                this.f291V.accept(new C0009j(3, this.f292W));
                return;
            default:
                this.f291V.accept(new C0009j(4, this.f292W));
                return;
        }
    }
}
