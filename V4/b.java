package V4;

import X4.a;
import t5.C1429a;

public final class b extends e {

    /* renamed from: c  reason: collision with root package name */
    public final a f5982c;

    public b(a aVar, C1429a aVar2, a aVar3) {
        super(aVar, aVar2);
        this.f5982c = aVar3;
    }

    public final boolean b(e eVar) {
        return eVar instanceof b;
    }

    public final a c() {
        return this.f5985a;
    }

    public final String d() {
        return super.d() + ", pubAck=" + this.f5982c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        return this.f5982c.equals(((b) obj).f5982c);
    }

    public final int hashCode() {
        return this.f5982c.d() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "MqttQos1Result{" + d() + '}';
    }
}
