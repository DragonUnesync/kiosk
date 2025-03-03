package O4;

import L4.h;
import M4.b;
import u4.C1492a;

public final class c extends h {

    /* renamed from: d  reason: collision with root package name */
    public final C1492a f3660d;
    public final b e;

    public c(a aVar, C1492a aVar2, b bVar) {
        super(1, aVar);
        this.f3660d = aVar2;
        this.e = bVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttStatefulConnect{");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stateless=" + ((h) this.f2711c));
        sb2.append(", clientIdentifier=");
        sb2.append(this.f3660d);
        b bVar = this.e;
        if (bVar == null) {
            str = "";
        } else {
            str = ", enhancedAuth=" + bVar;
        }
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
