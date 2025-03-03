package com.bumptech.glide.manager;

import N5.f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

public final class p implements m {

    /* renamed from: a0  reason: collision with root package name */
    public static final Executor f9071a0 = AsyncTask.SERIAL_EXECUTOR;

    /* renamed from: U  reason: collision with root package name */
    public final Context f9072U;

    /* renamed from: V  reason: collision with root package name */
    public final l f9073V;

    /* renamed from: W  reason: collision with root package name */
    public final D2.p f9074W;

    /* renamed from: X  reason: collision with root package name */
    public volatile boolean f9075X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile boolean f9076Y;

    /* renamed from: Z  reason: collision with root package name */
    public final f f9077Z = new f(5, this);

    public p(Context context, D2.p pVar, l lVar) {
        this.f9072U = context.getApplicationContext();
        this.f9074W = pVar;
        this.f9073V = lVar;
    }

    public final void a() {
        f9071a0.execute(new o(this, 1));
    }

    public final boolean b() {
        f9071a0.execute(new o(this, 0));
        return true;
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f9074W.get()).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
