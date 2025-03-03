package S5;

import N.e;
import Q0.g;
import java.util.concurrent.locks.ReentrantLock;

public final class W {
    private final long[] bitmap;
    private final int bitmapLength;
    final T chunk;
    boolean doNotDestroy;
    final int elemSize;
    private final ReentrantLock lock;
    private final int maxNumElems;
    W next;
    private int nextAvail;
    private int numAvail;
    private final int pageShifts;
    W prev;
    private final int runOffset;
    private final int runSize;

    public W() {
        this.chunk = null;
        this.lock = new ReentrantLock();
        this.pageShifts = -1;
        this.runOffset = -1;
        this.elemSize = -1;
        this.runSize = -1;
        this.bitmap = null;
        this.bitmapLength = -1;
        this.maxNumElems = 0;
    }

    private void addToPool(W w2) {
        this.prev = w2;
        W w4 = w2.next;
        this.next = w4;
        w4.prev = this;
        w2.next = this;
    }

    private int findNextAvail() {
        for (int i = 0; i < this.bitmapLength; i++) {
            long j7 = this.bitmap[i];
            if ((~j7) != 0) {
                return findNextAvail0(i, j7);
            }
        }
        return -1;
    }

    private int findNextAvail0(int i, long j7) {
        int i8 = i << 6;
        for (int i9 = 0; i9 < 64; i9++) {
            if ((1 & j7) == 0) {
                int i10 = i8 | i9;
                if (i10 < this.maxNumElems) {
                    return i10;
                }
                return -1;
            }
            j7 >>>= 1;
        }
        return -1;
    }

    private int getNextAvail() {
        int i = this.nextAvail;
        if (i < 0) {
            return findNextAvail();
        }
        this.nextAvail = -1;
        return i;
    }

    private void removeFromPool() {
        W w2 = this.prev;
        w2.next = this.next;
        this.next.prev = w2;
        this.next = null;
        this.prev = null;
    }

    private void setNextAvail(int i) {
        this.nextAvail = i;
    }

    private long toHandle(int i) {
        return (((long) this.runOffset) << 49) | (((long) (this.runSize >> this.pageShifts)) << 34) | 12884901888L | ((long) i);
    }

    public long allocate() {
        if (this.numAvail == 0 || !this.doNotDestroy) {
            return -1;
        }
        int nextAvail2 = getNextAvail();
        if (nextAvail2 >= 0) {
            int i = nextAvail2 >>> 6;
            long[] jArr = this.bitmap;
            jArr[i] = jArr[i] | (1 << (nextAvail2 & 63));
            int i8 = this.numAvail - 1;
            this.numAvail = i8;
            if (i8 == 0) {
                removeFromPool();
            }
            return toHandle(nextAvail2);
        }
        removeFromPool();
        StringBuilder p3 = g.p(nextAvail2, "No next available bitmap index found (bitmapIdx = ", "), even though there are supposed to be (numAvail = ");
        p3.append(this.numAvail);
        p3.append(") out of (maxNumElems = ");
        throw new AssertionError(e.z(p3, this.maxNumElems, ") available indexes."));
    }

    public void destroy() {
        T t8 = this.chunk;
        if (t8 != null) {
            t8.destroy();
        }
    }

    public boolean free(W w2, int i) {
        int i8 = i >>> 6;
        long[] jArr = this.bitmap;
        jArr[i8] = jArr[i8] ^ (1 << (i & 63));
        setNextAvail(i);
        int i9 = this.numAvail;
        this.numAvail = i9 + 1;
        if (i9 == 0) {
            addToPool(w2);
            if (this.maxNumElems > 1) {
                return true;
            }
        }
        if (this.numAvail != this.maxNumElems || this.prev == this.next) {
            return true;
        }
        this.doNotDestroy = false;
        removeFromPool();
        return false;
    }

    public void lock() {
        this.lock.lock();
    }

    public String toString() {
        int i;
        T t8 = this.chunk;
        if (t8 == null) {
            i = 0;
        } else {
            t8.arena.lock();
            try {
                boolean z = this.doNotDestroy;
                int i8 = this.numAvail;
                if (!z) {
                    return e.z(new StringBuilder("("), this.runOffset, ": not in use)");
                }
                i = i8;
            } finally {
                this.chunk.arena.unlock();
            }
        }
        return "(" + this.runOffset + ": " + (this.maxNumElems - i) + '/' + this.maxNumElems + ", offset: " + this.runOffset + ", length: " + this.runSize + ", elemSize: " + this.elemSize + ')';
    }

    public void unlock() {
        this.lock.unlock();
    }

    public W(W w2, T t8, int i, int i8, int i9, int i10) {
        this.chunk = t8;
        this.pageShifts = i;
        this.runOffset = i8;
        this.runSize = i9;
        this.elemSize = i10;
        this.doNotDestroy = true;
        int i11 = i9 / i10;
        this.numAvail = i11;
        this.maxNumElems = i11;
        int i12 = i11 >>> 6;
        i12 = (i11 & 63) != 0 ? i12 + 1 : i12;
        this.bitmapLength = i12;
        this.bitmap = new long[i12];
        this.nextAvail = 0;
        this.lock = null;
        addToPool(w2);
    }
}
