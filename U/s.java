package U;

import A4.d;
import B.t0;
import D.O;
import F.h;
import G.k;
import L3.b;
import a0.n;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import j0.f;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class s extends k {
    public SurfaceView e;

    /* renamed from: f  reason: collision with root package name */
    public final r f5307f = new r(this);

    public s(FrameLayout frameLayout, e eVar) {
        super(frameLayout, eVar);
    }

    public final View a() {
        return this.e;
    }

    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, createBitmap, new q(semaphore), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100, TimeUnit.MILLISECONDS)) {
                h.l("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
        } catch (InterruptedException e8) {
            h.m("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e8);
        } catch (Throwable th) {
            handlerThread.quitSafely();
            throw th;
        }
        handlerThread.quitSafely();
        return createBitmap;
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e(t0 t0Var, O o2) {
        SurfaceView surfaceView = this.e;
        boolean equals = Objects.equals(this.f5285a, t0Var.f307b);
        if (surfaceView == null || !equals) {
            this.f5285a = t0Var.f307b;
            FrameLayout frameLayout = this.f5286b;
            frameLayout.getClass();
            this.f5285a.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f5285a.getWidth(), this.f5285a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f5307f);
        }
        Executor d8 = f.d(this.e.getContext());
        p pVar = new p(0, (Object) o2);
        n nVar = t0Var.f313j.f7013c;
        if (nVar != null) {
            nVar.d(pVar, d8);
        }
        this.e.post(new d(this, t0Var, o2, 7));
    }

    public final b g() {
        return k.f1612W;
    }
}
