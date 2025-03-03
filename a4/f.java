package A4;

import T5.C0260n;
import T5.K;
import f6.C0916f;
import f6.Z;
import java.util.concurrent.TimeUnit;

public final class f implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final K f109U;

    /* renamed from: V  reason: collision with root package name */
    public final a f110V;

    /* renamed from: W  reason: collision with root package name */
    public final Z f111W;

    public f(K k8, a aVar) {
        this.f109U = k8;
        this.f110V = aVar;
        this.f111W = ((C0916f) k8.eventLoop()).schedule((Runnable) this, 10, TimeUnit.SECONDS);
    }

    public final void run() {
        ((C0260n) this.f109U).close();
    }
}
