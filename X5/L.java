package X5;

import T5.C0267q0;
import T5.C0274u0;
import T5.Y;
import e6.I;
import f6.O;
import g6.A0;
import g6.n0;
import java.util.List;

public abstract class L extends C0267q0 {
    private final A0 matcher = A0.find(this, L.class, "I");

    private static void writePromiseCombiner(Y y8, C0360k kVar, C0274u0 u0Var) {
        O o2 = new O(y8.executor());
        for (int i = 0; i < kVar.size(); i++) {
            o2.add(y8.write(kVar.getUnsafe(i)));
        }
        o2.finish(u0Var);
    }

    private static void writeVoidPromise(Y y8, C0360k kVar) {
        C0274u0 voidPromise = y8.voidPromise();
        for (int i = 0; i < kVar.size(); i++) {
            y8.write(kVar.getUnsafe(i), voidPromise);
        }
    }

    public boolean acceptOutboundMessage(Object obj) {
        return this.matcher.match(obj);
    }

    public abstract void encode(Y y8, Object obj, List<Object> list);

    public void write(Y y8, Object obj, C0274u0 u0Var) {
        C0360k kVar = null;
        try {
            if (acceptOutboundMessage(obj)) {
                kVar = C0360k.newInstance();
                try {
                    encode(y8, obj, kVar);
                } catch (Throwable th) {
                    I.safeRelease(obj);
                    g6.Y.throwException(th);
                }
                I.release(obj);
                if (kVar.isEmpty()) {
                    throw new B(n0.simpleClassName((Object) this) + " must produce at least one message.");
                }
            } else {
                y8.write(obj, u0Var);
            }
            if (kVar != null) {
                try {
                    int size = kVar.size() - 1;
                    if (size == 0) {
                        y8.write(kVar.getUnsafe(0), u0Var);
                    } else if (size > 0) {
                        if (u0Var == y8.voidPromise()) {
                            writeVoidPromise(y8, kVar);
                        } else {
                            writePromiseCombiner(y8, kVar, u0Var);
                        }
                    }
                } finally {
                    kVar.recycle();
                }
            }
        } catch (B e) {
            throw e;
        } catch (Throwable th2) {
            if (kVar != null) {
                try {
                    int size2 = kVar.size() - 1;
                    if (size2 == 0) {
                        y8.write(kVar.getUnsafe(0), u0Var);
                    } else if (size2 > 0) {
                        if (u0Var == y8.voidPromise()) {
                            writeVoidPromise(y8, kVar);
                        } else {
                            writePromiseCombiner(y8, kVar, u0Var);
                        }
                    }
                } finally {
                    kVar.recycle();
                }
            }
            throw th2;
        }
    }
}
