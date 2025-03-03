package y6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import n6.b;

/* renamed from: y6.a  reason: case insensitive filesystem */
public final class C1636a extends AtomicReference {
    public final boolean a(Throwable th) {
        Throwable th2;
        C1637b bVar = C1638c.f16399a;
        while (true) {
            Throwable th3 = (Throwable) get();
            if (th3 == C1638c.f16399a) {
                return false;
            }
            if (th3 == null) {
                th2 = th;
            } else {
                th2 = new b(Arrays.asList(new Throwable[]{th3, th}));
            }
            while (true) {
                if (compareAndSet(th3, th2)) {
                    return true;
                }
                if (get() != th3) {
                }
            }
        }
    }

    public final Throwable b() {
        C1637b bVar = C1638c.f16399a;
        Throwable th = (Throwable) get();
        C1637b bVar2 = C1638c.f16399a;
        if (th != bVar2) {
            return (Throwable) getAndSet(bVar2);
        }
        return th;
    }
}
