package D;

import B.C0022x;
import android.util.Range;
import android.util.Size;
import java.util.List;
import t.C1412a;

/* renamed from: D.a  reason: case insensitive filesystem */
public final class C0032a {

    /* renamed from: a  reason: collision with root package name */
    public final C0050j f876a;

    /* renamed from: b  reason: collision with root package name */
    public final int f877b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f878c;

    /* renamed from: d  reason: collision with root package name */
    public final C0022x f879d;
    public final List e;

    /* renamed from: f  reason: collision with root package name */
    public final C1412a f880f;

    /* renamed from: g  reason: collision with root package name */
    public final Range f881g;

    public C0032a(C0050j jVar, int i, Size size, C0022x xVar, List list, C1412a aVar, Range range) {
        if (jVar != null) {
            this.f876a = jVar;
            this.f877b = i;
            if (size != null) {
                this.f878c = size;
                if (xVar != null) {
                    this.f879d = xVar;
                    if (list != null) {
                        this.e = list;
                        this.f880f = aVar;
                        this.f881g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0032a)) {
            return false;
        }
        C0032a aVar = (C0032a) obj;
        if (this.f876a.equals(aVar.f876a) && this.f877b == aVar.f877b && this.f878c.equals(aVar.f878c) && this.f879d.equals(aVar.f879d) && this.e.equals(aVar.e)) {
            C1412a aVar2 = aVar.f880f;
            C1412a aVar3 = this.f880f;
            if (aVar3 != null ? aVar3.equals(aVar2) : aVar2 == null) {
                Range range = aVar.f881g;
                Range range2 = this.f881g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f876a.hashCode() ^ 1000003) * 1000003) ^ this.f877b) * 1000003) ^ this.f878c.hashCode()) * 1000003) ^ this.f879d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i8 = 0;
        C1412a aVar = this.f880f;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        int i9 = (hashCode ^ i) * 1000003;
        Range range = this.f881g;
        if (range != null) {
            i8 = range.hashCode();
        }
        return i9 ^ i8;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f876a + ", imageFormat=" + this.f877b + ", size=" + this.f878c + ", dynamicRange=" + this.f879d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f880f + ", targetFrameRate=" + this.f881g + "}";
    }
}
