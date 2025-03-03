package D2;

import B2.f;
import java.security.MessageDigest;

/* renamed from: D2.f  reason: case insensitive filesystem */
public final class C0077f implements f {

    /* renamed from: b  reason: collision with root package name */
    public final f f1075b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1076c;

    public C0077f(f fVar, f fVar2) {
        this.f1075b = fVar;
        this.f1076c = fVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f1075b.a(messageDigest);
        this.f1076c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0077f)) {
            return false;
        }
        C0077f fVar = (C0077f) obj;
        if (!this.f1075b.equals(fVar.f1075b) || !this.f1076c.equals(fVar.f1076c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1076c.hashCode() + (this.f1075b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f1075b + ", signature=" + this.f1076c + '}';
    }
}
