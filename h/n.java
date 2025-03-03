package h;

import F.a;
import a1.C0412c;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class n implements Executor {

    /* renamed from: U  reason: collision with root package name */
    public final Object f12217U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final ArrayDeque f12218V = new ArrayDeque();

    /* renamed from: W  reason: collision with root package name */
    public final a f12219W;

    /* renamed from: X  reason: collision with root package name */
    public Runnable f12220X;

    public n(a aVar) {
        this.f12219W = aVar;
    }

    public final void a() {
        synchronized (this.f12217U) {
            try {
                Runnable runnable = (Runnable) this.f12218V.poll();
                this.f12220X = runnable;
                if (runnable != null) {
                    this.f12219W.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f12217U) {
            try {
                this.f12218V.add(new C0412c((Object) this, 8, (Object) runnable));
                if (this.f12220X == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
