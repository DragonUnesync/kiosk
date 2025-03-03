package U5;

import java.nio.channels.SelectionKey;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

public final class t extends AbstractSet {
    SelectionKey[] keys = new SelectionKey[1024];
    int size;

    private void increaseCapacity() {
        SelectionKey[] selectionKeyArr = this.keys;
        SelectionKey[] selectionKeyArr2 = new SelectionKey[(selectionKeyArr.length << 1)];
        System.arraycopy(selectionKeyArr, 0, selectionKeyArr2, 0, this.size);
        this.keys = selectionKeyArr2;
    }

    public boolean contains(Object obj) {
        SelectionKey[] selectionKeyArr = this.keys;
        int i = this.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (selectionKeyArr[i8].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<SelectionKey> iterator() {
        return new s(this);
    }

    public boolean remove(Object obj) {
        return false;
    }

    public void reset() {
        reset(0);
    }

    public int size() {
        return this.size;
    }

    public boolean add(SelectionKey selectionKey) {
        if (selectionKey == null) {
            return false;
        }
        if (this.size == this.keys.length) {
            increaseCapacity();
        }
        SelectionKey[] selectionKeyArr = this.keys;
        int i = this.size;
        this.size = i + 1;
        selectionKeyArr[i] = selectionKey;
        return true;
    }

    public void reset(int i) {
        Arrays.fill(this.keys, i, this.size, (Object) null);
        this.size = 0;
    }
}
