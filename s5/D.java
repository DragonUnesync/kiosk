package S5;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class D implements Iterator {
    private int index;
    private final int size;
    final /* synthetic */ E this$0;

    private D(E e) {
        this.this$0 = e;
        this.size = e.numComponents();
    }

    public boolean hasNext() {
        if (this.size > this.index) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Read-Only");
    }

    public C0185n next() {
        if (this.size != this.this$0.numComponents()) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            try {
                C[] access$200 = this.this$0.components;
                int i = this.index;
                this.index = i + 1;
                return access$200[i].slice();
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public /* synthetic */ D(E e, C0208z zVar) {
        this(e);
    }
}
