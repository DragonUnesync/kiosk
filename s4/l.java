package s4;

import G5.s;
import L4.c;
import L4.h;
import S5.C0185n;
import b5.C0532a;
import b5.b;
import i5.p;
import p5.C1344a;

public final class l extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15113c = ((C1344a.f14663b0.a() << 4) | 2);

    public final void f(c cVar, C0185n nVar, int i) {
        C0532a aVar = (C0532a) cVar;
        nVar.writeByte(f15113c);
        s.m(nVar, i);
        nVar.writeShort(aVar.f2712d);
        p pVar = ((b) ((h) aVar.f2711c)).f8684d;
        if (pVar.size() > 0) {
            pVar.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int l(c cVar) {
        p pVar = ((b) ((h) ((C0532a) cVar).f2711c)).f8684d;
        if (pVar.size() <= 0) {
            return 2;
        }
        pVar.get(0).getClass();
        throw new ClassCastException();
    }
}
