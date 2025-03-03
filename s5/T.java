package S5;

import g6.C0982o;
import g6.Y;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.ReentrantLock;

public final class T {
    final S arena;
    final Object base;
    private final Deque<ByteBuffer> cachedNioBuffers;
    private final int chunkSize;
    int freeBytes;
    final Object memory;
    T next;
    private final int pageShifts;
    private final int pageSize;
    U parent;
    private final C0982o pinnedBytes = Y.newLongCounter();
    T prev;
    private final L[] runsAvail;
    private final ReentrantLock runsAvailLock;
    private final M runsAvailMap;
    private final W[] subpages;
    final boolean unpooled = true;

    public T(S s8, Object obj, Object obj2, int i, int i8, int i9, int i10) {
        this.arena = s8;
        this.base = obj;
        this.memory = obj2;
        this.pageSize = i;
        this.pageShifts = i8;
        this.chunkSize = i9;
        this.freeBytes = i9;
        this.runsAvail = newRunsAvailqueueArray(i10);
        this.runsAvailLock = new ReentrantLock();
        this.runsAvailMap = new M(-1);
        int i11 = i9 >> i8;
        this.subpages = new W[i11];
        insertAvailRun(0, i11, ((long) i11) << 34);
        this.cachedNioBuffers = new ArrayDeque(8);
    }

    /* JADX INFO: finally extract failed */
    private long allocateRun(int i) {
        int i8 = i >> this.pageShifts;
        int pages2pageIdx = this.arena.pages2pageIdx(i8);
        this.runsAvailLock.lock();
        try {
            int runFirstBestFit = runFirstBestFit(pages2pageIdx);
            if (runFirstBestFit == -1) {
                this.runsAvailLock.unlock();
                return -1;
            }
            long poll = ((long) this.runsAvail[runFirstBestFit].poll()) << 32;
            removeAvailRun0(poll);
            long splitLargeRun = splitLargeRun(poll, i8);
            this.freeBytes -= runSize(this.pageShifts, splitLargeRun);
            this.runsAvailLock.unlock();
            return splitLargeRun;
        } catch (Throwable th) {
            this.runsAvailLock.unlock();
            throw th;
        }
    }

    private long allocateSubpage(int i, W w2) {
        long allocateRun = allocateRun(calculateRunSize(i));
        if (allocateRun < 0) {
            return -1;
        }
        int runOffset = runOffset(allocateRun);
        int sizeIdx2size = this.arena.sizeIdx2size(i);
        int i8 = this.pageShifts;
        W w4 = new W(w2, this, i8, runOffset, runSize(i8, allocateRun), sizeIdx2size);
        this.subpages[runOffset] = w4;
        return w4.allocate();
    }

    public static int bitmapIdx(long j7) {
        return (int) j7;
    }

    private int calculateRunSize(int i) {
        int i8;
        int i9 = 1 << (this.pageShifts - 4);
        int sizeIdx2size = this.arena.sizeIdx2size(i);
        int i10 = 0;
        do {
            i10 += this.pageSize;
            i8 = i10 / sizeIdx2size;
            if (i8 >= i9 || i10 == i8 * sizeIdx2size) {
            }
            i10 += this.pageSize;
            i8 = i10 / sizeIdx2size;
            break;
        } while (i10 == i8 * sizeIdx2size);
        while (i8 > i9) {
            i10 -= this.pageSize;
            i8 = i10 / sizeIdx2size;
        }
        return i10;
    }

    private long collapseNext(long j7) {
        while (true) {
            int runOffset = runOffset(j7);
            int runPages = runPages(j7);
            int i = runOffset + runPages;
            long availRunByOffset = getAvailRunByOffset(i);
            if (availRunByOffset == -1) {
                return j7;
            }
            int runOffset2 = runOffset(availRunByOffset);
            int runPages2 = runPages(availRunByOffset);
            if (availRunByOffset == j7 || i != runOffset2) {
                return j7;
            }
            removeAvailRun(availRunByOffset);
            j7 = toRunHandle(runOffset, runPages + runPages2, 0);
        }
        return j7;
    }

