package h6;

import g6.B;
import g6.n0;
import java.io.Serializable;

/* renamed from: h6.a  reason: case insensitive filesystem */
public abstract class C1080a implements C1082c, Serializable {
    private final String name;

    public C1080a(String str) {
        this.name = (String) B.checkNotNull(str, "name");
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + '(' + name() + ')';
    }

    public void warn(Throwable th) {
        warn("Unexpected exception:", th);
    }
}
