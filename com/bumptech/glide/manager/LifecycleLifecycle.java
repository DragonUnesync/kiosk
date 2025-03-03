package com.bumptech.glide.manager;

import W2.m;
import androidx.lifecycle.B;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.HashSet;
import java.util.Iterator;

final class LifecycleLifecycle implements g, q {

    /* renamed from: U  reason: collision with root package name */
    public final HashSet f9052U = new HashSet();

    /* renamed from: V  reason: collision with root package name */
    public final t f9053V;

    public LifecycleLifecycle(t tVar) {
        this.f9053V = tVar;
        tVar.a(this);
    }

    public final void a(h hVar) {
        this.f9052U.add(hVar);
        C0486m mVar = this.f9053V.f8156c;
        if (mVar == C0486m.f8145U) {
            hVar.k();
        } else if (mVar.compareTo(C0486m.f8148X) >= 0) {
            hVar.j();
        } else {
            hVar.c();
        }
    }

    public final void b(h hVar) {
        this.f9052U.remove(hVar);
    }

    @B(C0485l.ON_DESTROY)
    public void onDestroy(r rVar) {
        Iterator it = m.e(this.f9052U).iterator();
        while (it.hasNext()) {
            ((h) it.next()).k();
        }
        rVar.e().f(this);
    }

    @B(C0485l.ON_START)
    public void onStart(r rVar) {
        Iterator it = m.e(this.f9052U).iterator();
        while (it.hasNext()) {
            ((h) it.next()).j();
        }
    }

    @B(C0485l.ON_STOP)
    public void onStop(r rVar) {
        Iterator it = m.e(this.f9052U).iterator();
        while (it.hasNext()) {
            ((h) it.next()).c();
        }
    }
}
