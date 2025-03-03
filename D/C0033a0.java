package D;

import B.C0016q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;

/* renamed from: D.a0  reason: case insensitive filesystem */
public final class C0033a0 implements C0016q {

    /* renamed from: b  reason: collision with root package name */
    public final int f882b;

    public C0033a0(int i) {
        this.f882b = i;
    }

    public final C0038d a() {
        return C0016q.f298a;
    }

    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0069x xVar = (C0069x) it.next();
            a.h("The camera info doesn't contain internal implementation.", xVar instanceof C0069x);
            if (xVar.d() == this.f882b) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }
}
