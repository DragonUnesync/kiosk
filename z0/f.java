package Z0;

import a1.i;
import i1.C1089b;
import java.util.List;

public final class f extends C1089b {

    /* renamed from: X  reason: collision with root package name */
    public final List f6782X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f6783Y;

    public f(long j7, List list) {
        super(0, (long) (list.size() - 1));
        this.f6783Y = j7;
        this.f6782X = list;
    }

    public final long b() {
        a();
        i iVar = (i) this.f6782X.get((int) this.f12642W);
        return this.f6783Y + iVar.f7068Y + iVar.f7066W;
    }

    public final long d() {
        a();
        return this.f6783Y + ((i) this.f6782X.get((int) this.f12642W)).f7068Y;
    }
}
