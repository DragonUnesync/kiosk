package com.bumptech.glide.manager;

import W2.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f9067a;

    public l(q qVar) {
        this.f9067a = qVar;
    }

    public final void a(boolean z) {
        ArrayList arrayList;
        m.a();
        synchronized (this.f9067a) {
            arrayList = new ArrayList((HashSet) this.f9067a.f9082X);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z);
        }
    }
}
