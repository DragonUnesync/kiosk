package androidx.media3.exoplayer.dash;

import D2.G;
import D2.o;
import K1.i;
import M0.C;
import R0.g;
import X0.e;
import Y0.b;
import Y0.h;
import de.ozerov.fully.K2;
import h1.C1030A;
import h1.C1035a;
import h1.C1048n;
import java.util.List;
import l1.r;

public final class DashMediaSource$Factory implements C1030A {

    /* renamed from: a  reason: collision with root package name */
    public final o f8187a;

    /* renamed from: b  reason: collision with root package name */
    public final g f8188b;

    /* renamed from: c  reason: collision with root package name */
    public final b f8189c = new b(0);

    /* renamed from: d  reason: collision with root package name */
    public final C1048n f8190d = new C1048n(0);
    public final C1048n e = new C1048n(4);

    /* renamed from: f  reason: collision with root package name */
    public final long f8191f = 30000;

    /* renamed from: g  reason: collision with root package name */
    public final long f8192g = 5000000;

    public DashMediaSource$Factory(g gVar) {
        o oVar = new o(gVar);
        this.f8187a = oVar;
        this.f8188b = gVar;
        ((G) oVar.f1139X).f1051U = true;
    }

    public final C1030A a(boolean z) {
        ((G) this.f8187a.f1139X).f1051U = z;
        return this;
    }

    public final C1035a b(C c8) {
        r rVar;
        c8.f2786b.getClass();
        e eVar = new e();
        List list = c8.f2786b.f3062c;
        if (!list.isEmpty()) {
            rVar = new K2((Object) eVar, 3, (Object) list);
        } else {
            rVar = eVar;
        }
        h b8 = this.f8189c.b(c8);
        C1048n nVar = this.e;
        long j7 = this.f8191f;
        return new W0.g(c8, this.f8188b, rVar, this.f8187a, this.f8190d, b8, nVar, j7, this.f8192g);
    }

    public final C1030A c(i iVar) {
        G g8 = (G) this.f8187a.f1139X;
        g8.getClass();
        g8.f1052V = iVar;
        return this;
    }
}
