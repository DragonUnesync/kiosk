package i6;

import java.util.Iterator;
import k6.C1162a;
import k6.b;
import k6.d;

/* renamed from: i6.b  reason: case insensitive filesystem */
public abstract class C1108b extends C1109c implements q {
    /* access modifiers changed from: private */
    public static final Object BUFFER_CONSUMED = new Object();
    /* access modifiers changed from: private */
    public static final Object JUMP = new Object();

    public C1108b(int i) {
        b.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int roundToPowerOfTwo = C1162a.roundToPowerOfTwo(i);
        long j7 = (long) ((roundToPowerOfTwo - 1) << 1);
        Object[] allocateRefArray = d.allocateRefArray(roundToPowerOfTwo + 1);
        this.producerBuffer = allocateRefArray;
        this.producerMask = j7;
        this.consumerBuffer = allocateRefArray;
        this.consumerMask = j7;
        soProducerLimit(j7);
    }

    private Object newBufferPeek(Object[] objArr, long j7) {
        Object lvRefElement = d.lvRefElement(objArr, n.modifiedCalcCircularRefElementOffset(j7, this.consumerMask));
        if (lvRefElement != null) {
            return lvRefElement;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private Object newBufferPoll(Object[] objArr, long j7) {
        long modifiedCalcCircularRefElementOffset = n.modifiedCalcCircularRefElementOffset(j7, this.consumerMask);
        Object lvRefElement = d.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement != null) {
            d.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
            soConsumerIndex(j7 + 2);
            return lvRefElement;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private static long nextArrayOffset(long j7) {
        return n.modifiedCalcCircularRefElementOffset(j7 + 2, Long.MAX_VALUE);
    }

    private Object[] nextBuffer(Object[] objArr, long j7) {
        long nextArrayOffset = nextArrayOffset(j7);
        Object[] objArr2 = (Object[]) d.lvRefElement(objArr, nextArrayOffset);
        this.consumerBuffer = objArr2;
        this.consumerMask = (long) ((n.length(objArr2) - 2) << 1);
        d.soRefElement(objArr, nextArrayOffset, BUFFER_CONSUMED);
        return objArr2;
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

    private void resize(long j7, Object[] objArr, long j8, Object obj, p pVar) {
        int nextBufferSize = getNextBufferSize(objArr);
        try {
            Object[] allocateRefArray = d.allocateRefArray(nextBufferSize);
            this.producerBuffer = allocateRefArray;
            long j9 = (long) ((nextBufferSize - 2) << 1);
            this.producerMask = j9;
            long modifiedCalcCircularRefElementOffset = n.modifiedCalcCircularRefElementOffset(j8, j7);
            long modifiedCalcCircularRefElementOffset2 = n.modifiedCalcCircularRefElementOffset(j8, j9);
            if (obj == null) {
                obj = pVar.get();
            }
            d.soRefElement(allocateRefArray, modifiedCalcCircularRefElementOffset2, obj);
            d.soRefElement(objArr, nextArrayOffset(j7), allocateRefArray);
            long availableInQueue = availableInQueue(j8, lvConsumerIndex());
            b.checkPositive(availableInQueue, "availableInQueue");
            soProducerLimit(Math.min(j9, availableInQueue) + j8);
            soProducerIndex(j8 + 2);
            d.soRefElement(objArr, modifiedCalcCircularRefElementOffset, JUMP);
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

    public abstract int getNextBufferSize(Object[] objArr);

    public boolean isEmpty() {
        if (lvConsumerIndex() == lvProducerIndex()) {
            return true;
        }
        return false;
    }

    public Iterator<Object> iterator() {
        return new C1107a(this.consumerBuffer, lvConsumerIndex(), lvProducerIndex());
    }

    public boolean offer(Object obj) {
        Object obj2 = obj;
        if (obj2 != null) {
            while (true) {
                long lvProducerLimit = lvProducerLimit();
                long lvProducerIndex = lvProducerIndex();
                if ((lvProducerIndex & 1) != 1) {
                    long j7 = this.producerMask;
                    Object[] objArr = this.producerBuffer;
                    if (lvProducerLimit <= lvProducerIndex) {
                        int offerSlowPath = offerSlowPath(j7, lvProducerIndex, lvProducerLimit);
                        if (offerSlowPath == 1) {
                            continue;
                        } else if (offerSlowPath == 2) {
                            return false;
                        } else {
                            if (offerSlowPath == 3) {
                                resize(j7, objArr, lvProducerIndex, obj, (p) null);
                                return true;
                            }
                        }
                    }
                    if (casProducerIndex(lvProducerIndex, 2 + lvProducerIndex)) {
                        d.soRefElement(objArr, n.modifiedCalcCircularRefElementOffset(lvProducerIndex, j7), obj2);
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
            r11 = this;
            java.lang.Object[] r0 = r11.consumerBuffer
            long r1 = r11.lpConsumerIndex()
            long r3 = r11.consumerMask
            long r5 = i6.n.modifiedCalcCircularRefElementOffset(r1, r3)
            java.lang.Object r7 = k6.d.lvRefElement(r0, r5)
            if (r7 != 0) goto L_0x0020
            long r8 = r11.lvProducerIndex()
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0020
        L_0x001a:
            java.lang.Object r7 = k6.d.lvRefElement(r0, r5)
            if (r7 == 0) goto L_0x001a
        L_0x0020:
            java.lang.Object r5 = JUMP
            if (r7 != r5) goto L_0x002d
            java.lang.Object[] r0 = r11.nextBuffer(r0, r3)
            java.lang.Object r0 = r11.newBufferPeek(r0, r1)
            return r0
        L_0x002d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.C1108b.peek():java.lang.Object");
    }

    public Object poll() {
        Object[] objArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j7 = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = n.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j7);
        Object lvRefElement = d.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                lvRefElement = d.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
            } while (lvRefElement == null);
        }
        if (lvRefElement == JUMP) {
            return newBufferPoll(nextBuffer(objArr, j7), lpConsumerIndex);
        }
        d.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return lvRefElement;
    }

    public boolean relaxedOffer(Object obj) {
        return offer(obj);
    }

    public Object relaxedPoll() {
        Object[] objArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j7 = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = n.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j7);
        Object lvRefElement = d.lvRefElement(objArr, modifiedCalcCircularRefElementOffset);
        if (lvRefElement == null) {
            return null;
        }
        if (lvRefElement == JUMP) {
            return newBufferPoll(nextBuffer(objArr, j7), lpConsumerIndex);
        }
        d.soRefElement(objArr, modifiedCalcCircularRefElementOffset, null);
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
