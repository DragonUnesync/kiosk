package M4;

import L4.e;
import g7.l;
import j$.util.Objects;
import java.nio.ByteBuffer;
import u4.C1493b;
import u4.d;
import u5.C1494a;
import u5.C1495b;
import v5.C1561a;

public final class a extends e implements C1494a {

    /* renamed from: f  reason: collision with root package name */
    public final d f3166f;

    /* renamed from: g  reason: collision with root package name */
    public final ByteBuffer f3167g;

    public a(C1561a aVar, d dVar, ByteBuffer byteBuffer, d dVar2, C1493b bVar) {
        super(aVar, dVar2, bVar);
        this.f3166f = dVar;
        this.f3167g = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!e(aVar) || !this.f3166f.equals(aVar.f3166f) || !Objects.equals(this.f3167g, aVar.f3167g)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15799i0;
    }

    public final int hashCode() {
        int hashCode = this.f3166f.hashCode();
        return Objects.hashCode(this.f3167g) + ((hashCode + (d() * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttAuth{");
        StringBuilder sb2 = new StringBuilder("reasonCode=");
        sb2.append(this.e);
        sb2.append(", method=");
        sb2.append(this.f3166f);
        ByteBuffer byteBuffer = this.f3167g;
        if (byteBuffer == null) {
            str = "";
        } else {
            str = ", data=" + byteBuffer.remaining() + "byte";
        }
        sb2.append(str);
        sb2.append(l.l(super.c()));
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
