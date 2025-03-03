package S5;

import e6.P;
import e6.U;
import g6.B;
import g6.C0984q;
import g6.Y;
import g6.n0;

/* renamed from: S5.c  reason: case insensitive filesystem */
public abstract class C0163c implements C0187o {
    private final boolean directByDefault;
    private final C0185n emptyBuf;

    static {
        P.addExclusions(C0163c.class, "toLeakAwareBuffer");
    }

    public C0163c(boolean z) {
        boolean z6;
        if (!z || !Y.hasUnsafe()) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.directByDefault = z6;
        this.emptyBuf = new H(this);
    }

    public static C0185n toLeakAwareBuffer(C0185n nVar) {
        C0185n z0Var;
        U track;
        int i = C0161b.$SwitchMap$io$netty$util$ResourceLeakDetector$Level[P.getLevel().ordinal()];
        if (i == 1) {
            U track2 = C0159a.leakDetector.track(nVar);
            if (track2 == null) {
                return nVar;
            }
            z0Var = new z0(nVar, track2);
        } else if ((i != 2 && i != 3) || (track = C0159a.leakDetector.track(nVar)) == null) {
            return nVar;
        } else {
            z0Var = new C0181l(nVar, track);
        }
        return z0Var;
    }

    private static void validate(int i, int i8) {
        B.checkPositiveOrZero(i, "initialCapacity");
        if (i > i8) {
            throw new IllegalArgumentException(String.format("initialCapacity: %d (expected: not greater than maxCapacity(%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i8)}));
        }
    }

    public C0185n buffer(int i) {
        if (this.directByDefault) {
            return directBuffer(i);
        }
        return heapBuffer(i);
    }

    public int calculateNewCapacity(int i, int i8) {
        B.checkPositiveOrZero(i, "minNewCapacity");
        if (i > i8) {
            throw new IllegalArgumentException(String.format("minNewCapacity: %d (expected: not greater than maxCapacity(%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i8)}));
        } else if (i == 4194304) {
            return 4194304;
        } else {
            if (i <= 4194304) {
                return Math.min(C0984q.findNextPositivePowerOfTwo(Math.max(i, 64)), i8);
            }
            int i9 = (i / 4194304) * 4194304;
            if (i9 > i8 - 4194304) {
                return i8;
            }
            return i9 + 4194304;
        }
    }

    public E compositeBuffer(int i) {
        if (this.directByDefault) {
            return compositeDirectBuffer(i);
        }
        return compositeHeapBuffer(i);
    }

    public E compositeDirectBuffer(int i) {
        return toLeakAwareBuffer(new E(this, true, i));
    }

    public E compositeHeapBuffer(int i) {
        return toLeakAwareBuffer(new E(this, false, i));
    }

    public C0185n directBuffer(int i) {
        return directBuffer(i, Integer.MAX_VALUE);
    }

    public C0185n heapBuffer(int i) {
        return heapBuffer(i, Integer.MAX_VALUE);
    }

    public C0185n ioBuffer(int i) {
        if (Y.hasUnsafe() || isDirectBufferPooled()) {
            return directBuffer(i);
        }
        return heapBuffer(i);
    }

    public abstract C0185n newDirectBuffer(int i, int i8);

    public abstract C0185n newHeapBuffer(int i, int i8);

    public String toString() {
        return n0.simpleClassName((Object) this) + "(directByDefault: " + this.directByDefault + ')';
    }

    public C0185n directBuffer(int i, int i8) {
        if (i == 0 && i8 == 0) {
            return this.emptyBuf;
        }
        validate(i, i8);
        return newDirectBuffer(i, i8);
    }

    public C0185n heapBuffer(int i, int i8) {
        if (i == 0 && i8 == 0) {
            return this.emptyBuf;
        }
        validate(i, i8);
        return newHeapBuffer(i, i8);
    }

    public C0185n buffer(int i, int i8) {
        if (this.directByDefault) {
            return directBuffer(i, i8);
        }
        return heapBuffer(i, i8);
    }

    public C0185n ioBuffer(int i, int i8) {
        if (Y.hasUnsafe() || isDirectBufferPooled()) {
            return directBuffer(i, i8);
        }
        return heapBuffer(i, i8);
    }

    public static E toLeakAwareBuffer(E e) {
        E a02;
        U track;
        int i = C0161b.$SwitchMap$io$netty$util$ResourceLeakDetector$Level[P.getLevel().ordinal()];
        if (i == 1) {
            U track2 = C0159a.leakDetector.track(e);
            if (track2 == null) {
                return e;
            }
            a02 = new A0(e, track2);
        } else if ((i != 2 && i != 3) || (track = C0159a.leakDetector.track(e)) == null) {
            return e;
        } else {
            a02 = new C0183m(e, track);
        }
        return a02;
    }
}
