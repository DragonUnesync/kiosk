package o1;

import android.graphics.SurfaceTexture;

/* renamed from: o1.h  reason: case insensitive filesystem */
public final /* synthetic */ class C1316h implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ i f14162U;

    public /* synthetic */ C1316h(i iVar) {
        this.f14162U = iVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14162U.f14163U.set(true);
    }
}
