package t4;

import D2.j;
import L4.c;
import L4.h;
import S5.C0185n;
import s4.f;
import u4.C1493b;

public abstract class g extends f {
    public static int n(L4.g gVar, int i, int i8) {
        if (i8 == 0) {
            return i;
        }
        if (i8 == 1) {
            return i - b.b(gVar.f2709d);
        }
        if (i8 != 2) {
            return -1;
        }
        return i - ((C1493b) gVar.f2711c).c();
    }

    public /* bridge */ /* synthetic */ C0185n a(c cVar, j jVar) {
        return d((L4.g) cVar, jVar);
    }

    public /* bridge */ /* synthetic */ int j(h hVar, int i, int i8) {
        return n((L4.g) hVar, i, i8);
    }
}
