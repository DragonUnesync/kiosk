package F;

import W2.m;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: V  reason: collision with root package name */
    public static volatile a f1390V;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1391U;

    public /* synthetic */ a(int i) {
        this.f1391U = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.f1391U) {
            case 0:
                runnable.run();
                return;
            case 1:
                m.f().post(runnable);
                return;
            case 2:
                runnable.run();
                return;
            default:
                new Thread(runnable).start();
                return;
        }
    }
}
