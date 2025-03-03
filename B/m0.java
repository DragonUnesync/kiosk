package B;

import N.e;
import a0.j;
import a0.k;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class m0 implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f283U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f284V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f285W;

    public /* synthetic */ m0(AtomicReference atomicReference, String str, int i) {
        this.f283U = i;
        this.f284V = atomicReference;
        this.f285W = str;
    }

    public final Object h(j jVar) {
        switch (this.f283U) {
            case 0:
                this.f284V.set(jVar);
                return e.A(new StringBuilder(), this.f285W, "-cancellation");
            case 1:
                this.f284V.set(jVar);
                return e.A(new StringBuilder(), this.f285W, "-status");
            default:
                this.f284V.set(jVar);
                return e.A(new StringBuilder(), this.f285W, "-Surface");
        }
    }
}