    private long collapsePast(long j7) {
        while (true) {
            int runOffset = runOffset(j7);
            int runPages = runPages(j7);
            long availRunByOffset = getAvailRunByOffset(runOffset - 1);
            if (availRunByOffset == -1) {
                return j7;
            }
            int runOffset2 = runOffset(availRunByOffset);
            int runPages2 = runPages(availRunByOffset);
            if (availRunByOffset == j7 || runOffset2 + runPages2 != runOffset) {
                return j7;
            }
            removeAvailRun(availRunByOffset);
            j7 = toRunHandle(runOffset2, runPages2 + runPages, 0);
        }
        return j7;
    }

    private long collapseRuns(long j7) {
        return collapseNext(collapsePast(j7));
    }

    private long getAvailRunByOffset(int i) {
        return this.runsAvailMap.get((long) i);
    }

    private void insertAvailRun(int i, int i8, long j7) {
        this.runsAvail[this.arena.pages2pageIdxFloor(i8)].offer((int) (j7 >> 32));
        insertAvailRun0(i, j7);
        if (i8 > 1) {
            insertAvailRun0(lastPage(i, i8), j7);
        }
    }

    private void insertAvailRun0(int i, long j7) {
        this.runsAvailMap.put((long) i, j7);
    }

    public static boolean isSubpage(long j7) {
        if (((j7 >> 32) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static int lastPage(int i, int i8) {
        return (i + i8) - 1;
    }

    private static L[] newRunsAvailqueueArray(int i) {
        L[] lArr = new L[i];
        for (int i8 = 0; i8 < i; i8++) {
            lArr[i8] = new L();
        }
        return lArr;
    }

    private void removeAvailRun(long j7) {
        this.runsAvail[this.arena.pages2pageIdxFloor(runPages(j7))].remove((int) (j7 >> 32));
        removeAvailRun0(j7);
    }

    private void removeAvailRun0(long j7) {
        int runOffset = runOffset(j7);
        int runPages = runPages(j7);
        this.runsAvailMap.remove((long) runOffset);
        if (runPages > 1) {
            this.runsAvailMap.remove((long) lastPage(runOffset, runPages));
        }
    }

    private int runFirstBestFit(int i) {
        if (this.freeBytes == this.chunkSize) {
            return this.arena.nPSizes - 1;
        }
        while (i < this.arena.nPSizes) {
            L l8 = this.runsAvail[i];
            if (l8 != null && !l8.isEmpty()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int runOffset(long j7) {
        return (int) (j7 >> 49);
    }

    public static int runPages(long j7) {
        return (int) ((j7 >> 34) & 32767);
    }

    public static int runSize(int i, long j7) {
        return runPages(j7) << i;
    }

    private long splitLargeRun(long j7, int i) {
        int runPages = runPages(j7) - i;
        if (runPages <= 0) {
            return j7 | 8589934592L;
        }
        int runOffset = runOffset(j7);
        int i8 = runOffset + i;
        insertAvailRun(i8, runPages, toRunHandle(i8, runPages, 0));
        return toRunHandle(runOffset, i, 1);
    }

    private static long toRunHandle(int i, int i8, int i9) {
        return (((long) i8) << 34) | (((long) i) << 49) | (((long) i9) << 33);
    }

    private int usage(int i) {
        if (i == 0) {
            return 100;
        }
        int i8 = (int) ((((long) i) * 100) / ((long) this.chunkSize));
        if (i8 == 0) {
            return 99;
        }
        return 100 - i8;
    }

    public boolean allocate(C0170f0 f0Var, int i, int i8, C0168e0 e0Var) {
        long j7;
        ByteBuffer byteBuffer;
        int i9 = i8;
        S s8 = this.arena;
        if (i9 <= s8.smallMaxSizeIdx) {
            W findSubpagePoolHead = s8.findSubpagePoolHead(i9);
            findSubpagePoolHead.lock();
            try {
                W w2 = findSubpagePoolHead.next;
                if (w2 != findSubpagePoolHead) {
                    w2.chunk.initBufWithSubpage(f0Var, (ByteBuffer) null, w2.allocate(), i, e0Var);
                    return true;
                }
                long allocateSubpage = allocateSubpage(i9, findSubpagePoolHead);
                if (allocateSubpage < 0) {
                    findSubpagePoolHead.unlock();
                    return false;
                }
                findSubpagePoolHead.unlock();
                j7 = allocateSubpage;
            } finally {
                findSubpagePoolHead.unlock();
            }
        } else {
            long allocateRun = allocateRun(s8.sizeIdx2size(i9));
            if (allocateRun < 0) {
                return false;
            }
            j7 = allocateRun;
        }
        Deque<ByteBuffer> deque = this.cachedNioBuffers;
        if (deque != null) {
            byteBuffer = deque.pollLast();
        } else {
            byteBuffer = null;
        }
        initBuf(f0Var, byteBuffer, j7, i, e0Var);
        return true;
    }

    public int chunkSize() {
        return this.chunkSize;
    }

    public void decrementPinnedMemory(int i) {
        this.pinnedBytes.add((long) (-i));
    }

    public void destroy() {
        this.arena.destroyChunk(this);
    }

    public void free(long j7, int i, ByteBuffer byteBuffer) {
        Deque<ByteBuffer> deque;
        if (isSubpage(j7)) {
            W findSubpagePoolHead = this.arena.findSubpagePoolHead(this.arena.size2SizeIdx(i));
            int runOffset = runOffset(j7);
            W w2 = this.subpages[runOffset];
            findSubpagePoolHead.lock();
            try {
                if (!w2.free(findSubpagePoolHead, bitmapIdx(j7))) {
                    this.subpages[runOffset] = null;
                    findSubpagePoolHead.unlock();
                } else {
                    return;
                }
            } finally {
                findSubpagePoolHead.unlock();
            }
        }
        int runSize = runSize(this.pageShifts, j7);
        this.runsAvailLock.lock();
        try {
            long collapseRuns = collapseRuns(j7) & -12884901889L;
            insertAvailRun(runOffset(collapseRuns), runPages(collapseRuns), collapseRuns);
            this.freeBytes += runSize;
            if (byteBuffer != null && (deque = this.cachedNioBuffers) != null && deque.size() < C0176i0.DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK) {
                this.cachedNioBuffers.offer(byteBuffer);
            }
        } finally {
            this.runsAvailLock.unlock();
        }
    }

    public void incrementPinnedMemory(int i) {
        this.pinnedBytes.add((long) i);
    }

    public void initBuf(C0170f0 f0Var, ByteBuffer byteBuffer, long j7, int i, C0168e0 e0Var) {
        if (isSubpage(j7)) {
            initBufWithSubpage(f0Var, byteBuffer, j7, i, e0Var);
            return;
        }
        C0170f0 f0Var2 = f0Var;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j8 = j7;
        int i8 = i;
        f0Var2.init(this, byteBuffer2, j8, runOffset(j7) << this.pageShifts, i8, runSize(this.pageShifts, j7), this.arena.parent.threadCache());
    }

    public void initBufWithSubpage(C0170f0 f0Var, ByteBuffer byteBuffer, long j7, int i, C0168e0 e0Var) {
        int runOffset = runOffset(j7);
        int bitmapIdx = bitmapIdx(j7);
        int i8 = this.subpages[runOffset].elemSize;
        f0Var.init(this, byteBuffer, j7, (bitmapIdx * i8) + (runOffset << this.pageShifts), i, i8, e0Var);
    }

    public String toString() {
        int i;
        if (this.unpooled) {
            i = this.freeBytes;
        } else {
            this.runsAvailLock.lock();
            try {
                i = this.freeBytes;
            } finally {
                this.runsAvailLock.unlock();
            }
        }
        return "Chunk(" + Integer.toHexString(System.identityHashCode(this)) + ": " + usage(i) + "%, " + (this.chunkSize - i) + '/' + this.chunkSize + ')';
    }

    public T(S s8, Object obj, Object obj2, int i) {
        this.arena = s8;
        this.base = obj;
        this.memory = obj2;
        this.pageSize = 0;
        this.pageShifts = 0;
        this.runsAvailMap = null;
        this.runsAvail = null;
        this.runsAvailLock = null;
        this.subpages = null;
        this.chunkSize = i;
        this.cachedNioBuffers = null;
    }
}
