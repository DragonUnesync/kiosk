package S5;

import g6.C0982o;
import g6.Y;
import g6.n0;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public abstract class S extends B0 {
    /* access modifiers changed from: private */
    public static final boolean HAS_UNSAFE = Y.hasUnsafe();
    private final C0982o activeBytesHuge = Y.newLongCounter();
    private final C0982o allocationsHuge = Y.newLongCounter();
    private long allocationsNormal;
    private final C0982o allocationsSmall = Y.newLongCounter();
    private final List<V> chunkListMetrics;
    private final C0982o deallocationsHuge = Y.newLongCounter();
    private long deallocationsNormal;
    private long deallocationsSmall;
    final int directMemoryCacheAlignment;
    private final ReentrantLock lock = new ReentrantLock();
    final int numSmallSubpagePools;
    final AtomicInteger numThreadCaches = new AtomicInteger();
    final C0176i0 parent;
    private final U q000;
    private final U q025;
    private final U q050;
    private final U q075;
    private final U q100;
    private final U qInit;
    private final W[] smallSubpagePools;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S(S5.C0176i0 r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r6 = r14
            r0 = r16
            r1 = r17
            r7 = r18
            r2 = r19
            r14.<init>(r0, r1, r7, r2)
            g6.o r0 = g6.Y.newLongCounter()
            r6.allocationsSmall = r0
            g6.o r0 = g6.Y.newLongCounter()
            r6.allocationsHuge = r0
            g6.o r0 = g6.Y.newLongCounter()
            r6.activeBytesHuge = r0
            g6.o r0 = g6.Y.newLongCounter()
            r6.deallocationsHuge = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r6.numThreadCaches = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r6.lock = r0
            r0 = r15
            r6.parent = r0
            r6.directMemoryCacheAlignment = r2
            int r0 = r6.nSubpages
            r6.numSmallSubpagePools = r0
            S5.W[] r0 = r14.newSubpagePoolArray(r0)
            r6.smallSubpagePools = r0
            r0 = 0
        L_0x0042:
            S5.W[] r1 = r6.smallSubpagePools
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0050
            S5.W r2 = r14.newSubpagePoolHead()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x0042
        L_0x0050:
            S5.U r8 = new S5.U
            r3 = 100
            r4 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r0 = r8
            r1 = r14
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.q100 = r8
            S5.U r9 = new S5.U
            r3 = 75
            r4 = 100
            r0 = r9
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.q075 = r9
            S5.U r10 = new S5.U
            r3 = 50
            r0 = r10
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.q050 = r10
            S5.U r11 = new S5.U
            r3 = 25
            r4 = 75
            r0 = r11
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.q025 = r11
            S5.U r12 = new S5.U
            r3 = 1
            r4 = 50
            r0 = r12
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.q000 = r12
            S5.U r13 = new S5.U
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 25
            r0 = r13
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.qInit = r13
            r8.prevList(r9)
            r9.prevList(r10)
            r10.prevList(r11)
            r11.prevList(r12)
            r0 = 0
            r12.prevList(r0)
            r13.prevList(r13)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            r0.add(r13)
            r0.add(r12)
            r0.add(r11)
            r0.add(r10)
            r0.add(r9)
            r0.add(r8)
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r0)
            r6.chunkListMetrics = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.S.<init>(S5.i0, int, int, int, int):void");
    }

    private void allocateHuge(C0170f0 f0Var, int i) {
        T newUnpooledChunk = newUnpooledChunk(i);
        this.activeBytesHuge.add((long) newUnpooledChunk.chunkSize());
        f0Var.initUnpooled(newUnpooledChunk, i);
        this.allocationsHuge.increment();
    }

    private void allocateNormal(C0170f0 f0Var, int i, int i8, C0168e0 e0Var) {
        if (!this.q050.allocate(f0Var, i, i8, e0Var) && !this.q025.allocate(f0Var, i, i8, e0Var) && !this.q000.allocate(f0Var, i, i8, e0Var) && !this.qInit.allocate(f0Var, i, i8, e0Var) && !this.q075.allocate(f0Var, i, i8, e0Var)) {
            T newChunk = newChunk(this.pageSize, this.nPSizes, this.pageShifts, this.chunkSize);
            newChunk.allocate(f0Var, i, i8, e0Var);
            this.qInit.add(newChunk);
        }
    }

    private static void appendPoolSubPages(StringBuilder sb, W[] wArr) {
        for (int i = 0; i < wArr.length; i++) {
            W w2 = wArr[i];
            W w4 = w2.next;
            if (w4 != w2 && w4 != null) {
                sb.append(n0.NEWLINE);
                sb.append(i);
                sb.append(": ");
                W w7 = w2.next;
                while (w7 != null) {
                    sb.append(w7);
                    w7 = w7.next;
                    if (w7 == w2) {
                        break;
                    }
                }
            }
        }
    }

    private void destroyPoolChunkLists(U... uArr) {
        for (U destroy : uArr) {
            destroy.destroy(this);
        }
    }

    private static void destroyPoolSubPages(W[] wArr) {
        for (W destroy : wArr) {
            destroy.destroy();
        }
    }

    private void incSmallAllocation() {
        this.allocationsSmall.increment();
    }

    private W[] newSubpagePoolArray(int i) {
        return new W[i];
    }

    private W newSubpagePoolHead() {
        W w2 = new W();
        w2.prev = w2;
        w2.next = w2;
        return w2;
    }

    private static Q sizeClass(long j7) {
        if (T.isSubpage(j7)) {
            return Q.Small;
        }
        return Q.Normal;
    }

    private void tcacheAllocateNormal(C0168e0 e0Var, C0170f0 f0Var, int i, int i8) {
        if (!e0Var.allocateNormal(this, f0Var, i, i8)) {
            lock();
            try {
                allocateNormal(f0Var, i, i8, e0Var);
                this.allocationsNormal++;
            } finally {
                unlock();
            }
        }
    }

    private void tcacheAllocateSmall(C0168e0 e0Var, C0170f0 f0Var, int i, int i8) {
        boolean z;
        if (!e0Var.allocateSmall(this, f0Var, i, i8)) {
            W findSubpagePoolHead = findSubpagePoolHead(i8);
            findSubpagePoolHead.lock();
            try {
                W w2 = findSubpagePoolHead.next;
                if (w2 == findSubpagePoolHead) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    w2.chunk.initBufWithSubpage(f0Var, (ByteBuffer) null, w2.allocate(), i, e0Var);
                }
                if (z) {
                    lock();
                    try {
                        allocateNormal(f0Var, i, i8, e0Var);
                    } finally {
                        unlock();
                    }
                }
                incSmallAllocation();
            } finally {
                findSubpagePoolHead.unlock();
            }
        }
    }

    public C0170f0 allocate(C0168e0 e0Var, int i, int i8) {
        C0170f0 newByteBuf = newByteBuf(i8);
        allocate(e0Var, newByteBuf, i);
        return newByteBuf;
    }

    public abstract void destroyChunk(T t8);

    public final void finalize() {
        try {
            super.finalize();
        } finally {
            destroyPoolSubPages(this.smallSubpagePools);
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
        }
    }

    public W findSubpagePoolHead(int i) {
        return this.smallSubpagePools[i];
    }

    public void free(T t8, ByteBuffer byteBuffer, long j7, int i, C0168e0 e0Var) {
        t8.decrementPinnedMemory(i);
        if (t8.unpooled) {
            int chunkSize = t8.chunkSize();
            destroyChunk(t8);
            this.activeBytesHuge.add((long) (-chunkSize));
            this.deallocationsHuge.increment();
            return;
        }
        Q sizeClass = sizeClass(j7);
        if (e0Var == null || !e0Var.add(this, t8, byteBuffer, j7, i, sizeClass)) {
            freeChunk(t8, j7, i, sizeClass, byteBuffer, false);
        }
    }

    public void freeChunk(T t8, long j7, int i, Q q7, ByteBuffer byteBuffer, boolean z) {
        lock();
        if (!z) {
            try {
                int i8 = N.$SwitchMap$io$netty$buffer$PoolArena$SizeClass[q7.ordinal()];
                if (i8 == 1) {
                    this.deallocationsNormal++;
                } else if (i8 == 2) {
                    this.deallocationsSmall++;
                } else {
                    throw new Error();
                }
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }
        boolean free = t8.parent.free(t8, j7, i, byteBuffer);
        unlock();
        if (!free) {
            destroyChunk(t8);
        }
    }

    public abstract boolean isDirect();

    public void lock() {
        this.lock.lock();
    }

    public abstract void memoryCopy(Object obj, int i, C0170f0 f0Var, int i8);

    public abstract C0170f0 newByteBuf(int i);

    public abstract T newChunk(int i, int i8, int i9, int i10);

    public abstract T newUnpooledChunk(int i);

    /* JADX INFO: finally extract failed */
    public long numActiveBytes() {
        long value = this.activeBytesHuge.value();
        lock();
        int i = 0;
        while (i < this.chunkListMetrics.size()) {
            try {
                Iterator<T> it = ((U) this.chunkListMetrics.get(i)).iterator();
                while (it.hasNext()) {
                    value += (long) it.next().chunkSize();
                }
                i++;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }
        unlock();
        return Math.max(0, value);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r12 <= r0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r11.trimIndicesToCapacity(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        memoryCopy(r5, r6, r11, r12);
        free(r1, r2, r3, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reallocate(S5.C0170f0 r11, int r12) {
        /*
            r10 = this;
            monitor-enter(r11)
            int r0 = r11.length     // Catch:{ all -> 0x0007 }
            if (r0 != r12) goto L_0x0009
            monitor-exit(r11)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r12 = move-exception
            goto L_0x0032
        L_0x0009:
            S5.T r1 = r11.chunk     // Catch:{ all -> 0x0007 }
            java.nio.ByteBuffer r2 = r11.tmpNioBuf     // Catch:{ all -> 0x0007 }
            long r3 = r11.handle     // Catch:{ all -> 0x0007 }
            java.lang.Object r5 = r11.memory     // Catch:{ all -> 0x0007 }
            int r6 = r11.offset     // Catch:{ all -> 0x0007 }
            int r7 = r11.maxLength     // Catch:{ all -> 0x0007 }
            S5.e0 r8 = r11.cache     // Catch:{ all -> 0x0007 }
            S5.i0 r9 = r10.parent     // Catch:{ all -> 0x0007 }
            S5.e0 r9 = r9.threadCache()     // Catch:{ all -> 0x0007 }
            r10.allocate((S5.C0168e0) r9, (S5.C0170f0) r11, (int) r12)     // Catch:{ all -> 0x0007 }
            monitor-exit(r11)     // Catch:{ all -> 0x0007 }
            if (r12 <= r0) goto L_0x0025
            r12 = r0
            goto L_0x0028
        L_0x0025:
            r11.trimIndicesToCapacity(r12)
        L_0x0028:
            r10.memoryCopy(r5, r6, r11, r12)
            r0 = r10
            r5 = r7
            r6 = r8
            r0.free(r1, r2, r3, r5, r6)
            return
        L_0x0032:
            monitor-exit(r11)     // Catch:{ all -> 0x0007 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.S.reallocate(S5.f0, int):void");
    }

    public String toString() {
        lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Chunk(s) at 0~25%:");
            String str = n0.NEWLINE;
            sb.append(str);
            sb.append(this.qInit);
            sb.append(str);
            sb.append("Chunk(s) at 0~50%:");
            sb.append(str);
            sb.append(this.q000);
            sb.append(str);
            sb.append("Chunk(s) at 25~75%:");
            sb.append(str);
            sb.append(this.q025);
            sb.append(str);
            sb.append("Chunk(s) at 50~100%:");
            sb.append(str);
            sb.append(this.q050);
            sb.append(str);
            sb.append("Chunk(s) at 75~100%:");
            sb.append(str);
            sb.append(this.q075);
            sb.append(str);
            sb.append("Chunk(s) at 100%:");
            sb.append(str);
            sb.append(this.q100);
            sb.append(str);
            sb.append("small subpages:");
            appendPoolSubPages(sb, this.smallSubpagePools);
            sb.append(str);
            return sb.toString();
        } finally {
            unlock();
        }
    }

    public void unlock() {
        this.lock.unlock();
    }

    private void allocate(C0168e0 e0Var, C0170f0 f0Var, int i) {
        int size2SizeIdx = size2SizeIdx(i);
        if (size2SizeIdx <= this.smallMaxSizeIdx) {
            tcacheAllocateSmall(e0Var, f0Var, i, size2SizeIdx);
        } else if (size2SizeIdx < this.nSizes) {
            tcacheAllocateNormal(e0Var, f0Var, i, size2SizeIdx);
        } else {
            if (this.directMemoryCacheAlignment > 0) {
                i = normalizeSize(i);
            }
            allocateHuge(f0Var, i);
        }
    }
}
