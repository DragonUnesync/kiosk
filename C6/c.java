package C6;

import P6.f;
import java.io.Serializable;

public final class c implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final Object f711U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f712V;

    public c(Object obj, Object obj2) {
        this.f711U = obj;
        this.f712V = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (f.a(this.f711U, cVar.f711U) && f.a(this.f712V, cVar.f712V)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = 0;
        Object obj = this.f711U;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i9 = i * 31;
        Object obj2 = this.f712V;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        return "(" + this.f711U + ", " + this.f712V + ')';
    }
}
