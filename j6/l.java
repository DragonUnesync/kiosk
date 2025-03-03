package j6;

import Q0.g;
import e6.G;
import i6.o;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class l extends p {
    public l(int i) {
        super(i);
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
            AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
            int i8 = this.mask;
            long lpConsumerIndex = lpConsumerIndex();
            for (int i9 = 0; i9 < i; i9++) {
                long j7 = ((long) i9) + lpConsumerIndex;
                int calcCircularRefElementOffset = C1128a.calcCircularRefElementOffset(j7, (long) i8);
                Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
                if (lvRefElement == null) {
                    return i9;
                }
                C1128a.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
                soConsumerIndex(j7 + 1);
                ((G) oVar).accept(lvRefElement);
            }
            return i;
        } else {
            throw new IllegalArgumentException(g.m(i, "limit is negative: "));
        }
    }

    public boolean offer(Object obj) {
        long lvProducerIndex;
        if (obj != null) {
            int i = this.mask;
            long lvProducerLimit = lvProducerLimit();
            do {
                lvProducerIndex = lvProducerIndex();
                if (lvProducerIndex >= lvProducerLimit) {
                    lvProducerLimit = lvConsumerIndex() + ((long) i) + 1;
                    if (lvProducerIndex >= lvProducerLimit) {
                        return false;
                    }
                    soProducerLimit(lvProducerLimit);
                }
            } while (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex));
            C1128a.soRefElement(this.buffer, C1128a.calcCircularRefElementOffset(lvProducerIndex, (long) i), obj);
            return true;
        }
        throw null;
    }

    public Object peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = C1128a.calcCircularRefElementOffset(lpConsumerIndex, (long) this.mask);
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (lvRefElement != null) {
            return lvRefElement;
        }
        if (lpConsumerIndex == lvProducerIndex()) {
            return null;
        }
        do {
            lvRefElement = C1128a.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        } while (lvRefElement == null);
        return lvRefElement;
    }

    public Object poll() {
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = C1128a.calcCircularRefElementOffset(lpConsumerIndex, (long) this.mask);
        AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (lvRefElement != null) {
            C1128a.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
            soConsumerIndex(lpConsumerIndex + 1);
        } else if (lpConsumerIndex == lvProducerIndex()) {
            return null;
        } else {
            do {
                lvRefElement = C1128a.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
            } while (lvRefElement == null);
        }
        C1128a.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return lvRefElement;
    }

    public boolean relaxedOffer(Object obj) {
        return offer(obj);
    }

    public Object relaxedPoll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = C1128a.calcCircularRefElementOffset(lpConsumerIndex, (long) this.mask);
        Object lvRefElement = C1128a.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (lvRefElement == null) {
            return null;
        }
        C1128a.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return lvRefElement;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
