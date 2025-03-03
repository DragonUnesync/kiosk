package com.bumptech.glide.manager;

import T2.g;
import W2.m;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class r implements h {

    /* renamed from: U  reason: collision with root package name */
    public final Set f9083U = Collections.newSetFromMap(new WeakHashMap());

    public final void c() {
        Iterator it = m.e(this.f9083U).iterator();
        while (it.hasNext()) {
            ((g) it.next()).c();
        }
    }

    public final void j() {
        Iterator it = m.e(this.f9083U).iterator();
        while (it.hasNext()) {
            ((g) it.next()).j();
        }
    }

    public final void k() {
        Iterator it = m.e(this.f9083U).iterator();
        while (it.hasNext()) {
            ((g) it.next()).k();
        }
    }
}
