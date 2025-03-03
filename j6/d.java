package j6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class d implements Iterator {
    private AtomicReferenceArray<Object> currentBuffer;
    private int mask;
    private Object nextElement = getNext();
    private long nextIndex;
    private final long pIndex;

    public d(AtomicReferenceArray<Object> atomicReferenceArray, long j7, long j8) {
        this.pIndex = j8 >> 1;
        this.nextIndex = j7 >> 1;
        setBuffer(atomicReferenceArray);
    }

    private Object getNext() {
        while (true) {
            long j7 = this.nextIndex;
            if (j7 >= this.pIndex) {
                break;
            }
            this.nextIndex = 1 + j7;
            Object lvRefElement = C1128a.lvRefElement(this.currentBuffer, C1128a.calcCircularRefElementOffset(j7, (long) this.mask));
            if (lvRefElement != null) {
                if (lvRefElement == e.JUMP) {
                    Object lvRefElement2 = C1128a.lvRefElement(this.currentBuffer, C1128a.calcRefElementOffset((long) (this.mask + 1)));
                    if (lvRefElement2 == e.BUFFER_CONSUMED || lvRefElement2 == null) {
                        break;
                    }
                    setBuffer((AtomicReferenceArray) lvRefElement2);
                    Object lvRefElement3 = C1128a.lvRefElement(this.currentBuffer, C1128a.calcCircularRefElementOffset(j7, (long) this.mask));
                    if (lvRefElement3 != null) {
                        return lvRefElement3;
                    }
                } else {
                    return lvRefElement;
                }
            }
        }
        return null;
    }

    private void setBuffer(AtomicReferenceArray<Object> atomicReferenceArray) {
        this.currentBuffer = atomicReferenceArray;
        this.mask = C1128a.length(atomicReferenceArray) - 2;
    }

    public boolean hasNext() {
        if (this.nextElement != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        Object obj = this.nextElement;
        if (obj != null) {
            this.nextElement = getNext();
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
