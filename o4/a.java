package O4;

import L4.h;
import M4.c;
import g7.l;
import j$.util.Objects;
import u4.C1493b;
import u5.C1494a;
import u5.C1495b;

public final class a extends h implements C1494a {

    /* renamed from: d  reason: collision with root package name */
    public final int f3649d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3650f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3651g;

    /* renamed from: h  reason: collision with root package name */
    public final c f3652h;

    static {
        C1493b bVar = C1493b.f15776c;
    }

    public a(int i, boolean z, long j7, b bVar, c cVar, C1493b bVar2) {
        super(0, bVar2);
        this.f3649d = i;
        this.e = z;
        this.f3650f = j7;
        this.f3651g = bVar;
        this.f3652h = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!((C1493b) this.f2711c).equals((C1493b) aVar.f2711c) || this.f3649d != aVar.f3649d || this.e != aVar.e || this.f3650f != aVar.f3650f || !this.f3651g.equals(aVar.f3651g) || !Objects.equals(this.f3652h, aVar.f3652h)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15785U;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((C1493b) this.f2711c).f15777a.hashCode() * 31) + this.f3649d) * 31;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j7 = this.f3650f;
        int hashCode2 = this.f3651g.hashCode();
        return (Objects.hashCode(this.f3652h) + ((hashCode2 + ((((hashCode + i) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31)) * 961;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("MqttConnect{");
        StringBuilder sb2 = new StringBuilder("keepAlive=");
        sb2.append(this.f3649d);
        sb2.append(", cleanStart=");
        sb2.append(this.e);
        sb2.append(", sessionExpiryInterval=");
        sb2.append(this.f3650f);
        b bVar = b.f3653h;
        b bVar2 = this.f3651g;
        if (bVar2 == bVar) {
            str = "";
        } else {
            str = ", restrictions=" + bVar2;
        }
        sb2.append(str);
        c cVar = this.f3652h;
        if (cVar == null) {
            str2 = "";
        } else {
            str2 = ", simpleAuth=" + cVar;
        }
        sb2.append(str2);
        sb2.append("");
        sb2.append(l.l(super.c()));
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
