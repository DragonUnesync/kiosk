package Q;

import B.v0;
import D.A0;
import D.C0;
import D.C0048i;
import D.L0;
import g7.l;
import java.util.Iterator;

public final /* synthetic */ class c implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3968a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3969b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3970c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L0 f3971d;
    public final /* synthetic */ C0048i e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0048i f3972f;

    public /* synthetic */ c(d dVar, String str, String str2, L0 l02, C0048i iVar, C0048i iVar2) {
        this.f3968a = dVar;
        this.f3969b = str;
        this.f3970c = str2;
        this.f3971d = l02;
        this.e = iVar;
        this.f3972f = iVar2;
    }

    public final void a(C0 c02) {
        d dVar = this.f3968a;
        if (dVar.b() != null) {
            dVar.C();
            d dVar2 = dVar;
            dVar.B(dVar2.D(this.f3969b, this.f3970c, this.f3971d, this.e, this.f3972f));
            dVar.n();
            g gVar = dVar.f3975p;
            gVar.getClass();
            l.a();
            Iterator it = gVar.f3991U.iterator();
            while (it.hasNext()) {
                gVar.p((v0) it.next());
            }
        }
    }
}
