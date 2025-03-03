package c5;

import L4.f;
import g7.l;
import j$.util.Objects;
import u4.C1493b;
import u5.C1494a;
import u5.C1495b;

/* renamed from: c5.a  reason: case insensitive filesystem */
public final class C0618a extends f implements C1494a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0618a)) {
            return false;
        }
        C0618a aVar = (C0618a) obj;
        if (!((C1493b) this.f2711c).equals((C1493b) aVar.f2711c) || !Objects.equals(this.f2709d, aVar.f2709d) || !this.f2708f.equals(aVar.f2708f)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15793c0;
    }

    public final int hashCode() {
        return d();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttSubAck{");
        sb.append("reasonCodes=" + this.f2708f + l.l(super.c()));
        sb.append("}");
        return sb.toString();
    }
}
