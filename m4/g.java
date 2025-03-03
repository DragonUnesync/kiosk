package m4;

import j$.util.Objects;
import j5.c;
import java.util.LinkedHashMap;

public final class g implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final g f13383c = new g(c.f12897a);

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f13384b;

    public g(LinkedHashMap linkedHashMap) {
        this.f13384b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return Objects.equals(this.f13384b, gVar.f13384b);
    }

    public final int hashCode() {
        return this.f13384b.hashCode() - 1066154732;
    }
}
