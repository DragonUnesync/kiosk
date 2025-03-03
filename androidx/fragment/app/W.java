package androidx.fragment.app;

import D6.i;
import N.e;
import P6.f;
import Q0.g;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import u.C1477r;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    public int f7944a;

    /* renamed from: b  reason: collision with root package name */
    public int f7945b;

    /* renamed from: c  reason: collision with root package name */
    public final C0470v f7946c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f7947d = new ArrayList();
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7948f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7949g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7950h;
    public boolean i = true;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f7951j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f7952k;

    /* renamed from: l  reason: collision with root package name */
    public final Q f7953l;

    public W(int i8, int i9, Q q7) {
        e.E(i8, "finalState");
        e.E(i9, "lifecycleImpact");
        f.e(q7, "fragmentStateManager");
        C0470v vVar = q7.f7926c;
        f.d(vVar, "fragmentStateManager.fragment");
        e.E(i8, "finalState");
        e.E(i9, "lifecycleImpact");
        f.e(vVar, "fragment");
        this.f7944a = i8;
        this.f7945b = i9;
        this.f7946c = vVar;
        ArrayList arrayList = new ArrayList();
        this.f7951j = arrayList;
        this.f7952k = arrayList;
        this.f7953l = q7;
    }

    public final void a(ViewGroup viewGroup) {
        f.e(viewGroup, "container");
        this.f7950h = false;
        if (!this.e) {
            this.e = true;
            if (this.f7951j.isEmpty()) {
                b();
                return;
            }
            for (V v4 : i.U(this.f7952k)) {
                v4.getClass();
                if (!v4.f7943b) {
                    v4.a(viewGroup);
                }
                v4.f7943b = true;
            }
        }
    }

    public final void b() {
        this.f7950h = false;
        if (!this.f7948f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f7948f = true;
            Iterator it = this.f7947d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f7946c.f8071g0 = false;
        this.f7953l.k();
    }

    public final void c(V v4) {
        f.e(v4, "effect");
        ArrayList arrayList = this.f7951j;
        if (arrayList.remove(v4) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i8, int i9) {
        e.E(i8, "finalState");
        e.E(i9, "lifecycleImpact");
        int h5 = C1477r.h(i9);
        C0470v vVar = this.f7946c;
        if (h5 != 0) {
            if (h5 != 1) {
                if (h5 == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + vVar + " mFinalState = " + g.C(this.f7944a) + " -> REMOVED. mLifecycleImpact  = " + g.B(this.f7945b) + " to REMOVING.");
                    }
                    this.f7944a = 1;
                    this.f7945b = 3;
                    this.i = true;
                }
            } else if (this.f7944a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + vVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + g.B(this.f7945b) + " to ADDING.");
                }
                this.f7944a = 2;
                this.f7945b = 2;
                this.i = true;
            }
        } else if (this.f7944a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + vVar + " mFinalState = " + g.C(this.f7944a) + " -> " + g.C(i8) + '.');
            }
            this.f7944a = i8;
        }
    }

    public final String toString() {
        StringBuilder s8 = g.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        s8.append(g.C(this.f7944a));
        s8.append(" lifecycleImpact = ");
        s8.append(g.B(this.f7945b));
        s8.append(" fragment = ");
        s8.append(this.f7946c);
        s8.append('}');
        return s8.toString();
    }
}
