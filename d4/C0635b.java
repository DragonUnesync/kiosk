package d4;

import M3.h;
import Q0.g;
import S3.a;

/* renamed from: d4.b  reason: case insensitive filesystem */
public final class C0635b extends C0637d {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f9751W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0635b(a aVar, int i) {
        super(aVar);
        this.f9751W = i;
    }

    public final String h() {
        switch (this.f9751W) {
            case 0:
                if (((a) this.f2257U).f4504V >= 48) {
                    StringBuilder sb = new StringBuilder();
                    j(8, sb);
                    k kVar = (k) this.f2258V;
                    int h5 = k.h(48, 2, (a) kVar.f9766V);
                    sb.append("(392");
                    sb.append(h5);
                    sb.append(')');
                    sb.append(kVar.g(50, (String) null).f9755W);
                    return sb.toString();
                }
                throw h.f3144W;
            case 1:
                if (((a) this.f2257U).f4504V >= 48) {
                    StringBuilder sb2 = new StringBuilder();
                    j(8, sb2);
                    k kVar2 = (k) this.f2258V;
                    int h8 = k.h(48, 2, (a) kVar2.f9766V);
                    sb2.append("(393");
                    sb2.append(h8);
                    sb2.append(')');
                    int h9 = k.h(50, 10, (a) kVar2.f9766V);
                    if (h9 / 100 == 0) {
                        sb2.append('0');
                    }
                    if (h9 / 10 == 0) {
                        sb2.append('0');
                    }
                    sb2.append(h9);
                    sb2.append(kVar2.g(60, (String) null).f9755W);
                    return sb2.toString();
                }
                throw h.f3144W;
            default:
                StringBuilder r8 = g.r("(01)");
                int length = r8.length();
                k kVar3 = (k) this.f2258V;
                r8.append(k.h(4, 4, (a) kVar3.f9766V));
                k(r8, 8, length);
                return kVar3.f(48, r8);
        }
    }
}
