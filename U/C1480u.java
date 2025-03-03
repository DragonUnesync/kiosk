package u;

import B.C0004e;
import N5.m;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.util.Iterator;
import java.util.Map;
import q.C1349b;
import q.C1350c;
import q.C1353f;

/* renamed from: u.u  reason: case insensitive filesystem */
public final class C1480u extends z {

    /* renamed from: l  reason: collision with root package name */
    public C1353f f15717l = new C1353f();

    /* renamed from: m  reason: collision with root package name */
    public z f15718m;

    /* renamed from: n  reason: collision with root package name */
    public final C0004e f15719n;

    public C1480u(C0004e eVar) {
        this.f15719n = eVar;
    }

    public final Object d() {
        z zVar = this.f15718m;
        if (zVar == null) {
            return this.f15719n;
        }
        return zVar.d();
    }

    public final void g() {
        Iterator it = this.f15717l.iterator();
        while (true) {
            C1349b bVar = (C1349b) it;
            if (bVar.hasNext()) {
                ((y) ((Map.Entry) bVar.next()).getValue()).b();
            } else {
                return;
            }
        }
    }

    public final void h() {
        Iterator it = this.f15717l.iterator();
        while (true) {
            C1349b bVar = (C1349b) it;
            if (bVar.hasNext()) {
                y yVar = (y) ((Map.Entry) bVar.next()).getValue();
                yVar.f8176a.i(yVar);
            } else {
                return;
            }
        }
    }

    public final void l(z zVar) {
        Object obj;
        y yVar;
        z zVar2 = this.f15718m;
        C1353f fVar = this.f15717l;
        if (!(zVar2 == null || (yVar = (y) fVar.c(zVar2)) == null)) {
            yVar.f8176a.i(yVar);
        }
        this.f15718m = zVar;
        m mVar = new m(1, this);
        if (zVar != null) {
            y yVar2 = new y(zVar, mVar);
            C1350c b8 = fVar.b(zVar);
            if (b8 != null) {
                obj = b8.f14691V;
            } else {
                C1350c cVar = new C1350c(zVar, yVar2);
                fVar.f14700X++;
                C1350c cVar2 = fVar.f14698V;
                if (cVar2 == null) {
                    fVar.f14697U = cVar;
                    fVar.f14698V = cVar;
                } else {
                    cVar2.f14692W = cVar;
                    cVar.f14693X = cVar2;
                    fVar.f14698V = cVar;
                }
                obj = null;
            }
            y yVar3 = (y) obj;
            if (yVar3 != null && yVar3.f8177b != mVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (yVar3 == null && this.f8170c > 0) {
                yVar2.b();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}
