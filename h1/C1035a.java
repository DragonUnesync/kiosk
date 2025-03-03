package h1;

import M0.C;
import M0.X;
import P0.l;
import R0.A;
import U0.j;
import Y0.d;
import Y0.e;
import Y0.f;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: h1.a  reason: case insensitive filesystem */
public abstract class C1035a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12430a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f12431b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final e f12432c = new e(new CopyOnWriteArrayList(), 0, (C1031B) null);

    /* renamed from: d  reason: collision with root package name */
    public final e f12433d = new e(new CopyOnWriteArrayList(), 0, (C1031B) null);
    public Looper e;

    /* renamed from: f  reason: collision with root package name */
    public X f12434f;

    /* renamed from: g  reason: collision with root package name */
    public j f12435g;

    public final e a(C1031B b8) {
        return new e(this.f12432c.f6317c, 0, b8);
    }

    public abstract C1059z b(C1031B b8, l1.e eVar, long j7);

    public final void c(C1032C c8) {
        HashSet hashSet = this.f12431b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(c8);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public void d() {
    }

    public final void e(C1032C c8) {
        this.e.getClass();
        HashSet hashSet = this.f12431b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(c8);
        if (isEmpty) {
            f();
        }
    }

    public void f() {
    }

    public X g() {
        return null;
    }

    public abstract C h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(C1032C c8, A a8, j jVar) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper == null || looper == myLooper) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f12435g = jVar;
        X x8 = this.f12434f;
        this.f12430a.add(c8);
        if (this.e == null) {
            this.e = myLooper;
            this.f12431b.add(c8);
            l(a8);
        } else if (x8 != null) {
            e(c8);
            c8.a(this, x8);
        }
    }

    public abstract void l(A a8);

    public final void m(X x8) {
        this.f12434f = x8;
        Iterator it = this.f12430a.iterator();
        while (it.hasNext()) {
            ((C1032C) it.next()).a(this, x8);
        }
    }

    public abstract void n(C1059z zVar);

    public final void o(C1032C c8) {
        ArrayList arrayList = this.f12430a;
        arrayList.remove(c8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f12434f = null;
            this.f12435g = null;
            this.f12431b.clear();
            p();
            return;
        }
        c(c8);
    }

    public abstract void p();

    public final void q(f fVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12433d.f6317c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f6314a == fVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void r(G g8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12432c.f6317c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            F f8 = (F) it.next();
            if (f8.f12291b == g8) {
                copyOnWriteArrayList.remove(f8);
            }
        }
    }

    public abstract void s(C c8);
}
