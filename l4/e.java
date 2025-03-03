package L4;

import j$.util.Objects;
import u4.C1493b;
import u4.d;
import u5.C1496c;

public abstract class e extends g {
    public final C1496c e;

    public e(C1496c cVar, d dVar, C1493b bVar) {
        super(dVar, bVar);
        this.e = cVar;
    }

    public final int d() {
        return this.e.hashCode() + (super.d() * 31);
    }

    public final boolean e(e eVar) {
        if (!((C1493b) this.f2711c).equals((C1493b) eVar.f2711c) || !Objects.equals(this.f2709d, eVar.f2709d) || !this.e.equals(eVar.e)) {
            return false;
        }
        return true;
    }
}
