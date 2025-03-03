package C;

import B.p0;
import M.d;
import android.util.Size;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public p0 f475a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f476b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Size f477c;

    /* renamed from: d  reason: collision with root package name */
    public final int f478d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f479f;

    /* renamed from: g  reason: collision with root package name */
    public final d f480g;

    /* renamed from: h  reason: collision with root package name */
    public final d f481h;

    public a(Size size, int i, int i8, boolean z, d dVar, d dVar2) {
        if (size != null) {
            this.f477c = size;
            this.f478d = i;
            this.e = i8;
            this.f479f = z;
            this.f480g = dVar;
            this.f481h = dVar2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f477c.equals(aVar.f477c) || this.f478d != aVar.f478d || this.e != aVar.e || this.f479f != aVar.f479f || !this.f480g.equals(aVar.f480g) || !this.f481h.equals(aVar.f481h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f477c.hashCode() ^ 1000003) * 1000003) ^ this.f478d) * 1000003) ^ this.e) * 1000003;
        if (this.f479f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 583896283) ^ 35) * 1000003) ^ this.f480g.hashCode()) * 1000003) ^ this.f481h.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f477c + ", inputFormat=" + this.f478d + ", outputFormat=" + this.e + ", virtualCamera=" + this.f479f + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.f480g + ", errorEdge=" + this.f481h + "}";
    }
}
