package Z0;

import M0.r;
import N.e;
import P0.l;
import P0.z;
import Q0.g;
import R2.c;
import S0.f;
import h1.Y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class m implements Y {

    /* renamed from: U  reason: collision with root package name */
    public final int f6866U;

    /* renamed from: V  reason: collision with root package name */
    public final q f6867V;

    /* renamed from: W  reason: collision with root package name */
    public int f6868W = -1;

    public m(q qVar, int i) {
        this.f6867V = qVar;
        this.f6866U = i;
    }

    public final void a() {
        int i = this.f6868W;
        q qVar = this.f6867V;
        if (i == -2) {
            qVar.a();
            throw new IOException(e.y("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.f6882C0.a(this.f6866U).f2888d[0].f3036n, "."));
        } else if (i == -1) {
            qVar.E();
        } else if (i != -3) {
            qVar.E();
            qVar.p0[i].y();
        }
    }

    public final void b() {
        boolean z;
        if (this.f6868W == -1) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        q qVar = this.f6867V;
        qVar.a();
        qVar.f6884E0.getClass();
        int[] iArr = qVar.f6884E0;
        int i = this.f6866U;
        int i8 = iArr[i];
        if (i8 != -1) {
            boolean[] zArr = qVar.f6887H0;
            if (!zArr[i8]) {
                zArr[i8] = true;
                this.f6868W = i8;
            }
        } else if (qVar.f6883D0.contains(qVar.f6882C0.a(i))) {
            i8 = -3;
            this.f6868W = i8;
        }
        i8 = -2;
        this.f6868W = i8;
    }

    public final boolean c() {
        int i = this.f6868W;
        if (i == -1 || i == -3 || i == -2) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (this.f6868W != -3) {
            if (c()) {
                int i = this.f6868W;
                q qVar = this.f6867V;
                if (qVar.C() || !qVar.p0[i].w(qVar.f6893N0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int l(c cVar, f fVar, int i) {
        r rVar;
        r rVar2;
        c cVar2 = cVar;
        f fVar2 = fVar;
        int i8 = -3;
        if (this.f6868W == -3) {
            fVar2.a(4);
            return -4;
        }
        if (c()) {
            int i9 = this.f6868W;
            q qVar = this.f6867V;
            if (!qVar.C()) {
                ArrayList arrayList = qVar.f6911h0;
                int i10 = 0;
                if (!arrayList.isEmpty()) {
                    int i11 = 0;
                    loop0:
                    while (i11 < arrayList.size() - 1) {
                        int i12 = ((j) arrayList.get(i11)).f6812e0;
                        int length = qVar.p0.length;
                        for (int i13 = 0; i13 < length; i13++) {
                            if (qVar.f6887H0[i13] && qVar.p0[i13].A() == ((long) i12)) {
                                break loop0;
                            }
                        }
                        i11++;
                    }
                    z.T(arrayList, 0, i11);
                    j jVar = (j) arrayList.get(0);
                    r rVar3 = jVar.f12662X;
                    if (!rVar3.equals(qVar.f6880A0)) {
                        Y0.e eVar = qVar.f6908e0;
                        Object obj = jVar.f12664Z;
                        long j7 = jVar.f12665a0;
                        int i14 = jVar.f12663Y;
                        rVar2 = rVar3;
                        eVar.b(qVar.f6899V, rVar3, i14, obj, j7);
                    } else {
                        rVar2 = rVar3;
                    }
                    qVar.f6880A0 = rVar2;
                }
                if ((arrayList.isEmpty() || ((j) arrayList.get(0)).f6811E0) && (i8 = qVar.p0[i9].B(cVar2, fVar2, i, qVar.f6893N0)) == -5) {
                    r rVar4 = (r) cVar2.f4337W;
                    rVar4.getClass();
                    if (i9 == qVar.f6924v0) {
                        int c8 = E.e.c(qVar.p0[i9].A());
                        while (i10 < arrayList.size() && ((j) arrayList.get(i10)).f6812e0 != c8) {
                            i10++;
                        }
                        if (i10 < arrayList.size()) {
                            rVar = ((j) arrayList.get(i10)).f12662X;
                        } else {
                            rVar = qVar.f6928z0;
                            rVar.getClass();
                        }
                        rVar4 = rVar4.e(rVar);
                    }
                    cVar2.f4337W = rVar4;
                }
            }
        }
        return i8;
    }

    public final int o(long j7) {
        if (!c()) {
            return 0;
        }
        int i = this.f6868W;
        q qVar = this.f6867V;
        if (qVar.C()) {
            return 0;
        }
        p pVar = qVar.p0[i];
        int t8 = pVar.t(j7, qVar.f6893N0);
        ArrayList arrayList = qVar.f6911h0;
        Object obj = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            obj = g.l(1, arrayList);
        }
        j jVar = (j) obj;
        if (jVar != null && !jVar.f6811E0) {
            t8 = Math.min(t8, jVar.g(i) - pVar.r());
        }
        pVar.H(t8);
        return t8;
    }
}
