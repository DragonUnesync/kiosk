package com.bumptech.glide.manager;

import W2.m;
import Y1.C0369b;
import android.net.ConnectivityManager;
import android.net.Network;
import com.bumptech.glide.j;

public final class n extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f9068a;

    public n(j jVar) {
        this.f9068a = jVar;
    }

    public final void onAvailable(Network network) {
        m.f().post(new C0369b(this, true, 1));
    }

    public final void onLost(Network network) {
        m.f().post(new C0369b(this, false, 1));
    }
}
