package a5;

import C5.a;
import L4.d;
import g7.l;
import u5.C1494a;
import u5.C1495b;

/* renamed from: a5.a  reason: case insensitive filesystem */
public final class C0426a extends d implements C1494a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f7218g = a.SUCCESS;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0426a)) {
            return false;
        }
        return e((C0426a) obj);
    }

    public final C1495b getType() {
        return C1495b.f15790Z;
    }

    public final int hashCode() {
        return d();
    }

    public final String toString() {
        return "MqttPubRel{reasonCode=" + this.e + l.l(c()) + "}";
    }
}
