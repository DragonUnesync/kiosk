package i5;

import java.util.List;
import java.util.RandomAccess;

public interface p extends List, RandomAccess {
    p a();

    boolean contains(Object obj);

    Object get(int i);

    boolean isEmpty();

    o iterator();
}
