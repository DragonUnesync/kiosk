package s6;

import B7.g;
import R.e;
import java.util.concurrent.Callable;
import l6.b;
import l6.c;
import x6.C1608a;

public final class f extends b {

    /* renamed from: V  reason: collision with root package name */
    public final Object f15154V;

    public f(Object obj, g gVar) {
        this.f15154V = obj;
    }

    public final void d(c cVar) {
        C1608a aVar = C1608a.f16319U;
        try {
            b bVar = (b) this.f15154V;
            if (bVar instanceof Callable) {
                try {
                    Object call = ((Callable) bVar).call();
                    if (call == null) {
                        cVar.e(aVar);
                        cVar.b();
                        return;
                    }
                    cVar.e(new x6.b(cVar, call));
                } catch (Throwable th) {
                    e.v(th);
                    cVar.e(aVar);
                    cVar.a(th);
                }
            } else {
                bVar.a(cVar);
            }
        } catch (Throwable th2) {
            cVar.e(aVar);
            cVar.a(th2);
        }
    }
}
