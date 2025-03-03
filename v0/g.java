package V0;

import D2.k;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final g f5520d = new Object().a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5521a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5522b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5523c;

    public g(k kVar) {
        this.f5521a = kVar.f1095a;
        this.f5522b = kVar.f1096b;
        this.f5523c = kVar.f1097c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f5521a == gVar.f5521a && this.f5522b == gVar.f5522b && this.f5523c == gVar.f5523c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5521a ? 1 : 0) << true) + ((this.f5522b ? 1 : 0) << true) + (this.f5523c ? 1 : 0);
    }
}
