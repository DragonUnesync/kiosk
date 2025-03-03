package o6;

import g7.C0996d;
import java.util.concurrent.atomic.AtomicReference;
import m6.b;
import p6.C1345a;

/* renamed from: o6.a  reason: case insensitive filesystem */
public enum C1325a implements b {
    ;

    public static void a(AtomicReference atomicReference) {
        b bVar;
        b bVar2 = (b) atomicReference.get();
        C1325a aVar = f14275U;
        if (bVar2 != aVar && (bVar = (b) atomicReference.getAndSet(aVar)) != aVar && bVar != null) {
            bVar.d();
        }
    }

    public static void b(AtomicReference atomicReference, b bVar) {
        while (true) {
            b bVar2 = (b) atomicReference.get();
            if (bVar2 != f14275U) {
                while (true) {
                    if (!atomicReference.compareAndSet(bVar2, bVar)) {
                        if (atomicReference.get() != bVar2) {
                        }
                    } else {
                        return;
                    }
                }
            } else if (bVar != null) {
                bVar.d();
                return;
            } else {
                return;
            }
        }
    }

    public static boolean c(AtomicReference atomicReference, b bVar) {
        C1345a.a(bVar, "d is null");
        while (!atomicReference.compareAndSet((Object) null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.d();
                if (atomicReference.get() == f14275U) {
                    return false;
                }
                C0996d.s(new IllegalStateException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public final void d() {
    }
}
