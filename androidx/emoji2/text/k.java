package androidx.emoji2.text;

import B.C0003d;
import B3.q;
import java.util.concurrent.ThreadPoolExecutor;

public final class k extends C0003d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0003d f7800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f7801b;

    public k(C0003d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f7800a = dVar;
        this.f7801b = threadPoolExecutor;
    }

    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f7801b;
        try {
            this.f7800a.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void C(q qVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f7801b;
        try {
            this.f7800a.C(qVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
