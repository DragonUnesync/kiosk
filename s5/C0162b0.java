package S5;

import g6.C0965A;
import g6.C0984q;
import g6.Y;
import java.nio.ByteBuffer;
import java.util.Queue;

/* renamed from: S5.b0  reason: case insensitive filesystem */
public abstract class C0162b0 {
    private static final C0965A RECYCLER = C0965A.newPool(new Z());
    private int allocations;
    /* access modifiers changed from: private */
    public final Queue<C0160a0> queue;
    private final int size;
    private final Q sizeClass;

    public C0162b0(int i, Q q7) {
        int safeFindNextPositivePowerOfTwo = C0984q.safeFindNextPositivePowerOfTwo(i);
        this.size = safeFindNextPositivePowerOfTwo;
        this.queue = Y.newFixedMpscQueue(safeFindNextPositivePowerOfTwo);
        this.sizeClass = q7;
    }

    private void freeEntry(C0160a0 a0Var, boolean z) {
        T t8 = a0Var.chunk;
        long j7 = a0Var.handle;
        ByteBuffer byteBuffer = a0Var.nioBuffer;
        int i = a0Var.normCapacity;
        if (!z) {
            a0Var.recycle();
        }
        t8.arena.freeChunk(t8, j7, i, this.sizeClass, byteBuffer, z);
    }

    private static C0160a0 newEntry(T t8, ByteBuffer byteBuffer, long j7, int i) {
        C0160a0 a0Var = (C0160a0) RECYCLER.get();
        a0Var.chunk = t8;
        a0Var.nioBuffer = byteBuffer;
        a0Var.handle = j7;
        a0Var.normCapacity = i;
        return a0Var;
    }

    public final boolean add(T t8, ByteBuffer byteBuffer, long j7, int i) {
        C0160a0 newEntry = newEntry(t8, byteBuffer, j7, i);
        boolean offer = this.queue.offer(newEntry);
        if (!offer) {
            newEntry.unguardedRecycle();
        }
        return offer;
    }

    public final boolean allocate(C0170f0 f0Var, int i, C0168e0 e0Var) {
        C0160a0 poll = this.queue.poll();
        if (poll == null) {
            return false;
        }
        initBuf(poll.chunk, poll.nioBuffer, poll.handle, f0Var, i, e0Var);
        poll.unguardedRecycle();
        this.allocations++;
        return true;
    }

    public final int free(boolean z) {
        return free(Integer.MAX_VALUE, z);
    }

    public abstract void initBuf(T t8, ByteBuffer byteBuffer, long j7, C0170f0 f0Var, int i, C0168e0 e0Var);

    public final void trim() {
        int i = this.size - this.allocations;
        this.allocations = 0;
        if (i > 0) {
            free(i, false);
        }
    }

    private int free(int i, boolean z) {
        int i8 = 0;
        while (i8 < i) {
            C0160a0 poll = this.queue.poll();
            if (poll == null) {
                break;
            }
            freeEntry(poll, z);
            i8++;
        }
        return i8;
    }
}
