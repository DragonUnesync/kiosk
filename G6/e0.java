package g6;

import e6.J;
import e6.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class e0 {
    public static long getUnsafeOffset(Class<? extends J> cls, String str) {
        try {
            if (Y.hasUnsafe()) {
                return Y.objectFieldOffset(cls.getDeclaredField(str));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean nonFinalRelease0(J j7, int i, int i8, int i9) {
        if (i >= i9 || !updater().compareAndSet(j7, i8, i8 - (i << 1))) {
            return retryRelease0(j7, i);
        }
        return false;
    }

    private int nonVolatileRawCnt(J j7) {
        long unsafeOffset = unsafeOffset();
        if (unsafeOffset != -1) {
            return Y.getInt((Object) j7, unsafeOffset);
        }
        return updater().get(j7);
    }

    private static int realRefCnt(int i) {
        if (i == 2 || i == 4 || (i & 1) == 0) {
            return i >>> 1;
        }
        return 0;
    }

    private J retain0(J j7, int i, int i8) {
        int andAdd = updater().getAndAdd(j7, i8);
        if (andAdd != 2 && andAdd != 4 && (andAdd & 1) != 0) {
            throw new r(0, i);
        } else if ((andAdd > 0 || andAdd + i8 < 0) && (andAdd < 0 || andAdd + i8 >= andAdd)) {
            return j7;
        } else {
            updater().getAndAdd(j7, -i8);
            throw new r(realRefCnt(andAdd), i);
        }
    }

    private boolean retryRelease0(J j7, int i) {
        while (true) {
            int i8 = updater().get(j7);
            int liveRealRefCnt = toLiveRealRefCnt(i8, i);
            if (i == liveRealRefCnt) {
                if (tryFinalRelease0(j7, i8)) {
                    return true;
                }
            } else if (i >= liveRealRefCnt) {
                throw new r(liveRealRefCnt, -i);
            } else if (updater().compareAndSet(j7, i8, i8 - (i << 1))) {
                return false;
            }
            Thread.yield();
        }
    }

    private static int toLiveRealRefCnt(int i, int i8) {
        if (i == 2 || i == 4 || (i & 1) == 0) {
            return i >>> 1;
        }
        throw new r(0, -i8);
    }

    private boolean tryFinalRelease0(J j7, int i) {
        return updater().compareAndSet(j7, i, 1);
    }

    public final int initialValue() {
        return 2;
    }

    public final boolean isLiveNonVolatile(J j7) {
        int i;
        long unsafeOffset = unsafeOffset();
        if (unsafeOffset != -1) {
            i = Y.getInt((Object) j7, unsafeOffset);
        } else {
            i = updater().get(j7);
        }
        if (i == 2 || i == 4 || i == 6 || i == 8 || (i & 1) == 0) {
            return true;
        }
        return false;
    }

    public final int refCnt(J j7) {
        return realRefCnt(updater().get(j7));
    }

    public final boolean release(J j7) {
        int nonVolatileRawCnt = nonVolatileRawCnt(j7);
        if (nonVolatileRawCnt != 2) {
            return nonFinalRelease0(j7, 1, nonVolatileRawCnt, toLiveRealRefCnt(nonVolatileRawCnt, 1));
        }
        if (tryFinalRelease0(j7, 2) || retryRelease0(j7, 1)) {
            return true;
        }
        return false;
    }

    public final void resetRefCnt(J j7) {
        updater().lazySet(j7, initialValue());
    }

    public final J retain(J j7) {
        return retain0(j7, 1, 2);
    }

    public void setInitialValue(J j7) {
        long unsafeOffset = unsafeOffset();
        if (unsafeOffset == -1) {
            updater().set(j7, initialValue());
        } else {
            Y.safeConstructPutInt(j7, unsafeOffset, initialValue());
        }
    }

    public abstract long unsafeOffset();

    public abstract AtomicIntegerFieldUpdater<J> updater();

    public final boolean release(J j7, int i) {
        int nonVolatileRawCnt = nonVolatileRawCnt(j7);
        int liveRealRefCnt = toLiveRealRefCnt(nonVolatileRawCnt, B.checkPositive(i, "decrement"));
        if (i == liveRealRefCnt) {
            return tryFinalRelease0(j7, nonVolatileRawCnt) || retryRelease0(j7, i);
        }
        return nonFinalRelease0(j7, i, nonVolatileRawCnt, liveRealRefCnt);
    }
}
