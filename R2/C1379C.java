package r2;

import android.support.v4.media.session.b;
import u2.t;
import y2.C1627b;

/* renamed from: r2.C  reason: case insensitive filesystem */
public final class C1379C extends o implements Comparable {

    /* renamed from: V  reason: collision with root package name */
    public final t f14855V;

    /* renamed from: W  reason: collision with root package name */
    public C1378B f14856W;

    public C1379C(t tVar) {
        if (tVar != null) {
            this.f14855V = tVar;
            this.f14856W = null;
            return;
        }
        throw new NullPointerException("value == null");
    }

    public final void a(C1387f fVar) {
        if (this.f14856W == null) {
            w wVar = fVar.f14886d;
            C1378B b8 = new C1378B(this.f14855V);
            this.f14856W = b8;
            wVar.k(b8);
        }
    }

    public final q b() {
        return q.TYPE_STRING_ID_ITEM;
    }

    public final int c() {
        return 4;
    }

    public final int compareTo(Object obj) {
        return this.f14855V.compareTo(((C1379C) obj).f14855V);
    }

    public final void d(C1387f fVar, C1627b bVar) {
        String str;
        int f8 = this.f14856W.f();
        if (bVar.d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(f());
            sb.append(' ');
            String a8 = this.f14855V.a();
            if (a8.length() <= 98) {
                str = "";
            } else {
                a8 = a8.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + a8 + str + '\"');
            bVar.b(0, sb.toString());
            bVar.b(4, "  string_data_off: ".concat(b.Q(f8)));
        }
        bVar.j(f8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1379C)) {
            return false;
        }
        return this.f14855V.equals(((C1379C) obj).f14855V);
    }

    public final int hashCode() {
        return this.f14855V.f15766U.hashCode();
    }
}
