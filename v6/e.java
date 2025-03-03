package V6;

import D6.r;
import F.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e extends f {
    public static List K(c cVar) {
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return r.f1269U;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return h.w(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
