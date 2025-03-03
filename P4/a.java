package P4;

import L4.e;
import M4.b;
import Q0.g;
import g7.l;
import j$.util.Objects;
import u4.C1492a;
import u4.C1493b;
import u4.d;
import u5.C1494a;
import u5.C1495b;
import w5.C1591a;

public final class a extends e implements C1494a {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3780f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3781g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3782h;
    public final C1492a i;

    /* renamed from: j  reason: collision with root package name */
    public final b f3783j;

    /* renamed from: k  reason: collision with root package name */
    public final b f3784k;

    /* renamed from: l  reason: collision with root package name */
    public final d f3785l;

    /* renamed from: m  reason: collision with root package name */
    public final d f3786m;

    public a(C1591a aVar, boolean z, long j7, int i8, C1492a aVar2, b bVar, b bVar2, d dVar, d dVar2, d dVar3, C1493b bVar3) {
        super(aVar, dVar3, bVar3);
        this.f3780f = z;
        this.f3781g = j7;
        this.f3782h = i8;
        this.i = aVar2;
        this.f3783j = bVar;
        this.f3784k = bVar2;
        this.f3785l = dVar;
        this.f3786m = dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!e(aVar) || this.f3780f != aVar.f3780f || this.f3781g != aVar.f3781g || this.f3782h != aVar.f3782h || !Objects.equals(this.i, aVar.i) || !Objects.equals(this.f3783j, aVar.f3783j) || !this.f3784k.equals(aVar.f3784k) || !Objects.equals(this.f3785l, aVar.f3785l) || !Objects.equals(this.f3786m, aVar.f3786m)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15786V;
    }

    public final int hashCode() {
        int i8;
        int d8 = d() * 31;
        if (this.f3780f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        long j7 = this.f3781g;
        int hashCode = Objects.hashCode(this.i);
        int hashCode2 = Objects.hashCode(this.f3783j);
        int hashCode3 = this.f3784k.hashCode();
        int hashCode4 = Objects.hashCode(this.f3785l);
        return Objects.hashCode(this.f3786m) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((((((d8 + i8) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f3782h) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        StringBuilder sb = new StringBuilder("MqttConnAck{");
        StringBuilder sb2 = new StringBuilder("reasonCode=");
        sb2.append(this.e);
        sb2.append(", sessionPresent=");
        sb2.append(this.f3780f);
        long j7 = this.f3781g;
        String str7 = "";
        if (j7 == -1) {
            str = str7;
        } else {
            str = N.e.w(", sessionExpiryInterval=", j7);
        }
        sb2.append(str);
        int i8 = this.f3782h;
        if (((long) i8) == -1) {
            str2 = str7;
        } else {
            str2 = g.m(i8, ", serverKeepAlive=");
        }
        sb2.append(str2);
        C1492a aVar = this.i;
        if (aVar == null) {
            str3 = str7;
        } else {
            str3 = ", assignedClientIdentifier=" + aVar;
        }
        sb2.append(str3);
        b bVar = this.f3783j;
        if (bVar == null) {
            str4 = str7;
        } else {
            str4 = ", enhancedAuth=" + bVar;
        }
        sb2.append(str4);
        b bVar2 = b.f3787j;
        b bVar3 = this.f3784k;
        if (bVar3 == bVar2) {
            str5 = str7;
        } else {
            str5 = ", restrictions=" + bVar3;
        }
        sb2.append(str5);
        d dVar = this.f3785l;
        if (dVar == null) {
            str6 = str7;
        } else {
            str6 = ", responseInformation=" + dVar;
        }
        sb2.append(str6);
        d dVar2 = this.f3786m;
        if (dVar2 != null) {
            str7 = ", serverReference=" + dVar2;
        }
        sb2.append(str7);
        sb2.append(l.l(super.c()));
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
