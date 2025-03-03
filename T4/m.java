package t4;

import G5.s;
import L4.h;
import S5.C0185n;
import b5.C0532a;
import b5.b;
import i5.p;
import s4.f;
import u5.C1495b;

public final class m extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15480c = ((C1495b.f15792b0.a() << 4) | 2);

    public final void g(h hVar, C0185n nVar, int i, int i8, int i9) {
        C0532a aVar = (C0532a) hVar;
        nVar.writeByte(f15480c);
        s.m(nVar, i);
        nVar.writeShort(aVar.f2712d);
        s.m(nVar, i8);
        int i10 = aVar.e;
        if (((long) i10) != -1) {
            nVar.writeByte(11);
            s.m(nVar, i10);
        }
        if (i9 == 0) {
            aVar.b().b(nVar);
        }
        p pVar = ((b) ((h) aVar.f2711c)).f8684d;
        if (pVar.size() > 0) {
            pVar.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int i(h hVar) {
        int i;
        C0532a aVar = (C0532a) hVar;
        int c8 = aVar.b().c();
        int i8 = aVar.e;
        if (i8 == -1) {
            i = 0;
        } else {
            i = s.n(i8) + 1;
        }
        return c8 + i;
    }

    public final int m(h hVar) {
        p pVar = ((b) ((h) ((C0532a) hVar).f2711c)).f8684d;
        if (pVar.size() <= 0) {
            return 2;
        }
        pVar.get(0).getClass();
        throw new ClassCastException();
    }
}
