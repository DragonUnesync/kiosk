package com.bumptech.glide.manager;

import G.h;
import W2.m;
import android.view.View;
import android.view.ViewTreeObserver;

public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ View f9056U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ e f9057V;

    public d(e eVar, View view) {
        this.f9057V = eVar;
        this.f9056U = view;
    }

    public final void onDraw() {
        m.f().post(new h(3, this, this, false));
    }
}
