package D6;

import F.h;
import P6.f;
import java.util.List;

public abstract class j extends h {
    public static int K(List list) {
        f.e(list, "<this>");
        return list.size() - 1;
    }

    public static List L(Object... objArr) {
        f.e(objArr, "elements");
        if (objArr.length > 0) {
            return h.A(objArr);
        }
        return r.f1269U;
    }
}
