package j6;

import i6.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class t extends u {
    public t(int i, int i8) {
        super(i, i8);
    }

    public long availableInQueue(long j7, long j8) {
        return this.maxQueueCapacity - (j7 - j8);
    }

    public int capacity() {
        return (int) (this.maxQueueCapacity / 2);
    }

    public /* bridge */ /* synthetic */ int drain(o oVar, int i) {
        return super.drain(oVar, i);
    }

    public long getCurrentBufferCapacity(long j7) {
        return j7;
    }

    public int getNextBufferSize(AtomicReferenceArray<Object> atomicReferenceArray) {
        return C1128a.length(atomicReferenceArray);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return super.offer(obj);
    }

    public /* bridge */ /* synthetic */ Object peek() {
        return super.peek();
    }

    public /* bridge */ /* synthetic */ Object poll() {
        return super.poll();
    }

    public /* bridge */ /* synthetic */ boolean relaxedOffer(Object obj) {
        return super.relaxedOffer(obj);
    }

    public /* bridge */ /* synthetic */ Object relaxedPoll() {
        return super.relaxedPoll();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
