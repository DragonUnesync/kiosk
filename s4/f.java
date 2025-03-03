package s4;

import D2.j;
import G5.s;
import L4.b;
import L4.h;
import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import r4.c;

public abstract class f extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15107b;

    public /* synthetic */ f(int i) {
        this.f15107b = i;
    }

    public C0185n a(L4.c cVar, j jVar) {
        switch (this.f15107b) {
            case 0:
                b bVar = (b) cVar;
                int i = jVar.f1093U;
                if (4 <= i) {
                    C0185n ioBuffer = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(4, 4);
                    ioBuffer.writeByte(h());
                    ioBuffer.writeByte(2);
                    ioBuffer.writeShort(bVar.a());
                    return ioBuffer;
                }
                throw c.b(bVar, 4, i);
            case 1:
                int l8 = l(cVar);
                int n4 = s.n(l8) + l8 + 1;
                int i8 = jVar.f1093U;
                if (n4 <= i8) {
                    return c(cVar, jVar, n4, l8);
                }
                throw c.b(cVar, n4, i8);
            default:
                return d((h) cVar, jVar);
        }
    }

    public C0185n c(L4.c cVar, j jVar, int i, int i8) {
        C0185n ioBuffer = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(i, i);
        f(cVar, ioBuffer, i8);
        return ioBuffer;
    }

    public C0185n d(h hVar, j jVar) {
        int i = i(hVar);
        int m8 = m(hVar);
        int k8 = k(hVar, i) + m8;
        int i8 = i;
        int i9 = k8;
        int n4 = s.n(k8) + k8 + 1;
        int i10 = 0;
        while (n4 > jVar.f1093U) {
            i10++;
            i8 = j(hVar, i8, i10);
            if (i8 >= 0) {
                i9 = k(hVar, i8) + m8;
                n4 = s.n(i9) + i9 + 1;
            } else {
                throw c.b(hVar, n4, jVar.f1093U);
            }
        }
        return e(hVar, jVar, n4, i9, i8, i10);
    }

    public C0185n e(h hVar, j jVar, int i, int i8, int i9, int i10) {
        C0185n ioBuffer = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(i, i);
        g(hVar, ioBuffer, i8, i9, i10);
        return ioBuffer;
    }

    public abstract void f(L4.c cVar, C0185n nVar, int i);

    public abstract void g(h hVar, C0185n nVar, int i, int i8, int i9);

    public abstract int h();

    public abstract int i(h hVar);

    public int j(h hVar, int i, int i8) {
        if (i8 == 0) {
            return i;
        }
        if (i8 != 1) {
            return -1;
        }
        return i - hVar.b().c();
    }

    public int k(h hVar, int i) {
        return s.n(i) + i;
    }

    public abstract int l(L4.c cVar);

    public abstract int m(h hVar);
}
