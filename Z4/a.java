package Z4;

import L4.d;
import g7.l;
import u5.C1494a;
import u5.C1495b;

public final class a extends d implements C1494a {

    /* renamed from: g  reason: collision with root package name */
    public static final B5.a f6979g = B5.a.SUCCESS;

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
        return C1495b.f15789Y;
    }

    public final int hashCode() {
        return d();
    }

    public final String toString() {
        return "MqttPubRec{reasonCode=" + this.e + l.l(c()) + "}";
    }
}
