package p2;

import android.support.v4.media.session.b;
import t2.l;
import t2.p;
import u2.C1490a;
import u2.t;

public final class f extends k {
    public final C1490a e;

    /* renamed from: f  reason: collision with root package name */
    public int f14459f;

    /* renamed from: g  reason: collision with root package name */
    public int f14460g;

    public f(i iVar, p pVar, l lVar, C1490a aVar) {
        super(iVar, pVar, lVar);
        if (aVar != null) {
            this.e = aVar;
            this.f14459f = -1;
            this.f14460g = -1;
            return;
        }
        throw new NullPointerException("constant == null");
    }

    public final String a() {
        return this.e.a();
    }

    public final String c() {
        if (this.f14459f < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.e.e());
        sb.append('@');
        int i = this.f14459f;
        if (i < 65536) {
            sb.append(b.P(i));
        } else {
            sb.append(b.Q(i));
        }
        return sb.toString();
    }

    public final String d() {
        C1490a aVar = this.e;
        if (aVar instanceof t) {
            return ((t) aVar).f();
        }
        return aVar.a();
    }

    public final g i(i iVar) {
        f fVar = new f(iVar, this.f14463c, this.f14464d, this.e);
        int i = this.f14459f;
        if (i >= 0) {
            fVar.o(i);
        }
        int i8 = this.f14460g;
        if (i8 >= 0) {
            fVar.n(i8);
        }
        return fVar;
    }

    public final g k(l lVar) {
        f fVar = new f(this.f14462b, this.f14463c, lVar, this.e);
        int i = this.f14459f;
        if (i >= 0) {
            fVar.o(i);
        }
        int i8 = this.f14460g;
        if (i8 >= 0) {
            fVar.n(i8);
        }
        return fVar;
    }

    public final int m() {
        int i = this.f14459f;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.e);
    }

    public final void n(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (this.f14460g < 0) {
            this.f14460g = i;
        } else {
            throw new IllegalStateException("class index already set");
        }
    }

    public final void o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        } else if (this.f14459f < 0) {
            this.f14459f = i;
        } else {
            throw new IllegalStateException("index already set");
        }
    }
}
