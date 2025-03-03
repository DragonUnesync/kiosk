package r2;

import android.support.v4.media.session.b;
import u2.t;
import v2.C1558a;
import v2.C1559b;
import v2.c;
import y2.C1627b;

public final class y extends o {

    /* renamed from: V  reason: collision with root package name */
    public final C1558a f14938V;

    /* renamed from: W  reason: collision with root package name */
    public final t f14939W;

    /* renamed from: X  reason: collision with root package name */
    public C1381E f14940X;

    public y(C1558a aVar) {
        C1381E e;
        if (aVar != null) {
            this.f14938V = aVar;
            C1559b bVar = aVar.f16003W;
            int length = bVar.f16371V.length;
            StringBuilder sb = new StringBuilder(length + 1);
            char charAt = aVar.f16002V.f16075U.charAt(0);
            sb.append(charAt == '[' ? 'L' : charAt);
            for (int i = 0; i < length; i++) {
                char charAt2 = ((c) bVar.e(i)).f16075U.charAt(0);
                if (charAt2 == '[') {
                    charAt2 = 'L';
                }
                sb.append(charAt2);
            }
            this.f14939W = new t(sb.toString());
            if (bVar.f16371V.length == 0) {
                e = null;
            } else {
                e = new C1381E(bVar);
            }
            this.f14940X = e;
            return;
        }
        throw new NullPointerException("prototype == null");
    }

    public final void a(C1387f fVar) {
        z zVar = fVar.e;
        fVar.f14887f.q(this.f14938V.f16002V);
        zVar.o(this.f14939W);
        C1381E e = this.f14940X;
        if (e != null) {
            this.f14940X = (C1381E) fVar.f14884b.l(e);
        }
    }

    public final q b() {
        return q.TYPE_PROTO_ID_ITEM;
    }

    public final int c() {
        return 12;
    }

    public final void d(C1387f fVar, C1627b bVar) {
        int i;
        z zVar = fVar.e;
        t tVar = this.f14939W;
        int l8 = zVar.l(tVar);
        C1558a aVar = this.f14938V;
        int n4 = fVar.f14887f.n(aVar.f16002V);
        C1381E e = this.f14940X;
        if (e == null) {
            i = 0;
        } else {
            i = e.f();
        }
        if (bVar.d()) {
            StringBuilder sb = new StringBuilder();
            c cVar = aVar.f16002V;
            sb.append(cVar.a());
            sb.append(" proto(");
            C1559b bVar2 = aVar.f16003W;
            int length = bVar2.f16371V.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(((c) bVar2.e(i8)).a());
            }
            sb.append(")");
            bVar.b(0, f() + ' ' + sb.toString());
            bVar.b(4, "  shorty_idx:      " + b.Q(l8) + " // " + tVar.f());
            bVar.b(4, "  return_type_idx: " + b.Q(n4) + " // " + cVar.a());
            bVar.b(4, "  parameters_off:  ".concat(b.Q(i)));
        }
        bVar.j(l8);
        bVar.j(n4);
        bVar.j(i);
    }
}
