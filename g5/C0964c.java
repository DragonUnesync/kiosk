package g5;

import java.util.concurrent.CompletableFuture;
import m6.b;

/* renamed from: g5.c  reason: case insensitive filesystem */
public abstract class C0964c extends CompletableFuture {

    /* renamed from: U  reason: collision with root package name */
    public volatile b f12020U;

    /* renamed from: V  reason: collision with root package name */
    public volatile boolean f12021V;

    public final void a(Throwable th) {
        if (!this.f12021V) {
            completeExceptionally(th);
        }
    }

    public final void c(b bVar) {
        this.f12020U = bVar;
        if (this.f12021V) {
            bVar.d();
        }
    }

    public final boolean cancel(boolean z) {
        this.f12021V = true;
        b bVar = this.f12020U;
        if (bVar != null) {
            bVar.d();
        }
        return super.cancel(z);
    }
}
