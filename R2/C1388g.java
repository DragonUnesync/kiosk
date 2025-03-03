package r2;

import de.ozerov.fully.K2;
import u2.c;
import y2.C1627b;

/* renamed from: r2.g  reason: case insensitive filesystem */
public final class C1388g extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final c f14896Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f14897Z = null;

    public C1388g(c cVar) {
        super(1, -1);
        this.f14896Y = cVar;
    }

    public final void a(C1387f fVar) {
        K2.k(fVar, this.f14896Y);
    }

    public final q b() {
        return q.TYPE_ENCODED_ARRAY_ITEM;
    }

    public final int e(x xVar) {
        return this.f14896Y.compareTo(((C1388g) xVar).f14896Y);
    }

    public final int hashCode() {
        return this.f14896Y.hashCode();
    }

    public final void i(w wVar, int i) {
        C1627b bVar = new C1627b();
        new K2(wVar.f14851b, bVar).Y(this.f14896Y, false);
        int i8 = bVar.f16368c;
        byte[] bArr = new byte[i8];
        System.arraycopy(bVar.f16367b, 0, bArr, 0, i8);
        this.f14897Z = bArr;
        j(i8);
    }

    public final void k(C1387f fVar, C1627b bVar) {
        if (bVar.d()) {
            bVar.b(0, g() + " encoded array");
            new K2(fVar, bVar).Y(this.f14896Y, true);
            return;
        }
        bVar.h(this.f14897Z);
    }
}
