package p2;

import t2.k;
import t2.p;
import y2.C1627b;

public final class l extends g {
    public t[] e;

    public l(p pVar, t2.l lVar) {
        super(j.f14552b, pVar, lVar);
        if (lVar.f16371V.length != 0) {
            this.e = null;
            return;
        }
        throw new IllegalArgumentException("registers.size() == 0");
    }

    public final String a() {
        return null;
    }

    public final int b() {
        m();
        int i = 0;
        for (t b8 : this.e) {
            i += b8.b();
        }
        return i;
    }

    public final String g() {
        t2.l lVar = this.f14464d;
        int length = lVar.f16371V.length;
        StringBuilder sb = new StringBuilder(100);
        int i = 0;
        for (int i8 = 0; i8 < length; i8++) {
            k kVar = (k) lVar.e(i8);
            t h5 = g.h(p.f15377a, k.e(i, kVar.f15205V.getType()), kVar);
            if (i8 != 0) {
                sb.append(10);
            }
            sb.append(h5.g());
            i += kVar.d();
        }
        return sb.toString();
    }

    public final g i(i iVar) {
        throw new RuntimeException("unsupported");
    }

    public final g j(int i) {
        return k(this.f14464d.k(i));
    }

    public final g k(t2.l lVar) {
        return new l(this.f14463c, lVar);
    }

    public final void l(C1627b bVar) {
        m();
        for (t l8 : this.e) {
            l8.l(bVar);
        }
    }

    public final void m() {
        if (this.e == null) {
            t2.l lVar = this.f14464d;
            int length = lVar.f16371V.length;
            this.e = new t[length];
            int i = 0;
            for (int i8 = 0; i8 < length; i8++) {
                k kVar = (k) lVar.e(i8);
                this.e[i8] = g.h(p.f15377a, k.e(i, kVar.f15205V.getType()), kVar);
                i += kVar.d();
            }
        }
    }
}
