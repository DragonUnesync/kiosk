package M4;

import j$.util.Objects;
import java.nio.ByteBuffer;
import u4.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f3168a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteBuffer f3169b;

    public b(d dVar, ByteBuffer byteBuffer) {
        this.f3168a = dVar;
        this.f3169b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f3168a.equals(bVar.f3168a) || !Objects.equals(this.f3169b, bVar.f3169b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3169b) + (this.f3168a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttEnhancedAuth{");
        StringBuilder sb2 = new StringBuilder("method=");
        sb2.append(this.f3168a);
        ByteBuffer byteBuffer = this.f3169b;
        if (byteBuffer == null) {
            str = "";
        } else {
            str = ", data=" + byteBuffer.remaining() + "byte";
        }
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
