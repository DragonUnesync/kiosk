package X5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public interface C extends Iterable {
    List<Object> getAll(Object obj);

    Iterator<Map.Entry<Object, Object>> iterator();
}
