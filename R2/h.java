package r2;

import R.e;
import android.support.v4.media.session.b;
import y2.C1627b;

public final class h extends i implements Comparable {

    /* renamed from: V  reason: collision with root package name */
    public final u2.h f14898V;

    public h(u2.h hVar, int i) {
        super(i);
        if (hVar != null) {
            this.f14898V = hVar;
            return;
        }
        throw new NullPointerException("field == null");
    }

    public final String a() {
        return this.f14898V.a();
    }

    public final int b(C1387f fVar, C1627b bVar, int i, int i8) {
        l lVar = fVar.f14889h;
        u2.h hVar = this.f14898V;
        int l8 = lVar.l(hVar);
        int i9 = l8 - i;
        boolean d8 = bVar.d();
        int i10 = this.f14899U;
        if (d8) {
            bVar.b(0, String.format("  [%x] %s", new Object[]{Integer.valueOf(i8), hVar.a()}));
            bVar.b(b.T(i9), "    field_idx:    ".concat(b.Q(l8)));
            int T8 = b.T(i10);
            bVar.b(T8, "    access_flags: " + e.l(i10, 20703, 2));
        }
        bVar.m(i9);
        bVar.m(i10);
        return l8;
    }

    public final int compareTo(Object obj) {
        return this.f14898V.compareTo(((h) obj).f14898V);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h) && this.f14898V.compareTo(((h) obj).f14898V) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14898V.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(h.class.getName());
        sb.append('{');
        sb.append(b.P(this.f14899U));
        sb.append(' ');
        sb.append(this.f14898V);
        sb.append('}');
        return sb.toString();
    }
}
