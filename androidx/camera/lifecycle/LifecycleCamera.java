package androidx.camera.lifecycle;

import B.C0011l;
import B.v0;
import D.C0069x;
import H.g;
import android.annotation.SuppressLint;
import android.os.Build;
import androidx.lifecycle.B;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class LifecycleCamera implements q, C0011l {

    /* renamed from: U  reason: collision with root package name */
    public final Object f7656U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final r f7657V;

    /* renamed from: W  reason: collision with root package name */
    public final g f7658W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f7659X = false;

    public LifecycleCamera(r rVar, g gVar) {
        this.f7657V = rVar;
        this.f7658W = gVar;
        if (rVar.e().f8156c.compareTo(C0486m.f8148X) >= 0) {
            gVar.e();
        } else {
            gVar.v();
        }
        rVar.e().a(this);
    }

    public final C0069x a() {
        return this.f7658W.f1786j0;
    }

    public final void e(List list) {
        synchronized (this.f7656U) {
            this.f7658W.c(list);
        }
    }

    public final r i() {
        r rVar;
        synchronized (this.f7656U) {
            rVar = this.f7657V;
        }
        return rVar;
    }

    @B(C0485l.ON_DESTROY)
    public void onDestroy(r rVar) {
        synchronized (this.f7656U) {
            g gVar = this.f7658W;
            gVar.E((ArrayList) gVar.A());
        }
    }

    @B(C0485l.ON_PAUSE)
    public void onPause(r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7658W.f1771U.d(false);
        }
    }

    @B(C0485l.ON_RESUME)
    public void onResume(r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7658W.f1771U.d(true);
        }
    }

    @B(C0485l.ON_START)
    public void onStart(r rVar) {
        synchronized (this.f7656U) {
            try {
                if (!this.f7659X) {
                    this.f7658W.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B(C0485l.ON_STOP)
    public void onStop(r rVar) {
        synchronized (this.f7656U) {
            try {
                if (!this.f7659X) {
                    this.f7658W.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List p() {
        List unmodifiableList;
        synchronized (this.f7656U) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.f7658W.A());
        }
        return unmodifiableList;
    }

    public final boolean q(v0 v0Var) {
        boolean contains;
        synchronized (this.f7656U) {
            contains = ((ArrayList) this.f7658W.A()).contains(v0Var);
        }
        return contains;
    }

    public final void r() {
        synchronized (this.f7656U) {
            try {
                if (!this.f7659X) {
                    onStop(this.f7657V);
                    this.f7659X = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.f7656U) {
            g gVar = this.f7658W;
            gVar.E((ArrayList) gVar.A());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7656U
            monitor-enter(r0)
            boolean r1 = r4.f7659X     // Catch:{ all -> 0x0009 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r1 = move-exception
            goto L_0x0028
        L_0x000b:
            r1 = 0
            r4.f7659X = r1     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.r r2 = r4.f7657V     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.t r2 = r2.e()     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.m r2 = r2.f8156c     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.m r3 = androidx.lifecycle.C0486m.f8148X     // Catch:{ all -> 0x0009 }
            int r2 = r2.compareTo(r3)     // Catch:{ all -> 0x0009 }
            if (r2 < 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0026
            androidx.lifecycle.r r1 = r4.f7657V     // Catch:{ all -> 0x0009 }
            r4.onStart(r1)     // Catch:{ all -> 0x0009 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCamera.t():void");
    }
}
