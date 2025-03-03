package D6;

import V6.c;
import java.util.Iterator;
import java.util.List;

public final class p implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1267b;

    public /* synthetic */ p(int i, Object obj) {
        this.f1266a = i;
        this.f1267b = obj;
    }

    public final Iterator iterator() {
        switch (this.f1266a) {
            case 0:
                return ((List) this.f1267b).iterator();
            default:
                return (Iterator) this.f1267b;
        }
    }
}
