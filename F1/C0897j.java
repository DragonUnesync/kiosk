package f1;

import D2.o;
import H3.n0;
import P0.z;
import android.os.Handler;
import java.io.Closeable;

/* renamed from: f1.j  reason: case insensitive filesystem */
public final class C0897j implements Runnable, Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final Handler f11550U = z.m((Handler.Callback) null);

    /* renamed from: V  reason: collision with root package name */
    public final long f11551V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f11552W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ k f11553X;

    public C0897j(k kVar, long j7) {
        this.f11553X = kVar;
        this.f11551V = j7;
    }

    public final void close() {
        this.f11552W = false;
        this.f11550U.removeCallbacks(this);
    }

    public final void run() {
        k kVar = this.f11553X;
        o oVar = kVar.f11560a0;
        oVar.q(oVar.j(4, kVar.f11564e0, n0.f2094a0, kVar.f11561b0));
        this.f11550U.postDelayed(this, this.f11551V);
    }
}
