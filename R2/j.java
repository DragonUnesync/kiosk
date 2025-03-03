package r2;

import R.e;
import android.support.v4.media.session.b;
import u2.q;
import v2.C1559b;
import y2.C1627b;

public final class j extends i implements Comparable {

    /* renamed from: V  reason: collision with root package name */
    public final q f14900V;

    /* renamed from: W  reason: collision with root package name */
    public final C1386e f14901W;

    public j(q qVar, int i, B3.q qVar2, C1559b bVar) {
        super(i);
        boolean z;
        if (qVar != null) {
            this.f14900V = qVar;
            if (qVar2 == null) {
                this.f14901W = null;
                return;
            }
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f14901W = new C1386e(qVar, qVar2, z, bVar);
            return;
        }
        throw new NullPointerException("method == null");
    }

    public final String a() {
        return this.f14900V.a();
    }

    public final int b(C1387f fVar, C1627b bVar, int i, int i8) {
        int i9;
        boolean z;
        boolean z6;
        v vVar = fVar.i;
        q qVar = this.f14900V;
        int l8 = vVar.l(qVar);
        int i10 = l8 - i;
        C1386e eVar = this.f14901W;
        if (eVar == null) {
            i9 = 0;
        } else {
            i9 = eVar.f();
        }
        if (i9 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i11 = this.f14899U;
        if ((i11 & 1280) == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z == z6) {
            if (bVar.d()) {
                bVar.b(0, String.format("  [%x] %s", new Object[]{Integer.valueOf(i8), qVar.a()}));
                bVar.b(b.T(i10), "    method_idx:   ".concat(b.Q(l8)));
                int T8 = b.T(i11);
                bVar.b(T8, "    access_flags: " + e.l(i11, 204287, 3));
                bVar.b(b.T(i9), "    code_off:     ".concat(b.Q(i9)));
            }
            bVar.m(i10);
            bVar.m(i11);
            bVar.m(i9);
            return l8;
        }
        throw new UnsupportedOperationException("code vs. access_flags mismatch");
    }

    public final int compareTo(Object obj) {
        return this.f14900V.compareTo(((j) obj).f14900V);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j) && this.f14900V.compareTo(((j) obj).f14900V) == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(j.class.getName());
        sb.append('{');
        sb.append(b.P(this.f14899U));
        sb.append(' ');
        sb.append(this.f14900V);
        C1386e eVar = this.f14901W;
        if (eVar != null) {
            sb.append(' ');
            sb.append(eVar);
        }
        sb.append('}');
        return sb.toString();
    }
}
