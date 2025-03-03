package G;

import C0.e;
import D.P;
import L3.b;
import a0.j;
import a0.n;
import com.bumptech.glide.d;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import n2.a;

public abstract class i {
    public static Object a(b bVar) {
        boolean isDone = bVar.isDone();
        a.m("Future was expected to be done, " + bVar, isDone);
        return b(bVar);
    }

    public static Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static k c(Object obj) {
        if (obj == null) {
            return k.f1612W;
        }
        return new k(0, obj);
    }

    public static b d(b bVar) {
        bVar.getClass();
        if (bVar.isDone()) {
            return bVar;
        }
        return d.i(new f(bVar, 1));
    }

    public static void e(boolean z, b bVar, j jVar, F.a aVar) {
        bVar.getClass();
        jVar.getClass();
        aVar.getClass();
        bVar.d(new h(bVar, 0, new P(jVar, 1)), aVar);
        if (z) {
            e eVar = new e(5, bVar);
            F.a l8 = D7.b.l();
            n nVar = jVar.f7013c;
            if (nVar != null) {
                nVar.d(eVar, l8);
            }
        }
    }

    public static b f(b bVar, a aVar, Executor executor) {
        b bVar2 = new b(aVar, bVar);
        bVar.d(bVar2, executor);
        return bVar2;
    }
}
