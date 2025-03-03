package e0;

import d0.d;
import d0.h;

/* renamed from: e0.g  reason: case insensitive filesystem */
public final class C0823g extends l {
    public final void a(C0820d dVar) {
        C0821e eVar = this.f11161h;
        if (eVar.f11141c && !eVar.f11146j) {
            eVar.d((int) ((((float) ((C0821e) eVar.f11148l.get(0)).f11144g) * ((h) this.f11156b).f9699d0) + 0.5f));
        }
    }

    public final void d() {
        d dVar = this.f11156b;
        h hVar = (h) dVar;
        int i = hVar.f9700e0;
        int i8 = hVar.f9701f0;
        int i9 = hVar.f9703h0;
        C0821e eVar = this.f11161h;
        if (i9 == 1) {
            if (i != -1) {
                eVar.f11148l.add(dVar.f9590I.f9614d.f11161h);
                this.f11156b.f9590I.f9614d.f11161h.f11147k.add(eVar);
                eVar.f11143f = i;
            } else if (i8 != -1) {
                eVar.f11148l.add(dVar.f9590I.f9614d.i);
                this.f11156b.f9590I.f9614d.i.f11147k.add(eVar);
                eVar.f11143f = -i8;
            } else {
                eVar.f11140b = true;
                eVar.f11148l.add(dVar.f9590I.f9614d.i);
                this.f11156b.f9590I.f9614d.i.f11147k.add(eVar);
            }
            m(this.f11156b.f9614d.f11161h);
            m(this.f11156b.f9614d.i);
            return;
        }
        if (i != -1) {
            eVar.f11148l.add(dVar.f9590I.e.f11161h);
            this.f11156b.f9590I.e.f11161h.f11147k.add(eVar);
            eVar.f11143f = i;
        } else if (i8 != -1) {
            eVar.f11148l.add(dVar.f9590I.e.i);
            this.f11156b.f9590I.e.i.f11147k.add(eVar);
            eVar.f11143f = -i8;
        } else {
            eVar.f11140b = true;
            eVar.f11148l.add(dVar.f9590I.e.i);
            this.f11156b.f9590I.e.i.f11147k.add(eVar);
        }
        m(this.f11156b.e.f11161h);
        m(this.f11156b.e.i);
    }

    public final void e() {
        d dVar = this.f11156b;
        int i = ((h) dVar).f9703h0;
        C0821e eVar = this.f11161h;
        if (i == 1) {
            dVar.f9595N = eVar.f11144g;
        } else {
            dVar.f9596O = eVar.f11144g;
        }
    }

    public final void f() {
        this.f11161h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(C0821e eVar) {
        C0821e eVar2 = this.f11161h;
        eVar2.f11147k.add(eVar);
        eVar.f11148l.add(eVar2);
    }
}
