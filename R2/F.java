package r2;

import java.util.Collection;
import y2.C1627b;

public abstract class F extends C1377A {
    public final int a(p pVar) {
        o oVar = (o) pVar;
        int c8 = oVar.c() * oVar.e();
        if (c8 >= 0) {
            int i = this.f14853d;
            if (i >= 0) {
                return i + c8;
            }
            throw new RuntimeException("fileOffset not yet set");
        }
        throw new IllegalArgumentException("relative < 0");
    }

    public final void e() {
        k();
        for (p a8 : c()) {
            a8.a(this.f14851b);
        }
    }

    public final int h() {
        Collection c8 = c();
        int size = c8.size();
        if (size == 0) {
            return 0;
        }
        return ((p) c8.iterator().next()).c() * size;
    }

    public final void j(C1627b bVar) {
        for (p d8 : c()) {
            d8.d(this.f14851b, bVar);
            bVar.a(this.f14852c);
        }
    }

    public abstract void k();
}
