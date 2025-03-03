package D;

import android.util.Size;
import java.util.HashMap;

/* renamed from: D.k  reason: case insensitive filesystem */
public final class C0052k {

    /* renamed from: a  reason: collision with root package name */
    public final Size f912a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f913b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f914c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f915d;
    public final Size e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f916f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f917g;

    public C0052k(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4) {
        if (size != null) {
            this.f912a = size;
            this.f913b = hashMap;
            if (size2 != null) {
                this.f914c = size2;
                this.f915d = hashMap2;
                if (size3 != null) {
                    this.e = size3;
                    this.f916f = hashMap3;
                    this.f917g = hashMap4;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0052k)) {
            return false;
        }
        C0052k kVar = (C0052k) obj;
        if (!this.f912a.equals(kVar.f912a) || !this.f913b.equals(kVar.f913b) || !this.f914c.equals(kVar.f914c) || !this.f915d.equals(kVar.f915d) || !this.e.equals(kVar.e) || !this.f916f.equals(kVar.f916f) || !this.f917g.equals(kVar.f917g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((this.f912a.hashCode() ^ 1000003) * 1000003) ^ this.f913b.hashCode()) * 1000003) ^ this.f914c.hashCode()) * 1000003) ^ this.f915d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f916f.hashCode()) * 1000003) ^ this.f917g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f912a + ", s720pSizeMap=" + this.f913b + ", previewSize=" + this.f914c + ", s1440pSizeMap=" + this.f915d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f916f + ", ultraMaximumSizeMap=" + this.f917g + "}";
    }
}
