package g2;

import Y.e;
import java.util.ArrayList;

public final class r extends q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11990a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f11991b;

    public r(s sVar, e eVar) {
        this.f11991b = sVar;
        this.f11990a = eVar;
    }

    public final void b(p pVar) {
        ((ArrayList) this.f11990a.get(this.f11991b.f11993V)).remove(pVar);
        pVar.z(this);
    }
}
