package Y6;

import D6.k;
import O6.a;
import P6.f;
import P6.g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public final class d extends g implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6612U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ e f6613V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f6614W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f6615X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Object obj, Object obj2, int i) {
        super(0);
        this.f6612U = i;
        this.f6613V = eVar;
        this.f6614W = obj;
        this.f6615X = obj2;
    }

    public final Object invoke() {
        switch (this.f6612U) {
            case 0:
                Q7.g gVar = this.f6613V.f6618b;
                List<Certificate> list = (List) this.f6614W;
                if (gVar != null) {
                    list = gVar.k((String) this.f6615X, list);
                }
                ArrayList arrayList = new ArrayList(k.M(list));
                for (Certificate certificate : list) {
                    f.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                Q7.g gVar2 = this.f6613V.f6618b;
                f.b(gVar2);
                return gVar2.k(((a) this.f6615X).f6596h.f6672d, ((l) this.f6614W).a());
        }
    }
}
