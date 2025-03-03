package i6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k6.d;

public final class i implements Iterator {
    private final Object[] buffer;
    private final long mask;
    private Object nextElement = getNext();
    private long nextIndex;
    private final long pIndex;

    public i(long j7, long j8, long j9, Object[] objArr) {
        this.nextIndex = j7;
        this.pIndex = j8;
        this.mask = j9;
        this.buffer = objArr;
    }

    private Object getNext() {
        Object lvRefElement;
        do {
            long j7 = this.nextIndex;
            if (j7 >= this.pIndex) {
                return null;
            }
            this.nextIndex = 1 + j7;
            lvRefElement = d.lvRefElement(this.buffer, d.calcCircularRefElementOffset(j7, this.mask));
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
