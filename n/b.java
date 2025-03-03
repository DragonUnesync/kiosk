package N;

import M.k;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final k f3202a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3203b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3204c;

    public b(k kVar, k kVar2, ArrayList arrayList) {
        if (kVar != null) {
            this.f3202a = kVar;
            if (kVar2 != null) {
                this.f3203b = kVar2;
                this.f3204c = arrayList;
                return;
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f3202a.equals(bVar.f3202a) || !this.f3203b.equals(bVar.f3203b) || !this.f3204c.equals(bVar.f3204c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f3202a.hashCode() ^ 1000003) * 1000003) ^ this.f3203b.hashCode()) * 1000003) ^ this.f3204c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f3202a + ", secondarySurfaceEdge=" + this.f3203b + ", outConfigs=" + this.f3204c + "}";
    }
}
