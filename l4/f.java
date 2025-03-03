package L4;

import g7.l;
import i5.p;
import u4.C1493b;
import u4.d;

public abstract class f extends g implements b {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2708f;

    public f(int i, p pVar, d dVar, C1493b bVar) {
        super(dVar, bVar);
        this.e = i;
        this.f2708f = pVar;
    }

    public final int a() {
        return this.e;
    }

    public String c() {
        return "packetIdentifier=" + this.e + l.l(super.c());
    }

    public final int d() {
        return this.f2708f.hashCode() + (super.d() * 31);
    }
}
