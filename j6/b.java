package j6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class b implements Iterator {
    private final AtomicReferenceArray<Object> buffer;
    private final int mask;
    private Object nextElement = getNext();
    private long nextIndex;
    private final long pIndex;

    public b(long j7, long j8, int i, AtomicReferenceArray<Object> atomicReferenceArray) {
        this.nextIndex = j7;
        this.pIndex = j8;
        this.mask = i;
        this.buffer = atomicReferenceArray;
    }

    private Object getNext() {
        Object lvRefElement;
        int i = this.mask;
        AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
        do {
            long j7 = this.nextIndex;
            if (j7 >= this.pIndex) {
                return null;
            }
            this.nextIndex = 1 + j7;
            lvRefElement = C1128a.lvRefElement(atomicReferenceArray, C1128a.calcCircularRefElementOffset(j7, (long) i));
        } while (lvRefElement == null);
        return lvRefElement;
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
