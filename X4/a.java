package X4;

import L4.d;
import g7.l;
import u5.C1494a;
import u5.C1495b;
import z5.C1648a;

public final class a extends d implements C1494a {

    /* renamed from: g  reason: collision with root package name */
    public static final C1648a f6282g = C1648a.SUCCESS;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return e((a) obj);
    }

    public final C1495b getType() {
        return C1495b.f15788X;
    }

    public final int hashCode() {
        return d();
    }

    public final String toString() {
        return "MqttPubAck{reasonCode=" + this.e + l.l(c()) + "}";
    }
}
