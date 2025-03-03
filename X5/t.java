package X5;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class t implements Iterator {
    private C0367s current;
    final /* synthetic */ z this$0;

    private t(z zVar) {
        this.this$0 = zVar;
        this.current = zVar.head;
    }

    public boolean hasNext() {
        if (this.current.after != this.this$0.head) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("read only");
    }

    public Map.Entry<Object, Object> next() {
        C0367s sVar = this.current.after;
        this.current = sVar;
        if (sVar != this.this$0.head) {
            return sVar;
        }
        throw new NoSuchElementException();
    }
}
