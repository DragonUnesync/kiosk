package L4;

import g7.l;
import j$.util.Objects;
import u4.C1493b;
import u4.d;

public abstract class g extends h {

    /* renamed from: d  reason: collision with root package name */
    public final d f2709d;

    public g(d dVar, C1493b bVar) {
        super(0, bVar);
        this.f2709d = dVar;
    }

    public String c() {
        d dVar = this.f2709d;
        if (dVar == null) {
            return super.c();
        }
        return "reasonString=" + dVar + l.l(super.c());
    }

    public int d() {
        return Objects.hashCode(this.f2709d) + (((C1493b) this.f2711c).f15777a.hashCode() * 31);
    }
}
