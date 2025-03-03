package W4;

import java.nio.ByteBuffer;
import r5.C1390a;

public final class a implements C1390a {

    /* renamed from: b  reason: collision with root package name */
    public final V4.a f6190b;

    public a(V4.a aVar) {
        this.f6190b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f6190b.equals(((a) obj).f6190b);
    }

    public final int hashCode() {
        return this.f6190b.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttPublish{");
        StringBuilder sb2 = new StringBuilder("topic=");
        V4.a aVar = this.f6190b;
        sb2.append(aVar.f5975d);
        ByteBuffer byteBuffer = aVar.e;
        if (byteBuffer == null) {
            str = "";
        } else {
            str = ", payload=" + byteBuffer.remaining() + "byte";
        }
        sb2.append(str);
        sb2.append(", qos=");
        sb2.append(aVar.f5976f);
        sb2.append(", retain=");
        sb2.append(aVar.f5977g);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
