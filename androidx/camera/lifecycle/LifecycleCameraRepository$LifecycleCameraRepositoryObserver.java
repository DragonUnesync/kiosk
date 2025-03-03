package androidx.camera.lifecycle;

import androidx.lifecycle.B;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.util.Set;

class LifecycleCameraRepository$LifecycleCameraRepositoryObserver implements q {

    /* renamed from: U  reason: collision with root package name */
    public final b f7660U;

    /* renamed from: V  reason: collision with root package name */
    public final r f7661V;

    public LifecycleCameraRepository$LifecycleCameraRepositoryObserver(r rVar, b bVar) {
        this.f7661V = rVar;
        this.f7660U = bVar;
    }

    @B(C0485l.ON_DESTROY)
    public void onDestroy(r rVar) {
        b bVar = this.f7660U;
        synchronized (bVar.f7664a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver c8 = bVar.c(rVar);
                if (c8 != null) {
                    bVar.h(rVar);
                    for (a remove : (Set) bVar.f7666c.get(c8)) {
                        bVar.f7665b.remove(remove);
                    }
                    bVar.f7666c.remove(c8);
                    c8.f7661V.e().f(c8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B(C0485l.ON_START)
    public void onStart(r rVar) {
        this.f7660U.g(rVar);
    }

    @B(C0485l.ON_STOP)
    public void onStop(r rVar) {
        this.f7660U.h(rVar);
    }
}
