package b5;

import L4.h;
import g7.l;
import i5.p;
import u4.C1493b;
import u5.C1494a;
import u5.C1495b;

public final class b extends h implements C1494a {

    /* renamed from: d  reason: collision with root package name */
    public final p f8684d;

    public b(p pVar) {
        super(0, C1493b.f15776c);
        this.f8684d = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!((C1493b) this.f2711c).equals((C1493b) bVar.f2711c) || !this.f8684d.equals(bVar.f8684d)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15792b0;
    }

    public final int hashCode() {
        return this.f8684d.hashCode() + (((C1493b) this.f2711c).f15777a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttSubscribe{");
        sb.append("subscriptions=" + this.f8684d + l.l(super.c()));
        sb.append('}');
        return sb.toString();
    }
}
