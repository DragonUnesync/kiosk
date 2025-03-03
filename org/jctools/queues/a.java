package org.jctools.queues;

import O7.d;
import java.util.Iterator;

public abstract class a extends f implements p, r {
    private static final Object JUMP = new Object();

    private Object newBufferPeek(Object[] objArr, long j7) {
        Object[] lvNextArrayAndUnlink = lvNextArrayAndUnlink(objArr);
        this.consumerBuffer = lvNextArrayAndUnlink;
        long length = (long) (k.length(lvNextArrayAndUnlink) - 2);
        this.consumerMask = length;
        return d.lvElement(lvNextArrayAndUnlink, h.calcElementOffset(j7, length));
    }

    private Object newBufferPoll(Object[] objArr, long j7) {
        Object[] lvNextArrayAndUnlink = lvNextArrayAndUnlink(objArr);
        this.consumerBuffer = lvNextArrayAndUnlink;
        long length = (long) (k.length(lvNextArrayAndUnlink) - 2);
        this.consumerMask = length;
        long calcElementOffset = h.calcElementOffset(j7, length);
        Object lvElement = d.lvElement(lvNextArrayAndUnlink, calcElementOffset);
        if (lvElement != null) {
            soConsumerIndex(j7 + 1);
            d.soElement(lvNextArrayAndUnlink, calcElementOffset, null);
            return lvElement;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    public abstract /* synthetic */ int capacity();

    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    public int drain(l lVar) {
        return q.drain(this, lVar);
    }

    public int fill(n nVar) {
        int capacity = capacity();
        long j7 = 0;
        do {
            int fill = fill(nVar, O7.a.RECOMENDED_OFFER_BATCH);
            if (fill == 0) {
                return (int) j7;
            }
            j7 += (long) fill;
        } while (j7 <= ((long) capacity));
        return (int) j7;
    }

    public final boolean isEmpty() {
        return j.isEmpty(this);
    }

    public final Iterator<Object> iterator() {
        throw new UnsupportedOperationException();
    }

    public final void linkOldToNew(long j7, Object[] objArr, long j8, Object[] objArr2, long j9, Object obj) {
        d.soElement(objArr2, j9, obj);
        soNext(objArr, objArr2);
        d.soElement(objArr, j8, JUMP);
        soProducerIndex(j7 + 1);
    }

    public final Object[] lvNextArrayAndUnlink(Object[] objArr) {
        long nextArrayOffset = k.nextArrayOffset(objArr);
        Object[] objArr2 = (Object[]) d.lvElement(objArr, nextArrayOffset);
        d.soElement(objArr, nextArrayOffset, null);
        return objArr2;
    }

    public boolean offer(Object obj) {
        if (obj != null) {
            Object[] objArr = this.producerBuffer;
            long j7 = this.producerIndex;
            long j8 = this.producerMask;
            long calcElementOffset = h.calcElementOffset(j7, j8);
            if (j7 >= this.producerBufferLimit) {
                return offerColdPath(objArr, j8, j7, calcElementOffset, obj, (n) null);
            }
            writeToQueue(objArr, obj, j7, calcElementOffset);
            return true;
        }
        throw null;
    }

    public abstract boolean offerColdPath(Object[] objArr, long j7, long j8, long j9, Object obj, n nVar);

    public Object peek() {
        Object[] objArr = this.consumerBuffer;
        long j7 = this.consumerIndex;
        Object lvElement = d.lvElement(objArr, h.calcElementOffset(j7, this.consumerMask));
        if (lvElement == JUMP) {
            return newBufferPeek(objArr, j7);
        }
        return lvElement;
    }

    public Object poll() {
        boolean z;
        Object[] objArr = this.consumerBuffer;
        long j7 = this.consumerIndex;
        long calcElementOffset = h.calcElementOffset(j7, this.consumerMask);
        Object lvElement = d.lvElement(objArr, calcElementOffset);
        if (lvElement == JUMP) {
            z = true;
        } else {
            z = false;
        }
        if (lvElement != null && !z) {
            soConsumerIndex(j7 + 1);
            d.soElement(objArr, calcElementOffset, null);
            return lvElement;
        } else if (z) {
            return newBufferPoll(objArr, j7);
        } else {
            return null;
        }
    }

    public boolean relaxedOffer(Object obj) {
        return offer(obj);
    }

    public Object relaxedPeek() {
        return peek();
    }

    public Object relaxedPoll() {
        return poll();
    }

    public final int size() {
        return j.size(this);
    }

    public final void soNext(Object[] objArr, Object[] objArr2) {
        d.soElement(objArr, k.nextArrayOffset(objArr), objArr2);
    }

    public String toString() {
        return getClass().getName();
    }

    public final void writeToQueue(Object[] objArr, Object obj, long j7, long j8) {
        d.soElement(objArr, j8, obj);
        soProducerIndex(j7 + 1);
    }

    public int drain(l lVar, int i) {
        return q.drain(this, lVar, i);
    }

    public void drain(l lVar, o oVar, m mVar) {
        q.drain(this, lVar, oVar, mVar);
    }

    public int fill(n nVar, int i) {
        for (int i8 = 0; i8 < i; i8++) {
            Object[] objArr = this.producerBuffer;
            long j7 = this.producerIndex;
            long j8 = this.producerMask;
            long calcElementOffset = h.calcElementOffset(j7, j8);
            if (j7 < this.producerBufferLimit) {
                writeToQueue(objArr, nVar.get(), j7, calcElementOffset);
            } else if (!offerColdPath(objArr, j8, j7, calcElementOffset, (Object) null, nVar)) {
                return i8;
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006 A[LOOP:1: B:2:0x0006->B:5:0x0012, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fill(org.jctools.queues.n r2, org.jctools.queues.o r3, org.jctools.queues.m r4) {
        /*
            r1 = this;
        L_0x0000:
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0027
        L_0x0006:
            int r0 = O7.a.RECOMENDED_OFFER_BATCH
            int r0 = r1.fill(r2, r0)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0015
            goto L_0x0006
        L_0x0015:
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0000
            int r0 = O7.a.RECOMENDED_OFFER_BATCH
            int r0 = r1.fill(r2, r0)
            if (r0 != 0) goto L_0x0000
            r3.a()
            goto L_0x0015
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jctools.queues.a.fill(org.jctools.queues.n, org.jctools.queues.o, org.jctools.queues.m):void");
    }
}
