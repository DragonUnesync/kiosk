package com.bumptech.glide.manager;

import android.view.View;
import h.C1022j;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class e implements f {

    /* renamed from: U  reason: collision with root package name */
    public final Set f9058U = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: V  reason: collision with root package name */
    public volatile boolean f9059V;

    public final void d(C1022j jVar) {
        if (!this.f9059V && this.f9058U.add(jVar)) {
            View decorView = jVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}
