package androidx.activity;

import U.p;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.manager.q;
import h.C1022j;
import java.util.concurrent.Executor;

public final class j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final long f7284U = (SystemClock.uptimeMillis() + 10000);

    /* renamed from: V  reason: collision with root package name */
    public Runnable f7285V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f7286W = false;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1022j f7287X;

    public j(C1022j jVar) {
        this.f7287X = jVar;
    }

    public final void execute(Runnable runnable) {
        this.f7285V = runnable;
        View decorView = this.f7287X.getWindow().getDecorView();
        if (!this.f7286W) {
            decorView.postOnAnimation(new p(8, (Object) this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f7285V;
        if (runnable != null) {
            runnable.run();
            this.f7285V = null;
            q qVar = this.f7287X.f7295c0;
            synchronized (qVar.f9081W) {
                z = qVar.f9080V;
            }
            if (z) {
                this.f7286W = false;
                this.f7287X.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.f7284U) {
            this.f7286W = false;
            this.f7287X.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.f7287X.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
