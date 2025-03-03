package G;

import G2.c;
import K2.v;
import L3.b;
import W2.m;
import a0.j;
import android.app.Application;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.util.Log;
import com.bumptech.glide.manager.d;
import j0.C1115d;
import j0.e;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k2.C1160q;
import l0.C1169b;

public final class h implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1609U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1610V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f1611W;

    public /* synthetic */ h(int i, Object obj, Object obj2, boolean z) {
        this.f1609U = i;
        this.f1611W = obj;
        this.f1610V = obj2;
    }

    public final void run() {
        switch (this.f1609U) {
            case 0:
                c cVar = (c) this.f1611W;
                try {
                    cVar.f(i.a((b) this.f1610V));
                    return;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        cVar.z(e);
                        return;
                    } else {
                        cVar.z(cause);
                        return;
                    }
                } catch (Error | RuntimeException e8) {
                    cVar.z(e8);
                    return;
                }
            case 1:
                try {
                    Object b8 = i.b((b) this.f1610V);
                    j jVar = ((b) this.f1611W).f1600V;
                    if (jVar != null) {
                        jVar.a(b8);
                    }
                } catch (CancellationException unused) {
                    ((b) this.f1611W).cancel(false);
                } catch (ExecutionException e9) {
                    Throwable cause2 = e9.getCause();
                    j jVar2 = ((b) this.f1611W).f1600V;
                    if (jVar2 != null) {
                        jVar2.b(cause2);
                    }
                } catch (Throwable th) {
                    ((b) this.f1611W).f1598a0 = null;
                    throw th;
                }
                ((b) this.f1611W).f1598a0 = null;
                return;
            case 2:
                c cVar2 = (c) this.f1611W;
                if (cVar2.f1631X) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f1610V).run();
                    return;
                } catch (Throwable th2) {
                    cVar2.f1630W.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 3:
                v a8 = v.a();
                a8.getClass();
                m.a();
                a8.f2646d.set(true);
                ((d) this.f1611W).f9057V.f9059V = true;
                ((d) this.f1611W).f9056U.getViewTreeObserver().removeOnDrawListener((d) this.f1610V);
                ((d) this.f1611W).f9057V.f9058U.clear();
                return;
            case 4:
                ((C1115d) this.f1610V).f12823a = this.f1611W;
                return;
            case 5:
                ((Application) this.f1610V).unregisterActivityLifecycleCallbacks((C1115d) this.f1611W);
                return;
            case 6:
                try {
                    Method method = e.f12831d;
                    Object obj = this.f1611W;
                    Object obj2 = this.f1610V;
                    if (method != null) {
                        method.invoke(obj2, new Object[]{obj, Boolean.FALSE, "AppCompat recreation"});
                        return;
                    }
                    e.e.invoke(obj2, new Object[]{obj, Boolean.FALSE});
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 7:
                C1169b bVar = (C1169b) ((C1160q) this.f1610V).f13026V;
                if (bVar != null) {
                    bVar.i((Typeface) this.f1611W);
                    return;
                }
                return;
            default:
                ((M.d) this.f1610V).accept(this.f1611W);
                return;
        }
    }

    public String toString() {
        switch (this.f1609U) {
            case 0:
                return h.class.getSimpleName() + "," + ((c) this.f1611W);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h(Object obj, int i, Object obj2) {
        this.f1609U = i;
        this.f1610V = obj;
        this.f1611W = obj2;
    }
}
