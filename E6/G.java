package e6;

import f6.C0908A;
import g6.Y;
import i6.o;
import i6.q;
import java.util.ArrayDeque;

public final class G implements o {
    private final ArrayDeque<D> batch;
    private final int chunkSize;
    /* access modifiers changed from: private */
    public volatile Thread owner;
    /* access modifiers changed from: private */
    public volatile q pooledHandles;
    private int ratioCounter;
    private final int ratioInterval;

    public G(int i, int i8, int i9) {
        this.ratioInterval = i8;
        this.chunkSize = i9;
        this.batch = new ArrayDeque<>(i9);
        Thread currentThread = Thread.currentThread();
        if (H.BATCH_FAST_TL_ONLY && !(currentThread instanceof C0908A)) {
            currentThread = null;
        }
        this.owner = currentThread;
        if (H.BLOCKING_POOL) {
            this.pooledHandles = new C(i);
        } else {
            this.pooledHandles = (q) Y.newMpscQueue(i9, i);
        }
        this.ratioCounter = i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000e A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isTerminated(java.lang.Thread r3) {
        /*
            boolean r0 = g6.Y.isJ9Jvm()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r3 = r3.isAlive()
            if (r3 != 0) goto L_0x0019
        L_0x000e:
            r1 = 1
            goto L_0x0019
        L_0x0010:
            java.lang.Thread$State r3 = r3.getState()
            java.lang.Thread$State r0 = java.lang.Thread.State.TERMINATED
            if (r3 != r0) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.G.isTerminated(java.lang.Thread):boolean");
    }

    public D claim() {
        q qVar = this.pooledHandles;
        if (qVar == null) {
            return null;
        }
        if (this.batch.isEmpty()) {
            qVar.drain(this, this.chunkSize);
        }
        D pollFirst = this.batch.pollFirst();
        if (pollFirst != null) {
            pollFirst.toClaimed();
        }
        return pollFirst;
    }

    public D newHandle() {
        int i = this.ratioCounter + 1;
        this.ratioCounter = i;
        if (i < this.ratioInterval) {
            return null;
        }
        this.ratioCounter = 0;
        return new D(this);
    }

    public void release(D d8, boolean z) {
        if (z) {
            d8.toAvailable();
        } else {
            d8.unguardedToAvailable();
        }
        Thread thread = this.owner;
        if (thread != null && Thread.currentThread() == thread && this.batch.size() < this.chunkSize) {
            accept(d8);
        } else if (thread == null || !isTerminated(thread)) {
            q qVar = this.pooledHandles;
            if (qVar != null) {
                qVar.relaxedOffer(d8);
            }
        } else {
            this.owner = null;
            this.pooledHandles = null;
        }
    }

    public void accept(D d8) {
        this.batch.addLast(d8);
    }
}
