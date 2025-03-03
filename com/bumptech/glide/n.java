package com.bumptech.glide;

import S2.c;
import W2.m;
import com.bumptech.glide.manager.a;
import com.bumptech.glide.manager.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class n implements a {

    /* renamed from: a  reason: collision with root package name */
    public final q f9084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f9085b;

    public n(o oVar, q qVar) {
        this.f9085b = oVar;
        this.f9084a = qVar;
    }

    public final void a(boolean z) {
        if (z) {
            synchronized (this.f9085b) {
                q qVar = this.f9084a;
                Iterator it = m.e((Set) qVar.f9081W).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (!cVar.k() && !cVar.d()) {
                        cVar.clear();
                        if (!qVar.f9080V) {
                            cVar.i();
                        } else {
                            ((HashSet) qVar.f9082X).add(cVar);
                        }
                    }
                }
            }
        }
    }
}
