package i6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k6.d;

/* renamed from: i6.a  reason: case insensitive filesystem */
public final class C1107a implements Iterator {
    private Object[] currentBuffer;
    private int mask;
    private Object nextElement = getNext();
    private long nextIndex;
    private final long pIndex;

    public C1107a(Object[] objArr, long j7, long j8) {
        this.pIndex = j8 >> 1;
        this.nextIndex = j7 >> 1;
        setBuffer(objArr);
    }

    private Object getNext() {
        while (true) {
            long j7 = this.nextIndex;
            if (j7 >= this.pIndex) {
                break;
            }
            this.nextIndex = 1 + j7;
            Object lvRefElement = d.lvRefElement(this.currentBuffer, d.calcCircularRefElementOffset(j7, (long) this.mask));
            if (lvRefElement != null) {
                if (lvRefElement == C1108b.JUMP) {
                    Object lvRefElement2 = d.lvRefElement(this.currentBuffer, d.calcRefElementOffset((long) (this.mask + 1)));
                    if (lvRefElement2 == C1108b.BUFFER_CONSUMED || lvRefElement2 == null) {
                        break;
                    }
                    setBuffer((Object[]) lvRefElement2);
                    Object lvRefElement3 = d.lvRefElement(this.currentBuffer, d.calcCircularRefElementOffset(j7, (long) this.mask));
                    if (lvRefElement3 != null) {
                        return lvRefElement3;
                    }
                } else {
                    return lvRefElement;
                }
            }
        }
        return null;
    }

    private void setBuffer(Object[] objArr) {
        this.currentBuffer = objArr;
        this.mask = n.length(objArr) - 2;
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
