package L4;

import g7.l;
import u4.C1493b;
import u5.C1496c;

public abstract class d extends e implements b {

    /* renamed from: f  reason: collision with root package name */
    public final int f2707f;

    public d(int i, C1496c cVar, u4.d dVar, C1493b bVar) {
        super(cVar, dVar, bVar);
        this.f2707f = i;
    }

    public final int a() {
        return this.f2707f;
    }

    public final String c() {
        return "packetIdentifier=" + this.f2707f + l.l(super.c());
    }
}
