package H2;

import B.q0;
import D2.y;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class u implements e, d {

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f1980U;

    /* renamed from: V  reason: collision with root package name */
    public final q0 f1981V;

    /* renamed from: W  reason: collision with root package name */
    public int f1982W;

    /* renamed from: X  reason: collision with root package name */
    public f f1983X;

    /* renamed from: Y  reason: collision with root package name */
    public d f1984Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f1985Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1986a0;

    public u(ArrayList arrayList, q0 q0Var) {
        this.f1981V = q0Var;
        if (!arrayList.isEmpty()) {
            this.f1980U = arrayList;
            this.f1982W = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final Class a() {
        return ((e) this.f1980U.get(0)).a();
    }

    public final void b() {
        List list = this.f1985Z;
        if (list != null) {
            this.f1981V.A(list);
        }
        this.f1985Z = null;
        Iterator it = this.f1980U.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
        }
    }

    public final void c(Exception exc) {
        List list = this.f1985Z;
        W2.f.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    public final void cancel() {
        this.f1986a0 = true;
        Iterator it = this.f1980U.iterator();
        while (it.hasNext()) {
            ((e) it.next()).cancel();
        }
    }

    public final void d(Object obj) {
        if (obj != null) {
            this.f1984Y.d(obj);
        } else {
            g();
        }
    }

    public final int e() {
        return ((e) this.f1980U.get(0)).e();
    }

    public final void f(f fVar, d dVar) {
        this.f1983X = fVar;
        this.f1984Y = dVar;
        this.f1985Z = (List) this.f1981V.a();
        ((e) this.f1980U.get(this.f1982W)).f(fVar, this);
        if (this.f1986a0) {
            cancel();
        }
    }

    public final void g() {
        if (!this.f1986a0) {
            if (this.f1982W < this.f1980U.size() - 1) {
                this.f1982W++;
                f(this.f1983X, this.f1984Y);
                return;
            }
            W2.f.b(this.f1985Z);
            this.f1984Y.c(new y("Fetch failed", new ArrayList(this.f1985Z)));
        }
    }
}
