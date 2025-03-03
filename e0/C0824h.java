package e0;

import d0.C0627a;
import d0.d;
import java.util.Iterator;

/* renamed from: e0.h  reason: case insensitive filesystem */
public final class C0824h extends l {
    public final void a(C0820d dVar) {
        C0627a aVar = (C0627a) this.f11156b;
        int i = aVar.f9558f0;
        C0821e eVar = this.f11161h;
        Iterator it = eVar.f11148l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C0821e) it.next()).f11144g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (i == 0 || i == 2) {
            eVar.d(i9 + aVar.f9560h0);
        } else {
            eVar.d(i8 + aVar.f9560h0);
        }
    }

    public final void d() {
        d dVar = this.f11156b;
        if (dVar instanceof C0627a) {
            C0821e eVar = this.f11161h;
            eVar.f11140b = true;
            C0627a aVar = (C0627a) dVar;
            int i = aVar.f9558f0;
            boolean z = aVar.f9559g0;
            int i8 = 0;
            if (i == 0) {
                eVar.e = 4;
                while (i8 < aVar.f9705e0) {
                    d dVar2 = aVar.f9704d0[i8];
                    if (z || dVar2.f9603V != 8) {
                        C0821e eVar2 = dVar2.f9614d.f11161h;
                        eVar2.f11147k.add(eVar);
                        eVar.f11148l.add(eVar2);
                    }
                    i8++;
                }
                m(this.f11156b.f9614d.f11161h);
                m(this.f11156b.f9614d.i);
            } else if (i == 1) {
                eVar.e = 5;
                while (i8 < aVar.f9705e0) {
                    d dVar3 = aVar.f9704d0[i8];
                    if (z || dVar3.f9603V != 8) {
                        C0821e eVar3 = dVar3.f9614d.i;
                        eVar3.f11147k.add(eVar);
                        eVar.f11148l.add(eVar3);
                    }
                    i8++;
                }
                m(this.f11156b.f9614d.f11161h);
                m(this.f11156b.f9614d.i);
            } else if (i == 2) {
                eVar.e = 6;
                while (i8 < aVar.f9705e0) {
                    d dVar4 = aVar.f9704d0[i8];
                    if (z || dVar4.f9603V != 8) {
                        C0821e eVar4 = dVar4.e.f11161h;
                        eVar4.f11147k.add(eVar);
                        eVar.f11148l.add(eVar4);
                    }
                    i8++;
                }
                m(this.f11156b.e.f11161h);
                m(this.f11156b.e.i);
            } else if (i == 3) {
                eVar.e = 7;
                while (i8 < aVar.f9705e0) {
                    d dVar5 = aVar.f9704d0[i8];
                    if (z || dVar5.f9603V != 8) {
                        C0821e eVar5 = dVar5.e.i;
                        eVar5.f11147k.add(eVar);
                        eVar.f11148l.add(eVar5);
                    }
                    i8++;
                }
                m(this.f11156b.e.f11161h);
                m(this.f11156b.e.i);
            }
        }
    }

    public final void e() {
        d dVar = this.f11156b;
        if (dVar instanceof C0627a) {
            int i = ((C0627a) dVar).f9558f0;
            C0821e eVar = this.f11161h;
            if (i == 0 || i == 1) {
                dVar.f9595N = eVar.f11144g;
            } else {
                dVar.f9596O = eVar.f11144g;
            }
        }
    }

    public final void f() {
        this.f11157c = null;
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
