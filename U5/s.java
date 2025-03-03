package U5;

import java.nio.channels.SelectionKey;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class s implements Iterator {
    private int idx;
    final /* synthetic */ t this$0;

    public s(t tVar) {
        this.this$0 = tVar;
    }

    public boolean hasNext() {
        if (this.idx < this.this$0.size) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public SelectionKey next() {
        if (hasNext()) {
            SelectionKey[] selectionKeyArr = this.this$0.keys;
            int i = this.idx;
            this.idx = i + 1;
            return selectionKeyArr[i];
        }
        throw new NoSuchElementException();
    }
}
