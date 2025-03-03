package com.bumptech.glide.manager;

import W2.m;
import Y1.C0369b;
import android.content.IntentFilter;
import android.util.Log;

public final class o implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9069U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ p f9070V;

    public /* synthetic */ o(p pVar, int i) {
        this.f9069U = i;
        this.f9070V = pVar;
    }

    public final void run() {
        switch (this.f9069U) {
            case 0:
                p pVar = this.f9070V;
                pVar.f9075X = pVar.c();
                try {
                    p pVar2 = this.f9070V;
                    pVar2.f9072U.registerReceiver(pVar2.f9077Z, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f9070V.f9076Y = true;
                    return;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    this.f9070V.f9076Y = false;
                    return;
                }
            case 1:
                if (this.f9070V.f9076Y) {
                    this.f9070V.f9076Y = false;
                    p pVar3 = this.f9070V;
                    pVar3.f9072U.unregisterReceiver(pVar3.f9077Z);
                    return;
                }
                return;
            default:
                boolean z = this.f9070V.f9075X;
                p pVar4 = this.f9070V;
                pVar4.f9075X = pVar4.c();
                if (z != this.f9070V.f9075X) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f9070V.f9075X);
                    }
                    p pVar5 = this.f9070V;
                    m.f().post(new C0369b(pVar5, pVar5.f9075X, 2));
                    return;
                }
                return;
        }
    }
}
