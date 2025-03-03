package M7;

import G7.e;
import j$.util.stream.Stream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3178b;

    public b(c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        this.f3178b = arrayList;
        Stream.-CC.of(cVarArr).filter(new e(2)).forEach(new a(0, arrayList));
    }

    public final int a(int i, StringWriter stringWriter, String str) {
        Iterator it = this.f3178b.iterator();
        while (it.hasNext()) {
            int a8 = ((c) it.next()).a(i, stringWriter, str);
            if (a8 != 0) {
                return a8;
            }
        }
        return 0;
    }
}
