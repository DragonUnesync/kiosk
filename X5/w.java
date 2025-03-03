package X5;

import g6.B;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class w implements Iterator {
    private final int hash;
    private final Object name;
    private C0367s next;
    private C0367s previous;
    private C0367s removalPrevious;
    final /* synthetic */ z this$0;

    public w(z zVar, Object obj) {
        this.this$0 = zVar;
        this.name = B.checkNotNull(obj, "name");
        int hashCode = zVar.hashingStrategy.hashCode(obj);
        this.hash = hashCode;
        calculateNext(zVar.entries[zVar.index(hashCode)]);
    }

    private void calculateNext(C0367s sVar) {
        while (sVar != null) {
            if (sVar.hash != this.hash || !this.this$0.hashingStrategy.equals(this.name, sVar.key)) {
                sVar = sVar.next;
            } else {
                this.next = sVar;
                return;
            }
        }
        this.next = null;
    }

    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (hasNext()) {
            C0367s sVar = this.previous;
            if (sVar != null) {
                this.removalPrevious = sVar;
            }
            C0367s sVar2 = this.next;
            this.previous = sVar2;
            calculateNext(sVar2.next);
            return this.previous.value;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        C0367s sVar = this.previous;
        if (sVar != null) {
            this.removalPrevious = this.this$0.remove0(sVar, this.removalPrevious);
            this.previous = null;
            return;
        }
        throw new IllegalStateException();
    }
}
