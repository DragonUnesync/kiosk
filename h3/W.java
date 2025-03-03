package H3;

import Q7.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public enum W implements Iterator {
    ;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        g.j("no calls to next() since the last call to remove()", false);
    }
}
