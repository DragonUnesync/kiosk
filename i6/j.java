package i6;

import java.util.Iterator;
import k6.C1162a;
import k6.d;

public abstract class j extends k implements q, l {
    protected final Object[] buffer;
    protected final long mask;

    public j(int i) {
        int roundToPowerOfTwo = C1162a.roundToPowerOfTwo(i);
        this.mask = (long) (roundToPowerOfTwo - 1);
        this.buffer = d.allocateRefArray(roundToPowerOfTwo);
    }

    public int capacity() {
        return (int) (this.mask + 1);
    }

    public void clear() {
        do {
        } while (((s) this).poll() != null);
    }

    public boolean isEmpty() {
        return m.isEmpty(this);
    }

    public Iterator<Object> iterator() {
        return new i(((t) this).lvConsumerIndex(), ((y) this).lvProducerIndex(), this.mask, this.buffer);
    }

    public int size() {
        return m.size(this);
    }

    public String toString() {
        return getClass().getName();
    }
}
