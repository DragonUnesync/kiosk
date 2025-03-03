package r2;

import C7.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import m2.C1208a;
import u.C1477r;
import y2.C1627b;

public final class w extends C1377A {

    /* renamed from: j  reason: collision with root package name */
    public static final e f14930j = new e(4);

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f14931f = new ArrayList(100);

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f14932g = new HashMap(100);

    /* renamed from: h  reason: collision with root package name */
    public final int f14933h;
    public int i;

    public w(String str, C1387f fVar, int i8, int i9) {
        super(str, fVar, i8);
        this.f14933h = i9;
        this.i = -1;
    }

    public final int a(p pVar) {
        return ((x) pVar).f();
    }

    public final Collection c() {
        return this.f14931f;
    }

    public final void e() {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f14931f;
            int size = arrayList.size();
            if (i8 < size) {
                while (i8 < size) {
                    ((x) arrayList.get(i8)).a(this.f14851b);
                    i8++;
                }
            } else {
                return;
            }
        }
    }

    public final int h() {
        f();
        return this.i;
    }

    public final void j(C1627b bVar) {
        boolean d8 = bVar.d();
        Iterator it = this.f14931f.iterator();
        int i8 = 0;
        boolean z = true;
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (d8) {
                if (z) {
                    z = false;
                } else {
                    bVar.b(0, "\n");
                }
            }
            int i9 = xVar.f14934U - 1;
            int i10 = (~i9) & (i8 + i9);
            if (i8 != i10) {
                bVar.n(i10 - i8);
                i8 = i10;
            }
            xVar.d(this.f14851b, bVar);
            i8 += xVar.c();
        }
        if (i8 != this.i) {
            throw new RuntimeException("output size mismatch");
        }
    }

    public final void k(x xVar) {
        g();
        try {
            if (xVar.f14934U <= this.f14852c) {
                this.f14931f.add(xVar);
                return;
            }
            throw new IllegalArgumentException("incompatible item alignment");
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    public final synchronized x l(x xVar) {
        g();
        x xVar2 = (x) this.f14932g.get(xVar);
        if (xVar2 != null) {
            return xVar2;
        }
        k(xVar);
        this.f14932g.put(xVar, xVar);
        return xVar;
    }

    public final void m() {
        f();
        int h5 = C1477r.h(this.f14933h);
        ArrayList arrayList = this.f14931f;
        if (h5 == 1) {
            Collections.sort(arrayList, f14930j);
        } else if (h5 == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            x xVar = (x) arrayList.get(i8);
            try {
                int h8 = xVar.h(this, i9);
                if (h8 >= i9) {
                    i9 = xVar.c() + h8;
                    i8++;
                } else {
                    throw new RuntimeException("bogus place() result for " + xVar);
                }
            } catch (RuntimeException e) {
                throw C1208a.a(e, "...while placing " + xVar);
            }
        }
        this.i = i9;
    }
}
