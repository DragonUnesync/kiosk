package i6;

import Q0.g;
import e6.G;
import java.util.Iterator;
import k6.d;

public final class s extends w {
    public s(int i) {
        super(i);
    }

    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public int drain(o oVar, int i) {
        if (oVar == null) {
            throw new IllegalArgumentException("c is null");
        } else if (i >= 0) {
            if (i == 0) {
                return 0;
            }
            Object[] objArr = this.buffer;
            long j7 = this.mask;
            long lpConsumerIndex = lpConsumerIndex();
            for (int i8 = 0; i8 < i; i8++) {
                long j8 = ((long) i8) + lpConsumerIndex;
                long calcCircularRefElementOffset = d.calcCircularRefElementOffset(j8, j7);
                Object lvRefElement = d.lvRefElement(objArr, calcCircularRefElementOffset);
                if (lvRefElement == null) {
                    return i8;
                }
                d.spRefElement(objArr, calcCircularRefElementOffset, null);
                soConsumerIndex(j8 + 1);
                ((G) oVar).accept(lvRefElement);
            }
            return i;
        } else {
            throw new IllegalArgumentException(g.m(i, "limit is negative: "));
        }
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public boolean offer(Object obj) {
        long lvProducerIndex;
        if (obj != null) {
            long j7 = this.mask;
            long lvProducerLimit = lvProducerLimit();
            do {
                lvProducerIndex = lvProducerIndex();
                if (lvProducerIndex >= lvProducerLimit) {
                    lvProducerLimit = lvConsumerIndex() + j7 + 1;
                    if (lvProducerIndex >= lvProducerLimit) {
                        return false;
                    }
                    soProducerLimit(lvProducerLimit);
                }
            } while (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex));
            d.soRefElement(this.buffer, d.calcCircularRefElementOffset(lvProducerIndex, j7), obj);
            return true;
        }
        throw null;
    }

    public Object peek() {
        Object[] objArr = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = d.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        Object lvRefElement = d.lvRefElement(objArr, calcCircularRefElementOffset);
        if (lvRefElement != null) {
            return lvRefElement;
        }
        if (lpConsumerIndex == lvProducerIndex()) {
            return null;
        }
        do {
            lvRefElement = d.lvRefElement(objArr, calcCircularRefElementOffset);
        } while (lvRefElement == null);
        return lvRefElement;
    }

    public Object poll() {
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = d.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        Object[] objArr = this.buffer;
        Object lvRefElement = d.lvRefElement(objArr, calcCircularRefElementOffset);
        if (lvRefElement != null) {
            d.spRefElement(objArr, calcCircularRefElementOffset, null);
            soConsumerIndex(lpConsumerIndex + 1);
        } else if (lpConsumerIndex == lvProducerIndex()) {
            return null;
        } else {
            do {
                lvRefElement = d.lvRefElement(objArr, calcCircularRefElementOffset);
            } while (lvRefElement == null);
        }
        d.spRefElement(objArr, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return lvRefElement;
    }

    public boolean relaxedOffer(Object obj) {
        return offer(obj);
    }

    public Object relaxedPoll() {
        Object[] objArr = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = d.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        Object lvRefElement = d.lvRefElement(objArr, calcCircularRefElementOffset);
        if (lvRefElement == null) {
            return null;
        }
        d.spRefElement(objArr, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return lvRefElement;
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
