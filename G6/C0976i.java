package g6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g6.i  reason: case insensitive filesystem */
public final class C0976i implements Iterator {
    private int index;
    final /* synthetic */ C0977j this$0;

    private C0976i(C0977j jVar) {
        this.this$0 = jVar;
    }

    public boolean hasNext() {
        if (this.index < this.this$0.size) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    public C0967a0 next() {
        if (this.index < this.this$0.size) {
            C0967a0[] access$200 = this.this$0.queue;
            int i = this.index;
            this.index = i + 1;
            return access$200[i];
        }
        throw new NoSuchElementException();
    }
}
