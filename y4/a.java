package Y4;

import L4.d;
import g7.l;
import u5.C1494a;
import u5.C1495b;

public final class a extends d implements C1494a {

    /* renamed from: g  reason: collision with root package name */
    public static final A5.a f6589g = A5.a.SUCCESS;

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
        return C1495b.f15791a0;
    }

    public final int hashCode() {
        return d();
    }

    public final String toString() {
        return "MqttPubComp{reasonCode=" + this.e + l.l(c()) + "}";
    }
}
