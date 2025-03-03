package p2;

import android.support.v4.media.session.b;
import t2.k;
import t2.l;
import t2.p;
import y2.C1627b;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public int f14461a;

    /* renamed from: b  reason: collision with root package name */
    public final i f14462b;

    /* renamed from: c  reason: collision with root package name */
    public final p f14463c;

    /* renamed from: d  reason: collision with root package name */
    public final l f14464d;

    public g(i iVar, p pVar, l lVar) {
        if (iVar == null) {
            throw new NullPointerException("opcode == null");
        } else if (pVar == null) {
            throw new NullPointerException("position == null");
        } else if (lVar != null) {
            this.f14461a = -1;
            this.f14462b = iVar;
            this.f14463c = pVar;
            this.f14464d = lVar;
        } else {
            throw new NullPointerException("registers == null");
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [p2.g, p2.t] */
    public static t h(p pVar, k kVar, k kVar2) {
        boolean z;
        i iVar;
        boolean z6 = false;
        if (kVar.d() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (kVar.f15205V.getType().f16076V == 9) {
            z6 = true;
        }
        int i = kVar2.f15204U;
        int i8 = kVar.f15204U;
        if ((i | i8) < 16) {
            if (z6) {
                iVar = j.f14582j;
            } else if (z) {
                iVar = j.f14560d;
            } else {
                iVar = j.f14571g;
            }
        } else if (i8 < 256) {
            if (z6) {
                iVar = j.f14586k;
            } else if (z) {
                iVar = j.e;
            } else {
                iVar = j.f14575h;
            }
        } else if (z6) {
            iVar = j.f14589l;
        } else if (z) {
            iVar = j.f14567f;
        } else {
            iVar = j.i;
        }
        return new g(iVar, pVar, l.i(kVar, kVar2));
    }

    public abstract String a();

    public abstract int b();

    public String c() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public String d() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public final int e() {
        int i = this.f14461a;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    public final String f() {
        int i = this.f14461a;
        if (i == -1) {
            return b.Q(System.identityHashCode(this));
        }
        return String.format("%04x", new Object[]{Integer.valueOf(i)});
    }

    public abstract String g();

    public abstract g i(i iVar);

    public abstract g j(int i);

    public abstract g k(l lVar);

    public abstract void l(C1627b bVar);

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(f());
        sb.append(' ');
        sb.append(this.f14463c);
        sb.append(": ");
        sb.append(this.f14462b.a());
        l lVar = this.f14464d;
        if (lVar.f16371V.length != 0) {
            z = true;
            sb.append(lVar.g(" ", (String) null, true));
        } else {
            z = false;
        }
        String a8 = a();
        if (a8 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(a8);
        }
        return sb.toString();
    }
}
