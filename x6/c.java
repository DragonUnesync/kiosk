package x6;

import N.e;
import V7.a;
import g7.C0996d;
import java.util.concurrent.atomic.AtomicReference;

public enum c implements a {
    ;

    public static void a(AtomicReference atomicReference) {
        a aVar;
        a aVar2 = (a) atomicReference.get();
        c cVar = f16323U;
        if (aVar2 != cVar && (aVar = (a) atomicReference.getAndSet(cVar)) != cVar && aVar != null) {
            aVar.cancel();
        }
    }

    public static boolean b(AtomicReference atomicReference, a aVar) {
        while (!atomicReference.compareAndSet((Object) null, aVar)) {
            if (atomicReference.get() != null) {
                aVar.cancel();
                if (atomicReference.get() == f16323U) {
                    return false;
                }
                C0996d.s(new IllegalStateException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(long j7) {
        if (j7 > 0) {
            return true;
        }
        C0996d.s(new IllegalArgumentException(e.w("n > 0 required but it was ", j7)));
        return false;
    }

    public final void c(long j7) {
    }

    public final void cancel() {
    }
}
