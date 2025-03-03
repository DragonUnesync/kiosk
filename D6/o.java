package D6;

import P6.f;
import java.util.ArrayList;
import java.util.Collection;

public abstract class o extends n {
    public static void N(ArrayList arrayList, Iterable iterable) {
        f.e(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            arrayList.add(add);
        }
    }
}
