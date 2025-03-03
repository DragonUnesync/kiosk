package R4;

import M4.c;
import O4.b;
import u4.C1493b;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4343b = new a(new O4.a(60, true, 0, b.f3653h, (c) null, C1493b.f15776c));

    /* renamed from: a  reason: collision with root package name */
    public final O4.a f4344a;

    public a(O4.a aVar) {
        this.f4344a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f4344a.equals(((a) obj).f4344a);
    }

    public final int hashCode() {
        return this.f4344a.hashCode();
    }

    public final String toString() {
        N4.a aVar;
        String str;
        StringBuilder sb = new StringBuilder("MqttConnect{");
        O4.a aVar2 = this.f4344a;
        c cVar = aVar2.f3652h;
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = new N4.a(cVar);
        }
        StringBuilder sb2 = new StringBuilder("keepAlive=");
        sb2.append(aVar2.f3649d);
        sb2.append(", cleanSession=");
        sb2.append(aVar2.e);
        sb2.append(", restrictions=");
        sb2.append(aVar2.f3651g);
        if (aVar == null) {
            str = "";
        } else {
            str = ", simpleAuth=" + aVar;
        }
        sb2.append(str);
        sb2.append("");
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
