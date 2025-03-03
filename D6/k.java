package D6;

import P6.f;
import java.util.Collection;

public abstract class k extends j {
    public static int M(Iterable iterable) {
        f.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
