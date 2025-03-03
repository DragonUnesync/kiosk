package j6;

import i6.o;
import i6.p;
import i6.q;
import i6.r;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k6.C1162a;
import k6.b;

public abstract class e extends f implements q {
    /* access modifiers changed from: private */
    public static final Object BUFFER_CONSUMED = new Object();
    /* access modifiers changed from: private */
    public static final Object JUMP = new Object();

    public e(int i) {
        b.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int roundToPowerOfTwo = C1162a.roundToPowerOfTwo(i);
        long j7 = (long) ((roundToPowerOfTwo - 1) << 1);
        AtomicReferenceArray<Object> allocateRefArray = C1128a.allocateRefArray(roundToPowerOfTwo + 1);
        this.producerBuffer = allocateRefArray;
        this.producerMask = j7;
        this.consumerBuffer = allocateRefArray;
        this.consumerMask = j7;
        soProducerLimit(j7);
    }

    private Object newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j7) {
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, C1128a.modifiedCalcCircularRefElementOffset(j7, this.consumerMask));
        if (lvRefElement != null) {
            return lvRefElement;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private Object newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j7) {
        int modifiedCalcCircularRefElementOffset = C1128a.modifiedCalcCircularRefElementOffset(j7, this.consumerMask);
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset);
        if (lvRefElement != null) {
            C1128a.soRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset, (Object) null);
            soConsumerIndex(j7 + 2);
            return lvRefElement;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private static int nextArrayOffset(long j7) {
        return C1128a.modifiedCalcCircularRefElementOffset(j7 + 2, Long.MAX_VALUE);
    }

    private AtomicReferenceArray<Object> nextBuffer(AtomicReferenceArray<Object> atomicReferenceArray, long j7) {
        int nextArrayOffset = nextArrayOffset(j7);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) C1128a.lvRefElement(atomicReferenceArray, nextArrayOffset);
        this.consumerBuffer = atomicReferenceArray2;
        this.consumerMask = (long) ((C1128a.length(atomicReferenceArray2) - 2) << 1);
        C1128a.soRefElement(atomicReferenceArray, nextArrayOffset, BUFFER_CONSUMED);
        return atomicReferenceArray2;
    }

    private int offerSlowPath(long j7, long j8, long j9) {
        long lvConsumerIndex = lvConsumerIndex();
        long currentBufferCapacity = getCurrentBufferCapacity(j7) + lvConsumerIndex;
        if (currentBufferCapacity > j8) {
            if (!casProducerLimit(j9, currentBufferCapacity)) {
                return 1;
            }
            return 0;
        } else if (availableInQueue(j8, lvConsumerIndex) <= 0) {
            return 2;
        } else {
            if (casProducerIndex(j8, 1 + j8)) {
                return 3;
            }
            return 1;
        }
    }

    private void resize(long j7, AtomicReferenceArray<Object> atomicReferenceArray, long j8, Object obj, p pVar) {
        int nextBufferSize = getNextBufferSize(atomicReferenceArray);
        try {
            AtomicReferenceArray<Object> allocateRefArray = C1128a.allocateRefArray(nextBufferSize);
            this.producerBuffer = allocateRefArray;
            long j9 = (long) ((nextBufferSize - 2) << 1);
            this.producerMask = j9;
            int modifiedCalcCircularRefElementOffset = C1128a.modifiedCalcCircularRefElementOffset(j8, j7);
            int modifiedCalcCircularRefElementOffset2 = C1128a.modifiedCalcCircularRefElementOffset(j8, j9);
            if (obj == null) {
                obj = pVar.get();
            }
            C1128a.soRefElement(allocateRefArray, modifiedCalcCircularRefElementOffset2, obj);
            C1128a.soRefElement(atomicReferenceArray, nextArrayOffset(j7), allocateRefArray);
            long availableInQueue = availableInQueue(j8, lvConsumerIndex());
            b.checkPositive(availableInQueue, "availableInQueue");
            soProducerLimit(Math.min(j9, availableInQueue) + j8);
            soProducerIndex(j8 + 2);
            C1128a.soRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset, JUMP);
        } catch (OutOfMemoryError e) {
            soProducerIndex(j8);
            throw e;
        }
    }

    public abstract long availableInQueue(long j7, long j8);

    public int drain(o oVar, int i) {
        return r.drain(this, oVar, i);
    }

    public abstract long getCurrentBufferCapacity(long j7);

    public abstract int getNextBufferSize(AtomicReferenceArray<Object> atomicReferenceArray);

    public boolean isEmpty() {
        if (lvConsumerIndex() == lvProducerIndex()) {
            return true;
        }
        return false;
    }

    public Iterator<Object> iterator() {
        return new d(this.consumerBuffer, lvConsumerIndex(), lvProducerIndex());
    }

    public boolean offer(Object obj) {
        Object obj2 = obj;
        if (obj2 != null) {
            while (true) {
                long lvProducerLimit = lvProducerLimit();
                long lvProducerIndex = lvProducerIndex();
                if ((lvProducerIndex & 1) != 1) {
                    long j7 = this.producerMask;
                    AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
                    if (lvProducerLimit <= lvProducerIndex) {
                        int offerSlowPath = offerSlowPath(j7, lvProducerIndex, lvProducerLimit);
                        if (offerSlowPath == 1) {
                            continue;
                        } else if (offerSlowPath == 2) {
                            return false;
                        } else {
                            if (offerSlowPath == 3) {
                                resize(j7, atomicReferenceArray, lvProducerIndex, obj, (p) null);
                                return true;
                            }
                        }
                    }
                    if (casProducerIndex(lvProducerIndex, 2 + lvProducerIndex)) {
                        C1128a.soRefElement(atomicReferenceArray, C1128a.modifiedCalcCircularRefElementOffset(lvProducerIndex, j7), obj2);
                        return true;
                    }
                }
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object peek() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r10.consumerBuffer
            long r1 = r10.lpConsumerIndex()
            long r3 = r10.consumerMask
            int r5 = j6.C1128a.modifiedCalcCircularRefElementOffset(r1, r3)
            java.lang.Object r6 = j6.C1128a.lvRefElement(r0, r5)
            if (r6 != 0) goto L_0x0020
            long r7 = r10.lvProducerIndex()
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0020
        L_0x001a:
            java.lang.Object r6 = j6.C1128a.lvRefElement(r0, r5)
            if (r6 == 0) goto L_0x001a
        L_0x0020:
            java.lang.Object r5 = JUMP
            if (r6 != r5) goto L_0x002d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r10.nextBuffer(r0, r3)
            java.lang.Object r0 = r10.newBufferPeek(r0, r1)
            return r0
        L_0x002d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.peek():java.lang.Object");
    }

    public Object poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j7 = this.consumerMask;
        int modifiedCalcCircularRefElementOffset = C1128a.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j7);
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                lvRefElement = C1128a.lvRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset);
            } while (lvRefElement == null);
        }
        if (lvRefElement == JUMP) {
            return newBufferPoll(nextBuffer(atomicReferenceArray, j7), lpConsumerIndex);
        }
        C1128a.soRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset, (Object) null);
        soConsumerIndex(lpConsumerIndex + 2);
        return lvRefElement;
    }

    public boolean relaxedOffer(Object obj) {
        return offer(obj);
    }

    public Object relaxedPoll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j7 = this.consumerMask;
        int modifiedCalcCircularRefElementOffset = C1128a.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j7);
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            return null;
        }
        if (lvRefElement == JUMP) {
            return newBufferPoll(nextBuffer(atomicReferenceArray, j7), lpConsumerIndex);
        }
        C1128a.soRefElement(atomicReferenceArray, modifiedCalcCircularRefElementOffset, (Object) null);
        soConsumerIndex(lpConsumerIndex + 2);
        return lvRefElement;
    }

    public int size() {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = lvConsumerIndex();
        while (true) {
            lvProducerIndex = lvProducerIndex();
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j7 = (lvProducerIndex - lvConsumerIndex) >> 1;
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j7;
    }

    public String toString() {
        return getClass().getName();
    }
}
