package T7;

import Q0.d;
import S7.i;

/* 'enum' modifier removed */
/* renamed from: T7.m  reason: case insensitive filesystem */
public final class C0309m extends B {
    public C0309m() {
        super("Initial", 0);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (B.a(dVar)) {
            return true;
        }
        if (dVar.k()) {
            bVar.E((J) dVar);
        } else {
            boolean l8 = dVar.l();
            C0320s sVar = B.f5052V;
            if (l8) {
                K k8 = (K) dVar;
                i iVar = new i(bVar.f5249h.b(k8.f5099W.toString()), k8.f5101Y.toString(), k8.f5102Z.toString());
                String str = k8.f5100X;
                if (str != null) {
                    iVar.d("pubSysKey", str);
                }
                bVar.f5246d.C(iVar);
                if (k8.f5103a0 || !iVar.c("#doctype").equals("html") || iVar.c("publicId").equalsIgnoreCase("HTML")) {
                    bVar.f5246d.f4555f0 = 2;
                }
                bVar.f5161l = sVar;
            } else {
                bVar.f5246d.f4555f0 = 2;
                bVar.f5161l = sVar;
                return bVar.h(dVar);
            }
        }
        return true;
    }
}
