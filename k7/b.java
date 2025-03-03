package K7;

import java.util.Comparator;

public enum b implements Comparator {
    ;

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }
}
