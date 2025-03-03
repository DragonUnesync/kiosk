package B2;

import W2.c;
import java.security.MessageDigest;

public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    public final c f388b = new Y.i((Object) null);

    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            c cVar = this.f388b;
            if (i < cVar.f6308W) {
                h hVar = (h) cVar.f(i);
                Object j7 = this.f388b.j(i);
                g gVar = hVar.f385b;
                if (hVar.f387d == null) {
                    hVar.f387d = hVar.f386c.getBytes(f.f383a);
                }
                gVar.c(hVar.f387d, j7, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object c(h hVar) {
        c cVar = this.f388b;
        if (cVar.containsKey(hVar)) {
            return cVar.get(hVar);
        }
        return hVar.f384a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f388b.equals(((i) obj).f388b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f388b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f388b + '}';
    }
}
