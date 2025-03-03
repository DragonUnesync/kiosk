package M4;

import com.samsung.android.knox.accounts.HostAuth;
import j$.util.Objects;
import java.nio.ByteBuffer;
import u4.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f3170a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteBuffer f3171b;

    public c(d dVar, ByteBuffer byteBuffer) {
        this.f3170a = dVar;
        this.f3171b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!Objects.equals(this.f3170a, cVar.f3170a) || !Objects.equals(this.f3171b, cVar.f3171b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3171b) + (Objects.hashCode(this.f3170a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttSimpleAuth{");
        d dVar = this.f3170a;
        ByteBuffer byteBuffer = this.f3171b;
        if (dVar == null) {
            if (byteBuffer == null) {
                str = "";
            } else {
                str = HostAuth.PASSWORD;
            }
        } else if (byteBuffer == null) {
            str = "username";
        } else {
            str = "username and password";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
