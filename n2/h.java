package n2;

import N.e;
import java.util.Arrays;
import u2.q;
import u2.r;
import u2.t;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final i f13739a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13740b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13741c;

    /* renamed from: d  reason: collision with root package name */
    public final j f13742d;
    public final q e;

    public h(i iVar, i iVar2, String str, j jVar) {
        if (iVar == null || iVar2 == null || str == null) {
            throw null;
        }
        this.f13739a = iVar;
        this.f13740b = iVar2;
        this.f13741c = str;
        this.f13742d = jVar;
        this.e = new q(iVar.f13755c, new r(new t(str), new t(a(false))));
    }

    public final String a(boolean z) {
        StringBuilder sb = new StringBuilder("(");
        if (z) {
            sb.append(this.f13739a.f13753a);
        }
        for (i iVar : this.f13742d.f13756a) {
            sb.append(iVar.f13753a);
        }
        sb.append(")");
        sb.append(this.f13740b.f13753a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!hVar.f13739a.equals(this.f13739a) || !hVar.f13741c.equals(this.f13741c) || !hVar.f13742d.equals(this.f13742d) || !hVar.f13740b.equals(this.f13740b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int u3 = e.u(e.u(527, 31, this.f13739a.f13753a), 31, this.f13741c);
        return this.f13740b.f13753a.hashCode() + ((Arrays.hashCode(this.f13742d.f13756a) + u3) * 31);
    }

    public final String toString() {
        return this.f13739a + "." + this.f13741c + "(" + this.f13742d + ")";
    }
}
