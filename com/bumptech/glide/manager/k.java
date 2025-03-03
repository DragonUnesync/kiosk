package com.bumptech.glide.manager;

import K2.v;
import R2.c;
import W2.m;
import a1.C0410a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.L;
import androidx.lifecycle.t;
import com.bumptech.glide.b;
import com.bumptech.glide.o;
import h.C1022j;
import java.util.HashMap;

public final class k implements Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0410a f9062Y = new C0410a(18);

    /* renamed from: U  reason: collision with root package name */
    public volatile o f9063U;

    /* renamed from: V  reason: collision with root package name */
    public final C0410a f9064V;

    /* renamed from: W  reason: collision with root package name */
    public final f f9065W;

    /* renamed from: X  reason: collision with root package name */
    public final c f9066X;

    public k(C0410a aVar) {
        f fVar;
        aVar = aVar == null ? f9062Y : aVar;
        this.f9064V = aVar;
        this.f9066X = new c(aVar);
        if (!v.f2640f || !v.e) {
            fVar = new C0410a(15);
        } else {
            fVar = new e();
        }
        this.f9065W = fVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final o b(Context context) {
        if (context != null) {
            char[] cArr = m.f6173a;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof C1022j) {
                    return c((C1022j) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f9063U == null) {
                synchronized (this) {
                    try {
                        if (this.f9063U == null) {
                            this.f9063U = this.f9064V.k(b.a(context.getApplicationContext()), new C0410a(13), new C0410a(16), context.getApplicationContext());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f9063U;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final o c(C1022j jVar) {
        boolean z;
        char[] cArr = m.f6173a;
        boolean z6 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return b(jVar.getApplicationContext());
        }
        if (!jVar.isDestroyed()) {
            this.f9065W.d(jVar);
            Activity a8 = a(jVar);
            if (a8 == null || !a8.isFinishing()) {
                z6 = true;
            }
            b a9 = b.a(jVar.getApplicationContext());
            L l8 = jVar.l();
            c cVar = this.f9066X;
            cVar.getClass();
            m.a();
            m.a();
            HashMap hashMap = (HashMap) cVar.f4336V;
            t tVar = jVar.f7290X;
            o oVar = (o) hashMap.get(tVar);
            if (oVar != null) {
                return oVar;
            }
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(tVar);
            o k8 = ((C0410a) cVar.f4337W).k(a9, lifecycleLifecycle, new C0410a(cVar, l8), jVar);
            hashMap.put(tVar, k8);
            lifecycleLifecycle.a(new i(cVar, tVar));
            if (z6) {
                k8.j();
            }
            return k8;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final boolean handleMessage(Message message) {
        return false;
    }
}
