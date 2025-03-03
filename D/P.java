package D;

import G.c;
import a0.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

public final class P implements c {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f842U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ j f843V;

    public /* synthetic */ P(j jVar, int i) {
        this.f842U = i;
        this.f843V = jVar;
    }

    public final void f(Object obj) {
        switch (this.f842U) {
            case 0:
                List list = (List) obj;
                list.getClass();
                this.f843V.a(new ArrayList(list));
                return;
            default:
                j jVar = this.f843V;
                try {
                    jVar.a(obj);
                    return;
                } catch (Throwable th) {
                    jVar.b(th);
                    return;
                }
        }
    }

    public final void z(Throwable th) {
        switch (this.f842U) {
            case 0:
                boolean z = th instanceof TimeoutException;
                j jVar = this.f843V;
                if (z) {
                    jVar.b(th);
                    return;
                } else {
                    jVar.a(Collections.emptyList());
                    return;
                }
            default:
                this.f843V.b(th);
                return;
        }
    }
}
