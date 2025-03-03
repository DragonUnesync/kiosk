package r2;

import android.support.v4.media.session.b;
import java.util.ArrayList;
import java.util.Iterator;
import y2.C1627b;

public final class G extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final q f14858Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f14859Z;

    public G(q qVar, ArrayList arrayList) {
        super(l(arrayList), l(arrayList) + (((x) arrayList.get(0)).c() * arrayList.size()));
        if (qVar != null) {
            this.f14859Z = arrayList;
            this.f14858Y = qVar;
            return;
        }
        throw new NullPointerException("itemType == null");
    }

    public static int l(ArrayList arrayList) {
        try {
            return Math.max(4, ((x) arrayList.get(0)).f14934U);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    public final void a(C1387f fVar) {
        Iterator it = this.f14859Z.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(fVar);
        }
    }

    public final q b() {
        return this.f14858Y;
    }

    public final void i(w wVar, int i) {
        int i8 = i + this.f14934U;
        Iterator it = this.f14859Z.iterator();
        int i9 = -1;
        int i10 = -1;
        boolean z = true;
        while (it.hasNext()) {
            x xVar = (x) it.next();
            int c8 = xVar.c();
            int i11 = xVar.f14934U;
            if (z) {
                i9 = c8;
                i10 = i11;
                z = false;
            } else if (c8 != i9) {
                throw new UnsupportedOperationException("item size mismatch");
            } else if (i11 != i10) {
                throw new UnsupportedOperationException("item alignment mismatch");
            }
            i8 = xVar.h(wVar, i8) + c8;
        }
    }

    public final void k(C1387f fVar, C1627b bVar) {
        ArrayList arrayList = this.f14859Z;
        int size = arrayList.size();
        if (bVar.d()) {
            bVar.b(0, g() + " " + this.f14858Y.f14923W);
            bVar.b(4, "  size: ".concat(b.Q(size)));
        }
        bVar.j(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x) it.next()).d(fVar, bVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(G.class.getName());
        sb.append(this.f14859Z);
        return sb.toString();
    }
}
