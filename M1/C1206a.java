package m1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l1.j;

/* renamed from: m1.a  reason: case insensitive filesystem */
public final class C1206a implements Executor {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f13341U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ j f13342V;

    public C1206a(ExecutorService executorService, j jVar) {
        this.f13341U = executorService;
        this.f13342V = jVar;
    }

    public final void execute(Runnable runnable) {
        this.f13341U.execute(runnable);
    }
}
