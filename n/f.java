package N;

import B.C0002c;
import B.C0022x;
import B.Z;
import B.n0;
import B.t0;
import D.O;
import F.e;
import F.h;
import M.l;
import O.i;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.bumptech.glide.d;
import de.ozerov.fully.C0663a0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: U  reason: collision with root package name */
    public final c f3212U;

    /* renamed from: V  reason: collision with root package name */
    public final HandlerThread f3213V;

    /* renamed from: W  reason: collision with root package name */
    public final e f3214W;

    /* renamed from: X  reason: collision with root package name */
    public final Handler f3215X;

    /* renamed from: Y  reason: collision with root package name */
    public int f3216Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f3217Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public final AtomicBoolean f3218a0 = new AtomicBoolean(false);

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashMap f3219b0 = new LinkedHashMap();

    /* renamed from: c0  reason: collision with root package name */
    public SurfaceTexture f3220c0;

    /* renamed from: d0  reason: collision with root package name */
    public SurfaceTexture f3221d0;

    public f(C0022x xVar, Z z, Z z6) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f3213V = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3215X = handler;
        this.f3214W = new e(handler);
        this.f3212U = new c(z, z6);
        try {
            d.i(new O(this, xVar, emptyMap, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e8) {
            d();
            throw e8;
        }
    }

    public final void a() {
        if (this.f3217Z && this.f3216Y == 0) {
            LinkedHashMap linkedHashMap = this.f3219b0;
            for (l close : linkedHashMap.keySet()) {
                close.close();
            }
            linkedHashMap.clear();
            c cVar = this.f3212U;
            if (cVar.f2732a.getAndSet(false)) {
                i.c(cVar.f2734c);
                cVar.h();
            }
            cVar.f3205n = -1;
            cVar.f3206o = -1;
            this.f3213V.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f3214W.execute(new A4.d(this, runnable2, runnable, 5));
        } catch (RejectedExecutionException e) {
            h.J("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void c(t0 t0Var) {
        if (this.f3218a0.get()) {
            t0Var.c();
        } else {
            b(new C0002c((Object) this, 13, (Object) t0Var), new n0(t0Var, 1));
        }
    }

    public final void d() {
        if (!this.f3218a0.getAndSet(true)) {
            b(new A.d(21, this), new C0663a0(5));
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.f3218a0.get() && (surfaceTexture2 = this.f3220c0) != null && this.f3221d0 != null) {
            surfaceTexture2.updateTexImage();
            this.f3221d0.updateTexImage();
            for (Map.Entry entry : this.f3219b0.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                l lVar = (l) entry.getKey();
                if (lVar.f2774W == 34) {
                    try {
                        this.f3212U.l(surfaceTexture.getTimestamp(), surface, lVar, this.f3220c0, this.f3221d0);
                    } catch (RuntimeException e) {
                        h.m("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                }
            }
        }
    }
}
