package G2;

import G.h;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {

    /* renamed from: U  reason: collision with root package name */
    public final b f1628U;

    /* renamed from: V  reason: collision with root package name */
    public final String f1629V;

    /* renamed from: W  reason: collision with root package name */
    public final d f1630W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f1631X;

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicInteger f1632Y = new AtomicInteger();

    public c(b bVar, String str, boolean z) {
        d dVar = d.f1633a;
        this.f1628U = bVar;
        this.f1629V = str;
        this.f1630W = dVar;
        this.f1631X = z;
    }

    public final Thread newThread(Runnable runnable) {
        h hVar = new h(2, this, runnable, false);
        this.f1628U.getClass();
        a aVar = new a((Runnable) hVar);
        aVar.setName("glide-" + this.f1629V + "-thread-" + this.f1632Y.getAndIncrement());
        return aVar;
    }
}
