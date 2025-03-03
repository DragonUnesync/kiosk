package r2;

import W3.a;
import android.support.v4.media.session.b;
import u2.t;
import y2.C1627b;

/* renamed from: r2.B  reason: case insensitive filesystem */
public final class C1378B extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final t f14854Y;

    public C1378B(t tVar) {
        super(1, b.T(tVar.f15766U.length()) + tVar.f15767V.f6176a + 1);
        this.f14854Y = tVar;
    }

    public final void a(C1387f fVar) {
    }

    public final q b() {
        return q.TYPE_STRING_DATA_ITEM;
    }

    public final int e(x xVar) {
        return this.f14854Y.compareTo(((C1378B) xVar).f14854Y);
    }

    public final void k(C1387f fVar, C1627b bVar) {
        t tVar = this.f14854Y;
        a aVar = tVar.f15767V;
        int length = tVar.f15766U.length();
        if (bVar.d()) {
            bVar.b(b.T(length), "utf16_size: ".concat(b.Q(length)));
            bVar.b(aVar.f6176a + 1, tVar.f());
        }
        bVar.m(length);
        int i = aVar.f6176a;
        int i8 = bVar.f16368c;
        int i9 = i + i8;
        if (bVar.f16366a) {
            bVar.f(i9);
        } else if (i9 > bVar.f16367b.length) {
            C1627b.g();
            throw null;
        }
        byte[] bArr = bVar.f16367b;
        int length2 = bArr.length - i8;
        int i10 = aVar.f6176a;
        if (length2 >= i10) {
            System.arraycopy(aVar.f6177b, 0, bArr, i8, i10);
            bVar.f16368c = i9;
            bVar.i(0);
            return;
        }
        throw new IndexOutOfBoundsException("(out.length - offset) < size()");
    }
}
