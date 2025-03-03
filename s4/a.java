package S4;

import L4.e;
import g7.l;
import j$.util.Objects;
import u4.C1493b;
import u4.d;
import u5.C1495b;
import x5.C1606a;
import x5.C1607b;

public final class a extends e implements C1606a {

    /* renamed from: f  reason: collision with root package name */
    public final long f4533f;

    /* renamed from: g  reason: collision with root package name */
    public final d f4534g;

    static {
        C1493b bVar = C1493b.f15776c;
    }

    public a(C1607b bVar, long j7, d dVar, d dVar2, C1493b bVar2) {
        super(bVar, dVar2, bVar2);
        this.f4533f = j7;
        this.f4534g = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!e(aVar) || this.f4533f != aVar.f4533f || !Objects.equals(this.f4534g, aVar.f4534g)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15798h0;
    }

    public final int hashCode() {
        long j7 = this.f4533f;
        return Objects.hashCode(this.f4534g) + (((d() * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttDisconnect{");
        StringBuilder sb2 = new StringBuilder("reasonCode=");
        sb2.append(this.e);
        String str2 = "";
        long j7 = this.f4533f;
        if (j7 == -1) {
            str = str2;
        } else {
            str = N.e.w(", sessionExpiryInterval=", j7);
        }
        sb2.append(str);
        d dVar = this.f4534g;
        if (dVar != null) {
            str2 = ", serverReference=" + dVar;
        }
        sb2.append(str2);
        sb2.append(l.l(super.c()));
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
