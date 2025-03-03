package n2;

import u2.h;
import u2.p;
import u2.r;
import u2.t;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final i f13726a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13727b;

    /* renamed from: c  reason: collision with root package name */
    public final h f13728c;

    /* JADX WARNING: type inference failed for: r4v2, types: [u2.h, u2.p] */
    public e(i iVar, i iVar2, String str) {
        if (iVar2 != null) {
            this.f13726a = iVar;
            this.f13727b = str;
            this.f13728c = new p(iVar.f13755c, new r(new t(str), new t(iVar2.f13753a)));
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (!eVar.f13726a.equals(this.f13726a) || !eVar.f13727b.equals(this.f13727b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13727b.hashCode() * 37) + this.f13726a.f13753a.hashCode();
    }

    public final String toString() {
        return this.f13726a + "." + this.f13727b;
    }
}
