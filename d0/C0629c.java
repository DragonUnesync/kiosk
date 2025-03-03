package d0;

import Q0.g;
import c0.i;
import java.util.HashSet;
import java.util.Iterator;
import u.C1477r;

/* renamed from: d0.c  reason: case insensitive filesystem */
public final class C0629c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f9576a = null;

    /* renamed from: b  reason: collision with root package name */
    public final d f9577b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9578c;

    /* renamed from: d  reason: collision with root package name */
    public C0629c f9579d;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f9580f = -1;

    /* renamed from: g  reason: collision with root package name */
    public i f9581g;

    public C0629c(d dVar, int i) {
        this.f9577b = dVar;
        this.f9578c = i;
    }

    public final void a(C0629c cVar, int i) {
        b(cVar, i, -1, false);
    }

    public final boolean b(C0629c cVar, int i, int i8, boolean z) {
        if (cVar == null) {
            h();
            return true;
        } else if (!z && !g(cVar)) {
            return false;
        } else {
            this.f9579d = cVar;
            if (cVar.f9576a == null) {
                cVar.f9576a = new HashSet();
            }
            this.f9579d.f9576a.add(this);
            if (i > 0) {
                this.e = i;
            } else {
                this.e = 0;
            }
            this.f9580f = i8;
            return true;
        }
    }

    public final int c() {
        C0629c cVar;
        if (this.f9577b.f9603V == 8) {
            return 0;
        }
        int i = this.f9580f;
        if (i <= -1 || (cVar = this.f9579d) == null || cVar.f9577b.f9603V != 8) {
            return this.e;
        }
        return i;
    }

    public final C0629c d() {
        int i = this.f9578c;
        int h5 = C1477r.h(i);
        d dVar = this.f9577b;
        switch (h5) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.z;
            case 2:
                return dVar.f9582A;
            case 3:
                return dVar.f9632x;
            case 4:
                return dVar.f9633y;
            default:
                throw new AssertionError(g.A(i));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f9576a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0629c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f9579d != null) {
            return true;
        }
        return false;
    }

    public final boolean g(C0629c cVar) {
        boolean z;
        boolean z6;
        boolean z8 = false;
        if (cVar == null) {
            return false;
        }
        int i = this.f9578c;
        d dVar = cVar.f9577b;
        int i8 = cVar.f9578c;
        if (i8 != i) {
            switch (C1477r.h(i)) {
                case 0:
                case 5:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i8 == 2 || i8 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(dVar instanceof h)) {
                        return z;
                    }
                    if (z || i8 == 8) {
                        z8 = true;
                    }
                    return z8;
                case 2:
                case 4:
                    if (i8 == 3 || i8 == 5) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!(dVar instanceof h)) {
                        return z6;
                    }
                    if (z6 || i8 == 9) {
                        z8 = true;
                    }
                    return z8;
                case 6:
                    if (i8 == 6 || i8 == 8 || i8 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(g.A(i));
            }
        } else if (i != 6 || (dVar.f9631w && this.f9577b.f9631w)) {
            return true;
        } else {
            return false;
        }
    }

    public final void h() {
        HashSet hashSet;
        C0629c cVar = this.f9579d;
        if (!(cVar == null || (hashSet = cVar.f9576a) == null)) {
            hashSet.remove(this);
        }
        this.f9579d = null;
        this.e = 0;
        this.f9580f = -1;
    }

    public final void i() {
        i iVar = this.f9581g;
        if (iVar == null) {
            this.f9581g = new i(1);
        } else {
            iVar.c();
        }
    }

    public final String toString() {
        return this.f9577b.f9604W + ":" + g.A(this.f9578c);
    }
}
