package j6;

import i6.l;
import i6.m;
import i6.q;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k6.C1162a;

public abstract class c extends AbstractQueue implements l, q {
    protected final AtomicReferenceArray<Object> buffer;
    protected final int mask;

    public c(int i) {
        int roundToPowerOfTwo = C1162a.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = new AtomicReferenceArray<>(roundToPowerOfTwo);
    }

    public final int capacity() {
        return this.mask + 1;
    }

    public void clear() {
        do {
        } while (((l) this).poll() != null);
    }

    public final boolean isEmpty() {
        return m.isEmpty(this);
    }

    public final Iterator<Object> iterator() {
        return new b(((m) this).lvConsumerIndex(), ((r) this).lvProducerIndex(), this.mask, this.buffer);
    }

    public final int size() {
        return m.size(this);
    }

    public String toString() {
        return getClass().getName();
    }
}
