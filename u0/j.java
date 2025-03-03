package U0;

import P0.l;
import P0.z;
import android.media.metrics.LogSessionId;
import j$.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f5372a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5373b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5374c;

    static {
        if (z.f3748a < 31) {
            new j("");
        } else {
            new j(i.f5370b, "");
        }
    }

    public j(String str) {
        l.j(z.f3748a < 31);
        this.f5372a = str;
        this.f5373b = null;
        this.f5374c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!Objects.equals(this.f5372a, jVar.f5372a) || !Objects.equals(this.f5373b, jVar.f5373b) || !Objects.equals(this.f5374c, jVar.f5374c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f5372a, this.f5373b, this.f5374c});
    }

    public j(LogSessionId logSessionId, String str) {
        this(new i(logSessionId), str);
    }

    public j(i iVar, String str) {
        this.f5373b = iVar;
        this.f5372a = str;
        this.f5374c = new Object();
    }
}
