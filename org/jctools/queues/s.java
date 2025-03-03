package org.jctools.queues;

import O7.b;
import O7.d;

public class s extends a {
    public s(int i) {
        int max = Math.max(b.roundToPowerOfTwo(i), 16);
        long j7 = (long) (max - 1);
        Object[] allocate = h.allocate(max + 1);
        this.producerBuffer = allocate;
        this.producerMask = j7;
        this.consumerBuffer = allocate;
        this.consumerMask = j7;
        this.producerBufferLimit = j7 - 1;
    }

    public int capacity() {
        return -1;
    }

    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    public /* bridge */ /* synthetic */ int drain(l lVar) {
        return super.drain(lVar);
    }

    public /* bridge */ /* synthetic */ int fill(n nVar) {
        return super.fill(nVar);
    }

    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return super.offer(obj);
    }

    public final boolean offerColdPath(Object[] objArr, long j7, long j8, long j9, Object obj, n nVar) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object[] objArr2 = objArr;
        long j10 = j7;
        long j11 = ((j10 + 1) / 4) + j8;
        if (d.lvElement(objArr, h.calcElementOffset(j11, j7)) == null) {
            this.producerBufferLimit = j11 - 1;
            if (obj == null) {
                obj4 = nVar.get();
            } else {
                obj4 = obj;
            }
            writeToQueue(objArr, obj4, j8, j9);
            return true;
        } else if (d.lvElement(objArr, h.calcElementOffset(j8 + 1, j7)) == null) {
            if (obj == null) {
                obj3 = nVar.get();
            } else {
                obj3 = obj;
            }
            writeToQueue(objArr, obj3, j8, j9);
            return true;
        } else {
            Object[] allocate = h.allocate((int) (2 + j10));
            this.producerBuffer = allocate;
            this.producerBufferLimit = (j10 + j8) - 1;
            if (obj == null) {
                obj2 = nVar.get();
            } else {
                obj2 = obj;
            }
            linkOldToNew(j8, objArr, j9, allocate, j9, obj2);
            return true;
        }
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

    public /* bridge */ /* synthetic */ Object relaxedPeek() {
        return super.relaxedPeek();
    }

    public /* bridge */ /* synthetic */ Object relaxedPoll() {
        return super.relaxedPoll();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ int drain(l lVar, int i) {
        return super.drain(lVar, i);
    }

    public /* bridge */ /* synthetic */ int fill(n nVar, int i) {
        return super.fill(nVar, i);
    }

    public /* bridge */ /* synthetic */ void drain(l lVar, o oVar, m mVar) {
        super.drain(lVar, oVar, mVar);
    }

    public /* bridge */ /* synthetic */ void fill(n nVar, o oVar, m mVar) {
        super.fill(nVar, oVar, mVar);
    }
}
