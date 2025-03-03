package D2;

import B2.f;
import B2.i;
import W2.c;
import java.security.MessageDigest;

public final class v implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f1178b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1179c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1180d;
    public final Class e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f1181f;

    /* renamed from: g  reason: collision with root package name */
    public final f f1182g;

    /* renamed from: h  reason: collision with root package name */
    public final c f1183h;
    public final i i;

    /* renamed from: j  reason: collision with root package name */
    public int f1184j;

    public v(Object obj, f fVar, int i8, int i9, c cVar, Class cls, Class cls2, i iVar) {
        W2.f.c(obj, "Argument must not be null");
        this.f1178b = obj;
        this.f1182g = fVar;
        this.f1179c = i8;
        this.f1180d = i9;
        W2.f.c(cVar, "Argument must not be null");
        this.f1183h = cVar;
        W2.f.c(cls, "Resource class must not be null");
        this.e = cls;
        W2.f.c(cls2, "Transcode class must not be null");
        this.f1181f = cls2;
        W2.f.c(iVar, "Argument must not be null");
        this.i = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f1178b.equals(vVar.f1178b) || !this.f1182g.equals(vVar.f1182g) || this.f1180d != vVar.f1180d || this.f1179c != vVar.f1179c || !this.f1183h.equals(vVar.f1183h) || !this.e.equals(vVar.e) || !this.f1181f.equals(vVar.f1181f) || !this.i.equals(vVar.i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f1184j == 0) {
            int hashCode = this.f1178b.hashCode();
            this.f1184j = hashCode;
            int hashCode2 = ((((this.f1182g.hashCode() + (hashCode * 31)) * 31) + this.f1179c) * 31) + this.f1180d;
            this.f1184j = hashCode2;
            int hashCode3 = this.f1183h.hashCode() + (hashCode2 * 31);
            this.f1184j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.f1184j = hashCode4;
            int hashCode5 = this.f1181f.hashCode() + (hashCode4 * 31);
            this.f1184j = hashCode5;
            this.f1184j = this.i.f388b.hashCode() + (hashCode5 * 31);
        }
        return this.f1184j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f1178b + ", width=" + this.f1179c + ", height=" + this.f1180d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f1181f + ", signature=" + this.f1182g + ", hashCode=" + this.f1184j + ", transformations=" + this.f1183h + ", options=" + this.i + '}';
    }
}
