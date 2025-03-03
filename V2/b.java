package V2;

import B2.f;
import java.security.MessageDigest;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f5972b;

    public b(Object obj) {
        W2.f.c(obj, "Argument must not be null");
        this.f5972b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f5972b.toString().getBytes(f.f383a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f5972b.equals(((b) obj).f5972b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5972b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f5972b + '}';
    }
}
