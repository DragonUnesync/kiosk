package D2;

import D.N;
import F.h;
import V0.g;
import java.util.ArrayList;
import java.util.Iterator;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1095a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1096b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1097c;

    public g a() {
        if (this.f1095a || (!this.f1096b && !this.f1097c)) {
            return new g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        if ((this.f1097c || this.f1096b) && this.f1095a) {
            return true;
        }
        return false;
    }

    public void c(ArrayList arrayList) {
        if ((this.f1095a || this.f1096b || this.f1097c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((N) it.next()).a();
            }
            h.j("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
