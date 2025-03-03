package X5;

import java.util.Iterator;
import java.util.Map;

public final class F implements Iterator {
    private final Iterator<Map.Entry<CharSequence, CharSequence>> iter;

    public F(Iterator<Map.Entry<CharSequence, CharSequence>> it) {
        this.iter = it;
    }

    public boolean hasNext() {
        return this.iter.hasNext();
    }

    public void remove() {
        this.iter.remove();
    }

    public Map.Entry<String, String> next() {
        return new E(this.iter.next());
    }
}
