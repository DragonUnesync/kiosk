package Y6;

import D6.i;
import O6.a;
import P6.f;
import Q7.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f6616c = new e(i.W(new ArrayList()), (g) null);

    /* renamed from: a  reason: collision with root package name */
    public final Set f6617a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6618b;

    public e(Set set, g gVar) {
        this.f6617a = set;
        this.f6618b = gVar;
    }

    public final void a(String str, a aVar) {
        f.e(str, "hostname");
        Iterator it = this.f6617a.iterator();
        if (it.hasNext()) {
            throw Q0.g.k(it);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (!f.a(eVar.f6617a, this.f6617a) || !f.a(eVar.f6618b, this.f6618b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f6617a.hashCode() + 1517) * 41;
        g gVar = this.f6618b;
        if (gVar != null) {
            i = gVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
