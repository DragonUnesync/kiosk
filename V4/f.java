package V4;

import L4.i;
import i5.n;

public final class f extends i {
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5987f;

    /* renamed from: g  reason: collision with root package name */
    public final n f5988g;

    public f(a aVar, int i, boolean z, int i8, n nVar) {
        super(aVar, i);
        this.e = z;
        this.f5987f = i8;
        this.f5988g = nVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttStatefulPublish{");
        sb.append(super.c() + ", dup=" + this.e + ", topicAlias=" + this.f5987f + ", subscriptionIdentifiers=" + this.f5988g);
        sb.append('}');
        return sb.toString();
    }
}
